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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Node/SelectorNode.php

*/

public class SelectorNode extends AbstractNode {

    public Object tree = null;

    public Object pseudoElement = null;

    public SelectorNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SelectorNode.class) {
            this.__construct(env, args);
        }
    }

    public SelectorNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tree",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "pseudoElement",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tree = assignParameter(args, 0, false);
        Object pseudoElement = assignParameter(args, 1, true);
        if (null == pseudoElement) {
            pseudoElement = ZVal.getNull();
        }
        this.tree = tree;
        this.pseudoElement =
                ZVal.isTrue(pseudoElement)
                        ? NamespaceGlobal.strtolower.env(env).call(pseudoElement).value()
                        : ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object getTree(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tree);
    }

    @ConvertedMethod
    public Object getPseudoElement(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pseudoElement);
    }

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.tree, "getSpecificity", SelectorNode.class),
                        "plus",
                        SelectorNode.class,
                        new Specificity(env, 0, 0, ZVal.isTrue(this.pseudoElement) ? 1 : 0)));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s[%s%s]",
                                env.callMethod(this, "getNodeName", SelectorNode.class),
                                this.tree,
                                ZVal.isTrue(this.pseudoElement)
                                        ? "::" + toStringR(this.pseudoElement, env)
                                        : "")
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Node\\SelectorNode";

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
                    .setName("Symfony\\Component\\CssSelector\\Node\\SelectorNode")
                    .setLookup(
                            SelectorNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("nodeName", "pseudoElement", "tree")
                    .setFilename("vendor/symfony/css-selector/Node/SelectorNode.php")
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
