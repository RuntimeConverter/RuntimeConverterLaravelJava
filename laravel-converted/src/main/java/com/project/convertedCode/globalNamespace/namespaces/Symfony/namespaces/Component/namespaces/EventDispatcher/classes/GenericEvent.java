package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.EventDispatcher.classes.Event;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/event-dispatcher/GenericEvent.php

*/

public class GenericEvent extends Event implements ArrayAccess, IteratorAggregate {

    public Object subject = null;

    public Object arguments = null;

    public GenericEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GenericEvent.class) {
            this.__construct(env, args);
        }
    }

    public GenericEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subject",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object subject = assignParameter(args, 0, true);
        if (null == subject) {
            subject = ZVal.getNull();
        }
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        this.subject = subject;
        this.arguments = arguments;
        return null;
    }

    @ConvertedMethod
    public Object getSubject(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.subject);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getArgument(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.hasArgument(env, key))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "arguments", env).arrayGet(env, key));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call("Argument \"%s\" not found.", key)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object setArgument(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "arguments", env).arrayAccess(env, key).set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.arguments);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "args",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object setArguments(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, true);
        if (null == ___args) {
            ___args = ZVal.newArray();
        }
        this.arguments = ___args;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasArgument(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(key, this.arguments).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.getArgument(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.setArgument(env, key, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.hasArgument(env, key))) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "arguments", env),
                    env,
                    key);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.hasArgument(env, key));
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.arguments));
    }

    public static final Object CONST_class = "Symfony\\Component\\EventDispatcher\\GenericEvent";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Event.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\EventDispatcher\\GenericEvent")
                    .setLookup(
                            GenericEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("arguments", "propagationStopped", "subject")
                    .setFilename("vendor/symfony/event-dispatcher/GenericEvent.php")
                    .addInterface("ArrayAccess")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addExtendsClass("Symfony\\Component\\EventDispatcher\\Event")
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
