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
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Node/HashNode.php

*/

public class HashNode extends AbstractNode {

    public Object selector = null;

    public Object id = null;

    public HashNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HashNode.class) {
            this.__construct(env, args);
        }
    }

    public HashNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    @ConvertedParameter(index = 1, name = "id", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object id = assignParameter(args, 1, false);
        this.selector = selector;
        this.id = id;
        return null;
    }

    @ConvertedMethod
    public Object getSelector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.selector);
    }

    @ConvertedMethod
    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.id);
    }

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.selector, "getSpecificity", HashNode.class),
                        "plus",
                        HashNode.class,
                        new Specificity(env, 1, 0, 0)));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s[%s#%s]",
                                env.callMethod(this, "getNodeName", HashNode.class),
                                this.selector,
                                this.id)
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Node\\HashNode";

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
                    .setName("Symfony\\Component\\CssSelector\\Node\\HashNode")
                    .setLookup(
                            HashNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("id", "nodeName", "selector")
                    .setFilename("vendor/symfony/css-selector/Node/HashNode.php")
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
