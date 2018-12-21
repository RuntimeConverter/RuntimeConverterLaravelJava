package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes;

import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes.Checker;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Shell;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/VersionUpdater/GitHubChecker.php

*/

public class GitHubChecker extends RuntimeClassBase implements Checker {

    public Object latest = null;

    public GitHubChecker(RuntimeEnv env, Object... args) {
        super(env);
    }

    public GitHubChecker(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object isLatest(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.version_compare
                        .env(env)
                        .call(Shell.CONST_VERSION, this.getLatest(env), ">=")
                        .value());
    }

    @ConvertedMethod
    public Object getLatest(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.latest)) {
            this.setLatest(env, this.getVersionFromTag(env));
        }

        return ZVal.assign(this.latest);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version")
    public Object setLatest(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, false);
        this.latest = version;
        return null;
    }

    @ConvertedMethod
    private Object getVersionFromTag(RuntimeEnv env, Object... args) {
        Object contents = null;
        contents = this.fetchLatestRelease(env);
        if (ZVal.toBool(!ZVal.isTrue(contents))
                || ZVal.toBool(
                        !ZVal.isset(
                                toObjectR(contents)
                                        .accessProp(this, env)
                                        .name("tag_name")
                                        .value()))) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Unable to check for updates"));
        }

        this.setLatest(env, toObjectR(contents).accessProp(this, env).name("tag_name").value());
        return ZVal.assign(this.getLatest(env));
    }

    @ConvertedMethod
    public Object fetchLatestRelease(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src/VersionUpdater")
                        .setFile("/vendor/psy/psysh/src/VersionUpdater/GitHubChecker.php");
        Object result = null;
        Object context = null;
        context =
                NamespaceGlobal.stream_context_create
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                "http",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "user_agent",
                                                                "PsySH/"
                                                                        + toStringR(
                                                                                Shell.CONST_VERSION,
                                                                                env)),
                                                        new ZPair("timeout", 3)))))
                        .value();
        function_set_error_handler
                .f
                .env(env)
                .call(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Psy\\VersionUpdater",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return null;
                            }
                        });
        result = function_file_get_contents.f.env(env).call(CONST_URL, false, context).value();
        function_restore_error_handler.f.env(env).call();
        return ZVal.assign(NamespaceGlobal.json_decode.env(env).call(result).value());
    }

    public static final Object CONST_URL =
            "https://api.github.com/repos/bobthecow/psysh/releases/latest";

    public static final Object CONST_class = "Psy\\VersionUpdater\\GitHubChecker";

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
                    .setName("Psy\\VersionUpdater\\GitHubChecker")
                    .setLookup(
                            GitHubChecker.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("latest")
                    .setFilename("vendor/psy/psysh/src/VersionUpdater/GitHubChecker.php")
                    .addInterface("Psy\\VersionUpdater\\Checker")
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
