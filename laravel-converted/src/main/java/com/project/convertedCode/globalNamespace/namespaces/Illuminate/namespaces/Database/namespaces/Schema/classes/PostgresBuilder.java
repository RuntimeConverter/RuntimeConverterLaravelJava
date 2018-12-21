package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.Builder;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.functions.head;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/PostgresBuilder.php

*/

public class PostgresBuilder extends Builder {

    public PostgresBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PostgresBuilder.class) {
            this.__construct(env, args);
        }
    }

    public PostgresBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object hasTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object schema = null;
        Object runtimeTempArrayResult52 = null;
        ZVal.list(
                runtimeTempArrayResult52 = this.parseSchemaAndTable(env, table),
                (schema = listGet(runtimeTempArrayResult52, 0, env)),
                (table = listGet(runtimeTempArrayResult52, 1, env)));
        table =
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("connection")
                                                .value(),
                                        "getTablePrefix",
                                        PostgresBuilder.class),
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
                                                PostgresBuilder.class,
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("grammar")
                                                                .value(),
                                                        "compileTableExists",
                                                        PostgresBuilder.class),
                                                ZVal.newArray(
                                                        new ZPair(0, schema), new ZPair(1, table))))
                                .value(),
                        '>',
                        0));
    }

    @ConvertedMethod
    public Object dropAllTables(RuntimeEnv env, Object... args) {
        ReferenceContainer tables = new BasicReferenceContainer(null);
        Object excludedTables = null;
        Object row = null;
        Object table = null;
        tables.setObject(ZVal.newArray());
        excludedTables = ZVal.arrayFromList("spatial_ref_sys");
        for (ZPair zpairResult372 : ZVal.getIterable(this.getAllTables(env), env, true)) {
            row = ZVal.assign(zpairResult372.getValue());
            row = ZVal.assign(rToArrayCast(row));
            table = function_reset.f.env(env).call(row).value();
            if (!function_in_array.f.env(env).call(table, excludedTables).getBool()) {
                tables.arrayAppend(env).set(table);
            }
        }

        if (ZVal.isEmpty(tables.getObject())) {
            return null;
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "statement",
                PostgresBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDropAllTables",
                        PostgresBuilder.class,
                        tables.getObject()));
        return null;
    }

    @ConvertedMethod
    public Object dropAllViews(RuntimeEnv env, Object... args) {
        Object row = null;
        ReferenceContainer views = new BasicReferenceContainer(null);
        views.setObject(ZVal.newArray());
        for (ZPair zpairResult373 : ZVal.getIterable(this.getAllViews(env), env, true)) {
            row = ZVal.assign(zpairResult373.getValue());
            row = ZVal.assign(rToArrayCast(row));
            views.arrayAppend(env).set(function_reset.f.env(env).call(row).value());
        }

        if (ZVal.isEmpty(views.getObject())) {
            return null;
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "statement",
                PostgresBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDropAllViews",
                        PostgresBuilder.class,
                        views.getObject()));
        return null;
    }

    @ConvertedMethod
    protected Object getAllTables(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("connection").value(),
                        "select",
                        PostgresBuilder.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("grammar").value(),
                                "compileGetAllTables",
                                PostgresBuilder.class,
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("connection")
                                                .value(),
                                        "getConfig",
                                        PostgresBuilder.class,
                                        "schema"))));
    }

    @ConvertedMethod
    protected Object getAllViews(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("connection").value(),
                        "select",
                        PostgresBuilder.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("grammar").value(),
                                "compileGetAllViews",
                                PostgresBuilder.class,
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("connection")
                                                .value(),
                                        "getConfig",
                                        PostgresBuilder.class,
                                        "schema"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object getColumnListing(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object schema = null;
        Object runtimeTempArrayResult53 = null;
        Object results = null;
        ZVal.list(
                runtimeTempArrayResult53 = this.parseSchemaAndTable(env, table),
                (schema = listGet(runtimeTempArrayResult53, 0, env)),
                (table = listGet(runtimeTempArrayResult53, 1, env)));
        table =
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("connection")
                                                .value(),
                                        "getTablePrefix",
                                        PostgresBuilder.class),
                                env)
                        + toStringR(table, env);
        results =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("connection").value(),
                        "select",
                        PostgresBuilder.class,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("grammar").value(),
                                "compileColumnListing",
                                PostgresBuilder.class),
                        ZVal.newArray(new ZPair(0, schema), new ZPair(1, table)));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("connection").value(),
                                "getPostProcessor",
                                PostgresBuilder.class),
                        "processColumnListing",
                        PostgresBuilder.class,
                        results));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    protected Object parseSchemaAndTable(RuntimeEnv env, Object... args) {
        ReferenceContainer table = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object schema = null;
        Object ternaryExpressionTemp = null;
        table.setObject(function_explode.f.env(env).call(".", table.getObject()).value());
        if (function_is_array
                .f
                .env(env)
                .call(
                        schema =
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("connection")
                                                .value(),
                                        "getConfig",
                                        PostgresBuilder.class,
                                        "schema"))
                .getBool()) {
            if (function_in_array.f.env(env).call(table.arrayGet(env, 0), schema).getBool()) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        function_array_shift
                                                .f
                                                .env(env)
                                                .call(table.getObject())
                                                .value()),
                                new ZPair(
                                        1,
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(".", table.getObject())
                                                .value())));
            }

            schema = head.f.env(env).call(schema).value();
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.isTrue(ternaryExpressionTemp = schema)
                                        ? ternaryExpressionTemp
                                        : "public"),
                        new ZPair(
                                1,
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(".", table.getObject())
                                        .value())));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\PostgresBuilder";

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
                    .setName("Illuminate\\Database\\Schema\\PostgresBuilder")
                    .setLookup(
                            PostgresBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "grammar", "resolver")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/PostgresBuilder.php")
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
