package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Dumper.classes.DumperInterface;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Dumper/FileDumper.php

*/

public abstract class FileDumper extends RuntimeClassBase implements DumperInterface {

    public Object relativePathTemplate = "%domain%.%locale%.%extension%";

    public FileDumper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FileDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relativePathTemplate")
    public Object setRelativePathTemplate(RuntimeEnv env, Object... args) {
        Object relativePathTemplate = assignParameter(args, 0, false);
        this.relativePathTemplate = relativePathTemplate;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "backup")
    public Object setBackup(RuntimeEnv env, Object... args) {
        Object backup = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "The %s() method is deprecated since Symfony 4.1.",
                                        "FileDumper::setBackup")
                                .value(),
                        16384)
                .value();
        if (ZVal.strictNotEqualityCheck(false, "!==", backup)) {
            throw ZVal.getException(
                    env, new LogicException(env, "The backup feature is no longer supported."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "messages",
        typeHint = "Symfony\\Component\\Translation\\MessageCatalogue"
    )
    @ConvertedParameter(index = 1, name = "options", defaultValue = "", defaultValueType = "array")
    public Object dump(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object fullpath = null;
        Object domain = null;
        Object directory = null;
        if (!function_array_key_exists.f.env(env).call("path", options.getObject()).getBool()) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "The file dumper needs a path option."));
        }

        for (ZPair zpairResult2117 :
                ZVal.getIterable(
                        env.callMethod(messages, "getDomains", FileDumper.class), env, true)) {
            domain = ZVal.assign(zpairResult2117.getValue());
            fullpath =
                    toStringR(options.arrayGet(env, "path"), env)
                            + "/"
                            + toStringR(
                                    this.getRelativePath(
                                            env,
                                            domain,
                                            env.callMethod(
                                                    messages, "getLocale", FileDumper.class)),
                                    env);
            if (!function_file_exists.f.env(env).call(fullpath).getBool()) {
                directory = function_dirname.f.env(env).call(fullpath).value();
                if (ZVal.toBool(!function_file_exists.f.env(env).call(directory).getBool())
                        && ZVal.toBool(
                                !ZVal.isTrue(
                                        NamespaceGlobal.mkdir
                                                .env(env)
                                                .call(directory, 511, true)
                                                .value()))) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("Unable to create directory \"%s\".", directory)
                                            .value()));
                }
            }

            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            fullpath,
                            env.callMethod(
                                    this,
                                    "formatCatalogue",
                                    FileDumper.class,
                                    messages,
                                    domain,
                                    options.getObject()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain", typeHint = "string")
    @ConvertedParameter(index = 1, name = "locale", typeHint = "string")
    private Object getRelativePath(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        return ZVal.assign(
                NamespaceGlobal.strtr
                        .env(env)
                        .call(
                                this.relativePathTemplate,
                                ZVal.newArray(
                                        new ZPair("%domain%", domain),
                                        new ZPair("%locale%", locale),
                                        new ZPair(
                                                "%extension%",
                                                env.callMethod(
                                                        this, "getExtension", FileDumper.class))))
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\Dumper\\FileDumper";

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
                    .setName("Symfony\\Component\\Translation\\Dumper\\FileDumper")
                    .setLookup(
                            FileDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("relativePathTemplate")
                    .setFilename("vendor/symfony/translation/Dumper/FileDumper.php")
                    .addInterface("Symfony\\Component\\Translation\\Dumper\\DumperInterface")
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
