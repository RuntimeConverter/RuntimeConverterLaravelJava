package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes.SessionStorageInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes.MetadataBag;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/MockArraySessionStorage.php

*/

public class MockArraySessionStorage extends RuntimeClassBase implements SessionStorageInterface {

    public Object id = "";

    public Object name = null;

    public Object started = false;

    public Object closed = false;

    public Object data = ZVal.newArray();

    public Object metadataBag = null;

    public Object bags = ZVal.newArray();

    public MockArraySessionStorage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockArraySessionStorage.class) {
            this.__construct(env, args);
        }
    }

    public MockArraySessionStorage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "metaBag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MetadataBag",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = "MOCKSESSID";
        }
        Object metaBag = assignParameter(args, 1, true);
        if (null == metaBag) {
            metaBag = ZVal.getNull();
        }
        this.name = name;
        this.setMetadataBag(env, metaBag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    public Object setSessionData(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        this.data = array;
        return null;
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.started)) {
            return ZVal.assign(true);
        }

        if (ZVal.isEmpty(this.id)) {
            this.id = this.generateId(env);
        }

        this.loadSession(env);
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
        if (!ZVal.isTrue(this.started)) {
            this.start(env);
        }

        env.callMethod(this.metadataBag, "stampNew", MockArraySessionStorage.class, lifetime);
        this.id = this.generateId(env);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.id);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.started)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "Cannot set session ID after the session has started."));
        }

        this.id = id;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    public Object save(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(!ZVal.isTrue(this.started)) || ZVal.toBool(this.closed)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Trying to save a session that was not started yet or was already closed"));
        }

        this.closed = false;
        this.started = false;
        return null;
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        Object bag = null;
        for (ZPair zpairResult1890 : ZVal.getIterable(this.bags, env, true)) {
            bag = ZVal.assign(zpairResult1890.getValue());
            env.callMethod(bag, "clear", MockArraySessionStorage.class);
        }

        this.data = ZVal.newArray();
        this.loadSession(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface"
    )
    public Object registerBag(RuntimeEnv env, Object... args) {
        Object bag = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "bags", env)
                .arrayAccess(env, env.callMethod(bag, "getName", MockArraySessionStorage.class))
                .set(bag);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getBag(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "bags", env), env, name)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The SessionBagInterface %s is not registered.", name)
                                    .value()));
        }

        if (!ZVal.isTrue(this.started)) {
            this.start(env);
        }

        return ZVal.assign(new ReferenceClassProperty(this, "bags", env).arrayGet(env, name));
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.started);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MetadataBag",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setMetadataBag(RuntimeEnv env, Object... args) {
        Object bag = assignParameter(args, 0, true);
        if (null == bag) {
            bag = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", bag)) {
            bag = new MetadataBag(env);
        }

        this.metadataBag = bag;
        return null;
    }

    @ConvertedMethod
    public Object getMetadataBag(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.metadataBag);
    }

    @ConvertedMethod
    protected Object generateId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.hash
                        .env(env)
                        .call(
                                "sha256",
                                NamespaceGlobal.uniqid.env(env).call("ss_mock_", true).value())
                        .value());
    }

    @ConvertedMethod
    protected Object loadSession(RuntimeEnv env, Object... args) {
        Object bags = null;
        Object bag = null;
        Object key = null;
        bags =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.bags, ZVal.newArray(new ZPair(0, this.metadataBag)))
                        .value();
        for (ZPair zpairResult1891 : ZVal.getIterable(bags, env, true)) {
            bag = ZVal.assign(zpairResult1891.getValue());
            key = env.callMethod(bag, "getStorageKey", MockArraySessionStorage.class);
            new ReferenceClassProperty(this, "data", env)
                    .arrayAccess(env, key)
                    .set(
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            new ReferenceClassProperty(this, "data", env),
                                            env,
                                            key)
                                    ? new ReferenceClassProperty(this, "data", env)
                                            .arrayGet(env, key)
                                    : ZVal.newArray());
            env.callMethod(
                    bag,
                    new RuntimeArgsWithReferences()
                            .add(0, new ArrayDimensionReference(this.data, key)),
                    "initialize",
                    MockArraySessionStorage.class,
                    new ReferenceClassProperty(this, "data", env).arrayGet(env, key));
        }

        this.started = true;
        this.closed = false;
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MockArraySessionStorage";

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
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MockArraySessionStorage")
                    .setLookup(
                            MockArraySessionStorage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bags", "closed", "data", "id", "metadataBag", "name", "started")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Storage/MockArraySessionStorage.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\SessionStorageInterface")
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
