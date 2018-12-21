package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Failed.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Failed.classes.FailedJobProviderInterface;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Failed/DatabaseFailedJobProvider.php

*/

public class DatabaseFailedJobProvider extends RuntimeClassBase
        implements FailedJobProviderInterface {

    public Object resolver = null;

    public Object database = null;

    public Object table = null;

    public DatabaseFailedJobProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabaseFailedJobProvider.class) {
            this.__construct(env, args);
        }
    }

    public DatabaseFailedJobProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "resolver",
        typeHint = "Illuminate\\Database\\ConnectionResolverInterface"
    )
    @ConvertedParameter(index = 1, name = "database")
    @ConvertedParameter(index = 2, name = "table")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object resolver = assignParameter(args, 0, false);
        Object database = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, false);
        this.table = table;
        this.resolver = resolver;
        this.database = database;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    @ConvertedParameter(index = 1, name = "queue")
    @ConvertedParameter(index = 2, name = "payload")
    @ConvertedParameter(index = 3, name = "exception")
    public Object log(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope152 scope = new Scope152();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Queue/Failed")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Queue/Failed/DatabaseFailedJobProvider.php");
            scope.connection = assignParameter(args, 0, false);
            scope.queue = assignParameter(args, 1, false);
            scope.payload = assignParameter(args, 2, false);
            scope.exception = assignParameter(args, 3, false);
            scope.failed_at = null;
            scope.failed_at = Carbon.runtimeStaticObject.now(env);
            scope.exception = ZVal.assign(toStringR(scope.exception, env));
            throw new IncludeEventException(
                    ZVal.assign(
                            env.callMethod(
                                    this.getTable(env),
                                    "insertGetId",
                                    DatabaseFailedJobProvider.class,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(
                                                    stack,
                                                    "connection",
                                                    "queue",
                                                    "payload",
                                                    "exception",
                                                    "failed_at")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.getTable(env),
                                        "orderBy",
                                        DatabaseFailedJobProvider.class,
                                        "id",
                                        "desc"),
                                "get",
                                DatabaseFailedJobProvider.class),
                        "all",
                        DatabaseFailedJobProvider.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object find(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.getTable(env), "find", DatabaseFailedJobProvider.class, id));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object forget(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isGreaterThan(
                        env.callMethod(
                                env.callMethod(
                                        this.getTable(env),
                                        "where",
                                        DatabaseFailedJobProvider.class,
                                        "id",
                                        id),
                                "delete",
                                DatabaseFailedJobProvider.class),
                        '>',
                        0));
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        env.callMethod(this.getTable(env), "delete", DatabaseFailedJobProvider.class);
        return null;
    }

    @ConvertedMethod
    protected Object getTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.resolver,
                                "connection",
                                DatabaseFailedJobProvider.class,
                                this.database),
                        "table",
                        DatabaseFailedJobProvider.class,
                        this.table));
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Failed\\DatabaseFailedJobProvider";

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
                    .setName("Illuminate\\Queue\\Failed\\DatabaseFailedJobProvider")
                    .setLookup(
                            DatabaseFailedJobProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("database", "resolver", "table")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Failed/DatabaseFailedJobProvider.php")
                    .addInterface("Illuminate\\Queue\\Failed\\FailedJobProviderInterface")
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

    private static class Scope152 implements UpdateRuntimeScopeInterface {

        Object exception;
        Object payload;
        Object _thisVarAlias;
        Object connection;
        Object failed_at;
        Object queue;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("exception", this.exception);
            stack.setVariable("payload", this.payload);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("connection", this.connection);
            stack.setVariable("failed_at", this.failed_at);
            stack.setVariable("queue", this.queue);
        }

        public void updateScope(RuntimeStack stack) {

            this.exception = stack.getVariable("exception");
            this.payload = stack.getVariable("payload");
            this._thisVarAlias = stack.getVariable("this");
            this.connection = stack.getVariable("connection");
            this.failed_at = stack.getVariable("failed_at");
            this.queue = stack.getVariable("queue");
        }
    }
}
