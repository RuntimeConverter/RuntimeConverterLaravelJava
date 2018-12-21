package com.project.convertedCode.includes.vendor.filp.whoops.src.Whoops.Resources.views;

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

 vendor/filp/whoops/src/Whoops/Resources/views/panel_details.html.php

*/

public class file_panel_details_html_php implements RuntimeIncludable {

    public static final file_panel_details_html_php instance = new file_panel_details_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope342 scope = new Scope342();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope342 scope)
            throws IncludeEventException {
        env.callMethod(scope.tpl, "render", file_panel_details_html_php.class, scope.frame_code);
        env.callMethod(scope.tpl, "render", file_panel_details_html_php.class, scope.env_details);
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile(
                            "/vendor/filp/whoops/src/Whoops/Resources/views/panel_details.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope342 implements UpdateRuntimeScopeInterface {

        Object tpl;
        Object frame_code;
        Object env_details;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tpl", this.tpl);
            stack.setVariable("frame_code", this.frame_code);
            stack.setVariable("env_details", this.env_details);
        }

        public void updateScope(RuntimeStack stack) {

            this.tpl = stack.getVariable("tpl");
            this.frame_code = stack.getVariable("frame_code");
            this.env_details = stack.getVariable("env_details");
        }
    }
}
