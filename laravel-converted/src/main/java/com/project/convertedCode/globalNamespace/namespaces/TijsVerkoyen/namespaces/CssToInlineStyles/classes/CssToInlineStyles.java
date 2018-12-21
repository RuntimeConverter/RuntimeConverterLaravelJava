package com.project.convertedCode.globalNamespace.namespaces.TijsVerkoyen.namespaces.CssToInlineStyles.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMXPath;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.classes.CssSelectorConverter;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/tijsverkoyen/css-to-inline-styles/src/CssToInlineStyles.php

*/

public class CssToInlineStyles extends RuntimeClassBase {

    public Object cssConverter = null;

    public CssToInlineStyles(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CssToInlineStyles.class) {
            this.__construct(env, args);
        }
    }

    public CssToInlineStyles(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        if (function_class_exists
                .f
                .env(env)
                .call("Symfony\\Component\\CssSelector\\CssSelectorConverter")
                .getBool()) {
            this.cssConverter = new CssSelectorConverter(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "html")
    @ConvertedParameter(
        index = 1,
        name = "css",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object convert(RuntimeEnv env, Object... args) {
        Object html = assignParameter(args, 0, false);
        Object css = assignParameter(args, 1, true);
        if (null == css) {
            css = ZVal.getNull();
        }
        Object document = null;
        Object rules = null;
        Object processor = null;
        document = this.createDomDocumentFromHtml(env, html);
        processor =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .TijsVerkoyen
                        .namespaces
                        .CssToInlineStyles
                        .namespaces
                        .Css
                        .classes
                        .Processor(env);
        rules =
                env.callMethod(
                        processor,
                        "getRules",
                        CssToInlineStyles.class,
                        env.callMethod(
                                processor, "getCssFromStyleTags", CssToInlineStyles.class, html));
        if (ZVal.strictNotEqualityCheck(css, "!==", ZVal.getNull())) {
            rules = env.callMethod(processor, "getRules", CssToInlineStyles.class, css, rules);
        }

        document = this.inline(env, document, rules);
        return ZVal.assign(this.getHtmlFromDocument(env, document));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "properties", typeHint = "array")
    public Object inlineCssOnElement(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object properties = assignParameter(args, 1, false);
        ReferenceContainer cssProperties = new BasicReferenceContainer(null);
        ReferenceContainer inlineProperties = new BasicReferenceContainer(null);
        Object property = null;
        ReferenceContainer rules = new BasicReferenceContainer(null);
        if (ZVal.isEmpty(properties)) {
            return ZVal.assign(element);
        }

        cssProperties.setObject(ZVal.newArray());
        inlineProperties.setObject(ZVal.newArray());
        for (ZPair zpairResult2242 :
                ZVal.getIterable(this.getInlineStyles(env, element), env, true)) {
            property = ZVal.assign(zpairResult2242.getValue());
            inlineProperties
                    .arrayAccess(env, env.callMethod(property, "getName", CssToInlineStyles.class))
                    .set(property);
        }

        for (ZPair zpairResult2243 : ZVal.getIterable(properties, env, true)) {
            property = ZVal.assign(zpairResult2243.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    inlineProperties,
                    env,
                    env.callMethod(property, "getName", CssToInlineStyles.class))) {
                cssProperties
                        .arrayAccess(
                                env, env.callMethod(property, "getName", CssToInlineStyles.class))
                        .set(property);
            }
        }

        rules.setObject(ZVal.newArray());
        for (ZPair zpairResult2244 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(cssProperties.getObject(), inlineProperties.getObject())
                                .value(),
                        env,
                        true)) {
            property = ZVal.assign(zpairResult2244.getValue());
            rules.arrayAppend(env)
                    .set(env.callMethod(property, "toString", CssToInlineStyles.class));
        }

        env.callMethod(
                element,
                "setAttribute",
                CssToInlineStyles.class,
                "style",
                NamespaceGlobal.implode.env(env).call(" ", rules.getObject()).value());
        return ZVal.assign(element);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element", typeHint = "DOMElement")
    public Object getInlineStyles(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        Object processor = null;
        processor =
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
        return ZVal.assign(
                env.callMethod(
                        processor,
                        "convertArrayToObjects",
                        CssToInlineStyles.class,
                        env.callMethod(
                                processor,
                                "splitIntoSeparateProperties",
                                CssToInlineStyles.class,
                                env.callMethod(
                                        element,
                                        "getAttribute",
                                        CssToInlineStyles.class,
                                        "style"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "html")
    protected Object createDomDocumentFromHtml(RuntimeEnv env, Object... args) {
        Object html = assignParameter(args, 0, false);
        Object document = null;
        Object internalErrors = null;
        document = new DOMDocument(env, "1.0", "UTF-8");
        internalErrors = NamespaceGlobal.libxml_use_internal_errors.env(env).call(true).value();
        env.callMethod(
                document,
                "loadHTML",
                CssToInlineStyles.class,
                NamespaceGlobal.mb_convert_encoding
                        .env(env)
                        .call(html, "HTML-ENTITIES", "UTF-8")
                        .value());
        NamespaceGlobal.libxml_use_internal_errors.env(env).call(internalErrors);
        toObjectR(document).accessProp(this, env).name("formatOutput").set(true);
        return ZVal.assign(document);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "document", typeHint = "DOMDocument")
    protected Object getHtmlFromDocument(RuntimeEnv env, Object... args) {
        Object document = assignParameter(args, 0, false);
        Object doctype = null;
        Object html = null;
        Object htmlElement = null;
        htmlElement =
                ZVal.assign(
                        toObjectR(document).accessProp(this, env).name("documentElement").value());
        html = env.callMethod(document, "saveHTML", CssToInlineStyles.class, htmlElement);
        html = function_trim.f.env(env).call(html).value();
        env.callMethod(document, "removeChild", CssToInlineStyles.class, htmlElement);
        doctype = env.callMethod(document, "saveHTML", CssToInlineStyles.class);
        doctype = function_trim.f.env(env).call(doctype).value();
        if (ZVal.strictEqualityCheck(doctype, "===", "<!DOCTYPE html>")) {
            doctype = NamespaceGlobal.strtolower.env(env).call(doctype).value();
        }

        return ZVal.assign(toStringR(doctype, env) + "\n" + toStringR(html, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "document", typeHint = "DOMDocument")
    @ConvertedParameter(index = 1, name = "rules", typeHint = "array")
    protected Object inline(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object document = assignParameter(args, 0, false);
        Object rules = assignParameter(args, 1, false);
        Object expression = null;
        ReferenceContainer propertyStorage = new BasicReferenceContainer(null);
        Object e = null;
        Object elements = null;
        Object rule = null;
        Object xPath = null;
        ReferenceContainer element = new BasicReferenceContainer(null);
        if (ZVal.isEmpty(rules)) {
            return ZVal.assign(document);
        }

        propertyStorage.setObject(new SplObjectStorage(env));
        xPath = new DOMXPath(env, document);
        function_usort
                .f
                .env(env)
                .call(
                        rules,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        com.project
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
                                                .Processor
                                                .CONST_class),
                                new ZPair(1, "sortOnSpecificity")));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2245 : ZVal.getIterable(rules, env, true)) {
            rule = ZVal.assign(zpairResult2245.getValue());
            try {
                if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.cssConverter)) {
                    expression =
                            env.callMethod(
                                    this.cssConverter,
                                    "toXPath",
                                    CssToInlineStyles.class,
                                    env.callMethod(rule, "getSelector", CssToInlineStyles.class));

                } else {
                    expression =
                            StaticMethodUtils.getStaticBaseClass(
                                            ZVal.resolveClassAlias(env, "CssSelector"), env)
                                    .callUnknownStaticMethod(
                                            env,
                                            "toXPath",
                                            new RuntimeArgsWithReferences(),
                                            env.callMethod(
                                                    rule, "getSelector", CssToInlineStyles.class));
                }

            } catch (ConvertedException convertedException329) {
                if (convertedException329.instanceOf(
                        ExceptionInterface.class,
                        "Symfony\\Component\\CssSelector\\Exception\\ExceptionInterface")) {
                    e = convertedException329.getObject();
                    continue;
                } else {
                    throw convertedException329;
                }
            }

            elements = env.callMethod(xPath, "query", CssToInlineStyles.class, expression);
            if (ZVal.strictEqualityCheck(elements, "===", false)) {
                continue;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult2246 : ZVal.getIterable(elements, env, true)) {
                element.setObject(ZVal.assign(zpairResult2246.getValue()));
                propertyStorage
                        .arrayAccess(env, element.getObject())
                        .set(
                                this.calculatePropertiesToBeApplied(
                                        env,
                                        env.callMethod(
                                                rule, "getProperties", CssToInlineStyles.class),
                                        ZVal.isTrue(
                                                        env.callMethod(
                                                                propertyStorage.getObject(),
                                                                new RuntimeArgsWithReferences()
                                                                        .add(0, element),
                                                                "contains",
                                                                CssToInlineStyles.class,
                                                                element.getObject()))
                                                ? propertyStorage.arrayGet(env, element.getObject())
                                                : ZVal.newArray()));
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2247 : ZVal.getIterable(propertyStorage.getObject(), env, true)) {
            element.setObject(ZVal.assign(zpairResult2247.getValue()));
            this.inlineCssOnElement(
                    env, element.getObject(), propertyStorage.arrayGet(env, element.getObject()));
        }

        return ZVal.assign(document);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "properties", typeHint = "array")
    @ConvertedParameter(index = 1, name = "cssProperties", typeHint = "array")
    private Object calculatePropertiesToBeApplied(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object properties = assignParameter(args, 0, false);
        ReferenceContainer cssProperties =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object existingProperty = null;
        Object overrule = null;
        Object property = null;
        if (ZVal.isEmpty(properties)) {
            return ZVal.assign(cssProperties.getObject());
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2248 : ZVal.getIterable(properties, env, true)) {
            property = ZVal.assign(zpairResult2248.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    cssProperties,
                    env,
                    env.callMethod(property, "getName", CssToInlineStyles.class))) {
                existingProperty =
                        ZVal.assign(
                                cssProperties.arrayGet(
                                        env,
                                        env.callMethod(
                                                property, "getName", CssToInlineStyles.class)));
                if (ZVal.toBool(
                                env.callMethod(
                                        existingProperty, "isImportant", CssToInlineStyles.class))
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                property,
                                                "isImportant",
                                                CssToInlineStyles.class)))) {
                    continue;
                }

                overrule =
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                env.callMethod(
                                                        existingProperty,
                                                        "isImportant",
                                                        CssToInlineStyles.class)))
                                && ZVal.toBool(
                                        env.callMethod(
                                                property, "isImportant", CssToInlineStyles.class));
                if (!ZVal.isTrue(overrule)) {
                    overrule =
                            ZVal.isLessThanOrEqualTo(
                                    env.callMethod(
                                            env.callMethod(
                                                    existingProperty,
                                                    "getOriginalSpecificity",
                                                    CssToInlineStyles.class),
                                            "compareTo",
                                            CssToInlineStyles.class,
                                            env.callMethod(
                                                    property,
                                                    "getOriginalSpecificity",
                                                    CssToInlineStyles.class)),
                                    "<=",
                                    0);
                }

                if (ZVal.isTrue(overrule)) {
                    arrayActionR(
                            ArrayAction.UNSET,
                            cssProperties,
                            env,
                            env.callMethod(property, "getName", CssToInlineStyles.class));
                    cssProperties
                            .arrayAccess(
                                    env,
                                    env.callMethod(property, "getName", CssToInlineStyles.class))
                            .set(property);
                }

            } else {
                cssProperties
                        .arrayAccess(
                                env, env.callMethod(property, "getName", CssToInlineStyles.class))
                        .set(property);
            }
        }

        return ZVal.assign(cssProperties.getObject());
    }

    public static final Object CONST_class = "TijsVerkoyen\\CssToInlineStyles\\CssToInlineStyles";

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
                    .setName("TijsVerkoyen\\CssToInlineStyles\\CssToInlineStyles")
                    .setLookup(
                            CssToInlineStyles.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cssConverter")
                    .setFilename(
                            "vendor/tijsverkoyen/css-to-inline-styles/src/CssToInlineStyles.php")
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
