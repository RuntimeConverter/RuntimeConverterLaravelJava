package com.project.convertedCode.includes.vendor.filp.whoops.src.Whoops.Resources.views;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Resources/views/panel_left_outer.html.php

*/

public class file_panel_left_outer_html_php implements RuntimeIncludable {

    public static final file_panel_left_outer_html_php instance =
            new file_panel_left_outer_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope345 scope = new Scope345();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope345 scope)
            throws IncludeEventException {
        env.echo("<div class=\"panel left-panel cf ");
        env.echo(!ZVal.isTrue(scope.has_frames) ? "empty" : "");
        env.echo("\">\n  ");
        env.callMethod(scope.tpl, "render", file_panel_left_outer_html_php.class, scope.panel_left);
        env.echo("</div>");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile(
                            "/vendor/filp/whoops/src/Whoops/Resources/views/panel_left_outer.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope345 implements UpdateRuntimeScopeInterface {

        Object tpl;
        Object has_frames;
        Object panel_left;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tpl", this.tpl);
            stack.setVariable("has_frames", this.has_frames);
            stack.setVariable("panel_left", this.panel_left);
        }

        public void updateScope(RuntimeStack stack) {

            this.tpl = stack.getVariable("tpl");
            this.has_frames = stack.getVariable("has_frames");
            this.panel_left = stack.getVariable("panel_left");
        }
    }
}
