package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.ControllerMetadata.classes.ArgumentMetadataFactory;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes.RequestAttributeValueResolver;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes.SessionValueResolver;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ArgumentResolverInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes.DefaultValueResolver;
import java.lang.Class;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes.RequestValueResolver;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.namespaces.ArgumentResolver.classes.VariadicValueResolver;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Controller/ArgumentResolver.php

*/

public final class ArgumentResolver extends RuntimeClassBase implements ArgumentResolverInterface {

    public Object argumentMetadataFactory = null;

    public Object argumentValueResolvers = null;

    public ArgumentResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgumentResolver.class) {
            this.__construct(env, args);
        }
    }

    public ArgumentResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "argumentMetadataFactory",
        typeHint =
                "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadataFactoryInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "argumentValueResolvers",
        typeHint = "iterable",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object argumentMetadataFactory = assignParameter(args, 0, true);
        if (null == argumentMetadataFactory) {
            argumentMetadataFactory = ZVal.getNull();
        }
        Object argumentValueResolvers = assignParameter(args, 1, true);
        if (null == argumentValueResolvers) {
            argumentValueResolvers = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        this.argumentMetadataFactory =
                ZVal.isTrue(ternaryExpressionTemp = argumentMetadataFactory)
                        ? ternaryExpressionTemp
                        : new ArgumentMetadataFactory(env);
        this.argumentValueResolvers =
                ZVal.isTrue(ternaryExpressionTemp = argumentValueResolvers)
                        ? ternaryExpressionTemp
                        : runtimeStaticObject.getDefaultArgumentValueResolvers(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "controller")
    public Object getArguments(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object request = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        Object resolver = null;
        Object metadata = null;
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        ReferenceContainer representative = new BasicReferenceContainer(null);
        Object append = null;
        Object resolved = null;
        arguments.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1904 :
                ZVal.getIterable(
                        env.callMethod(
                                this.argumentMetadataFactory,
                                "createArgumentMetadata",
                                ArgumentResolver.class,
                                controller),
                        env,
                        true)) {
            metadata = ZVal.assign(zpairResult1904.getValue());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1905 : ZVal.getIterable(this.argumentValueResolvers, env, true)) {
                resolver = ZVal.assign(zpairResult1905.getValue());
                if (!ZVal.isTrue(
                        env.callMethod(
                                resolver, "supports", ArgumentResolver.class, request, metadata))) {
                    continue;
                }

                resolved =
                        env.callMethod(
                                resolver, "resolve", ArgumentResolver.class, request, metadata);
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(resolved, (Class) null, "Generator", env))) {
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "%s::resolve() must yield at least one value.",
                                                    function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(resolver)
                                                            .value())
                                            .value()));
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1906 : ZVal.getIterable(resolved, env, true)) {
                    append = ZVal.assign(zpairResult1906.getValue());
                    arguments.arrayAppend(env).set(append);
                }

                runtimeConverterContinueCount = 2;
                runtimeConverterContinueCount--;
                continue;
            }

            representative.setObject(ZVal.assign(controller));
            if (function_is_array.f.env(env).call(representative.getObject()).getBool()) {
                representative.setObject(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s::%s()",
                                        function_get_class
                                                .f
                                                .env(env)
                                                .call(representative.arrayGet(env, 0))
                                                .value(),
                                        representative.arrayGet(env, 1))
                                .value());

            } else if (function_is_object.f.env(env).call(representative.getObject()).getBool()) {
                representative.setObject(
                        function_get_class.f.env(env).call(representative.getObject()).value());
            }

            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Controller \"%s\" requires that you provide a value for the \"$%s\" argument. Either the argument is nullable and no null value has been provided, no default value has been provided or because there is a non optional argument after this one.",
                                            representative.getObject(),
                                            env.callMethod(
                                                    metadata, "getName", ArgumentResolver.class))
                                    .value()));
        }

        return ZVal.assign(arguments.getObject());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getDefaultArgumentValueResolvers(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, new RequestAttributeValueResolver(env)),
                            new ZPair(1, new RequestValueResolver(env)),
                            new ZPair(2, new SessionValueResolver(env)),
                            new ZPair(3, new DefaultValueResolver(env)),
                            new ZPair(4, new VariadicValueResolver(env))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolver")
                    .setLookup(
                            ArgumentResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("argumentMetadataFactory", "argumentValueResolvers")
                    .setFilename("vendor/symfony/http-kernel/Controller/ArgumentResolver.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolverInterface")
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
