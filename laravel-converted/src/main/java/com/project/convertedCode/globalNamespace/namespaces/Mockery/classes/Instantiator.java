package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

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
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Instantiator.php

*/

public final class Instantiator extends RuntimeClassBase {

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
        Object instance = null;
        factory = this.buildFactory(env, className);
        instance = env.callFunctionDynamic(factory, new RuntimeArgsWithReferences()).value();
        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object buildFactory(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery")
                        .setFile("/vendor/mockery/mockery/library/Mockery/Instantiator.php");
        Object className = assignParameter(args, 0, false);
        Object serializedString = null;
        Object reflectionClass = null;
        reflectionClass = this.getReflectionClass(env, className);
        if (ZVal.isTrue(this.isInstantiableViaReflection(env, reflectionClass))) {
            return ZVal.assign(
                    new Closure(env, runtimeConverterFunctionClassConstants, "Mockery", this) {
                        @Override
                        @ConvertedMethod
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object reflectionClass = null;
                            reflectionClass =
                                    this.contextReferences.getCapturedValue("reflectionClass");
                            return ZVal.assign(
                                    env.callMethod(
                                            reflectionClass,
                                            "newInstanceWithoutConstructor",
                                            Instantiator.class));
                        }
                    }.use("reflectionClass", reflectionClass));
        }

        serializedString =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s:%d:\"%s\":0:{}",
                                this.getSerializationFormat(env, reflectionClass),
                                function_strlen.f.env(env).call(className).value(),
                                className)
                        .value();
        this.attemptInstantiationViaUnSerialization(env, reflectionClass, serializedString);
        return ZVal.assign(
                new Closure(env, runtimeConverterFunctionClassConstants, "Mockery", this) {
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
                    new InvalidArgumentException(
                            env, "Class:" + toStringR(className, env) + " does not exist"));
        }

        reflection = new ReflectionClass(env, className);
        if (ZVal.isTrue(env.callMethod(reflection, "isAbstract", Instantiator.class))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Class:" + toStringR(className, env) + " is an abstract class"));
        }

        return ZVal.assign(reflection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    @ConvertedParameter(index = 1, name = "serializedString")
    private Object attemptInstantiationViaUnSerialization(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery")
                        .setFile("/vendor/mockery/mockery/library/Mockery/Instantiator.php");
        Object reflectionClass = assignParameter(args, 0, false);
        Object serializedString = assignParameter(args, 1, false);
        Object exception = null;
        ReferenceContainer error = new BasicReferenceContainer(null);
        function_set_error_handler
                .f
                .env(env)
                .call(
                        new Closure(env, runtimeConverterFunctionClassConstants, "Mockery", this) {
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
                                Object msg = null;
                                Object reflectionClass = null;
                                ReferenceContainer error = new BasicReferenceContainer(null);
                                reflectionClass =
                                        this.contextReferences.getCapturedValue("reflectionClass");
                                error = this.contextReferences.getReferenceContainer("error");
                                msg =
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Could not produce an instance of \"%s\" via un-serialization, since an error was triggered in file \"%s\" at line \"%d\"",
                                                        env.callMethod(
                                                                reflectionClass,
                                                                "getName",
                                                                Instantiator.class),
                                                        file,
                                                        line)
                                                .value();
                                error.setObject(
                                        new UnexpectedValueException(
                                                env, msg, 0, new PHPException(env, message, code)));
                                return null;
                            }
                        }.useRef("error", error).use("reflectionClass", reflectionClass));
        try {
            function_unserialize.f.env(env).call(serializedString);
        } catch (ConvertedException convertedException84) {
            if (convertedException84.instanceOf(PHPException.class, "Exception")) {
                exception = convertedException84.getObject();
                function_restore_error_handler.f.env(env).call();
                throw ZVal.getException(
                        env,
                        new UnexpectedValueException(
                                env,
                                "An exception was raised while trying to instantiate an instance of \""
                                        + toStringR(
                                                env.callMethod(
                                                        reflectionClass,
                                                        "getName",
                                                        Instantiator.class),
                                                env)
                                        + "\" via un-serialization",
                                0,
                                exception));
            } else {
                throw convertedException84;
            }
        }

        function_restore_error_handler.f.env(env).call();
        if (ZVal.isTrue(error.getObject())) {
            throw ZVal.getException(env, error.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    private Object isInstantiableViaReflection(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, false);
        return ZVal.assign(
                !ZVal.toBool(env.callMethod(reflectionClass, "isInternal", Instantiator.class))
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
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    private Object getSerializationFormat(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, false);
        if (ZVal.toBool(this.isPhpVersionWithBrokenSerializationFormat(env))
                && ZVal.toBool(
                        env.callMethod(
                                reflectionClass,
                                "implementsInterface",
                                Instantiator.class,
                                "Serializable"))) {
            return ZVal.assign(CONST_SERIALIZATION_FORMAT_USE_UNSERIALIZER);
        }

        return ZVal.assign(CONST_SERIALIZATION_FORMAT_AVOID_UNSERIALIZER);
    }

    @ConvertedMethod
    private Object isPhpVersionWithBrokenSerializationFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck(70211, "===", 50429))
                        || ZVal.toBool(ZVal.strictEqualityCheck(70211, "===", 50513)));
    }

    public static final Object CONST_SERIALIZATION_FORMAT_USE_UNSERIALIZER = "C";

    public static final Object CONST_SERIALIZATION_FORMAT_AVOID_UNSERIALIZER = "O";

    public static final Object CONST_class = "Mockery\\Instantiator";

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
                    .setName("Mockery\\Instantiator")
                    .setLookup(
                            Instantiator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/mockery/mockery/library/Mockery/Instantiator.php")
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
