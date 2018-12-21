package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Swift_SwiftException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.mb_convert_encoding;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_SimpleMimeEntity;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/MimePart.php

*/

public class Swift_Mime_MimePart extends Swift_Mime_SimpleMimeEntity {

    public Object userFormat = null;

    public Object userCharset = null;

    public Object userDelSp = null;

    public Swift_Mime_MimePart(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.nestingLevel = CONST_LEVEL_ALTERNATIVE;
        if (this.getClass() == Swift_Mime_MimePart.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_MimePart(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "Swift_Mime_SimpleHeaderSet")
    @ConvertedParameter(index = 1, name = "encoder", typeHint = "Swift_Mime_ContentEncoder")
    @ConvertedParameter(index = 2, name = "cache", typeHint = "Swift_KeyCache")
    @ConvertedParameter(index = 3, name = "idGenerator", typeHint = "Swift_IdGenerator")
    @ConvertedParameter(
        index = 4,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object encoder = assignParameter(args, 1, false);
        Object cache = assignParameter(args, 2, false);
        Object idGenerator = assignParameter(args, 3, false);
        Object charset = assignParameter(args, 4, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        super.__construct(env, headers, encoder, cache, idGenerator);
        env.callMethod(this, "setContentType", Swift_Mime_MimePart.class, "text/plain");
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", charset)) {
            this.setCharset(env, charset);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "body")
    @ConvertedParameter(
        index = 1,
        name = "contentType",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "charset",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setBody(RuntimeEnv env, Object... args) {
        Object body = assignParameter(args, 0, false);
        Object contentType = assignParameter(args, 1, true);
        if (null == contentType) {
            contentType = ZVal.getNull();
        }
        Object charset = assignParameter(args, 2, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        if (ZVal.isset(charset)) {
            this.setCharset(env, charset);
        }

        body = this.convertString(env, body);
        super.setBody(env, body, contentType);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCharset(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getHeaderParameter",
                        Swift_Mime_MimePart.class,
                        "Content-Type",
                        "charset"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        env.callMethod(
                this,
                "setHeaderParameter",
                Swift_Mime_MimePart.class,
                "Content-Type",
                "charset",
                charset);
        if (ZVal.strictNotEqualityCheck(charset, "!==", this.userCharset)) {
            env.callMethod(this, "clearCache", Swift_Mime_MimePart.class);
        }

        this.userCharset = charset;
        super.charsetChanged(env, charset);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this,
                        "getHeaderParameter",
                        Swift_Mime_MimePart.class,
                        "Content-Type",
                        "format"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object setFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        env.callMethod(
                this,
                "setHeaderParameter",
                Swift_Mime_MimePart.class,
                "Content-Type",
                "format",
                format);
        this.userFormat = format;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getDelSp(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        "yes",
                        "===",
                        env.callMethod(
                                this,
                                "getHeaderParameter",
                                Swift_Mime_MimePart.class,
                                "Content-Type",
                                "delsp")));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "delsp",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setDelSp(RuntimeEnv env, Object... args) {
        Object delsp = assignParameter(args, 0, true);
        if (null == delsp) {
            delsp = true;
        }
        env.callMethod(
                this,
                "setHeaderParameter",
                Swift_Mime_MimePart.class,
                "Content-Type",
                "delsp",
                ZVal.isTrue(delsp) ? "yes" : ZVal.getNull());
        this.userDelSp = delsp;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getNestingLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nestingLevel);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object charsetChanged(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        this.setCharset(env, charset);
        return null;
    }

    @ConvertedMethod
    protected Object fixHeaders(RuntimeEnv env, Object... args) {
        super.fixHeaders(env);
        if (function_count
                .f
                .env(env)
                .call(env.callMethod(this, "getChildren", Swift_Mime_MimePart.class))
                .getBool()) {
            env.callMethod(
                    this,
                    "setHeaderParameter",
                    Swift_Mime_MimePart.class,
                    "Content-Type",
                    "charset",
                    ZVal.getNull());
            env.callMethod(
                    this,
                    "setHeaderParameter",
                    Swift_Mime_MimePart.class,
                    "Content-Type",
                    "format",
                    ZVal.getNull());
            env.callMethod(
                    this,
                    "setHeaderParameter",
                    Swift_Mime_MimePart.class,
                    "Content-Type",
                    "delsp",
                    ZVal.getNull());

        } else {
            this.setCharset(env, this.userCharset);
            this.setFormat(env, this.userFormat);
            this.setDelSp(env, this.userDelSp);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    protected Object setNestingLevel(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        this.nestingLevel = level;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    protected Object convertString(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object charset = null;
        charset = NamespaceGlobal.strtolower.env(env).call(this.getCharset(env)).value();
        if (!function_in_array
                .f
                .env(env)
                .call(charset, ZVal.arrayFromList("utf-8", "iso-8859-1", "iso-8859-15", ""))
                .getBool()) {
            if (function_function_exists.f.env(env).call("mb_convert_encoding").getBool()) {
                string = mb_convert_encoding.f.env(env).call(string, charset, "utf-8").value();

            } else if (function_function_exists.f.env(env).call("iconv").getBool()) {
                string =
                        NamespaceGlobal.iconv
                                .env(env)
                                .call("utf-8//TRANSLIT//IGNORE", charset, string)
                                .value();

            } else {
                throw ZVal.getException(
                        env,
                        new Swift_SwiftException(
                                env,
                                "No suitable convert encoding function (use UTF-8 as your charset or install the mbstring or iconv extension)."));
            }

            return ZVal.assign(string);
        }

        return ZVal.assign(string);
    }

    public static final Object CONST_class = "Swift_Mime_MimePart";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_SimpleMimeEntity.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_MimePart")
                    .setLookup(
                            Swift_Mime_MimePart.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativePartOrder",
                            "body",
                            "boundary",
                            "cache",
                            "cacheKey",
                            "children",
                            "compositeRanges",
                            "compoundLevelFilters",
                            "encoder",
                            "headers",
                            "id",
                            "idGenerator",
                            "immediateChildren",
                            "maxLineLength",
                            "nestingLevel",
                            "nestingLevel",
                            "userCharset",
                            "userContentType",
                            "userDelSp",
                            "userFormat")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/MimePart.php")
                    .addInterface("Swift_Mime_CharsetObserver")
                    .addInterface("Swift_Mime_EncodingObserver")
                    .addExtendsClass("Swift_Mime_SimpleMimeEntity")
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
