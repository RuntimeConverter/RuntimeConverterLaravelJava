package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Shortcut.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.SelectorNode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.ElementNode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.ParserInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.HashNode;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Parser/Shortcut/HashParser.php

*/

public class HashParser extends RuntimeClassBase implements ParserInterface {

    public HashParser(RuntimeEnv env, Object... args) {
        super(env);
    }

    public HashParser(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "source", typeHint = "string")
    public Object parse(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/^(?:([a-z]++)\\|)?+([\\w-]++|\\*)?+#([\\w-]++)$/i",
                        function_trim.f.env(env).call(source).value(),
                        matches.getObject())
                .getBool()) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    new SelectorNode(
                                            env,
                                            new HashNode(
                                                    env,
                                                    new ElementNode(
                                                            env,
                                                            ZVal.isTrue(
                                                                            ternaryExpressionTemp =
                                                                                    matches
                                                                                            .arrayGet(
                                                                                                    env,
                                                                                                    1))
                                                                    ? ternaryExpressionTemp
                                                                    : ZVal.getNull(),
                                                            ZVal.isTrue(
                                                                            ternaryExpressionTemp =
                                                                                    matches
                                                                                            .arrayGet(
                                                                                                    env,
                                                                                                    2))
                                                                    ? ternaryExpressionTemp
                                                                    : ZVal.getNull()),
                                                    matches.arrayGet(env, 3))))));
        }

        return ZVal.assign(ZVal.newArray());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\Parser\\Shortcut\\HashParser";

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
                    .setName("Symfony\\Component\\CssSelector\\Parser\\Shortcut\\HashParser")
                    .setLookup(
                            HashParser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/css-selector/Parser/Shortcut/HashParser.php")
                    .addInterface("Symfony\\Component\\CssSelector\\Parser\\ParserInterface")
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
