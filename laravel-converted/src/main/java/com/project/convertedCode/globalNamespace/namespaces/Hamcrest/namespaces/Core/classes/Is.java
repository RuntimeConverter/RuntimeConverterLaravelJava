package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/Is.php

*/

public class Is extends BaseMatcher {

    public Object _matcher = null;

    public Is(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Is.class) {
            this.__construct(env, args);
        }
    }

    public Is(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matcher", typeHint = "Hamcrest\\Matcher")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        this._matcher = matcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arg")
    public Object matches(RuntimeEnv env, Object... args) {
        Object arg = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this._matcher, "matches", Is.class, arg));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(description, "appendText", Is.class, "is "),
                "appendDescriptionOf",
                Is.class,
                this._matcher);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    public Object describeMismatch(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        env.callMethod(this._matcher, "describeMismatch", Is.class, item, mismatchDescription);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\Is";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object is(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Core
                            .classes
                            .Is(env, Util.runtimeStaticObject.wrapValueWithIsEqual(env, value)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\Is")
                    .setLookup(
                            Is.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_matcher")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/Is.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
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
