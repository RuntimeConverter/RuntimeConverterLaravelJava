package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Builder;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLASS;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.classes.PhptTestCase;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_FUNCTION;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.Xdebug;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream_CachingFactory;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLOSE_TAG;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.UnintentionallyCoveredCodeException;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.PHPDBG;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_NAMESPACE;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.CoveredCodeNotExecutedException;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Driver.classes.Driver;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_COMMENT;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_TRAIT;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_USE;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_INTERFACE;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.MissingCoversAnnotationException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Filter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestCase;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_DOC_COMMENT;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_OPEN_TAG;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_DECLARE;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeUnitReverseLookup.classes.Wizard;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/CodeCoverage.php

*/

public final class CodeCoverage extends RuntimeClassBase {

    public Object driver = null;

    public Object filter = null;

    public Object wizard = null;

    public Object cacheTokens = false;

    public Object checkForUnintentionallyCoveredCode = false;

    public Object forceCoversAnnotation = false;

    public Object checkForUnexecutedCoveredCode = false;

    public Object checkForMissingCoversAnnotation = false;

    public Object addUncoveredFilesFromWhitelist = true;

    public Object processUncoveredFilesFromWhitelist = false;

    public Object ignoreDeprecatedCode = false;

    public Object currentId = null;

    public Object data = ZVal.newArray();

    public Object ignoredLines = ZVal.newArray();

    public Object disableIgnoredLines = false;

    public Object tests = ZVal.newArray();

    public Object unintentionallyCoveredSubclassesWhitelist = ZVal.newArray();

    public Object isInitialized = false;

    public Object shouldCheckForDeadAndUnused = true;

    public Object report = null;

