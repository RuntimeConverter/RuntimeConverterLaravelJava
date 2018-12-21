package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Util;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Totals.php

*/

public final class Totals extends RuntimeClassBase {

    public Object container = null;

    public Object linesNode = null;

    public Object methodsNode = null;

    public Object functionsNode = null;

    public Object classesNode = null;

    public Object traitsNode = null;

    public Totals(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Totals.class) {
            this.__construct(env, args);
        }
    }

    public Totals(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "container", typeHint = "DOMElement")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object dom = null;
        this.container = container;
        dom = ZVal.assign(toObjectR(container).accessProp(this, env).name("ownerDocument").value());
        this.linesNode =
                env.callMethod(
                        dom,
                        "createElementNS",
                        Totals.class,
                        "https://schema.phpunit.de/coverage/1.0",
                        "lines");
        this.methodsNode =
                env.callMethod(
                        dom,
                        "createElementNS",
                        Totals.class,
                        "https://schema.phpunit.de/coverage/1.0",
                        "methods");
        this.functionsNode =
                env.callMethod(
                        dom,
                        "createElementNS",
                        Totals.class,
                        "https://schema.phpunit.de/coverage/1.0",
                        "functions");
        this.classesNode =
                env.callMethod(
                        dom,
                        "createElementNS",
                        Totals.class,
                        "https://schema.phpunit.de/coverage/1.0",
                        "classes");
        this.traitsNode =
                env.callMethod(
                        dom,
                        "createElementNS",
                        Totals.class,
                        "https://schema.phpunit.de/coverage/1.0",
                        "traits");
        env.callMethod(container, "appendChild", Totals.class, this.linesNode);
        env.callMethod(container, "appendChild", Totals.class, this.methodsNode);
        env.callMethod(container, "appendChild", Totals.class, this.functionsNode);
        env.callMethod(container, "appendChild", Totals.class, this.classesNode);
        env.callMethod(container, "appendChild", Totals.class, this.traitsNode);
        return null;
    }

    @ConvertedMethod
    public Object getContainer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.container);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "loc", typeHint = "int")
    @ConvertedParameter(index = 1, name = "cloc", typeHint = "int")
    @ConvertedParameter(index = 2, name = "ncloc", typeHint = "int")
    @ConvertedParameter(index = 3, name = "executable", typeHint = "int")
    @ConvertedParameter(index = 4, name = "executed", typeHint = "int")
    public Object setNumLines(RuntimeEnv env, Object... args) {
        Object loc = assignParameter(args, 0, false);
        Object cloc = assignParameter(args, 1, false);
        Object ncloc = assignParameter(args, 2, false);
        Object executable = assignParameter(args, 3, false);
        Object executed = assignParameter(args, 4, false);
        env.callMethod(this.linesNode, "setAttribute", Totals.class, "total", loc);
        env.callMethod(this.linesNode, "setAttribute", Totals.class, "comments", cloc);
        env.callMethod(this.linesNode, "setAttribute", Totals.class, "code", ncloc);
        env.callMethod(this.linesNode, "setAttribute", Totals.class, "executable", executable);
        env.callMethod(this.linesNode, "setAttribute", Totals.class, "executed", executed);
        env.callMethod(
                this.linesNode,
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(executable, "===", 0)
                        ? 0
                        : function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, executed, executable))
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "tested", typeHint = "int")
    public Object setNumClasses(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object tested = assignParameter(args, 1, false);
        env.callMethod(this.classesNode, "setAttribute", Totals.class, "count", count);
        env.callMethod(this.classesNode, "setAttribute", Totals.class, "tested", tested);
        env.callMethod(
                this.classesNode,
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(count, "===", 0)
                        ? 0
                        : function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, tested, count))
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "tested", typeHint = "int")
    public Object setNumTraits(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object tested = assignParameter(args, 1, false);
        env.callMethod(this.traitsNode, "setAttribute", Totals.class, "count", count);
        env.callMethod(this.traitsNode, "setAttribute", Totals.class, "tested", tested);
        env.callMethod(
                this.traitsNode,
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(count, "===", 0)
                        ? 0
                        : function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, tested, count))
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "tested", typeHint = "int")
    public Object setNumMethods(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object tested = assignParameter(args, 1, false);
        env.callMethod(this.methodsNode, "setAttribute", Totals.class, "count", count);
        env.callMethod(this.methodsNode, "setAttribute", Totals.class, "tested", tested);
        env.callMethod(
                this.methodsNode,
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(count, "===", 0)
                        ? 0
                        : function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, tested, count))
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", typeHint = "int")
    @ConvertedParameter(index = 1, name = "tested", typeHint = "int")
    public Object setNumFunctions(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object tested = assignParameter(args, 1, false);
        env.callMethod(this.functionsNode, "setAttribute", Totals.class, "count", count);
        env.callMethod(this.functionsNode, "setAttribute", Totals.class, "tested", tested);
        env.callMethod(
                this.functionsNode,
                "setAttribute",
                Totals.class,
                "percent",
                ZVal.strictEqualityCheck(count, "===", 0)
                        ? 0
                        : function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%01.2F",
                                        Util.runtimeStaticObject.percent(env, tested, count))
                                .value());
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Totals";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Totals")
                    .setLookup(
                            Totals.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "classesNode",
                            "container",
                            "functionsNode",
                            "linesNode",
                            "methodsNode",
                            "traitsNode")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Totals.php")
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
