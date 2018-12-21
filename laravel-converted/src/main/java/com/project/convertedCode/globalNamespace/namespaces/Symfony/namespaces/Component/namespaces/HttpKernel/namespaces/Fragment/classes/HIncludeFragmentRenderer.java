package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Fragment.classes.RoutableFragmentRenderer;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Controller.classes.ControllerReference;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.Response;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Fragment/HIncludeFragmentRenderer.php

*/

public class HIncludeFragmentRenderer extends RoutableFragmentRenderer {

    public Object globalDefaultTemplate = null;

    public Object signer = null;

    public Object templating = null;

    public Object charset = null;

    public HIncludeFragmentRenderer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HIncludeFragmentRenderer.class) {
            this.__construct(env, args);
        }
    }

    public HIncludeFragmentRenderer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "templating",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "signer",
        typeHint = "Symfony\\Component\\HttpKernel\\UriSigner",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "globalDefaultTemplate",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "charset", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object templating = assignParameter(args, 0, true);
        if (null == templating) {
            templating = ZVal.getNull();
        }
        Object signer = assignParameter(args, 1, true);
        if (null == signer) {
            signer = ZVal.getNull();
        }
        Object globalDefaultTemplate = assignParameter(args, 2, true);
        if (null == globalDefaultTemplate) {
            globalDefaultTemplate = ZVal.getNull();
        }
        Object charset = assignParameter(args, 3, true);
        if (null == charset) {
            charset = "utf-8";
        }
        this.setTemplating(env, templating);
        this.globalDefaultTemplate = globalDefaultTemplate;
        this.signer = signer;
        this.charset = charset;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "templating")
    public Object setTemplating(RuntimeEnv env, Object... args) {
        Object templating = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", templating))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        templating,
                                                        (Class) null,
                                                        "EngineInterface",
                                                        env))))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        templating, (Class) null, "Environment", env)))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The hinclude rendering strategy needs an instance of Twig\\Environment or Symfony\\Component\\Templating\\EngineInterface"));
        }

        this.templating = templating;
        return null;
    }

    @ConvertedMethod
    public Object hasTemplating(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.templating));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object render(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object template = null;
        Object flags = null;
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object attribute = null;
        Object value = null;
        Object content = null;
        Object renderedAttributes = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        uri,
                        ControllerReference.class,
                        "Symfony\\Component\\HttpKernel\\Controller\\ControllerReference"))) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.signer)) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                "You must use a proper URI when using the Hinclude rendering strategy or set a URL signer."));
            }

            uri =
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(
                                            this.signer,
                                            "sign",
                                            HIncludeFragmentRenderer.class,
                                            env.callMethod(
                                                    this,
                                                    "generateFragmentUri",
                                                    HIncludeFragmentRenderer.class,
                                                    uri,
                                                    request,
                                                    true)),
                                    function_strlen
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            request,
                                                            "getSchemeAndHttpHost",
                                                            HIncludeFragmentRenderer.class))
                                            .value())
                            .value();
        }

        uri = function_str_replace.f.env(env).call("&", "&amp;", uri).value();
        template =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, options, env, "default")
                                ? options.arrayGet(env, "default")
                                : this.globalDefaultTemplate);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(), "!==", this.templating))
                                && ZVal.toBool(template))
                && ZVal.toBool(this.templateExists(env, template))) {
            content =
                    env.callMethod(
                            this.templating, "render", HIncludeFragmentRenderer.class, template);

        } else {
            content = ZVal.assign(template);
        }

        attributes.setObject(
                ZVal.assign(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "attributes"))
                                        && ZVal.toBool(
                                                function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(options.arrayGet(env, "attributes"))
                                                        .value())
                                ? options.arrayGet(env, "attributes")
                                : ZVal.newArray()));
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "id"))
                && ZVal.toBool(options.arrayGet(env, "id"))) {
            attributes.arrayAccess(env, "id").set(options.arrayGet(env, "id"));
        }

        renderedAttributes = "";
        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(attributes.getObject()).value(), '>', 0)) {
            flags = ZVal.toLong(3) | ZVal.toLong(8);
            for (ZPair zpairResult1952 : ZVal.getIterable(attributes.getObject(), env, false)) {
                attribute = ZVal.assign(zpairResult1952.getKey());
                value = ZVal.assign(zpairResult1952.getValue());
                renderedAttributes =
                        toStringR(renderedAttributes, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        " %s=\"%s\"",
                                                        NamespaceGlobal.htmlspecialchars
                                                                .env(env)
                                                                .call(
                                                                        attribute,
                                                                        flags,
                                                                        this.charset,
                                                                        false)
                                                                .value(),
                                                        NamespaceGlobal.htmlspecialchars
                                                                .env(env)
                                                                .call(
                                                                        value,
                                                                        flags,
                                                                        this.charset,
                                                                        false)
                                                                .value())
                                                .value(),
                                        env);
            }
        }

        return ZVal.assign(
                new Response(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<hx:include src=\"%s\"%s>%s</hx:include>",
                                        uri, renderedAttributes, content)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template", typeHint = "string")
    private Object templateExists(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, false);
        Object e = null;
        Object loader = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(this.templating, (Class) null, "EngineInterface", env))) {
            try {
                return ZVal.assign(
                        env.callMethod(
                                this.templating,
                                "exists",
                                HIncludeFragmentRenderer.class,
                                template));
            } catch (ConvertedException convertedException285) {
                if (convertedException285.instanceOf(
                        InvalidArgumentException.class, "InvalidArgumentException")) {
                    e = convertedException285.getObject();
                    return ZVal.assign(false);
                } else {
                    throw convertedException285;
                }
            }
        }

        loader = env.callMethod(this.templating, "getLoader", HIncludeFragmentRenderer.class);
        if (ZVal.toBool(ZVal.checkInstanceType(loader, (Class) null, "ExistsLoaderInterface", env))
                || ZVal.toBool(function_method_exists.f.env(env).call(loader, "exists").value())) {
            return ZVal.assign(
                    env.callMethod(loader, "exists", HIncludeFragmentRenderer.class, template));
        }

        try {
            if (function_method_exists.f.env(env).call(loader, "getSourceContext").getBool()) {
                env.callMethod(
                        loader, "getSourceContext", HIncludeFragmentRenderer.class, template);

            } else {
                env.callMethod(loader, "getSource", HIncludeFragmentRenderer.class, template);
            }

            return ZVal.assign(true);
        } catch (ConvertedException convertedException286) {
            if (ClassNotFoundDuringConversion.missingClassInCatchBlock("LoaderError")) {
                e = convertedException286.getObject();
            } else {
                throw convertedException286;
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "hinclude";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Fragment\\HIncludeFragmentRenderer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends RoutableFragmentRenderer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Fragment\\HIncludeFragmentRenderer")
                    .setLookup(
                            HIncludeFragmentRenderer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "fragmentPath",
                            "globalDefaultTemplate",
                            "signer",
                            "templating")
                    .setFilename("vendor/symfony/http-kernel/Fragment/HIncludeFragmentRenderer.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\Fragment\\FragmentRendererInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\HttpKernel\\Fragment\\RoutableFragmentRenderer")
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
