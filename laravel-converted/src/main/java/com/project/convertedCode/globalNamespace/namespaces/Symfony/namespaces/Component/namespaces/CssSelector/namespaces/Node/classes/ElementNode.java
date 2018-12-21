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

 vendor/symfony/css-selector/Node/ElementNode.php

*/

public class ElementNode extends AbstractNode {

    public Object namespace = null;

    public Object element = null;

    public ElementNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ElementNode.class) {
            this.__construct(env, args);
        }
    }

    public ElementNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "namespace",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "element",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        Object element = assignParameter(args, 1, true);
        if (null == element) {
            element = ZVal.getNull();
        }
        this.namespace = namespace;
        this.element = element;
        return null;
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.namespace);
    }

    @ConvertedMethod
    public Object getElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.element);
    }

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args) {
        return ZVal.assign(new Specificity(env, 0, 0, ZVal.isTrue(this.element) ? 1 : 0));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        Object element = null;
        element =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = this.element)
                                ? ternaryExpressionTemp
                                : "*");
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s[%s]",
                                env.callMethod(this, "getNodeName", ElementNode.class),
                                ZVal.isTrue(this.namespace)
                                        ? toStringR(this.namespace, env)
                                                + "|"
                                                + toStringR(element, env)
                                        : element)
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Node\\ElementNode";

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
                    .setName("Symfony\\Component\\CssSelector\\Node\\ElementNode")
                    .setLookup(
                            ElementNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("element", "namespace", "nodeName")
                    .setFilename("vendor/symfony/css-selector/Node/ElementNode.php")
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
