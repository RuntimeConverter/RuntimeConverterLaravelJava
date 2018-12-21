package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_StreamFilter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/ByteArrayReplacementFilter.php

*/

public class Swift_StreamFilters_ByteArrayReplacementFilter extends RuntimeClassBase
        implements Swift_StreamFilter {

    public Object replace = null;

    public Object index = null;

    public Object tree = ZVal.newArray();

    public Object treeMaxLen = 0;

    public Object repSize = null;

    public Swift_StreamFilters_ByteArrayReplacementFilter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_StreamFilters_ByteArrayReplacementFilter.class) {
            this.__construct(env, args);
        }
    }

    public Swift_StreamFilters_ByteArrayReplacementFilter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "search")
    @ConvertedParameter(index = 1, name = "replace")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object search = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, false);
        Object size = null;
        Object search_element = null;
        ReferenceContainer tree = new BasicReferenceContainer(null);
        Object _pChar = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object last_size = null;
        Object k = null;
        Object rep = null;
        this.index = ZVal.newArray();
        this.tree = ZVal.newArray();
        this.replace = ZVal.newArray();
        this.repSize = ZVal.newArray();
        tree.setObject(ZVal.getNull());
        i.setObject(ZVal.getNull());
        last_size = ZVal.assign(size = 0);
        for (ZPair zpairResult1594 : ZVal.getIterable(search, env, false)) {
            i.setObject(ZVal.assign(zpairResult1594.getKey()));
            search_element = ZVal.assign(zpairResult1594.getValue());
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", tree.getObject())) {
                tree.arrayAccess(env, -1)
                        .set(
                                NamespaceGlobal.min
                                        .env(env)
                                        .call(
                                                ZVal.subtract(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(replace)
                                                                .value(),
                                                        1),
                                                ZVal.subtract(i.getObject(), 1))
                                        .value());
                tree.arrayAccess(env, -2).set(last_size);
            }

            tree = new ReferenceClassProperty(this, "tree", env);
            if (function_is_array.f.env(env).call(search_element).getBool()) {
                for (ZPair zpairResult1595 : ZVal.getIterable(search_element, env, false)) {
                    k = ZVal.assign(zpairResult1595.getKey());
                    _pChar = ZVal.assign(zpairResult1595.getValue());
                    new ReferenceClassProperty(this, "index", env)
                            .arrayAccess(env, _pChar)
                            .set(true);
                    if (!arrayActionR(ArrayAction.ISSET, tree, env, _pChar)) {
                        tree.arrayAccess(env, _pChar).set(ZVal.newArray());
                    }

                    tree = new ArrayDimensionReference(tree.getObject(), _pChar);
                }

                last_size = ZVal.add(k, 1);
                size = NamespaceGlobal.max.env(env).call(size, last_size).value();

            } else {
                last_size = 1;
                if (!arrayActionR(ArrayAction.ISSET, tree, env, search_element)) {
                    tree.arrayAccess(env, search_element).set(ZVal.newArray());
                }

                tree = new ArrayDimensionReference(tree.getObject(), search_element);
                size = NamespaceGlobal.max.env(env).call(last_size, size).value();
                new ReferenceClassProperty(this, "index", env)
                        .arrayAccess(env, search_element)
                        .set(true);
            }
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", i.getObject())) {
            tree.arrayAccess(env, -1)
                    .set(
                            NamespaceGlobal.min
                                    .env(env)
                                    .call(
                                            ZVal.subtract(
                                                    function_count.f.env(env).call(replace).value(),
                                                    1),
                                            i.getObject())
                                    .value());
            tree.arrayAccess(env, -2).set(last_size);
            this.treeMaxLen = size;
        }

        for (ZPair zpairResult1596 : ZVal.getIterable(replace, env, true)) {
            rep = ZVal.assign(zpairResult1596.getValue());
            if (!function_is_array.f.env(env).call(rep).getBool()) {
                rep = ZVal.newArray(new ZPair(0, rep));
            }

            new ReferenceClassProperty(this, "replace", env).arrayAppend(env).set(rep);
        }

        for (i.setObject(ZVal.subtract(function_count.f.env(env).call(this.replace).value(), 1));
                ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 0);
                i.setObject(ZVal.decrement(i.getObject()))) {
            new ReferenceClassProperty(this, "replace", env)
                    .arrayAccess(env, i.getObject())
                    .set(
                            rep =
                                    this.filter(
                                            env,
                                            new ReferenceClassProperty(this, "replace", env)
                                                    .arrayGet(env, i.getObject()),
                                            i.getObject()));
            new ReferenceClassProperty(this, "repSize", env)
                    .arrayAccess(env, i.getObject())
                    .set(function_count.f.env(env).call(rep).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buffer")
    public Object shouldBuffer(RuntimeEnv env, Object... args) {
        Object buffer = assignParameter(args, 0, false);
        Object endOfBuffer = null;
        endOfBuffer = function_end.f.env(env).call(buffer).value();
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "index", env),
                        env,
                        endOfBuffer));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buffer")
    @ConvertedParameter(index = 1, name = "minReplaces")
    public Object filter(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        ReferenceContainer buffer = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object minReplaces = assignParameter(args, 1, true);
        if (null == minReplaces) {
            minReplaces = -1;
        }
        Object p = null;
        ReferenceContainer search_pos = new BasicReferenceContainer(null);
        ReferenceContainer newBuffer = new BasicReferenceContainer(null);
        Object buf_size = null;
        Object last_found = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object rep_size = null;
        Object last_size = null;
        ReferenceContainer j = new BasicReferenceContainer(null);
        if (ZVal.equalityCheck(0, this.treeMaxLen)) {
            return ZVal.assign(buffer.getObject());
        }

        newBuffer.setObject(ZVal.newArray());
        buf_size = function_count.f.env(env).call(buffer.getObject()).value();
        last_size = 0;
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', buf_size);
                i.setObject(ZVal.increment(i.getObject()))) {
            search_pos.setObject(ZVal.assign(this.tree));
            last_found = 9223372036854775807L;
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (j.setObject(0);
                    ZVal.isLessThanOrEqualTo(j.getObject(), "<=", this.treeMaxLen);
                    j.setObject(ZVal.increment(j.getObject()))) {
                if (ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        buffer,
                                        env,
                                        p = ZVal.add(i.getObject(), j.getObject())))
                        && ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        search_pos,
                                        env,
                                        buffer.arrayGet(env, p)))) {
                    search_pos.setObject(
                            ZVal.assign(search_pos.arrayGet(env, buffer.arrayGet(env, p))));
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    arrayActionR(
                                                            ArrayAction.ISSET, search_pos, env, -1))
                                            && ZVal.toBool(
                                                    ZVal.isLessThan(
                                                            search_pos.arrayGet(env, -1),
                                                            '<',
                                                            last_found)))
                            && ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            search_pos.arrayGet(env, -1), '>', minReplaces))) {
                        last_found = ZVal.assign(search_pos.arrayGet(env, -1));
                        last_size = ZVal.assign(search_pos.arrayGet(env, -2));
                    }

                } else if (ZVal.strictNotEqualityCheck(9223372036854775807L, "!==", last_found)) {
                    rep_size =
                            ZVal.assign(
                                    new ReferenceClassProperty(this, "repSize", env)
                                            .arrayGet(env, last_found));
                    runtimeConverterBreakCount = 0;
                    runtimeConverterContinueCount = 0;
                    for (j.setObject(0);
                            ZVal.isLessThan(j.getObject(), '<', rep_size);
                            j.setObject(ZVal.increment(j.getObject()))) {
                        newBuffer
                                .arrayAppend(env)
                                .set(
                                        new ReferenceClassProperty(this, "replace", env)
                                                .arrayGet(env, last_found, j.getObject()));
                    }

                    i.setObject(ZAssignment.add("+=", i.getObject(), ZVal.subtract(last_size, 1)));
                    if (ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", buf_size)) {
                        newBuffer.arrayAppend(env).set(buffer.arrayGet(env, i.getObject()));
                    }

                    runtimeConverterContinueCount = 2;
                    runtimeConverterContinueCount--;
                    continue;

                } else {
                    break;
                }
            }

            newBuffer.arrayAppend(env).set(buffer.arrayGet(env, i.getObject()));
        }

        return ZVal.assign(newBuffer.getObject());
    }

    public static final Object CONST_class = "Swift_StreamFilters_ByteArrayReplacementFilter";

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
                    .setName("Swift_StreamFilters_ByteArrayReplacementFilter")
                    .setLookup(
                            Swift_StreamFilters_ByteArrayReplacementFilter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("index", "repSize", "replace", "tree", "treeMaxLen")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/ByteArrayReplacementFilter.php")
                    .addInterface("Swift_StreamFilter")
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
