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

 vendor/filp/whoops/src/Whoops/Resources/views/frame_list.html.php

*/

public class file_frame_list_html_php implements RuntimeIncludable {

    public static final file_frame_list_html_php instance = new file_frame_list_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope336 scope = new Scope336();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope336 scope)
            throws IncludeEventException {

        for (ZPair zpairResult57 : ZVal.getIterable(scope.frames, env, false)) {
            scope.i = ZVal.assign(zpairResult57.getKey());
            scope.frame = ZVal.assign(zpairResult57.getValue());

            env.echo("  <div class=\"frame ");
            env.echo(ZVal.equalityCheck(scope.i, 0) ? "active" : "");
            env.echo(" ");
            env.echo(
                    ZVal.isTrue(
                                    env.callMethod(
                                            scope.frame,
                                            "isApplication",
                                            file_frame_list_html_php.class))
                            ? "frame-application"
                            : "");
            env.echo("\" id=\"frame-line-");
            env.echo(scope.i);
            env.echo("\">\n      <span class=\"frame-index\">");
            env.echo(
                    ZVal.subtract(
                            ZVal.subtract(
                                    function_count.f.env(env).call(scope.frames).value(), scope.i),
                            1));
            env.echo(
                    "</span>\n      <div class=\"frame-method-info\">\n        <span class=\"frame-class\">");
            env.echo(
                    env.callMethod(
                            scope.tpl,
                            "breakOnDelimiter",
                            file_frame_list_html_php.class,
                            "\\",
                            env.callMethod(
                                    scope.tpl,
                                    "escape",
                                    file_frame_list_html_php.class,
                                    ZVal.isTrue(
                                                    scope.ternaryExpressionTemp =
                                                            env.callMethod(
                                                                    scope.frame,
                                                                    "getClass",
                                                                    file_frame_list_html_php.class))
                                            ? scope.ternaryExpressionTemp
                                            : "")));
            env.echo("</span>\n        <span class=\"frame-function\">");
            env.echo(
                    env.callMethod(
                            scope.tpl,
                            "breakOnDelimiter",
                            file_frame_list_html_php.class,
                            "\\",
                            env.callMethod(
                                    scope.tpl,
                                    "escape",
                                    file_frame_list_html_php.class,
                                    ZVal.isTrue(
                                                    scope.ternaryExpressionTemp =
                                                            env.callMethod(
                                                                    scope.frame,
                                                                    "getFunction",
                                                                    file_frame_list_html_php.class))
                                            ? scope.ternaryExpressionTemp
                                            : "")));
            env.echo("</span>\n      </div>\n\n    <div class=\"frame-file\">\n        ");
            env.echo(
                    ZVal.isTrue(
                                    env.callMethod(
                                            scope.frame, "getFile", file_frame_list_html_php.class))
                            ? env.callMethod(
                                    scope.tpl,
                                    "breakOnDelimiter",
                                    file_frame_list_html_php.class,
                                    "/",
                                    env.callMethod(
                                            scope.tpl,
                                            "shorten",
                                            file_frame_list_html_php.class,
                                            env.callMethod(
                                                    scope.tpl,
                                                    "escape",
                                                    file_frame_list_html_php.class,
                                                    env.callMethod(
                                                            scope.frame,
                                                            "getFile",
                                                            file_frame_list_html_php.class))))
                            : "<#unknown>");
            env.echo("<!--\n   --><span class=\"frame-line\">");
            env.echo(
                    ZVal.toLong(
                            env.callMethod(
                                    scope.frame, "getLine", file_frame_list_html_php.class)));
            env.echo("</span>\n    </div>\n  </div>\n");
        }
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile("/vendor/filp/whoops/src/Whoops/Resources/views/frame_list.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope336 implements UpdateRuntimeScopeInterface {

        Object tpl;
        Object frames;
        Object i;
        Object ternaryExpressionTemp;
        Object frame;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tpl", this.tpl);
            stack.setVariable("frames", this.frames);
            stack.setVariable("i", this.i);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("frame", this.frame);
        }

        public void updateScope(RuntimeStack stack) {

            this.tpl = stack.getVariable("tpl");
            this.frames = stack.getVariable("frames");
            this.i = stack.getVariable("i");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.frame = stack.getVariable("frame");
        }
    }
}
