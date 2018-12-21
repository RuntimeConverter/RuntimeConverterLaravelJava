package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheClearer.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.CacheClearer.classes.CacheClearerInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/CacheClearer/Psr6CacheClearer.php

*/

public class Psr6CacheClearer extends RuntimeClassBase implements CacheClearerInterface {

    public Object pools = ZVal.newArray();

    public Psr6CacheClearer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Psr6CacheClearer.class) {
            this.__construct(env, args);
        }
    }

    public Psr6CacheClearer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "pools",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object pools = assignParameter(args, 0, true);
        if (null == pools) {
            pools = ZVal.newArray();
        }
        this.pools = pools;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasPool(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "pools", env),
                        env,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getPool(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.hasPool(env, name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Cache pool not found: %s.", name)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "pools", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object clearPool(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "pools", env), env, name)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Cache pool not found: %s.", name)
                                    .value()));
        }

        return ZVal.assign(
                env.callMethod(
                        new ReferenceClassProperty(this, "pools", env).arrayGet(env, name),
                        "clear",
                        Psr6CacheClearer.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cacheDir")
    public Object clear(RuntimeEnv env, Object... args) {
        Object cacheDir = assignParameter(args, 0, false);
        Object pool = null;
        for (ZPair zpairResult1899 : ZVal.getIterable(this.pools, env, true)) {
            pool = ZVal.assign(zpairResult1899.getValue());
            env.callMethod(pool, "clear", Psr6CacheClearer.class);
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\CacheClearer\\Psr6CacheClearer";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\CacheClearer\\Psr6CacheClearer")
                    .setLookup(
                            Psr6CacheClearer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("pools")
                    .setFilename("vendor/symfony/http-kernel/CacheClearer/Psr6CacheClearer.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\CacheClearer\\CacheClearerInterface")
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
