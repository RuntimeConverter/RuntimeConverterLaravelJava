package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.CommandLoader.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.CommandLoader.classes.CommandLoaderInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.CommandNotFoundException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/CommandLoader/ContainerCommandLoader.php

*/

public class ContainerCommandLoader extends RuntimeClassBase implements CommandLoaderInterface {

    public Object container = null;

    public Object commandMap = null;

    public ContainerCommandLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ContainerCommandLoader.class) {
            this.__construct(env, args);
        }
    }

    public ContainerCommandLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Psr\\Container\\ContainerInterface"
    )
    @ConvertedParameter(index = 1, name = "commandMap", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object commandMap = assignParameter(args, 1, false);
        this.container = container;
        this.commandMap = commandMap;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.has(env, name))) {
            throw ZVal.getException(
                    env,
                    new CommandNotFoundException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Command \"%s\" does not exist.", name)
                                    .value()));
        }

        return ZVal.assign(
                env.callMethod(
                        this.container,
                        "get",
                        ContainerCommandLoader.class,
                        new ReferenceClassProperty(this, "commandMap", env).arrayGet(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "commandMap", env),
                                        env,
                                        name))
                        && ZVal.toBool(
                                env.callMethod(
                                        this.container,
                                        "has",
                                        ContainerCommandLoader.class,
                                        new ReferenceClassProperty(this, "commandMap", env)
                                                .arrayGet(env, name))));
    }

    @ConvertedMethod
    public Object getNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.commandMap).value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\CommandLoader\\ContainerCommandLoader";

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
                    .setName("Symfony\\Component\\Console\\CommandLoader\\ContainerCommandLoader")
                    .setLookup(
                            ContainerCommandLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("commandMap", "container")
                    .setFilename("vendor/symfony/console/CommandLoader/ContainerCommandLoader.php")
                    .addInterface(
                            "Symfony\\Component\\Console\\CommandLoader\\CommandLoaderInterface")
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
