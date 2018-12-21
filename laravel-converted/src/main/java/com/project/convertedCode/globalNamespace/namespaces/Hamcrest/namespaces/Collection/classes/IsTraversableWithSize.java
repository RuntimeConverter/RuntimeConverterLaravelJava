package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Collection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.FeatureMatcher;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Collection/IsTraversableWithSize.php

*/

public class IsTraversableWithSize extends FeatureMatcher {

    public IsTraversableWithSize(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IsTraversableWithSize.class) {
            this.__construct(env, args);
        }
    }

    public IsTraversableWithSize(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sizeMatcher", typeHint = "Hamcrest\\Matcher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sizeMatcher = assignParameter(args, 0, false);
        super.__construct(
                env,
                CONST_TYPE_OBJECT,
                "Traversable",
                sizeMatcher,
                "a traversable with size",
                "traversable size");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    protected Object featureValueOf(RuntimeEnv env, Object... args) {
        Object actual = assignParameter(args, 0, false);
        ReferenceContainer size = new BasicReferenceContainer(null);
        Object value = null;
        size.setObject(0);
        for (ZPair zpairResult166 : ZVal.getIterable(actual, env, true)) {
            value = ZVal.assign(zpairResult166.getValue());
            size.setObject(ZVal.increment(size.getObject()));
        }

        return ZVal.assign(size.getObject());
    }

    public static final Object CONST_class = "Hamcrest\\Collection\\IsTraversableWithSize";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FeatureMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "size")
        public Object traversableWithSize(RuntimeEnv env, Object... args) {
            Object size = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Collection
                            .classes
                            .IsTraversableWithSize(
                            env, Util.runtimeStaticObject.wrapValueWithIsEqual(env, size)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Collection\\IsTraversableWithSize")
                    .setLookup(
                            IsTraversableWithSize.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_expectedSubtype",
                            "_expectedType",
                            "_featureDescription",
                            "_featureName",
                            "_subMatcher")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Collection/IsTraversableWithSize.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\FeatureMatcher")
                    .addExtendsClass("Hamcrest\\TypeSafeDiagnosingMatcher")
                    .addExtendsClass("Hamcrest\\TypeSafeMatcher")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
