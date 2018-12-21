package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.StreamedResponse;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Fragment/FragmentHandler.php

*/

public class FragmentHandler extends RuntimeClassBase {

    public Object debug = null;

    public Object renderers = ZVal.newArray();

    public Object requestStack = null;

    public FragmentHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FragmentHandler.class) {
            this.__construct(env, args);
        }
    }

    public FragmentHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack"
    )
    @ConvertedParameter(
        index = 1,
        name = "renderers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "debug",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object requestStack = assignParameter(args, 0, false);
        Object renderers = assignParameter(args, 1, true);
        if (null == renderers) {
            renderers = ZVal.newArray();
        }
        Object debug = assignParameter(args, 2, true);
        if (null == debug) {
            debug = false;
        }
        Object renderer = null;
        this.requestStack = requestStack;
        for (ZPair zpairResult1951 : ZVal.getIterable(renderers, env, true)) {
            renderer = ZVal.assign(zpairResult1951.getValue());
            this.addRenderer(env, renderer);
        }

        this.debug = debug;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "renderer",
        typeHint = "Symfony\\Component\\HttpKernel\\Fragment\\FragmentRendererInterface"
    )
    public Object addRenderer(RuntimeEnv env, Object... args) {
        Object renderer = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "renderers", env)
                .arrayAccess(env, env.callMethod(renderer, "getName", FragmentHandler.class))
                .set(renderer);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(index = 1, name = "renderer")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object render(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object renderer = assignParameter(args, 1, true);
        if (null == renderer) {
            renderer = "inline";
        }
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object request = null;
        if (!arrayActionR(ArrayAction.ISSET, options, env, "ignore_errors")) {
            options.arrayAccess(env, "ignore_errors").set(!ZVal.isTrue(this.debug));
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "renderers", env),
                env,
                renderer)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"%s\" renderer does not exist.", renderer)
                                    .value()));
        }

        if (!ZVal.isTrue(
                request =
                        env.callMethod(
                                this.requestStack, "getCurrentRequest", FragmentHandler.class))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "Rendering a fragment can only be done when handling a Request."));
        }

        return ZVal.assign(
                this.deliver(
                        env,
                        env.callMethod(
                                new ReferenceClassProperty(this, "renderers", env)
                                        .arrayGet(env, renderer),
                                "render",
                                FragmentHandler.class,
                                uri,
                                request,
                                options.getObject())));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    protected Object deliver(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(response, "isSuccessful", FragmentHandler.class))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Error when rendering \"%s\" (Status code is %s).",
                                            env.callMethod(
                                                    env.callMethod(
                                                            this.requestStack,
                                                            "getCurrentRequest",
                                                            FragmentHandler.class),
                                                    "getUri",
                                                    FragmentHandler.class),
                                            env.callMethod(
                                                    response,
                                                    "getStatusCode",
                                                    FragmentHandler.class))
                                    .value()));
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        response,
                        StreamedResponse.class,
                        "Symfony\\Component\\HttpFoundation\\StreamedResponse"))) {
            return ZVal.assign(env.callMethod(response, "getContent", FragmentHandler.class));
        }

        env.callMethod(response, "sendContent", FragmentHandler.class);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Fragment\\FragmentHandler";

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
                    .setName("Symfony\\Component\\HttpKernel\\Fragment\\FragmentHandler")
                    .setLookup(
                            FragmentHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("debug", "renderers", "requestStack")
                    .setFilename("vendor/symfony/http-kernel/Fragment/FragmentHandler.php")
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
