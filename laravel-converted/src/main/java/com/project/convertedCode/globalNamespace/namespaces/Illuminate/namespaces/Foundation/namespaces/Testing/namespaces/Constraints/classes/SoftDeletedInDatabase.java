package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Testing.namespaces.Constraints.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/Constraints/SoftDeletedInDatabase.php

*/

public class SoftDeletedInDatabase extends Constraint {

    public Object show = 3;

    public Object database = null;

    public Object data = null;

    public SoftDeletedInDatabase(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SoftDeletedInDatabase.class) {
            this.__construct(env, args);
        }
    }

    public SoftDeletedInDatabase(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "database", typeHint = "Illuminate\\Database\\Connection")
    @ConvertedParameter(index = 1, name = "data", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object database = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        this.data = data;
        this.database = database;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object matches(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        this.database,
                                                        "table",
                                                        SoftDeletedInDatabase.class,
                                                        table),
                                                "where",
                                                SoftDeletedInDatabase.class,
                                                this.data),
                                        "whereNotNull",
                                        SoftDeletedInDatabase.class,
                                        "deleted_at"),
                                "count",
                                SoftDeletedInDatabase.class),
                        '>',
                        0));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object failureDescription(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "any soft deleted row in the table [%s] matches the attributes %s.\n\n%s",
                                table, this.toString(env), this.getAdditionalInfo(env, table))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    protected Object getAdditionalInfo(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object description = null;
        Object results = null;
        results =
                env.callMethod(
                        env.callMethod(this.database, "table", SoftDeletedInDatabase.class, table),
                        "get",
                        SoftDeletedInDatabase.class);
        if (ZVal.isTrue(env.callMethod(results, "isEmpty", SoftDeletedInDatabase.class))) {
            return "The table is empty";
        }

        description =
                "Found: "
                        + toStringR(
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        results,
                                                        "take",
                                                        SoftDeletedInDatabase.class,
                                                        this.show),
                                                128)
                                        .value(),
                                env);
        if (ZVal.isGreaterThan(
                env.callMethod(results, "count", SoftDeletedInDatabase.class), '>', this.show)) {
            description =
                    toStringR(description, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " and %s others",
                                                    ZVal.subtract(
                                                            env.callMethod(
                                                                    results,
                                                                    "count",
                                                                    SoftDeletedInDatabase.class),
                                                            this.show))
                                            .value(),
                                    env);
        }

        return ZVal.assign(description);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(this.data).value());
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Testing\\Constraints\\SoftDeletedInDatabase";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Testing\\Constraints\\SoftDeletedInDatabase")
                    .setLookup(
                            SoftDeletedInDatabase.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("data", "database", "exporter", "show")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Testing/Constraints/SoftDeletedInDatabase.php")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
