package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.NoDNSMXRecord;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.NoDNSRecord;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.EmailValidation;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Validation/DNSCheckValidation.php

*/

public class DNSCheckValidation extends RuntimeClassBase implements EmailValidation {

    public Object warnings = ZVal.newArray();

    public Object error = null;

    public DNSCheckValidation(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DNSCheckValidation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email")
    @ConvertedParameter(
        index = 1,
        name = "emailLexer",
        typeHint = "Egulias\\EmailValidator\\EmailLexer"
    )
    public Object isValid(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, false);
        Object emailLexer = assignParameter(args, 1, false);
        Object lastAtPos = null;
        Object host = null;
        host = ZVal.assign(email);
        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                lastAtPos = NamespaceGlobal.strrpos.env(env).call(email, "@").value())) {
            host = function_substr.f.env(env).call(email, ZVal.add(lastAtPos, 1)).value();
        }

        return ZVal.assign(this.checkDNS(env, host));
    }

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.error);
    }

    @ConvertedMethod
    public Object getWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.warnings);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host")
    protected Object checkDNS(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        Object MXresult = null;
        Object Aresult = null;
        host =
                toStringR(
                                function_rtrim
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.idn_to_ascii
                                                        .env(env)
                                                        .call(host, 0, 1)
                                                        .value(),
                                                ".")
                                        .value(),
                                env)
                        + ".";
        Aresult = true;
        MXresult = NamespaceGlobal.checkdnsrr.env(env).call(host, "MX").value();
        if (!ZVal.isTrue(MXresult)) {
            new ReferenceClassProperty(this, "warnings", env)
                    .arrayAccess(env, NoDNSMXRecord.CONST_CODE)
                    .set(new NoDNSMXRecord(env));
            Aresult =
                    ZVal.toBool(NamespaceGlobal.checkdnsrr.env(env).call(host, "A").value())
                            || ZVal.toBool(
                                    NamespaceGlobal.checkdnsrr.env(env).call(host, "AAAA").value());
            if (!ZVal.isTrue(Aresult)) {
                this.error = new NoDNSRecord(env);
            }
        }

        return ZVal.assign(ZVal.toBool(MXresult) || ZVal.toBool(Aresult));
    }

    public static final Object CONST_class =
            "Egulias\\EmailValidator\\Validation\\DNSCheckValidation";

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
                    .setName("Egulias\\EmailValidator\\Validation\\DNSCheckValidation")
                    .setLookup(
                            DNSCheckValidation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("error", "warnings")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Validation/DNSCheckValidation.php")
                    .addInterface("Egulias\\EmailValidator\\Validation\\EmailValidation")
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
