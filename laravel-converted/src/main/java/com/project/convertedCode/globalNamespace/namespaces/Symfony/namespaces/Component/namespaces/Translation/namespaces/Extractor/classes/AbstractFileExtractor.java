package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Extractor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Extractor/AbstractFileExtractor.php

*/

public abstract class AbstractFileExtractor extends RuntimeClassBase {

    public AbstractFileExtractor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractFileExtractor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    protected Object extractFiles(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object file = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        if (ZVal.toBool(function_is_array.f.env(env).call(resource).value())
                || ZVal.toBool(
                        ZVal.checkInstanceType(resource, Traversable.class, "Traversable"))) {
            files.setObject(ZVal.newArray());
            for (ZPair zpairResult2133 : ZVal.getIterable(resource, env, true)) {
                file = ZVal.assign(zpairResult2133.getValue());
                if (ZVal.isTrue(
                        env.callMethod(
                                this, "canBeExtracted", AbstractFileExtractor.class, file))) {
                    files.arrayAppend(env).set(this.toSplFileInfo(env, file));
                }
            }

        } else if (function_is_file.f.env(env).call(resource).getBool()) {
            files.setObject(
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    this,
                                                    "canBeExtracted",
                                                    AbstractFileExtractor.class,
                                                    resource))
                                    ? ZVal.newArray(new ZPair(0, this.toSplFileInfo(env, resource)))
                                    : ZVal.newArray()));

        } else {
            files.setObject(
                    env.callMethod(
                            this, "extractFromDirectory", AbstractFileExtractor.class, resource));
        }

        return ZVal.assign(files.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "string")
    private Object toSplFileInfo(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        return ZVal.assign(new SplFileInfo(env, file));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object isFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        if (!function_is_file.f.env(env).call(file).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"%s\" file does not exist.", file)
                                    .value()));
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Extractor\\AbstractFileExtractor";

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
                    .setName("Symfony\\Component\\Translation\\Extractor\\AbstractFileExtractor")
                    .setLookup(
                            AbstractFileExtractor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Extractor/AbstractFileExtractor.php")
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
