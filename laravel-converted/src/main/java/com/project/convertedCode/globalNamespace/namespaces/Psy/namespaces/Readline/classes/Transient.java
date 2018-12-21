package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Readline.classes.Readline;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.BreakException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Readline/Transient.php

*/

public class Transient extends RuntimeClassBase implements Readline {

    public Object history = null;

    public Object historySize = null;

    public Object eraseDups = null;

    public Object stdin = null;

    public Transient(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Transient.class) {
            this.__construct(env, args);
        }
    }

    public Transient(NoConstructor n) {
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
        this.history = ZVal.newArray();
        this.historySize = historySize;
        this.eraseDups = eraseDups;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object addHistory(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object histsize = null;
        Object key = null;
        if (ZVal.isTrue(this.eraseDups)) {
            if (ZVal.strictNotEqualityCheck(
                    key = function_array_search.f.env(env).call(line, this.history).value(),
                    "!==",
                    false)) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "history", env),
                        env,
                        key);
            }
        }

        new ReferenceClassProperty(this, "history", env).arrayAppend(env).set(line);
        if (ZVal.isGreaterThan(this.historySize, '>', 0)) {
            histsize = function_count.f.env(env).call(this.history).value();
            if (ZVal.isGreaterThan(histsize, '>', this.historySize)) {
                this.history =
                        function_array_slice
                                .f
                                .env(env)
                                .call(this.history, ZVal.subtract(histsize, this.historySize))
                                .value();
            }
        }

        this.history = function_array_values.f.env(env).call(this.history).value();
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object clearHistory(RuntimeEnv env, Object... args) {
        this.history = ZVal.newArray();
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object listHistory(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.history);
    }

    @ConvertedMethod
    public Object readHistory(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
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
        env.echo(prompt);
        return ZVal.assign(
                function_rtrim
                        .f
                        .env(env)
                        .call(NamespaceGlobal.fgets.env(env).call(this.getStdin(env), 1024).value())
                        .value());
    }

    @ConvertedMethod
    public Object redisplay(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object writeHistory(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    private Object getStdin(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.stdin)) {
            this.stdin = function_fopen.f.env(env).call("php://stdin", "r").value();
        }

        if (NamespaceGlobal.feof.env(env).call(this.stdin).getBool()) {
            throw ZVal.getException(env, new BreakException(env, "Ctrl+D"));
        }

        return ZVal.assign(this.stdin);
    }

    public static final Object CONST_class = "Psy\\Readline\\Transient";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isSupported(RuntimeEnv env, Object... args) {
            return ZVal.assign(true);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Readline\\Transient")
                    .setLookup(
                            Transient.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("eraseDups", "history", "historySize", "stdin")
                    .setFilename("vendor/psy/psysh/src/Readline/Transient.php")
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
