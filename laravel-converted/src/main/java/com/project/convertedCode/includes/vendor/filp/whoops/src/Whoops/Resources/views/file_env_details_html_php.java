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
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Resources/views/env_details.html.php

*/

public class file_env_details_html_php implements RuntimeIncludable {

    public static final file_env_details_html_php instance = new file_env_details_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope334 scope = new Scope334();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope334 scope)
            throws IncludeEventException {

        env.echo(
                "<div class=\"details\">\n  <h2 class=\"details-heading\">Environment &amp; details:</h2>\n\n  <div class=\"data-table-container\" id=\"data-tables\">\n    ");
        for (ZPair zpairResult52 : ZVal.getIterable(scope.tables, env, false)) {
            scope.label = ZVal.assign(zpairResult52.getKey());
            scope.data = ZVal.assign(zpairResult52.getValue());

            env.echo("      <div class=\"data-table\" id=\"sg-");
            env.echo(
                    env.callMethod(
                            scope.tpl,
                            "escape",
                            file_env_details_html_php.class,
                            env.callMethod(
                                    scope.tpl,
                                    "slug",
                                    file_env_details_html_php.class,
                                    scope.label)));
            env.echo("\">\n        ");
            if (!ZVal.isEmpty(scope.data)) {

                env.echo("            <label>");
                env.echo(
                        env.callMethod(
                                scope.tpl, "escape", file_env_details_html_php.class, scope.label));
                env.echo(
                        "</label>\n            <table class=\"data-table\">\n              <thead>\n                <tr>\n                  <td class=\"data-table-k\">Key</td>\n                  <td class=\"data-table-v\">Value</td>\n                </tr>\n              </thead>\n            ");
                for (ZPair zpairResult53 : ZVal.getIterable(scope.data, env, false)) {
                    scope.k = ZVal.assign(zpairResult53.getKey());
                    scope.value = ZVal.assign(zpairResult53.getValue());

                    env.echo("              <tr>\n                <td>");
                    env.echo(
                            env.callMethod(
                                    scope.tpl, "escape", file_env_details_html_php.class, scope.k));
                    env.echo("</td>\n                <td>");
                    env.echo(
                            env.callMethod(
                                    scope.tpl,
                                    "dump",
                                    file_env_details_html_php.class,
                                    scope.value));
                    env.echo("</td>\n              </tr>\n            ");
                }

                env.echo("            </table>\n        ");

            } else {

                env.echo("            <label class=\"empty\">");
                env.echo(
                        env.callMethod(
                                scope.tpl, "escape", file_env_details_html_php.class, scope.label));
                env.echo("</label>\n            <span class=\"empty\">empty</span>\n        ");
            }

            env.echo("      </div>\n    ");
        }

        env.echo("  </div>\n\n  ");

        env.echo(
                "  <div class=\"data-table-container\" id=\"handlers\">\n    <label>Registered Handlers</label>\n    ");
        for (ZPair zpairResult54 : ZVal.getIterable(scope.handlers, env, false)) {
            scope.i = ZVal.assign(zpairResult54.getKey());
            scope.handler = ZVal.assign(zpairResult54.getValue());

            env.echo("      <div class=\"handler ");
            env.echo(ZVal.strictEqualityCheck(scope.handler, "===", scope.handler) ? "active" : "");
            env.echo("\">\n        ");
            env.echo(scope.i);
            env.echo(". ");
            env.echo(
                    env.callMethod(
                            scope.tpl,
                            "escape",
                            file_env_details_html_php.class,
                            function_get_class.f.env(env).call(scope.handler).value()));
            env.echo("      </div>\n    ");
        }

        env.echo("  </div>\n\n</div>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile("/vendor/filp/whoops/src/Whoops/Resources/views/env_details.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope334 implements UpdateRuntimeScopeInterface {

        Object tpl;
        Object handler;
        Object tables;
        Object data;
        Object handlers;
        Object i;
        Object label;
        Object k;
        Object value;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tpl", this.tpl);
            stack.setVariable("handler", this.handler);
            stack.setVariable("tables", this.tables);
            stack.setVariable("data", this.data);
            stack.setVariable("handlers", this.handlers);
            stack.setVariable("i", this.i);
            stack.setVariable("label", this.label);
            stack.setVariable("k", this.k);
            stack.setVariable("value", this.value);
        }

        public void updateScope(RuntimeStack stack) {

            this.tpl = stack.getVariable("tpl");
            this.handler = stack.getVariable("handler");
            this.tables = stack.getVariable("tables");
            this.data = stack.getVariable("data");
            this.handlers = stack.getVariable("handlers");
            this.i = stack.getVariable("i");
            this.label = stack.getVariable("label");
            this.k = stack.getVariable("k");
            this.value = stack.getVariable("value");
        }
    }
}
