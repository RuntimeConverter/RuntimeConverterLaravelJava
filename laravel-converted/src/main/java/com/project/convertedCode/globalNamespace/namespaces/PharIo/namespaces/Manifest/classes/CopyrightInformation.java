package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phar-io/manifest/src/values/CopyrightInformation.php

*/

public class CopyrightInformation extends RuntimeClassBase {

    public Object authors = null;

    public Object license = null;

    public CopyrightInformation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CopyrightInformation.class) {
            this.__construct(env, args);
        }
    }

    public CopyrightInformation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "authors",
        typeHint = "PharIo\\Manifest\\AuthorCollection"
    )
    @ConvertedParameter(index = 1, name = "license", typeHint = "PharIo\\Manifest\\License")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object authors = assignParameter(args, 0, false);
        Object license = assignParameter(args, 1, false);
        this.authors = authors;
        this.license = license;
        return null;
    }

    @ConvertedMethod
    public Object getAuthors(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.authors);
    }

    @ConvertedMethod
    public Object getLicense(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.license);
    }

    public static final Object CONST_class = "PharIo\\Manifest\\CopyrightInformation";

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
                    .setName("PharIo\\Manifest\\CopyrightInformation")
                    .setLookup(
                            CopyrightInformation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("authors", "license")
                    .setFilename("vendor/phar-io/manifest/src/values/CopyrightInformation.php")
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
