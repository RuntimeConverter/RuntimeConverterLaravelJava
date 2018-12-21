package com.project.convertedCode.globalNamespace.namespaces.Cron.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.FieldInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.OutOfRangeException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/dragonmantank/cron-expression/src/Cron/AbstractField.php

*/

public abstract class AbstractField extends RuntimeClassBase implements FieldInterface {

    public Object fullRange = ZVal.newArray();

    public Object literals = ZVal.newArray();

    public Object rangeStart = null;

    public Object rangeEnd = null;

    public AbstractField(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractField.class) {
            this.__construct(env, args);
        }
    }

    public AbstractField(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.fullRange = function_range.f.env(env).call(this.rangeStart, this.rangeEnd).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dateValue")
    @ConvertedParameter(index = 1, name = "value")
    public Object isSatisfied(RuntimeEnv env, Object... args) {
        Object dateValue = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.isTrue(this.isIncrementsOfRanges(env, value))) {
            return ZVal.assign(this.isInIncrementsOfRanges(env, dateValue, value));

        } else if (ZVal.isTrue(this.isRange(env, value))) {
            return ZVal.assign(this.isInRange(env, dateValue, value));
        }

        return ZVal.assign(
                ZVal.toBool(ZVal.equalityCheck(value, "*"))
                        || ZVal.toBool(ZVal.equalityCheck(dateValue, value)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object isRange(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_strpos.f.env(env).call(value, "-").value(), "!==", false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object isIncrementsOfRanges(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_strpos.f.env(env).call(value, "/").value(), "!==", false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dateValue")
    @ConvertedParameter(index = 1, name = "value")
    public Object isInRange(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/dragonmantank/cron-expression/src/Cron")
                        .setFile(
                                "/vendor/dragonmantank/cron-expression/src/Cron/AbstractField.php");
        Object dateValue = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer parts = new BasicReferenceContainer(null);
        parts.setObject(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env, runtimeConverterFunctionClassConstants, "Cron", this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object value = assignParameter(args, 0, false);
                                        value = function_trim.f.env(env).call(value).value();
                                        value = AbstractField.this.convertLiterals(env, value);
                                        return ZVal.assign(value);
                                    }
                                },
                                function_explode.f.env(env).call("-", value, 2).value())
                        .value());
        return ZVal.assign(
                ZVal.toBool(ZVal.isGreaterThanOrEqualTo(dateValue, ">=", parts.arrayGet(env, 0)))
                        && ZVal.toBool(
                                ZVal.isLessThanOrEqualTo(dateValue, "<=", parts.arrayGet(env, 1))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dateValue")
    @ConvertedParameter(index = 1, name = "value")
    public Object isInIncrementsOfRanges(RuntimeEnv env, Object... args) {
        Object dateValue = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object rangeStart = null;
        ReferenceContainer rangeChunks = new BasicReferenceContainer(null);
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        Object thisRange = null;
        Object range = null;
        Object step = null;
        Object rangeEnd = null;
        chunks.setObject(
                function_array_map
                        .f
                        .env(env)
                        .call("trim", function_explode.f.env(env).call("/", value, 2).value())
                        .value());
        range = ZVal.assign(chunks.arrayGet(env, 0));
        step =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, chunks, env, 1)
                                ? chunks.arrayGet(env, 1)
                                : 0);
        if (ZVal.toBool(
                        ZVal.toBool(function_is_null.f.env(env).call(step).value())
                                || ZVal.toBool(ZVal.strictEqualityCheck("0", "===", step)))
                || ZVal.toBool(ZVal.strictEqualityCheck(0, "===", step))) {
            return ZVal.assign(false);
        }

        if (ZVal.equalityCheck("*", range)) {
            range = toStringR(this.rangeStart, env) + "-" + toStringR(this.rangeEnd, env);
        }

        rangeChunks.setObject(function_explode.f.env(env).call("-", range, 2).value());
        rangeStart = ZVal.assign(rangeChunks.arrayGet(env, 0));
        rangeEnd =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, rangeChunks, env, 1)
                                ? rangeChunks.arrayGet(env, 1)
                                : rangeStart);
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.isLessThan(rangeStart, '<', this.rangeStart))
                                || ZVal.toBool(ZVal.isGreaterThan(rangeStart, '>', this.rangeEnd)))
                || ZVal.toBool(ZVal.isGreaterThan(rangeStart, '>', rangeEnd))) {
            throw ZVal.getException(
                    env, new OutOfRangeException(env, "Invalid range start requested"));
        }

        if (ZVal.toBool(
                        ZVal.toBool(ZVal.isLessThan(rangeEnd, '<', this.rangeStart))
                                || ZVal.toBool(ZVal.isGreaterThan(rangeEnd, '>', this.rangeEnd)))
                || ZVal.toBool(ZVal.isLessThan(rangeEnd, '<', rangeStart))) {
            throw ZVal.getException(
                    env, new OutOfRangeException(env, "Invalid range end requested"));
        }

        if (ZVal.isGreaterThanOrEqualTo(step, ">=", this.rangeEnd)) {
            thisRange =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    new ReferenceClassProperty(this, "fullRange", env)
                                            .arrayGet(
                                                    env,
                                                    ZVal.modulus(
                                                            step,
                                                            function_count
                                                                    .f
                                                                    .env(env)
                                                                    .call(this.fullRange)
                                                                    .value()))));

        } else {
            thisRange = function_range.f.env(env).call(rangeStart, rangeEnd, step).value();
        }

        return ZVal.assign(function_in_array.f.env(env).call(dateValue, thisRange).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    @ConvertedParameter(index = 1, name = "max")
    public Object getRangeForExpression(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        Object max = assignParameter(args, 1, false);
        Object expanded = null;
        Object ranges = null;
        Object offset = null;
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object stepSize = null;
        ReferenceContainer range = new BasicReferenceContainer(null);
        Object i = null;
        Object runtimeTempArrayResult1 = null;
        Object to = null;
        values.setObject(ZVal.newArray());
        expression = this.convertLiterals(env, expression);
        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(expression, ",").value(), "!==", false)) {
            ranges = function_explode.f.env(env).call(",", expression).value();
            values.setObject(ZVal.newArray());
            for (ZPair zpairResult16 : ZVal.getIterable(ranges, env, true)) {
                range.setObject(ZVal.assign(zpairResult16.getValue()));
                expanded = this.getRangeForExpression(env, range.getObject(), this.rangeEnd);
                values.setObject(
                        function_array_merge.f.env(env).call(values.getObject(), expanded).value());
            }

            return ZVal.assign(values.getObject());
        }

        if (ZVal.toBool(this.isRange(env, expression))
                || ZVal.toBool(this.isIncrementsOfRanges(env, expression))) {
            if (!ZVal.isTrue(this.isIncrementsOfRanges(env, expression))) {
                ZVal.list(
                        runtimeTempArrayResult1 =
                                function_explode.f.env(env).call("-", expression).value(),
                        (offset = listGet(runtimeTempArrayResult1, 0, env)),
                        (to = listGet(runtimeTempArrayResult1, 1, env)));
                offset = this.convertLiterals(env, offset);
                to = this.convertLiterals(env, to);
                stepSize = 1;

            } else {
                range.setObject(
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        "trim",
                                        function_explode
                                                .f
                                                .env(env)
                                                .call("/", expression, 2)
                                                .value())
                                .value());
                stepSize =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, range, env, 1)
                                        ? range.arrayGet(env, 1)
                                        : 0);
                range.setObject(ZVal.assign(range.arrayGet(env, 0)));
                range.setObject(
                        function_explode.f.env(env).call("-", range.getObject(), 2).value());
                offset = ZVal.assign(range.arrayGet(env, 0));
                to =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, range, env, 1)
                                        ? range.arrayGet(env, 1)
                                        : max);
            }

            offset = ZVal.assign(ZVal.equalityCheck(offset, "*") ? this.rangeStart : offset);
            if (ZVal.isGreaterThanOrEqualTo(stepSize, ">=", this.rangeEnd)) {
                values.setObject(
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        new ReferenceClassProperty(this, "fullRange", env)
                                                .arrayGet(
                                                        env,
                                                        ZVal.modulus(
                                                                stepSize,
                                                                function_count
                                                                        .f
                                                                        .env(env)
                                                                        .call(this.fullRange)
                                                                        .value())))));

            } else {
                for (i = ZVal.assign(offset);
                        ZVal.isLessThanOrEqualTo(i, "<=", to);
                        i = ZAssignment.add("+=", i, stepSize)) {
                    values.arrayAppend(env).set(ZVal.toLong(i));
                }
            }

            function_sort.f.env(env).call(values.getObject());

        } else {
            values.setObject(ZVal.newArray(new ZPair(0, expression)));
        }

        return ZVal.assign(values.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object convertLiterals(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object key = null;
        if (function_count.f.env(env).call(this.literals).getBool()) {
            key = function_array_search.f.env(env).call(value, this.literals).value();
            if (ZVal.strictNotEqualityCheck(key, "!==", false)) {
                return ZVal.assign(key);
            }
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object validate(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object listItem = null;
        Object runtimeTempArrayResult2 = null;
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        Object range = null;
        Object step = null;
        value = this.convertLiterals(env, value);
        if (ZVal.strictEqualityCheck("*", "===", value)) {
            return ZVal.assign(true);
        }

        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(value, "/").value(), "!==", false)) {
            ZVal.list(
                    runtimeTempArrayResult2 = function_explode.f.env(env).call("/", value).value(),
                    (range = listGet(runtimeTempArrayResult2, 0, env)),
                    (step = listGet(runtimeTempArrayResult2, 1, env)));
            return ZVal.assign(
                    ZVal.toBool(this.validate(env, range))
                            && ZVal.toBool(function_filter_var.f.env(env).call(step, 257).value()));
        }

        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(value, ",").value(), "!==", false)) {
            for (ZPair zpairResult17 :
                    ZVal.getIterable(
                            function_explode.f.env(env).call(",", value).value(), env, true)) {
                listItem = ZVal.assign(zpairResult17.getValue());
                if (!ZVal.isTrue(this.validate(env, listItem))) {
                    return ZVal.assign(false);
                }
            }

            return ZVal.assign(true);
        }

        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(value, "-").value(), "!==", false)) {
            if (ZVal.isGreaterThan(
                    NamespaceGlobal.substr_count.env(env).call(value, "-").value(), '>', 1)) {
                return ZVal.assign(false);
            }

            chunks.setObject(function_explode.f.env(env).call("-", value).value());
            chunks.arrayAccess(env, 0).set(this.convertLiterals(env, chunks.arrayGet(env, 0)));
            chunks.arrayAccess(env, 1).set(this.convertLiterals(env, chunks.arrayGet(env, 1)));
            if (ZVal.toBool(ZVal.equalityCheck("*", chunks.arrayGet(env, 0)))
                    || ZVal.toBool(ZVal.equalityCheck("*", chunks.arrayGet(env, 1)))) {
                return ZVal.assign(false);
            }

            return ZVal.assign(
                    ZVal.toBool(this.validate(env, chunks.arrayGet(env, 0)))
                            && ZVal.toBool(this.validate(env, chunks.arrayGet(env, 1))));
        }

        if (!function_is_numeric.f.env(env).call(value).getBool()) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(function_is_float.f.env(env).call(value).value())
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(value, ".").value(),
                                "!==",
                                false))) {
            return ZVal.assign(false);
        }

        value = ZVal.assign(ZVal.toLong(value));
        return ZVal.assign(function_in_array.f.env(env).call(value, this.fullRange, true).value());
    }

    public static final Object CONST_class = "Cron\\AbstractField";

    @ConvertedMethod()
    public abstract Object isSatisfiedBy(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object increment(RuntimeEnv env, Object... args);

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
                    .setName("Cron\\AbstractField")
                    .setLookup(
                            AbstractField.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fullRange", "literals", "rangeEnd", "rangeStart")
                    .setFilename("vendor/dragonmantank/cron-expression/src/Cron/AbstractField.php")
                    .addInterface("Cron\\FieldInterface")
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
