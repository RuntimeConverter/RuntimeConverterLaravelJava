package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.RequestMatcher;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/ExpressionRequestMatcher.php

*/

public class ExpressionRequestMatcher extends RequestMatcher {

    public Object language = null;

    public Object expression = null;

    public ExpressionRequestMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExpressionRequestMatcher.class) {
            this.__construct(env, args);
        }
    }

    public ExpressionRequestMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "language",
        typeHint = "Symfony\\Component\\ExpressionLanguage\\ExpressionLanguage"
    )
    @ConvertedParameter(index = 1, name = "expression")
    public Object setExpression(RuntimeEnv env, Object... args) {
        Object language = assignParameter(args, 0, false);
        Object expression = assignParameter(args, 1, false);
        this.language = language;
        this.expression = expression;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.language)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Unable to match the request as the expression language is not available."));
        }

        return ZVal.assign(
                ZVal.toBool(
                                env.callMethod(
                                        this.language,
                                        "evaluate",
                                        ExpressionRequestMatcher.class,
                                        this.expression,
                                        ZVal.newArray(
                                                new ZPair("request", request),
                                                new ZPair(
                                                        "method",
                                                        env.callMethod(
                                                                request,
                                                                "getMethod",
                                                                ExpressionRequestMatcher.class)),
                                                new ZPair(
                                                        "path",
                                                        NamespaceGlobal.rawurldecode
                                                                .env(env)
                                                                .call(
                                                                        env.callMethod(
                                                                                request,
                                                                                "getPathInfo",
                                                                                ExpressionRequestMatcher
                                                                                        .class))
                                                                .value()),
                                                new ZPair(
                                                        "host",
                                                        env.callMethod(
                                                                request,
                                                                "getHost",
                                                                ExpressionRequestMatcher.class)),
                                                new ZPair(
                                                        "ip",
                                                        env.callMethod(
                                                                request,
                                                                "getClientIp",
                                                                ExpressionRequestMatcher.class)),
                                                new ZPair(
                                                        "attributes",
                                                        env.callMethod(
                                                                toObjectR(request)
                                                                        .accessProp(this, env)
                                                                        .name("attributes")
                                                                        .value(),
                                                                "all",
                                                                ExpressionRequestMatcher.class)))))
                        && ZVal.toBool(super.matches(env, request)));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\ExpressionRequestMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RequestMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\ExpressionRequestMatcher")
                    .setLookup(
                            ExpressionRequestMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes",
                            "expression",
                            "host",
                            "ips",
                            "language",
                            "methods",
                            "path",
                            "schemes")
                    .setFilename("vendor/symfony/http-foundation/ExpressionRequestMatcher.php")
                    .addInterface("Symfony\\Component\\HttpFoundation\\RequestMatcherInterface")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\RequestMatcher")
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
