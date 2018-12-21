package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.Process;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.PhpExecutableFinder;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ProcessUtils;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Composer.php

*/

public class Composer extends RuntimeClassBase {

    public Object files = null;

    public Object workingPath = null;

    public Composer(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Composer.class) {
            this.__construct(env, args);
        }
    }

    public Composer(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(
        index = 1,
        name = "workingPath",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object workingPath = assignParameter(args, 1, true);
        if (null == workingPath) {
            workingPath = ZVal.getNull();
        }
        this.files = files;
        this.workingPath = workingPath;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "extra")
    public Object dumpAutoloads(RuntimeEnv env, Object... args) {
        Object extra = assignParameter(args, 0, true);
        if (null == extra) {
            extra = "";
        }
        Object process = null;
        process = this.getProcess(env);
        env.callMethod(
                process,
                "setCommandLine",
                Composer.class,
                function_trim
                        .f
                        .env(env)
                        .call(
                                toStringR(this.findComposer(env), env)
                                        + " dump-autoload "
                                        + toStringR(extra, env))
                        .value());
        env.callMethod(process, "run", Composer.class);
        return null;
    }

    @ConvertedMethod
    public Object dumpOptimized(RuntimeEnv env, Object... args) {
        this.dumpAutoloads(env, "--optimize");
        return null;
    }

    @ConvertedMethod
    protected Object findComposer(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                env.callMethod(
                        this.files,
                        "exists",
                        Composer.class,
                        toStringR(this.workingPath, env) + "/composer.phar"))) {
            return ZVal.assign(
                    toStringR(
                                    ProcessUtils.runtimeStaticObject.escapeArgument(
                                            env,
                                            env.callMethod(
                                                    new PhpExecutableFinder(env),
                                                    "find",
                                                    Composer.class,
                                                    false)),
                                    env)
                            + " composer.phar");
        }

        return "composer";
    }

    @ConvertedMethod
    protected Object getProcess(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        new Process(env, "", this.workingPath),
                        "setTimeout",
                        Composer.class,
                        ZVal.getNull()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object setWorkingPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.workingPath = function_realpath.f.env(env).call(path).value();
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Composer";

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
                    .setName("Illuminate\\Support\\Composer")
                    .setLookup(
                            Composer.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("files", "workingPath")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/Composer.php")
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
