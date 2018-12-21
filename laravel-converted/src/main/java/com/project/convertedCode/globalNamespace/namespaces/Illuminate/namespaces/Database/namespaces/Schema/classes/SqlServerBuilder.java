package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.Builder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/SqlServerBuilder.php

*/

public class SqlServerBuilder extends Builder {

    public SqlServerBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SqlServerBuilder.class) {
            this.__construct(env, args);
        }
    }

    public SqlServerBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object dropAllTables(RuntimeEnv env, Object... args) {
        env.callMethod(this, "disableForeignKeyConstraints", SqlServerBuilder.class);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("connection").value(),
                "statement",
                SqlServerBuilder.class,
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("grammar").value(),
                        "compileDropAllTables",
                        SqlServerBuilder.class));
        env.callMethod(this, "enableForeignKeyConstraints", SqlServerBuilder.class);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\SqlServerBuilder";

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
                    .setName("Illuminate\\Database\\Schema\\SqlServerBuilder")
                    .setLookup(
                            SqlServerBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "grammar", "resolver")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/SqlServerBuilder.php")
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
