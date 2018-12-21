package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Storage.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes.SessionBagInterface;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Storage/MetadataBag.php

*/

public class MetadataBag extends RuntimeClassBase implements SessionBagInterface {

    public Object name = "__metadata";

    public Object storageKey = null;

    public Object meta =
            ZVal.newArray(
                    new ZPair(CONST_CREATED, 0),
                    new ZPair(CONST_UPDATED, 0),
                    new ZPair(CONST_LIFETIME, 0));

    public Object lastUsed = null;

    public Object updateThreshold = null;

    public MetadataBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MetadataBag.class) {
            this.__construct(env, args);
        }
    }

    public MetadataBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "storageKey", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "updateThreshold",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object storageKey = assignParameter(args, 0, true);
        if (null == storageKey) {
            storageKey = "_sf2_meta";
        }
        Object updateThreshold = assignParameter(args, 1, true);
        if (null == updateThreshold) {
            updateThreshold = 0;
        }
        this.storageKey = storageKey;
        this.updateThreshold = updateThreshold;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    public Object initialize(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer array = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object timeStamp = null;
        this.meta = array.getObject();
        if (arrayActionR(ArrayAction.ISSET, array, env, CONST_CREATED)) {
            this.lastUsed =
                    new ReferenceClassProperty(this, "meta", env).arrayGet(env, CONST_UPDATED);
            timeStamp = NamespaceGlobal.time.env(env).call().value();
            if (ZVal.isGreaterThanOrEqualTo(
                    ZVal.subtract(timeStamp, array.arrayGet(env, CONST_UPDATED)),
                    ">=",
                    this.updateThreshold)) {
                new ReferenceClassProperty(this, "meta", env)
                        .arrayAccess(env, CONST_UPDATED)
                        .set(timeStamp);
            }

        } else {
            this.stampCreated(env);
        }

        return null;
    }

    public Object initialize(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getLifetime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "meta", env).arrayGet(env, CONST_LIFETIME));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "lifetime",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object stampNew(RuntimeEnv env, Object... args) {
        Object lifetime = assignParameter(args, 0, true);
        if (null == lifetime) {
            lifetime = ZVal.getNull();
        }
        this.stampCreated(env, lifetime);
        return null;
    }

    @ConvertedMethod
    public Object getStorageKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.storageKey);
    }

    @ConvertedMethod
    public Object getCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "meta", env).arrayGet(env, CONST_CREATED));
    }

    @ConvertedMethod
    public Object getLastUsed(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lastUsed);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
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
    @ConvertedParameter(
        index = 0,
        name = "lifetime",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object stampCreated(RuntimeEnv env, Object... args) {
        Object lifetime = assignParameter(args, 0, true);
        if (null == lifetime) {
            lifetime = ZVal.getNull();
        }
        Object timeStamp = null;
        timeStamp = NamespaceGlobal.time.env(env).call().value();
        new ReferenceClassProperty(this, "meta", env)
                .arrayAccess(env, CONST_CREATED)
                .set(
                        new ReferenceClassProperty(this, "meta", env)
                                .arrayAccess(env, CONST_UPDATED)
                                .set(this.lastUsed = timeStamp));
        new ReferenceClassProperty(this, "meta", env)
                .arrayAccess(env, CONST_LIFETIME)
                .set(
                        ZVal.strictEqualityCheck(ZVal.getNull(), "===", lifetime)
                                ? function_ini_get
                                        .f
                                        .env(env)
                                        .call("session.cookie_lifetime")
                                        .value()
                                : lifetime);
        return null;
    }

    public static final Object CONST_CREATED = "c";

    public static final Object CONST_UPDATED = "u";

    public static final Object CONST_LIFETIME = "l";

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Storage\\MetadataBag";

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
                    .setName("Symfony\\Component\\HttpFoundation\\Session\\Storage\\MetadataBag")
                    .setLookup(
                            MetadataBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("lastUsed", "meta", "name", "storageKey", "updateThreshold")
                    .setFilename("vendor/symfony/http-foundation/Session/Storage/MetadataBag.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface")
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
