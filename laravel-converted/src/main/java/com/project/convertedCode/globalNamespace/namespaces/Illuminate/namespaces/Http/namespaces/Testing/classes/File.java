package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Testing.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Testing.classes.MimeType;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Testing.classes.FileFactory;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.UploadedFile;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Testing/File.php

*/

public class File extends UploadedFile {

    public Object name = null;

    public Object tempFile = null;

    public Object sizeToReport = null;

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
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "tempFile")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object tempFile = assignParameter(args, 1, false);
        this.name = name;
        this.tempFile = tempFile;
        super.__construct(
                env,
                this.tempFilePath(env),
                name,
                this.getMimeType(env),
                NamespaceGlobal.filesize.env(env).call(this.tempFilePath(env)).value(),
                ZVal.getNull(),
                true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "kilobytes")
    public Object size(RuntimeEnv env, Object... args) {
        Object kilobytes = assignParameter(args, 0, false);
        this.sizeToReport = ZVal.multiply(kilobytes, 1024);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSize(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.sizeToReport)
                        ? ternaryExpressionTemp
                        : super.getSize(env));
    }

    @ConvertedMethod
    public Object getMimeType(RuntimeEnv env, Object... args) {
        return ZVal.assign(MimeType.runtimeStaticObject.from(env, this.name));
    }

    @ConvertedMethod
    protected Object tempFilePath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                handleReturnReference(
                                NamespaceGlobal.stream_get_meta_data
                                        .env(env)
                                        .call(this.tempFile)
                                        .value())
                        .arrayGet(env, "uri"));
    }

    public static final Object CONST_class = "Illuminate\\Http\\Testing\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends UploadedFile.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(
            index = 1,
            name = "kilobytes",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object kilobytes = assignParameter(args, 1, true);
            if (null == kilobytes) {
                kilobytes = 0;
            }
            return ZVal.assign(
                    env.callMethod(new FileFactory(env), "create", File.class, name, kilobytes));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(
            index = 1,
            name = "width",
            defaultValue = "10",
            defaultValueType = "number"
        )
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
            return ZVal.assign(
                    env.callMethod(new FileFactory(env), "image", File.class, name, width, height));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Http\\Testing\\File")
                    .setLookup(
                            File.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "error",
                            "hashName",
                            "mimeType",
                            "name",
                            "originalName",
                            "sizeToReport",
                            "tempFile",
                            "test")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Http/Testing/File.php")
                    .addExtendsClass("Illuminate\\Http\\UploadedFile")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\File\\UploadedFile")
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
