package com.project.convertedCode.globalNamespace.namespaces.Doctrine.namespaces.Common.namespaces.Lexer.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/doctrine/lexer/lib/Doctrine/Common/Lexer/AbstractLexer.php

*/

public abstract class AbstractLexer extends RuntimeClassBase {

    public Object input = null;

    public Object tokens = ZVal.newArray();

    public Object position = 0;

    public Object peek = 0;

    public Object lookahead = null;

    public Object token = null;

    public AbstractLexer(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractLexer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    public Object setInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        this.input = input;
        this.tokens = ZVal.newArray();
        this.reset(env);
        this.scan(env, input);
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.lookahead = ZVal.getNull();
        this.token = ZVal.getNull();
        this.peek = 0;
        this.position = 0;
        return null;
    }

    @ConvertedMethod
    public Object resetPeek(RuntimeEnv env, Object... args) {
        this.peek = 0;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "position",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object resetPosition(RuntimeEnv env, Object... args) {
        Object position = assignParameter(args, 0, true);
        if (null == position) {
            position = 0;
        }
        this.position = position;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "position")
    public Object getInputUntilPosition(RuntimeEnv env, Object... args) {
        Object position = assignParameter(args, 0, false);
        return ZVal.assign(function_substr.f.env(env).call(this.input, 0, position).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object isNextToken(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.lookahead))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        new ReferenceClassProperty(this, "lookahead", env)
                                                .arrayGet(env, "type"),
                                        "===",
                                        token)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object isNextTokenAny(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.lookahead))
                        && ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(this, "lookahead", env)
                                                        .arrayGet(env, "type"),
                                                tokens,
                                                true)
                                        .value()));
    }

    @ConvertedMethod
    public Object moveNext(RuntimeEnv env, Object... args) {
        this.peek = 0;
        this.token = this.lookahead;
        this.lookahead =
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "tokens", env),
                                env,
                                this.position)
                        ? new ReferenceClassProperty(this, "tokens", env)
                                .arrayGet(
                                        env,
                                        ZVal.postIncrement(
                                                new ReferenceClassProperty(this, "position", env)))
                        : ZVal.getNull();
        return ZVal.assign(ZVal.strictNotEqualityCheck(this.lookahead, "!==", ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object skipUntil(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        while (ZVal.toBool(ZVal.strictNotEqualityCheck(this.lookahead, "!==", ZVal.getNull()))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                new ReferenceClassProperty(this, "lookahead", env)
                                        .arrayGet(env, "type"),
                                "!==",
                                type))) {
            this.moveNext(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "token")
    public Object isA(RuntimeEnv env, Object... args) {
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object token = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        env.callMethod(
                                this,
                                new RuntimeArgsWithReferences().add(0, value),
                                "getType",
                                AbstractLexer.class,
                                value.getObject()),
                        "===",
                        token));
    }

    @ConvertedMethod
    public Object peek(RuntimeEnv env, Object... args) {
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "tokens", env),
                env,
                ZVal.add(this.position, this.peek))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "tokens", env)
                            .arrayGet(
                                    env,
                                    ZVal.add(
                                            this.position,
                                            ZVal.postIncrement(
                                                    new ReferenceClassProperty(
                                                            this, "peek", env)))));

        } else {
            return ZVal.assign(ZVal.getNull());
        }
    }

    @ConvertedMethod
    public Object glimpse(RuntimeEnv env, Object... args) {
        Object peek = null;
        peek = this.peek(env);
        this.peek = 0;
        return ZVal.assign(peek);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    protected Object scan(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        ReferenceContainer regex = new BasicReferenceContainer(null);
        Object flags = null;
        ReferenceContainer match = new BasicReferenceContainer(null);
        Object type = null;
        Object matches = null;
        regex = env.getInlineStatic(1, null);
        if (!ZVal.isset(regex.getObject())) {
            regex.setObject(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "/(%s)|%s/%s",
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    ")|(",
                                                    env.callMethod(
                                                            this,
                                                            "getCatchablePatterns",
                                                            AbstractLexer.class))
                                            .value(),
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    "|",
                                                    env.callMethod(
                                                            this,
                                                            "getNonCatchablePatterns",
                                                            AbstractLexer.class))
                                            .value(),
                                    this.getModifiers(env))
                            .value());
        }

        flags = ZVal.toLong(ZVal.toLong(1) | ZVal.toLong(2)) | ZVal.toLong(4);
        matches =
                NamespaceGlobal.preg_split
                        .env(env)
                        .call(regex.getObject(), input, -1, flags)
                        .value();
        for (ZPair zpairResult14 : ZVal.getIterable(matches, env, true)) {
            match.setObject(ZVal.assign(zpairResult14.getValue()));
            type =
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences()
                                    .add(0, new ArrayDimensionReference(match.getObject(), 0)),
                            "getType",
                            AbstractLexer.class,
                            match.arrayGet(env, 0));
            new ReferenceClassProperty(this, "tokens", env)
                    .arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair("value", match.arrayGet(env, 0)),
                                    new ZPair("type", type),
                                    new ZPair("position", match.arrayGet(env, 1))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    public Object getLiteral(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object reflClass = null;
        Object name = null;
        Object className = null;
        Object constants = null;
        Object value = null;
        className = function_get_class.f.env(env).call(this).value();
        reflClass = new ReflectionClass(env, className);
        constants = env.callMethod(reflClass, "getConstants", AbstractLexer.class);
        for (ZPair zpairResult15 : ZVal.getIterable(constants, env, false)) {
            name = ZVal.assign(zpairResult15.getKey());
            value = ZVal.assign(zpairResult15.getValue());
            if (ZVal.strictEqualityCheck(value, "===", token)) {
                return ZVal.assign(toStringR(className, env) + "::" + toStringR(name, env));
            }
        }

        return ZVal.assign(token);
    }

    @ConvertedMethod
    protected Object getModifiers(RuntimeEnv env, Object... args) {
        return "i";
    }

    public static final Object CONST_class = "Doctrine\\Common\\Lexer\\AbstractLexer";

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
                    .setName("Doctrine\\Common\\Lexer\\AbstractLexer")
                    .setLookup(
                            AbstractLexer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("input", "lookahead", "peek", "position", "token", "tokens")
                    .setFilename(
                            "vendor/doctrine/lexer/lib/Doctrine/Common/Lexer/AbstractLexer.php")
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
