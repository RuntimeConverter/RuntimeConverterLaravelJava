package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/ExceptionMessage.php

*/

public class ExceptionMessage extends Constraint {

    public Object expectedMessage = null;

    public ExceptionMessage(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExceptionMessage.class) {
            this.__construct(env, args);
        }
    }

    public ExceptionMessage(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, false);
        super.__construct(env);
        this.expectedMessage = expected;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(this.expectedMessage, "===", "")) {
            return "exception message is empty";
        }

        return "exception message contains ";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(this.expectedMessage, "===", "")) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            env.callMethod(other, "getMessage", ExceptionMessage.class),
                            "===",
                            ""));
        }

        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_strpos
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(other, "getMessage", ExceptionMessage.class),
                                        this.expectedMessage)
                                .value(),
                        "!==",
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object failureDescription(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(this.expectedMessage, "===", "")) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "exception message is empty but is '%s'",
                                    env.callMethod(other, "getMessage", ExceptionMessage.class))
                            .value());
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "exception message '%s' contains '%s'",
                                env.callMethod(other, "getMessage", ExceptionMessage.class),
                                this.expectedMessage)
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\ExceptionMessage";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\ExceptionMessage")
                    .setLookup(
                            ExceptionMessage.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("expectedMessage", "exporter")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/ExceptionMessage.php")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
