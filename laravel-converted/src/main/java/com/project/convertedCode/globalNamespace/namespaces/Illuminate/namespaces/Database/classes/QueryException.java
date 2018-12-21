package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDOException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/QueryException.php

*/

public class QueryException extends PDOException {

    public Object sql = null;

    public Object bindings = null;

    public QueryException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == QueryException.class) {
            this.__construct(env, args);
        }
    }

    public QueryException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(index = 1, name = "bindings", typeHint = "array")
    @ConvertedParameter(index = 2, name = "previous")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, false);
        Object previous = assignParameter(args, 2, false);
        super.__construct(env, "", 0, previous);
        this.sql = sql;
        this.bindings = bindings;
        toObjectR(this)
                .accessProp(this, env)
                .name("code")
                .set(env.callMethod(previous, "getCode", QueryException.class));
        toObjectR(this)
                .accessProp(this, env)
                .name("message")
                .set(this.formatMessage(env, sql, bindings, previous));
        if (ZVal.isTrue(ZVal.checkInstanceType(previous, PDOException.class, "PDOException"))) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("errorInfo")
                    .set(toObjectR(previous).accessProp(this, env).name("errorInfo").value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sql")
    @ConvertedParameter(index = 1, name = "bindings")
    @ConvertedParameter(index = 2, name = "previous")
    protected Object formatMessage(RuntimeEnv env, Object... args) {
        Object sql = assignParameter(args, 0, false);
        Object bindings = assignParameter(args, 1, false);
        Object previous = assignParameter(args, 2, false);
        return ZVal.assign(
                toStringR(env.callMethod(previous, "getMessage", QueryException.class), env)
                        + " (SQL: "
                        + toStringR(
                                Str.runtimeStaticObject.replaceArray(env, "?", bindings, sql), env)
                        + ")");
    }

    @ConvertedMethod
    public Object getSql(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.sql);
    }

    @ConvertedMethod
    public Object getBindings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bindings);
    }

    public static final Object CONST_class = "Illuminate\\Database\\QueryException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PDOException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\QueryException")
                    .setLookup(
                            QueryException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bindings", "sql")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/QueryException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("PDOException")
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
