package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.dependency_maps;

import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/dependency_maps/message_deps.php

*/

public class file_message_deps_php implements RuntimeIncludable {

    public static final file_message_deps_php instance = new file_message_deps_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3134 scope = new Scope3134();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3134 scope)
            throws IncludeEventException {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        Swift_DependencyContainer.runtimeStaticObject.getInstance(
                                                env),
                                        "register",
                                        file_message_deps_php.class,
                                        "message.message"),
                                "asNewInstanceOf",
                                file_message_deps_php.class,
                                "Swift_Message"),
                        "register",
                        file_message_deps_php.class,
                        "message.mimepart"),
                "asNewInstanceOf",
                file_message_deps_php.class,
                "Swift_MimePart");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/dependency_maps")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/dependency_maps/message_deps.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3134 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
