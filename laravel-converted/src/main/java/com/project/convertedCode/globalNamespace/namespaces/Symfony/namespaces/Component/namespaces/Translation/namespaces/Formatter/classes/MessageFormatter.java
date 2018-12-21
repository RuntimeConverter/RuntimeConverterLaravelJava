package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Formatter.classes.MessageFormatterInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Formatter.classes.ChoiceMessageFormatterInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageSelector;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Formatter/MessageFormatter.php

*/

public class MessageFormatter extends RuntimeClassBase
        implements MessageFormatterInterface, ChoiceMessageFormatterInterface {

    public Object selector = null;

    public MessageFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MessageFormatter.class) {
            this.__construct(env, args);
        }
    }

    public MessageFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "selector",
        typeHint = "Symfony\\Component\\Translation\\MessageSelector",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object selector = assignParameter(args, 0, true);
        if (null == selector) {
            selector = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.selector =
                ZVal.isTrue(ternaryExpressionTemp = selector)
                        ? ternaryExpressionTemp
                        : new MessageSelector(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "locale")
    @ConvertedParameter(
        index = 2,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object format(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(NamespaceGlobal.strtr.env(env).call(message, parameters).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "number")
    @ConvertedParameter(index = 2, name = "locale")
    @ConvertedParameter(
        index = 3,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object choiceFormat(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object locale = assignParameter(args, 2, false);
        Object parameters = assignParameter(args, 3, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        parameters =
                function_array_merge
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair("%count%", number)), parameters)
                        .value();
        return ZVal.assign(
                this.format(
                        env,
                        env.callMethod(
                                this.selector,
                                "choose",
                                MessageFormatter.class,
                                message,
                                ZVal.toLong(number),
                                locale),
                        locale,
                        parameters));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Formatter\\MessageFormatter";

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
                    .setName("Symfony\\Component\\Translation\\Formatter\\MessageFormatter")
                    .setLookup(
                            MessageFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("selector")
                    .setFilename("vendor/symfony/translation/Formatter/MessageFormatter.php")
                    .addInterface(
                            "Symfony\\Component\\Translation\\Formatter\\MessageFormatterInterface")
                    .addInterface(
                            "Symfony\\Component\\Translation\\Formatter\\ChoiceMessageFormatterInterface")
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
