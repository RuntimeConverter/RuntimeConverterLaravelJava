package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Engines.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.View.classes.Engine;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_level;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_end_clean;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_extract;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/Engines/PhpEngine.php

*/

public class PhpEngine extends RuntimeClassBase implements Engine {

    public PhpEngine(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PhpEngine(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        return ZVal.assign(this.evaluatePath(env, path, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "__path")
    @ConvertedParameter(index = 1, name = "__data")
    protected Object evaluatePath(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope157 scope = new Scope157();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/View/Engines")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/View/Engines/PhpEngine.php");
            scope.__path = assignParameter(args, 0, false);
            scope.__data = assignParameter(args, 1, false);
            scope.e = null;
            scope.obLevel = null;
            scope.obLevel = function_ob_get_level.f.env(env).call().value();
            function_ob_start.f.env(env).call();
            function_extract.f.env(env).call(stack, scope.__data, 1);
            try {
                env.include(
                        toStringR(scope.__path, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        false,
                        false);
            } catch (ConvertedException convertedException68) {
                if (convertedException68.instanceOf(PHPException.class, "Exception")) {
                    scope.e = convertedException68.getObject();
                    this.handleViewException(env, scope.e, scope.obLevel);
                } else if (convertedException68.instanceOf(Throwable.class, "Throwable")) {
                    scope.e = convertedException68.getObject();
                    this.handleViewException(
                            env, new FatalThrowableError(env, scope.e), scope.obLevel);
                } else {
                    throw convertedException68;
                }
            }

            throw new IncludeEventException(
                    ZVal.assign(
                            function_ltrim
                                    .f
                                    .env(env)
                                    .call(function_ob_get_clean.f.env(env).call().value())
                                    .value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    @ConvertedParameter(index = 1, name = "obLevel")
    protected Object handleViewException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object obLevel = assignParameter(args, 1, false);
        while (ZVal.isGreaterThan(function_ob_get_level.f.env(env).call().value(), '>', obLevel)) {
            function_ob_end_clean.f.env(env).call();
        }

        throw ZVal.getException(env, e);
    }

    public static final Object CONST_class = "Illuminate\\View\\Engines\\PhpEngine";

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
                    .setName("Illuminate\\View\\Engines\\PhpEngine")
                    .setLookup(
                            PhpEngine.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/View/Engines/PhpEngine.php")
                    .addInterface("Illuminate\\Contracts\\View\\Engine")
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

    private static class Scope31 implements UpdateRuntimeScopeInterface {

        Object e;
        Object _thisVarAlias;
        Object obLevel;
        Object __data;
        Object __path;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("e", this.e);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("obLevel", this.obLevel);
            stack.setVariable("__data", this.__data);
            stack.setVariable("__path", this.__path);
        }

        public void updateScope(RuntimeStack stack) {

            this.e = stack.getVariable("e");
            this._thisVarAlias = stack.getVariable("this");
            this.obLevel = stack.getVariable("obLevel");
            this.__data = stack.getVariable("__data");
            this.__path = stack.getVariable("__path");
        }
    }

    private static class Scope157 implements UpdateRuntimeScopeInterface {

        Object e;
        Object _thisVarAlias;
        Object obLevel;
        Object __data;
        Object __path;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("e", this.e);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("obLevel", this.obLevel);
            stack.setVariable("__data", this.__data);
            stack.setVariable("__path", this.__path);
        }

        public void updateScope(RuntimeStack stack) {

            this.e = stack.getVariable("e");
            this._thisVarAlias = stack.getVariable("this");
            this.obLevel = stack.getVariable("obLevel");
            this.__data = stack.getVariable("__data");
            this.__path = stack.getVariable("__path");
        }
    }
}
