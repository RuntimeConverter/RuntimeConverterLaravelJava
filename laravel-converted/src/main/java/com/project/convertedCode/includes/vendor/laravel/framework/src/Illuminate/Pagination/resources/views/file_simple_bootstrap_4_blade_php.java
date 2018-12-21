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

 vendor/laravel/framework/src/Illuminate/Pagination/resources/views/simple-bootstrap-4.blade.php

*/

public class file_simple_bootstrap_4_blade_php implements RuntimeIncludable {

    public static final file_simple_bootstrap_4_blade_php instance =
            new file_simple_bootstrap_4_blade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1437 scope = new Scope1437();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1437 scope)
            throws IncludeEventException {
        env.echo(
                "@if ($paginator->hasPages())\n    <ul class=\"pagination\" role=\"navigation\">\n        {{-- Previous Page Link --}}\n        @if ($paginator->onFirstPage())\n            <li class=\"page-item disabled\" aria-disabled=\"true\">\n                <span class=\"page-link\">@lang('pagination.previous')</span>\n            </li>\n        @else\n            <li class=\"page-item\">\n                <a class=\"page-link\" href=\"{{ $paginator->previousPageUrl() }}\" rel=\"prev\">@lang('pagination.previous')</a>\n            </li>\n        @endif\n\n        {{-- Next Page Link --}}\n        @if ($paginator->hasMorePages())\n            <li class=\"page-item\">\n                <a class=\"page-link\" href=\"{{ $paginator->nextPageUrl() }}\" rel=\"next\">@lang('pagination.next')</a>\n            </li>\n        @else\n            <li class=\"page-item disabled\" aria-disabled=\"true\">\n                <span class=\"page-link\">@lang('pagination.next')</span>\n            </li>\n        @endif\n    </ul>\n@endif\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Pagination/resources/views")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Pagination/resources/views/simple-bootstrap-4.blade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1437 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
