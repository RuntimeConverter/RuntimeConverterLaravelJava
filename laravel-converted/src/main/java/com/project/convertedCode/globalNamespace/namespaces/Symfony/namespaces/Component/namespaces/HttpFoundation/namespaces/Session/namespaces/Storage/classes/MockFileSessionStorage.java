package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes.MockArraySessionStorage;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/MockFileSessionStorage.php

*/

public class MockFileSessionStorage extends MockArraySessionStorage {

    public Object savePath = null;

    public MockFileSessionStorage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockFileSessionStorage.class) {
            this.__construct(env, args);
        }
    }

    public MockFileSessionStorage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "savePath",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "metaBag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MetadataBag",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object savePath = assignParameter(args, 0, true);
        if (null == savePath) {
            savePath = ZVal.getNull();
        }
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = "MOCKSESSID";
        }
        Object metaBag = assignParameter(args, 2, true);
        if (null == metaBag) {
            metaBag = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", savePath)) {
            savePath = NamespaceGlobal.sys_get_temp_dir.env(env).call().value();
        }

        if (ZVal.toBool(
                        ZVal.toBool(!function_is_dir.f.env(env).call(savePath).getBool())
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                NamespaceGlobal.mkdir
                                                        .env(env)
                                                        .call(savePath, 511, true)
                                                        .value())))
                && ZVal.toBool(!function_is_dir.f.env(env).call(savePath).getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Session Storage was not able to create directory \"%s\"",
                                            savePath)
                                    .value()));
        }

        this.savePath = savePath;
        super.__construct(env, name, metaBag);
        return null;
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("started").getBool()) {
            return ZVal.assign(true);
        }

        if (!toObjectR(this).accessProp(this, env).name("id").getBool()) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("id")
                    .set(env.callMethod(this, "generateId", MockFileSessionStorage.class));
        }

        this.read(env);
        toObjectR(this).accessProp(this, env).name("started").set(true);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "destroy",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "lifetime",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object regenerate(RuntimeEnv env, Object... args) {
        Object destroy = assignParameter(args, 0, true);
        if (null == destroy) {
            destroy = false;
        }
        Object lifetime = assignParameter(args, 1, true);
        if (null == lifetime) {
            lifetime = ZVal.getNull();
        }
        if (!toObjectR(this).accessProp(this, env).name("started").getBool()) {
            this.start(env);
        }

        if (ZVal.isTrue(destroy)) {
            this.destroy(env);
        }

        return ZVal.assign(super.regenerate(env, destroy, lifetime));
    }

    @ConvertedMethod
    public Object save(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object bag = null;
        Object key = null;
        if (!toObjectR(this).accessProp(this, env).name("started").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Trying to save a session that was not started yet or was already closed"));
        }

        data.setObject(ZVal.assign(toObjectR(this).accessProp(this, env).name("data").value()));
        for (ZPair zpairResult1892 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("bags").value(), env, true)) {
            bag = ZVal.assign(zpairResult1892.getValue());
            if (arrayActionR(
                    ArrayAction.EMPTY,
                    data,
                    env,
                    key = env.callMethod(bag, "getStorageKey", MockFileSessionStorage.class))) {
                arrayActionR(ArrayAction.UNSET, data, env, key);
            }
        }

        if (ZVal.strictEqualityCheck(
                ZVal.newArray(
                        new ZPair(
                                0,
                                key =
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("metadataBag")
                                                        .value(),
                                                "getStorageKey",
                                                MockFileSessionStorage.class))),
                "===",
                function_array_keys.f.env(env).call(data.getObject()).value())) {
            arrayActionR(ArrayAction.UNSET, data, env, key);
        }

        try {
            if (ZVal.isTrue(data.getObject())) {
                NamespaceGlobal.file_put_contents
                        .env(env)
                        .call(
                                this.getFilePath(env),
                                function_serialize.f.env(env).call(data.getObject()).value());

            } else {
                this.destroy(env);
            }

        } catch (ConvertedException convertedException268) {

            throw convertedException268;
        } finally {
            toObjectR(this).accessProp(this, env).name("data").set(data.getObject());
        }

        toObjectR(this).accessProp(this, env).name("started").set(false);
        return null;
    }

    @ConvertedMethod
    private Object destroy(RuntimeEnv env, Object... args) {
        if (function_is_file.f.env(env).call(this.getFilePath(env)).getBool()) {
            NamespaceGlobal.unlink.env(env).call(this.getFilePath(env));
        }

        return null;
    }

    @ConvertedMethod
    private Object getFilePath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.savePath, env)
                        + "/"
                        + toStringR(toObjectR(this).accessProp(this, env).name("id").value(), env)
                        + ".mocksess");
    }

    @ConvertedMethod
    private Object read(RuntimeEnv env, Object... args) {
        Object filePath = null;
        filePath = this.getFilePath(env);
        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        ZVal.toBool(NamespaceGlobal.is_readable.env(env).call(filePath).value())
                                        && ZVal.toBool(
                                                function_is_file.f.env(env).call(filePath).value())
                                ? function_unserialize
                                        .f
                                        .env(env)
                                        .call(
                                                function_file_get_contents
                                                        .f
                                                        .env(env)
                                                        .call(filePath)
                                                        .value())
                                        .value()
                                : ZVal.newArray());
        env.callMethod(this, "loadSession", MockFileSessionStorage.class);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MockFileSessionStorage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends MockArraySessionStorage.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MockFileSessionStorage")
                    .setLookup(
                            MockFileSessionStorage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bags",
                            "closed",
                            "data",
                            "id",
                            "metadataBag",
                            "name",
                            "savePath",
                            "started")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/MockFileSessionStorage.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\SessionStorageInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MockArraySessionStorage")
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
