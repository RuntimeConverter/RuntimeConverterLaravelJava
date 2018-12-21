package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/VerificationDirector.php

*/

public class VerificationDirector extends RuntimeClassBase {

    public Object receivedMethodCalls = null;

    public Object expectation = null;

    public VerificationDirector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == VerificationDirector.class) {
            this.__construct(env, args);
        }
    }

    public VerificationDirector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "receivedMethodCalls",
        typeHint = "Mockery\\ReceivedMethodCalls"
    )
    @ConvertedParameter(
        index = 1,
        name = "expectation",
        typeHint = "Mockery\\VerificationExpectation"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object receivedMethodCalls = assignParameter(args, 0, false);
        Object expectation = assignParameter(args, 1, false);
        this.receivedMethodCalls = receivedMethodCalls;
        this.expectation = expectation;
        return null;
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.receivedMethodCalls,
                        "verify",
                        VerificationDirector.class,
                        this.expectation));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object with(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        return ZVal.assign(this.cloneApplyAndVerify(env, "with", ___args));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object withArgs(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        return ZVal.assign(
                this.cloneApplyAndVerify(env, "withArgs", ZVal.newArray(new ZPair(0, ___args))));
    }

    @ConvertedMethod
    public Object withNoArgs(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cloneApplyAndVerify(env, "withNoArgs", ZVal.newArray()));
    }

    @ConvertedMethod
    public Object withAnyArgs(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.cloneApplyAndVerify(env, "withAnyArgs", ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "limit",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object times(RuntimeEnv env, Object... args) {
        Object limit = assignParameter(args, 0, true);
        if (null == limit) {
            limit = ZVal.getNull();
        }
        return ZVal.assign(
                this.cloneWithoutCountValidatorsApplyAndVerify(
                        env, "times", ZVal.newArray(new ZPair(0, limit))));
    }

    @ConvertedMethod
    public Object once(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.cloneWithoutCountValidatorsApplyAndVerify(env, "once", ZVal.newArray()));
    }

    @ConvertedMethod
    public Object twice(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.cloneWithoutCountValidatorsApplyAndVerify(env, "twice", ZVal.newArray()));
    }

    @ConvertedMethod
    public Object atLeast(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.cloneWithoutCountValidatorsApplyAndVerify(env, "atLeast", ZVal.newArray()));
    }

    @ConvertedMethod
    public Object atMost(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.cloneWithoutCountValidatorsApplyAndVerify(env, "atMost", ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "minimum")
    @ConvertedParameter(index = 1, name = "maximum")
    public Object between(RuntimeEnv env, Object... args) {
        Object minimum = assignParameter(args, 0, false);
        Object maximum = assignParameter(args, 1, false);
        return ZVal.assign(
                this.cloneWithoutCountValidatorsApplyAndVerify(
                        env,
                        "between",
                        ZVal.newArray(new ZPair(0, minimum), new ZPair(1, maximum))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    protected Object cloneWithoutCountValidatorsApplyAndVerify(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object director = null;
        Object expectation = null;
        expectation = ZVal.assign(((RuntimeClassInterface) this.expectation).phpClone(env));
        env.callMethod(expectation, "clearCountValidators", VerificationDirector.class);
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(ZVal.newArray(new ZPair(0, expectation), new ZPair(1, method)), ___args);
        director =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Mockery
                        .classes
                        .VerificationDirector(env, this.receivedMethodCalls, expectation);
        env.callMethod(director, "verify", VerificationDirector.class);
        return ZVal.assign(director);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    protected Object cloneApplyAndVerify(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object director = null;
        Object expectation = null;
        expectation = ZVal.assign(((RuntimeClassInterface) this.expectation).phpClone(env));
        function_call_user_func_array
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(ZVal.newArray(new ZPair(0, expectation), new ZPair(1, method)), ___args);
        director =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Mockery
                        .classes
                        .VerificationDirector(env, this.receivedMethodCalls, expectation);
        env.callMethod(director, "verify", VerificationDirector.class);
        return ZVal.assign(director);
    }

    public static final Object CONST_class = "Mockery\\VerificationDirector";

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
                    .setName("Mockery\\VerificationDirector")
                    .setLookup(
                            VerificationDirector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("expectation", "receivedMethodCalls")
                    .setFilename("vendor/mockery/mockery/library/Mockery/VerificationDirector.php")
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
