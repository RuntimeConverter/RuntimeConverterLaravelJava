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

 vendor/symfony/event-dispatcher/ImmutableEventDispatcher.php

*/

public class file_ImmutableEventDispatcher_php implements RuntimeIncludable {

    public static final file_ImmutableEventDispatcher_php instance =
            new file_ImmutableEventDispatcher_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3292 scope = new Scope3292();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3292 scope)
            throws IncludeEventException {

        // Conversion Note: class named ImmutableEventDispatcher was here in the source code
        env.addManualClassLoad("Symfony\\Component\\EventDispatcher\\ImmutableEventDispatcher");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/event-dispatcher")
                    .setFile("/vendor/symfony/event-dispatcher/ImmutableEventDispatcher.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3292 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
