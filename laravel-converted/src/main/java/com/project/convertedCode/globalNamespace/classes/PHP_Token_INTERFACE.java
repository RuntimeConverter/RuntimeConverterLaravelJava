package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_STRING;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_WHITESPACE;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_IMPLEMENTS;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_CURLY;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_EXTENDS;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NAMESPACE;
import com.project.convertedCode.globalNamespace.classes.PHP_TokenWithScopeAndVisibility;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class PHP_Token_INTERFACE extends PHP_TokenWithScopeAndVisibility {

    public Object interfaces = null;

    public PHP_Token_INTERFACE(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_INTERFACE.class) {
            this.__construct(env, args);
        }
    }

    public PHP_Token_INTERFACE(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                        new ReferenceClassProperty(this, "tokenStream", env)
                                .arrayGet(
                                        env,
                                        ZVal.add(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value(),
                                                2)),
                        env));
    }

    @ConvertedMethod
    public Object hasParent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.checkInstanceType(
                        new ReferenceClassProperty(this, "tokenStream", env)
                                .arrayGet(
                                        env,
                                        ZVal.add(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value(),
                                                4)),
                        PHP_Token_EXTENDS.class,
                        "PHP_Token_EXTENDS"));
    }

    @ConvertedMethod
    public Object getPackage(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object docComment = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object className = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        className = this.getName(env);
        docComment = env.callMethod(this, "getDocblock", PHP_Token_INTERFACE.class);
        result.setObject(
                ZVal.newArray(
                        new ZPair("namespace", ""),
                        new ZPair("fullPackage", ""),
                        new ZPair("category", ""),
                        new ZPair("package", ""),
                        new ZPair("subpackage", "")));
        runtimeConverterBreakCount = 0;
        for (i.setObject(ZVal.assign(toObjectR(this).accessProp(this, env).name("id").value()));
                ZVal.isTrue(i.getObject());
                i.setObject(ZVal.decrement(i.getObject()))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            new ReferenceClassProperty(this, "tokenStream", env)
                                    .arrayGet(env, i.getObject()),
                            PHP_Token_NAMESPACE.class,
                            "PHP_Token_NAMESPACE"))) {
                result.arrayAccess(env, "namespace")
                        .set(
                                env.callMethod(
                                        new ReferenceClassProperty(this, "tokenStream", env)
                                                .arrayGet(env, i.getObject()),
                                        "getName",
                                        PHP_Token_INTERFACE.class));
                break;
            }
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/@category[\\s]+([\\.\\w]+)/", docComment, matches.getObject())
                .getBool()) {
            result.arrayAccess(env, "category").set(matches.arrayGet(env, 1));
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/@package[\\s]+([\\.\\w]+)/", docComment, matches.getObject())
                .getBool()) {
            result.arrayAccess(env, "package").set(matches.arrayGet(env, 1));
            result.arrayAccess(env, "fullPackage").set(matches.arrayGet(env, 1));
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/@subpackage[\\s]+([\\.\\w]+)/", docComment, matches.getObject())
                .getBool()) {
            result.arrayAccess(env, "subpackage").set(matches.arrayGet(env, 1));
            result.arrayAccess(env, "fullPackage")
                    .set(
                            toStringR(result.arrayGet(env, "fullPackage"), env)
                                    + "."
                                    + toStringR(matches.arrayGet(env, 1), env));
        }

        if (arrayActionR(ArrayAction.EMPTY, result, env, "fullPackage")) {
            result.arrayAccess(env, "fullPackage")
                    .set(
                            this.arrayToName(
                                    env,
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(
                                                    "_",
                                                    function_str_replace
                                                            .f
                                                            .env(env)
                                                            .call("\\", "_", className)
                                                            .value())
                                            .value(),
                                    "."));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parts", typeHint = "array")
    @ConvertedParameter(index = 1, name = "join")
    protected Object arrayToName(RuntimeEnv env, Object... args) {
        Object parts = assignParameter(args, 0, false);
        Object join = assignParameter(args, 1, true);
        if (null == join) {
            join = "\\";
        }
        Object result = null;
        result = "";
        if (ZVal.isGreaterThan(function_count.f.env(env).call(parts).value(), '>', 1)) {
            function_array_pop.f.env(env).call(parts);
            result = NamespaceGlobal.implode.env(env).call(join, parts).value();
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getParent(RuntimeEnv env, Object... args) {
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        Object className = null;
        if (!ZVal.isTrue(this.hasParent(env))) {
            return ZVal.assign(false);
        }

        i.setObject(ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 6));
        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_INTERFACE.class));
        className = ZVal.assign(toStringR(tokens.arrayGet(env, i.getObject()), env));
        while (ZVal.toBool(arrayActionR(ArrayAction.ISSET, tokens, env, ZVal.add(i.getObject(), 1)))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        tokens.arrayGet(env, ZVal.add(i.getObject(), 1)),
                                        PHP_Token_WHITESPACE.class,
                                        "PHP_Token_WHITESPACE")))) {
            className =
                    toStringR(className, env)
                            + toStringR(
                                    toStringR(tokens.arrayGet(env, ZVal.preIncrement(i)), env),
                                    env);
        }

        return ZVal.assign(className);
    }

    @ConvertedMethod
    public Object hasInterfaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        new ReferenceClassProperty(
                                                                this, "tokenStream", env),
                                                        env,
                                                        ZVal.add(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("id")
                                                                        .value(),
                                                                4)))
                                        && ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        new ReferenceClassProperty(
                                                                        this, "tokenStream", env)
                                                                .arrayGet(
                                                                        env,
                                                                        ZVal.add(
                                                                                toObjectR(this)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name("id")
                                                                                        .value(),
                                                                                4)),
                                                        PHP_Token_IMPLEMENTS.class,
                                                        "PHP_Token_IMPLEMENTS")))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        new ReferenceClassProperty(
                                                                this, "tokenStream", env),
                                                        env,
                                                        ZVal.add(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("id")
                                                                        .value(),
                                                                8)))
                                        && ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        new ReferenceClassProperty(
                                                                        this, "tokenStream", env)
                                                                .arrayGet(
                                                                        env,
                                                                        ZVal.add(
                                                                                toObjectR(this)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name("id")
                                                                                        .value(),
                                                                                8)),
                                                        PHP_Token_IMPLEMENTS.class,
                                                        "PHP_Token_IMPLEMENTS"))));
    }

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args) {
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(this.interfaces, "!==", ZVal.getNull())) {
            return ZVal.assign(this.interfaces);
        }

        if (!ZVal.isTrue(this.hasInterfaces(env))) {
            return ZVal.assign(this.interfaces = false);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        new ReferenceClassProperty(this, "tokenStream", env)
                                .arrayGet(
                                        env,
                                        ZVal.add(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("id")
                                                        .value(),
                                                4)),
                        PHP_Token_IMPLEMENTS.class,
                        "PHP_Token_IMPLEMENTS"))) {
            i.setObject(ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 3));

        } else {
            i.setObject(ZVal.add(toObjectR(this).accessProp(this, env).name("id").value(), 7));
        }

        tokens.setObject(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("tokenStream").value(),
                        "tokens",
                        PHP_Token_INTERFACE.class));
        while (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        tokens.arrayGet(env, ZVal.add(i.getObject(), 1)),
                        PHP_Token_OPEN_CURLY.class,
                        "PHP_Token_OPEN_CURLY"))) {
            i.setObject(ZVal.increment(i.getObject()));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            tokens.arrayGet(env, i.getObject()),
                            PHP_Token_STRING.class,
                            "PHP_Token_STRING"))) {
                new ReferenceClassProperty(this, "interfaces", env)
                        .arrayAppend(env)
                        .set(toStringR(tokens.arrayGet(env, i.getObject()), env));
            }
        }

        return ZVal.assign(this.interfaces);
    }

    public static final Object CONST_class = "PHP_Token_INTERFACE";

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
                    .setName("PHP_Token_INTERFACE")
                    .setLookup(
                            PHP_Token_INTERFACE.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "endTokenId", "id", "interfaces", "line", "text", "tokenStream")
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
