package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Console.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.resource_path;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.app_path;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Console/AuthMakeCommand.php

*/

public class AuthMakeCommand extends Command {

    public Object views =
            ZVal.newArray(
                    new ZPair("auth/login.stub", "auth/login.blade.php"),
                    new ZPair("auth/register.stub", "auth/register.blade.php"),
                    new ZPair("auth/passwords/email.stub", "auth/passwords/email.blade.php"),
                    new ZPair("auth/passwords/reset.stub", "auth/passwords/reset.blade.php"),
                    new ZPair("layouts/app.stub", "layouts/app.blade.php"),
                    new ZPair("home.stub", "home.blade.php"));

    public AuthMakeCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature =
                "make:auth\n                    {--views : Only scaffold the authentication views}\n                    {--force : Overwrite existing views by default}";
        this.description = "Scaffold basic login and registration views and routes";
        if (this.getClass() == AuthMakeCommand.class) {
            this.__construct(env, args);
        }
    }

    public AuthMakeCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        this.createDirectories(env);
        this.exportViews(env);
        if (!ZVal.isTrue(env.callMethod(this, "option", AuthMakeCommand.class, "views"))) {
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            app_path.f.env(env).call("Http/Controllers/HomeController.php").value(),
                            this.compileControllerStub(env));
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            base_path.f.env(env).call("routes/web.php").value(),
                            function_file_get_contents
                                    .f
                                    .env(env)
                                    .call(
                                            toStringR(
                                                            env.addRootFilesystemPrefix(
                                                                    "/vendor/laravel/framework/src/Illuminate/Auth/Console"),
                                                            env)
                                                    + "/stubs/make/routes.stub")
                                    .value(),
                            8);
        }

        env.callMethod(
                this,
                "info",
                AuthMakeCommand.class,
                "Authentication scaffolding generated successfully.");
        return null;
    }

    @ConvertedMethod
    protected Object createDirectories(RuntimeEnv env, Object... args) {
        Object directory = null;
        if (!function_is_dir
                .f
                .env(env)
                .call(directory = resource_path.f.env(env).call("views/layouts").value())
                .getBool()) {
            NamespaceGlobal.mkdir.env(env).call(directory, 493, true);
        }

        if (!function_is_dir
                .f
                .env(env)
                .call(directory = resource_path.f.env(env).call("views/auth/passwords").value())
                .getBool()) {
            NamespaceGlobal.mkdir.env(env).call(directory, 493, true);
        }

        return null;
    }

    @ConvertedMethod
    protected Object exportViews(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object view = null;
        Object value = null;
        Object key = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult195 : ZVal.getIterable(this.views, env, false)) {
            key = ZVal.assign(zpairResult195.getKey());
            value = ZVal.assign(zpairResult195.getValue());
            if (ZVal.toBool(
                            function_file_exists
                                    .f
                                    .env(env)
                                    .call(
                                            view =
                                                    resource_path
                                                            .f
                                                            .env(env)
                                                            .call("views/" + toStringR(value, env))
                                                            .value())
                                    .value())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            this, "option", AuthMakeCommand.class, "force")))) {
                if (!ZVal.isTrue(
                        env.callMethod(
                                this,
                                "confirm",
                                AuthMakeCommand.class,
                                "The ["
                                        + toStringR(value, env)
                                        + "] view already exists. Do you want to replace it?"))) {
                    continue;
                }
            }

            NamespaceGlobal.copy
                    .env(env)
                    .call(
                            toStringR(
                                            env.addRootFilesystemPrefix(
                                                    "/vendor/laravel/framework/src/Illuminate/Auth/Console"),
                                            env)
                                    + "/stubs/make/views/"
                                    + toStringR(key, env),
                            view);
        }

        return null;
    }

    @ConvertedMethod
    protected Object compileControllerStub(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "{{namespace}}",
                                this.getAppNamespace(env),
                                function_file_get_contents
                                        .f
                                        .env(env)
                                        .call(
                                                toStringR(
                                                                env.addRootFilesystemPrefix(
                                                                        "/vendor/laravel/framework/src/Illuminate/Auth/Console"),
                                                                env)
                                                        + "/stubs/make/controllers/HomeController.stub")
                                        .value())
                        .value());
    }

    @ConvertedMethod
    protected Object getAppNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        Container.runtimeStaticObject.getInstance(env),
                        "getNamespace",
                        AuthMakeCommand.class));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Console\\AuthMakeCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Auth\\Console\\AuthMakeCommand")
                    .setLookup(
                            AuthMakeCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap",
                            "views")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Auth/Console/AuthMakeCommand.php")
                    .addTrait("Illuminate\\Console\\DetectsApplicationNamespace")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
