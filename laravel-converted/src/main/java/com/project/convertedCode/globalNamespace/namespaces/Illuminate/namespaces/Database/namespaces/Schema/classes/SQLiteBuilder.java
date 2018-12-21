package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.Builder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/SQLiteBuilder.php

*/

public class SQLiteBuilder extends Builder {

    public SQLiteBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SQLiteBuilder.class) {
            this.__construct(env, args);
        }
    }

    public SQLiteBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object dropAllTables(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("connection").value(),
                        "getDatabaseName",
                        SQLiteBuilder.class),
                "!==",
                ":memory:")) {
            return ZVal.assign(this.refreshDatabaseFile(env));
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "select",
                SQLiteBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileEnableWriteableSchema",
                        SQLiteBuilder.class));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "select",
                SQLiteBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDropAllTables",
                        SQLiteBuilder.class));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "select",
                SQLiteBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDisableWriteableSchema",
                        SQLiteBuilder.class));
        return null;
    }

    @ConvertedMethod
    public Object dropAllViews(RuntimeEnv env, Object... args) {
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "select",
                SQLiteBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileEnableWriteableSchema",
                        SQLiteBuilder.class));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "select",
                SQLiteBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDropAllViews",
                        SQLiteBuilder.class));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "select",
                SQLiteBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDisableWriteableSchema",
                        SQLiteBuilder.class));
        return null;
    }

    @ConvertedMethod
    public Object refreshDatabaseFile(RuntimeEnv env, Object... args) {
        NamespaceGlobal.file_put_contents
                .env(env)
                .call(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("connection").value(),
                                "getDatabaseName",
                                SQLiteBuilder.class),
                        "");
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\SQLiteBuilder";

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
                    .setName("Illuminate\\Database\\Schema\\SQLiteBuilder")
                    .setLookup(
                            SQLiteBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "grammar", "resolver")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/SQLiteBuilder.php")
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
