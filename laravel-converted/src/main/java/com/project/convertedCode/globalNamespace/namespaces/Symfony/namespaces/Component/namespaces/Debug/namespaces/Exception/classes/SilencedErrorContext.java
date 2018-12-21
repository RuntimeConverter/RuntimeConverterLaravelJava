package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
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

 vendor/symfony/debug/Exception/SilencedErrorContext.php

*/

public class SilencedErrorContext extends RuntimeClassBase implements JsonSerializable {

    public Object count = 1;

    public Object severity = null;

    public Object file = null;

    public Object line = null;

    public Object trace = null;

    public SilencedErrorContext(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SilencedErrorContext.class) {
            this.__construct(env, args);
        }
    }

    public SilencedErrorContext(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "severity", typeHint = "int")
    @ConvertedParameter(index = 1, name = "file", typeHint = "string")
    @ConvertedParameter(index = 2, name = "line", typeHint = "int")
    @ConvertedParameter(
        index = 3,
        name = "trace",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "count",
        typeHint = "int",
        defaultValue = "1",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object severity = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        Object line = assignParameter(args, 2, false);
        Object trace = assignParameter(args, 3, true);
        if (null == trace) {
            trace = ZVal.newArray();
        }
        Object count = assignParameter(args, 4, true);
        if (null == count) {
            count = 1;
        }
        this.severity = severity;
        this.file = file;
        this.line = line;
        this.trace = trace;
        this.count = count;
        return null;
    }

    @ConvertedMethod
    public Object getSeverity(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.severity);
    }

    @ConvertedMethod
    public Object getFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.file);
    }

    @ConvertedMethod
    public Object getLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.line);
    }

    @ConvertedMethod
    public Object getTrace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.trace);
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("severity", this.severity),
                        new ZPair("file", this.file),
                        new ZPair("line", this.line),
                        new ZPair("trace", this.trace),
                        new ZPair("count", this.count)));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Debug\\Exception\\SilencedErrorContext";

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
                    .setName("Symfony\\Component\\Debug\\Exception\\SilencedErrorContext")
                    .setLookup(
                            SilencedErrorContext.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("count", "file", "line", "severity", "trace")
                    .setFilename("vendor/symfony/debug/Exception/SilencedErrorContext.php")
                    .addInterface("JsonSerializable")
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
