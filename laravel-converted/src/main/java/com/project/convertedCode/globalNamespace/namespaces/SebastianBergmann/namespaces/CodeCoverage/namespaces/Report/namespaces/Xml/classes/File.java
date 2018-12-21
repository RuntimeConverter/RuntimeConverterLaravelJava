package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Totals;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes.Coverage;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/File.php

*/

public class File extends RuntimeClassBase {

    public Object dom = null;

    public Object contextNode = null;

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
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        this.dom = toObjectR(context).accessProp(this, env).name("ownerDocument").value();
        this.contextNode = context;
        return null;
    }

    @ConvertedMethod
    public Object getTotals(RuntimeEnv env, Object... args) {
        Object totalsContainer = null;
        totalsContainer =
                ZVal.assign(
                        toObjectR(this.contextNode)
                                .accessProp(this, env)
                                .name("firstChild")
                                .value());
        if (!ZVal.isTrue(totalsContainer)) {
            totalsContainer =
                    env.callMethod(
                            this.contextNode,
                            "appendChild",
                            File.class,
                            env.callMethod(
                                    this.dom,
                                    "createElementNS",
                                    File.class,
                                    "https://schema.phpunit.de/coverage/1.0",
                                    "totals"));
        }

        return ZVal.assign(new Totals(env, totalsContainer));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line", typeHint = "string")
    public Object getLineCoverage(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        Object coverage = null;
        Object lineNode = null;
        coverage =
                env.callMethod(
                        env.callMethod(
                                this.contextNode,
                                "getElementsByTagNameNS",
                                File.class,
                                "https://schema.phpunit.de/coverage/1.0",
                                "coverage"),
                        "item",
                        File.class,
                        0);
        if (!ZVal.isTrue(coverage)) {
            coverage =
                    env.callMethod(
                            this.contextNode,
                            "appendChild",
                            File.class,
                            env.callMethod(
                                    this.dom,
                                    "createElementNS",
                                    File.class,
                                    "https://schema.phpunit.de/coverage/1.0",
                                    "coverage"));
        }

        lineNode =
                env.callMethod(
                        coverage,
                        "appendChild",
                        File.class,
                        env.callMethod(
                                this.dom,
                                "createElementNS",
                                File.class,
                                "https://schema.phpunit.de/coverage/1.0",
                                "line"));
        return ZVal.assign(new Coverage(env, lineNode, line));
    }

    @ConvertedMethod
    protected Object getContextNode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.contextNode);
    }

    @ConvertedMethod
    protected Object getDomDocument(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dom);
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\File";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\File")
                    .setLookup(
                            File.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("contextNode", "dom")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/File.php")
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
