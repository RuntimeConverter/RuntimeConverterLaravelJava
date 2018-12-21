package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_PRIVATE;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_FINAL;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_STATIC;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_PUBLIC;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_PROTECTED;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.PHP_TokenWithScope;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_ABSTRACT;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public abstract class PHP_TokenWithScopeAndVisibility extends PHP_TokenWithScope {

    public PHP_TokenWithScopeAndVisibility(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_TokenWithScopeAndVisibility.class) {
            this.__construct(env, args);
        }
    }

    public PHP_TokenWithScopeAndVisibility(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getVisibility(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object i = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_TokenWithScopeAndVisibility.class));
        runtimeConverterBreakCount = 0;
        for (i = ZVal.subtract(toObjectR(this).accessProp(this, env).name("id").value(), 2);
                ZVal.isGreaterThan(
                        i,
                        '>',
                        ZVal.subtract(toObjectR(this).accessProp(this, env).name("id").value(), 7));
                i = ZAssignment.subtract("-=", i, 2)) {
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, i))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    tokens.arrayGet(env, i),
                                                                    PHP_Token_PRIVATE.class,
                                                                    "PHP_Token_PRIVATE"))
                                                    || ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    tokens.arrayGet(env, i),
                                                                    PHP_Token_PROTECTED.class,
                                                                    "PHP_Token_PROTECTED")))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    tokens.arrayGet(env, i),
                                                    PHP_Token_PUBLIC.class,
                                                    "PHP_Token_PUBLIC")))) {
                return ZVal.assign(
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(
                                                        "PHP_Token_",
                                                        "",
                                                        function_get_class
                                                                .f
                                                                .env(env)
                                                                .call(tokens.arrayGet(env, i))
                                                                .value())
                                                .value())
                                .value());
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, i))
                    && ZVal.toBool(
                            !ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    tokens.arrayGet(env, i),
                                                                    PHP_Token_STATIC.class,
                                                                    "PHP_Token_STATIC"))
                                                    || ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    tokens.arrayGet(env, i),
                                                                    PHP_Token_FINAL.class,
                                                                    "PHP_Token_FINAL")))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    tokens.arrayGet(env, i),
                                                    PHP_Token_ABSTRACT.class,
                                                    "PHP_Token_ABSTRACT")))) {
                break;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getKeywords(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer keywords = new BasicReferenceContainer(null);
        Object i = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        keywords.setObject(ZVal.newArray());
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_TokenWithScopeAndVisibility.class));
        runtimeConverterContinueCount = 0;
        for (i = ZVal.subtract(toObjectR(this).accessProp(this, env).name("id").value(), 2);
                ZVal.isGreaterThan(
                        i,
                        '>',
                        ZVal.subtract(toObjectR(this).accessProp(this, env).name("id").value(), 7));
                i = ZAssignment.subtract("-=", i, 2)) {
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, i))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    tokens.arrayGet(env, i),
                                                                    PHP_Token_PRIVATE.class,
                                                                    "PHP_Token_PRIVATE"))
                                                    || ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    tokens.arrayGet(env, i),
                                                                    PHP_Token_PROTECTED.class,
                                                                    "PHP_Token_PROTECTED")))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    tokens.arrayGet(env, i),
                                                    PHP_Token_PUBLIC.class,
                                                    "PHP_Token_PUBLIC")))) {
                continue;
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, i))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    tokens.arrayGet(env, i),
                                                                    PHP_Token_STATIC.class,
                                                                    "PHP_Token_STATIC"))
                                                    || ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    tokens.arrayGet(env, i),
                                                                    PHP_Token_FINAL.class,
                                                                    "PHP_Token_FINAL")))
                                    || ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    tokens.arrayGet(env, i),
                                                    PHP_Token_ABSTRACT.class,
                                                    "PHP_Token_ABSTRACT")))) {
                keywords.arrayAppend(env)
                        .set(
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "PHP_Token_",
                                                                "",
                                                                function_get_class
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                tokens.arrayGet(
                                                                                        env, i))
                                                                        .value())
                                                        .value())
                                        .value());
            }
        }

        return ZVal.assign(
                NamespaceGlobal.implode.env(env).call(",", keywords.getObject()).value());
    }

    public static final Object CONST_class = "PHP_TokenWithScopeAndVisibility";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_TokenWithScope.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_TokenWithScopeAndVisibility")
                    .setLookup(
                            PHP_TokenWithScopeAndVisibility.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("endTokenId", "id", "line", "text", "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
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
