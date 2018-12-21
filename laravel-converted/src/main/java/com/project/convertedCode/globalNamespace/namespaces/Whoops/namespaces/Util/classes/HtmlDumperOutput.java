package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Util/HtmlDumperOutput.php

*/

public class HtmlDumperOutput extends RuntimeClassBase {

    public Object output = null;

    public HtmlDumperOutput(RuntimeEnv env, Object... args) {
        super(env);
    }

    public HtmlDumperOutput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    @ConvertedParameter(index = 1, name = "depth")
    public Object __invoke(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object depth = assignParameter(args, 1, false);
        if (ZVal.isGreaterThanOrEqualTo(depth, ">=", 0)) {
            this.output =
                    toStringR(this.output, env)
                            + toStringR(
                                    function_str_repeat.f.env(env).call("  ", depth).value(), env)
                            + toStringR(line, env)
                            + "\n";
        }

        return null;
    }

    @ConvertedMethod
    public Object getOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.output);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.output = ZVal.getNull();
        return null;
    }

    public static final Object CONST_class = "Whoops\\Util\\HtmlDumperOutput";

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
                    .setName("Whoops\\Util\\HtmlDumperOutput")
                    .setLookup(
                            HtmlDumperOutput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("output")
                    .setFilename("vendor/filp/whoops/src/Whoops/Util/HtmlDumperOutput.php")
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
