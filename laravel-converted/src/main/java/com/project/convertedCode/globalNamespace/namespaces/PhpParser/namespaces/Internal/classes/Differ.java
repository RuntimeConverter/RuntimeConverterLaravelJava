package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes.DiffElem;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Internal/Differ.php

*/

public class Differ extends RuntimeClassBase {

    public Object isEqual = null;

    public Differ(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Differ.class) {
            this.__construct(env, args);
        }
    }

    public Differ(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "isEqual", typeHint = "callable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object isEqual = assignParameter(args, 0, false);
        this.isEqual = isEqual;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "old", typeHint = "array")
    @ConvertedParameter(index = 1, name = "new", typeHint = "array")
    public Object diff(RuntimeEnv env, Object... args) {
        Object old = assignParameter(args, 0, false);
        Object _pNew = assignParameter(args, 1, false);
        Object trace = null;
        Object runtimeTempArrayResult118 = null;
        Object x = null;
        Object y = null;
        ZVal.list(
                runtimeTempArrayResult118 = this.calculateTrace(env, old, _pNew),
                (trace = listGet(runtimeTempArrayResult118, 0, env)),
                (x = listGet(runtimeTempArrayResult118, 1, env)),
                (y = listGet(runtimeTempArrayResult118, 2, env)));
        return ZVal.assign(this.extractDiff(env, trace, x, y, old, _pNew));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "old", typeHint = "array")
    @ConvertedParameter(index = 1, name = "new", typeHint = "array")
    public Object diffWithReplacements(RuntimeEnv env, Object... args) {
        Object old = assignParameter(args, 0, false);
        Object _pNew = assignParameter(args, 1, false);
        return ZVal.assign(this.coalesceReplacements(env, this.diff(env, old, _pNew)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "a", typeHint = "array")
    @ConvertedParameter(index = 1, name = "b", typeHint = "array")
    private Object calculateTrace(RuntimeEnv env, Object... args) {
        ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer b = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer trace = new BasicReferenceContainer(null);
        ReferenceContainer d = new BasicReferenceContainer(null);
        Object max = null;
        ReferenceContainer v = new BasicReferenceContainer(null);
        ReferenceContainer x = new BasicReferenceContainer(null);
        ReferenceContainer y = new BasicReferenceContainer(null);
        Object k = null;
        Object m = null;
        Object n = null;
        n = function_count.f.env(env).call(a.getObject()).value();
        m = function_count.f.env(env).call(b.getObject()).value();
        max = ZVal.add(n, m);
        v.setObject(ZVal.newArray(new ZPair(1, 0)));
        trace.setObject(ZVal.newArray());
        for (d.setObject(0);
                ZVal.isLessThanOrEqualTo(d.getObject(), "<=", max);
                d.setObject(ZVal.increment(d.getObject()))) {
            trace.arrayAppend(env).set(v.getObject());
            for (k = ZVal.minusSign(d.getObject());
                    ZVal.isLessThanOrEqualTo(k, "<=", d.getObject());
                    k = ZAssignment.add("+=", k, 2)) {
                if (ZVal.toBool(ZVal.strictEqualityCheck(k, "===", ZVal.minusSign(d.getObject())))
                        || ZVal.toBool(
                                ZVal.toBool(ZVal.strictNotEqualityCheck(k, "!==", d.getObject()))
                                        && ZVal.toBool(
                                                ZVal.isLessThan(
                                                        v.arrayGet(env, ZVal.subtract(k, 1)),
                                                        '<',
                                                        v.arrayGet(env, ZVal.add(k, 1)))))) {
                    x.setObject(ZVal.assign(v.arrayGet(env, ZVal.add(k, 1))));

                } else {
                    x.setObject(ZVal.add(v.arrayGet(env, ZVal.subtract(k, 1)), 1));
                }

                y.setObject(ZVal.subtract(x.getObject(), k));
                while (ZVal.toBool(
                                ZVal.toBool(ZVal.isLessThan(x.getObject(), '<', n))
                                        && ZVal.toBool(ZVal.isLessThan(y.getObject(), '<', m)))
                        && ZVal.toBool(
                                env.callFunctionDynamic(
                                                this.isEqual,
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                new ArrayDimensionReference(
                                                                        a.getObject(),
                                                                        x.getObject()))
                                                        .add(
                                                                1,
                                                                new ArrayDimensionReference(
                                                                        b.getObject(),
                                                                        y.getObject())),
                                                a.arrayGet(env, x.getObject()),
                                                b.arrayGet(env, y.getObject()))
                                        .value())) {
                    x.setObject(ZVal.increment(x.getObject()));
                    y.setObject(ZVal.increment(y.getObject()));
                }

                v.arrayAccess(env, k).set(x.getObject());
                if (ZVal.toBool(ZVal.isGreaterThanOrEqualTo(x.getObject(), ">=", n))
                        && ZVal.toBool(ZVal.isGreaterThanOrEqualTo(y.getObject(), ">=", m))) {
                    return ZVal.assign(
                            ZVal.newArray(
                                    new ZPair(0, trace.getObject()),
                                    new ZPair(1, x.getObject()),
                                    new ZPair(2, y.getObject())));
                }
            }
        }

        throw ZVal.getException(env, new PHPException(env, "Should not happen"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "trace", typeHint = "array")
    @ConvertedParameter(index = 1, name = "x", typeHint = "int")
    @ConvertedParameter(index = 2, name = "y", typeHint = "int")
    @ConvertedParameter(index = 3, name = "a", typeHint = "array")
    @ConvertedParameter(index = 4, name = "b", typeHint = "array")
    private Object extractDiff(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer trace = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer x = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer y = new BasicReferenceContainer(assignParameter(args, 2, false));
        ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 3, false));
        ReferenceContainer b = new BasicReferenceContainer(assignParameter(args, 4, false));
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer d = new BasicReferenceContainer(null);
        ReferenceContainer v = new BasicReferenceContainer(null);
        Object prevK = null;
        Object prevY = null;
        Object prevX = null;
        Object k = null;
        result.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (d.setObject(
                        ZVal.subtract(
                                function_count.f.env(env).call(trace.getObject()).value(), 1));
                ZVal.isGreaterThanOrEqualTo(d.getObject(), ">=", 0);
                d.setObject(ZVal.decrement(d.getObject()))) {
            v.setObject(ZVal.assign(trace.arrayGet(env, d.getObject())));
            k = ZVal.subtract(x.getObject(), y.getObject());
            if (ZVal.toBool(ZVal.strictEqualityCheck(k, "===", ZVal.minusSign(d.getObject())))
                    || ZVal.toBool(
                            ZVal.toBool(ZVal.strictNotEqualityCheck(k, "!==", d.getObject()))
                                    && ZVal.toBool(
                                            ZVal.isLessThan(
                                                    v.arrayGet(env, ZVal.subtract(k, 1)),
                                                    '<',
                                                    v.arrayGet(env, ZVal.add(k, 1)))))) {
                prevK = ZVal.add(k, 1);

            } else {
                prevK = ZVal.subtract(k, 1);
            }

            prevX = ZVal.assign(v.arrayGet(env, prevK));
            prevY = ZVal.subtract(prevX, prevK);
            runtimeConverterBreakCount = 0;
            while (ZVal.toBool(ZVal.isGreaterThan(x.getObject(), '>', prevX))
                    && ZVal.toBool(ZVal.isGreaterThan(y.getObject(), '>', prevY))) {
                result.arrayAppend(env)
                        .set(
                                new DiffElem(
                                        env,
                                        DiffElem.CONST_TYPE_KEEP,
                                        a.arrayGet(env, ZVal.subtract(x.getObject(), 1)),
                                        b.arrayGet(env, ZVal.subtract(y.getObject(), 1))));
                x.setObject(ZVal.decrement(x.getObject()));
                y.setObject(ZVal.decrement(y.getObject()));
            }

            if (ZVal.strictEqualityCheck(d.getObject(), "===", 0)) {
                break;
            }

            runtimeConverterBreakCount = 0;
            while (ZVal.isGreaterThan(x.getObject(), '>', prevX)) {
                result.arrayAppend(env)
                        .set(
                                new DiffElem(
                                        env,
                                        DiffElem.CONST_TYPE_REMOVE,
                                        a.arrayGet(env, ZVal.subtract(x.getObject(), 1)),
                                        ZVal.getNull()));
                x.setObject(ZVal.decrement(x.getObject()));
            }

            runtimeConverterBreakCount = 0;
            while (ZVal.isGreaterThan(y.getObject(), '>', prevY)) {
                result.arrayAppend(env)
                        .set(
                                new DiffElem(
                                        env,
                                        DiffElem.CONST_TYPE_ADD,
                                        ZVal.getNull(),
                                        b.arrayGet(env, ZVal.subtract(y.getObject(), 1))));
                y.setObject(ZVal.decrement(y.getObject()));
            }
        }

        return ZVal.assign(function_array_reverse.f.env(env).call(result.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    private Object coalesceReplacements(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer diff = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer newDiff = new BasicReferenceContainer(null);
        Object c = null;
        Object len = null;
        Object diffType = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer j = new BasicReferenceContainer(null);
        ReferenceContainer k = new BasicReferenceContainer(null);
        ReferenceContainer n = new BasicReferenceContainer(null);
        newDiff.setObject(ZVal.newArray());
        c = function_count.f.env(env).call(diff.getObject()).value();
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', c);
                i.setObject(ZVal.increment(i.getObject()))) {
            diffType =
                    ZVal.assign(
                            toObjectR(diff.arrayGet(env, i.getObject()))
                                    .accessProp(this, env)
                                    .name("type")
                                    .value());
            if (ZVal.strictNotEqualityCheck(diffType, "!==", DiffElem.CONST_TYPE_REMOVE)) {
                newDiff.arrayAppend(env).set(diff.arrayGet(env, i.getObject()));
                continue;
            }

            j.setObject(ZVal.assign(i.getObject()));
            runtimeConverterContinueCount = 0;
            while (ZVal.toBool(ZVal.isLessThan(j.getObject(), '<', c))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    toObjectR(diff.arrayGet(env, j.getObject()))
                                            .accessProp(this, env)
                                            .name("type")
                                            .value(),
                                    "===",
                                    DiffElem.CONST_TYPE_REMOVE))) {
                j.setObject(ZVal.increment(j.getObject()));
            }

            k.setObject(ZVal.assign(j.getObject()));
            runtimeConverterContinueCount = 0;
            while (ZVal.toBool(ZVal.isLessThan(k.getObject(), '<', c))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    toObjectR(diff.arrayGet(env, k.getObject()))
                                            .accessProp(this, env)
                                            .name("type")
                                            .value(),
                                    "===",
                                    DiffElem.CONST_TYPE_ADD))) {
                k.setObject(ZVal.increment(k.getObject()));
            }

            if (ZVal.strictEqualityCheck(
                    ZVal.subtract(j.getObject(), i.getObject()),
                    "===",
                    ZVal.subtract(k.getObject(), j.getObject()))) {
                len = ZVal.subtract(j.getObject(), i.getObject());
                runtimeConverterContinueCount = 0;
                for (n.setObject(0);
                        ZVal.isLessThan(n.getObject(), '<', len);
                        n.setObject(ZVal.increment(n.getObject()))) {
                    newDiff.arrayAppend(env)
                            .set(
                                    new DiffElem(
                                            env,
                                            DiffElem.CONST_TYPE_REPLACE,
                                            toObjectR(
                                                            diff.arrayGet(
                                                                    env,
                                                                    ZVal.add(
                                                                            i.getObject(),
                                                                            n.getObject())))
                                                    .accessProp(this, env)
                                                    .name("old")
                                                    .value(),
                                            toObjectR(
                                                            diff.arrayGet(
                                                                    env,
                                                                    ZVal.add(
                                                                            j.getObject(),
                                                                            n.getObject())))
                                                    .accessProp(this, env)
                                                    .name("new")
                                                    .value()));
                }

            } else {
                runtimeConverterContinueCount = 0;
                for (;
                        ZVal.isLessThan(i.getObject(), '<', k.getObject());
                        i.setObject(ZVal.increment(i.getObject()))) {
                    newDiff.arrayAppend(env).set(diff.arrayGet(env, i.getObject()));
                }
            }

            i.setObject(ZVal.subtract(k.getObject(), 1));
        }

        return ZVal.assign(newDiff.getObject());
    }

    public static final Object CONST_class = "PhpParser\\Internal\\Differ";

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
                    .setName("PhpParser\\Internal\\Differ")
                    .setLookup(
                            Differ.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("isEqual")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Internal/Differ.php")
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
