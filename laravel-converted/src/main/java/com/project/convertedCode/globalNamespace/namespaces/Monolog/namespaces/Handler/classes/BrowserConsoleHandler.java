package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/BrowserConsoleHandler.php

*/

public class BrowserConsoleHandler extends AbstractProcessingHandler {

    public BrowserConsoleHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BrowserConsoleHandler.class) {
            this.__construct(env, args);
        }
    }

    public BrowserConsoleHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new LineFormatter(
                        env,
                        "[[%channel%]]{macro: autolabel} [[%level_name%]]{font-weight: bold} %message%"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Monolog
                                .namespaces
                                .Handler
                                .classes
                                .BrowserConsoleHandler
                                .RequestStaticProperties
                                .class,
                        "records")
                .arrayAppend(env)
                .set(record);
        if (!ZVal.isTrue(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Monolog
                                        .namespaces
                                        .Handler
                                        .classes
                                        .BrowserConsoleHandler
                                        .RequestStaticProperties
                                        .class)
                        .initialized)) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .namespaces
                                            .Handler
                                            .classes
                                            .BrowserConsoleHandler
                                            .RequestStaticProperties
                                            .class)
                            .initialized =
                    true;
            this.registerShutdownFunction(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object registerShutdownFunction(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck("cli", "!==", "cli")) {
            function_register_shutdown_function
                    .f
                    .env(env)
                    .call(ZVal.arrayFromList("Monolog\\Handler\\BrowserConsoleHandler", "send"));
        }

        return null;
    }

    public static final Object CONST_class = "Monolog\\Handler\\BrowserConsoleHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object send(RuntimeEnv env, Object... args) {
            Object format = null;
            format = runtimeStaticObject.getResponseFormat(env);
            if (ZVal.strictEqualityCheck(format, "===", "unknown")) {
                return null;
            }

            if (function_count
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Monolog
                                                    .namespaces
                                                    .Handler
                                                    .classes
                                                    .BrowserConsoleHandler
                                                    .RequestStaticProperties
                                                    .class)
                                    .records)
                    .getBool()) {
                if (ZVal.strictEqualityCheck(format, "===", "html")) {
                    runtimeStaticObject.writeOutput(
                            env,
                            "<script>"
                                    + toStringR(runtimeStaticObject.generateScript(env), env)
                                    + "</script>");

                } else if (ZVal.strictEqualityCheck(format, "===", "js")) {
                    runtimeStaticObject.writeOutput(env, runtimeStaticObject.generateScript(env));
                }

                runtimeStaticObject.reset(env);
            }

            return null;
        }

        @ConvertedMethod
        public Object reset(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Monolog
                                            .namespaces
                                            .Handler
                                            .classes
                                            .BrowserConsoleHandler
                                            .RequestStaticProperties
                                            .class)
                            .records =
                    ZVal.newArray();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "str")
        protected Object writeOutput(RuntimeEnv env, Object... args) {
            Object str = assignParameter(args, 0, false);
            env.echo(str);
            return null;
        }

        @ConvertedMethod
        protected Object getResponseFormat(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            Object header = null;
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult765 :
                    ZVal.getIterable(
                            NamespaceGlobal.headers_list.env(env).call().value(), env, true)) {
                header = ZVal.assign(zpairResult765.getValue());
                if (ZVal.strictEqualityCheck(
                        function_stripos.f.env(env).call(header, "content-type:").value(),
                        "===",
                        0)) {
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            function_stripos
                                                    .f
                                                    .env(env)
                                                    .call(header, "application/javascript")
                                                    .value(),
                                            "!==",
                                            false))
                            || ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            function_stripos
                                                    .f
                                                    .env(env)
                                                    .call(header, "text/javascript")
                                                    .value(),
                                            "!==",
                                            false))) {
                        return "js";
                    }

                    if (ZVal.strictEqualityCheck(
                            function_stripos.f.env(env).call(header, "text/html").value(),
                            "===",
                            false)) {
                        return "unknown";
                    }

                    break;
                }
            }

            return "html";
        }

        @ConvertedMethod
        private Object generateScript(RuntimeEnv env, Object... args) {
            ReferenceContainer record = new BasicReferenceContainer(null);
            Object extra = null;
            Object context = null;
            ReferenceContainer script = new BasicReferenceContainer(null);
            script.setObject(ZVal.newArray());
            for (ZPair zpairResult766 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Monolog
                                                    .namespaces
                                                    .Handler
                                                    .classes
                                                    .BrowserConsoleHandler
                                                    .RequestStaticProperties
                                                    .class)
                                    .records,
                            env,
                            true)) {
                record.setObject(ZVal.assign(zpairResult766.getValue()));
                context = runtimeStaticObject.dump(env, "Context", record.arrayGet(env, "context"));
                extra = runtimeStaticObject.dump(env, "Extra", record.arrayGet(env, "extra"));
                if (ZVal.toBool(ZVal.isEmpty(context)) && ZVal.toBool(ZVal.isEmpty(extra))) {
                    script.arrayAppend(env)
                            .set(
                                    runtimeStaticObject.call_array(
                                            env,
                                            "log",
                                            runtimeStaticObject.handleStyles(
                                                    env, record.arrayGet(env, "formatted"))));

                } else {
                    script.setObject(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            script.getObject(),
                                            ZVal.newArray(
                                                    new ZPair(
                                                            0,
                                                            runtimeStaticObject.call_array(
                                                                    env,
                                                                    "groupCollapsed",
                                                                    runtimeStaticObject
                                                                            .handleStyles(
                                                                                    env,
                                                                                    record.arrayGet(
                                                                                            env,
                                                                                            "formatted"))))),
                                            context,
                                            extra,
                                            ZVal.newArray(
                                                    new ZPair(
                                                            0,
                                                            runtimeStaticObject.call(
                                                                    env, "groupEnd"))))
                                    .value());
                }
            }

            return ZVal.assign(
                    "(function (c) {if (c && c.groupCollapsed) {\n"
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call("\n", script.getObject())
                                            .value(),
                                    env)
                            + "\n}})(console);");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "formatted")
        private Object handleStyles(RuntimeEnv env, Object... args) {
            Object formatted = assignParameter(args, 0, false);
            ReferenceContainer ___args = new BasicReferenceContainer(null);
            Object pos = null;
            Object format = null;
            ReferenceContainer match = new BasicReferenceContainer(null);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            ___args.setObject(
                    ZVal.newArray(
                            new ZPair(0, runtimeStaticObject.quote(env, "font-weight: normal"))));
            format = "%c" + toStringR(formatted, env);
            function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/\\[\\[(.*?)\\]\\]\\{([^}]*)\\}/s",
                            format,
                            matches.getObject(),
                            ZVal.toLong(256) | ZVal.toLong(2));
            for (ZPair zpairResult767 :
                    ZVal.getIterable(
                            function_array_reverse.f.env(env).call(matches.getObject()).value(),
                            env,
                            true)) {
                match.setObject(ZVal.assign(zpairResult767.getValue()));
                ___args.arrayAppend(env)
                        .set(
                                runtimeStaticObject.quote(
                                        env,
                                        runtimeStaticObject.handleCustomStyles(
                                                env,
                                                match.arrayGet(env, 2, 0),
                                                match.arrayGet(env, 1, 0))));
                ___args.arrayAppend(env).set("\"font-weight: normal\"");
                pos = ZVal.assign(match.arrayGet(env, 0, 1));
                format =
                        toStringR(function_substr.f.env(env).call(format, 0, pos).value(), env)
                                + "%c"
                                + toStringR(match.arrayGet(env, 1, 0), env)
                                + "%c"
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        format,
                                                        ZVal.add(
                                                                pos,
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                match.arrayGet(
                                                                                        env, 0, 0))
                                                                        .value()))
                                                .value(),
                                        env);
            }

            function_array_unshift
                    .f
                    .env(env)
                    .call(___args.getObject(), runtimeStaticObject.quote(env, format));
            return ZVal.assign(___args.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "style")
        @ConvertedParameter(index = 1, name = "string")
        private Object handleCustomStyles(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                            .setFile(
                                    "/vendor/monolog/monolog/src/Monolog/Handler/BrowserConsoleHandler.php");
            Object style = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            ReferenceContainer colors = new BasicReferenceContainer(null);
            ReferenceContainer labels = new BasicReferenceContainer(null);
            colors =
                    env.getInlineStatic(
                            14,
                            ZVal.arrayFromList(
                                    "blue", "green", "red", "magenta", "orange", "black", "grey"));
            labels = env.getInlineStatic(15, ZVal.newArray());
            return ZVal.assign(
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "/macro\\s*:(.*?)(?:;|$)/",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Monolog\\Handler",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "m")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            ReferenceContainer m =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            Object string = null;
                                            Object color = null;
                                            ReferenceContainer colors =
                                                    new BasicReferenceContainer(null);
                                            ReferenceContainer labels =
                                                    new BasicReferenceContainer(null);
                                            string =
                                                    this.contextReferences.getCapturedValue(
                                                            "string");
                                            colors =
                                                    this.contextReferences.getReferenceContainer(
                                                            "colors");
                                            labels =
                                                    this.contextReferences.getReferenceContainer(
                                                            "labels");
                                            if (ZVal.strictEqualityCheck(
                                                    function_trim
                                                            .f
                                                            .env(env)
                                                            .call(m.arrayGet(env, 1))
                                                            .value(),
                                                    "===",
                                                    "autolabel")) {
                                                if (!arrayActionR(
                                                        ArrayAction.ISSET, labels, env, string)) {
                                                    labels.arrayAccess(env, string)
                                                            .set(
                                                                    colors.arrayGet(
                                                                            env,
                                                                            ZVal.modulus(
                                                                                    function_count
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    labels
                                                                                                            .getObject())
                                                                                            .value(),
                                                                                    function_count
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    colors
                                                                                                            .getObject())
                                                                                            .value())));
                                                }

                                                color = ZVal.assign(labels.arrayGet(env, string));
                                                return ZVal.assign(
                                                        "background-color: "
                                                                + toStringR(color, env)
                                                                + "; color: white; border-radius: 3px; padding: 0 2px 0 2px");
                                            }

                                            return ZVal.assign(m.arrayGet(env, 1));
                                        }
                                    }.useRef("colors", colors)
                                            .useRef("labels", labels)
                                            .use("string", string),
                                    style)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "title")
        @ConvertedParameter(index = 1, name = "dict", typeHint = "array")
        private Object dump(RuntimeEnv env, Object... args) {
            Object title = assignParameter(args, 0, false);
            Object dict = assignParameter(args, 1, false);
            Object value = null;
            ReferenceContainer script = new BasicReferenceContainer(null);
            Object key = null;
            script.setObject(ZVal.newArray());
            dict = function_array_filter.f.env(env).call(dict).value();
            if (ZVal.isEmpty(dict)) {
                return ZVal.assign(script.getObject());
            }

            script.arrayAppend(env)
                    .set(
                            runtimeStaticObject.call(
                                    env,
                                    "log",
                                    runtimeStaticObject.quote(env, "%c%s"),
                                    runtimeStaticObject.quote(env, "font-weight: bold"),
                                    runtimeStaticObject.quote(env, title)));
            for (ZPair zpairResult768 : ZVal.getIterable(dict, env, false)) {
                key = ZVal.assign(zpairResult768.getKey());
                value = ZVal.assign(zpairResult768.getValue());
                value = NamespaceGlobal.json_encode.env(env).call(value).value();
                if (ZVal.isEmpty(value)) {
                    value = runtimeStaticObject.quote(env, "");
                }

                script.arrayAppend(env)
                        .set(
                                runtimeStaticObject.call(
                                        env,
                                        "log",
                                        runtimeStaticObject.quote(env, "%s: %o"),
                                        runtimeStaticObject.quote(env, key),
                                        value));
            }

            return ZVal.assign(script.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "arg")
        private Object quote(RuntimeEnv env, Object... args) {
            Object arg = assignParameter(args, 0, false);
            return ZVal.assign(
                    "\""
                            + toStringR(
                                    NamespaceGlobal.addcslashes
                                            .env(env)
                                            .call(arg, "\"\n\\")
                                            .value(),
                                    env)
                            + "\"");
        }

        @ConvertedMethod
        private Object call(RuntimeEnv env, Object... args) {
            Object ___args = null;
            Object method = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            method = function_array_shift.f.env(env).call(___args).value();
            return ZVal.assign(runtimeStaticObject.call_array(env, method, ___args));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "args", typeHint = "array")
        private Object call_array(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object ___args = assignParameter(args, 1, false);
            return ZVal.assign(
                    "c."
                            + toStringR(method, env)
                            + "("
                            + toStringR(
                                    NamespaceGlobal.implode.env(env).call(", ", ___args).value(),
                                    env)
                            + ");");
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object initialized = false;

        public Object records = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\BrowserConsoleHandler")
                    .setLookup(
                            BrowserConsoleHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "level", "processors")
                    .setStaticPropertyNames("initialized", "records")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/BrowserConsoleHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
