package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.dom.DOMDocument;
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

 vendor/phpunit/php-code-coverage/src/Report/Crap4j.php

*/

public final class Crap4j extends RuntimeClassBase {

    public Object threshold = null;

    public Crap4j(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Crap4j.class) {
            this.__construct(env, args);
        }
    }

    public Crap4j(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "threshold",
        typeHint = "int",
        defaultValue = "30",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object threshold = assignParameter(args, 0, true);
        if (null == threshold) {
            threshold = 30;
        }
        this.threshold = threshold;
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
        ReferenceContainer fullMethodCount = new BasicReferenceContainer(null);
        Object fullCrap = null;
        Object document = null;
        Object classes = null;
        Object project = null;
        Object className = null;
        Object crapLoad = null;
        ReferenceContainer fullCrapMethodCount = new BasicReferenceContainer(null);
        Object crapMethodPercent = null;
        Object file = null;
        Object stats = null;
        Object root = null;
        Object buffer = null;
        Object methodsNode = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        Object fullCrapLoad = null;
        Object item = null;
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object methodNode = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object methodName = null;
        Object report = null;
        Object namespace = null;
        document = new DOMDocument(env, "1.0", "UTF-8");
        toObjectR(document).accessProp(this, env).name("formatOutput").set(true);
        root = env.callMethod(document, "createElement", Crap4j.class, "crap_result");
        env.callMethod(document, "appendChild", Crap4j.class, root);
        project =
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "project",
                        function_is_string.f.env(env).call(name).getBool() ? name : "");
        env.callMethod(root, "appendChild", Crap4j.class, project);
        env.callMethod(
                root,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "timestamp",
                        function_date
                                .f
                                .env(env)
                                .call(
                                        "Y-m-d H:i:s",
                                        ZVal.toLong(_SERVER.arrayGet(env, "REQUEST_TIME")))
                                .value()));
        stats = env.callMethod(document, "createElement", Crap4j.class, "stats");
        methodsNode = env.callMethod(document, "createElement", Crap4j.class, "methods");
        report = env.callMethod(coverage, "getReport", Crap4j.class);
        coverage = null;
        fullMethodCount.setObject(0);
        fullCrapMethodCount.setObject(0);
        fullCrapLoad = 0;
        fullCrap = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1071 : ZVal.getIterable(report, env, true)) {
            item = ZVal.assign(zpairResult1071.getValue());
            namespace = "global";
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            item, File.class, "SebastianBergmann\\CodeCoverage\\Node\\File"))) {
                continue;
            }

            file = env.callMethod(document, "createElement", Crap4j.class, "file");
            env.callMethod(
                    file,
                    "setAttribute",
                    Crap4j.class,
                    "name",
                    env.callMethod(item, "getPath", Crap4j.class));
            classes = env.callMethod(item, "getClassesAndTraits", Crap4j.class);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1072 : ZVal.getIterable(classes, env, false)) {
                className = ZVal.assign(zpairResult1072.getKey());
                _pClass.setObject(ZVal.assign(zpairResult1072.getValue()));
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1073 :
                        ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, false)) {
                    methodName = ZVal.assign(zpairResult1073.getKey());
                    method.setObject(ZVal.assign(zpairResult1073.getValue()));
                    crapLoad =
                            this.getCrapLoad(
                                    env,
                                    method.arrayGet(env, "crap"),
                                    method.arrayGet(env, "ccn"),
                                    method.arrayGet(env, "coverage"));
                    fullCrap = ZAssignment.add("+=", fullCrap, method.arrayGet(env, "crap"));
                    fullCrapLoad = ZAssignment.add("+=", fullCrapLoad, crapLoad);
                    fullMethodCount.setObject(ZVal.increment(fullMethodCount.getObject()));
                    if (ZVal.isGreaterThanOrEqualTo(
                            method.arrayGet(env, "crap"), ">=", this.threshold)) {
                        fullCrapMethodCount.setObject(
                                ZVal.increment(fullCrapMethodCount.getObject()));
                    }

                    methodNode = env.callMethod(document, "createElement", Crap4j.class, "method");
                    if (!arrayActionR(ArrayAction.EMPTY, _pClass, env, "package", "namespace")) {
                        namespace = ZVal.assign(_pClass.arrayGet(env, "package", "namespace"));
                    }

                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document, "createElement", Crap4j.class, "package", namespace));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "className",
                                    className));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "methodName",
                                    methodName));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "methodSignature",
                                    NamespaceGlobal.htmlspecialchars
                                            .env(env)
                                            .call(method.arrayGet(env, "signature"))
                                            .value()));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "fullMethod",
                                    NamespaceGlobal.htmlspecialchars
                                            .env(env)
                                            .call(method.arrayGet(env, "signature"))
                                            .value()));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "crap",
                                    this.roundValue(env, method.arrayGet(env, "crap"))));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "complexity",
                                    method.arrayGet(env, "ccn")));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "coverage",
                                    this.roundValue(env, method.arrayGet(env, "coverage"))));
                    env.callMethod(
                            methodNode,
                            "appendChild",
                            Crap4j.class,
                            env.callMethod(
                                    document,
                                    "createElement",
                                    Crap4j.class,
                                    "crapLoad",
                                    function_round.f.env(env).call(crapLoad).value()));
                    env.callMethod(methodsNode, "appendChild", Crap4j.class, methodNode);
                }
            }
        }

        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document, "createElement", Crap4j.class, "name", "Method Crap Stats"));
        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "methodCount",
                        fullMethodCount.getObject()));
        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "crapMethodCount",
                        fullCrapMethodCount.getObject()));
        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "crapLoad",
                        function_round.f.env(env).call(fullCrapLoad).value()));
        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(document, "createElement", Crap4j.class, "totalCrap", fullCrap));
        crapMethodPercent = 0;
        if (ZVal.isGreaterThan(fullMethodCount.getObject(), '>', 0)) {
            crapMethodPercent =
                    this.roundValue(
                            env,
                            ZVal.divide(
                                    ZVal.multiply(100, fullCrapMethodCount.getObject()),
                                    fullMethodCount.getObject()));
        }

        env.callMethod(
                stats,
                "appendChild",
                Crap4j.class,
                env.callMethod(
                        document,
                        "createElement",
                        Crap4j.class,
                        "crapMethodPercent",
                        crapMethodPercent));
        env.callMethod(root, "appendChild", Crap4j.class, stats);
        env.callMethod(root, "appendChild", Crap4j.class, methodsNode);
        buffer = env.callMethod(document, "saveXML", Crap4j.class);
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
    @ConvertedParameter(index = 0, name = "crapValue")
    @ConvertedParameter(index = 1, name = "cyclomaticComplexity")
    @ConvertedParameter(index = 2, name = "coveragePercent")
    private Object getCrapLoad(RuntimeEnv env, Object... args) {
        Object crapValue = assignParameter(args, 0, false);
        Object cyclomaticComplexity = assignParameter(args, 1, false);
        Object coveragePercent = assignParameter(args, 2, false);
        Object crapLoad = null;
        crapLoad = 0;
        if (ZVal.isGreaterThanOrEqualTo(crapValue, ">=", this.threshold)) {
            crapLoad =
                    ZAssignment.add(
                            "+=",
                            crapLoad,
                            ZVal.multiply(
                                    cyclomaticComplexity,
                                    ZVal.subtract(1.0, ZVal.divide(coveragePercent, 100))));
            crapLoad =
                    ZAssignment.add(
                            "+=", crapLoad, ZVal.divide(cyclomaticComplexity, this.threshold));
        }

        return ZVal.assign(crapLoad);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object roundValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(function_round.f.env(env).call(value, 2).value());
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

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Crap4j";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Crap4j")
                    .setLookup(
                            Crap4j.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("threshold")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Crap4j.php")
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
