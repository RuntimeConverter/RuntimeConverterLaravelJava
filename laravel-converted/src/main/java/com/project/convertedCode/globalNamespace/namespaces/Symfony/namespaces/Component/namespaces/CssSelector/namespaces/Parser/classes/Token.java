package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/Token.php

*/

public class Token extends RuntimeClassBase {

    public Object type = null;

    public Object value = null;

    public Object position = null;

    public Token(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Token.class) {
            this.__construct(env, args);
        }
    }

    public Token(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "position")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object position = assignParameter(args, 2, false);
        this.type = type;
        this.value = value;
        this.position = position;
        return null;
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.type);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object getPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.position);
    }

    @ConvertedMethod
    public Object isFileEnd(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_TYPE_FILE_END, "===", this.type));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "values",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object isDelimiter(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        if (ZVal.strictNotEqualityCheck(CONST_TYPE_DELIMITER, "!==", this.type)) {
            return ZVal.assign(false);
        }

        if (ZVal.isEmpty(values)) {
            return ZVal.assign(true);
        }

        return ZVal.assign(function_in_array.f.env(env).call(this.value, values).value());
    }

    @ConvertedMethod
    public Object isWhitespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_TYPE_WHITESPACE, "===", this.type));
    }

    @ConvertedMethod
    public Object isIdentifier(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_TYPE_IDENTIFIER, "===", this.type));
    }

    @ConvertedMethod
    public Object isHash(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_TYPE_HASH, "===", this.type));
    }

    @ConvertedMethod
    public Object isNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_TYPE_NUMBER, "===", this.type));
    }

    @ConvertedMethod
    public Object isString(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_TYPE_STRING, "===", this.type));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.value)) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call("<%s \"%s\" at %s>", this.type, this.value, this.position)
                            .value());
        }

        return ZVal.assign(
                function_sprintf.f.env(env).call("<%s at %s>", this.type, this.position).value());
    }

    public static final Object CONST_TYPE_FILE_END = "eof";

    public static final Object CONST_TYPE_DELIMITER = "delimiter";

    public static final Object CONST_TYPE_WHITESPACE = "whitespace";

    public static final Object CONST_TYPE_IDENTIFIER = "identifier";

    public static final Object CONST_TYPE_HASH = "hash";

    public static final Object CONST_TYPE_NUMBER = "number";

    public static final Object CONST_TYPE_STRING = "string";

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Parser\\Token";

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
                    .setName("Symfony\\Component\\CssSelector\\Parser\\Token")
                    .setLookup(
                            Token.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("position", "type", "value")
                    .setFilename("vendor/symfony/css-selector/Parser/Token.php")
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
