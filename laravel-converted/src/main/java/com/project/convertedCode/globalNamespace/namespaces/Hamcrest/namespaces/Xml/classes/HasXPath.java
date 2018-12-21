package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Xml.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMNodeList;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMXPath;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Matcher;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.DiagnosingMatcher;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMNode;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsEqual;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Xml/HasXPath.php

*/

public class HasXPath extends DiagnosingMatcher {

    public Object _xpath = null;

    public Object _matcher = null;

    public HasXPath(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HasXPath.class) {
            this.__construct(env, args);
        }
    }

    public HasXPath(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "xpath")
    @ConvertedParameter(
        index = 1,
        name = "matcher",
        typeHint = "Hamcrest\\Matcher",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object matcher = assignParameter(args, 1, true);
        if (null == matcher) {
            matcher = ZVal.getNull();
        }
        this._xpath = xpath;
        this._matcher = matcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object matchesWithDiagnosticDescription(RuntimeEnv env, Object... args) {
        Object actual = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        Object result = null;
        if (function_is_string.f.env(env).call(actual).getBool()) {
            actual = this.createDocument(env, actual);

        } else if (!ZVal.isTrue(ZVal.checkInstanceType(actual, DOMNode.class, "DOMNode"))) {
            env.callMethod(
                    env.callMethod(mismatchDescription, "appendText", HasXPath.class, "was "),
                    "appendValue",
                    HasXPath.class,
                    actual);
            return ZVal.assign(false);
        }

        result = this.evaluate(env, actual);
        if (ZVal.isTrue(ZVal.checkInstanceType(result, DOMNodeList.class, "DOMNodeList"))) {
            return ZVal.assign(this.matchesContent(env, result, mismatchDescription));

        } else {
            return ZVal.assign(this.matchesExpression(env, result, mismatchDescription));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    protected Object createDocument(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        Object document = null;
        document = new DOMDocument(env);
        if (function_preg_match.f.env(env).call("/^\\s*<\\?xml/", text).getBool()) {
            if (!ZVal.isTrue(env.callMethod(document, "loadXML", HasXPath.class, text))) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "Must pass a valid XML document"));
            }

        } else {
            if (!ZVal.isTrue(env.callMethod(document, "loadHTML", HasXPath.class, text))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Must pass a valid HTML or XHTML document"));
            }
        }

        return ZVal.assign(document);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node", typeHint = "DOMNode")
    protected Object evaluate(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object xpathDocument = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(node, DOMDocument.class, "DOMDocument"))) {
            xpathDocument = new DOMXPath(env, node);
            return ZVal.assign(
                    env.callMethod(xpathDocument, "evaluate", HasXPath.class, this._xpath));

        } else {
            xpathDocument =
                    new DOMXPath(
                            env,
                            toObjectR(node).accessProp(this, env).name("ownerDocument").value());
            return ZVal.assign(
                    env.callMethod(xpathDocument, "evaluate", HasXPath.class, this._xpath, node));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "DOMNodeList")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object matchesContent(RuntimeEnv env, Object... args) {
        Object nodes = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        Object node = null;
        ReferenceContainer content = new BasicReferenceContainer(null);
        if (ZVal.equalityCheck(toObjectR(nodes).accessProp(this, env).name("length").value(), 0)) {
            env.callMethod(
                    mismatchDescription, "appendText", HasXPath.class, "XPath returned no results");

        } else if (ZVal.strictEqualityCheck(this._matcher, "===", ZVal.getNull())) {
            return ZVal.assign(true);

        } else {
            for (ZPair zpairResult176 : ZVal.getIterable(nodes, env, true)) {
                node = ZVal.assign(zpairResult176.getValue());
                if (ZVal.isTrue(
                        env.callMethod(
                                this._matcher,
                                "matches",
                                HasXPath.class,
                                toObjectR(node)
                                        .accessProp(this, env)
                                        .name("textContent")
                                        .value()))) {
                    return ZVal.assign(true);
                }
            }

            content.setObject(ZVal.newArray());
            for (ZPair zpairResult177 : ZVal.getIterable(nodes, env, true)) {
                node = ZVal.assign(zpairResult177.getValue());
                content.arrayAppend(env)
                        .set(toObjectR(node).accessProp(this, env).name("textContent").value());
            }

            env.callMethod(
                    env.callMethod(
                            mismatchDescription, "appendText", HasXPath.class, "XPath returned "),
                    "appendValue",
                    HasXPath.class,
                    content.getObject());
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result")
    @ConvertedParameter(index = 1, name = "mismatchDescription", typeHint = "Hamcrest\\Description")
    protected Object matchesExpression(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        Object mismatchDescription = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck(this._matcher, "===", ZVal.getNull())) {
            if (ZVal.isTrue(result)) {
                return ZVal.assign(true);
            }

            env.callMethod(
                    env.callMethod(
                            mismatchDescription,
                            "appendText",
                            HasXPath.class,
                            "XPath expression result was "),
                    "appendValue",
                    HasXPath.class,
                    result);

        } else {
            if (ZVal.isTrue(env.callMethod(this._matcher, "matches", HasXPath.class, result))) {
                return ZVal.assign(true);
            }

            env.callMethod(
                    mismatchDescription, "appendText", HasXPath.class, "XPath expression result ");
            env.callMethod(
                    this._matcher, "describeMismatch", HasXPath.class, result, mismatchDescription);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                description,
                                "appendText",
                                HasXPath.class,
                                "XML or HTML document with XPath \""),
                        "appendText",
                        HasXPath.class,
                        this._xpath),
                "appendText",
                HasXPath.class,
                "\"");
        if (ZVal.strictNotEqualityCheck(this._matcher, "!==", ZVal.getNull())) {
            env.callMethod(description, "appendText", HasXPath.class, " ");
            env.callMethod(this._matcher, "describeTo", HasXPath.class, description);
        }

        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Xml\\HasXPath";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DiagnosingMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "xpath")
        @ConvertedParameter(
            index = 1,
            name = "matcher",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object hasXPath(RuntimeEnv env, Object... args) {
            Object xpath = assignParameter(args, 0, false);
            Object matcher = assignParameter(args, 1, true);
            if (null == matcher) {
                matcher = ZVal.getNull();
            }
            if (ZVal.toBool(ZVal.strictEqualityCheck(matcher, "===", ZVal.getNull()))
                    || ZVal.toBool(
                            ZVal.checkInstanceType(matcher, Matcher.class, "Hamcrest\\Matcher"))) {
                return ZVal.assign(
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Hamcrest
                                .namespaces
                                .Xml
                                .classes
                                .HasXPath(env, xpath, matcher));

            } else if (ZVal.toBool(function_is_int.f.env(env).call(matcher).value())
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    function_strpos.f.env(env).call(xpath, "count(").value(),
                                    "!==",
                                    0))) {
                xpath = "count(" + toStringR(xpath, env) + ")";
            }

            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Hamcrest
                            .namespaces
                            .Xml
                            .classes
                            .HasXPath(
                            env, xpath, IsEqual.runtimeStaticObject.equalTo(env, matcher)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Xml\\HasXPath")
                    .setLookup(
                            HasXPath.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_matcher", "_xpath")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Xml/HasXPath.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\DiagnosingMatcher")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
