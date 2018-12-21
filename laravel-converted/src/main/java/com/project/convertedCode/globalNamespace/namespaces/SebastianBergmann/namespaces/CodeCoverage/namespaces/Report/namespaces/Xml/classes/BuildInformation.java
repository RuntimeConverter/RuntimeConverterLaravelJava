package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/BuildInformation.php

*/

public final class BuildInformation extends RuntimeClassBase {

    public Object contextNode = null;

    public BuildInformation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BuildInformation.class) {
            this.__construct(env, args);
        }
    }

    public BuildInformation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contextNode", typeHint = "DOMElement")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object contextNode = assignParameter(args, 0, false);
        this.contextNode = contextNode;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "runtime",
        typeHint = "SebastianBergmann\\Environment\\Runtime"
    )
    public Object setRuntimeInformation(RuntimeEnv env, Object... args) {
        Object runtime = assignParameter(args, 0, false);
        Object runtimeNode = null;
        Object driverNode = null;
        runtimeNode = this.getNodeByName(env, "runtime");
        env.callMethod(
                runtimeNode,
                "setAttribute",
                BuildInformation.class,
                "name",
                env.callMethod(runtime, "getName", BuildInformation.class));
        env.callMethod(
                runtimeNode,
                "setAttribute",
                BuildInformation.class,
                "version",
                env.callMethod(runtime, "getVersion", BuildInformation.class));
        env.callMethod(
                runtimeNode,
                "setAttribute",
                BuildInformation.class,
                "url",
                env.callMethod(runtime, "getVendorUrl", BuildInformation.class));
        driverNode = this.getNodeByName(env, "driver");
        if (ZVal.isTrue(env.callMethod(runtime, "hasPHPDBGCodeCoverage", BuildInformation.class))) {
            env.callMethod(driverNode, "setAttribute", BuildInformation.class, "name", "phpdbg");
            env.callMethod(
                    driverNode,
                    "setAttribute",
                    BuildInformation.class,
                    "version",
                    function_constant.f.env(env).call("PHPDBG_VERSION").value());
        }

        if (ZVal.isTrue(env.callMethod(runtime, "hasXdebug", BuildInformation.class))) {
            env.callMethod(driverNode, "setAttribute", BuildInformation.class, "name", "xdebug");
            env.callMethod(
                    driverNode,
                    "setAttribute",
                    BuildInformation.class,
                    "version",
                    NamespaceGlobal.phpversion.env(env).call("xdebug").value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    public Object setBuildTime(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        env.callMethod(
                this.contextNode,
                "setAttribute",
                BuildInformation.class,
                "time",
                env.callMethod(date, "format", BuildInformation.class, "D M j G:i:s T Y"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "phpUnitVersion", typeHint = "string")
    @ConvertedParameter(index = 1, name = "coverageVersion", typeHint = "string")
    public Object setGeneratorVersions(RuntimeEnv env, Object... args) {
        Object phpUnitVersion = assignParameter(args, 0, false);
        Object coverageVersion = assignParameter(args, 1, false);
        env.callMethod(
                this.contextNode,
                "setAttribute",
                BuildInformation.class,
                "phpunit",
                phpUnitVersion);
        env.callMethod(
                this.contextNode,
                "setAttribute",
                BuildInformation.class,
                "coverage",
                coverageVersion);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    private Object getNodeByName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object node = null;
        node =
                env.callMethod(
                        env.callMethod(
                                this.contextNode,
                                "getElementsByTagNameNS",
                                BuildInformation.class,
                                "https://schema.phpunit.de/coverage/1.0",
                                name),
                        "item",
                        BuildInformation.class,
                        0);
        if (!ZVal.isTrue(node)) {
            node =
                    env.callMethod(
                            this.contextNode,
                            "appendChild",
                            BuildInformation.class,
                            env.callMethod(
                                    toObjectR(this.contextNode)
                                            .accessProp(this, env)
                                            .name("ownerDocument")
                                            .value(),
                                    "createElementNS",
                                    BuildInformation.class,
                                    "https://schema.phpunit.de/coverage/1.0",
                                    name));
        }

        return ZVal.assign(node);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Xml\\BuildInformation";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\BuildInformation")
                    .setLookup(
                            BuildInformation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("contextNode")
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Report/Xml/BuildInformation.php")
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
