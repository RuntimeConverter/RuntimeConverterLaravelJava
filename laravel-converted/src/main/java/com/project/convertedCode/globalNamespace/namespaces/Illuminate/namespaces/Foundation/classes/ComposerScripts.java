package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.Application;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/ComposerScripts.php

*/

public class ComposerScripts extends RuntimeClassBase {

    public ComposerScripts(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ComposerScripts(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\ComposerScripts";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "event", typeHint = "Composer\\Script\\Event")
        public Object postInstall(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope21 scope = new Scope21();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                                .setFile(
                                        "/vendor/laravel/framework/src/Illuminate/Foundation/ComposerScripts.php");
                scope.event = assignParameter(args, 0, false);
                env.include(
                        toStringR(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                scope.event,
                                                                "getComposer",
                                                                ComposerScripts.class),
                                                        "getConfig",
                                                        ComposerScripts.class),
                                                "get",
                                                ComposerScripts.class,
                                                "vendor-dir"),
                                        env)
                                + "/autoload.php",
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, ComposerScripts.class)
                        .method("clearCompiled")
                        .call()
                        .value();
                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "event", typeHint = "Composer\\Script\\Event")
        public Object postUpdate(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope22 scope = new Scope22();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                                .setFile(
                                        "/vendor/laravel/framework/src/Illuminate/Foundation/ComposerScripts.php");
                scope.event = assignParameter(args, 0, false);
                env.include(
                        toStringR(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                scope.event,
                                                                "getComposer",
                                                                ComposerScripts.class),
                                                        "getConfig",
                                                        ComposerScripts.class),
                                                "get",
                                                ComposerScripts.class,
                                                "vendor-dir"),
                                        env)
                                + "/autoload.php",
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, ComposerScripts.class)
                        .method("clearCompiled")
                        .call()
                        .value();
                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "event", typeHint = "Composer\\Script\\Event")
        public Object postAutoloadDump(RuntimeEnv env, Object... args) {
            RuntimeStack stack = new RuntimeStack();
            stack.setupGlobals(env);
            Scope23 scope = new Scope23();
            stack.pushScope(scope);
            scope._thisVarAlias = this;
            try {
                ContextConstants runtimeConverterFunctionClassConstants =
                        new ContextConstants()
                                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                                .setFile(
                                        "/vendor/laravel/framework/src/Illuminate/Foundation/ComposerScripts.php");
                scope.event = assignParameter(args, 0, false);
                env.include(
                        toStringR(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                scope.event,
                                                                "getComposer",
                                                                ComposerScripts.class),
                                                        "getConfig",
                                                        ComposerScripts.class),
                                                "get",
                                                ComposerScripts.class,
                                                "vendor-dir"),
                                        env)
                                + "/autoload.php",
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, ComposerScripts.class)
                        .method("clearCompiled")
                        .call()
                        .value();
                throw new IncludeEventException(null);
            } catch (IncludeEventException runtimeConverterIncludeException) {
                return runtimeConverterIncludeException.returnValue;
            }
        }

        @ConvertedMethod
        protected Object clearCompiled(RuntimeEnv env, Object... args) {
            Object laravel = null;
            Object packagesPath = null;
            Object servicesPath = null;
            laravel = new Application(env, function_getcwd.f.env(env).call().value());
            if (function_file_exists
                    .f
                    .env(env)
                    .call(
                            servicesPath =
                                    env.callMethod(
                                            laravel,
                                            "getCachedServicesPath",
                                            ComposerScripts.class))
                    .getBool()) {
                NamespaceGlobal.unlink.env(env).call(servicesPath).value();
            }

            if (function_file_exists
                    .f
                    .env(env)
                    .call(
                            packagesPath =
                                    env.callMethod(
                                            laravel,
                                            "getCachedPackagesPath",
                                            ComposerScripts.class))
                    .getBool()) {
                NamespaceGlobal.unlink.env(env).call(packagesPath).value();
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\ComposerScripts")
                    .setLookup(
                            ComposerScripts.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/ComposerScripts.php")
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

    private static class Scope21 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object event;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("event", this.event);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.event = stack.getVariable("event");
        }
    }

    private static class Scope22 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object event;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("event", this.event);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.event = stack.getVariable("event");
        }
    }

    private static class Scope23 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object event;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("event", this.event);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.event = stack.getVariable("event");
        }
    }
}
