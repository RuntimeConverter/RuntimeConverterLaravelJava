package com.project.convertedCode.includes.vendor.phpunit.phpunit.src.Framework.MockObject.Stub;

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

 vendor/phpunit/phpunit/src/Framework/MockObject/Stub/MatcherCollection.php

*/

public class file_MatcherCollection_php implements RuntimeIncludable {

    public static final file_MatcherCollection_php instance = new file_MatcherCollection_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2634 scope = new Scope2634();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2634 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named MatcherCollection was here in the source code
        env.addManualClassLoad("PHPUnit\\Framework\\MockObject\\Stub\\MatcherCollection");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/phpunit/src/Framework/MockObject/Stub")
                    .setFile(
                            "/vendor/phpunit/phpunit/src/Framework/MockObject/Stub/MatcherCollection.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2634 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
