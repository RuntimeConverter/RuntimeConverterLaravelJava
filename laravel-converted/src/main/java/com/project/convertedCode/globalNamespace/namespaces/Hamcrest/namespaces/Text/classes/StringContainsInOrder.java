package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Text.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.TypeSafeMatcher;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/StringContainsInOrder.php

*/

public class StringContainsInOrder extends TypeSafeMatcher {

    public Object _substrings = null;

    public StringContainsInOrder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringContainsInOrder.class) {
            this.__construct(env, args);
        }
    }

    public StringContainsInOrder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "substrings", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object substrings = assignParameter(args, 0, false);
        super.__construct(env, CONST_TYPE_STRING);
        this._substrings = substrings;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    protected Object matchesSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object fromIndex = null;
        Object substring = null;
        fromIndex = 0;
        for (ZPair zpairResult173 : ZVal.getIterable(this._substrings, env, true)) {
            substring = ZVal.assign(zpairResult173.getValue());
            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    fromIndex =
                            function_strpos.f.env(env).call(item, substring, fromIndex).value())) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object describeMismatchSafely(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        env.callMethod(
                env.callMethod(
                        mismatchDescription, "appendText", StringContainsInOrder.class, "was "),
                "appendText",
                StringContainsInOrder.class,
                item);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                description,
                                "appendText",
                                StringContainsInOrder.class,
                                "a string containing "),
                        "appendValueList",
                        StringContainsInOrder.class,
                        "",
                        ", ",
                        "",
                        this._substrings),
                "appendText",
                StringContainsInOrder.class,
                " in order");
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Text\\StringContainsInOrder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TypeSafeMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object stringContainsInOrder(RuntimeEnv env, Object... args) {
            ReferenceContainer ___args = new BasicReferenceContainer(null);
            ___args.setObject(
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value());
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, ___args, env, 0))
                    && ZVal.toBool(
                            function_is_array.f.env(env).call(___args.arrayGet(env, 0)).value())) {
                ___args.setObject(ZVal.assign(___args.arrayGet(env, 0)));
            }

            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Text
                            .classes
                            .StringContainsInOrder(env, ___args.getObject()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Text\\StringContainsInOrder")
                    .setLookup(
                            StringContainsInOrder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectedSubtype", "_expectedType", "_substrings")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Text/StringContainsInOrder.php")
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
