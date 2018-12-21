package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.AssertionFailedError;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/SyntheticError.php

*/

public class SyntheticError extends AssertionFailedError {

    public Object syntheticFile = "";

    public Object syntheticLine = 0;

    public Object syntheticTrace = ZVal.newArray();

    public SyntheticError(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SyntheticError.class) {
            this.__construct(env, args);
        }
    }

    public SyntheticError(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(index = 1, name = "code", typeHint = "int")
    @ConvertedParameter(index = 2, name = "file", typeHint = "string")
    @ConvertedParameter(index = 3, name = "line", typeHint = "int")
    @ConvertedParameter(index = 4, name = "trace", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        Object file = assignParameter(args, 2, false);
        Object line = assignParameter(args, 3, false);
        Object trace = assignParameter(args, 4, false);
        super.__construct(env, message, code);
        this.syntheticFile = file;
        this.syntheticLine = line;
        this.syntheticTrace = trace;
        return null;
    }

    @ConvertedMethod
    public Object getSyntheticFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.syntheticFile);
    }

    @ConvertedMethod
    public Object getSyntheticLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.syntheticLine);
    }

    @ConvertedMethod
    public Object getSyntheticTrace(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.syntheticTrace);
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\SyntheticError";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AssertionFailedError.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\SyntheticError")
                    .setLookup(
                            SyntheticError.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "serializableTrace", "syntheticFile", "syntheticLine", "syntheticTrace")
                    .setFilename("vendor/phpunit/phpunit/src/Framework/SyntheticError.php")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addInterface("PHPUnit\\Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("PHPUnit\\Framework\\AssertionFailedError")
                    .addExtendsClass("PHPUnit\\Framework\\Exception")
                    .addExtendsClass("RuntimeException")
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
