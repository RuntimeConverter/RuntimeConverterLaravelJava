package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.DatabaseManager;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.EntityResolver;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.QueueEntityResolver;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.ConnectionFactory;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Faker.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/DatabaseServiceProvider.php

*/

public class DatabaseServiceProvider extends ServiceProvider {

    public DatabaseServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        Model.runtimeStaticObject.setConnectionResolver(
                env, new ReferenceClassProperty(this, "app", env).arrayGet(env, "db"));
        Model.runtimeStaticObject.setEventDispatcher(
                env, new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"));
        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        Model.runtimeStaticObject.clearBootedModels(env);
        this.registerConnectionServices(env);
        this.registerEloquentFactory(env);
        this.registerQueueableEntityResolver(env);
        return null;
    }

    @ConvertedMethod
    protected Object registerConnectionServices(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/DatabaseServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                DatabaseServiceProvider.class,
                "db.factory",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(new ConnectionFactory(env, app));
                    }
                });
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                DatabaseServiceProvider.class,
                "db",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                new DatabaseManager(
                                        env, app.getObject(), app.arrayGet(env, "db.factory")));
                    }
                });
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "bind",
                DatabaseServiceProvider.class,
                "db.connection",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                env.callMethod(
                                        app.arrayGet(env, "db"),
                                        "connection",
                                        DatabaseServiceProvider.class));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerEloquentFactory(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/DatabaseServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                DatabaseServiceProvider.class,
                Generator.CONST_class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer app =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        return ZVal.assign(
                                com.project.convertedCode.globalNamespace.namespaces.Faker.classes
                                        .Factory.runtimeStaticObject.create(
                                        env,
                                        env.callMethod(
                                                app.arrayGet(env, "config"),
                                                "get",
                                                DatabaseServiceProvider.class,
                                                "app.faker_locale",
                                                "en_US")));
                    }
                });
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                DatabaseServiceProvider.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Database
                        .namespaces
                        .Eloquent
                        .classes
                        .Factory
                        .CONST_class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(
                                com.project.convertedCode.globalNamespace.namespaces.Illuminate
                                        .namespaces.Database.namespaces.Eloquent.classes.Factory
                                        .runtimeStaticObject.construct(
                                        env,
                                        env.callMethod(
                                                app,
                                                "make",
                                                DatabaseServiceProvider.class,
                                                Generator.CONST_class),
                                        env.callMethod(
                                                toObjectR(_closureThisVar)
                                                        .accessProp(this, env)
                                                        .name("app")
                                                        .value(),
                                                "databasePath",
                                                DatabaseServiceProvider.class,
                                                "factories")));
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object registerQueueableEntityResolver(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/DatabaseServiceProvider.php");
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("app").value(),
                "singleton",
                DatabaseServiceProvider.class,
                EntityResolver.CONST_class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Database", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(new QueueEntityResolver(env));
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\DatabaseServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ServiceProvider.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\DatabaseServiceProvider")
                    .setLookup(
                            DatabaseServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/DatabaseServiceProvider.php")
                    .addExtendsClass("Illuminate\\Support\\ServiceProvider")
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
