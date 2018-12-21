package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/RemoveEmptyControllerArgumentLocatorsPass.php

*/

public class RemoveEmptyControllerArgumentLocatorsPass extends RuntimeClassBase {

    public Object controllerLocator = null;

    public RemoveEmptyControllerArgumentLocatorsPass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RemoveEmptyControllerArgumentLocatorsPass.class) {
            this.__construct(env, args);
        }
    }

    public RemoveEmptyControllerArgumentLocatorsPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controllerLocator", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object controllerLocator = assignParameter(args, 0, true);
        if (null == controllerLocator) {
            controllerLocator = "argument_resolver.controller_locator";
        }
        this.controllerLocator = controllerLocator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object container = assignParameter(args, 0, false);
        Object reason = null;
        Object controllerLocator = null;
        Object controller = null;
        Object controllerDef = null;
        Object argumentLocator = null;
        Object method = null;
        Object argumentRef = null;
        ReferenceContainer controllers = new BasicReferenceContainer(null);
        Object action = null;
        Object id = null;
        Object runtimeTempArrayResult199 = null;
        Object runtimeTempArrayResult198 = null;
        controllerLocator =
                env.callMethod(
                        container,
                        "findDefinition",
                        RemoveEmptyControllerArgumentLocatorsPass.class,
                        this.controllerLocator);
        controllers.setObject(
                env.callMethod(
                        controllerLocator,
                        "getArgument",
                        RemoveEmptyControllerArgumentLocatorsPass.class,
                        0));
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1942 : ZVal.getIterable(controllers.getObject(), env, false)) {
            controller = ZVal.assign(zpairResult1942.getKey());
            argumentRef = ZVal.assign(zpairResult1942.getValue());
            argumentLocator =
                    env.callMethod(
                            container,
                            "getDefinition",
                            RemoveEmptyControllerArgumentLocatorsPass.class,
                            toStringR(
                                    handleReturnReference(
                                                    env.callMethod(
                                                            argumentRef,
                                                            "getValues",
                                                            RemoveEmptyControllerArgumentLocatorsPass
                                                                    .class))
                                            .arrayGet(env, 0),
                                    env));
            if (!ZVal.isTrue(
                    env.callMethod(
                            argumentLocator,
                            "getArgument",
                            RemoveEmptyControllerArgumentLocatorsPass.class,
                            0))) {
                reason =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Removing service-argument resolver for controller \"%s\": no corresponding services exist for the referenced types.",
                                        controller)
                                .value();

            } else {
                reason = false;
                ZVal.list(
                        runtimeTempArrayResult198 =
                                function_explode.f.env(env).call("::", controller).value(),
                        (id = listGet(runtimeTempArrayResult198, 0, env)),
                        (action = listGet(runtimeTempArrayResult198, 1, env)));
                controllerDef =
                        env.callMethod(
                                container,
                                "getDefinition",
                                RemoveEmptyControllerArgumentLocatorsPass.class,
                                id);
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1943 :
                        ZVal.getIterable(
                                env.callMethod(
                                        controllerDef,
                                        "getMethodCalls",
                                        RemoveEmptyControllerArgumentLocatorsPass.class),
                                env,
                                true)) {
                    ZVal.list(
                            runtimeTempArrayResult199 = zpairResult1943.getValue(),
                            (method = listGet(runtimeTempArrayResult199, 0, env)));
                    if (ZVal.strictEqualityCheck(
                            0,
                            "===",
                            NamespaceGlobal.strcasecmp.env(env).call(action, method).value())) {
                        reason =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Removing method \"%s\" of service \"%s\" from controller candidates: the method is called at instantiation, thus cannot be an action.",
                                                action, id)
                                        .value();
                        break;
                    }
                }

                if (!ZVal.isTrue(reason)) {
                    controllers
                            .arrayAccess(env, toStringR(id, env) + ":" + toStringR(action, env))
                            .set(argumentRef);
                    if (ZVal.strictEqualityCheck("__invoke", "===", action)) {
                        controllers.arrayAccess(env, id).set(argumentRef);
                    }

                    continue;
                }
            }

            arrayActionR(ArrayAction.UNSET, controllers, env, controller);
            env.callMethod(
                    container,
                    "log",
                    RemoveEmptyControllerArgumentLocatorsPass.class,
                    this,
                    reason);
        }

        env.callMethod(
                controllerLocator,
                "replaceArgument",
                RemoveEmptyControllerArgumentLocatorsPass.class,
                0,
                controllers.getObject());
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\RemoveEmptyControllerArgumentLocatorsPass";

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
                    .setName(
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\RemoveEmptyControllerArgumentLocatorsPass")
                    .setLookup(
                            RemoveEmptyControllerArgumentLocatorsPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("controllerLocator")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/RemoveEmptyControllerArgumentLocatorsPass.php")
                    .addInterface("CompilerPassInterface")
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
