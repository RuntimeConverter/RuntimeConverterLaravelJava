package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.Store;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Encryption.classes.DecryptException;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Session/EncryptedStore.php

*/

public class EncryptedStore extends Store {

    public Object encrypter = null;

    public EncryptedStore(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EncryptedStore.class) {
            this.__construct(env, args);
        }
    }

    public EncryptedStore(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "handler", typeHint = "SessionHandlerInterface")
    @ConvertedParameter(
        index = 2,
        name = "encrypter",
        typeHint = "Illuminate\\Contracts\\Encryption\\Encrypter"
    )
    @ConvertedParameter(
        index = 3,
        name = "id",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object handler = assignParameter(args, 1, false);
        Object encrypter = assignParameter(args, 2, false);
        Object id = assignParameter(args, 3, true);
        if (null == id) {
            id = ZVal.getNull();
        }
        this.encrypter = encrypter;
        super.__construct(env, name, handler, id);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object prepareForUnserialize(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object e = null;
        try {
            return ZVal.assign(
                    env.callMethod(this.encrypter, "decrypt", EncryptedStore.class, data));
        } catch (ConvertedException convertedException63) {
            if (convertedException63.instanceOf(
                    DecryptException.class,
                    "Illuminate\\Contracts\\Encryption\\DecryptException")) {
                e = convertedException63.getObject();
                return ZVal.assign(function_serialize.f.env(env).call(ZVal.newArray()).value());
            } else {
                throw convertedException63;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object prepareForStorage(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.encrypter, "encrypt", EncryptedStore.class, data));
    }

    @ConvertedMethod
    public Object getEncrypter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.encrypter);
    }

    public static final Object CONST_class = "Illuminate\\Session\\EncryptedStore";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Store.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Session\\EncryptedStore")
                    .setLookup(
                            EncryptedStore.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributes", "encrypter", "handler", "id", "name", "started")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Session/EncryptedStore.php")
                    .addInterface("Illuminate\\Contracts\\Session\\Session")
                    .addExtendsClass("Illuminate\\Session\\Store")
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
