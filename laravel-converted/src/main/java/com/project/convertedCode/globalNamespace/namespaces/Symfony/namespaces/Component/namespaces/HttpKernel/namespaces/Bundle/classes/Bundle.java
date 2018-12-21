package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Bundle.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Bundle.classes.BundleInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Bundle/Bundle.php

*/

public abstract class Bundle extends RuntimeClassBase implements BundleInterface {

    public Object name = null;

    public Object extension = null;

    public Object path = null;

    public Object namespace = null;

    public Bundle(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Bundle(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object shutdown(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object build(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object getContainerExtension(RuntimeEnv env, Object... args) {
        Object extension = null;
        Object basename = null;
        Object expectedAlias = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.extension)) {
            extension = this.createContainerExtension(env);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", extension)) {
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(
                                extension, (Class) null, "ExtensionInterface", env))) {
                    throw ZVal.getException(
                            env,
                            new LogicException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Extension %s must implement Symfony\\Component\\DependencyInjection\\Extension\\ExtensionInterface.",
                                                    function_get_class
                                                            .f
                                                            .env(env)
                                                            .call(extension)
                                                            .value())
                                            .value()));
                }

                basename =
                        function_preg_replace
                                .f
                                .env(env)
                                .call("/Bundle$/", "", this.getName(env))
                                .value();
                expectedAlias =
                        StaticMethodUtils.getStaticBaseClass(
                                        ZVal.resolveClassAlias(env, "Container"), env)
                                .callUnknownStaticMethod(
                                        env,
                                        "underscore",
                                        new RuntimeArgsWithReferences(),
                                        basename);
                if (ZVal.notEqualityCheck(
                        expectedAlias, env.callMethod(extension, "getAlias", Bundle.class))) {
                    throw ZVal.getException(
                            env,
                            new LogicException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Users will expect the alias of the default extension of a bundle to be the underscored version of the bundle name (\"%s\"). You can override \"Bundle::getContainerExtension()\" if you want to use \"%s\" or another alias.",
                                                    expectedAlias,
                                                    env.callMethod(
                                                            extension, "getAlias", Bundle.class))
                                            .value()));
                }

                this.extension = extension;

            } else {
                this.extension = false;
            }
        }

        if (ZVal.isTrue(this.extension)) {
            return ZVal.assign(this.extension);
        }

        return null;
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.namespace)) {
            this.parseClassName(env);
        }

        return ZVal.assign(this.namespace);
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        Object reflected = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.path)) {
            reflected = new ReflectionObject(env, this);
            this.path =
                    function_dirname
                            .f
                            .env(env)
                            .call(env.callMethod(reflected, "getFileName", Bundle.class))
                            .value();
        }

        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    public final Object getName(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.name)) {
            this.parseClassName(env);
        }

        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "application",
        typeHint = "Symfony\\Component\\Console\\Application"
    )
    public Object registerCommands(RuntimeEnv env, Object... args) {
        Object application = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    protected Object getContainerExtensionClass(RuntimeEnv env, Object... args) {
        Object basename = null;
        basename =
                function_preg_replace.f.env(env).call("/Bundle$/", "", this.getName(env)).value();
        return ZVal.assign(
                toStringR(this.getNamespace(env), env)
                        + "\\DependencyInjection\\"
                        + toStringR(basename, env)
                        + "Extension");
    }

    @ConvertedMethod
    protected Object createContainerExtension(RuntimeEnv env, Object... args) {
        Object _pClass = null;
        if (function_class_exists
                .f
                .env(env)
                .call(_pClass = this.getContainerExtensionClass(env))
                .getBool()) {
            return ZVal.assign(env.createNew(_pClass));
        }

        return null;
    }

    @ConvertedMethod
    private Object parseClassName(RuntimeEnv env, Object... args) {
        Object pos = null;
        pos =
                NamespaceGlobal.strrpos
                        .env(env)
                        .call(
                                ClassConstantUtils.getConstantValueLateStatic(env, this, "class"),
                                "\\")
                        .value();
        this.namespace =
                ZVal.strictEqualityCheck(false, "===", pos)
                        ? ""
                        : function_substr
                                .f
                                .env(env)
                                .call(
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        0,
                                        pos)
                                .value();
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.name)) {
            this.name =
                    ZVal.strictEqualityCheck(false, "===", pos)
                            ? ClassConstantUtils.getConstantValueLateStatic(env, this, "class")
                            : function_substr
                                    .f
                                    .env(env)
                                    .call(
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            ZVal.add(pos, 1))
                                    .value();
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\Bundle\\Bundle";

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
                    .setName("Symfony\\Component\\HttpKernel\\Bundle\\Bundle")
                    .setLookup(
                            Bundle.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("extension", "name", "namespace", "path")
                    .setFilename("vendor/symfony/http-kernel/Bundle/Bundle.php")
                    .addInterface("Symfony\\Component\\HttpKernel\\Bundle\\BundleInterface")
                    .addInterface("ContainerAwareInterface")
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
