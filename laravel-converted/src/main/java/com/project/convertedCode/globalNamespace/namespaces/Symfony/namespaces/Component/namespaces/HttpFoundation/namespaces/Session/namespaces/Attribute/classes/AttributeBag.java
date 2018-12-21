package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Attribute.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Attribute.classes.AttributeBagInterface;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.ArrayIterator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Attribute/AttributeBag.php

*/

public class AttributeBag extends RuntimeClassBase
        implements AttributeBagInterface, IteratorAggregate, Countable {

    public Object name = "attributes";

    public Object storageKey = null;

    public Object attributes = ZVal.newArray();

    public AttributeBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AttributeBag.class) {
            this.__construct(env, args);
        }
    }

    public AttributeBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "storageKey", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object storageKey = assignParameter(args, 0, true);
        if (null == storageKey) {
            storageKey = "_sf2_attributes";
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
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object initialize(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer attributes =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        this.attributes = attributes.getObject();
        return null;
    }

    public Object initialize(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object getStorageKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.storageKey);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(name, this.attributes).value());
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
                function_array_key_exists.f.env(env).call(name, this.attributes).getBool()
                        ? new ReferenceClassProperty(this, "attributes", env).arrayGet(env, name)
                        : _pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object set(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "attributes", env).arrayAccess(env, name).set(value);
        return null;
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object replace(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        this.attributes = ZVal.newArray();
        for (ZPair zpairResult1885 : ZVal.getIterable(attributes, env, false)) {
            key = ZVal.assign(zpairResult1885.getKey());
            value = ZVal.assign(zpairResult1885.getValue());
            this.set(env, key, value);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object remove(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object retval = null;
        retval = ZVal.getNull();
        if (function_array_key_exists.f.env(env).call(name, this.attributes).getBool()) {
            retval =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "attributes", env)
                                    .arrayGet(env, name));
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "attributes", env),
                    env,
                    name);
        }

        return ZVal.assign(retval);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        Object _pReturn = null;
        _pReturn = ZVal.assign(this.attributes);
        this.attributes = ZVal.newArray();
        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ArrayIterator(env, this.attributes));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.attributes).value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Attribute\\AttributeBag";

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
                    .setName("Symfony\\Component\\HttpFoundation\\Session\\Attribute\\AttributeBag")
                    .setLookup(
                            AttributeBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "name", "storageKey")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Attribute/AttributeBag.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\Attribute\\AttributeBagInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface")
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
