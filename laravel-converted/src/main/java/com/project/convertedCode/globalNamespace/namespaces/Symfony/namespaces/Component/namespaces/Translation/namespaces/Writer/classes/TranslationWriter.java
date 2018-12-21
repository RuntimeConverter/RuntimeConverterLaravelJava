package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Writer.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Writer.classes.TranslationWriterInterface;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Writer/TranslationWriter.php

*/

public class TranslationWriter extends RuntimeClassBase implements TranslationWriterInterface {

    public Object dumpers = ZVal.newArray();

    public TranslationWriter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TranslationWriter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(
        index = 1,
        name = "dumper",
        typeHint = "Symfony\\Component\\Translation\\Dumper\\DumperInterface"
    )
    public Object addDumper(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object dumper = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "dumpers", env).arrayAccess(env, format).set(dumper);
        return null;
    }

    @ConvertedMethod
    public Object disableBackup(RuntimeEnv env, Object... args) {
        Object dumper = null;
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "The %s() method is deprecated since Symfony 4.1.",
                                        "TranslationWriter::disableBackup")
                                .value(),
                        16384)
                .value();
        for (ZPair zpairResult2173 : ZVal.getIterable(this.dumpers, env, true)) {
            dumper = ZVal.assign(zpairResult2173.getValue());
            if (function_method_exists.f.env(env).call(dumper, "setBackup").getBool()) {
                env.callMethod(dumper, "setBackup", TranslationWriter.class, false);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getFormats(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.dumpers).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "catalogue",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 1, name = "format")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object write(RuntimeEnv env, Object... args) {
        Object catalogue = assignParameter(args, 0, false);
        Object format = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object dumper = null;
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "dumpers", env), env, format)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "There is no dumper associated with format \"%s\".",
                                            format)
                                    .value()));
        }

        dumper =
                ZVal.assign(new ReferenceClassProperty(this, "dumpers", env).arrayGet(env, format));
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        arrayActionR(
                                                                ArrayAction.ISSET,
                                                                options,
                                                                env,
                                                                "path"))
                                                && ZVal.toBool(
                                                        !function_is_dir
                                                                .f
                                                                .env(env)
                                                                .call(options.arrayGet(env, "path"))
                                                                .getBool()))
                                && ZVal.toBool(
                                        !ZVal.isTrue(
                                                NamespaceGlobal.mkdir
                                                        .env(env)
                                                        .call(
                                                                options.arrayGet(env, "path"),
                                                                511,
                                                                true)
                                                        .value())))
                && ZVal.toBool(
                        !function_is_dir
                                .f
                                .env(env)
                                .call(options.arrayGet(env, "path"))
                                .getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Translation Writer was not able to create directory \"%s\"",
                                            options.arrayGet(env, "path"))
                                    .value()));
        }

        env.callMethod(dumper, "dump", TranslationWriter.class, catalogue, options.getObject());
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Writer\\TranslationWriter";

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
                    .setName("Symfony\\Component\\Translation\\Writer\\TranslationWriter")
                    .setLookup(
                            TranslationWriter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dumpers")
                    .setFilename("vendor/symfony/translation/Writer/TranslationWriter.php")
                    .addInterface(
                            "Symfony\\Component\\Translation\\Writer\\TranslationWriterInterface")
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
