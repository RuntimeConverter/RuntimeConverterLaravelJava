package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes.Translator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.HtmlExtension;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Shortcut.classes.HashParser;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Shortcut.classes.ElementParser;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Shortcut.classes.EmptyStringParser;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.namespaces.Shortcut.classes.ClassParser;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/CssSelectorConverter.php

*/

public class CssSelectorConverter extends RuntimeClassBase {

    public Object translator = null;

    public CssSelectorConverter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CssSelectorConverter.class) {
            this.__construct(env, args);
        }
    }

    public CssSelectorConverter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "html",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object html = assignParameter(args, 0, true);
        if (null == html) {
            html = true;
        }
        this.translator = new Translator(env);
        if (ZVal.isTrue(html)) {
            env.callMethod(
                    this.translator,
                    "registerExtension",
                    CssSelectorConverter.class,
                    new HtmlExtension(env, this.translator));
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.translator,
                                        "registerParserShortcut",
                                        CssSelectorConverter.class,
                                        new EmptyStringParser(env)),
                                "registerParserShortcut",
                                CssSelectorConverter.class,
                                new ElementParser(env)),
                        "registerParserShortcut",
                        CssSelectorConverter.class,
                        new ClassParser(env)),
                "registerParserShortcut",
                CssSelectorConverter.class,
                new HashParser(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cssExpr")
    @ConvertedParameter(index = 1, name = "prefix")
    public Object toXPath(RuntimeEnv env, Object... args) {
        Object cssExpr = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, true);
        if (null == prefix) {
            prefix = "descendant-or-self::";
        }
        return ZVal.assign(
                env.callMethod(
                        this.translator,
                        "cssToXPath",
                        CssSelectorConverter.class,
                        cssExpr,
                        prefix));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\CssSelectorConverter";

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
                    .setName("Symfony\\Component\\CssSelector\\CssSelectorConverter")
                    .setLookup(
                            CssSelectorConverter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("translator")
                    .setFilename("vendor/symfony/css-selector/CssSelectorConverter.php")
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
