package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.Invocation;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedAtIndex.php

*/

public class InvokedAtIndex extends RuntimeClassBase implements Invocation {

    public Object sequenceIndex = null;

    public Object currentIndex = -1;

    public InvokedAtIndex(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvokedAtIndex.class) {
            this.__construct(env, args);
        }
    }

    public InvokedAtIndex(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sequenceIndex")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sequenceIndex = assignParameter(args, 0, false);
        this.sequenceIndex = sequenceIndex;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign("invoked at sequence index " + toStringR(this.sequenceIndex, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        this.currentIndex = ZVal.increment(this.currentIndex);
        return ZVal.assign(ZVal.equalityCheck(this.currentIndex, this.sequenceIndex));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoked(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        if (ZVal.isLessThan(this.currentIndex, '<', this.sequenceIndex)) {
            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The expected invocation at index %s was never reached.",
                                            this.sequenceIndex)
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtIndex";

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
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtIndex")
                    .setLookup(
                            InvokedAtIndex.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("currentIndex", "sequenceIndex")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedAtIndex.php")
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
