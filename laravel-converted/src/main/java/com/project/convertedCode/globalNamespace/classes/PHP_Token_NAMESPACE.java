package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NS_SEPARATOR;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.classes.PHP_TokenWithScope;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_NAMESPACE extends PHP_TokenWithScope {

    public PHP_Token_NAMESPACE(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_NAMESPACE.class) {
            this.__construct(env, args);
        }
    }

    public PHP_Token_NAMESPACE(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object namespace = null;
        Object i = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_NAMESPACE.class));
        namespace =
                ZVal.assign(
                        toStringR(
                                tokens.arrayGet(
                                        env,
                                        ZVal.add(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value(),
                                                2)),
                                env));
        runtimeConverterBreakCount = 0;
        for (i = ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 3);
                ZVal.isTrue(true);
                i = ZAssignment.add("+=", i, 2)) {
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, i))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    tokens.arrayGet(env, i),
                                    PHP_Token_NS_SEPARATOR.class,
                                    "PHP_Token_NS_SEPARATOR"))) {
                namespace =
                        toStringR(namespace, env)
                                + "\\"
                                + toStringR(tokens.arrayGet(env, ZVal.add(i, 1)), env);

            } else {
                break;
            }
        }

        return ZVal.assign(namespace);
    }

    public static final Object CONST_class = "PHP_Token_NAMESPACE";

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
                    .setName("PHP_Token_NAMESPACE")
                    .setLookup(
                            PHP_Token_NAMESPACE.class,
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
