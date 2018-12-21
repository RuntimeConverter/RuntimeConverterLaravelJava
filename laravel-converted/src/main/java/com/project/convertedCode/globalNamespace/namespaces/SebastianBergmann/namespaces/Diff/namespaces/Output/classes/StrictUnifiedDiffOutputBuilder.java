package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.ConfigurationException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.DiffOutputBuilderInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Output/StrictUnifiedDiffOutputBuilder.php

*/

public final class StrictUnifiedDiffOutputBuilder extends RuntimeClassBase
        implements DiffOutputBuilderInterface {

    public Object changed = null;

    public Object collapseRanges = null;

    public Object commonLineThreshold = null;

    public Object header = null;

    public Object contextLines = null;

    public StrictUnifiedDiffOutputBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StrictUnifiedDiffOutputBuilder.class) {
            this.__construct(env, args);
        }
    }

    public StrictUnifiedDiffOutputBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object option = null;
        options.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .SebastianBergmann
                                                        .namespaces
                                                        .Diff
                                                        .namespaces
                                                        .Output
                                                        .classes
                                                        .StrictUnifiedDiffOutputBuilder
                                                        .RequestStaticProperties
                                                        .class)
                                        ._pDefault,
                                options.getObject())
                        .value());
        if (!function_is_bool.f.env(env).call(options.arrayGet(env, "collapseRanges")).getBool()) {
            throw ZVal.getException(
                    env,
                    new ConfigurationException(
                            env,
                            "collapseRanges",
                            "a bool",
                            options.arrayGet(env, "collapseRanges")));
        }

        if (ZVal.toBool(
                        !function_is_int
                                .f
                                .env(env)
                                .call(options.arrayGet(env, "contextLines"))
                                .getBool())
                || ZVal.toBool(ZVal.isLessThan(options.arrayGet(env, "contextLines"), '<', 0))) {
            throw ZVal.getException(
                    env,
                    new ConfigurationException(
                            env,
                            "contextLines",
                            "an int >= 0",
                            options.arrayGet(env, "contextLines")));
        }

        if (ZVal.toBool(
                        !function_is_int
                                .f
                                .env(env)
                                .call(options.arrayGet(env, "commonLineThreshold"))
                                .getBool())
                || ZVal.toBool(
                        ZVal.isLessThanOrEqualTo(
                                options.arrayGet(env, "commonLineThreshold"), "<=", 0))) {
            throw ZVal.getException(
                    env,
                    new ConfigurationException(
                            env,
                            "commonLineThreshold",
                            "an int > 0",
                            options.arrayGet(env, "commonLineThreshold")));
        }

        for (ZPair zpairResult1448 :
                ZVal.getIterable(ZVal.arrayFromList("fromFile", "toFile"), env, true)) {
            option = ZVal.assign(zpairResult1448.getValue());
            if (!function_is_string.f.env(env).call(options.arrayGet(env, option)).getBool()) {
                throw ZVal.getException(
                        env,
                        new ConfigurationException(
                                env, option, "a string", options.arrayGet(env, option)));
            }
        }

        for (ZPair zpairResult1449 :
                ZVal.getIterable(ZVal.arrayFromList("fromFileDate", "toFileDate"), env, true)) {
            option = ZVal.assign(zpairResult1449.getValue());
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    ZVal.getNull(), "!==", options.arrayGet(env, option)))
                    && ZVal.toBool(
                            !function_is_string
                                    .f
                                    .env(env)
                                    .call(options.arrayGet(env, option))
                                    .getBool())) {
                throw ZVal.getException(
                        env,
                        new ConfigurationException(
                                env, option, "a string or <null>", options.arrayGet(env, option)));
            }
        }

        this.header =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "--- %s%s\n+++ %s%s\n",
                                options.arrayGet(env, "fromFile"),
                                ZVal.strictEqualityCheck(
                                                ZVal.getNull(),
                                                "===",
                                                options.arrayGet(env, "fromFileDate"))
                                        ? ""
                                        : "\t"
                                                + toStringR(
                                                        options.arrayGet(env, "fromFileDate"), env),
                                options.arrayGet(env, "toFile"),
                                ZVal.strictEqualityCheck(
                                                ZVal.getNull(),
                                                "===",
                                                options.arrayGet(env, "toFileDate"))
                                        ? ""
                                        : "\t"
                                                + toStringR(
                                                        options.arrayGet(env, "toFileDate"), env))
                        .value();
        this.collapseRanges = options.arrayGet(env, "collapseRanges");
        this.commonLineThreshold = options.arrayGet(env, "commonLineThreshold");
        this.contextLines = options.arrayGet(env, "contextLines");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    public Object getDiff(RuntimeEnv env, Object... args) {
        Object diff = assignParameter(args, 0, false);
        Object last = null;
        Object buffer = null;
        if (ZVal.strictEqualityCheck(0, "===", function_count.f.env(env).call(diff).value())) {
            return "";
        }

        this.changed = false;
        buffer = function_fopen.f.env(env).call("php://memory", "r+b").value();
        function_fwrite.f.env(env).call(buffer, this.header);
        this.writeDiffHunks(env, buffer, diff);
        if (!ZVal.isTrue(this.changed)) {
            function_fclose.f.env(env).call(buffer);
            return "";
        }

        diff = NamespaceGlobal.stream_get_contents.env(env).call(buffer, -1, 0).value();
        function_fclose.f.env(env).call(buffer);
        last = function_substr.f.env(env).call(diff, -1).value();
        return ZVal.assign(
                ZVal.toBool(ZVal.strictNotEqualityCheck("\n", "!==", last))
                                && ZVal.toBool(ZVal.strictNotEqualityCheck("\r", "!==", last))
                        ? toStringR(diff, env) + "\n"
                        : diff);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    @ConvertedParameter(index = 1, name = "diff", typeHint = "array")
    private Object writeDiffHunks(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object output = assignParameter(args, 0, false);
        ReferenceContainer diff = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object contextStartOffset = null;
        ReferenceContainer toStart = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer toRange = new BasicReferenceContainer(null);
        ReferenceContainer entry = new BasicReferenceContainer(null);
        Object lc = null;
        Object contextEndOffset = null;
        Object upperLimit = null;
        ReferenceContainer toFind = new BasicReferenceContainer(null);
        Object cutOff = null;
        Object hunkCapture = null;
        ReferenceContainer fromRange = new BasicReferenceContainer(null);
        ReferenceContainer sameCount = new BasicReferenceContainer(null);
        ReferenceContainer fromStart = new BasicReferenceContainer(null);
        upperLimit = function_count.f.env(env).call(diff.getObject()).value();
        if (ZVal.strictEqualityCheck(
                0, "===", diff.arrayGet(env, ZVal.subtract(upperLimit, 1), 1))) {
            lc =
                    function_substr
                            .f
                            .env(env)
                            .call(diff.arrayGet(env, ZVal.subtract(upperLimit, 1), 0), -1)
                            .value();
            if (ZVal.strictNotEqualityCheck("\n", "!==", lc)) {
                function_array_splice
                        .f
                        .env(env)
                        .call(
                                diff.getObject(),
                                upperLimit,
                                0,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                ZVal.newArray(
                                                        new ZPair(
                                                                0,
                                                                "\n\\ No newline at end of file\n"),
                                                        new ZPair(
                                                                1,
                                                                Differ
                                                                        .CONST_NO_LINE_END_EOF_WARNING)))));
            }

        } else {
            toFind.setObject(ZVal.newArray(new ZPair(1, true), new ZPair(2, true)));
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (i.setObject(ZVal.subtract(upperLimit, 1));
                    ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 0);
                    i.setObject(ZVal.decrement(i.getObject()))) {
                if (arrayActionR(
                        ArrayAction.ISSET, toFind, env, diff.arrayGet(env, i.getObject(), 1))) {
                    arrayActionR(
                            ArrayAction.UNSET, toFind, env, diff.arrayGet(env, i.getObject(), 1));
                    lc =
                            function_substr
                                    .f
                                    .env(env)
                                    .call(diff.arrayGet(env, i.getObject(), 0), -1)
                                    .value();
                    if (ZVal.strictNotEqualityCheck("\n", "!==", lc)) {
                        function_array_splice
                                .f
                                .env(env)
                                .call(
                                        diff.getObject(),
                                        ZVal.add(i.getObject(), 1),
                                        0,
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        "\n\\ No newline at end of file\n"),
                                                                new ZPair(
                                                                        1,
                                                                        Differ
                                                                                .CONST_NO_LINE_END_EOF_WARNING)))));
                    }

                    if (!function_count.f.env(env).call(toFind.getObject()).getBool()) {
                        break;
                    }
                }
            }
        }

        cutOff =
                NamespaceGlobal.max
                        .env(env)
                        .call(this.commonLineThreshold, this.contextLines)
                        .value();
        hunkCapture = false;
        sameCount.setObject(ZVal.assign(toRange.setObject(ZVal.assign(fromRange.setObject(0)))));
        toStart.setObject(ZVal.assign(fromStart.setObject(1)));
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1450 : ZVal.getIterable(diff.getObject(), env, false)) {
            i.setObject(ZVal.assign(zpairResult1450.getKey()));
            entry.setObject(ZVal.assign(zpairResult1450.getValue()));
            if (ZVal.strictEqualityCheck(0, "===", entry.arrayGet(env, 1))) {
                if (ZVal.strictEqualityCheck(false, "===", hunkCapture)) {
                    fromStart.setObject(ZVal.increment(fromStart.getObject()));
                    toStart.setObject(ZVal.increment(toStart.getObject()));
                    continue;
                }

                sameCount.setObject(ZVal.increment(sameCount.getObject()));
                toRange.setObject(ZVal.increment(toRange.getObject()));
                fromRange.setObject(ZVal.increment(fromRange.getObject()));
                if (ZVal.strictEqualityCheck(sameCount.getObject(), "===", cutOff)) {
                    contextStartOffset =
                            ZVal.assign(
                                    ZVal.isLessThan(
                                                    ZVal.subtract(hunkCapture, this.contextLines),
                                                    '<',
                                                    0)
                                            ? hunkCapture
                                            : this.contextLines);
                    this.writeHunk(
                            env,
                            diff.getObject(),
                            ZVal.subtract(hunkCapture, contextStartOffset),
                            ZVal.add(
                                    ZVal.add(
                                            ZVal.subtract(i.getObject(), cutOff),
                                            this.contextLines),
                                    1),
                            ZVal.subtract(fromStart.getObject(), contextStartOffset),
                            ZVal.add(
                                    ZVal.add(
                                            ZVal.subtract(fromRange.getObject(), cutOff),
                                            contextStartOffset),
                                    this.contextLines),
                            ZVal.subtract(toStart.getObject(), contextStartOffset),
                            ZVal.add(
                                    ZVal.add(
                                            ZVal.subtract(toRange.getObject(), cutOff),
                                            contextStartOffset),
                                    this.contextLines),
                            output);
                    fromStart.setObject(
                            ZAssignment.add("+=", fromStart.getObject(), fromRange.getObject()));
                    toStart.setObject(
                            ZAssignment.add("+=", toStart.getObject(), toRange.getObject()));
                    hunkCapture = false;
                    sameCount.setObject(
                            ZVal.assign(toRange.setObject(ZVal.assign(fromRange.setObject(0)))));
                }

                continue;
            }

            sameCount.setObject(0);
            if (ZVal.strictEqualityCheck(
                    entry.arrayGet(env, 1), "===", Differ.CONST_NO_LINE_END_EOF_WARNING)) {
                continue;
            }

            this.changed = true;
            if (ZVal.strictEqualityCheck(false, "===", hunkCapture)) {
                hunkCapture = ZVal.assign(i.getObject());
            }

            if (ZVal.strictEqualityCheck(Differ.CONST_ADDED, "===", entry.arrayGet(env, 1))) {
                toRange.setObject(ZVal.increment(toRange.getObject()));
            }

            if (ZVal.strictEqualityCheck(Differ.CONST_REMOVED, "===", entry.arrayGet(env, 1))) {
                fromRange.setObject(ZVal.increment(fromRange.getObject()));
            }
        }

        if (ZVal.strictEqualityCheck(false, "===", hunkCapture)) {
            return null;
        }

        contextStartOffset =
                ZVal.assign(
                        ZVal.isLessThan(ZVal.subtract(hunkCapture, this.contextLines), '<', 0)
                                ? hunkCapture
                                : this.contextLines);
        contextEndOffset =
                NamespaceGlobal.min.env(env).call(sameCount.getObject(), this.contextLines).value();
        fromRange.setObject(
                ZAssignment.subtract("-=", fromRange.getObject(), sameCount.getObject()));
        toRange.setObject(ZAssignment.subtract("-=", toRange.getObject(), sameCount.getObject()));
        this.writeHunk(
                env,
                diff.getObject(),
                ZVal.subtract(hunkCapture, contextStartOffset),
                ZVal.add(
                        ZVal.add(
                                ZVal.subtract(i.getObject(), sameCount.getObject()),
                                contextEndOffset),
                        1),
                ZVal.subtract(fromStart.getObject(), contextStartOffset),
                ZVal.add(ZVal.add(fromRange.getObject(), contextStartOffset), contextEndOffset),
                ZVal.subtract(toStart.getObject(), contextStartOffset),
                ZVal.add(ZVal.add(toRange.getObject(), contextStartOffset), contextEndOffset),
                output);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    @ConvertedParameter(index = 1, name = "diffStartIndex", typeHint = "int")
    @ConvertedParameter(index = 2, name = "diffEndIndex", typeHint = "int")
    @ConvertedParameter(index = 3, name = "fromStart", typeHint = "int")
    @ConvertedParameter(index = 4, name = "fromRange", typeHint = "int")
    @ConvertedParameter(index = 5, name = "toStart", typeHint = "int")
    @ConvertedParameter(index = 6, name = "toRange", typeHint = "int")
    @ConvertedParameter(index = 7, name = "output")
    private Object writeHunk(RuntimeEnv env, Object... args) {
        ReferenceContainer diff = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object diffStartIndex = assignParameter(args, 1, false);
        Object diffEndIndex = assignParameter(args, 2, false);
        Object fromStart = assignParameter(args, 3, false);
        Object fromRange = assignParameter(args, 4, false);
        Object toStart = assignParameter(args, 5, false);
        Object toRange = assignParameter(args, 6, false);
        Object output = assignParameter(args, 7, false);
        ReferenceContainer i = new BasicReferenceContainer(null);
        function_fwrite.f.env(env).call(output, "@@ -" + toStringR(fromStart, env));
        if (ZVal.toBool(!ZVal.isTrue(this.collapseRanges))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(1, "!==", fromRange))) {
            function_fwrite.f.env(env).call(output, "," + toStringR(fromRange, env));
        }

        function_fwrite.f.env(env).call(output, " +" + toStringR(toStart, env));
        if (ZVal.toBool(!ZVal.isTrue(this.collapseRanges))
                || ZVal.toBool(ZVal.strictNotEqualityCheck(1, "!==", toRange))) {
            function_fwrite.f.env(env).call(output, "," + toStringR(toRange, env));
        }

        function_fwrite.f.env(env).call(output, " @@\n");
        for (i.setObject(ZVal.assign(diffStartIndex));
                ZVal.isLessThan(i.getObject(), '<', diffEndIndex);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.strictEqualityCheck(
                    diff.arrayGet(env, i.getObject(), 1), "===", Differ.CONST_ADDED)) {
                this.changed = true;
                function_fwrite
                        .f
                        .env(env)
                        .call(output, "+" + toStringR(diff.arrayGet(env, i.getObject(), 0), env));

            } else if (ZVal.strictEqualityCheck(
                    diff.arrayGet(env, i.getObject(), 1), "===", Differ.CONST_REMOVED)) {
                this.changed = true;
                function_fwrite
                        .f
                        .env(env)
                        .call(output, "-" + toStringR(diff.arrayGet(env, i.getObject(), 0), env));

            } else if (ZVal.strictEqualityCheck(
                    diff.arrayGet(env, i.getObject(), 1), "===", Differ.CONST_OLD)) {
                function_fwrite
                        .f
                        .env(env)
                        .call(output, " " + toStringR(diff.arrayGet(env, i.getObject(), 0), env));

            } else if (ZVal.strictEqualityCheck(
                    diff.arrayGet(env, i.getObject(), 1),
                    "===",
                    Differ.CONST_NO_LINE_END_EOF_WARNING)) {
                this.changed = true;
                function_fwrite.f.env(env).call(output, diff.arrayGet(env, i.getObject(), 0));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\StrictUnifiedDiffOutputBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object _pDefault =
                ZVal.newArray(
                        new ZPair("collapseRanges", true),
                        new ZPair("commonLineThreshold", 6),
                        new ZPair("contextLines", 3),
                        new ZPair("fromFile", ZVal.getNull()),
                        new ZPair("fromFileDate", ZVal.getNull()),
                        new ZPair("toFile", ZVal.getNull()),
                        new ZPair("toFileDate", ZVal.getNull()));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Output\\StrictUnifiedDiffOutputBuilder")
                    .setLookup(
                            StrictUnifiedDiffOutputBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "changed",
                            "collapseRanges",
                            "commonLineThreshold",
                            "contextLines",
                            "header")
                    .setStaticPropertyNames("default")
                    .setFilename(
                            "vendor/sebastian/diff/src/Output/StrictUnifiedDiffOutputBuilder.php")
                    .addInterface("SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface")
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
