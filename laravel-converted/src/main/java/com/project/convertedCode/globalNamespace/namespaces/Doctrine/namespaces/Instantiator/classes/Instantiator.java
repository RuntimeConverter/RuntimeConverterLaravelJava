package com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.classes.InstantiatorInterface;
import com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Instantiator.namespaces.Exception.classes.UnexpectedValueException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/doctrine/instantiator/src/Doctrine/Instantiator/Instantiator.php

*/

public final class Instantiator extends RuntimeClassBase implements InstantiatorInterface {

    public Instantiator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Instantiator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object instantiate(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object factory = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Doctrine
                                .namespaces
                                .Instantiator
                                .classes
                                .Instantiator
                                .RequestStaticProperties
                                .class,
                        "cachedCloneables"),
                env,
                className)) {
            return ZVal.assign(
                    ((RuntimeClassInterface)
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Doctrine
                                                            .namespaces
                                                            .Instantiator
                                                            .classes
                                                            .Instantiator
                                                            .RequestStaticProperties
                                                            .class,
                                                    "cachedCloneables")
                                            .arrayGet(env, className))
                            .phpClone(env));
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Doctrine
                                .namespaces
                                .Instantiator
                                .classes
                                .Instantiator
                                .RequestStaticProperties
                                .class,
                        "cachedInstantiators"),
                env,
                className)) {
            factory =
                    ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Doctrine
                                                    .namespaces
                                                    .Instantiator
                                                    .classes
                                                    .Instantiator
                                                    .RequestStaticProperties
                                                    .class,
                                            "cachedInstantiators")
                                    .arrayGet(env, className));
            return ZVal.assign(
                    env.callFunctionDynamic(factory, new RuntimeArgsWithReferences()).value());
        }

        return ZVal.assign(this.buildAndCacheFromFactory(env, className));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    private Object buildAndCacheFromFactory(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object factory = null;
        Object instance = null;
        factory =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Doctrine
                                                .namespaces
                                                .Instantiator
                                                .classes
                                                .Instantiator
                                                .RequestStaticProperties
                                                .class,
                                        "cachedInstantiators")
                                .arrayAccess(env, className)
                                .set(this.buildFactory(env, className)));
        instance = env.callFunctionDynamic(factory, new RuntimeArgsWithReferences()).value();
        if (ZVal.isTrue(this.isSafeToClone(env, new ReflectionClass(env, instance)))) {
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Doctrine
                                    .namespaces
                                    .Instantiator
                                    .classes
                                    .Instantiator
                                    .RequestStaticProperties
                                    .class,
                            "cachedCloneables")
                    .arrayAccess(env, className)
                    .set(((RuntimeClassInterface) instance).phpClone(env));
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className", typeHint = "string")
    private Object buildFactory(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/doctrine/instantiator/src/Doctrine/Instantiator")
                        .setFile(
                                "/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Instantiator.php");
        Object className = assignParameter(args, 0, false);
        Object serializedString = null;
        Object reflectionClass = null;
        reflectionClass = this.getReflectionClass(env, className);
        if (ZVal.isTrue(this.isInstantiableViaReflection(env, reflectionClass))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, reflectionClass),
                            new ZPair(1, "newInstanceWithoutConstructor")));
        }

        serializedString =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s:%d:\"%s\":0:{}",
                                CONST_SERIALIZATION_FORMAT_AVOID_UNSERIALIZER,
                                function_strlen.f.env(env).call(className).value(),
                                className)
                        .value();
        this.checkIfUnSerializationIsSupported(env, reflectionClass, serializedString);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Doctrine\\Instantiator",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object serializedString = null;
                        serializedString =
                                this.contextReferences.getCapturedValue("serializedString");
                        return ZVal.assign(
                                function_unserialize.f.env(env).call(serializedString).value());
                    }
                }.use("serializedString", serializedString));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    private Object getReflectionClass(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object reflection = null;
        if (!function_class_exists.f.env(env).call(className).getBool()) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentException.runtimeStaticObject.fromNonExistingClass(
                            env, className));
        }

        reflection = new ReflectionClass(env, className);
        if (ZVal.isTrue(env.callMethod(reflection, "isAbstract", Instantiator.class))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentException.runtimeStaticObject.fromAbstractClass(
                            env, reflection));
        }

        return ZVal.assign(reflection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "serializedString")
    private Object checkIfUnSerializationIsSupported(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/doctrine/instantiator/src/Doctrine/Instantiator")
                        .setFile(
                                "/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Instantiator.php");
        Object reflectionClass = assignParameter(args, 0, false);
        Object serializedString = assignParameter(args, 1, false);
        ReferenceContainer error = new BasicReferenceContainer(null);
        function_set_error_handler
                .f
                .env(env)
                .call(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Doctrine\\Instantiator",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "code")
                            @ConvertedParameter(index = 1, name = "message")
                            @ConvertedParameter(index = 2, name = "file")
                            @ConvertedParameter(index = 3, name = "line")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object code = assignParameter(args, 0, false);
                                Object message = assignParameter(args, 1, false);
                                Object file = assignParameter(args, 2, false);
                                Object line = assignParameter(args, 3, false);
                                Object reflectionClass = null;
                                ReferenceContainer error = new BasicReferenceContainer(null);
                                reflectionClass =
                                        this.contextReferences.getCapturedValue("reflectionClass");
                                error = this.contextReferences.getReferenceContainer("error");
                                error.setObject(
                                        UnexpectedValueException.runtimeStaticObject
                                                .fromUncleanUnSerialization(
                                                        env,
                                                        reflectionClass,
                                                        message,
                                                        code,
                                                        file,
                                                        line));
                                return null;
                            }
                        }.useRef("error", error).use("reflectionClass", reflectionClass));
        this.attemptInstantiationViaUnSerialization(env, reflectionClass, serializedString);
        function_restore_error_handler.f.env(env).call();
        if (ZVal.isTrue(error.getObject())) {
            throw ZVal.getException(env, error.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "serializedString")
    private Object attemptInstantiationViaUnSerialization(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, false);
        Object serializedString = assignParameter(args, 1, false);
        Object exception = null;
        try {
            function_unserialize.f.env(env).call(serializedString);
        } catch (ConvertedException convertedException2) {
            if (convertedException2.instanceOf(PHPException.class, "Exception")) {
                exception = convertedException2.getObject();
                function_restore_error_handler.f.env(env).call();
                throw ZVal.getException(
                        env,
                        UnexpectedValueException.runtimeStaticObject
                                .fromSerializationTriggeredException(
                                        env, reflectionClass, exception));
            } else {
                throw convertedException2;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    private Object isInstantiableViaReflection(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, false);
        return ZVal.assign(
                !ZVal.toBool(this.hasInternalAncestors(env, reflectionClass))
                        && ZVal.toBool(
                                env.callMethod(reflectionClass, "isFinal", Instantiator.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    private Object hasInternalAncestors(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, false);
        do {
            if (ZVal.isTrue(env.callMethod(reflectionClass, "isInternal", Instantiator.class))) {
                return ZVal.assign(true);
            }

        } while (ZVal.isTrue(
                reflectionClass =
                        env.callMethod(reflectionClass, "getParentClass", Instantiator.class)));

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflection", typeHint = "ReflectionClass")
    private Object isSafeToClone(RuntimeEnv env, Object... args) {
        Object reflection = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(env.callMethod(reflection, "isCloneable", Instantiator.class))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                reflection,
                                                "hasMethod",
                                                Instantiator.class,
                                                "__clone"))));
    }

    public static final Object CONST_SERIALIZATION_FORMAT_USE_UNSERIALIZER = "C";

    public static final Object CONST_SERIALIZATION_FORMAT_AVOID_UNSERIALIZER = "O";

    public static final Object CONST_class = "Doctrine\\Instantiator\\Instantiator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cachedInstantiators = ZVal.newArray();

        public Object cachedCloneables = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Doctrine\\Instantiator\\Instantiator")
                    .setLookup(
                            Instantiator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("cachedCloneables", "cachedInstantiators")
                    .setFilename(
                            "vendor/doctrine/instantiator/src/Doctrine/Instantiator/Instantiator.php")
                    .addInterface("Doctrine\\Instantiator\\InstantiatorInterface")
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
