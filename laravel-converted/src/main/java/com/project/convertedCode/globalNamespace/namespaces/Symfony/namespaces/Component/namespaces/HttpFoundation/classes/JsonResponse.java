package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import com.runtimeconverter.runtime.nativeClasses.spl.misc.ArrayObject;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/JsonResponse.php

*/

public class JsonResponse extends Response {

    public Object data = null;

    public Object callback = null;

    public Object encodingOptions = CONST_DEFAULT_ENCODING_OPTIONS;

    public JsonResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JsonResponse.class) {
            this.__construct(env, args);
        }
    }

    public JsonResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "status",
        typeHint = "int",
        defaultValue = "200",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "json",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, true);
        if (null == data) {
            data = ZVal.getNull();
        }
        Object status = assignParameter(args, 1, true);
        if (null == status) {
            status = 200;
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object json = assignParameter(args, 3, true);
        if (null == json) {
            json = false;
        }
        super.__construct(env, "", status, headers);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", data)) {
            data = new ArrayObject(env);
        }

        ZVal.ternaryExpression(
                ZVal.isTrue(json) ? this.setJson(env, data) : this.setData(env, data));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setCallback(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object reserved = null;
        Object part = null;
        Object pattern = null;
        Object parts = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callback)) {
            pattern =
                    "/^[$_\\p{L}][$_\\p{L}\\p{Mn}\\p{Mc}\\p{Nd}\\p{Pc}\\x{200C}\\x{200D}]*(?:\\[(?:\"(?:\\\\.|[^\"\\\\])*\"|'(?:\\\\.|[^'\\\\])*'|\\d+)\\])*?$/u";
            reserved =
                    ZVal.arrayFromLambdaExpression(
                            /* Lambda can be removed if method size limit (64kb) is not an issue. */
                            () -> {
                                return ZVal.arrayFromList(
                                        "break",
                                        "do",
                                        "instanceof",
                                        "typeof",
                                        "case",
                                        "else",
                                        "new",
                                        "var",
                                        "catch",
                                        "finally",
                                        "return",
                                        "void",
                                        "continue",
                                        "for",
                                        "switch",
                                        "while",
                                        "debugger",
                                        "function",
                                        "this",
                                        "with",
                                        "default",
                                        "if",
                                        "throw",
                                        "delete",
                                        "in",
                                        "try",
                                        "class",
                                        "enum",
                                        "extends",
                                        "super",
                                        "const",
                                        "export",
                                        "import",
                                        "implements",
                                        "let",
                                        "private",
                                        "public",
                                        "yield",
                                        "interface",
                                        "package",
                                        "protected",
                                        "static",
                                        "null",
                                        "true",
                                        "false");
                            });
            parts = function_explode.f.env(env).call(".", callback).value();
            for (ZPair zpairResult1860 : ZVal.getIterable(parts, env, true)) {
                part = ZVal.assign(zpairResult1860.getValue());
                if (ZVal.toBool(!function_preg_match.f.env(env).call(pattern, part).getBool())
                        || ZVal.toBool(
                                function_in_array.f.env(env).call(part, reserved, true).value())) {
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(env, "The callback name is not valid."));
                }
            }
        }

        this.callback = callback;
        return ZVal.assign(this.update(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "json")
    public Object setJson(RuntimeEnv env, Object... args) {
        Object json = assignParameter(args, 0, false);
        this.data = json;
        return ZVal.assign(this.update(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", defaultValue = "", defaultValueType = "array")
    public Object setData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object e = null;
        Object ternaryExpressionTemp = null;
        try {
            data = NamespaceGlobal.json_encode.env(env).call(data, this.encodingOptions).value();
        } catch (ConvertedException convertedException256) {
            if (convertedException256.instanceOf(PHPException.class, "Exception")) {
                e = convertedException256.getObject();
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "Exception",
                                        "===",
                                        function_get_class.f.env(env).call(e).value()))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_strpos
                                                .f
                                                .env(env)
                                                .call(
                                                        env.callMethod(
                                                                e,
                                                                "getMessage",
                                                                JsonResponse.class),
                                                        "Failed calling ")
                                                .value()))) {
                    throw ZVal.getException(
                            env,
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    env.callMethod(
                                                            e, "getPrevious", JsonResponse.class))
                                    ? ternaryExpressionTemp
                                    : e);
                }

                throw ZVal.getException(env, e);
            } else {
                throw convertedException256;
            }
        }

        if (ZVal.strictNotEqualityCheck(
                0, "!==", NamespaceGlobal.json_last_error.env(env).call().value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, NamespaceGlobal.json_last_error_msg.env(env).call().value()));
        }

        return ZVal.assign(this.setJson(env, data));
    }

    @ConvertedMethod
    public Object getEncodingOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.encodingOptions);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "encodingOptions")
    public Object setEncodingOptions(RuntimeEnv env, Object... args) {
        Object encodingOptions = assignParameter(args, 0, false);
        this.encodingOptions = ZVal.toLong(encodingOptions);
        return ZVal.assign(
                this.setData(env, NamespaceGlobal.json_decode.env(env).call(this.data).value()));
    }

    @ConvertedMethod
    protected Object update(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.callback)) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "set",
                    JsonResponse.class,
                    "Content-Type",
                    "text/javascript");
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "setContent",
                            JsonResponse.class,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("/**/%s(%s);", this.callback, this.data)
                                    .value()));
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("headers")
                                                .value(),
                                        "has",
                                        JsonResponse.class,
                                        "Content-Type")))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                "text/javascript",
                                "===",
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("headers")
                                                .value(),
                                        "get",
                                        JsonResponse.class,
                                        "Content-Type")))) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("headers").value(),
                    "set",
                    JsonResponse.class,
                    "Content-Type",
                    "application/json");
        }

        return ZVal.assign(env.callMethod(this, "setContent", JsonResponse.class, this.data));
    }

    public static final Object CONST_DEFAULT_ENCODING_OPTIONS = 15;

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\JsonResponse";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Response.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "data",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "status",
            defaultValue = "200",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "headers",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object data = assignParameter(args, 0, true);
            if (null == data) {
                data = ZVal.getNull();
            }
            Object status = assignParameter(args, 1, true);
            if (null == status) {
                status = 200;
            }
            Object headers = assignParameter(args, 2, true);
            if (null == headers) {
                headers = ZVal.newArray();
            }
            return ZVal.assign(env.createNewWithLateStaticBindings(this, data, status, headers));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "data",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "status",
            defaultValue = "200",
            defaultValueType = "number"
        )
        @ConvertedParameter(
            index = 2,
            name = "headers",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object fromJsonString(RuntimeEnv env, Object... args) {
            Object data = assignParameter(args, 0, true);
            if (null == data) {
                data = ZVal.getNull();
            }
            Object status = assignParameter(args, 1, true);
            if (null == status) {
                status = 200;
            }
            Object headers = assignParameter(args, 2, true);
            if (null == headers) {
                headers = ZVal.newArray();
            }
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(this, data, status, headers, true));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\JsonResponse")
                    .setLookup(
                            JsonResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "callback",
                            "charset",
                            "content",
                            "data",
                            "encodingOptions",
                            "headers",
                            "statusCode",
                            "statusText",
                            "version")
                    .setFilename("vendor/symfony/http-foundation/JsonResponse.php")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\Response")
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
