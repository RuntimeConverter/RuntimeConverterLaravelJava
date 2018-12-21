package com.project.convertedCode.includes.vendor.tijsverkoyen.css_to_inline_styles.src.Css.Rule;

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

 vendor/tijsverkoyen/css-to-inline-styles/src/Css/Rule/Rule.php

*/

public class file_Rule_php implements RuntimeIncludable {

    public static final file_Rule_php instance = new file_Rule_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3724 scope = new Scope3724();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3724 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Rule was here in the source code
        env.addManualClassLoad("TijsVerkoyen\\CssToInlineStyles\\Css\\Rule\\Rule");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/tijsverkoyen/css-to-inline-styles/src/Css/Rule")
                    .setFile("/vendor/tijsverkoyen/css-to-inline-styles/src/Css/Rule/Rule.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3724 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
