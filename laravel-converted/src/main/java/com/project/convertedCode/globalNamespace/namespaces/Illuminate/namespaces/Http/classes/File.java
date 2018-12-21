package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/File.php

*/

public class File
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .HttpFoundation
                .namespaces
                .File
                .classes
                .File {

    public Object hashName = ZVal.getNull();

    public File(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File.class) {
            this.__construct(env, args);
        }
    }

    public File(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object path(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "getRealPath", File.class));
    }

    @ConvertedMethod
    public Object extension(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "guessExtension", File.class));
    }

    @ConvertedMethod
    public Object clientExtension(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this, "guessClientExtension", File.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hashName(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        Object hash = null;
        if (ZVal.isTrue(path)) {
            path = toStringR(function_rtrim.f.env(env).call(path, "/").value(), env) + "/";
        }

        hash =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = this.hashName)
                                ? ternaryExpressionTemp
                                : (this.hashName = Str.runtimeStaticObject.random(env, 40)));
        return ZVal.assign(
                toStringR(path, env)
                        + toStringR(hash, env)
                        + "."
                        + toStringR(env.callMethod(this, "guessExtension", File.class), env));
    }

    public static final Object CONST_class = "Illuminate\\Http\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .HttpFoundation
                    .namespaces
                    .File
                    .classes
                    .File
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\File")
                    .setLookup(
                            File.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("hashName")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Http/File.php")
                    .addTrait("Illuminate\\Http\\FileHelpers")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\File\\File")
                    .addExtendsClass("SplFileInfo")
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
