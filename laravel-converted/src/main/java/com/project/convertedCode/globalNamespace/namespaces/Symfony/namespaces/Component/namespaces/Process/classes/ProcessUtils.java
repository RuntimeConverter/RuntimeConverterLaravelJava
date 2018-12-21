package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes;

import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.Process;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.IteratorIterator;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/ProcessUtils.php

*/

public class ProcessUtils extends RuntimeClassBase {

    public ProcessUtils(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProcessUtils.class) {
            this.__construct(env, args);
        }
    }

    public ProcessUtils(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    private Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Process\\ProcessUtils";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "caller")
        @ConvertedParameter(index = 1, name = "input")
        public Object validateInput(RuntimeEnv env, Object... args) {
            Object caller = assignParameter(args, 0, false);
            Object input = assignParameter(args, 1, false);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", input)) {
                if (function_is_resource.f.env(env).call(input).getBool()) {
                    return ZVal.assign(input);
                }

                if (function_is_string.f.env(env).call(input).getBool()) {
                    return ZVal.assign(input);
                }

                if (function_is_scalar.f.env(env).call(input).getBool()) {
                    return ZVal.assign(toStringR(input, env));
                }

                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                input, Process.class, "Symfony\\Component\\Process\\Process"))) {
                    return ZVal.assign(
                            env.callMethod(
                                    input,
                                    "getIterator",
                                    ProcessUtils.class,
                                    ClassConstantUtils.getConstantValueByClass(
                                            env, input, "ITER_SKIP_ERR")));
                }

                if (ZVal.isTrue(ZVal.checkInstanceType(input, Iterator.class, "Iterator"))) {
                    return ZVal.assign(input);
                }

                if (ZVal.isTrue(ZVal.checkInstanceType(input, Traversable.class, "Traversable"))) {
                    return ZVal.assign(new IteratorIterator(env, input));
                }

                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%s only accepts strings, Traversable objects or stream resources.",
                                                caller)
                                        .value()));
            }

            return ZVal.assign(input);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Process\\ProcessUtils")
                    .setLookup(
                            ProcessUtils.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/process/ProcessUtils.php")
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
