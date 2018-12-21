package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.Expression;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Grammar.php

*/

public abstract class Grammar extends RuntimeClassBase {

    public Object tablePrefix = "";

    public Grammar(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Grammar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object wrapArray(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "wrap")), values)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object wrapTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.isExpression(env, table))) {
            return ZVal.assign(
                    this.wrap(env, toStringR(this.tablePrefix, env) + toStringR(table, env), true));
        }

        return ZVal.assign(this.getValue(env, table));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "prefixAlias",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object wrap(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object prefixAlias = assignParameter(args, 1, true);
        if (null == prefixAlias) {
            prefixAlias = false;
        }
        if (ZVal.isTrue(this.isExpression(env, value))) {
            return ZVal.assign(this.getValue(env, value));
        }

        if (ZVal.strictNotEqualityCheck(
                function_stripos.f.env(env).call(value, " as ").value(), "!==", false)) {
            return ZVal.assign(this.wrapAliasedValue(env, value, prefixAlias));
        }

        return ZVal.assign(
                this.wrapSegments(env, function_explode.f.env(env).call(".", value).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "prefixAlias",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object wrapAliasedValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object prefixAlias = assignParameter(args, 1, true);
        if (null == prefixAlias) {
            prefixAlias = false;
        }
        ReferenceContainer segments = new BasicReferenceContainer(null);
        segments.setObject(
                NamespaceGlobal.preg_split.env(env).call("/\\s+as\\s+/i", value).value());
        if (ZVal.isTrue(prefixAlias)) {
            segments.arrayAccess(env, 1)
                    .set(
                            toStringR(this.tablePrefix, env)
                                    + toStringR(segments.arrayGet(env, 1), env));
        }

        return ZVal.assign(
                toStringR(this.wrap(env, segments.arrayGet(env, 0)), env)
                        + " as "
                        + toStringR(this.wrapValue(env, segments.arrayGet(env, 1)), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segments")
    protected Object wrapSegments(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Database/Grammar.php");
        Object segments = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(segments).value(),
                                "map",
                                Grammar.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "segment")
                                    @ConvertedParameter(index = 1, name = "key")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object segment = assignParameter(args, 0, false);
                                        Object key = assignParameter(args, 1, false);
                                        Object segments = null;
                                        segments =
                                                this.contextReferences.getCapturedValue("segments");
                                        return ZVal.assign(
                                                ZVal.toBool(ZVal.equalityCheck(key, 0))
                                                                && ZVal.toBool(
                                                                        ZVal.isGreaterThan(
                                                                                function_count
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                segments)
                                                                                        .value(),
                                                                                '>',
                                                                                1))
                                                        ? Grammar.this.wrapTable(env, segment)
                                                        : Grammar.this.wrapValue(env, segment));
                                    }
                                }.use("segments", segments)),
                        "implode",
                        Grammar.class,
                        "."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object wrapValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(value, "!==", "*")) {
            return ZVal.assign(
                    "\""
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("\"", "\"\"", value)
                                            .value(),
                                    env)
                            + "\"");
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns", typeHint = "array")
    public Object columnize(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                ", ",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(0, this), new ZPair(1, "wrap")),
                                                columns)
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    public Object parameterize(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                ", ",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(0, this),
                                                        new ZPair(1, "parameter")),
                                                values)
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object parameter(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this.isExpression(env, value)) ? this.getValue(env, value) : "?");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object quoteString(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    ", ",
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.newArray(
                                                            new ZPair(0, this),
                                                            new ZPair(1, "quoteString")),
                                                    value)
                                            .value())
                            .value());
        }

        return ZVal.assign("'" + toStringR(value, env) + "'");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object isExpression(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.checkInstanceType(
                        value, Expression.class, "Illuminate\\Database\\Query\\Expression"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expression")
    public Object getValue(RuntimeEnv env, Object... args) {
        Object expression = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(expression, "getValue", Grammar.class));
    }

    @ConvertedMethod
    public Object getDateFormat(RuntimeEnv env, Object... args) {
        return "Y-m-d H:i:s";
    }

    @ConvertedMethod
    public Object getTablePrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tablePrefix);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object setTablePrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        this.tablePrefix = prefix;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Grammar.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method %s::%s does not exist.",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            method.getObject())
                                    .value()));
        }

        macro =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .classes
                                                .Grammar
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            Grammar.class,
                                            this,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class")),
                                    parameters)
                            .value());
        }

        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(macro, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Database\\Grammar";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Database
                                    .classes
                                    .Grammar
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            Grammar.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2304 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2304.getValue());
                env.callMethod(method, "setAccessible", Grammar.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Grammar.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Grammar.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .classes
                                            .Grammar
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Grammar.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Database
                                                    .classes
                                                    .Grammar
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Database
                                                                        .classes
                                                                        .Grammar
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Database
                                                            .classes
                                                            .Grammar
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Grammar")
                    .setLookup(
                            Grammar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("tablePrefix")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Database/Grammar.php")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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
