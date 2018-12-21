package com.project.convertedCode.includes.vendor.filp.whoops.src.Whoops.Resources.views;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Resources/views/header.html.php

*/

public class file_header_html_php implements RuntimeIncludable {

    public static final file_header_html_php instance = new file_header_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope339 scope = new Scope339();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope339 scope)
            throws IncludeEventException {
        env.echo("<div class=\"exception\">\n  <div class=\"exc-title\">\n    ");
        for (ZPair zpairResult58 : ZVal.getIterable(scope.name, env, false)) {
            scope.i = ZVal.assign(zpairResult58.getKey());
            scope.nameSection = ZVal.assign(zpairResult58.getValue());

            env.echo("      ");
            if (ZVal.equalityCheck(
                    scope.i,
                    ZVal.subtract(function_count.f.env(env).call(scope.name).value(), 1))) {

                env.echo("        <span class=\"exc-title-primary\">");
                env.echo(
                        env.callMethod(
                                scope.tpl,
                                "escape",
                                file_header_html_php.class,
                                scope.nameSection));
                env.echo("</span>\n      ");

            } else {

                env.echo("        ");
                env.echo(
                        toStringR(
                                        env.callMethod(
                                                scope.tpl,
                                                "escape",
                                                file_header_html_php.class,
                                                scope.nameSection),
                                        env)
                                + " \\");
                env.echo("      ");
            }

            env.echo("    ");
        }

        env.echo("    ");
        if (ZVal.isTrue(scope.code)) {

            env.echo("      <span title=\"Exception Code\">(");
            env.echo(env.callMethod(scope.tpl, "escape", file_header_html_php.class, scope.code));
            env.echo(")</span>\n    ");
        }

        env.echo("  </div>\n\n  <div class=\"exc-message\">\n    ");
        if (!ZVal.isEmpty(scope.message)) {

            env.echo("      <span>");
            env.echo(
                    env.callMethod(scope.tpl, "escape", file_header_html_php.class, scope.message));
            env.echo("</span>\n    ");

        } else {

            env.echo("      <span class=\"exc-message-empty-notice\">No message</span>\n    ");
        }

        env.echo("\n    <ul class=\"search-for-help\">\n      ");
        if (!ZVal.isEmpty(scope.docref_url)) {

            env.echo(
                    "      <li>\n        <a rel=\"noopener noreferrer\" target=\"_blank\" href=\"");
            env.echo(scope.docref_url);

            env.echo(
                    "\" title=\"Search for help in the PHP manual.\">\n          <!-- PHP icon by Icons Solid -->\n          <!-- https://www.iconfinder.com/icons/322421/book_icon -->\n          <!-- Free for commercial use -->\n          <svg height=\"16px\" id=\"Layer_1\" style=\"enable-background:new 0 0 32 32;\" version=\"1.1\" viewBox=\"0 0 32 32\" width=\"16px\" xml:space=\"preserve\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><g transform=\"translate(240 0)\"><path d=\"M-211,4v26h-24c-1.104,0-2-0.895-2-2s0.896-2,2-2h22V0h-22c-2.209,0-4,1.791-4,4v24c0,2.209,1.791,4,4,4h26V4H-211z    M-235,8V2h20v22h-20V8z M-219,6h-12V4h12V6z M-223,10h-8V8h8V10z M-227,14h-4v-2h4V14z\"/></g></svg>\n        </a>\n      </li>\n      ");
        }

        env.echo(
                "      <li>\n        <a rel=\"noopener noreferrer\" target=\"_blank\" href=\"https://google.com/search?q=");
        env.echo(
                NamespaceGlobal.urlencode
                        .env(env)
                        .call(
                                toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("\\", scope.name)
                                                        .value(),
                                                env)
                                        + " "
                                        + toStringR(scope.message, env))
                        .value());
        env.echo(
                "\" title=\"Search for help on Google.\">\n          <!-- Google icon by Alfredo H, from https://www.iconfinder.com/alfredoh -->\n          <!-- Creative Commons (Attribution 3.0 Unported) -->\n          <!-- http://creativecommons.org/licenses/by/3.0/ -->\n          <svg class=\"google\" height=\"16\" viewBox=\"0 0 512 512\" width=\"16\" xmlns=\"http://www.w3.org/2000/svg\">\n            <path d=\"M457.732 216.625c2.628 14.04 4.063 28.743 4.063 44.098C461.795 380.688 381.48 466 260.205 466c-116.024 0-210-93.977-210-210s93.976-210 210-210c56.703 0 104.076 20.867 140.44 54.73l-59.205 59.197v-.135c-22.046-21.002-50-31.762-81.236-31.762-69.297 0-125.604 58.537-125.604 127.84 0 69.29 56.306 127.97 125.604 127.97 62.87 0 105.653-35.966 114.46-85.313h-114.46v-81.902h197.528z\"/>\n          </svg>\n        </a>\n      </li>\n      <li>\n        <a rel=\"noopener noreferrer\" target=\"_blank\" href=\"https://duckduckgo.com/?q=");
        env.echo(
                NamespaceGlobal.urlencode
                        .env(env)
                        .call(
                                toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("\\", scope.name)
                                                        .value(),
                                                env)
                                        + " "
                                        + toStringR(scope.message, env))
                        .value());
        env.echo(ZVal.getResourceAsString("stringLiterals/stringLiteral164.txt"));
        env.echo(
                NamespaceGlobal.urlencode
                        .env(env)
                        .call(
                                toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("\\", scope.name)
                                                        .value(),
                                                env)
                                        + " "
                                        + toStringR(scope.message, env))
                        .value());
        env.echo(
                "\" title=\"Search for help on Stack Overflow.\">\n          <!-- Stack Overflow icon by Picons.me, from https://www.iconfinder.com/Picons -->\n          <!-- Free for commercial use -->\n          <svg class=\"stackoverflow\" height=\"16\" viewBox=\"-1163 1657.697 56.693 56.693\" width=\"16\" xmlns=\"http://www.w3.org/2000/svg\">\n            <path d=\"M-1126.04 1689.533l-16.577-9.778 2.088-3.54 16.578 9.778zM-1127.386 1694.635l-18.586-4.996 1.068-3.97 18.586 4.995zM-1127.824 1700.137l-19.165-1.767.378-4.093 19.165 1.767zM-1147.263 1701.293h19.247v4.11h-19.247z\"/>\n            <path d=\"M-1121.458 1710.947s0 .96-.032.96v.016h-30.796s-.96 0-.96-.016h-.032v-20.03h3.288v16.805h25.244v-16.804h3.288v19.07zM-1130.667 1667.04l10.844 15.903-3.396 2.316-10.843-15.903zM-1118.313 1663.044l3.29 18.963-4.05.703-3.29-18.963z\"/>\n          </svg>\n        </a>\n      </li>\n    </ul>\n\n    <span id=\"plain-exception\">");
        env.echo(
                env.callMethod(
                        scope.tpl, "escape", file_header_html_php.class, scope.plain_exception));
        env.echo(
                "</span>\n    <button id=\"copy-button\" class=\"clipboard\" data-clipboard-text=\"");
        env.echo(
                env.callMethod(
                        scope.tpl, "escape", file_header_html_php.class, scope.plain_exception));
        env.echo(
                "\" title=\"Copy exception details to clipboard\">\n      COPY\n    </button>\n  </div>\n</div>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile("/vendor/filp/whoops/src/Whoops/Resources/views/header.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope339 implements UpdateRuntimeScopeInterface {

        Object nameSection;
        Object tpl;
        Object docref_url;
        Object code;
        Object name;
        Object i;
        Object message;
        Object plain_exception;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("nameSection", this.nameSection);
            stack.setVariable("tpl", this.tpl);
            stack.setVariable("docref_url", this.docref_url);
            stack.setVariable("code", this.code);
            stack.setVariable("name", this.name);
            stack.setVariable("i", this.i);
            stack.setVariable("message", this.message);
            stack.setVariable("plain_exception", this.plain_exception);
        }

        public void updateScope(RuntimeStack stack) {

            this.nameSection = stack.getVariable("nameSection");
            this.tpl = stack.getVariable("tpl");
            this.docref_url = stack.getVariable("docref_url");
            this.code = stack.getVariable("code");
            this.name = stack.getVariable("name");
            this.i = stack.getVariable("i");
            this.message = stack.getVariable("message");
            this.plain_exception = stack.getVariable("plain_exception");
        }
    }
}
