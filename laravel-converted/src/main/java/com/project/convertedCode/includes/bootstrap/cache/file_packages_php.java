package com.project.convertedCode.includes.bootstrap.cache;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 bootstrap/cache/packages.php

*/

public class file_packages_php implements RuntimeIncludable {

    public static final file_packages_php instance = new file_packages_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope199 scope = new Scope199();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope199 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "fideloper/proxy",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "providers",
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        "Fideloper\\Proxy\\TrustedProxyServiceProvider"))))),
                                new ZPair(
                                        "laravel/tinker",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "providers",
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        "Laravel\\Tinker\\TinkerServiceProvider"))))),
                                new ZPair(
                                        "nunomaduro/collision",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "providers",
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        "NunoMaduro\\Collision\\Adapters\\Laravel\\CollisionServiceProvider"))))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/bootstrap/cache")
                    .setFile("/bootstrap/cache/packages.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope199 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
