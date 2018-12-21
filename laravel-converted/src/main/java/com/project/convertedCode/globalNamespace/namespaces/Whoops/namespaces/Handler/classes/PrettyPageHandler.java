package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_parents;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_implements;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes.Misc;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.Handler;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.PlainTextHandler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Exception.classes.Formatter;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.VarCloner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.UnexpectedValueException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Util.classes.TemplateHelper;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_extension_loaded;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.AbstractCloner;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Handler/PrettyPageHandler.php

*/

public class PrettyPageHandler extends Handler {

    public Object searchPaths = ZVal.newArray();

    public Object resourceCache = ZVal.newArray();

    public Object customCss = ZVal.getNull();

    public Object extraTables = ZVal.newArray();

    public Object handleUnconditionally = false;

    public Object pageTitle = "Whoops! There was an error.";

    public Object applicationPaths = null;

    public Object blacklist =
            ZVal.newArray(
                    new ZPair("_GET", ZVal.newArray()),
                    new ZPair("_POST", ZVal.newArray()),
                    new ZPair("_FILES", ZVal.newArray()),
                    new ZPair("_COOKIE", ZVal.newArray()),
                    new ZPair("_SESSION", ZVal.newArray()),
                    new ZPair("_SERVER", ZVal.newArray()),
                    new ZPair("_ENV", ZVal.newArray()));

    public Object editor = null;

    public Object editors =
            ZVal.newArray(
                    new ZPair("sublime", "subl://open?url=file://%file&line=%line"),
                    new ZPair("textmate", "txmt://open?url=file://%file&line=%line"),
                    new ZPair("emacs", "emacs://open?url=file://%file&line=%line"),
                    new ZPair("macvim", "mvim://open/?url=file://%file&line=%line"),
                    new ZPair("phpstorm", "phpstorm://open?file=%file&line=%line"),
                    new ZPair("idea", "idea://open?file=%file&line=%line"),
                    new ZPair("vscode", "vscode://file/%file:%line"),
                    new ZPair("atom", "atom://core/open/file?filename=%file&line=%line"));

    public Object templateHelper = null;

