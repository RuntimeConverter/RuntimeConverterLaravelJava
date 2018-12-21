package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ErrorException;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ExecutionLoopClosure;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.runtimeconverter.runtime.nativeFunctions.array.function_extract;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_defined_vars;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/ExecutionLoop.php

*/

public class ExecutionLoop extends RuntimeClassBase {

    public ExecutionLoop(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ExecutionLoop(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    public Object run(RuntimeEnv env, Object... args) {
        Object shell = assignParameter(args, 0, false);
        Object closure = null;
        this.loadIncludes(env, shell);
        closure = new ExecutionLoopClosure(env, shell);
        env.callMethod(closure, "execute", ExecutionLoop.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shell", typeHint = "Psy\\Shell")
    protected Object loadIncludes(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src")
                        .setFile("/vendor/psy/psysh/src/ExecutionLoop.php");
        ReferenceContainer shell = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object load = null;
        load =
                new Closure(env, runtimeConverterFunctionClassConstants, "Psy", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "__psysh__", typeHint = "Psy\\Shell")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/psy/psysh/src")
                                        .setFile("/vendor/psy/psysh/src/ExecutionLoop.php");
                        RuntimeStack stack = new RuntimeStack();
                        stack.setupGlobals(env);
                        Scope174 scope = new Scope174();
                        stack.pushScope(scope);
                        scope._thisVarAlias = this;
                        try {
                            Object _closureThisVar = this.getClosureThisVar();
                            scope.__psysh__ = assignParameter(args, 0, false);
                            scope.__psysh_include__ = null;
                            scope._e = null;
                            function_set_error_handler
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.newArray(
                                                    new ZPair(0, scope.__psysh__),
                                                    new ZPair(1, "handleError")));
                            for (ZPair zpairResult1394 :
                                    ZVal.getIterable(
                                            env.callMethod(
                                                    scope.__psysh__,
                                                    "getIncludes",
                                                    ExecutionLoop.class),
                                            env,
                                            true)) {
                                scope.__psysh_include__ = ZVal.assign(zpairResult1394.getValue());
                                try {
                                    env.include(
                                            toStringR(scope.__psysh_include__, env),
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            false,
                                            false);
                                } catch (ConvertedException convertedException188) {
                                    if (convertedException188.instanceOf(PHPError.class, "Error")) {
                                        scope._e = convertedException188.getObject();
                                        env.callMethod(
                                                scope.__psysh__,
                                                "writeException",
                                                ExecutionLoop.class,
                                                ErrorException.runtimeStaticObject.fromError(
                                                        env, scope._e));
                                    } else if (convertedException188.instanceOf(
                                            PHPException.class, "Exception")) {
                                        scope._e = convertedException188.getObject();
                                        env.callMethod(
                                                scope.__psysh__,
                                                "writeException",
                                                ExecutionLoop.class,
                                                scope._e);
                                    } else {
                                        throw convertedException188;
                                    }
                                }
                            }

                            function_restore_error_handler.f.env(env).call();
                            scope.__psysh_include__ = null;
                            function_extract
                                    .f
                                    .env(env)
                                    .call(
                                            stack,
                                            env.callMethod(
                                                    scope.__psysh__,
                                                    "getScopeVariables",
                                                    ExecutionLoop.class,
                                                    false));
                            env.callMethod(
                                    scope.__psysh__,
                                    "setScopeVariables",
                                    ExecutionLoop.class,
                                    function_get_defined_vars.f.env(env).call().value());
                            throw new IncludeEventException(null);
                        } catch (IncludeEventException runtimeConverterIncludeException) {
                            return runtimeConverterIncludeException.returnValue;
                        }
                    }
                };
        env.callFunctionDynamic(
                load, new RuntimeArgsWithReferences().add(0, shell), shell.getObject());
        return null;
    }

    public static final Object CONST_class = "Psy\\ExecutionLoop";

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
                    .setName("Psy\\ExecutionLoop")
                    .setLookup(
                            ExecutionLoop.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/ExecutionLoop.php")
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

    private static class Scope55 implements UpdateRuntimeScopeInterface {

        Object __psysh__;
        Object __psysh_include__;
        Object _e;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("__psysh__", this.__psysh__);
            stack.setVariable("__psysh_include__", this.__psysh_include__);
            stack.setVariable("_e", this._e);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.__psysh__ = stack.getVariable("__psysh__");
            this.__psysh_include__ = stack.getVariable("__psysh_include__");
            this._e = stack.getVariable("_e");
            this._thisVarAlias = stack.getVariable("this");
        }
    }

    private static class Scope174 implements UpdateRuntimeScopeInterface {

        Object __psysh__;
        Object __psysh_include__;
        Object _e;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("__psysh__", this.__psysh__);
            stack.setVariable("__psysh_include__", this.__psysh_include__);
            stack.setVariable("_e", this._e);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.__psysh__ = stack.getVariable("__psysh__");
            this.__psysh_include__ = stack.getVariable("__psysh_include__");
            this._e = stack.getVariable("_e");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
