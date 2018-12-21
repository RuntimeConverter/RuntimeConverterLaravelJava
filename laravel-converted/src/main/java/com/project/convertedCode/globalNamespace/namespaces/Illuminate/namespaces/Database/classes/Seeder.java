package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Seeder.php

*/

public abstract class Seeder extends RuntimeClassBase {

    public Object container = null;

    public Object command = null;

    public Seeder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Seeder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(
        index = 1,
        name = "silent",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object silent = assignParameter(args, 1, true);
        if (null == silent) {
            silent = false;
        }
        Object classes = null;
        classes = Arr.runtimeStaticObject.wrap(env, _pClass);
        for (ZPair zpairResult374 : ZVal.getIterable(classes, env, true)) {
            _pClass = ZVal.assign(zpairResult374.getValue());
            if (ZVal.toBool(ZVal.strictEqualityCheck(silent, "===", false))
                    && ZVal.toBool(ZVal.isset(this.command))) {
                env.callMethod(
                        env.callMethod(this.command, "getOutput", Seeder.class),
                        "writeln",
                        Seeder.class,
                        "<info>Seeding:</info> " + toStringR(_pClass, env));
            }

            env.callMethod(this.resolve(env, _pClass), "__invoke", Seeder.class);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object callSilent(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        this.call(env, _pClass, true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object instance = null;
        if (ZVal.isset(this.container)) {
            instance = env.callMethod(this.container, "make", Seeder.class, _pClass);
            env.callMethod(instance, "setContainer", Seeder.class, this.container);

        } else {
            instance = env.createNew(_pClass);
        }

        if (ZVal.isset(this.command)) {
            env.callMethod(instance, "setCommand", Seeder.class, this.command);
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container"
    )
    public Object setContainer(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command", typeHint = "Illuminate\\Console\\Command")
    public Object setCommand(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        this.command = command;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __invoke(RuntimeEnv env, Object... args) {
        if (!function_method_exists.f.env(env).call(this, "run").getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Method [run] missing from "
                                    + toStringR(
                                            function_get_class.f.env(env).call(this).value(),
                                            env)));
        }

        return ZVal.assign(
                ZVal.isset(this.container)
                        ? env.callMethod(
                                this.container,
                                "call",
                                Seeder.class,
                                ZVal.newArray(new ZPair(0, this), new ZPair(1, "run")))
                        : env.callMethod(this, "run", Seeder.class));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Seeder";

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
                    .setName("Illuminate\\Database\\Seeder")
                    .setLookup(
                            Seeder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("command", "container")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Database/Seeder.php")
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
