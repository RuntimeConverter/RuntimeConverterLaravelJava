package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.AbstractNode;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Node/CombinedSelectorNode.php

*/

public class CombinedSelectorNode extends AbstractNode {

    public Object selector = null;

    public Object combinator = null;

    public Object subSelector = null;

    public CombinedSelectorNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CombinedSelectorNode.class) {
            this.__construct(env, args);
        }
    }

    public CombinedSelectorNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    @ConvertedParameter(index = 1, name = "combinator", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "subSelector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object combinator = assignParameter(args, 1, false);
        Object subSelector = assignParameter(args, 2, false);
        this.selector = selector;
        this.combinator = combinator;
        this.subSelector = subSelector;
        return null;
    }

    @ConvertedMethod
    public Object getSelector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.selector);
    }

    @ConvertedMethod
    public Object getCombinator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.combinator);
    }

    @ConvertedMethod
    public Object getSubSelector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.subSelector);
    }

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.selector, "getSpecificity", CombinedSelectorNode.class),
                        "plus",
                        CombinedSelectorNode.class,
                        env.callMethod(
                                this.subSelector, "getSpecificity", CombinedSelectorNode.class)));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object combinator = null;
        combinator =
                ZVal.assign(
                        ZVal.strictEqualityCheck(" ", "===", this.combinator)
                                ? "<followed>"
                                : this.combinator);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s[%s %s %s]",
                                env.callMethod(this, "getNodeName", CombinedSelectorNode.class),
                                this.selector,
                                combinator,
                                this.subSelector)
                        .value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\CssSelector\\Node\\CombinedSelectorNode";

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
                    .setName("Symfony\\Component\\CssSelector\\Node\\CombinedSelectorNode")
                    .setLookup(
                            CombinedSelectorNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("combinator", "nodeName", "selector", "subSelector")
                    .setFilename("vendor/symfony/css-selector/Node/CombinedSelectorNode.php")
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
