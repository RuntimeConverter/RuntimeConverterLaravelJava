package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.CutStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.VarCloner;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollectorInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Data;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.classes.NoConstructor;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/DataCollector.php

*/

public abstract class DataCollector extends RuntimeClassBase
        implements DataCollectorInterface, Serializable {

    public Object data = ZVal.newArray();

    public Object cloner = null;

    public DataCollector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_serialize.f.env(env).call(this.data).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data = function_unserialize.f.env(env).call(data).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var")
    protected Object cloneVar(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        var, Data.class, "Symfony\\Component\\VarDumper\\Cloner\\Data"))) {
            return ZVal.assign(var);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.cloner)) {
            if (!function_class_exists.f.env(env).call(CutStub.CONST_class).getBool()) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The VarDumper component is needed for the %s() method. Install symfony/var-dumper version 3.4 or above.",
                                                "DataCollector::cloneVar")
                                        .value()));
            }

            this.cloner = new VarCloner(env);
            env.callMethod(this.cloner, "setMaxItems", DataCollector.class, -1);
            env.callMethod(this.cloner, "addCasters", DataCollector.class, this.getCasters(env));
        }

        return ZVal.assign(env.callMethod(this.cloner, "cloneVar", DataCollector.class, var));
    }

    @ConvertedMethod
    protected Object getCasters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/http-kernel/DataCollector")
                        .setFile("/vendor/symfony/http-kernel/DataCollector/DataCollector.php");
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "*",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\HttpKernel\\DataCollector",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "v")
                                    @ConvertedParameter(index = 1, name = "a", typeHint = "array")
                                    @ConvertedParameter(
                                        index = 2,
                                        name = "s",
                                        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
                                    )
                                    @ConvertedParameter(index = 3, name = "isNested")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object v = assignParameter(args, 0, false);
                                        ReferenceContainer a =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 1, false));
                                        Object s = assignParameter(args, 2, false);
                                        Object isNested = assignParameter(args, 3, false);
                                        Object k = null;
                                        if (!ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        v,
                                                        Stub.class,
                                                        "Symfony\\Component\\VarDumper\\Cloner\\Stub"))) {
                                            for (ZPair zpairResult1911 :
                                                    ZVal.getIterable(a.getObject(), env, false)) {
                                                k = ZVal.assign(zpairResult1911.getKey());
                                                v = ZVal.assign(zpairResult1911.getValue());
                                                if (ZVal.toBool(
                                                                ZVal.toBool(
                                                                                function_is_object
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(v)
                                                                                        .value())
                                                                        && ZVal.toBool(
                                                                                !ZVal.isTrue(
                                                                                        ZVal
                                                                                                .checkInstanceType(
                                                                                                        v,
                                                                                                        DateTimeInterface
                                                                                                                .class,
                                                                                                        "DateTimeInterface"))))
                                                        && ZVal.toBool(
                                                                !ZVal.isTrue(
                                                                        ZVal.checkInstanceType(
                                                                                v,
                                                                                Stub.class,
                                                                                "Symfony\\Component\\VarDumper\\Cloner\\Stub")))) {
                                                    a.arrayAccess(env, k).set(new CutStub(env, v));
                                                }
                                            }
                                        }

                                        return ZVal.assign(a.getObject());
                                    }
                                })));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector";

    @ConvertedMethod()
    public abstract Object collect(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getName(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object reset(RuntimeEnv env, Object... args);

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
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
                    .setLookup(
                            DataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "data")
                    .setFilename("vendor/symfony/http-kernel/DataCollector/DataCollector.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
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
