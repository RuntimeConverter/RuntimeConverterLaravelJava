package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.Invocation;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestFailure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedCount;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.AnyParameters;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.AnyInvokedCount;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher.php

*/

public class Matcher extends RuntimeClassBase implements Invocation {

    public Object invocationMatcher = null;

    public Object afterMatchBuilderId = null;

    public Object afterMatchBuilderIsInvoked = false;

    public Object methodNameMatcher = null;

    public Object parametersMatcher = null;

    public Object stub = null;

    public Matcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Matcher.class) {
            this.__construct(env, args);
        }
    }

    public Matcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocationMatcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object invocationMatcher = assignParameter(args, 0, false);
        this.invocationMatcher = invocationMatcher;
        return null;
    }

    @ConvertedMethod
    public Object hasMatchers(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        this.invocationMatcher, "!==", ZVal.getNull()))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                this.invocationMatcher,
                                                AnyInvokedCount.class,
                                                "PHPUnit\\Framework\\MockObject\\Matcher\\AnyInvokedCount"))));
    }

    @ConvertedMethod
    public Object hasMethodNameMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(this.methodNameMatcher, "!==", ZVal.getNull()));
    }

    @ConvertedMethod
    public Object getMethodNameMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methodNameMatcher);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "matcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\MethodName"
    )
    public Object setMethodNameMatcher(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        this.methodNameMatcher = matcher;
        return null;
    }

    @ConvertedMethod
    public Object hasParametersMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(this.parametersMatcher, "!==", ZVal.getNull()));
    }

    @ConvertedMethod
    public Object getParametersMatcher(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parametersMatcher);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matcher")
    public Object setParametersMatcher(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        this.parametersMatcher = matcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stub")
    public Object setStub(RuntimeEnv env, Object... args) {
        Object stub = assignParameter(args, 0, false);
        this.stub = stub;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setAfterMatchBuilderId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        this.afterMatchBuilderId = id;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoked(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        Object e = null;
        Object builder = null;
        Object matcher = null;
        if (ZVal.strictEqualityCheck(this.invocationMatcher, "===", ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No invocation matcher is set"));
        }

        if (ZVal.strictEqualityCheck(this.methodNameMatcher, "===", ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No method matcher is set"));
        }

        if (ZVal.strictNotEqualityCheck(this.afterMatchBuilderId, "!==", ZVal.getNull())) {
            builder =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(invocation, "getObject", Matcher.class),
                                    "__phpunit_getInvocationMocker",
                                    Matcher.class),
                            "lookupId",
                            Matcher.class,
                            this.afterMatchBuilderId);
            if (!ZVal.isTrue(builder)) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "No builder found for match builder identification <%s>",
                                                this.afterMatchBuilderId)
                                        .value()));
            }

            matcher = env.callMethod(builder, "getMatcher", Matcher.class);
            if (ZVal.toBool(matcher)
                    && ZVal.toBool(
                            env.callMethod(
                                    toObjectR(matcher)
                                            .accessProp(this, env)
                                            .name("invocationMatcher")
                                            .value(),
                                    "hasBeenInvoked",
                                    Matcher.class))) {
                this.afterMatchBuilderIsInvoked = true;
            }
        }

        env.callMethod(this.invocationMatcher, "invoked", Matcher.class, invocation);
        try {
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    this.parametersMatcher, "!==", ZVal.getNull()))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            this.parametersMatcher,
                                            "matches",
                                            Matcher.class,
                                            invocation)))) {
                env.callMethod(this.parametersMatcher, "verify", Matcher.class);
            }

        } catch (ConvertedException convertedException133) {
            if (convertedException133.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException133.getObject();
                throw ZVal.getException(
                        env,
                        new ExpectationFailedException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Expectation failed for %s when %s\n%s",
                                                env.callMethod(
                                                        this.methodNameMatcher,
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(
                                                        this.invocationMatcher,
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(e, "getMessage", Matcher.class))
                                        .value(),
                                env.callMethod(e, "getComparisonFailure", Matcher.class)));
            } else {
                throw convertedException133;
            }
        }

        if (ZVal.isTrue(this.stub)) {
            return ZVal.assign(env.callMethod(this.stub, "invoke", Matcher.class, invocation));
        }

        return ZVal.assign(env.callMethod(invocation, "generateReturnValue", Matcher.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        Object e = null;
        Object builder = null;
        Object matcher = null;
        if (ZVal.strictNotEqualityCheck(this.afterMatchBuilderId, "!==", ZVal.getNull())) {
            builder =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(invocation, "getObject", Matcher.class),
                                    "__phpunit_getInvocationMocker",
                                    Matcher.class),
                            "lookupId",
                            Matcher.class,
                            this.afterMatchBuilderId);
            if (!ZVal.isTrue(builder)) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "No builder found for match builder identification <%s>",
                                                this.afterMatchBuilderId)
                                        .value()));
            }

            matcher = env.callMethod(builder, "getMatcher", Matcher.class);
            if (!ZVal.isTrue(matcher)) {
                return ZVal.assign(false);
            }

            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(matcher)
                                    .accessProp(this, env)
                                    .name("invocationMatcher")
                                    .value(),
                            "hasBeenInvoked",
                            Matcher.class))) {
                return ZVal.assign(false);
            }
        }

        if (ZVal.strictEqualityCheck(this.invocationMatcher, "===", ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No invocation matcher is set"));
        }

        if (ZVal.strictEqualityCheck(this.methodNameMatcher, "===", ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No method matcher is set"));
        }

        if (!ZVal.isTrue(
                env.callMethod(this.invocationMatcher, "matches", Matcher.class, invocation))) {
            return ZVal.assign(false);
        }

        try {
            if (!ZVal.isTrue(
                    env.callMethod(this.methodNameMatcher, "matches", Matcher.class, invocation))) {
                return ZVal.assign(false);
            }

        } catch (ConvertedException convertedException134) {
            if (convertedException134.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException134.getObject();
                throw ZVal.getException(
                        env,
                        new ExpectationFailedException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Expectation failed for %s when %s\n%s",
                                                env.callMethod(
                                                        this.methodNameMatcher,
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(
                                                        this.invocationMatcher,
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(e, "getMessage", Matcher.class))
                                        .value(),
                                env.callMethod(e, "getComparisonFailure", Matcher.class)));
            } else {
                throw convertedException134;
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object e = null;
        Object invocationIsNever = null;
        Object invocationIsAny = null;
        if (ZVal.strictEqualityCheck(this.invocationMatcher, "===", ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No invocation matcher is set"));
        }

        if (ZVal.strictEqualityCheck(this.methodNameMatcher, "===", ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env, "No method matcher is set"));
        }

        try {
            env.callMethod(this.invocationMatcher, "verify", Matcher.class);
            if (ZVal.strictEqualityCheck(this.parametersMatcher, "===", ZVal.getNull())) {
                this.parametersMatcher = new AnyParameters(env);
            }

            invocationIsAny =
                    ZVal.assign(
                            ZVal.checkInstanceType(
                                    this.invocationMatcher,
                                    AnyInvokedCount.class,
                                    "PHPUnit\\Framework\\MockObject\\Matcher\\AnyInvokedCount"));
            invocationIsNever =
                    ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            this.invocationMatcher,
                                            InvokedCount.class,
                                            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedCount"))
                            && ZVal.toBool(
                                    env.callMethod(
                                            this.invocationMatcher, "isNever", Matcher.class));
            if (ZVal.toBool(!ZVal.isTrue(invocationIsAny))
                    && ZVal.toBool(!ZVal.isTrue(invocationIsNever))) {
                env.callMethod(this.parametersMatcher, "verify", Matcher.class);
            }

        } catch (ConvertedException convertedException135) {
            if (convertedException135.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException135.getObject();
                throw ZVal.getException(
                        env,
                        new ExpectationFailedException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Expectation failed for %s when %s.\n%s",
                                                env.callMethod(
                                                        this.methodNameMatcher,
                                                        "toString",
                                                        Matcher.class),
                                                env.callMethod(
                                                        this.invocationMatcher,
                                                        "toString",
                                                        Matcher.class),
                                                TestFailure.runtimeStaticObject.exceptionToString(
                                                        env, e))
                                        .value()));
            } else {
                throw convertedException135;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        ReferenceContainer list = new BasicReferenceContainer(null);
        list.setObject(ZVal.newArray());
        if (ZVal.strictNotEqualityCheck(this.invocationMatcher, "!==", ZVal.getNull())) {
            list.arrayAppend(env)
                    .set(env.callMethod(this.invocationMatcher, "toString", Matcher.class));
        }

        if (ZVal.strictNotEqualityCheck(this.methodNameMatcher, "!==", ZVal.getNull())) {
            list.arrayAppend(env)
                    .set(
                            "where "
                                    + toStringR(
                                            env.callMethod(
                                                    this.methodNameMatcher,
                                                    "toString",
                                                    Matcher.class),
                                            env));
        }

        if (ZVal.strictNotEqualityCheck(this.parametersMatcher, "!==", ZVal.getNull())) {
            list.arrayAppend(env)
                    .set(
                            "and "
                                    + toStringR(
                                            env.callMethod(
                                                    this.parametersMatcher,
                                                    "toString",
                                                    Matcher.class),
                                            env));
        }

        if (ZVal.strictNotEqualityCheck(this.afterMatchBuilderId, "!==", ZVal.getNull())) {
            list.arrayAppend(env).set("after " + toStringR(this.afterMatchBuilderId, env));
        }

        if (ZVal.strictNotEqualityCheck(this.stub, "!==", ZVal.getNull())) {
            list.arrayAppend(env)
                    .set(
                            "will "
                                    + toStringR(
                                            env.callMethod(this.stub, "toString", Matcher.class),
                                            env));
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(" ", list.getObject()).value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Matcher";

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
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher")
                    .setLookup(
                            Matcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "afterMatchBuilderId",
                            "afterMatchBuilderIsInvoked",
                            "invocationMatcher",
                            "methodNameMatcher",
                            "parametersMatcher",
                            "stub")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/MockObject/Matcher.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Matcher\\Invocation")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Verifiable")
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
