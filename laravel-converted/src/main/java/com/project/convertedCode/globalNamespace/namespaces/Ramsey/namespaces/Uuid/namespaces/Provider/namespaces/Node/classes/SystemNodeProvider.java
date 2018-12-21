package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.namespaces.Node.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.classes.NodeProviderInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Provider/Node/SystemNodeProvider.php

*/

public class SystemNodeProvider extends RuntimeClassBase implements NodeProviderInterface {

    public SystemNodeProvider(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SystemNodeProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args) {
        ReferenceContainer node = new BasicReferenceContainer(null);
        Object pattern = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        node = env.getInlineStatic(24, ZVal.getNull());
        if (ZVal.strictNotEqualityCheck(node.getObject(), "!==", ZVal.getNull())) {
            return ZVal.assign(node.getObject());
        }

        pattern = "/[^:]([0-9A-Fa-f]{2}([:-])[0-9A-Fa-f]{2}(\\2[0-9A-Fa-f]{2}){4})[^:]/";
        matches.setObject(ZVal.newArray());
        node.setObject(this.getSysfs(env));
        if (ZVal.strictEqualityCheck(node.getObject(), "===", false)) {
            if (function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(pattern, this.getIfconfig(env), matches.getObject(), 1)
                    .getBool()) {
                node.setObject(ZVal.assign(matches.arrayGet(env, 1, 0)));
            }
        }

        if (ZVal.strictNotEqualityCheck(node.getObject(), "!==", false)) {
            node.setObject(
                    function_str_replace
                            .f
                            .env(env)
                            .call(ZVal.arrayFromList(":", "-"), "", node.getObject())
                            .value());
        }

        return ZVal.assign(node.getObject());
    }

    @ConvertedMethod
    protected Object getIfconfig(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        function_ob_start.f.env(env).call();
        SwitchEnumType93 switchVariable93 =
                ZVal.getEnum(
                        NamespaceGlobal.strtoupper
                                .env(env)
                                .call(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.php_uname
                                                                .env(env)
                                                                .call("a")
                                                                .value(),
                                                        0,
                                                        3)
                                                .value())
                                .value(),
                        SwitchEnumType93.DEFAULT_CASE,
                        SwitchEnumType93.STRING_WIN,
                        "WIN",
                        SwitchEnumType93.STRING_DAR,
                        "DAR",
                        SwitchEnumType93.STRING_LIN,
                        "LIN");
        switch (switchVariable93) {
            case STRING_WIN:
                NamespaceGlobal.passthru.env(env).call("ipconfig /all 2>&1");
                break;
            case STRING_DAR:
                NamespaceGlobal.passthru.env(env).call("ifconfig 2>&1");
                break;
            case STRING_LIN:
            case DEFAULT_CASE:
                NamespaceGlobal.passthru.env(env).call("netstat -ie 2>&1");
                break;
        }
        ;
        return ZVal.assign(function_ob_get_clean.f.env(env).call().value());
    }

    @ConvertedMethod
    protected Object getSysfs(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/ramsey/uuid/src/Provider/Node")
                        .setFile("/vendor/ramsey/uuid/src/Provider/Node/SystemNodeProvider.php");
        Object macs = null;
        Object mac = null;
        Object addressPaths = null;
        mac = false;
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strtoupper
                        .env(env)
                        .call(NamespaceGlobal.php_uname.env(env).call("s").value())
                        .value(),
                "===",
                "LINUX")) {
            addressPaths =
                    NamespaceGlobal.glob.env(env).call("/sys/class/net/*/address", 4).value();
            if (ZVal.isEmpty(addressPaths)) {
                return ZVal.assign(false);
            }

            macs = function_array_map.f.env(env).call("file_get_contents", addressPaths).value();
            macs = function_array_map.f.env(env).call("trim", macs).value();
            macs =
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    macs,
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Ramsey\\Uuid\\Provider\\Node",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "mac")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object mac = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    ZVal.toBool(
                                                                    ZVal.strictNotEqualityCheck(
                                                                            mac,
                                                                            "!==",
                                                                            "00:00:00:00:00:00"))
                                                            && ZVal.toBool(
                                                                    function_preg_match
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    "/^([0-9a-f]{2}:){5}[0-9a-f]{2}$/i",
                                                                                    mac)
                                                                            .value()));
                                        }
                                    })
                            .value();
            mac = function_reset.f.env(env).call(macs).value();
        }

        return ZVal.assign(mac);
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Provider\\Node\\SystemNodeProvider";

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
                    .setName("Ramsey\\Uuid\\Provider\\Node\\SystemNodeProvider")
                    .setLookup(
                            SystemNodeProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Provider/Node/SystemNodeProvider.php")
                    .addInterface("Ramsey\\Uuid\\Provider\\NodeProviderInterface")
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

    private enum SwitchEnumType93 {
        STRING_WIN,
        STRING_DAR,
        STRING_LIN,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
