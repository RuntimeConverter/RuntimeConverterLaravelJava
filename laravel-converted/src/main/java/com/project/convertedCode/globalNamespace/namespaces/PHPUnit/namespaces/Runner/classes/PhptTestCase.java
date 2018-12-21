package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SelfDescribing;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Test;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestResult;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.Exception;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.AbstractPhpProcess;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Timer.classes.Timer;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.IncompleteTestError;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SkippedTestError;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/PhptTestCase.php

*/

public class PhptTestCase extends RuntimeClassBase implements Test, SelfDescribing {

    public Object filename = null;

    public Object phpUtil = null;

    public PhptTestCase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhptTestCase.class) {
            this.__construct(env, args);
        }
    }

    public PhptTestCase(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "phpUtil",
        typeHint = "PHPUnit\\Util\\PHP\\AbstractPhpProcess",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        Object phpUtil = assignParameter(args, 1, true);
        if (null == phpUtil) {
            phpUtil = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (!function_is_file.f.env(env).call(filename).getBool()) {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("File \"%s\" does not exist.", filename)
                                    .value()));
        }

        this.filename = filename;
        this.phpUtil =
                ZVal.isTrue(ternaryExpressionTemp = phpUtil)
                        ? ternaryExpressionTemp
                        : AbstractPhpProcess.runtimeStaticObject.factory(env);
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return 1;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "result",
        typeHint = "PHPUnit\\Framework\\TestResult",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object run(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, true);
        if (null == result) {
            result = ZVal.getNull();
        }
        Object coverage = null;
        ReferenceContainer settings = new BasicReferenceContainer(null);
        Object code = null;
        Object e = null;
        Object skip = null;
        Object ___env = null;
        ReferenceContainer sections = new BasicReferenceContainer(null);
        Object t = null;
        Object failure = null;
        ReferenceContainer jobResult = new BasicReferenceContainer(null);
        Object time = null;
        Object xfail = null;
        sections.setObject(this.parse(env));
        code = this.render(env, sections.arrayGet(env, "FILE"));
        if (ZVal.strictEqualityCheck(result, "===", ZVal.getNull())) {
            result = new TestResult(env);
        }

        xfail = false;
        settings.setObject(this.parseIniSection(env, CONST_SETTINGS));
        env.callMethod(result, "startTest", PhptTestCase.class, this);
        if (arrayActionR(ArrayAction.ISSET, sections, env, "INI")) {
            settings.setObject(
                    this.parseIniSection(env, sections.arrayGet(env, "INI"), settings.getObject()));
        }

        if (arrayActionR(ArrayAction.ISSET, sections, env, "ENV")) {
            ___env = this.parseEnvSection(env, sections.arrayGet(env, "ENV"));
            env.callMethod(this.phpUtil, "setEnv", PhptTestCase.class, ___env);
        }

        env.callMethod(this.phpUtil, "setUseStderrRedirection", PhptTestCase.class, true);
        if (ZVal.isTrue(env.callMethod(result, "enforcesTimeLimit", PhptTestCase.class))) {
            env.callMethod(
                    this.phpUtil,
                    "setTimeout",
                    PhptTestCase.class,
                    env.callMethod(result, "getTimeoutForLargeTests", PhptTestCase.class));
        }

        skip =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, sections),
                        "runSkip",
                        PhptTestCase.class,
                        sections.getObject(),
                        result,
                        settings.getObject());
        if (ZVal.isTrue(skip)) {
            return ZVal.assign(result);
        }

        if (arrayActionR(ArrayAction.ISSET, sections, env, "XFAIL")) {
            xfail = function_trim.f.env(env).call(sections.arrayGet(env, "XFAIL")).value();
        }

        if (arrayActionR(ArrayAction.ISSET, sections, env, "STDIN")) {
            env.callMethod(
                    this.phpUtil, "setStdin", PhptTestCase.class, sections.arrayGet(env, "STDIN"));
        }

        if (arrayActionR(ArrayAction.ISSET, sections, env, "ARGS")) {
            env.callMethod(
                    this.phpUtil, "setArgs", PhptTestCase.class, sections.arrayGet(env, "ARGS"));
        }

        if (ZVal.isTrue(
                env.callMethod(result, "getCollectCodeCoverageInformation", PhptTestCase.class))) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, settings),
                    "renderForCoverage",
                    PhptTestCase.class,
                    settings.getObject());
        }

        Timer.runtimeStaticObject.start(env);
        jobResult.setObject(
                env.callMethod(
                        this.phpUtil,
                        "runJob",
                        PhptTestCase.class,
                        code,
                        this.stringifyIni(env, settings.getObject())));
        time = Timer.runtimeStaticObject.stop(env);
        if (ZVal.toBool(
                        env.callMethod(
                                result, "getCollectCodeCoverageInformation", PhptTestCase.class))
                && ZVal.toBool(coverage = this.cleanupForCoverage(env))) {
            env.callMethod(
                    env.callMethod(result, "getCodeCoverage", PhptTestCase.class),
                    "append",
                    PhptTestCase.class,
                    coverage,
                    this,
                    true,
                    ZVal.newArray(),
                    ZVal.newArray(),
                    true);
        }

        try {
            this.assertPhptExpectation(
                    env, sections.getObject(), jobResult.arrayGet(env, "stdout"));
        } catch (ConvertedException convertedException155) {
            if (convertedException155.instanceOf(
                    AssertionFailedError.class, "PHPUnit\\Framework\\AssertionFailedError")) {
                e = convertedException155.getObject();
                failure = ZVal.assign(e);
                if (ZVal.strictNotEqualityCheck(xfail, "!==", false)) {
                    failure = new IncompleteTestError(env, xfail, 0, e);
                }

                env.callMethod(result, "addFailure", PhptTestCase.class, this, failure, time);
            } else if (convertedException155.instanceOf(Throwable.class, "Throwable")) {
                t = convertedException155.getObject();
                env.callMethod(result, "addError", PhptTestCase.class, this, t, time);
            } else {
                throw convertedException155;
            }
        }

        if (ZVal.toBool(env.callMethod(result, "allCompletelyImplemented", PhptTestCase.class))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(xfail, "!==", false))) {
            env.callMethod(
                    result,
                    "addFailure",
                    PhptTestCase.class,
                    this,
                    new IncompleteTestError(env, "XFAIL section but test passes"),
                    time);
        }

        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, sections),
                "runClean",
                PhptTestCase.class,
                sections.getObject());
        env.callMethod(result, "endTest", PhptTestCase.class, this, time);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toString(env));
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.filename);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(index = 1, name = "ini", defaultValue = "", defaultValueType = "array")
    private Object parseIniSection(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object content = assignParameter(args, 0, false);
        ReferenceContainer ini = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == ini.getObject()) {
            ini.setObject(ZVal.newArray());
        }
        Object name = null;
        Object value = null;
        ReferenceContainer setting = new BasicReferenceContainer(null);
        if (function_is_string.f.env(env).call(content).getBool()) {
            content =
                    function_explode
                            .f
                            .env(env)
                            .call("\n", function_trim.f.env(env).call(content).value())
                            .value();
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1220 : ZVal.getIterable(content, env, true)) {
            setting.setObject(ZVal.assign(zpairResult1220.getValue()));
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(setting.getObject(), "=").value(),
                    "===",
                    false)) {
                continue;
            }

            setting.setObject(
                    function_explode.f.env(env).call("=", setting.getObject(), 2).value());
            name = function_trim.f.env(env).call(setting.arrayGet(env, 0)).value();
            value = function_trim.f.env(env).call(setting.arrayGet(env, 1)).value();
            if (ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "extension"))
                    || ZVal.toBool(ZVal.strictEqualityCheck(name, "===", "zend_extension"))) {
                if (!arrayActionR(ArrayAction.ISSET, ini, env, name)) {
                    ini.arrayAccess(env, name).set(ZVal.newArray());
                }

                ini.arrayAppend(env, name).set(value);
                continue;
            }

            ini.arrayAccess(env, name).set(value);
        }

        return ZVal.assign(ini.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content", typeHint = "string")
    private Object parseEnvSection(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        ReferenceContainer e = new BasicReferenceContainer(null);
        ReferenceContainer ___env = new BasicReferenceContainer(null);
        ___env.setObject(ZVal.newArray());
        for (ZPair zpairResult1221 :
                ZVal.getIterable(
                        function_explode
                                .f
                                .env(env)
                                .call("\n", function_trim.f.env(env).call(content).value())
                                .value(),
                        env,
                        true)) {
            e.setObject(ZVal.assign(zpairResult1221.getValue()));
            e.setObject(
                    function_explode
                            .f
                            .env(env)
                            .call("=", function_trim.f.env(env).call(e.getObject()).value(), 2)
                            .value());
            if (ZVal.toBool(!arrayActionR(ArrayAction.EMPTY, e, env, 0))
                    && ZVal.toBool(arrayActionR(ArrayAction.ISSET, e, env, 1))) {
                ___env.arrayAccess(env, e.arrayGet(env, 0)).set(e.arrayGet(env, 1));
            }
        }

        return ZVal.assign(___env.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    @ConvertedParameter(index = 1, name = "output", typeHint = "string")
    private Object assertPhptExpectation(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer sections = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object output = assignParameter(args, 1, false);
        Object sectionName = null;
        ReferenceContainer actual = new BasicReferenceContainer(null);
        Object sectionContent = null;
        Object sectionAssertion = null;
        ReferenceContainer expected = new BasicReferenceContainer(null);
        Object assertion = null;
        Object assertions = null;
        assertions =
                ZVal.newArray(
                        new ZPair("EXPECT", "assertEquals"),
                        new ZPair("EXPECTF", "assertStringMatchesFormat"),
                        new ZPair("EXPECTREGEX", "assertRegExp"));
        actual.setObject(
                function_preg_replace
                        .f
                        .env(env)
                        .call("/\\r\\n/", "\n", function_trim.f.env(env).call(output).value())
                        .value());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1222 : ZVal.getIterable(assertions, env, false)) {
            sectionName = ZVal.assign(zpairResult1222.getKey());
            sectionAssertion = ZVal.assign(zpairResult1222.getValue());
            if (arrayActionR(ArrayAction.ISSET, sections, env, sectionName)) {
                sectionContent =
                        function_preg_replace
                                .f
                                .env(env)
                                .call(
                                        "/\\r\\n/",
                                        "\n",
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(sections.arrayGet(env, sectionName))
                                                .value())
                                .value();
                assertion = ZVal.assign(sectionAssertion);
                expected.setObject(
                        ZVal.assign(
                                ZVal.strictEqualityCheck(sectionName, "===", "EXPECTREGEX")
                                        ? "/" + toStringR(sectionContent, env) + "/"
                                        : sectionContent));
                break;
            }
        }

        if (!ZVal.isset(assertion)) {
            throw ZVal.getException(env, new Exception(env, "No PHPT assertion found"));
        }

        if (!ZVal.isset(expected.getObject())) {
            throw ZVal.getException(env, new Exception(env, "No PHPT expectation found"));
        }

        Assert.runtimeStaticObject.callUnknownStaticMethod(
                env,
                assertion,
                new RuntimeArgsWithReferences().add(0, expected).add(1, actual),
                expected.getObject(),
                actual.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    @ConvertedParameter(index = 1, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    @ConvertedParameter(index = 2, name = "settings", typeHint = "array")
    private Object runSkip(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer sections =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object result = assignParameter(args, 1, false);
        Object settings = assignParameter(args, 2, false);
        ReferenceContainer skipMatch = new BasicReferenceContainer(null);
        ReferenceContainer jobResult = new BasicReferenceContainer(null);
        Object message = null;
        Object skipif = null;
        if (!arrayActionR(ArrayAction.ISSET, sections, env, "SKIPIF")) {
            return ZVal.assign(false);
        }

        skipif = this.render(env, sections.arrayGet(env, "SKIPIF"));
        jobResult.setObject(
                env.callMethod(
                        this.phpUtil,
                        "runJob",
                        PhptTestCase.class,
                        skipif,
                        this.stringifyIni(env, settings)));
        if (!NamespaceGlobal.strncasecmp
                .env(env)
                .call(
                        "skip",
                        function_ltrim.f.env(env).call(jobResult.arrayGet(env, "stdout")).value(),
                        4)
                .getBool()) {
            message = "";
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, skipMatch))
                    .call(
                            "/^\\s*skip\\s*(.+)\\s*/i",
                            jobResult.arrayGet(env, "stdout"),
                            skipMatch.getObject())
                    .getBool()) {
                message = function_substr.f.env(env).call(skipMatch.arrayGet(env, 1), 2).value();
            }

            env.callMethod(
                    result,
                    "addFailure",
                    PhptTestCase.class,
                    this,
                    new SkippedTestError(env, message),
                    0);
            env.callMethod(result, "endTest", PhptTestCase.class, this, 0);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public Object runSkip(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    private Object runClean(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer sections =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object cleanCode = null;
        env.callMethod(this.phpUtil, "setStdin", PhptTestCase.class, "");
        env.callMethod(this.phpUtil, "setArgs", PhptTestCase.class, "");
        if (arrayActionR(ArrayAction.ISSET, sections, env, "CLEAN")) {
            cleanCode = this.render(env, sections.arrayGet(env, "CLEAN"));
            env.callMethod(this.phpUtil, "runJob", PhptTestCase.class, cleanCode, CONST_SETTINGS);
        }

        return null;
    }

    public Object runClean(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    private Object parse(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object line = null;
        Object section = null;
        Object unsupportedSections = null;
        ReferenceContainer sections = new BasicReferenceContainer(null);
        sections.setObject(ZVal.newArray());
        section = "";
        unsupportedSections =
                ZVal.arrayFromList(
                        "REDIRECTTEST",
                        "REQUEST",
                        "POST",
                        "PUT",
                        "POST_RAW",
                        "GZIP_POST",
                        "DEFLATE_POST",
                        "GET",
                        "COOKIE",
                        "HEADERS",
                        "CGI",
                        "EXPECTHEADERS",
                        "EXTENSIONS",
                        "PHPDBG");
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1223 :
                ZVal.getIterable(
                        NamespaceGlobal.file.env(env).call(this.filename).value(), env, true)) {
            line = ZVal.assign(zpairResult1223.getValue());
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, result))
                    .call("/^--([_A-Z]+)--/", line, result.getObject())
                    .getBool()) {
                section = ZVal.assign(result.arrayGet(env, 1));
                sections.arrayAccess(env, section).set("");
                continue;
            }

            if (ZVal.isEmpty(section)) {
                throw ZVal.getException(env, new Exception(env, "Invalid PHPT file"));
            }

            sections.arrayAccess(env, section)
                    .set(toStringR(sections.arrayGet(env, section), env) + toStringR(line, env));
        }

        if (arrayActionR(ArrayAction.ISSET, sections, env, "FILEEOF")) {
            sections.arrayAccess(env, "FILE")
                    .set(
                            function_rtrim
                                    .f
                                    .env(env)
                                    .call(sections.arrayGet(env, "FILEEOF"), "\r\n")
                                    .value());
            arrayActionR(ArrayAction.UNSET, sections, env, "FILEEOF");
        }

        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, sections),
                "parseExternal",
                PhptTestCase.class,
                sections.getObject());
        if (!ZVal.isTrue(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, sections),
                        "validate",
                        PhptTestCase.class,
                        sections.getObject()))) {
            throw ZVal.getException(env, new Exception(env, "Invalid PHPT file"));
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1224 : ZVal.getIterable(unsupportedSections, env, true)) {
            section = ZVal.assign(zpairResult1224.getValue());
            if (arrayActionR(ArrayAction.ISSET, sections, env, section)) {
                throw ZVal.getException(
                        env, new Exception(env, "PHPUnit does not support this PHPT file"));
            }
        }

        return ZVal.assign(sections.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    private Object parseExternal(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer sections =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object testDirectory = null;
        Object allowSections = null;
        Object section = null;
        Object externalFilename = null;
        allowSections = ZVal.arrayFromList("FILE", "EXPECT", "EXPECTF", "EXPECTREGEX");
        testDirectory =
                toStringR(function_dirname.f.env(env).call(this.filename).value(), env)
                        + toStringR("/", env);
        for (ZPair zpairResult1225 : ZVal.getIterable(allowSections, env, true)) {
            section = ZVal.assign(zpairResult1225.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET, sections, env, toStringR(section, env) + "_EXTERNAL")) {
                externalFilename =
                        function_trim
                                .f
                                .env(env)
                                .call(sections.arrayGet(env, toStringR(section, env) + "_EXTERNAL"))
                                .value();
                if (ZVal.toBool(
                                !function_is_file
                                        .f
                                        .env(env)
                                        .call(
                                                toStringR(testDirectory, env)
                                                        + toStringR(externalFilename, env))
                                        .getBool())
                        || ZVal.toBool(
                                !NamespaceGlobal.is_readable
                                        .env(env)
                                        .call(
                                                toStringR(testDirectory, env)
                                                        + toStringR(externalFilename, env))
                                        .getBool())) {
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Could not load --%s-- %s for PHPT file",
                                                    toStringR(section, env) + "_EXTERNAL",
                                                    toStringR(testDirectory, env)
                                                            + toStringR(externalFilename, env))
                                            .value()));
                }

                sections.arrayAccess(env, section)
                        .set(
                                function_file_get_contents
                                        .f
                                        .env(env)
                                        .call(
                                                toStringR(testDirectory, env)
                                                        + toStringR(externalFilename, env))
                                        .value());
                arrayActionR(
                        ArrayAction.UNSET, sections, env, toStringR(section, env) + "_EXTERNAL");
            }
        }

        return null;
    }

    public Object parseExternal(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sections", typeHint = "array")
    private Object validate(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        ReferenceContainer sections =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object foundSection = null;
        Object anySection = null;
        Object section = null;
        Object requiredSections = null;
        requiredSections =
                ZVal.newArray(
                        new ZPair(0, "FILE"),
                        new ZPair(1, ZVal.arrayFromList("EXPECT", "EXPECTF", "EXPECTREGEX")));
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1226 : ZVal.getIterable(requiredSections, env, true)) {
            section = ZVal.assign(zpairResult1226.getValue());
            if (function_is_array.f.env(env).call(section).getBool()) {
                foundSection = false;
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1227 : ZVal.getIterable(section, env, true)) {
                    anySection = ZVal.assign(zpairResult1227.getValue());
                    if (arrayActionR(ArrayAction.ISSET, sections, env, anySection)) {
                        foundSection = true;
                        break;
                    }
                }

                if (!ZVal.isTrue(foundSection)) {
                    return ZVal.assign(false);
                }

                continue;
            }

            if (!arrayActionR(ArrayAction.ISSET, sections, env, section)) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    public Object validate(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code", typeHint = "string")
    private Object render(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList("__DIR__", "__FILE__"),
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                "'"
                                                        + toStringR(
                                                                function_dirname
                                                                        .f
                                                                        .env(env)
                                                                        .call(this.filename)
                                                                        .value(),
                                                                env)
                                                        + "'"),
                                        new ZPair(1, "'" + toStringR(this.filename, env) + "'")),
                                code)
                        .value());
    }

    @ConvertedMethod
    private Object getCoverageFiles(RuntimeEnv env, Object... args) {
        Object baseDir = null;
        Object basename = null;
        baseDir =
                toStringR(function_dirname.f.env(env).call(this.filename).value(), env)
                        + toStringR("/", env);
        basename = NamespaceGlobal.basename.env(env).call(this.filename, "phpt").value();
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "coverage",
                                toStringR(baseDir, env) + toStringR(basename, env) + "coverage"),
                        new ZPair(
                                "job",
                                toStringR(baseDir, env) + toStringR(basename, env) + "php")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "settings", typeHint = "array")
    private Object renderForCoverage(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer settings =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object template = null;
        ReferenceContainer GLOBALS = new GlobalVariableReference(env, "GLOBALS");
        Object globals = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        Object phar = null;
        Object composerAutoload = null;
        files.setObject(this.getCoverageFiles(env));
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        env.addRootFilesystemPrefix(
                                                "/vendor/phpunit/phpunit/src/Runner"),
                                        env)
                                + "/../Util/PHP/Template/PhptTestCase.tpl");
        composerAutoload = "''";
        if (ZVal.toBool(function_defined.f.env(env).call("PHPUNIT_COMPOSER_INSTALL").value())
                && ZVal.toBool(!function_defined.f.env(env).call("PHPUNIT_TESTSUITE").getBool())) {
            composerAutoload =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(function_constant.get(env, "PHPUNIT_COMPOSER_INSTALL"), true)
                            .value();
        }

        phar = "''";
        if (function_defined.f.env(env).call("__PHPUNIT_PHAR__").getBool()) {
            phar =
                    NamespaceGlobal.var_export
                            .env(env)
                            .call(function_constant.get(env, "__PHPUNIT_PHAR__"), true)
                            .value();
        }

        globals = "";
        if (!arrayActionR(ArrayAction.EMPTY, GLOBALS, env, "__PHPUNIT_BOOTSTRAP")) {
            globals =
                    "$GLOBALS['__PHPUNIT_BOOTSTRAP'] = "
                            + toStringR(
                                    NamespaceGlobal.var_export
                                            .env(env)
                                            .call(
                                                    GLOBALS.arrayGet(env, "__PHPUNIT_BOOTSTRAP"),
                                                    true)
                                            .value(),
                                    env)
                            + ";\n";
        }

        env.callMethod(
                template,
                "setVar",
                PhptTestCase.class,
                ZVal.newArray(
                        new ZPair("composerAutoload", composerAutoload),
                        new ZPair("phar", phar),
                        new ZPair("globals", globals),
                        new ZPair("job", files.arrayGet(env, "job")),
                        new ZPair("coverageFile", files.arrayGet(env, "coverage")),
                        new ZPair(
                                "autoPrependFile",
                                NamespaceGlobal.var_export
                                        .env(env)
                                        .call(
                                                !arrayActionR(
                                                                ArrayAction.EMPTY,
                                                                settings,
                                                                env,
                                                                "auto_prepend_file")
                                                        ? settings.arrayGet(
                                                                env, "auto_prepend_file")
                                                        : false,
                                                true)
                                        .value())));
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        files.arrayGet(env, "job"),
                        env.callMethod(template, "render", PhptTestCase.class));
        settings.arrayAccess(env, "auto_prepend_file").set(files.arrayGet(env, "job"));
        return null;
    }

    public Object renderForCoverage(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    private Object cleanupForCoverage(RuntimeEnv env, Object... args) {
        Object coverage = null;
        Object file = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        files.setObject(this.getCoverageFiles(env));
        coverage =
                function_unserialize
                        .f
                        .env(env)
                        .call(
                                function_file_get_contents
                                        .f
                                        .env(env)
                                        .call(files.arrayGet(env, "coverage"))
                                        .value())
                        .value();
        for (ZPair zpairResult1228 : ZVal.getIterable(files.getObject(), env, true)) {
            file = ZVal.assign(zpairResult1228.getValue());
            NamespaceGlobal.unlink.env(env).call(file).value();
        }

        return ZVal.assign(coverage);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ini", typeHint = "array")
    private Object stringifyIni(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object ini = assignParameter(args, 0, false);
        Object val = null;
        ReferenceContainer settings = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        settings.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1229 : ZVal.getIterable(ini, env, false)) {
            key = ZVal.assign(zpairResult1229.getKey());
            value = ZVal.assign(zpairResult1229.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1230 : ZVal.getIterable(value, env, true)) {
                    val = ZVal.assign(zpairResult1230.getValue());
                    settings.arrayAppend(env).set(toStringR(key, env) + "=" + toStringR(val, env));
                }

                continue;
            }

            settings.arrayAppend(env).set(toStringR(key, env) + "=" + toStringR(value, env));
        }

        return ZVal.assign(settings.getObject());
    }

    public static final Object CONST_SETTINGS =
            ZVal.arrayFromList(
                    "allow_url_fopen=1",
                    "auto_append_file=",
                    "auto_prepend_file=",
                    "disable_functions=",
                    "display_errors=1",
                    "docref_root=",
                    "docref_ext=.html",
                    "error_append_string=",
                    "error_prepend_string=",
                    "error_reporting=-1",
                    "html_errors=0",
                    "log_errors=0",
                    "magic_quotes_runtime=0",
                    "output_handler=",
                    "open_basedir=",
                    "output_buffering=Off",
                    "report_memleaks=0",
                    "report_zend_debug=0",
                    "safe_mode=0",
                    "xdebug.default_enable=0");

    public static final Object CONST_class = "PHPUnit\\Runner\\PhptTestCase";

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
                    .setName("PHPUnit\\Runner\\PhptTestCase")
                    .setLookup(
                            PhptTestCase.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filename", "phpUtil")
                    .setFilename("vendor/phpunit/phpunit/src/Runner/PhptTestCase.php")
                    .addInterface("PHPUnit\\Framework\\Test")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
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
