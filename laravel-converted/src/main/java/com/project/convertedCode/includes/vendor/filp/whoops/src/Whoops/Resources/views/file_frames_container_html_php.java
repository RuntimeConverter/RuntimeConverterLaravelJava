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

 vendor/filp/whoops/src/Whoops/Resources/views/frames_container.html.php

*/

public class file_frames_container_html_php implements RuntimeIncludable {

    public static final file_frames_container_html_php instance =
            new file_frames_container_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope337 scope = new Scope337();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope337 scope)
            throws IncludeEventException {
        env.echo("<div class=\"frames-container ");
        env.echo(
                ZVal.equalityCheck(scope.active_frames_tab, "application")
                        ? "frames-container-application"
                        : "");
        env.echo("\">\n  ");
        env.callMethod(scope.tpl, "render", file_frames_container_html_php.class, scope.frame_list);
        env.echo("</div>");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile(
                            "/vendor/filp/whoops/src/Whoops/Resources/views/frames_container.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope337 implements UpdateRuntimeScopeInterface {

        Object active_frames_tab;
        Object tpl;
        Object frame_list;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("active_frames_tab", this.active_frames_tab);
            stack.setVariable("tpl", this.tpl);
            stack.setVariable("frame_list", this.frame_list);
        }

        public void updateScope(RuntimeStack stack) {

            this.active_frames_tab = stack.getVariable("active_frames_tab");
            this.tpl = stack.getVariable("tpl");
            this.frame_list = stack.getVariable("frame_list");
        }
    }
}
