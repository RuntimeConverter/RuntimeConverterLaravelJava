package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes.Readline;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Readline/GNUReadline.php

*/

public class GNUReadline extends RuntimeClassBase implements Readline {

    public Object historyFile = null;

    public Object historySize = null;

    public Object eraseDups = null;

    public GNUReadline(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GNUReadline.class) {
            this.__construct(env, args);
        }
    }

    public GNUReadline(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "historyFile",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "historySize",
        defaultValue = "0",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "eraseDups",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object historyFile = assignParameter(args, 0, true);
        if (null == historyFile) {
            historyFile = ZVal.getNull();
        }
        Object historySize = assignParameter(args, 1, true);
        if (null == historySize) {
            historySize = 0;
        }
        Object eraseDups = assignParameter(args, 2, true);
        if (null == eraseDups) {
            eraseDups = false;
        }
        this.historyFile =
                ZVal.strictNotEqualityCheck(historyFile, "!==", ZVal.getNull())
                        ? historyFile
                        : false;
        this.historySize = historySize;
        this.eraseDups = eraseDups;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object addHistory(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object res = null;
        if (ZVal.isTrue(res = NamespaceGlobal.readline_add_history.env(env).call(line).value())) {
            this.writeHistory(env);
        }

        return ZVal.assign(res);
    }

    @ConvertedMethod
    public Object clearHistory(RuntimeEnv env, Object... args) {
        Object res = null;
        if (ZVal.isTrue(res = NamespaceGlobal.readline_clear_history.env(env).call().value())) {
            this.writeHistory(env);
        }

        return ZVal.assign(res);
    }

    @ConvertedMethod
    public Object listHistory(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                com.runtimeconverter.runtime.ZVal.functionNotFound("readline_list_history")
                        .env(env)
                        .call()
                        .value());
    }

    @ConvertedMethod
    public Object readHistory(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call("7.2.11-dev", "5.6.7", ">=")
                                .value())
                || ZVal.toBool(!function_ini_get.f.env(env).call("open_basedir").getBool())) {
            NamespaceGlobal.readline_read_history.env(env).call();
        }

        NamespaceGlobal.readline_clear_history.env(env).call();
        return ZVal.assign(
                NamespaceGlobal.readline_read_history.env(env).call(this.historyFile).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prompt",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object readline(RuntimeEnv env, Object... args) {
        Object prompt = assignParameter(args, 0, true);
        if (null == prompt) {
            prompt = ZVal.getNull();
        }
        return ZVal.assign(NamespaceGlobal.readline.env(env).call(prompt).value());
    }

    @ConvertedMethod
    public Object redisplay(RuntimeEnv env, Object... args) {
        NamespaceGlobal.readline_redisplay.env(env).call();
        return null;
    }

    @ConvertedMethod
    public Object writeHistory(RuntimeEnv env, Object... args) {
        Object res = null;
        Object hist = null;
        Object line = null;
        Object histsize = null;
        if (ZVal.strictNotEqualityCheck(this.historyFile, "!==", false)) {
            res = NamespaceGlobal.readline_write_history.env(env).call(this.historyFile).value();

        } else {
            res = true;
        }

        if (ZVal.toBool(!ZVal.isTrue(res))
                || ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(this.eraseDups))
                                && ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                !ZVal.isTrue(this.historySize), '>', 0)))) {
            return ZVal.assign(res);
        }

        hist = this.listHistory(env);
        if (!ZVal.isTrue(hist)) {
            return ZVal.assign(true);
        }

        if (ZVal.isTrue(this.eraseDups)) {
            hist =
                    function_array_flip
                            .f
                            .env(env)
                            .call(function_array_flip.f.env(env).call(hist).value())
                            .value();
            function_ksort.f.env(env).call(hist);
        }

        if (ZVal.isGreaterThan(this.historySize, '>', 0)) {
            histsize = function_count.f.env(env).call(hist).value();
            if (ZVal.isGreaterThan(histsize, '>', this.historySize)) {
                hist =
                        function_array_slice
                                .f
                                .env(env)
                                .call(hist, ZVal.subtract(histsize, this.historySize))
                                .value();
            }
        }

        NamespaceGlobal.readline_clear_history.env(env).call();
        for (ZPair zpairResult1407 : ZVal.getIterable(hist, env, true)) {
            line = ZVal.assign(zpairResult1407.getValue());
            NamespaceGlobal.readline_add_history.env(env).call(line);
        }

        if (ZVal.strictNotEqualityCheck(this.historyFile, "!==", false)) {
            return ZVal.assign(
                    NamespaceGlobal.readline_write_history.env(env).call(this.historyFile).value());
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "Psy\\Readline\\GNUReadline";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isSupported(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    function_function_exists.f.env(env).call("readline_list_history").value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Readline\\GNUReadline")
                    .setLookup(
                            GNUReadline.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("eraseDups", "historyFile", "historySize")
                    .setFilename("vendor/psy/psysh/src/Readline/GNUReadline.php")
                    .addInterface("Psy\\Readline\\Readline")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
