package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.LateDataCollectorInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.DataCollectorTranslator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/DataCollector/TranslationDataCollector.php

*/

public class TranslationDataCollector extends DataCollector implements LateDataCollectorInterface {

    public Object translator = null;

    public TranslationDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TranslationDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public TranslationDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "translator",
        typeHint = "Symfony\\Component\\Translation\\DataCollectorTranslator"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object translator = assignParameter(args, 0, false);
        this.translator = translator;
        return null;
    }

    @ConvertedMethod
    public Object lateCollect(RuntimeEnv env, Object... args) {
        Object messages = null;
        messages =
                this.sanitizeCollectedMessages(
                        env,
                        env.callMethod(
                                this.translator,
                                "getCollectedMessages",
                                TranslationDataCollector.class));
        toObjectR(this).accessProp(this, env).name("data").set(this.computeCount(env, messages));
        new ReferenceClassProperty(this, "data", env).arrayAccess(env, "messages").set(messages);
        new ReferenceClassProperty(this, "data", env)
                .arrayAccess(env, "locale")
                .set(env.callMethod(this.translator, "getLocale", TranslationDataCollector.class));
        new ReferenceClassProperty(this, "data", env)
                .arrayAccess(env, "fallback_locales")
                .set(
                        env.callMethod(
                                this.translator,
                                "getFallbackLocales",
                                TranslationDataCollector.class));
        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        env.callMethod(
                                this,
                                "cloneVar",
                                TranslationDataCollector.class,
                                toObjectR(this).accessProp(this, env).name("data").value()));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object getMessages(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "messages")
                        ? new ReferenceClassProperty(this, "data", env).arrayGet(env, "messages")
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object getCountMissings(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                DataCollectorTranslator.CONST_MESSAGE_MISSING)
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, DataCollectorTranslator.CONST_MESSAGE_MISSING)
                        : 0);
    }

    @ConvertedMethod
    public Object getCountFallbacks(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                DataCollectorTranslator.CONST_MESSAGE_EQUALS_FALLBACK)
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(
                                        env, DataCollectorTranslator.CONST_MESSAGE_EQUALS_FALLBACK)
                        : 0);
    }

    @ConvertedMethod
    public Object getCountDefines(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                DataCollectorTranslator.CONST_MESSAGE_DEFINED)
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, DataCollectorTranslator.CONST_MESSAGE_DEFINED)
                        : 0);
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                !arrayActionR(
                                ArrayAction.EMPTY,
                                new ReferenceClassProperty(this, "data", env),
                                env,
                                "locale")
                        ? new ReferenceClassProperty(this, "data", env).arrayGet(env, "locale")
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getFallbackLocales(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET,
                                                new ReferenceClassProperty(this, "data", env),
                                                env,
                                                "fallback_locales"))
                                && ZVal.toBool(
                                        ZVal.isGreaterThan(
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                new ReferenceClassProperty(
                                                                                this, "data", env)
                                                                        .arrayGet(
                                                                                env,
                                                                                "fallback_locales"))
                                                        .value(),
                                                '>',
                                                0))
                        ? new ReferenceClassProperty(this, "data", env)
                                .arrayGet(env, "fallback_locales")
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "translation";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    private Object sanitizeCollectedMessages(RuntimeEnv env, Object... args) {
        ReferenceContainer messages = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object messageId = null;
        ReferenceContainer message = new BasicReferenceContainer(null);
        Object key = null;
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult2109 : ZVal.getIterable(messages.getObject(), env, false)) {
            key = ZVal.assign(zpairResult2109.getKey());
            message.setObject(ZVal.assign(zpairResult2109.getValue()));
            messageId =
                    toStringR(message.arrayGet(env, "locale"), env)
                            + toStringR(message.arrayGet(env, "domain"), env)
                            + toStringR(message.arrayGet(env, "id"), env);
            if (!arrayActionR(ArrayAction.ISSET, result, env, messageId)) {
                message.arrayAccess(env, "count").set(1);
                message.arrayAccess(env, "parameters")
                        .set(
                                !arrayActionR(ArrayAction.EMPTY, message, env, "parameters")
                                        ? ZVal.newArray(
                                                new ZPair(0, message.arrayGet(env, "parameters")))
                                        : ZVal.newArray());
                messages.arrayAccess(env, key, "translation")
                        .set(this.sanitizeString(env, message.arrayGet(env, "translation")));
                result.arrayAccess(env, messageId).set(message.getObject());

            } else {
                if (!arrayActionR(ArrayAction.EMPTY, message, env, "parameters")) {
                    result.arrayAppend(env, messageId, "parameters")
                            .set(message.arrayGet(env, "parameters"));
                }

                result.arrayAccess(env, messageId, "count")
                        .set(ZVal.increment(result.arrayGet(env, messageId, "count")));
            }

            arrayActionR(ArrayAction.UNSET, messages, env, key);
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    private Object computeCount(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        ReferenceContainer count = new BasicReferenceContainer(null);
        ReferenceContainer message = new BasicReferenceContainer(null);
        count.setObject(
                ZVal.newArray(
                        new ZPair(DataCollectorTranslator.CONST_MESSAGE_DEFINED, 0),
                        new ZPair(DataCollectorTranslator.CONST_MESSAGE_MISSING, 0),
                        new ZPair(DataCollectorTranslator.CONST_MESSAGE_EQUALS_FALLBACK, 0)));
        for (ZPair zpairResult2110 : ZVal.getIterable(messages, env, true)) {
            message.setObject(ZVal.assign(zpairResult2110.getValue()));
            count.arrayAccess(env, message.arrayGet(env, "state"))
                    .set(ZVal.increment(count.arrayGet(env, message.arrayGet(env, "state"))));
        }

        return ZVal.assign(count.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "length",
        defaultValue = "80",
        defaultValueType = "number"
    )
    private Object sanitizeString(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object length = assignParameter(args, 1, true);
        if (null == length) {
            length = 80;
        }
        Object encoding = null;
        string =
                function_trim
                        .f
                        .env(env)
                        .call(function_preg_replace.f.env(env).call("/\\s+/", " ", string).value())
                        .value();
        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                encoding =
                        NamespaceGlobal.mb_detect_encoding
                                .env(env)
                                .call(string, ZVal.getNull(), true)
                                .value())) {
            if (ZVal.isGreaterThan(
                    NamespaceGlobal.mb_strlen.env(env).call(string, encoding).value(),
                    '>',
                    length)) {
                return ZVal.assign(
                        toStringR(
                                        NamespaceGlobal.mb_substr
                                                .env(env)
                                                .call(string, 0, ZVal.subtract(length, 3), encoding)
                                                .value(),
                                        env)
                                + "...");
            }

        } else if (ZVal.isGreaterThan(
                function_strlen.f.env(env).call(string).value(), '>', length)) {
            return ZVal.assign(
                    toStringR(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(string, 0, ZVal.subtract(length, 3))
                                            .value(),
                                    env)
                            + "...");
        }

        return ZVal.assign(string);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\DataCollector\\TranslationDataCollector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DataCollector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName(
                            "Symfony\\Component\\Translation\\DataCollector\\TranslationDataCollector")
                    .setLookup(
                            TranslationDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "data", "translator")
                    .setFilename(
                            "vendor/symfony/translation/DataCollector/TranslationDataCollector.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\LateDataCollectorInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
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
