package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Attribute.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.Session.namespaces.Attribute.classes.AttributeBag;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/Session/Attribute/NamespacedAttributeBag.php

*/

public class NamespacedAttributeBag extends AttributeBag {

    public Object namespaceCharacter = null;

    public NamespacedAttributeBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NamespacedAttributeBag.class) {
            this.__construct(env, args);
        }
    }

    public NamespacedAttributeBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "storageKey", typeHint = "string")
    @ConvertedParameter(index = 1, name = "namespaceCharacter", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object storageKey = assignParameter(args, 0, true);
        if (null == storageKey) {
            storageKey = "_sf2_attributes";
        }
        Object namespaceCharacter = assignParameter(args, 1, true);
        if (null == namespaceCharacter) {
            namespaceCharacter = "/";
        }
        this.namespaceCharacter = namespaceCharacter;
        super.__construct(env, storageKey);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object attributes = null;
        attributes = this.resolveAttributePath(env, name);
        name = this.resolveKey(env, name);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", attributes)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(function_array_key_exists.f.env(env).call(name, attributes).value());
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
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        attributes.setObject(this.resolveAttributePath(env, name));
        name = this.resolveKey(env, name);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", attributes.getObject())) {
            return ZVal.assign(_pDefault);
        }

        return ZVal.assign(
                function_array_key_exists.f.env(env).call(name, attributes.getObject()).getBool()
                        ? attributes.arrayGet(env, name)
                        : _pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object set(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        attributes = handleReturnReference(this.resolveAttributePath(env, name, true));
        name = this.resolveKey(env, name);
        attributes.arrayAccess(env, name).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object remove(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object retval = null;
        retval = ZVal.getNull();
        attributes = handleReturnReference(this.resolveAttributePath(env, name));
        name = this.resolveKey(env, name);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", attributes.getObject()))
                && ZVal.toBool(
                        function_array_key_exists
                                .f
                                .env(env)
                                .call(name, attributes.getObject())
                                .value())) {
            retval = ZVal.assign(attributes.arrayGet(env, name));
            arrayActionR(ArrayAction.UNSET, attributes, env, name);
        }

        return ZVal.assign(retval);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "writeContext",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object resolveAttributePath(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object writeContext = assignParameter(args, 1, true);
        if (null == writeContext) {
            writeContext = false;
        }
        ReferenceContainer array = new BasicReferenceContainer(null);
        Object part = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        array = new ReferenceClassProperty(this, "attributes", env);
        name =
                ZVal.assign(
                        ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_strpos
                                                .f
                                                .env(env)
                                                .call(name, this.namespaceCharacter)
                                                .value())
                                ? function_substr.f.env(env).call(name, 1).value()
                                : name);
        if (!ZVal.isTrue(name)) {
            return array;
        }

        parts.setObject(function_explode.f.env(env).call(this.namespaceCharacter, name).value());
        if (ZVal.isLessThan(function_count.f.env(env).call(parts.getObject()).value(), '<', 2)) {
            if (!ZVal.isTrue(writeContext)) {
                return array;
            }

            array.arrayAccess(env, parts.arrayGet(env, 0)).set(ZVal.newArray());
            return array;
        }

        arrayActionR(
                ArrayAction.UNSET,
                parts,
                env,
                ZVal.subtract(function_count.f.env(env).call(parts.getObject()).value(), 1));
        for (ZPair zpairResult1886 : ZVal.getIterable(parts.getObject(), env, true)) {
            part = ZVal.assign(zpairResult1886.getValue());
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", array.getObject()))
                    && ZVal.toBool(
                            !function_array_key_exists
                                    .f
                                    .env(env)
                                    .call(part, array.getObject())
                                    .getBool())) {
                array.arrayAccess(env, part)
                        .set(ZVal.isTrue(writeContext) ? ZVal.newArray() : ZVal.getNull());
            }

            array = new ArrayDimensionReference(array.getObject(), part);
        }

        return array;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolveKey(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object pos = null;
        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                pos =
                        NamespaceGlobal.strrpos
                                .env(env)
                                .call(name, this.namespaceCharacter)
                                .value())) {
            name = function_substr.f.env(env).call(name, ZVal.add(pos, 1)).value();
        }

        return ZVal.assign(name);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpFoundation\\Session\\Attribute\\NamespacedAttributeBag";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AttributeBag.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\HttpFoundation\\Session\\Attribute\\NamespacedAttributeBag")
                    .setLookup(
                            NamespacedAttributeBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "name", "namespaceCharacter", "storageKey")
                    .setFilename(
                            "vendor/symfony/http-foundation/Session/Attribute/NamespacedAttributeBag.php")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\Attribute\\AttributeBagInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpFoundation\\Session\\SessionBagInterface")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpFoundation\\Session\\Attribute\\AttributeBag")
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
