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

 vendor/filp/whoops/src/Whoops/Resources/views/layout.html.php

*/

public class file_layout_html_php implements RuntimeIncludable {

    public static final file_layout_html_php instance = new file_layout_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope341 scope = new Scope341();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope341 scope)
            throws IncludeEventException {

        env.echo("<!DOCTYPE html>");
        env.echo(scope.preface);

        env.echo(
                "<html>\n  <head>\n    <meta charset=\"utf-8\">\n    <meta name=\"robots\" content=\"noindex,nofollow\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n    <title>");
        env.echo(env.callMethod(scope.tpl, "escape", file_layout_html_php.class, scope.page_title));
        env.echo("</title>\n\n    <style>");
        env.echo(scope.stylesheet);
        env.echo(
                "</style>\n  </head>\n  <body>\n\n    <div class=\"Whoops container\">\n      <div class=\"stack-container\">\n\n        ");
        env.callMethod(scope.tpl, "render", file_layout_html_php.class, scope.panel_left_outer);
        env.echo("\n        ");
        env.callMethod(scope.tpl, "render", file_layout_html_php.class, scope.panel_details_outer);
        env.echo("\n      </div>\n    </div>\n\n    <script>");
        env.echo(scope.prettify);
        env.echo("</script>\n    <script>");
        env.echo(scope.zepto);
        env.echo("</script>\n    <script>");
        env.echo(scope.clipboard);
        env.echo("</script>\n    <script>");
        env.echo(scope.javascript);
        env.echo("</script>\n  </body>\n</html>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile("/vendor/filp/whoops/src/Whoops/Resources/views/layout.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope341 implements UpdateRuntimeScopeInterface {

        Object stylesheet;
        Object preface;
        Object tpl;
        Object panel_details_outer;
        Object prettify;
        Object page_title;
        Object panel_left_outer;
        Object zepto;
        Object clipboard;
        Object javascript;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("stylesheet", this.stylesheet);
            stack.setVariable("preface", this.preface);
            stack.setVariable("tpl", this.tpl);
            stack.setVariable("panel_details_outer", this.panel_details_outer);
            stack.setVariable("prettify", this.prettify);
            stack.setVariable("page_title", this.page_title);
            stack.setVariable("panel_left_outer", this.panel_left_outer);
            stack.setVariable("zepto", this.zepto);
            stack.setVariable("clipboard", this.clipboard);
            stack.setVariable("javascript", this.javascript);
        }

        public void updateScope(RuntimeStack stack) {

            this.stylesheet = stack.getVariable("stylesheet");
            this.preface = stack.getVariable("preface");
            this.tpl = stack.getVariable("tpl");
            this.panel_details_outer = stack.getVariable("panel_details_outer");
            this.prettify = stack.getVariable("prettify");
            this.page_title = stack.getVariable("page_title");
            this.panel_left_outer = stack.getVariable("panel_left_outer");
            this.zepto = stack.getVariable("zepto");
            this.clipboard = stack.getVariable("clipboard");
            this.javascript = stack.getVariable("javascript");
        }
    }
}
