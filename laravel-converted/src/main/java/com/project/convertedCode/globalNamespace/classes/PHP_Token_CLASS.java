package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_STRING;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_WHITESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_CURLY;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_EXTENDS;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_IMPLEMENTS;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_INTERFACE;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_CLASS extends PHP_Token_INTERFACE {

    public Object anonymous = false;

    public Object name = null;

    public PHP_Token_CLASS(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_CLASS.class) {
            this.__construct(env, args);
        }
    }

    public PHP_Token_CLASS(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        Object next = null;
        if (ZVal.strictNotEqualityCheck(this.name, "!==", ZVal.getNull())) {
            return ZVal.assign(this.name);
        }

        next =
                ZVal.assign(
                        new ReferenceClassProperty(this, "tokenStream", env)
                                .arrayGet(
                                        env,
                                        ZVal.add(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value(),
                                                1)));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(next, PHP_Token_WHITESPACE.class, "PHP_Token_WHITESPACE"))) {
            next =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "tokenStream", env)
                                    .arrayGet(
                                            env,
                                            ZVal.add(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("id")
                                                            .value(),
                                                    2)));
        }

        if (ZVal.isTrue(ZVal.checkInstanceType(next, PHP_Token_STRING.class, "PHP_Token_STRING"))) {
            this.name = toStringR(next, env);
            return ZVal.assign(this.name);
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                next,
                                                PHP_Token_OPEN_CURLY.class,
                                                "PHP_Token_OPEN_CURLY"))
                                || ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                next,
                                                PHP_Token_EXTENDS.class,
                                                "PHP_Token_EXTENDS")))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                next, PHP_Token_IMPLEMENTS.class, "PHP_Token_IMPLEMENTS"))) {
            this.name =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "AnonymousClass:%s#%s",
                                    env.callMethod(this, "getLine", PHP_Token_CLASS.class),
                                    env.callMethod(this, "getId", PHP_Token_CLASS.class))
                            .value();
            this.anonymous = true;
            return ZVal.assign(this.name);
        }

        return null;
    }

    @ConvertedMethod
    public Object isAnonymous(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.anonymous);
    }

    public static final Object CONST_class = "PHP_Token_CLASS";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_Token_INTERFACE.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_CLASS")
                    .setLookup(
                            PHP_Token_CLASS.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "anonymous",
                            "endTokenId",
                            "id",
                            "interfaces",
                            "line",
                            "name",
                            "text",
                            "tokenStream")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
                    .addExtendsClass("PHP_Token_INTERFACE")
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
