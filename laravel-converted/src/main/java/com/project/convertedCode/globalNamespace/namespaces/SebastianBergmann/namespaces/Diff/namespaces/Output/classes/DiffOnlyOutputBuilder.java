package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.classes.Differ;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Diff.namespaces.Output.classes.DiffOutputBuilderInterface;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/diff/src/Output/DiffOnlyOutputBuilder.php

*/

public final class DiffOnlyOutputBuilder extends RuntimeClassBase
        implements DiffOutputBuilderInterface {

    public Object header = null;

    public DiffOnlyOutputBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DiffOnlyOutputBuilder.class) {
            this.__construct(env, args);
        }
    }

    public DiffOnlyOutputBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, true);
        if (null == header) {
            header = "--- Original\n+++ New\n";
        }
        this.header = header;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "diff", typeHint = "array")
    public Object getDiff(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object diff = assignParameter(args, 0, false);
        Object lc = null;
        Object buffer = null;
        ReferenceContainer diffEntry = new BasicReferenceContainer(null);
        buffer = function_fopen.f.env(env).call("php://memory", "r+b").value();
        if (ZVal.strictNotEqualityCheck("", "!==", this.header)) {
            function_fwrite.f.env(env).call(buffer, this.header);
            if (ZVal.strictNotEqualityCheck(
                    "\n", "!==", function_substr.f.env(env).call(this.header, -1, 1).value())) {
                function_fwrite.f.env(env).call(buffer, "\n");
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1447 : ZVal.getIterable(diff, env, true)) {
            diffEntry.setObject(ZVal.assign(zpairResult1447.getValue()));
            if (ZVal.strictEqualityCheck(diffEntry.arrayGet(env, 1), "===", Differ.CONST_ADDED)) {
                function_fwrite
                        .f
                        .env(env)
                        .call(buffer, "+" + toStringR(diffEntry.arrayGet(env, 0), env));

            } else if (ZVal.strictEqualityCheck(
                    diffEntry.arrayGet(env, 1), "===", Differ.CONST_REMOVED)) {
                function_fwrite
                        .f
                        .env(env)
                        .call(buffer, "-" + toStringR(diffEntry.arrayGet(env, 0), env));

            } else if (ZVal.strictEqualityCheck(
                    diffEntry.arrayGet(env, 1), "===", Differ.CONST_DIFF_LINE_END_WARNING)) {
                function_fwrite
                        .f
                        .env(env)
                        .call(buffer, " " + toStringR(diffEntry.arrayGet(env, 0), env));
                continue;

            } else {
                continue;
            }

            lc = function_substr.f.env(env).call(diffEntry.arrayGet(env, 0), -1).value();
            if (ZVal.toBool(ZVal.strictNotEqualityCheck(lc, "!==", "\n"))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(lc, "!==", "\r"))) {
                function_fwrite.f.env(env).call(buffer, "\n");
            }
        }

        diff = NamespaceGlobal.stream_get_contents.env(env).call(buffer, -1, 0).value();
        function_fclose.f.env(env).call(buffer);
        return ZVal.assign(diff);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\Diff\\Output\\DiffOnlyOutputBuilder";

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
                    .setName("SebastianBergmann\\Diff\\Output\\DiffOnlyOutputBuilder")
                    .setLookup(
                            DiffOnlyOutputBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("header")
                    .setFilename("vendor/sebastian/diff/src/Output/DiffOnlyOutputBuilder.php")
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
