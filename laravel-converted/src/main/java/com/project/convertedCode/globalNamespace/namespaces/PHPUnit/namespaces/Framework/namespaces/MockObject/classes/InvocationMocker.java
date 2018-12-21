package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes.MatcherCollection;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Builder.classes.NamespaceMatch;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.DeferredError;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Invokable;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/InvocationMocker.php

*/

public class InvocationMocker extends RuntimeClassBase
        implements MatcherCollection, Invokable, NamespaceMatch {

    public Object matchers = ZVal.newArray();

    public Object builderMap = ZVal.newArray();

    public Object configurableMethods = null;

    public Object returnValueGeneration = null;

    public InvocationMocker(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvocationMocker.class) {
            this.__construct(env, args);
        }
    }

    public InvocationMocker(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "configurableMethods", typeHint = "array")
    @ConvertedParameter(index = 1, name = "returnValueGeneration", typeHint = "bool")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object configurableMethods = assignParameter(args, 0, false);
        Object returnValueGeneration = assignParameter(args, 1, false);
        this.configurableMethods = configurableMethods;
        this.returnValueGeneration = returnValueGeneration;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "matcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation"
    )
    public Object addMatcher(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "matchers", env).arrayAppend(env).set(matcher);
        return null;
    }

    @ConvertedMethod
    public Object hasMatchers(RuntimeEnv env, Object... args) {
        Object matcher = null;
        for (ZPair zpairResult1157 : ZVal.getIterable(this.matchers, env, true)) {
            matcher = ZVal.assign(zpairResult1157.getValue());
            if (ZVal.isTrue(env.callMethod(matcher, "hasMatchers", InvocationMocker.class))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object lookupId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "builderMap", env), env, id)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "builderMap", env).arrayGet(env, id));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "builder",
        typeHint = "PHPUnit\\Framework\\MockObject\\Builder\\Match"
    )
    public Object registerId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object builder = assignParameter(args, 1, false);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "builderMap", env), env, id)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Match builder with id <"
                                    + toStringR(id, env)
                                    + "> is already registered."));
        }

        new ReferenceClassProperty(this, "builderMap", env).arrayAccess(env, id).set(builder);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "matcher",
        typeHint = "PHPUnit\\Framework\\MockObject\\Matcher\\Invocation"
    )
    public Object expects(RuntimeEnv env, Object... args) {
        Object matcher = assignParameter(args, 0, false);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PHPUnit
                        .namespaces
                        .Framework
                        .namespaces
                        .MockObject
                        .namespaces
                        .Builder
                        .classes
                        .InvocationMocker(env, this, matcher, this.configurableMethods));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoke(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        Object exception = null;
        Object returnValue = null;
        Object e = null;
        Object match = null;
        Object value = null;
        Object hasReturnValue = null;
        exception = ZVal.getNull();
        hasReturnValue = false;
        returnValue = ZVal.getNull();
        for (ZPair zpairResult1158 : ZVal.getIterable(this.matchers, env, true)) {
            match = ZVal.assign(zpairResult1158.getValue());
            try {
                if (ZVal.isTrue(
                        env.callMethod(match, "matches", InvocationMocker.class, invocation))) {
                    value = env.callMethod(match, "invoked", InvocationMocker.class, invocation);
                    if (!ZVal.isTrue(hasReturnValue)) {
                        returnValue = ZVal.assign(value);
                        hasReturnValue = true;
                    }
                }

            } catch (ConvertedException convertedException132) {
                if (convertedException132.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException132.getObject();
                    exception = ZVal.assign(e);
                } else {
                    throw convertedException132;
                }
            }
        }

        if (ZVal.strictNotEqualityCheck(exception, "!==", ZVal.getNull())) {
            throw ZVal.getException(env, exception);
        }

        if (ZVal.isTrue(hasReturnValue)) {
            return ZVal.assign(returnValue);
        }

        if (ZVal.strictEqualityCheck(this.returnValueGeneration, "===", false)) {
            exception =
                    new ExpectationFailedException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Return value inference disabled and no expectation set up for %s::%s()",
                                            env.callMethod(
                                                    invocation,
                                                    "getClassName",
                                                    InvocationMocker.class),
                                            env.callMethod(
                                                    invocation,
                                                    "getMethodName",
                                                    InvocationMocker.class))
                                    .value());
            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(
                                    env.callMethod(
                                            invocation, "getMethodName", InvocationMocker.class))
                            .value(),
                    "===",
                    "__tostring")) {
                this.addMatcher(env, new DeferredError(env, exception));
                return "";
            }

            throw ZVal.getException(env, exception);
        }

        return ZVal.assign(
                env.callMethod(invocation, "generateReturnValue", InvocationMocker.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        Object matcher = null;
        for (ZPair zpairResult1159 : ZVal.getIterable(this.matchers, env, true)) {
            matcher = ZVal.assign(zpairResult1159.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(matcher, "matches", InvocationMocker.class, invocation))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object matcher = null;
        for (ZPair zpairResult1160 : ZVal.getIterable(this.matchers, env, true)) {
            matcher = ZVal.assign(zpairResult1160.getValue());
            env.callMethod(matcher, "verify", InvocationMocker.class);
        }

        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\InvocationMocker";

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
                    .setName("PHPUnit\\Framework\\MockObject\\InvocationMocker")
                    .setLookup(
                            InvocationMocker.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "builderMap",
                            "configurableMethods",
                            "matchers",
                            "returnValueGeneration")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/InvocationMocker.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Stub\\MatcherCollection")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Invokable")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Verifiable")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Builder\\NamespaceMatch")
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
