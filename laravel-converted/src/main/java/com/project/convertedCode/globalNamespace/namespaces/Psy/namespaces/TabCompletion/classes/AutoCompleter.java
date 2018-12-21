package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractMatcher;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/AutoCompleter.php

*/

public class AutoCompleter extends RuntimeClassBase {

    public Object matchers = null;

    public AutoCompleter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AutoCompleter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "matcher",
        typeHint = "Psy\\TabCompletion\\Matcher\\AbstractMatcher"
    )
    public Object addMatcher(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "matchers", env).arrayAppend(env).set(matcher);
        return null;
    }

    @ConvertedMethod
    public Object activate(RuntimeEnv env, Object... args) {
        NamespaceGlobal.readline_completion_function
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "callback")));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    @ConvertedParameter(index = 1, name = "index")
    @ConvertedParameter(index = 2, name = "info", defaultValue = "", defaultValueType = "array")
    public Object processCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/TabCompletion")
                        .setFile("/vendor/psy/psysh/src/TabCompletion/AutoCompleter.php");
        Object input = assignParameter(args, 0, false);
        Object index = assignParameter(args, 1, false);
        ReferenceContainer info = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == info.getObject()) {
            info.setObject(ZVal.newArray());
        }
        Object line = null;
        Object tokens = null;
        Object matcher = null;
        Object matches = null;
        line = ZVal.assign(info.arrayGet(env, "line_buffer"));
        if (arrayActionR(ArrayAction.ISSET, info, env, "end")) {
            line = function_substr.f.env(env).call(line, 0, info.arrayGet(env, "end")).value();
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(line, "===", ""))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(input, "!==", ""))) {
            line = ZVal.assign(input);
        }

        tokens =
                NamespaceGlobal.token_get_all
                        .env(env)
                        .call("<?php " + toStringR(line, env))
                        .value();
        tokens =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                tokens,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Psy\\TabCompletion",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "token")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object token = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                !ZVal.isTrue(
                                                        AbstractMatcher.runtimeStaticObject.tokenIs(
                                                                env,
                                                                token,
                                                                AbstractMatcher
                                                                        .CONST_T_WHITESPACE)));
                                    }
                                })
                        .value();
        matches = ZVal.newArray();
        for (ZPair zpairResult1417 : ZVal.getIterable(this.matchers, env, true)) {
            matcher = ZVal.assign(zpairResult1417.getValue());
            if (ZVal.isTrue(env.callMethod(matcher, "hasMatched", AutoCompleter.class, tokens))) {
                matches =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                matcher, "getMatches", AutoCompleter.class, tokens),
                                        matches)
                                .value();
            }
        }

        matches = function_array_unique.f.env(env).call(matches).value();
        return ZVal.assign(!ZVal.isEmpty(matches) ? matches : ZVal.arrayFromList(""));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    @ConvertedParameter(index = 1, name = "index")
    public Object callback(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object index = assignParameter(args, 1, false);
        return ZVal.assign(
                this.processCallback(
                        env, input, index, NamespaceGlobal.readline_info.env(env).call().value()));
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        if (function_function_exists
                .f
                .env(env)
                .call("readline_callback_handler_remove")
                .getBool()) {
            NamespaceGlobal.readline_callback_handler_remove.env(env).call();
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\TabCompletion\\AutoCompleter";

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
                    .setName("Psy\\TabCompletion\\AutoCompleter")
                    .setLookup(
                            AutoCompleter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("matchers")
                    .setFilename("vendor/psy/psysh/src/TabCompletion/AutoCompleter.php")
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
