package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Flash.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Flash.classes.FlashBagInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Flash/AutoExpireFlashBag.php

*/

public class AutoExpireFlashBag extends RuntimeClassBase implements FlashBagInterface {

    public Object name = "flashes";

    public Object flashes =
            ZVal.newArray(new ZPair("display", ZVal.newArray()), new ZPair("new", ZVal.newArray()));

    public Object storageKey = null;

    public AutoExpireFlashBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AutoExpireFlashBag.class) {
            this.__construct(env, args);
        }
    }

    public AutoExpireFlashBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "storageKey", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object storageKey = assignParameter(args, 0, true);
        if (null == storageKey) {
            storageKey = "_symfony_flashes";
        }
        this.storageKey = storageKey;
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
    @ConvertedParameter(index = 0, name = "flashes", typeHint = "array")
    public Object initialize(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer flashes = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        this.flashes = flashes.getObject();
        new ReferenceClassProperty(this, "flashes", env)
                .arrayAccess(env, "display")
                .set(
                        function_array_key_exists.f.env(env).call("new", this.flashes).getBool()
                                ? new ReferenceClassProperty(this, "flashes", env)
                                        .arrayGet(env, "new")
                                : ZVal.newArray());
        new ReferenceClassProperty(this, "flashes", env)
                .arrayAccess(env, "new")
                .set(ZVal.newArray());
        return null;
    }

    public Object initialize(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "message")
    public Object add(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "flashes", env).arrayAppend(env, "new", type).set(message);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "default",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object peek(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.newArray();
        }
        return ZVal.assign(
                ZVal.isTrue(this.has(env, type))
                        ? new ReferenceClassProperty(this, "flashes", env)
                                .arrayGet(env, "display", type)
                        : _pDefault);
    }

    @ConvertedMethod
    public Object peekAll(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_key_exists.f.env(env).call("display", this.flashes).getBool()
                        ? rToArrayCast(
                                new ReferenceClassProperty(this, "flashes", env)
                                        .arrayGet(env, "display"))
                        : ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "default",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.newArray();
        }
        Object _pReturn = null;
        _pReturn = ZVal.assign(_pDefault);
        if (!ZVal.isTrue(this.has(env, type))) {
            return ZVal.assign(_pReturn);
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "flashes", env),
                env,
                "display",
                type)) {
            _pReturn =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "flashes", env)
                                    .arrayGet(env, "display", type));
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "flashes", env),
                    env,
                    "display",
                    type);
        }

        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        Object _pReturn = null;
        _pReturn =
                ZVal.assign(
                        new ReferenceClassProperty(this, "flashes", env).arrayGet(env, "display"));
        new ReferenceClassProperty(this, "flashes", env)
                .arrayAccess(env, "display")
                .set(ZVal.newArray());
        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages", typeHint = "array")
    public Object setAll(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "flashes", env).arrayAccess(env, "new").set(messages);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "messages")
    public Object set(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object messages = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "flashes", env)
                .arrayAccess(env, "new", type)
                .set(rToArrayCast(messages));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object has(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                function_array_key_exists
                                        .f
                                        .env(env)
                                        .call(
                                                type,
                                                new ReferenceClassProperty(this, "flashes", env)
                                                        .arrayGet(env, "display"))
                                        .value())
                        && ZVal.toBool(
                                new ReferenceClassProperty(this, "flashes", env)
                                        .arrayGet(env, "display", type)));
    }

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_keys
                        .f
                        .env(env)
                        .call(
                                new ReferenceClassProperty(this, "flashes", env)
                                        .arrayGet(env, "display"))
                        .value());
    }

    @ConvertedMethod
    public Object getStorageKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.storageKey);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.all(env));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Flash\\AutoExpireFlashBag";

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
                            "Symfony\\Component\\HttpFoundation\\Session\\Flash\\AutoExpireFlashBag")
                    .setLookup(
                            AutoExpireFlashBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("flashes", "name", "storageKey")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Flash/AutoExpireFlashBag.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\Flash\\FlashBagInterface")
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
