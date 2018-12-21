package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.NoMatchingExpectationException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/ExpectationDirector.php

*/

public class ExpectationDirector extends RuntimeClassBase {

    public Object _name = ZVal.getNull();

    public Object _mock = ZVal.getNull();

    public Object _expectations = ZVal.newArray();

    public Object _expectedOrder = ZVal.getNull();

    public Object _defaults = ZVal.newArray();

    public ExpectationDirector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExpectationDirector.class) {
            this.__construct(env, args);
        }
    }

    public ExpectationDirector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "mock", typeHint = "Mockery\\MockInterface")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object mock = assignParameter(args, 1, false);
        this._name = name;
        this._mock = mock;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectation", typeHint = "Mockery\\Expectation")
    public Object addExpectation(RuntimeEnv env, Object... args) {
        Object expectation = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "_expectations", env).arrayAppend(env).set(expectation);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    public Object call(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object exception = null;
        Object expectation = null;
        expectation = this.findExpectation(env, ___args);
        if (function_is_null.f.env(env).call(expectation).getBool()) {
            exception =
                    new NoMatchingExpectationException(
                            env,
                            "No matching handler found for "
                                    + toStringR(
                                            env.callMethod(
                                                    this._mock,
                                                    "mockery_getName",
                                                    ExpectationDirector.class),
                                            env)
                                    + "::"
                                    + toStringR(
                                            Mockery.runtimeStaticObject.formatArgs(
                                                    env, this._name, ___args),
                                            env)
                                    + ". Either the method was unexpected or its arguments matched"
                                    + " no expected argument list for this method"
                                    + toStringR("\n", env)
                                    + toStringR("\n", env)
                                    + toStringR(
                                            Mockery.runtimeStaticObject.formatObjects(env, ___args),
                                            env));
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    exception, "setMock", ExpectationDirector.class, this._mock),
                            "setMethodName",
                            ExpectationDirector.class,
                            this._name),
                    "setActualArguments",
                    ExpectationDirector.class,
                    ___args);
            throw ZVal.getException(env, exception);
        }

        return ZVal.assign(
                env.callMethod(expectation, "verifyCall", ExpectationDirector.class, ___args));
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object exp = null;
        if (!ZVal.isEmpty(this._expectations)) {
            for (ZPair zpairResult695 : ZVal.getIterable(this._expectations, env, true)) {
                exp = ZVal.assign(zpairResult695.getValue());
                env.callMethod(exp, "verify", ExpectationDirector.class);
            }

        } else {
            for (ZPair zpairResult696 : ZVal.getIterable(this._defaults, env, true)) {
                exp = ZVal.assign(zpairResult696.getValue());
                env.callMethod(exp, "verify", ExpectationDirector.class);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "array")
    public Object findExpectation(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        Object expectation = null;
        expectation = ZVal.getNull();
        if (!ZVal.isEmpty(this._expectations)) {
            expectation = this._findExpectationIn(env, this._expectations, ___args);
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(expectation, "===", ZVal.getNull()))
                && ZVal.toBool(!ZVal.isEmpty(this._defaults))) {
            expectation = this._findExpectationIn(env, this._defaults, ___args);
        }

        return ZVal.assign(expectation);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectation", typeHint = "Mockery\\Expectation")
    public Object makeExpectationDefault(RuntimeEnv env, Object... args) {
        Object expectation = assignParameter(args, 0, false);
        Object last = null;
        last = function_end.f.env(env).call(this._expectations).value();
        if (ZVal.strictEqualityCheck(last, "===", expectation)) {
            function_array_pop.f.env(env).call(this._expectations);
            function_array_unshift.f.env(env).call(this._defaults, expectation);

        } else {
            throw ZVal.getException(
                    env,
                    new Exception(
                            env, "Cannot turn a previously defined expectation into a default"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectations", typeHint = "array")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    protected Object _findExpectationIn(RuntimeEnv env, Object... args) {
        Object expectations = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        Object exp = null;
        for (ZPair zpairResult697 : ZVal.getIterable(expectations, env, true)) {
            exp = ZVal.assign(zpairResult697.getValue());
            if (ZVal.toBool(env.callMethod(exp, "isEligible", ExpectationDirector.class))
                    && ZVal.toBool(
                            env.callMethod(exp, "matchArgs", ExpectationDirector.class, ___args))) {
                return ZVal.assign(exp);
            }
        }

        for (ZPair zpairResult698 : ZVal.getIterable(expectations, env, true)) {
            exp = ZVal.assign(zpairResult698.getValue());
            if (ZVal.isTrue(env.callMethod(exp, "matchArgs", ExpectationDirector.class, ___args))) {
                return ZVal.assign(exp);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getExpectations(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._expectations);
    }

    @ConvertedMethod
    public Object getDefaultExpectations(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._defaults);
    }

    @ConvertedMethod
    public Object getExpectationCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.getExpectations(env)).value());
    }

    public static final Object CONST_class = "Mockery\\ExpectationDirector";

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
                    .setName("Mockery\\ExpectationDirector")
                    .setLookup(
                            ExpectationDirector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_defaults", "_expectations", "_expectedOrder", "_mock", "_name")
                    .setFilename("vendor/mockery/mockery/library/Mockery/ExpectationDirector.php")
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
