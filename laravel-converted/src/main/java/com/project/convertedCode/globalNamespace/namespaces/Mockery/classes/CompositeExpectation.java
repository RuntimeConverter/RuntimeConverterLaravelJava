package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.ExpectationInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/CompositeExpectation.php

*/

public class CompositeExpectation extends RuntimeClassBase implements ExpectationInterface {

    public Object _expectations = ZVal.newArray();

    public CompositeExpectation(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CompositeExpectation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectation")
    public Object add(RuntimeEnv env, Object... args) {
        Object expectation = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "_expectations", env).arrayAppend(env).set(expectation);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object andReturn(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        return ZVal.assign(this.__call(env, "andReturn", ___args));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object andReturns(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "andReturn")), ___args)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object expectation = null;
        for (ZPair zpairResult682 : ZVal.getIterable(this._expectations, env, true)) {
            expectation = ZVal.assign(zpairResult682.getValue());
            function_call_user_func_array
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(ZVal.newArray(new ZPair(0, expectation), new ZPair(1, method)), ___args);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getOrderNumber(RuntimeEnv env, Object... args) {
        Object first = null;
        function_reset.f.env(env).call(this._expectations);
        first = function_current.f.env(env).call(this._expectations).value();
        return ZVal.assign(env.callMethod(first, "getOrderNumber", CompositeExpectation.class));
    }

    @ConvertedMethod
    public Object getMock(RuntimeEnv env, Object... args) {
        Object first = null;
        function_reset.f.env(env).call(this._expectations);
        first = function_current.f.env(env).call(this._expectations).value();
        return ZVal.assign(env.callMethod(first, "getMock", CompositeExpectation.class));
    }

    @ConvertedMethod
    public Object mock(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getMock(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object shouldReceive(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        Object first = null;
        function_reset.f.env(env).call(this._expectations);
        first = function_current.f.env(env).call(this._expectations).value();
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        first,
                                                        "getMock",
                                                        CompositeExpectation.class)),
                                        new ZPair(1, "shouldReceive")),
                                ___args)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args")
    public Object shouldNotReceive(RuntimeEnv env, Object... args) {
        Object ___args = assignParameterVarArgs(args, 0);
        Object first = null;
        function_reset.f.env(env).call(this._expectations);
        first = function_current.f.env(env).call(this._expectations).value();
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(
                                                        first,
                                                        "getMock",
                                                        CompositeExpectation.class)),
                                        new ZPair(1, "shouldNotReceive")),
                                ___args)
                        .value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        ReferenceContainer parts = new BasicReferenceContainer(null);
        Object exp = null;
        Object _pReturn = null;
        _pReturn = "[";
        parts.setObject(ZVal.newArray());
        for (ZPair zpairResult683 : ZVal.getIterable(this._expectations, env, true)) {
            exp = ZVal.assign(zpairResult683.getValue());
            parts.arrayAppend(env).set(toStringR(exp, env));
        }

        _pReturn =
                toStringR(_pReturn, env)
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(", ", parts.getObject())
                                        .value(),
                                env)
                        + "]";
        return ZVal.assign(_pReturn);
    }

    public static final Object CONST_class = "Mockery\\CompositeExpectation";

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
                    .setName("Mockery\\CompositeExpectation")
                    .setLookup(
                            CompositeExpectation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectations")
                    .setFilename("vendor/mockery/mockery/library/Mockery/CompositeExpectation.php")
                    .addInterface("Mockery\\ExpectationInterface")
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
