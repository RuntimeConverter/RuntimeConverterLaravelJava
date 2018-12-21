package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/JsonMatchesErrorMessageProvider.php

*/

public class JsonMatchesErrorMessageProvider extends RuntimeClassBase {

    public JsonMatchesErrorMessageProvider(RuntimeEnv env, Object... args) {
        super(env);
    }

    public JsonMatchesErrorMessageProvider(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\Constraint\\JsonMatchesErrorMessageProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "error", typeHint = "string")
        @ConvertedParameter(index = 1, name = "prefix", typeHint = "string")
        public Object determineJsonError(RuntimeEnv env, Object... args) {
            Object error = assignParameter(args, 0, false);
            Object prefix = assignParameter(args, 1, true);
            if (null == prefix) {
                prefix = "";
            }
            SwitchEnumType59 switchVariable59 =
                    ZVal.getEnum(
                            error,
                            SwitchEnumType59.DEFAULT_CASE,
                            SwitchEnumType59.DYNAMIC_TYPE_235,
                            0,
                            SwitchEnumType59.DYNAMIC_TYPE_236,
                            1,
                            SwitchEnumType59.DYNAMIC_TYPE_237,
                            2,
                            SwitchEnumType59.DYNAMIC_TYPE_238,
                            3,
                            SwitchEnumType59.DYNAMIC_TYPE_239,
                            4,
                            SwitchEnumType59.DYNAMIC_TYPE_240,
                            5);
            switch (switchVariable59) {
                case DYNAMIC_TYPE_235:
                    return ZVal.assign(ZVal.getNull());
                case DYNAMIC_TYPE_236:
                    return ZVal.assign(toStringR(prefix, env) + "Maximum stack depth exceeded");
                case DYNAMIC_TYPE_237:
                    return ZVal.assign(toStringR(prefix, env) + "Underflow or the modes mismatch");
                case DYNAMIC_TYPE_238:
                    return ZVal.assign(
                            toStringR(prefix, env) + "Unexpected control character found");
                case DYNAMIC_TYPE_239:
                    return ZVal.assign(toStringR(prefix, env) + "Syntax error, malformed JSON");
                case DYNAMIC_TYPE_240:
                    return ZVal.assign(
                            toStringR(prefix, env)
                                    + "Malformed UTF-8 characters, possibly incorrectly encoded");
                case DEFAULT_CASE:
                    return ZVal.assign(toStringR(prefix, env) + "Unknown error");
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "type", typeHint = "string")
        public Object translateTypeToPrefix(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object type = assignParameter(args, 0, false);
            Object prefix = null;
            SwitchEnumType60 switchVariable60 =
                    ZVal.getEnum(
                            NamespaceGlobal.strtolower.env(env).call(type).value(),
                            SwitchEnumType60.DEFAULT_CASE,
                            SwitchEnumType60.STRING_expected,
                            "expected",
                            SwitchEnumType60.STRING_actual,
                            "actual");
            switch (switchVariable60) {
                case STRING_expected:
                    prefix = "Expected value JSON decode error - ";
                    break;
                case STRING_actual:
                    prefix = "Actual value JSON decode error - ";
                    break;
                case DEFAULT_CASE:
                    prefix = "";
                    break;
            }
            ;
            return ZVal.assign(prefix);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\JsonMatchesErrorMessageProvider")
                    .setLookup(
                            JsonMatchesErrorMessageProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/JsonMatchesErrorMessageProvider.php")
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

    private enum SwitchEnumType59 {
        DYNAMIC_TYPE_235,
        DYNAMIC_TYPE_236,
        DYNAMIC_TYPE_237,
        DYNAMIC_TYPE_238,
        DYNAMIC_TYPE_239,
        DYNAMIC_TYPE_240,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType60 {
        STRING_expected,
        STRING_actual,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