    public PrettyPageHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PrettyPageHandler.class) {
            this.__construct(env, args);
        }
    }

    public PrettyPageHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops/Handler")
                        .setFile("/vendor/filp/whoops/src/Whoops/Handler/PrettyPageHandler.php");
        Object cloner = null;
        if (ZVal.toBool(function_ini_get.f.env(env).call("xdebug.file_link_format").value())
                || ZVal.toBool(function_extension_loaded.f.env(env).call("xdebug").value())) {
            new ReferenceClassProperty(this, "editors", env)
                    .arrayAccess(env, "xdebug")
                    .set(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Whoops\\Handler",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "file")
                                @ConvertedParameter(index = 1, name = "line")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object file = assignParameter(args, 0, false);
                                    Object line = assignParameter(args, 1, false);
                                    return ZVal.assign(
                                            function_str_replace
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            ZVal.arrayFromList("%f", "%l"),
                                                            ZVal.newArray(
                                                                    new ZPair(0, file),
                                                                    new ZPair(1, line)),
                                                            function_ini_get
                                                                    .f
                                                                    .env(env)
                                                                    .call("xdebug.file_link_format")
                                                                    .value())
                                                    .value());
                                }
                            });
        }

        new ReferenceClassProperty(this, "searchPaths", env)
                .arrayAppend(env)
                .set(
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/filp/whoops/src/Whoops/Handler"),
                                        env)
                                + "/../Resources");
        this.blacklist(env, "_SERVER", "PHP_AUTH_PW");
        this.templateHelper = new TemplateHelper(env);
        if (function_class_exists
                .f
                .env(env)
                .call("Symfony\\Component\\VarDumper\\Cloner\\VarCloner")
                .getBool()) {
            cloner = new VarCloner(env);
            env.callMethod(
                    cloner,
                    "addCasters",
                    PrettyPageHandler.class,
                    ZVal.newArray(
                            new ZPair(
                                    "*",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Whoops\\Handler",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "obj")
                                        @ConvertedParameter(index = 1, name = "a")
                                        @ConvertedParameter(index = 2, name = "stub")
                                        @ConvertedParameter(index = 3, name = "isNested")
                                        @ConvertedParameter(
                                            index = 4,
                                            name = "filter",
                                            defaultValue = "0",
                                            defaultValueType = "number"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object obj = assignParameter(args, 0, false);
                                            Object a = assignParameter(args, 1, false);
                                            Object stub = assignParameter(args, 2, false);
                                            Object isNested = assignParameter(args, 3, false);
                                            Object filter = assignParameter(args, 4, true);
                                            if (null == filter) {
                                                filter = 0;
                                            }
                                            Object classes = null;
                                            Object _pClass = null;
                                            _pClass =
                                                    ZVal.assign(
                                                            toObjectR(stub)
                                                                    .accessProp(this, env)
                                                                    .name("class")
                                                                    .value());
                                            classes =
                                                    ZVal.add(
                                                            ZVal.add(
                                                                    ZVal.newArray(
                                                                            new ZPair(
                                                                                    _pClass,
                                                                                    _pClass)),
                                                                    function_class_parents
                                                                            .f
                                                                            .env(env)
                                                                            .call(_pClass)
                                                                            .value()),
                                                            function_class_implements
                                                                    .f
                                                                    .env(env)
                                                                    .call(_pClass)
                                                                    .value());
                                            for (ZPair zpairResult46 :
                                                    ZVal.getIterable(classes, env, true)) {
                                                _pClass = ZVal.assign(zpairResult46.getValue());
                                                if (arrayActionR(
                                                        ArrayAction.ISSET,
                                                        env.getRequestStaticPropertiesReference(
                                                                AbstractCloner
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "defaultCasters"),
                                                        env,
                                                        _pClass)) {
                                                    return ZVal.assign(a);
                                                }
                                            }

                                            return ZVal.assign(ZVal.newArray());
                                        }
                                    })));
            env.callMethod(this.templateHelper, "setCloner", PrettyPageHandler.class, cloner);
        }

        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops/Handler")
                        .setFile("/vendor/filp/whoops/src/Whoops/Handler/PrettyPageHandler.php");
        Object zeptoFile = null;
        ReferenceContainer _FILES = new GlobalVariableReference(env, "_FILES");
        ReferenceContainer _COOKIE = new GlobalVariableReference(env, "_COOKIE");
        ReferenceContainer _ENV = new BasicReferenceContainer(null);
        Object cssFile = null;
        Object code = null;
        Object frames = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object inspector = null;
        Object clipboard = null;
        Object prettifyFile = null;
        Object customCssFile = null;
        Object plainTextHandler = null;
        Object jsFile = null;
        Object templateFile = null;
        ReferenceContainer vars = new BasicReferenceContainer(null);
        ReferenceContainer _GET = new GlobalVariableReference(env, "_GET");
        ReferenceContainer _SESSION = new GlobalVariableReference(env, "_SESSION");
        Object extraTables = null;
        ReferenceContainer _POST = new GlobalVariableReference(env, "_POST");
        if (!ZVal.isTrue(this.handleUnconditionally(env))) {
            if (ZVal.strictEqualityCheck("cli", "===", "cli")) {
                if (arrayActionR(ArrayAction.ISSET, _ENV, env, "whoops-test")) {
                    throw ZVal.getException(
                            env,
                            new PHPException(
                                    env,
                                    "Use handleUnconditionally instead of whoops-test"
                                            + " environment variable"));
                }

                return ZVal.assign(Handler.CONST_DONE);
            }
        }

        templateFile = this.getResource(env, "views/layout.html.php");
        cssFile = this.getResource(env, "css/whoops.base.css");
        zeptoFile = this.getResource(env, "js/zepto.min.js");
        prettifyFile = this.getResource(env, "js/prettify.min.js");
        clipboard = this.getResource(env, "js/clipboard.min.js");
        jsFile = this.getResource(env, "js/whoops.base.js");
        if (ZVal.isTrue(this.customCss)) {
            customCssFile = this.getResource(env, this.customCss);
        }

        inspector = env.callMethod(this, "getInspector", PrettyPageHandler.class);
        frames = this.getExceptionFrames(env);
        code = this.getExceptionCode(env);
        vars.setObject(
                ZVal.newArray(
                        new ZPair("page_title", this.getPageTitle(env)),
                        new ZPair(
                                "stylesheet",
                                function_file_get_contents.f.env(env).call(cssFile).value()),
                        new ZPair(
                                "zepto",
                                function_file_get_contents.f.env(env).call(zeptoFile).value()),
                        new ZPair(
                                "prettify",
                                function_file_get_contents.f.env(env).call(prettifyFile).value()),
                        new ZPair(
                                "clipboard",
                                function_file_get_contents.f.env(env).call(clipboard).value()),
                        new ZPair(
                                "javascript",
                                function_file_get_contents.f.env(env).call(jsFile).value()),
                        new ZPair("header", this.getResource(env, "views/header.html.php")),
                        new ZPair(
                                "header_outer",
                                this.getResource(env, "views/header_outer.html.php")),
                        new ZPair("frame_list", this.getResource(env, "views/frame_list.html.php")),
                        new ZPair(
                                "frames_description",
                                this.getResource(env, "views/frames_description.html.php")),
                        new ZPair(
                                "frames_container",
                                this.getResource(env, "views/frames_container.html.php")),
                        new ZPair(
                                "panel_details",
                                this.getResource(env, "views/panel_details.html.php")),
                        new ZPair(
                                "panel_details_outer",
                                this.getResource(env, "views/panel_details_outer.html.php")),
                        new ZPair("panel_left", this.getResource(env, "views/panel_left.html.php")),
                        new ZPair(
                                "panel_left_outer",
                                this.getResource(env, "views/panel_left_outer.html.php")),
                        new ZPair("frame_code", this.getResource(env, "views/frame_code.html.php")),
                        new ZPair(
                                "env_details", this.getResource(env, "views/env_details.html.php")),
                        new ZPair("title", this.getPageTitle(env)),
                        new ZPair(
                                "name",
                                function_explode
                                        .f
                                        .env(env)
                                        .call(
                                                "\\",
                                                env.callMethod(
                                                        inspector,
                                                        "getExceptionName",
                                                        PrettyPageHandler.class))
                                        .value()),
                        new ZPair(
                                "message",
                                env.callMethod(
                                        inspector, "getExceptionMessage", PrettyPageHandler.class)),
                        new ZPair(
                                "docref_url",
                                env.callMethod(
                                        inspector,
                                        "getExceptionDocrefUrl",
                                        PrettyPageHandler.class)),
                        new ZPair("code", code),
                        new ZPair(
                                "plain_exception",
                                Formatter.runtimeStaticObject.formatExceptionPlain(env, inspector)),
                        new ZPair("frames", frames),
                        new ZPair("has_frames", !!function_count.f.env(env).call(frames).getBool()),
                        new ZPair("handler", this),
                        new ZPair(
                                "handlers",
                                env.callMethod(
                                        env.callMethod(this, "getRun", PrettyPageHandler.class),
                                        "getHandlers",
                                        PrettyPageHandler.class)),
                        new ZPair(
                                "active_frames_tab",
                                ZVal.toBool(function_count.f.env(env).call(frames).value())
                                                && ZVal.toBool(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        frames,
                                                                        "offsetGet",
                                                                        PrettyPageHandler.class,
                                                                        0),
                                                                "isApplication",
                                                                PrettyPageHandler.class))
                                        ? "application"
                                        : "all"),
                        new ZPair("has_frames_tabs", this.getApplicationPaths(env)),
                        new ZPair(
                                "tables",
                                ZVal.newArray(
                                        new ZPair(
                                                "GET Data",
                                                this.masked(env, _GET.getObject(), "_GET")),
                                        new ZPair(
                                                "POST Data",
                                                this.masked(env, _POST.getObject(), "_POST")),
                                        new ZPair(
                                                "Files",
                                                ZVal.isset(_FILES.getObject())
                                                        ? this.masked(
                                                                env, _FILES.getObject(), "_FILES")
                                                        : ZVal.newArray()),
                                        new ZPair(
                                                "Cookies",
                                                this.masked(env, _COOKIE.getObject(), "_COOKIE")),
                                        new ZPair(
                                                "Session",
                                                ZVal.isset(_SESSION.getObject())
                                                        ? this.masked(
                                                                env,
                                                                _SESSION.getObject(),
                                                                "_SESSION")
                                                        : ZVal.newArray()),
                                        new ZPair(
                                                "Server/Request Data",
                                                this.masked(env, _SERVER.getObject(), "_SERVER")),
                                        new ZPair(
                                                "Environment Variables",
                                                this.masked(env, _ENV.getObject(), "_ENV"))))));
        if (ZVal.isset(customCssFile)) {
            vars.arrayAccess(env, "stylesheet")
                    .set(
                            toStringR(vars.arrayGet(env, "stylesheet"), env)
                                    + toStringR(
                                            function_file_get_contents
                                                    .f
                                                    .env(env)
                                                    .call(customCssFile)
                                                    .value(),
                                            env));
        }

        extraTables =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Whoops\\Handler",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "table")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object table = assignParameter(args, 0, false);
                                        ReferenceContainer inspector =
                                                new BasicReferenceContainer(null);
                                        inspector =
                                                this.contextReferences.getReferenceContainer(
                                                        "inspector");
                                        return ZVal.assign(
                                                ZVal.isTrue(
                                                                ZVal.checkInstanceType(
                                                                        table,
                                                                        Closure.class,
                                                                        "Closure"))
                                                        ? env.callFunctionDynamic(
                                                                        table,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, inspector),
                                                                        inspector.getObject())
                                                                .value()
                                                        : table);
                                    }
                                }.use("inspector", inspector),
                                this.getDataTables(env))
                        .value();
        vars.arrayAccess(env, "tables")
                .set(
                        function_array_merge
                                .f
                                .env(env)
                                .call(extraTables, vars.arrayGet(env, "tables"))
                                .value());
        plainTextHandler = new PlainTextHandler(env);
        env.callMethod(
                plainTextHandler,
                "setException",
                PrettyPageHandler.class,
                env.callMethod(this, "getException", PrettyPageHandler.class));
        env.callMethod(
                plainTextHandler,
                "setInspector",
                PrettyPageHandler.class,
                env.callMethod(this, "getInspector", PrettyPageHandler.class));
        vars.arrayAccess(env, "preface")
                .set(
                        "<!--\n\n\n"
                                + toStringR(
                                        env.callMethod(
                                                this.templateHelper,
                                                "escape",
                                                PrettyPageHandler.class,
                                                env.callMethod(
                                                        plainTextHandler,
                                                        "generateResponse",
                                                        PrettyPageHandler.class)),
                                        env)
                                + "\n\n\n\n\n\n\n\n\n\n\n-->");
        env.callMethod(
                this.templateHelper, "setVariables", PrettyPageHandler.class, vars.getObject());
        env.callMethod(this.templateHelper, "render", PrettyPageHandler.class, templateFile);
        return ZVal.assign(Handler.CONST_QUIT);
    }

    @ConvertedMethod
    protected Object getExceptionFrames(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object path = null;
        Object frames = null;
        Object frame = null;
        frames =
                env.callMethod(
                        env.callMethod(this, "getInspector", PrettyPageHandler.class),
                        "getFrames",
                        PrettyPageHandler.class);
        if (ZVal.isTrue(this.getApplicationPaths(env))) {
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult47 : ZVal.getIterable(frames, env, true)) {
                frame = ZVal.assign(zpairResult47.getValue());
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult48 :
                        ZVal.getIterable(this.getApplicationPaths(env), env, true)) {
                    path = ZVal.assign(zpairResult48.getValue());
                    if (ZVal.strictEqualityCheck(
                            function_strpos
                                    .f
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    frame, "getFile", PrettyPageHandler.class),
                                            path)
                                    .value(),
                            "===",
                            0)) {
                        env.callMethod(frame, "setApplication", PrettyPageHandler.class, true);
                        break;
                    }
                }
            }
        }

        return ZVal.assign(frames);
    }

    @ConvertedMethod
    protected Object getExceptionCode(RuntimeEnv env, Object... args) {
        Object exception = null;
        Object code = null;
        exception = env.callMethod(this, "getException", PrettyPageHandler.class);
        code = env.callMethod(exception, "getCode", PrettyPageHandler.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(exception, ErrorException.class, "ErrorException"))) {
            code =
                    Misc.runtimeStaticObject.translateErrorCode(
                            env, env.callMethod(exception, "getSeverity", PrettyPageHandler.class));
        }

        return ZVal.assign(toStringR(code, env));
    }

    @ConvertedMethod
    public Object contentType(RuntimeEnv env, Object... args) {
        return "text/html";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "label")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    public Object addDataTable(RuntimeEnv env, Object... args) {
        Object label = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "extraTables", env).arrayAccess(env, label).set(data);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "label")
    @ConvertedParameter(index = 1, name = "callback")
    public Object addDataTableCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/filp/whoops/src/Whoops/Handler")
                        .setFile("/vendor/filp/whoops/src/Whoops/Handler/PrettyPageHandler.php");
        Object label = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        if (!function_is_callable.f.env(env).call(callback).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Expecting callback argument to be callable"));
        }

        new ReferenceClassProperty(this, "extraTables", env)
                .arrayAccess(env, label)
                .set(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Whoops\\Handler",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(
                                index = 0,
                                name = "inspector",
                                typeHint = "Whoops\\Exception\\Inspector",
                                defaultValue = "NULL",
                                defaultValueType = "constant"
                            )
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object inspector = assignParameter(args, 0, true);
                                if (null == inspector) {
                                    inspector = ZVal.getNull();
                                }
                                Object result = null;
                                Object e = null;
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                try {
                                    result =
                                            function_call_user_func
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call(callback, inspector)
                                                    .value();
                                    return ZVal.assign(
                                            ZVal.toBool(
                                                                    function_is_array
                                                                            .f
                                                                            .env(env)
                                                                            .call(result)
                                                                            .value())
                                                            || ZVal.toBool(
                                                                    ZVal.checkInstanceType(
                                                                            result,
                                                                            Traversable.class,
                                                                            "Traversable"))
                                                    ? result
                                                    : ZVal.newArray());
                                } catch (ConvertedException convertedException10) {
                                    if (convertedException10.instanceOf(
                                            PHPException.class, "Exception")) {
                                        e = convertedException10.getObject();
                                        return ZVal.assign(ZVal.newArray());
                                    } else {
                                        throw convertedException10;
                                    }
                                }
                            }
                        }.use("callback", callback));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "label",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getDataTables(RuntimeEnv env, Object... args) {
        Object label = assignParameter(args, 0, true);
        if (null == label) {
            label = ZVal.getNull();
        }
        if (ZVal.strictNotEqualityCheck(label, "!==", ZVal.getNull())) {
            return ZVal.assign(
                    arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "extraTables", env),
                                    env,
                                    label)
                            ? new ReferenceClassProperty(this, "extraTables", env)
                                    .arrayGet(env, label)
                            : ZVal.newArray());
        }

        return ZVal.assign(this.extraTables);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object handleUnconditionally(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (ZVal.equalityCheck(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                0)) {
            return ZVal.assign(this.handleUnconditionally);
        }

        this.handleUnconditionally = ZVal.toBool(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "identifier")
    @ConvertedParameter(index = 1, name = "resolver")
    public Object addEditor(RuntimeEnv env, Object... args) {
        Object identifier = assignParameter(args, 0, false);
        Object resolver = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "editors", env).arrayAccess(env, identifier).set(resolver);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "editor")
    public Object setEditor(RuntimeEnv env, Object... args) {
        Object editor = assignParameter(args, 0, false);
        if (ZVal.toBool(!function_is_callable.f.env(env).call(editor).getBool())
                && ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "editors", env),
                                env,
                                editor))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            toStringR(
                                            "Unknown editor identifier: "
                                                    + toStringR(editor, env)
                                                    + ". Known editors:",
                                            env)
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ",",
                                                            function_array_keys
                                                                    .f
                                                                    .env(env)
                                                                    .call(this.editors)
                                                                    .value())
                                                    .value(),
                                            env)));
        }

        this.editor = editor;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filePath")
    @ConvertedParameter(index = 1, name = "line")
    public Object getEditorHref(RuntimeEnv env, Object... args) {
        Object filePath = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        ReferenceContainer editor = new BasicReferenceContainer(null);
        editor.setObject(this.getEditor(env, filePath, line));
        if (ZVal.isEmpty(editor.getObject())) {
            return ZVal.assign(false);
        }

        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, editor, env, "url"))
                || ZVal.toBool(
                        !function_is_string
                                .f
                                .env(env)
                                .call(editor.arrayGet(env, "url"))
                                .getBool())) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env,
                            toStringR("PrettyPageHandler::getEditorHref", env)
                                    + " should always resolve to a string or a valid editor array; got something else instead."));
        }

        editor.arrayAccess(env, "url")
                .set(
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "%line",
                                        NamespaceGlobal.rawurlencode.env(env).call(line).value(),
                                        editor.arrayGet(env, "url"))
                                .value());
        editor.arrayAccess(env, "url")
                .set(
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "%file",
                                        NamespaceGlobal.rawurlencode
                                                .env(env)
                                                .call(filePath)
                                                .value(),
                                        editor.arrayGet(env, "url"))
                                .value());
        return ZVal.assign(editor.arrayGet(env, "url"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filePath")
    @ConvertedParameter(index = 1, name = "line")
    public Object getEditorAjax(RuntimeEnv env, Object... args) {
        Object filePath = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        ReferenceContainer editor = new BasicReferenceContainer(null);
        editor.setObject(this.getEditor(env, filePath, line));
        if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, editor, env, "ajax"))
                || ZVal.toBool(
                        !function_is_bool
                                .f
                                .env(env)
                                .call(editor.arrayGet(env, "ajax"))
                                .getBool())) {
            throw ZVal.getException(
                    env,
                    new UnexpectedValueException(
                            env,
                            toStringR("PrettyPageHandler::getEditorAjax", env)
                                    + " should always resolve to a bool; got something else instead."));
        }

        return ZVal.assign(editor.arrayGet(env, "ajax"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filePath")
    @ConvertedParameter(index = 1, name = "line")
    protected Object getEditor(RuntimeEnv env, Object... args) {
        Object filePath = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        ReferenceContainer callback = new BasicReferenceContainer(null);
        if (ZVal.toBool(!ZVal.isTrue(this.editor))
                || ZVal.toBool(
                        ZVal.toBool(!function_is_string.f.env(env).call(this.editor).getBool())
                                && ZVal.toBool(
                                        !function_is_callable
                                                .f
                                                .env(env)
                                                .call(this.editor)
                                                .getBool()))) {
            return ZVal.assign(ZVal.newArray());
        }

        if (ZVal.toBool(
                        ZVal.toBool(function_is_string.f.env(env).call(this.editor).value())
                                && ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET,
                                                new ReferenceClassProperty(this, "editors", env),
                                                env,
                                                this.editor)))
                && ZVal.toBool(
                        !function_is_callable
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "editors", env)
                                                .arrayGet(env, this.editor))
                                .getBool())) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("ajax", false),
                            new ZPair(
                                    "url",
                                    new ReferenceClassProperty(this, "editors", env)
                                            .arrayGet(env, this.editor))));
        }

        if (ZVal.toBool(function_is_callable.f.env(env).call(this.editor).value())
                || ZVal.toBool(
                        ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET,
                                                new ReferenceClassProperty(this, "editors", env),
                                                env,
                                                this.editor))
                                && ZVal.toBool(
                                        function_is_callable
                                                .f
                                                .env(env)
                                                .call(
                                                        new ReferenceClassProperty(
                                                                        this, "editors", env)
                                                                .arrayGet(env, this.editor))
                                                .value()))) {
            if (function_is_callable.f.env(env).call(this.editor).getBool()) {
                callback.setObject(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(this.editor, filePath, line)
                                .value());

            } else {
                callback.setObject(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        new ReferenceClassProperty(this, "editors", env)
                                                .arrayGet(env, this.editor),
                                        filePath,
                                        line)
                                .value());
            }

            if (function_is_string.f.env(env).call(callback.getObject()).getBool()) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair("ajax", false), new ZPair("url", callback.getObject())));
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "ajax",
                                    arrayActionR(ArrayAction.ISSET, callback, env, "ajax")
                                            ? callback.arrayGet(env, "ajax")
                                            : false),
                            new ZPair(
                                    "url",
                                    arrayActionR(ArrayAction.ISSET, callback, env, "url")
                                            ? callback.arrayGet(env, "url")
                                            : callback.getObject())));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "title")
    public Object setPageTitle(RuntimeEnv env, Object... args) {
        Object title = assignParameter(args, 0, false);
        this.pageTitle = toStringR(title, env);
        return null;
    }

    @ConvertedMethod
    public Object getPageTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pageTitle);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object addResourcePath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (!function_is_dir.f.env(env).call(path).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "'" + toStringR(path, env) + "' is not a valid directory"));
        }

        function_array_unshift.f.env(env).call(this.searchPaths, path);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object addCustomCss(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.customCss = name;
        return null;
    }

    @ConvertedMethod
    public Object getResourcePaths(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.searchPaths);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    protected Object getResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object fullPath = null;
        Object path = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "resourceCache", env),
                env,
                resource)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "resourceCache", env).arrayGet(env, resource));
        }

        for (ZPair zpairResult49 : ZVal.getIterable(this.searchPaths, env, true)) {
            path = ZVal.assign(zpairResult49.getValue());
            fullPath = toStringR(path, env) + toStringR("/" + toStringR(resource, env), env);
            if (function_is_file.f.env(env).call(fullPath).getBool()) {
                new ReferenceClassProperty(this, "resourceCache", env)
                        .arrayAccess(env, resource)
                        .set(fullPath);
                return ZVal.assign(fullPath);
            }
        }

        throw ZVal.getException(
                env,
                new RuntimeException(
                        env,
                        toStringR(
                                        "Could not find resource '"
                                                + toStringR(resource, env)
                                                + "' in any resource paths.",
                                        env)
                                + "(searched: "
                                + toStringR(
                                        NamespaceGlobal.join
                                                .env(env)
                                                .call(", ", this.searchPaths)
                                                .value(),
                                        env)
                                + ")"));
    }

    @ConvertedMethod
    public Object getResourcesPath(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        Object allPaths = null;
        allPaths = this.getResourcePaths(env);
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = function_end.f.env(env).call(allPaths).value())
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resourcesPath")
    public Object setResourcesPath(RuntimeEnv env, Object... args) {
        Object resourcesPath = assignParameter(args, 0, false);
        this.addResourcePath(env, resourcesPath);
        return null;
    }

    @ConvertedMethod
    public Object getApplicationPaths(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.applicationPaths);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "applicationPaths")
    public Object setApplicationPaths(RuntimeEnv env, Object... args) {
        Object applicationPaths = assignParameter(args, 0, false);
        this.applicationPaths = applicationPaths;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "applicationRootPath")
    public Object setApplicationRootPath(RuntimeEnv env, Object... args) {
        Object applicationRootPath = assignParameter(args, 0, false);
        env.callMethod(
                this.templateHelper,
                "setApplicationRootPath",
                PrettyPageHandler.class,
                applicationRootPath);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "superGlobalName")
    @ConvertedParameter(index = 1, name = "key")
    public Object blacklist(RuntimeEnv env, Object... args) {
        Object superGlobalName = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "blacklist", env)
                .arrayAppend(env, superGlobalName)
                .set(key);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "superGlobal", typeHint = "array")
    @ConvertedParameter(index = 1, name = "superGlobalName")
    private Object masked(RuntimeEnv env, Object... args) {
        ReferenceContainer superGlobal =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object superGlobalName = assignParameter(args, 1, false);
        Object blacklisted = null;
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object key = null;
        blacklisted =
                ZVal.assign(
                        new ReferenceClassProperty(this, "blacklist", env)
                                .arrayGet(env, superGlobalName));
        values.setObject(ZVal.assign(superGlobal.getObject()));
        for (ZPair zpairResult50 : ZVal.getIterable(blacklisted, env, true)) {
            key = ZVal.assign(zpairResult50.getValue());
            if (arrayActionR(ArrayAction.ISSET, superGlobal, env, key)) {
                values.arrayAccess(env, key)
                        .set(
                                function_str_repeat
                                        .f
                                        .env(env)
                                        .call(
                                                "*",
                                                function_strlen
                                                        .f
                                                        .env(env)
                                                        .call(superGlobal.arrayGet(env, key))
                                                        .value())
                                        .value());
            }
        }

        return ZVal.assign(values.getObject());
    }

    public static final Object CONST_class = "Whoops\\Handler\\PrettyPageHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Handler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Whoops\\Handler\\PrettyPageHandler")
                    .setLookup(
                            PrettyPageHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "applicationPaths",
                            "blacklist",
                            "customCss",
                            "editor",
                            "editors",
                            "exception",
                            "extraTables",
                            "handleUnconditionally",
                            "inspector",
                            "pageTitle",
                            "resourceCache",
                            "run",
                            "searchPaths",
                            "templateHelper")
                    .setFilename("vendor/filp/whoops/src/Whoops/Handler/PrettyPageHandler.php")
                    .addInterface("Whoops\\Handler\\HandlerInterface")
                    .addExtendsClass("Whoops\\Handler\\Handler")
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
