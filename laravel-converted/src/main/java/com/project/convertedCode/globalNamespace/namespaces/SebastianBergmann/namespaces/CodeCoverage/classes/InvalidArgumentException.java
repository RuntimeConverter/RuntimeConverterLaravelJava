package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.Exception;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Exception/InvalidArgumentException.php

*/

public final class InvalidArgumentException
        extends com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException
        implements Exception {

    public InvalidArgumentException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvalidArgumentException.class) {
            this.__construct(env, args);
        }
    }

    public InvalidArgumentException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\InvalidArgumentException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.runtimeconverter
                    .runtime
                    .nativeClasses
                    .spl
                    .exceptions
                    .InvalidArgumentException
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument")
        @ConvertedParameter(index = 1, name = "type")
        @ConvertedParameter(
            index = 2,
            name = "value",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, false);
            Object type = assignParameter(args, 1, false);
            Object value = assignParameter(args, 2, true);
            if (null == value) {
                value = ZVal.getNull();
            }
            ReferenceContainer stack = new BasicReferenceContainer(null);
            stack.setObject(NamespaceGlobal.debug_backtrace.env(env).call(0).value());
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .SebastianBergmann
                            .namespaces
                            .CodeCoverage
                            .classes
                            .InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Argument #%d%sof %s::%s() must be a %s",
                                            argument,
                                            ZVal.strictNotEqualityCheck(
                                                            value, "!==", ZVal.getNull())
                                                    ? " ("
                                                            + toStringR(
                                                                    NamespaceGlobal.gettype
                                                                            .env(env)
                                                                            .call(value)
                                                                            .value(),
                                                                    env)
                                                            + "#"
                                                            + toStringR(value, env)
                                                            + ")"
                                                    : " (No Value) ",
                                            stack.arrayGet(env, 1, "class"),
                                            stack.arrayGet(env, 1, "function"),
                                            type)
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\InvalidArgumentException")
                    .setLookup(
                            InvalidArgumentException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Exception/InvalidArgumentException.php")
                    .addInterface("SebastianBergmann\\CodeCoverage\\Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("InvalidArgumentException")
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
