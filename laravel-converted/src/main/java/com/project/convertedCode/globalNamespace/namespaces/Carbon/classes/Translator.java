package com.project.convertedCode.globalNamespace.namespaces.Carbon.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.ArrayLoader;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nesbot/carbon/src/Carbon/Translator.php

*/

public class Translator
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .Translation
                .classes
                .Translator {

    public Translator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Translator.class) {
            this.__construct(env, args);
        }
    }

    public Translator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(
        index = 1,
        name = "formatter",
        typeHint = "Symfony\\Component\\Translation\\Formatter\\MessageFormatterInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "cacheDir",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "debug",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object formatter = assignParameter(args, 1, true);
        if (null == formatter) {
            formatter = ZVal.getNull();
        }
        Object cacheDir = assignParameter(args, 2, true);
        if (null == cacheDir) {
            cacheDir = ZVal.getNull();
        }
        Object debug = assignParameter(args, 3, true);
        if (null == debug) {
            debug = false;
        }
        env.callMethod(this, "addLoader", Translator.class, "array", new ArrayLoader(env));
        super.__construct(env, locale, formatter, cacheDir, debug);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object resetMessages(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope46 scope = new Scope46();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/nesbot/carbon/src/Carbon")
                            .setFile("/vendor/nesbot/carbon/src/Carbon/Translator.php");
            scope.locale = assignParameter(args, 0, true);
            if (null == scope.locale) {
                scope.locale = ZVal.getNull();
            }
            scope.filename = null;
            if (ZVal.strictEqualityCheck(scope.locale, "===", ZVal.getNull())) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .Translator
                                                .RequestStaticProperties
                                                .class)
                                .messages =
                        ZVal.newArray();
                throw new IncludeEventException(ZVal.assign(true));
            }

            if (function_file_exists
                    .f
                    .env(env)
                    .call(
                            scope.filename =
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/nesbot/carbon/src/Carbon"),
                                                    env)
                                            + "/Lang/"
                                            + toStringR(scope.locale, env)
                                            + ".php")
                    .getBool()) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Carbon
                                        .classes
                                        .Translator
                                        .RequestStaticProperties
                                        .class,
                                "messages")
                        .arrayAccess(env, scope.locale)
                        .set(
                                env.include(
                                        toStringR(scope.filename, env),
                                        stack,
                                        runtimeConverterFunctionClassConstants,
                                        true,
                                        false));
                env.callMethod(
                        scope._thisVarAlias,
                        "addResource",
                        Translator.class,
                        "array",
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .Translator
                                                .RequestStaticProperties
                                                .class,
                                        "messages")
                                .arrayGet(env, scope.locale),
                        scope.locale);
                throw new IncludeEventException(ZVal.assign(true));
            }

            throw new IncludeEventException(ZVal.assign(false));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    protected Object loadMessagesFromFile(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Carbon
                                .classes
                                .Translator
                                .RequestStaticProperties
                                .class,
                        "messages"),
                env,
                locale)) {
            return ZVal.assign(true);
        }

        return ZVal.assign(this.resetMessages(env, locale));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "messages")
    public Object setMessages(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object messages = assignParameter(args, 1, false);
        this.loadMessagesFromFile(env, locale);
        env.callMethod(this, "addResource", Translator.class, "array", messages, locale);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Carbon
                                .classes
                                .Translator
                                .RequestStaticProperties
                                .class,
                        "messages")
                .arrayAccess(env, locale)
                .set(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        arrayActionR(
                                                        ArrayAction.ISSET,
                                                        env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Carbon
                                                                        .classes
                                                                        .Translator
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "messages"),
                                                        env,
                                                        locale)
                                                ? env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Carbon
                                                                        .classes
                                                                        .Translator
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "messages")
                                                        .arrayGet(env, locale)
                                                : ZVal.newArray(),
                                        messages)
                                .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "locale",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getMessages(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, true);
        if (null == locale) {
            locale = ZVal.getNull();
        }
        return ZVal.assign(
                ZVal.strictEqualityCheck(locale, "===", ZVal.getNull())
                        ? env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .Translator
                                                .RequestStaticProperties
                                                .class)
                                .messages
                        : env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .Translator
                                                .RequestStaticProperties
                                                .class,
                                        "messages")
                                .arrayGet(env, locale));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object setLocale(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/nesbot/carbon/src/Carbon")
                        .setFile("/vendor/nesbot/carbon/src/Carbon/Translator.php");
        Object locale = assignParameter(args, 0, false);
        locale =
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/[-_]([a-z]{2,})/",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Carbon",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        return ZVal.assign(
                                                "_"
                                                        + toStringR(
                                                                function_call_user_func
                                                                        .f
                                                                        .env(env)
                                                                        .addReferenceArgs(
                                                                                new RuntimeArgsWithInfo(
                                                                                        args, this))
                                                                        .call(
                                                                                ZVal.isGreaterThan(
                                                                                                function_strlen
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                matches
                                                                                                                        .arrayGet(
                                                                                                                                env,
                                                                                                                                1))
                                                                                                        .value(),
                                                                                                '>',
                                                                                                2)
                                                                                        ? "ucfirst"
                                                                                        : "strtoupper",
                                                                                matches.arrayGet(
                                                                                        env, 1))
                                                                        .value(),
                                                                env));
                                    }
                                },
                                NamespaceGlobal.strtolower.env(env).call(locale).value())
                        .value();
        if (ZVal.isTrue(this.loadMessagesFromFile(env, locale))) {
            super.setLocale(env, locale);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Carbon\\Translator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .Translation
                    .classes
                    .Translator
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "locale",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object get(RuntimeEnv env, Object... args) {
            Object locale = assignParameter(args, 0, true);
            if (null == locale) {
                locale = ZVal.getNull();
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Translator
                                            .RequestStaticProperties
                                            .class)
                            .singleton,
                    "===",
                    ZVal.getNull())) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Carbon
                                                .classes
                                                .Translator
                                                .RequestStaticProperties
                                                .class)
                                .singleton =
                        env.createNewWithLateStaticBindings(
                                this,
                                ZVal.isTrue(ternaryExpressionTemp = locale)
                                        ? ternaryExpressionTemp
                                        : "en");
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Carbon
                                            .classes
                                            .Translator
                                            .RequestStaticProperties
                                            .class)
                            .singleton);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object singleton = null;

        public Object messages = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Carbon\\Translator")
                    .setLookup(
                            Translator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cacheDir",
                            "catalogues",
                            "configCacheFactory",
                            "debug",
                            "fallbackLocales",
                            "formatter",
                            "loaders",
                            "locale",
                            "resources")
                    .setStaticPropertyNames("messages", "singleton")
                    .setFilename("vendor/nesbot/carbon/src/Carbon/Translator.php")
                    .addInterface("Symfony\\Component\\Translation\\TranslatorInterface")
                    .addInterface("Symfony\\Component\\Translation\\TranslatorBagInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Translator")
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

    private static class Scope46 implements UpdateRuntimeScopeInterface {

        Object filename;
        Object _thisVarAlias;
        Object locale;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("filename", this.filename);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("locale", this.locale);
        }

        public void updateScope(RuntimeStack stack) {

            this.filename = stack.getVariable("filename");
            this._thisVarAlias = stack.getVariable("this");
            this.locale = stack.getVariable("locale");
        }
    }
}
