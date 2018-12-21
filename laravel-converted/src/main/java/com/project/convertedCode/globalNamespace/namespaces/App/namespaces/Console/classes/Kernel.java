package com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 app/Console/Kernel.php

*/

public class Kernel
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Foundation
                .namespaces
                .Console
                .classes
                .Kernel {

    public Kernel(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.commands = ZVal.newArray();
        if (this.getClass() == Kernel.class) {
            this.__construct(env, args);
        }
    }

    public Kernel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "schedule",
        typeHint = "Illuminate\\Console\\Scheduling\\Schedule"
    )
    protected Object schedule(RuntimeEnv env, Object... args) {
        Object schedule = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    protected Object commands(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope1 scope = new Scope1();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/app/Console")
                            .setFile("/app/Console/Kernel.php");
            env.callMethod(
                    scope._thisVarAlias,
                    "load",
                    Kernel.class,
                    toStringR(env.addRootFilesystemPrefix("/app/Console"), env) + "/Commands");
            env.include(
                    toStringR(base_path.f.env(env).call("routes/console.php").value(), env),
                    stack,
                    runtimeConverterFunctionClassConstants,
                    true,
                    false);
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    public static final Object CONST_class = "App\\Console\\Kernel";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Foundation
                    .namespaces
                    .Console
                    .classes
                    .Kernel
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("App\\Console\\Kernel")
                    .setLookup(
                            Kernel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "app",
                            "artisan",
                            "bootstrappers",
                            "commands",
                            "commands",
                            "commandsLoaded",
                            "events")
                    .setFilename("app/Console/Kernel.php")
                    .addInterface("Illuminate\\Contracts\\Console\\Kernel")
                    .addExtendsClass("Illuminate\\Foundation\\Console\\Kernel")
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

    private static class Scope1 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
