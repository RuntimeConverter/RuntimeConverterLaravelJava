package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes.Frame;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Exception/FrameCollection.php

*/

public class FrameCollection extends RuntimeClassBase
        implements ArrayAccess, IteratorAggregate, Serializable, Countable {

    public Object frames = null;

    public FrameCollection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FrameCollection.class) {
            this.__construct(env, args);
        }
    }

    public FrameCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frames", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops/Exception")
                        .setFile("/vendor/filp/whoops/src/Whoops/Exception/FrameCollection.php");
        Object frames = assignParameter(args, 0, false);
        this.frames =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Whoops\\Exception",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "frame")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object frame = assignParameter(args, 0, false);
                                        return ZVal.assign(new Frame(env, frame));
                                    }
                                },
                                frames)
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callable")
    public Object filter(RuntimeEnv env, Object... args) {
        Object callable = assignParameter(args, 0, false);
        this.frames =
                function_array_values
                        .f
                        .env(env)
                        .call(function_array_filter.f.env(env).call(this.frames, callable).value())
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callable")
    public Object map(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops/Exception")
                        .setFile("/vendor/filp/whoops/src/Whoops/Exception/FrameCollection.php");
        Object callable = assignParameter(args, 0, false);
        this.frames =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Whoops\\Exception",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "frame")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object frame = assignParameter(args, 0, false);
                                        Object callable = null;
                                        callable =
                                                this.contextReferences.getCapturedValue("callable");
                                        frame =
                                                function_call_user_func
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call(callable, frame)
                                                        .value();
                                        if (!ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        frame,
                                                        Frame.class,
                                                        "Whoops\\Exception\\Frame"))) {
                                            throw ZVal.getException(
                                                    env,
                                                    new UnexpectedValueException(
                                                            env,
                                                            "Callable to "
                                                                    + toStringR("", env)
                                                                    + " must return a Frame object"));
                                        }

                                        return ZVal.assign(frame);
                                    }
                                }.use("callable", callable),
                                this.frames)
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.frames);
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.frames));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "frames", env),
                        env,
                        offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(new ReferenceClassProperty(this, "frames", env).arrayGet(env, offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        throw ZVal.getException(
                env, new PHPException(env, toStringR("FrameCollection", env) + " is read only"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        throw ZVal.getException(
                env, new PHPException(env, toStringR("FrameCollection", env) + " is read only"));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.frames).value());
    }

    @ConvertedMethod
    public Object countIsApplication(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops/Exception")
                        .setFile("/vendor/filp/whoops/src/Whoops/Exception/FrameCollection.php");
        return ZVal.assign(
                function_count
                        .f
                        .env(env)
                        .call(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                this.frames,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Whoops\\Exception",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "f",
                                                        typeHint = "Whoops\\Exception\\Frame"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object f = assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                env.callMethod(
                                                                        f,
                                                                        "isApplication",
                                                                        FrameCollection.class));
                                                    }
                                                })
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_serialize.f.env(env).call(this.frames).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "serializedFrames")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object serializedFrames = assignParameter(args, 0, false);
        this.frames = function_unserialize.f.env(env).call(serializedFrames).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "frames", typeHint = "array")
    public Object prependFrames(RuntimeEnv env, Object... args) {
        Object frames = assignParameter(args, 0, false);
        this.frames = function_array_merge.f.env(env).call(frames, this.frames).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parentFrames",
        typeHint = "Whoops\\Exception\\FrameCollection"
    )
    public Object topDiff(RuntimeEnv env, Object... args) {
        ReferenceContainer parentFrames =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer p = new BasicReferenceContainer(null);
        Object tailFrame = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer diff = new BasicReferenceContainer(null);
        diff.setObject(ZVal.assign(this.frames));
        parentFrames.setObject(
                env.callMethod(parentFrames.getObject(), "getArray", FrameCollection.class));
        p.setObject(
                ZVal.subtract(function_count.f.env(env).call(parentFrames.getObject()).value(), 1));
        for (i.setObject(
                        ZVal.subtract(function_count.f.env(env).call(diff.getObject()).value(), 1));
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 0))
                        && ZVal.toBool(ZVal.isGreaterThanOrEqualTo(p.getObject(), ">=", 0));
                i.setObject(ZVal.decrement(i.getObject()))) {
            tailFrame = ZVal.assign(diff.arrayGet(env, i.getObject()));
            if (ZVal.isTrue(
                    env.callMethod(
                            tailFrame,
                            "equals",
                            FrameCollection.class,
                            parentFrames.arrayGet(env, p.getObject())))) {
                arrayActionR(ArrayAction.UNSET, diff, env, i.getObject());
            }

            p.setObject(ZVal.decrement(p.getObject()));
        }

        return ZVal.assign(diff.getObject());
    }

    public static final Object CONST_class = "Whoops\\Exception\\FrameCollection";

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
                    .setName("Whoops\\Exception\\FrameCollection")
                    .setLookup(
                            FrameCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("frames")
                    .setFilename("vendor/filp/whoops/src/Whoops/Exception/FrameCollection.php")
                    .addInterface("ArrayAccess")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Serializable")
                    .addInterface("Countable")
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
