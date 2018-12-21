package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Report.namespaces.Xml.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Report/Xml/Method.php

*/

public final class Method extends RuntimeClassBase {

    public Object contextNode = null;

    public Method(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Method.class) {
            this.__construct(env, args);
        }
    }

    public Method(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "DOMElement")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        this.contextNode = context;
        this.setName(env, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "signature", typeHint = "string")
    public Object setSignature(RuntimeEnv env, Object... args) {
        Object signature = assignParameter(args, 0, false);
        env.callMethod(this.contextNode, "setAttribute", Method.class, "signature", signature);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "end",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setLines(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, false);
        Object end = assignParameter(args, 1, true);
        if (null == end) {
            end = ZVal.getNull();
        }
        env.callMethod(this.contextNode, "setAttribute", Method.class, "start", start);
        if (ZVal.strictNotEqualityCheck(end, "!==", ZVal.getNull())) {
            env.callMethod(this.contextNode, "setAttribute", Method.class, "end", end);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "executable", typeHint = "string")
    @ConvertedParameter(index = 1, name = "executed", typeHint = "string")
    @ConvertedParameter(index = 2, name = "coverage", typeHint = "string")
    public Object setTotals(RuntimeEnv env, Object... args) {
        Object executable = assignParameter(args, 0, false);
        Object executed = assignParameter(args, 1, false);
        Object coverage = assignParameter(args, 2, false);
        env.callMethod(this.contextNode, "setAttribute", Method.class, "executable", executable);
        env.callMethod(this.contextNode, "setAttribute", Method.class, "executed", executed);
        env.callMethod(this.contextNode, "setAttribute", Method.class, "coverage", coverage);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "crap", typeHint = "string")
    public Object setCrap(RuntimeEnv env, Object... args) {
        Object crap = assignParameter(args, 0, false);
        env.callMethod(this.contextNode, "setAttribute", Method.class, "crap", crap);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    private Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        env.callMethod(this.contextNode, "setAttribute", Method.class, "name", name);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Report\\Xml\\Method";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Report\\Xml\\Method")
                    .setLookup(
                            Method.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("contextNode")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Report/Xml/Method.php")
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
