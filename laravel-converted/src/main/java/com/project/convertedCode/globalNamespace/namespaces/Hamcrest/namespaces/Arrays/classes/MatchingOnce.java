package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Arrays.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/MatchingOnce.php

*/

public class MatchingOnce extends RuntimeClassBase {

    public Object _elementMatchers = null;

    public Object _mismatchDescription = null;

    public MatchingOnce(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MatchingOnce.class) {
            this.__construct(env, args);
        }
    }

    public MatchingOnce(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elementMatchers", typeHint = "array")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object elementMatchers = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        this._elementMatchers = elementMatchers;
        this._mismatchDescription = mismatchDescription;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(this._isNotSurplus(env, item))
                        && ZVal.toBool(this._isMatched(env, item)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object isFinished(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        if (ZVal.isEmpty(this._elementMatchers)) {
            return ZVal.assign(true);
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this._mismatchDescription,
                                        "appendText",
                                        MatchingOnce.class,
                                        "No item matches: "),
                                "appendList",
                                MatchingOnce.class,
                                "",
                                ", ",
                                "",
                                this._elementMatchers),
                        "appendText",
                        MatchingOnce.class,
                        " in "),
                "appendValueList",
                MatchingOnce.class,
                "[",
                ", ",
                "]",
                items);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    private Object _isNotSurplus(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        if (ZVal.isEmpty(this._elementMatchers)) {
            env.callMethod(
                    env.callMethod(
                            this._mismatchDescription,
                            "appendText",
                            MatchingOnce.class,
                            "Not matched: "),
                    "appendValue",
                    MatchingOnce.class,
                    item);
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    private Object _isMatched(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object i = null;
        Object matcher = null;
        for (ZPair zpairResult162 : ZVal.getIterable(this._elementMatchers, env, false)) {
            i = ZVal.assign(zpairResult162.getKey());
            matcher = ZVal.assign(zpairResult162.getValue());
            if (ZVal.isTrue(env.callMethod(matcher, "matches", MatchingOnce.class, item))) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "_elementMatchers", env),
                        env,
                        i);
                return ZVal.assign(true);
            }
        }

        env.callMethod(
                env.callMethod(
                        this._mismatchDescription,
                        "appendText",
                        MatchingOnce.class,
                        "Not matched: "),
                "appendValue",
                MatchingOnce.class,
                item);
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Hamcrest\\Arrays\\MatchingOnce";

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
                    .setName("Hamcrest\\Arrays\\MatchingOnce")
                    .setLookup(
                            MatchingOnce.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_elementMatchers", "_mismatchDescription")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/MatchingOnce.php")
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
