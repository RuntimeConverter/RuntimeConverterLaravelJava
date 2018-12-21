package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.Builder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/JoinClause.php

*/

public class JoinClause extends Builder {

    public Object type = null;

    public Object table = null;

    public Object parentQuery = null;

    public JoinClause(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JoinClause.class) {
            this.__construct(env, args);
        }
    }

    public JoinClause(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parentQuery",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "table")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parentQuery = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, false);
        this.type = type;
        this.table = table;
        this.parentQuery = parentQuery;
        super.__construct(
                env,
                env.callMethod(parentQuery, "getConnection", JoinClause.class),
                env.callMethod(parentQuery, "getGrammar", JoinClause.class),
                env.callMethod(parentQuery, "getProcessor", JoinClause.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "first")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "boolean")
    public Object on(RuntimeEnv env, Object... args) {
        Object first = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 2, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        Object _pBoolean = assignParameter(args, 3, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        if (ZVal.isTrue(ZVal.checkInstanceType(first, Closure.class, "Closure"))) {
            return ZVal.assign(
                    env.callMethod(this, "whereNested", JoinClause.class, first, _pBoolean));
        }

        return ZVal.assign(
                env.callMethod(
                        this, "whereColumn", JoinClause.class, first, operator, second, _pBoolean));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "first")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "second",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object orOn(RuntimeEnv env, Object... args) {
        Object first = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object second = assignParameter(args, 2, true);
        if (null == second) {
            second = ZVal.getNull();
        }
        return ZVal.assign(this.on(env, first, operator, second, "or"));
    }

    @ConvertedMethod
    public Object newQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.createNewWithLateStaticBindings(this, this.parentQuery, this.type, this.table));
    }

    @ConvertedMethod
    protected Object forSubQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.parentQuery, "newQuery", JoinClause.class));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Query\\JoinClause";

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
                    .setName("Illuminate\\Database\\Query\\JoinClause")
                    .setLookup(
                            JoinClause.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aggregate",
                            "bindings",
                            "columns",
                            "connection",
                            "distinct",
                            "from",
                            "grammar",
                            "groups",
                            "havings",
                            "joins",
                            "limit",
                            "lock",
                            "offset",
                            "operators",
                            "orders",
                            "parentQuery",
                            "processor",
                            "table",
                            "type",
                            "unionLimit",
                            "unionOffset",
                            "unionOrders",
                            "unions",
                            "useWritePdo",
                            "wheres")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/JoinClause.php")
                    .addExtendsClass("Illuminate\\Database\\Query\\Builder")
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
