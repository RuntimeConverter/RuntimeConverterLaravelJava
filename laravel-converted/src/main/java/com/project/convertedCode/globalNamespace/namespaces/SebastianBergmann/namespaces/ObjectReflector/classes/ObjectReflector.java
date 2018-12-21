package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectReflector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.ObjectReflector.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/object-reflector/src/ObjectReflector.php

*/

public class ObjectReflector extends RuntimeClassBase {

    public ObjectReflector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ObjectReflector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    public Object getAttributes(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        ReferenceContainer name = new BasicReferenceContainer(null);
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object className = null;
        Object value = null;
        if (!function_is_object.f.env(env).call(_object).getBool()) {
            throw ZVal.getException(env, new InvalidArgumentException(env));
        }

        attributes.setObject(ZVal.newArray());
        className = function_get_class.f.env(env).call(_object).value();
        for (ZPair zpairResult1483 : ZVal.getIterable(rToArrayCast(_object), env, false)) {
            name.setObject(ZVal.assign(zpairResult1483.getKey()));
            value = ZVal.assign(zpairResult1483.getValue());
            name.setObject(
                    function_explode
                            .f
                            .env(env)
                            .call("\u0000", toStringR(name.getObject(), env))
                            .value());
            if (ZVal.strictEqualityCheck(
                    function_count.f.env(env).call(name.getObject()).value(), "===", 1)) {
                name.setObject(ZVal.assign(name.arrayGet(env, 0)));

            } else {
                if (ZVal.strictNotEqualityCheck(name.arrayGet(env, 1), "!==", className)) {
                    name.setObject(
                            toStringR(name.arrayGet(env, 1), env)
                                    + "::"
                                    + toStringR(name.arrayGet(env, 2), env));

                } else {
                    name.setObject(ZVal.assign(name.arrayGet(env, 2)));
                }
            }

            attributes.arrayAccess(env, name.getObject()).set(value);
        }

        return ZVal.assign(attributes.getObject());
    }

    public static final Object CONST_class = "SebastianBergmann\\ObjectReflector\\ObjectReflector";

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
                    .setName("SebastianBergmann\\ObjectReflector\\ObjectReflector")
                    .setLookup(
                            ObjectReflector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/object-reflector/src/ObjectReflector.php")
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
