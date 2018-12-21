package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Mail.resources.views.html.promotion;

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

 vendor/laravel/framework/src/Illuminate/Mail/resources/views/html/promotion/button.blade.php

*/

public class file_button_blade_php implements RuntimeIncludable {

    public static final file_button_blade_php instance = new file_button_blade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1385 scope = new Scope1385();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1385 scope)
            throws IncludeEventException {
        env.echo(
                "<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n    <tr>\n        <td align=\"center\">\n            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n                <tr>\n                    <td>\n                        <a href=\"{{ $url }}\" class=\"button button-green\" target=\"_blank\">{{ $slot }}</a>\n                    </td>\n                </tr>\n            </table>\n        </td>\n    </tr>\n</table>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/laravel/framework/src/Illuminate/Mail/resources/views/html/promotion")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Mail/resources/views/html/promotion/button.blade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1385 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
