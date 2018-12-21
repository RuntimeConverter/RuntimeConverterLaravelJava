package com.project.convertedCode.globalNamespace.namespaces.TijsVerkoyen.namespaces.CssToInlineStyles.namespaces.Css.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/tijsverkoyen/css-to-inline-styles/src/Css/Processor.php

*/

public class Processor extends RuntimeClassBase {

    public Processor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Processor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "css")
    @ConvertedParameter(
        index = 1,
        name = "existingRules",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getRules(RuntimeEnv env, Object... args) {
        Object css = assignParameter(args, 0, false);
        Object existingRules = assignParameter(args, 1, true);
        if (null == existingRules) {
            existingRules = ZVal.newArray();
        }
        Object rulesProcessor = null;
        Object rules = null;
        css = this.doCleanup(env, css);
        rulesProcessor =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .TijsVerkoyen
                        .namespaces
                        .CssToInlineStyles
                        .namespaces
                        .Css
                        .namespaces
                        .Rule
                        .classes
                        .Processor(env);
        rules = env.callMethod(rulesProcessor, "splitIntoSeparateRules", Processor.class, css);
        return ZVal.assign(
                env.callMethod(
                        rulesProcessor,
                        "convertArrayToObjects",
                        Processor.class,
                        rules,
                        existingRules));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "html")
    public Object getCssFromStyleTags(RuntimeEnv env, Object... args) {
        Object html = assignParameter(args, 0, false);
        Object css = null;
        Object htmlNoComments = null;
        Object match = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        css = "";
        matches.setObject(ZVal.newArray());
        htmlNoComments = function_preg_replace.f.env(env).call("|<!--.*?-->|s", "", html).value();
        function_preg_match_all
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("|<style(?:\\s.*)?>(.*)</style>|isU", htmlNoComments, matches.getObject());
        if (!arrayActionR(ArrayAction.EMPTY, matches, env, 1)) {
            for (ZPair zpairResult2236 : ZVal.getIterable(matches.arrayGet(env, 1), env, true)) {
                match = ZVal.assign(zpairResult2236.getValue());
                css =
                        toStringR(css, env)
                                + toStringR(function_trim.f.env(env).call(match).value(), env)
                                + "\n";
            }
        }

        return ZVal.assign(css);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "css")
    private Object doCleanup(RuntimeEnv env, Object... args) {
        Object css = assignParameter(args, 0, false);
        css = function_preg_replace.f.env(env).call("/@charset \"[^\"]++\";/", "", css).value();
        css =
                function_preg_replace
                        .f
                        .env(env)
                        .call("/@media [^{]*+{([^{}]++|{[^{}]*+})*+}/", "", css)
                        .value();
        css = function_str_replace.f.env(env).call(ZVal.arrayFromList("\r", "\n"), "", css).value();
        css = function_str_replace.f.env(env).call(ZVal.arrayFromList("\t"), " ", css).value();
        css = function_str_replace.f.env(env).call("\"", "'", css).value();
        css = function_preg_replace.f.env(env).call("|/\\*.*?\\*/|", "", css).value();
        css = function_preg_replace.f.env(env).call("/\\s\\s++/", " ", css).value();
        css = function_trim.f.env(env).call(css).value();
        return ZVal.assign(css);
    }

    public static final Object CONST_class = "TijsVerkoyen\\CssToInlineStyles\\Css\\Processor";

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
                    .setName("TijsVerkoyen\\CssToInlineStyles\\Css\\Processor")
                    .setLookup(
                            Processor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/tijsverkoyen/css-to-inline-styles/src/Css/Processor.php")
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
