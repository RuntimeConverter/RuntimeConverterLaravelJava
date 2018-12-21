package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.File;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Text.php

*/

public final class Text extends RuntimeClassBase {

    public Object lowUpperBound = null;

    public Object highLowerBound = null;

    public Object showUncoveredFiles = null;

    public Object showOnlySummary = null;

    public Text(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Text.class) {
            this.__construct(env, args);
        }
    }

    public Text(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "lowUpperBound",
        typeHint = "int",
        defaultValue = "50",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "highLowerBound",
        typeHint = "int",
        defaultValue = "90",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 2,
        name = "showUncoveredFiles",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "showOnlySummary",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lowUpperBound = assignParameter(args, 0, true);
        if (null == lowUpperBound) {
            lowUpperBound = 50;
        }
        Object highLowerBound = assignParameter(args, 1, true);
        if (null == highLowerBound) {
            highLowerBound = 90;
        }
        Object showUncoveredFiles = assignParameter(args, 2, true);
        if (null == showUncoveredFiles) {
            showUncoveredFiles = false;
        }
        Object showOnlySummary = assignParameter(args, 3, true);
        if (null == showOnlySummary) {
            showOnlySummary = false;
        }
        this.lowUpperBound = lowUpperBound;
        this.highLowerBound = highLowerBound;
        this.showUncoveredFiles = showUncoveredFiles;
        this.showOnlySummary = showOnlySummary;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    @ConvertedParameter(
        index = 1,
        name = "showColors",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object process(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object coverage = assignParameter(args, 0, false);
        Object showColors = assignParameter(args, 1, true);
        if (null == showColors) {
            showColors = false;
        }
        Object date = null;
        Object methods = null;
        Object classes = null;
        Object className = null;
        Object title = null;
        ReferenceContainer colors = new BasicReferenceContainer(null);
        ReferenceContainer classMethods = new BasicReferenceContainer(null);
        Object output = null;
        Object resetColor = null;
        Object lines = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        Object padding = null;
        Object linesColor = null;
        ReferenceContainer classInfo = new BasicReferenceContainer(null);
        Object item = null;
        ReferenceContainer classCoverage = new BasicReferenceContainer(null);
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object classStatements = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object fullQualifiedPath = null;
        Object methodColor = null;
        ReferenceContainer coveredMethods = new BasicReferenceContainer(null);
        Object report = null;
        Object namespace = null;
        Object coveredClassStatements = null;
        output = toStringR("\n", env) + toStringR("\n", env);
        report = env.callMethod(coverage, "getReport", Text.class);
        colors.setObject(
                ZVal.newArray(
                        new ZPair("header", ""),
                        new ZPair("classes", ""),
                        new ZPair("methods", ""),
                        new ZPair("lines", ""),
                        new ZPair("reset", ""),
                        new ZPair("eol", "")));
        if (ZVal.isTrue(showColors)) {
            colors.arrayAccess(env, "classes")
                    .set(
                            this.getCoverageColor(
                                    env,
                                    env.callMethod(
                                            report, "getNumTestedClassesAndTraits", Text.class),
                                    env.callMethod(report, "getNumClassesAndTraits", Text.class)));
            colors.arrayAccess(env, "methods")
                    .set(
                            this.getCoverageColor(
                                    env,
                                    env.callMethod(report, "getNumTestedMethods", Text.class),
                                    env.callMethod(report, "getNumMethods", Text.class)));
            colors.arrayAccess(env, "lines")
                    .set(
                            this.getCoverageColor(
                                    env,
                                    env.callMethod(report, "getNumExecutedLines", Text.class),
                                    env.callMethod(report, "getNumExecutableLines", Text.class)));
            colors.arrayAccess(env, "reset").set(CONST_COLOR_RESET);
            colors.arrayAccess(env, "header").set(CONST_COLOR_HEADER);
            colors.arrayAccess(env, "eol").set(CONST_COLOR_EOL);
        }

        classes =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "  Classes: %6s (%d/%d)",
                                Util.runtimeStaticObject.percent(
                                        env,
                                        env.callMethod(
                                                report, "getNumTestedClassesAndTraits", Text.class),
                                        env.callMethod(
                                                report, "getNumClassesAndTraits", Text.class),
                                        true),
                                env.callMethod(report, "getNumTestedClassesAndTraits", Text.class),
                                env.callMethod(report, "getNumClassesAndTraits", Text.class))
                        .value();
        methods =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "  Methods: %6s (%d/%d)",
                                Util.runtimeStaticObject.percent(
                                        env,
                                        env.callMethod(report, "getNumTestedMethods", Text.class),
                                        env.callMethod(report, "getNumMethods", Text.class),
                                        true),
                                env.callMethod(report, "getNumTestedMethods", Text.class),
                                env.callMethod(report, "getNumMethods", Text.class))
                        .value();
        lines =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "  Lines:   %6s (%d/%d)",
                                Util.runtimeStaticObject.percent(
                                        env,
                                        env.callMethod(report, "getNumExecutedLines", Text.class),
                                        env.callMethod(report, "getNumExecutableLines", Text.class),
                                        true),
                                env.callMethod(report, "getNumExecutedLines", Text.class),
                                env.callMethod(report, "getNumExecutableLines", Text.class))
                        .value();
        padding =
                NamespaceGlobal.max
                        .env(env)
                        .call(
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                "strlen",
                                                ZVal.newArray(
                                                        new ZPair(0, classes),
                                                        new ZPair(1, methods),
                                                        new ZPair(2, lines)))
                                        .value())
                        .value();
        if (ZVal.isTrue(this.showOnlySummary)) {
            title = "Code Coverage Report Summary:";
            padding =
                    NamespaceGlobal.max
                            .env(env)
                            .call(padding, function_strlen.f.env(env).call(title).value())
                            .value();
            output =
                    toStringR(output, env)
                            + toStringR(
                                    this.format(
                                            env, colors.arrayGet(env, "header"), padding, title),
                                    env);

        } else {
            date =
                    function_date
                            .f
                            .env(env)
                            .call("  Y-m-d H:i:s", _SERVER.arrayGet(env, "REQUEST_TIME"))
                            .value();
            title = "Code Coverage Report:";
            output =
                    toStringR(output, env)
                            + toStringR(
                                    this.format(
                                            env, colors.arrayGet(env, "header"), padding, title),
                                    env);
            output =
                    toStringR(output, env)
                            + toStringR(
                                    this.format(env, colors.arrayGet(env, "header"), padding, date),
                                    env);
            output =
                    toStringR(output, env)
                            + toStringR(
                                    this.format(env, colors.arrayGet(env, "header"), padding, ""),
                                    env);
            output =
                    toStringR(output, env)
                            + toStringR(
                                    this.format(
                                            env,
                                            colors.arrayGet(env, "header"),
                                            padding,
                                            " Summary:"),
                                    env);
        }

        output =
                toStringR(output, env)
                        + toStringR(
                                this.format(env, colors.arrayGet(env, "classes"), padding, classes),
                                env);
        output =
                toStringR(output, env)
                        + toStringR(
                                this.format(env, colors.arrayGet(env, "methods"), padding, methods),
                                env);
        output =
                toStringR(output, env)
                        + toStringR(
                                this.format(env, colors.arrayGet(env, "lines"), padding, lines),
                                env);
        if (ZVal.isTrue(this.showOnlySummary)) {
            return ZVal.assign(toStringR(output, env) + toStringR("\n", env));
        }

        classCoverage.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1098 : ZVal.getIterable(report, env, true)) {
            item = ZVal.assign(zpairResult1098.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            item, File.class, "SebastianBergmann\\CodeCoverage\\Node\\File"))) {
                continue;
            }

            classes = env.callMethod(item, "getClassesAndTraits", Text.class);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1099 : ZVal.getIterable(classes, env, false)) {
                className = ZVal.assign(zpairResult1099.getKey());
                _pClass.setObject(ZVal.assign(zpairResult1099.getValue()));
                classStatements = 0;
                coveredClassStatements = 0;
                coveredMethods.setObject(0);
                classMethods.setObject(0);
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1100 :
                        ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, true)) {
                    method.setObject(ZVal.assign(zpairResult1100.getValue()));
                    if (ZVal.equalityCheck(method.arrayGet(env, "executableLines"), 0)) {
                        continue;
                    }

                    classMethods.setObject(ZVal.increment(classMethods.getObject()));
                    classStatements =
                            ZAssignment.add(
                                    "+=", classStatements, method.arrayGet(env, "executableLines"));
                    coveredClassStatements =
                            ZAssignment.add(
                                    "+=",
                                    coveredClassStatements,
                                    method.arrayGet(env, "executedLines"));
                    if (ZVal.equalityCheck(method.arrayGet(env, "coverage"), 100)) {
                        coveredMethods.setObject(ZVal.increment(coveredMethods.getObject()));
                    }
                }

                namespace = "";
                if (!arrayActionR(ArrayAction.EMPTY, _pClass, env, "package", "namespace")) {
                    namespace =
                            "\\"
                                    + toStringR(_pClass.arrayGet(env, "package", "namespace"), env)
                                    + "::";

                } else if (!arrayActionR(
                        ArrayAction.EMPTY, _pClass, env, "package", "fullPackage")) {
                    namespace =
                            "@"
                                    + toStringR(
                                            _pClass.arrayGet(env, "package", "fullPackage"), env)
                                    + "::";
                }

                classCoverage
                        .arrayAccess(env, toStringR(namespace, env) + toStringR(className, env))
                        .set(
                                ZVal.newArray(
                                        new ZPair("namespace", namespace),
                                        new ZPair("className ", className),
                                        new ZPair("methodsCovered", coveredMethods.getObject()),
                                        new ZPair("methodCount", classMethods.getObject()),
                                        new ZPair("statementsCovered", coveredClassStatements),
                                        new ZPair("statementCount", classStatements)));
            }
        }

        function_ksort.f.env(env).call(classCoverage.getObject());
        methodColor = "";
        linesColor = "";
        resetColor = "";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1101 : ZVal.getIterable(classCoverage.getObject(), env, false)) {
            fullQualifiedPath = ZVal.assign(zpairResult1101.getKey());
            classInfo.setObject(ZVal.assign(zpairResult1101.getValue()));
            if (ZVal.toBool(this.showUncoveredFiles)
                    || ZVal.toBool(
                            ZVal.notEqualityCheck(
                                    classInfo.arrayGet(env, "statementsCovered"), 0))) {
                if (ZVal.isTrue(showColors)) {
                    methodColor =
                            this.getCoverageColor(
                                    env,
                                    classInfo.arrayGet(env, "methodsCovered"),
                                    classInfo.arrayGet(env, "methodCount"));
                    linesColor =
                            this.getCoverageColor(
                                    env,
                                    classInfo.arrayGet(env, "statementsCovered"),
                                    classInfo.arrayGet(env, "statementCount"));
                    resetColor = ZVal.assign(colors.arrayGet(env, "reset"));
                }

                output =
                        toStringR(output, env)
                                + toStringR("\n", env)
                                + toStringR(fullQualifiedPath, env)
                                + toStringR("\n", env)
                                + "  "
                                + toStringR(methodColor, env)
                                + "Methods: "
                                + toStringR(
                                        this.printCoverageCounts(
                                                env,
                                                classInfo.arrayGet(env, "methodsCovered"),
                                                classInfo.arrayGet(env, "methodCount"),
                                                2),
                                        env)
                                + toStringR(resetColor, env)
                                + " "
                                + "  "
                                + toStringR(linesColor, env)
                                + "Lines: "
                                + toStringR(
                                        this.printCoverageCounts(
                                                env,
                                                classInfo.arrayGet(env, "statementsCovered"),
                                                classInfo.arrayGet(env, "statementCount"),
                                                3),
                                        env)
                                + toStringR(resetColor, env);
            }
        }

        return ZVal.assign(toStringR(output, env) + toStringR("\n", env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "numberOfCoveredElements", typeHint = "int")
    @ConvertedParameter(index = 1, name = "totalNumberOfElements", typeHint = "int")
    private Object getCoverageColor(RuntimeEnv env, Object... args) {
        Object numberOfCoveredElements = assignParameter(args, 0, false);
        Object totalNumberOfElements = assignParameter(args, 1, false);
        Object coverage = null;
        coverage =
                Util.runtimeStaticObject.percent(
                        env, numberOfCoveredElements, totalNumberOfElements);
        if (ZVal.isGreaterThanOrEqualTo(coverage, ">=", this.highLowerBound)) {
            return ZVal.assign(CONST_COLOR_GREEN);
        }

        if (ZVal.isGreaterThan(coverage, '>', this.lowUpperBound)) {
            return ZVal.assign(CONST_COLOR_YELLOW);
        }

        return ZVal.assign(CONST_COLOR_RED);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "numberOfCoveredElements", typeHint = "int")
    @ConvertedParameter(index = 1, name = "totalNumberOfElements", typeHint = "int")
    @ConvertedParameter(index = 2, name = "precision", typeHint = "int")
    private Object printCoverageCounts(RuntimeEnv env, Object... args) {
        Object numberOfCoveredElements = assignParameter(args, 0, false);
        Object totalNumberOfElements = assignParameter(args, 1, false);
        Object precision = assignParameter(args, 2, false);
        Object format = null;
        format = "%" + toStringR(precision, env) + "s";
        return ZVal.assign(
                toStringR(
                                Util.runtimeStaticObject.percent(
                                        env,
                                        numberOfCoveredElements,
                                        totalNumberOfElements,
                                        true,
                                        true),
                                env)
                        + " ("
                        + toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(format, numberOfCoveredElements)
                                        .value(),
                                env)
                        + "/"
                        + toStringR(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(format, totalNumberOfElements)
                                        .value(),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "color")
    @ConvertedParameter(index = 1, name = "padding")
    @ConvertedParameter(index = 2, name = "string")
    private Object format(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, false);
        Object padding = assignParameter(args, 1, false);
        Object string = assignParameter(args, 2, false);
        Object reset = null;
        reset = ZVal.assign(ZVal.isTrue(color) ? CONST_COLOR_RESET : "");
        return ZVal.assign(
                toStringR(color, env)
                        + toStringR(
                                NamespaceGlobal.str_pad.env(env).call(string, padding).value(), env)
                        + toStringR(reset, env)
                        + toStringR("\n", env));
    }

    public static final Object CONST_COLOR_GREEN = "\u001B[30;42m";

    public static final Object CONST_COLOR_YELLOW = "\u001B[30;43m";

    public static final Object CONST_COLOR_RED = "\u001B[37;41m";

    public static final Object CONST_COLOR_HEADER = "\u001B[1;37;40m";

    public static final Object CONST_COLOR_RESET = "\u001B[0m";

    public static final Object CONST_COLOR_EOL = "\u001B[2K";

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Text";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Text")
                    .setLookup(
                            Text.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "highLowerBound",
                            "lowUpperBound",
                            "showOnlySummary",
                            "showUncoveredFiles")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Text.php")
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
