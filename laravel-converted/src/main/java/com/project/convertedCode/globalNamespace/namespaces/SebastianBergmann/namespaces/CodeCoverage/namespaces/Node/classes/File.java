package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.AbstractNode;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream_CachingFactory;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_Stream;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import java.lang.Math;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/File.php

*/

public final class File extends AbstractNode {

    public Object coverageData = null;

    public Object testData = null;

    public Object numExecutableLines = 0;

    public Object numExecutedLines = 0;

    public Object classes = ZVal.newArray();

    public Object traits = ZVal.newArray();

    public Object functions = ZVal.newArray();

    public Object linesOfCode = ZVal.newArray();

    public Object numClasses = null;

    public Object numTestedClasses = 0;

    public Object numTraits = null;

    public Object numTestedTraits = 0;

    public Object numMethods = null;

    public Object numTestedMethods = null;

    public Object numTestedFunctions = null;

    public Object cacheTokens = null;

    public Object codeUnitsByLine = ZVal.newArray();

    public File(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == File.class) {
            this.__construct(env, args);
        }
    }

    public File(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "parent",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    @ConvertedParameter(index = 2, name = "coverageData", typeHint = "array")
    @ConvertedParameter(index = 3, name = "testData", typeHint = "array")
    @ConvertedParameter(index = 4, name = "cacheTokens", typeHint = "bool")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object coverageData = assignParameter(args, 2, false);
        Object testData = assignParameter(args, 3, false);
        Object cacheTokens = assignParameter(args, 4, false);
        super.__construct(env, name, parent);
        this.coverageData = coverageData;
        this.testData = testData;
        this.cacheTokens = cacheTokens;
        this.calculateStatistics(env);
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return 1;
    }

    @ConvertedMethod
    public Object getCoverageData(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.coverageData);
    }

    @ConvertedMethod
    public Object getTestData(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.testData);
    }

    @ConvertedMethod
    public Object getClasses(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.classes);
    }

    @ConvertedMethod
    public Object getTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.traits);
    }

    @ConvertedMethod
    public Object getFunctions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.functions);
    }

    @ConvertedMethod
    public Object getLinesOfCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.linesOfCode);
    }

    @ConvertedMethod
    public Object getNumExecutableLines(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.numExecutableLines);
    }

    @ConvertedMethod
    public Object getNumExecutedLines(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.numExecutedLines);
    }

    @ConvertedMethod
    public Object getNumClasses(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer method = new BasicReferenceContainer(null);
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(this.numClasses, "===", ZVal.getNull())) {
            this.numClasses = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1035 : ZVal.getIterable(this.classes, env, true)) {
                _pClass.setObject(ZVal.assign(zpairResult1035.getValue()));
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1036 :
                        ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, true)) {
                    method.setObject(ZVal.assign(zpairResult1036.getValue()));
                    if (ZVal.isGreaterThan(method.arrayGet(env, "executableLines"), '>', 0)) {
                        this.numClasses = ZVal.increment(this.numClasses);
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }
            }
        }

        return ZVal.assign(this.numClasses);
    }

    @ConvertedMethod
    public Object getNumTestedClasses(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.numTestedClasses);
    }

    @ConvertedMethod
    public Object getNumTraits(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer method = new BasicReferenceContainer(null);
        ReferenceContainer trait = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(this.numTraits, "===", ZVal.getNull())) {
            this.numTraits = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1037 : ZVal.getIterable(this.traits, env, true)) {
                trait.setObject(ZVal.assign(zpairResult1037.getValue()));
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1038 :
                        ZVal.getIterable(trait.arrayGet(env, "methods"), env, true)) {
                    method.setObject(ZVal.assign(zpairResult1038.getValue()));
                    if (ZVal.isGreaterThan(method.arrayGet(env, "executableLines"), '>', 0)) {
                        this.numTraits = ZVal.increment(this.numTraits);
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }
            }
        }

        return ZVal.assign(this.numTraits);
    }

    @ConvertedMethod
    public Object getNumTestedTraits(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.numTestedTraits);
    }

    @ConvertedMethod
    public Object getNumMethods(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(null);
        ReferenceContainer trait = new BasicReferenceContainer(null);
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(this.numMethods, "===", ZVal.getNull())) {
            this.numMethods = 0;
            for (ZPair zpairResult1039 : ZVal.getIterable(this.classes, env, true)) {
                _pClass.setObject(ZVal.assign(zpairResult1039.getValue()));
                for (ZPair zpairResult1040 :
                        ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, true)) {
                    method.setObject(ZVal.assign(zpairResult1040.getValue()));
                    if (ZVal.isGreaterThan(method.arrayGet(env, "executableLines"), '>', 0)) {
                        this.numMethods = ZVal.increment(this.numMethods);
                    }
                }
            }

            for (ZPair zpairResult1041 : ZVal.getIterable(this.traits, env, true)) {
                trait.setObject(ZVal.assign(zpairResult1041.getValue()));
                for (ZPair zpairResult1042 :
                        ZVal.getIterable(trait.arrayGet(env, "methods"), env, true)) {
                    method.setObject(ZVal.assign(zpairResult1042.getValue()));
                    if (ZVal.isGreaterThan(method.arrayGet(env, "executableLines"), '>', 0)) {
                        this.numMethods = ZVal.increment(this.numMethods);
                    }
                }
            }
        }

        return ZVal.assign(this.numMethods);
    }

    @ConvertedMethod
    public Object getNumTestedMethods(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(null);
        ReferenceContainer trait = new BasicReferenceContainer(null);
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(this.numTestedMethods, "===", ZVal.getNull())) {
            this.numTestedMethods = 0;
            for (ZPair zpairResult1043 : ZVal.getIterable(this.classes, env, true)) {
                _pClass.setObject(ZVal.assign(zpairResult1043.getValue()));
                for (ZPair zpairResult1044 :
                        ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, true)) {
                    method.setObject(ZVal.assign(zpairResult1044.getValue()));
                    if (ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            method.arrayGet(env, "executableLines"), '>', 0))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            method.arrayGet(env, "coverage"), "===", 100))) {
                        this.numTestedMethods = ZVal.increment(this.numTestedMethods);
                    }
                }
            }

            for (ZPair zpairResult1045 : ZVal.getIterable(this.traits, env, true)) {
                trait.setObject(ZVal.assign(zpairResult1045.getValue()));
                for (ZPair zpairResult1046 :
                        ZVal.getIterable(trait.arrayGet(env, "methods"), env, true)) {
                    method.setObject(ZVal.assign(zpairResult1046.getValue()));
                    if (ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            method.arrayGet(env, "executableLines"), '>', 0))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            method.arrayGet(env, "coverage"), "===", 100))) {
                        this.numTestedMethods = ZVal.increment(this.numTestedMethods);
                    }
                }
            }
        }

        return ZVal.assign(this.numTestedMethods);
    }

    @ConvertedMethod
    public Object getNumFunctions(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.functions).value());
    }

    @ConvertedMethod
    public Object getNumTestedFunctions(RuntimeEnv env, Object... args) {
        ReferenceContainer function = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(this.numTestedFunctions, "===", ZVal.getNull())) {
            this.numTestedFunctions = 0;
            for (ZPair zpairResult1047 : ZVal.getIterable(this.functions, env, true)) {
                function.setObject(ZVal.assign(zpairResult1047.getValue()));
                if (ZVal.toBool(
                                ZVal.isGreaterThan(
                                        function.arrayGet(env, "executableLines"), '>', 0))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function.arrayGet(env, "coverage"), "===", 100))) {
                    this.numTestedFunctions = ZVal.increment(this.numTestedFunctions);
                }
            }
        }

        return ZVal.assign(this.numTestedFunctions);
    }

    @ConvertedMethod
    private Object calculateStatistics(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(null);
        ReferenceContainer codeUnit = new BasicReferenceContainer(null);
        ReferenceContainer function = new BasicReferenceContainer(null);
        ReferenceContainer trait = new BasicReferenceContainer(null);
        Object tokens = null;
        Object lineNumber = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        if (ZVal.isTrue(this.cacheTokens)) {
            tokens =
                    PHP_Token_Stream_CachingFactory.runtimeStaticObject.get(
                            env, env.callMethod(this, "getPath", File.class));

        } else {
            tokens = new PHP_Token_Stream(env, env.callMethod(this, "getPath", File.class));
        }

        this.linesOfCode = env.callMethod(tokens, "getLinesOfCode", File.class);
        for (ZPair zpairResult1048 :
                ZVal.getIterable(
                        function_range
                                .f
                                .env(env)
                                .call(
                                        1,
                                        new ReferenceClassProperty(this, "linesOfCode", env)
                                                .arrayGet(env, "loc"))
                                .value(),
                        env,
                        true)) {
            lineNumber = ZVal.assign(zpairResult1048.getValue());
            new ReferenceClassProperty(this, "codeUnitsByLine", env)
                    .arrayAccess(env, lineNumber)
                    .set(ZVal.newArray());
        }

        this.processClasses(env, tokens);
        this.processTraits(env, tokens);
        this.processFunctions(env, tokens);
        tokens = null;
        for (ZPair zpairResult1049 :
                ZVal.getIterable(
                        function_range
                                .f
                                .env(env)
                                .call(
                                        1,
                                        new ReferenceClassProperty(this, "linesOfCode", env)
                                                .arrayGet(env, "loc"))
                                .value(),
                        env,
                        true)) {
            lineNumber = ZVal.assign(zpairResult1049.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "coverageData", env),
                    env,
                    lineNumber)) {
                for (ZPair zpairResult1050 :
                        ZVal.getIterable(
                                new ReferenceClassProperty(this, "codeUnitsByLine", env)
                                        .arrayGet(env, lineNumber),
                                env,
                                true)) {
                    codeUnit = zpairResult1050;
                    codeUnit.arrayAccess(env, "executableLines")
                            .set(ZVal.increment(codeUnit.arrayGet(env, "executableLines")));
                }

                codeUnit.setObject(null);
                this.numExecutableLines = ZVal.increment(this.numExecutableLines);
                if (ZVal.isGreaterThan(
                        function_count
                                .f
                                .env(env)
                                .call(
                                        new ReferenceClassProperty(this, "coverageData", env)
                                                .arrayGet(env, lineNumber))
                                .value(),
                        '>',
                        0)) {
                    for (ZPair zpairResult1051 :
                            ZVal.getIterable(
                                    new ReferenceClassProperty(this, "codeUnitsByLine", env)
                                            .arrayGet(env, lineNumber),
                                    env,
                                    true)) {
                        codeUnit = zpairResult1051;
                        codeUnit.arrayAccess(env, "executedLines")
                                .set(ZVal.increment(codeUnit.arrayGet(env, "executedLines")));
                    }

                    codeUnit.setObject(null);
                    this.numExecutedLines = ZVal.increment(this.numExecutedLines);
                }
            }
        }

        for (ZPair zpairResult1052 : ZVal.getIterable(this.traits, env, true)) {
            trait = zpairResult1052;
            for (ZPair zpairResult1053 :
                    ZVal.getIterable(trait.arrayGet(env, "methods"), env, true)) {
                method = zpairResult1053;
                if (ZVal.isGreaterThan(method.arrayGet(env, "executableLines"), '>', 0)) {
                    method.arrayAccess(env, "coverage")
                            .set(
                                    ZVal.multiply(
                                            ZVal.divide(
                                                    method.arrayGet(env, "executedLines"),
                                                    method.arrayGet(env, "executableLines")),
                                            100));

                } else {
                    method.arrayAccess(env, "coverage").set(100);
                }

                method.arrayAccess(env, "crap")
                        .set(
                                this.crap(
                                        env,
                                        method.arrayGet(env, "ccn"),
                                        method.arrayGet(env, "coverage")));
                trait.arrayAccess(env, "ccn")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        trait.arrayGet(env, "ccn"),
                                        method.arrayGet(env, "ccn")));
            }

            method.setObject(null);
            if (ZVal.isGreaterThan(trait.arrayGet(env, "executableLines"), '>', 0)) {
                trait.arrayAccess(env, "coverage")
                        .set(
                                ZVal.multiply(
                                        ZVal.divide(
                                                trait.arrayGet(env, "executedLines"),
                                                trait.arrayGet(env, "executableLines")),
                                        100));
                if (ZVal.strictEqualityCheck(trait.arrayGet(env, "coverage"), "===", 100)) {
                    this.numTestedClasses = ZVal.increment(this.numTestedClasses);
                }

            } else {
                trait.arrayAccess(env, "coverage").set(100);
            }

            trait.arrayAccess(env, "crap")
                    .set(
                            this.crap(
                                    env,
                                    trait.arrayGet(env, "ccn"),
                                    trait.arrayGet(env, "coverage")));
        }

        trait.setObject(null);
        for (ZPair zpairResult1054 : ZVal.getIterable(this.classes, env, true)) {
            _pClass = zpairResult1054;
            for (ZPair zpairResult1055 :
                    ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, true)) {
                method = zpairResult1055;
                if (ZVal.isGreaterThan(method.arrayGet(env, "executableLines"), '>', 0)) {
                    method.arrayAccess(env, "coverage")
                            .set(
                                    ZVal.multiply(
                                            ZVal.divide(
                                                    method.arrayGet(env, "executedLines"),
                                                    method.arrayGet(env, "executableLines")),
                                            100));

                } else {
                    method.arrayAccess(env, "coverage").set(100);
                }

                method.arrayAccess(env, "crap")
                        .set(
                                this.crap(
                                        env,
                                        method.arrayGet(env, "ccn"),
                                        method.arrayGet(env, "coverage")));
                _pClass.arrayAccess(env, "ccn")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        _pClass.arrayGet(env, "ccn"),
                                        method.arrayGet(env, "ccn")));
            }

            method.setObject(null);
            if (ZVal.isGreaterThan(_pClass.arrayGet(env, "executableLines"), '>', 0)) {
                _pClass.arrayAccess(env, "coverage")
                        .set(
                                ZVal.multiply(
                                        ZVal.divide(
                                                _pClass.arrayGet(env, "executedLines"),
                                                _pClass.arrayGet(env, "executableLines")),
                                        100));
                if (ZVal.strictEqualityCheck(_pClass.arrayGet(env, "coverage"), "===", 100)) {
                    this.numTestedClasses = ZVal.increment(this.numTestedClasses);
                }

            } else {
                _pClass.arrayAccess(env, "coverage").set(100);
            }

            _pClass.arrayAccess(env, "crap")
                    .set(
                            this.crap(
                                    env,
                                    _pClass.arrayGet(env, "ccn"),
                                    _pClass.arrayGet(env, "coverage")));
        }

        _pClass.setObject(null);
        for (ZPair zpairResult1056 : ZVal.getIterable(this.functions, env, true)) {
            function = zpairResult1056;
            if (ZVal.isGreaterThan(function.arrayGet(env, "executableLines"), '>', 0)) {
                function.arrayAccess(env, "coverage")
                        .set(
                                ZVal.multiply(
                                        ZVal.divide(
                                                function.arrayGet(env, "executedLines"),
                                                function.arrayGet(env, "executableLines")),
                                        100));

            } else {
                function.arrayAccess(env, "coverage").set(100);
            }

            if (ZVal.strictEqualityCheck(function.arrayGet(env, "coverage"), "===", 100)) {
                this.numTestedFunctions = ZVal.increment(this.numTestedFunctions);
            }

            function.arrayAccess(env, "crap")
                    .set(
                            this.crap(
                                    env,
                                    function.arrayGet(env, "ccn"),
                                    function.arrayGet(env, "coverage")));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "PHP_Token_Stream")
    private Object processClasses(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object tokens = assignParameter(args, 0, false);
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object classes = null;
        Object link = null;
        Object methodName = null;
        Object className = null;
        Object lineNumber = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        classes = env.callMethod(tokens, "getClasses", File.class);
        link = toStringR(env.callMethod(this, "getId", File.class), env) + ".html#";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1057 : ZVal.getIterable(classes, env, false)) {
            className = ZVal.assign(zpairResult1057.getKey());
            _pClass.setObject(ZVal.assign(zpairResult1057.getValue()));
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(className, "anonymous").value(), "===", 0)) {
                continue;
            }

            if (!arrayActionR(ArrayAction.EMPTY, _pClass, env, "package", "namespace")) {
                className =
                        toStringR(_pClass.arrayGet(env, "package", "namespace"), env)
                                + "\\"
                                + toStringR(className, env);
            }

            new ReferenceClassProperty(this, "classes", env)
                    .arrayAccess(env, className)
                    .set(
                            ZVal.newArray(
                                    new ZPair("className", className),
                                    new ZPair("methods", ZVal.newArray()),
                                    new ZPair("startLine", _pClass.arrayGet(env, "startLine")),
                                    new ZPair("executableLines", 0),
                                    new ZPair("executedLines", 0),
                                    new ZPair("ccn", 0),
                                    new ZPair("coverage", 0),
                                    new ZPair("crap", 0),
                                    new ZPair("package", _pClass.arrayGet(env, "package")),
                                    new ZPair(
                                            "link",
                                            toStringR(link, env)
                                                    + toStringR(
                                                            _pClass.arrayGet(env, "startLine"),
                                                            env))));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1058 :
                    ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult1058.getKey());
                method.setObject(ZVal.assign(zpairResult1058.getValue()));
                if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(methodName, "anonymous").value(),
                        "===",
                        0)) {
                    continue;
                }

                new ReferenceClassProperty(this, "classes", env)
                        .arrayAccess(env, className, "methods", methodName)
                        .set(this.newMethod(env, methodName, method.getObject(), link));
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1059 :
                        ZVal.getIterable(
                                function_range
                                        .f
                                        .env(env)
                                        .call(
                                                method.arrayGet(env, "startLine"),
                                                method.arrayGet(env, "endLine"))
                                        .value(),
                                env,
                                true)) {
                    lineNumber = ZVal.assign(zpairResult1059.getValue());
                    new ReferenceClassProperty(this, "codeUnitsByLine", env)
                            .arrayAccess(env, lineNumber)
                            .set(
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    new ReferenceClassProperty(this, "classes", env)
                                                            .arrayGet(env, className)),
                                            new ZPair(
                                                    1,
                                                    new ReferenceClassProperty(this, "classes", env)
                                                            .arrayGet(
                                                                    env,
                                                                    className,
                                                                    "methods",
                                                                    methodName))));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "PHP_Token_Stream")
    private Object processTraits(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object tokens = assignParameter(args, 0, false);
        Object traitName = null;
        Object traits = null;
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object link = null;
        ReferenceContainer trait = new BasicReferenceContainer(null);
        Object methodName = null;
        Object lineNumber = null;
        traits = env.callMethod(tokens, "getTraits", File.class);
        link = toStringR(env.callMethod(this, "getId", File.class), env) + ".html#";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1060 : ZVal.getIterable(traits, env, false)) {
            traitName = ZVal.assign(zpairResult1060.getKey());
            trait.setObject(ZVal.assign(zpairResult1060.getValue()));
            new ReferenceClassProperty(this, "traits", env)
                    .arrayAccess(env, traitName)
                    .set(
                            ZVal.newArray(
                                    new ZPair("traitName", traitName),
                                    new ZPair("methods", ZVal.newArray()),
                                    new ZPair("startLine", trait.arrayGet(env, "startLine")),
                                    new ZPair("executableLines", 0),
                                    new ZPair("executedLines", 0),
                                    new ZPair("ccn", 0),
                                    new ZPair("coverage", 0),
                                    new ZPair("crap", 0),
                                    new ZPair("package", trait.arrayGet(env, "package")),
                                    new ZPair(
                                            "link",
                                            toStringR(link, env)
                                                    + toStringR(
                                                            trait.arrayGet(env, "startLine"),
                                                            env))));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1061 :
                    ZVal.getIterable(trait.arrayGet(env, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult1061.getKey());
                method.setObject(ZVal.assign(zpairResult1061.getValue()));
                if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(methodName, "anonymous").value(),
                        "===",
                        0)) {
                    continue;
                }

                new ReferenceClassProperty(this, "traits", env)
                        .arrayAccess(env, traitName, "methods", methodName)
                        .set(this.newMethod(env, methodName, method.getObject(), link));
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1062 :
                        ZVal.getIterable(
                                function_range
                                        .f
                                        .env(env)
                                        .call(
                                                method.arrayGet(env, "startLine"),
                                                method.arrayGet(env, "endLine"))
                                        .value(),
                                env,
                                true)) {
                    lineNumber = ZVal.assign(zpairResult1062.getValue());
                    new ReferenceClassProperty(this, "codeUnitsByLine", env)
                            .arrayAccess(env, lineNumber)
                            .set(
                                    ZVal.newArray(
                                            new ZPair(
                                                    0,
                                                    new ReferenceClassProperty(this, "traits", env)
                                                            .arrayGet(env, traitName)),
                                            new ZPair(
                                                    1,
                                                    new ReferenceClassProperty(this, "traits", env)
                                                            .arrayGet(
                                                                    env,
                                                                    traitName,
                                                                    "methods",
                                                                    methodName))));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "PHP_Token_Stream")
    private Object processFunctions(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object tokens = assignParameter(args, 0, false);
        Object functions = null;
        Object functionName = null;
        ReferenceContainer function = new BasicReferenceContainer(null);
        Object link = null;
        Object lineNumber = null;
        functions = env.callMethod(tokens, "getFunctions", File.class);
        link = toStringR(env.callMethod(this, "getId", File.class), env) + ".html#";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1063 : ZVal.getIterable(functions, env, false)) {
            functionName = ZVal.assign(zpairResult1063.getKey());
            function.setObject(ZVal.assign(zpairResult1063.getValue()));
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(functionName, "anonymous").value(), "===", 0)) {
                continue;
            }

            new ReferenceClassProperty(this, "functions", env)
                    .arrayAccess(env, functionName)
                    .set(
                            ZVal.newArray(
                                    new ZPair("functionName", functionName),
                                    new ZPair("signature", function.arrayGet(env, "signature")),
                                    new ZPair("startLine", function.arrayGet(env, "startLine")),
                                    new ZPair("executableLines", 0),
                                    new ZPair("executedLines", 0),
                                    new ZPair("ccn", function.arrayGet(env, "ccn")),
                                    new ZPair("coverage", 0),
                                    new ZPair("crap", 0),
                                    new ZPair(
                                            "link",
                                            toStringR(link, env)
                                                    + toStringR(
                                                            function.arrayGet(env, "startLine"),
                                                            env))));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1064 :
                    ZVal.getIterable(
                            function_range
                                    .f
                                    .env(env)
                                    .call(
                                            function.arrayGet(env, "startLine"),
                                            function.arrayGet(env, "endLine"))
                                    .value(),
                            env,
                            true)) {
                lineNumber = ZVal.assign(zpairResult1064.getValue());
                new ReferenceClassProperty(this, "codeUnitsByLine", env)
                        .arrayAccess(env, lineNumber)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new ReferenceClassProperty(this, "functions", env)
                                                        .arrayGet(env, functionName))));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ccn", typeHint = "int")
    @ConvertedParameter(index = 1, name = "coverage", typeHint = "float")
    private Object crap(RuntimeEnv env, Object... args) {
        Object ccn = assignParameter(args, 0, false);
        Object coverage = assignParameter(args, 1, false);
        if (ZVal.strictEqualityCheck(coverage, "===", 0)) {
            return ZVal.assign(
                    toStringR(ZVal.add(Math.pow(ZVal.toDouble(ccn), ZVal.toDouble(2)), ccn), env));
        }

        if (ZVal.isGreaterThanOrEqualTo(coverage, ">=", 95)) {
            return ZVal.assign(toStringR(ccn, env));
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%01.2F",
                                ZVal.add(
                                        ZVal.multiply(
                                                Math.pow(ZVal.toDouble(ccn), ZVal.toDouble(2)),
                                                Math.pow(
                                                        ZVal.toDouble(
                                                                ZVal.subtract(
                                                                        1,
                                                                        ZVal.divide(
                                                                                coverage, 100))),
                                                        ZVal.toDouble(3))),
                                        ccn))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName", typeHint = "string")
    @ConvertedParameter(index = 1, name = "method", typeHint = "array")
    @ConvertedParameter(index = 2, name = "link", typeHint = "string")
    private Object newMethod(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, false);
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object link = assignParameter(args, 2, false);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("methodName", methodName),
                        new ZPair("visibility", method.arrayGet(env, "visibility")),
                        new ZPair("signature", method.arrayGet(env, "signature")),
                        new ZPair("startLine", method.arrayGet(env, "startLine")),
                        new ZPair("endLine", method.arrayGet(env, "endLine")),
                        new ZPair("executableLines", 0),
                        new ZPair("executedLines", 0),
                        new ZPair("ccn", method.arrayGet(env, "ccn")),
                        new ZPair("coverage", 0),
                        new ZPair("crap", 0),
                        new ZPair(
                                "link",
                                toStringR(link, env)
                                        + toStringR(method.arrayGet(env, "startLine"), env))));
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\File";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractNode.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\File")
                    .setLookup(
                            File.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cacheTokens",
                            "classes",
                            "codeUnitsByLine",
                            "coverageData",
                            "functions",
                            "id",
                            "linesOfCode",
                            "name",
                            "numClasses",
                            "numExecutableLines",
                            "numExecutedLines",
                            "numMethods",
                            "numTestedClasses",
                            "numTestedFunctions",
                            "numTestedMethods",
                            "numTestedTraits",
                            "numTraits",
                            "parent",
                            "path",
                            "pathArray",
                            "testData",
                            "traits")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/File.php")
                    .addInterface("Countable")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\Node\\AbstractNode")
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
