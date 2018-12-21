package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.XPath.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/XPath/XPathExpr.php

*/

public class XPathExpr extends RuntimeClassBase {

    public Object path = null;

    public Object element = null;

    public Object condition = null;

    public XPathExpr(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == XPathExpr.class) {
            this.__construct(env, args);
        }
    }

    public XPathExpr(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(index = 1, name = "element", typeHint = "string")
    @ConvertedParameter(index = 2, name = "condition", typeHint = "string")
    @ConvertedParameter(
        index = 3,
        name = "starPrefix",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        Object element = assignParameter(args, 1, true);
        if (null == element) {
            element = "*";
        }
        Object condition = assignParameter(args, 2, true);
        if (null == condition) {
            condition = "";
        }
        Object starPrefix = assignParameter(args, 3, true);
        if (null == starPrefix) {
            starPrefix = false;
        }
        this.path = path;
        this.element = element;
        this.condition = condition;
        if (ZVal.isTrue(starPrefix)) {
            this.addStarPrefix(env);
        }

        return null;
    }

    @ConvertedMethod
    public Object getElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.element);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition", typeHint = "string")
    public Object addCondition(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        this.condition =
                ZVal.isTrue(this.condition)
                        ? function_sprintf
                                .f
                                .env(env)
                                .call("(%s) and (%s)", this.condition, condition)
                                .value()
                        : condition;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCondition(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.condition);
    }

    @ConvertedMethod
    public Object addNameTest(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck("*", "!==", this.element)) {
            this.addCondition(
                    env,
                    "name() = "
                            + toStringR(
                                    Translator.runtimeStaticObject.getXpathLiteral(
                                            env, this.element),
                                    env));
            this.element = "*";
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object addStarPrefix(RuntimeEnv env, Object... args) {
        this.path = toStringR(this.path, env) + "*/";
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "combiner", typeHint = "string")
    @ConvertedParameter(index = 1, name = "expr", typeHint = "self")
    public Object join(RuntimeEnv env, Object... args) {
        Object combiner = assignParameter(args, 0, false);
        Object expr = assignParameter(args, 1, false);
        Object path = null;
        path = toStringR(this.__toString(env), env) + toStringR(combiner, env);
        if (ZVal.strictNotEqualityCheck(
                "*/", "!==", toObjectR(expr).accessProp(this, env).name("path").value())) {
            path =
                    toStringR(path, env)
                            + toStringR(
                                    toObjectR(expr).accessProp(this, env).name("path").value(),
                                    env);
        }

        this.path = path;
        this.element = toObjectR(expr).accessProp(this, env).name("element").value();
        this.condition = toObjectR(expr).accessProp(this, env).name("condition").value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object path = null;
        Object condition = null;
        path = toStringR(this.path, env) + toStringR(this.element, env);
        condition =
                ZVal.assign(
                        ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.condition))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck("", "===", this.condition))
                                ? ""
                                : "[" + toStringR(this.condition, env) + "]");
        return ZVal.assign(toStringR(path, env) + toStringR(condition, env));
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\XPath\\XPathExpr";

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
                    .setName("Symfony\\Component\\CssSelector\\XPath\\XPathExpr")
                    .setLookup(
                            XPathExpr.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("condition", "element", "path")
                    .setFilename("vendor/symfony/css-selector/XPath/XPathExpr.php")
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
