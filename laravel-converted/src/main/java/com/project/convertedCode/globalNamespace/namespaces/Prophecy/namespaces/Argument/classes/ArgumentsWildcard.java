package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.TokenInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Argument.namespaces.Token.classes.ExactValueToken;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Argument/ArgumentsWildcard.php

*/

public class ArgumentsWildcard extends RuntimeClassBase {

    public Object tokens = ZVal.newArray();

    public Object string = null;

    public ArgumentsWildcard(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgumentsWildcard.class) {
            this.__construct(env, args);
        }
    }

    public ArgumentsWildcard(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, false);
        Object argument = null;
        for (ZPair zpairResult940 : ZVal.getIterable(arguments, env, true)) {
            argument = ZVal.assign(zpairResult940.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            argument,
                            TokenInterface.class,
                            "Prophecy\\Argument\\Token\\TokenInterface"))) {
                argument = new ExactValueToken(env, argument);
            }

            new ReferenceClassProperty(this, "tokens", env).arrayAppend(env).set(argument);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    public Object scoreArguments(RuntimeEnv env, Object... args) {
        ReferenceContainer arguments = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object score = null;
        Object argument = null;
        Object i = null;
        Object totalScore = null;
        Object token = null;
        if (ZVal.toBool(
                        ZVal.equalityCheck(
                                0, function_count.f.env(env).call(arguments.getObject()).value()))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                0, function_count.f.env(env).call(this.tokens).value()))) {
            return 1;
        }

        arguments.setObject(function_array_values.f.env(env).call(arguments.getObject()).value());
        totalScore = 0;
        for (ZPair zpairResult941 : ZVal.getIterable(this.tokens, env, false)) {
            i = ZVal.assign(zpairResult941.getKey());
            token = ZVal.assign(zpairResult941.getValue());
            argument =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, arguments, env, i)
                                    ? arguments.arrayGet(env, i)
                                    : ZVal.getNull());
            if (ZVal.isGreaterThanOrEqualTo(
                    1,
                    ">=",
                    score =
                            env.callMethod(
                                    token, "scoreArgument", ArgumentsWildcard.class, argument))) {
                return ZVal.assign(false);
            }

            totalScore = ZAssignment.add("+=", totalScore, score);
            if (ZVal.strictEqualityCheck(
                    true, "===", env.callMethod(token, "isLast", ArgumentsWildcard.class))) {
                return ZVal.assign(totalScore);
            }
        }

        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(arguments.getObject()).value(),
                '>',
                function_count.f.env(env).call(this.tokens).value())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(totalScore);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Argument")
                        .setFile(
                                "/vendor/phpspec/prophecy/src/Prophecy/Argument/ArgumentsWildcard.php");
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.string)) {
            this.string =
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    ", ",
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    new Closure(
                                                            env,
                                                            runtimeConverterFunctionClassConstants,
                                                            "Prophecy\\Argument",
                                                            this) {
                                                        @Override
                                                        @ConvertedMethod
                                                        @ConvertedParameter(
                                                            index = 0,
                                                            name = "token"
                                                        )
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object token =
                                                                    assignParameter(args, 0, false);
                                                            return ZVal.assign(
                                                                    toStringR(token, env));
                                                        }
                                                    },
                                                    this.tokens)
                                            .value())
                            .value();
        }

        return ZVal.assign(this.string);
    }

    @ConvertedMethod
    public Object getTokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tokens);
    }

    public static final Object CONST_class = "Prophecy\\Argument\\ArgumentsWildcard";

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
                    .setName("Prophecy\\Argument\\ArgumentsWildcard")
                    .setLookup(
                            ArgumentsWildcard.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("string", "tokens")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Argument/ArgumentsWildcard.php")
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
