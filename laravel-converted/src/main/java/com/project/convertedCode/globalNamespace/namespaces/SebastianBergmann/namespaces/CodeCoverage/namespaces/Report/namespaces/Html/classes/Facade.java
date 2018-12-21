package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.Dashboard;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Html.classes.File;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Html/Facade.php

*/

public final class Facade extends RuntimeClassBase {

    public Object templatePath = null;

    public Object generator = null;

    public Object lowUpperBound = null;

    public Object highLowerBound = null;

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
    @ConvertedParameter(index = 2, name = "generator", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lowUpperBound = assignParameter(args, 0, true);
        if (null == lowUpperBound) {
            lowUpperBound = 50;
        }
        Object highLowerBound = assignParameter(args, 1, true);
        if (null == highLowerBound) {
            highLowerBound = 90;
        }
        Object generator = assignParameter(args, 2, true);
        if (null == generator) {
            generator = "";
        }
        this.generator = generator;
        this.highLowerBound = highLowerBound;
        this.lowUpperBound = lowUpperBound;
        this.templatePath =
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/phpunit/php-code-coverage/src/Report/Html"),
                                env)
                        + "/Renderer/Template/";
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
        Object date = null;
        Object node = null;
        Object file = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object report = null;
        Object id = null;
        Object dir = null;
        Object directory = null;
        Object dashboard = null;
        target = this.getDirectory(env, target);
        report = env.callMethod(coverage, "getReport", Facade.class);
        if (!arrayActionR(ArrayAction.ISSET, _SERVER, env, "REQUEST_TIME")) {
            _SERVER.arrayAccess(env, "REQUEST_TIME")
                    .set(NamespaceGlobal.time.env(env).call().value());
        }

        date =
                function_date
                        .f
                        .env(env)
                        .call("D M j G:i:s T Y", _SERVER.arrayGet(env, "REQUEST_TIME"))
                        .value();
        dashboard =
                new Dashboard(
                        env,
                        this.templatePath,
                        this.generator,
                        date,
                        this.lowUpperBound,
                        this.highLowerBound);
        directory =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .SebastianBergmann
                        .namespaces
                        .CodeCoverage
                        .namespaces
                        .Report
                        .namespaces
                        .Html
                        .classes
                        .Directory(
                        env,
                        this.templatePath,
                        this.generator,
                        date,
                        this.lowUpperBound,
                        this.highLowerBound);
        file =
                new File(
                        env,
                        this.templatePath,
                        this.generator,
                        date,
                        this.lowUpperBound,
                        this.highLowerBound);
        env.callMethod(
                directory, "render", Facade.class, report, toStringR(target, env) + "index.html");
        env.callMethod(
                dashboard,
                "render",
                Facade.class,
                report,
                toStringR(target, env) + "dashboard.html");
        for (ZPair zpairResult1074 : ZVal.getIterable(report, env, true)) {
            node = ZVal.assign(zpairResult1074.getValue());
            id = env.callMethod(node, "getId", Facade.class);
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
                if (!ZVal.isTrue(
                        this.createDirectory(env, toStringR(target, env) + toStringR(id, env)))) {
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
                                                    toStringR(target, env) + toStringR(id, env))
                                            .value()));
                }

                env.callMethod(
                        directory,
                        "render",
                        Facade.class,
                        node,
                        toStringR(target, env) + toStringR(id, env) + "/index.html");
                env.callMethod(
                        dashboard,
                        "render",
                        Facade.class,
                        node,
                        toStringR(target, env) + toStringR(id, env) + "/dashboard.html");

            } else {
                dir =
                        function_dirname
                                .f
                                .env(env)
                                .call(toStringR(target, env) + toStringR(id, env))
                                .value();
                if (!ZVal.isTrue(this.createDirectory(env, dir))) {
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
                                            .call("Directory \"%s\" was not created", dir)
                                            .value()));
                }

                env.callMethod(
                        file,
                        "render",
                        Facade.class,
                        node,
                        toStringR(target, env) + toStringR(id, env) + ".html");
            }
        }

        this.copyFiles(env, target);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target", typeHint = "string")
    private Object copyFiles(RuntimeEnv env, Object... args) {
        Object target = assignParameter(args, 0, false);
        Object dir = null;
        dir = this.getDirectory(env, toStringR(target, env) + ".css");
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        toStringR(dir, env) + "bootstrap.min.css",
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "url(../fonts/",
                                        "url(../.fonts/",
                                        function_file_get_contents
                                                .f
                                                .env(env)
                                                .call(
                                                        toStringR(this.templatePath, env)
                                                                + "css/bootstrap.min.css")
                                                .value())
                                .value());
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "css/nv.d3.min.css",
                        toStringR(dir, env) + "nv.d3.min.css");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "css/style.css",
                        toStringR(dir, env) + "style.css");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "css/custom.css",
                        toStringR(dir, env) + "custom.css");
        dir = this.getDirectory(env, toStringR(target, env) + ".fonts");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env)
                                + "fonts/glyphicons-halflings-regular.eot",
                        toStringR(dir, env) + "glyphicons-halflings-regular.eot");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env)
                                + "fonts/glyphicons-halflings-regular.svg",
                        toStringR(dir, env) + "glyphicons-halflings-regular.svg");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env)
                                + "fonts/glyphicons-halflings-regular.ttf",
                        toStringR(dir, env) + "glyphicons-halflings-regular.ttf");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env)
                                + "fonts/glyphicons-halflings-regular.woff",
                        toStringR(dir, env) + "glyphicons-halflings-regular.woff");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env)
                                + "fonts/glyphicons-halflings-regular.woff2",
                        toStringR(dir, env) + "glyphicons-halflings-regular.woff2");
        dir = this.getDirectory(env, toStringR(target, env) + ".js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "js/bootstrap.min.js",
                        toStringR(dir, env) + "bootstrap.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "js/d3.min.js",
                        toStringR(dir, env) + "d3.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "js/holder.min.js",
                        toStringR(dir, env) + "holder.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "js/html5shiv.min.js",
                        toStringR(dir, env) + "html5shiv.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "js/jquery.min.js",
                        toStringR(dir, env) + "jquery.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "js/nv.d3.min.js",
                        toStringR(dir, env) + "nv.d3.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "js/respond.min.js",
                        toStringR(dir, env) + "respond.min.js");
        NamespaceGlobal.copy
                .env(env)
                .call(
                        toStringR(this.templatePath, env) + "js/file.js",
                        toStringR(dir, env) + "file.js");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    private Object getDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        if (ZVal.notEqualityCheck(function_substr.f.env(env).call(directory, -1, 1).value(), "/")) {
            directory = toStringR(directory, env) + toStringR("/", env);
        }

        if (!ZVal.isTrue(this.createDirectory(env, directory))) {
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
                                    .call("Directory \"%s\" does not exist.", directory)
                                    .value()));
        }

        return ZVal.assign(directory);
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

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Html\\Facade";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Html\\Facade")
                    .setLookup(
                            Facade.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "generator", "highLowerBound", "lowUpperBound", "templatePath")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Html/Facade.php")
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
