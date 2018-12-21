package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.Invocation;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedRecorder.php

*/

public abstract class InvokedRecorder extends RuntimeClassBase implements Invocation {

    public Object invocations = ZVal.newArray();

    public InvokedRecorder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public InvokedRecorder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getInvocationCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.invocations).value());
    }

    @ConvertedMethod
    public Object getInvocations(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.invocations);
    }

    @ConvertedMethod
    public Object hasBeenInvoked(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_count.f.env(env).call(this.invocations).value(), '>', 0));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoked(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "invocations", env).arrayAppend(env).set(invocation);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedRecorder";

    @ConvertedMethod()
    public abstract Object toString(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object verify(RuntimeEnv env, Object... args);

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
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedRecorder")
                    .setLookup(
                            InvokedRecorder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("invocations")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedRecorder.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Matcher\\Invocation")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Verifiable")
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
