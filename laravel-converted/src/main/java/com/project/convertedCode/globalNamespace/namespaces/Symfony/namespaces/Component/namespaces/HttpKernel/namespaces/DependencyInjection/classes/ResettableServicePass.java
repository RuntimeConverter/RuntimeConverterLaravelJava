package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/ResettableServicePass.php

*/

public class ResettableServicePass extends RuntimeClassBase {

    public Object tagName = null;

    public ResettableServicePass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResettableServicePass.class) {
            this.__construct(env, args);
        }
    }

    public ResettableServicePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tagName", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tagName = assignParameter(args, 0, true);
        if (null == tagName) {
            tagName = "kernel.reset";
        }
        this.tagName = tagName;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        ReferenceContainer methods = new BasicReferenceContainer(null);
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        ReferenceContainer services = new BasicReferenceContainer(null);
        Object id = null;
        ReferenceContainer tags = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(
                env.callMethod(
                        container, "has", ResettableServicePass.class, "services_resetter"))) {
            return null;
        }

        services.setObject(ZVal.assign(methods.setObject(ZVal.newArray())));
        for (ZPair zpairResult1944 :
                ZVal.getIterable(
                        env.callMethod(
                                container,
                                "findTaggedServiceIds",
                                ResettableServicePass.class,
                                this.tagName,
                                true),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult1944.getKey());
            tags.setObject(ZVal.assign(zpairResult1944.getValue()));
            services.arrayAccess(env, id)
                    .set(
                            env.createNew(
                                    ZVal.resolveClassAlias(env, "Reference"),
                                    id,
                                    ClassConstantUtils.getConstantValueByClass(
                                            env,
                                            ZVal.resolveClassAlias(env, "ContainerInterface"),
                                            "IGNORE_ON_UNINITIALIZED_REFERENCE")));
            attributes.setObject(ZVal.assign(tags.arrayGet(env, 0)));
            if (!arrayActionR(ArrayAction.ISSET, attributes, env, "method")) {
                throw ZVal.getException(
                        env,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "RuntimeException"),
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Tag %s requires the \"method\" attribute to be set.",
                                                this.tagName)
                                        .value()));
            }

            methods.arrayAccess(env, id).set(attributes.arrayGet(env, "method"));
        }

        if (ZVal.isEmpty(services.getObject())) {
            env.callMethod(
                    container, "removeAlias", ResettableServicePass.class, "services_resetter");
            env.callMethod(
                    container,
                    "removeDefinition",
                    ResettableServicePass.class,
                    "services_resetter");
            return null;
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                container,
                                "findDefinition",
                                ResettableServicePass.class,
                                "services_resetter"),
                        "setArgument",
                        ResettableServicePass.class,
                        0,
                        env.createNew(
                                ZVal.resolveClassAlias(env, "IteratorArgument"),
                                services.getObject())),
                "setArgument",
                ResettableServicePass.class,
                1,
                methods.getObject());
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\ResettableServicePass";

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
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\ResettableServicePass")
                    .setLookup(
                            ResettableServicePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("tagName")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/ResettableServicePass.php")
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
