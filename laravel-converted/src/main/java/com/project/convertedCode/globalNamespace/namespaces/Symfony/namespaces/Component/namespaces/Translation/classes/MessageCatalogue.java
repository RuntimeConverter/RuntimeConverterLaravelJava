package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageCatalogueInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MetadataAwareInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/MessageCatalogue.php

*/

public class MessageCatalogue extends RuntimeClassBase
        implements MessageCatalogueInterface, MetadataAwareInterface {

    public Object messages = ZVal.newArray();

    public Object metadata = ZVal.newArray();

    public Object resources = ZVal.newArray();

    public Object locale = null;

    public Object fallbackCatalogue = null;

    public Object parent = null;

    public MessageCatalogue(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MessageCatalogue.class) {
            this.__construct(env, args);
        }
    }

    public MessageCatalogue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(
        index = 1,
        name = "messages",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object messages = assignParameter(args, 1, true);
        if (null == messages) {
            messages = ZVal.newArray();
        }
        this.locale = locale;
        this.messages = messages;
        return null;
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.locale);
    }

    @ConvertedMethod
    public Object getDomains(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.messages).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object all(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", domain)) {
            return ZVal.assign(this.messages);
        }

        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "messages", env),
                                env,
                                domain)
                        ? new ReferenceClassProperty(this, "messages", env).arrayGet(env, domain)
                        : ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "translation")
    @ConvertedParameter(index = 2, name = "domain")
    public Object set(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object translation = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = "messages";
        }
        this.add(env, ZVal.newArray(new ZPair(id, translation)), domain);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "domain")
    public Object has(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, true);
        if (null == domain) {
            domain = "messages";
        }
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "messages", env),
                env,
                domain,
                id)) {
            return ZVal.assign(true);
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.fallbackCatalogue)) {
            return ZVal.assign(
                    env.callMethod(
                            this.fallbackCatalogue, "has", MessageCatalogue.class, id, domain));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "domain")
    public Object defines(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, true);
        if (null == domain) {
            domain = "messages";
        }
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "messages", env),
                        env,
                        domain,
                        id));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "domain")
    public Object get(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, true);
        if (null == domain) {
            domain = "messages";
        }
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "messages", env),
                env,
                domain,
                id)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "messages", env).arrayGet(env, domain, id));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.fallbackCatalogue)) {
            return ZVal.assign(
                    env.callMethod(
                            this.fallbackCatalogue, "get", MessageCatalogue.class, id, domain));
        }

        return ZVal.assign(id);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "domain")
    public Object replace(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, true);
        if (null == domain) {
            domain = "messages";
        }
        new ReferenceClassProperty(this, "messages", env)
                .arrayAccess(env, domain)
                .set(ZVal.newArray());
        this.add(env, messages, domain);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "domain")
    public Object add(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, true);
        if (null == domain) {
            domain = "messages";
        }
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "messages", env),
                env,
                domain)) {
            new ReferenceClassProperty(this, "messages", env)
                    .arrayAccess(env, domain)
                    .set(messages);

        } else {
            new ReferenceClassProperty(this, "messages", env)
                    .arrayAccess(env, domain)
                    .set(
                            function_array_replace
                                    .f
                                    .env(env)
                                    .call(
                                            new ReferenceClassProperty(this, "messages", env)
                                                    .arrayGet(env, domain),
                                            messages)
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogueInterface"
    )
    public Object addCatalogue(RuntimeEnv env, Object... args) {
        Object catalogue = assignParameter(args, 0, false);
        Object metadata = null;
        Object resource = null;
        Object domain = null;
        Object messages = null;
        if (ZVal.strictNotEqualityCheck(
                env.callMethod(catalogue, "getLocale", MessageCatalogue.class),
                "!==",
                this.locale)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Cannot add a catalogue for locale \"%s\" as the current locale for this catalogue is \"%s\"",
                                            env.callMethod(
                                                    catalogue, "getLocale", MessageCatalogue.class),
                                            this.locale)
                                    .value()));
        }

        for (ZPair zpairResult2155 :
                ZVal.getIterable(
                        env.callMethod(catalogue, "all", MessageCatalogue.class), env, false)) {
            domain = ZVal.assign(zpairResult2155.getKey());
            messages = ZVal.assign(zpairResult2155.getValue());
            this.add(env, messages, domain);
        }

        for (ZPair zpairResult2156 :
                ZVal.getIterable(
                        env.callMethod(catalogue, "getResources", MessageCatalogue.class),
                        env,
                        true)) {
            resource = ZVal.assign(zpairResult2156.getValue());
            this.addResource(env, resource);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        catalogue,
                        MetadataAwareInterface.class,
                        "Symfony\\Component\\Translation\\MetadataAwareInterface"))) {
            metadata = env.callMethod(catalogue, "getMetadata", MessageCatalogue.class, "", "");
            this.addMetadata(env, metadata);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogueInterface"
    )
    public Object addFallbackCatalogue(RuntimeEnv env, Object... args) {
        Object catalogue = assignParameter(args, 0, false);
        Object c = null;
        Object resource = null;
        c = ZVal.assign(catalogue);
        while (ZVal.isTrue(c = env.callMethod(c, "getFallbackCatalogue", MessageCatalogue.class))) {
            if (ZVal.strictEqualityCheck(
                    env.callMethod(c, "getLocale", MessageCatalogue.class),
                    "===",
                    this.getLocale(env))) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Circular reference detected when adding a fallback catalogue for locale \"%s\".",
                                                env.callMethod(
                                                        catalogue,
                                                        "getLocale",
                                                        MessageCatalogue.class))
                                        .value()));
            }
        }

        c = ZVal.assign(this);
        do {
            if (ZVal.strictEqualityCheck(
                    env.callMethod(c, "getLocale", MessageCatalogue.class),
                    "===",
                    env.callMethod(catalogue, "getLocale", MessageCatalogue.class))) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Circular reference detected when adding a fallback catalogue for locale \"%s\".",
                                                env.callMethod(
                                                        catalogue,
                                                        "getLocale",
                                                        MessageCatalogue.class))
                                        .value()));
            }

            for (ZPair zpairResult2157 :
                    ZVal.getIterable(
                            env.callMethod(catalogue, "getResources", MessageCatalogue.class),
                            env,
                            true)) {
                resource = ZVal.assign(zpairResult2157.getValue());
                env.callMethod(c, "addResource", MessageCatalogue.class, resource);
            }

        } while (ZVal.isTrue(
                c = ZVal.assign(toObjectR(c).accessProp(this, env).name("parent").value())));

        toObjectR(catalogue).accessProp(this, env).name("parent").set(this);
        this.fallbackCatalogue = catalogue;
        for (ZPair zpairResult2158 :
                ZVal.getIterable(
                        env.callMethod(catalogue, "getResources", MessageCatalogue.class),
                        env,
                        true)) {
            resource = ZVal.assign(zpairResult2158.getValue());
            this.addResource(env, resource);
        }

        return null;
    }

    @ConvertedMethod
    public Object getFallbackCatalogue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fallbackCatalogue);
    }

    @ConvertedMethod
    public Object getResources(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_values.f.env(env).call(this.resources).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resource",
        typeHint = "Symfony\\Component\\Config\\Resource\\ResourceInterface"
    )
    public Object addResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "resources", env)
                .arrayAccess(env, env.callMethod(resource, "__toString", MessageCatalogue.class))
                .set(resource);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "domain")
    public Object getMetadata(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = "";
        }
        Object domain = assignParameter(args, 1, true);
        if (null == domain) {
            domain = "messages";
        }
        if (ZVal.equalityCheck("", domain)) {
            return ZVal.assign(this.metadata);
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "metadata", env),
                env,
                domain)) {
            if (ZVal.equalityCheck("", key)) {
                return ZVal.assign(
                        new ReferenceClassProperty(this, "metadata", env).arrayGet(env, domain));
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "metadata", env),
                    env,
                    domain,
                    key)) {
                return ZVal.assign(
                        new ReferenceClassProperty(this, "metadata", env)
                                .arrayGet(env, domain, key));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "domain")
    public Object setMetadata(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = "messages";
        }
        new ReferenceClassProperty(this, "metadata", env).arrayAccess(env, domain, key).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "domain")
    public Object deleteMetadata(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = "";
        }
        Object domain = assignParameter(args, 1, true);
        if (null == domain) {
            domain = "messages";
        }
        if (ZVal.equalityCheck("", domain)) {
            this.metadata = ZVal.newArray();

        } else if (ZVal.equalityCheck("", key)) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "metadata", env),
                    env,
                    domain);

        } else {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "metadata", env),
                    env,
                    domain,
                    key);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    private Object addMetadata(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object keys = null;
        Object domain = null;
        Object value = null;
        Object key = null;
        for (ZPair zpairResult2159 : ZVal.getIterable(values, env, false)) {
            domain = ZVal.assign(zpairResult2159.getKey());
            keys = ZVal.assign(zpairResult2159.getValue());
            for (ZPair zpairResult2160 : ZVal.getIterable(keys, env, false)) {
                key = ZVal.assign(zpairResult2160.getKey());
                value = ZVal.assign(zpairResult2160.getValue());
                this.setMetadata(env, key, value, domain);
            }
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\MessageCatalogue";

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
                    .setName("Symfony\\Component\\Translation\\MessageCatalogue")
                    .setLookup(
                            MessageCatalogue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fallbackCatalogue",
                            "locale",
                            "messages",
                            "metadata",
                            "parent",
                            "resources")
                    .setFilename("vendor/symfony/translation/MessageCatalogue.php")
                    .addInterface("Symfony\\Component\\Translation\\MessageCatalogueInterface")
                    .addInterface("Symfony\\Component\\Translation\\MetadataAwareInterface")
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
