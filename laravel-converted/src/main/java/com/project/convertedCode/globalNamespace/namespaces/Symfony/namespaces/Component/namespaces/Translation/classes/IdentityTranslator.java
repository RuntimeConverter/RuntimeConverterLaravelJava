package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.Locale;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.TranslatorInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageSelector;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/IdentityTranslator.php

*/

public class IdentityTranslator extends RuntimeClassBase implements TranslatorInterface {

    public Object selector = null;

    public Object locale = null;

    public IdentityTranslator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IdentityTranslator.class) {
            this.__construct(env, args);
        }
    }

    public IdentityTranslator(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "locale")
    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        this.locale = locale;
        return null;
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.locale)
                        ? ternaryExpressionTemp
                        : Locale.runtimeStaticObject.getDefault(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object trans(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object locale = assignParameter(args, 3, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        return ZVal.assign(
                NamespaceGlobal.strtr.env(env).call(toStringR(id, env), parameters).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "number")
    @ConvertedParameter(
        index = 2,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object transChoice(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object domain = assignParameter(args, 3, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        Object locale = assignParameter(args, 4, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                NamespaceGlobal.strtr
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.selector,
                                        "choose",
                                        IdentityTranslator.class,
                                        toStringR(id, env),
                                        ZVal.toLong(number),
                                        ZVal.isTrue(ternaryExpressionTemp = locale)
                                                ? ternaryExpressionTemp
                                                : this.getLocale(env)),
                                parameters)
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\IdentityTranslator";

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
                    .setName("Symfony\\Component\\Translation\\IdentityTranslator")
                    .setLookup(
                            IdentityTranslator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("locale", "selector")
                    .setFilename("vendor/symfony/translation/IdentityTranslator.php")
                    .addInterface("Symfony\\Component\\Translation\\TranslatorInterface")
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
