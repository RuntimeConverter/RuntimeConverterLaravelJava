package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Scope;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/SoftDeletingScope.php

*/

public class SoftDeletingScope extends RuntimeClassBase implements Scope {

    public Object extensions =
            ZVal.arrayFromList("Restore", "WithTrashed", "WithoutTrashed", "OnlyTrashed");

    public SoftDeletingScope(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SoftDeletingScope(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object builder = assignParameter(args, 0, false);
        Object model = assignParameter(args, 1, false);
        env.callMethod(
                builder,
                "whereNull",
                SoftDeletingScope.class,
                env.callMethod(model, "getQualifiedDeletedAtColumn", SoftDeletingScope.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    public Object extend(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/SoftDeletingScope.php");
        ReferenceContainer builder = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object extension = null;
        for (ZPair zpairResult334 : ZVal.getIterable(this.extensions, env, true)) {
            extension = ZVal.assign(zpairResult334.getValue());
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, builder),
                    toStringR("add" + toStringR(extension, env), env),
                    SoftDeletingScope.class,
                    builder.getObject());
        }

        env.callMethod(
                builder.getObject(),
                "onDelete",
                SoftDeletingScope.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "builder",
                        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object builder = assignParameter(args, 0, false);
                        Object column = null;
                        column = SoftDeletingScope.this.getDeletedAtColumn(env, builder);
                        return ZVal.assign(
                                env.callMethod(
                                        builder,
                                        "update",
                                        SoftDeletingScope.class,
                                        ZVal.newArray(
                                                new ZPair(
                                                        column,
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        builder,
                                                                        "getModel",
                                                                        SoftDeletingScope.class),
                                                                "freshTimestampString",
                                                                SoftDeletingScope.class)))));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object getDeletedAtColumn(RuntimeEnv env, Object... args) {
        Object builder = assignParameter(args, 0, false);
        if (ZVal.isGreaterThan(
                function_count
                        .f
                        .env(env)
                        .call(
                                rToArrayCast(
                                        toObjectR(
                                                        env.callMethod(
                                                                builder,
                                                                "getQuery",
                                                                SoftDeletingScope.class))
                                                .accessProp(this, env)
                                                .name("joins")
                                                .value()))
                        .value(),
                '>',
                0)) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(builder, "getModel", SoftDeletingScope.class),
                            "getQualifiedDeletedAtColumn",
                            SoftDeletingScope.class));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(builder, "getModel", SoftDeletingScope.class),
                        "getDeletedAtColumn",
                        SoftDeletingScope.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object addRestore(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/SoftDeletingScope.php");
        Object builder = assignParameter(args, 0, false);
        env.callMethod(
                builder,
                "macro",
                SoftDeletingScope.class,
                "restore",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "builder",
                        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object builder = assignParameter(args, 0, false);
                        env.callMethod(builder, "withTrashed", SoftDeletingScope.class);
                        return ZVal.assign(
                                env.callMethod(
                                        builder,
                                        "update",
                                        SoftDeletingScope.class,
                                        ZVal.newArray(
                                                new ZPair(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        builder,
                                                                        "getModel",
                                                                        SoftDeletingScope.class),
                                                                "getDeletedAtColumn",
                                                                SoftDeletingScope.class),
                                                        ZVal.getNull()))));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object addWithTrashed(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/SoftDeletingScope.php");
        Object builder = assignParameter(args, 0, false);
        env.callMethod(
                builder,
                "macro",
                SoftDeletingScope.class,
                "withTrashed",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "builder",
                        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
                    )
                    @ConvertedParameter(
                        index = 1,
                        name = "withTrashed",
                        defaultValue = "true",
                        defaultValueType = "constant"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object builder = assignParameter(args, 0, false);
                        Object withTrashed = assignParameter(args, 1, true);
                        if (null == withTrashed) {
                            withTrashed = true;
                        }
                        if (!ZVal.isTrue(withTrashed)) {
                            return ZVal.assign(
                                    env.callMethod(
                                            builder, "withoutTrashed", SoftDeletingScope.class));
                        }

                        return ZVal.assign(
                                env.callMethod(
                                        builder,
                                        "withoutGlobalScope",
                                        SoftDeletingScope.class,
                                        _closureThisVar));
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object addWithoutTrashed(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/SoftDeletingScope.php");
        Object builder = assignParameter(args, 0, false);
        env.callMethod(
                builder,
                "macro",
                SoftDeletingScope.class,
                "withoutTrashed",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "builder",
                        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object builder = assignParameter(args, 0, false);
                        Object model = null;
                        model = env.callMethod(builder, "getModel", SoftDeletingScope.class);
                        env.callMethod(
                                env.callMethod(
                                        builder,
                                        "withoutGlobalScope",
                                        SoftDeletingScope.class,
                                        _closureThisVar),
                                "whereNull",
                                SoftDeletingScope.class,
                                env.callMethod(
                                        model,
                                        "getQualifiedDeletedAtColumn",
                                        SoftDeletingScope.class));
                        return ZVal.assign(builder);
                    }
                });
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "builder",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object addOnlyTrashed(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/SoftDeletingScope.php");
        Object builder = assignParameter(args, 0, false);
        env.callMethod(
                builder,
                "macro",
                SoftDeletingScope.class,
                "onlyTrashed",
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "builder",
                        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object builder = assignParameter(args, 0, false);
                        Object model = null;
                        model = env.callMethod(builder, "getModel", SoftDeletingScope.class);
                        env.callMethod(
                                env.callMethod(
                                        builder,
                                        "withoutGlobalScope",
                                        SoftDeletingScope.class,
                                        _closureThisVar),
                                "whereNotNull",
                                SoftDeletingScope.class,
                                env.callMethod(
                                        model,
                                        "getQualifiedDeletedAtColumn",
                                        SoftDeletingScope.class));
                        return ZVal.assign(builder);
                    }
                });
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\SoftDeletingScope";

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
                    .setName("Illuminate\\Database\\Eloquent\\SoftDeletingScope")
                    .setLookup(
                            SoftDeletingScope.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("extensions")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/SoftDeletingScope.php")
                    .addInterface("Illuminate\\Database\\Eloquent\\Scope")
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
