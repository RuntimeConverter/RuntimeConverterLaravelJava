package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionParameter;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Reflection/ReflectionLanguageConstructParameter.php

*/

public class ReflectionLanguageConstructParameter extends ReflectionParameter {

    public Object function = null;

    public Object parameter = null;

    public Object opts = null;

    public ReflectionLanguageConstructParameter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReflectionLanguageConstructParameter.class) {
            this.__construct(env, args);
        }
    }

    public ReflectionLanguageConstructParameter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "function")
    @ConvertedParameter(index = 1, name = "parameter")
    @ConvertedParameter(index = 2, name = "opts", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object function = assignParameter(args, 0, false);
        Object parameter = assignParameter(args, 1, false);
        Object opts = assignParameter(args, 2, false);
        this.function = function;
        this.parameter = parameter;
        this.opts = opts;
        return null;
    }

    @ConvertedMethod
    public Object getClass(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object isArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(function_array_key_exists.f.env(env).call("isArray", this.opts).value())
                        && ZVal.toBool(
                                new ReferenceClassProperty(this, "opts", env)
                                        .arrayGet(env, "isArray")));
    }

    @ConvertedMethod
    public Object getDefaultValue(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isDefaultValueAvailable(env))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "opts", env).arrayGet(env, "defaultValue"));
        }

        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parameter);
    }

    @ConvertedMethod
    public Object isOptional(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                function_array_key_exists
                                        .f
                                        .env(env)
                                        .call("isOptional", this.opts)
                                        .value())
                        && ZVal.toBool(
                                new ReferenceClassProperty(this, "opts", env)
                                        .arrayGet(env, "isOptional")));
    }

    @ConvertedMethod
    public Object isDefaultValueAvailable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_key_exists.f.env(env).call("defaultValue", this.opts).value());
    }

    @ConvertedMethod
    public Object isPassedByReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                function_array_key_exists
                                        .f
                                        .env(env)
                                        .call("isPassedByReference", this.opts)
                                        .value())
                        && ZVal.toBool(
                                new ReferenceClassProperty(this, "opts", env)
                                        .arrayGet(env, "isPassedByReference")));
    }

    public static final Object CONST_class =
            "Psy\\Reflection\\ReflectionLanguageConstructParameter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ReflectionParameter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Reflection\\ReflectionLanguageConstructParameter")
                    .setLookup(
                            ReflectionLanguageConstructParameter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("function", "opts", "parameter")
                    .setFilename(
                            "vendor/psy/psysh/src/Reflection/ReflectionLanguageConstructParameter.php")
                    .addInterface("Reflector")
                    .addExtendsClass("ReflectionParameter")
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
