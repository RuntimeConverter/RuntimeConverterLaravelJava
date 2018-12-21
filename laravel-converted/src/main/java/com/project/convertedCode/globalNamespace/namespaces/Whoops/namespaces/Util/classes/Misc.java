package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Util/Misc.php

*/

public class Misc extends RuntimeClassBase {

    public Misc(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Misc(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Whoops\\Util\\Misc";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object canSendHeaders(RuntimeEnv env, Object... args) {
            ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
            return ZVal.assign(
                    ZVal.toBool(arrayActionR(ArrayAction.ISSET, _SERVER, env, "REQUEST_URI"))
                            && ZVal.toBool(
                                    !NamespaceGlobal.headers_sent.env(env).call().getBool()));
        }

        @ConvertedMethod
        public Object isAjaxRequest(RuntimeEnv env, Object... args) {
            ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
            return ZVal.assign(
                    ZVal.toBool(
                                    !arrayActionR(
                                            ArrayAction.EMPTY,
                                            _SERVER,
                                            env,
                                            "HTTP_X_REQUESTED_WITH"))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            NamespaceGlobal.strtolower
                                                    .env(env)
                                                    .call(
                                                            _SERVER.arrayGet(
                                                                    env, "HTTP_X_REQUESTED_WITH"))
                                                    .value(),
                                            "xmlhttprequest")));
        }

        @ConvertedMethod
        public Object isCommandLine(RuntimeEnv env, Object... args) {
            return ZVal.assign(ZVal.equalityCheck("cli", "cli"));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "error_code")
        public Object translateErrorCode(RuntimeEnv env, Object... args) {
            Object error_code = assignParameter(args, 0, false);
            Object constant = null;
            ReferenceContainer constants = new BasicReferenceContainer(null);
            Object value = null;
            constants.setObject(NamespaceGlobal.get_defined_constants.env(env).call(true).value());
            if (function_array_key_exists
                    .f
                    .env(env)
                    .call("Core", constants.getObject())
                    .getBool()) {
                for (ZPair zpairResult61 :
                        ZVal.getIterable(constants.arrayGet(env, "Core"), env, false)) {
                    constant = ZVal.assign(zpairResult61.getKey());
                    value = ZVal.assign(zpairResult61.getValue());
                    if (ZVal.toBool(
                                    ZVal.equalityCheck(
                                            function_substr.f.env(env).call(constant, 0, 2).value(),
                                            "E_"))
                            && ZVal.toBool(ZVal.equalityCheck(value, error_code))) {
                        return ZVal.assign(constant);
                    }
                }
            }

            return "E_UNKNOWN";
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "level")
        public Object isLevelFatal(RuntimeEnv env, Object... args) {
            Object level = assignParameter(args, 0, false);
            Object errors = null;
            errors = 1;
            errors = ZAssignment.or("|=", errors, 4);
            errors = ZAssignment.or("|=", errors, 16);
            errors = ZAssignment.or("|=", errors, 32);
            errors = ZAssignment.or("|=", errors, 64);
            errors = ZAssignment.or("|=", errors, 128);
            return ZVal.assign(
                    ZVal.isGreaterThan(ZVal.toLong(level) & ZVal.toLong(errors), '>', 0));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Util\\Misc")
                    .setLookup(
                            Misc.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/filp/whoops/src/Whoops/Util/Misc.php")
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
