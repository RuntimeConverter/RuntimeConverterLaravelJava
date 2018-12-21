package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Version;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Report;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Project;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Facade.php

*/

public final class Facade extends RuntimeClassBase {

    public Object target = null;

    public Object project = null;

    public Object phpUnitVersion = null;

    public Facade(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Facade.class) {
            this.__construct(env, args);
        }
    }

    public Facade(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, false);
        this.phpUnitVersion = version;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    @ConvertedParameter(index = 1, name = "target", typeHint = "string")
    public Object process(RuntimeEnv env, Object... args) {
        Object coverage = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, false);
        Object report = null;
        if (ZVal.strictNotEqualityCheck(
                function_substr.f.env(env).call(target, -1, 1).value(), "!==", "/")) {
            target = toStringR(target, env) + toStringR("/", env);
        }

        this.target = target;
        this.initTargetDirectory(env, target);
        report = env.callMethod(coverage, "getReport", Facade.class);
        this.project =
                new Project(
                        env,
                        env.callMethod(
                                env.callMethod(coverage, "getReport", Facade.class),
                                "getName",
                                Facade.class));
        this.setBuildInformation(env);
        this.processTests(env, env.callMethod(coverage, "getTests", Facade.class));
        this.processDirectory(env, report, this.project);
        this.saveDocument(env, env.callMethod(this.project, "asDom", Facade.class), "index");
        return null;
    }

    @ConvertedMethod
    private Object setBuildInformation(RuntimeEnv env, Object... args) {
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object buildNode = null;
        buildNode = env.callMethod(this.project, "getBuildInformation", Facade.class);
        env.callMethod(buildNode, "setRuntimeInformation", Facade.class, new Runtime(env));
        env.callMethod(
                buildNode,
                "setBuildTime",
                Facade.class,
                DateTime.runtimeStaticObject.createFromFormat(
                        env, "U", _SERVER.arrayGet(env, "REQUEST_TIME")));
        env.callMethod(
                buildNode,
                "setGeneratorVersions",
                Facade.class,
                this.phpUnitVersion,
                Version.runtimeStaticObject.id(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    private Object initTargetDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        if (function_file_exists.f.env(env).call(directory).getBool()) {
            if (!function_is_dir.f.env(env).call(directory).getBool()) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "'"
                                        + toStringR(directory, env)
                                        + "' exists but is not a directory."));
            }

            if (!NamespaceGlobal.is_writable.env(env).call(directory).getBool()) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "'" + toStringR(directory, env) + "' exists but is not writable."));
            }

        } else if (!ZVal.isTrue(this.createDirectory(env, directory))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "'" + toStringR(directory, env) + "' could not be created."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "directory",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\Directory"
    )
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Node"
    )
    private Object processDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        Object node = null;
        Object directoryObject = null;
        Object directoryName = null;
        directoryName = env.callMethod(directory, "getName", Facade.class);
        if (ZVal.strictEqualityCheck(
                env.callMethod(this.project, "getProjectSourceDirectory", Facade.class),
                "===",
                directoryName)) {
            directoryName = "/";
        }

        directoryObject = env.callMethod(context, "addDirectory", Facade.class, directoryName);
        this.setTotals(env, directory, env.callMethod(directoryObject, "getTotals", Facade.class));
        for (ZPair zpairResult1102 :
                ZVal.getIterable(
                        env.callMethod(directory, "getDirectories", Facade.class), env, true)) {
            node = ZVal.assign(zpairResult1102.getValue());
            this.processDirectory(env, node, directoryObject);
        }

        for (ZPair zpairResult1103 :
                ZVal.getIterable(env.callMethod(directory, "getFiles", Facade.class), env, true)) {
            node = ZVal.assign(zpairResult1103.getValue());
            this.processFile(env, node, directoryObject);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "file",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\File"
    )
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Directory"
    )
    private Object processFile(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object file = assignParameter(args, 0, false);
        Object context = assignParameter(args, 1, false);
        Object coverage = null;
        Object path = null;
        Object unit = null;
        Object tests = null;
        Object test = null;
        Object fileObject = null;
        Object line = null;
        Object function = null;
        Object fileReport = null;
        fileObject =
                env.callMethod(
                        context,
                        "addFile",
                        Facade.class,
                        env.callMethod(file, "getName", Facade.class),
                        toStringR(env.callMethod(file, "getId", Facade.class), env) + ".xml");
        this.setTotals(env, file, env.callMethod(fileObject, "getTotals", Facade.class));
        path =
                function_substr
                        .f
                        .env(env)
                        .call(
                                env.callMethod(file, "getPath", Facade.class),
                                function_strlen
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this.project,
                                                        "getProjectSourceDirectory",
                                                        Facade.class))
                                        .value())
                        .value();
        fileReport = new Report(env, path);
        this.setTotals(env, file, env.callMethod(fileReport, "getTotals", Facade.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1104 :
                ZVal.getIterable(
                        env.callMethod(file, "getClassesAndTraits", Facade.class), env, true)) {
            unit = ZVal.assign(zpairResult1104.getValue());
            this.processUnit(env, unit, fileReport);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1105 :
                ZVal.getIterable(env.callMethod(file, "getFunctions", Facade.class), env, true)) {
            function = ZVal.assign(zpairResult1105.getValue());
            this.processFunction(env, function, fileReport);
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1106 :
                ZVal.getIterable(
                        env.callMethod(file, "getCoverageData", Facade.class), env, false)) {
            line = ZVal.assign(zpairResult1106.getKey());
            tests = ZVal.assign(zpairResult1106.getValue());
            if (ZVal.toBool(!function_is_array.f.env(env).call(tests).getBool())
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    function_count.f.env(env).call(tests).value(), "===", 0))) {
                continue;
            }

            coverage = env.callMethod(fileReport, "getLineCoverage", Facade.class, line);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1107 : ZVal.getIterable(tests, env, true)) {
                test = ZVal.assign(zpairResult1107.getValue());
                env.callMethod(coverage, "addTest", Facade.class, test);
            }

            env.callMethod(coverage, "finalize", Facade.class);
        }

        env.callMethod(
                env.callMethod(fileReport, "getSource", Facade.class),
                "setSourceCode",
                Facade.class,
                function_file_get_contents
                        .f
                        .env(env)
                        .call(env.callMethod(file, "getPath", Facade.class))
                        .value());
        this.saveDocument(
                env,
                env.callMethod(fileReport, "asDom", Facade.class),
                env.callMethod(file, "getId", Facade.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unit", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "report",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Report"
    )
    private Object processUnit(RuntimeEnv env, Object... args) {
        ReferenceContainer unit = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object report = assignParameter(args, 1, false);
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object methodObject = null;
        Object unitObject = null;
        if (arrayActionR(ArrayAction.ISSET, unit, env, "className")) {
            unitObject =
                    env.callMethod(
                            report,
                            "getClassObject",
                            Facade.class,
                            unit.arrayGet(env, "className"));

        } else {
            unitObject =
                    env.callMethod(
                            report,
                            "getTraitObject",
                            Facade.class,
                            unit.arrayGet(env, "traitName"));
        }

        env.callMethod(
                unitObject,
                "setLines",
                Facade.class,
                unit.arrayGet(env, "startLine"),
                unit.arrayGet(env, "executableLines"),
                unit.arrayGet(env, "executedLines"));
        env.callMethod(unitObject, "setCrap", Facade.class, unit.arrayGet(env, "crap"));
        env.callMethod(
                unitObject,
                "setPackage",
                Facade.class,
                unit.arrayGet(env, "package", "fullPackage"),
                unit.arrayGet(env, "package", "package"),
                unit.arrayGet(env, "package", "subpackage"),
                unit.arrayGet(env, "package", "category"));
        env.callMethod(
                unitObject,
                "setNamespace",
                Facade.class,
                unit.arrayGet(env, "package", "namespace"));
        for (ZPair zpairResult1108 : ZVal.getIterable(unit.arrayGet(env, "methods"), env, true)) {
            method.setObject(ZVal.assign(zpairResult1108.getValue()));
            methodObject =
                    env.callMethod(
                            unitObject,
                            "addMethod",
                            Facade.class,
                            method.arrayGet(env, "methodName"));
            env.callMethod(
                    methodObject, "setSignature", Facade.class, method.arrayGet(env, "signature"));
            env.callMethod(
                    methodObject,
                    "setLines",
                    Facade.class,
                    method.arrayGet(env, "startLine"),
                    method.arrayGet(env, "endLine"));
            env.callMethod(methodObject, "setCrap", Facade.class, method.arrayGet(env, "crap"));
            env.callMethod(
                    methodObject,
                    "setTotals",
                    Facade.class,
                    method.arrayGet(env, "executableLines"),
                    method.arrayGet(env, "executedLines"),
                    method.arrayGet(env, "coverage"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "function", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "report",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Report"
    )
    private Object processFunction(RuntimeEnv env, Object... args) {
        ReferenceContainer function = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object report = assignParameter(args, 1, false);
        Object functionObject = null;
        functionObject =
                env.callMethod(
                        report,
                        "getFunctionObject",
                        Facade.class,
                        function.arrayGet(env, "functionName"));
        env.callMethod(
                functionObject, "setSignature", Facade.class, function.arrayGet(env, "signature"));
        env.callMethod(
                functionObject, "setLines", Facade.class, function.arrayGet(env, "startLine"));
        env.callMethod(functionObject, "setCrap", Facade.class, function.arrayGet(env, "crap"));
        env.callMethod(
                functionObject,
                "setTotals",
                Facade.class,
                function.arrayGet(env, "executableLines"),
                function.arrayGet(env, "executedLines"),
                function.arrayGet(env, "coverage"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tests", typeHint = "array")
    private Object processTests(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object tests = assignParameter(args, 0, false);
        Object result = null;
        Object testsObject = null;
        Object test = null;
        testsObject = env.callMethod(this.project, "getTests", Facade.class);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1109 : ZVal.getIterable(tests, env, false)) {
            test = ZVal.assign(zpairResult1109.getKey());
            result = ZVal.assign(zpairResult1109.getValue());
            if (ZVal.strictEqualityCheck(test, "===", "UNCOVERED_FILES_FROM_WHITELIST")) {
                continue;
            }

            env.callMethod(testsObject, "addTest", Facade.class, test, result);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    @ConvertedParameter(
        index = 1,
        name = "totals",
        typeHint = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Totals"
    )
    private Object setTotals(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object totals = assignParameter(args, 1, false);
        ReferenceContainer loc = new BasicReferenceContainer(null);
        loc.setObject(env.callMethod(node, "getLinesOfCode", Facade.class));
        env.callMethod(
                totals,
                "setNumLines",
                Facade.class,
                loc.arrayGet(env, "loc"),
                loc.arrayGet(env, "cloc"),
                loc.arrayGet(env, "ncloc"),
                env.callMethod(node, "getNumExecutableLines", Facade.class),
                env.callMethod(node, "getNumExecutedLines", Facade.class));
        env.callMethod(
                totals,
                "setNumClasses",
                Facade.class,
                env.callMethod(node, "getNumClasses", Facade.class),
                env.callMethod(node, "getNumTestedClasses", Facade.class));
        env.callMethod(
                totals,
                "setNumTraits",
                Facade.class,
                env.callMethod(node, "getNumTraits", Facade.class),
                env.callMethod(node, "getNumTestedTraits", Facade.class));
        env.callMethod(
                totals,
                "setNumMethods",
                Facade.class,
                env.callMethod(node, "getNumMethods", Facade.class),
                env.callMethod(node, "getNumTestedMethods", Facade.class));
        env.callMethod(
                totals,
                "setNumFunctions",
                Facade.class,
                env.callMethod(node, "getNumFunctions", Facade.class),
                env.callMethod(node, "getNumTestedFunctions", Facade.class));
        return null;
    }

    @ConvertedMethod
    private Object getTargetDirectory(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.target);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "document", typeHint = "DOMDocument")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    private Object saveDocument(RuntimeEnv env, Object... args) {
        Object document = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object filename = null;
        filename =
                function_sprintf
                        .f
                        .env(env)
                        .call("%s/%s.xml", this.getTargetDirectory(env), name)
                        .value();
        toObjectR(document).accessProp(this, env).name("formatOutput").set(true);
        toObjectR(document).accessProp(this, env).name("preserveWhiteSpace").set(false);
        this.initTargetDirectory(env, function_dirname.f.env(env).call(filename).value());
        env.callMethod(document, "save", Facade.class, filename);
        return null;
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

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Facade";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Facade")
                    .setLookup(
                            Facade.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("phpUnitVersion", "project", "target")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Facade.php")
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
