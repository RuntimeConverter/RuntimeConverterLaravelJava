package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_AbstractHeader;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.classes.Swift_RfcComplianceException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.RFCValidation;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.classes.Swift_AddressEncoder_IdnAddressEncoder;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/MailboxHeader.php

*/

public class Swift_Mime_Headers_MailboxHeader extends Swift_Mime_Headers_AbstractHeader {

    public Object mailboxes = ZVal.newArray();

    public Object emailValidator = null;

    public Object addressEncoder = null;

    public Swift_Mime_Headers_MailboxHeader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_Headers_MailboxHeader.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_Headers_MailboxHeader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "encoder", typeHint = "Swift_Mime_HeaderEncoder")
    @ConvertedParameter(
        index = 2,
        name = "emailValidator",
        typeHint = "Egulias\\EmailValidator\\EmailValidator"
    )
    @ConvertedParameter(
        index = 3,
        name = "addressEncoder",
        typeHint = "Swift_AddressEncoder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object encoder = assignParameter(args, 1, false);
        Object emailValidator = assignParameter(args, 2, false);
        Object addressEncoder = assignParameter(args, 3, true);
        if (null == addressEncoder) {
            addressEncoder = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        env.callMethod(this, "setFieldName", Swift_Mime_Headers_MailboxHeader.class, name);
        env.callMethod(this, "setEncoder", Swift_Mime_Headers_MailboxHeader.class, encoder);
        this.emailValidator = emailValidator;
        this.addressEncoder =
                ZVal.isDefined(ternaryExpressionTemp = addressEncoder)
                        ? ternaryExpressionTemp
                        : new Swift_AddressEncoder_IdnAddressEncoder(env);
        return null;
    }

    @ConvertedMethod
    public Object getFieldType(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_TYPE_MAILBOX);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object setFieldBodyModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        this.setNameAddresses(env, model);
        return null;
    }

    @ConvertedMethod
    public Object getFieldBodyModel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getNameAddresses(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailboxes")
    public Object setNameAddresses(RuntimeEnv env, Object... args) {
        Object mailboxes = assignParameter(args, 0, false);
        this.mailboxes = this.normalizeMailboxes(env, rToArrayCast(mailboxes));
        env.callMethod(
                this, "setCachedValue", Swift_Mime_Headers_MailboxHeader.class, ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    public Object getNameAddressStrings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.createNameAddressStrings(env, this.getNameAddresses(env)));
    }

    @ConvertedMethod
    public Object getNameAddresses(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.mailboxes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    public Object setAddresses(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        this.setNameAddresses(
                env, function_array_values.f.env(env).call(rToArrayCast(addresses)).value());
        return null;
    }

    @ConvertedMethod
    public Object getAddresses(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.mailboxes).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "addresses")
    public Object removeAddresses(RuntimeEnv env, Object... args) {
        Object addresses = assignParameter(args, 0, false);
        Object address = null;
        env.callMethod(
                this, "setCachedValue", Swift_Mime_Headers_MailboxHeader.class, ZVal.getNull());
        for (ZPair zpairResult1536 : ZVal.getIterable(rToArrayCast(addresses), env, true)) {
            address = ZVal.assign(zpairResult1536.getValue());
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "mailboxes", env),
                    env,
                    address);
        }

        return null;
    }

    @ConvertedMethod
    public Object getFieldBody(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.callMethod(this, "getCachedValue", Swift_Mime_Headers_MailboxHeader.class))) {
            env.callMethod(
                    this,
                    "setCachedValue",
                    Swift_Mime_Headers_MailboxHeader.class,
                    this.createMailboxListString(env, this.mailboxes));
        }

        return ZVal.assign(
                env.callMethod(this, "getCachedValue", Swift_Mime_Headers_MailboxHeader.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailboxes", typeHint = "array")
    protected Object normalizeMailboxes(RuntimeEnv env, Object... args) {
        Object mailboxes = assignParameter(args, 0, false);
        ReferenceContainer actualMailboxes = new BasicReferenceContainer(null);
        Object address = null;
        Object name = null;
        Object value = null;
        Object key = null;
        actualMailboxes.setObject(ZVal.newArray());
        for (ZPair zpairResult1537 : ZVal.getIterable(mailboxes, env, false)) {
            key = ZVal.assign(zpairResult1537.getKey());
            value = ZVal.assign(zpairResult1537.getValue());
            if (function_is_string.f.env(env).call(key).getBool()) {
                address = ZVal.assign(key);
                name = ZVal.assign(value);

            } else {
                address = ZVal.assign(value);
                name = ZVal.getNull();
            }

            this.assertValidAddress(env, address);
            actualMailboxes.arrayAccess(env, address).set(name);
        }

        return ZVal.assign(actualMailboxes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "displayName")
    @ConvertedParameter(
        index = 1,
        name = "shorten",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object createDisplayNameString(RuntimeEnv env, Object... args) {
        Object displayName = assignParameter(args, 0, false);
        Object shorten = assignParameter(args, 1, true);
        if (null == shorten) {
            shorten = false;
        }
        return ZVal.assign(
                env.callMethod(
                        this,
                        "createPhrase",
                        Swift_Mime_Headers_MailboxHeader.class,
                        this,
                        displayName,
                        env.callMethod(this, "getCharset", Swift_Mime_Headers_MailboxHeader.class),
                        env.callMethod(this, "getEncoder", Swift_Mime_Headers_MailboxHeader.class),
                        shorten));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailboxes", typeHint = "array")
    protected Object createMailboxListString(RuntimeEnv env, Object... args) {
        Object mailboxes = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(", ", this.createNameAddressStrings(env, mailboxes))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    protected Object tokenNeedsEncoding(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .call("/[()<>\\[\\]:;@\\,.\"]/", token)
                                        .value())
                        || ZVal.toBool(super.tokenNeedsEncoding(env, token)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mailboxes", typeHint = "array")
    private Object createNameAddressStrings(RuntimeEnv env, Object... args) {
        Object mailboxes = assignParameter(args, 0, false);
        Object mailboxStr = null;
        ReferenceContainer strings = new BasicReferenceContainer(null);
        Object nameStr = null;
        Object name = null;
        Object email = null;
        strings.setObject(ZVal.newArray());
        for (ZPair zpairResult1538 : ZVal.getIterable(mailboxes, env, false)) {
            email = ZVal.assign(zpairResult1538.getKey());
            name = ZVal.assign(zpairResult1538.getValue());
            mailboxStr =
                    env.callMethod(
                            this.addressEncoder,
                            "encodeString",
                            Swift_Mime_Headers_MailboxHeader.class,
                            email);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", name)) {
                nameStr =
                        this.createDisplayNameString(env, name, ZVal.isEmpty(strings.getObject()));
                mailboxStr = toStringR(nameStr, env) + " <" + toStringR(mailboxStr, env) + ">";
            }

            strings.arrayAppend(env).set(mailboxStr);
        }

        return ZVal.assign(strings.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "address")
    private Object assertValidAddress(RuntimeEnv env, Object... args) {
        Object address = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        this.emailValidator,
                        "isValid",
                        Swift_Mime_Headers_MailboxHeader.class,
                        address,
                        new RFCValidation(env)))) {
            throw ZVal.getException(
                    env,
                    new Swift_RfcComplianceException(
                            env,
                            "Address in mailbox given ["
                                    + toStringR(address, env)
                                    + "] does not comply with RFC 2822, 3.6.2."));
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Mime_Headers_MailboxHeader";

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
                    .setName("Swift_Mime_Headers_MailboxHeader")
                    .setLookup(
                            Swift_Mime_Headers_MailboxHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addressEncoder",
                            "cachedValue",
                            "charset",
                            "emailValidator",
                            "encoder",
                            "lang",
                            "lineLength",
                            "mailboxes",
                            "name")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/MailboxHeader.php")
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
