package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.nativeFunctions.array.function_asort;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.Renderer;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_arsort;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/Dashboard.php

*/

public final class Dashboard extends Renderer {

    public Dashboard(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Dashboard.class) {
            this.__construct(env, args);
        }
    }

    public Dashboard(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\Directory"
    )
    @ConvertedParameter(index = 1, name = "file", typeHint = "string")
    public Object render(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        Object template = null;
        ReferenceContainer insufficientCoverage = new BasicReferenceContainer(null);
        ReferenceContainer complexity = new BasicReferenceContainer(null);
        Object classes = null;
        Object baseLink = null;
        ReferenceContainer coverageDistribution = new BasicReferenceContainer(null);
        ReferenceContainer projectRisks = new BasicReferenceContainer(null);
        classes = env.callMethod(node, "getClassesAndTraits", Dashboard.class);
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "dashboard.html",
                        "{{",
                        "}}");
        env.callMethod(this, "setCommonTemplateVariables", Dashboard.class, template, node);
        baseLink = toStringR(env.callMethod(node, "getId", Dashboard.class), env) + "/";
        complexity.setObject(this.complexity(env, classes, baseLink));
        coverageDistribution.setObject(this.coverageDistribution(env, classes));
        insufficientCoverage.setObject(this.insufficientCoverage(env, classes, baseLink));
        projectRisks.setObject(this.projectRisks(env, classes, baseLink));
        env.callMethod(
                template,
                "setVar",
                Dashboard.class,
                ZVal.newArray(
                        new ZPair(
                                "insufficient_coverage_classes",
                                insufficientCoverage.arrayGet(env, "class")),
                        new ZPair(
                                "insufficient_coverage_methods",
                                insufficientCoverage.arrayGet(env, "method")),
                        new ZPair("project_risks_classes", projectRisks.arrayGet(env, "class")),
                        new ZPair("project_risks_methods", projectRisks.arrayGet(env, "method")),
                        new ZPair("complexity_class", complexity.arrayGet(env, "class")),
                        new ZPair("complexity_method", complexity.arrayGet(env, "method")),
                        new ZPair(
                                "class_coverage_distribution",
                                coverageDistribution.arrayGet(env, "class")),
                        new ZPair(
                                "method_coverage_distribution",
                                coverageDistribution.arrayGet(env, "method"))));
        env.callMethod(template, "renderTo", Dashboard.class, file);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "baseLink", typeHint = "string")
    protected Object complexity(RuntimeEnv env, Object... args) {
        Object classes = assignParameter(args, 0, false);
        Object baseLink = assignParameter(args, 1, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object methodName = null;
        Object className = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        result.setObject(
                ZVal.newArray(
                        new ZPair("class", ZVal.newArray()), new ZPair("method", ZVal.newArray())));
        for (ZPair zpairResult1076 : ZVal.getIterable(classes, env, false)) {
            className = ZVal.assign(zpairResult1076.getKey());
            _pClass.setObject(ZVal.assign(zpairResult1076.getValue()));
            for (ZPair zpairResult1077 :
                    ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult1077.getKey());
                method.setObject(ZVal.assign(zpairResult1077.getValue()));
                if (ZVal.strictNotEqualityCheck(className, "!==", "*")) {
                    methodName = toStringR(className, env) + "::" + toStringR(methodName, env);
                }

                result.arrayAppend(env, "method")
                        .set(
                                ZVal.newArray(
                                        new ZPair(0, method.arrayGet(env, "coverage")),
                                        new ZPair(1, method.arrayGet(env, "ccn")),
                                        new ZPair(
                                                2,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "<a href=\"%s\">%s</a>",
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                baseLink,
                                                                                "",
                                                                                method.arrayGet(
                                                                                        env,
                                                                                        "link"))
                                                                        .value(),
                                                                methodName)
                                                        .value())));
            }

            result.arrayAppend(env, "class")
                    .set(
                            ZVal.newArray(
                                    new ZPair(0, _pClass.arrayGet(env, "coverage")),
                                    new ZPair(1, _pClass.arrayGet(env, "ccn")),
                                    new ZPair(
                                            2,
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "<a href=\"%s\">%s</a>",
                                                            function_str_replace
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            baseLink,
                                                                            "",
                                                                            _pClass.arrayGet(
                                                                                    env, "link"))
                                                                    .value(),
                                                            className)
                                                    .value())));
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "class",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(result.arrayGet(env, "class"))
                                        .value()),
                        new ZPair(
                                "method",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(result.arrayGet(env, "method"))
                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    protected Object coverageDistribution(RuntimeEnv env, Object... args) {
        Object classes = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object methodName = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        Object key = null;
        result.setObject(
                ZVal.newArray(
                        new ZPair(
                                "class",
                                ZVal.newArray(
                                        new ZPair("0%", 0),
                                        new ZPair("0-10%", 0),
                                        new ZPair("10-20%", 0),
                                        new ZPair("20-30%", 0),
                                        new ZPair("30-40%", 0),
                                        new ZPair("40-50%", 0),
                                        new ZPair("50-60%", 0),
                                        new ZPair("60-70%", 0),
                                        new ZPair("70-80%", 0),
                                        new ZPair("80-90%", 0),
                                        new ZPair("90-100%", 0),
                                        new ZPair("100%", 0))),
                        new ZPair(
                                "method",
                                ZVal.newArray(
                                        new ZPair("0%", 0),
                                        new ZPair("0-10%", 0),
                                        new ZPair("10-20%", 0),
                                        new ZPair("20-30%", 0),
                                        new ZPair("30-40%", 0),
                                        new ZPair("40-50%", 0),
                                        new ZPair("50-60%", 0),
                                        new ZPair("60-70%", 0),
                                        new ZPair("70-80%", 0),
                                        new ZPair("80-90%", 0),
                                        new ZPair("90-100%", 0),
                                        new ZPair("100%", 0)))));
        for (ZPair zpairResult1078 : ZVal.getIterable(classes, env, true)) {
            _pClass.setObject(ZVal.assign(zpairResult1078.getValue()));
            for (ZPair zpairResult1079 :
                    ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult1079.getKey());
                method.setObject(ZVal.assign(zpairResult1079.getValue()));
                if (ZVal.strictEqualityCheck(method.arrayGet(env, "coverage"), "===", 0)) {
                    result.arrayAccess(env, "method", "0%")
                            .set(ZVal.increment(result.arrayGet(env, "method", "0%")));

                } else if (ZVal.strictEqualityCheck(method.arrayGet(env, "coverage"), "===", 100)) {
                    result.arrayAccess(env, "method", "100%")
                            .set(ZVal.increment(result.arrayGet(env, "method", "100%")));

                } else {
                    key =
                            ZVal.multiply(
                                    function_floor
                                            .f
                                            .env(env)
                                            .call(ZVal.divide(method.arrayGet(env, "coverage"), 10))
                                            .value(),
                                    10);
                    key = toStringR(key, env) + "-" + toStringR(ZVal.add(key, 10), env) + "%";
                    result.arrayAccess(env, "method", key)
                            .set(ZVal.increment(result.arrayGet(env, "method", key)));
                }
            }

            if (ZVal.strictEqualityCheck(_pClass.arrayGet(env, "coverage"), "===", 0)) {
                result.arrayAccess(env, "class", "0%")
                        .set(ZVal.increment(result.arrayGet(env, "class", "0%")));

            } else if (ZVal.strictEqualityCheck(_pClass.arrayGet(env, "coverage"), "===", 100)) {
                result.arrayAccess(env, "class", "100%")
                        .set(ZVal.increment(result.arrayGet(env, "class", "100%")));

            } else {
                key =
                        ZVal.multiply(
                                function_floor
                                        .f
                                        .env(env)
                                        .call(ZVal.divide(_pClass.arrayGet(env, "coverage"), 10))
                                        .value(),
                                10);
                key = toStringR(key, env) + "-" + toStringR(ZVal.add(key, 10), env) + "%";
                result.arrayAccess(env, "class", key)
                        .set(ZVal.increment(result.arrayGet(env, "class", key)));
            }
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "class",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(
                                                function_array_values
                                                        .f
                                                        .env(env)
                                                        .call(result.arrayGet(env, "class"))
                                                        .value())
                                        .value()),
                        new ZPair(
                                "method",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(
                                                function_array_values
                                                        .f
                                                        .env(env)
                                                        .call(result.arrayGet(env, "method"))
                                                        .value())
                                        .value())));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "baseLink", typeHint = "string")
    protected Object insufficientCoverage(RuntimeEnv env, Object... args) {
        ReferenceContainer classes = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object baseLink = assignParameter(args, 1, false);
        ReferenceContainer leastTestedClasses = new BasicReferenceContainer(null);
        Object coverage = null;
        ReferenceContainer method = new BasicReferenceContainer(null);
        ReferenceContainer leastTestedMethods = new BasicReferenceContainer(null);
        Object methodName = null;
        Object className = null;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object runtimeTempArrayResult134 = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        Object key = null;
        leastTestedClasses.setObject(ZVal.newArray());
        leastTestedMethods.setObject(ZVal.newArray());
        result.setObject(ZVal.newArray(new ZPair("class", ""), new ZPair("method", "")));
        for (ZPair zpairResult1080 : ZVal.getIterable(classes.getObject(), env, false)) {
            className = ZVal.assign(zpairResult1080.getKey());
            _pClass.setObject(ZVal.assign(zpairResult1080.getValue()));
            for (ZPair zpairResult1081 :
                    ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult1081.getKey());
                method.setObject(ZVal.assign(zpairResult1081.getValue()));
                if (ZVal.isLessThan(
                        method.arrayGet(env, "coverage"),
                        '<',
                        toObjectR(this).accessProp(this, env).name("highLowerBound").value())) {
                    key = ZVal.assign(methodName);
                    if (ZVal.strictNotEqualityCheck(className, "!==", "*")) {
                        key = toStringR(className, env) + "::" + toStringR(methodName, env);
                    }

                    leastTestedMethods.arrayAccess(env, key).set(method.arrayGet(env, "coverage"));
                }
            }

            if (ZVal.isLessThan(
                    _pClass.arrayGet(env, "coverage"),
                    '<',
                    toObjectR(this).accessProp(this, env).name("highLowerBound").value())) {
                leastTestedClasses
                        .arrayAccess(env, className)
                        .set(_pClass.arrayGet(env, "coverage"));
            }
        }

        function_asort.f.env(env).call(leastTestedClasses.getObject());
        function_asort.f.env(env).call(leastTestedMethods.getObject());
        for (ZPair zpairResult1082 : ZVal.getIterable(leastTestedClasses.getObject(), env, false)) {
            className = ZVal.assign(zpairResult1082.getKey());
            coverage = ZVal.assign(zpairResult1082.getValue());
            result.arrayAccess(env, "class")
                    .set(
                            toStringR(result.arrayGet(env, "class"), env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "       <tr><td><a href=\"%s\">%s</a></td><td class=\"text-right\">%d%%</td></tr>"
                                                                    + "\n",
                                                            function_str_replace
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            baseLink,
                                                                            "",
                                                                            classes.arrayGet(
                                                                                    env, className,
                                                                                    "link"))
                                                                    .value(),
                                                            className,
                                                            coverage)
                                                    .value(),
                                            env));
        }

        for (ZPair zpairResult1083 : ZVal.getIterable(leastTestedMethods.getObject(), env, false)) {
            methodName = ZVal.assign(zpairResult1083.getKey());
            coverage = ZVal.assign(zpairResult1083.getValue());
            ZVal.list(
                    runtimeTempArrayResult134 =
                            function_explode.f.env(env).call("::", methodName).value(),
                    (_pClass.setObject(listGet(runtimeTempArrayResult134, 0, env))),
                    (method.setObject(listGet(runtimeTempArrayResult134, 1, env))));
            result.arrayAccess(env, "method")
                    .set(
                            toStringR(result.arrayGet(env, "method"), env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "       <tr><td><a href=\"%s\"><abbr title=\"%s\">%s</abbr></a></td><td class=\"text-right\">%d%%</td></tr>"
                                                                    + "\n",
                                                            function_str_replace
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            baseLink,
                                                                            "",
                                                                            classes.arrayGet(
                                                                                    env,
                                                                                    _pClass
                                                                                            .getObject(),
                                                                                    "methods",
                                                                                    method
                                                                                            .getObject(),
                                                                                    "link"))
                                                                    .value(),
                                                            methodName,
                                                            method.getObject(),
                                                            coverage)
                                                    .value(),
                                            env));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "baseLink", typeHint = "string")
    protected Object projectRisks(RuntimeEnv env, Object... args) {
        ReferenceContainer classes = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object baseLink = assignParameter(args, 1, false);
        ReferenceContainer methodRisks = new BasicReferenceContainer(null);
        ReferenceContainer method = new BasicReferenceContainer(null);
        Object methodName = null;
        Object className = null;
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object crap = null;
        Object runtimeTempArrayResult135 = null;
        ReferenceContainer classRisks = new BasicReferenceContainer(null);
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        Object key = null;
        classRisks.setObject(ZVal.newArray());
        methodRisks.setObject(ZVal.newArray());
        result.setObject(ZVal.newArray(new ZPair("class", ""), new ZPair("method", "")));
        for (ZPair zpairResult1084 : ZVal.getIterable(classes.getObject(), env, false)) {
            className = ZVal.assign(zpairResult1084.getKey());
            _pClass.setObject(ZVal.assign(zpairResult1084.getValue()));
            for (ZPair zpairResult1085 :
                    ZVal.getIterable(_pClass.arrayGet(env, "methods"), env, false)) {
                methodName = ZVal.assign(zpairResult1085.getKey());
                method.setObject(ZVal.assign(zpairResult1085.getValue()));
                if (ZVal.toBool(
                                ZVal.isLessThan(
                                        method.arrayGet(env, "coverage"),
                                        '<',
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("highLowerBound")
                                                .value()))
                        && ZVal.toBool(ZVal.isGreaterThan(method.arrayGet(env, "ccn"), '>', 1))) {
                    key = ZVal.assign(methodName);
                    if (ZVal.strictNotEqualityCheck(className, "!==", "*")) {
                        key = toStringR(className, env) + "::" + toStringR(methodName, env);
                    }

                    methodRisks.arrayAccess(env, key).set(method.arrayGet(env, "crap"));
                }
            }

            if (ZVal.toBool(
                            ZVal.isLessThan(
                                    _pClass.arrayGet(env, "coverage"),
                                    '<',
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("highLowerBound")
                                            .value()))
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    _pClass.arrayGet(env, "ccn"),
                                    '>',
                                    function_count
                                            .f
                                            .env(env)
                                            .call(_pClass.arrayGet(env, "methods"))
                                            .value()))) {
                classRisks.arrayAccess(env, className).set(_pClass.arrayGet(env, "crap"));
            }
        }

        function_arsort.f.env(env).call(classRisks.getObject());
        function_arsort.f.env(env).call(methodRisks.getObject());
        for (ZPair zpairResult1086 : ZVal.getIterable(classRisks.getObject(), env, false)) {
            className = ZVal.assign(zpairResult1086.getKey());
            crap = ZVal.assign(zpairResult1086.getValue());
            result.arrayAccess(env, "class")
                    .set(
                            toStringR(result.arrayGet(env, "class"), env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "       <tr><td><a href=\"%s\">%s</a></td><td class=\"text-right\">%d</td></tr>"
                                                                    + "\n",
                                                            function_str_replace
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            baseLink,
                                                                            "",
                                                                            classes.arrayGet(
                                                                                    env, className,
                                                                                    "link"))
                                                                    .value(),
                                                            className,
                                                            crap)
                                                    .value(),
                                            env));
        }

        for (ZPair zpairResult1087 : ZVal.getIterable(methodRisks.getObject(), env, false)) {
            methodName = ZVal.assign(zpairResult1087.getKey());
            crap = ZVal.assign(zpairResult1087.getValue());
            ZVal.list(
                    runtimeTempArrayResult135 =
                            function_explode.f.env(env).call("::", methodName).value(),
                    (_pClass.setObject(listGet(runtimeTempArrayResult135, 0, env))),
                    (method.setObject(listGet(runtimeTempArrayResult135, 1, env))));
            result.arrayAccess(env, "method")
                    .set(
                            toStringR(result.arrayGet(env, "method"), env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "       <tr><td><a href=\"%s\"><abbr title=\"%s\">%s</abbr></a></td><td class=\"text-right\">%d</td></tr>"
                                                                    + "\n",
                                                            function_str_replace
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            baseLink,
                                                                            "",
                                                                            classes.arrayGet(
                                                                                    env,
                                                                                    _pClass
                                                                                            .getObject(),
                                                                                    "methods",
                                                                                    method
                                                                                            .getObject(),
                                                                                    "link"))
                                                                    .value(),
                                                            methodName,
                                                            method.getObject(),
                                                            crap)
                                                    .value(),
                                            env));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object getActiveBreadcrumb(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "        <li><a href=\"index.html\">%s</a></li>"
                                        + "\n"
                                        + "        <li class=\"active\">(Dashboard)</li>"
                                        + "\n",
                                env.callMethod(node, "getName", Dashboard.class))
                        .value());
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Html\\Dashboard";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Renderer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\Dashboard")
                    .setLookup(
                            Dashboard.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "date",
                            "generator",
                            "highLowerBound",
                            "lowUpperBound",
                            "templatePath",
                            "version")
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/Dashboard.php")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer")
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
