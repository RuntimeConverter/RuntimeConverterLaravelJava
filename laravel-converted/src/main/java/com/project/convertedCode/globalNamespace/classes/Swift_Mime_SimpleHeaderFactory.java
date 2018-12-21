package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_CharsetObserver;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_PathHeader;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_UnstructuredHeader;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_ParameterizedHeader;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_IdentificationHeader;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_DateHeader;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_MailboxHeader;
import com.project.convertedCode.globalNamespace.classes.Swift_AddressEncoder_IdnAddressEncoder;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/SimpleHeaderFactory.php

*/

public class Swift_Mime_SimpleHeaderFactory extends RuntimeClassBase
        implements Swift_Mime_CharsetObserver {

    public Object encoder = null;

    public Object paramEncoder = null;

    public Object emailValidator = null;

    public Object charset = null;

    public Swift_Mime_SimpleHeaderFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_SimpleHeaderFactory.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_SimpleHeaderFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encoder", typeHint = "Swift_Mime_HeaderEncoder")
    @ConvertedParameter(index = 1, name = "paramEncoder", typeHint = "Swift_Encoder")
    @ConvertedParameter(
        index = 2,
        name = "emailValidator",
        typeHint = "Egulias\\EmailValidator\\EmailValidator"
    )
    @ConvertedParameter(
        index = 3,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "addressEncoder",
        typeHint = "Swift_AddressEncoder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object encoder = assignParameter(args, 0, false);
        Object paramEncoder = assignParameter(args, 1, false);
        Object emailValidator = assignParameter(args, 2, false);
        Object charset = assignParameter(args, 3, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        Object addressEncoder = assignParameter(args, 4, true);
        if (null == addressEncoder) {
            addressEncoder = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.encoder = encoder;
        this.paramEncoder = paramEncoder;
        this.emailValidator = emailValidator;
        this.charset = charset;
        toObjectR(this)
                .accessProp(this, env)
                .name("addressEncoder")
                .set(
                        ZVal.isDefined(ternaryExpressionTemp = addressEncoder)
                                ? ternaryExpressionTemp
                                : new Swift_AddressEncoder_IdnAddressEncoder(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "addresses",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object createMailboxHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object addresses = assignParameter(args, 1, true);
        if (null == addresses) {
            addresses = ZVal.getNull();
        }
        Object header = null;
        header =
                new Swift_Mime_Headers_MailboxHeader(
                        env,
                        name,
                        this.encoder,
                        this.emailValidator,
                        toObjectR(this).accessProp(this, env).name("addressEncoder").value());
        if (ZVal.isset(addresses)) {
            env.callMethod(
                    header, "setFieldBodyModel", Swift_Mime_SimpleHeaderFactory.class, addresses);
        }

        this.setHeaderCharset(env, header);
        return ZVal.assign(header);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "dateTime",
        typeHint = "DateTimeInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object createDateHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object dateTime = assignParameter(args, 1, true);
        if (null == dateTime) {
            dateTime = ZVal.getNull();
        }
        Object header = null;
        header = new Swift_Mime_Headers_DateHeader(env, name);
        if (ZVal.isset(dateTime)) {
            env.callMethod(
                    header, "setFieldBodyModel", Swift_Mime_SimpleHeaderFactory.class, dateTime);
        }

        this.setHeaderCharset(env, header);
        return ZVal.assign(header);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object createTextHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object header = null;
        header = new Swift_Mime_Headers_UnstructuredHeader(env, name, this.encoder);
        if (ZVal.isset(value)) {
            env.callMethod(
                    header, "setFieldBodyModel", Swift_Mime_SimpleHeaderFactory.class, value);
        }

        this.setHeaderCharset(env, header);
        return ZVal.assign(header);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "params", defaultValue = "", defaultValueType = "array")
    public Object createParameterizedHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        Object params = assignParameter(args, 2, true);
        if (null == params) {
            params = ZVal.newArray();
        }
        Object v = null;
        Object header = null;
        Object k = null;
        header =
                new Swift_Mime_Headers_ParameterizedHeader(
                        env,
                        name,
                        this.encoder,
                        ZVal.equalityCheck(
                                        "content-disposition",
                                        NamespaceGlobal.strtolower.env(env).call(name).value())
                                ? this.paramEncoder
                                : ZVal.getNull());
        if (ZVal.isset(value)) {
            env.callMethod(
                    header, "setFieldBodyModel", Swift_Mime_SimpleHeaderFactory.class, value);
        }

        for (ZPair zpairResult1542 : ZVal.getIterable(params, env, false)) {
            k = ZVal.assign(zpairResult1542.getKey());
            v = ZVal.assign(zpairResult1542.getValue());
            env.callMethod(header, "setParameter", Swift_Mime_SimpleHeaderFactory.class, k, v);
        }

        this.setHeaderCharset(env, header);
        return ZVal.assign(header);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "ids",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object createIdHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object ids = assignParameter(args, 1, true);
        if (null == ids) {
            ids = ZVal.getNull();
        }
        Object header = null;
        header = new Swift_Mime_Headers_IdentificationHeader(env, name, this.emailValidator);
        if (ZVal.isset(ids)) {
            env.callMethod(header, "setFieldBodyModel", Swift_Mime_SimpleHeaderFactory.class, ids);
        }

        this.setHeaderCharset(env, header);
        return ZVal.assign(header);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object createPathHeader(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object header = null;
        header = new Swift_Mime_Headers_PathHeader(env, name, this.emailValidator);
        if (ZVal.isset(path)) {
            env.callMethod(header, "setFieldBodyModel", Swift_Mime_SimpleHeaderFactory.class, path);
        }

        this.setHeaderCharset(env, header);
        return ZVal.assign(header);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.charset = charset;
        env.callMethod(
                this.encoder, "charsetChanged", Swift_Mime_SimpleHeaderFactory.class, charset);
        env.callMethod(
                this.paramEncoder, "charsetChanged", Swift_Mime_SimpleHeaderFactory.class, charset);
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.encoder = ((RuntimeClassInterface) this.encoder).phpClone(env);
        this.paramEncoder = ((RuntimeClassInterface) this.paramEncoder).phpClone(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "Swift_Mime_Header")
    private Object setHeaderCharset(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        if (ZVal.isset(this.charset)) {
            env.callMethod(
                    header, "setCharset", Swift_Mime_SimpleHeaderFactory.class, this.charset);
        }

        return null;
    }

    public static final Object CONST_class = "Swift_Mime_SimpleHeaderFactory";

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
                    .setName("Swift_Mime_SimpleHeaderFactory")
                    .setLookup(
                            Swift_Mime_SimpleHeaderFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("charset", "emailValidator", "encoder", "paramEncoder")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/SimpleHeaderFactory.php")
                    .addInterface("Swift_Mime_CharsetObserver")
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
