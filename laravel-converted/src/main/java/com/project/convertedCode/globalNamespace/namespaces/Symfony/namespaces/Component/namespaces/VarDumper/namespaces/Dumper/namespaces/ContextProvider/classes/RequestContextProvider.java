package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.namespaces.ContextProvider.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.VarCloner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.namespaces.ContextProvider.classes.ContextProviderInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/ContextProvider/RequestContextProvider.php

*/

public final class RequestContextProvider extends RuntimeClassBase
        implements ContextProviderInterface {

    public Object requestStack = null;

    public Object cloner = null;

    public RequestContextProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RequestContextProvider.class) {
            this.__construct(env, args);
        }
    }

    public RequestContextProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object requestStack = assignParameter(args, 0, false);
        this.requestStack = requestStack;
        this.cloner = new VarCloner(env);
        env.callMethod(this.cloner, "setMaxItems", RequestContextProvider.class, 0);
        return null;
    }

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args) {
        Object request = null;
        Object controller = null;
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                request =
                        env.callMethod(
                                this.requestStack,
                                "getCurrentRequest",
                                RequestContextProvider.class))) {
            return ZVal.assign(ZVal.getNull());
        }

        controller =
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("attributes").value(),
                        "get",
                        RequestContextProvider.class,
                        "_controller");
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "uri",
                                env.callMethod(request, "getUri", RequestContextProvider.class)),
                        new ZPair(
                                "method",
                                env.callMethod(request, "getMethod", RequestContextProvider.class)),
                        new ZPair(
                                "controller",
                                ZVal.isTrue(controller)
                                        ? env.callMethod(
                                                this.cloner,
                                                "cloneVar",
                                                RequestContextProvider.class,
                                                controller)
                                        : controller),
                        new ZPair(
                                "identifier",
                                NamespaceGlobal.spl_object_hash.env(env).call(request).value())));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\RequestContextProvider";

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
                            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\RequestContextProvider")
                    .setLookup(
                            RequestContextProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "requestStack")
                    .setFilename(
                            "vendor/symfony/var-dumper/Dumper/ContextProvider/RequestContextProvider.php")
                    .addInterface(
                            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\ContextProviderInterface")
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
