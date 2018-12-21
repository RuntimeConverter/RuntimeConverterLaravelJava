package com.project.convertedCode.globalNamespace.namespaces.TijsVerkoyen.namespaces.CssToInlineStyles.namespaces.Css.namespaces.Rule.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.Specificity;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.TijsVerkoyen.namespaces.CssToInlineStyles.namespaces.Css.namespaces.Rule.classes.Rule;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/tijsverkoyen/css-to-inline-styles/src/Css/Rule/Processor.php

*/

public class Processor extends RuntimeClassBase {

    public Processor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Processor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rulesString")
    public Object splitIntoSeparateRules(RuntimeEnv env, Object... args) {
        Object rulesString = assignParameter(args, 0, false);
        rulesString = this.cleanup(env, rulesString);
        return ZVal.assign(
                rToArrayCast(function_explode.f.env(env).call("}", rulesString).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    private Object cleanup(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        string =
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("\r", "\n"), "", string)
                        .value();
        string =
                function_str_replace.f.env(env).call(ZVal.arrayFromList("\t"), " ", string).value();
        string = function_str_replace.f.env(env).call("\"", "'", string).value();
        string = function_preg_replace.f.env(env).call("|/\\*.*?\\*/|", "", string).value();
        string = function_preg_replace.f.env(env).call("/\\s\\s+/", " ", string).value();
        string = function_trim.f.env(env).call(string).value();
        string = function_rtrim.f.env(env).call(string, "}").value();
        return ZVal.assign(string);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rule")
    @ConvertedParameter(index = 1, name = "originalOrder")
    public Object convertToObjects(RuntimeEnv env, Object... args) {
        Object rule = assignParameter(args, 0, false);
        Object originalOrder = assignParameter(args, 1, false);
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        Object specificity = null;
        ReferenceContainer rules = new BasicReferenceContainer(null);
        Object selector = null;
        Object propertiesProcessor = null;
        Object selectors = null;
        Object properties = null;
        rule = this.cleanup(env, rule);
        chunks.setObject(function_explode.f.env(env).call("{", rule).value());
        if (!arrayActionR(ArrayAction.ISSET, chunks, env, 1)) {
            return ZVal.assign(ZVal.newArray());
        }

        propertiesProcessor =
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
                        .Property
                        .classes
                        .Processor(env);
        rules.setObject(ZVal.newArray());
        selectors =
                ZVal.assign(
                        rToArrayCast(
                                function_explode
                                        .f
                                        .env(env)
                                        .call(
                                                ",",
                                                function_trim
                                                        .f
                                                        .env(env)
                                                        .call(chunks.arrayGet(env, 0))
                                                        .value())
                                        .value()));
        properties =
                env.callMethod(
                        propertiesProcessor,
                        "splitIntoSeparateProperties",
                        Processor.class,
                        chunks.arrayGet(env, 1));
        for (ZPair zpairResult2240 : ZVal.getIterable(selectors, env, true)) {
            selector = ZVal.assign(zpairResult2240.getValue());
            selector = function_trim.f.env(env).call(selector).value();
            specificity = this.calculateSpecificityBasedOnASelector(env, selector);
            rules.arrayAppend(env)
                    .set(
                            new Rule(
                                    env,
                                    selector,
                                    env.callMethod(
                                            propertiesProcessor,
                                            "convertArrayToObjects",
                                            Processor.class,
                                            properties,
                                            specificity),
                                    specificity,
                                    originalOrder));
        }

        return ZVal.assign(rules.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "selector")
    public Object calculateSpecificityBasedOnASelector(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object idSelectorsPattern = null;
        Object classAttributesPseudoClassesSelectorsPattern = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object typePseudoElementsSelectorPattern = null;
        idSelectorsPattern = "  \\#";
        classAttributesPseudoClassesSelectorsPattern =
                "  (\\.[\\w]+)                     # classes\n                        |\n                        \\[(\\w+)                       # attributes\n                        |\n                        (\\:(                          # pseudo classes\n                          link|visited|active\n                          |hover|focus\n                          |lang\n                          |target\n                          |enabled|disabled|checked|indeterminate\n                          |root\n                          |nth-child|nth-last-child|nth-of-type|nth-last-of-type\n                          |first-child|last-child|first-of-type|last-of-type\n                          |only-child|only-of-type\n                          |empty|contains\n                        ))";
        typePseudoElementsSelectorPattern =
                "  ((^|[\\s\\+\\>\\~]+)[\\w]+       # elements\n                        |\n                        \\:{1,2}(                    # pseudo-elements\n                          after|before\n                          |first-letter|first-line\n                          |selection\n                        )\n                      )";
        return ZVal.assign(
                new Specificity(
                        env,
                        function_preg_match_all
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/" + toStringR(idSelectorsPattern, env) + "/ix",
                                        selector,
                                        matches.getObject())
                                .value(),
                        function_preg_match_all
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/"
                                                + toStringR(
                                                        classAttributesPseudoClassesSelectorsPattern,
                                                        env)
                                                + "/ix",
                                        selector,
                                        matches.getObject())
                                .value(),
                        function_preg_match_all
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/"
                                                + toStringR(typePseudoElementsSelectorPattern, env)
                                                + "/ix",
                                        selector,
                                        matches.getObject())
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rules", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "objects",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object convertArrayToObjects(RuntimeEnv env, Object... args) {
        Object rules = assignParameter(args, 0, false);
        Object objects = assignParameter(args, 1, true);
        if (null == objects) {
            objects = ZVal.newArray();
        }
        Object rule = null;
        ReferenceContainer order = new BasicReferenceContainer(null);
        order.setObject(1);
        for (ZPair zpairResult2241 : ZVal.getIterable(rules, env, true)) {
            rule = ZVal.assign(zpairResult2241.getValue());
            objects =
                    function_array_merge
                            .f
                            .env(env)
                            .call(objects, this.convertToObjects(env, rule, order.getObject()))
                            .value();
            order.setObject(ZVal.increment(order.getObject()));
        }

        return ZVal.assign(objects);
    }

    public static final Object CONST_class =
            "TijsVerkoyen\\CssToInlineStyles\\Css\\Rule\\Processor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "e1",
            typeHint = "TijsVerkoyen\\CssToInlineStyles\\Css\\Rule\\Rule"
        )
        @ConvertedParameter(
            index = 1,
            name = "e2",
            typeHint = "TijsVerkoyen\\CssToInlineStyles\\Css\\Rule\\Rule"
        )
        public Object sortOnSpecificity(RuntimeEnv env, Object... args) {
            Object e1 = assignParameter(args, 0, false);
            Object e2 = assignParameter(args, 1, false);
            Object e1Specificity = null;
            Object value = null;
            e1Specificity = env.callMethod(e1, "getSpecificity", Processor.class);
            value =
                    env.callMethod(
                            e1Specificity,
                            "compareTo",
                            Processor.class,
                            env.callMethod(e2, "getSpecificity", Processor.class));
            if (ZVal.strictEqualityCheck(value, "===", 0)) {
                value =
                        ZVal.subtract(
                                env.callMethod(e1, "getOrder", Processor.class),
                                env.callMethod(e2, "getOrder", Processor.class));
            }

            return ZVal.assign(value);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("TijsVerkoyen\\CssToInlineStyles\\Css\\Rule\\Processor")
                    .setLookup(
                            Processor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/tijsverkoyen/css-to-inline-styles/src/Css/Rule/Processor.php")
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