    public CodeCoverage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CodeCoverage.class) {
            this.__construct(env, args);
        }
    }

    public CodeCoverage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "driver",
        typeHint = "SebastianBergmann\\CodeCoverage\\Driver\\Driver",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "filter",
        typeHint = "SebastianBergmann\\CodeCoverage\\Filter",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, true);
        if (null == driver) {
            driver = ZVal.getNull();
        }
        Object filter = assignParameter(args, 1, true);
        if (null == filter) {
            filter = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(driver, "===", ZVal.getNull())) {
            driver = this.selectDriver(env);
        }

        if (ZVal.strictEqualityCheck(filter, "===", ZVal.getNull())) {
            filter = new Filter(env);
        }

        this.driver = driver;
        this.filter = filter;
        this.wizard = new Wizard(env);
        return null;
    }

    @ConvertedMethod
    public Object getReport(RuntimeEnv env, Object... args) {
        Object builder = null;
        if (ZVal.strictEqualityCheck(this.report, "===", ZVal.getNull())) {
            builder = new Builder(env);
            this.report = env.callMethod(builder, "build", CodeCoverage.class, this);
        }

        return ZVal.assign(this.report);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.isInitialized = false;
        this.currentId = ZVal.getNull();
        this.data = ZVal.newArray();
        this.tests = ZVal.newArray();
        this.report = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object filter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.filter);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "raw",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getData(RuntimeEnv env, Object... args) {
        Object raw = assignParameter(args, 0, true);
        if (null == raw) {
            raw = false;
        }
        if (ZVal.toBool(!ZVal.isTrue(raw)) && ZVal.toBool(this.addUncoveredFilesFromWhitelist)) {
            this.addUncoveredFilesFromWhitelist(env);
        }

        return ZVal.assign(this.data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object setData(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data = data;
        this.report = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object getTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tests);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tests", typeHint = "array")
    public Object setTests(RuntimeEnv env, Object... args) {
        Object tests = assignParameter(args, 0, false);
        this.tests = tests;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "clear",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object start(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object clear = assignParameter(args, 1, true);
        if (null == clear) {
            clear = false;
        }
        if (ZVal.isTrue(clear)) {
            this.clear(env);
        }

        if (ZVal.strictEqualityCheck(this.isInitialized, "===", false)) {
            this.initializeData(env);
        }

        this.currentId = id;
        env.callMethod(this.driver, "start", CodeCoverage.class, this.shouldCheckForDeadAndUnused);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "append",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "linesToBeCovered",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "linesToBeUsed",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "ignoreForceCoversAnnotation",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object stop(RuntimeEnv env, Object... args) {
        Object append = assignParameter(args, 0, true);
        if (null == append) {
            append = true;
        }
        Object linesToBeCovered = assignParameter(args, 1, true);
        if (null == linesToBeCovered) {
            linesToBeCovered = ZVal.newArray();
        }
        Object linesToBeUsed = assignParameter(args, 2, true);
        if (null == linesToBeUsed) {
            linesToBeUsed = ZVal.newArray();
        }
        Object ignoreForceCoversAnnotation = assignParameter(args, 3, true);
        if (null == ignoreForceCoversAnnotation) {
            ignoreForceCoversAnnotation = false;
        }
        Object data = null;
        if (ZVal.toBool(!function_is_array.f.env(env).call(linesToBeCovered).getBool())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(linesToBeCovered, "!==", false))) {
            throw ZVal.getException(
                    env,
                    InvalidArgumentException.runtimeStaticObject.create(env, 2, "array or false"));
        }

        data = env.callMethod(this.driver, "stop", CodeCoverage.class);
        this.append(
                env,
                data,
                ZVal.getNull(),
                append,
                linesToBeCovered,
                linesToBeUsed,
                ignoreForceCoversAnnotation);
        this.currentId = ZVal.getNull();
        return ZVal.assign(data);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "id",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "append",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "linesToBeCovered",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "linesToBeUsed",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 5,
        name = "ignoreForceCoversAnnotation",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object append(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object id = assignParameter(args, 1, true);
        if (null == id) {
            id = ZVal.getNull();
        }
        Object append = assignParameter(args, 2, true);
        if (null == append) {
            append = true;
        }
        Object linesToBeCovered = assignParameter(args, 3, true);
        if (null == linesToBeCovered) {
            linesToBeCovered = ZVal.newArray();
        }
        Object linesToBeUsed = assignParameter(args, 4, true);
        if (null == linesToBeUsed) {
            linesToBeUsed = ZVal.newArray();
        }
        Object ignoreForceCoversAnnotation = assignParameter(args, 5, true);
        if (null == ignoreForceCoversAnnotation) {
            ignoreForceCoversAnnotation = false;
        }
        Object k = null;
        Object _size = null;
        Object file = null;
        Object size = null;
        Object v = null;
        Object lines = null;
        Object status = null;
        if (ZVal.strictEqualityCheck(id, "===", ZVal.getNull())) {
            id = ZVal.assign(this.currentId);
        }

        if (ZVal.strictEqualityCheck(id, "===", ZVal.getNull())) {
            throw ZVal.getException(env, new RuntimeException(env));
        }

        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, data),
                "applyWhitelistFilter",
                CodeCoverage.class,
                data.getObject());
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, data),
                "applyIgnoredLinesFilter",
                CodeCoverage.class,
                data.getObject());
        this.initializeFilesThatAreSeenTheFirstTime(env, data.getObject());
        if (!ZVal.isTrue(append)) {
            return null;
        }

        if (ZVal.strictNotEqualityCheck(id, "!==", "UNCOVERED_FILES_FROM_WHITELIST")) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, data),
                    "applyCoversAnnotationFilter",
                    CodeCoverage.class,
                    data.getObject(),
                    linesToBeCovered,
                    linesToBeUsed,
                    ignoreForceCoversAnnotation);
        }

        if (ZVal.isEmpty(data.getObject())) {
            return null;
        }

        size = "unknown";
        status = -1;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(id, TestCase.class, "PHPUnit\\Framework\\TestCase"))) {
            _size = env.callMethod(id, "getSize", CodeCoverage.class);
            if (ZVal.strictEqualityCheck(_size, "===", Test.CONST_SMALL)) {
                size = "small";

            } else if (ZVal.strictEqualityCheck(_size, "===", Test.CONST_MEDIUM)) {
                size = "medium";

            } else if (ZVal.strictEqualityCheck(_size, "===", Test.CONST_LARGE)) {
                size = "large";
            }

            status = env.callMethod(id, "getStatus", CodeCoverage.class);
            id =
                    toStringR(function_get_class.f.env(env).call(id).value(), env)
                            + "::"
                            + toStringR(env.callMethod(id, "getName", CodeCoverage.class), env);

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(id, PhptTestCase.class, "PHPUnit\\Runner\\PhptTestCase"))) {
            size = "large";
            id = env.callMethod(id, "getName", CodeCoverage.class);
        }

        new ReferenceClassProperty(this, "tests", env)
                .arrayAccess(env, id)
                .set(ZVal.newArray(new ZPair("size", size), new ZPair("status", status)));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult973 : ZVal.getIterable(data.getObject(), env, false)) {
            file = ZVal.assign(zpairResult973.getKey());
            lines = ZVal.assign(zpairResult973.getValue());
            if (!ZVal.isTrue(env.callMethod(this.filter, "isFile", CodeCoverage.class, file))) {
                continue;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult974 : ZVal.getIterable(lines, env, false)) {
                k = ZVal.assign(zpairResult974.getKey());
                v = ZVal.assign(zpairResult974.getValue());
                if (ZVal.strictEqualityCheck(v, "===", Driver.CONST_LINE_EXECUTED)) {
                    if (ZVal.toBool(
                                    arrayActionR(
                                            ArrayAction.EMPTY,
                                            new ReferenceClassProperty(this, "data", env),
                                            env,
                                            file,
                                            k))
                            || ZVal.toBool(
                                    !function_in_array
                                            .f
                                            .env(env)
                                            .call(
                                                    id,
                                                    new ReferenceClassProperty(this, "data", env)
                                                            .arrayGet(env, file, k))
                                            .getBool())) {
                        new ReferenceClassProperty(this, "data", env)
                                .arrayAppend(env, file, k)
                                .set(id);
                    }
                }
            }
        }

        this.report = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "that", typeHint = "self")
    public Object merge(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object that = assignParameter(args, 0, false);
        Object file = null;
        Object compareLineNumbers = null;
        Object thisPriority = null;
        Object line = null;
        Object thatPriority = null;
        Object lines = null;
        env.callMethod(
                this.filter,
                "setWhitelistedFiles",
                CodeCoverage.class,
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.filter, "getWhitelistedFiles", CodeCoverage.class),
                                env.callMethod(
                                        env.callMethod(that, "filter", CodeCoverage.class),
                                        "getWhitelistedFiles",
                                        CodeCoverage.class))
                        .value());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult975 :
                ZVal.getIterable(
                        toObjectR(that).accessProp(this, env).name("data").value(), env, false)) {
            file = ZVal.assign(zpairResult975.getKey());
            lines = ZVal.assign(zpairResult975.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET, new ReferenceClassProperty(this, "data", env), env, file)) {
                if (!ZVal.isTrue(
                        env.callMethod(this.filter, "isFiltered", CodeCoverage.class, file))) {
                    new ReferenceClassProperty(this, "data", env).arrayAccess(env, file).set(lines);
                }

                continue;
            }

            compareLineNumbers =
                    function_array_unique
                            .f
                            .env(env)
                            .call(
                                    function_array_merge
                                            .f
                                            .env(env)
                                            .call(
                                                    function_array_keys
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    new ReferenceClassProperty(
                                                                                    this, "data",
                                                                                    env)
                                                                            .arrayGet(env, file))
                                                            .value(),
                                                    function_array_keys
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    new ReferenceClassProperty(
                                                                                    that, "data",
                                                                                    env)
                                                                            .arrayGet(env, file))
                                                            .value())
                                            .value())
                            .value();
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult976 : ZVal.getIterable(compareLineNumbers, env, true)) {
                line = ZVal.assign(zpairResult976.getValue());
                thatPriority =
                        this.getLinePriority(
                                env,
                                new ReferenceClassProperty(that, "data", env).arrayGet(env, file),
                                line);
                thisPriority =
                        this.getLinePriority(
                                env,
                                new ReferenceClassProperty(this, "data", env).arrayGet(env, file),
                                line);
                if (ZVal.isGreaterThan(thatPriority, '>', thisPriority)) {
                    new ReferenceClassProperty(this, "data", env)
                            .arrayAccess(env, file, line)
                            .set(
                                    new ReferenceClassProperty(that, "data", env)
                                            .arrayGet(env, file, line));

                } else if (ZVal.toBool(ZVal.strictEqualityCheck(thatPriority, "===", thisPriority))
                        && ZVal.toBool(
                                function_is_array
                                        .f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(this, "data", env)
                                                        .arrayGet(env, file, line))
                                        .value())) {
                    new ReferenceClassProperty(this, "data", env)
                            .arrayAccess(env, file, line)
                            .set(
                                    function_array_unique
                                            .f
                                            .env(env)
                                            .call(
                                                    function_array_merge
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    new ReferenceClassProperty(
                                                                                    this, "data",
                                                                                    env)
                                                                            .arrayGet(
                                                                                    env, file,
                                                                                    line),
                                                                    new ReferenceClassProperty(
                                                                                    that, "data",
                                                                                    env)
                                                                            .arrayGet(
                                                                                    env, file,
                                                                                    line))
                                                            .value())
                                            .value());
                }
            }
        }

        this.tests =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.tests, env.callMethod(that, "getTests", CodeCoverage.class))
                        .value();
        this.report = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setCacheTokens(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.cacheTokens = flag;
        return null;
    }

    @ConvertedMethod
    public Object getCacheTokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cacheTokens);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setCheckForUnintentionallyCoveredCode(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.checkForUnintentionallyCoveredCode = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setForceCoversAnnotation(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.forceCoversAnnotation = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setCheckForMissingCoversAnnotation(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.checkForMissingCoversAnnotation = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setCheckForUnexecutedCoveredCode(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.checkForUnexecutedCoveredCode = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setAddUncoveredFilesFromWhitelist(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.addUncoveredFilesFromWhitelist = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setProcessUncoveredFilesFromWhitelist(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.processUncoveredFilesFromWhitelist = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setDisableIgnoredLines(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.disableIgnoredLines = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flag", typeHint = "bool")
    public Object setIgnoreDeprecatedCode(RuntimeEnv env, Object... args) {
        Object flag = assignParameter(args, 0, false);
        this.ignoreDeprecatedCode = flag;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whitelist", typeHint = "array")
    public Object setUnintentionallyCoveredSubclassesWhitelist(RuntimeEnv env, Object... args) {
        Object whitelist = assignParameter(args, 0, false);
        this.unintentionallyCoveredSubclassesWhitelist = whitelist;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(index = 1, name = "line")
    private Object getLinePriority(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object line = assignParameter(args, 1, false);
        if (!function_array_key_exists.f.env(env).call(line, data.getObject()).getBool()) {
            return 1;
        }

        if (ZVal.toBool(function_is_array.f.env(env).call(data.arrayGet(env, line)).value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_count.f.env(env).call(data.arrayGet(env, line)).value(),
                                "===",
                                0))) {
            return 2;
        }

        if (ZVal.strictEqualityCheck(data.arrayGet(env, line), "===", ZVal.getNull())) {
            return 3;
        }

        return 4;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "linesToBeCovered")
    @ConvertedParameter(index = 2, name = "linesToBeUsed", typeHint = "array")
    @ConvertedParameter(index = 3, name = "ignoreForceCoversAnnotation", typeHint = "bool")
    private Object applyCoversAnnotationFilter(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer linesToBeCovered =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object linesToBeUsed = assignParameter(args, 2, false);
        Object ignoreForceCoversAnnotation = assignParameter(args, 3, false);
        Object filename = null;
        Object _linesToBeCovered = null;
        if (ZVal.toBool(ZVal.strictEqualityCheck(linesToBeCovered.getObject(), "===", false))
                || ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(this.forceCoversAnnotation)
                                                && ZVal.toBool(
                                                        ZVal.isEmpty(linesToBeCovered.getObject())))
                                && ZVal.toBool(!ZVal.isTrue(ignoreForceCoversAnnotation)))) {
            if (ZVal.isTrue(this.checkForMissingCoversAnnotation)) {
                throw ZVal.getException(env, new MissingCoversAnnotationException(env));
            }

            data.setObject(ZVal.newArray());
            return null;
        }

        if (ZVal.isEmpty(linesToBeCovered.getObject())) {
            return null;
        }

        if (ZVal.toBool(this.checkForUnintentionallyCoveredCode)
                && ZVal.toBool(
                        ZVal.toBool(
                                        !ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this.currentId,
                                                        TestCase.class,
                                                        "PHPUnit\\Framework\\TestCase")))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        this.currentId,
                                                                        "isMedium",
                                                                        CodeCoverage.class)))
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        this.currentId,
                                                                        "isLarge",
                                                                        CodeCoverage.class)))))) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, data),
                    "performUnintentionallyCoveredCodeCheck",
                    CodeCoverage.class,
                    data.getObject(),
                    linesToBeCovered.getObject(),
                    linesToBeUsed);
        }

        if (ZVal.isTrue(this.checkForUnexecutedCoveredCode)) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, data),
                    "performUnexecutedCoveredCodeCheck",
                    CodeCoverage.class,
                    data.getObject(),
                    linesToBeCovered.getObject(),
                    linesToBeUsed);
        }

        data.setObject(
                function_array_intersect_key
                        .f
                        .env(env)
                        .call(data.getObject(), linesToBeCovered.getObject())
                        .value());
        for (ZPair zpairResult977 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(data.getObject()).value(), env, true)) {
            filename = ZVal.assign(zpairResult977.getValue());
            _linesToBeCovered =
                    function_array_flip
                            .f
                            .env(env)
                            .call(linesToBeCovered.arrayGet(env, filename))
                            .value();
            data.arrayAccess(env, filename)
                    .set(
                            function_array_intersect_key
                                    .f
                                    .env(env)
                                    .call(data.arrayGet(env, filename), _linesToBeCovered)
                                    .value());
        }

        return null;
    }

    public Object applyCoversAnnotationFilter(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object applyWhitelistFilter(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object filename = null;
        for (ZPair zpairResult978 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(data.getObject()).value(), env, true)) {
            filename = ZVal.assign(zpairResult978.getValue());
            if (ZVal.isTrue(
                    env.callMethod(this.filter, "isFiltered", CodeCoverage.class, filename))) {
                arrayActionR(ArrayAction.UNSET, data, env, filename);
            }
        }

        return null;
    }

    public Object applyWhitelistFilter(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object applyIgnoredLinesFilter(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object filename = null;
        Object line = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult979 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(data.getObject()).value(), env, true)) {
            filename = ZVal.assign(zpairResult979.getValue());
            if (!ZVal.isTrue(env.callMethod(this.filter, "isFile", CodeCoverage.class, filename))) {
                continue;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult980 :
                    ZVal.getIterable(this.getLinesToBeIgnored(env, filename), env, true)) {
                line = ZVal.assign(zpairResult980.getValue());
                arrayActionR(ArrayAction.UNSET, data, env, filename, line);
            }
        }

        return null;
    }

    public Object applyIgnoredLinesFilter(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object initializeFilesThatAreSeenTheFirstTime(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object file = null;
        Object v = null;
        Object k = null;
        Object lines = null;
        for (ZPair zpairResult981 : ZVal.getIterable(data, env, false)) {
            file = ZVal.assign(zpairResult981.getKey());
            lines = ZVal.assign(zpairResult981.getValue());
            if (ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    new ReferenceClassProperty(this, "data", env),
                                    env,
                                    file))
                    && ZVal.toBool(
                            env.callMethod(this.filter, "isFile", CodeCoverage.class, file))) {
                new ReferenceClassProperty(this, "data", env)
                        .arrayAccess(env, file)
                        .set(ZVal.newArray());
                for (ZPair zpairResult982 : ZVal.getIterable(lines, env, false)) {
                    k = ZVal.assign(zpairResult982.getKey());
                    v = ZVal.assign(zpairResult982.getValue());
                    new ReferenceClassProperty(this, "data", env)
                            .arrayAccess(env, file, k)
                            .set(
                                    ZVal.strictEqualityCheck(v, "===", -2)
                                            ? ZVal.getNull()
                                            : ZVal.newArray());
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object addUncoveredFilesFromWhitelist(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object uncoveredFiles = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object lines = null;
        Object uncoveredFile = null;
        data.setObject(ZVal.newArray());
        uncoveredFiles =
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this.filter, "getWhitelist", CodeCoverage.class),
                                function_array_keys.f.env(env).call(this.data).value())
                        .value();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult983 : ZVal.getIterable(uncoveredFiles, env, true)) {
            uncoveredFile = ZVal.assign(zpairResult983.getValue());
            if (!function_file_exists.f.env(env).call(uncoveredFile).getBool()) {
                continue;
            }

            data.arrayAccess(env, uncoveredFile).set(ZVal.newArray());
            lines =
                    function_count
                            .f
                            .env(env)
                            .call(NamespaceGlobal.file.env(env).call(uncoveredFile).value())
                            .value();
            runtimeConverterContinueCount = 0;
            for (i.setObject(1);
                    ZVal.isLessThanOrEqualTo(i.getObject(), "<=", lines);
                    i.setObject(ZVal.increment(i.getObject()))) {
                data.arrayAccess(env, uncoveredFile, i.getObject())
                        .set(Driver.CONST_LINE_NOT_EXECUTED);
            }
        }

        this.append(env, data.getObject(), "UNCOVERED_FILES_FROM_WHITELIST");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileName", typeHint = "string")
    private Object getLinesToBeIgnored(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object fileName = assignParameter(args, 0, false);
        Object endLine = null;
        ReferenceContainer classOrTrait = new BasicReferenceContainer(null);
        Object docblock = null;
        Object line = null;
        Object _token = null;
        ReferenceContainer _pInterface = new BasicReferenceContainer(null);
        Object interfaceStartLine = null;
        ReferenceContainer lastMethod = new BasicReferenceContainer(null);
        Object ignore = null;
        Object tokens = null;
        Object end = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object interfaceEndLine = null;
        Object firstMethodStartLine = null;
        Object lastMethodEndLine = null;
        ReferenceContainer start = new BasicReferenceContainer(null);
        Object index = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer firstMethod = new BasicReferenceContainer(null);
        Object firstMethodEndLine = null;
        Object token = null;
        Object classOrTraitStartLine = null;
        Object stop = null;
        Object classOrTraitEndLine = null;
        Object _line = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "ignoredLines", env),
                env,
                fileName)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "ignoredLines", env).arrayGet(env, fileName));
        }

        new ReferenceClassProperty(this, "ignoredLines", env)
                .arrayAccess(env, fileName)
                .set(ZVal.newArray());
        lines.setObject(NamespaceGlobal.file.env(env).call(fileName).value());
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult984 : ZVal.getIterable(lines.getObject(), env, false)) {
            index = ZVal.assign(zpairResult984.getKey());
            line = ZVal.assign(zpairResult984.getValue());
            if (!function_trim.f.env(env).call(line).getBool()) {
                new ReferenceClassProperty(this, "ignoredLines", env)
                        .arrayAppend(env, fileName)
                        .set(ZVal.add(index, 1));
            }
        }

        if (ZVal.isTrue(this.cacheTokens)) {
            tokens = PHP_Token_Stream_CachingFactory.runtimeStaticObject.get(env, fileName);

        } else {
            tokens = new PHP_Token_Stream(env, fileName);
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult985 :
                ZVal.getIterable(
                        env.callMethod(tokens, "getInterfaces", CodeCoverage.class), env, true)) {
            _pInterface.setObject(ZVal.assign(zpairResult985.getValue()));
            interfaceStartLine = ZVal.assign(_pInterface.arrayGet(env, "startLine"));
            interfaceEndLine = ZVal.assign(_pInterface.arrayGet(env, "endLine"));
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult986 :
                    ZVal.getIterable(
                            function_range
                                    .f
                                    .env(env)
                                    .call(interfaceStartLine, interfaceEndLine)
                                    .value(),
                            env,
                            true)) {
                line = ZVal.assign(zpairResult986.getValue());
                new ReferenceClassProperty(this, "ignoredLines", env)
                        .arrayAppend(env, fileName)
                        .set(line);
            }
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult987 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(tokens, "getClasses", CodeCoverage.class),
                                        env.callMethod(tokens, "getTraits", CodeCoverage.class))
                                .value(),
                        env,
                        true)) {
            classOrTrait.setObject(ZVal.assign(zpairResult987.getValue()));
            classOrTraitStartLine = ZVal.assign(classOrTrait.arrayGet(env, "startLine"));
            classOrTraitEndLine = ZVal.assign(classOrTrait.arrayGet(env, "endLine"));
            if (arrayActionR(ArrayAction.EMPTY, classOrTrait, env, "methods")) {
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult988 :
                        ZVal.getIterable(
                                function_range
                                        .f
                                        .env(env)
                                        .call(classOrTraitStartLine, classOrTraitEndLine)
                                        .value(),
                                env,
                                true)) {
                    line = ZVal.assign(zpairResult988.getValue());
                    new ReferenceClassProperty(this, "ignoredLines", env)
                            .arrayAppend(env, fileName)
                            .set(line);
                }

                continue;
            }

            firstMethod.setObject(
                    function_array_shift
                            .f
                            .env(env)
                            .call(classOrTrait.arrayGet(env, "methods"))
                            .value());
            firstMethodStartLine = ZVal.assign(firstMethod.arrayGet(env, "startLine"));
            firstMethodEndLine = ZVal.assign(firstMethod.arrayGet(env, "endLine"));
            lastMethodEndLine = ZVal.assign(firstMethodEndLine);
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            do {
                lastMethod.setObject(
                        function_array_pop
                                .f
                                .env(env)
                                .call(classOrTrait.arrayGet(env, "methods"))
                                .value());

            } while (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    lastMethod.getObject(), "!==", ZVal.getNull()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(
                                                    lastMethod.arrayGet(env, "signature"),
                                                    "anonymousFunction")
                                            .value())));

            if (ZVal.strictNotEqualityCheck(lastMethod.getObject(), "!==", ZVal.getNull())) {
                lastMethodEndLine = ZVal.assign(lastMethod.arrayGet(env, "endLine"));
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult989 :
                    ZVal.getIterable(
                            function_range
                                    .f
                                    .env(env)
                                    .call(classOrTraitStartLine, firstMethodStartLine)
                                    .value(),
                            env,
                            true)) {
                line = ZVal.assign(zpairResult989.getValue());
                new ReferenceClassProperty(this, "ignoredLines", env)
                        .arrayAppend(env, fileName)
                        .set(line);
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult990 :
                    ZVal.getIterable(
                            function_range
                                    .f
                                    .env(env)
                                    .call(ZVal.add(lastMethodEndLine, 1), classOrTraitEndLine)
                                    .value(),
                            env,
                            true)) {
                line = ZVal.assign(zpairResult990.getValue());
                new ReferenceClassProperty(this, "ignoredLines", env)
                        .arrayAppend(env, fileName)
                        .set(line);
            }
        }

        if (ZVal.isTrue(this.disableIgnoredLines)) {
            new ReferenceClassProperty(this, "ignoredLines", env)
                    .arrayAccess(env, fileName)
                    .set(
                            function_array_unique
                                    .f
                                    .env(env)
                                    .call(
                                            new ReferenceClassProperty(this, "ignoredLines", env)
                                                    .arrayGet(env, fileName))
                                    .value());
            function_sort
                    .f
                    .env(env)
                    .call(
                            new ReferenceClassProperty(this, "ignoredLines", env)
                                    .arrayGet(env, fileName));
            return ZVal.assign(
                    new ReferenceClassProperty(this, "ignoredLines", env).arrayGet(env, fileName));
        }

        ignore = false;
        stop = false;
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult991 :
                ZVal.getIterable(env.callMethod(tokens, "tokens", CodeCoverage.class), env, true)) {
            token = ZVal.assign(zpairResult991.getValue());
            SwitchEnumType55 switchVariable55 =
                    ZVal.getEnum(
                            function_get_class.f.env(env).call(token).value(),
                            SwitchEnumType55.DEFAULT_CASE,
                            SwitchEnumType55.DYNAMIC_TYPE_165,
                            PHP_Token_COMMENT.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_166,
                            PHP_Token_DOC_COMMENT.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_167,
                            PHP_Token_INTERFACE.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_168,
                            PHP_Token_TRAIT.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_169,
                            PHP_Token_CLASS.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_170,
                            PHP_Token_FUNCTION.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_171,
                            PHP_Token_NAMESPACE.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_172,
                            PHP_Token_DECLARE.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_173,
                            PHP_Token_OPEN_TAG.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_174,
                            PHP_Token_CLOSE_TAG.CONST_class,
                            SwitchEnumType55.DYNAMIC_TYPE_175,
                            PHP_Token_USE.CONST_class);
            switch (switchVariable55) {
                case DYNAMIC_TYPE_165:
                case DYNAMIC_TYPE_166:
                    _token = function_trim.f.env(env).call(token).value();
                    _line =
                            function_trim
                                    .f
                                    .env(env)
                                    .call(
                                            lines.arrayGet(
                                                    env,
                                                    ZVal.subtract(
                                                            env.callMethod(
                                                                    token,
                                                                    "getLine",
                                                                    CodeCoverage.class),
                                                            1)))
                                    .value();
                    if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "// @codeCoverageIgnore"))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "//@codeCoverageIgnore"))) {
                        ignore = true;
                        stop = true;

                    } else if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "// @codeCoverageIgnoreStart"))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "//@codeCoverageIgnoreStart"))) {
                        ignore = true;

                    } else if (ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "// @codeCoverageIgnoreEnd"))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            _token, "===", "//@codeCoverageIgnoreEnd"))) {
                        stop = true;
                    }

                    if (!ZVal.isTrue(ignore)) {
                        start.setObject(env.callMethod(token, "getLine", CodeCoverage.class));
                        end =
                                ZVal.add(
                                        start.getObject(),
                                        NamespaceGlobal.substr_count
                                                .env(env)
                                                .call(token, "\n")
                                                .value());
                        if (ZVal.strictNotEqualityCheck(
                                0, "!==", function_strpos.f.env(env).call(_token, _line).value())) {
                            start.setObject(ZVal.increment(start.getObject()));
                        }

                        runtimeConverterBreakCount = 0;
                        runtimeConverterContinueCount = 0;
                        for (i.setObject(ZVal.assign(start.getObject()));
                                ZVal.isLessThan(i.getObject(), '<', end);
                                i.setObject(ZVal.increment(i.getObject()))) {
                            new ReferenceClassProperty(this, "ignoredLines", env)
                                    .arrayAppend(env, fileName)
                                    .set(i.getObject());
                        }

                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        arrayActionR(
                                                                ArrayAction.ISSET,
                                                                lines,
                                                                env,
                                                                ZVal.subtract(i.getObject(), 1)))
                                                && ZVal.toBool(
                                                        ZVal.strictEqualityCheck(
                                                                0,
                                                                "===",
                                                                function_strpos
                                                                        .f
                                                                        .env(env)
                                                                        .call(_token, "/*")
                                                                        .value())))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                "*/",
                                                "===",
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                function_trim
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                lines.arrayGet(
                                                                                        env,
                                                                                        ZVal
                                                                                                .subtract(
                                                                                                        i
                                                                                                                .getObject(),
                                                                                                        1)))
                                                                        .value(),
                                                                -2)
                                                        .value()))) {
                            new ReferenceClassProperty(this, "ignoredLines", env)
                                    .arrayAppend(env, fileName)
                                    .set(i.getObject());
                        }
                    }

                    break;
                case DYNAMIC_TYPE_167:
                case DYNAMIC_TYPE_168:
                case DYNAMIC_TYPE_169:
                case DYNAMIC_TYPE_170:
                    docblock = env.callMethod(token, "getDocblock", CodeCoverage.class);
                    new ReferenceClassProperty(this, "ignoredLines", env)
                            .arrayAppend(env, fileName)
                            .set(env.callMethod(token, "getLine", CodeCoverage.class));
                    if (ZVal.toBool(
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(docblock, "@codeCoverageIgnore")
                                            .value())
                            || ZVal.toBool(
                                    ZVal.toBool(this.ignoreDeprecatedCode)
                                            && ZVal.toBool(
                                                    function_strpos
                                                            .f
                                                            .env(env)
                                                            .call(docblock, "@deprecated")
                                                            .value()))) {
                        endLine = env.callMethod(token, "getEndLine", CodeCoverage.class);
                        runtimeConverterBreakCount = 0;
                        runtimeConverterContinueCount = 0;
                        for (i.setObject(env.callMethod(token, "getLine", CodeCoverage.class));
                                ZVal.isLessThanOrEqualTo(i.getObject(), "<=", endLine);
                                i.setObject(ZVal.increment(i.getObject()))) {
                            new ReferenceClassProperty(this, "ignoredLines", env)
                                    .arrayAppend(env, fileName)
                                    .set(i.getObject());
                        }
                    }

                    break;
                case DYNAMIC_TYPE_171:
                    new ReferenceClassProperty(this, "ignoredLines", env)
                            .arrayAppend(env, fileName)
                            .set(env.callMethod(token, "getEndLine", CodeCoverage.class));
                case DYNAMIC_TYPE_172:
                case DYNAMIC_TYPE_173:
                case DYNAMIC_TYPE_174:
                case DYNAMIC_TYPE_175:
                    new ReferenceClassProperty(this, "ignoredLines", env)
                            .arrayAppend(env, fileName)
                            .set(env.callMethod(token, "getLine", CodeCoverage.class));
                    break;
            }
            ;
            if (ZVal.isTrue(ignore)) {
                new ReferenceClassProperty(this, "ignoredLines", env)
                        .arrayAppend(env, fileName)
                        .set(env.callMethod(token, "getLine", CodeCoverage.class));
                if (ZVal.isTrue(stop)) {
                    ignore = false;
                    stop = false;
                }
            }
        }

        new ReferenceClassProperty(this, "ignoredLines", env)
                .arrayAppend(env, fileName)
                .set(ZVal.add(function_count.f.env(env).call(lines.getObject()).value(), 1));
        new ReferenceClassProperty(this, "ignoredLines", env)
                .arrayAccess(env, fileName)
                .set(
                        function_array_unique
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "ignoredLines", env)
                                                .arrayGet(env, fileName))
                                .value());
        new ReferenceClassProperty(this, "ignoredLines", env)
                .arrayAccess(env, fileName)
                .set(
                        function_array_unique
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "ignoredLines", env)
                                                .arrayGet(env, fileName))
                                .value());
        function_sort
                .f
                .env(env)
                .call(
                        new ReferenceClassProperty(this, "ignoredLines", env)
                                .arrayGet(env, fileName));
        return ZVal.assign(
                new ReferenceClassProperty(this, "ignoredLines", env).arrayGet(env, fileName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "linesToBeCovered", typeHint = "array")
    @ConvertedParameter(index = 2, name = "linesToBeUsed", typeHint = "array")
    private Object performUnintentionallyCoveredCodeCheck(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object linesToBeCovered = assignParameter(args, 1, false);
        Object linesToBeUsed = assignParameter(args, 2, false);
        Object _data = null;
        Object file = null;
        Object flag = null;
        Object line = null;
        ReferenceContainer unintentionallyCoveredUnits = new BasicReferenceContainer(null);
        ReferenceContainer allowedLines = new BasicReferenceContainer(null);
        allowedLines.setObject(this.getAllowedLines(env, linesToBeCovered, linesToBeUsed));
        unintentionallyCoveredUnits.setObject(ZVal.newArray());
        for (ZPair zpairResult992 : ZVal.getIterable(data.getObject(), env, false)) {
            file = ZVal.assign(zpairResult992.getKey());
            _data = ZVal.assign(zpairResult992.getValue());
            for (ZPair zpairResult993 : ZVal.getIterable(_data, env, false)) {
                line = ZVal.assign(zpairResult993.getKey());
                flag = ZVal.assign(zpairResult993.getValue());
                if (ZVal.toBool(ZVal.strictEqualityCheck(flag, "===", 1))
                        && ZVal.toBool(
                                !arrayActionR(ArrayAction.ISSET, allowedLines, env, file, line))) {
                    unintentionallyCoveredUnits
                            .arrayAppend(env)
                            .set(
                                    env.callMethod(
                                            this.wizard, "lookup", CodeCoverage.class, file, line));
                }
            }
        }

        unintentionallyCoveredUnits.setObject(
                this.processUnintentionallyCoveredUnits(
                        env, unintentionallyCoveredUnits.getObject()));
        if (!ZVal.isEmpty(unintentionallyCoveredUnits.getObject())) {
            throw ZVal.getException(
                    env,
                    new UnintentionallyCoveredCodeException(
                            env, unintentionallyCoveredUnits.getObject()));
        }

        return null;
    }

    public Object performUnintentionallyCoveredCodeCheck(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    @ConvertedParameter(index = 1, name = "linesToBeCovered", typeHint = "array")
    @ConvertedParameter(index = 2, name = "linesToBeUsed", typeHint = "array")
    private Object performUnexecutedCoveredCodeCheck(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object linesToBeCovered = assignParameter(args, 1, false);
        Object linesToBeUsed = assignParameter(args, 2, false);
        Object codeUnit = null;
        Object executedCodeUnits = null;
        Object message = null;
        executedCodeUnits = this.coverageToCodeUnits(env, data.getObject());
        message = "";
        for (ZPair zpairResult994 :
                ZVal.getIterable(this.linesToCodeUnits(env, linesToBeCovered), env, true)) {
            codeUnit = ZVal.assign(zpairResult994.getValue());
            if (!function_in_array.f.env(env).call(codeUnit, executedCodeUnits).getBool()) {
                message =
                        toStringR(message, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "- %s is expected to be executed (@covers) but was not executed"
                                                                + "\n",
                                                        codeUnit)
                                                .value(),
                                        env);
            }
        }

        for (ZPair zpairResult995 :
                ZVal.getIterable(this.linesToCodeUnits(env, linesToBeUsed), env, true)) {
            codeUnit = ZVal.assign(zpairResult995.getValue());
            if (!function_in_array.f.env(env).call(codeUnit, executedCodeUnits).getBool()) {
                message =
                        toStringR(message, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "- %s is expected to be executed (@uses) but was not executed"
                                                                + "\n",
                                                        codeUnit)
                                                .value(),
                                        env);
            }
        }

        if (!ZVal.isEmpty(message)) {
            throw ZVal.getException(env, new CoveredCodeNotExecutedException(env, message));
        }

        return null;
    }

    public Object performUnexecutedCoveredCodeCheck(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "linesToBeCovered", typeHint = "array")
    @ConvertedParameter(index = 1, name = "linesToBeUsed", typeHint = "array")
    private Object getAllowedLines(RuntimeEnv env, Object... args) {
        ReferenceContainer linesToBeCovered =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer linesToBeUsed =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object file = null;
        ReferenceContainer allowedLines = new BasicReferenceContainer(null);
        allowedLines.setObject(ZVal.newArray());
        for (ZPair zpairResult996 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(linesToBeCovered.getObject()).value(),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult996.getValue());
            if (!arrayActionR(ArrayAction.ISSET, allowedLines, env, file)) {
                allowedLines.arrayAccess(env, file).set(ZVal.newArray());
            }

            allowedLines
                    .arrayAccess(env, file)
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            allowedLines.arrayGet(env, file),
                                            linesToBeCovered.arrayGet(env, file))
                                    .value());
        }

        for (ZPair zpairResult997 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(linesToBeUsed.getObject()).value(),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult997.getValue());
            if (!arrayActionR(ArrayAction.ISSET, allowedLines, env, file)) {
                allowedLines.arrayAccess(env, file).set(ZVal.newArray());
            }

            allowedLines
                    .arrayAccess(env, file)
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            allowedLines.arrayGet(env, file),
                                            linesToBeUsed.arrayGet(env, file))
                                    .value());
        }

        for (ZPair zpairResult998 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(allowedLines.getObject()).value(),
                        env,
                        true)) {
            file = ZVal.assign(zpairResult998.getValue());
            allowedLines
                    .arrayAccess(env, file)
                    .set(
                            function_array_flip
                                    .f
                                    .env(env)
                                    .call(
                                            function_array_unique
                                                    .f
                                                    .env(env)
                                                    .call(allowedLines.arrayGet(env, file))
                                                    .value())
                                    .value());
        }

        return ZVal.assign(allowedLines.getObject());
    }

    @ConvertedMethod
    private Object selectDriver(RuntimeEnv env, Object... args) {
        Object runtime = null;
        runtime = new Runtime(env);
        if (!ZVal.isTrue(env.callMethod(runtime, "canCollectCodeCoverage", CodeCoverage.class))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "No code coverage driver available"));
        }

        if (ZVal.isTrue(env.callMethod(runtime, "isPHPDBG", CodeCoverage.class))) {
            return ZVal.assign(new PHPDBG(env));
        }

        if (ZVal.isTrue(env.callMethod(runtime, "hasXdebug", CodeCoverage.class))) {
            return ZVal.assign(new Xdebug(env));
        }

        throw ZVal.getException(
                env, new RuntimeException(env, "No code coverage driver available"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unintentionallyCoveredUnits", typeHint = "array")
    private Object processUnintentionallyCoveredUnits(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        ReferenceContainer unintentionallyCoveredUnits =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer unit = new BasicReferenceContainer(null);
        Object v = null;
        Object k = null;
        Object whitelisted = null;
        Object _pClass = null;
        unintentionallyCoveredUnits.setObject(
                function_array_unique
                        .f
                        .env(env)
                        .call(unintentionallyCoveredUnits.getObject())
                        .value());
        function_sort.f.env(env).call(unintentionallyCoveredUnits.getObject());
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult999 :
                ZVal.getIterable(
                        function_array_keys
                                .f
                                .env(env)
                                .call(unintentionallyCoveredUnits.getObject())
                                .value(),
                        env,
                        false)) {
            k = ZVal.assign(zpairResult999.getKey());
            v = ZVal.assign(zpairResult999.getValue());
            unit.setObject(
                    function_explode
                            .f
                            .env(env)
                            .call("::", unintentionallyCoveredUnits.arrayGet(env, k))
                            .value());
            if (ZVal.strictNotEqualityCheck(
                    function_count.f.env(env).call(unit.getObject()).value(), "!==", 2)) {
                continue;
            }

            _pClass = new ReflectionClass(env, unit.arrayGet(env, 0));
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1000 :
                    ZVal.getIterable(this.unintentionallyCoveredSubclassesWhitelist, env, true)) {
                whitelisted = ZVal.assign(zpairResult1000.getValue());
                if (ZVal.isTrue(
                        env.callMethod(_pClass, "isSubclassOf", CodeCoverage.class, whitelisted))) {
                    arrayActionR(ArrayAction.UNSET, unintentionallyCoveredUnits, env, k);
                    break;
                }
            }
        }

        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(unintentionallyCoveredUnits.getObject())
                        .value());
    }

    @ConvertedMethod
    private Object initializeData(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope47 scope = new Scope47();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/phpunit/php-code-coverage/src")
                            .setFile("/vendor/phpunit/php-code-coverage/src/CodeCoverage.php");
            int runtimeConverterContinueCount;
            scope.coverage = null;
            scope.file = null;
            scope.data = new BasicReferenceContainer(null);
            scope.fileCoverage = new BasicReferenceContainer(null);
            scope.key = null;
            this.isInitialized = true;
            if (ZVal.isTrue(this.processUncoveredFilesFromWhitelist)) {
                this.shouldCheckForDeadAndUnused = false;
                env.callMethod(this.driver, "start", CodeCoverage.class);
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1001 :
                        ZVal.getIterable(
                                env.callMethod(this.filter, "getWhitelist", CodeCoverage.class),
                                env,
                                true)) {
                    scope.file = ZVal.assign(zpairResult1001.getValue());
                    if (ZVal.isTrue(
                            env.callMethod(
                                    this.filter, "isFile", CodeCoverage.class, scope.file))) {
                        env.include(
                                toStringR(scope.file, env),
                                stack,
                                runtimeConverterFunctionClassConstants,
                                false,
                                true);
                    }
                }

                scope.data.setObject(ZVal.newArray());
                scope.coverage = env.callMethod(this.driver, "stop", CodeCoverage.class);
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1002 : ZVal.getIterable(scope.coverage, env, false)) {
                    scope.file = ZVal.assign(zpairResult1002.getKey());
                    scope.fileCoverage.setObject(ZVal.assign(zpairResult1002.getValue()));
                    if (ZVal.isTrue(
                            env.callMethod(
                                    this.filter, "isFiltered", CodeCoverage.class, scope.file))) {
                        continue;
                    }

                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult1003 :
                            ZVal.getIterable(
                                    function_array_keys
                                            .f
                                            .env(env)
                                            .call(scope.fileCoverage.getObject())
                                            .value(),
                                    env,
                                    true)) {
                        scope.key = ZVal.assign(zpairResult1003.getValue());
                        if (ZVal.strictEqualityCheck(
                                scope.fileCoverage.arrayGet(env, scope.key),
                                "===",
                                Driver.CONST_LINE_EXECUTED)) {
                            scope.fileCoverage
                                    .arrayAccess(env, scope.key)
                                    .set(Driver.CONST_LINE_NOT_EXECUTED);
                        }
                    }

                    scope.data.arrayAccess(env, scope.file).set(scope.fileCoverage.getObject());
                }

                this.append(env, scope.data.getObject(), "UNCOVERED_FILES_FROM_WHITELIST");
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object coverageToCodeUnits(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        ReferenceContainer codeUnits = new BasicReferenceContainer(null);
        Object filename = null;
        Object flag = null;
        Object line = null;
        Object lines = null;
        codeUnits.setObject(ZVal.newArray());
        for (ZPair zpairResult1004 : ZVal.getIterable(data, env, false)) {
            filename = ZVal.assign(zpairResult1004.getKey());
            lines = ZVal.assign(zpairResult1004.getValue());
            for (ZPair zpairResult1005 : ZVal.getIterable(lines, env, false)) {
                line = ZVal.assign(zpairResult1005.getKey());
                flag = ZVal.assign(zpairResult1005.getValue());
                if (ZVal.strictEqualityCheck(flag, "===", 1)) {
                    codeUnits
                            .arrayAppend(env)
                            .set(
                                    env.callMethod(
                                            this.wizard,
                                            "lookup",
                                            CodeCoverage.class,
                                            filename,
                                            line));
                }
            }
        }

        return ZVal.assign(function_array_unique.f.env(env).call(codeUnits.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    private Object linesToCodeUnits(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        ReferenceContainer codeUnits = new BasicReferenceContainer(null);
        Object filename = null;
        Object line = null;
        Object lines = null;
        codeUnits.setObject(ZVal.newArray());
        for (ZPair zpairResult1006 : ZVal.getIterable(data, env, false)) {
            filename = ZVal.assign(zpairResult1006.getKey());
            lines = ZVal.assign(zpairResult1006.getValue());
            for (ZPair zpairResult1007 : ZVal.getIterable(lines, env, true)) {
                line = ZVal.assign(zpairResult1007.getValue());
                codeUnits
                        .arrayAppend(env)
                        .set(
                                env.callMethod(
                                        this.wizard, "lookup", CodeCoverage.class, filename, line));
            }
        }

        return ZVal.assign(function_array_unique.f.env(env).call(codeUnits.getObject()).value());
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\CodeCoverage";

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
                    .setName("SebastianBergmann\\CodeCoverage\\CodeCoverage")
                    .setLookup(
                            CodeCoverage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "addUncoveredFilesFromWhitelist",
                            "cacheTokens",
                            "checkForMissingCoversAnnotation",
                            "checkForUnexecutedCoveredCode",
                            "checkForUnintentionallyCoveredCode",
                            "currentId",
                            "data",
                            "disableIgnoredLines",
                            "driver",
                            "filter",
                            "forceCoversAnnotation",
                            "ignoreDeprecatedCode",
                            "ignoredLines",
                            "isInitialized",
                            "processUncoveredFilesFromWhitelist",
                            "report",
                            "shouldCheckForDeadAndUnused",
                            "tests",
                            "unintentionallyCoveredSubclassesWhitelist",
                            "wizard")
                    .setFilename("vendor/phpunit/php-code-coverage/src/CodeCoverage.php")
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

    private static class Scope47 implements UpdateRuntimeScopeInterface {

        Object coverage;
        Object file;
        ReferenceContainer data;
        ReferenceContainer fileCoverage;
        Object _thisVarAlias;
        Object key;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("coverage", this.coverage);
            stack.setVariable("file", this.file);
            stack.setVariable("data", this.data);
            stack.setVariable("fileCoverage", this.fileCoverage);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("key", this.key);
        }

        public void updateScope(RuntimeStack stack) {

            this.coverage = stack.getVariable("coverage");
            this.file = stack.getVariable("file");
            this.data = ZVal.getStackReference(stack.getVariable("data"));
            this.fileCoverage = ZVal.getStackReference(stack.getVariable("fileCoverage"));
            this._thisVarAlias = stack.getVariable("this");
            this.key = stack.getVariable("key");
        }
    }

    private enum SwitchEnumType55 {
        DYNAMIC_TYPE_165,
        DYNAMIC_TYPE_166,
        DYNAMIC_TYPE_167,
        DYNAMIC_TYPE_168,
        DYNAMIC_TYPE_169,
        DYNAMIC_TYPE_170,
        DYNAMIC_TYPE_171,
        DYNAMIC_TYPE_172,
        DYNAMIC_TYPE_173,
        DYNAMIC_TYPE_174,
        DYNAMIC_TYPE_175,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
