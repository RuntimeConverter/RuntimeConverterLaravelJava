package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.dependency_maps;

import com.project.convertedCode.globalNamespace.classes.Swift_DependencyContainer;
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

 vendor/swiftmailer/swiftmailer/lib/dependency_maps/cache_deps.php

*/

public class file_cache_deps_php implements RuntimeIncludable {

    public static final file_cache_deps_php instance = new file_cache_deps_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3133 scope = new Scope3133();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3133 scope)
            throws IncludeEventException {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        env.callMethod(
                                                                                env.callMethod(
                                                                                        env
                                                                                                .callMethod(
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        env
                                                                                                                                .callMethod(
                                                                                                                                        env
                                                                                                                                                .callMethod(
                                                                                                                                                        Swift_DependencyContainer
                                                                                                                                                                .runtimeStaticObject
                                                                                                                                                                .getInstance(
                                                                                                                                                                        env),
                                                                                                                                                        "register",
                                                                                                                                                        file_cache_deps_php
                                                                                                                                                                .class,
                                                                                                                                                        "cache"),
                                                                                                                                        "asAliasOf",
                                                                                                                                        file_cache_deps_php
                                                                                                                                                .class,
                                                                                                                                        "cache.array"),
                                                                                                                        "register",
                                                                                                                        file_cache_deps_php
                                                                                                                                .class,
                                                                                                                        "tempdir"),
                                                                                                        "asValue",
                                                                                                        file_cache_deps_php
                                                                                                                .class,
                                                                                                        "/tmp"),
                                                                                        "register",
                                                                                        file_cache_deps_php
                                                                                                .class,
                                                                                        "cache.null"),
                                                                                "asSharedInstanceOf",
                                                                                file_cache_deps_php
                                                                                        .class,
                                                                                "Swift_KeyCache_NullKeyCache"),
                                                                        "register",
                                                                        file_cache_deps_php.class,
                                                                        "cache.array"),
                                                                "asSharedInstanceOf",
                                                                file_cache_deps_php.class,
                                                                "Swift_KeyCache_ArrayKeyCache"),
                                                        "withDependencies",
                                                        file_cache_deps_php.class,
                                                        ZVal.arrayFromList("cache.inputstream")),
                                                "register",
                                                file_cache_deps_php.class,
                                                "cache.disk"),
                                        "asSharedInstanceOf",
                                        file_cache_deps_php.class,
                                        "Swift_KeyCache_DiskKeyCache"),
                                "withDependencies",
                                file_cache_deps_php.class,
                                ZVal.arrayFromList("cache.inputstream", "tempdir")),
                        "register",
                        file_cache_deps_php.class,
                        "cache.inputstream"),
                "asNewInstanceOf",
                file_cache_deps_php.class,
                "Swift_KeyCache_SimpleKeyCacheInputStream");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/dependency_maps")
                    .setFile("/vendor/swiftmailer/swiftmailer/lib/dependency_maps/cache_deps.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3133 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
