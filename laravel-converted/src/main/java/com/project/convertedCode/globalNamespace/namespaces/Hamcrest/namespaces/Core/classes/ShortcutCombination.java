package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/ShortcutCombination.php

*/

public abstract class ShortcutCombination extends BaseMatcher {

    public Object _matchers = null;

    public ShortcutCombination(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ShortcutCombination.class) {
            this.__construct(env, args);
        }
    }

    public ShortcutCombination(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matchers", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object matchers = assignParameter(args, 0, false);
        Util.runtimeStaticObject.checkAllAreMatchers(env, matchers);
        this._matchers = matchers;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "shortcut")
    protected Object matchesWithShortcut(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object shortcut = assignParameter(args, 1, false);
        Object matcher = null;
        for (ZPair zpairResult171 : ZVal.getIterable(this._matchers, env, true)) {
            matcher = ZVal.assign(zpairResult171.getValue());
            if (ZVal.equalityCheck(
                    env.callMethod(matcher, "matches", ShortcutCombination.class, item),
                    shortcut)) {
                return ZVal.assign(shortcut);
            }
        }

        return ZVal.assign(!ZVal.isTrue(shortcut));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    @ConvertedParameter(index = 1, name = "operator")
    public Object describeToWithOperator(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, false);
        env.callMethod(
                description,
                "appendList",
                ShortcutCombination.class,
                "(",
                " " + toStringR(operator, env) + " ",
                ")",
                this._matchers);
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\ShortcutCombination";

    @ConvertedMethod()
    public abstract Object matches(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object describeTo(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\ShortcutCombination")
                    .setLookup(
                            ShortcutCombination.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_matchers")
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/ShortcutCombination.php")
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
