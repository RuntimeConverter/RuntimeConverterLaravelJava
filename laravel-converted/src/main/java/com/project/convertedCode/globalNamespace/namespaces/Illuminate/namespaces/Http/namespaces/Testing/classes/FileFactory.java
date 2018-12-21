package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Testing.classes;

import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Testing.classes.File;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Testing/FileFactory.php

*/

public class FileFactory extends RuntimeClassBase {

    public FileFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FileFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "kilobytes",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object create(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http/Testing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Http/Testing/FileFactory.php");
        Object name = assignParameter(args, 0, false);
        Object kilobytes = assignParameter(args, 1, true);
        if (null == kilobytes) {
            kilobytes = 0;
        }
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                new File(
                                        env, name, NamespaceGlobal.tmpfile.env(env).call().value()),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Http\\Testing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "file")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object file = assignParameter(args, 0, false);
                                        Object kilobytes = null;
                                        kilobytes =
                                                this.contextReferences.getCapturedValue(
                                                        "kilobytes");
                                        toObjectR(file)
                                                .accessProp(this, env)
                                                .name("sizeToReport")
                                                .set(ZVal.multiply(kilobytes, 1024));
                                        return null;
                                    }
                                }.use("kilobytes", kilobytes))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "width", defaultValue = "10", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "height",
        defaultValue = "10",
        defaultValueType = "number"
    )
    public Object image(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object width = assignParameter(args, 1, true);
        if (null == width) {
            width = 10;
        }
        Object height = assignParameter(args, 2, true);
        if (null == height) {
            height = 10;
        }
        return ZVal.assign(new File(env, name, this.generateImage(env, width, height)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "width")
    @ConvertedParameter(index = 1, name = "height")
    protected Object generateImage(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Http/Testing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Http/Testing/FileFactory.php");
        Object width = assignParameter(args, 0, false);
        Object height = assignParameter(args, 1, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                NamespaceGlobal.tmpfile.env(env).call().value(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Http\\Testing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "temp")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object temp = assignParameter(args, 0, false);
                                        Object width = null;
                                        Object height = null;
                                        width = this.contextReferences.getCapturedValue("width");
                                        height = this.contextReferences.getCapturedValue("height");
                                        function_ob_start.f.env(env).call();
                                        NamespaceGlobal.imagepng
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.imagecreatetruecolor
                                                                .env(env)
                                                                .call(width, height)
                                                                .value());
                                        function_fwrite
                                                .f
                                                .env(env)
                                                .call(
                                                        temp,
                                                        function_ob_get_clean
                                                                .f
                                                                .env(env)
                                                                .call()
                                                                .value());
                                        return null;
                                    }
                                }.use("width", width).use("height", height))
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Http\\Testing\\FileFactory";

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
                    .setName("Illuminate\\Http\\Testing\\FileFactory")
                    .setLookup(
                            FileFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Testing/FileFactory.php")
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
