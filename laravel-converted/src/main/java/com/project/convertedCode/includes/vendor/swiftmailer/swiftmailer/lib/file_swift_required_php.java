package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/swift_required.php

*/

public class file_swift_required_php implements RuntimeIncludable {

    public static final file_swift_required_php instance = new file_swift_required_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3139 scope = new Scope3139();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3139 scope)
            throws IncludeEventException {
        env.include(
                toStringR(env.addRootFilesystemPrefix("/vendor/swiftmailer/swiftmailer/lib"), env)
                        + "/classes/Swift.php",
                stack,
                this,
                true,
                false);
        Swift.runtimeStaticObject.registerAutoload(
                env,
                new Closure(env, this.getContextConstants(), "", stack.get("this")) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ContextConstants runtimeConverterFunctionClassConstants =
                                new ContextConstants()
                                        .setDir("/vendor/swiftmailer/swiftmailer/lib")
                                        .setFile(
                                                "/vendor/swiftmailer/swiftmailer/lib/swift_required.php");
                        RuntimeStack stack = new RuntimeStack();
                        stack.setupGlobals(env);
                        Scope61 scope = new Scope61();
                        stack.pushScope(scope);
                        try {
                            env.include(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/swiftmailer/swiftmailer/lib"),
                                                    env)
                                            + "/dependency_maps/cache_deps.php",
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    true,
                                    false);
                            env.include(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/swiftmailer/swiftmailer/lib"),
                                                    env)
                                            + "/dependency_maps/mime_deps.php",
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    true,
                                    false);
                            env.include(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/swiftmailer/swiftmailer/lib"),
                                                    env)
                                            + "/dependency_maps/message_deps.php",
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    true,
                                    false);
                            env.include(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/swiftmailer/swiftmailer/lib"),
                                                    env)
                                            + "/dependency_maps/transport_deps.php",
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    true,
                                    false);
                            env.include(
                                    toStringR(
                                                    env.addRootFilesystemPrefix(
                                                            "/vendor/swiftmailer/swiftmailer/lib"),
                                                    env)
                                            + "/preferences.php",
                                    stack,
                                    runtimeConverterFunctionClassConstants,
                                    true,
                                    false);
                            throw new IncludeEventException(null);
                        } catch (IncludeEventException runtimeConverterIncludeException) {
                            return runtimeConverterIncludeException.returnValue;
                        }
                    }
                });
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib")
                    .setFile("/vendor/swiftmailer/swiftmailer/lib/swift_required.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3139 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }

    private static class Scope57 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }

    private static class Scope58 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }

    private static class Scope59 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }

    private static class Scope60 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }

    private static class Scope61 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
