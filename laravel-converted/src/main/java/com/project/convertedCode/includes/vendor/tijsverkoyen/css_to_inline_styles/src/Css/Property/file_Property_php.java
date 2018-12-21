package com.project.convertedCode.includes.vendor.tijsverkoyen.css_to_inline_styles.src.Css.Property;

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

 vendor/tijsverkoyen/css-to-inline-styles/src/Css/Property/Property.php

*/

public class file_Property_php implements RuntimeIncludable {

    public static final file_Property_php instance = new file_Property_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3722 scope = new Scope3722();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3722 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Property was here in the source code
        env.addManualClassLoad("TijsVerkoyen\\CssToInlineStyles\\Css\\Property\\Property");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/tijsverkoyen/css-to-inline-styles/src/Css/Property")
                    .setFile(
                            "/vendor/tijsverkoyen/css-to-inline-styles/src/Css/Property/Property.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3722 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
