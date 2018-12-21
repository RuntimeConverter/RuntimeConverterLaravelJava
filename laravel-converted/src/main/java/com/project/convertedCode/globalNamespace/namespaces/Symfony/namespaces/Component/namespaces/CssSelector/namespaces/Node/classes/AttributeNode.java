package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.AbstractNode;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.Specificity;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Node/AttributeNode.php

*/

public class AttributeNode extends AbstractNode {

    public Object selector = null;

    public Object namespace = null;

    public Object attribute = null;

    public Object operator = null;

    public Object value = null;

    public AttributeNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AttributeNode.class) {
            this.__construct(env, args);
        }
    }

    public AttributeNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    @ConvertedParameter(index = 1, name = "namespace")
    @ConvertedParameter(index = 2, name = "attribute", typeHint = "string")
    @ConvertedParameter(index = 3, name = "operator", typeHint = "string")
    @ConvertedParameter(index = 4, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object namespace = assignParameter(args, 1, false);
        Object attribute = assignParameter(args, 2, false);
        Object operator = assignParameter(args, 3, false);
        Object value = assignParameter(args, 4, false);
        this.selector = selector;
        this.namespace = namespace;
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object getSelector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.selector);
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.namespace);
    }

    @ConvertedMethod
    public Object getAttribute(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attribute);
    }

    @ConvertedMethod
    public Object getOperator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.operator);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.selector, "getSpecificity", AttributeNode.class),
                        "plus",
                        AttributeNode.class,
                        new Specificity(env, 0, 1, 0)));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object attribute = null;
        attribute =
                ZVal.assign(
                        ZVal.isTrue(this.namespace)
                                ? toStringR(this.namespace, env)
                                        + "|"
                                        + toStringR(this.attribute, env)
                                : this.attribute);
        return ZVal.assign(
                ZVal.strictEqualityCheck("exists", "===", this.operator)
                        ? function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s[%s[%s]]",
                                        env.callMethod(this, "getNodeName", AttributeNode.class),
                                        this.selector,
                                        attribute)
                                .value()
                        : function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s[%s[%s %s '%s']]",
                                        env.callMethod(this, "getNodeName", AttributeNode.class),
                                        this.selector,
                                        attribute,
                                        this.operator,
                                        this.value)
                                .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Node\\AttributeNode";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractNode.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\CssSelector\\Node\\AttributeNode")
                    .setLookup(
                            AttributeNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attribute", "namespace", "nodeName", "operator", "selector", "value")
                    .setFilename("vendor/symfony/css-selector/Node/AttributeNode.php")
                    .addInterface("Symfony\\Component\\CssSelector\\Node\\NodeInterface")
                    .addExtendsClass("Symfony\\Component\\CssSelector\\Node\\AbstractNode")
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
