package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.namespaces.Rules.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/Rules/Dimensions.php

*/

public class Dimensions extends RuntimeClassBase {

    public Object constraints = ZVal.newArray();

    public Dimensions(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Dimensions.class) {
            this.__construct(env, args);
        }
    }

    public Dimensions(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "constraints",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object constraints = assignParameter(args, 0, true);
        if (null == constraints) {
            constraints = ZVal.newArray();
        }
        this.constraints = constraints;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object width(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "constraints", env).arrayAccess(env, "width").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object height(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "constraints", env).arrayAccess(env, "height").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object minWidth(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "constraints", env)
                .arrayAccess(env, "min_width")
                .set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object minHeight(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "constraints", env)
                .arrayAccess(env, "min_height")
                .set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object maxWidth(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "constraints", env)
                .arrayAccess(env, "max_width")
                .set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object maxHeight(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "constraints", env)
                .arrayAccess(env, "max_height")
                .set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object ratio(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "constraints", env).arrayAccess(env, "ratio").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object result = null;
        Object value = null;
        Object key = null;
        result = "";
        for (ZPair zpairResult620 : ZVal.getIterable(this.constraints, env, false)) {
            key = ZVal.assign(zpairResult620.getKey());
            value = ZVal.assign(zpairResult620.getValue());
            result =
                    toStringR(result, env)
                            + toStringR(
                                    toStringR(key, env) + "=" + toStringR(value, env) + ",", env);
        }

        return ZVal.assign(
                "dimensions:"
                        + toStringR(function_substr.f.env(env).call(result, 0, -1).value(), env));
    }

    public static final Object CONST_class = "Illuminate\\Validation\\Rules\\Dimensions";

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
                    .setName("Illuminate\\Validation\\Rules\\Dimensions")
                    .setLookup(
                            Dimensions.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("constraints")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/Rules/Dimensions.php")
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
