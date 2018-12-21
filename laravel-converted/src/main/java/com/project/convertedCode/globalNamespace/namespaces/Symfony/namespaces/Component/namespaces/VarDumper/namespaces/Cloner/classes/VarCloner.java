package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.functions.spl_object_id;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.project.convertedCode.globalNamespace.functions.mb_strlen;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.mb_substr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.AbstractCloner;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.__PHP_Incomplete_Class;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Cloner/VarCloner.php

*/

public class VarCloner extends AbstractCloner {

    public VarCloner(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == VarCloner.class) {
            this.__construct(env, args);
        }
    }

    public VarCloner(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    protected Object doClone(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object var = assignParameter(args, 0, false);
        ReferenceContainer currentDepth = new BasicReferenceContainer(null);
        Object gid = null;
        Object cut = null;
        ReferenceContainer vals = new BasicReferenceContainer(null);
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object zvalIsRef = null;
        Object maxString = null;
        ReferenceContainer refsCounter = new BasicReferenceContainer(null);
        Object fromObjCast = null;
        Object minimumDepthReached = null;
        ReferenceContainer len = new BasicReferenceContainer(null);
        Object pos = null;
        ReferenceContainer stub = new BasicReferenceContainer(null);
        ReferenceContainer resRefs = new BasicReferenceContainer(null);
        ReferenceContainer objRefs = new BasicReferenceContainer(null);
        Object minDepth = null;
        Object maxItems = null;
        ReferenceContainer a = new BasicReferenceContainer(null);
        Object cookie = null;
        Object gk = null;
        Object h = null;
        ReferenceContainer indexedArrays = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer j = new BasicReferenceContainer(null);
        Object k = null;
        ReferenceContainer hardRefs = new BasicReferenceContainer(null);
        ReferenceContainer gv = new BasicReferenceContainer(null);
        ReferenceContainer refs = new BasicReferenceContainer(null);
        Object arrayStub = null;
        ReferenceContainer v = new BasicReferenceContainer(null);
        Object currentDepthFinalIndex = null;
        ReferenceContainer queue = new BasicReferenceContainer(null);
        len.setObject(1);
        pos = 0;
        refsCounter.setObject(0);
        queue.setObject(ZVal.newArray(new ZPair(0, ZVal.newArray(new ZPair(0, var)))));
        indexedArrays.setObject(ZVal.newArray());
        hardRefs.setObject(ZVal.newArray());
        objRefs.setObject(ZVal.newArray());
        resRefs.setObject(ZVal.newArray());
        values.setObject(ZVal.newArray());
        maxItems = ZVal.assign(toObjectR(this).accessProp(this, env).name("maxItems").value());
        maxString = ZVal.assign(toObjectR(this).accessProp(this, env).name("maxString").value());
        minDepth = ZVal.assign(toObjectR(this).accessProp(this, env).name("minDepth").value());
        currentDepth.setObject(0);
        currentDepthFinalIndex = 0;
        minimumDepthReached = ZVal.strictEqualityCheck(0, "===", minDepth);
        cookie = ZVal.assign(toObjectR(ZVal.newArray()));
        a.setObject(ZVal.getNull());
        stub.setObject(ZVal.getNull());
        if (!ZVal.isTrue(
                gid =
                        ZVal.assign(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .VarDumper
                                                        .namespaces
                                                        .Cloner
                                                        .classes
                                                        .VarCloner
                                                        .RequestStaticProperties
                                                        .class)
                                        .gid))) {
            gid =
                    ZVal.assign(
                            env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Symfony
                                                            .namespaces
                                                            .Component
                                                            .namespaces
                                                            .VarDumper
                                                            .namespaces
                                                            .Cloner
                                                            .classes
                                                            .VarCloner
                                                            .RequestStaticProperties
                                                            .class)
                                            .gid =
                                    NamespaceGlobal.uniqid
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.mt_rand.env(env).call().value(),
                                                    true)
                                            .value());
        }

        arrayStub = new Stub(env);
        toObjectR(arrayStub).accessProp(this, env).name("type").set(Stub.CONST_TYPE_ARRAY);
        fromObjCast = false;
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', len.getObject());
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.isGreaterThan(i.getObject(), '>', currentDepthFinalIndex)) {
                currentDepth.setObject(ZVal.increment(currentDepth.getObject()));
                currentDepthFinalIndex = ZVal.subtract(len.getObject(), 1);
                if (ZVal.isGreaterThanOrEqualTo(currentDepth.getObject(), ">=", minDepth)) {
                    minimumDepthReached = true;
                }
            }

            refs.setObject(
                    ZVal.assign(vals.setObject(ZVal.assign(queue.arrayGet(env, i.getObject())))));
            if (ZVal.toBool(ZVal.isLessThan(70211, '<', 70200))
                    && ZVal.toBool(
                            arrayActionR(ArrayAction.EMPTY, indexedArrays, env, i.getObject()))) {
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2217 : ZVal.getIterable(vals.getObject(), env, false)) {
                    k = ZVal.assign(zpairResult2217.getKey());
                    v.setObject(ZVal.assign(zpairResult2217.getValue()));
                    if (function_is_int.f.env(env).call(k).getBool()) {
                        continue;
                    }

                    runtimeConverterBreakCount = 0;
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult2218 :
                            ZVal.getIterable(ZVal.newArray(new ZPair(k, true)), env, false)) {
                        gk = ZVal.assign(zpairResult2218.getKey());
                        gv.setObject(ZVal.assign(zpairResult2218.getValue()));
                    }

                    if (ZVal.strictNotEqualityCheck(gk, "!==", k)) {
                        fromObjCast = true;
                        refs.setObject(
                                ZVal.assign(
                                        vals.setObject(
                                                function_array_values
                                                        .f
                                                        .env(env)
                                                        .call(queue.arrayGet(env, i.getObject()))
                                                        .value())));
                        break;
                    }
                }
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2219 : ZVal.getIterable(vals.getObject(), env, false)) {
                k = ZVal.assign(zpairResult2219.getKey());
                v.setObject(ZVal.assign(zpairResult2219.getValue()));
                refs.arrayAccess(env, k).set(cookie);
                if (ZVal.isTrue(
                        zvalIsRef =
                                ZVal.strictEqualityCheck(vals.arrayGet(env, k), "===", cookie))) {
                    vals.arrayAccess(env, k).set(stub.getObject());
                    stub.setObject(null);
                    if (ZVal.toBool(
                                    ZVal.checkInstanceType(
                                            v.getObject(),
                                            Stub.class,
                                            "Symfony\\Component\\VarDumper\\Cloner\\Stub"))
                            && ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.ISSET,
                                            hardRefs,
                                            env,
                                            spl_object_id
                                                    .f
                                                    .env(env)
                                                    .call(v.getObject())
                                                    .value()))) {
                        vals.arrayAccess(env, k).set(refs.arrayAccess(env, k).set(v.getObject()));
                        if (ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                toObjectR(v.getObject())
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value(),
                                                Stub.class,
                                                "Symfony\\Component\\VarDumper\\Cloner\\Stub"))
                                && ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                Stub.CONST_TYPE_OBJECT,
                                                                "===",
                                                                toObjectR(v.getObject())
                                                                        .accessProp(this, env)
                                                                        .name("value")
                                                                        .getObject()
                                                                        .accessProp(this, env)
                                                                        .name("type")
                                                                        .value()))
                                                || ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                Stub.CONST_TYPE_RESOURCE,
                                                                "===",
                                                                toObjectR(v.getObject())
                                                                        .accessProp(this, env)
                                                                        .name("value")
                                                                        .getObject()
                                                                        .accessProp(this, env)
                                                                        .name("type")
                                                                        .value())))) {
                            toObjectR(v.getObject())
                                    .accessProp(this, env)
                                    .name("value")
                                    .getObject()
                                    .accessProp(this, env)
                                    .name("refCount")
                                    .set(
                                            ZVal.increment(
                                                    toObjectR(v.getObject())
                                                            .accessProp(this, env)
                                                            .name("value")
                                                            .getObject()
                                                            .accessProp(this, env)
                                                            .name("refCount")
                                                            .value()));
                        }

                        toObjectR(v.getObject())
                                .accessProp(this, env)
                                .name("refCount")
                                .set(
                                        ZVal.increment(
                                                toObjectR(v.getObject())
                                                        .accessProp(this, env)
                                                        .name("refCount")
                                                        .value()));
                        continue;
                    }

                    refs.arrayAccess(env, k).set(vals.arrayAccess(env, k).set(new Stub(env)));
                    toObjectR(refs.arrayGet(env, k))
                            .accessProp(this, env)
                            .name("value")
                            .set(v.getObject());
                    h = spl_object_id.f.env(env).call(refs.arrayGet(env, k)).value();
                    hardRefs.arrayAccess(env, h).set(refs.arrayGet(env, k));
                    values.arrayAccess(env, h).set(v.getObject());
                    toObjectR(vals.arrayGet(env, k))
                            .accessProp(this, env)
                            .name("handle")
                            .set(ZVal.preIncrement(refsCounter));
                }

                SwitchEnumType143 switchVariable143 =
                        ZVal.getEnum(
                                true,
                                SwitchEnumType143.DEFAULT_CASE,
                                SwitchEnumType143.DYNAMIC_TYPE_415,
                                ZVal.strictEqualityCheck(ZVal.getNull(), "===", v.getObject()),
                                SwitchEnumType143.DYNAMIC_TYPE_416,
                                function_is_bool.f.env(env).call(v.getObject()).value(),
                                SwitchEnumType143.DYNAMIC_TYPE_417,
                                function_is_int.f.env(env).call(v.getObject()).value(),
                                SwitchEnumType143.DYNAMIC_TYPE_418,
                                function_is_float.f.env(env).call(v.getObject()).value(),
                                SwitchEnumType143.DYNAMIC_TYPE_419,
                                function_is_string.f.env(env).call(v.getObject()).value(),
                                SwitchEnumType143.DYNAMIC_TYPE_420,
                                function_is_array.f.env(env).call(v.getObject()).value(),
                                SwitchEnumType143.DYNAMIC_TYPE_421,
                                function_is_object.f.env(env).call(v.getObject()).value(),
                                SwitchEnumType143.DYNAMIC_TYPE_422,
                                ZVal.checkInstanceType(
                                        v.getObject(),
                                        __PHP_Incomplete_Class.class,
                                        "__PHP_Incomplete_Class"));
                switch (switchVariable143) {
                    case DYNAMIC_TYPE_415:
                    case DYNAMIC_TYPE_416:
                    case DYNAMIC_TYPE_417:
                    case DYNAMIC_TYPE_418:
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    case DYNAMIC_TYPE_419:
                        if (ZVal.strictEqualityCheck("", "===", v.getObject())) {
                            runtimeConverterContinueCount = 2;
                            runtimeConverterContinueCount--;
                            continue;
                        }

                        if (!function_preg_match.f.env(env).call("//u", v.getObject()).getBool()) {
                            stub.setObject(new Stub(env));
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("type")
                                    .set(Stub.CONST_TYPE_STRING);
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("class")
                                    .set(Stub.CONST_STRING_BINARY);
                            if (ZVal.toBool(ZVal.isLessThanOrEqualTo(0, "<=", maxString))
                                    && ZVal.toBool(
                                            ZVal.isLessThan(
                                                    0,
                                                    '<',
                                                    cut =
                                                            ZVal.subtract(
                                                                    function_strlen
                                                                            .f
                                                                            .env(env)
                                                                            .call(v.getObject())
                                                                            .value(),
                                                                    maxString)))) {
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("cut")
                                        .set(cut);
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("value")
                                        .set(
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(v.getObject(), 0, ZVal.minusSign(cut))
                                                        .value());

                            } else {
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("value")
                                        .set(v.getObject());
                            }

                        } else if (ZVal.toBool(
                                        ZVal.toBool(ZVal.isLessThanOrEqualTo(0, "<=", maxString))
                                                && ZVal.toBool(
                                                        arrayActionR(
                                                                ArrayAction.ISSET,
                                                                v,
                                                                env,
                                                                ZVal.add(
                                                                        1,
                                                                        ZVal.toLong(maxString)
                                                                                >> ZVal.toLong(
                                                                                        2)))))
                                && ZVal.toBool(
                                        ZVal.isLessThan(
                                                0,
                                                '<',
                                                cut =
                                                        ZVal.subtract(
                                                                mb_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                v.getObject(),
                                                                                "UTF-8")
                                                                        .value(),
                                                                maxString)))) {
                            stub.setObject(new Stub(env));
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("type")
                                    .set(Stub.CONST_TYPE_STRING);
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("class")
                                    .set(Stub.CONST_STRING_UTF8);
                            toObjectR(stub.getObject()).accessProp(this, env).name("cut").set(cut);
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("value")
                                    .set(
                                            mb_substr
                                                    .f
                                                    .env(env)
                                                    .call(v.getObject(), 0, maxString, "UTF-8")
                                                    .value());

                        } else {
                            runtimeConverterContinueCount = 2;
                            runtimeConverterContinueCount--;
                            continue;
                        }

                        a.setObject(ZVal.getNull());
                        break;
                    case DYNAMIC_TYPE_420:
                        if (!ZVal.isTrue(v.getObject())) {
                            runtimeConverterContinueCount = 2;
                            runtimeConverterContinueCount--;
                            continue;
                        }

                        stub.setObject(ZVal.assign(arrayStub));
                        toObjectR(stub.getObject())
                                .accessProp(this, env)
                                .name("class")
                                .set(Stub.CONST_ARRAY_INDEXED);
                        j.setObject(-1);
                        runtimeConverterBreakCount = 0;
                        runtimeConverterContinueCount = 0;
                        for (ZPair zpairResult2220 : ZVal.getIterable(v.getObject(), env, false)) {
                            gk = ZVal.assign(zpairResult2220.getKey());
                            gv.setObject(ZVal.assign(zpairResult2220.getValue()));
                            if (ZVal.strictNotEqualityCheck(gk, "!==", ZVal.preIncrement(j))) {
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("class")
                                        .set(Stub.CONST_ARRAY_ASSOC);
                                break;
                            }
                        }

                        a.setObject(ZVal.assign(v.getObject()));
                        if (ZVal.strictEqualityCheck(
                                Stub.CONST_ARRAY_ASSOC,
                                "===",
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("class")
                                        .value())) {
                            a.arrayAccess(env, gid).set(true);
                            if (arrayActionR(ArrayAction.ISSET, v, env, gid)) {
                                arrayActionR(ArrayAction.UNSET, v, env, gid);
                                a.setObject(ZVal.newArray());
                                runtimeConverterBreakCount = 0;
                                runtimeConverterContinueCount = 0;
                                for (ZPair zpairResult2221 :
                                        ZVal.getIterable(v.getObject(), env, false)) {
                                    gk = ZVal.assign(zpairResult2221.getKey());
                                    gv = zpairResult2221;
                                    a.arrayAccess(env, gk).set(gv.getObject());
                                }

                                gv.setObject(null);

                            } else {
                                a.setObject(ZVal.assign(v.getObject()));
                            }

                        } else if (ZVal.isLessThan(70211, '<', 70200)) {
                            indexedArrays.arrayAccess(env, len.getObject()).set(true);
                        }

                        break;
                    case DYNAMIC_TYPE_421:
                    case DYNAMIC_TYPE_422:
                        if (arrayActionR(
                                ArrayAction.EMPTY,
                                objRefs,
                                env,
                                h = spl_object_id.f.env(env).call(v.getObject()).value())) {
                            stub.setObject(new Stub(env));
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("type")
                                    .set(Stub.CONST_TYPE_OBJECT);
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("class")
                                    .set(function_get_class.f.env(env).call(v.getObject()).value());
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("value")
                                    .set(v.getObject());
                            toObjectR(stub.getObject()).accessProp(this, env).name("handle").set(h);
                            a.setObject(
                                    env.callMethod(
                                            this,
                                            "castObject",
                                            VarCloner.class,
                                            stub.getObject(),
                                            ZVal.isLessThan(0, '<', i.getObject())));
                            if (ZVal.strictNotEqualityCheck(
                                    v.getObject(),
                                    "!==",
                                    toObjectR(stub.getObject())
                                            .accessProp(this, env)
                                            .name("value")
                                            .value())) {
                                if (ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        Stub.CONST_TYPE_OBJECT,
                                                        "!==",
                                                        toObjectR(stub.getObject())
                                                                .accessProp(this, env)
                                                                .name("type")
                                                                .value()))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        ZVal.getNull(),
                                                        "===",
                                                        toObjectR(stub.getObject())
                                                                .accessProp(this, env)
                                                                .name("value")
                                                                .value()))) {
                                    break;
                                }

                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("handle")
                                        .set(
                                                h =
                                                        spl_object_id
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        toObjectR(stub.getObject())
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("value")
                                                                                .value())
                                                                .value());
                            }

                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("value")
                                    .set(ZVal.getNull());
                            if (ZVal.toBool(
                                            ZVal.toBool(ZVal.isLessThanOrEqualTo(0, "<=", maxItems))
                                                    && ZVal.toBool(
                                                            ZVal.isLessThanOrEqualTo(
                                                                    maxItems, "<=", pos)))
                                    && ZVal.toBool(minimumDepthReached)) {
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("cut")
                                        .set(function_count.f.env(env).call(a.getObject()).value());
                                a.setObject(ZVal.getNull());
                            }
                        }

                        if (arrayActionR(ArrayAction.EMPTY, objRefs, env, h)) {
                            objRefs.arrayAccess(env, h).set(stub.getObject());

                        } else {
                            stub.setObject(ZVal.assign(objRefs.arrayGet(env, h)));
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("refCount")
                                    .set(
                                            ZVal.increment(
                                                    toObjectR(stub.getObject())
                                                            .accessProp(this, env)
                                                            .name("refCount")
                                                            .value()));
                            a.setObject(ZVal.getNull());
                        }

                        break;
                    case DEFAULT_CASE:
                        if (arrayActionR(
                                ArrayAction.EMPTY,
                                resRefs,
                                env,
                                h = ZVal.assign(ZVal.toLong(v.getObject())))) {
                            stub.setObject(new Stub(env));
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("type")
                                    .set(Stub.CONST_TYPE_RESOURCE);
                            if (ZVal.strictEqualityCheck(
                                    "Unknown",
                                    "===",
                                    toObjectR(stub.getObject())
                                            .accessProp(this, env)
                                            .name("class")
                                            .set(
                                                    NamespaceGlobal.get_resource_type
                                                            .env(env)
                                                            .call(v.getObject())
                                                            .value()))) {
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("class")
                                        .set("Closed");
                            }

                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("value")
                                    .set(v.getObject());
                            toObjectR(stub.getObject()).accessProp(this, env).name("handle").set(h);
                            a.setObject(
                                    env.callMethod(
                                            this,
                                            "castResource",
                                            VarCloner.class,
                                            stub.getObject(),
                                            ZVal.isLessThan(0, '<', i.getObject())));
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("value")
                                    .set(ZVal.getNull());
                            if (ZVal.toBool(
                                            ZVal.toBool(ZVal.isLessThanOrEqualTo(0, "<=", maxItems))
                                                    && ZVal.toBool(
                                                            ZVal.isLessThanOrEqualTo(
                                                                    maxItems, "<=", pos)))
                                    && ZVal.toBool(minimumDepthReached)) {
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("cut")
                                        .set(function_count.f.env(env).call(a.getObject()).value());
                                a.setObject(ZVal.getNull());
                            }
                        }

                        if (arrayActionR(ArrayAction.EMPTY, resRefs, env, h)) {
                            resRefs.arrayAccess(env, h).set(stub.getObject());

                        } else {
                            stub.setObject(ZVal.assign(resRefs.arrayGet(env, h)));
                            toObjectR(stub.getObject())
                                    .accessProp(this, env)
                                    .name("refCount")
                                    .set(
                                            ZVal.increment(
                                                    toObjectR(stub.getObject())
                                                            .accessProp(this, env)
                                                            .name("refCount")
                                                            .value()));
                            a.setObject(ZVal.getNull());
                        }

                        break;
                }
                ;
                if (ZVal.isTrue(a.getObject())) {
                    if (ZVal.toBool(!ZVal.isTrue(minimumDepthReached))
                            || ZVal.toBool(ZVal.isGreaterThan(0, '>', maxItems))) {
                        queue.arrayAccess(env, len.getObject()).set(a.getObject());
                        toObjectR(stub.getObject())
                                .accessProp(this, env)
                                .name("position")
                                .set(ZVal.postIncrement(len));

                    } else if (ZVal.isLessThan(pos, '<', maxItems)) {
                        if (ZVal.isLessThan(
                                maxItems,
                                '<',
                                pos =
                                        ZAssignment.add(
                                                "+=",
                                                pos,
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(a.getObject())
                                                        .value()))) {
                            a.setObject(
                                    function_array_slice
                                            .f
                                            .env(env)
                                            .call(a.getObject(), 0, ZVal.subtract(maxItems, pos))
                                            .value());
                            if (ZVal.isGreaterThanOrEqualTo(
                                    toObjectR(stub.getObject())
                                            .accessProp(this, env)
                                            .name("cut")
                                            .value(),
                                    ">=",
                                    0)) {
                                toObjectR(stub.getObject())
                                        .accessProp(this, env)
                                        .name("cut")
                                        .set(
                                                ZAssignment.add(
                                                        "+=",
                                                        toObjectR(stub.getObject())
                                                                .accessProp(this, env)
                                                                .name("cut")
                                                                .value(),
                                                        ZVal.subtract(pos, maxItems)));
                            }
                        }

                        queue.arrayAccess(env, len.getObject()).set(a.getObject());
                        toObjectR(stub.getObject())
                                .accessProp(this, env)
                                .name("position")
                                .set(ZVal.postIncrement(len));

                    } else if (ZVal.isGreaterThanOrEqualTo(
                            toObjectR(stub.getObject()).accessProp(this, env).name("cut").value(),
                            ">=",
                            0)) {
                        toObjectR(stub.getObject())
                                .accessProp(this, env)
                                .name("cut")
                                .set(
                                        ZAssignment.add(
                                                "+=",
                                                toObjectR(stub.getObject())
                                                        .accessProp(this, env)
                                                        .name("cut")
                                                        .value(),
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(a.getObject())
                                                        .value()));
                        toObjectR(stub.getObject()).accessProp(this, env).name("position").set(0);
                    }
                }

                if (ZVal.strictEqualityCheck(arrayStub, "===", stub.getObject())) {
                    if (toObjectR(arrayStub).accessProp(this, env).name("cut").getBool()) {
                        stub.setObject(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toObjectR(arrayStub)
                                                        .accessProp(this, env)
                                                        .name("cut")
                                                        .value()),
                                        new ZPair(
                                                toObjectR(arrayStub)
                                                        .accessProp(this, env)
                                                        .name("class")
                                                        .value(),
                                                toObjectR(arrayStub)
                                                        .accessProp(this, env)
                                                        .name("position")
                                                        .value())));
                        toObjectR(arrayStub).accessProp(this, env).name("cut").set(0);

                    } else if (arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .VarDumper
                                            .namespaces
                                            .Cloner
                                            .classes
                                            .VarCloner
                                            .RequestStaticProperties
                                            .class,
                                    "arrayCache"),
                            env,
                            toObjectR(arrayStub).accessProp(this, env).name("class").value(),
                            toObjectR(arrayStub).accessProp(this, env).name("position").value())) {
                        stub.setObject(
                                ZVal.assign(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .VarDumper
                                                                .namespaces
                                                                .Cloner
                                                                .classes
                                                                .VarCloner
                                                                .RequestStaticProperties
                                                                .class,
                                                        "arrayCache")
                                                .arrayGet(
                                                        env,
                                                        toObjectR(arrayStub)
                                                                .accessProp(this, env)
                                                                .name("class")
                                                                .value(),
                                                        toObjectR(arrayStub)
                                                                .accessProp(this, env)
                                                                .name("position")
                                                                .value())));

                    } else {
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .VarDumper
                                                .namespaces
                                                .Cloner
                                                .classes
                                                .VarCloner
                                                .RequestStaticProperties
                                                .class,
                                        "arrayCache")
                                .arrayAccess(
                                        env,
                                        toObjectR(arrayStub)
                                                .accessProp(this, env)
                                                .name("class")
                                                .value(),
                                        toObjectR(arrayStub)
                                                .accessProp(this, env)
                                                .name("position")
                                                .value())
                                .set(
                                        stub.setObject(
                                                ZVal.newArray(
                                                        new ZPair(
                                                                toObjectR(arrayStub)
                                                                        .accessProp(this, env)
                                                                        .name("class")
                                                                        .value(),
                                                                toObjectR(arrayStub)
                                                                        .accessProp(this, env)
                                                                        .name("position")
                                                                        .value()))));
                    }
                }

                if (ZVal.isTrue(zvalIsRef)) {
                    toObjectR(refs.arrayGet(env, k))
                            .accessProp(this, env)
                            .name("value")
                            .set(stub.getObject());

                } else {
                    vals.arrayAccess(env, k).set(stub.getObject());
                }
            }

            if (ZVal.isTrue(fromObjCast)) {
                fromObjCast = false;
                refs.setObject(ZVal.assign(vals.getObject()));
                vals.setObject(ZVal.newArray());
                j.setObject(-1);
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult2222 :
                        ZVal.getIterable(queue.arrayGet(env, i.getObject()), env, false)) {
                    k = ZVal.assign(zpairResult2222.getKey());
                    v.setObject(ZVal.assign(zpairResult2222.getValue()));
                    runtimeConverterBreakCount = 0;
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult2223 :
                            ZVal.getIterable(ZVal.newArray(new ZPair(k, true)), env, false)) {
                        gk = ZVal.assign(zpairResult2223.getKey());
                        gv.setObject(ZVal.assign(zpairResult2223.getValue()));
                    }

                    if (ZVal.strictNotEqualityCheck(gk, "!==", k)) {
                        vals.setObject(ZVal.assign(toObjectR(vals.getObject())));
                        toObjectR(vals.getObject())
                                .accessProp(this, env)
                                .name(k)
                                .set(refs.arrayGet(env, ZVal.preIncrement(j)));
                        vals.setObject(ZVal.assign(rToArrayCast(vals.getObject())));

                    } else {
                        vals.arrayAccess(env, k).set(refs.arrayGet(env, ZVal.preIncrement(j)));
                    }
                }
            }

            queue.arrayAccess(env, i.getObject()).set(vals.getObject());
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2224 : ZVal.getIterable(values.getObject(), env, false)) {
            h = ZVal.assign(zpairResult2224.getKey());
            v.setObject(ZVal.assign(zpairResult2224.getValue()));
            hardRefs.arrayAccess(env, h).set(v.getObject());
        }

        return ZVal.assign(queue.getObject());
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Cloner\\VarCloner";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractCloner.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object gid = null;

        public Object arrayCache = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Cloner\\VarCloner")
                    .setLookup(
                            VarCloner.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "casters",
                            "classInfo",
                            "filter",
                            "maxItems",
                            "maxString",
                            "minDepth",
                            "prevErrorHandler")
                    .setStaticPropertyNames("arrayCache", "gid")
                    .setFilename("vendor/symfony/var-dumper/Cloner/VarCloner.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Cloner\\ClonerInterface")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Cloner\\AbstractCloner")
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

    private enum SwitchEnumType143 {
        DYNAMIC_TYPE_415,
        DYNAMIC_TYPE_416,
        DYNAMIC_TYPE_417,
        DYNAMIC_TYPE_418,
        DYNAMIC_TYPE_419,
        DYNAMIC_TYPE_420,
        DYNAMIC_TYPE_421,
        DYNAMIC_TYPE_422,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
