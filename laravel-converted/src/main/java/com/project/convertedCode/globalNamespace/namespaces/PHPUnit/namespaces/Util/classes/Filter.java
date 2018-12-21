package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Blacklist;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SyntheticError;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Filter.php

*/

public final class Filter extends RuntimeClassBase {

    public Filter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Filter(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Filter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "t", typeHint = "Throwable")
        public Object getFilteredStacktrace(RuntimeEnv env, Object... args) {
            Object t = assignParameter(args, 0, false);
            Object eFile = null;
            ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
            Object prefix = null;
            Object filteredStacktrace = null;
            Object blacklist = null;
            Object eLine = null;
            Object ternaryExpressionTemp = null;
            Object script = null;
            Object eTrace = null;
            ReferenceContainer frame = new BasicReferenceContainer(null);
            prefix = false;
            script =
                    function_realpath
                            .f
                            .env(env)
                            .call(GLOBALS.arrayGet(env, "_SERVER", "SCRIPT_NAME"))
                            .value();
            if (function_defined.f.env(env).call("__PHPUNIT_PHAR_ROOT__").getBool()) {
                prefix = function_constant.get(env, "__PHPUNIT_PHAR_ROOT__");
            }

            filteredStacktrace = "";
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            t, SyntheticError.class, "PHPUnit\\Framework\\SyntheticError"))) {
                eTrace = env.callMethod(t, "getSyntheticTrace", Filter.class);
                eFile = env.callMethod(t, "getSyntheticFile", Filter.class);
                eLine = env.callMethod(t, "getSyntheticLine", Filter.class);

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(t, Exception.class, "PHPUnit\\Framework\\Exception"))) {
                eTrace = env.callMethod(t, "getSerializableTrace", Filter.class);
                eFile = env.callMethod(t, "getFile", Filter.class);
                eLine = env.callMethod(t, "getLine", Filter.class);

            } else {
                if (ZVal.isTrue(env.callMethod(t, "getPrevious", Filter.class))) {
                    t = env.callMethod(t, "getPrevious", Filter.class);
                }

                eTrace = env.callMethod(t, "getTrace", Filter.class);
                eFile = env.callMethod(t, "getFile", Filter.class);
                eLine = env.callMethod(t, "getLine", Filter.class);
            }

            if (!ZVal.isTrue(runtimeStaticObject.frameExists(env, eTrace, eFile, eLine))) {
                function_array_unshift
                        .f
                        .env(env)
                        .call(
                                eTrace,
                                ZVal.newArray(new ZPair("file", eFile), new ZPair("line", eLine)));
            }

            blacklist = new Blacklist(env);
            for (ZPair zpairResult1285 : ZVal.getIterable(eTrace, env, true)) {
                frame.setObject(ZVal.assign(zpairResult1285.getValue()));
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                arrayActionR(
                                                                                        ArrayAction
                                                                                                .ISSET,
                                                                                        frame,
                                                                                        env,
                                                                                        "file"))
                                                                        && ZVal.toBool(
                                                                                function_is_file
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                frame
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                "file"))
                                                                                        .value()))
                                                        && ZVal.toBool(
                                                                !ZVal.isTrue(
                                                                        env.callMethod(
                                                                                blacklist,
                                                                                "isBlacklisted",
                                                                                Filter.class,
                                                                                frame.arrayGet(
                                                                                        env,
                                                                                        "file")))))
                                        && ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        prefix, "===", false))
                                                        || ZVal.toBool(
                                                                ZVal.strictNotEqualityCheck(
                                                                        function_strpos
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        frame
                                                                                                .arrayGet(
                                                                                                        env,
                                                                                                        "file"),
                                                                                        prefix)
                                                                                .value(),
                                                                        "!==",
                                                                        0))))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        frame.arrayGet(env, "file"), "!==", script))) {
                    filteredStacktrace =
                            toStringR(filteredStacktrace, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "%s:%s\n",
                                                            frame.arrayGet(env, "file"),
                                                            ZVal.isDefined(
                                                                            ternaryExpressionTemp =
                                                                                    frame.arrayGet(
                                                                                            env,
                                                                                            "line"))
                                                                    ? ternaryExpressionTemp
                                                                    : "?")
                                                    .value(),
                                            env);
                }
            }

            return ZVal.assign(filteredStacktrace);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "trace", typeHint = "array")
        @ConvertedParameter(index = 1, name = "file", typeHint = "string")
        @ConvertedParameter(index = 2, name = "line", typeHint = "int")
        private Object frameExists(RuntimeEnv env, Object... args) {
            Object trace = assignParameter(args, 0, false);
            Object file = assignParameter(args, 1, false);
            Object line = assignParameter(args, 2, false);
            ReferenceContainer frame = new BasicReferenceContainer(null);
            for (ZPair zpairResult1286 : ZVal.getIterable(trace, env, true)) {
                frame.setObject(ZVal.assign(zpairResult1286.getValue()));
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        frame,
                                                                        env,
                                                                        "file"))
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        frame.arrayGet(env, "file"),
                                                                        "===",
                                                                        file)))
                                        && ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET, frame, env, "line")))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        frame.arrayGet(env, "line"), "===", line))) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Filter")
                    .setLookup(
                            Filter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Filter.php")
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
