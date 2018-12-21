package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeDiagnosingMatcher;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/Every.php

*/

public class Every extends TypeSafeDiagnosingMatcher {

    public Object _matcher = null;

    public Every(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Every.class) {
            this.__construct(env, args);
        }
    }

    public Every(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matcher", typeHint = "Hamcrest\\Matcher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        super.__construct(env, CONST_TYPE_ARRAY);
        this._matcher = matcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object matchesSafelyWithDiagnosticDescription(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        Object item = null;
        for (ZPair zpairResult168 : ZVal.getIterable(items, env, true)) {
            item = ZVal.assign(zpairResult168.getValue());
            if (!ZVal.isTrue(env.callMethod(this._matcher, "matches", Every.class, item))) {
                env.callMethod(mismatchDescription, "appendText", Every.class, "an item ");
                env.callMethod(
                        this._matcher, "describeMismatch", Every.class, item, mismatchDescription);
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(description, "appendText", Every.class, "every item is "),
                "appendDescriptionOf",
                Every.class,
                this._matcher);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\Every";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends TypeSafeDiagnosingMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "itemMatcher", typeHint = "Hamcrest\\Matcher")
        public Object everyItem(RuntimeEnv env, Object... args) {
            Object itemMatcher = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .Every(env, itemMatcher));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\Every")
                    .setLookup(
                            Every.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectedSubtype", "_expectedType", "_matcher")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/Every.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
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
