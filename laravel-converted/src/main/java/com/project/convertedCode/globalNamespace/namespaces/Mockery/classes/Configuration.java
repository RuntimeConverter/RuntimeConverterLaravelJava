package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Configuration.php

*/

public class Configuration extends RuntimeClassBase {

    public Object _allowMockingNonExistentMethod = true;

    public Object _allowMockingMethodsUnnecessarily = true;

    public Object _internalClassParamMap = ZVal.newArray();

    public Object _constantsMap = ZVal.newArray();

    public Object _reflectionCacheEnabled = true;

    public Configuration(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Configuration(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "flag",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object allowMockingNonExistentMethods(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, true);
        if (null == flag) {
            flag = true;
        }
        this._allowMockingNonExistentMethod = ZVal.toBool(flag);
        return null;
    }

    @ConvertedMethod
    public Object mockingNonExistentMethodsAllowed(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._allowMockingNonExistentMethod);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "flag",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object allowMockingMethodsUnnecessarily(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, true);
        if (null == flag) {
            flag = true;
        }
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "The %s method is deprecated and will be removed in a future version of Mockery",
                                        "Configuration::allowMockingMethodsUnnecessarily")
                                .value(),
                        16384);
        this._allowMockingMethodsUnnecessarily = ZVal.toBool(flag);
        return null;
    }

    @ConvertedMethod
    public Object mockingMethodsUnnecessarilyAllowed(RuntimeEnv env, Object... args) {
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "The %s method is deprecated and will be removed in a future version of Mockery",
                                        "Configuration::mockingMethodsUnnecessarilyAllowed")
                                .value(),
                        16384);
        return ZVal.assign(this._allowMockingMethodsUnnecessarily);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "method")
    @ConvertedParameter(index = 2, name = "map", typeHint = "array")
    public Object setInternalClassMethodParamMap(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object map = assignParameter(args, 2, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "_internalClassParamMap", env),
                env,
                NamespaceGlobal.strtolower.env(env).call(_pClass).value())) {
            new ReferenceClassProperty(this, "_internalClassParamMap", env)
                    .arrayAccess(env, NamespaceGlobal.strtolower.env(env).call(_pClass).value())
                    .set(ZVal.newArray());
        }

        new ReferenceClassProperty(this, "_internalClassParamMap", env)
                .arrayAccess(
                        env,
                        NamespaceGlobal.strtolower.env(env).call(_pClass).value(),
                        NamespaceGlobal.strtolower.env(env).call(method).value())
                .set(map);
        return null;
    }

    @ConvertedMethod
    public Object resetInternalClassMethodParamMaps(RuntimeEnv env, Object... args) {
        this._internalClassParamMap = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "method")
    public Object getInternalClassMethodParamMap(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "_internalClassParamMap", env),
                env,
                NamespaceGlobal.strtolower.env(env).call(_pClass).value(),
                NamespaceGlobal.strtolower.env(env).call(method).value())) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "_internalClassParamMap", env)
                            .arrayGet(
                                    env,
                                    NamespaceGlobal.strtolower.env(env).call(_pClass).value(),
                                    NamespaceGlobal.strtolower.env(env).call(method).value()));
        }

        return null;
    }

    @ConvertedMethod
    public Object getInternalClassMethodParamMaps(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._internalClassParamMap);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "map", typeHint = "array")
    public Object setConstantsMap(RuntimeEnv env, Object... args) {
        Object map = assignParameter(args, 0, false);
        this._constantsMap = map;
        return null;
    }

    @ConvertedMethod
    public Object getConstantsMap(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._constantsMap);
    }

    @ConvertedMethod
    public Object disableReflectionCache(RuntimeEnv env, Object... args) {
        this._reflectionCacheEnabled = false;
        return null;
    }

    @ConvertedMethod
    public Object enableReflectionCache(RuntimeEnv env, Object... args) {
        this._reflectionCacheEnabled = true;
        return null;
    }

    @ConvertedMethod
    public Object reflectionCacheEnabled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._reflectionCacheEnabled);
    }

    public static final Object CONST_class = "Mockery\\Configuration";

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
                    .setName("Mockery\\Configuration")
                    .setLookup(
                            Configuration.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_allowMockingMethodsUnnecessarily",
                            "_allowMockingNonExistentMethod",
                            "_constantsMap",
                            "_internalClassParamMap",
                            "_reflectionCacheEnabled")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Configuration.php")
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
