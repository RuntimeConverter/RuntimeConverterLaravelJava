package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes.NativeSessionStorage;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/PhpBridgeSessionStorage.php

*/

public class PhpBridgeSessionStorage extends NativeSessionStorage {

    public PhpBridgeSessionStorage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhpBridgeSessionStorage.class) {
            this.__construct(env, args);
        }
    }

    public PhpBridgeSessionStorage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "handler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "metaBag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MetadataBag",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        Object metaBag = assignParameter(args, 1, true);
        if (null == metaBag) {
            metaBag = ZVal.getNull();
        }
        env.callMethod(this, "setMetadataBag", PhpBridgeSessionStorage.class, metaBag);
        env.callMethod(this, "setSaveHandler", PhpBridgeSessionStorage.class, handler);
        return null;
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("started").getBool()) {
            return ZVal.assign(true);
        }

        env.callMethod(this, "loadSession", PhpBridgeSessionStorage.class);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        Object bag = null;
        for (ZPair zpairResult1897 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("bags").value(), env, true)) {
            bag = ZVal.assign(zpairResult1897.getValue());
            env.callMethod(bag, "clear", PhpBridgeSessionStorage.class);
        }

        env.callMethod(this, "loadSession", PhpBridgeSessionStorage.class);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\PhpBridgeSessionStorage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NativeSessionStorage.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\PhpBridgeSessionStorage")
                    .setLookup(
                            PhpBridgeSessionStorage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bags", "closed", "metadataBag", "saveHandler", "started")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/PhpBridgeSessionStorage.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\SessionStorageInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\NativeSessionStorage")
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
