package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_length;
import com.runtimeconverter.runtime.nativeFunctions.http.function_header;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_exception_handler;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_exception_handler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.ErrorHandler;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_flush;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FlattenException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.OutOfMemoryException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/debug/ExceptionHandler.php

*/

public class ExceptionHandler extends RuntimeClassBase {

    public Object debug = null;

    public Object charset = null;

    public Object handler = null;

    public Object caughtBuffer = null;

    public Object caughtLength = null;

    public Object fileLinkFormat = null;

    public ExceptionHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionHandler.class) {
            this.__construct(env, args);
        }
    }

    public ExceptionHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "debug",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "charset",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "fileLinkFormat",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object debug = assignParameter(args, 0, true);
        if (null == debug) {
            debug = true;
        }
        Object charset = assignParameter(args, 1, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        Object fileLinkFormat = assignParameter(args, 2, true);
        if (null == fileLinkFormat) {
            fileLinkFormat = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.debug = debug;
        this.charset =
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        ZVal.isTrue(ternaryExpressionTemp = charset)
                                                ? ternaryExpressionTemp
                                                : function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("default_charset")
                                                        .value())
                        ? ternaryExpressionTemp
                        : "UTF-8";
        this.fileLinkFormat = fileLinkFormat;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "handler",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setHandler(RuntimeEnv env, Object... args) {
        Object handler = assignParameter(args, 0, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        Object old = null;
        old = ZVal.assign(this.handler);
        this.handler = handler;
        return ZVal.assign(old);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileLinkFormat")
    public Object setFileLinkFormat(RuntimeEnv env, Object... args) {
        Object fileLinkFormat = assignParameter(args, 0, false);
        Object old = null;
        old = ZVal.assign(this.fileLinkFormat);
        this.fileLinkFormat = fileLinkFormat;
        return ZVal.assign(old);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception", typeHint = "Exception")
    public Object handle(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/debug")
                        .setFile("/vendor/symfony/debug/ExceptionHandler.php");
        Object exception = assignParameter(args, 0, false);
        Object e = null;
        Object caughtLength = null;
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.handler))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                exception,
                                OutOfMemoryException.class,
                                "Symfony\\Component\\Debug\\Exception\\OutOfMemoryException"))) {
            this.sendPhpResponse(env, exception);
            return null;
        }

        caughtLength = ZVal.assign(this.caughtLength = 0);
        function_ob_start
                .f
                .env(env)
                .call(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Symfony\\Component\\Debug",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "buffer")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object buffer = assignParameter(args, 0, false);
                                ExceptionHandler.this.caughtBuffer = buffer;
                                return "";
                            }
                        });
        this.sendPhpResponse(env, exception);
        while (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.caughtBuffer))
                && ZVal.toBool(function_ob_end_flush.f.env(env).call().value())) {}

        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "caughtBuffer", env), env, 0)) {
            function_ob_start
                    .f
                    .env(env)
                    .call(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Symfony\\Component\\Debug",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "buffer")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object _closureThisVar = this.getClosureThisVar();
                                    Object buffer = assignParameter(args, 0, false);
                                    ReferenceContainer cleanBuffer =
                                            new BasicReferenceContainer(null);
                                    if (ZVal.isTrue(ExceptionHandler.this.caughtLength)) {
                                        cleanBuffer.setObject(
                                                NamespaceGlobal.substr_replace
                                                        .env(env)
                                                        .call(
                                                                buffer,
                                                                "",
                                                                0,
                                                                ExceptionHandler.this.caughtLength)
                                                        .value());
                                        if (arrayActionR(ArrayAction.ISSET, cleanBuffer, env, 0)) {
                                            buffer = ZVal.assign(cleanBuffer.getObject());
                                        }
                                    }

                                    return ZVal.assign(buffer);
                                }
                            });
            env.echo(this.caughtBuffer);
            caughtLength = function_ob_get_length.f.env(env).call().value();
        }

        this.caughtBuffer = ZVal.getNull();
        try {
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(this.handler, exception);
            this.caughtLength = caughtLength;
        } catch (ConvertedException convertedException251) {
            if (convertedException251.instanceOf(PHPException.class, "Exception")) {
                e = convertedException251.getObject();
                if (!ZVal.isTrue(caughtLength)) {
                    throw ZVal.getException(env, exception);
                }

            } else {
                throw convertedException251;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object sendPhpResponse(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        Object name = null;
        Object value = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        exception,
                        FlattenException.class,
                        "Symfony\\Component\\Debug\\Exception\\FlattenException"))) {
            exception = FlattenException.runtimeStaticObject.create(env, exception);
        }

        if (!NamespaceGlobal.headers_sent.env(env).call().getBool()) {
            function_header
                    .f
                    .env(env)
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "HTTP/1.0 %s",
                                            env.callMethod(
                                                    exception,
                                                    "getStatusCode",
                                                    ExceptionHandler.class))
                                    .value());
            for (ZPair zpairResult1783 :
                    ZVal.getIterable(
                            env.callMethod(exception, "getHeaders", ExceptionHandler.class),
                            env,
                            false)) {
                name = ZVal.assign(zpairResult1783.getKey());
                value = ZVal.assign(zpairResult1783.getValue());
                function_header
                        .f
                        .env(env)
                        .call(toStringR(name, env) + ": " + toStringR(value, env), false);
            }

            function_header
                    .f
                    .env(env)
                    .call("Content-Type: text/html; charset=" + toStringR(this.charset, env));
        }

        env.echo(
                this.decorate(
                        env, this.getContent(env, exception), this.getStylesheet(env, exception)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object getHtml(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        exception,
                        FlattenException.class,
                        "Symfony\\Component\\Debug\\Exception\\FlattenException"))) {
            exception = FlattenException.runtimeStaticObject.create(env, exception);
        }

        return ZVal.assign(
                this.decorate(
                        env, this.getContent(env, exception), this.getStylesheet(env, exception)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exception",
        typeHint = "Symfony\\Component\\Debug\\Exception\\FlattenException"
    )
    public Object getContent(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object exception = assignParameter(args, 0, false);
        ReferenceContainer e = new BasicReferenceContainer(null);
        Object count = null;
        Object title = null;
        Object message = null;
        Object content = null;
        Object total = null;
        ReferenceContainer trace = new BasicReferenceContainer(null);
        Object position = null;
        Object _pClass = null;
        Object ind = null;
        Object symfonyGhostImageContents = null;
        SwitchEnumType116 switchVariable116 =
                ZVal.getEnum(
                        env.callMethod(exception, "getStatusCode", ExceptionHandler.class),
                        SwitchEnumType116.DEFAULT_CASE,
                        SwitchEnumType116.INTEGER_404,
                        404);
        switch (switchVariable116) {
            case INTEGER_404:
                title = "Sorry, the page you are looking for could not be found.";
                break;
            case DEFAULT_CASE:
                title = "Whoops, looks like something went wrong.";
        }
        ;
        content = "";
        if (ZVal.isTrue(this.debug)) {
            try {
                count =
                        function_count
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                exception,
                                                "getAllPrevious",
                                                ExceptionHandler.class))
                                .value();
                total = ZVal.add(count, 1);
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult1784 :
                        ZVal.getIterable(
                                env.callMethod(exception, "toArray", ExceptionHandler.class),
                                env,
                                false)) {
                    position = ZVal.assign(zpairResult1784.getKey());
                    e.setObject(ZVal.assign(zpairResult1784.getValue()));
                    ind = ZVal.add(ZVal.subtract(count, position), 1);
                    _pClass = this.formatClass(env, e.arrayGet(env, "class"));
                    message =
                            NamespaceGlobal.nl2br
                                    .env(env)
                                    .call(this.escapeHtml(env, e.arrayGet(env, "message")))
                                    .value();
                    content =
                            toStringR(content, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "                        <div class=\"trace trace-as-html\">\n                            <table class=\"trace-details\">\n                                <thead class=\"trace-head\"><tr><th>\n                                    <h3 class=\"trace-class\">\n                                        <span class=\"text-muted\">(%d/%d)</span>\n                                        <span class=\"exception_title\">%s</span>\n                                    </h3>\n                                    <p class=\"break-long-words trace-message\">%s</p>\n                                </th></tr></thead>\n                                <tbody>",
                                                            ind, total, _pClass, message)
                                                    .value(),
                                            env);
                    runtimeConverterBreakCount = 0;
                    for (ZPair zpairResult1785 :
                            ZVal.getIterable(e.arrayGet(env, "trace"), env, true)) {
                        trace.setObject(ZVal.assign(zpairResult1785.getValue()));
                        content = toStringR(content, env) + "<tr><td>";
                        if (ZVal.isTrue(trace.arrayGet(env, "function"))) {
                            content =
                                    toStringR(content, env)
                                            + toStringR(
                                                    function_sprintf
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "at <span class=\"trace-class\">%s</span><span class=\"trace-type\">%s</span><span class=\"trace-method\">%s</span>(<span class=\"trace-arguments\">%s</span>)",
                                                                    this.formatClass(
                                                                            env,
                                                                            trace.arrayGet(
                                                                                    env, "class")),
                                                                    trace.arrayGet(env, "type"),
                                                                    trace.arrayGet(env, "function"),
                                                                    this.formatArgs(
                                                                            env,
                                                                            trace.arrayGet(
                                                                                    env, "args")))
                                                            .value(),
                                                    env);
                        }

                        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, trace, env, "file"))
                                && ZVal.toBool(
                                        arrayActionR(ArrayAction.ISSET, trace, env, "line"))) {
                            content =
                                    toStringR(content, env)
                                            + toStringR(
                                                    this.formatPath(
                                                            env,
                                                            trace.arrayGet(env, "file"),
                                                            trace.arrayGet(env, "line")),
                                                    env);
                        }

                        content = toStringR(content, env) + "</td></tr>\n";
                    }

                    content = toStringR(content, env) + "</tbody>\n</table>\n</div>\n";
                }

            } catch (ConvertedException convertedException252) {
                if (convertedException252.instanceOf(PHPException.class, "Exception")) {
                    e.setObject(convertedException252.getObject());
                    if (ZVal.isTrue(this.debug)) {
                        title =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Exception thrown when handling an exception (%s: %s)",
                                                function_get_class
                                                        .f
                                                        .env(env)
                                                        .call(e.getObject())
                                                        .value(),
                                                this.escapeHtml(
                                                        env,
                                                        env.callMethod(
                                                                e.getObject(),
                                                                "getMessage",
                                                                ExceptionHandler.class)))
                                        .value();

                    } else {
                        title = "Whoops, looks like something went wrong.";
                    }

                } else {
                    throw convertedException252;
                }
            }
        }

        symfonyGhostImageContents = this.getSymfonyGhostAsSvg(env);
        return ZVal.assign(
                "            <div class=\"exception-summary\">\n                <div class=\"container\">\n                    <div class=\"exception-message-wrapper\">\n                        <h1 class=\"break-long-words exception-message\">"
                        + toStringR(title, env)
                        + "</h1>\n                        <div class=\"exception-illustration hidden-xs-down\">"
                        + toStringR(symfonyGhostImageContents, env)
                        + "</div>\n                    </div>\n                </div>\n            </div>\n\n            <div class=\"container\">\n                "
                        + toStringR(content, env)
                        + "\n            </div>");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "exception",
        typeHint = "Symfony\\Component\\Debug\\Exception\\FlattenException"
    )
    public Object getStylesheet(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        return ZVal.getResourceAsString("stringLiterals/stringLiteral3138.txt");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(index = 1, name = "css")
    private Object decorate(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object css = assignParameter(args, 1, false);
        return ZVal.assign(
                "<!DOCTYPE html>\n<html>\n    <head>\n        <meta charset=\""
                        + toStringR(this.charset, env)
                        + "\" />\n        <meta name=\"robots\" content=\"noindex,nofollow\" />\n        <style>"
                        + toStringR(css, env)
                        + "</style>\n    </head>\n    <body>\n        "
                        + toStringR(content, env)
                        + "\n    </body>\n</html>");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    private Object formatClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object parts = null;
        parts = function_explode.f.env(env).call("\\", _pClass).value();
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<abbr title=\"%s\">%s</abbr>",
                                _pClass, function_array_pop.f.env(env).call(parts).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "line")
    private Object formatPath(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object path = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        ReferenceContainer file = new BasicReferenceContainer(null);
        Object f = null;
        Object link = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object k = null;
        ReferenceContainer fmt = new BasicReferenceContainer(null);
        file.setObject(
                this.escapeHtml(
                        env,
                        function_preg_match
                                        .f
                                        .env(env)
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(2, file))
                                        .call("#[^/\\\\]*+$#", path, file.getObject())
                                        .getBool()
                                ? file.arrayGet(env, 0)
                                : path));
        fmt.setObject(
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                ZVal.isTrue(
                                                                ternaryExpressionTemp =
                                                                        this.fileLinkFormat)
                                                        ? ternaryExpressionTemp
                                                        : function_ini_get
                                                                .f
                                                                .env(env)
                                                                .call("xdebug.file_link_format")
                                                                .value())
                                ? ternaryExpressionTemp
                                : NamespaceGlobal.get_cfg_var
                                        .env(env)
                                        .call("xdebug.file_link_format")
                                        .value()));
        if (!ZVal.isTrue(fmt.getObject())) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<span class=\"block trace-file-path\">in <a title=\"%s%3$s\"><strong>%s</strong>%s</a></span>",
                                    this.escapeHtml(env, path),
                                    file.getObject(),
                                    ZVal.isLessThan(0, '<', line)
                                            ? " line " + toStringR(line, env)
                                            : "")
                            .value());
        }

        if (function_is_string.f.env(env).call(fmt.getObject()).getBool()) {
            i.setObject(
                    ZVal.assign(
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    f =
                                                                            ZVal.assign(
                                                                                    fmt
                                                                                            .getObject()),
                                                                    "&",
                                                                    NamespaceGlobal.max
                                                                            .env(env)
                                                                            .call(
                                                                                    NamespaceGlobal
                                                                                            .strrpos
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    f,
                                                                                                    "%f")
                                                                                            .value(),
                                                                                    NamespaceGlobal
                                                                                            .strrpos
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    f,
                                                                                                    "%l")
                                                                                            .value())
                                                                            .value())
                                                            .value())
                                    ? ternaryExpressionTemp
                                    : function_strlen.f.env(env).call(f).value()));
            fmt.setObject(
                    ZVal.add(
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(f, 0, i.getObject())
                                                    .value())),
                            NamespaceGlobal.preg_split
                                    .env(env)
                                    .call(
                                            "/&([^>]++)>/",
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(f, i.getObject())
                                                    .value(),
                                            -1,
                                            2)
                                    .value()));
            runtimeConverterBreakCount = 0;
            for (i.setObject(1);
                    arrayActionR(ArrayAction.ISSET, fmt, env, i.getObject());
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.strictEqualityCheck(
                        0,
                        "===",
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        path,
                                        k = ZVal.assign(fmt.arrayGet(env, ZVal.postIncrement(i))))
                                .value())) {
                    path =
                            NamespaceGlobal.substr_replace
                                    .env(env)
                                    .call(
                                            path,
                                            fmt.arrayGet(env, i.getObject()),
                                            0,
                                            function_strlen.f.env(env).call(k).value())
                                    .value();
                    break;
                }
            }

            link =
                    NamespaceGlobal.strtr
                            .env(env)
                            .call(
                                    fmt.arrayGet(env, 0),
                                    ZVal.newArray(new ZPair("%f", path), new ZPair("%l", line)))
                            .value();

        } else {
            link = env.callMethod(fmt.getObject(), "format", ExceptionHandler.class, path, line);
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<span class=\"block trace-file-path\">in <a href=\"%s\" title=\"Go to source\"><strong>%s</string>%s</a></span>",
                                this.escapeHtml(env, link),
                                file.getObject(),
                                ZVal.isLessThan(0, '<', line)
                                        ? " line " + toStringR(line, env)
                                        : "")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    private Object formatArgs(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer item = new BasicReferenceContainer(null);
        Object formattedValue = null;
        Object key = null;
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult1786 : ZVal.getIterable(___args, env, false)) {
            key = ZVal.assign(zpairResult1786.getKey());
            item.setObject(ZVal.assign(zpairResult1786.getValue()));
            if (ZVal.strictEqualityCheck("object", "===", item.arrayGet(env, 0))) {
                formattedValue =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<em>object</em>(%s)",
                                        this.formatClass(env, item.arrayGet(env, 1)))
                                .value();

            } else if (ZVal.strictEqualityCheck("array", "===", item.arrayGet(env, 0))) {
                formattedValue =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<em>array</em>(%s)",
                                        function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(item.arrayGet(env, 1))
                                                        .getBool()
                                                ? this.formatArgs(env, item.arrayGet(env, 1))
                                                : item.arrayGet(env, 1))
                                .value();

            } else if (ZVal.strictEqualityCheck("null", "===", item.arrayGet(env, 0))) {
                formattedValue = "<em>null</em>";

            } else if (ZVal.strictEqualityCheck("boolean", "===", item.arrayGet(env, 0))) {
                formattedValue =
                        "<em>"
                                + toStringR(
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(
                                                        NamespaceGlobal.var_export
                                                                .env(env)
                                                                .call(item.arrayGet(env, 1), true)
                                                                .value())
                                                .value(),
                                        env)
                                + "</em>";

            } else if (ZVal.strictEqualityCheck("resource", "===", item.arrayGet(env, 0))) {
                formattedValue = "<em>resource</em>";

            } else {
                formattedValue =
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "\n",
                                        "",
                                        this.escapeHtml(
                                                env,
                                                NamespaceGlobal.var_export
                                                        .env(env)
                                                        .call(item.arrayGet(env, 1), true)
                                                        .value()))
                                .value();
            }

            result.arrayAppend(env)
                    .set(
                            function_is_int.f.env(env).call(key).getBool()
                                    ? formattedValue
                                    : function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "'%s' => %s",
                                                    this.escapeHtml(env, key), formattedValue)
                                            .value());
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(", ", result.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    private Object escapeHtml(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.htmlspecialchars
                        .env(env)
                        .call(str, ZVal.toLong(2) | ZVal.toLong(8), this.charset)
                        .value());
    }

    @ConvertedMethod
    private Object getSymfonyGhostAsSvg(RuntimeEnv env, Object... args) {
        return ZVal.getResourceAsString("stringLiterals/stringLiteral3139.txt");
    }

    public static final Object CONST_class = "Symfony\\Component\\Debug\\ExceptionHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "debug",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "charset",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "fileLinkFormat",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object register(RuntimeEnv env, Object... args) {
            Object debug = assignParameter(args, 0, true);
            if (null == debug) {
                debug = true;
            }
            Object charset = assignParameter(args, 1, true);
            if (null == charset) {
                charset = ZVal.getNull();
            }
            Object fileLinkFormat = assignParameter(args, 2, true);
            if (null == fileLinkFormat) {
                fileLinkFormat = ZVal.getNull();
            }
            Object handler = null;
            ReferenceContainer prev = new BasicReferenceContainer(null);
            handler = env.createNewWithLateStaticBindings(this, debug, charset, fileLinkFormat);
            prev.setObject(
                    function_set_exception_handler
                            .f
                            .env(env)
                            .call(ZVal.newArray(new ZPair(0, handler), new ZPair(1, "handle")))
                            .value());
            if (ZVal.toBool(function_is_array.f.env(env).call(prev.getObject()).value())
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    prev.arrayGet(env, 0),
                                    ErrorHandler.class,
                                    "Symfony\\Component\\Debug\\ErrorHandler"))) {
                function_restore_exception_handler.f.env(env).call();
                env.callMethod(
                        prev.arrayGet(env, 0),
                        "setExceptionHandler",
                        ExceptionHandler.class,
                        ZVal.newArray(new ZPair(0, handler), new ZPair(1, "handle")));
            }

            return ZVal.assign(handler);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Debug\\ExceptionHandler")
                    .setLookup(
                            ExceptionHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "caughtBuffer",
                            "caughtLength",
                            "charset",
                            "debug",
                            "fileLinkFormat",
                            "handler")
                    .setFilename("vendor/symfony/debug/ExceptionHandler.php")
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

    private enum SwitchEnumType116 {
        INTEGER_404,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
