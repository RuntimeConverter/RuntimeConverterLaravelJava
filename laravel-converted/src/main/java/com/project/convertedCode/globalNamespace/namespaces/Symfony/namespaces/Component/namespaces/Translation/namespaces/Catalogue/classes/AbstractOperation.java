package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Catalogue.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Catalogue.classes.OperationInterface;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageCatalogue;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Catalogue/AbstractOperation.php

*/

public abstract class AbstractOperation extends RuntimeClassBase implements OperationInterface {

    public Object source = null;

    public Object target = null;

    public Object result = null;

    public Object domains = null;

    public Object messages = null;

    public AbstractOperation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractOperation.class) {
            this.__construct(env, args);
        }
    }

    public AbstractOperation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "source",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogueInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "target",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogueInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object source = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, false);
        if (ZVal.strictNotEqualityCheck(
                env.callMethod(source, "getLocale", AbstractOperation.class),
                "!==",
                env.callMethod(target, "getLocale", AbstractOperation.class))) {
            throw ZVal.getException(
                    env,
                    new LogicException(env, "Operated catalogues must belong to the same locale."));
        }

        this.source = source;
        this.target = target;
        this.result =
                new MessageCatalogue(
                        env, env.callMethod(source, "getLocale", AbstractOperation.class));
        this.messages = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object getDomains(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.domains)) {
            this.domains =
                    function_array_values
                            .f
                            .env(env)
                            .call(
                                    function_array_unique
                                            .f
                                            .env(env)
                                            .call(
                                                    function_array_merge
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            this.source,
                                                                            "getDomains",
                                                                            AbstractOperation
                                                                                    .class),
                                                                    env.callMethod(
                                                                            this.target,
                                                                            "getDomains",
                                                                            AbstractOperation
                                                                                    .class))
                                                            .value())
                                            .value())
                            .value();
        }

        return ZVal.assign(this.domains);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain")
    public Object getMessages(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        if (!function_in_array.f.env(env).call(domain, this.getDomains(env)).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Invalid domain: %s.", domain)
                                    .value()));
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "messages", env),
                env,
                domain,
                "all")) {
            env.callMethod(this, "processDomain", AbstractOperation.class, domain);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "messages", env).arrayGet(env, domain, "all"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain")
    public Object getNewMessages(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        if (!function_in_array.f.env(env).call(domain, this.getDomains(env)).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Invalid domain: %s.", domain)
                                    .value()));
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "messages", env),
                env,
                domain,
                "new")) {
            env.callMethod(this, "processDomain", AbstractOperation.class, domain);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "messages", env).arrayGet(env, domain, "new"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain")
    public Object getObsoleteMessages(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        if (!function_in_array.f.env(env).call(domain, this.getDomains(env)).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Invalid domain: %s.", domain)
                                    .value()));
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "messages", env),
                env,
                domain,
                "obsolete")) {
            env.callMethod(this, "processDomain", AbstractOperation.class, domain);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "messages", env)
                        .arrayGet(env, domain, "obsolete"));
    }

    @ConvertedMethod
    public Object getResult(RuntimeEnv env, Object... args) {
        Object domain = null;
        for (ZPair zpairResult2099 : ZVal.getIterable(this.getDomains(env), env, true)) {
            domain = ZVal.assign(zpairResult2099.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "messages", env),
                    env,
                    domain)) {
                env.callMethod(this, "processDomain", AbstractOperation.class, domain);
            }
        }

        return ZVal.assign(this.result);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Catalogue\\AbstractOperation";

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
                    .setName("Symfony\\Component\\Translation\\Catalogue\\AbstractOperation")
                    .setLookup(
                            AbstractOperation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("domains", "messages", "result", "source", "target")
                    .setFilename("vendor/symfony/translation/Catalogue/AbstractOperation.php")
                    .addInterface("Symfony\\Component\\Translation\\Catalogue\\OperationInterface")
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
