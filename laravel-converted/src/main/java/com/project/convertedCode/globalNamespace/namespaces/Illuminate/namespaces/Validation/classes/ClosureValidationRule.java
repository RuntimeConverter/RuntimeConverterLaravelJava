package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Validation.classes.Rule;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/ClosureValidationRule.php

*/

public class ClosureValidationRule extends RuntimeClassBase implements Rule {

    public Object callback = null;

    public Object failed = false;

    public Object message = null;

    public ClosureValidationRule(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClosureValidationRule.class) {
            this.__construct(env, args);
        }
    }

    public ClosureValidationRule(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        this.callback = callback;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    @ConvertedParameter(index = 1, name = "value")
    public Object passes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/ClosureValidationRule.php");
        Object attribute = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.failed = false;
        env.callMethod(
                this.callback,
                "__invoke",
                ClosureValidationRule.class,
                attribute,
                value,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Validation",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "message")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object message = assignParameter(args, 0, false);
                        ClosureValidationRule.this.failed = true;
                        ClosureValidationRule.this.message = message;
                        return null;
                    }
                });
        return ZVal.assign(!ZVal.isTrue(this.failed));
    }

    @ConvertedMethod
    public Object message(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.message);
    }

    public static final Object CONST_class = "Illuminate\\Validation\\ClosureValidationRule";

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
                    .setName("Illuminate\\Validation\\ClosureValidationRule")
                    .setLookup(
                            ClosureValidationRule.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("callback", "failed", "message")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/ClosureValidationRule.php")
                    .addInterface("Illuminate\\Contracts\\Validation\\Rule")
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
