package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.TypeErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.BreakException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ErrorException;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_level;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_flush;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ThrowUpException;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.nativeFunctions.array.function_extract;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_vars;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ExecutionClosure;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeClasses.errors.TypeError;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/ExecutionLoopClosure.php

*/

public class ExecutionLoopClosure extends ExecutionClosure {

    public ExecutionLoopClosure(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExecutionLoopClosure.class) {
            this.__construct(env, args);
        }
    }

    public ExecutionLoopClosure(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "__psysh__", typeHint = "Psy\\Shell")
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src")
                        .setFile("/vendor/psy/psysh/src/ExecutionLoopClosure.php");
        Object __psysh__ = assignParameter(args, 0, false);
        env.callMethod(
                this,
                "setClosure",
                ExecutionLoopClosure.class,
                __psysh__,
                new Closure(env, runtimeConverterFunctionClassConstants, "Psy", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/psy/psysh/src")
                                        .setFile("/vendor/psy/psysh/src/ExecutionLoopClosure.php");
                        RuntimeStack stack = new RuntimeStack();
                        stack.setupGlobals(env);
                        Scope175 scope = new Scope175();
                        stack.pushScope(scope);
                        try {
                            scope.__psysh__ = null;
                            scope._e = null;
                            scope.ternaryExpressionTemp = null;
                            scope._underscoreIdentifier = null;
                            scope.__psysh__ = this.contextReferences.getCapturedValue("__psysh__");
                            function_extract
                                    .f
                                    .env(env)
                                    .call(
                                            stack,
                                            env.callMethod(
                                                    scope.__psysh__,
                                                    "getScopeVariables",
                                                    ExecutionLoopClosure.class,
                                                    false));
                            do {
                                env.callMethod(
                                        scope.__psysh__, "beforeLoop", ExecutionLoopClosure.class);
                                try {
                                    env.callMethod(
                                            scope.__psysh__,
                                            "getInput",
                                            ExecutionLoopClosure.class);
                                    try {
                                        function_ob_start
                                                .f
                                                .env(env)
                                                .call(
                                                        ZVal.newArray(
                                                                new ZPair(0, scope.__psysh__),
                                                                new ZPair(1, "writeStdout")),
                                                        1);
                                        function_set_error_handler
                                                .f
                                                .env(env)
                                                .call(
                                                        ZVal.newArray(
                                                                new ZPair(0, scope.__psysh__),
                                                                new ZPair(1, "handleError")));
                                        scope._underscoreIdentifier =
                                                ZVal.assign(
                                                        com.runtimeconverter.runtime.ZVal
                                                                .notImplemented(
                                                                        "Eval Statement is not supported"));
                                    } catch (ConvertedException convertedException191) {
                                        if (convertedException191.instanceOf(
                                                Throwable.class, "Throwable")) {
                                            scope._e = convertedException191.getObject();
                                            function_restore_error_handler.f.env(env).call();
                                            if (ZVal.isGreaterThan(
                                                    function_ob_get_level.f.env(env).call().value(),
                                                    '>',
                                                    0)) {
                                                function_ob_end_clean.f.env(env).call();
                                            }

                                            throw ZVal.getException(env, scope._e);
                                        } else if (convertedException191.instanceOf(
                                                PHPException.class, "Exception")) {
                                            scope._e = convertedException191.getObject();
                                            function_restore_error_handler.f.env(env).call();
                                            if (ZVal.isGreaterThan(
                                                    function_ob_get_level.f.env(env).call().value(),
                                                    '>',
                                                    0)) {
                                                function_ob_end_clean.f.env(env).call();
                                            }

                                            throw ZVal.getException(env, scope._e);
                                        } else {
                                            throw convertedException191;
                                        }
                                    }

                                    function_restore_error_handler.f.env(env).call();
                                    function_ob_end_flush.f.env(env).call();
                                    env.callMethod(
                                            scope.__psysh__,
                                            "setScopeVariables",
                                            ExecutionLoopClosure.class,
                                            function_get_defined_vars.f.env(env).call().value());
                                    env.callMethod(
                                            scope.__psysh__,
                                            "writeReturnValue",
                                            ExecutionLoopClosure.class,
                                            scope._underscoreIdentifier);
                                } catch (ConvertedException convertedException192) {
                                    if (convertedException192.instanceOf(
                                            BreakException.class,
                                            "Psy\\Exception\\BreakException")) {
                                        scope._e = convertedException192.getObject();
                                        env.callMethod(
                                                scope.__psysh__,
                                                "writeException",
                                                ExecutionLoopClosure.class,
                                                scope._e);
                                        throw new IncludeEventException(null);
                                    } else if (convertedException192.instanceOf(
                                            ThrowUpException.class,
                                            "Psy\\Exception\\ThrowUpException")) {
                                        scope._e = convertedException192.getObject();
                                        env.callMethod(
                                                scope.__psysh__,
                                                "writeException",
                                                ExecutionLoopClosure.class,
                                                scope._e);
                                        throw ZVal.getException(env, scope._e);
                                    } else if (convertedException192.instanceOf(
                                            TypeError.class, "TypeError")) {
                                        scope._e = convertedException192.getObject();
                                        env.callMethod(
                                                scope.__psysh__,
                                                "writeException",
                                                ExecutionLoopClosure.class,
                                                TypeErrorException.runtimeStaticObject
                                                        .fromTypeError(env, scope._e));
                                    } else if (convertedException192.instanceOf(
                                            PHPError.class, "Error")) {
                                        scope._e = convertedException192.getObject();
                                        env.callMethod(
                                                scope.__psysh__,
                                                "writeException",
                                                ExecutionLoopClosure.class,
                                                ErrorException.runtimeStaticObject.fromError(
                                                        env, scope._e));
                                    } else if (convertedException192.instanceOf(
                                            PHPException.class, "Exception")) {
                                        scope._e = convertedException192.getObject();
                                        env.callMethod(
                                                scope.__psysh__,
                                                "writeException",
                                                ExecutionLoopClosure.class,
                                                scope._e);
                                    } else {
                                        throw convertedException192;
                                    }
                                }

                                env.callMethod(
                                        scope.__psysh__, "afterLoop", ExecutionLoopClosure.class);

                            } while (ZVal.isTrue(true));

                            throw new IncludeEventException(null);
                        } catch (IncludeEventException runtimeConverterIncludeException) {
                            return runtimeConverterIncludeException.returnValue;
                        }
                    }
                }.use("__psysh__", __psysh__));
        return null;
    }

    public static final Object CONST_class = "Psy\\ExecutionLoopClosure";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ExecutionClosure.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\ExecutionLoopClosure")
                    .setLookup(
                            ExecutionLoopClosure.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("closure")
                    .setFilename("vendor/psy/psysh/src/ExecutionLoopClosure.php")
                    .addExtendsClass("Psy\\ExecutionClosure")
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

    private static class Scope175 implements UpdateRuntimeScopeInterface {

        Object __psysh__;
        Object _e;
        Object ternaryExpressionTemp;
        Object _underscoreIdentifier;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("__psysh__", this.__psysh__);
            stack.setVariable("_e", this._e);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("_", this._underscoreIdentifier);
        }

        public void updateScope(RuntimeStack stack) {

            this.__psysh__ = stack.getVariable("__psysh__");
            this._e = stack.getVariable("_e");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this._underscoreIdentifier = stack.getVariable("_");
        }
    }
}
