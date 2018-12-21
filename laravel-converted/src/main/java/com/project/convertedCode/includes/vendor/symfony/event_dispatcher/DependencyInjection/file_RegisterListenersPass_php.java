package com.project.convertedCode.includes.vendor.symfony.event_dispatcher.DependencyInjection;

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

 vendor/symfony/event-dispatcher/DependencyInjection/RegisterListenersPass.php

*/

public class file_RegisterListenersPass_php implements RuntimeIncludable {

    public static final file_RegisterListenersPass_php instance =
            new file_RegisterListenersPass_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3286 scope = new Scope3286();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3286 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named RegisterListenersPass was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\EventDispatcher\\DependencyInjection\\RegisterListenersPass");
        // Conversion Note: class named ExtractingEventDispatcher was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\EventDispatcher\\DependencyInjection\\ExtractingEventDispatcher");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/event-dispatcher/DependencyInjection")
                    .setFile(
                            "/vendor/symfony/event-dispatcher/DependencyInjection/RegisterListenersPass.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3286 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
