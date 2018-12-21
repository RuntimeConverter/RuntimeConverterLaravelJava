package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Foundation.Exceptions.views;

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

 vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/views/404.blade.php

*/

public class file_404_blade_php implements RuntimeIncludable {

    public static final file_404_blade_php instance = new file_404_blade_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1269 scope = new Scope1269();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1269 scope)
            throws IncludeEventException {
        env.echo(
                "@extends('errors::layout')\n\n@section('title', 'Page Not Found')\n\n@section('message', 'Sorry, the page you are looking for could not be found.')\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/views")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Exceptions/views/404.blade.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1269 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
