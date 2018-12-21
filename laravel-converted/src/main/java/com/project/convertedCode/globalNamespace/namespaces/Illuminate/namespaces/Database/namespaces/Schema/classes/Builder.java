package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.Blueprint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/Builder.php

*/

public class Builder extends RuntimeClassBase {

    public Object connection = null;

    public Object grammar = null;

    public Object resolver = null;

    public Builder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Builder.class) {
            this.__construct(env, args);
        }
    }

    public Builder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.connection = connection;
        this.grammar = env.callMethod(connection, "getSchemaGrammar", Builder.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object hasTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        table =
                toStringR(env.callMethod(this.connection, "getTablePrefix", Builder.class), env)
                        + toStringR(table, env);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_count
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                this.connection,
                                                "select",
                                                Builder.class,
                                                env.callMethod(
                                                        this.grammar,
                                                        "compileTableExists",
                                                        Builder.class),
                                                ZVal.newArray(new ZPair(0, table))))
                                .value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "column")
    public Object hasColumn(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.strtolower.env(env).call(column).value(),
                                function_array_map
                                        .f
                                        .env(env)
                                        .call("strtolower", this.getColumnListing(env, table))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "columns", typeHint = "array")
    public Object hasColumns(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, false);
        Object tableColumns = null;
        Object column = null;
        tableColumns =
                function_array_map
                        .f
                        .env(env)
                        .call("strtolower", this.getColumnListing(env, table))
                        .value();
        for (ZPair zpairResult364 : ZVal.getIterable(columns, env, true)) {
            column = ZVal.assign(zpairResult364.getValue());
            if (!function_in_array
                    .f
                    .env(env)
                    .call(NamespaceGlobal.strtolower.env(env).call(column).value(), tableColumns)
                    .getBool()) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "column")
    public Object getColumnType(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        table =
                toStringR(env.callMethod(this.connection, "getTablePrefix", Builder.class), env)
                        + toStringR(table, env);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.connection,
                                        "getDoctrineColumn",
                                        Builder.class,
                                        table,
                                        column),
                                "getType",
                                Builder.class),
                        "getName",
                        Builder.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object getColumnListing(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object results = null;
        results =
                env.callMethod(
                        this.connection,
                        "select",
                        Builder.class,
                        env.callMethod(
                                this.grammar,
                                "compileColumnListing",
                                Builder.class,
                                toStringR(
                                                env.callMethod(
                                                        this.connection,
                                                        "getTablePrefix",
                                                        Builder.class),
                                                env)
                                        + toStringR(table, env)));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.connection, "getPostProcessor", Builder.class),
                        "processColumnListing",
                        Builder.class,
                        results));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object table(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        this.build(env, this.createBlueprint(env, table, callback));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object create(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Builder.php");
        Object table = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        this.build(
                env,
                tap.f
                        .env(env)
                        .call(
                                this.createBlueprint(env, table),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "blueprint")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer blueprint =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object callback = null;
                                        callback =
                                                this.contextReferences.getCapturedValue("callback");
                                        env.callMethod(
                                                blueprint.getObject(), "create", Builder.class);
                                        env.callFunctionDynamic(
                                                callback,
                                                new RuntimeArgsWithReferences().add(0, blueprint),
                                                blueprint.getObject());
                                        return null;
                                    }
                                }.use("callback", callback))
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object drop(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Builder.php");
        Object table = assignParameter(args, 0, false);
        this.build(
                env,
                tap.f
                        .env(env)
                        .call(
                                this.createBlueprint(env, table),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "blueprint")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object blueprint = assignParameter(args, 0, false);
                                        env.callMethod(blueprint, "drop", Builder.class);
                                        return null;
                                    }
                                })
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object dropIfExists(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Builder.php");
        Object table = assignParameter(args, 0, false);
        this.build(
                env,
                tap.f
                        .env(env)
                        .call(
                                this.createBlueprint(env, table),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "blueprint")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object blueprint = assignParameter(args, 0, false);
                                        env.callMethod(blueprint, "dropIfExists", Builder.class);
                                        return null;
                                    }
                                })
                        .value());
        return null;
    }

    @ConvertedMethod
    public Object dropAllTables(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env,
                new LogicException(
                        env, "This database driver does not support dropping all tables."));
    }

    @ConvertedMethod
    public Object dropAllViews(RuntimeEnv env, Object... args) {
        throw ZVal.getException(
                env,
                new LogicException(
                        env, "This database driver does not support dropping all views."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    public Object rename(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Builder.php");
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        this.build(
                env,
                tap.f
                        .env(env)
                        .call(
                                this.createBlueprint(env, from),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "blueprint")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object blueprint = assignParameter(args, 0, false);
                                        Object to = null;
                                        to = this.contextReferences.getCapturedValue("to");
                                        env.callMethod(blueprint, "rename", Builder.class, to);
                                        return null;
                                    }
                                }.use("to", to))
                        .value());
        return null;
    }

    @ConvertedMethod
    public Object enableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.connection,
                        "statement",
                        Builder.class,
                        env.callMethod(
                                this.grammar,
                                "compileEnableForeignKeyConstraints",
                                Builder.class)));
    }

    @ConvertedMethod
    public Object disableForeignKeyConstraints(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.connection,
                        "statement",
                        Builder.class,
                        env.callMethod(
                                this.grammar,
                                "compileDisableForeignKeyConstraints",
                                Builder.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "blueprint",
        typeHint = "Illuminate\\Database\\Schema\\Blueprint"
    )
    protected Object build(RuntimeEnv env, Object... args) {
        Object blueprint = assignParameter(args, 0, false);
        env.callMethod(blueprint, "build", Builder.class, this.connection, this.grammar);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object createBlueprint(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (ZVal.isset(this.resolver)) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(this.resolver, table, callback)
                            .value());
        }

        return ZVal.assign(new Blueprint(env, table, callback));
    }

    @ConvertedMethod
    public Object getConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connection);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    public Object setConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.connection = connection;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resolver", typeHint = "Closure")
    public Object blueprintResolver(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        this.resolver = resolver;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\Builder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "length")
        public Object defaultStringLength(RuntimeEnv env, Object... args) {
            Object length = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Schema
                                            .classes
                                            .Builder
                                            .RequestStaticProperties
                                            .class)
                            .defaultStringLength =
                    length;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultStringLength = 255;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Schema\\Builder")
                    .setLookup(
                            Builder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "grammar", "resolver")
                    .setStaticPropertyNames("defaultStringLength")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Builder.php")
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
