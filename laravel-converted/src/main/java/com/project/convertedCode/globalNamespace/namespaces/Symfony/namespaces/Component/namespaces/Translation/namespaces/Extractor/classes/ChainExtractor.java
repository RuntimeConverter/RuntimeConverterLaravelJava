package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes.ExtractorInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Extractor/ChainExtractor.php

*/

public class ChainExtractor extends RuntimeClassBase implements ExtractorInterface {

    public Object extractors = ZVal.newArray();

    public ChainExtractor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ChainExtractor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(
        index = 1,
        name = "extractor",
        typeHint = "Symfony\\Component\\Translation\\Extractor\\ExtractorInterface"
    )
    public Object addExtractor(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object extractor = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "extractors", env).arrayAccess(env, format).set(extractor);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object setPrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        Object extractor = null;
        for (ZPair zpairResult2134 : ZVal.getIterable(this.extractors, env, true)) {
            extractor = ZVal.assign(zpairResult2134.getValue());
            env.callMethod(extractor, "setPrefix", ChainExtractor.class, prefix);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    public Object extract(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object catalogue = assignParameter(args, 1, false);
        Object extractor = null;
        for (ZPair zpairResult2135 : ZVal.getIterable(this.extractors, env, true)) {
            extractor = ZVal.assign(zpairResult2135.getValue());
            env.callMethod(extractor, "extract", ChainExtractor.class, directory, catalogue);
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Extractor\\ChainExtractor";

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
                    .setName("Symfony\\Component\\Translation\\Extractor\\ChainExtractor")
                    .setLookup(
                            ChainExtractor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("extractors")
                    .setFilename("vendor/symfony/translation/Extractor/ChainExtractor.php")
                    .addInterface("Symfony\\Component\\Translation\\Extractor\\ExtractorInterface")
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
