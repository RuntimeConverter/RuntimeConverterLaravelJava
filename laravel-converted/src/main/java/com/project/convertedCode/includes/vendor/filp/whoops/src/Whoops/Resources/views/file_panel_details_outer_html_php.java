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

 vendor/filp/whoops/src/Whoops/Resources/views/panel_details_outer.html.php

*/

public class file_panel_details_outer_html_php implements RuntimeIncludable {

    public static final file_panel_details_outer_html_php instance =
            new file_panel_details_outer_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope343 scope = new Scope343();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope343 scope)
            throws IncludeEventException {
        env.echo("<div class=\"panel details-container cf\">\n  ");
        env.callMethod(
                scope.tpl, "render", file_panel_details_outer_html_php.class, scope.panel_details);
        env.echo("</div>");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile(
                            "/vendor/filp/whoops/src/Whoops/Resources/views/panel_details_outer.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope343 implements UpdateRuntimeScopeInterface {

        Object tpl;
        Object panel_details;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tpl", this.tpl);
            stack.setVariable("panel_details", this.panel_details);
        }

        public void updateScope(RuntimeStack stack) {

            this.tpl = stack.getVariable("tpl");
            this.panel_details = stack.getVariable("panel_details");
        }
    }
}
