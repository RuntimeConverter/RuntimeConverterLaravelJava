package com.project.convertedCode.includes.vendor.symfony.event_dispatcher.Debug;

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

 vendor/symfony/event-dispatcher/Debug/TraceableEventDispatcherInterface.php

*/

public class file_TraceableEventDispatcherInterface_php implements RuntimeIncludable {

    public static final file_TraceableEventDispatcherInterface_php instance =
            new file_TraceableEventDispatcherInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3284 scope = new Scope3284();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3284 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named TraceableEventDispatcherInterface was here in the source
        // code
        env.addManualClassLoad(
                "Symfony\\Component\\EventDispatcher\\Debug\\TraceableEventDispatcherInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/event-dispatcher/Debug")
                    .setFile(
                            "/vendor/symfony/event-dispatcher/Debug/TraceableEventDispatcherInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3284 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
