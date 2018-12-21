package com.project.convertedCode.includes.vendor.fzaninotto.faker.src;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_register;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/autoload.php

*/

public class file_autoload_php implements RuntimeIncludable {

    public static final file_autoload_php instance = new file_autoload_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope787 scope = new Scope787();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope787 scope)
            throws IncludeEventException {
        function_spl_autoload_register
                .f
                .env(env)
                .call(
                        new Closure(env, this.getContextConstants(), "", stack.get("this")) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "className")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ContextConstants runtimeConverterFunctionClassConstants =
                                        new ContextConstants()
                                                .setDir("/vendor/fzaninotto/faker/src")
                                                .setFile(
                                                        "/vendor/fzaninotto/faker/src/autoload.php");
                                RuntimeStack stack = new RuntimeStack();
                                stack.setupGlobals(env);
                                Scope12 scope = new Scope12();
                                stack.pushScope(scope);
                                try {
                                    scope.className = assignParameter(args, 0, false);
                                    scope.fileName = null;
                                    scope.namespace = null;
                                    scope.lastNsPos = null;
                                    scope.className =
                                            function_ltrim
                                                    .f
                                                    .env(env)
                                                    .call(scope.className, "\\")
                                                    .value();
                                    scope.fileName = "";
                                    if (ZVal.isTrue(
                                            scope.lastNsPos =
                                                    NamespaceGlobal.strripos
                                                            .env(env)
                                                            .call(scope.className, "\\")
                                                            .value())) {
                                        scope.namespace =
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(scope.className, 0, scope.lastNsPos)
                                                        .value();
                                        scope.className =
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                scope.className,
                                                                ZVal.add(scope.lastNsPos, 1))
                                                        .value();
                                        scope.fileName =
                                                toStringR(
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "\\",
                                                                                "/",
                                                                                scope.namespace)
                                                                        .value(),
                                                                env)
                                                        + toStringR("/", env);
                                    }

                                    scope.fileName =
                                            toStringR(
                                                            env.addRootFilesystemPrefix(
                                                                    "/vendor/fzaninotto/faker/src"),
                                                            env)
                                                    + toStringR("/", env)
                                                    + toStringR(scope.fileName, env)
                                                    + toStringR(scope.className, env)
                                                    + ".php";
                                    if (function_file_exists
                                            .f
                                            .env(env)
                                            .call(scope.fileName)
                                            .getBool()) {
                                        env.include(
                                                toStringR(scope.fileName, env),
                                                stack,
                                                runtimeConverterFunctionClassConstants,
                                                true,
                                                false);
                                        throw new IncludeEventException(ZVal.assign(true));
                                    }

                                    throw new IncludeEventException(ZVal.assign(false));
                                } catch (IncludeEventException runtimeConverterIncludeException) {
                                    return runtimeConverterIncludeException.returnValue;
                                }
                            }
                        });
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/fzaninotto/faker/src")
                    .setFile("/vendor/fzaninotto/faker/src/autoload.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope787 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }

    private static class Scope12 implements UpdateRuntimeScopeInterface {

        Object fileName;
        Object namespace;
        Object lastNsPos;
        Object className;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("fileName", this.fileName);
            stack.setVariable("namespace", this.namespace);
            stack.setVariable("lastNsPos", this.lastNsPos);
            stack.setVariable("className", this.className);
        }

        public void updateScope(RuntimeStack stack) {

            this.fileName = stack.getVariable("fileName");
            this.namespace = stack.getVariable("namespace");
            this.lastNsPos = stack.getVariable("lastNsPos");
            this.className = stack.getVariable("className");
        }
    }
}
