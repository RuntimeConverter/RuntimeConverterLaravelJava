package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.AbstractNode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.CssSelector.namespaces.Node.classes.Specificity;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/css-selector/Node/FunctionNode.php

*/

public class FunctionNode extends AbstractNode {

    public Object selector = null;

    public Object name = null;

    public Object arguments = null;

    public FunctionNode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FunctionNode.class) {
            this.__construct(env, args);
        }
    }

    public FunctionNode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\NodeInterface"
    )
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        this.selector = selector;
        this.name = NamespaceGlobal.strtolower.env(env).call(name).value();
        this.arguments = arguments;
        return null;
    }

    @ConvertedMethod
    public Object getSelector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.selector);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.arguments);
    }

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.selector, "getSpecificity", FunctionNode.class),
                        "plus",
                        FunctionNode.class,
                        new Specificity(env, 0, 1, 0)));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/css-selector/Node")
                        .setFile("/vendor/symfony/css-selector/Node/FunctionNode.php");
        Object arguments = null;
        arguments =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                ", ",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Symfony\\Component\\CssSelector\\Node",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "token",
                                                        typeHint =
                                                                "Symfony\\Component\\CssSelector\\Parser\\Token"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object token =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                "'"
                                                                        + toStringR(
                                                                                env.callMethod(
                                                                                        token,
                                                                                        "getValue",
                                                                                        FunctionNode
                                                                                                .class),
                                                                                env)
                                                                        + "'");
                                                    }
                                                },
                                                this.arguments)
                                        .value())
                        .value();
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s[%s:%s(%s)]",
                                env.callMethod(this, "getNodeName", FunctionNode.class),
                                this.selector,
                                this.name,
                                ZVal.isTrue(arguments) ? "[" + toStringR(arguments, env) + "]" : "")
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\CssSelector\\Node\\FunctionNode";

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
                    .setName("Symfony\\Component\\CssSelector\\Node\\FunctionNode")
                    .setLookup(
                            FunctionNode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("arguments", "name", "nodeName", "selector")
                    .setFilename("vendor/symfony/css-selector/Node/FunctionNode.php")
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
