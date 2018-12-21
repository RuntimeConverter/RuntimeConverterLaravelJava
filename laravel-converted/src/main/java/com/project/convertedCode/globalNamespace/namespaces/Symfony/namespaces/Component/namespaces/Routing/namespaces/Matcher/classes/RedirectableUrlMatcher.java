package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.UrlMatcher;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Matcher.classes.RedirectableUrlMatcherInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Exception.classes.ResourceNotFoundException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Matcher/RedirectableUrlMatcher.php

*/

public abstract class RedirectableUrlMatcher extends UrlMatcher
        implements RedirectableUrlMatcherInterface {

    public RedirectableUrlMatcher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RedirectableUrlMatcher.class) {
            this.__construct(env, args);
        }
    }

    public RedirectableUrlMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pathinfo")
    public Object match(RuntimeEnv env, Object... args) {
        ReferenceContainer pathinfo = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object scheme = null;
        Object e = null;
        Object ternaryExpressionTemp = null;
        Object e2 = null;
        try {
            return ZVal.assign(super.match(env, pathinfo.getObject()));
        } catch (ConvertedException convertedException304) {
            if (convertedException304.instanceOf(
                    ResourceNotFoundException.class,
                    "Symfony\\Component\\Routing\\Exception\\ResourceNotFoundException")) {
                e = convertedException304.getObject();
                if (!function_in_array
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("context")
                                                .value(),
                                        "getMethod",
                                        RedirectableUrlMatcher.class),
                                ZVal.arrayFromList("HEAD", "GET"),
                                true)
                        .getBool()) {
                    throw ZVal.getException(env, e);
                }

                if (toObjectR(this).accessProp(this, env).name("allowSchemes").getBool()) {
                    /* A php goto label was here. Goto is not supported. */
                    scheme =
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("context").value(),
                                    "getScheme",
                                    RedirectableUrlMatcher.class);
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("context").value(),
                            "setScheme",
                            RedirectableUrlMatcher.class,
                            function_current
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("allowSchemes")
                                                    .value())
                                    .value());
                    try {
                        ret.setObject(super.match(env, pathinfo.getObject()));
                        return ZVal.assign(
                                ZVal.add(
                                        env.callMethod(
                                                this,
                                                "redirect",
                                                RedirectableUrlMatcher.class,
                                                pathinfo.getObject(),
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        ret.arrayGet(env, "_route"))
                                                        ? ternaryExpressionTemp
                                                        : ZVal.getNull(),
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("context")
                                                                .value(),
                                                        "getScheme",
                                                        RedirectableUrlMatcher.class)),
                                        ret.getObject()));
                    } catch (ConvertedException convertedException305) {
                        if (convertedException305.instanceOf(
                                ExceptionInterface.class,
                                "Symfony\\Component\\Routing\\Exception\\ExceptionInterface")) {
                            e2 = convertedException305.getObject();
                            throw ZVal.getException(env, e);
                        } else {
                            throw convertedException305;
                        }
                    } finally {
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("context").value(),
                                "setScheme",
                                RedirectableUrlMatcher.class,
                                scheme);
                    }

                } else if (ZVal.strictEqualityCheck("/", "===", pathinfo.getObject())) {
                    throw ZVal.getException(env, e);

                } else {
                    try {
                        pathinfo.setObject(
                                ZVal.assign(
                                        ZVal.strictNotEqualityCheck(
                                                        "/", "!==", pathinfo.arrayGet(env, -1))
                                                ? toStringR(pathinfo.getObject(), env) + "/"
                                                : function_substr
                                                        .f
                                                        .env(env)
                                                        .call(pathinfo.getObject(), 0, -1)
                                                        .value()));
                        ret.setObject(super.match(env, pathinfo.getObject()));
                        return ZVal.assign(
                                ZVal.add(
                                        env.callMethod(
                                                this,
                                                "redirect",
                                                RedirectableUrlMatcher.class,
                                                pathinfo.getObject(),
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        ret.arrayGet(env, "_route"))
                                                        ? ternaryExpressionTemp
                                                        : ZVal.getNull()),
                                        ret.getObject()));
                    } catch (ConvertedException convertedException306) {
                        if (convertedException306.instanceOf(
                                ExceptionInterface.class,
                                "Symfony\\Component\\Routing\\Exception\\ExceptionInterface")) {
                            e2 = convertedException306.getObject();
                            if (toObjectR(this)
                                    .accessProp(this, env)
                                    .name("allowSchemes")
                                    .getBool()) {
                                ZVal.throwRuntimeException(
                                        "A php goto call was here. Goto is not supported.");
                            }

                            throw ZVal.getException(env, e);
                        } else {
                            throw convertedException306;
                        }
                    }
                }

            } else {
                throw convertedException304;
            }
        }
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Matcher\\RedirectableUrlMatcher";

    @ConvertedMethod()
    public abstract Object redirect(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends UrlMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Routing\\Matcher\\RedirectableUrlMatcher")
                    .setLookup(
                            RedirectableUrlMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "allow",
                            "allowSchemes",
                            "context",
                            "expressionLanguage",
                            "expressionLanguageProviders",
                            "request",
                            "routes")
                    .setFilename("vendor/symfony/routing/Matcher/RedirectableUrlMatcher.php")
                    .addInterface(
                            "Symfony\\Component\\Routing\\Matcher\\RedirectableUrlMatcherInterface")
                    .addInterface("Symfony\\Component\\Routing\\Matcher\\UrlMatcherInterface")
                    .addInterface("Symfony\\Component\\Routing\\RequestContextAwareInterface")
                    .addInterface("Symfony\\Component\\Routing\\Matcher\\RequestMatcherInterface")
                    .addExtendsClass("Symfony\\Component\\Routing\\Matcher\\UrlMatcher")
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
