package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes.RoutableFragmentRenderer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ControllerReference;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Fragment/AbstractSurrogateFragmentRenderer.php

*/

public abstract class AbstractSurrogateFragmentRenderer extends RoutableFragmentRenderer {

    public Object surrogate = null;

    public Object inlineStrategy = null;

    public Object signer = null;

    public AbstractSurrogateFragmentRenderer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractSurrogateFragmentRenderer.class) {
            this.__construct(env, args);
        }
    }

    public AbstractSurrogateFragmentRenderer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "surrogate",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpCache\\SurrogateInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "inlineStrategy",
        typeHint = "Symfony\\Component\\HttpKernel\\Fragment\\FragmentRendererInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "signer",
        typeHint = "Symfony\\Component\\HttpKernel\\UriSigner",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object surrogate = assignParameter(args, 0, true);
        if (null == surrogate) {
            surrogate = ZVal.getNull();
        }
        Object inlineStrategy = assignParameter(args, 1, false);
        Object signer = assignParameter(args, 2, true);
        if (null == signer) {
            signer = ZVal.getNull();
        }
        this.surrogate = surrogate;
        this.inlineStrategy = inlineStrategy;
        this.signer = signer;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object render(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object alt = null;
        Object tag = null;
        if (ZVal.toBool(!ZVal.isTrue(this.surrogate))
                || ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        this.surrogate,
                                        "hasSurrogateCapability",
                                        AbstractSurrogateFragmentRenderer.class,
                                        request)))) {
            if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    uri,
                                    ControllerReference.class,
                                    "Symfony\\Component\\HttpKernel\\Controller\\ControllerReference"))
                    && ZVal.toBool(
                            this.containsNonScalars(
                                    env,
                                    toObjectR(uri)
                                            .accessProp(this, env)
                                            .name("attributes")
                                            .value()))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Passing non-scalar values as part of URI attributes to the ESI and SSI rendering strategies is not supported. Use a different rendering strategy or pass scalar values."));
            }

            return ZVal.assign(
                    env.callMethod(
                            this.inlineStrategy,
                            "render",
                            AbstractSurrogateFragmentRenderer.class,
                            uri,
                            request,
                            options.getObject()));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        uri,
                        ControllerReference.class,
                        "Symfony\\Component\\HttpKernel\\Controller\\ControllerReference"))) {
            uri = this.generateSignedFragmentUri(env, uri, request);
        }

        alt =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, options, env, "alt")
                                ? options.arrayGet(env, "alt")
                                : ZVal.getNull());
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        alt,
                        ControllerReference.class,
                        "Symfony\\Component\\HttpKernel\\Controller\\ControllerReference"))) {
            alt = this.generateSignedFragmentUri(env, alt, request);
        }

        tag =
                env.callMethod(
                        this.surrogate,
                        "renderIncludeTag",
                        AbstractSurrogateFragmentRenderer.class,
                        uri,
                        alt,
                        arrayActionR(ArrayAction.ISSET, options, env, "ignore_errors")
                                ? options.arrayGet(env, "ignore_errors")
                                : false,
                        arrayActionR(ArrayAction.ISSET, options, env, "comment")
                                ? options.arrayGet(env, "comment")
                                : "");
        return ZVal.assign(new Response(env, tag));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    private Object generateSignedFragmentUri(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object fragmentUri = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.signer)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "You must use a URI when using the ESI rendering strategy or set a URL signer."));
        }

        fragmentUri =
                env.callMethod(
                        this.signer,
                        "sign",
                        AbstractSurrogateFragmentRenderer.class,
                        env.callMethod(
                                this,
                                "generateFragmentUri",
                                AbstractSurrogateFragmentRenderer.class,
                                uri,
                                request,
                                true));
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                fragmentUri,
                                function_strlen
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        request,
                                                        "getSchemeAndHttpHost",
                                                        AbstractSurrogateFragmentRenderer.class))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    private Object containsNonScalars(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object value = null;
        for (ZPair zpairResult1950 : ZVal.getIterable(values, env, true)) {
            value = ZVal.assign(zpairResult1950.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                return ZVal.assign(this.containsNonScalars(env, value));

            } else if (ZVal.toBool(!function_is_scalar.f.env(env).call(value).getBool())
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Fragment\\AbstractSurrogateFragmentRenderer";

    @ConvertedMethod()
    public abstract Object getName(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends RoutableFragmentRenderer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpKernel\\Fragment\\AbstractSurrogateFragmentRenderer")
                    .setLookup(
                            AbstractSurrogateFragmentRenderer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fragmentPath", "inlineStrategy", "signer", "surrogate")
                    .setFilename(
                            "vendor/symfony/http-kernel/Fragment/AbstractSurrogateFragmentRenderer.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Fragment\\FragmentRendererInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpKernel\\Fragment\\RoutableFragmentRenderer")
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
