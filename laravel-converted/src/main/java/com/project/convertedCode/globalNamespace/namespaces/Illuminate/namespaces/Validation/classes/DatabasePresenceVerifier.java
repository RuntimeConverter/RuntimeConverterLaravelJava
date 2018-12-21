package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes.PresenceVerifierInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/DatabasePresenceVerifier.php

*/

public class DatabasePresenceVerifier extends RuntimeClassBase
        implements PresenceVerifierInterface {

    public Object db = null;

    public Object connection = null;

    public DatabasePresenceVerifier(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DatabasePresenceVerifier.class) {
            this.__construct(env, args);
        }
    }

    public DatabasePresenceVerifier(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "db",
        typeHint = "Illuminate\\Database\\ConnectionResolverInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object db = assignParameter(args, 0, false);
        this.db = db;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "collection")
    @ConvertedParameter(index = 1, name = "column")
    @ConvertedParameter(index = 2, name = "value")
    @ConvertedParameter(
        index = 3,
        name = "excludeId",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "idColumn",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "extra",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getCount(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        Object excludeId = assignParameter(args, 3, true);
        if (null == excludeId) {
            excludeId = ZVal.getNull();
        }
        Object idColumn = assignParameter(args, 4, true);
        if (null == idColumn) {
            idColumn = ZVal.getNull();
        }
        Object extra = assignParameter(args, 5, true);
        if (null == extra) {
            extra = ZVal.newArray();
        }
        Object query = null;
        Object ternaryExpressionTemp = null;
        query =
                env.callMethod(
                        this.table(env, collection),
                        "where",
                        DatabasePresenceVerifier.class,
                        column,
                        "=",
                        value);
        if (ZVal.toBool(!function_is_null.f.env(env).call(excludeId).getBool())
                && ZVal.toBool(ZVal.strictNotEqualityCheck(excludeId, "!==", "NULL"))) {
            env.callMethod(
                    query,
                    "where",
                    DatabasePresenceVerifier.class,
                    ZVal.isTrue(ternaryExpressionTemp = idColumn) ? ternaryExpressionTemp : "id",
                    "<>",
                    excludeId);
        }

        return ZVal.assign(
                env.callMethod(
                        this.addConditions(env, query, extra),
                        "count",
                        DatabasePresenceVerifier.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "collection")
    @ConvertedParameter(index = 1, name = "column")
    @ConvertedParameter(index = 2, name = "values", typeHint = "array")
    @ConvertedParameter(
        index = 3,
        name = "extra",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getMultiCount(RuntimeEnv env, Object... args) {
        Object collection = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        Object values = assignParameter(args, 2, false);
        Object extra = assignParameter(args, 3, true);
        if (null == extra) {
            extra = ZVal.newArray();
        }
        Object query = null;
        query =
                env.callMethod(
                        this.table(env, collection),
                        "whereIn",
                        DatabasePresenceVerifier.class,
                        column,
                        values);
        return ZVal.assign(
                env.callMethod(
                        this.addConditions(env, query, extra),
                        "count",
                        DatabasePresenceVerifier.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "conditions")
    protected Object addConditions(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/DatabasePresenceVerifier.php");
        Object query = assignParameter(args, 0, false);
        Object conditions = assignParameter(args, 1, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult619 : ZVal.getIterable(conditions, env, false)) {
            key = ZVal.assign(zpairResult619.getKey());
            value = ZVal.assign(zpairResult619.getValue());
            if (ZVal.isTrue(ZVal.checkInstanceType(value, Closure.class, "Closure"))) {
                env.callMethod(
                        query,
                        "where",
                        DatabasePresenceVerifier.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Validation",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer query =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object value = null;
                                value = this.contextReferences.getCapturedValue("value");
                                env.callFunctionDynamic(
                                        value,
                                        new RuntimeArgsWithReferences().add(0, query),
                                        query.getObject());
                                return null;
                            }
                        }.use("value", value));

            } else {
                this.addWhere(env, query, key, value);
            }
        }

        return ZVal.assign(query);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "extraValue")
    protected Object addWhere(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object extraValue = assignParameter(args, 2, false);
        if (ZVal.strictEqualityCheck(extraValue, "===", "NULL")) {
            env.callMethod(query, "whereNull", DatabasePresenceVerifier.class, key);

        } else if (ZVal.strictEqualityCheck(extraValue, "===", "NOT_NULL")) {
            env.callMethod(query, "whereNotNull", DatabasePresenceVerifier.class, key);

        } else if (ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, extraValue, "!"))) {
            env.callMethod(
                    query,
                    "where",
                    DatabasePresenceVerifier.class,
                    key,
                    "!=",
                    NamespaceGlobal.mb_substr.env(env).call(extraValue, 1).value());

        } else {
            env.callMethod(query, "where", DatabasePresenceVerifier.class, key, extraValue);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    protected Object table(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.db,
                                        "connection",
                                        DatabasePresenceVerifier.class,
                                        this.connection),
                                "table",
                                DatabasePresenceVerifier.class,
                                table),
                        "useWritePdo",
                        DatabasePresenceVerifier.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object setConnection(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.connection = connection;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Validation\\DatabasePresenceVerifier";

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
                    .setName("Illuminate\\Validation\\DatabasePresenceVerifier")
                    .setLookup(
                            DatabasePresenceVerifier.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "db")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/DatabasePresenceVerifier.php")
                    .addInterface("Illuminate\\Validation\\PresenceVerifierInterface")
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
