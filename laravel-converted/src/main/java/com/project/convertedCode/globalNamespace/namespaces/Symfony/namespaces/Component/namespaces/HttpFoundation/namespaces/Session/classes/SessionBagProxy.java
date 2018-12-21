package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
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
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/SessionBagProxy.php

*/

public final class SessionBagProxy extends RuntimeClassBase implements SessionBagInterface {

    public Object bag = null;

    public Object data = null;

    public Object usageIndex = null;

    public SessionBagProxy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SessionBagProxy.class) {
            this.__construct(env, args);
        }
    }

    public SessionBagProxy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bag",
        typeHint = "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface"
    )
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    @ConvertedParameter(index = 2, name = "usageIndex")
    public Object __construct(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object bag = assignParameter(args, 0, false);
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        ReferenceContainer usageIndex =
                assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
        this.bag = bag;
        this.data = data.getObject();
        this.usageIndex = usageIndex.getObject();
        return null;
    }

    public Object __construct(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getBag(RuntimeEnv env, Object... args) {
        this.usageIndex = ZVal.increment(this.usageIndex);
        return ZVal.assign(this.bag);
    }

    @ConvertedMethod
    public Object isEmpty(RuntimeEnv env, Object... args) {
        this.usageIndex = ZVal.increment(this.usageIndex);
        return arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "data", env),
                env,
                env.callMethod(this.bag, "getStorageKey", SessionBagProxy.class));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.bag, "getName", SessionBagProxy.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array", typeHint = "array")
    public Object initialize(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer array = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        this.usageIndex = ZVal.increment(this.usageIndex);
        new ReferenceClassProperty(this, "data", env)
                .arrayAccess(env, env.callMethod(this.bag, "getStorageKey", SessionBagProxy.class))
                .set(array.getObject());
        env.callMethod(
                this.bag,
                new RuntimeArgsWithReferences().add(0, array),
                "initialize",
                SessionBagProxy.class,
                array.getObject());
        return null;
    }

    public Object initialize(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getStorageKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.bag, "getStorageKey", SessionBagProxy.class));
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.usageIndex = ZVal.increment(this.usageIndex);
        return ZVal.assign(env.callMethod(this.bag, "clear", SessionBagProxy.class));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\SessionBagProxy";

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
                    .setName("Symfony\\Component\\HttpFoundation\\Session\\SessionBagProxy")
                    .setLookup(
                            SessionBagProxy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bag", "data", "usageIndex")
                    .setFilename("vendor/symfony/http-foundation/Session/SessionBagProxy.php")
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
