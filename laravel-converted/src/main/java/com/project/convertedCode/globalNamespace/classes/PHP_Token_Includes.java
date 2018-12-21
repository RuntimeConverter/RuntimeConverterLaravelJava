package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CONSTANT_ENCAPSED_STRING;
import com.project.convertedCode.globalNamespace.classes.PHP_Token;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public abstract class PHP_Token_Includes extends PHP_Token {

    public Object name = null;

    public Object type = null;

    public PHP_Token_Includes(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_Includes.class) {
            this.__construct(env, args);
        }
    }

    public PHP_Token_Includes(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.name, "===", ZVal.getNull())) {
            this.process(env);
        }

        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.type, "===", ZVal.getNull())) {
            this.process(env);
        }

        return ZVal.assign(this.type);
    }

    @ConvertedMethod
    private Object process(RuntimeEnv env, Object... args) {
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_Includes.class));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        tokens.arrayGet(
                                env,
                                ZVal.add(
                                        toObjectR(this).accessProp(this, env).name("id").value(),
                                        2)),
                        PHP_Token_CONSTANT_ENCAPSED_STRING.class,
                        "PHP_Token_CONSTANT_ENCAPSED_STRING"))) {
            this.name =
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    tokens.arrayGet(
                                            env,
                                            ZVal.add(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("id")
                                                            .value(),
                                                    2)),
                                    "'\"")
                            .value();
            this.type =
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
                                                                            env,
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name("id")
                                                                                    .value()))
                                                            .value())
                                            .value())
                            .value();
        }

        return null;
    }

    public static final Object CONST_class = "PHP_Token_Includes";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHP_Token.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_Includes")
                    .setLookup(
                            PHP_Token_Includes.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("id", "line", "name", "text", "tokenStream", "type")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token.php")
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
