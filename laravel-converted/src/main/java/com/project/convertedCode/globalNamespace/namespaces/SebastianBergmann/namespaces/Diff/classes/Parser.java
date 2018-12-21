package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Diff;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Chunk;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Line;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Parser.php

*/

public final class Parser extends RuntimeClassBase {

    public Parser(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Parser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    public Object parse(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object string = assignParameter(args, 0, false);
        ReferenceContainer fromMatch = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object diff = null;
        ReferenceContainer collected = new BasicReferenceContainer(null);
        ReferenceContainer lines = new BasicReferenceContainer(null);
        ReferenceContainer diffs = new BasicReferenceContainer(null);
        ReferenceContainer toMatch = new BasicReferenceContainer(null);
        Object lineCount = null;
        lines.setObject(
                NamespaceGlobal.preg_split.env(env).call("(\\r\\n|\\r|\\n)", string).value());
        if (ZVal.toBool(!ZVal.isEmpty(lines.getObject()))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                lines.arrayGet(
                                        env,
                                        ZVal.subtract(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(lines.getObject())
                                                        .value(),
                                                1)),
                                "===",
                                ""))) {
            function_array_pop.f.env(env).call(lines.getObject());
        }

        lineCount = function_count.f.env(env).call(lines.getObject()).value();
        diffs.setObject(ZVal.newArray());
        diff = ZVal.getNull();
        collected.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', lineCount);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.toBool(
                            function_preg_match
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, fromMatch))
                                    .call(
                                            "(^---\\s+(?P<file>\\S+))",
                                            lines.arrayGet(env, i.getObject()),
                                            fromMatch.getObject())
                                    .value())
                    && ZVal.toBool(
                            function_preg_match
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, toMatch))
                                    .call(
                                            "(^\\+\\+\\+\\s+(?P<file>\\S+))",
                                            lines.arrayGet(env, ZVal.add(i.getObject(), 1)),
                                            toMatch.getObject())
                                    .value())) {
                if (ZVal.strictNotEqualityCheck(diff, "!==", ZVal.getNull())) {
                    this.parseFileDiff(env, diff, collected.getObject());
                    diffs.arrayAppend(env).set(diff);
                    collected.setObject(ZVal.newArray());
                }

                diff =
                        new Diff(
                                env,
                                fromMatch.arrayGet(env, "file"),
                                toMatch.arrayGet(env, "file"));
                i.setObject(ZVal.increment(i.getObject()));

            } else {
                if (function_preg_match
                        .f
                        .env(env)
                        .call(
                                "/^(?:diff --git |index [\\da-f\\.]+|[+-]{3} [ab])/",
                                lines.arrayGet(env, i.getObject()))
                        .getBool()) {
                    continue;
                }

                collected.arrayAppend(env).set(lines.arrayGet(env, i.getObject()));
            }
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(diff, "!==", ZVal.getNull()))
                && ZVal.toBool(function_count.f.env(env).call(collected.getObject()).value())) {
            this.parseFileDiff(env, diff, collected.getObject());
            diffs.arrayAppend(env).set(diff);
        }

        return ZVal.assign(diffs.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "SebastianBergmann\\Diff\\Diff")
    @ConvertedParameter(index = 1, name = "lines", typeHint = "array")
    private Object parseFileDiff(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object diff = assignParameter(args, 0, false);
        Object lines = assignParameter(args, 1, false);
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        Object line = null;
        ReferenceContainer match = new BasicReferenceContainer(null);
        Object chunk = null;
        ReferenceContainer diffLines = new BasicReferenceContainer(null);
        Object type = null;
        chunks.setObject(ZVal.newArray());
        chunk = ZVal.getNull();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1452 : ZVal.getIterable(lines, env, true)) {
            line = ZVal.assign(zpairResult1452.getValue());
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call(
                            "/^@@\\s+-(?P<start>\\d+)(?:,\\s*(?P<startrange>\\d+))?\\s+\\+(?P<end>\\d+)(?:,\\s*(?P<endrange>\\d+))?\\s+@@/",
                            line,
                            match.getObject())
                    .getBool()) {
                chunk =
                        new Chunk(
                                env,
                                ZVal.toLong(match.arrayGet(env, "start")),
                                arrayActionR(ArrayAction.ISSET, match, env, "startrange")
                                        ? NamespaceGlobal.max
                                                .env(env)
                                                .call(
                                                        1,
                                                        ZVal.toLong(
                                                                match.arrayGet(env, "startrange")))
                                                .value()
                                        : 1,
                                ZVal.toLong(match.arrayGet(env, "end")),
                                arrayActionR(ArrayAction.ISSET, match, env, "endrange")
                                        ? NamespaceGlobal.max
                                                .env(env)
                                                .call(
                                                        1,
                                                        ZVal.toLong(
                                                                match.arrayGet(env, "endrange")))
                                                .value()
                                        : 1);
                chunks.arrayAppend(env).set(chunk);
                diffLines.setObject(ZVal.newArray());
                continue;
            }

            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call("/^(?P<type>[+ -])?(?P<line>.*)/", line, match.getObject())
                    .getBool()) {
                type = ZVal.assign(Line.CONST_UNCHANGED);
                if (ZVal.strictEqualityCheck(match.arrayGet(env, "type"), "===", "+")) {
                    type = ZVal.assign(Line.CONST_ADDED);

                } else if (ZVal.strictEqualityCheck(match.arrayGet(env, "type"), "===", "-")) {
                    type = ZVal.assign(Line.CONST_REMOVED);
                }

                diffLines.arrayAppend(env).set(new Line(env, type, match.arrayGet(env, "line")));
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", chunk)) {
                    env.callMethod(chunk, "setLines", Parser.class, diffLines.getObject());
                }
            }
        }

        env.callMethod(diff, "setChunks", Parser.class, chunks.getObject());
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Diff\\Parser";

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
                    .setName("SebastianBergmann\\Diff\\Parser")
                    .setLookup(
                            Parser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/diff/src/Parser.php")
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
