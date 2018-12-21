package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeMatcher;
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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/SubstringMatcher.php

*/

public abstract class SubstringMatcher extends TypeSafeMatcher {

    public Object _substring = null;

    public SubstringMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SubstringMatcher.class) {
            this.__construct(env, args);
        }
    }

    public SubstringMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "substring")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object substring = assignParameter(args, 0, false);
        super.__construct(env, CONST_TYPE_STRING);
        this._substring = substring;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this, "evalSubstringOf", SubstringMatcher.class, item));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object describeMismatchSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                mismatchDescription,
                                "appendText",
                                SubstringMatcher.class,
                                "was \""),
                        "appendText",
                        SubstringMatcher.class,
                        item),
                "appendText",
                SubstringMatcher.class,
                "\"");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        description,
                                        "appendText",
                                        SubstringMatcher.class,
                                        "a string "),
                                "appendText",
                                SubstringMatcher.class,
                                env.callMethod(this, "relationship", SubstringMatcher.class)),
                        "appendText",
                        SubstringMatcher.class,
                        " "),
                "appendValue",
                SubstringMatcher.class,
                this._substring);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Text\\SubstringMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Text\\SubstringMatcher")
                    .setLookup(
                            SubstringMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectedSubtype", "_expectedType", "_substring")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/SubstringMatcher.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
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
