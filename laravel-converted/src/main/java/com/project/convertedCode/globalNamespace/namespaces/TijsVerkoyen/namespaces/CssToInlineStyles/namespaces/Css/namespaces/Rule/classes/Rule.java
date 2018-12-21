package com.project.convertedCode.globalNamespace.namespaces.TijsVerkoyen.namespaces.CssToInlineStyles.namespaces.Css.namespaces.Rule.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
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

 vendor/tijsverkoyen/css-to-inline-styles/src/Css/Rule/Rule.php

*/

public final class Rule extends RuntimeClassBase {

    public Object selector = null;

    public Object properties = null;

    public Object specificity = null;

    public Object order = null;

    public Rule(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Rule.class) {
            this.__construct(env, args);
        }
    }

    public Rule(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "selector")
    @ConvertedParameter(index = 1, name = "properties", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "specificity",
        typeHint = "Symfony\\Component\\CssSelector\\Node\\Specificity"
    )
    @ConvertedParameter(index = 3, name = "order")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, false);
        Object properties = assignParameter(args, 1, false);
        Object specificity = assignParameter(args, 2, false);
        Object order = assignParameter(args, 3, false);
        this.selector = selector;
        this.properties = properties;
        this.specificity = specificity;
        this.order = order;
        return null;
    }

    @ConvertedMethod
    public Object getSelector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.selector);
    }

    @ConvertedMethod
    public Object getProperties(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.properties);
    }

    @ConvertedMethod
    public Object getSpecificity(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.specificity);
    }

    @ConvertedMethod
    public Object getOrder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.order);
    }

    public static final Object CONST_class = "TijsVerkoyen\\CssToInlineStyles\\Css\\Rule\\Rule";

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
                    .setName("TijsVerkoyen\\CssToInlineStyles\\Css\\Rule\\Rule")
                    .setLookup(
                            Rule.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("order", "properties", "selector", "specificity")
                    .setFilename("vendor/tijsverkoyen/css-to-inline-styles/src/Css/Rule/Rule.php")
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
