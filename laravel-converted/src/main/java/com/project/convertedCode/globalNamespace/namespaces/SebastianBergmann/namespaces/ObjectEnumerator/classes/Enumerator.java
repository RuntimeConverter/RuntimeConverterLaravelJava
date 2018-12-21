package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectEnumerator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes.Context;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectReflector.classes.ObjectReflector;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectEnumerator.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/object-enumerator/src/Enumerator.php

*/

public class Enumerator extends RuntimeClassBase {

    public Enumerator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Enumerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variable")
    public Object enumerate(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer variable = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object processed = null;
        Object array = null;
        Object reflector = null;
        ReferenceContainer objects = new BasicReferenceContainer(null);
        Object value = null;
        Object element = null;
        if (ZVal.toBool(!function_is_array.f.env(env).call(variable.getObject()).getBool())
                && ZVal.toBool(
                        !function_is_object.f.env(env).call(variable.getObject()).getBool())) {
            throw ZVal.getException(env, new InvalidArgumentException(env));
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                handleReturnReference(
                        function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value()),
                env,
                1)) {
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            handleReturnReference(
                                            function_func_get_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value())
                                    .arrayGet(env, 1),
                            Context.class,
                            "SebastianBergmann\\RecursionContext\\Context"))) {
                throw ZVal.getException(env, new InvalidArgumentException(env));
            }

            processed =
                    ZVal.assign(
                            handleReturnReference(
                                            function_func_get_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value())
                                    .arrayGet(env, 1));

        } else {
            processed = new Context(env);
        }

        objects.setObject(ZVal.newArray());
        if (ZVal.isTrue(
                env.callMethod(
                        processed,
                        new RuntimeArgsWithReferences().add(0, variable),
                        "contains",
                        Enumerator.class,
                        variable.getObject()))) {
            return ZVal.assign(objects.getObject());
        }

        array = ZVal.assign(variable.getObject());
        env.callMethod(
                processed,
                new RuntimeArgsWithReferences().add(0, variable),
                "add",
                Enumerator.class,
                variable.getObject());
        if (function_is_array.f.env(env).call(variable.getObject()).getBool()) {
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1481 : ZVal.getIterable(array, env, true)) {
                element = ZVal.assign(zpairResult1481.getValue());
                if (ZVal.toBool(!function_is_array.f.env(env).call(element).getBool())
                        && ZVal.toBool(!function_is_object.f.env(env).call(element).getBool())) {
                    continue;
                }

                objects.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(objects.getObject(), this.enumerate(env, element, processed))
                                .value());
            }

        } else {
            objects.arrayAppend(env).set(variable.getObject());
            reflector = new ObjectReflector(env);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1482 :
                    ZVal.getIterable(
                            env.callMethod(
                                    reflector,
                                    "getAttributes",
                                    Enumerator.class,
                                    variable.getObject()),
                            env,
                            true)) {
                value = ZVal.assign(zpairResult1482.getValue());
                if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                        && ZVal.toBool(!function_is_object.f.env(env).call(value).getBool())) {
                    continue;
                }

                objects.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(objects.getObject(), this.enumerate(env, value, processed))
                                .value());
            }
        }

        return ZVal.assign(objects.getObject());
    }

    public static final Object CONST_class = "SebastianBergmann\\ObjectEnumerator\\Enumerator";

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
                    .setName("SebastianBergmann\\ObjectEnumerator\\Enumerator")
                    .setLookup(
                            Enumerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/object-enumerator/src/Enumerator.php")
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
