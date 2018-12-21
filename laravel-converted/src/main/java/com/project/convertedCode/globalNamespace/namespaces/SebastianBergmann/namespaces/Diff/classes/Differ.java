package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.TimeEfficientLongestCommonSubsequenceCalculator;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import java.lang.Math;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_prev;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.UnifiedDiffOutputBuilder;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.MemoryEfficientLongestCommonSubsequenceCalculator;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.DiffOutputBuilderInterface;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Differ.php

*/

public final class Differ extends RuntimeClassBase {

    public Object outputBuilder = null;

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
    @ConvertedParameter(
        index = 0,
        name = "outputBuilder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object outputBuilder = assignParameter(args, 0, true);
        if (null == outputBuilder) {
            outputBuilder = ZVal.getNull();
        }
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        outputBuilder,
                        DiffOutputBuilderInterface.class,
                        "SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface"))) {
            this.outputBuilder = outputBuilder;

        } else if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", outputBuilder)) {
            this.outputBuilder = new UnifiedDiffOutputBuilder(env);

        } else if (function_is_string.f.env(env).call(outputBuilder).getBool()) {
            this.outputBuilder = new UnifiedDiffOutputBuilder(env, outputBuilder);

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Expected builder to be an instance of DiffOutputBuilderInterface, <null> or a string, got %s.",
                                            function_is_object
                                                            .f
                                                            .env(env)
                                                            .call(outputBuilder)
                                                            .getBool()
                                                    ? "instance of \""
                                                            + toStringR(
                                                                    function_get_class
                                                                            .f
                                                                            .env(env)
                                                                            .call(outputBuilder)
                                                                            .value(),
                                                                    env)
                                                            + "\""
                                                    : toStringR(
                                                                    NamespaceGlobal.gettype
                                                                            .env(env)
                                                                            .call(outputBuilder)
                                                                            .value(),
                                                                    env)
                                                            + " \""
                                                            + toStringR(outputBuilder, env)
                                                            + "\"")
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    @ConvertedParameter(
        index = 2,
        name = "lcs",
        typeHint = "SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object diff(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        Object lcs = assignParameter(args, 2, true);
        if (null == lcs) {
            lcs = ZVal.getNull();
        }
        Object diff = null;
        diff =
                this.diffToArray(
                        env,
                        this.normalizeDiffInput(env, from),
                        this.normalizeDiffInput(env, to),
                        lcs);
        return ZVal.assign(env.callMethod(this.outputBuilder, "getDiff", Differ.class, diff));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    @ConvertedParameter(
        index = 2,
        name = "lcs",
        typeHint = "SebastianBergmann\\Diff\\LongestCommonSubsequenceCalculator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object diffToArray(RuntimeEnv env, Object... args) {
        ReferenceContainer from = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer to = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object lcs = assignParameter(args, 2, true);
        if (null == lcs) {
            lcs = ZVal.getNull();
        }
        Object runtimeTempArrayResult158 = null;
        Object common = null;
        Object start = null;
        Object end = null;
        ReferenceContainer diff = new BasicReferenceContainer(null);
        Object fromToken = null;
        Object toToken = null;
        Object token = null;
        if (function_is_string.f.env(env).call(from.getObject()).getBool()) {
            from.setObject(this.splitStringByLines(env, from.getObject()));

        } else if (!function_is_array.f.env(env).call(from.getObject()).getBool()) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "\"from\" must be an array or string."));
        }

        if (function_is_string.f.env(env).call(to.getObject()).getBool()) {
            to.setObject(this.splitStringByLines(env, to.getObject()));

        } else if (!function_is_array.f.env(env).call(to.getObject()).getBool()) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "\"to\" must be an array or string."));
        }

        ZVal.list(
                runtimeTempArrayResult158 =
                        runtimeStaticObject.getArrayDiffParted(
                                env,
                                new RuntimeArgsWithReferences().add(0, from).add(1, to),
                                from.getObject(),
                                to.getObject()),
                (from.setObject(listGet(runtimeTempArrayResult158, 0, env))),
                (to.setObject(listGet(runtimeTempArrayResult158, 1, env))),
                (start = listGet(runtimeTempArrayResult158, 2, env)),
                (end = listGet(runtimeTempArrayResult158, 3, env)));
        if (ZVal.strictEqualityCheck(lcs, "===", ZVal.getNull())) {
            lcs = this.selectLcsImplementation(env, from.getObject(), to.getObject());
        }

        common =
                env.callMethod(
                        lcs,
                        "calculate",
                        Differ.class,
                        function_array_values.f.env(env).call(from.getObject()).value(),
                        function_array_values.f.env(env).call(to.getObject()).value());
        diff.setObject(ZVal.newArray());
        for (ZPair zpairResult1440 : ZVal.getIterable(start, env, true)) {
            token = ZVal.assign(zpairResult1440.getValue());
            diff.arrayAppend(env).set(ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_OLD)));
        }

        function_reset.f.env(env).call(from.getObject());
        function_reset.f.env(env).call(to.getObject());
        for (ZPair zpairResult1441 : ZVal.getIterable(common, env, true)) {
            token = ZVal.assign(zpairResult1441.getValue());
            while (ZVal.strictNotEqualityCheck(
                    fromToken = function_reset.f.env(env).call(from.getObject()).value(),
                    "!==",
                    token)) {
                diff.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                function_array_shift
                                                        .f
                                                        .env(env)
                                                        .call(from.getObject())
                                                        .value()),
                                        new ZPair(1, CONST_REMOVED)));
            }

            while (ZVal.strictNotEqualityCheck(
                    toToken = function_reset.f.env(env).call(to.getObject()).value(),
                    "!==",
                    token)) {
                diff.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                function_array_shift
                                                        .f
                                                        .env(env)
                                                        .call(to.getObject())
                                                        .value()),
                                        new ZPair(1, CONST_ADDED)));
            }

            diff.arrayAppend(env).set(ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_OLD)));
            function_array_shift.f.env(env).call(from.getObject());
            function_array_shift.f.env(env).call(to.getObject());
        }

        while (ZVal.strictNotEqualityCheck(
                token = function_array_shift.f.env(env).call(from.getObject()).value(),
                "!==",
                ZVal.getNull())) {
            diff.arrayAppend(env)
                    .set(ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_REMOVED)));
        }

        while (ZVal.strictNotEqualityCheck(
                token = function_array_shift.f.env(env).call(to.getObject()).value(),
                "!==",
                ZVal.getNull())) {
            diff.arrayAppend(env)
                    .set(ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_ADDED)));
        }

        for (ZPair zpairResult1442 : ZVal.getIterable(end, env, true)) {
            token = ZVal.assign(zpairResult1442.getValue());
            diff.arrayAppend(env).set(ZVal.newArray(new ZPair(0, token), new ZPair(1, CONST_OLD)));
        }

        if (ZVal.isTrue(this.detectUnmatchedLineEndings(env, diff.getObject()))) {
            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            diff.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            "#Warning: Strings contain different line endings!\n"),
                                    new ZPair(1, CONST_DIFF_LINE_END_WARNING)));
        }

        return ZVal.assign(diff.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    private Object normalizeDiffInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        if (ZVal.toBool(!function_is_array.f.env(env).call(input).getBool())
                && ZVal.toBool(!function_is_string.f.env(env).call(input).getBool())) {
            return ZVal.assign(toStringR(input, env));
        }

        return ZVal.assign(input);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input", typeHint = "string")
    private Object splitStringByLines(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_split
                        .env(env)
                        .call("/(.*\\R)/", input, -1, ZVal.toLong(2) | ZVal.toLong(1))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    private Object selectLcsImplementation(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        Object memoryLimit = null;
        memoryLimit = ZVal.multiply(ZVal.multiply(100, 1024), 1024);
        if (ZVal.isGreaterThan(this.calculateEstimatedFootprint(env, from, to), '>', memoryLimit)) {
            return ZVal.assign(new MemoryEfficientLongestCommonSubsequenceCalculator(env));
        }

        return ZVal.assign(new TimeEfficientLongestCommonSubsequenceCalculator(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from", typeHint = "array")
    @ConvertedParameter(index = 1, name = "to", typeHint = "array")
    private Object calculateEstimatedFootprint(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        Object itemSize = null;
        itemSize = ZVal.assign(ZVal.strictEqualityCheck(8, "===", 4) ? 76 : 144);
        return ZVal.assign(
                ZVal.multiply(
                        itemSize,
                        Math.pow(
                                ZVal.toDouble(
                                        NamespaceGlobal.min
                                                .env(env)
                                                .call(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(from)
                                                                .value(),
                                                        function_count.f.env(env).call(to).value())
                                                .value()),
                                ZVal.toDouble(2))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    private Object detectUnmatchedLineEndings(RuntimeEnv env, Object... args) {
        Object diff = assignParameter(args, 0, false);
        ReferenceContainer entry = new BasicReferenceContainer(null);
        Object ln = null;
        Object set = null;
        ReferenceContainer newLineBreaks = new BasicReferenceContainer(null);
        Object _pBreak = null;
        ReferenceContainer oldLineBreaks = new BasicReferenceContainer(null);
        newLineBreaks.setObject(ZVal.newArray(new ZPair("", true)));
        oldLineBreaks.setObject(ZVal.newArray(new ZPair("", true)));
        for (ZPair zpairResult1443 : ZVal.getIterable(diff, env, true)) {
            entry.setObject(ZVal.assign(zpairResult1443.getValue()));
            if (ZVal.strictEqualityCheck(CONST_OLD, "===", entry.arrayGet(env, 1))) {
                ln = this.getLinebreak(env, entry.arrayGet(env, 0));
                oldLineBreaks.arrayAccess(env, ln).set(true);
                newLineBreaks.arrayAccess(env, ln).set(true);

            } else if (ZVal.strictEqualityCheck(CONST_ADDED, "===", entry.arrayGet(env, 1))) {
                newLineBreaks
                        .arrayAccess(env, this.getLinebreak(env, entry.arrayGet(env, 0)))
                        .set(true);

            } else if (ZVal.strictEqualityCheck(CONST_REMOVED, "===", entry.arrayGet(env, 1))) {
                oldLineBreaks
                        .arrayAccess(env, this.getLinebreak(env, entry.arrayGet(env, 0)))
                        .set(true);
            }
        }

        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.newArray(new ZPair("", true)),
                                "===",
                                newLineBreaks.getObject()))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                ZVal.newArray(new ZPair("", true)),
                                "===",
                                oldLineBreaks.getObject()))) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult1444 : ZVal.getIterable(newLineBreaks.getObject(), env, false)) {
            _pBreak = ZVal.assign(zpairResult1444.getKey());
            set = ZVal.assign(zpairResult1444.getValue());
            if (!arrayActionR(ArrayAction.ISSET, oldLineBreaks, env, _pBreak)) {
                return ZVal.assign(true);
            }
        }

        for (ZPair zpairResult1445 : ZVal.getIterable(oldLineBreaks.getObject(), env, false)) {
            _pBreak = ZVal.assign(zpairResult1445.getKey());
            set = ZVal.assign(zpairResult1445.getValue());
            if (!arrayActionR(ArrayAction.ISSET, newLineBreaks, env, _pBreak)) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    private Object getLinebreak(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object lc = null;
        if (!function_is_string.f.env(env).call(line).getBool()) {
            return "";
        }

        lc = function_substr.f.env(env).call(line, -1).value();
        if (ZVal.strictEqualityCheck("\r", "===", lc)) {
            return "\r";
        }

        if (ZVal.strictNotEqualityCheck("\n", "!==", lc)) {
            return "";
        }

        if (ZVal.strictEqualityCheck(
                "\r\n", "===", function_substr.f.env(env).call(line, -2).value())) {
            return "\r\n";
        }

        return "\n";
    }

    public static final Object CONST_OLD = 0;

    public static final Object CONST_ADDED = 1;

    public static final Object CONST_REMOVED = 2;

    public static final Object CONST_DIFF_LINE_END_WARNING = 3;

    public static final Object CONST_NO_LINE_END_EOF_WARNING = 4;

    public static final Object CONST_class = "SebastianBergmann\\Diff\\Differ";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "from", typeHint = "array")
        @ConvertedParameter(index = 1, name = "to", typeHint = "array")
        private Object getArrayDiffParted(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer from =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            ReferenceContainer to = assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
            Object toK = null;
            Object fromK = null;
            Object v = null;
            ReferenceContainer start = new BasicReferenceContainer(null);
            Object end = null;
            Object k = null;
            start.setObject(ZVal.newArray());
            end = ZVal.newArray();
            function_reset.f.env(env).call(to.getObject());
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1446 : ZVal.getIterable(from.getObject(), env, false)) {
                k = ZVal.assign(zpairResult1446.getKey());
                v = ZVal.assign(zpairResult1446.getValue());
                toK = function_key.f.env(env).call(to.getObject()).value();
                if (ZVal.toBool(ZVal.strictEqualityCheck(toK, "===", k))
                        && ZVal.toBool(ZVal.strictEqualityCheck(v, "===", to.arrayGet(env, k)))) {
                    start.arrayAccess(env, k).set(v);
                    arrayActionR(ArrayAction.UNSET, from, env, k);
                    arrayActionR(ArrayAction.UNSET, to, env, k);

                } else {
                    break;
                }
            }

            function_end.f.env(env).call(from.getObject());
            function_end.f.env(env).call(to.getObject());
            runtimeConverterBreakCount = 0;
            do {
                fromK = function_key.f.env(env).call(from.getObject()).value();
                toK = function_key.f.env(env).call(to.getObject()).value();
                if (ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", fromK))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        ZVal.getNull(), "===", toK)))
                        || ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        function_current.f.env(env).call(from.getObject()).value(),
                                        "!==",
                                        function_current
                                                .f
                                                .env(env)
                                                .call(to.getObject())
                                                .value()))) {
                    break;
                }

                function_prev.f.env(env).call(from.getObject());
                function_prev.f.env(env).call(to.getObject());
                end = ZVal.add(ZVal.newArray(new ZPair(fromK, from.arrayGet(env, fromK))), end);
                arrayActionR(ArrayAction.UNSET, from, env, fromK);
                arrayActionR(ArrayAction.UNSET, to, env, toK);

            } while (ZVal.isTrue(true));

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, from.getObject()),
                            new ZPair(1, to.getObject()),
                            new ZPair(2, start.getObject()),
                            new ZPair(3, end)));
        }

        public Object getArrayDiffParted(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Differ")
                    .setLookup(
                            Differ.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("outputBuilder")
                    .setFilename("vendor/sebastian/diff/src/Differ.php")
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
