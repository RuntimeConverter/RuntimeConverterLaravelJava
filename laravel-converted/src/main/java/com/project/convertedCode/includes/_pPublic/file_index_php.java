package com.project.convertedCode.includes._pPublic;

import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Http.classes.Kernel;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 public/index.php

*/

public class file_index_php implements RuntimeIncludable {

    public static final file_index_php instance = new file_index_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope218 scope = new Scope218();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope218 scope)
            throws IncludeEventException {
        function_define
                .f
                .env(env)
                .call("LARAVEL_START", function_microtime.f.env(env).call(true).value());
        env.include(
                toStringR(env.addRootFilesystemPrefix("/public"), env) + "/../vendor/autoload.php",
                stack,
                this,
                true,
                false);
        scope.app =
                ZVal.assign(
                        env.include(
                                toStringR(env.addRootFilesystemPrefix("/public"), env)
                                        + "/../bootstrap/app.php",
                                stack,
                                this,
                                true,
                                true));
        scope.kernel = env.callMethod(scope.app, "make", file_index_php.class, Kernel.CONST_class);
        scope.response =
                env.callMethod(
                        scope.kernel,
                        "handle",
                        file_index_php.class,
                        scope.request = Request.runtimeStaticObject.capture(env));
        env.callMethod(scope.response, "send", file_index_php.class);
        env.callMethod(
                scope.kernel, "terminate", file_index_php.class, scope.request, scope.response);
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/public").setFile("/public/index.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope218 implements UpdateRuntimeScopeInterface {

        Object app;
        Object request;
        Object kernel;
        Object response;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("app", this.app);
            stack.setVariable("request", this.request);
            stack.setVariable("kernel", this.kernel);
            stack.setVariable("response", this.response);
        }

        public void updateScope(RuntimeStack stack) {

            this.app = stack.getVariable("app");
            this.request = stack.getVariable("request");
            this.kernel = stack.getVariable("kernel");
            this.response = stack.getVariable("response");
        }
    }
}
