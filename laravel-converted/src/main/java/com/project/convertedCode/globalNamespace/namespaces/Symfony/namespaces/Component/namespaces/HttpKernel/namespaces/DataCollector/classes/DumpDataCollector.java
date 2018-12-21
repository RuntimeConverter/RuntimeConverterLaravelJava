package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.CliDumper;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.VarCloner;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.HtmlDumper;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.namespaces.ContextProvider.classes.SourceContextProvider;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Server.classes.Connection;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.DataDumperInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/DumpDataCollector.php

*/

public class DumpDataCollector extends DataCollector implements DataDumperInterface {

    public Object stopwatch = null;

    public Object fileLinkFormat = null;

    public Object dataCount = 0;

    public Object isCollected = true;

    public Object clonesCount = 0;

    public Object clonesIndex = 0;

    public Object rootRefs = null;

    public Object charset = null;

    public Object requestStack = null;

    public Object dumper = null;

    public Object sourceContextProvider = null;

    public DumpDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DumpDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public DumpDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "stopwatch",
        typeHint = "Symfony\\Component\\Stopwatch\\Stopwatch",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "fileLinkFormat",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "charset",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "requestStack",
        typeHint = "Symfony\\Component\\HttpFoundation\\RequestStack",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "dumper",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object stopwatch = assignParameter(args, 0, true);
        if (null == stopwatch) {
            stopwatch = ZVal.getNull();
        }
        Object fileLinkFormat = assignParameter(args, 1, true);
        if (null == fileLinkFormat) {
            fileLinkFormat = ZVal.getNull();
        }
        Object charset = assignParameter(args, 2, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        Object requestStack = assignParameter(args, 3, true);
        if (null == requestStack) {
            requestStack = ZVal.getNull();
        }
        Object dumper = assignParameter(args, 4, true);
        if (null == dumper) {
            dumper = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.stopwatch = stopwatch;
        this.fileLinkFormat =
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        ZVal.isTrue(ternaryExpressionTemp = fileLinkFormat)
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
                                .value();
        this.charset =
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        ZVal.isTrue(
                                                        ternaryExpressionTemp =
                                                                ZVal.isTrue(
                                                                                ternaryExpressionTemp =
                                                                                        charset)
                                                                        ? ternaryExpressionTemp
                                                                        : function_ini_get
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        "php.output_encoding")
                                                                                .value())
                                                ? ternaryExpressionTemp
                                                : function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("default_charset")
                                                        .value())
                        ? ternaryExpressionTemp
                        : "UTF-8";
        this.requestStack = requestStack;
        this.dumper = dumper;
        this.rootRefs =
                ZVal.newArray(
                        new ZPair(0, toObjectR(this).accessProp(this, env).name("data").value()),
                        new ZPair(1, this.dataCount),
                        new ZPair(2, this.isCollected),
                        new ZPair(3, this.clonesCount));
        this.sourceContextProvider =
                ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                dumper,
                                                Connection.class,
                                                "Symfony\\Component\\VarDumper\\Server\\Connection"))
                                && ZVal.toBool(
                                        arrayActionR(
                                                ArrayAction.ISSET,
                                                handleReturnReference(
                                                        env.callMethod(
                                                                dumper,
                                                                "getContextProviders",
                                                                DumpDataCollector.class)),
                                                env,
                                                "source"))
                        ? handleReturnReference(
                                        env.callMethod(
                                                dumper,
                                                "getContextProviders",
                                                DumpDataCollector.class))
                                .arrayGet(env, "source")
                        : new SourceContextProvider(env, this.charset);
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.clonesIndex = ZVal.preIncrement(new ReferenceClassProperty(this, "clonesCount", env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
    )
    public Object dump(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope177 scope = new Scope177();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/http-kernel/DataCollector")
                            .setFile(
                                    "/vendor/symfony/http-kernel/DataCollector/DumpDataCollector.php");
            scope.data = assignParameter(args, 0, false);
            scope.file = null;
            scope.line = null;
            scope.name = null;
            scope.runtimeTempArrayResult194 = null;
            scope.fileExcerpt = null;
            if (ZVal.isTrue(this.stopwatch)) {
                env.callMethod(this.stopwatch, "start", DumpDataCollector.class, "dump");
            }

            ZVal.list(
                    scope.runtimeTempArrayResult194 =
                            env.callMethod(
                                    this.sourceContextProvider,
                                    "getContext",
                                    DumpDataCollector.class),
                    (scope.name = listGet(scope.runtimeTempArrayResult194, 0, env)),
                    (scope.file = listGet(scope.runtimeTempArrayResult194, 1, env)),
                    (scope.line = listGet(scope.runtimeTempArrayResult194, 2, env)),
                    (scope.fileExcerpt = listGet(scope.runtimeTempArrayResult194, 3, env)));
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this.dumper,
                            Connection.class,
                            "Symfony\\Component\\VarDumper\\Server\\Connection"))) {
                if (!ZVal.isTrue(
                        env.callMethod(
                                this.dumper, "write", DumpDataCollector.class, scope.data))) {
                    this.isCollected = false;
                }

            } else if (ZVal.isTrue(this.dumper)) {
                this.doDump(env, this.dumper, scope.data, scope.name, scope.file, scope.line);

            } else {
                this.isCollected = false;
            }

            new ReferenceClassProperty(scope._thisVarAlias, "data", env)
                    .arrayAppend(env)
                    .set(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "data", "name", "file", "line", "fileExcerpt")
                                    .value());
            this.dataCount = ZVal.increment(this.dataCount);
            if (ZVal.isTrue(this.stopwatch)) {
                env.callMethod(this.stopwatch, "stop", DumpDataCollector.class, "dump");
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
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
        Object dumper = null;
        ReferenceContainer dump = new BasicReferenceContainer(null);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(this.dumper)
                                                || ZVal.toBool(
                                                        ZVal.toBool(this.requestStack)
                                                                && ZVal.toBool(
                                                                        ZVal.strictNotEqualityCheck(
                                                                                env.callMethod(
                                                                                        this
                                                                                                .requestStack,
                                                                                        "getMasterRequest",
                                                                                        DumpDataCollector
                                                                                                .class),
                                                                                "!==",
                                                                                request))))
                                || ZVal.toBool(
                                        env.callMethod(
                                                request,
                                                "isXmlHttpRequest",
                                                DumpDataCollector.class)))
                || ZVal.toBool(
                        env.callMethod(
                                toObjectR(request).accessProp(this, env).name("headers").value(),
                                "has",
                                DumpDataCollector.class,
                                "Origin"))) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.toBool(
                                                                                        !ZVal
                                                                                                .isTrue(
                                                                                                        this
                                                                                                                .requestStack))
                                                                                || ZVal.toBool(
                                                                                        !ZVal
                                                                                                .isTrue(
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        toObjectR(
                                                                                                                                        response)
                                                                                                                                .accessProp(
                                                                                                                                        this,
                                                                                                                                        env)
                                                                                                                                .name(
                                                                                                                                        "headers")
                                                                                                                                .value(),
                                                                                                                        "has",
                                                                                                                        DumpDataCollector
                                                                                                                                .class,
                                                                                                                        "X-Debug-Token"))))
                                                                || ZVal.toBool(
                                                                        env.callMethod(
                                                                                response,
                                                                                "isRedirection",
                                                                                DumpDataCollector
                                                                                        .class)))
                                                || ZVal.toBool(
                                                        ZVal.toBool(
                                                                        env.callMethod(
                                                                                toObjectR(response)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "headers")
                                                                                        .value(),
                                                                                "has",
                                                                                DumpDataCollector
                                                                                        .class,
                                                                                "Content-Type"))
                                                                && ZVal.toBool(
                                                                        ZVal.strictEqualityCheck(
                                                                                false,
                                                                                "===",
                                                                                function_strpos
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                toObjectR(
                                                                                                                                response)
                                                                                                                        .accessProp(
                                                                                                                                this,
                                                                                                                                env)
                                                                                                                        .name(
                                                                                                                                "headers")
                                                                                                                        .value(),
                                                                                                                "get",
                                                                                                                DumpDataCollector
                                                                                                                        .class,
                                                                                                                "Content-Type"),
                                                                                                "html")
                                                                                        .value()))))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                "html",
                                                "!==",
                                                env.callMethod(
                                                        request,
                                                        "getRequestFormat",
                                                        DumpDataCollector.class))))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                false,
                                "===",
                                NamespaceGlobal.strripos
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        response,
                                                        "getContent",
                                                        DumpDataCollector.class),
                                                "</body>")
                                        .value()))) {
            if (ZVal.toBool(
                            env.callMethod(
                                    toObjectR(response)
                                            .accessProp(this, env)
                                            .name("headers")
                                            .value(),
                                    "has",
                                    DumpDataCollector.class,
                                    "Content-Type"))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            toObjectR(response)
                                                                    .accessProp(this, env)
                                                                    .name("headers")
                                                                    .value(),
                                                            "get",
                                                            DumpDataCollector.class,
                                                            "Content-Type"),
                                                    "html")
                                            .value()))) {
                dumper = new HtmlDumper(env, "php://output", this.charset);
                env.callMethod(
                        dumper,
                        "setDisplayOptions",
                        DumpDataCollector.class,
                        ZVal.newArray(new ZPair("fileLinkFormat", this.fileLinkFormat)));

            } else {
                dumper = new CliDumper(env, "php://output", this.charset);
            }

            for (ZPair zpairResult1912 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("data").value(),
                            env,
                            true)) {
                dump.setObject(ZVal.assign(zpairResult1912.getValue()));
                this.doDump(
                        env,
                        dumper,
                        dump.arrayGet(env, "data"),
                        dump.arrayGet(env, "name"),
                        dump.arrayGet(env, "file"),
                        dump.arrayGet(env, "line"));
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.stopwatch)) {
            env.callMethod(this.stopwatch, "reset", DumpDataCollector.class);
        }

        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        this.dataCount = 0;
        this.isCollected = true;
        this.clonesCount = 0;
        this.clonesIndex = 0;
        return null;
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        Object ser = null;
        if (ZVal.strictNotEqualityCheck(this.clonesCount, "!==", this.clonesIndex)) {
            return "a:0:{}";
        }

        new ReferenceClassProperty(this, "data", env).arrayAppend(env).set(this.fileLinkFormat);
        new ReferenceClassProperty(this, "data", env).arrayAppend(env).set(this.charset);
        ser =
                function_serialize
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("data").value())
                        .value();
        toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
        this.dataCount = 0;
        this.isCollected = true;
        return ZVal.assign(ser);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object charset = null;
        Object fileLinkFormat = null;
        super.unserialize(env, data);
        charset =
                function_array_pop
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("data").value())
                        .value();
        fileLinkFormat =
                function_array_pop
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("data").value())
                        .value();
        this.dataCount =
                function_count
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("data").value())
                        .value();
        this.__construct(env, this.stopwatch, fileLinkFormat, charset);
        return null;
    }

    @ConvertedMethod
    public Object getDumpsCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dataCount);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(index = 1, name = "maxDepthLimit")
    @ConvertedParameter(index = 2, name = "maxItemsPerDepth")
    public Object getDumps(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object maxDepthLimit = assignParameter(args, 1, true);
        if (null == maxDepthLimit) {
            maxDepthLimit = -1;
        }
        Object maxItemsPerDepth = assignParameter(args, 2, true);
        if (null == maxItemsPerDepth) {
            maxItemsPerDepth = -1;
        }
        Object data = null;
        ReferenceContainer dumps = new BasicReferenceContainer(null);
        Object dumper = null;
        ReferenceContainer dump = new BasicReferenceContainer(null);
        data = function_fopen.f.env(env).call("php://memory", "r+b").value();
        if (ZVal.strictEqualityCheck("html", "===", format)) {
            dumper = new HtmlDumper(env, data, this.charset);
            env.callMethod(
                    dumper,
                    "setDisplayOptions",
                    DumpDataCollector.class,
                    ZVal.newArray(new ZPair("fileLinkFormat", this.fileLinkFormat)));

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Invalid dump format: %s", format)
                                    .value()));
        }

        dumps.setObject(ZVal.newArray());
        for (ZPair zpairResult1913 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("data").value(), env, true)) {
            dump.setObject(ZVal.assign(zpairResult1913.getValue()));
            env.callMethod(
                    dumper,
                    "dump",
                    DumpDataCollector.class,
                    env.callMethod(
                            env.callMethod(
                                    dump.arrayGet(env, "data"),
                                    "withMaxDepth",
                                    DumpDataCollector.class,
                                    maxDepthLimit),
                            "withMaxItemsPerDepth",
                            DumpDataCollector.class,
                            maxItemsPerDepth));
            dump.arrayAccess(env, "data")
                    .set(NamespaceGlobal.stream_get_contents.env(env).call(data, -1, 0).value());
            NamespaceGlobal.ftruncate.env(env).call(data, 0);
            NamespaceGlobal.rewind.env(env).call(data);
            dumps.arrayAppend(env).set(dump.getObject());
        }

        return ZVal.assign(dumps.getObject());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "dump";
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        ReferenceContainer h = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object dumper = null;
        ReferenceContainer dump = new BasicReferenceContainer(null);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                0,
                                                "===",
                                                ZVal.postDecrement(
                                                        new ReferenceClassProperty(
                                                                this, "clonesCount", env))))
                                && ZVal.toBool(!ZVal.isTrue(this.isCollected)))
                && ZVal.toBool(toObjectR(this).accessProp(this, env).name("data").value())) {
            this.clonesCount = 0;
            this.isCollected = true;
            h.setObject(NamespaceGlobal.headers_list.env(env).call().value());
            i.setObject(function_count.f.env(env).call(h.getObject()).value());
            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            h.getObject(),
                            "Content-Type: "
                                    + toStringR(
                                            function_ini_get
                                                    .f
                                                    .env(env)
                                                    .call("default_mimetype")
                                                    .value(),
                                            env));
            while (ZVal.strictNotEqualityCheck(
                    0,
                    "!==",
                    function_stripos
                            .f
                            .env(env)
                            .call(h.arrayGet(env, i.getObject()), "Content-Type:")
                            .value())) {
                i.setObject(ZVal.decrement(i.getObject()));
            }

            if (ZVal.toBool(
                            !function_in_array
                                    .f
                                    .env(env)
                                    .call("cli", ZVal.arrayFromList("cli", "phpdbg"), true)
                                    .getBool())
                    && ZVal.toBool(
                            function_stripos
                                    .f
                                    .env(env)
                                    .call(h.arrayGet(env, i.getObject()), "html")
                                    .value())) {
                dumper = new HtmlDumper(env, "php://output", this.charset);
                env.callMethod(
                        dumper,
                        "setDisplayOptions",
                        DumpDataCollector.class,
                        ZVal.newArray(new ZPair("fileLinkFormat", this.fileLinkFormat)));

            } else {
                dumper = new CliDumper(env, "php://output", this.charset);
            }

            for (ZPair zpairResult1914 :
                    ZVal.getIterable(
                            toObjectR(this).accessProp(this, env).name("data").value(),
                            env,
                            false)) {
                i.setObject(ZVal.assign(zpairResult1914.getKey()));
                dump.setObject(ZVal.assign(zpairResult1914.getValue()));
                new ReferenceClassProperty(this, "data", env)
                        .arrayAccess(env, i.getObject())
                        .set(ZVal.getNull());
                this.doDump(
                        env,
                        dumper,
                        dump.arrayGet(env, "data"),
                        dump.arrayGet(env, "name"),
                        dump.arrayGet(env, "file"),
                        dump.arrayGet(env, "line"));
            }

            toObjectR(this).accessProp(this, env).name("data").set(ZVal.newArray());
            this.dataCount = 0;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dumper",
        typeHint = "Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface"
    )
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(index = 2, name = "name")
    @ConvertedParameter(index = 3, name = "file")
    @ConvertedParameter(index = 4, name = "line")
    private Object doDump(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/DataCollector")
                        .setFile("/vendor/symfony/http-kernel/DataCollector/DumpDataCollector.php");
        Object dumper = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 2, false));
        ReferenceContainer file = new BasicReferenceContainer(assignParameter(args, 3, false));
        ReferenceContainer line = new BasicReferenceContainer(assignParameter(args, 4, false));
        Object cloner = null;
        Object contextDumper = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        dumper,
                        CliDumper.class,
                        "Symfony\\Component\\VarDumper\\Dumper\\CliDumper"))) {
            contextDumper =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\HttpKernel\\DataCollector",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "name")
                        @ConvertedParameter(index = 1, name = "file")
                        @ConvertedParameter(index = 2, name = "line")
                        @ConvertedParameter(index = 3, name = "fmt")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object _closureThisVar = this.getClosureThisVar();
                            Object name = assignParameter(args, 0, false);
                            Object file = assignParameter(args, 1, false);
                            Object line = assignParameter(args, 2, false);
                            Object fmt = assignParameter(args, 3, false);
                            Object s = null;
                            Object f = null;
                            Object link = null;
                            if (ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            _closureThisVar,
                                            HtmlDumper.class,
                                            "Symfony\\Component\\VarDumper\\Dumper\\HtmlDumper"))) {
                                if (ZVal.isTrue(file)) {
                                    s =
                                            env.callMethod(
                                                    _closureThisVar,
                                                    "style",
                                                    DumpDataCollector.class,
                                                    "meta",
                                                    "%s");
                                    f =
                                            NamespaceGlobal.strip_tags
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    _closureThisVar,
                                                                    "style",
                                                                    DumpDataCollector.class,
                                                                    "",
                                                                    file))
                                                    .value();
                                    name =
                                            NamespaceGlobal.strip_tags
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    _closureThisVar,
                                                                    "style",
                                                                    DumpDataCollector.class,
                                                                    "",
                                                                    name))
                                                    .value();
                                    if (ZVal.toBool(fmt)
                                            && ZVal.toBool(
                                                    link =
                                                            ZVal.assign(
                                                                    function_is_string
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(fmt)
                                                                                    .getBool()
                                                                            ? NamespaceGlobal.strtr
                                                                                    .env(env)
                                                                                    .call(
                                                                                            fmt,
                                                                                            ZVal
                                                                                                    .newArray(
                                                                                                            new ZPair(
                                                                                                                    "%f",
                                                                                                                    file),
                                                                                                            new ZPair(
                                                                                                                    "%l",
                                                                                                                    line)))
                                                                                    .value()
                                                                            : env.callMethod(
                                                                                    fmt,
                                                                                    "format",
                                                                                    DumpDataCollector
                                                                                            .class,
                                                                                    file,
                                                                                    line)))) {
                                        name =
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "<a href=\"%s\" title=\"%s\">"
                                                                        + toStringR(s, env)
                                                                        + "</a>",
                                                                NamespaceGlobal.strip_tags
                                                                        .env(env)
                                                                        .call(
                                                                                env.callMethod(
                                                                                        _closureThisVar,
                                                                                        "style",
                                                                                        DumpDataCollector
                                                                                                .class,
                                                                                        "",
                                                                                        link))
                                                                        .value(),
                                                                f,
                                                                name)
                                                        .value();

                                    } else {
                                        name =
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "<abbr title=\"%s\">"
                                                                        + toStringR(s, env)
                                                                        + "</abbr>",
                                                                f,
                                                                name)
                                                        .value();
                                    }

                                } else {
                                    name =
                                            env.callMethod(
                                                    _closureThisVar,
                                                    "style",
                                                    DumpDataCollector.class,
                                                    "meta",
                                                    name);
                                }

                                toObjectR(_closureThisVar)
                                        .accessProp(this, env)
                                        .name("line")
                                        .set(
                                                toStringR(name, env)
                                                        + " on line "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "style",
                                                                        DumpDataCollector.class,
                                                                        "meta",
                                                                        line),
                                                                env)
                                                        + ":");

                            } else {
                                toObjectR(_closureThisVar)
                                        .accessProp(this, env)
                                        .name("line")
                                        .set(
                                                toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "style",
                                                                        DumpDataCollector.class,
                                                                        "meta",
                                                                        name),
                                                                env)
                                                        + " on line "
                                                        + toStringR(
                                                                env.callMethod(
                                                                        _closureThisVar,
                                                                        "style",
                                                                        DumpDataCollector.class,
                                                                        "meta",
                                                                        line),
                                                                env)
                                                        + ":");
                            }

                            env.callMethod(_closureThisVar, "dumpLine", DumpDataCollector.class, 0);
                            return null;
                        }
                    };
            contextDumper =
                    env.callMethod(
                            contextDumper, "bindTo", DumpDataCollector.class, dumper, dumper);
            env.callFunctionDynamic(
                    contextDumper,
                    new RuntimeArgsWithReferences()
                            .add(0, name)
                            .add(1, file)
                            .add(2, line)
                            .add(3, new ReferenceClassProperty(this, "fileLinkFormat", env)),
                    name.getObject(),
                    file.getObject(),
                    line.getObject(),
                    this.fileLinkFormat);

        } else {
            cloner = new VarCloner(env);
            env.callMethod(
                    dumper,
                    "dump",
                    DumpDataCollector.class,
                    env.callMethod(
                            cloner,
                            "cloneVar",
                            DumpDataCollector.class,
                            toStringR(name.getObject(), env)
                                    + " on line "
                                    + toStringR(line.getObject(), env)
                                    + ":"));
        }

        env.callMethod(dumper, "dump", DumpDataCollector.class, data);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\DumpDataCollector";

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
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\DumpDataCollector")
                    .setLookup(
                            DumpDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "cloner",
                            "clonesCount",
                            "clonesIndex",
                            "data",
                            "dataCount",
                            "dumper",
                            "fileLinkFormat",
                            "isCollected",
                            "requestStack",
                            "rootRefs",
                            "sourceContextProvider",
                            "stopwatch")
                    .setFilename("vendor/symfony/http-kernel/DataCollector/DumpDataCollector.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface")
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

    private static class Scope177 implements UpdateRuntimeScopeInterface {

        Object file;
        Object data;
        Object line;
        Object _thisVarAlias;
        Object name;
        Object runtimeTempArrayResult194;
        Object fileExcerpt;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("data", this.data);
            stack.setVariable("line", this.line);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
            stack.setVariable("runtimeTempArrayResult194", this.runtimeTempArrayResult194);
            stack.setVariable("fileExcerpt", this.fileExcerpt);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this.data = stack.getVariable("data");
            this.line = stack.getVariable("line");
            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
            this.runtimeTempArrayResult194 = stack.getVariable("runtimeTempArrayResult194");
            this.fileExcerpt = stack.getVariable("fileExcerpt");
        }
    }
}
