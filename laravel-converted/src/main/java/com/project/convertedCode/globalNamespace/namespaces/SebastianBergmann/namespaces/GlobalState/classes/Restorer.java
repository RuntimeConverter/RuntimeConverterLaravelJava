package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionProperty;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_functions;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Snapshot;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/global-state/src/Restorer.php

*/

public class Restorer extends RuntimeClassBase {

    public Restorer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Restorer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object restoreFunctions(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, false);
        ReferenceContainer functions = new BasicReferenceContainer(null);
        Object function = null;
        if (!function_function_exists.f.env(env).call("uopz_delete").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "The uopz_delete() function is required for this operation"));
        }

        functions.setObject(function_get_defined_functions.f.env(env).call().value());
        for (ZPair zpairResult1466 :
                ZVal.getIterable(
                        function_array_diff
                                .f
                                .env(env)
                                .call(
                                        functions.arrayGet(env, "user"),
                                        env.callMethod(snapshot, "functions", Restorer.class))
                                .value(),
                        env,
                        true)) {
            function = ZVal.assign(zpairResult1466.getValue());
            com.runtimeconverter.runtime.ZVal.functionNotFound("uopz_delete")
                    .env(env)
                    .call(function);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object restoreGlobalVariables(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, false);
        ReferenceContainer globalVariables = new BasicReferenceContainer(null);
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        Object superGlobalArray = null;
        Object superGlobalArrays = null;
        Object key = null;
        superGlobalArrays = env.callMethod(snapshot, "superGlobalArrays", Restorer.class);
        for (ZPair zpairResult1467 : ZVal.getIterable(superGlobalArrays, env, true)) {
            superGlobalArray = ZVal.assign(zpairResult1467.getValue());
            this.restoreSuperGlobalArray(env, snapshot, superGlobalArray);
        }

        globalVariables.setObject(env.callMethod(snapshot, "globalVariables", Restorer.class));
        for (ZPair zpairResult1468 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(GLOBALS.getObject()).value(),
                        env,
                        true)) {
            key = ZVal.assign(zpairResult1468.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.notEqualityCheck(key, "GLOBALS"))
                                    && ZVal.toBool(
                                            !function_in_array
                                                    .f
                                                    .env(env)
                                                    .call(key, superGlobalArrays)
                                                    .getBool()))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            env.callMethod(snapshot, "blacklist", Restorer.class),
                                            "isGlobalVariableBlacklisted",
                                            Restorer.class,
                                            key)))) {
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(key, globalVariables.getObject())
                        .getBool()) {
                    GLOBALS.arrayAccess(env, key).set(globalVariables.arrayGet(env, key));

                } else {
                    arrayActionR(ArrayAction.UNSET, GLOBALS, env, key);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    public Object restoreStaticAttributes(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object snapshot = assignParameter(args, 0, false);
        Object current = null;
        Object newClasses = null;
        ReferenceContainer defaults = new BasicReferenceContainer(null);
        Object reflector = null;
        Object name = null;
        Object className = null;
        Object attribute = null;
        Object value = null;
        Object staticAttributes = null;
        Object _pClass = null;
        current =
                new Snapshot(
                        env,
                        env.callMethod(snapshot, "blacklist", Restorer.class),
                        false,
                        false,
                        false,
                        false,
                        true,
                        false,
                        false,
                        false,
                        false);
        newClasses =
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                env.callMethod(current, "classes", Restorer.class),
                                env.callMethod(snapshot, "classes", Restorer.class))
                        .value();
        current = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1469 :
                ZVal.getIterable(
                        env.callMethod(snapshot, "staticAttributes", Restorer.class), env, false)) {
            className = ZVal.assign(zpairResult1469.getKey());
            staticAttributes = ZVal.assign(zpairResult1469.getValue());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1470 : ZVal.getIterable(staticAttributes, env, false)) {
                name = ZVal.assign(zpairResult1470.getKey());
                value = ZVal.assign(zpairResult1470.getValue());
                reflector = new ReflectionProperty(env, className, name);
                env.callMethod(reflector, "setAccessible", Restorer.class, true);
                env.callMethod(reflector, "setValue", Restorer.class, value);
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1471 : ZVal.getIterable(newClasses, env, true)) {
            className = ZVal.assign(zpairResult1471.getValue());
            _pClass = new ReflectionClass(env, className);
            defaults.setObject(env.callMethod(_pClass, "getDefaultProperties", Restorer.class));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1472 :
                    ZVal.getIterable(
                            env.callMethod(_pClass, "getProperties", Restorer.class), env, true)) {
                attribute = ZVal.assign(zpairResult1472.getValue());
                if (!ZVal.isTrue(env.callMethod(attribute, "isStatic", Restorer.class))) {
                    continue;
                }

                name = env.callMethod(attribute, "getName", Restorer.class);
                if (ZVal.isTrue(
                        env.callMethod(
                                env.callMethod(snapshot, "blacklist", Restorer.class),
                                "isStaticAttributeBlacklisted",
                                Restorer.class,
                                className,
                                name))) {
                    continue;
                }

                if (!arrayActionR(ArrayAction.ISSET, defaults, env, name)) {
                    continue;
                }

                env.callMethod(attribute, "setAccessible", Restorer.class, true);
                env.callMethod(attribute, "setValue", Restorer.class, defaults.arrayGet(env, name));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "snapshot",
        typeHint = "SebastianBergmann\\GlobalState\\Snapshot"
    )
    @ConvertedParameter(index = 1, name = "superGlobalArray", typeHint = "string")
    private Object restoreSuperGlobalArray(RuntimeEnv env, Object... args) {
        Object snapshot = assignParameter(args, 0, false);
        Object superGlobalArray = assignParameter(args, 1, false);
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        Object keys = null;
        Object key = null;
        ReferenceContainer superGlobalVariables = new BasicReferenceContainer(null);
        superGlobalVariables.setObject(
                env.callMethod(snapshot, "superGlobalVariables", Restorer.class));
        if (ZVal.toBool(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, GLOBALS, env, superGlobalArray))
                                && ZVal.toBool(
                                        function_is_array
                                                .f
                                                .env(env)
                                                .call(GLOBALS.arrayGet(env, superGlobalArray))
                                                .value()))
                && ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET, superGlobalVariables, env, superGlobalArray))) {
            keys =
                    function_array_keys
                            .f
                            .env(env)
                            .call(
                                    function_array_merge
                                            .f
                                            .env(env)
                                            .call(
                                                    GLOBALS.arrayGet(env, superGlobalArray),
                                                    superGlobalVariables.arrayGet(
                                                            env, superGlobalArray))
                                            .value())
                            .value();
            for (ZPair zpairResult1473 : ZVal.getIterable(keys, env, true)) {
                key = ZVal.assign(zpairResult1473.getValue());
                if (arrayActionR(
                        ArrayAction.ISSET, superGlobalVariables, env, superGlobalArray, key)) {
                    GLOBALS.arrayAccess(env, superGlobalArray, key)
                            .set(superGlobalVariables.arrayGet(env, superGlobalArray, key));

                } else {
                    arrayActionR(ArrayAction.UNSET, GLOBALS, env, superGlobalArray, key);
                }
            }
        }

        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\GlobalState\\Restorer";

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
                    .setName("SebastianBergmann\\GlobalState\\Restorer")
                    .setLookup(
                            Restorer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/global-state/src/Restorer.php")
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
