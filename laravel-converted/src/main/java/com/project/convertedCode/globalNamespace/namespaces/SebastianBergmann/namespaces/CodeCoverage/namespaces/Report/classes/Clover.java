package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.File;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Clover.php

*/

public final class Clover extends RuntimeClassBase {

    public Clover(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Clover(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    @ConvertedParameter(
        index = 1,
        name = "target",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object process(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object coverage = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, true);
        if (null == target) {
            target = ZVal.getNull();
        }
        Object name = assignParameter(args, 2, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object line = null;
        Object classes = null;
        Object className = null;
        Object xmlFile = null;
        ReferenceContainer classMethods = new BasicReferenceContainer(null);
        ReferenceContainer linesOfCode = new BasicReferenceContainer(null);
        ReferenceContainer coverageData = new BasicReferenceContainer(null);
        Object xmlProject = null;
        Object buffer = null;
        Object xmlDocument = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object methodCount = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        Object item = null;
        Object xmlClass = null;
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object xmlCoverage = null;
        Object classStatements = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object methodName = null;
        Object xmlLine = null;
        ReferenceContainer packages = new BasicReferenceContainer(null);
        Object xmlMetrics = null;
        ReferenceContainer coveredMethods = new BasicReferenceContainer(null);
        Object report = null;
        Object namespace = null;
        Object coveredClassStatements = null;
        xmlDocument = new DOMDocument(env, "1.0", "UTF-8");
        toObjectR(xmlDocument).accessProp(this, env).name("formatOutput").set(true);
        xmlCoverage = env.callMethod(xmlDocument, "createElement", Clover.class, "coverage");
        env.callMethod(
                xmlCoverage,
                "setAttribute",
                Clover.class,
                "generated",
                ZVal.toLong(_SERVER.arrayGet(env, "REQUEST_TIME")));
        env.callMethod(xmlDocument, "appendChild", Clover.class, xmlCoverage);
        xmlProject = env.callMethod(xmlDocument, "createElement", Clover.class, "project");
        env.callMethod(
                xmlProject,
                "setAttribute",
                Clover.class,
                "timestamp",
                ZVal.toLong(_SERVER.arrayGet(env, "REQUEST_TIME")));
        if (function_is_string.f.env(env).call(name).getBool()) {
            env.callMethod(xmlProject, "setAttribute", Clover.class, "name", name);
        }

        env.callMethod(xmlCoverage, "appendChild", Clover.class, xmlProject);
        packages.setObject(ZVal.newArray());
        report = env.callMethod(coverage, "getReport", Clover.class);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1065 : ZVal.getIterable(report, env, true)) {
            item = ZVal.assign(zpairResult1065.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            item, File.class, "SebastianBergmann\\CodeCoverage\\Node\\File"))) {
                continue;
            }

            xmlFile = env.callMethod(xmlDocument, "createElement", Clover.class, "file");
            env.callMethod(
                    xmlFile,
                    "setAttribute",
                    Clover.class,
                    "name",
                    env.callMethod(item, "getPath", Clover.class));
            classes = env.callMethod(item, "getClassesAndTraits", Clover.class);
            coverageData.setObject(env.callMethod(item, "getCoverageData", Clover.class));
            lines.setObject(ZVal.newArray());
            namespace = "global";
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1066 : ZVal.getIterable(classes, env, false)) {
                className = ZVal.assign(zpairResult1066.getKey());
                _pClass.setObject(ZVal.assign(zpairResult1066.getValue()));
                classStatements = 0;
                coveredClassStatements = 0;
                coveredMethods.setObject(0);
                classMethods.setObject(0);
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1067 :
                        ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, false)) {
                    methodName = ZVal.assign(zpairResult1067.getKey());
                    method.setObject(ZVal.assign(zpairResult1067.getValue()));
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

                    methodCount = 0;
                    runtimeConverterContinueCount = 0;
                    for (ZPair zpairResult1068 :
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
                        line = ZVal.assign(zpairResult1068.getValue());
                        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, coverageData, env, line))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                coverageData.arrayGet(env, line),
                                                "!==",
                                                ZVal.getNull()))) {
                            methodCount =
                                    NamespaceGlobal.max
                                            .env(env)
                                            .call(
                                                    methodCount,
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(coverageData.arrayGet(env, line))
                                                            .value())
                                            .value();
                        }
                    }

                    lines.arrayAccess(env, method.arrayGet(env, "startLine"))
                            .set(
                                    ZVal.newArray(
                                            new ZPair("ccn", method.arrayGet(env, "ccn")),
                                            new ZPair("count", methodCount),
                                            new ZPair("crap", method.arrayGet(env, "crap")),
                                            new ZPair("type", "method"),
                                            new ZPair(
                                                    "visibility",
                                                    method.arrayGet(env, "visibility")),
                                            new ZPair("name", methodName)));
                }

                if (!arrayActionR(ArrayAction.EMPTY, _pClass, env, "package", "namespace")) {
                    namespace = ZVal.assign(_pClass.arrayGet(env, "package", "namespace"));
                }

                xmlClass = env.callMethod(xmlDocument, "createElement", Clover.class, "class");
                env.callMethod(xmlClass, "setAttribute", Clover.class, "name", className);
                env.callMethod(xmlClass, "setAttribute", Clover.class, "namespace", namespace);
                if (!arrayActionR(ArrayAction.EMPTY, _pClass, env, "package", "fullPackage")) {
                    env.callMethod(
                            xmlClass,
                            "setAttribute",
                            Clover.class,
                            "fullPackage",
                            _pClass.arrayGet(env, "package", "fullPackage"));
                }

                if (!arrayActionR(ArrayAction.EMPTY, _pClass, env, "package", "category")) {
                    env.callMethod(
                            xmlClass,
                            "setAttribute",
                            Clover.class,
                            "category",
                            _pClass.arrayGet(env, "package", "category"));
                }

                if (!arrayActionR(ArrayAction.EMPTY, _pClass, env, "package", "package")) {
                    env.callMethod(
                            xmlClass,
                            "setAttribute",
                            Clover.class,
                            "package",
                            _pClass.arrayGet(env, "package", "package"));
                }

                if (!arrayActionR(ArrayAction.EMPTY, _pClass, env, "package", "subpackage")) {
                    env.callMethod(
                            xmlClass,
                            "setAttribute",
                            Clover.class,
                            "subpackage",
                            _pClass.arrayGet(env, "package", "subpackage"));
                }

                env.callMethod(xmlFile, "appendChild", Clover.class, xmlClass);
                xmlMetrics = env.callMethod(xmlDocument, "createElement", Clover.class, "metrics");
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "complexity",
                        _pClass.arrayGet(env, "ccn"));
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "methods",
                        classMethods.getObject());
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "coveredmethods",
                        coveredMethods.getObject());
                env.callMethod(xmlMetrics, "setAttribute", Clover.class, "conditionals", 0);
                env.callMethod(xmlMetrics, "setAttribute", Clover.class, "coveredconditionals", 0);
                env.callMethod(
                        xmlMetrics, "setAttribute", Clover.class, "statements", classStatements);
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "coveredstatements",
                        coveredClassStatements);
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "elements",
                        ZVal.add(classMethods.getObject(), classStatements));
                env.callMethod(
                        xmlMetrics,
                        "setAttribute",
                        Clover.class,
                        "coveredelements",
                        ZVal.add(coveredMethods.getObject(), coveredClassStatements));
                env.callMethod(xmlClass, "appendChild", Clover.class, xmlMetrics);
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1069 : ZVal.getIterable(coverageData.getObject(), env, false)) {
                line = ZVal.assign(zpairResult1069.getKey());
                data.setObject(ZVal.assign(zpairResult1069.getValue()));
                if (ZVal.toBool(ZVal.strictEqualityCheck(data.getObject(), "===", ZVal.getNull()))
                        || ZVal.toBool(arrayActionR(ArrayAction.ISSET, lines, env, line))) {
                    continue;
                }

                lines.arrayAccess(env, line)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                "count",
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(data.getObject())
                                                        .value()),
                                        new ZPair("type", "stmt")));
            }

            function_ksort.f.env(env).call(lines.getObject());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1070 : ZVal.getIterable(lines.getObject(), env, false)) {
                line = ZVal.assign(zpairResult1070.getKey());
                data.setObject(ZVal.assign(zpairResult1070.getValue()));
                xmlLine = env.callMethod(xmlDocument, "createElement", Clover.class, "line");
                env.callMethod(xmlLine, "setAttribute", Clover.class, "num", line);
                env.callMethod(
                        xmlLine, "setAttribute", Clover.class, "type", data.arrayGet(env, "type"));
                if (arrayActionR(ArrayAction.ISSET, data, env, "name")) {
                    env.callMethod(
                            xmlLine,
                            "setAttribute",
                            Clover.class,
                            "name",
                            data.arrayGet(env, "name"));
                }

                if (arrayActionR(ArrayAction.ISSET, data, env, "visibility")) {
                    env.callMethod(
                            xmlLine,
                            "setAttribute",
                            Clover.class,
                            "visibility",
                            data.arrayGet(env, "visibility"));
                }

                if (arrayActionR(ArrayAction.ISSET, data, env, "ccn")) {
                    env.callMethod(
                            xmlLine,
                            "setAttribute",
                            Clover.class,
                            "complexity",
                            data.arrayGet(env, "ccn"));
                }

                if (arrayActionR(ArrayAction.ISSET, data, env, "crap")) {
                    env.callMethod(
                            xmlLine,
                            "setAttribute",
                            Clover.class,
                            "crap",
                            data.arrayGet(env, "crap"));
                }

                env.callMethod(
                        xmlLine,
                        "setAttribute",
                        Clover.class,
                        "count",
                        data.arrayGet(env, "count"));
                env.callMethod(xmlFile, "appendChild", Clover.class, xmlLine);
            }

            linesOfCode.setObject(env.callMethod(item, "getLinesOfCode", Clover.class));
            xmlMetrics = env.callMethod(xmlDocument, "createElement", Clover.class, "metrics");
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "loc",
                    linesOfCode.arrayGet(env, "loc"));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "ncloc",
                    linesOfCode.arrayGet(env, "ncloc"));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "classes",
                    env.callMethod(item, "getNumClassesAndTraits", Clover.class));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "methods",
                    env.callMethod(item, "getNumMethods", Clover.class));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "coveredmethods",
                    env.callMethod(item, "getNumTestedMethods", Clover.class));
            env.callMethod(xmlMetrics, "setAttribute", Clover.class, "conditionals", 0);
            env.callMethod(xmlMetrics, "setAttribute", Clover.class, "coveredconditionals", 0);
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "statements",
                    env.callMethod(item, "getNumExecutableLines", Clover.class));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "coveredstatements",
                    env.callMethod(item, "getNumExecutedLines", Clover.class));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "elements",
                    ZVal.add(
                            env.callMethod(item, "getNumMethods", Clover.class),
                            env.callMethod(item, "getNumExecutableLines", Clover.class)));
            env.callMethod(
                    xmlMetrics,
                    "setAttribute",
                    Clover.class,
                    "coveredelements",
                    ZVal.add(
                            env.callMethod(item, "getNumTestedMethods", Clover.class),
                            env.callMethod(item, "getNumExecutedLines", Clover.class)));
            env.callMethod(xmlFile, "appendChild", Clover.class, xmlMetrics);
            if (ZVal.strictEqualityCheck(namespace, "===", "global")) {
                env.callMethod(xmlProject, "appendChild", Clover.class, xmlFile);

            } else {
                if (!arrayActionR(ArrayAction.ISSET, packages, env, namespace)) {
                    packages.arrayAccess(env, namespace)
                            .set(
                                    env.callMethod(
                                            xmlDocument, "createElement", Clover.class, "package"));
                    env.callMethod(
                            packages.arrayGet(env, namespace),
                            "setAttribute",
                            Clover.class,
                            "name",
                            namespace);
                    env.callMethod(
                            xmlProject,
                            "appendChild",
                            Clover.class,
                            packages.arrayGet(env, namespace));
                }

                env.callMethod(
                        packages.arrayGet(env, namespace), "appendChild", Clover.class, xmlFile);
            }
        }

        linesOfCode.setObject(env.callMethod(report, "getLinesOfCode", Clover.class));
        xmlMetrics = env.callMethod(xmlDocument, "createElement", Clover.class, "metrics");
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "files",
                function_count.f.env(env).call(report).value());
        env.callMethod(
                xmlMetrics, "setAttribute", Clover.class, "loc", linesOfCode.arrayGet(env, "loc"));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "ncloc",
                linesOfCode.arrayGet(env, "ncloc"));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "classes",
                env.callMethod(report, "getNumClassesAndTraits", Clover.class));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "methods",
                env.callMethod(report, "getNumMethods", Clover.class));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "coveredmethods",
                env.callMethod(report, "getNumTestedMethods", Clover.class));
        env.callMethod(xmlMetrics, "setAttribute", Clover.class, "conditionals", 0);
        env.callMethod(xmlMetrics, "setAttribute", Clover.class, "coveredconditionals", 0);
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "statements",
                env.callMethod(report, "getNumExecutableLines", Clover.class));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "coveredstatements",
                env.callMethod(report, "getNumExecutedLines", Clover.class));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "elements",
                ZVal.add(
                        env.callMethod(report, "getNumMethods", Clover.class),
                        env.callMethod(report, "getNumExecutableLines", Clover.class)));
        env.callMethod(
                xmlMetrics,
                "setAttribute",
                Clover.class,
                "coveredelements",
                ZVal.add(
                        env.callMethod(report, "getNumTestedMethods", Clover.class),
                        env.callMethod(report, "getNumExecutedLines", Clover.class)));
        env.callMethod(xmlProject, "appendChild", Clover.class, xmlMetrics);
        buffer = env.callMethod(xmlDocument, "saveXML", Clover.class);
        if (ZVal.strictNotEqualityCheck(target, "!==", ZVal.getNull())) {
            if (!ZVal.isTrue(
                    this.createDirectory(env, function_dirname.f.env(env).call(target).value()))) {
                throw ZVal.getException(
                        env,
                        new com.runtimeconverter
                                .runtime
                                .nativeClasses
                                .spl
                                .exceptions
                                .RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Directory \"%s\" was not created",
                                                function_dirname.f.env(env).call(target).value())
                                        .value()));
            }

            if (ZVal.strictEqualityCheck(
                    NamespaceGlobal.file_put_contents.env(env).call(target, buffer).value(),
                    "===",
                    false)) {
                throw ZVal.getException(
                        env,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .namespaces
                                .CodeCoverage
                                .classes
                                .RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Could not write to \"%s", target)
                                        .value()));
            }
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    private Object createDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        return ZVal.assign(
                !ZVal.toBool(
                                ZVal.toBool(!function_is_dir.f.env(env).call(directory).getBool())
                                        && ZVal.toBool(
                                                !ZVal.isTrue(
                                                        NamespaceGlobal.mkdir
                                                                .env(env)
                                                                .call(directory, 511, true)
                                                                .value())))
                        && ZVal.toBool(!function_is_dir.f.env(env).call(directory).getBool()));
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Clover";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Clover")
                    .setLookup(
                            Clover.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Clover.php")
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
