package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_AbstractHeader;
import com.project.convertedCode.globalNamespace.classes.Swift_RfcComplianceException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.RFCValidation;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_AddressEncoder_IdnAddressEncoder;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/PathHeader.php

*/

public class Swift_Mime_Headers_PathHeader extends Swift_Mime_Headers_AbstractHeader {

    public Object address = null;

    public Object emailValidator = null;

    public Object addressEncoder = null;

    public Swift_Mime_Headers_PathHeader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_Headers_PathHeader.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_Headers_PathHeader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "emailValidator",
        typeHint = "Egulias\\EmailValidator\\EmailValidator"
    )
    @ConvertedParameter(
        index = 2,
        name = "addressEncoder",
        typeHint = "Swift_AddressEncoder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object emailValidator = assignParameter(args, 1, false);
        Object addressEncoder = assignParameter(args, 2, true);
        if (null == addressEncoder) {
            addressEncoder = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        env.callMethod(this, "setFieldName", Swift_Mime_Headers_PathHeader.class, name);
        this.emailValidator = emailValidator;
        this.addressEncoder =
                ZVal.isDefined(ternaryExpressionTemp = addressEncoder)
                        ? ternaryExpressionTemp
                        : new Swift_AddressEncoder_IdnAddressEncoder(env);
        return null;
    }

    @ConvertedMethod
    public Object getFieldType(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_TYPE_PATH);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object setFieldBodyModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        this.setAddress(env, model);
        return null;
    }

    @ConvertedMethod
    public Object getFieldBodyModel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getAddress(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    public Object setAddress(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", address)) {
            this.address = ZVal.getNull();

        } else if (ZVal.equalityCheck("", address)) {
            this.address = "";

        } else {
            this.assertValidAddress(env, address);
            this.address = address;
        }

        env.callMethod(this, "setCachedValue", Swift_Mime_Headers_PathHeader.class, ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    public Object getAddress(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.address);
    }

    @ConvertedMethod
    public Object getFieldBody(RuntimeEnv env, Object... args) {
        Object address = null;
        if (!ZVal.isTrue(
                env.callMethod(this, "getCachedValue", Swift_Mime_Headers_PathHeader.class))) {
            if (ZVal.isset(this.address)) {
                address =
                        env.callMethod(
                                this.addressEncoder,
                                "encodeString",
                                Swift_Mime_Headers_PathHeader.class,
                                this.address);
                env.callMethod(
                        this,
                        "setCachedValue",
                        Swift_Mime_Headers_PathHeader.class,
                        "<" + toStringR(address, env) + ">");
            }
        }

        return ZVal.assign(
                env.callMethod(this, "getCachedValue", Swift_Mime_Headers_PathHeader.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    private Object assertValidAddress(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this.emailValidator,
                        "isValid",
                        Swift_Mime_Headers_PathHeader.class,
                        address,
                        new RFCValidation(env)))) {
            throw ZVal.getException(
                    env,
                    new Swift_RfcComplianceException(
                            env,
                            "Address set in PathHeader does not comply with addr-spec of RFC 2822."));
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Mime_Headers_PathHeader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_Headers_AbstractHeader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_Headers_PathHeader")
                    .setLookup(
                            Swift_Mime_Headers_PathHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "address",
                            "addressEncoder",
                            "cachedValue",
                            "charset",
                            "emailValidator",
                            "encoder",
                            "lang",
                            "lineLength",
                            "name")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/PathHeader.php")
                    .addInterface("Swift_Mime_Header")
                    .addExtendsClass("Swift_Mime_Headers_AbstractHeader")
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
