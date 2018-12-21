package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Matcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.StringDescription;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.AssertionError;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/MatcherAssert.php

*/

public class MatcherAssert extends RuntimeClassBase {

    public MatcherAssert(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MatcherAssert(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Hamcrest\\MatcherAssert";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object assertThat(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer ___args = new BasicReferenceContainer(null);
            ___args.setObject(
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value());
            SwitchEnumType17 switchVariable17 =
                    ZVal.getEnum(
                            function_count.f.env(env).call(___args.getObject()).value(),
                            SwitchEnumType17.DEFAULT_CASE,
                            SwitchEnumType17.INTEGER_1,
                            1,
                            SwitchEnumType17.INTEGER_2,
                            2,
                            SwitchEnumType17.INTEGER_3,
                            3);
            switch (switchVariable17) {
                case INTEGER_1:
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Hamcrest
                                                    .classes
                                                    .MatcherAssert
                                                    .RequestStaticProperties
                                                    .class)
                                    ._count =
                            ZVal.increment(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Hamcrest
                                                            .classes
                                                            .MatcherAssert
                                                            .RequestStaticProperties
                                                            .class)
                                            ._count);
                    if (!ZVal.isTrue(___args.arrayGet(env, 0))) {
                        throw ZVal.getException(env, new AssertionError(env));
                    }

                    break;
                case INTEGER_2:
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Hamcrest
                                                    .classes
                                                    .MatcherAssert
                                                    .RequestStaticProperties
                                                    .class)
                                    ._count =
                            ZVal.increment(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Hamcrest
                                                            .classes
                                                            .MatcherAssert
                                                            .RequestStaticProperties
                                                            .class)
                                            ._count);
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    ___args.arrayGet(env, 1),
                                    Matcher.class,
                                    "Hamcrest\\Matcher"))) {
                        runtimeStaticObject.doAssert(
                                env, "", ___args.arrayGet(env, 0), ___args.arrayGet(env, 1));

                    } else if (!ZVal.isTrue(___args.arrayGet(env, 1))) {
                        throw ZVal.getException(
                                env, new AssertionError(env, ___args.arrayGet(env, 0)));
                    }

                    break;
                case INTEGER_3:
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Hamcrest
                                                    .classes
                                                    .MatcherAssert
                                                    .RequestStaticProperties
                                                    .class)
                                    ._count =
                            ZVal.increment(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Hamcrest
                                                            .classes
                                                            .MatcherAssert
                                                            .RequestStaticProperties
                                                            .class)
                                            ._count);
                    runtimeStaticObject.doAssert(
                            env,
                            ___args.arrayGet(env, 0),
                            ___args.arrayGet(env, 1),
                            Util.runtimeStaticObject.wrapValueWithIsEqual(
                                    env, ___args.arrayGet(env, 2)));
                    break;
                case DEFAULT_CASE:
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env, "assertThat() requires one to three arguments"));
            }
            ;
            return null;
        }

        @ConvertedMethod
        public Object getCount(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .classes
                                            .MatcherAssert
                                            .RequestStaticProperties
                                            .class)
                            ._count);
        }

        @ConvertedMethod
        public Object resetCount(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .classes
                                            .MatcherAssert
                                            .RequestStaticProperties
                                            .class)
                            ._count =
                    0;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "identifier")
        @ConvertedParameter(index = 1, name = "actual")
        @ConvertedParameter(index = 2, name = "matcher", typeHint = "Hamcrest\\Matcher")
        private Object doAssert(RuntimeEnv env, Object... args) {
            Object identifier = assignParameter(args, 0, false);
            Object actual = assignParameter(args, 1, false);
            Object matcher = assignParameter(args, 2, false);
            Object description = null;
            if (!ZVal.isTrue(env.callMethod(matcher, "matches", MatcherAssert.class, actual))) {
                description = new StringDescription(env);
                if (!ZVal.isEmpty(identifier)) {
                    env.callMethod(
                            description,
                            "appendText",
                            MatcherAssert.class,
                            toStringR(identifier, env) + toStringR("\n", env));
                }

                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        description,
                                        "appendText",
                                        MatcherAssert.class,
                                        "Expected: "),
                                "appendDescriptionOf",
                                MatcherAssert.class,
                                matcher),
                        "appendText",
                        MatcherAssert.class,
                        toStringR("\n", env) + "     but: ");
                env.callMethod(
                        matcher, "describeMismatch", MatcherAssert.class, actual, description);
                throw ZVal.getException(env, new AssertionError(env, toStringR(description, env)));
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object _count = 0;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\MatcherAssert")
                    .setLookup(
                            MatcherAssert.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("_count")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/MatcherAssert.php")
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

    private enum SwitchEnumType17 {
        INTEGER_1,
        INTEGER_2,
        INTEGER_3,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
