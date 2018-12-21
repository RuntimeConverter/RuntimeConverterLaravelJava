package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/ProcessUtils.php

*/

public class ProcessUtils extends RuntimeClassBase {

    public ProcessUtils(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ProcessUtils(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Support\\ProcessUtils";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument")
        public Object escapeArgument(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, false);
            Object quote = null;
            Object part = null;
            Object escapedArgument = null;
            if (ZVal.strictEqualityCheck("\\", "===", "/")) {
                if (ZVal.strictEqualityCheck("", "===", argument)) {
                    return "\"\"";
                }

                escapedArgument = "";
                quote = false;
                for (ZPair zpairResult581 :
                        ZVal.getIterable(
                                NamespaceGlobal.preg_split
                                        .env(env)
                                        .call(
                                                "/(\")/",
                                                argument,
                                                -1,
                                                ZVal.toLong(1) | ZVal.toLong(2))
                                        .value(),
                                env,
                                true)) {
                    part = ZVal.assign(zpairResult581.getValue());
                    if (ZVal.strictEqualityCheck("\"", "===", part)) {
                        escapedArgument = toStringR(escapedArgument, env) + "\\\"";

                    } else if (ZVal.isTrue(runtimeStaticObject.isSurroundedBy(env, part, "%"))) {
                        escapedArgument =
                                toStringR(escapedArgument, env)
                                        + "^%\""
                                        + toStringR(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(part, 1, -1)
                                                        .value(),
                                                env)
                                        + "\"^%";

                    } else {
                        if (ZVal.strictEqualityCheck(
                                "\\", "===", function_substr.f.env(env).call(part, -1).value())) {
                            part = toStringR(part, env) + "\\";
                        }

                        quote = true;
                        escapedArgument = toStringR(escapedArgument, env) + toStringR(part, env);
                    }
                }

                if (ZVal.isTrue(quote)) {
                    escapedArgument = "\"" + toStringR(escapedArgument, env) + "\"";
                }

                return ZVal.assign(escapedArgument);
            }

            return ZVal.assign(
                    "'"
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("'", "'\\''", argument)
                                            .value(),
                                    env)
                            + "'");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "arg")
        @ConvertedParameter(index = 1, name = "char")
        protected Object isSurroundedBy(RuntimeEnv env, Object... args) {
            ReferenceContainer arg = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object _pChar = assignParameter(args, 1, false);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.isLessThan(
                                                            2,
                                                            '<',
                                                            function_strlen
                                                                    .f
                                                                    .env(env)
                                                                    .call(arg.getObject())
                                                                    .value()))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            _pChar, "===", arg.arrayGet(env, 0))))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _pChar,
                                            "===",
                                            arg.arrayGet(
                                                    env,
                                                    ZVal.subtract(
                                                            function_strlen
                                                                    .f
                                                                    .env(env)
                                                                    .call(arg.getObject())
                                                                    .value(),
                                                            1)))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\ProcessUtils")
                    .setLookup(
                            ProcessUtils.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/ProcessUtils.php")
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
