package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.namespaces.Handler.classes;

import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.SessionHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/Handler/NativeFileSessionHandler.php

*/

public class NativeFileSessionHandler extends SessionHandler {

    public NativeFileSessionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NativeFileSessionHandler.class) {
            this.__construct(env, args);
        }
    }

    public NativeFileSessionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "savePath",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, true);
        if (null == savePath) {
            savePath = ZVal.getNull();
        }
        Object baseDir = null;
        Object count = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", savePath)) {
            savePath = function_ini_get.f.env(env).call("session.save_path").value();
        }

        baseDir = ZVal.assign(savePath);
        if (ZVal.isTrue(
                count = NamespaceGlobal.substr_count.env(env).call(savePath, ";").value())) {
            if (ZVal.isGreaterThan(count, '>', 2)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Invalid argument $savePath '%s'", savePath)
                                        .value()));
            }

            baseDir =
                    function_ltrim
                            .f
                            .env(env)
                            .call(NamespaceGlobal.strrchr.env(env).call(savePath, ";").value(), ";")
                            .value();
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(baseDir)
                                                && ZVal.toBool(
                                                        !function_is_dir
                                                                .f
                                                                .env(env)
                                                                .call(baseDir)
                                                                .getBool()))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                NamespaceGlobal.mkdir
                                                        .env(env)
                                                        .call(baseDir, 511, true)
                                                        .value())))
                && ZVal.toBool(!function_is_dir.f.env(env).call(baseDir).getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Session Storage was not able to create directory \"%s\"",
                                            baseDir)
                                    .value()));
        }

        function_ini_set.f.env(env).call("session.save_path", savePath);
        function_ini_set.f.env(env).call("session.save_handler", "files");
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\NativeFileSessionHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends SessionHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\Handler\\NativeFileSessionHandler")
                    .setLookup(
                            NativeFileSessionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/Handler/NativeFileSessionHandler.php")
                    .addInterface("SessionHandlerInterface")
                    .addInterface("SessionIdInterface")
                    .addExtendsClass("SessionHandler")
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
