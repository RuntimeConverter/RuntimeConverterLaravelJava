package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Flash.classes.FlashBag;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes.SessionInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes.NativeSessionStorage;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes.SessionBagProxy;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Attribute.classes.AttributeBag;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Session.php

*/

public class Session extends RuntimeClassBase
        implements SessionInterface, IteratorAggregate, Countable {

    public Object storage = null;

    public Object flashName = null;

    public Object attributeName = null;

    public Object data = ZVal.newArray();

    public Object usageIndex = 0;

    public Session(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Session.class) {
            this.__construct(env, args);
        }
    }

    public Session(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "storage",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Storage\\SessionStorageInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Attribute\\AttributeBagInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "flashes",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\Flash\\FlashBagInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object storage = assignParameter(args, 0, true);
        if (null == storage) {
            storage = ZVal.getNull();
        }
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        Object flashes = assignParameter(args, 2, true);
        if (null == flashes) {
            flashes = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.storage =
                ZVal.isTrue(ternaryExpressionTemp = storage)
                        ? ternaryExpressionTemp
                        : new NativeSessionStorage(env);
        attributes =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = attributes)
                                ? ternaryExpressionTemp
                                : new AttributeBag(env));
        this.attributeName = env.callMethod(attributes, "getName", Session.class);
        this.registerBag(env, attributes);
        flashes =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = flashes)
                                ? ternaryExpressionTemp
                                : new FlashBag(env));
        this.flashName = env.callMethod(flashes, "getName", Session.class);
        this.registerBag(env, flashes);
        return null;
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        this.usageIndex = ZVal.increment(this.usageIndex);
        return ZVal.assign(env.callMethod(this.storage, "start", Session.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.getAttributeBag(env), "has", Session.class, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(this.getAttributeBag(env), "get", Session.class, name, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object set(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        env.callMethod(this.getAttributeBag(env), "set", Session.class, name, value);
        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.getAttributeBag(env), "all", Session.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object replace(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        env.callMethod(this.getAttributeBag(env), "replace", Session.class, attributes);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object remove(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.getAttributeBag(env), "remove", Session.class, name));
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        env.callMethod(this.getAttributeBag(env), "clear", Session.class);
        return null;
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.storage, "isStarted", Session.class));
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ArrayIterator(
                        env, env.callMethod(this.getAttributeBag(env), "all", Session.class)));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_count
                        .f
                        .env(env)
                        .call(env.callMethod(this.getAttributeBag(env), "all", Session.class))
                        .value());
    }

    @ConvertedMethod
    public Object getUsageIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.usageIndex);
    }

    @ConvertedMethod
    public Object isEmpty(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(null);
        this.usageIndex = ZVal.increment(this.usageIndex);
        for (ZPair zpairResult1887 : ZVal.getIterable(this.data, env, true)) {
            data = zpairResult1887;
            if (!ZVal.isEmpty(data.getObject())) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "lifetime",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object invalidate(RuntimeEnv env, Object... args) {
        Object lifetime = assignParameter(args, 0, true);
        if (null == lifetime) {
            lifetime = ZVal.getNull();
        }
        env.callMethod(this.storage, "clear", Session.class);
        return ZVal.assign(this.migrate(env, true, lifetime));
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
    public Object migrate(RuntimeEnv env, Object... args) {
        Object destroy = assignParameter(args, 0, true);
        if (null == destroy) {
            destroy = false;
        }
        Object lifetime = assignParameter(args, 1, true);
        if (null == lifetime) {
            lifetime = ZVal.getNull();
        }
        this.usageIndex = ZVal.increment(this.usageIndex);
        return ZVal.assign(
                env.callMethod(this.storage, "regenerate", Session.class, destroy, lifetime));
    }

    @ConvertedMethod
    public Object save(RuntimeEnv env, Object... args) {
        this.usageIndex = ZVal.increment(this.usageIndex);
        env.callMethod(this.storage, "save", Session.class);
        return null;
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.storage, "getId", Session.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object setId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        env.callMethod(this.storage, "setId", Session.class, id);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.storage, "getName", Session.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        env.callMethod(this.storage, "setName", Session.class, name);
        return null;
    }

    @ConvertedMethod
    public Object getMetadataBag(RuntimeEnv env, Object... args) {
        this.usageIndex = ZVal.increment(this.usageIndex);
        return ZVal.assign(env.callMethod(this.storage, "getMetadataBag", Session.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface"
    )
    public Object registerBag(RuntimeEnv env, Object... args) {
        Object bag = assignParameter(args, 0, false);
        env.callMethod(
                this.storage,
                "registerBag",
                Session.class,
                new SessionBagProxy(env, bag, this.data, this.usageIndex));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getBag(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.storage, "getBag", Session.class, name),
                        "getBag",
                        Session.class));
    }

    @ConvertedMethod
    public Object getFlashBag(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getBag(env, this.flashName));
    }

    @ConvertedMethod
    private Object getAttributeBag(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getBag(env, this.attributeName));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\Session\\Session";

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
                    .setName("Symfony\\Component\\HttpFoundation\\Session\\Session")
                    .setLookup(
                            Session.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attributeName", "data", "flashName", "storage", "usageIndex")
                    .setFilename("vendor/symfony/http-foundation/Session/Session.php")
                    .addInterface("Symfony\\Component\\HttpFoundation\\Session\\SessionInterface")
                    .addInterface("IteratorAggregate")
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
