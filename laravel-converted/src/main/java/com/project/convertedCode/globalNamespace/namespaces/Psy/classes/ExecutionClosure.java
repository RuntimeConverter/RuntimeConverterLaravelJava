package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_level;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_flush;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.array.function_extract;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_vars;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/ExecutionClosure.php

*/

public class ExecutionClosure extends RuntimeClassBase {

    public Object closure = null;

    public ExecutionClosure(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExecutionClosure.class) {
            this.__construct(env, args);
        }
    }

    public ExecutionClosure(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "__psysh__", typeHint = "Psy\\Shell")
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src")
                        .setFile("/vendor/psy/psysh/src/ExecutionClosure.php");
        Object __psysh__ = assignParameter(args, 0, false);
        this.setClosure(
                env,
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
                                        .setFile("/vendor/psy/psysh/src/ExecutionClosure.php");
                        RuntimeStack stack = new RuntimeStack();
                        stack.setupGlobals(env);
                        Scope173 scope = new Scope173();
                        stack.pushScope(scope);
                        try {
                            scope.__psysh__ = null;
                            scope._e = null;
                            scope.ternaryExpressionTemp = null;
                            scope._underscoreIdentifier = null;
                            scope.__psysh__ = this.contextReferences.getCapturedValue("__psysh__");
                            try {
                                function_extract
                                        .f
                                        .env(env)
                                        .call(
                                                stack,
                                                env.callMethod(
                                                        scope.__psysh__,
                                                        "getScopeVariables",
                                                        ExecutionClosure.class,
                                                        false));
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
                                                com.runtimeconverter.runtime.ZVal.notImplemented(
                                                        "Eval Statement is not supported"));
                            } catch (ConvertedException convertedException187) {
                                if (convertedException187.instanceOf(
                                        Throwable.class, "Throwable")) {
                                    scope._e = convertedException187.getObject();
                                    function_restore_error_handler.f.env(env).call();
                                    if (ZVal.isGreaterThan(
                                            function_ob_get_level.f.env(env).call().value(),
                                            '>',
                                            0)) {
                                        function_ob_end_clean.f.env(env).call();
                                    }

                                    throw ZVal.getException(env, scope._e);
                                } else if (convertedException187.instanceOf(
                                        PHPException.class, "Exception")) {
                                    scope._e = convertedException187.getObject();
                                    function_restore_error_handler.f.env(env).call();
                                    if (ZVal.isGreaterThan(
                                            function_ob_get_level.f.env(env).call().value(),
                                            '>',
                                            0)) {
                                        function_ob_end_clean.f.env(env).call();
                                    }

                                    throw ZVal.getException(env, scope._e);
                                } else {
                                    throw convertedException187;
                                }
                            }

                            function_restore_error_handler.f.env(env).call();
                            function_ob_end_flush.f.env(env).call();
                            env.callMethod(
                                    scope.__psysh__,
                                    "setScopeVariables",
                                    ExecutionClosure.class,
                                    function_get_defined_vars.f.env(env).call().value());
                            throw new IncludeEventException(
                                    ZVal.assign(scope._underscoreIdentifier));
                        } catch (IncludeEventException runtimeConverterIncludeException) {
                            return runtimeConverterIncludeException.returnValue;
                        }
                    }
                }.use("__psysh__", __psysh__));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    @ConvertedParameter(index = 1, name = "closure", typeHint = "Closure")
    protected Object setClosure(RuntimeEnv env, Object... args) {
        Object shell = assignParameter(args, 0, false);
        Object closure = assignParameter(args, 1, false);
        Object that = null;
        if (ZVal.isTrue(runtimeStaticObject.shouldBindClosure(env))) {
            that = env.callMethod(shell, "getBoundObject", ExecutionClosure.class);
            if (function_is_object.f.env(env).call(that).getBool()) {
                closure =
                        env.callMethod(
                                closure,
                                "bindTo",
                                ExecutionClosure.class,
                                that,
                                function_get_class.f.env(env).call(that).value());

            } else {
                closure =
                        env.callMethod(
                                closure,
                                "bindTo",
                                ExecutionClosure.class,
                                ZVal.getNull(),
                                env.callMethod(shell, "getBoundClass", ExecutionClosure.class));
            }
        }

        this.closure = closure;
        return null;
    }

    @ConvertedMethod
    public Object execute(RuntimeEnv env, Object... args) {
        Object closure = null;
        closure = ZVal.assign(this.closure);
        return ZVal.assign(
                env.callFunctionDynamic(closure, new RuntimeArgsWithReferences()).value());
    }

    public static final Object CONST_NOOP_INPUT = "return null;";

    public static final Object CONST_class = "Psy\\ExecutionClosure";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        protected Object shouldBindClosure(RuntimeEnv env, Object... args) {
            if (function_defined.f.env(env).call("HHVM_VERSION").getBool()) {
                return ZVal.assign(
                        NamespaceGlobal.version_compare
                                .env(env)
                                .call(function_constant.get(env, "HHVM_VERSION"), "3.5.0", ">=")
                                .value());
            }

            return ZVal.assign(true);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\ExecutionClosure")
                    .setLookup(
                            ExecutionClosure.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("closure")
                    .setFilename("vendor/psy/psysh/src/ExecutionClosure.php")
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

    private static class Scope173 implements UpdateRuntimeScopeInterface {

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
