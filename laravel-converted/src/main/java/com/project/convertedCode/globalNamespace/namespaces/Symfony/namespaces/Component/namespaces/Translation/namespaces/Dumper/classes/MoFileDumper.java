package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes.FileDumper;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.MoFileLoader;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/MoFileDumper.php

*/

public class MoFileDumper extends FileDumper {

    public MoFileDumper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MoFileDumper(NoConstructor n) {
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
        Object sources = null;
        ReferenceContainer offset = new BasicReferenceContainer(null);
        Object sourcesStart = null;
        Object sourcesSize = null;
        Object targetOffsets = null;
        Object source = null;
        Object targets = null;
        Object target = null;
        Object output = null;
        ReferenceContainer size = new BasicReferenceContainer(null);
        ReferenceContainer offsets = new BasicReferenceContainer(null);
        ReferenceContainer header = new BasicReferenceContainer(null);
        Object sourceOffsets = null;
        sources =
                ZVal.assign(targets = ZVal.assign(sourceOffsets = ZVal.assign(targetOffsets = "")));
        offsets.setObject(ZVal.newArray());
        size.setObject(0);
        for (ZPair zpairResult2121 :
                ZVal.getIterable(
                        env.callMethod(messages, "all", MoFileDumper.class, domain), env, false)) {
            source = ZVal.assign(zpairResult2121.getKey());
            target = ZVal.assign(zpairResult2121.getValue());
            offsets.arrayAppend(env)
                    .set(
                            function_array_map
                                    .f
                                    .env(env)
                                    .call(
                                            "strlen",
                                            ZVal.newArray(
                                                    new ZPair(0, sources),
                                                    new ZPair(1, source),
                                                    new ZPair(2, targets),
                                                    new ZPair(3, target)))
                                    .value());
            sources = toStringR(sources, env) + "\u0000" + toStringR(source, env);
            targets = toStringR(targets, env) + "\u0000" + toStringR(target, env);
            size.setObject(ZVal.increment(size.getObject()));
        }

        header.setObject(
                ZVal.newArray(
                        new ZPair("magicNumber", MoFileLoader.CONST_MO_LITTLE_ENDIAN_MAGIC),
                        new ZPair("formatRevision", 0),
                        new ZPair("count", size.getObject()),
                        new ZPair("offsetId", MoFileLoader.CONST_MO_HEADER_SIZE),
                        new ZPair(
                                "offsetTranslated",
                                ZVal.add(
                                        MoFileLoader.CONST_MO_HEADER_SIZE,
                                        ZVal.multiply(8, size.getObject()))),
                        new ZPair("sizeHashes", 0),
                        new ZPair(
                                "offsetHashes",
                                ZVal.add(
                                        MoFileLoader.CONST_MO_HEADER_SIZE,
                                        ZVal.multiply(16, size.getObject())))));
        sourcesSize = function_strlen.f.env(env).call(sources).value();
        sourcesStart = ZVal.add(header.arrayGet(env, "offsetHashes"), 1);
        for (ZPair zpairResult2122 : ZVal.getIterable(offsets.getObject(), env, true)) {
            offset.setObject(ZVal.assign(zpairResult2122.getValue()));
            sourceOffsets =
                    toStringR(sourceOffsets, env)
                            + toStringR(this.writeLong(env, offset.arrayGet(env, 1)), env)
                            + toStringR(
                                    this.writeLong(
                                            env, ZVal.add(offset.arrayGet(env, 0), sourcesStart)),
                                    env);
            targetOffsets =
                    toStringR(targetOffsets, env)
                            + toStringR(this.writeLong(env, offset.arrayGet(env, 3)), env)
                            + toStringR(
                                    this.writeLong(
                                            env,
                                            ZVal.add(
                                                    ZVal.add(offset.arrayGet(env, 2), sourcesStart),
                                                    sourcesSize)),
                                    env);
        }

        output =
                toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.newArray(
                                                                        new ZPair(0, this),
                                                                        new ZPair(1, "writeLong")),
                                                                header.getObject())
                                                        .value())
                                        .value(),
                                env)
                        + toStringR(sourceOffsets, env)
                        + toStringR(targetOffsets, env)
                        + toStringR(sources, env)
                        + toStringR(targets, env);
        return ZVal.assign(output);
    }

    @ConvertedMethod
    protected Object getExtension(RuntimeEnv env, Object... args) {
        return "mo";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    private Object writeLong(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.pack.env(env).call("V*", str).value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Dumper\\MoFileDumper";

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
                    .setName("Symfony\\Component\\Translation\\Dumper\\MoFileDumper")
                    .setLookup(
                            MoFileDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("relativePathTemplate")
                    .setFilename("vendor/symfony/translation/Dumper/MoFileDumper.php")
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
