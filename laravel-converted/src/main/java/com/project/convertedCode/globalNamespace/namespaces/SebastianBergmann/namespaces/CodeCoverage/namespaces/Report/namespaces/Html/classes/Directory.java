package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Text_Template;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.Renderer;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/Directory.php

*/

public final class Directory extends Renderer {

    public Directory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Directory.class) {
            this.__construct(env, args);
        }
    }

    public Directory(NoConstructor n) {
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
        Object item = null;
        Object items = null;
        template =
                new Text_Template(
                        env,
                        toStringR(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("templatePath")
                                                .value(),
                                        env)
                                + "directory.html",
                        "{{",
                        "}}");
        env.callMethod(this, "setCommonTemplateVariables", Directory.class, template, node);
        items = this.renderItem(env, node, true);
        for (ZPair zpairResult1088 :
                ZVal.getIterable(
                        env.callMethod(node, "getDirectories", Directory.class), env, true)) {
            item = ZVal.assign(zpairResult1088.getValue());
            items = toStringR(items, env) + toStringR(this.renderItem(env, item), env);
        }

        for (ZPair zpairResult1089 :
                ZVal.getIterable(env.callMethod(node, "getFiles", Directory.class), env, true)) {
            item = ZVal.assign(zpairResult1089.getValue());
            items = toStringR(items, env) + toStringR(this.renderItem(env, item), env);
        }

        env.callMethod(
                template,
                "setVar",
                Directory.class,
                ZVal.newArray(
                        new ZPair("id", env.callMethod(node, "getId", Directory.class)),
                        new ZPair("items", items)));
        env.callMethod(template, "renderTo", Directory.class, file);
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
        name = "total",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object renderItem(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        Object total = assignParameter(args, 1, true);
        if (null == total) {
            total = false;
        }
        ReferenceContainer data = new BasicReferenceContainer(null);
        data.setObject(
                ZVal.newArray(
                        new ZPair(
                                "numClasses",
                                env.callMethod(node, "getNumClassesAndTraits", Directory.class)),
                        new ZPair(
                                "numTestedClasses",
                                env.callMethod(
                                        node, "getNumTestedClassesAndTraits", Directory.class)),
                        new ZPair(
                                "numMethods",
                                env.callMethod(node, "getNumFunctionsAndMethods", Directory.class)),
                        new ZPair(
                                "numTestedMethods",
                                env.callMethod(
                                        node, "getNumTestedFunctionsAndMethods", Directory.class)),
                        new ZPair(
                                "linesExecutedPercent",
                                env.callMethod(
                                        node, "getLineExecutedPercent", Directory.class, false)),
                        new ZPair(
                                "linesExecutedPercentAsString",
                                env.callMethod(node, "getLineExecutedPercent", Directory.class)),
                        new ZPair(
                                "numExecutedLines",
                                env.callMethod(node, "getNumExecutedLines", Directory.class)),
                        new ZPair(
                                "numExecutableLines",
                                env.callMethod(node, "getNumExecutableLines", Directory.class)),
                        new ZPair(
                                "testedMethodsPercent",
                                env.callMethod(
                                        node,
                                        "getTestedFunctionsAndMethodsPercent",
                                        Directory.class,
                                        false)),
                        new ZPair(
                                "testedMethodsPercentAsString",
                                env.callMethod(
                                        node,
                                        "getTestedFunctionsAndMethodsPercent",
                                        Directory.class)),
                        new ZPair(
                                "testedClassesPercent",
                                env.callMethod(
                                        node,
                                        "getTestedClassesAndTraitsPercent",
                                        Directory.class,
                                        false)),
                        new ZPair(
                                "testedClassesPercentAsString",
                                env.callMethod(
                                        node,
                                        "getTestedClassesAndTraitsPercent",
                                        Directory.class))));
        if (ZVal.isTrue(total)) {
            data.arrayAccess(env, "name").set("Total");

        } else {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            node,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .SebastianBergmann
                                    .namespaces
                                    .CodeCoverage
                                    .namespaces
                                    .Node
                                    .classes
                                    .Directory
                                    .class,
                            "SebastianBergmann\\CodeCoverage\\Node\\Directory"))) {
                data.arrayAccess(env, "name")
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<a href=\"%s/index.html\">%s</a>",
                                                env.callMethod(node, "getName", Directory.class),
                                                env.callMethod(node, "getName", Directory.class))
                                        .value());
                data.arrayAccess(env, "icon")
                        .set("<span class=\"glyphicon glyphicon-folder-open\"></span> ");

            } else {
                data.arrayAccess(env, "name")
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<a href=\"%s.html\">%s</a>",
                                                env.callMethod(node, "getName", Directory.class),
                                                env.callMethod(node, "getName", Directory.class))
                                        .value());
                data.arrayAccess(env, "icon")
                        .set("<span class=\"glyphicon glyphicon-file\"></span> ");
            }
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "renderItemTemplate",
                        Directory.class,
                        new Text_Template(
                                env,
                                toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("templatePath")
                                                        .value(),
                                                env)
                                        + "directory_item.html",
                                "{{",
                                "}}"),
                        data.getObject()));
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Html\\Directory";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\Directory")
                    .setLookup(
                            Directory.class,
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
                            "vendor/phpunit/php-code-coverage/src/Report/Html/Renderer/Directory.php")
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
