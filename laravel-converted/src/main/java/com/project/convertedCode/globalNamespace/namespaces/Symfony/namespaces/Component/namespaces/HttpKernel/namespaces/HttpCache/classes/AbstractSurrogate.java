package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes.SurrogateInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes.ResponseCacheStrategy;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/HttpCache/AbstractSurrogate.php

*/

public abstract class AbstractSurrogate extends RuntimeClassBase implements SurrogateInterface {

    public Object contentTypes = null;

    public Object phpEscapeMap =
            ZVal.newArray(
                    new ZPair(0, ZVal.arrayFromList("<?", "<%", "<s", "<S")),
                    new ZPair(
                            1,
                            ZVal.arrayFromList(
                                    "<?php echo \"<?\"; ?>",
                                    "<?php echo \"<%\"; ?>",
                                    "<?php echo \"<s\"; ?>",
                                    "<?php echo \"<S\"; ?>")));

    public AbstractSurrogate(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractSurrogate.class) {
            this.__construct(env, args);
        }
    }

    public AbstractSurrogate(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "contentTypes",
        typeHint = "array",
        defaultValue =
                "ZVal.arrayFromList(\"text/html\", \"text/xml\", \"application/xhtml+xml\", \"application/xml\")",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object contentTypes = assignParameter(args, 0, true);
        if (null == contentTypes) {
            contentTypes =
                    ZVal.arrayFromList(
                            "text/html", "text/xml", "application/xhtml+xml", "application/xml");
        }
        this.contentTypes = contentTypes;
        return null;
    }

    @ConvertedMethod
    public Object createCacheStrategy(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ResponseCacheStrategy(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object hasSurrogateCapability(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object value = null;
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                value =
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("headers").value(),
                                "get",
                                AbstractSurrogate.class,
                                "Surrogate-Capability"))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        value,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s/1.0",
                                                        NamespaceGlobal.strtoupper
                                                                .env(env)
                                                                .call(
                                                                        env.callMethod(
                                                                                this,
                                                                                "getName",
                                                                                AbstractSurrogate
                                                                                        .class))
                                                                .value())
                                                .value())
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object addSurrogateCapability(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object _pNew = null;
        Object current = null;
        current =
                env.callMethod(
                        toObjectR(request).accessProp(this, env).name("headers").value(),
                        "get",
                        AbstractSurrogate.class,
                        "Surrogate-Capability");
        _pNew =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "symfony=\"%s/1.0\"",
                                NamespaceGlobal.strtoupper
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this, "getName", AbstractSurrogate.class))
                                        .value())
                        .value();
        env.callMethod(
                toObjectR(request).accessProp(this, env).name("headers").value(),
                "set",
                AbstractSurrogate.class,
                "Surrogate-Capability",
                ZVal.isTrue(current)
                        ? toStringR(current, env) + ", " + toStringR(_pNew, env)
                        : _pNew);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object needsParsing(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object pattern = null;
        Object control = null;
        if (!ZVal.isTrue(
                control =
                        env.callMethod(
                                toObjectR(response).accessProp(this, env).name("headers").value(),
                                "get",
                                AbstractSurrogate.class,
                                "Surrogate-Control"))) {
            return ZVal.assign(false);
        }

        pattern =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "#content=\"[^\"]*%s/1.0[^\"]*\"#",
                                NamespaceGlobal.strtoupper
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this, "getName", AbstractSurrogate.class))
                                        .value())
                        .value();
        return ZVal.assign(
                ZVal.toBool(function_preg_match.f.env(env).call(pattern, control).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cache",
        typeHint = "Symfony\\Component\\HttpKernel\\HttpCache\\HttpCache"
    )
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(index = 2, name = "alt")
    @ConvertedParameter(index = 3, name = "ignoreErrors")
    public Object handle(RuntimeEnv env, Object... args) {
        Object cache = assignParameter(args, 0, false);
        Object uri = assignParameter(args, 1, false);
        Object alt = assignParameter(args, 2, false);
        Object ignoreErrors = assignParameter(args, 3, false);
        Object subRequest = null;
        Object e = null;
        Object response = null;
        subRequest =
                Request.runtimeStaticObject.create(
                        env,
                        uri,
                        Request.CONST_METHOD_GET,
                        ZVal.newArray(),
                        env.callMethod(
                                toObjectR(
                                                env.callMethod(
                                                        cache,
                                                        "getRequest",
                                                        AbstractSurrogate.class))
                                        .accessProp(this, env)
                                        .name("cookies")
                                        .value(),
                                "all",
                                AbstractSurrogate.class),
                        ZVal.newArray(),
                        env.callMethod(
                                toObjectR(
                                                env.callMethod(
                                                        cache,
                                                        "getRequest",
                                                        AbstractSurrogate.class))
                                        .accessProp(this, env)
                                        .name("server")
                                        .value(),
                                "all",
                                AbstractSurrogate.class));
        try {
            response =
                    env.callMethod(
                            cache,
                            "handle",
                            AbstractSurrogate.class,
                            subRequest,
                            HttpKernelInterface.CONST_SUB_REQUEST,
                            true);
            if (!ZVal.isTrue(env.callMethod(response, "isSuccessful", AbstractSurrogate.class))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Error when rendering \"%s\" (Status code is %s).",
                                                env.callMethod(
                                                        subRequest,
                                                        "getUri",
                                                        AbstractSurrogate.class),
                                                env.callMethod(
                                                        response,
                                                        "getStatusCode",
                                                        AbstractSurrogate.class))
                                        .value()));
            }

            return ZVal.assign(env.callMethod(response, "getContent", AbstractSurrogate.class));
        } catch (ConvertedException convertedException288) {
            if (convertedException288.instanceOf(PHPException.class, "Exception")) {
                e = convertedException288.getObject();
                if (ZVal.isTrue(alt)) {
                    return ZVal.assign(this.handle(env, cache, alt, "", ignoreErrors));
                }

                if (!ZVal.isTrue(ignoreErrors)) {
                    throw ZVal.getException(env, e);
                }

            } else {
                throw convertedException288;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    protected Object removeFromControl(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        Object upperName = null;
        Object value = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "has",
                        AbstractSurrogate.class,
                        "Surrogate-Control"))) {
            return null;
        }

        value =
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "get",
                        AbstractSurrogate.class,
                        "Surrogate-Control");
        upperName =
                NamespaceGlobal.strtoupper
                        .env(env)
                        .call(env.callMethod(this, "getName", AbstractSurrogate.class))
                        .value();
        if (ZVal.equalityCheck(
                function_sprintf.f.env(env).call("content=\"%s/1.0\"", upperName).value(), value)) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "remove",
                    AbstractSurrogate.class,
                    "Surrogate-Control");

        } else if (function_preg_match
                .f
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call("#,\\s*content=\"%s/1.0\"#", upperName)
                                .value(),
                        value)
                .getBool()) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    AbstractSurrogate.class,
                    "Surrogate-Control",
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("#,\\s*content=\"%s/1.0\"#", upperName)
                                            .value(),
                                    "",
                                    value)
                            .value());

        } else if (function_preg_match
                .f
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call("#content=\"%s/1.0\",\\s*#", upperName)
                                .value(),
                        value)
                .getBool()) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    AbstractSurrogate.class,
                    "Surrogate-Control",
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("#content=\"%s/1.0\",\\s*#", upperName)
                                            .value(),
                                    "",
                                    value)
                            .value());
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\HttpCache\\AbstractSurrogate";

    @ConvertedMethod()
    public abstract Object getName(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object addSurrogateControl(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object renderIncludeTag(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object process(RuntimeEnv env, Object... args);

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
                    .setName("Symfony\\Component\\HttpKernel\\HttpCache\\AbstractSurrogate")
                    .setLookup(
                            AbstractSurrogate.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("contentTypes", "phpEscapeMap")
                    .setFilename("vendor/symfony/http-kernel/HttpCache/AbstractSurrogate.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\HttpCache\\SurrogateInterface")
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
