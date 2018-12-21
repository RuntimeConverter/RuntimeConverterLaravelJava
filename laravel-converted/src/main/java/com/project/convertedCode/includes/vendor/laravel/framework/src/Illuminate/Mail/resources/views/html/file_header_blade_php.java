package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Mail.resources.views.html;

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

 vendor/laravel/framework/src/Illuminate/Mail/resources/views/html/header.blade.php

*/

public class file_header_blade_php implements RuntimeIncludable {

    public static final file_header_blade_php instance = new file_header_blade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1380 scope = new Scope1380();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1380 scope)
            throws IncludeEventException {
        env.echo(
                "<tr>\n    <td class=\"header\">\n        <a href=\"{{ $url }}\">\n            {{ $slot }}\n        </a>\n    </td>\n</tr>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Mail/resources/views/html")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Mail/resources/views/html/header.blade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1380 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
