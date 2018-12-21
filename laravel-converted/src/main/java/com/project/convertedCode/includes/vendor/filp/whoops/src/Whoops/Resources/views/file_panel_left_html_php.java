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

 vendor/filp/whoops/src/Whoops/Resources/views/panel_left.html.php

*/

public class file_panel_left_html_php implements RuntimeIncludable {

    public static final file_panel_left_html_php instance = new file_panel_left_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope344 scope = new Scope344();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope344 scope)
            throws IncludeEventException {
        env.callMethod(scope.tpl, "render", file_panel_left_html_php.class, scope.header_outer);
        env.callMethod(
                scope.tpl, "render", file_panel_left_html_php.class, scope.frames_description);
        env.callMethod(scope.tpl, "render", file_panel_left_html_php.class, scope.frames_container);
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile("/vendor/filp/whoops/src/Whoops/Resources/views/panel_left.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope344 implements UpdateRuntimeScopeInterface {

        Object tpl;
        Object frames_container;
        Object frames_description;
        Object header_outer;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tpl", this.tpl);
            stack.setVariable("frames_container", this.frames_container);
            stack.setVariable("frames_description", this.frames_description);
            stack.setVariable("header_outer", this.header_outer);
        }

        public void updateScope(RuntimeStack stack) {

            this.tpl = stack.getVariable("tpl");
            this.frames_container = stack.getVariable("frames_container");
            this.frames_description = stack.getVariable("frames_description");
            this.header_outer = stack.getVariable("header_outer");
        }
    }
}
