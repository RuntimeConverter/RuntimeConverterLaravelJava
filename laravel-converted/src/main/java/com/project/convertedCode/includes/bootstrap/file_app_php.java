package com.project.convertedCode.includes.bootstrap;

import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.App.namespaces.Exceptions.classes.Handler;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.Application;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 bootstrap/app.php

*/

public class file_app_php implements RuntimeIncludable {

    public static final file_app_php instance = new file_app_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope198 scope = new Scope198();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope198 scope)
            throws IncludeEventException {
        scope.app =
                new Application(
                        env,
                        function_realpath
                                .f
                                .env(env)
                                .call(
                                        toStringR(env.addRootFilesystemPrefix("/bootstrap"), env)
                                                + "/../")
                                .value());
        env.callMethod(
                scope.app,
                "singleton",
                file_app_php.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Http
                        .classes
                        .Kernel
                        .CONST_class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .App
                        .namespaces
                        .Http
                        .classes
                        .Kernel
                        .CONST_class);
        env.callMethod(
                scope.app,
                "singleton",
                file_app_php.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Console
                        .classes
                        .Kernel
                        .CONST_class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .App
                        .namespaces
                        .Console
                        .classes
                        .Kernel
                        .CONST_class);
        env.callMethod(
                scope.app,
                "singleton",
                file_app_php.class,
                ExceptionHandler.CONST_class,
                Handler.CONST_class);
        throw new IncludeEventException(ZVal.assign(scope.app));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/bootstrap").setFile("/bootstrap/app.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope198 implements UpdateRuntimeScopeInterface {

        Object app;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("app", this.app);
        }

        public void updateScope(RuntimeStack stack) {

            this.app = stack.getVariable("app");
        }
    }
}
