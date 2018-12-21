package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Migrations.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.date.function_date;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Migrations/MigrationCreator.php

*/

public class MigrationCreator extends RuntimeClassBase {

    public Object files = null;

    public Object postCreate = ZVal.newArray();

    public MigrationCreator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MigrationCreator.class) {
            this.__construct(env, args);
        }
    }

    public MigrationCreator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        this.files = files;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(
        index = 2,
        name = "table",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "create",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, true);
        if (null == table) {
            table = ZVal.getNull();
        }
        Object create = assignParameter(args, 3, true);
        if (null == create) {
            create = false;
        }
        Object stub = null;
        this.ensureMigrationDoesntAlreadyExist(env, name);
        stub = this.getStub(env, table, create);
        env.callMethod(
                this.files,
                "put",
                MigrationCreator.class,
                path = this.getPath(env, name, path),
                this.populateStub(env, name, stub, table));
        this.firePostCreateHooks(env, table);
        return ZVal.assign(path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object ensureMigrationDoesntAlreadyExist(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object className = null;
        if (function_class_exists
                .f
                .env(env)
                .call(className = this.getClassName(env, name))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "A " + toStringR(className, env) + " class already exists."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "create")
    protected Object getStub(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object create = assignParameter(args, 1, false);
        Object stub = null;
        if (function_is_null.f.env(env).call(table).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this.files,
                            "get",
                            MigrationCreator.class,
                            toStringR(this.stubPath(env), env) + "/blank.stub"));
        }

        stub = ZVal.assign(ZVal.isTrue(create) ? "create.stub" : "update.stub");
        return ZVal.assign(
                env.callMethod(
                        this.files,
                        "get",
                        MigrationCreator.class,
                        toStringR(this.stubPath(env), env)
                                + toStringR("/" + toStringR(stub, env), env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "stub")
    @ConvertedParameter(index = 2, name = "table")
    protected Object populateStub(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object stub = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, false);
        stub =
                function_str_replace
                        .f
                        .env(env)
                        .call("DummyClass", this.getClassName(env, name), stub)
                        .value();
        if (!function_is_null.f.env(env).call(table).getBool()) {
            stub = function_str_replace.f.env(env).call("DummyTable", table, stub).value();
        }

        return ZVal.assign(stub);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getClassName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(Str.runtimeStaticObject.studly(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "path")
    protected Object getPath(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        return ZVal.assign(
                toStringR(path, env)
                        + "/"
                        + toStringR(this.getDatePrefix(env), env)
                        + "_"
                        + toStringR(name, env)
                        + ".php");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    protected Object firePostCreateHooks(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object callback = null;
        for (ZPair zpairResult335 : ZVal.getIterable(this.postCreate, env, true)) {
            callback = ZVal.assign(zpairResult335.getValue());
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(callback, table);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object afterCreate(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "postCreate", env).arrayAppend(env).set(callback);
        return null;
    }

    @ConvertedMethod
    protected Object getDatePrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_date.f.env(env).call("Y_m_d_His").value());
    }

    @ConvertedMethod
    public Object stubPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                                env.addRootFilesystemPrefix(
                                        "/vendor/laravel/framework/src/Illuminate/Database/Migrations"),
                                env)
                        + "/stubs");
    }

    @ConvertedMethod
    public Object getFilesystem(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.files);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Migrations\\MigrationCreator";

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
                    .setName("Illuminate\\Database\\Migrations\\MigrationCreator")
                    .setLookup(
                            MigrationCreator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("files", "postCreate")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Migrations/MigrationCreator.php")
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
