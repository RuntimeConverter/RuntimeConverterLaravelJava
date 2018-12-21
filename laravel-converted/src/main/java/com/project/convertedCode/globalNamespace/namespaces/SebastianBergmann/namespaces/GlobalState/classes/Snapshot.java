package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.stdClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_functions;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.GlobalState.classes.Blacklist;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_declared_classes;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/global-state/src/Snapshot.php

*/

public class Snapshot extends RuntimeClassBase {

    public Object blacklist = null;

    public Object globalVariables = ZVal.newArray();

    public Object superGlobalArrays = ZVal.newArray();

    public Object superGlobalVariables = ZVal.newArray();

    public Object staticAttributes = ZVal.newArray();

    public Object iniSettings = ZVal.newArray();

    public Object includedFiles = ZVal.newArray();

    public Object constants = ZVal.newArray();

    public Object functions = ZVal.newArray();

    public Object interfaces = ZVal.newArray();

    public Object classes = ZVal.newArray();

    public Object traits = ZVal.newArray();

    public Snapshot(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Snapshot.class) {
            this.__construct(env, args);
        }
    }

    public Snapshot(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blacklist",
        typeHint = "SebastianBergmann\\GlobalState\\Blacklist",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "includeGlobalVariables",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "includeStaticAttributes",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "includeConstants",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "includeFunctions",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "includeClasses",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "includeInterfaces",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "includeTraits",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 8,
        name = "includeIniSettings",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 9,
        name = "includeIncludedFiles",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object blacklist = assignParameter(args, 0, true);
        if (null == blacklist) {
            blacklist = ZVal.getNull();
        }
        Object includeGlobalVariables = assignParameter(args, 1, true);
        if (null == includeGlobalVariables) {
            includeGlobalVariables = true;
        }
        Object includeStaticAttributes = assignParameter(args, 2, true);
        if (null == includeStaticAttributes) {
            includeStaticAttributes = true;
        }
        Object includeConstants = assignParameter(args, 3, true);
        if (null == includeConstants) {
            includeConstants = true;
        }
        Object includeFunctions = assignParameter(args, 4, true);
        if (null == includeFunctions) {
            includeFunctions = true;
        }
        Object includeClasses = assignParameter(args, 5, true);
        if (null == includeClasses) {
            includeClasses = true;
        }
        Object includeInterfaces = assignParameter(args, 6, true);
        if (null == includeInterfaces) {
            includeInterfaces = true;
        }
        Object includeTraits = assignParameter(args, 7, true);
        if (null == includeTraits) {
            includeTraits = true;
        }
        Object includeIniSettings = assignParameter(args, 8, true);
        if (null == includeIniSettings) {
            includeIniSettings = true;
        }
        Object includeIncludedFiles = assignParameter(args, 9, true);
        if (null == includeIncludedFiles) {
            includeIncludedFiles = true;
        }
        if (ZVal.strictEqualityCheck(blacklist, "===", ZVal.getNull())) {
            blacklist = new Blacklist(env);
        }

        this.blacklist = blacklist;
        if (ZVal.isTrue(includeConstants)) {
            this.snapshotConstants(env);
        }

        if (ZVal.isTrue(includeFunctions)) {
            this.snapshotFunctions(env);
        }

        if (ZVal.toBool(includeClasses) || ZVal.toBool(includeStaticAttributes)) {
            this.snapshotClasses(env);
        }

        if (ZVal.isTrue(includeInterfaces)) {
            this.snapshotInterfaces(env);
        }

        if (ZVal.isTrue(includeGlobalVariables)) {
            this.setupSuperGlobalArrays(env);
            this.snapshotGlobals(env);
        }

        if (ZVal.isTrue(includeStaticAttributes)) {
            this.snapshotStaticAttributes(env);
        }

        if (ZVal.isTrue(includeIniSettings)) {
            this.iniSettings =
                    NamespaceGlobal.ini_get_all.env(env).call(ZVal.getNull(), false).value();
        }

        if (ZVal.isTrue(includeIncludedFiles)) {
            this.includedFiles = NamespaceGlobal.get_included_files.env(env).call().value();
        }

        this.traits = NamespaceGlobal.get_declared_traits.env(env).call().value();
        return null;
    }

    @ConvertedMethod
    public Object blacklist(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.blacklist);
    }

    @ConvertedMethod
    public Object globalVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.globalVariables);
    }

    @ConvertedMethod
    public Object superGlobalVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.superGlobalVariables);
    }

    @ConvertedMethod
    public Object superGlobalArrays(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.superGlobalArrays);
    }

    @ConvertedMethod
    public Object staticAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.staticAttributes);
    }

    @ConvertedMethod
    public Object iniSettings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.iniSettings);
    }

    @ConvertedMethod
    public Object includedFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.includedFiles);
    }

    @ConvertedMethod
    public Object constants(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.constants);
    }

    @ConvertedMethod
    public Object functions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.functions);
    }

    @ConvertedMethod
    public Object interfaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.interfaces);
    }

    @ConvertedMethod
    public Object classes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.classes);
    }

    @ConvertedMethod
    public Object traits(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.traits);
    }

    @ConvertedMethod
    private Object snapshotConstants(RuntimeEnv env, Object... args) {
        ReferenceContainer constants = new BasicReferenceContainer(null);
        constants.setObject(NamespaceGlobal.get_defined_constants.env(env).call(true).value());
        if (arrayActionR(ArrayAction.ISSET, constants, env, "user")) {
            this.constants = constants.arrayGet(env, "user");
        }

        return null;
    }

    @ConvertedMethod
    private Object snapshotFunctions(RuntimeEnv env, Object... args) {
        ReferenceContainer functions = new BasicReferenceContainer(null);
        functions.setObject(function_get_defined_functions.f.env(env).call().value());
        this.functions = functions.arrayGet(env, "user");
        return null;
    }

    @ConvertedMethod
    private Object snapshotClasses(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object className = null;
        Object _pClass = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1474 :
                ZVal.getIterable(
                        function_array_reverse
                                .f
                                .env(env)
                                .call(function_get_declared_classes.f.env(env).call().value())
                                .value(),
                        env,
                        true)) {
            className = ZVal.assign(zpairResult1474.getValue());
            _pClass = new ReflectionClass(env, className);
            if (!ZVal.isTrue(env.callMethod(_pClass, "isUserDefined", Snapshot.class))) {
                break;
            }

            new ReferenceClassProperty(this, "classes", env).arrayAppend(env).set(className);
        }

        this.classes = function_array_reverse.f.env(env).call(this.classes).value();
        return null;
    }

    @ConvertedMethod
    private Object snapshotInterfaces(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object interfaceName = null;
        Object _pClass = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1475 :
                ZVal.getIterable(
                        function_array_reverse
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.get_declared_interfaces
                                                .env(env)
                                                .call()
                                                .value())
                                .value(),
                        env,
                        true)) {
            interfaceName = ZVal.assign(zpairResult1475.getValue());
            _pClass = new ReflectionClass(env, interfaceName);
            if (!ZVal.isTrue(env.callMethod(_pClass, "isUserDefined", Snapshot.class))) {
                break;
            }

            new ReferenceClassProperty(this, "interfaces", env).arrayAppend(env).set(interfaceName);
        }

        this.interfaces = function_array_reverse.f.env(env).call(this.interfaces).value();
        return null;
    }

    @ConvertedMethod
    private Object snapshotGlobals(RuntimeEnv env, Object... args) {
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        Object superGlobalArray = null;
        Object superGlobalArrays = null;
        Object key = null;
        superGlobalArrays = this.superGlobalArrays(env);
        for (ZPair zpairResult1476 : ZVal.getIterable(superGlobalArrays, env, true)) {
            superGlobalArray = ZVal.assign(zpairResult1476.getValue());
            this.snapshotSuperGlobalArray(env, superGlobalArray);
        }

        for (ZPair zpairResult1477 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(GLOBALS.getObject()).value(),
                        env,
                        true)) {
            key = ZVal.assign(zpairResult1477.getValue());
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(ZVal.notEqualityCheck(key, "GLOBALS"))
                                                    && ZVal.toBool(
                                                            !function_in_array
                                                                    .f
                                                                    .env(env)
                                                                    .call(key, superGlobalArrays)
                                                                    .getBool()))
                                    && ZVal.toBool(
                                            this.canBeSerialized(env, GLOBALS.arrayGet(env, key))))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            this.blacklist,
                                            "isGlobalVariableBlacklisted",
                                            Snapshot.class,
                                            key)))) {
                new ReferenceClassProperty(this, "globalVariables", env)
                        .arrayAccess(env, key)
                        .set(
                                function_unserialize
                                        .f
                                        .env(env)
                                        .call(
                                                function_serialize
                                                        .f
                                                        .env(env)
                                                        .call(GLOBALS.arrayGet(env, key))
                                                        .value())
                                        .value());
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "superGlobalArray", typeHint = "string")
    private Object snapshotSuperGlobalArray(RuntimeEnv env, Object... args) {
        Object superGlobalArray = assignParameter(args, 0, false);
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        Object value = null;
        Object key = null;
        new ReferenceClassProperty(this, "superGlobalVariables", env)
                .arrayAccess(env, superGlobalArray)
                .set(ZVal.newArray());
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, GLOBALS, env, superGlobalArray))
                && ZVal.toBool(
                        function_is_array
                                .f
                                .env(env)
                                .call(GLOBALS.arrayGet(env, superGlobalArray))
                                .value())) {
            for (ZPair zpairResult1478 :
                    ZVal.getIterable(GLOBALS.arrayGet(env, superGlobalArray), env, false)) {
                key = ZVal.assign(zpairResult1478.getKey());
                value = ZVal.assign(zpairResult1478.getValue());
                new ReferenceClassProperty(this, "superGlobalVariables", env)
                        .arrayAccess(env, superGlobalArray, key)
                        .set(
                                function_unserialize
                                        .f
                                        .env(env)
                                        .call(function_serialize.f.env(env).call(value).value())
                                        .value());
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object snapshotStaticAttributes(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object name = null;
        Object className = null;
        Object attribute = null;
        Object _pClass = null;
        Object value = null;
        ReferenceContainer snapshot = new BasicReferenceContainer(null);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1479 : ZVal.getIterable(this.classes, env, true)) {
            className = ZVal.assign(zpairResult1479.getValue());
            _pClass = new ReflectionClass(env, className);
            snapshot.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1480 :
                    ZVal.getIterable(
                            env.callMethod(_pClass, "getProperties", Snapshot.class), env, true)) {
                attribute = ZVal.assign(zpairResult1480.getValue());
                if (ZVal.isTrue(env.callMethod(attribute, "isStatic", Snapshot.class))) {
                    name = env.callMethod(attribute, "getName", Snapshot.class);
                    if (ZVal.isTrue(
                            env.callMethod(
                                    this.blacklist,
                                    "isStaticAttributeBlacklisted",
                                    Snapshot.class,
                                    className,
                                    name))) {
                        continue;
                    }

                    env.callMethod(attribute, "setAccessible", Snapshot.class, true);
                    value = env.callMethod(attribute, "getValue", Snapshot.class);
                    if (ZVal.isTrue(this.canBeSerialized(env, value))) {
                        snapshot.arrayAccess(env, name)
                                .set(
                                        function_unserialize
                                                .f
                                                .env(env)
                                                .call(
                                                        function_serialize
                                                                .f
                                                                .env(env)
                                                                .call(value)
                                                                .value())
                                                .value());
                    }
                }
            }

            if (!ZVal.isEmpty(snapshot.getObject())) {
                new ReferenceClassProperty(this, "staticAttributes", env)
                        .arrayAccess(env, className)
                        .set(snapshot.getObject());
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object setupSuperGlobalArrays(RuntimeEnv env, Object... args) {
        this.superGlobalArrays =
                ZVal.arrayFromList(
                        "_ENV", "_POST", "_GET", "_COOKIE", "_SERVER", "_FILES", "_REQUEST");
        if (ZVal.equalityCheck(
                function_ini_get.f.env(env).call("register_long_arrays").value(), "1")) {
            this.superGlobalArrays =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    this.superGlobalArrays,
                                    ZVal.arrayFromList(
                                            "HTTP_ENV_VARS",
                                            "HTTP_POST_VARS",
                                            "HTTP_GET_VARS",
                                            "HTTP_COOKIE_VARS",
                                            "HTTP_SERVER_VARS",
                                            "HTTP_POST_FILES"))
                            .value();
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variable")
    private Object canBeSerialized(RuntimeEnv env, Object... args) {
        Object variable = assignParameter(args, 0, false);
        Object _pClass = null;
        if (!function_is_object.f.env(env).call(variable).getBool()) {
            return ZVal.assign(!function_is_resource.f.env(env).call(variable).getBool());
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(variable, stdClass.class, "stdClass"))) {
            return ZVal.assign(true);
        }

        _pClass = new ReflectionClass(env, variable);
        do {
            if (ZVal.isTrue(env.callMethod(_pClass, "isInternal", Snapshot.class))) {
                return ZVal.assign(
                        ZVal.checkInstanceType(variable, Serializable.class, "Serializable"));
            }

        } while (ZVal.isTrue(_pClass = env.callMethod(_pClass, "getParentClass", Snapshot.class)));

        return ZVal.assign(true);
    }

    public static final Object CONST_class = "SebastianBergmann\\GlobalState\\Snapshot";

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
                    .setName("SebastianBergmann\\GlobalState\\Snapshot")
                    .setLookup(
                            Snapshot.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "blacklist",
                            "classes",
                            "constants",
                            "functions",
                            "globalVariables",
                            "includedFiles",
                            "iniSettings",
                            "interfaces",
                            "staticAttributes",
                            "superGlobalArrays",
                            "superGlobalVariables",
                            "traits")
                    .setFilename("vendor/sebastian/global-state/src/Snapshot.php")
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
