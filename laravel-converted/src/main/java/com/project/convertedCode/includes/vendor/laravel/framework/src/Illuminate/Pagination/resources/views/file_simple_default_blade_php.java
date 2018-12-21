package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Pagination.resources.views;

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

 vendor/laravel/framework/src/Illuminate/Pagination/resources/views/simple-default.blade.php

*/

public class file_simple_default_blade_php implements RuntimeIncludable {

    public static final file_simple_default_blade_php instance =
            new file_simple_default_blade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1438 scope = new Scope1438();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1438 scope)
            throws IncludeEventException {
        env.echo(
                "@if ($paginator->hasPages())\n    <ul class=\"pagination\" role=\"navigation\">\n        {{-- Previous Page Link --}}\n        @if ($paginator->onFirstPage())\n            <li class=\"disabled\" aria-disabled=\"true\"><span>@lang('pagination.previous')</span></li>\n        @else\n            <li><a href=\"{{ $paginator->previousPageUrl() }}\" rel=\"prev\">@lang('pagination.previous')</a></li>\n        @endif\n\n        {{-- Next Page Link --}}\n        @if ($paginator->hasMorePages())\n            <li><a href=\"{{ $paginator->nextPageUrl() }}\" rel=\"next\">@lang('pagination.next')</a></li>\n        @else\n            <li class=\"disabled\" aria-disabled=\"true\"><span>@lang('pagination.next')</span></li>\n        @endif\n    </ul>\n@endif\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Pagination/resources/views")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Pagination/resources/views/simple-default.blade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1438 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
