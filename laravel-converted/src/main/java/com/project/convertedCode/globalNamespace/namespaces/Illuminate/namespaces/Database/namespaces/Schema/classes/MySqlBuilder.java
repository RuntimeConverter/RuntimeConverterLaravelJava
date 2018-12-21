package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.Builder;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/MySqlBuilder.php

*/

public class MySqlBuilder extends Builder {

    public MySqlBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MySqlBuilder.class) {
            this.__construct(env, args);
        }
    }

    public MySqlBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object hasTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        table =
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("connection")
                                                .value(),
                                        "getTablePrefix",
                                        MySqlBuilder.class),
                                env)
                        + toStringR(table, env);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        function_count
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("connection")
                                                        .value(),
                                                "select",
                                                MySqlBuilder.class,
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("grammar")
                                                                .value(),
                                                        "compileTableExists",
                                                        MySqlBuilder.class),
                                                ZVal.newArray(
                                                        new ZPair(
                                                                0,
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("connection")
                                                                                .value(),
                                                                        "getDatabaseName",
                                                                        MySqlBuilder.class)),
                                                        new ZPair(1, table))))
                                .value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object getColumnListing(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object results = null;
        table =
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("connection")
                                                .value(),
                                        "getTablePrefix",
                                        MySqlBuilder.class),
                                env)
                        + toStringR(table, env);
        results =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("connection").value(),
                        "select",
                        MySqlBuilder.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("grammar").value(),
                                "compileColumnListing",
                                MySqlBuilder.class),
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("connection")
                                                        .value(),
                                                "getDatabaseName",
                                                MySqlBuilder.class)),
                                new ZPair(1, table)));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("connection").value(),
                                "getPostProcessor",
                                MySqlBuilder.class),
                        "processColumnListing",
                        MySqlBuilder.class,
                        results));
    }

    @ConvertedMethod
    public Object dropAllTables(RuntimeEnv env, Object... args) {
        ReferenceContainer tables = new BasicReferenceContainer(null);
        Object row = null;
        tables.setObject(ZVal.newArray());
        for (ZPair zpairResult370 : ZVal.getIterable(this.getAllTables(env), env, true)) {
            row = ZVal.assign(zpairResult370.getValue());
            row = ZVal.assign(rToArrayCast(row));
            tables.arrayAppend(env).set(function_reset.f.env(env).call(row).value());
        }

        if (ZVal.isEmpty(tables.getObject())) {
            return null;
        }

        env.callMethod(this, "disableForeignKeyConstraints", MySqlBuilder.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "statement",
                MySqlBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDropAllTables",
                        MySqlBuilder.class,
                        tables.getObject()));
        env.callMethod(this, "enableForeignKeyConstraints", MySqlBuilder.class);
        return null;
    }

    @ConvertedMethod
    public Object dropAllViews(RuntimeEnv env, Object... args) {
        Object row = null;
        ReferenceContainer views = new BasicReferenceContainer(null);
        views.setObject(ZVal.newArray());
        for (ZPair zpairResult371 : ZVal.getIterable(this.getAllViews(env), env, true)) {
            row = ZVal.assign(zpairResult371.getValue());
            row = ZVal.assign(rToArrayCast(row));
            views.arrayAppend(env).set(function_reset.f.env(env).call(row).value());
        }

        if (ZVal.isEmpty(views.getObject())) {
            return null;
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "statement",
                MySqlBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDropAllViews",
                        MySqlBuilder.class,
                        views.getObject()));
        return null;
    }

    @ConvertedMethod
    protected Object getAllTables(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("connection").value(),
                        "select",
                        MySqlBuilder.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("grammar").value(),
                                "compileGetAllTables",
                                MySqlBuilder.class)));
    }

    @ConvertedMethod
    protected Object getAllViews(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("connection").value(),
                        "select",
                        MySqlBuilder.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("grammar").value(),
                                "compileGetAllViews",
                                MySqlBuilder.class)));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\MySqlBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Builder.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Schema\\MySqlBuilder")
                    .setLookup(
                            MySqlBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "grammar", "resolver")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/MySqlBuilder.php")
                    .addExtendsClass("Illuminate\\Database\\Schema\\Builder")
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
