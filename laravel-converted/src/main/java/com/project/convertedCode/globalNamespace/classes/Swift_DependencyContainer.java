package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Swift_DependencyException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/DependencyContainer.php

*/

public class Swift_DependencyContainer extends RuntimeClassBase {

    public Object store = ZVal.newArray();

    public Object endPoint = null;

    public Swift_DependencyContainer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_DependencyContainer.class) {
            this.__construct(env, args);
        }
    }

    public Swift_DependencyContainer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object listItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.store).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemName")
    public Object has(RuntimeEnv env, Object... args) {
        Object itemName = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(function_array_key_exists.f.env(env).call(itemName, this.store).value())
                        && ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "store", env),
                                        env,
                                        itemName,
                                        "lookupType")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemName")
    public Object lookup(RuntimeEnv env, Object... args) {
        Object itemName = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.has(env, itemName))) {
            throw ZVal.getException(
                    env,
                    new Swift_DependencyException(
                            env,
                            "Cannot lookup dependency \""
                                    + toStringR(itemName, env)
                                    + "\" since it is not registered."));
        }

        SwitchEnumType96 switchVariable96 =
                ZVal.getEnum(
                        new ReferenceClassProperty(this, "store", env)
                                .arrayGet(env, itemName, "lookupType"),
                        SwitchEnumType96.DEFAULT_CASE,
                        SwitchEnumType96.DYNAMIC_TYPE_334,
                        CONST_TYPE_ALIAS,
                        SwitchEnumType96.DYNAMIC_TYPE_335,
                        CONST_TYPE_VALUE,
                        SwitchEnumType96.DYNAMIC_TYPE_336,
                        CONST_TYPE_INSTANCE,
                        SwitchEnumType96.DYNAMIC_TYPE_337,
                        CONST_TYPE_SHARED,
                        SwitchEnumType96.DYNAMIC_TYPE_338,
                        CONST_TYPE_ARRAY);
        switch (switchVariable96) {
            case DYNAMIC_TYPE_334:
                return ZVal.assign(this.createAlias(env, itemName));
            case DYNAMIC_TYPE_335:
                return ZVal.assign(this.getValue(env, itemName));
            case DYNAMIC_TYPE_336:
                return ZVal.assign(this.createNewInstance(env, itemName));
            case DYNAMIC_TYPE_337:
                return ZVal.assign(this.createSharedInstance(env, itemName));
            case DYNAMIC_TYPE_338:
                return ZVal.assign(this.createDependenciesFor(env, itemName));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemName")
    public Object createDependenciesFor(RuntimeEnv env, Object... args) {
        Object itemName = assignParameter(args, 0, false);
        Object ___args = null;
        ___args = ZVal.newArray();
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "store", env),
                env,
                itemName,
                "args")) {
            ___args =
                    this.resolveArgs(
                            env,
                            new ReferenceClassProperty(this, "store", env)
                                    .arrayGet(env, itemName, "args"));
        }

        return ZVal.assign(___args);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemName")
    public Object register(RuntimeEnv env, Object... args) {
        Object itemName = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "store", env)
                .arrayAccess(env, itemName)
                .set(ZVal.newArray());
        this.endPoint = new ReferenceClassProperty(this, "store", env).arrayGet(env, itemName);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object asValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        ReferenceContainer endPoint = new BasicReferenceContainer(null);
        endPoint = handleReturnReference(this.getEndPoint(env));
        endPoint.arrayAccess(env, "lookupType").set(CONST_TYPE_VALUE);
        endPoint.arrayAccess(env, "value").set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lookup")
    public Object asAliasOf(RuntimeEnv env, Object... args) {
        Object lookup = assignParameter(args, 0, false);
        ReferenceContainer endPoint = new BasicReferenceContainer(null);
        endPoint = handleReturnReference(this.getEndPoint(env));
        endPoint.arrayAccess(env, "lookupType").set(CONST_TYPE_ALIAS);
        endPoint.arrayAccess(env, "ref").set(lookup);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object asNewInstanceOf(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        ReferenceContainer endPoint = new BasicReferenceContainer(null);
        endPoint = handleReturnReference(this.getEndPoint(env));
        endPoint.arrayAccess(env, "lookupType").set(CONST_TYPE_INSTANCE);
        endPoint.arrayAccess(env, "className").set(className);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    public Object asSharedInstanceOf(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        ReferenceContainer endPoint = new BasicReferenceContainer(null);
        endPoint = handleReturnReference(this.getEndPoint(env));
        endPoint.arrayAccess(env, "lookupType").set(CONST_TYPE_SHARED);
        endPoint.arrayAccess(env, "className").set(className);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object asArray(RuntimeEnv env, Object... args) {
        ReferenceContainer endPoint = new BasicReferenceContainer(null);
        endPoint = handleReturnReference(this.getEndPoint(env));
        endPoint.arrayAccess(env, "lookupType").set(CONST_TYPE_ARRAY);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lookups", typeHint = "array")
    public Object withDependencies(RuntimeEnv env, Object... args) {
        Object lookups = assignParameter(args, 0, false);
        ReferenceContainer endPoint = new BasicReferenceContainer(null);
        Object lookup = null;
        endPoint = handleReturnReference(this.getEndPoint(env));
        endPoint.arrayAccess(env, "args").set(ZVal.newArray());
        for (ZPair zpairResult1500 : ZVal.getIterable(lookups, env, true)) {
            lookup = ZVal.assign(zpairResult1500.getValue());
            this.addConstructorLookup(env, lookup);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object addConstructorValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        ReferenceContainer endPoint = new BasicReferenceContainer(null);
        endPoint = handleReturnReference(this.getEndPoint(env));
        if (!arrayActionR(ArrayAction.ISSET, endPoint, env, "args")) {
            endPoint.arrayAccess(env, "args").set(ZVal.newArray());
        }

        endPoint.arrayAppend(env, "args")
                .set(ZVal.newArray(new ZPair("type", "value"), new ZPair("item", value)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lookup")
    public Object addConstructorLookup(RuntimeEnv env, Object... args) {
        Object lookup = assignParameter(args, 0, false);
        ReferenceContainer endPoint = new BasicReferenceContainer(null);
        endPoint = handleReturnReference(this.getEndPoint(env));
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "endPoint", env),
                env,
                "args")) {
            endPoint.arrayAccess(env, "args").set(ZVal.newArray());
        }

        endPoint.arrayAppend(env, "args")
                .set(ZVal.newArray(new ZPair("type", "lookup"), new ZPair("item", lookup)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemName")
    private Object getValue(RuntimeEnv env, Object... args) {
        Object itemName = assignParameter(args, 0, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "store", env).arrayGet(env, itemName, "value"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemName")
    private Object createAlias(RuntimeEnv env, Object... args) {
        Object itemName = assignParameter(args, 0, false);
        return ZVal.assign(
                this.lookup(
                        env,
                        new ReferenceClassProperty(this, "store", env)
                                .arrayGet(env, itemName, "ref")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemName")
    private Object createNewInstance(RuntimeEnv env, Object... args) {
        Object itemName = assignParameter(args, 0, false);
        Object reflector = null;
        reflector =
                new ReflectionClass(
                        env,
                        new ReferenceClassProperty(this, "store", env)
                                .arrayGet(env, itemName, "className"));
        if (ZVal.isTrue(
                env.callMethod(reflector, "getConstructor", Swift_DependencyContainer.class))) {
            return ZVal.assign(
                    env.callMethod(
                            reflector,
                            "newInstanceArgs",
                            Swift_DependencyContainer.class,
                            this.createDependenciesFor(env, itemName)));
        }

        return ZVal.assign(
                env.callMethod(reflector, "newInstance", Swift_DependencyContainer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "itemName")
    private Object createSharedInstance(RuntimeEnv env, Object... args) {
        Object itemName = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "store", env),
                env,
                itemName,
                "instance")) {
            new ReferenceClassProperty(this, "store", env)
                    .arrayAccess(env, itemName, "instance")
                    .set(this.createNewInstance(env, itemName));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "store", env).arrayGet(env, itemName, "instance"));
    }

    @ConvertedMethod
    private Object getEndPoint(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.endPoint)) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env, "Component must first be registered by calling register()"));
        }

        return new ReferenceClassProperty(this, "endPoint", env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    private Object resolveArgs(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object ___args = assignParameter(args, 0, false);
        ReferenceContainer argDefinition = new BasicReferenceContainer(null);
        ReferenceContainer resolved = new BasicReferenceContainer(null);
        resolved.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1501 : ZVal.getIterable(___args, env, true)) {
            argDefinition.setObject(ZVal.assign(zpairResult1501.getValue()));
            switch (toStringR(argDefinition.arrayGet(env, "type"))) {
                case "lookup":
                    resolved.arrayAppend(env)
                            .set(this.lookupRecursive(env, argDefinition.arrayGet(env, "item")));
                    break;
                case "value":
                    resolved.arrayAppend(env).set(argDefinition.arrayGet(env, "item"));
                    break;
            }
            ;
        }

        return ZVal.assign(resolved.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    private Object lookupRecursive(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object v = null;
        ReferenceContainer collection = new BasicReferenceContainer(null);
        Object k = null;
        if (function_is_array.f.env(env).call(item).getBool()) {
            collection.setObject(ZVal.newArray());
            for (ZPair zpairResult1502 : ZVal.getIterable(item, env, false)) {
                k = ZVal.assign(zpairResult1502.getKey());
                v = ZVal.assign(zpairResult1502.getValue());
                collection.arrayAccess(env, k).set(this.lookupRecursive(env, v));
            }

            return ZVal.assign(collection.getObject());
        }

        return ZVal.assign(this.lookup(env, item));
    }

    public static final Object CONST_TYPE_VALUE = 1;

    public static final Object CONST_TYPE_INSTANCE = 16;

    public static final Object CONST_TYPE_SHARED = 256;

    public static final Object CONST_TYPE_ALIAS = 4096;

    public static final Object CONST_TYPE_ARRAY = 65536;

    public static final Object CONST_class = "Swift_DependencyContainer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getInstance(RuntimeEnv env, Object... args) {
            if (!ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_DependencyContainer
                                            .RequestStaticProperties
                                            .class)
                            .instance)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .classes
                                                .Swift_DependencyContainer
                                                .RequestStaticProperties
                                                .class)
                                .instance =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .classes
                                .Swift_DependencyContainer(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .classes
                                            .Swift_DependencyContainer
                                            .RequestStaticProperties
                                            .class)
                            .instance);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instance = ZVal.getNull();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_DependencyContainer")
                    .setLookup(
                            Swift_DependencyContainer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("endPoint", "store")
                    .setStaticPropertyNames("instance")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/DependencyContainer.php")
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

    private enum SwitchEnumType96 {
        DYNAMIC_TYPE_334,
        DYNAMIC_TYPE_335,
        DYNAMIC_TYPE_336,
        DYNAMIC_TYPE_337,
        DYNAMIC_TYPE_338,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
