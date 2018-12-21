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
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Node/PseudoNode.php

*/

public class PseudoNode extends AbstractNode {

    public Object selector = null;

    public Object identifier = null;

    public PseudoNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PseudoNode.class) {
            this.__construct(env, args);
        }
    }

    public PseudoNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    @ConvertedParameter(index = 1, name = "identifier", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object identifier = assignParameter(args, 1, false);
        this.selector = selector;
        this.identifier = NamespaceGlobal.strtolower.env(env).call(identifier).value();
        return null;
    }

    @ConvertedMethod
    public Object getSelector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.selector);
    }

    @ConvertedMethod
    public Object getIdentifier(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.identifier);
    }

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.selector, "getSpecificity", PseudoNode.class),
                        "plus",
                        PseudoNode.class,
                        new Specificity(env, 0, 1, 0)));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s[%s:%s]",
                                env.callMethod(this, "getNodeName", PseudoNode.class),
                                this.selector,
                                this.identifier)
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Node\\PseudoNode";

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
                    .setName("Symfony\\Component\\CssSelector\\Node\\PseudoNode")
                    .setLookup(
                            PseudoNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("identifier", "nodeName", "selector")
                    .setFilename("vendor/symfony/css-selector/Node/PseudoNode.php")
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
