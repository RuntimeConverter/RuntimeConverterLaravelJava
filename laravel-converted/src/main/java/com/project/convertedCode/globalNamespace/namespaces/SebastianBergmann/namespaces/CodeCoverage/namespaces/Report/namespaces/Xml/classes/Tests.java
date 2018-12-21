package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
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

 vendor/phpunit/php-code-coverage/src/Report/Xml/Tests.php

*/

public final class Tests extends RuntimeClassBase {

    public Object contextNode = null;

    public Object codeMap =
            ZVal.newArray(
                    new ZPair(-1, "UNKNOWN"),
                    new ZPair(0, "PASSED"),
                    new ZPair(1, "SKIPPED"),
                    new ZPair(2, "INCOMPLETE"),
                    new ZPair(3, "FAILURE"),
                    new ZPair(4, "ERROR"),
                    new ZPair(5, "RISKY"),
                    new ZPair(6, "WARNING"));

    public Tests(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Tests.class) {
            this.__construct(env, args);
        }
    }

    public Tests(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        this.contextNode = context;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "string")
    @ConvertedParameter(index = 1, name = "result", typeHint = "array")
    public Object addTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object node = null;
        node =
                env.callMethod(
                        this.contextNode,
                        "appendChild",
                        Tests.class,
                        env.callMethod(
                                toObjectR(this.contextNode)
                                        .accessProp(this, env)
                                        .name("ownerDocument")
                                        .value(),
                                "createElementNS",
                                Tests.class,
                                "https://schema.phpunit.de/coverage/1.0",
                                "test"));
        env.callMethod(node, "setAttribute", Tests.class, "name", test);
        env.callMethod(node, "setAttribute", Tests.class, "size", result.arrayGet(env, "size"));
        env.callMethod(
                node,
                "setAttribute",
                Tests.class,
                "result",
                ZVal.toLong(result.arrayGet(env, "status")));
        env.callMethod(
                node,
                "setAttribute",
                Tests.class,
                "status",
                new ReferenceClassProperty(this, "codeMap", env)
                        .arrayGet(env, ZVal.toLong(result.arrayGet(env, "status"))));
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Tests";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Tests")
                    .setLookup(
                            Tests.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("codeMap", "contextNode")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Tests.php")
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
