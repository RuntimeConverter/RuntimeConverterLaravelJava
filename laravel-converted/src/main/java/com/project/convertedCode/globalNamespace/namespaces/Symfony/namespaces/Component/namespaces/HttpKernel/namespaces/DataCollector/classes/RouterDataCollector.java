package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.RedirectResponse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/RouterDataCollector.php

*/

public class RouterDataCollector extends DataCollector {

    public Object controllers = null;

    public RouterDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouterDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public RouterDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.reset(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        response,
                        RedirectResponse.class,
                        "Symfony\\Component\\HttpFoundation\\RedirectResponse"))) {
            new ReferenceClassProperty(this, "data", env).arrayAccess(env, "redirect").set(true);
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, "url")
                    .set(env.callMethod(response, "getTargetUrl", RouterDataCollector.class));
            if (ZVal.isTrue(
                    env.callMethod(
                            this.controllers,
                            new RuntimeArgsWithReferences().add(0, request),
                            "contains",
                            RouterDataCollector.class,
                            request.getObject()))) {
                new ReferenceClassProperty(this, "data", env)
                        .arrayAccess(env, "route")
                        .set(
                                this.guessRoute(
                                        env,
                                        request.getObject(),
                                        new ReferenceClassProperty(this, "controllers", env)
                                                .arrayGet(env, request.getObject())));
            }
        }

        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "controllers", env),
                env,
                request.getObject());
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.controllers = new SplObjectStorage(env);
        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        ZVal.newArray(
                                new ZPair("redirect", false),
                                new ZPair("url", ZVal.getNull()),
                                new ZPair("route", ZVal.getNull())));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "controller")
    protected Object guessRoute(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        return "n/a";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "event",
        typeHint = "Symfony\\Component\\HttpKernel\\Event\\FilterControllerEvent"
    )
    public Object onKernelController(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "controllers", env)
                .arrayAccess(env, env.callMethod(event, "getRequest", RouterDataCollector.class))
                .set(env.callMethod(event, "getController", RouterDataCollector.class));
        return null;
    }

    @ConvertedMethod
    public Object getRedirect(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "redirect"));
    }

    @ConvertedMethod
    public Object getTargetUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "url"));
    }

    @ConvertedMethod
    public Object getTargetRoute(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "route"));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "router";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\RouterDataCollector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DataCollector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\RouterDataCollector")
                    .setLookup(
                            RouterDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "controllers", "data")
                    .setFilename("vendor/symfony/http-kernel/DataCollector/RouterDataCollector.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
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
