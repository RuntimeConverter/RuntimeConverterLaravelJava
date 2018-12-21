package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_AbstractHeader;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.classes.Swift_RfcComplianceException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.RFCValidation;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_AddressEncoder_IdnAddressEncoder;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/IdentificationHeader.php

*/

public class Swift_Mime_Headers_IdentificationHeader extends Swift_Mime_Headers_AbstractHeader {

    public Object ids = ZVal.newArray();

    public Object emailValidator = null;

    public Object addressEncoder = null;

    public Swift_Mime_Headers_IdentificationHeader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_Headers_IdentificationHeader.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_Headers_IdentificationHeader(NoConstructor n) {
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
        env.callMethod(this, "setFieldName", Swift_Mime_Headers_IdentificationHeader.class, name);
        this.emailValidator = emailValidator;
        this.addressEncoder =
                ZVal.isDefined(ternaryExpressionTemp = addressEncoder)
                        ? ternaryExpressionTemp
                        : new Swift_AddressEncoder_IdnAddressEncoder(env);
        return null;
    }

    @ConvertedMethod
    public Object getFieldType(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_TYPE_ID);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object setFieldBodyModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        this.setId(env, model);
        return null;
    }

    @ConvertedMethod
    public Object getFieldBodyModel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getIds(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        this.setIds(
                env,
                function_is_array.f.env(env).call(id).getBool()
                        ? id
                        : ZVal.newArray(new ZPair(0, id)));
        return null;
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        if (ZVal.isGreaterThan(function_count.f.env(env).call(this.ids).value(), '>', 0)) {
            return ZVal.assign(new ReferenceClassProperty(this, "ids", env).arrayGet(env, 0));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids", typeHint = "array")
    public Object setIds(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, false);
        Object id = null;
        ReferenceContainer actualIds = new BasicReferenceContainer(null);
        actualIds.setObject(ZVal.newArray());
        for (ZPair zpairResult1534 : ZVal.getIterable(ids, env, true)) {
            id = ZVal.assign(zpairResult1534.getValue());
            this.assertValidId(env, id);
            actualIds.arrayAppend(env).set(id);
        }

        env.callMethod(
                this,
                "clearCachedValueIf",
                Swift_Mime_Headers_IdentificationHeader.class,
                ZVal.notEqualityCheck(this.ids, actualIds.getObject()));
        this.ids = actualIds.getObject();
        return null;
    }

    @ConvertedMethod
    public Object getIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.ids);
    }

    @ConvertedMethod
    public Object getFieldBody(RuntimeEnv env, Object... args) {
        Object id = null;
        ReferenceContainer angleAddrs = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(
                env.callMethod(
                        this, "getCachedValue", Swift_Mime_Headers_IdentificationHeader.class))) {
            angleAddrs.setObject(ZVal.newArray());
            for (ZPair zpairResult1535 : ZVal.getIterable(this.ids, env, true)) {
                id = ZVal.assign(zpairResult1535.getValue());
                angleAddrs
                        .arrayAppend(env)
                        .set(
                                "<"
                                        + toStringR(
                                                env.callMethod(
                                                        this.addressEncoder,
                                                        "encodeString",
                                                        Swift_Mime_Headers_IdentificationHeader
                                                                .class,
                                                        id),
                                                env)
                                        + ">");
            }

            env.callMethod(
                    this,
                    "setCachedValue",
                    Swift_Mime_Headers_IdentificationHeader.class,
                    NamespaceGlobal.implode.env(env).call(" ", angleAddrs.getObject()).value());
        }

        return ZVal.assign(
                env.callMethod(
                        this, "getCachedValue", Swift_Mime_Headers_IdentificationHeader.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    private Object assertValidId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this.emailValidator,
                        "isValid",
                        Swift_Mime_Headers_IdentificationHeader.class,
                        id,
                        new RFCValidation(env)))) {
            throw ZVal.getException(
                    env,
                    new Swift_RfcComplianceException(
                            env, "Invalid ID given <" + toStringR(id, env) + ">"));
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Mime_Headers_IdentificationHeader";

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
                    .setName("Swift_Mime_Headers_IdentificationHeader")
                    .setLookup(
                            Swift_Mime_Headers_IdentificationHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addressEncoder",
                            "cachedValue",
                            "charset",
                            "emailValidator",
                            "encoder",
                            "ids",
                            "lang",
                            "lineLength",
                            "name")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/IdentificationHeader.php")
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
