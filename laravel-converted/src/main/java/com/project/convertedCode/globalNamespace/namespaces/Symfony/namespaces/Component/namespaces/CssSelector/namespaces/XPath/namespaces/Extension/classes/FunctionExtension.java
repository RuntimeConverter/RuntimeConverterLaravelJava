package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.namespaces.Extension.classes.AbstractExtension;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.SyntaxErrorException;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Parser.classes.Parser;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes.Translator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Exception.classes.ExpressionErrorException;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/Extension/FunctionExtension.php

*/

public class FunctionExtension extends AbstractExtension {

    public FunctionExtension(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FunctionExtension(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getFunctionTranslators(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "nth-child",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateNthChild"))),
                        new ZPair(
                                "nth-last-child",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateNthLastChild"))),
                        new ZPair(
                                "nth-of-type",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateNthOfType"))),
                        new ZPair(
                                "nth-last-of-type",
                                ZVal.newArray(
                                        new ZPair(0, this),
                                        new ZPair(1, "translateNthLastOfType"))),
                        new ZPair(
                                "contains",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "translateContains"))),
                        new ZPair(
                                "lang",
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "translateLang")))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "function",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\FunctionNode"
    )
    @ConvertedParameter(
        index = 2,
        name = "last",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "addNameTest",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object translateNthChild(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        Object last = assignParameter(args, 2, true);
        if (null == last) {
            last = false;
        }
        Object addNameTest = assignParameter(args, 3, true);
        if (null == addNameTest) {
            addNameTest = true;
        }
        Object a = null;
        ReferenceContainer b = new BasicReferenceContainer(null);
        Object e = null;
        Object sign = null;
        Object expr = null;
        ReferenceContainer conditions = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult185 = null;
        try {
            ZVal.list(
                    runtimeTempArrayResult185 =
                            Parser.runtimeStaticObject.parseSeries(
                                    env,
                                    env.callMethod(
                                            function, "getArguments", FunctionExtension.class)),
                    (a = listGet(runtimeTempArrayResult185, 0, env)),
                    (b.setObject(listGet(runtimeTempArrayResult185, 1, env))));
        } catch (ConvertedException convertedException245) {
            if (convertedException245.instanceOf(
                    SyntaxErrorException.class,
                    "Symfony\\Component\\CssSelector\\Exception\\SyntaxErrorException")) {
                e = convertedException245.getObject();
                throw ZVal.getException(
                        env,
                        new ExpressionErrorException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Invalid series: %s",
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                ", ",
                                                                env.callMethod(
                                                                        function,
                                                                        "getArguments",
                                                                        FunctionExtension.class))
                                                        .value())
                                        .value(),
                                0,
                                e));
            } else {
                throw convertedException245;
            }
        }

        env.callMethod(xpath, "addStarPrefix", FunctionExtension.class);
        if (ZVal.isTrue(addNameTest)) {
            env.callMethod(xpath, "addNameTest", FunctionExtension.class);
        }

        if (ZVal.strictEqualityCheck(0, "===", a)) {
            return ZVal.assign(
                    env.callMethod(
                            xpath,
                            "addCondition",
                            FunctionExtension.class,
                            "position() = "
                                    + toStringR(
                                            ZVal.isTrue(last)
                                                    ? "last() - "
                                                            + toStringR(
                                                                    ZVal.subtract(b.getObject(), 1),
                                                                    env)
                                                    : b.getObject(),
                                            env)));
        }

        if (ZVal.isLessThan(a, '<', 0)) {
            if (ZVal.isLessThan(b.getObject(), '<', 1)) {
                return ZVal.assign(
                        env.callMethod(xpath, "addCondition", FunctionExtension.class, "false()"));
            }

            sign = "<=";

        } else {
            sign = ">=";
        }

        expr = "position()";
        if (ZVal.isTrue(last)) {
            expr = "last() - " + toStringR(expr, env);
            b.setObject(ZVal.decrement(b.getObject()));
        }

        if (ZVal.strictNotEqualityCheck(0, "!==", b.getObject())) {
            expr = toStringR(expr, env) + " - " + toStringR(b.getObject(), env);
        }

        conditions.setObject(
                ZVal.newArray(
                        new ZPair(
                                0,
                                function_sprintf.f.env(env).call("%s %s 0", expr, sign).value())));
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(1, "!==", a))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(-1, "!==", a))) {
            conditions
                    .arrayAppend(env)
                    .set(function_sprintf.f.env(env).call("(%s) mod %d = 0", expr, a).value());
        }

        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        FunctionExtension.class,
                        NamespaceGlobal.implode
                                .env(env)
                                .call(" and ", conditions.getObject())
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "function",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\FunctionNode"
    )
    public Object translateNthLastChild(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        return ZVal.assign(this.translateNthChild(env, xpath, function, true));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "function",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\FunctionNode"
    )
    public Object translateNthOfType(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        return ZVal.assign(this.translateNthChild(env, xpath, function, false, false));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "function",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\FunctionNode"
    )
    public Object translateNthLastOfType(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck(
                "*", "===", env.callMethod(xpath, "getElement", FunctionExtension.class))) {
            throw ZVal.getException(
                    env,
                    new ExpressionErrorException(env, "\"*:nth-of-type()\" is not implemented."));
        }

        return ZVal.assign(this.translateNthChild(env, xpath, function, true, false));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "function",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\FunctionNode"
    )
    public Object translateContains(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        Object token = null;
        arguments.setObject(env.callMethod(function, "getArguments", FunctionExtension.class));
        for (ZPair zpairResult1751 : ZVal.getIterable(arguments.getObject(), env, true)) {
            token = ZVal.assign(zpairResult1751.getValue());
            if (!ZVal.toBool(env.callMethod(token, "isString", FunctionExtension.class))
                    || ZVal.toBool(
                            env.callMethod(token, "isIdentifier", FunctionExtension.class))) {
                throw ZVal.getException(
                        env,
                        new ExpressionErrorException(
                                env,
                                "Expected a single string or identifier for :contains(), got "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", arguments.getObject())
                                                        .value(),
                                                env)));
            }
        }

        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        FunctionExtension.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "contains(string(.), %s)",
                                        Translator.runtimeStaticObject.getXpathLiteral(
                                                env,
                                                env.callMethod(
                                                        arguments.arrayGet(env, 0),
                                                        "getValue",
                                                        FunctionExtension.class)))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "xpath",
        typeHint = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr"
    )
    @ConvertedParameter(
        index = 1,
        name = "function",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\FunctionNode"
    )
    public Object translateLang(RuntimeEnv env, Object... args) {
        Object xpath = assignParameter(args, 0, false);
        Object function = assignParameter(args, 1, false);
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        Object token = null;
        arguments.setObject(env.callMethod(function, "getArguments", FunctionExtension.class));
        for (ZPair zpairResult1752 : ZVal.getIterable(arguments.getObject(), env, true)) {
            token = ZVal.assign(zpairResult1752.getValue());
            if (!ZVal.toBool(env.callMethod(token, "isString", FunctionExtension.class))
                    || ZVal.toBool(
                            env.callMethod(token, "isIdentifier", FunctionExtension.class))) {
                throw ZVal.getException(
                        env,
                        new ExpressionErrorException(
                                env,
                                "Expected a single string or identifier for :lang(), got "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", arguments.getObject())
                                                        .value(),
                                                env)));
            }
        }

        return ZVal.assign(
                env.callMethod(
                        xpath,
                        "addCondition",
                        FunctionExtension.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "lang(%s)",
                                        Translator.runtimeStaticObject.getXpathLiteral(
                                                env,
                                                env.callMethod(
                                                        arguments.arrayGet(env, 0),
                                                        "getValue",
                                                        FunctionExtension.class)))
                                .value()));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "function";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\XPath\\Extension\\FunctionExtension";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractExtension.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\XPath\\Extension\\FunctionExtension")
                    .setLookup(
                            FunctionExtension.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/css-selector/XPath/Extension/FunctionExtension.php")
                    .addInterface(
                            "Symfony\\Component\\CssSelector\\XPath\\Extension\\ExtensionInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\CssSelector\\XPath\\Extension\\AbstractExtension")
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
