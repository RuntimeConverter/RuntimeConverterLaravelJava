package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.classes.Swift_StreamFilter;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/StringReplacementFilter.php

*/

public class Swift_StreamFilters_StringReplacementFilter extends RuntimeClassBase
        implements Swift_StreamFilter {

    public Object search = null;

    public Object replace = null;

    public Swift_StreamFilters_StringReplacementFilter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_StreamFilters_StringReplacementFilter.class) {
            this.__construct(env, args);
        }
    }

    public Swift_StreamFilters_StringReplacementFilter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "search")
    @ConvertedParameter(index = 1, name = "replace")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object search = assignParameter(args, 0, false);
        Object replace = assignParameter(args, 1, false);
        this.search = search;
        this.replace = replace;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buffer")
    public Object shouldBuffer(RuntimeEnv env, Object... args) {
        Object buffer = assignParameter(args, 0, false);
        Object needle = null;
        Object endOfBuffer = null;
        if (ZVal.strictEqualityCheck("", "===", buffer)) {
            return ZVal.assign(false);
        }

        endOfBuffer = function_substr.f.env(env).call(buffer, -1).value();
        for (ZPair zpairResult1597 : ZVal.getIterable(rToArrayCast(this.search), env, true)) {
            needle = ZVal.assign(zpairResult1597.getValue());
            if (ZVal.strictNotEqualityCheck(
                    false, "!==", function_strpos.f.env(env).call(needle, endOfBuffer).value())) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "buffer")
    public Object filter(RuntimeEnv env, Object... args) {
        Object buffer = assignParameter(args, 0, false);
        return ZVal.assign(
                function_str_replace.f.env(env).call(this.search, this.replace, buffer).value());
    }

    public static final Object CONST_class = "Swift_StreamFilters_StringReplacementFilter";

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
                    .setName("Swift_StreamFilters_StringReplacementFilter")
                    .setLookup(
                            Swift_StreamFilters_StringReplacementFilter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("replace", "search")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/StreamFilters/StringReplacementFilter.php")
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
