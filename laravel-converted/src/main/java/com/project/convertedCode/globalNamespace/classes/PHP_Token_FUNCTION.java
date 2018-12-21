package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_STRING;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_SEMICOLON;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_WHITESPACE;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_BRACKET;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_INTERFACE;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_VARIABLE;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_CURLY;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NAMESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_AMPERSAND;
import com.project.convertedCode.globalNamespace.classes.PHP_TokenWithScopeAndVisibility;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLOSE_BRACKET;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_FUNCTION extends PHP_TokenWithScopeAndVisibility {

    public Object arguments = null;

    public Object ccn = null;

    public Object name = null;

    public Object signature = null;

    public Object anonymous = false;

    public PHP_Token_FUNCTION(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_FUNCTION.class) {
            this.__construct(env, args);
        }
    }

    public PHP_Token_FUNCTION(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object typeDeclaration = null;
        if (ZVal.strictNotEqualityCheck(this.arguments, "!==", ZVal.getNull())) {
            return ZVal.assign(this.arguments);
        }

        this.arguments = ZVal.newArray();
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_FUNCTION.class));
        typeDeclaration = ZVal.getNull();
        i.setObject(ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 2));
        while (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        tokens.arrayGet(env, ZVal.subtract(i.getObject(), 1)),
                        PHP_Token_OPEN_BRACKET.class,
                        "PHP_Token_OPEN_BRACKET"))) {
            i.setObject(ZVal.increment(i.getObject()));
        }

        while (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        tokens.arrayGet(env, i.getObject()),
                        PHP_Token_CLOSE_BRACKET.class,
                        "PHP_Token_CLOSE_BRACKET"))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            tokens.arrayGet(env, i.getObject()),
                            PHP_Token_STRING.class,
                            "PHP_Token_STRING"))) {
                typeDeclaration = ZVal.assign(toStringR(tokens.arrayGet(env, i.getObject()), env));

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            tokens.arrayGet(env, i.getObject()),
                            PHP_Token_VARIABLE.class,
                            "PHP_Token_VARIABLE"))) {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, toStringR(tokens.arrayGet(env, i.getObject()), env))
                        .set(typeDeclaration);
                typeDeclaration = ZVal.getNull();
            }

            i.setObject(ZVal.increment(i.getObject()));
        }

        return ZVal.assign(this.arguments);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(this.name, "!==", ZVal.getNull())) {
            return ZVal.assign(this.name);
        }

        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_FUNCTION.class));
        i.setObject(ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 1));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        tokens.arrayGet(env, i.getObject()),
                        PHP_Token_WHITESPACE.class,
                        "PHP_Token_WHITESPACE"))) {
            i.setObject(ZVal.increment(i.getObject()));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        tokens.arrayGet(env, i.getObject()),
                        PHP_Token_AMPERSAND.class,
                        "PHP_Token_AMPERSAND"))) {
            i.setObject(ZVal.increment(i.getObject()));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        tokens.arrayGet(env, ZVal.add(i.getObject(), 1)),
                        PHP_Token_OPEN_BRACKET.class,
                        "PHP_Token_OPEN_BRACKET"))) {
            this.name = toStringR(tokens.arrayGet(env, i.getObject()), env);

        } else if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                tokens.arrayGet(env, ZVal.add(i.getObject(), 1)),
                                PHP_Token_WHITESPACE.class,
                                "PHP_Token_WHITESPACE"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                tokens.arrayGet(env, ZVal.add(i.getObject(), 2)),
                                PHP_Token_OPEN_BRACKET.class,
                                "PHP_Token_OPEN_BRACKET"))) {
            this.name = toStringR(tokens.arrayGet(env, i.getObject()), env);

        } else {
            this.anonymous = true;
            this.name =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "anonymousFunction:%s#%s",
                                    env.callMethod(this, "getLine", PHP_Token_FUNCTION.class),
                                    env.callMethod(this, "getId", PHP_Token_FUNCTION.class))
                            .value();
        }

        if (!ZVal.isTrue(this.isAnonymous(env))) {
            runtimeConverterBreakCount = 0;
            for (i.setObject(ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value()));
                    ZVal.isTrue(i.getObject());
                    i.setObject(ZVal.decrement(i.getObject()))) {
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                tokens.arrayGet(env, i.getObject()),
                                PHP_Token_NAMESPACE.class,
                                "PHP_Token_NAMESPACE"))) {
                    this.name =
                            toStringR(
                                            env.callMethod(
                                                    tokens.arrayGet(env, i.getObject()),
                                                    "getName",
                                                    PHP_Token_FUNCTION.class),
                                            env)
                                    + "\\"
                                    + toStringR(this.name, env);
                    break;
                }

                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                tokens.arrayGet(env, i.getObject()),
                                PHP_Token_INTERFACE.class,
                                "PHP_Token_INTERFACE"))) {
                    break;
                }
            }
        }

        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getCCN(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object end = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(this.ccn, "!==", ZVal.getNull())) {
            return ZVal.assign(this.ccn);
        }

        this.ccn = 1;
        end = env.callMethod(this, "getEndTokenId", PHP_Token_FUNCTION.class);
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_FUNCTION.class));
        runtimeConverterBreakCount = 0;
        for (i.setObject(ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value()));
                ZVal.isLessThanOrEqualTo(i.getObject(), "<=", end);
                i.setObject(ZVal.increment(i.getObject()))) {
            switch (toStringR(
                    function_get_class
                            .f
                            .env(env)
                            .call(tokens.arrayGet(env, i.getObject()))
                            .value())) {
                case "PHP_Token_IF":
                case "PHP_Token_ELSEIF":
                case "PHP_Token_FOR":
                case "PHP_Token_FOREACH":
                case "PHP_Token_WHILE":
                case "PHP_Token_CASE":
                case "PHP_Token_CATCH":
                case "PHP_Token_BOOLEAN_AND":
                case "PHP_Token_LOGICAL_AND":
                case "PHP_Token_BOOLEAN_OR":
                case "PHP_Token_LOGICAL_OR":
                case "PHP_Token_QUESTION_MARK":
                    this.ccn = ZVal.increment(this.ccn);
                    break;
            }
            ;
        }

        return ZVal.assign(this.ccn);
    }

    @ConvertedMethod
    public Object getSignature(RuntimeEnv env, Object... args) {
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(this.signature, "!==", ZVal.getNull())) {
            return ZVal.assign(this.signature);
        }

        if (ZVal.isTrue(this.isAnonymous(env))) {
            this.signature = "anonymousFunction";
            i.setObject(ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 1));

        } else {
            this.signature = "";
            i.setObject(ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 2));
        }

        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_FUNCTION.class));
        while (ZVal.toBool(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, i.getObject()))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        tokens.arrayGet(env, i.getObject()),
                                                        PHP_Token_OPEN_CURLY.class,
                                                        "PHP_Token_OPEN_CURLY"))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        tokens.arrayGet(env, i.getObject()),
                                        PHP_Token_SEMICOLON.class,
                                        "PHP_Token_SEMICOLON")))) {
            this.signature =
                    toStringR(this.signature, env)
                            + toStringR(tokens.arrayGet(env, ZVal.postIncrement(i)), env);
        }

        this.signature = function_trim.f.env(env).call(this.signature).value();
        return ZVal.assign(this.signature);
    }

    @ConvertedMethod
    public Object isAnonymous(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.anonymous);
    }

    public static final Object CONST_class = "PHP_Token_FUNCTION";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends PHP_TokenWithScopeAndVisibility.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_FUNCTION")
                    .setLookup(
                            PHP_Token_FUNCTION.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "anonymous",
                            "arguments",
                            "ccn",
                            "endTokenId",
                            "id",
                            "line",
                            "name",
                            "signature",
                            "text",
                            "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
                    .addExtendsClass("PHP_TokenWithScopeAndVisibility")
                    .addExtendsClass("PHP_TokenWithScope")
                    .addExtendsClass("PHP_Token")
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
