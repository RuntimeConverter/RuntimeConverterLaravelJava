package com.project.convertedCode.includes.vendor.filp.whoops.src.Whoops.Resources.views;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Resources/views/frames_description.html.php

*/

public class file_frames_description_html_php implements RuntimeIncludable {

    public static final file_frames_description_html_php instance =
            new file_frames_description_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope338 scope = new Scope338();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope338 scope)
            throws IncludeEventException {
        env.echo("<div class=\"frames-description ");
        env.echo(ZVal.isTrue(scope.has_frames_tabs) ? "frames-description-application" : "");
        env.echo("\">\n  ");
        if (ZVal.isTrue(scope.has_frames_tabs)) {

            env.echo("    ");
            if (ZVal.equalityCheck(scope.active_frames_tab, "application")) {

                env.echo(
                        "      <span href=\"#\" id=\"application-frames-tab\" class=\"frames-tab frames-tab-active\">\n        Application frames (");
                env.echo(
                        env.callMethod(
                                scope.frames,
                                "countIsApplication",
                                file_frames_description_html_php.class));
                env.echo(")\n      </span>\n    ");

            } else {

                env.echo(
                        "      <a href=\"#\" id=\"application-frames-tab\" class=\"frames-tab\">\n        Application frames (");
                env.echo(
                        env.callMethod(
                                scope.frames,
                                "countIsApplication",
                                file_frames_description_html_php.class));
                env.echo(")\n      </a>\n    ");
            }

            env.echo("    <a href=\"#\" id=\"all-frames-tab\" class=\"frames-tab ");
            env.echo(ZVal.equalityCheck(scope.active_frames_tab, "all") ? "frames-tab-active" : "");
            env.echo("\">\n      All frames (");
            env.echo(function_count.f.env(env).call(scope.frames).value());
            env.echo(")\n    </a>\n  ");

        } else {

            env.echo("    <span>\n        Stack frames (");
            env.echo(function_count.f.env(env).call(scope.frames).value());
            env.echo(")\n    </span>\n  ");
        }

        env.echo("</div>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile(
                            "/vendor/filp/whoops/src/Whoops/Resources/views/frames_description.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope338 implements UpdateRuntimeScopeInterface {

        Object active_frames_tab;
        Object frames;
        Object has_frames_tabs;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("active_frames_tab", this.active_frames_tab);
            stack.setVariable("frames", this.frames);
            stack.setVariable("has_frames_tabs", this.has_frames_tabs);
        }

        public void updateScope(RuntimeStack stack) {

            this.active_frames_tab = stack.getVariable("active_frames_tab");
            this.frames = stack.getVariable("frames");
            this.has_frames_tabs = stack.getVariable("has_frames_tabs");
        }
    }
}
