package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.ControllerMetadata.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.ControllerMetadata.classes.ArgumentMetadataFactoryInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.ControllerMetadata.classes.ArgumentMetadata;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/ControllerMetadata/ArgumentMetadataFactory.php

*/

public final class ArgumentMetadataFactory extends RuntimeClassBase
        implements ArgumentMetadataFactoryInterface {

    public ArgumentMetadataFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ArgumentMetadataFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller")
    public Object createArgumentMetadata(RuntimeEnv env, Object... args) {
        ReferenceContainer controller =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object reflection = null;
        Object param = null;
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        arguments.setObject(ZVal.newArray());
        if (function_is_array.f.env(env).call(controller.getObject()).getBool()) {
            reflection =
                    new ReflectionMethod(
                            env, controller.arrayGet(env, 0), controller.arrayGet(env, 1));

        } else if (ZVal.toBool(function_is_object.f.env(env).call(controller.getObject()).value())
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        controller.getObject(), Closure.class, "Closure")))) {
            reflection =
                    env.callMethod(
                            new ReflectionObject(env, controller.getObject()),
                            "getMethod",
                            ArgumentMetadataFactory.class,
                            "__invoke");

        } else {
            reflection = new ReflectionFunction(env, controller.getObject());
        }

        for (ZPair zpairResult1909 :
                ZVal.getIterable(
                        env.callMethod(reflection, "getParameters", ArgumentMetadataFactory.class),
                        env,
                        true)) {
            param = ZVal.assign(zpairResult1909.getValue());
            arguments
                    .arrayAppend(env)
                    .set(
                            new ArgumentMetadata(
                                    env,
                                    env.callMethod(param, "getName", ArgumentMetadataFactory.class),
                                    this.getType(env, param, reflection),
                                    env.callMethod(
                                            param, "isVariadic", ArgumentMetadataFactory.class),
                                    env.callMethod(
                                            param,
                                            "isDefaultValueAvailable",
                                            ArgumentMetadataFactory.class),
                                    ZVal.isTrue(
                                                    env.callMethod(
                                                            param,
                                                            "isDefaultValueAvailable",
                                                            ArgumentMetadataFactory.class))
                                            ? env.callMethod(
                                                    param,
                                                    "getDefaultValue",
                                                    ArgumentMetadataFactory.class)
                                            : ZVal.getNull(),
                                    env.callMethod(
                                            param, "allowsNull", ArgumentMetadataFactory.class)));
        }

        return ZVal.assign(arguments.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    @ConvertedParameter(index = 1, name = "function", typeHint = "ReflectionFunctionAbstract")
    private Object getType(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        Object lcName = null;
        Object parent = null;
        Object name = null;
        Object type = null;
        if (!ZVal.isTrue(
                type = env.callMethod(parameter, "getType", ArgumentMetadataFactory.class))) {
            return null;
        }

        name = env.callMethod(type, "getName", ArgumentMetadataFactory.class);
        lcName = NamespaceGlobal.strtolower.env(env).call(name).value();
        if (ZVal.toBool(ZVal.strictNotEqualityCheck("self", "!==", lcName))
                && ZVal.toBool(ZVal.strictNotEqualityCheck("parent", "!==", lcName))) {
            return ZVal.assign(name);
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(function, ReflectionMethod.class, "ReflectionMethod"))) {
            return null;
        }

        if (ZVal.strictEqualityCheck("self", "===", lcName)) {
            return ZVal.assign(
                    toObjectR(
                                    env.callMethod(
                                            function,
                                            "getDeclaringClass",
                                            ArgumentMetadataFactory.class))
                            .accessProp(this, env)
                            .name("name")
                            .value());
        }

        if (ZVal.isTrue(
                parent =
                        env.callMethod(
                                env.callMethod(
                                        function,
                                        "getDeclaringClass",
                                        ArgumentMetadataFactory.class),
                                "getParentClass",
                                ArgumentMetadataFactory.class))) {
            return ZVal.assign(toObjectR(parent).accessProp(this, env).name("name").value());
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadataFactory";

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
                            "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadataFactory")
                    .setLookup(
                            ArgumentMetadataFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/http-kernel/ControllerMetadata/ArgumentMetadataFactory.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadataFactoryInterface")
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
