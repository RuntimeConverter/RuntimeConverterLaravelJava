package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.Curl.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
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
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/Curl/Util.php

*/

public class Util extends RuntimeClassBase {

    public Util(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Util(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Monolog\\Handler\\Curl\\Util";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "ch")
        @ConvertedParameter(
            index = 1,
            name = "retries",
            defaultValue = "5",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "closeAfterDone",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object execute(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            int runtimeConverterContinueCount;
            Object ch = assignParameter(args, 0, false);
            ReferenceContainer retries =
                    new BasicReferenceContainer(assignParameter(args, 1, true));
            if (null == retries.getObject()) {
                retries.setObject(5);
            }
            Object closeAfterDone = assignParameter(args, 2, true);
            if (null == closeAfterDone) {
                closeAfterDone = true;
            }
            Object curlError = null;
            Object curlErrno = null;
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            while (ZVal.isTrue(ZVal.postDecrement(retries))) {
                if (ZVal.strictEqualityCheck(
                        NamespaceGlobal.curl_exec.env(env).call(ch).value(), "===", false)) {
                    curlErrno = NamespaceGlobal.curl_errno.env(env).call(ch).value();
                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            false,
                                            "===",
                                            function_in_array
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            curlErrno,
                                                            env.getRequestStaticProperties(
                                                                            com.project
                                                                                    .convertedCode
                                                                                    .globalNamespace
                                                                                    .namespaces
                                                                                    .Monolog
                                                                                    .namespaces
                                                                                    .Handler
                                                                                    .namespaces
                                                                                    .Curl
                                                                                    .classes
                                                                                    .Util
                                                                                    .RequestStaticProperties
                                                                                    .class)
                                                                    .retriableErrorCodes,
                                                            true)
                                                    .value()))
                            || ZVal.toBool(!ZVal.isTrue(retries.getObject()))) {
                        curlError = NamespaceGlobal.curl_error.env(env).call(ch).value();
                        if (ZVal.isTrue(closeAfterDone)) {
                            NamespaceGlobal.curl_close.env(env).call(ch);
                        }

                        throw ZVal.getException(
                                env,
                                new RuntimeException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Curl error (code %s): %s",
                                                        curlErrno, curlError)
                                                .value()));
                    }

                    continue;
                }

                if (ZVal.isTrue(closeAfterDone)) {
                    NamespaceGlobal.curl_close.env(env).call(ch);
                }

                break;
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object retriableErrorCodes =
                ZVal.newArray(
                        new ZPair(0, 6),
                        new ZPair(1, 7),
                        new ZPair(2, 22),
                        new ZPair(3, 26),
                        new ZPair(4, 28),
                        new ZPair(5, 34),
                        new ZPair(6, 35));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\Curl\\Util")
                    .setLookup(
                            Util.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("retriableErrorCodes")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/Curl/Util.php")
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
