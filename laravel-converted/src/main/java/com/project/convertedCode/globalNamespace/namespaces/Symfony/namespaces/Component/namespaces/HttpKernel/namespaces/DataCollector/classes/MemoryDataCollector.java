package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_memory_get_peak_usage;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.DataCollector;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DataCollector.classes.LateDataCollectorInterface;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DataCollector/MemoryDataCollector.php

*/

public class MemoryDataCollector extends DataCollector implements LateDataCollectorInterface {

    public MemoryDataCollector(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MemoryDataCollector.class) {
            this.__construct(env, args);
        }
    }

    public MemoryDataCollector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.reset(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(
        index = 1,
        name = "response",
        typeHint = "Symfony\\Component\\HttpFoundation\\Response"
    )
    @ConvertedParameter(
        index = 2,
        name = "exception",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object collect(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, false);
        Object exception = assignParameter(args, 2, true);
        if (null == exception) {
            exception = ZVal.getNull();
        }
        this.updateMemoryUsage(env);
        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("data")
                .set(
                        ZVal.newArray(
                                new ZPair("memory", 0),
                                new ZPair(
                                        "memory_limit",
                                        this.convertToBytes(
                                                env,
                                                function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("memory_limit")
                                                        .value()))));
        return null;
    }

    @ConvertedMethod
    public Object lateCollect(RuntimeEnv env, Object... args) {
        this.updateMemoryUsage(env);
        return null;
    }

    @ConvertedMethod
    public Object getMemory(RuntimeEnv env, Object... args) {
        return ZVal.assign(new ReferenceClassProperty(this, "data", env).arrayGet(env, "memory"));
    }

    @ConvertedMethod
    public Object getMemoryLimit(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "data", env).arrayGet(env, "memory_limit"));
    }

    @ConvertedMethod
    public Object updateMemoryUsage(RuntimeEnv env, Object... args) {
        new ReferenceClassProperty(this, "data", env)
                .arrayAccess(env, "memory")
                .set(function_memory_get_peak_usage.f.env(env).call(true).value());
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "memory";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "memoryLimit")
    private Object convertToBytes(RuntimeEnv env, Object... args) {
        Object memoryLimit = assignParameter(args, 0, false);
        Object max = null;
        if (ZVal.strictEqualityCheck("-1", "===", memoryLimit)) {
            return -1;
        }

        memoryLimit = NamespaceGlobal.strtolower.env(env).call(memoryLimit).value();
        max =
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(function_ltrim.f.env(env).call(memoryLimit, "+").value())
                        .value();
        if (ZVal.strictEqualityCheck(
                0, "===", function_strpos.f.env(env).call(max, "0x").value())) {
            max = NamespaceGlobal.intval.env(env).call(max, 16).value();

        } else if (ZVal.strictEqualityCheck(
                0, "===", function_strpos.f.env(env).call(max, "0").value())) {
            max = NamespaceGlobal.intval.env(env).call(max, 8).value();

        } else {
            max = ZVal.assign(ZVal.toLong(max));
        }

        switch (toStringR(function_substr.f.env(env).call(memoryLimit, -1).value())) {
            case "t":
                max = ZAssignment.multiply("*=", max, 1024);
            case "g":
                max = ZAssignment.multiply("*=", max, 1024);
            case "m":
                max = ZAssignment.multiply("*=", max, 1024);
            case "k":
                max = ZAssignment.multiply("*=", max, 1024);
        }
        ;
        return ZVal.assign(max);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DataCollector\\MemoryDataCollector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DataCollector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\DataCollector\\MemoryDataCollector")
                    .setLookup(
                            MemoryDataCollector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cloner", "data")
                    .setFilename("vendor/symfony/http-kernel/DataCollector/MemoryDataCollector.php")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\LateDataCollectorInterface")
                    .addInterface(
                            "Symfony\\Component\\HttpKernel\\DataCollector\\DataCollectorInterface")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\HttpKernel\\DataCollector\\DataCollector")
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
