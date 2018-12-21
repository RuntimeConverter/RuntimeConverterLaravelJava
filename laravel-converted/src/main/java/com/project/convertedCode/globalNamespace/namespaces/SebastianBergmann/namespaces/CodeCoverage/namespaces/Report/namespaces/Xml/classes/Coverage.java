package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.xml.XMLWriter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Coverage.php

*/

public final class Coverage extends RuntimeClassBase {

    public Object writer = null;

    public Object contextNode = null;

    public Object finalized = false;

    public Coverage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Coverage.class) {
            this.__construct(env, args);
        }
    }

    public Coverage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "line", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        this.contextNode = context;
        this.writer = new XMLWriter(env);
        env.callMethod(this.writer, "openMemory", Coverage.class);
        env.callMethod(
                this.writer,
                "startElementNS",
                Coverage.class,
                ZVal.getNull(),
                toObjectR(context).accessProp(this, env).name("nodeName").value(),
                "https://schema.phpunit.de/coverage/1.0");
        env.callMethod(this.writer, "writeAttribute", Coverage.class, "nr", line);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "string")
    public Object addTest(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.finalized)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Coverage Report already finalized"));
        }

        env.callMethod(this.writer, "startElement", Coverage.class, "covered");
        env.callMethod(this.writer, "writeAttribute", Coverage.class, "by", test);
        env.callMethod(this.writer, "endElement", Coverage.class);
        return null;
    }

    @ConvertedMethod
    public Object finalize(RuntimeEnv env, Object... args) {
        Object fragment = null;
        env.callMethod(this.writer, "endElement", Coverage.class);
        fragment =
                env.callMethod(
                        toObjectR(this.contextNode)
                                .accessProp(this, env)
                                .name("ownerDocument")
                                .value(),
                        "createDocumentFragment",
                        Coverage.class);
        env.callMethod(
                fragment,
                "appendXML",
                Coverage.class,
                env.callMethod(this.writer, "outputMemory", Coverage.class));
        env.callMethod(
                toObjectR(this.contextNode).accessProp(this, env).name("parentNode").value(),
                "replaceChild",
                Coverage.class,
                fragment,
                this.contextNode);
        this.finalized = true;
        return null;
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Coverage";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Coverage")
                    .setLookup(
                            Coverage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("contextNode", "finalized", "writer")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Coverage.php")
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
