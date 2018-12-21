package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.HttpCache.classes.AbstractSurrogate;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/HttpCache/Esi.php

*/

public class Esi extends AbstractSurrogate {

    public Esi(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Esi.class) {
            this.__construct(env, args);
        }
    }

    public Esi(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "esi";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    public Object addSurrogateControl(RuntimeEnv env, Object... args) {
        Object response = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                function_strpos
                        .f
                        .env(env)
                        .call(env.callMethod(response, "getContent", Esi.class), "<esi:include")
                        .value())) {
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "set",
                    Esi.class,
                    "Surrogate-Control",
                    "content=\"ESI/1.0\"");
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "alt",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "ignoreErrors",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "comment")
    public Object renderIncludeTag(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object alt = assignParameter(args, 1, true);
        if (null == alt) {
            alt = ZVal.getNull();
        }
        Object ignoreErrors = assignParameter(args, 2, true);
        if (null == ignoreErrors) {
            ignoreErrors = true;
        }
        Object comment = assignParameter(args, 3, true);
        if (null == comment) {
            comment = "";
        }
        Object html = null;
        html =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<esi:include src=\"%s\"%s%s />",
                                uri,
                                ZVal.isTrue(ignoreErrors) ? " onerror=\"continue\"" : "",
                                ZVal.isTrue(alt)
                                        ? function_sprintf
                                                .f
                                                .env(env)
                                                .call(" alt=\"%s\"", alt)
                                                .value()
                                        : "")
                        .value();
        if (!ZVal.isEmpty(comment)) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call("<esi:comment text=\"%s\" />\n%s", comment, html)
                            .value());
        }

        return ZVal.assign(html);
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
    public Object process(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        ReferenceContainer set = new BasicReferenceContainer(null);
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        ReferenceContainer parts = new BasicReferenceContainer(null);
        ReferenceContainer options = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object type = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object content = null;
        type =
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "get",
                        Esi.class,
                        "Content-Type");
        if (ZVal.isEmpty(type)) {
            type = "text/html";
        }

        parts.setObject(function_explode.f.env(env).call(";", type).value());
        if (!function_in_array
                .f
                .env(env)
                .call(
                        parts.arrayGet(env, 0),
                        toObjectR(this).accessProp(this, env).name("contentTypes").value())
                .getBool()) {
            return ZVal.assign(response);
        }

        content = env.callMethod(response, "getContent", Esi.class);
        content =
                function_preg_replace
                        .f
                        .env(env)
                        .call("#<esi\\:remove>.*?</esi\\:remove>#s", "", content)
                        .value();
        content =
                function_preg_replace
                        .f
                        .env(env)
                        .call("#<esi\\:comment[^>]+>#s", "", content)
                        .value();
        chunks.setObject(
                NamespaceGlobal.preg_split
                        .env(env)
                        .call("#<esi\\:include\\s+(.*?)\\s*(?:/|</esi\\:include)>#", content, -1, 2)
                        .value());
        chunks.arrayAccess(env, 0)
                .set(
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "phpEscapeMap", env)
                                                .arrayGet(env, 0),
                                        new ReferenceClassProperty(this, "phpEscapeMap", env)
                                                .arrayGet(env, 1),
                                        chunks.arrayGet(env, 0))
                                .value());
        i.setObject(1);
        while (arrayActionR(ArrayAction.ISSET, chunks, env, i.getObject())) {
            options.setObject(ZVal.newArray());
            function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/(src|onerror|alt)=\"([^\"]*?)\"/",
                            chunks.arrayGet(env, i.getObject()),
                            matches.getObject(),
                            2);
            for (ZPair zpairResult1955 : ZVal.getIterable(matches.getObject(), env, true)) {
                set.setObject(ZVal.assign(zpairResult1955.getValue()));
                options.arrayAccess(env, set.arrayGet(env, 1)).set(set.arrayGet(env, 2));
            }

            if (!arrayActionR(ArrayAction.ISSET, options, env, "src")) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env, "Unable to process an ESI tag without a \"src\" attribute."));
            }

            chunks.arrayAccess(env, i.getObject())
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "<?php echo $this->surrogate->handle($this, %s, %s, %s) ?>"
                                                    + "\n",
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(options.arrayGet(env, "src"), true)
                                                    .value(),
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(
                                                            arrayActionR(
                                                                            ArrayAction.ISSET,
                                                                            options,
                                                                            env,
                                                                            "alt")
                                                                    ? options.arrayGet(env, "alt")
                                                                    : "",
                                                            true)
                                                    .value(),
                                            ZVal.toBool(
                                                                    arrayActionR(
                                                                            ArrayAction.ISSET,
                                                                            options,
                                                                            env,
                                                                            "onerror"))
                                                            && ZVal.toBool(
                                                                    ZVal.strictEqualityCheck(
                                                                            "continue",
                                                                            "===",
                                                                            options.arrayGet(
                                                                                    env,
                                                                                    "onerror")))
                                                    ? "true"
                                                    : "false")
                                    .value());
            i.setObject(ZVal.increment(i.getObject()));
            chunks.arrayAccess(env, i.getObject())
                    .set(
                            function_str_replace
                                    .f
                                    .env(env)
                                    .call(
                                            new ReferenceClassProperty(this, "phpEscapeMap", env)
                                                    .arrayGet(env, 0),
                                            new ReferenceClassProperty(this, "phpEscapeMap", env)
                                                    .arrayGet(env, 1),
                                            chunks.arrayGet(env, i.getObject()))
                                    .value());
            i.setObject(ZVal.increment(i.getObject()));
        }

        content = NamespaceGlobal.implode.env(env).call("", chunks.getObject()).value();
        env.callMethod(response, "setContent", Esi.class, content);
        env.callMethod(
                toObjectR(response).accessProp(this, env).name("headers").value(),
                "set",
                Esi.class,
                "X-Body-Eval",
                "ESI");
        env.callMethod(this, "removeFromControl", Esi.class, response);
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\HttpCache\\Esi";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractSurrogate.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\HttpCache\\Esi")
                    .setLookup(
                            Esi.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("contentTypes", "phpEscapeMap")
                    .setFilename("vendor/symfony/http-kernel/HttpCache/Esi.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\HttpCache\\SurrogateInterface")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\HttpCache\\AbstractSurrogate")
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
