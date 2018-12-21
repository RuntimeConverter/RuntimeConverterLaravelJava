package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.AbstractChunkOutputBuilder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Output/UnifiedDiffOutputBuilder.php

*/

public final class UnifiedDiffOutputBuilder extends AbstractChunkOutputBuilder {

    public Object collapseRanges = true;

    public Object commonLineThreshold = 6;

    public Object contextLines = 3;

    public Object header = null;

    public Object addLineNumbers = null;

    public UnifiedDiffOutputBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnifiedDiffOutputBuilder.class) {
            this.__construct(env, args);
        }
    }

    public UnifiedDiffOutputBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "addLineNumbers",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, true);
        if (null == header) {
            header = "--- Original\n+++ New\n";
        }
        Object addLineNumbers = assignParameter(args, 1, true);
        if (null == addLineNumbers) {
            addLineNumbers = false;
        }
        this.header = header;
        this.addLineNumbers = addLineNumbers;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    public Object getDiff(RuntimeEnv env, Object... args) {
        Object diff = assignParameter(args, 0, false);
        Object last = null;
        Object buffer = null;
        buffer = function_fopen.f.env(env).call("php://memory", "r+b").value();
        if (ZVal.strictNotEqualityCheck("", "!==", this.header)) {
            function_fwrite.f.env(env).call(buffer, this.header);
            if (ZVal.strictNotEqualityCheck(
                    "\n", "!==", function_substr.f.env(env).call(this.header, -1, 1).value())) {
                function_fwrite.f.env(env).call(buffer, "\n");
            }
        }

        if (ZVal.strictNotEqualityCheck(0, "!==", function_count.f.env(env).call(diff).value())) {
            this.writeDiffHunks(env, buffer, diff);
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
        for (ZPair zpairResult1451 : ZVal.getIterable(diff.getObject(), env, false)) {
            i.setObject(ZVal.assign(zpairResult1451.getKey()));
            entry.setObject(ZVal.assign(zpairResult1451.getValue()));
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
        if (ZVal.isTrue(this.addLineNumbers)) {
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

        } else {
            function_fwrite.f.env(env).call(output, "@@ @@\n");
        }

        for (i.setObject(ZVal.assign(diffStartIndex));
                ZVal.isLessThan(i.getObject(), '<', diffEndIndex);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.strictEqualityCheck(
                    diff.arrayGet(env, i.getObject(), 1), "===", Differ.CONST_ADDED)) {
                function_fwrite
                        .f
                        .env(env)
                        .call(output, "+" + toStringR(diff.arrayGet(env, i.getObject(), 0), env));

            } else if (ZVal.strictEqualityCheck(
                    diff.arrayGet(env, i.getObject(), 1), "===", Differ.CONST_REMOVED)) {
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
                function_fwrite.f.env(env).call(output, "\n");

            } else {
                function_fwrite
                        .f
                        .env(env)
                        .call(output, " " + toStringR(diff.arrayGet(env, i.getObject(), 0), env));
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\UnifiedDiffOutputBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractChunkOutputBuilder.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Diff\\Output\\UnifiedDiffOutputBuilder")
                    .setLookup(
                            UnifiedDiffOutputBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addLineNumbers",
                            "collapseRanges",
                            "commonLineThreshold",
                            "contextLines",
                            "header")
                    .setFilename("vendor/sebastian/diff/src/Output/UnifiedDiffOutputBuilder.php")
                    .addInterface("SebastianBergmann\\Diff\\Output\\DiffOutputBuilderInterface")
                    .addExtendsClass("SebastianBergmann\\Diff\\Output\\AbstractChunkOutputBuilder")
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
