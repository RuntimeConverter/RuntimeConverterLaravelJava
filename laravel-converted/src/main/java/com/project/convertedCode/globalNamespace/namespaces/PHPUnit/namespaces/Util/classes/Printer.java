package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Printer.php

*/

public class Printer extends RuntimeClassBase {

    public Object autoFlush = false;

    public Object out = null;

    public Object outTarget = null;

    public Printer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Printer.class) {
            this.__construct(env, args);
        }
    }

    public Printer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "out",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer out = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == out.getObject()) {
            out.setObject(ZVal.getNull());
        }
        if (ZVal.strictNotEqualityCheck(out.getObject(), "!==", ZVal.getNull())) {
            if (function_is_string.f.env(env).call(out.getObject()).getBool()) {
                if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(out.getObject(), "socket://").value(),
                        "===",
                        0)) {
                    out.setObject(
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            ":",
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call("socket://", "", out.getObject())
                                                    .value())
                                    .value());
                    if (ZVal.strictNotEqualityCheck(
                            function_count.f.env(env).call(out.getObject()).value(), "!==", 2)) {
                        throw ZVal.getException(env, new Exception(env));
                    }

                    this.out =
                            NamespaceGlobal.fsockopen
                                    .env(env)
                                    .call(out.arrayGet(env, 0), out.arrayGet(env, 1))
                                    .value();

                } else {
                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            function_strpos
                                                    .f
                                                    .env(env)
                                                    .call(out.getObject(), "php://")
                                                    .value(),
                                            "===",
                                            false))
                            && ZVal.toBool(
                                    !ZVal.isTrue(
                                            this.createDirectory(
                                                    env,
                                                    function_dirname
                                                            .f
                                                            .env(env)
                                                            .call(out.getObject())
                                                            .value())))) {
                        throw ZVal.getException(
                                env,
                                new Exception(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Directory \"%s\" was not created",
                                                        function_dirname
                                                                .f
                                                                .env(env)
                                                                .call(out.getObject())
                                                                .value())
                                                .value()));
                    }

                    this.out = function_fopen.f.env(env).call(out.getObject(), "wt").value();
                }

                this.outTarget = out.getObject();

            } else {
                this.out = out.getObject();
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(this.out)
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                NamespaceGlobal.strncmp
                                        .env(env)
                                        .call(this.outTarget, "php://", 6)
                                        .value(),
                                "!==",
                                0))) {
            function_fclose.f.env(env).call(this.out);
        }

        return null;
    }

    @ConvertedMethod
    public Object incrementalFlush(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.out)) {
            NamespaceGlobal.fflush.env(env).call(this.out);

        } else {
            NamespaceGlobal.flush.env(env).call();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buffer", typeHint = "string")
    public Object write(RuntimeEnv env, Object... args) {
        Object buffer = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.out)) {
            function_fwrite.f.env(env).call(this.out, buffer);
            if (ZVal.isTrue(this.autoFlush)) {
                this.incrementalFlush(env);
            }

        } else {
            if (ZVal.toBool(ZVal.strictNotEqualityCheck("cli", "!==", "cli"))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck("cli", "!==", "phpdbg"))) {
                buffer = NamespaceGlobal.htmlspecialchars.env(env).call(buffer, 8).value();
            }

            env.echo(buffer);
            if (ZVal.isTrue(this.autoFlush)) {
                this.incrementalFlush(env);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getAutoFlush(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.autoFlush);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "autoFlush", typeHint = "bool")
    public Object setAutoFlush(RuntimeEnv env, Object... args) {
        Object autoFlush = assignParameter(args, 0, false);
        this.autoFlush = autoFlush;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    private Object createDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        return ZVal.assign(
                !ZVal.toBool(
                                ZVal.toBool(!function_is_dir.f.env(env).call(directory).getBool())
                                        && ZVal.toBool(
                                                !ZVal.isTrue(
                                                        NamespaceGlobal.mkdir
                                                                .env(env)
                                                                .call(directory, 511, true)
                                                                .value())))
                        && ZVal.toBool(!function_is_dir.f.env(env).call(directory).getBool()));
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Printer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Printer")
                    .setLookup(
                            Printer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("autoFlush", "out", "outTarget")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Printer.php")
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
