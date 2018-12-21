package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.namespaces.Rules.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/Rules/Exists.php

*/

public class Exists extends RuntimeClassBase {

    public Object table = null;

    public Object column = null;

    public Object wheres = ZVal.newArray();

    public Object using = ZVal.newArray();

    public Exists(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Exists.class) {
            this.__construct(env, args);
        }
    }

    public Exists(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_rtrim
                        .f
                        .env(env)
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "exists:%s,%s,%s",
                                                this.table, this.column, this.formatWheres(env))
                                        .value(),
                                ",")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(index = 1, name = "column")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, true);
        if (null == column) {
            column = "NULL";
        }
        this.table = table;
        this.column = column;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object where(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope155 scope = new Scope155();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Rules")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Validation/Rules/DatabaseRule.php");
            scope.column = assignParameter(args, 0, false);
            scope.value = assignParameter(args, 1, true);
            if (null == scope.value) {
                scope.value = ZVal.getNull();
            }
            if (function_is_array.f.env(env).call(scope.value).getBool()) {
                throw new IncludeEventException(
                        ZVal.assign(this.whereIn(env, scope.column, scope.value)));
            }

            if (ZVal.isTrue(ZVal.checkInstanceType(scope.column, Closure.class, "Closure"))) {
                throw new IncludeEventException(ZVal.assign(this.using(env, scope.column)));
            }

            new ReferenceClassProperty(scope._thisVarAlias, "wheres", env)
                    .arrayAppend(env)
                    .set(function_compact.f.env(env).call(stack, "column", "value").value());
            throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "value")
    public Object whereNot(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(this.whereNotIn(env, column, value));
        }

        return ZVal.assign(this.where(env, column, "!" + toStringR(value, env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object whereNull(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.where(env, column, "NULL"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object whereNotNull(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.where(env, column, "NOT_NULL"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object whereIn(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Rules")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Rules/DatabaseRule.php");
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(
                this.where(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Validation\\Rules",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object query = assignParameter(args, 0, false);
                                Object values = null;
                                Object column = null;
                                values = this.contextReferences.getCapturedValue("values");
                                column = this.contextReferences.getCapturedValue("column");
                                env.callMethod(query, "whereIn", Exists.class, column, values);
                                return null;
                            }
                        }.use("values", values).use("column", column)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values", typeHint = "array")
    public Object whereNotIn(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Rules")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Rules/DatabaseRule.php");
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(
                this.where(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Validation\\Rules",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "query")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object query = assignParameter(args, 0, false);
                                Object values = null;
                                Object column = null;
                                values = this.contextReferences.getCapturedValue("values");
                                column = this.contextReferences.getCapturedValue("column");
                                env.callMethod(query, "whereNotIn", Exists.class, column, values);
                                return null;
                            }
                        }.use("values", values).use("column", column)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object using(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "using", env).arrayAppend(env).set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object queryCallbacks(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.using);
    }

    @ConvertedMethod
    protected Object formatWheres(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Validation/Rules")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Validation/Rules/DatabaseRule.php");
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(this.wheres).value(),
                                "map",
                                Exists.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Validation\\Rules",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "where")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer where =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        return ZVal.assign(
                                                toStringR(where.arrayGet(env, "column"), env)
                                                        + ","
                                                        + toStringR(
                                                                where.arrayGet(env, "value"), env));
                                    }
                                }),
                        "implode",
                        Exists.class,
                        ","));
    }

    public static final Object CONST_class = "Illuminate\\Validation\\Rules\\Exists";

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
                    .setName("Illuminate\\Validation\\Rules\\Exists")
                    .setLookup(
                            Exists.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("column", "table", "using", "wheres")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/Rules/Exists.php")
                    .addTrait("Illuminate\\Validation\\Rules\\DatabaseRule")
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

    private static class Scope155 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object column;
        Object value;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("value", this.value);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.value = stack.getVariable("value");
        }
    }
}
