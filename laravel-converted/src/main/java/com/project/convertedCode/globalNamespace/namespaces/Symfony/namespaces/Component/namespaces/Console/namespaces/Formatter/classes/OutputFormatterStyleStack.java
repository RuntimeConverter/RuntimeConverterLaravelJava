package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatterStyle;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Formatter/OutputFormatterStyleStack.php

*/

public class OutputFormatterStyleStack extends RuntimeClassBase {

    public Object styles = null;

    public Object emptyStyle = null;

    public OutputFormatterStyleStack(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == OutputFormatterStyleStack.class) {
            this.__construct(env, args);
        }
    }

    public OutputFormatterStyleStack(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "emptyStyle",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object emptyStyle = assignParameter(args, 0, true);
        if (null == emptyStyle) {
            emptyStyle = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.emptyStyle =
                ZVal.isTrue(ternaryExpressionTemp = emptyStyle)
                        ? ternaryExpressionTemp
                        : new OutputFormatterStyle(env);
        this.reset(env);
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.styles = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "style",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleInterface"
    )
    public Object push(RuntimeEnv env, Object... args) {
        Object style = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "styles", env).arrayAppend(env).set(style);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "style",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pop(RuntimeEnv env, Object... args) {
        Object style = assignParameter(args, 0, true);
        if (null == style) {
            style = ZVal.getNull();
        }
        Object stackedStyle = null;
        Object index = null;
        if (ZVal.isEmpty(this.styles)) {
            return ZVal.assign(this.emptyStyle);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", style)) {
            return ZVal.assign(function_array_pop.f.env(env).call(this.styles).value());
        }

        for (ZPair zpairResult1687 :
                ZVal.getIterable(
                        function_array_reverse.f.env(env).call(this.styles, true).value(),
                        env,
                        false)) {
            index = ZVal.assign(zpairResult1687.getKey());
            stackedStyle = ZVal.assign(zpairResult1687.getValue());
            if (ZVal.strictEqualityCheck(
                    env.callMethod(style, "apply", OutputFormatterStyleStack.class, ""),
                    "===",
                    env.callMethod(stackedStyle, "apply", OutputFormatterStyleStack.class, ""))) {
                this.styles = function_array_slice.f.env(env).call(this.styles, 0, index).value();
                return ZVal.assign(stackedStyle);
            }
        }

        throw ZVal.getException(
                env, new InvalidArgumentException(env, "Incorrectly nested style tag found."));
    }

    @ConvertedMethod
    public Object getCurrent(RuntimeEnv env, Object... args) {
        if (ZVal.isEmpty(this.styles)) {
            return ZVal.assign(this.emptyStyle);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "styles", env)
                        .arrayGet(
                                env,
                                ZVal.subtract(
                                        function_count.f.env(env).call(this.styles).value(), 1)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "emptyStyle",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleInterface"
    )
    public Object setEmptyStyle(RuntimeEnv env, Object... args) {
        Object emptyStyle = assignParameter(args, 0, false);
        this.emptyStyle = emptyStyle;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getEmptyStyle(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.emptyStyle);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleStack";

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
                    .setName("Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleStack")
                    .setLookup(
                            OutputFormatterStyleStack.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("emptyStyle", "styles")
                    .setFilename("vendor/symfony/console/Formatter/OutputFormatterStyleStack.php")
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
