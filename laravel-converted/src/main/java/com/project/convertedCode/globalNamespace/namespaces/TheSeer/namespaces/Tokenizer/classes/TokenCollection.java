package com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.Token;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.TokenCollectionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_next;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/theseer/tokenizer/src/TokenCollection.php

*/

public class TokenCollection extends RuntimeClassBase implements ArrayAccess, Iterator, Countable {

    public Object tokens = ZVal.newArray();

    public Object pos = null;

    public TokenCollection(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TokenCollection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token", typeHint = "TheSeer\\Tokenizer\\Token")
    public Object addToken(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "tokens", env).arrayAppend(env).set(token);
        return null;
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_current.f.env(env).call(this.tokens).value());
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_key.f.env(env).call(this.tokens).value());
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        function_next.f.env(env).call(this.tokens);
        this.pos = ZVal.increment(this.pos);
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isGreaterThan(this.count(env), '>', this.pos));
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        function_reset.f.env(env).call(this.tokens);
        this.pos = 0;
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.tokens).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "tokens", env),
                        env,
                        offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.offsetExists(env, offset))) {
            throw ZVal.getException(
                    env,
                    new TokenCollectionException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("No Token at offest %s", offset)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "tokens", env).arrayGet(env, offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object type = null;
        if (!function_is_int.f.env(env).call(offset).getBool()) {
            type = NamespaceGlobal.gettype.env(env).call(offset).value();
            throw ZVal.getException(
                    env,
                    new TokenCollectionException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Offset must be of type integer, %s given",
                                            ZVal.strictEqualityCheck(type, "===", "object")
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(value)
                                                            .value()
                                                    : type)
                                    .value()));
        }

        if (!ZVal.isTrue(ZVal.checkInstanceType(value, Token.class, "TheSeer\\Tokenizer\\Token"))) {
            type = NamespaceGlobal.gettype.env(env).call(value).value();
            throw ZVal.getException(
                    env,
                    new TokenCollectionException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Value must be of type %s, %s given",
                                            Token.CONST_class,
                                            ZVal.strictEqualityCheck(type, "===", "object")
                                                    ? function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(value)
                                                            .value()
                                                    : type)
                                    .value()));
        }

        new ReferenceClassProperty(this, "tokens", env).arrayAccess(env, offset).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "tokens", env), env, offset);
        return null;
    }

    public static final Object CONST_class = "TheSeer\\Tokenizer\\TokenCollection";

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
                    .setName("TheSeer\\Tokenizer\\TokenCollection")
                    .setLookup(
                            TokenCollection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("pos", "tokens")
                    .setFilename("vendor/theseer/tokenizer/src/TokenCollection.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addInterface("Countable")
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
