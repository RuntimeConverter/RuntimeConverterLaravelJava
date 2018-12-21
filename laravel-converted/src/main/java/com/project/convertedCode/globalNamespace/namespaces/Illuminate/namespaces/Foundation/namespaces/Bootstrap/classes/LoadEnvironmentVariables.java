package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.namespaces.Exception.classes.InvalidPathException;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.namespaces.Exception.classes.InvalidFileException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArgvInput;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.classes.Dotenv;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/LoadEnvironmentVariables.php

*/

public class LoadEnvironmentVariables extends RuntimeClassBase {

    public LoadEnvironmentVariables(RuntimeEnv env, Object... args) {
        super(env);
    }

    public LoadEnvironmentVariables(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    public Object bootstrap(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object e = null;
        if (ZVal.isTrue(
                env.callMethod(app, "configurationIsCached", LoadEnvironmentVariables.class))) {
            return null;
        }

        this.checkForSpecificEnvironmentFile(env, app);
        try {
            env.callMethod(
                    new Dotenv(
                            env,
                            env.callMethod(app, "environmentPath", LoadEnvironmentVariables.class),
                            env.callMethod(app, "environmentFile", LoadEnvironmentVariables.class)),
                    "load",
                    LoadEnvironmentVariables.class);
        } catch (ConvertedException convertedException37) {
            if (convertedException37.instanceOf(
                    InvalidPathException.class, "Dotenv\\Exception\\InvalidPathException")) {
                e = convertedException37.getObject();
            } else if (convertedException37.instanceOf(
                    InvalidFileException.class, "Dotenv\\Exception\\InvalidFileException")) {
                e = convertedException37.getObject();
                env.exit(
                        "The environment file is invalid: "
                                + toStringR(
                                        env.callMethod(
                                                e, "getMessage", LoadEnvironmentVariables.class),
                                        env));
            } else {
                throw convertedException37;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    protected Object checkForSpecificEnvironmentFile(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object input = null;
        if (ZVal.toBool(env.callMethod(app, "runningInConsole", LoadEnvironmentVariables.class))
                && ZVal.toBool(
                        env.callMethod(
                                input = new ArgvInput(env),
                                "hasParameterOption",
                                LoadEnvironmentVariables.class,
                                "--env"))) {
            if (ZVal.isTrue(
                    this.setEnvironmentFilePath(
                            env,
                            app,
                            toStringR(
                                            env.callMethod(
                                                    app,
                                                    "environmentFile",
                                                    LoadEnvironmentVariables.class),
                                            env)
                                    + "."
                                    + toStringR(
                                            env.callMethod(
                                                    input,
                                                    "getParameterOption",
                                                    LoadEnvironmentVariables.class,
                                                    "--env"),
                                            env)))) {
                return null;
            }
        }

        if (!___env.f.env(env).call("APP_ENV").getBool()) {
            return null;
        }

        this.setEnvironmentFilePath(
                env,
                app,
                toStringR(
                                env.callMethod(
                                        app, "environmentFile", LoadEnvironmentVariables.class),
                                env)
                        + "."
                        + toStringR(___env.f.env(env).call("APP_ENV").value(), env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    @ConvertedParameter(index = 1, name = "file")
    protected Object setEnvironmentFilePath(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        if (function_file_exists
                .f
                .env(env)
                .call(
                        toStringR(
                                        env.callMethod(
                                                app,
                                                "environmentPath",
                                                LoadEnvironmentVariables.class),
                                        env)
                                + "/"
                                + toStringR(file, env))
                .getBool()) {
            env.callMethod(app, "loadEnvironmentFrom", LoadEnvironmentVariables.class, file);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Bootstrap\\LoadEnvironmentVariables";

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
                    .setName("Illuminate\\Foundation\\Bootstrap\\LoadEnvironmentVariables")
                    .setLookup(
                            LoadEnvironmentVariables.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/LoadEnvironmentVariables.php")
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
