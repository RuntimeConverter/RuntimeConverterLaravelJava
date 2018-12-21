package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Encryption.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Encryption.classes.EncryptException;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Encryption.classes.DecryptException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_random_bytes;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Encryption/Encrypter.php

*/

public class Encrypter extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Encryption
                .classes
                .Encrypter {

    public Object key = null;

    public Object cipher = null;

    public Encrypter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Encrypter.class) {
            this.__construct(env, args);
        }
    }

    public Encrypter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "cipher")
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer key = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer cipher = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == cipher.getObject()) {
            cipher.setObject("AES-128-CBC");
        }
        key.setObject(ZVal.assign(toStringR(key.getObject(), env)));
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Encrypter.class)
                        .method("supported")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences().add(0, key).add(1, cipher))
                        .call(key.getObject(), cipher.getObject())
                        .value())) {
            this.key = key.getObject();
            this.cipher = cipher.getObject();

        } else {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "The only supported ciphers are AES-128-CBC and AES-256-CBC with the correct key lengths."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "serialize",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object encrypt(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope137 scope = new Scope137();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Encryption")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Encryption/Encrypter.php");
            scope.value = assignParameter(args, 0, false);
            scope.serialize = assignParameter(args, 1, true);
            if (null == scope.serialize) {
                scope.serialize = true;
            }
            scope.json = null;
            scope.iv = null;
            scope.mac = null;
            scope.iv =
                    function_random_bytes
                            .f
                            .env(env)
                            .call(
                                    NamespaceGlobal.openssl_cipher_iv_length
                                            .env(env)
                                            .call(this.cipher)
                                            .value())
                            .value();
            scope.value =
                    NamespaceGlobal.openssl_encrypt
                            .env(env)
                            .call(
                                    ZVal.isTrue(scope.serialize)
                                            ? function_serialize
                                                    .f
                                                    .env(env)
                                                    .call(scope.value)
                                                    .value()
                                            : scope.value,
                                    this.cipher,
                                    this.key,
                                    0,
                                    scope.iv)
                            .value();
            if (ZVal.strictEqualityCheck(scope.value, "===", false)) {
                throw ZVal.getException(
                        env, new EncryptException(env, "Could not encrypt the data."));
            }

            scope.mac =
                    this.hash(
                            env,
                            scope.iv =
                                    NamespaceGlobal.base64_encode.env(env).call(scope.iv).value(),
                            scope.value);
            scope.json =
                    NamespaceGlobal.json_encode
                            .env(env)
                            .call(
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "iv", "value", "mac")
                                            .value())
                            .value();
            if (ZVal.strictNotEqualityCheck(
                    NamespaceGlobal.json_last_error.env(env).call().value(), "!==", 0)) {
                throw ZVal.getException(
                        env, new EncryptException(env, "Could not encrypt the data."));
            }

            throw new IncludeEventException(
                    ZVal.assign(NamespaceGlobal.base64_encode.env(env).call(scope.json).value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object encryptString(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this.encrypt(env, value, false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    @ConvertedParameter(
        index = 1,
        name = "unserialize",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object decrypt(RuntimeEnv env, Object... args) {
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object unserialize = assignParameter(args, 1, true);
        if (null == unserialize) {
            unserialize = true;
        }
        Object iv = null;
        Object decrypted = null;
        payload.setObject(this.getJsonPayload(env, payload.getObject()));
        iv = NamespaceGlobal.base64_decode.env(env).call(payload.arrayGet(env, "iv")).value();
        decrypted =
                NamespaceGlobal.openssl_decrypt
                        .env(env)
                        .call(payload.arrayGet(env, "value"), this.cipher, this.key, 0, iv)
                        .value();
        if (ZVal.strictEqualityCheck(decrypted, "===", false)) {
            throw ZVal.getException(env, new DecryptException(env, "Could not decrypt the data."));
        }

        return ZVal.assign(
                ZVal.isTrue(unserialize)
                        ? function_unserialize.f.env(env).call(decrypted).value()
                        : decrypted);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    public Object decryptString(RuntimeEnv env, Object... args) {
        Object payload = assignParameter(args, 0, false);
        return ZVal.assign(this.decrypt(env, payload, false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iv")
    @ConvertedParameter(index = 1, name = "value")
    protected Object hash(RuntimeEnv env, Object... args) {
        Object iv = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                NamespaceGlobal.hash_hmac
                        .env(env)
                        .call("sha256", toStringR(iv, env) + toStringR(value, env), this.key)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    protected Object getJsonPayload(RuntimeEnv env, Object... args) {
        Object payload = assignParameter(args, 0, false);
        payload =
                NamespaceGlobal.json_decode
                        .env(env)
                        .call(NamespaceGlobal.base64_decode.env(env).call(payload).value(), true)
                        .value();
        if (!ZVal.isTrue(this.validPayload(env, payload))) {
            throw ZVal.getException(env, new DecryptException(env, "The payload is invalid."));
        }

        if (!ZVal.isTrue(this.validMac(env, payload))) {
            throw ZVal.getException(env, new DecryptException(env, "The MAC is invalid."));
        }

        return ZVal.assign(payload);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    protected Object validPayload(RuntimeEnv env, Object... args) {
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(payload.getObject())
                                                        .value())
                                        && ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                arrayActionR(
                                                                                        ArrayAction
                                                                                                .ISSET,
                                                                                        payload,
                                                                                        env,
                                                                                        "iv"))
                                                                        && ZVal.toBool(
                                                                                arrayActionR(
                                                                                        ArrayAction
                                                                                                .ISSET,
                                                                                        payload,
                                                                                        env,
                                                                                        "value")))
                                                        && ZVal.toBool(
                                                                arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        payload,
                                                                        env,
                                                                        "mac"))))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_strlen
                                                .f
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.base64_decode
                                                                .env(env)
                                                                .call(
                                                                        payload.arrayGet(env, "iv"),
                                                                        true)
                                                                .value())
                                                .value(),
                                        "===",
                                        NamespaceGlobal.openssl_cipher_iv_length
                                                .env(env)
                                                .call(this.cipher)
                                                .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload", typeHint = "array")
    protected Object validMac(RuntimeEnv env, Object... args) {
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object bytes = null;
        Object calculated = null;
        calculated =
                this.calculateMac(
                        env,
                        payload.getObject(),
                        bytes = function_random_bytes.f.env(env).call(16).value());
        return ZVal.assign(
                NamespaceGlobal.hash_equals
                        .env(env)
                        .call(
                                NamespaceGlobal.hash_hmac
                                        .env(env)
                                        .call("sha256", payload.arrayGet(env, "mac"), bytes, true)
                                        .value(),
                                calculated)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    @ConvertedParameter(index = 1, name = "bytes")
    protected Object calculateMac(RuntimeEnv env, Object... args) {
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object bytes = assignParameter(args, 1, false);
        return ZVal.assign(
                NamespaceGlobal.hash_hmac
                        .env(env)
                        .call(
                                "sha256",
                                this.hash(
                                        env,
                                        payload.arrayGet(env, "iv"),
                                        payload.arrayGet(env, "value")),
                                bytes,
                                true)
                        .value());
    }

    @ConvertedMethod
    public Object getKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.key);
    }

    public static final Object CONST_class = "Illuminate\\Encryption\\Encrypter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "key")
        @ConvertedParameter(index = 1, name = "cipher")
        public Object supported(RuntimeEnv env, Object... args) {
            Object key = assignParameter(args, 0, false);
            Object cipher = assignParameter(args, 1, false);
            Object length = null;
            length = NamespaceGlobal.mb_strlen.env(env).call(key, "8bit").value();
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            cipher, "===", "AES-128-CBC"))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(length, "===", 16)))
                            || ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            cipher, "===", "AES-256-CBC"))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(length, "===", 32))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "cipher")
        public Object generateKey(RuntimeEnv env, Object... args) {
            Object cipher = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_random_bytes
                            .f
                            .env(env)
                            .call(ZVal.equalityCheck(cipher, "AES-128-CBC") ? 16 : 32)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Encryption\\Encrypter")
                    .setLookup(
                            Encrypter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cipher", "key")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Encryption/Encrypter.php")
                    .addInterface("Illuminate\\Contracts\\Encryption\\Encrypter")
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

    private static class Scope137 implements UpdateRuntimeScopeInterface {

        Object serialize;
        Object _thisVarAlias;
        Object json;
        Object iv;
        Object value;
        Object mac;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("serialize", this.serialize);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("json", this.json);
            stack.setVariable("iv", this.iv);
            stack.setVariable("value", this.value);
            stack.setVariable("mac", this.mac);
        }

        public void updateScope(RuntimeStack stack) {

            this.serialize = stack.getVariable("serialize");
            this._thisVarAlias = stack.getVariable("this");
            this.json = stack.getVariable("json");
            this.iv = stack.getVariable("iv");
            this.value = stack.getVariable("value");
            this.mac = stack.getVariable("mac");
        }
    }
}
