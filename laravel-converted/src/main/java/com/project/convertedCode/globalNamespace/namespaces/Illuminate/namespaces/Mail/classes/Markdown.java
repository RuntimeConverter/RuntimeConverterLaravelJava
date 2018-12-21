package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Mail.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Parsedown;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.TijsVerkoyen.namespaces.CssToInlineStyles.classes.CssToInlineStyles;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.HtmlString;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Mail/Markdown.php

*/

public class Markdown extends RuntimeClassBase {

    public Object view = null;

    public Object theme = "default";

    public Object componentPaths = ZVal.newArray();

    public Markdown(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Markdown.class) {
            this.__construct(env, args);
        }
    }

    public Markdown(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view", typeHint = "Illuminate\\Contracts\\View\\Factory")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object ternaryExpressionTemp = null;
        this.view = view;
        this.theme =
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "theme"))
                        ? ternaryExpressionTemp
                        : "default";
        this.loadComponentsFrom(
                env,
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "paths"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "inliner",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object render(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object inliner = assignParameter(args, 2, true);
        if (null == inliner) {
            inliner = ZVal.getNull();
        }
        Object contents = null;
        Object ternaryExpressionTemp = null;
        env.callMethod(this.view, "flushFinderCache", Markdown.class);
        contents =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.view,
                                        new RuntimeArgsWithReferences(),
                                        "replaceNamespace",
                                        Markdown.class,
                                        "mail",
                                        this.htmlComponentPaths(env)),
                                "make",
                                Markdown.class,
                                view,
                                data),
                        "render",
                        Markdown.class);
        return ZVal.assign(
                new HtmlString(
                        env,
                        env.callMethod(
                                ZVal.isTrue(ternaryExpressionTemp = inliner)
                                        ? ternaryExpressionTemp
                                        : new CssToInlineStyles(env),
                                "convert",
                                Markdown.class,
                                contents,
                                env.callMethod(
                                        env.callMethod(
                                                this.view,
                                                "make",
                                                Markdown.class,
                                                "mail::themes." + toStringR(this.theme, env)),
                                        "render",
                                        Markdown.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "view")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object renderText(RuntimeEnv env, Object... args) {
        Object view = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object contents = null;
        env.callMethod(this.view, "flushFinderCache", Markdown.class);
        contents =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.view,
                                        new RuntimeArgsWithReferences(),
                                        "replaceNamespace",
                                        Markdown.class,
                                        "mail",
                                        this.markdownComponentPaths(env)),
                                "make",
                                Markdown.class,
                                view,
                                data),
                        "render",
                        Markdown.class);
        return ZVal.assign(
                new HtmlString(
                        env,
                        NamespaceGlobal.html_entity_decode
                                .env(env)
                                .call(
                                        function_preg_replace
                                                .f
                                                .env(env)
                                                .call("/[\r\n]{2,}/", "\n\n", contents)
                                                .value(),
                                        3,
                                        "UTF-8")
                                .value()));
    }

    @ConvertedMethod
    public Object htmlComponentPaths(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Markdown.php");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Mail",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "path")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object path = assignParameter(args, 0, false);
                                        return ZVal.assign(toStringR(path, env) + "/html");
                                    }
                                },
                                this.componentPaths(env))
                        .value());
    }

    @ConvertedMethod
    public Object markdownComponentPaths(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Mail")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Mail/Markdown.php");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Mail",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "path")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object path = assignParameter(args, 0, false);
                                        return ZVal.assign(toStringR(path, env) + "/markdown");
                                    }
                                },
                                this.componentPaths(env))
                        .value());
    }

    @ConvertedMethod
    protected Object componentPaths(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_unique
                        .f
                        .env(env)
                        .call(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                this.componentPaths,
                                                ZVal.newArray(
                                                        new ZPair(
                                                                0,
                                                                toStringR(
                                                                                env
                                                                                        .addRootFilesystemPrefix(
                                                                                                "/vendor/laravel/framework/src/Illuminate/Mail"),
                                                                                env)
                                                                        + "/resources/views")))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "paths",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object loadComponentsFrom(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, true);
        if (null == paths) {
            paths = ZVal.newArray();
        }
        this.componentPaths = paths;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "theme")
    public Object theme(RuntimeEnv env, Object... args) {
        Object theme = assignParameter(args, 0, false);
        this.theme = theme;
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Mail\\Markdown";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object parse(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            Object parsedown = null;
            parsedown = new Parsedown(env);
            return ZVal.assign(
                    new HtmlString(env, env.callMethod(parsedown, "text", Markdown.class, text)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Mail\\Markdown")
                    .setLookup(
                            Markdown.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("componentPaths", "theme", "view")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Mail/Markdown.php")
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
