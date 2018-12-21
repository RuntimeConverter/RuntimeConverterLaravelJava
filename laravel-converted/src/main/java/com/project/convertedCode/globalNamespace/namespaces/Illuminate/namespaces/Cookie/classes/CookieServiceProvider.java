package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cookie.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cookie.classes.CookieJar;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cookie/CookieServiceProvider.php

*/

public class CookieServiceProvider extends ServiceProvider {

    public CookieServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CookieServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public CookieServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Cookie")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Cookie/CookieServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                CookieServiceProvider.class,
                "cookie",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Cookie", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        Object ternaryExpressionTemp = null;
                        ReferenceContainer config = new BasicReferenceContainer(null);
                        config.setObject(
                                env.callMethod(
                                        env.callMethod(
                                                app, "make", CookieServiceProvider.class, "config"),
                                        "get",
                                        CookieServiceProvider.class,
                                        "session"));
                        return ZVal.assign(
                                env.callMethod(
                                        new CookieJar(env),
                                        "setDefaultPathAndDomain",
                                        CookieServiceProvider.class,
                                        config.arrayGet(env, "path"),
                                        config.arrayGet(env, "domain"),
                                        config.arrayGet(env, "secure"),
                                        ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                config.arrayGet(env, "same_site"))
                                                ? ternaryExpressionTemp
                                                : ZVal.getNull()));
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Cookie\\CookieServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Cookie\\CookieServiceProvider")
                    .setLookup(
                            CookieServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Cookie/CookieServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
