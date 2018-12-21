package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.ExecutableFinder;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/PhpExecutableFinder.php

*/

public class PhpExecutableFinder extends RuntimeClassBase {

    public Object executableFinder = null;

    public PhpExecutableFinder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhpExecutableFinder.class) {
            this.__construct(env, args);
        }
    }

    public PhpExecutableFinder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.executableFinder = new ExecutableFinder(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "includeArgs",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object find(RuntimeEnv env, Object... args) {
        Object includeArgs = assignParameter(args, 0, true);
        if (null == includeArgs) {
            includeArgs = true;
        }
        Object ___args = null;
        Object php = null;
        ReferenceContainer dirs = new BasicReferenceContainer(null);
        if (ZVal.isTrue(php = NamespaceGlobal.getenv.env(env).call("PHP_BINARY").value())) {
            if (!NamespaceGlobal.is_executable.env(env).call(php).getBool()) {
                return ZVal.assign(false);
            }

            return ZVal.assign(php);
        }

        ___args = this.findArguments(env);
        ___args =
                ZVal.assign(
                        ZVal.toBool(includeArgs) && ZVal.toBool(___args)
                                ? " "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(" ", ___args)
                                                        .value(),
                                                env)
                                : "");
        if (ZVal.toBool("/var/runtimeConverter/php-install-release/bin/php")
                && ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(
                                        "cli",
                                        ZVal.arrayFromList("cli", "cli-server", "phpdbg"),
                                        true)
                                .value())) {
            return ZVal.assign(
                    toStringR("/var/runtimeConverter/php-install-release/bin/php", env)
                            + toStringR(___args, env));
        }

        if (ZVal.isTrue(php = NamespaceGlobal.getenv.env(env).call("PHP_PATH").value())) {
            if (!ZVal.isTrue(NamespaceGlobal.is_executable.env(env).call(php).value())) {
                return ZVal.assign(false);
            }

            return ZVal.assign(php);
        }

        if (ZVal.isTrue(php = NamespaceGlobal.getenv.env(env).call("PHP_PEAR_PHP_BIN").value())) {
            if (ZVal.isTrue(NamespaceGlobal.is_executable.env(env).call(php).value())) {
                return ZVal.assign(php);
            }
        }

        if (ZVal.isTrue(
                NamespaceGlobal.is_executable
                        .env(env)
                        .call(
                                php =
                                        toStringR(
                                                        "/var/runtimeConverter/php-install-release/bin",
                                                        env)
                                                + toStringR(
                                                        ZVal.strictEqualityCheck("\\", "===", "/")
                                                                ? "\\php.exe"
                                                                : "/php",
                                                        env))
                        .value())) {
            return ZVal.assign(php);
        }

        dirs.setObject(
                ZVal.newArray(new ZPair(0, "/var/runtimeConverter/php-install-release/bin")));
        if (ZVal.strictEqualityCheck("\\", "===", "/")) {
            dirs.arrayAppend(env).set("C:\\xampp\\php\\");
        }

        return ZVal.assign(
                env.callMethod(
                        this.executableFinder,
                        "find",
                        PhpExecutableFinder.class,
                        "php",
                        false,
                        dirs.getObject()));
    }

    @ConvertedMethod
    public Object findArguments(RuntimeEnv env, Object... args) {
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        arguments.setObject(ZVal.newArray());
        if (ZVal.strictEqualityCheck("phpdbg", "===", "cli")) {
            arguments.arrayAppend(env).set("-qrr");
        }

        return ZVal.assign(arguments.getObject());
    }

    public static final Object CONST_class = "Symfony\\Component\\Process\\PhpExecutableFinder";

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
                    .setName("Symfony\\Component\\Process\\PhpExecutableFinder")
                    .setLookup(
                            PhpExecutableFinder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("executableFinder")
                    .setFilename("vendor/symfony/process/PhpExecutableFinder.php")
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
