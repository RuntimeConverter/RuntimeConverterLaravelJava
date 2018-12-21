package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Cursor;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Cloner/Data.php

*/

public class Data extends RuntimeClassBase implements ArrayAccess, Countable, IteratorAggregate {

    public Object data = null;

    public Object position = 0;

    public Object key = 0;

    public Object maxDepth = 20;

    public Object maxItemsPerDepth = -1;

    public Object useRefHandles = -1;

    public Data(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Data.class) {
            this.__construct(env, args);
        }
    }

    public Data(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data = data;
        return null;
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        Object item = null;
        item =
                ZVal.assign(
                        new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, this.position, this.key));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                item,
                                                Stub.class,
                                                "Symfony\\Component\\VarDumper\\Cloner\\Stub"))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                Stub.CONST_TYPE_REF,
                                                "===",
                                                toObjectR(item)
                                                        .accessProp(this, env)
                                                        .name("type")
                                                        .value())))
                && ZVal.toBool(!toObjectR(item).accessProp(this, env).name("position").getBool())) {
            item = ZVal.assign(toObjectR(item).accessProp(this, env).name("value").value());
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        item, Stub.class, "Symfony\\Component\\VarDumper\\Cloner\\Stub"))) {
            return ZVal.assign(NamespaceGlobal.gettype.env(env).call(item).value());
        }

        if (ZVal.strictEqualityCheck(
                Stub.CONST_TYPE_STRING,
                "===",
                toObjectR(item).accessProp(this, env).name("type").value())) {
            return "string";
        }

        if (ZVal.strictEqualityCheck(
                Stub.CONST_TYPE_ARRAY,
                "===",
                toObjectR(item).accessProp(this, env).name("type").value())) {
            return "array";
        }

        if (ZVal.strictEqualityCheck(
                Stub.CONST_TYPE_OBJECT,
                "===",
                toObjectR(item).accessProp(this, env).name("type").value())) {
            return ZVal.assign(toObjectR(item).accessProp(this, env).name("class").value());
        }

        if (ZVal.strictEqualityCheck(
                Stub.CONST_TYPE_RESOURCE,
                "===",
                toObjectR(item).accessProp(this, env).name("type").value())) {
            return ZVal.assign(
                    toStringR(toObjectR(item).accessProp(this, env).name("class").value(), env)
                            + " resource");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getValue(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer recursive = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == recursive.getObject()) {
            recursive.setObject(false);
        }
        Object item = null;
        ReferenceContainer children = new BasicReferenceContainer(null);
        Object v = null;
        Object k = null;
        item =
                ZVal.assign(
                        new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, this.position, this.key));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                item,
                                                Stub.class,
                                                "Symfony\\Component\\VarDumper\\Cloner\\Stub"))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                Stub.CONST_TYPE_REF,
                                                "===",
                                                toObjectR(item)
                                                        .accessProp(this, env)
                                                        .name("type")
                                                        .value())))
                && ZVal.toBool(!toObjectR(item).accessProp(this, env).name("position").getBool())) {
            item = ZVal.assign(toObjectR(item).accessProp(this, env).name("value").value());
        }

        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        item = this.getStub(env, item),
                        Stub.class,
                        "Symfony\\Component\\VarDumper\\Cloner\\Stub"))) {
            return ZVal.assign(item);
        }

        if (ZVal.strictEqualityCheck(
                Stub.CONST_TYPE_STRING,
                "===",
                toObjectR(item).accessProp(this, env).name("type").value())) {
            return ZVal.assign(toObjectR(item).accessProp(this, env).name("value").value());
        }

        children.setObject(
                ZVal.assign(
                        toObjectR(item).accessProp(this, env).name("position").getBool()
                                ? new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(
                                                env,
                                                toObjectR(item)
                                                        .accessProp(this, env)
                                                        .name("position")
                                                        .value())
                                : ZVal.newArray()));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2212 : ZVal.getIterable(children.getObject(), env, false)) {
            k = ZVal.assign(zpairResult2212.getKey());
            v = ZVal.assign(zpairResult2212.getValue());
            if (ZVal.toBool(recursive.getObject())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            v = this.getStub(env, v),
                                            Stub.class,
                                            "Symfony\\Component\\VarDumper\\Cloner\\Stub")))) {
                continue;
            }

            children.arrayAccess(env, k).set(((RuntimeClassInterface) this).phpClone(env));
            toObjectR(children.arrayGet(env, k)).accessProp(this, env).name("key").set(k);
            toObjectR(children.arrayGet(env, k))
                    .accessProp(this, env)
                    .name("position")
                    .set(toObjectR(item).accessProp(this, env).name("position").value());
            if (ZVal.isTrue(recursive.getObject())) {
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        Stub.CONST_TYPE_REF,
                                        "===",
                                        toObjectR(v).accessProp(this, env).name("type").value()))
                        && ZVal.toBool(
                                ZVal.checkInstanceType(
                                        v =
                                                this.getStub(
                                                        env,
                                                        toObjectR(v)
                                                                .accessProp(this, env)
                                                                .name("value")
                                                                .value()),
                                        Stub.class,
                                        "Symfony\\Component\\VarDumper\\Cloner\\Stub"))) {
                    recursive.setObject(ZVal.assign(rToArrayCast(recursive.getObject())));
                    if (arrayActionR(
                            ArrayAction.ISSET,
                            recursive,
                            env,
                            toObjectR(v).accessProp(this, env).name("position").value())) {
                        continue;
                    }

                    recursive
                            .arrayAccess(
                                    env,
                                    toObjectR(v).accessProp(this, env).name("position").value())
                            .set(true);
                }

                children.arrayAccess(env, k)
                        .set(
                                env.callMethod(
                                        children.arrayGet(env, k),
                                        "getValue",
                                        Data.class,
                                        recursive.getObject()));
            }
        }

        return ZVal.assign(children.getObject());
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.getValue(env)).value());
    }

    @ConvertedMethod
    public Object getIterator(RuntimeEnv env, Object... args) {
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        Object v = null;
        Object k = null;
        Object value = null;
        if (!function_is_array.f.env(env).call(value = this.getValue(env)).getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s object holds non-iterable type \"%s\".",
                                            CONST_class,
                                            NamespaceGlobal.gettype.env(env).call(value).value())
                                    .value()));
        }

        for (ZPair zpairResult2213 : ZVal.getIterable(value, env, false)) {
            k = ZVal.assign(zpairResult2213.getKey());
            v = ZVal.assign(zpairResult2213.getValue());
            runtimeConverterYieldVariable.add(k, v);
        }

        return runtimeConverterYieldVariable;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object item = null;
        Object data = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", data = this.seek(env, key))) {
            item =
                    this.getStub(
                            env,
                            new ReferenceClassProperty(data, "data", env)
                                    .arrayGet(
                                            env,
                                            toObjectR(data)
                                                    .accessProp(this, env)
                                                    .name("position")
                                                    .value(),
                                            toObjectR(data)
                                                    .accessProp(this, env)
                                                    .name("key")
                                                    .value()));
            return ZVal.assign(
                    ZVal.toBool(
                                            ZVal.checkInstanceType(
                                                    item,
                                                    Stub.class,
                                                    "Symfony\\Component\\VarDumper\\Cloner\\Stub"))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(ZVal.newArray(), "===", item))
                            ? data
                            : item);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.seek(env, key)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.__isset(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.__get(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env, toStringR(CONST_class, env) + " objects are immutable."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env, toStringR(CONST_class, env) + " objects are immutable."));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object value = null;
        value = this.getValue(env);
        if (!function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(toStringR(value, env));
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s (count=%d)",
                                this.getType(env), function_count.f.env(env).call(value).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxDepth")
    public Object withMaxDepth(RuntimeEnv env, Object... args) {
        Object maxDepth = assignParameter(args, 0, false);
        Object data = null;
        data = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
        toObjectR(data).accessProp(this, env).name("maxDepth").set(ZVal.toLong(maxDepth));
        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxItemsPerDepth")
    public Object withMaxItemsPerDepth(RuntimeEnv env, Object... args) {
        Object maxItemsPerDepth = assignParameter(args, 0, false);
        Object data = null;
        data = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
        toObjectR(data)
                .accessProp(this, env)
                .name("maxItemsPerDepth")
                .set(ZVal.toLong(maxItemsPerDepth));
        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useRefHandles")
    public Object withRefHandles(RuntimeEnv env, Object... args) {
        Object useRefHandles = assignParameter(args, 0, false);
        Object data = null;
        data = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
        toObjectR(data)
                .accessProp(this, env)
                .name("useRefHandles")
                .set(ZVal.isTrue(useRefHandles) ? -1 : 0);
        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object seek(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object key = assignParameter(args, 0, false);
        Object item = null;
        Object data = null;
        ReferenceContainer children = new BasicReferenceContainer(null);
        ReferenceContainer keys = new BasicReferenceContainer(null);
        item =
                ZVal.assign(
                        new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, this.position, this.key));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                item,
                                                Stub.class,
                                                "Symfony\\Component\\VarDumper\\Cloner\\Stub"))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                Stub.CONST_TYPE_REF,
                                                "===",
                                                toObjectR(item)
                                                        .accessProp(this, env)
                                                        .name("type")
                                                        .value())))
                && ZVal.toBool(!toObjectR(item).accessProp(this, env).name("position").getBool())) {
            item = ZVal.assign(toObjectR(item).accessProp(this, env).name("value").value());
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        item = this.getStub(env, item),
                                        Stub.class,
                                        "Symfony\\Component\\VarDumper\\Cloner\\Stub")))
                || ZVal.toBool(!toObjectR(item).accessProp(this, env).name("position").getBool())) {
            return null;
        }

        keys.setObject(ZVal.newArray(new ZPair(0, key)));
        SwitchEnumType141 switchVariable141 =
                ZVal.getEnum(
                        toObjectR(item).accessProp(this, env).name("type").value(),
                        SwitchEnumType141.DEFAULT_CASE,
                        SwitchEnumType141.DYNAMIC_TYPE_408,
                        Stub.CONST_TYPE_OBJECT,
                        SwitchEnumType141.DYNAMIC_TYPE_409,
                        Stub.CONST_TYPE_ARRAY,
                        SwitchEnumType141.DYNAMIC_TYPE_410,
                        Stub.CONST_TYPE_RESOURCE);
        switch (switchVariable141) {
            case DYNAMIC_TYPE_408:
                keys.arrayAppend(env)
                        .set(toStringR(Caster.CONST_PREFIX_DYNAMIC, env) + toStringR(key, env));
                keys.arrayAppend(env)
                        .set(toStringR(Caster.CONST_PREFIX_PROTECTED, env) + toStringR(key, env));
                keys.arrayAppend(env)
                        .set(toStringR(Caster.CONST_PREFIX_VIRTUAL, env) + toStringR(key, env));
                keys.arrayAppend(env)
                        .set(
                                "\u0000"
                                        + toStringR(
                                                toObjectR(item)
                                                        .accessProp(this, env)
                                                        .name("class")
                                                        .value(),
                                                env)
                                        + "\u0000"
                                        + toStringR(key, env));
            case DYNAMIC_TYPE_409:
            case DYNAMIC_TYPE_410:
                break;
            case DEFAULT_CASE:
                return null;
        }
        ;
        data = ZVal.getNull();
        children.setObject(
                ZVal.assign(
                        new ReferenceClassProperty(this, "data", env)
                                .arrayGet(
                                        env,
                                        toObjectR(item)
                                                .accessProp(this, env)
                                                .name("position")
                                                .value())));
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult2214 : ZVal.getIterable(keys.getObject(), env, true)) {
            key = ZVal.assign(zpairResult2214.getValue());
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, children, env, key))
                    || ZVal.toBool(
                            function_array_key_exists
                                    .f
                                    .env(env)
                                    .call(key, children.getObject())
                                    .value())) {
                data = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
                toObjectR(data).accessProp(this, env).name("key").set(key);
                toObjectR(data)
                        .accessProp(this, env)
                        .name("position")
                        .set(toObjectR(item).accessProp(this, env).name("position").value());
                break;
            }
        }

        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dumper",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\DumperInterface"
    )
    public Object dump(RuntimeEnv env, Object... args) {
        Object dumper = assignParameter(args, 0, false);
        ReferenceContainer refs = new BasicReferenceContainer(null);
        refs.setObject(ZVal.arrayFromList(0));
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(2, refs),
                "dumpItem",
                Data.class,
                dumper,
                new Cursor(env),
                refs.getObject(),
                new ReferenceClassProperty(this, "data", env)
                        .arrayGet(env, this.position, this.key));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dumper")
    @ConvertedParameter(index = 1, name = "cursor")
    @ConvertedParameter(index = 2, name = "refs")
    @ConvertedParameter(index = 3, name = "item")
    private Object dumpItem(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        Object dumper = assignParameter(args, 0, false);
        Object cursor = assignParameter(args, 1, false);
        ReferenceContainer refs = assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
        Object item = assignParameter(args, 3, false);
        Object r = null;
        Object cut = null;
        Object children = null;
        Object firstSeen = null;
        Object ternaryExpressionTemp = null;
        Object type = null;
        Object withChildren = null;
        toObjectR(cursor).accessProp(this, env).name("refIndex").set(0);
        toObjectR(cursor)
                .accessProp(this, env)
                .name("softRefTo")
                .set(
                        toObjectR(cursor)
                                .accessProp(this, env)
                                .name("softRefHandle")
                                .set(
                                        toObjectR(cursor)
                                                .accessProp(this, env)
                                                .name("softRefCount")
                                                .set(0)));
        toObjectR(cursor)
                .accessProp(this, env)
                .name("hardRefTo")
                .set(
                        toObjectR(cursor)
                                .accessProp(this, env)
                                .name("hardRefHandle")
                                .set(
                                        toObjectR(cursor)
                                                .accessProp(this, env)
                                                .name("hardRefCount")
                                                .set(0)));
        firstSeen = true;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        item, Stub.class, "Symfony\\Component\\VarDumper\\Cloner\\Stub"))) {
            toObjectR(cursor).accessProp(this, env).name("attr").set(ZVal.newArray());
            type = NamespaceGlobal.gettype.env(env).call(item).value();
            if (ZVal.toBool(item) && ZVal.toBool(ZVal.strictEqualityCheck("array", "===", type))) {
                item = this.getStub(env, item);
            }

        } else if (ZVal.strictEqualityCheck(
                Stub.CONST_TYPE_REF,
                "===",
                toObjectR(item).accessProp(this, env).name("type").value())) {
            if (toObjectR(item).accessProp(this, env).name("handle").getBool()) {
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        refs,
                        env,
                        r =
                                ZVal.subtract(
                                        toObjectR(item)
                                                .accessProp(this, env)
                                                .name("handle")
                                                .value(),
                                        ZVal.toLong(9223372036854775807L) >> ZVal.toLong(1)))) {
                    toObjectR(cursor)
                            .accessProp(this, env)
                            .name("refIndex")
                            .set(
                                    refs.arrayAccess(env, r)
                                            .set(
                                                    ZVal.isTrue(
                                                                    ternaryExpressionTemp =
                                                                            toObjectR(cursor)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "refIndex")
                                                                                    .value())
                                                            ? ternaryExpressionTemp
                                                            : ZVal.preIncrement(
                                                                    new ArrayDimensionReference(
                                                                            refs.getObject(), 0))));

                } else {
                    firstSeen = false;
                }

                toObjectR(cursor)
                        .accessProp(this, env)
                        .name("hardRefTo")
                        .set(refs.arrayGet(env, r));
                toObjectR(cursor)
                        .accessProp(this, env)
                        .name("hardRefHandle")
                        .set(
                                ZVal.toLong(this.useRefHandles)
                                        & ZVal.toLong(
                                                toObjectR(item)
                                                        .accessProp(this, env)
                                                        .name("handle")
                                                        .value()));
                toObjectR(cursor)
                        .accessProp(this, env)
                        .name("hardRefCount")
                        .set(toObjectR(item).accessProp(this, env).name("refCount").value());
            }

            toObjectR(cursor)
                    .accessProp(this, env)
                    .name("attr")
                    .set(toObjectR(item).accessProp(this, env).name("attr").value());
            type =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    toObjectR(item)
                                                            .accessProp(this, env)
                                                            .name("class")
                                                            .value())
                                    ? ternaryExpressionTemp
                                    : NamespaceGlobal.gettype
                                            .env(env)
                                            .call(
                                                    toObjectR(item)
                                                            .accessProp(this, env)
                                                            .name("value")
                                                            .value())
                                            .value());
            item = this.getStub(env, toObjectR(item).accessProp(this, env).name("value").value());
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        item, Stub.class, "Symfony\\Component\\VarDumper\\Cloner\\Stub"))) {
            if (toObjectR(item).accessProp(this, env).name("refCount").getBool()) {
                if (!arrayActionR(
                        ArrayAction.ISSET,
                        refs,
                        env,
                        r =
                                ZVal.assign(
                                        toObjectR(item)
                                                .accessProp(this, env)
                                                .name("handle")
                                                .value()))) {
                    toObjectR(cursor)
                            .accessProp(this, env)
                            .name("refIndex")
                            .set(
                                    refs.arrayAccess(env, r)
                                            .set(
                                                    ZVal.isTrue(
                                                                    ternaryExpressionTemp =
                                                                            toObjectR(cursor)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "refIndex")
                                                                                    .value())
                                                            ? ternaryExpressionTemp
                                                            : ZVal.preIncrement(
                                                                    new ArrayDimensionReference(
                                                                            refs.getObject(), 0))));

                } else {
                    firstSeen = false;
                }

                toObjectR(cursor)
                        .accessProp(this, env)
                        .name("softRefTo")
                        .set(refs.arrayGet(env, r));
            }

            toObjectR(cursor)
                    .accessProp(this, env)
                    .name("softRefHandle")
                    .set(
                            ZVal.toLong(this.useRefHandles)
                                    & ZVal.toLong(
                                            toObjectR(item)
                                                    .accessProp(this, env)
                                                    .name("handle")
                                                    .value()));
            toObjectR(cursor)
                    .accessProp(this, env)
                    .name("softRefCount")
                    .set(toObjectR(item).accessProp(this, env).name("refCount").value());
            toObjectR(cursor)
                    .accessProp(this, env)
                    .name("attr")
                    .set(toObjectR(item).accessProp(this, env).name("attr").value());
            cut = ZVal.assign(toObjectR(item).accessProp(this, env).name("cut").value());
            if (ZVal.toBool(toObjectR(item).accessProp(this, env).name("position").value())
                    && ZVal.toBool(firstSeen)) {
                children =
                        ZVal.assign(
                                new ReferenceClassProperty(this, "data", env)
                                        .arrayGet(
                                                env,
                                                toObjectR(item)
                                                        .accessProp(this, env)
                                                        .name("position")
                                                        .value()));
                if (toObjectR(cursor).accessProp(this, env).name("stop").getBool()) {
                    if (ZVal.isGreaterThanOrEqualTo(cut, ">=", 0)) {
                        cut =
                                ZAssignment.add(
                                        "+=",
                                        cut,
                                        function_count.f.env(env).call(children).value());
                    }

                    children = ZVal.newArray();
                }

            } else {
                children = ZVal.newArray();
            }

            SwitchEnumType142 switchVariable142 =
                    ZVal.getEnum(
                            toObjectR(item).accessProp(this, env).name("type").value(),
                            SwitchEnumType142.DEFAULT_CASE,
                            SwitchEnumType142.DYNAMIC_TYPE_411,
                            Stub.CONST_TYPE_STRING,
                            SwitchEnumType142.DYNAMIC_TYPE_412,
                            Stub.CONST_TYPE_ARRAY,
                            SwitchEnumType142.DYNAMIC_TYPE_413,
                            Stub.CONST_TYPE_OBJECT,
                            SwitchEnumType142.DYNAMIC_TYPE_414,
                            Stub.CONST_TYPE_RESOURCE);
            switch (switchVariable142) {
                case DYNAMIC_TYPE_411:
                    env.callMethod(
                            dumper,
                            "dumpString",
                            Data.class,
                            cursor,
                            toObjectR(item).accessProp(this, env).name("value").value(),
                            ZVal.strictEqualityCheck(
                                    Stub.CONST_STRING_BINARY,
                                    "===",
                                    toObjectR(item).accessProp(this, env).name("class").value()),
                            cut);
                    break;
                case DYNAMIC_TYPE_412:
                    item = ZVal.assign(((RuntimeClassInterface) item).phpClone(env));
                    toObjectR(item)
                            .accessProp(this, env)
                            .name("type")
                            .set(toObjectR(item).accessProp(this, env).name("class").value());
                    toObjectR(item)
                            .accessProp(this, env)
                            .name("class")
                            .set(toObjectR(item).accessProp(this, env).name("value").value());
                case DYNAMIC_TYPE_413:
                case DYNAMIC_TYPE_414:
                    withChildren =
                            ZVal.toBool(
                                            ZVal.toBool(children)
                                                    && ZVal.toBool(
                                                            ZVal.strictNotEqualityCheck(
                                                                    toObjectR(cursor)
                                                                            .accessProp(this, env)
                                                                            .name("depth")
                                                                            .value(),
                                                                    "!==",
                                                                    this.maxDepth)))
                                    && ZVal.toBool(this.maxItemsPerDepth);
                    env.callMethod(
                            dumper,
                            "enterHash",
                            Data.class,
                            cursor,
                            toObjectR(item).accessProp(this, env).name("type").value(),
                            toObjectR(item).accessProp(this, env).name("class").value(),
                            withChildren);
                    if (ZVal.isTrue(withChildren)) {
                        if (toObjectR(cursor)
                                .accessProp(this, env)
                                .name("skipChildren")
                                .getBool()) {
                            withChildren = false;
                            cut = -1;

                        } else {
                            cut =
                                    env.callMethod(
                                            this,
                                            new RuntimeArgsWithReferences().add(2, refs),
                                            "dumpChildren",
                                            Data.class,
                                            dumper,
                                            cursor,
                                            refs.getObject(),
                                            children,
                                            cut,
                                            toObjectR(item)
                                                    .accessProp(this, env)
                                                    .name("type")
                                                    .value(),
                                            ZVal.strictNotEqualityCheck(
                                                    ZVal.getNull(),
                                                    "!==",
                                                    toObjectR(item)
                                                            .accessProp(this, env)
                                                            .name("class")
                                                            .value()));
                        }

                    } else if (ZVal.toBool(children)
                            && ZVal.toBool(ZVal.isLessThanOrEqualTo(0, "<=", cut))) {
                        cut =
                                ZAssignment.add(
                                        "+=",
                                        cut,
                                        function_count.f.env(env).call(children).value());
                    }

                    toObjectR(cursor).accessProp(this, env).name("skipChildren").set(false);
                    env.callMethod(
                            dumper,
                            "leaveHash",
                            Data.class,
                            cursor,
                            toObjectR(item).accessProp(this, env).name("type").value(),
                            toObjectR(item).accessProp(this, env).name("class").value(),
                            withChildren,
                            cut);
                    break;
                case DEFAULT_CASE:
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Unexpected Stub type: %s",
                                                    toObjectR(item)
                                                            .accessProp(this, env)
                                                            .name("type")
                                                            .value())
                                            .value()));
            }
            ;

        } else if (ZVal.strictEqualityCheck("array", "===", type)) {
            env.callMethod(
                    dumper, "enterHash", Data.class, cursor, Cursor.CONST_HASH_INDEXED, 0, false);
            env.callMethod(
                    dumper,
                    "leaveHash",
                    Data.class,
                    cursor,
                    Cursor.CONST_HASH_INDEXED,
                    0,
                    false,
                    0);

        } else if (ZVal.strictEqualityCheck("string", "===", type)) {
            env.callMethod(dumper, "dumpString", Data.class, cursor, item, false, 0);

        } else {
            env.callMethod(dumper, "dumpScalar", Data.class, cursor, type, item);
        }

        return null;
    }

    public Object dumpItem(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dumper")
    @ConvertedParameter(index = 1, name = "parentCursor")
    @ConvertedParameter(index = 2, name = "refs")
    @ConvertedParameter(index = 3, name = "children")
    @ConvertedParameter(index = 4, name = "hashCut")
    @ConvertedParameter(index = 5, name = "hashType")
    @ConvertedParameter(index = 6, name = "dumpKeys")
    private Object dumpChildren(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object dumper = assignParameter(args, 0, false);
        Object parentCursor = assignParameter(args, 1, false);
        ReferenceContainer refs = assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
        Object children = assignParameter(args, 3, false);
        Object hashCut = assignParameter(args, 4, false);
        Object hashType = assignParameter(args, 5, false);
        Object dumpKeys = assignParameter(args, 6, false);
        Object cursor = null;
        ReferenceContainer key = new BasicReferenceContainer(null);
        Object child = null;
        cursor = ZVal.assign(((RuntimeClassInterface) parentCursor).phpClone(env));
        toObjectR(cursor)
                .accessProp(this, env)
                .name("depth")
                .set(ZVal.increment(toObjectR(cursor).accessProp(this, env).name("depth").value()));
        toObjectR(cursor).accessProp(this, env).name("hashType").set(hashType);
        toObjectR(cursor).accessProp(this, env).name("hashIndex").set(0);
        toObjectR(cursor)
                .accessProp(this, env)
                .name("hashLength")
                .set(function_count.f.env(env).call(children).value());
        toObjectR(cursor).accessProp(this, env).name("hashCut").set(hashCut);
        for (ZPair zpairResult2215 : ZVal.getIterable(children, env, false)) {
            key.setObject(ZVal.assign(zpairResult2215.getKey()));
            child = ZVal.assign(zpairResult2215.getValue());
            toObjectR(cursor)
                    .accessProp(this, env)
                    .name("hashKeyIsBinary")
                    .set(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, key, env, 0))
                                    && ZVal.toBool(
                                            !function_preg_match
                                                    .f
                                                    .env(env)
                                                    .call("//u", key.getObject())
                                                    .getBool()));
            toObjectR(cursor)
                    .accessProp(this, env)
                    .name("hashKey")
                    .set(ZVal.isTrue(dumpKeys) ? key.getObject() : ZVal.getNull());
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(2, refs),
                    "dumpItem",
                    Data.class,
                    dumper,
                    cursor,
                    refs.getObject(),
                    child);
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    ZVal.preIncrement(
                                            new ReferenceClassProperty(cursor, "hashIndex", env)),
                                    "===",
                                    this.maxItemsPerDepth))
                    || ZVal.toBool(toObjectR(cursor).accessProp(this, env).name("stop").value())) {
                toObjectR(parentCursor).accessProp(this, env).name("stop").set(true);
                return ZVal.assign(
                        ZVal.isGreaterThanOrEqualTo(hashCut, ">=", 0)
                                ? ZVal.subtract(
                                        ZVal.add(
                                                hashCut,
                                                toObjectR(cursor)
                                                        .accessProp(this, env)
                                                        .name("hashLength")
                                                        .value()),
                                        toObjectR(cursor)
                                                .accessProp(this, env)
                                                .name("hashIndex")
                                                .value())
                                : hashCut);
            }
        }

        return ZVal.assign(hashCut);
    }

    public Object dumpChildren(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    private Object getStub(RuntimeEnv env, Object... args) {
        ReferenceContainer item = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object stub = null;
        if (ZVal.toBool(!ZVal.isTrue(item.getObject()))
                || ZVal.toBool(!function_is_array.f.env(env).call(item.getObject()).getBool())) {
            return ZVal.assign(item.getObject());
        }

        stub = new Stub(env);
        toObjectR(stub).accessProp(this, env).name("type").set(Stub.CONST_TYPE_ARRAY);
        for (ZPair zpairResult2216 : ZVal.getIterable(item.getObject(), env, true)) {
            toObjectR(stub).accessProp(this, env).name("position").set(zpairResult2216.getValue());
        }

        if (arrayActionR(ArrayAction.ISSET, item, env, 0)) {
            toObjectR(stub).accessProp(this, env).name("cut").set(item.arrayGet(env, 0));
        }

        toObjectR(stub)
                .accessProp(this, env)
                .name("value")
                .set(
                        ZVal.add(
                                toObjectR(stub).accessProp(this, env).name("cut").value(),
                                toObjectR(stub).accessProp(this, env).name("position").getBool()
                                        ? function_count
                                                .f
                                                .env(env)
                                                .call(
                                                        new ReferenceClassProperty(
                                                                        this, "data", env)
                                                                .arrayGet(
                                                                        env,
                                                                        toObjectR(stub)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("position")
                                                                                .value()))
                                                .value()
                                        : 0));
        return ZVal.assign(stub);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Cloner\\Data";

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
                    .setName("Symfony\\Component\\VarDumper\\Cloner\\Data")
                    .setLookup(
                            Data.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "data",
                            "key",
                            "maxDepth",
                            "maxItemsPerDepth",
                            "position",
                            "useRefHandles")
                    .setFilename("vendor/symfony/var-dumper/Cloner/Data.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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

    private enum SwitchEnumType141 {
        DYNAMIC_TYPE_408,
        DYNAMIC_TYPE_409,
        DYNAMIC_TYPE_410,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType142 {
        DYNAMIC_TYPE_411,
        DYNAMIC_TYPE_412,
        DYNAMIC_TYPE_413,
        DYNAMIC_TYPE_414,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
