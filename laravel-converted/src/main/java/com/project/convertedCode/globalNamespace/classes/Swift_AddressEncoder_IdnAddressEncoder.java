package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_AddressEncoderException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.classes.Swift_AddressEncoder;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/AddressEncoder/IdnAddressEncoder.php

*/

public class Swift_AddressEncoder_IdnAddressEncoder extends RuntimeClassBase
        implements Swift_AddressEncoder {

    public Swift_AddressEncoder_IdnAddressEncoder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Swift_AddressEncoder_IdnAddressEncoder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address", typeHint = "string")
    public Object encodeString(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        Object domain = null;
        Object i = null;
        Object local = null;
        i = NamespaceGlobal.strrpos.env(env).call(address, "@").value();
        if (ZVal.strictNotEqualityCheck(false, "!==", i)) {
            local = function_substr.f.env(env).call(address, 0, i).value();
            domain = function_substr.f.env(env).call(address, ZVal.add(i, 1)).value();
            if (function_preg_match.f.env(env).call("/[^\\x00-\\x7F]/", local).getBool()) {
                throw ZVal.getException(
                        env,
                        new Swift_AddressEncoderException(
                                env, "Non-ASCII characters not supported in local-part", address));
            }

            if (function_preg_match.f.env(env).call("/[^\\x00-\\x7F]/", domain).getBool()) {
                address =
                        function_sprintf
                                .f
                                .env(env)
                                .call("%s@%s", local, this.idnToAscii(env, domain))
                                .value();
            }
        }

        return ZVal.assign(address);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    protected Object idnToAscii(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object address = null;
        Object punycode = null;
        if (function_function_exists.f.env(env).call("idn_to_ascii").getBool()) {
            return ZVal.assign(NamespaceGlobal.idn_to_ascii.env(env).call(string, 0, 1).value());
        }

        if (function_class_exists.f.env(env).call("TrueBV\\Punycode").getBool()) {
            punycode = env.createNew(ZVal.resolveClassAlias(env, "TrueBV\\Punycode"));
            return ZVal.assign(
                    env.callMethod(
                            punycode,
                            "encode",
                            Swift_AddressEncoder_IdnAddressEncoder.class,
                            string));
        }

        throw ZVal.getException(
                env,
                new Swift_AddressEncoderException(
                        env,
                        "Non-ASCII characters in address, but no IDN encoder found (install the intl extension or the true/punycode package)",
                        address));
    }

    public static final Object CONST_class = "Swift_AddressEncoder_IdnAddressEncoder";

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
                    .setName("Swift_AddressEncoder_IdnAddressEncoder")
                    .setLookup(
                            Swift_AddressEncoder_IdnAddressEncoder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/AddressEncoder/IdnAddressEncoder.php")
                    .addInterface("Swift_AddressEncoder")
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
