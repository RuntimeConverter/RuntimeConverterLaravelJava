package com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Error.php

*/

public class Error extends RuntimeException {

    public Object rawMessage = null;

    public Object attributes = null;

    public Error(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Error.class) {
            this.__construct(env, args);
        }
    }

    public Error(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        this.rawMessage = message;
        if (function_is_array.f.env(env).call(attributes).getBool()) {
            this.attributes = attributes;

        } else {
            this.attributes = ZVal.newArray(new ZPair("startLine", attributes));
        }

        this.updateMessage(env);
        return null;
    }

    @ConvertedMethod
    public Object getRawMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.rawMessage);
    }

    @ConvertedMethod
    public Object getStartLine(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "startLine"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getEndLine(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "attributes", env)
                                                .arrayGet(env, "endLine"))
                        ? ternaryExpressionTemp
                        : -1);
    }

    @ConvertedMethod
    public Object getAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object setAttributes(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        this.attributes = attributes;
        this.updateMessage(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    public Object setRawMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.rawMessage = message;
        this.updateMessage(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line", typeHint = "int")
    public Object setStartLine(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "attributes", env).arrayAccess(env, "startLine").set(line);
        this.updateMessage(env);
        return null;
    }

    @ConvertedMethod
    public Object hasColumnInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "attributes", env),
                                        env,
                                        "startFilePos"))
                        && ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "attributes", env),
                                        env,
                                        "endFilePos")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    public Object getStartColumn(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.hasColumnInfo(env))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Error does not have column information"));
        }

        return ZVal.assign(
                this.toColumn(
                        env,
                        code,
                        new ReferenceClassProperty(this, "attributes", env)
                                .arrayGet(env, "startFilePos")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    public Object getEndColumn(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.hasColumnInfo(env))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Error does not have column information"));
        }

        return ZVal.assign(
                this.toColumn(
                        env,
                        code,
                        new ReferenceClassProperty(this, "attributes", env)
                                .arrayGet(env, "endFilePos")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    public Object getMessageWithColumnInfo(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s from %d:%d to %d:%d",
                                this.getRawMessage(env),
                                this.getStartLine(env),
                                this.getStartColumn(env, code),
                                this.getEndLine(env),
                                this.getEndColumn(env, code))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    @ConvertedParameter(index = 1, name = "pos", typeHint = "int")
    private Object toColumn(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object pos = assignParameter(args, 1, false);
        Object lineStartPos = null;
        if (ZVal.isGreaterThan(pos, '>', function_strlen.f.env(env).call(code).value())) {
            throw ZVal.getException(env, new RuntimeException(env, "Invalid position information"));
        }

        lineStartPos =
                NamespaceGlobal.strrpos
                        .env(env)
                        .call(
                                code,
                                "\n",
                                ZVal.subtract(pos, function_strlen.f.env(env).call(code).value()))
                        .value();
        if (ZVal.strictEqualityCheck(false, "===", lineStartPos)) {
            lineStartPos = -1;
        }

        return ZVal.assign(ZVal.subtract(pos, lineStartPos));
    }

    @ConvertedMethod
    protected Object updateMessage(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("message").set(this.rawMessage);
        if (ZVal.strictEqualityCheck(-1, "===", this.getStartLine(env))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("message")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("message")
                                                    .value(),
                                            env)
                                    + " on unknown line");

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("message")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("message")
                                                    .value(),
                                            env)
                                    + " on line "
                                    + toStringR(this.getStartLine(env), env));
        }

        return null;
    }

    public static final Object CONST_class = "PhpParser\\Error";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Error")
                    .setLookup(
                            Error.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "rawMessage")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Error.php")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
