package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes.FileDumper;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/IcuResFileDumper.php

*/

public class IcuResFileDumper extends FileDumper {

    public IcuResFileDumper(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.relativePathTemplate = "%domain%/%locale%.%extension%";
    }

    public IcuResFileDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "messages",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 1, name = "domain")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object formatCatalogue(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object domain = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object data = null;
        Object keyTop = null;
        Object resources = null;
        Object resOffset = null;
        Object source = null;
        Object target = null;
        Object indexes = null;
        Object root = null;
        Object header = null;
        Object bundleTop = null;
        data = ZVal.assign(indexes = ZVal.assign(resources = ""));
        for (ZPair zpairResult2118 :
                ZVal.getIterable(
                        env.callMethod(messages, "all", IcuResFileDumper.class, domain),
                        env,
                        false)) {
            source = ZVal.assign(zpairResult2118.getKey());
            target = ZVal.assign(zpairResult2118.getValue());
            indexes =
                    toStringR(indexes, env)
                            + toStringR(
                                    NamespaceGlobal.pack
                                            .env(env)
                                            .call(
                                                    "v",
                                                    ZVal.add(
                                                            function_strlen
                                                                    .f
                                                                    .env(env)
                                                                    .call(data)
                                                                    .value(),
                                                            28))
                                            .value(),
                                    env);
            data = toStringR(data, env) + toStringR(source, env) + "\u0000";
        }

        data = toStringR(data, env) + toStringR(this.writePadding(env, data), env);
        keyTop = this.getPosition(env, data);
        for (ZPair zpairResult2119 :
                ZVal.getIterable(
                        env.callMethod(messages, "all", IcuResFileDumper.class, domain),
                        env,
                        false)) {
            source = ZVal.assign(zpairResult2119.getKey());
            target = ZVal.assign(zpairResult2119.getValue());
            resources =
                    toStringR(resources, env)
                            + toStringR(
                                    NamespaceGlobal.pack
                                            .env(env)
                                            .call("V", this.getPosition(env, data))
                                            .value(),
                                    env);
            data =
                    toStringR(data, env)
                            + toStringR(
                                    NamespaceGlobal.pack
                                            .env(env)
                                            .call(
                                                    "V",
                                                    function_strlen.f.env(env).call(target).value())
                                            .value(),
                                    env)
                            + toStringR(
                                    NamespaceGlobal.mb_convert_encoding
                                            .env(env)
                                            .call(
                                                    toStringR(target, env) + "\u0000",
                                                    "UTF-16LE",
                                                    "UTF-8")
                                            .value(),
                                    env)
                            + toStringR(this.writePadding(env, data), env);
        }

        resOffset = this.getPosition(env, data);
        data =
                toStringR(data, env)
                        + toStringR(
                                NamespaceGlobal.pack
                                        .env(env)
                                        .call(
                                                "v",
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        messages,
                                                                        "all",
                                                                        IcuResFileDumper.class,
                                                                        domain))
                                                        .value())
                                        .value(),
                                env)
                        + toStringR(indexes, env)
                        + toStringR(this.writePadding(env, data), env)
                        + toStringR(resources, env);
        bundleTop = this.getPosition(env, data);
        root =
                NamespaceGlobal.pack
                        .env(env)
                        .call(
                                "V7",
                                ZVal.add(resOffset, ZVal.toLong(2) << ZVal.toLong(28)),
                                6,
                                keyTop,
                                bundleTop,
                                bundleTop,
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        messages,
                                                        "all",
                                                        IcuResFileDumper.class,
                                                        domain))
                                        .value(),
                                0)
                        .value();
        header =
                NamespaceGlobal.pack
                        .env(env)
                        .call(
                                "vC2v4C12@32",
                                32,
                                218,
                                39,
                                20,
                                0,
                                0,
                                2,
                                82,
                                101,
                                115,
                                66,
                                1,
                                2,
                                0,
                                0,
                                1,
                                4,
                                0,
                                0)
                        .value();
        return ZVal.assign(toStringR(header, env) + toStringR(root, env) + toStringR(data, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    private Object writePadding(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object padding = null;
        padding = ZVal.modulus(function_strlen.f.env(env).call(data).value(), 4);
        if (ZVal.isTrue(padding)) {
            return ZVal.assign(
                    function_str_repeat
                            .f
                            .env(env)
                            .call(ZVal.base64Decode("qg=="), ZVal.subtract(4, padding))
                            .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    private Object getPosition(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.divide(ZVal.add(function_strlen.f.env(env).call(data).value(), 28), 4));
    }

    @ConvertedMethod
    protected Object getExtension(RuntimeEnv env, Object... args) {
        return "res";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Dumper\\IcuResFileDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FileDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Dumper\\IcuResFileDumper")
                    .setLookup(
                            IcuResFileDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("relativePathTemplate", "relativePathTemplate")
                    .setFilename("vendor/symfony/translation/Dumper/IcuResFileDumper.php")
                    .addInterface("Symfony\\Component\\Translation\\Dumper\\DumperInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Dumper\\FileDumper")
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
