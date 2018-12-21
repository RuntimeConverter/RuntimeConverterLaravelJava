package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/recursion-context/src/Context.php

*/

public final class Context extends RuntimeClassBase {

    public Object arrays = null;

    public Object objects = null;

    public Context(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Context.class) {
            this.__construct(env, args);
        }
    }

    public Context(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.arrays = ZVal.newArray();
        this.objects = new SplObjectStorage(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object add(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer value = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, value),
                            "addArray",
                            Context.class,
                            value.getObject()));

        } else if (function_is_object.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(this.addObject(env, value.getObject()));
        }

        throw ZVal.getException(
                env, new InvalidArgumentException(env, "Only arrays and objects are supported"));
    }

    public Object add(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object contains(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer value = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, value),
                            "containsArray",
                            Context.class,
                            value.getObject()));

        } else if (function_is_object.f.env(env).call(value.getObject()).getBool()) {
            return ZVal.assign(this.containsObject(env, value.getObject()));
        }

        throw ZVal.getException(
                env, new InvalidArgumentException(env, "Only arrays and objects are supported"));
    }

    public Object contains(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    private Object addArray(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer array = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object key = null;
        key =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, array),
                        "containsArray",
                        Context.class,
                        array.getObject());
        if (ZVal.strictNotEqualityCheck(key, "!==", false)) {
            return ZVal.assign(key);
        }

        key = function_count.f.env(env).call(this.arrays).value();
        new ReferenceClassProperty(this, "arrays", env).arrayAppend(env).set(array.getObject());
        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, array, env, 9223372036854775807L))
                && ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                array,
                                env,
                                ZVal.subtract(9223372036854775807L, 1)))) {
            array.arrayAppend(env).set(key);
            array.arrayAppend(env).set(this.objects);

        } else {
            do {
                key =
                        NamespaceGlobal.random_int
                                .env(env)
                                .call(-9223372036854775808L, 9223372036854775807L)
                                .value();

            } while (arrayActionR(ArrayAction.ISSET, array, env, key));

            array.arrayAccess(env, key).set(key);
            do {
                key =
                        NamespaceGlobal.random_int
                                .env(env)
                                .call(-9223372036854775808L, 9223372036854775807L)
                                .value();

            } while (arrayActionR(ArrayAction.ISSET, array, env, key));

            array.arrayAccess(env, key).set(this.objects);
        }

        return ZVal.assign(key);
    }

    public Object addArray(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    private Object addObject(RuntimeEnv env, Object... args) {
        ReferenceContainer _object = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (!ZVal.isTrue(
                env.callMethod(
                        this.objects,
                        new RuntimeArgsWithReferences().add(0, _object),
                        "contains",
                        Context.class,
                        _object.getObject()))) {
            env.callMethod(this.objects, "attach", Context.class, _object.getObject());
        }

        return ZVal.assign(
                NamespaceGlobal.spl_object_hash.env(env).call(_object.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    private Object containsArray(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer array = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer end = new BasicReferenceContainer(null);
        end.setObject(function_array_slice.f.env(env).call(array.getObject(), -2).value());
        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, end, env, 1))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                end.arrayGet(env, 1), "===", this.objects))
                        ? end.arrayGet(env, 0)
                        : false);
    }

    public Object containsArray(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object containsObject(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.isTrue(
                env.callMethod(
                        this.objects,
                        new RuntimeArgsWithReferences().add(0, value),
                        "contains",
                        Context.class,
                        value.getObject()))) {
            return ZVal.assign(
                    NamespaceGlobal.spl_object_hash.env(env).call(value.getObject()).value());
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        ReferenceContainer array = new BasicReferenceContainer(null);
        for (ZPair zpairResult1484 : ZVal.getIterable(this.arrays, env, true)) {
            array = zpairResult1484;
            if (function_is_array.f.env(env).call(array.getObject()).getBool()) {
                function_array_pop.f.env(env).call(array.getObject());
                function_array_pop.f.env(env).call(array.getObject());
            }
        }

        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\RecursionContext\\Context";

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
                    .setName("SebastianBergmann\\RecursionContext\\Context")
                    .setLookup(
                            Context.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("arrays", "objects")
                    .setFilename("vendor/sebastian/recursion-context/src/Context.php")
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
