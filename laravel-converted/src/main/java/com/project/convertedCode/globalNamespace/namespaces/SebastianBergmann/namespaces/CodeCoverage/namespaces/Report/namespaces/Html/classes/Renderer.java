package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Version;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.File;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Directory;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Renderer.php

*/

public abstract class Renderer extends RuntimeClassBase {

    public Object templatePath = null;

    public Object generator = null;

    public Object date = null;

    public Object lowUpperBound = null;

    public Object highLowerBound = null;

    public Object version = null;

    public Renderer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Renderer.class) {
            this.__construct(env, args);
        }
    }

    public Renderer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "templatePath", typeHint = "string")
    @ConvertedParameter(index = 1, name = "generator", typeHint = "string")
    @ConvertedParameter(index = 2, name = "date", typeHint = "string")
    @ConvertedParameter(index = 3, name = "lowUpperBound", typeHint = "int")
    @ConvertedParameter(index = 4, name = "highLowerBound", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object templatePath = assignParameter(args, 0, false);
        Object generator = assignParameter(args, 1, false);
        Object date = assignParameter(args, 2, false);
        Object lowUpperBound = assignParameter(args, 3, false);
        Object highLowerBound = assignParameter(args, 4, false);
        this.templatePath = templatePath;
        this.generator = generator;
        this.date = date;
        this.lowUpperBound = lowUpperBound;
        this.highLowerBound = highLowerBound;
        this.version = Version.runtimeStaticObject.id(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template", typeHint = "Text_Template")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    protected Object renderItemTemplate(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object numSeparator = null;
        Object classesLevel = null;
        Object ternaryExpressionTemp = null;
        Object classesBar = null;
        Object linesNumber = null;
        Object methodsLevel = null;
        Object classesNumber = null;
        Object linesBar = null;
        Object methodsBar = null;
        Object methodsNumber = null;
        Object linesLevel = null;
        numSeparator = "&nbsp;/&nbsp;";
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, data, env, "numClasses"))
                && ZVal.toBool(ZVal.isGreaterThan(data.arrayGet(env, "numClasses"), '>', 0))) {
            classesLevel = this.getColorLevel(env, data.arrayGet(env, "testedClassesPercent"));
            classesNumber =
                    toStringR(data.arrayGet(env, "numTestedClasses"), env)
                            + toStringR(numSeparator, env)
                            + toStringR(data.arrayGet(env, "numClasses"), env);
            classesBar = this.getCoverageBar(env, data.arrayGet(env, "testedClassesPercent"));

        } else {
            classesLevel = "";
            classesNumber = "0" + toStringR(numSeparator, env) + "0";
            classesBar = "";
            data.arrayAccess(env, "testedClassesPercentAsString").set("n/a");
        }

        if (ZVal.isGreaterThan(data.arrayGet(env, "numMethods"), '>', 0)) {
            methodsLevel = this.getColorLevel(env, data.arrayGet(env, "testedMethodsPercent"));
            methodsNumber =
                    toStringR(data.arrayGet(env, "numTestedMethods"), env)
                            + toStringR(numSeparator, env)
                            + toStringR(data.arrayGet(env, "numMethods"), env);
            methodsBar = this.getCoverageBar(env, data.arrayGet(env, "testedMethodsPercent"));

        } else {
            methodsLevel = "";
            methodsNumber = "0" + toStringR(numSeparator, env) + "0";
            methodsBar = "";
            data.arrayAccess(env, "testedMethodsPercentAsString").set("n/a");
        }

        if (ZVal.isGreaterThan(data.arrayGet(env, "numExecutableLines"), '>', 0)) {
            linesLevel = this.getColorLevel(env, data.arrayGet(env, "linesExecutedPercent"));
            linesNumber =
                    toStringR(data.arrayGet(env, "numExecutedLines"), env)
                            + toStringR(numSeparator, env)
                            + toStringR(data.arrayGet(env, "numExecutableLines"), env);
            linesBar = this.getCoverageBar(env, data.arrayGet(env, "linesExecutedPercent"));

        } else {
            linesLevel = "";
            linesNumber = "0" + toStringR(numSeparator, env) + "0";
            linesBar = "";
            data.arrayAccess(env, "linesExecutedPercentAsString").set("n/a");
        }

        env.callMethod(
                template,
                "setVar",
                Renderer.class,
                ZVal.newArray(
                        new ZPair(
                                "icon",
                                ZVal.isDefined(ternaryExpressionTemp = data.arrayGet(env, "icon"))
                                        ? ternaryExpressionTemp
                                        : ""),
                        new ZPair(
                                "crap",
                                ZVal.isDefined(ternaryExpressionTemp = data.arrayGet(env, "crap"))
                                        ? ternaryExpressionTemp
                                        : ""),
                        new ZPair("name", data.arrayGet(env, "name")),
                        new ZPair("lines_bar", linesBar),
                        new ZPair(
                                "lines_executed_percent",
                                data.arrayGet(env, "linesExecutedPercentAsString")),
                        new ZPair("lines_level", linesLevel),
                        new ZPair("lines_number", linesNumber),
                        new ZPair("methods_bar", methodsBar),
                        new ZPair(
                                "methods_tested_percent",
                                data.arrayGet(env, "testedMethodsPercentAsString")),
                        new ZPair("methods_level", methodsLevel),
                        new ZPair("methods_number", methodsNumber),
                        new ZPair("classes_bar", classesBar),
                        new ZPair(
                                "classes_tested_percent",
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        data.arrayGet(
                                                                env,
                                                                "testedClassesPercentAsString"))
                                        ? ternaryExpressionTemp
                                        : ""),
                        new ZPair("classes_level", classesLevel),
                        new ZPair("classes_number", classesNumber)));
        return ZVal.assign(env.callMethod(template, "render", Renderer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "template", typeHint = "Text_Template")
    @ConvertedParameter(
        index = 1,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object setCommonTemplateVariables(RuntimeEnv env, Object... args) {
        Object template = assignParameter(args, 0, false);
        Object node = assignParameter(args, 1, false);
        env.callMethod(
                template,
                "setVar",
                Renderer.class,
                ZVal.newArray(
                        new ZPair("id", env.callMethod(node, "getId", Renderer.class)),
                        new ZPair("full_path", env.callMethod(node, "getPath", Renderer.class)),
                        new ZPair("path_to_root", this.getPathToRoot(env, node)),
                        new ZPair("breadcrumbs", this.getBreadcrumbs(env, node)),
                        new ZPair("date", this.date),
                        new ZPair("version", this.version),
                        new ZPair("runtime", this.getRuntimeString(env)),
                        new ZPair("generator", this.generator),
                        new ZPair("low_upper_bound", this.lowUpperBound),
                        new ZPair("high_lower_bound", this.highLowerBound)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object getBreadcrumbs(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object path = null;
        ReferenceContainer max = new BasicReferenceContainer(null);
        ReferenceContainer pathToRoot = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object step = null;
        Object breadcrumbs = null;
        breadcrumbs = "";
        path = env.callMethod(node, "getPathAsArray", Renderer.class);
        pathToRoot.setObject(ZVal.newArray());
        max.setObject(function_count.f.env(env).call(path).value());
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node, File.class, "SebastianBergmann\\CodeCoverage\\Node\\File"))) {
            max.setObject(ZVal.decrement(max.getObject()));
        }

        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', max.getObject());
                i.setObject(ZVal.increment(i.getObject()))) {
            pathToRoot
                    .arrayAppend(env)
                    .set(function_str_repeat.f.env(env).call("../", i.getObject()).value());
        }

        for (ZPair zpairResult1075 : ZVal.getIterable(path, env, true)) {
            step = ZVal.assign(zpairResult1075.getValue());
            if (ZVal.strictNotEqualityCheck(step, "!==", node)) {
                breadcrumbs =
                        toStringR(breadcrumbs, env)
                                + toStringR(
                                        this.getInactiveBreadcrumb(
                                                env,
                                                step,
                                                function_array_pop
                                                        .f
                                                        .env(env)
                                                        .call(pathToRoot.getObject())
                                                        .value()),
                                        env);

            } else {
                breadcrumbs =
                        toStringR(breadcrumbs, env)
                                + toStringR(this.getActiveBreadcrumb(env, step), env);
            }
        }

        return ZVal.assign(breadcrumbs);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object getActiveBreadcrumb(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object buffer = null;
        buffer =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "        <li class=\"active\">%s</li>" + "\n",
                                env.callMethod(node, "getName", Renderer.class))
                        .value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        node,
                        Directory.class,
                        "SebastianBergmann\\CodeCoverage\\Node\\Directory"))) {
            buffer =
                    toStringR(buffer, env)
                            + "        <li>(<a href=\"dashboard.html\">Dashboard</a>)</li>"
                            + "\n";
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    @ConvertedParameter(index = 1, name = "pathToRoot", typeHint = "string")
    protected Object getInactiveBreadcrumb(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object pathToRoot = assignParameter(args, 1, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "        <li><a href=\"%sindex.html\">%s</a></li>" + "\n",
                                pathToRoot, env.callMethod(node, "getName", Renderer.class))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\AbstractNode"
    )
    protected Object getPathToRoot(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        ReferenceContainer depth = new BasicReferenceContainer(null);
        Object id = null;
        id = env.callMethod(node, "getId", Renderer.class);
        depth.setObject(NamespaceGlobal.substr_count.env(env).call(id, "/").value());
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(id, "!==", "index"))
                && ZVal.toBool(
                        ZVal.checkInstanceType(
                                node,
                                Directory.class,
                                "SebastianBergmann\\CodeCoverage\\Node\\Directory"))) {
            depth.setObject(ZVal.increment(depth.getObject()));
        }

        return ZVal.assign(function_str_repeat.f.env(env).call("../", depth.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "percent", typeHint = "float")
    protected Object getCoverageBar(RuntimeEnv env, Object... args) {
        Object percent = assignParameter(args, 0, false);
        Object template = null;
        Object level = null;
        level = this.getColorLevel(env, percent);
        template =
                new Text_Template(
                        env, toStringR(this.templatePath, env) + "coverage_bar.html", "{{", "}}");
        env.callMethod(
                template,
                "setVar",
                Renderer.class,
                ZVal.newArray(
                        new ZPair("level", level),
                        new ZPair(
                                "percent",
                                function_sprintf.f.env(env).call("%.2F", percent).value())));
        return ZVal.assign(env.callMethod(template, "render", Renderer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "percent", typeHint = "float")
    protected Object getColorLevel(RuntimeEnv env, Object... args) {
        Object percent = assignParameter(args, 0, false);
        if (ZVal.isLessThanOrEqualTo(percent, "<=", this.lowUpperBound)) {
            return "danger";
        }

        if (ZVal.toBool(ZVal.isGreaterThan(percent, '>', this.lowUpperBound))
                && ZVal.toBool(ZVal.isLessThan(percent, '<', this.highLowerBound))) {
            return "warning";
        }

        return "success";
    }

    @ConvertedMethod
    private Object getRuntimeString(RuntimeEnv env, Object... args) {
        Object runtime = null;
        Object buffer = null;
        runtime = new Runtime(env);
        buffer =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<a href=\"%s\" target=\"_top\">%s %s</a>",
                                env.callMethod(runtime, "getVendorUrl", Renderer.class),
                                env.callMethod(runtime, "getName", Renderer.class),
                                env.callMethod(runtime, "getVersion", Renderer.class))
                        .value();
        if (ZVal.toBool(env.callMethod(runtime, "hasXdebug", Renderer.class))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(
                                        runtime, "hasPHPDBGCodeCoverage", Renderer.class)))) {
            buffer =
                    toStringR(buffer, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " with <a href=\"https://xdebug.org/\">Xdebug %s</a>",
                                                    NamespaceGlobal.phpversion
                                                            .env(env)
                                                            .call("xdebug")
                                                            .value())
                                            .value(),
                                    env);
        }

        return ZVal.assign(buffer);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\Renderer")
                    .setLookup(
                            Renderer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "date",
                            "generator",
                            "highLowerBound",
                            "lowUpperBound",
                            "templatePath",
                            "version")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Html/Renderer.php")
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
