package com.project.convertedCode.includes.vendor.symfony.event_dispatcher;

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

 vendor/symfony/event-dispatcher/EventDispatcherInterface.php

*/

public class file_EventDispatcherInterface_php implements RuntimeIncludable {

    public static final file_EventDispatcherInterface_php instance =
            new file_EventDispatcherInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3289 scope = new Scope3289();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3289 scope)
            throws IncludeEventException {

        // Conversion Note: class named EventDispatcherInterface was here in the source code
        env.addManualClassLoad("Symfony\\Component\\EventDispatcher\\EventDispatcherInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/event-dispatcher")
                    .setFile("/vendor/symfony/event-dispatcher/EventDispatcherInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3289 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
