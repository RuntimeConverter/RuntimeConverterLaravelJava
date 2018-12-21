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

 vendor/filp/whoops/src/Whoops/Resources/views/header_outer.html.php

*/

public class file_header_outer_html_php implements RuntimeIncludable {

    public static final file_header_outer_html_php instance = new file_header_outer_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope340 scope = new Scope340();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope340 scope)
            throws IncludeEventException {
        env.echo("<header>\n  ");
        env.callMethod(scope.tpl, "render", file_header_outer_html_php.class, scope.header);
        env.echo("</header>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile(
                            "/vendor/filp/whoops/src/Whoops/Resources/views/header_outer.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope340 implements UpdateRuntimeScopeInterface {

        Object tpl;
        Object header;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("tpl", this.tpl);
            stack.setVariable("header", this.header);
        }

        public void updateScope(RuntimeStack stack) {

            this.tpl = stack.getVariable("tpl");
            this.header = stack.getVariable("header");
        }
    }
}
