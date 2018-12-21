package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Blacklist;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/GlobalState.php

*/

public final class GlobalState extends RuntimeClassBase {

    public GlobalState(RuntimeEnv env, Object... args) {
        super(env);
    }

    public GlobalState(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_SUPER_GLOBAL_ARRAYS =
            ZVal.arrayFromList("_ENV", "_POST", "_GET", "_COOKIE", "_SERVER", "_FILES", "_REQUEST");

    public static final Object CONST_class = "PHPUnit\\Util\\GlobalState";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getIncludedFilesAsString(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, GlobalState.class)
                            .method("processIncludedFilesAsString")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(NamespaceGlobal.get_included_files.env(env).call().value())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "files", typeHint = "array")
        public Object processIncludedFilesAsString(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            ReferenceContainer files = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object result = null;
            ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
            Object file = null;
            Object prefix = null;
            Object blacklist = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            blacklist = new Blacklist(env);
            prefix = false;
            result = "";
            if (function_defined.f.env(env).call("__PHPUNIT_PHAR__").getBool()) {
                prefix =
                        "phar://"
                                + toStringR(function_constant.get(env, "__PHPUNIT_PHAR__"), env)
                                + "/";
            }

            runtimeConverterContinueCount = 0;
            for (i.setObject(
                            ZVal.subtract(
                                    function_count.f.env(env).call(files.getObject()).value(), 1));
                    ZVal.isGreaterThan(i.getObject(), '>', 0);
                    i.setObject(ZVal.decrement(i.getObject()))) {
                file = ZVal.assign(files.arrayGet(env, i.getObject()));
                if (ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.EMPTY,
                                        GLOBALS,
                                        env,
                                        "__PHPUNIT_ISOLATION_BLACKLIST"))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                file,
                                                GLOBALS.arrayGet(
                                                        env, "__PHPUNIT_ISOLATION_BLACKLIST"))
                                        .value())) {
                    continue;
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(prefix, "!==", false))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_strpos.f.env(env).call(file, prefix).value(),
                                        "===",
                                        0))) {
                    continue;
                }

                if (function_preg_match
                        .f
                        .env(env)
                        .call("/^(vfs|phpvfs[a-z0-9]+):/", file)
                        .getBool()) {
                    continue;
                }

                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                blacklist,
                                                "isBlacklisted",
                                                GlobalState.class,
                                                file)))
                        && ZVal.toBool(function_is_file.f.env(env).call(file).value())) {
                    result =
                            "require_once '"
                                    + toStringR(file, env)
                                    + "';\n"
                                    + toStringR(result, env);
                }
            }

            return ZVal.assign(result);
        }

        @ConvertedMethod
        public Object getIniSettingsAsString(RuntimeEnv env, Object... args) {
            Object result = null;
            Object iniSettings = null;
            Object value = null;
            Object key = null;
            result = "";
            iniSettings = NamespaceGlobal.ini_get_all.env(env).call(ZVal.getNull(), false).value();
            for (ZPair zpairResult1287 : ZVal.getIterable(iniSettings, env, false)) {
                key = ZVal.assign(zpairResult1287.getKey());
                value = ZVal.assign(zpairResult1287.getValue());
                result =
                        toStringR(result, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "@ini_set(%s, %s);" + "\n",
                                                        runtimeStaticObject.exportVariable(
                                                                env, key),
                                                        runtimeStaticObject.exportVariable(
                                                                env, value))
                                                .value(),
                                        env);
            }

            return ZVal.assign(result);
        }

        @ConvertedMethod
        public Object getConstantsAsString(RuntimeEnv env, Object... args) {
            Object result = null;
            Object name = null;
            ReferenceContainer constants = new BasicReferenceContainer(null);
            Object value = null;
            constants.setObject(NamespaceGlobal.get_defined_constants.env(env).call(true).value());
            result = "";
            if (arrayActionR(ArrayAction.ISSET, constants, env, "user")) {
                for (ZPair zpairResult1288 :
                        ZVal.getIterable(constants.arrayGet(env, "user"), env, false)) {
                    name = ZVal.assign(zpairResult1288.getKey());
                    value = ZVal.assign(zpairResult1288.getValue());
                    result =
                            toStringR(result, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "if (!defined('%s')) define('%s', %s);"
                                                                    + "\n",
                                                            name,
                                                            name,
                                                            runtimeStaticObject.exportVariable(
                                                                    env, value))
                                                    .value(),
                                            env);
                }
            }

            return ZVal.assign(result);
        }

        @ConvertedMethod
        public Object getGlobalsAsString(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object result = null;
            ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
            Object superGlobalArray = null;
            ReferenceContainer blacklist = new BasicReferenceContainer(null);
            Object key = null;
            result = "";
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1289 : ZVal.getIterable(CONST_SUPER_GLOBAL_ARRAYS, env, true)) {
                superGlobalArray = ZVal.assign(zpairResult1289.getValue());
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, GLOBALS, env, superGlobalArray))
                        && ZVal.toBool(
                                function_is_array
                                        .f
                                        .env(env)
                                        .call(GLOBALS.arrayGet(env, superGlobalArray))
                                        .value())) {
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult1290 :
                            ZVal.getIterable(
                                    function_array_keys
                                            .f
                                            .env(env)
                                            .call(GLOBALS.arrayGet(env, superGlobalArray))
                                            .value(),
                                    env,
                                    true)) {
                        key = ZVal.assign(zpairResult1290.getValue());
                        if (ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        GLOBALS.arrayGet(env, superGlobalArray, key),
                                        Closure.class,
                                        "Closure"))) {
                            continue;
                        }

                        result =
                                toStringR(result, env)
                                        + toStringR(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "$GLOBALS['%s']['%s'] = %s;" + "\n",
                                                                superGlobalArray,
                                                                key,
                                                                runtimeStaticObject.exportVariable(
                                                                        env,
                                                                        GLOBALS.arrayGet(
                                                                                env,
                                                                                superGlobalArray,
                                                                                key)))
                                                        .value(),
                                                env);
                    }
                }
            }

            blacklist.setObject(ZVal.assign(CONST_SUPER_GLOBAL_ARRAYS));
            blacklist.arrayAppend(env).set("GLOBALS");
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1291 :
                    ZVal.getIterable(
                            function_array_keys.f.env(env).call(GLOBALS.getObject()).value(),
                            env,
                            true)) {
                key = ZVal.assign(zpairResult1291.getValue());
                if (ZVal.toBool(
                                !ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                GLOBALS.arrayGet(env, key),
                                                Closure.class,
                                                "Closure")))
                        && ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(key, blacklist.getObject(), true)
                                        .getBool())) {
                    result =
                            toStringR(result, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "$GLOBALS['%s'] = %s;" + "\n",
                                                            key,
                                                            runtimeStaticObject.exportVariable(
                                                                    env,
                                                                    GLOBALS.arrayGet(env, key)))
                                                    .value(),
                                            env);
                }
            }

            return ZVal.assign(result);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "variable")
        private Object exportVariable(RuntimeEnv env, Object... args) {
            Object variable = assignParameter(args, 0, false);
            if (ZVal.toBool(
                            ZVal.toBool(function_is_scalar.f.env(env).call(variable).value())
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    variable, "===", ZVal.getNull())))
                    || ZVal.toBool(
                            ZVal.toBool(function_is_array.f.env(env).call(variable).value())
                                    && ZVal.toBool(
                                            runtimeStaticObject.arrayOnlyContainsScalars(
                                                    env, variable)))) {
                return ZVal.assign(
                        NamespaceGlobal.var_export.env(env).call(variable, true).value());
            }

            return ZVal.assign(
                    "unserialize("
                            + toStringR(
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(
                                                    function_serialize
                                                            .f
                                                            .env(env)
                                                            .call(variable)
                                                            .value(),
                                                    true)
                                            .value(),
                                    env)
                            + ")");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array", typeHint = "array")
        private Object arrayOnlyContainsScalars(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object array = assignParameter(args, 0, false);
            Object result = null;
            Object element = null;
            result = true;
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1292 : ZVal.getIterable(array, env, true)) {
                element = ZVal.assign(zpairResult1292.getValue());
                if (function_is_array.f.env(env).call(element).getBool()) {
                    result = runtimeStaticObject.arrayOnlyContainsScalars(env, element);

                } else if (ZVal.toBool(!function_is_scalar.f.env(env).call(element).getBool())
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(element, "!==", ZVal.getNull()))) {
                    result = false;
                }

                if (ZVal.strictEqualityCheck(result, "===", false)) {
                    break;
                }
            }

            return ZVal.assign(result);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\GlobalState")
                    .setLookup(
                            GlobalState.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/GlobalState.php")
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
