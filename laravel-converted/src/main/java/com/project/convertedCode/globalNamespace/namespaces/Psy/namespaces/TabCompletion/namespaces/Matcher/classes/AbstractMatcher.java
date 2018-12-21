package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/AbstractMatcher.php

*/

public abstract class AbstractMatcher extends RuntimeClassBase {

    public AbstractMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object hasMatched(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    protected Object getInput(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        ReferenceContainer firstToken = new BasicReferenceContainer(null);
        Object var = null;
        var = "";
        firstToken.setObject(function_array_pop.f.env(env).call(tokens).value());
        if (ZVal.isTrue(runtimeStaticObject.tokenIs(env, firstToken.getObject(), CONST_T_STRING))) {
            var = ZVal.assign(firstToken.arrayGet(env, 1));
        }

        return ZVal.assign(var);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens")
    protected Object getNamespaceAndClass(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object tokens = assignParameter(args, 0, false);
        Object _pClass = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        _pClass = "";
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(
                runtimeStaticObject.hasToken(
                        env,
                        ZVal.newArray(
                                new ZPair(0, CONST_T_NS_SEPARATOR), new ZPair(1, CONST_T_STRING)),
                        token.setObject(function_array_pop.f.env(env).call(tokens).value())))) {
            if (ZVal.isTrue(runtimeStaticObject.needCompleteClass(env, token.getObject()))) {
                continue;
            }

            _pClass = toStringR(token.arrayGet(env, 1), env) + toStringR(_pClass, env);
        }

        return ZVal.assign(_pClass);
    }

    public static final Object CONST_CONSTANT_SYNTAX =
            "^[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*$";

    public static final Object CONST_VAR_SYNTAX =
            "^\\$[a-zA-Z_\\x7f-\\xff][a-zA-Z0-9_\\x7f-\\xff]*$";

    public static final Object CONST_MISC_OPERATORS = "+-*/^|&";

    public static final Object CONST_T_OPEN_TAG = "T_OPEN_TAG";

    public static final Object CONST_T_VARIABLE = "T_VARIABLE";

    public static final Object CONST_T_OBJECT_OPERATOR = "T_OBJECT_OPERATOR";

    public static final Object CONST_T_DOUBLE_COLON = "T_DOUBLE_COLON";

    public static final Object CONST_T_NEW = "T_NEW";

    public static final Object CONST_T_CLONE = "T_CLONE";

    public static final Object CONST_T_NS_SEPARATOR = "T_NS_SEPARATOR";

    public static final Object CONST_T_STRING = "T_STRING";

    public static final Object CONST_T_WHITESPACE = "T_WHITESPACE";

    public static final Object CONST_T_AND_EQUAL = "T_AND_EQUAL";

    public static final Object CONST_T_BOOLEAN_AND = "T_BOOLEAN_AND";

    public static final Object CONST_T_BOOLEAN_OR = "T_BOOLEAN_OR";

    public static final Object CONST_T_ENCAPSED_AND_WHITESPACE = "T_ENCAPSED_AND_WHITESPACE";

    public static final Object CONST_T_REQUIRE = "T_REQUIRE";

    public static final Object CONST_T_REQUIRE_ONCE = "T_REQUIRE_ONCE";

    public static final Object CONST_T_INCLUDE = "T_INCLUDE";

    public static final Object CONST_T_INCLUDE_ONCE = "T_INCLUDE_ONCE";

    public static final Object CONST_class = "Psy\\TabCompletion\\Matcher\\AbstractMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "prefix")
        @ConvertedParameter(index = 1, name = "word")
        public Object startsWith(RuntimeEnv env, Object... args) {
            Object prefix = assignParameter(args, 0, false);
            Object word = assignParameter(args, 1, false);
            return ZVal.assign(
                    function_preg_match
                            .f
                            .env(env)
                            .call(function_sprintf.f.env(env).call("#^%s#", prefix).value(), word)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "token")
        @ConvertedParameter(index = 1, name = "syntax")
        public Object hasSyntax(RuntimeEnv env, Object... args) {
            ReferenceContainer token = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object syntax = assignParameter(args, 1, true);
            if (null == syntax) {
                syntax = CONST_VAR_SYNTAX;
            }
            Object regexp = null;
            if (!function_is_array.f.env(env).call(token.getObject()).getBool()) {
                return ZVal.assign(false);
            }

            regexp = function_sprintf.f.env(env).call("#%s#", syntax).value();
            return ZVal.assign(
                    ZVal.toBool(
                            function_preg_match
                                    .f
                                    .env(env)
                                    .call(regexp, token.arrayGet(env, 1))
                                    .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "token")
        @ConvertedParameter(index = 1, name = "which")
        public Object tokenIs(RuntimeEnv env, Object... args) {
            ReferenceContainer token = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object which = assignParameter(args, 1, false);
            if (!function_is_array.f.env(env).call(token.getObject()).getBool()) {
                return ZVal.assign(false);
            }

            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            NamespaceGlobal.token_name
                                    .env(env)
                                    .call(token.arrayGet(env, 0))
                                    .value(),
                            "===",
                            which));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "token")
        public Object isOperator(RuntimeEnv env, Object... args) {
            Object token = assignParameter(args, 0, false);
            if (!function_is_string.f.env(env).call(token).getBool()) {
                return ZVal.assign(false);
            }

            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            function_strpos.f.env(env).call(CONST_MISC_OPERATORS, token).value(),
                            "!==",
                            false));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "token")
        public Object needCompleteClass(RuntimeEnv env, Object... args) {
            ReferenceContainer token = new BasicReferenceContainer(assignParameter(args, 0, false));
            return ZVal.assign(
                    function_in_array
                            .f
                            .env(env)
                            .call(token.arrayGet(env, 1), ZVal.arrayFromList("doc", "ls", "show"))
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "coll", typeHint = "array")
        @ConvertedParameter(index = 1, name = "token")
        public Object hasToken(RuntimeEnv env, Object... args) {
            Object coll = assignParameter(args, 0, false);
            ReferenceContainer token = new BasicReferenceContainer(assignParameter(args, 1, false));
            if (!function_is_array.f.env(env).call(token.getObject()).getBool()) {
                return ZVal.assign(false);
            }

            return ZVal.assign(
                    function_in_array
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.token_name
                                            .env(env)
                                            .call(token.arrayGet(env, 0))
                                            .value(),
                                    coll)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\TabCompletion\\Matcher\\AbstractMatcher")
                    .setLookup(
                            AbstractMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/TabCompletion/Matcher/AbstractMatcher.php")
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
