package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes.Facade;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMXPath;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.stream.function_stream_resolve_include_path;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMElement;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.TextUI.classes.ResultPrinter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.TestSuiteSorter;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_set;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Xml;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Configuration.php

*/

public final class Configuration extends RuntimeClassBase {

    public Object document = null;

    public Object xpath = null;

    public Object filename = null;

    public Object errors = ZVal.newArray();

    public Configuration(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Configuration.class) {
            this.__construct(env, args);
        }
    }

    public Configuration(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    private Object __construct(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        this.filename = filename;
        this.document = Xml.runtimeStaticObject.loadFile(env, filename, false, true, true);
        this.xpath = new DOMXPath(env, this.document);
        this.validateConfigurationAgainstSchema(env);
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object hasValidationErrors(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(this.errors).value(), '>', 0));
    }

    @ConvertedMethod
    public Object getValidationErrors(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object error = null;
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult1258 : ZVal.getIterable(this.errors, env, true)) {
            error = ZVal.assign(zpairResult1258.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    result,
                    env,
                    toObjectR(error).accessProp(this, env).name("line").value())) {
                result.arrayAccess(env, toObjectR(error).accessProp(this, env).name("line").value())
                        .set(ZVal.newArray());
            }

            result.arrayAppend(env, toObjectR(error).accessProp(this, env).name("line").value())
                    .set(
                            function_trim
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(error)
                                                    .accessProp(this, env)
                                                    .name("message")
                                                    .value())
                                    .value());
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    public Object getFilename(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.filename);
    }

    @ConvertedMethod
    public Object getExtensionConfiguration(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object extension = null;
        Object file = null;
        Object arguments = null;
        Object _pClass = null;
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult1259 :
                ZVal.getIterable(
                        env.callMethod(
                                this.xpath, "query", Configuration.class, "extensions/extension"),
                        env,
                        true)) {
            extension = ZVal.assign(zpairResult1259.getValue());
            _pClass =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            extension,
                                            "getAttribute",
                                            Configuration.class,
                                            "class"),
                                    env));
            file = "";
            arguments =
                    this.getConfigurationArguments(
                            env,
                            toObjectR(extension).accessProp(this, env).name("childNodes").value());
            if (ZVal.isTrue(
                    env.callMethod(extension, "getAttribute", Configuration.class, "file"))) {
                file =
                        this.toAbsolutePath(
                                env,
                                toStringR(
                                        env.callMethod(
                                                extension,
                                                "getAttribute",
                                                Configuration.class,
                                                "file"),
                                        env),
                                true);
            }

            result.arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair("class", _pClass),
                                    new ZPair("file", file),
                                    new ZPair("arguments", arguments)));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    public Object getFilterConfiguration(RuntimeEnv env, Object... args) {
        Object processUncoveredFilesFromWhitelist = null;
        Object includeFile = null;
        Object tmp = null;
        Object excludeDirectory = null;
        Object includeDirectory = null;
        Object excludeFile = null;
        Object addUncoveredFilesFromWhitelist = null;
        addUncoveredFilesFromWhitelist = true;
        processUncoveredFilesFromWhitelist = false;
        includeDirectory = ZVal.newArray();
        includeFile = ZVal.newArray();
        excludeDirectory = ZVal.newArray();
        excludeFile = ZVal.newArray();
        tmp = env.callMethod(this.xpath, "query", Configuration.class, "filter/whitelist");
        if (ZVal.strictEqualityCheck(
                toObjectR(tmp).accessProp(this, env).name("length").value(), "===", 1)) {
            if (ZVal.isTrue(
                    env.callMethod(
                            env.callMethod(tmp, "item", Configuration.class, 0),
                            "hasAttribute",
                            Configuration.class,
                            "addUncoveredFilesFromWhitelist"))) {
                addUncoveredFilesFromWhitelist =
                        this.getBoolean(
                                env,
                                toStringR(
                                        env.callMethod(
                                                env.callMethod(tmp, "item", Configuration.class, 0),
                                                "getAttribute",
                                                Configuration.class,
                                                "addUncoveredFilesFromWhitelist"),
                                        env),
                                true);
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            env.callMethod(tmp, "item", Configuration.class, 0),
                            "hasAttribute",
                            Configuration.class,
                            "processUncoveredFilesFromWhitelist"))) {
                processUncoveredFilesFromWhitelist =
                        this.getBoolean(
                                env,
                                toStringR(
                                        env.callMethod(
                                                env.callMethod(tmp, "item", Configuration.class, 0),
                                                "getAttribute",
                                                Configuration.class,
                                                "processUncoveredFilesFromWhitelist"),
                                        env),
                                false);
            }

            includeDirectory = this.readFilterDirectories(env, "filter/whitelist/directory");
            includeFile = this.readFilterFiles(env, "filter/whitelist/file");
            excludeDirectory =
                    this.readFilterDirectories(env, "filter/whitelist/exclude/directory");
            excludeFile = this.readFilterFiles(env, "filter/whitelist/exclude/file");
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "whitelist",
                                ZVal.newArray(
                                        new ZPair(
                                                "addUncoveredFilesFromWhitelist",
                                                addUncoveredFilesFromWhitelist),
                                        new ZPair(
                                                "processUncoveredFilesFromWhitelist",
                                                processUncoveredFilesFromWhitelist),
                                        new ZPair(
                                                "include",
                                                ZVal.newArray(
                                                        new ZPair("directory", includeDirectory),
                                                        new ZPair("file", includeFile))),
                                        new ZPair(
                                                "exclude",
                                                ZVal.newArray(
                                                        new ZPair("directory", excludeDirectory),
                                                        new ZPair("file", excludeFile)))))));
    }

    @ConvertedMethod
    public Object getGroupConfiguration(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parseGroupConfiguration(env, "groups"));
    }

    @ConvertedMethod
    public Object getTestdoxGroupConfiguration(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parseGroupConfiguration(env, "testdoxGroups"));
    }

    @ConvertedMethod
    public Object getListenerConfiguration(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object file = null;
        Object listener = null;
        Object arguments = null;
        Object _pClass = null;
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult1260 :
                ZVal.getIterable(
                        env.callMethod(
                                this.xpath, "query", Configuration.class, "listeners/listener"),
                        env,
                        true)) {
            listener = ZVal.assign(zpairResult1260.getValue());
            _pClass =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            listener, "getAttribute", Configuration.class, "class"),
                                    env));
            file = "";
            arguments =
                    this.getConfigurationArguments(
                            env,
                            toObjectR(listener).accessProp(this, env).name("childNodes").value());
            if (ZVal.isTrue(
                    env.callMethod(listener, "getAttribute", Configuration.class, "file"))) {
                file =
                        this.toAbsolutePath(
                                env,
                                toStringR(
                                        env.callMethod(
                                                listener,
                                                "getAttribute",
                                                Configuration.class,
                                                "file"),
                                        env),
                                true);
            }

            result.arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair("class", _pClass),
                                    new ZPair("file", file),
                                    new ZPair("arguments", arguments)));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    public Object getLoggingConfiguration(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object log = null;
        Object type = null;
        Object target = null;
        result.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1261 :
                ZVal.getIterable(
                        env.callMethod(this.xpath, "query", Configuration.class, "logging/log"),
                        env,
                        true)) {
            log = ZVal.assign(zpairResult1261.getValue());
            type =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            log, "getAttribute", Configuration.class, "type"),
                                    env));
            target =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            log, "getAttribute", Configuration.class, "target"),
                                    env));
            if (!ZVal.isTrue(target)) {
                continue;
            }

            target = this.toAbsolutePath(env, target);
            if (ZVal.strictEqualityCheck(type, "===", "coverage-html")) {
                if (ZVal.isTrue(
                        env.callMethod(
                                log, "hasAttribute", Configuration.class, "lowUpperBound"))) {
                    result.arrayAccess(env, "lowUpperBound")
                            .set(
                                    this.getInteger(
                                            env,
                                            toStringR(
                                                    env.callMethod(
                                                            log,
                                                            "getAttribute",
                                                            Configuration.class,
                                                            "lowUpperBound"),
                                                    env),
                                            50));
                }

                if (ZVal.isTrue(
                        env.callMethod(
                                log, "hasAttribute", Configuration.class, "highLowerBound"))) {
                    result.arrayAccess(env, "highLowerBound")
                            .set(
                                    this.getInteger(
                                            env,
                                            toStringR(
                                                    env.callMethod(
                                                            log,
                                                            "getAttribute",
                                                            Configuration.class,
                                                            "highLowerBound"),
                                                    env),
                                            90));
                }

            } else if (ZVal.strictEqualityCheck(type, "===", "coverage-crap4j")) {
                if (ZVal.isTrue(
                        env.callMethod(log, "hasAttribute", Configuration.class, "threshold"))) {
                    result.arrayAccess(env, "crap4jThreshold")
                            .set(
                                    this.getInteger(
                                            env,
                                            toStringR(
                                                    env.callMethod(
                                                            log,
                                                            "getAttribute",
                                                            Configuration.class,
                                                            "threshold"),
                                                    env),
                                            30));
                }

            } else if (ZVal.strictEqualityCheck(type, "===", "coverage-text")) {
                if (ZVal.isTrue(
                        env.callMethod(
                                log, "hasAttribute", Configuration.class, "showUncoveredFiles"))) {
                    result.arrayAccess(env, "coverageTextShowUncoveredFiles")
                            .set(
                                    this.getBoolean(
                                            env,
                                            toStringR(
                                                    env.callMethod(
                                                            log,
                                                            "getAttribute",
                                                            Configuration.class,
                                                            "showUncoveredFiles"),
                                                    env),
                                            false));
                }

                if (ZVal.isTrue(
                        env.callMethod(
                                log, "hasAttribute", Configuration.class, "showOnlySummary"))) {
                    result.arrayAccess(env, "coverageTextShowOnlySummary")
                            .set(
                                    this.getBoolean(
                                            env,
                                            toStringR(
                                                    env.callMethod(
                                                            log,
                                                            "getAttribute",
                                                            Configuration.class,
                                                            "showOnlySummary"),
                                                    env),
                                            false));
                }
            }

            result.arrayAccess(env, type).set(target);
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    public Object getPHPConfiguration(RuntimeEnv env, Object... args) {
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object path = null;
        Object _pConst = null;
        Object ini = null;
        Object array = null;
        Object var = null;
        Object name = null;
        Object includePath = null;
        Object force = null;
        Object value = null;
        Object verbatim = null;
        result.setObject(
                ZVal.newArray(
                        new ZPair("include_path", ZVal.newArray()),
                        new ZPair("ini", ZVal.newArray()),
                        new ZPair("const", ZVal.newArray()),
                        new ZPair("var", ZVal.newArray()),
                        new ZPair("env", ZVal.newArray()),
                        new ZPair("post", ZVal.newArray()),
                        new ZPair("get", ZVal.newArray()),
                        new ZPair("cookie", ZVal.newArray()),
                        new ZPair("server", ZVal.newArray()),
                        new ZPair("files", ZVal.newArray()),
                        new ZPair("request", ZVal.newArray())));
        for (ZPair zpairResult1262 :
                ZVal.getIterable(
                        env.callMethod(this.xpath, "query", Configuration.class, "php/includePath"),
                        env,
                        true)) {
            includePath = ZVal.assign(zpairResult1262.getValue());
            path =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(includePath)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isTrue(path)) {
                result.arrayAppend(env, "include_path").set(this.toAbsolutePath(env, path));
            }
        }

        for (ZPair zpairResult1263 :
                ZVal.getIterable(
                        env.callMethod(this.xpath, "query", Configuration.class, "php/ini"),
                        env,
                        true)) {
            ini = ZVal.assign(zpairResult1263.getValue());
            name =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            ini, "getAttribute", Configuration.class, "name"),
                                    env));
            value =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            ini, "getAttribute", Configuration.class, "value"),
                                    env));
            result.arrayAccess(env, "ini", name, "value").set(value);
        }

        for (ZPair zpairResult1264 :
                ZVal.getIterable(
                        env.callMethod(this.xpath, "query", Configuration.class, "php/const"),
                        env,
                        true)) {
            _pConst = ZVal.assign(zpairResult1264.getValue());
            name =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            _pConst, "getAttribute", Configuration.class, "name"),
                                    env));
            value =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            _pConst, "getAttribute", Configuration.class, "value"),
                                    env));
            result.arrayAccess(env, "const", name, "value").set(this.getBoolean(env, value, value));
        }

        for (ZPair zpairResult1265 :
                ZVal.getIterable(
                        ZVal.arrayFromList(
                                "var", "env", "post", "get", "cookie", "server", "files",
                                "request"),
                        env,
                        true)) {
            array = ZVal.assign(zpairResult1265.getValue());
            for (ZPair zpairResult1266 :
                    ZVal.getIterable(
                            env.callMethod(
                                    this.xpath,
                                    "query",
                                    Configuration.class,
                                    "php/" + toStringR(array, env)),
                            env,
                            true)) {
                var = ZVal.assign(zpairResult1266.getValue());
                name =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                var, "getAttribute", Configuration.class, "name"),
                                        env));
                value =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                var, "getAttribute", Configuration.class, "value"),
                                        env));
                verbatim = false;
                if (ZVal.isTrue(
                        env.callMethod(var, "hasAttribute", Configuration.class, "verbatim"))) {
                    verbatim =
                            this.getBoolean(
                                    env,
                                    env.callMethod(
                                            var, "getAttribute", Configuration.class, "verbatim"),
                                    false);
                    result.arrayAccess(env, array, name, "verbatim").set(verbatim);
                }

                if (ZVal.isTrue(
                        env.callMethod(var, "hasAttribute", Configuration.class, "force"))) {
                    force =
                            this.getBoolean(
                                    env,
                                    env.callMethod(
                                            var, "getAttribute", Configuration.class, "force"),
                                    false);
                    result.arrayAccess(env, array, name, "force").set(force);
                }

                if (!ZVal.isTrue(verbatim)) {
                    value = this.getBoolean(env, value, value);
                }

                result.arrayAccess(env, array, name, "value").set(value);
            }
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    public Object handlePHPConfiguration(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        ReferenceContainer _ENV = new BasicReferenceContainer(null);
        ReferenceContainer data = new BasicReferenceContainer(null);
        ReferenceContainer configuration = new BasicReferenceContainer(null);
        Object array = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object name = null;
        Object force = null;
        Object ternaryExpressionTemp = null;
        Object value = null;
        ReferenceContainer target = new BasicReferenceContainer(null);
        configuration.setObject(this.getPHPConfiguration(env));
        if (!arrayActionR(ArrayAction.EMPTY, configuration, env, "include_path")) {
            function_ini_set
                    .f
                    .env(env)
                    .call(
                            "include_path",
                            toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ":",
                                                            configuration.arrayGet(
                                                                    env, "include_path"))
                                                    .value(),
                                            env)
                                    + toStringR(":", env)
                                    + toStringR(
                                            function_ini_get
                                                    .f
                                                    .env(env)
                                                    .call("include_path")
                                                    .value(),
                                            env));
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1267 :
                ZVal.getIterable(configuration.arrayGet(env, "ini"), env, false)) {
            name = ZVal.assign(zpairResult1267.getKey());
            data.setObject(ZVal.assign(zpairResult1267.getValue()));
            value = ZVal.assign(data.arrayGet(env, "value"));
            if (function_defined.f.env(env).call(value).getBool()) {
                value =
                        ZVal.assign(
                                toStringR(function_constant.f.env(env).call(value).value(), env));
            }

            function_ini_set.f.env(env).call(name, value);
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1268 :
                ZVal.getIterable(configuration.arrayGet(env, "const"), env, false)) {
            name = ZVal.assign(zpairResult1268.getKey());
            data.setObject(ZVal.assign(zpairResult1268.getValue()));
            value = ZVal.assign(data.arrayGet(env, "value"));
            if (!function_defined.f.env(env).call(name).getBool()) {
                function_define.f.env(env).call(name, value);
            }
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1269 :
                ZVal.getIterable(
                        ZVal.arrayFromList(
                                "var", "post", "get", "cookie", "server", "files", "request"),
                        env,
                        true)) {
            array = ZVal.assign(zpairResult1269.getValue());
            SwitchEnumType67 switchVariable67 =
                    ZVal.getEnum(
                            array,
                            SwitchEnumType67.DEFAULT_CASE,
                            SwitchEnumType67.STRING_var,
                            "var",
                            SwitchEnumType67.STRING_server,
                            "server");
            switch (switchVariable67) {
                case STRING_var:
                    target = GLOBALS;
                    break;
                case STRING_server:
                    target = _SERVER;
                    break;
                case DEFAULT_CASE:
                    target =
                            new ArrayDimensionReference(
                                    GLOBALS.getObject(),
                                    "_"
                                            + toStringR(
                                                    NamespaceGlobal.strtoupper
                                                            .env(env)
                                                            .call(array)
                                                            .value(),
                                                    env));
                    break;
            }
            ;
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1270 :
                    ZVal.getIterable(configuration.arrayGet(env, array), env, false)) {
                name = ZVal.assign(zpairResult1270.getKey());
                data.setObject(ZVal.assign(zpairResult1270.getValue()));
                target.arrayAccess(env, name).set(data.arrayGet(env, "value"));
            }
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1271 :
                ZVal.getIterable(configuration.arrayGet(env, "env"), env, false)) {
            name = ZVal.assign(zpairResult1271.getKey());
            data.setObject(ZVal.assign(zpairResult1271.getValue()));
            value = ZVal.assign(data.arrayGet(env, "value"));
            force =
                    ZVal.assign(
                            ZVal.isDefined(ternaryExpressionTemp = data.arrayGet(env, "force"))
                                    ? ternaryExpressionTemp
                                    : false);
            if (ZVal.toBool(force)
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    NamespaceGlobal.getenv.env(env).call(name).value(),
                                    "===",
                                    false))) {
                NamespaceGlobal.putenv
                        .env(env)
                        .call(toStringR(name, env) + "=" + toStringR(value, env));
            }

            value = NamespaceGlobal.getenv.env(env).call(name).value();
            if (!arrayActionR(ArrayAction.ISSET, _ENV, env, name)) {
                _ENV.arrayAccess(env, name).set(value);
            }

            if (ZVal.strictEqualityCheck(force, "===", true)) {
                _ENV.arrayAccess(env, name).set(value);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getPHPUnitConfiguration(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object columns = null;
        Object root = null;
        result.setObject(ZVal.newArray());
        root =
                ZVal.assign(
                        toObjectR(this.document)
                                .accessProp(this, env)
                                .name("documentElement")
                                .value());
        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "cacheTokens"))) {
            result.arrayAccess(env, "cacheTokens")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "cacheTokens"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "columns"))) {
            columns =
                    ZVal.assign(
                            toStringR(
                                    env.callMethod(
                                            root, "getAttribute", Configuration.class, "columns"),
                                    env));
            if (ZVal.strictEqualityCheck(columns, "===", "max")) {
                result.arrayAccess(env, "columns").set("max");

            } else {
                result.arrayAccess(env, "columns").set(this.getInteger(env, columns, 80));
            }
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "colors"))) {
            if (ZVal.isTrue(
                    this.getBoolean(
                            env,
                            env.callMethod(root, "getAttribute", Configuration.class, "colors"),
                            false))) {
                result.arrayAccess(env, "colors").set(ResultPrinter.CONST_COLOR_AUTO);

            } else {
                result.arrayAccess(env, "colors").set(ResultPrinter.CONST_COLOR_NEVER);
            }
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "stderr"))) {
            result.arrayAccess(env, "stderr")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "stderr"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "backupGlobals"))) {
            result.arrayAccess(env, "backupGlobals")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "backupGlobals"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "backupStaticAttributes"))) {
            result.arrayAccess(env, "backupStaticAttributes")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "backupStaticAttributes"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(env.callMethod(root, "getAttribute", Configuration.class, "bootstrap"))) {
            result.arrayAccess(env, "bootstrap")
                    .set(
                            this.toAbsolutePath(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "bootstrap"),
                                            env)));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "convertDeprecationsToExceptions"))) {
            result.arrayAccess(env, "convertDeprecationsToExceptions")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "convertDeprecationsToExceptions"),
                                            env),
                                    true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "convertErrorsToExceptions"))) {
            result.arrayAccess(env, "convertErrorsToExceptions")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "convertErrorsToExceptions"),
                                            env),
                                    true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "convertNoticesToExceptions"))) {
            result.arrayAccess(env, "convertNoticesToExceptions")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "convertNoticesToExceptions"),
                                            env),
                                    true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "convertWarningsToExceptions"))) {
            result.arrayAccess(env, "convertWarningsToExceptions")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "convertWarningsToExceptions"),
                                            env),
                                    true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "forceCoversAnnotation"))) {
            result.arrayAccess(env, "forceCoversAnnotation")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "forceCoversAnnotation"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "disableCodeCoverageIgnore"))) {
            result.arrayAccess(env, "disableCodeCoverageIgnore")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "disableCodeCoverageIgnore"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "processIsolation"))) {
            result.arrayAccess(env, "processIsolation")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "processIsolation"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "stopOnError"))) {
            result.arrayAccess(env, "stopOnError")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "stopOnError"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "stopOnFailure"))) {
            result.arrayAccess(env, "stopOnFailure")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "stopOnFailure"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "stopOnWarning"))) {
            result.arrayAccess(env, "stopOnWarning")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "stopOnWarning"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "stopOnIncomplete"))) {
            result.arrayAccess(env, "stopOnIncomplete")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "stopOnIncomplete"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "stopOnRisky"))) {
            result.arrayAccess(env, "stopOnRisky")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "stopOnRisky"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "stopOnSkipped"))) {
            result.arrayAccess(env, "stopOnSkipped")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "stopOnSkipped"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "failOnWarning"))) {
            result.arrayAccess(env, "failOnWarning")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "failOnWarning"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "failOnRisky"))) {
            result.arrayAccess(env, "failOnRisky")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "failOnRisky"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "testSuiteLoaderClass"))) {
            result.arrayAccess(env, "testSuiteLoaderClass")
                    .set(
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "testSuiteLoaderClass"),
                                    env));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "defaultTestSuite"))) {
            result.arrayAccess(env, "defaultTestSuite")
                    .set(
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "defaultTestSuite"),
                                    env));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "getAttribute", Configuration.class, "testSuiteLoaderFile"))) {
            result.arrayAccess(env, "testSuiteLoaderFile")
                    .set(
                            this.toAbsolutePath(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "testSuiteLoaderFile"),
                                            env)));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "printerClass"))) {
            result.arrayAccess(env, "printerClass")
                    .set(
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "printerClass"),
                                    env));
        }

        if (ZVal.isTrue(env.callMethod(root, "getAttribute", Configuration.class, "printerFile"))) {
            result.arrayAccess(env, "printerFile")
                    .set(
                            this.toAbsolutePath(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "printerFile"),
                                            env)));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutChangesToGlobalState"))) {
            result.arrayAccess(env, "beStrictAboutChangesToGlobalState")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "beStrictAboutChangesToGlobalState"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutOutputDuringTests"))) {
            result.arrayAccess(env, "disallowTestOutput")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "beStrictAboutOutputDuringTests"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutResourceUsageDuringSmallTests"))) {
            result.arrayAccess(env, "beStrictAboutResourceUsageDuringSmallTests")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "beStrictAboutResourceUsageDuringSmallTests"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutTestsThatDoNotTestAnything"))) {
            result.arrayAccess(env, "reportUselessTests")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "beStrictAboutTestsThatDoNotTestAnything"),
                                            env),
                                    true));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutTodoAnnotatedTests"))) {
            result.arrayAccess(env, "disallowTodoAnnotatedTests")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "beStrictAboutTodoAnnotatedTests"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "beStrictAboutCoversAnnotation"))) {
            result.arrayAccess(env, "strictCoverage")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "beStrictAboutCoversAnnotation"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "enforceTimeLimit"))) {
            result.arrayAccess(env, "enforceTimeLimit")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "enforceTimeLimit"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "ignoreDeprecatedCodeUnitsFromCodeCoverage"))) {
            result.arrayAccess(env, "ignoreDeprecatedCodeUnitsFromCodeCoverage")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "ignoreDeprecatedCodeUnitsFromCodeCoverage"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "timeoutForSmallTests"))) {
            result.arrayAccess(env, "timeoutForSmallTests")
                    .set(
                            this.getInteger(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "timeoutForSmallTests"),
                                            env),
                                    1));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "timeoutForMediumTests"))) {
            result.arrayAccess(env, "timeoutForMediumTests")
                    .set(
                            this.getInteger(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "timeoutForMediumTests"),
                                            env),
                                    10));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root, "hasAttribute", Configuration.class, "timeoutForLargeTests"))) {
            result.arrayAccess(env, "timeoutForLargeTests")
                    .set(
                            this.getInteger(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "timeoutForLargeTests"),
                                            env),
                                    60));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "reverseDefectList"))) {
            result.arrayAccess(env, "reverseDefectList")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "reverseDefectList"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(env.callMethod(root, "hasAttribute", Configuration.class, "verbose"))) {
            result.arrayAccess(env, "verbose")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "verbose"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(
                        root,
                        "hasAttribute",
                        Configuration.class,
                        "registerMockObjectsFromTestArgumentsRecursively"))) {
            result.arrayAccess(env, "registerMockObjectsFromTestArgumentsRecursively")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "registerMockObjectsFromTestArgumentsRecursively"),
                                            env),
                                    false));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "extensionsDirectory"))) {
            result.arrayAccess(env, "extensionsDirectory")
                    .set(
                            this.toAbsolutePath(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "extensionsDirectory"),
                                            env)));
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "executionOrder"))) {
            SwitchEnumType68 switchVariable68 =
                    ZVal.getEnum(
                            toStringR(
                                    env.callMethod(
                                            root,
                                            "getAttribute",
                                            Configuration.class,
                                            "executionOrder"),
                                    env),
                            SwitchEnumType68.DEFAULT_CASE,
                            SwitchEnumType68.STRING_random,
                            "random",
                            SwitchEnumType68.STRING_reverse,
                            "reverse");
            switch (switchVariable68) {
                case STRING_random:
                    result.arrayAccess(env, "executionOrder")
                            .set(TestSuiteSorter.CONST_ORDER_RANDOMIZED);
                    break;
                case STRING_reverse:
                    result.arrayAccess(env, "executionOrder")
                            .set(TestSuiteSorter.CONST_ORDER_REVERSED);
                    break;
                case DEFAULT_CASE:
                    result.arrayAccess(env, "executionOrder")
                            .set(TestSuiteSorter.CONST_ORDER_DEFAULT);
            }
            ;
        }

        if (ZVal.isTrue(
                env.callMethod(root, "hasAttribute", Configuration.class, "resolveDependencies"))) {
            result.arrayAccess(env, "resolveDependencies")
                    .set(
                            this.getBoolean(
                                    env,
                                    toStringR(
                                            env.callMethod(
                                                    root,
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "resolveDependencies"),
                                            env),
                                    false));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testSuiteFilter", typeHint = "string")
    public Object getTestSuiteConfiguration(RuntimeEnv env, Object... args) {
        Object testSuiteFilter = assignParameter(args, 0, true);
        if (null == testSuiteFilter) {
            testSuiteFilter = "";
        }
        Object suite = null;
        Object testSuiteNodes = null;
        Object testSuiteNode = null;
        testSuiteNodes =
                env.callMethod(this.xpath, "query", Configuration.class, "testsuites/testsuite");
        if (ZVal.strictEqualityCheck(
                toObjectR(testSuiteNodes).accessProp(this, env).name("length").value(), "===", 0)) {
            testSuiteNodes = env.callMethod(this.xpath, "query", Configuration.class, "testsuite");
        }

        if (ZVal.strictEqualityCheck(
                toObjectR(testSuiteNodes).accessProp(this, env).name("length").value(), "===", 1)) {
            return ZVal.assign(
                    this.getTestSuite(
                            env,
                            env.callMethod(testSuiteNodes, "item", Configuration.class, 0),
                            testSuiteFilter));
        }

        suite = new TestSuite(env);
        for (ZPair zpairResult1272 : ZVal.getIterable(testSuiteNodes, env, true)) {
            testSuiteNode = ZVal.assign(zpairResult1272.getValue());
            env.callMethod(
                    suite,
                    "addTestSuite",
                    Configuration.class,
                    this.getTestSuite(env, testSuiteNode, testSuiteFilter));
        }

        return ZVal.assign(suite);
    }

    @ConvertedMethod
    public Object getTestSuiteNames(RuntimeEnv env, Object... args) {
        Object node = null;
        ReferenceContainer names = new BasicReferenceContainer(null);
        names.setObject(ZVal.newArray());
        for (ZPair zpairResult1273 :
                ZVal.getIterable(
                        env.callMethod(this.xpath, "query", Configuration.class, "*/testsuite"),
                        env,
                        true)) {
            node = ZVal.assign(zpairResult1273.getValue());
            names.arrayAppend(env)
                    .set(env.callMethod(node, "getAttribute", Configuration.class, "name"));
        }

        return ZVal.assign(names.getObject());
    }

    @ConvertedMethod
    private Object validateConfigurationAgainstSchema(RuntimeEnv env, Object... args) {
        Object original = null;
        Object xsdFilename = null;
        original = NamespaceGlobal.libxml_use_internal_errors.env(env).call(true).value();
        xsdFilename =
                toStringR(env.addRootFilesystemPrefix("/vendor/phpunit/phpunit/src/Util"), env)
                        + "/../../phpunit.xsd";
        if (function_defined.f.env(env).call("__PHPUNIT_PHAR_ROOT__").getBool()) {
            xsdFilename =
                    toStringR(function_constant.get(env, "__PHPUNIT_PHAR_ROOT__"), env)
                            + "/phpunit.xsd";
        }

        env.callMethod(this.document, "schemaValidate", Configuration.class, xsdFilename);
        this.errors = NamespaceGlobal.libxml_get_errors.env(env).call().value();
        NamespaceGlobal.libxml_use_internal_errors.env(env).call(original);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "nodes", typeHint = "DOMNodeList")
    private Object getConfigurationArguments(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object nodes = assignParameter(args, 0, false);
        Object node = null;
        Object argument = null;
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        arguments.setObject(ZVal.newArray());
        if (ZVal.strictEqualityCheck(
                toObjectR(nodes).accessProp(this, env).name("length").value(), "===", 0)) {
            return ZVal.assign(arguments.getObject());
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1274 : ZVal.getIterable(nodes, env, true)) {
            node = ZVal.assign(zpairResult1274.getValue());
            if (!ZVal.isTrue(ZVal.checkInstanceType(node, DOMElement.class, "DOMElement"))) {
                continue;
            }

            if (ZVal.strictNotEqualityCheck(
                    toObjectR(node).accessProp(this, env).name("tagName").value(),
                    "!==",
                    "arguments")) {
                continue;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1275 :
                    ZVal.getIterable(
                            toObjectR(node).accessProp(this, env).name("childNodes").value(),
                            env,
                            true)) {
                argument = ZVal.assign(zpairResult1275.getValue());
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(argument, DOMElement.class, "DOMElement"))) {
                    continue;
                }

                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        toObjectR(argument)
                                                .accessProp(this, env)
                                                .name("tagName")
                                                .value(),
                                        "===",
                                        "file"))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        toObjectR(argument)
                                                .accessProp(this, env)
                                                .name("tagName")
                                                .value(),
                                        "===",
                                        "directory"))) {
                    arguments
                            .arrayAppend(env)
                            .set(
                                    this.toAbsolutePath(
                                            env,
                                            toStringR(
                                                    toObjectR(argument)
                                                            .accessProp(this, env)
                                                            .name("textContent")
                                                            .value(),
                                                    env)));

                } else {
                    arguments
                            .arrayAppend(env)
                            .set(Xml.runtimeStaticObject.xmlToVariable(env, argument));
                }
            }
        }

        return ZVal.assign(arguments.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "testSuiteNode", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "testSuiteFilter", typeHint = "string")
    private Object getTestSuite(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object testSuiteNode = assignParameter(args, 0, false);
        Object testSuiteFilter = assignParameter(args, 1, true);
        if (null == testSuiteFilter) {
            testSuiteFilter = "";
        }
        Object prefix = null;
        Object directoryNode = null;
        Object suffix = null;
        Object fileIteratorFacade = null;
        Object directory = null;
        Object phpVersionOperator = null;
        Object suite = null;
        Object excludeNode = null;
        ReferenceContainer file = new BasicReferenceContainer(null);
        Object files = null;
        ReferenceContainer exclude = new BasicReferenceContainer(null);
        Object fileNode = null;
        Object excludeFile = null;
        Object phpVersion = null;
        if (ZVal.isTrue(
                env.callMethod(testSuiteNode, "hasAttribute", Configuration.class, "name"))) {
            suite =
                    new TestSuite(
                            env,
                            toStringR(
                                    env.callMethod(
                                            testSuiteNode,
                                            "getAttribute",
                                            Configuration.class,
                                            "name"),
                                    env));

        } else {
            suite = new TestSuite(env);
        }

        exclude.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1276 :
                ZVal.getIterable(
                        env.callMethod(
                                testSuiteNode,
                                "getElementsByTagName",
                                Configuration.class,
                                "exclude"),
                        env,
                        true)) {
            excludeNode = ZVal.assign(zpairResult1276.getValue());
            excludeFile =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(excludeNode)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isTrue(excludeFile)) {
                exclude.arrayAppend(env).set(this.toAbsolutePath(env, excludeFile));
            }
        }

        fileIteratorFacade = new Facade(env);
        testSuiteFilter =
                ZVal.assign(
                        ZVal.isTrue(testSuiteFilter)
                                ? function_explode.f.env(env).call(",", testSuiteFilter).value()
                                : ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1277 :
                ZVal.getIterable(
                        env.callMethod(
                                testSuiteNode,
                                "getElementsByTagName",
                                Configuration.class,
                                "directory"),
                        env,
                        true)) {
            directoryNode = ZVal.assign(zpairResult1277.getValue());
            if (ZVal.toBool(!ZVal.isEmpty(testSuiteFilter))
                    && ZVal.toBool(
                            !function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    toObjectR(directoryNode)
                                                            .accessProp(this, env)
                                                            .name("parentNode")
                                                            .value(),
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "name"),
                                            testSuiteFilter)
                                    .getBool())) {
                continue;
            }

            directory =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(directoryNode)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isEmpty(directory)) {
                continue;
            }

            phpVersion = "7.2.11-dev";
            phpVersionOperator = ">=";
            prefix = "";
            suffix = "Test.php";
            if (ZVal.isTrue(
                    env.callMethod(
                            directoryNode, "hasAttribute", Configuration.class, "phpVersion"))) {
                phpVersion =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "phpVersion"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            directoryNode,
                            "hasAttribute",
                            Configuration.class,
                            "phpVersionOperator"))) {
                phpVersionOperator =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "phpVersionOperator"),
                                        env));
            }

            if (!NamespaceGlobal.version_compare
                    .env(env)
                    .call("7.2.11-dev", phpVersion, phpVersionOperator)
                    .getBool()) {
                continue;
            }

            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "prefix"))) {
                prefix =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "prefix"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "suffix"))) {
                suffix =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "suffix"),
                                        env));
            }

            files =
                    env.callMethod(
                            fileIteratorFacade,
                            "getFilesAsArray",
                            Configuration.class,
                            this.toAbsolutePath(env, directory),
                            suffix,
                            prefix,
                            exclude.getObject());
            env.callMethod(suite, "addTestFiles", Configuration.class, files);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1278 :
                ZVal.getIterable(
                        env.callMethod(
                                testSuiteNode, "getElementsByTagName", Configuration.class, "file"),
                        env,
                        true)) {
            fileNode = ZVal.assign(zpairResult1278.getValue());
            if (ZVal.toBool(!ZVal.isEmpty(testSuiteFilter))
                    && ZVal.toBool(
                            !function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    toObjectR(fileNode)
                                                            .accessProp(this, env)
                                                            .name("parentNode")
                                                            .value(),
                                                    "getAttribute",
                                                    Configuration.class,
                                                    "name"),
                                            testSuiteFilter)
                                    .getBool())) {
                continue;
            }

            file.setObject(
                    ZVal.assign(
                            toStringR(
                                    toObjectR(fileNode)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env)));
            if (ZVal.isEmpty(file.getObject())) {
                continue;
            }

            file.setObject(
                    env.callMethod(
                            fileIteratorFacade,
                            "getFilesAsArray",
                            Configuration.class,
                            this.toAbsolutePath(env, file.getObject())));
            if (!arrayActionR(ArrayAction.ISSET, file, env, 0)) {
                continue;
            }

            file.setObject(ZVal.assign(file.arrayGet(env, 0)));
            phpVersion = "7.2.11-dev";
            phpVersionOperator = ">=";
            if (ZVal.isTrue(
                    env.callMethod(fileNode, "hasAttribute", Configuration.class, "phpVersion"))) {
                phpVersion =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                fileNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "phpVersion"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(
                            fileNode, "hasAttribute", Configuration.class, "phpVersionOperator"))) {
                phpVersionOperator =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                fileNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "phpVersionOperator"),
                                        env));
            }

            if (!NamespaceGlobal.version_compare
                    .env(env)
                    .call("7.2.11-dev", phpVersion, phpVersionOperator)
                    .getBool()) {
                continue;
            }

            env.callMethod(suite, "addTestFile", Configuration.class, file.getObject());
        }

        return ZVal.assign(suite);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    @ConvertedParameter(index = 1, name = "default")
    private Object getBoolean(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strtolower.env(env).call(value).value(), "===", "false")) {
            return ZVal.assign(false);
        }

        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.strtolower.env(env).call(value).value(), "===", "true")) {
            return ZVal.assign(true);
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    @ConvertedParameter(index = 1, name = "default", typeHint = "int")
    private Object getInteger(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, false);
        if (function_is_numeric.f.env(env).call(value).getBool()) {
            return ZVal.assign(ZVal.toLong(value));
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query", typeHint = "string")
    private Object readFilterDirectories(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object query = assignParameter(args, 0, false);
        Object directoryPath = null;
        Object prefix = null;
        ReferenceContainer directories = new BasicReferenceContainer(null);
        Object directoryNode = null;
        Object suffix = null;
        Object group = null;
        directories.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1279 :
                ZVal.getIterable(
                        env.callMethod(this.xpath, "query", Configuration.class, query),
                        env,
                        true)) {
            directoryNode = ZVal.assign(zpairResult1279.getValue());
            directoryPath =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(directoryNode)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (!ZVal.isTrue(directoryPath)) {
                continue;
            }

            prefix = "";
            suffix = ".php";
            group = "DEFAULT";
            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "prefix"))) {
                prefix =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "prefix"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "suffix"))) {
                suffix =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "suffix"),
                                        env));
            }

            if (ZVal.isTrue(
                    env.callMethod(directoryNode, "hasAttribute", Configuration.class, "group"))) {
                group =
                        ZVal.assign(
                                toStringR(
                                        env.callMethod(
                                                directoryNode,
                                                "getAttribute",
                                                Configuration.class,
                                                "group"),
                                        env));
            }

            directories
                    .arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair("path", this.toAbsolutePath(env, directoryPath)),
                                    new ZPair("prefix", prefix),
                                    new ZPair("suffix", suffix),
                                    new ZPair("group", group)));
        }

        return ZVal.assign(directories.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query", typeHint = "string")
    private Object readFilterFiles(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object file = null;
        Object filePath = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        files.setObject(ZVal.newArray());
        for (ZPair zpairResult1280 :
                ZVal.getIterable(
                        env.callMethod(this.xpath, "query", Configuration.class, query),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult1280.getValue());
            filePath =
                    ZVal.assign(
                            toStringR(
                                    toObjectR(file)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
            if (ZVal.isTrue(filePath)) {
                files.arrayAppend(env).set(this.toAbsolutePath(env, filePath));
            }
        }

        return ZVal.assign(files.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "useIncludePath",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object toAbsolutePath(RuntimeEnv env, Object... args) {
        ReferenceContainer path = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object useIncludePath = assignParameter(args, 1, true);
        if (null == useIncludePath) {
            useIncludePath = false;
        }
        Object file = null;
        Object includePathFile = null;
        path.setObject(function_trim.f.env(env).call(path.getObject()).value());
        if (ZVal.strictEqualityCheck(path.arrayGet(env, 0), "===", "/")) {
            return ZVal.assign(path.getObject());
        }

        if (ZVal.toBool(function_defined.f.env(env).call("PHP_WINDOWS_VERSION_BUILD").value())
                && ZVal.toBool(
                        ZVal.toBool(ZVal.strictEqualityCheck(path.arrayGet(env, 0), "===", "\\"))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.isGreaterThanOrEqualTo(
                                                                function_strlen
                                                                        .f
                                                                        .env(env)
                                                                        .call(path.getObject())
                                                                        .value(),
                                                                ">=",
                                                                3))
                                                && ZVal.toBool(
                                                        function_preg_match
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "#^[A-Z]\\:[/\\\\]#i",
                                                                        function_substr
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        path
                                                                                                .getObject(),
                                                                                        0,
                                                                                        3)
                                                                                .value())
                                                                .value())))) {
            return ZVal.assign(path.getObject());
        }

        if (ZVal.strictNotEqualityCheck(
                function_strpos.f.env(env).call(path.getObject(), "://").value(), "!==", false)) {
            return ZVal.assign(path.getObject());
        }

        file =
                toStringR(function_dirname.f.env(env).call(this.filename).value(), env)
                        + toStringR("/", env)
                        + toStringR(path.getObject(), env);
        if (ZVal.toBool(useIncludePath)
                && ZVal.toBool(!function_file_exists.f.env(env).call(file).getBool())) {
            includePathFile =
                    function_stream_resolve_include_path.f.env(env).call(path.getObject()).value();
            if (ZVal.isTrue(includePathFile)) {
                file = ZVal.assign(includePathFile);
            }
        }

        return ZVal.assign(file);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root", typeHint = "string")
    private Object parseGroupConfiguration(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        ReferenceContainer groups = new BasicReferenceContainer(null);
        Object group = null;
        groups.setObject(
                ZVal.newArray(
                        new ZPair("include", ZVal.newArray()),
                        new ZPair("exclude", ZVal.newArray())));
        for (ZPair zpairResult1281 :
                ZVal.getIterable(
                        env.callMethod(
                                this.xpath,
                                "query",
                                Configuration.class,
                                toStringR(root, env) + "/include/group"),
                        env,
                        true)) {
            group = ZVal.assign(zpairResult1281.getValue());
            groups.arrayAppend(env, "include")
                    .set(
                            toStringR(
                                    toObjectR(group)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
        }

        for (ZPair zpairResult1282 :
                ZVal.getIterable(
                        env.callMethod(
                                this.xpath,
                                "query",
                                Configuration.class,
                                toStringR(root, env) + "/exclude/group"),
                        env,
                        true)) {
            group = ZVal.assign(zpairResult1282.getValue());
            groups.arrayAppend(env, "exclude")
                    .set(
                            toStringR(
                                    toObjectR(group)
                                            .accessProp(this, env)
                                            .name("textContent")
                                            .value(),
                                    env));
        }

        return ZVal.assign(groups.getObject());
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Configuration";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
        public Object getInstance(RuntimeEnv env, Object... args) {
            Object filename = assignParameter(args, 0, false);
            Object realPath = null;
            realPath = function_realpath.f.env(env).call(filename).value();
            if (ZVal.strictEqualityCheck(realPath, "===", false)) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Could not read \"%s\".", filename)
                                        .value()));
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .PHPUnit
                                    .namespaces
                                    .Util
                                    .classes
                                    .Configuration
                                    .RequestStaticProperties
                                    .class,
                            "instances"),
                    env,
                    realPath)) {
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Util
                                        .classes
                                        .Configuration
                                        .RequestStaticProperties
                                        .class,
                                "instances")
                        .arrayAccess(env, realPath)
                        .set(
                                new com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .PHPUnit
                                        .namespaces
                                        .Util
                                        .classes
                                        .Configuration(env, realPath));
            }

            return ZVal.assign(
                    env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .PHPUnit
                                            .namespaces
                                            .Util
                                            .classes
                                            .Configuration
                                            .RequestStaticProperties
                                            .class,
                                    "instances")
                            .arrayGet(env, realPath));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instances = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Configuration")
                    .setLookup(
                            Configuration.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("document", "errors", "filename", "xpath")
                    .setStaticPropertyNames("instances")
                    .setFilename("vendor/phpunit/phpunit/src/Util/Configuration.php")
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

    private enum SwitchEnumType67 {
        STRING_var,
        STRING_server,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType68 {
        STRING_random,
        STRING_reverse,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
