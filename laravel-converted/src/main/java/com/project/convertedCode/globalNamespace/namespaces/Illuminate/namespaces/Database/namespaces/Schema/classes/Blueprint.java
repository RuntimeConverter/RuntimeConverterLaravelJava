package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Schema.classes.Builder;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Fluent;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.SQLiteConnection;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php

*/

public class Blueprint extends RuntimeClassBase {

    public Object table = null;

    public Object columns = ZVal.newArray();

    public Object commands = ZVal.newArray();

    public Object engine = null;

    public Object charset = null;

    public Object collation = null;

    public Object temporary = false;

    public Blueprint(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Blueprint.class) {
            this.__construct(env, args);
        }
    }

    public Blueprint(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        this.table = table;
        if (!function_is_null.f.env(env).call(callback).getBool()) {
            env.callFunctionDynamic(
                    callback,
                    new RuntimeArgsWithReferences().add(0, new ReadOnlyReferenceContainer(this)),
                    this);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    @ConvertedParameter(
        index = 1,
        name = "grammar",
        typeHint = "Illuminate\\Database\\Schema\\Grammars\\Grammar"
    )
    public Object build(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        Object grammar = assignParameter(args, 1, false);
        Object statement = null;
        for (ZPair zpairResult358 :
                ZVal.getIterable(this.toSql(env, connection, grammar), env, true)) {
            statement = ZVal.assign(zpairResult358.getValue());
            env.callMethod(connection, "statement", Blueprint.class, statement);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    @ConvertedParameter(
        index = 1,
        name = "grammar",
        typeHint = "Illuminate\\Database\\Schema\\Grammars\\Grammar"
    )
    public Object toSql(RuntimeEnv env, Object... args) {
        ReferenceContainer connection =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object grammar = assignParameter(args, 1, false);
        Object method = null;
        Object statements = null;
        ReferenceContainer command = new BasicReferenceContainer(null);
        Object sql = null;
        this.addImpliedCommands(env, grammar);
        statements = ZVal.newArray();
        this.ensureCommandsAreValid(env, connection.getObject());
        for (ZPair zpairResult359 : ZVal.getIterable(this.commands, env, true)) {
            command.setObject(ZVal.assign(zpairResult359.getValue()));
            method =
                    "compile"
                            + toStringR(
                                    NamespaceGlobal.ucfirst
                                            .env(env)
                                            .call(
                                                    toObjectR(command.getObject())
                                                            .accessProp(this, env)
                                                            .name("name")
                                                            .value())
                                            .value(),
                                    env);
            if (function_method_exists.f.env(env).call(grammar, method).getBool()) {
                if (!function_is_null
                        .f
                        .env(env)
                        .call(
                                sql =
                                        env.callMethod(
                                                grammar,
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                new ReadOnlyReferenceContainer(
                                                                        this))
                                                        .add(1, command)
                                                        .add(2, connection),
                                                toStringR(method, env),
                                                Blueprint.class,
                                                this,
                                                command.getObject(),
                                                connection.getObject()))
                        .getBool()) {
                    statements =
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(statements, rToArrayCast(sql))
                                    .value();
                }
            }
        }

        return ZVal.assign(statements);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    protected Object ensureCommandsAreValid(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                connection,
                                SQLiteConnection.class,
                                "Illuminate\\Database\\SQLiteConnection"))
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                env.callMethod(
                                        this.commandsNamed(
                                                env,
                                                ZVal.arrayFromList("dropColumn", "renameColumn")),
                                        "count",
                                        Blueprint.class),
                                '>',
                                1))) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            "SQLite doesn't support multiple calls to dropColumn / renameColumn in a single modification."));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "names", typeHint = "array")
    protected Object commandsNamed(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
        Object names = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        collect.f.env(env).call(this.commands).value(),
                        "filter",
                        Blueprint.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Schema",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "command")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object command = assignParameter(args, 0, false);
                                Object names = null;
                                names = this.contextReferences.getCapturedValue("names");
                                return ZVal.assign(
                                        function_in_array
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(command)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value(),
                                                        names)
                                                .value());
                            }
                        }.use("names", names)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "grammar",
        typeHint = "Illuminate\\Database\\Schema\\Grammars\\Grammar"
    )
    protected Object addImpliedCommands(RuntimeEnv env, Object... args) {
        Object grammar = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count.f.env(env).call(this.getAddedColumns(env)).value(),
                                '>',
                                0))
                && ZVal.toBool(!ZVal.isTrue(this.creating(env)))) {
            function_array_unshift.f.env(env).call(this.commands, this.createCommand(env, "add"));
        }

        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count.f.env(env).call(this.getChangedColumns(env)).value(),
                                '>',
                                0))
                && ZVal.toBool(!ZVal.isTrue(this.creating(env)))) {
            function_array_unshift
                    .f
                    .env(env)
                    .call(this.commands, this.createCommand(env, "change"));
        }

        this.addFluentIndexes(env);
        this.addFluentCommands(env, grammar);
        return null;
    }

    @ConvertedMethod
    protected Object addFluentIndexes(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object column = null;
        Object index = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult360 : ZVal.getIterable(this.columns, env, true)) {
            column = ZVal.assign(zpairResult360.getValue());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult361 :
                    ZVal.getIterable(
                            ZVal.arrayFromList("primary", "unique", "index", "spatialIndex"),
                            env,
                            true)) {
                index = ZVal.assign(zpairResult361.getValue());
                if (ZVal.strictEqualityCheck(
                        toObjectR(column).accessProp(this, env).name(index).value(), "===", true)) {
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences()
                                    .add(0, new ReferenceClassProperty(column, "name", env)),
                            toStringR(index, env),
                            Blueprint.class,
                            toObjectR(column).accessProp(this, env).name("name").value());
                    runtimeConverterContinueCount = 2;
                    runtimeConverterContinueCount--;
                    continue;

                } else if (ZVal.isset(
                        toObjectR(column).accessProp(this, env).name(index).value())) {
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences()
                                    .add(0, new ReferenceClassProperty(column, "name", env))
                                    .add(1, new ReferenceClassProperty(column, index, env)),
                            toStringR(index, env),
                            Blueprint.class,
                            toObjectR(column).accessProp(this, env).name("name").value(),
                            toObjectR(column).accessProp(this, env).name(index).value());
                    runtimeConverterContinueCount = 2;
                    runtimeConverterContinueCount--;
                    continue;
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "grammar",
        typeHint = "Illuminate\\Database\\Schema\\Grammars\\Grammar"
    )
    public Object addFluentCommands(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope111 scope = new Scope111();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            int runtimeConverterContinueCount;
            scope.grammar = assignParameter(args, 0, false);
            scope.commandName = null;
            scope.column = null;
            scope.attributeName = null;
            scope.value = null;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult362 : ZVal.getIterable(this.columns, env, true)) {
                scope.column = ZVal.assign(zpairResult362.getValue());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult363 :
                        ZVal.getIterable(
                                env.callMethod(scope.grammar, "getFluentCommands", Blueprint.class),
                                env,
                                true)) {
                    scope.commandName = ZVal.assign(zpairResult363.getValue());
                    scope.attributeName =
                            NamespaceGlobal.lcfirst.env(env).call(scope.commandName).value();
                    if (!ZVal.isset(
                            toObjectR(scope.column)
                                    .accessProp(this, env)
                                    .name(scope.attributeName)
                                    .value())) {
                        continue;
                    }

                    scope.value =
                            ZVal.assign(
                                    toObjectR(scope.column)
                                            .accessProp(this, env)
                                            .name(scope.attributeName)
                                            .value());
                    this.addCommand(
                            env,
                            scope.commandName,
                            function_compact.f.env(env).call(stack, "value", "column").value());
                }
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    protected Object creating(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
        return ZVal.assign(
                env.callMethod(
                        collect.f.env(env).call(this.commands).value(),
                        new RuntimeArgsWithReferences(),
                        "contains",
                        Blueprint.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Schema",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "command")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object command = assignParameter(args, 0, false);
                                return ZVal.assign(
                                        ZVal.equalityCheck(
                                                toObjectR(command)
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value(),
                                                "create"));
                            }
                        }));
    }

    @ConvertedMethod
    public Object create(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.addCommand(env, "create"));
    }

    @ConvertedMethod
    public Object temporary(RuntimeEnv env, Object... args) {
        this.temporary = true;
        return null;
    }

    @ConvertedMethod
    public Object drop(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.addCommand(env, "drop"));
    }

    @ConvertedMethod
    public Object dropIfExists(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.addCommand(env, "dropIfExists"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    public Object dropColumn(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope112 scope = new Scope112();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.columns = assignParameter(args, 0, false);
            scope.columns =
                    ZVal.assign(
                            function_is_array.f.env(env).call(scope.columns).getBool()
                                    ? scope.columns
                                    : function_func_get_args
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call()
                                            .value());
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addCommand(
                                    env,
                                    "dropColumn",
                                    function_compact.f.env(env).call(stack, "columns").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    public Object renameColumn(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope113 scope = new Scope113();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.from = assignParameter(args, 0, false);
            scope.to = assignParameter(args, 1, false);
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addCommand(
                                    env,
                                    "renameColumn",
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "from", "to")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "index",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object dropPrimary(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, true);
        if (null == index) {
            index = ZVal.getNull();
        }
        return ZVal.assign(this.dropIndexCommand(env, "dropPrimary", "primary", index));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    public Object dropUnique(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        return ZVal.assign(this.dropIndexCommand(env, "dropUnique", "unique", index));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    public Object dropIndex(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        return ZVal.assign(this.dropIndexCommand(env, "dropIndex", "index", index));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    public Object dropSpatialIndex(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        return ZVal.assign(this.dropIndexCommand(env, "dropSpatialIndex", "spatialIndex", index));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    public Object dropForeign(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        return ZVal.assign(this.dropIndexCommand(env, "dropForeign", "foreign", index));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    public Object renameIndex(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope114 scope = new Scope114();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.from = assignParameter(args, 0, false);
            scope.to = assignParameter(args, 1, false);
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addCommand(
                                    env,
                                    "renameIndex",
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "from", "to")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    public Object dropTimestamps(RuntimeEnv env, Object... args) {
        this.dropColumn(env, "created_at", "updated_at");
        return null;
    }

    @ConvertedMethod
    public Object dropTimestampsTz(RuntimeEnv env, Object... args) {
        this.dropTimestamps(env);
        return null;
    }

    @ConvertedMethod
    public Object dropSoftDeletes(RuntimeEnv env, Object... args) {
        this.dropColumn(env, "deleted_at");
        return null;
    }

    @ConvertedMethod
    public Object dropSoftDeletesTz(RuntimeEnv env, Object... args) {
        this.dropSoftDeletes(env);
        return null;
    }

    @ConvertedMethod
    public Object dropRememberToken(RuntimeEnv env, Object... args) {
        this.dropColumn(env, "remember_token");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "indexName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object dropMorphs(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object indexName = assignParameter(args, 1, true);
        if (null == indexName) {
            indexName = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.dropIndex(
                env,
                ZVal.isTrue(ternaryExpressionTemp = indexName)
                        ? ternaryExpressionTemp
                        : this.createIndexName(
                                env,
                                "index",
                                ZVal.newArray(
                                        new ZPair(0, toStringR(name, env) + "_type"),
                                        new ZPair(1, toStringR(name, env) + "_id"))));
        this.dropColumn(env, toStringR(name, env) + "_type", toStringR(name, env) + "_id");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "to")
    public Object rename(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope115 scope = new Scope115();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.to = assignParameter(args, 0, false);
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addCommand(
                                    env,
                                    "rename",
                                    function_compact.f.env(env).call(stack, "to").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "algorithm",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object primary(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object algorithm = assignParameter(args, 2, true);
        if (null == algorithm) {
            algorithm = ZVal.getNull();
        }
        return ZVal.assign(this.indexCommand(env, "primary", columns, name, algorithm));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "algorithm",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object unique(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object algorithm = assignParameter(args, 2, true);
        if (null == algorithm) {
            algorithm = ZVal.getNull();
        }
        return ZVal.assign(this.indexCommand(env, "unique", columns, name, algorithm));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "algorithm",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object index(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object algorithm = assignParameter(args, 2, true);
        if (null == algorithm) {
            algorithm = ZVal.getNull();
        }
        return ZVal.assign(this.indexCommand(env, "index", columns, name, algorithm));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object spatialIndex(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.indexCommand(env, "spatialIndex", columns, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object foreign(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        return ZVal.assign(this.indexCommand(env, "foreign", columns, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object increments(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.unsignedInteger(env, column, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object tinyIncrements(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.unsignedTinyInteger(env, column, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object smallIncrements(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.unsignedSmallInteger(env, column, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object mediumIncrements(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.unsignedMediumInteger(env, column, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object bigIncrements(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.unsignedBigInteger(env, column, true));
    }

    @ConvertedMethod(name = "char")
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "length",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object _pChar(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope116 scope = new Scope116();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.length = assignParameter(args, 1, true);
            if (null == scope.length) {
                scope.length = ZVal.getNull();
            }
            scope.ternaryExpressionTemp = null;
            scope.length =
                    ZVal.assign(
                            ZVal.isTrue(scope.ternaryExpressionTemp = scope.length)
                                    ? scope.ternaryExpressionTemp
                                    : env.getRequestStaticProperties(
                                                    Builder.RequestStaticProperties.class)
                                            .defaultStringLength);
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "char",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "length").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "length",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object string(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope117 scope = new Scope117();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.length = assignParameter(args, 1, true);
            if (null == scope.length) {
                scope.length = ZVal.getNull();
            }
            scope.ternaryExpressionTemp = null;
            scope.length =
                    ZVal.assign(
                            ZVal.isTrue(scope.ternaryExpressionTemp = scope.length)
                                    ? scope.ternaryExpressionTemp
                                    : env.getRequestStaticProperties(
                                                    Builder.RequestStaticProperties.class)
                                            .defaultStringLength);
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "string",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "length").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object text(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "text", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object mediumText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "mediumText", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object longText(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "longText", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "unsigned",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object integer(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope118 scope = new Scope118();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.autoIncrement = assignParameter(args, 1, true);
            if (null == scope.autoIncrement) {
                scope.autoIncrement = false;
            }
            scope.unsigned = assignParameter(args, 2, true);
            if (null == scope.unsigned) {
                scope.unsigned = false;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "integer",
                                    scope.column,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "autoIncrement", "unsigned")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "unsigned",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object tinyInteger(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope119 scope = new Scope119();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.autoIncrement = assignParameter(args, 1, true);
            if (null == scope.autoIncrement) {
                scope.autoIncrement = false;
            }
            scope.unsigned = assignParameter(args, 2, true);
            if (null == scope.unsigned) {
                scope.unsigned = false;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "tinyInteger",
                                    scope.column,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "autoIncrement", "unsigned")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "unsigned",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object smallInteger(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope120 scope = new Scope120();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.autoIncrement = assignParameter(args, 1, true);
            if (null == scope.autoIncrement) {
                scope.autoIncrement = false;
            }
            scope.unsigned = assignParameter(args, 2, true);
            if (null == scope.unsigned) {
                scope.unsigned = false;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "smallInteger",
                                    scope.column,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "autoIncrement", "unsigned")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "unsigned",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object mediumInteger(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope121 scope = new Scope121();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.autoIncrement = assignParameter(args, 1, true);
            if (null == scope.autoIncrement) {
                scope.autoIncrement = false;
            }
            scope.unsigned = assignParameter(args, 2, true);
            if (null == scope.unsigned) {
                scope.unsigned = false;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "mediumInteger",
                                    scope.column,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "autoIncrement", "unsigned")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "unsigned",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object bigInteger(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope122 scope = new Scope122();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.autoIncrement = assignParameter(args, 1, true);
            if (null == scope.autoIncrement) {
                scope.autoIncrement = false;
            }
            scope.unsigned = assignParameter(args, 2, true);
            if (null == scope.unsigned) {
                scope.unsigned = false;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "bigInteger",
                                    scope.column,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "autoIncrement", "unsigned")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object unsignedInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object autoIncrement = assignParameter(args, 1, true);
        if (null == autoIncrement) {
            autoIncrement = false;
        }
        return ZVal.assign(this.integer(env, column, autoIncrement, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object unsignedTinyInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object autoIncrement = assignParameter(args, 1, true);
        if (null == autoIncrement) {
            autoIncrement = false;
        }
        return ZVal.assign(this.tinyInteger(env, column, autoIncrement, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object unsignedSmallInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object autoIncrement = assignParameter(args, 1, true);
        if (null == autoIncrement) {
            autoIncrement = false;
        }
        return ZVal.assign(this.smallInteger(env, column, autoIncrement, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object unsignedMediumInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object autoIncrement = assignParameter(args, 1, true);
        if (null == autoIncrement) {
            autoIncrement = false;
        }
        return ZVal.assign(this.mediumInteger(env, column, autoIncrement, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "autoIncrement",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object unsignedBigInteger(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object autoIncrement = assignParameter(args, 1, true);
        if (null == autoIncrement) {
            autoIncrement = false;
        }
        return ZVal.assign(this.bigInteger(env, column, autoIncrement, true));
    }

    @ConvertedMethod(name = "float")
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "total", defaultValue = "8", defaultValueType = "number")
    @ConvertedParameter(index = 2, name = "places", defaultValue = "2", defaultValueType = "number")
    public Object _pFloat(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope123 scope = new Scope123();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.total = assignParameter(args, 1, true);
            if (null == scope.total) {
                scope.total = 8;
            }
            scope.places = assignParameter(args, 2, true);
            if (null == scope.places) {
                scope.places = 2;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "float",
                                    scope.column,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "total", "places")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod(name = "double")
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "total",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "places",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object _pDouble(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope124 scope = new Scope124();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.total = assignParameter(args, 1, true);
            if (null == scope.total) {
                scope.total = ZVal.getNull();
            }
            scope.places = assignParameter(args, 2, true);
            if (null == scope.places) {
                scope.places = ZVal.getNull();
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "double",
                                    scope.column,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "total", "places")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "total", defaultValue = "8", defaultValueType = "number")
    @ConvertedParameter(index = 2, name = "places", defaultValue = "2", defaultValueType = "number")
    public Object decimal(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope125 scope = new Scope125();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.total = assignParameter(args, 1, true);
            if (null == scope.total) {
                scope.total = 8;
            }
            scope.places = assignParameter(args, 2, true);
            if (null == scope.places) {
                scope.places = 2;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "decimal",
                                    scope.column,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "total", "places")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "total", defaultValue = "8", defaultValueType = "number")
    @ConvertedParameter(index = 2, name = "places", defaultValue = "2", defaultValueType = "number")
    public Object unsignedDecimal(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object total = assignParameter(args, 1, true);
        if (null == total) {
            total = 8;
        }
        Object places = assignParameter(args, 2, true);
        if (null == places) {
            places = 2;
        }
        return ZVal.assign(
                this.addColumn(
                        env,
                        "decimal",
                        column,
                        ZVal.newArray(
                                new ZPair("total", total),
                                new ZPair("places", places),
                                new ZPair("unsigned", true))));
    }

    @ConvertedMethod(name = "boolean")
    @ConvertedParameter(index = 0, name = "column")
    public Object _pBoolean(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "boolean", column));
    }

    @ConvertedMethod(name = "enum")
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "allowed", typeHint = "array")
    public Object _pEnum(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope126 scope = new Scope126();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.allowed = assignParameter(args, 1, false);
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "enum",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "allowed").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object json(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "json", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object jsonb(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "jsonb", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object date(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "date", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object dateTime(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope127 scope = new Scope127();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.precision = assignParameter(args, 1, true);
            if (null == scope.precision) {
                scope.precision = 0;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "dateTime",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "precision").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object dateTimeTz(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope128 scope = new Scope128();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.precision = assignParameter(args, 1, true);
            if (null == scope.precision) {
                scope.precision = 0;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "dateTimeTz",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "precision").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object time(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope129 scope = new Scope129();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.precision = assignParameter(args, 1, true);
            if (null == scope.precision) {
                scope.precision = 0;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "time",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "precision").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object timeTz(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope130 scope = new Scope130();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.precision = assignParameter(args, 1, true);
            if (null == scope.precision) {
                scope.precision = 0;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "timeTz",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "precision").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object timestamp(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope131 scope = new Scope131();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.precision = assignParameter(args, 1, true);
            if (null == scope.precision) {
                scope.precision = 0;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "timestamp",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "precision").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object timestampTz(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope132 scope = new Scope132();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.precision = assignParameter(args, 1, true);
            if (null == scope.precision) {
                scope.precision = 0;
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "timestampTz",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "precision").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object timestamps(RuntimeEnv env, Object... args) {
        Object precision = assignParameter(args, 0, true);
        if (null == precision) {
            precision = 0;
        }
        env.callMethod(this.timestamp(env, "created_at", precision), "nullable", Blueprint.class);
        env.callMethod(this.timestamp(env, "updated_at", precision), "nullable", Blueprint.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object nullableTimestamps(RuntimeEnv env, Object... args) {
        Object precision = assignParameter(args, 0, true);
        if (null == precision) {
            precision = 0;
        }
        this.timestamps(env, precision);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object timestampsTz(RuntimeEnv env, Object... args) {
        Object precision = assignParameter(args, 0, true);
        if (null == precision) {
            precision = 0;
        }
        env.callMethod(this.timestampTz(env, "created_at", precision), "nullable", Blueprint.class);
        env.callMethod(this.timestampTz(env, "updated_at", precision), "nullable", Blueprint.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object softDeletes(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, true);
        if (null == column) {
            column = "deleted_at";
        }
        Object precision = assignParameter(args, 1, true);
        if (null == precision) {
            precision = 0;
        }
        return ZVal.assign(
                env.callMethod(
                        this.timestamp(env, column, precision), "nullable", Blueprint.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "precision",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object softDeletesTz(RuntimeEnv env, Object... args) {
        Object precision = assignParameter(args, 0, true);
        if (null == precision) {
            precision = 0;
        }
        return ZVal.assign(
                env.callMethod(
                        this.timestampTz(env, "deleted_at", precision),
                        "nullable",
                        Blueprint.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object year(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "year", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object binary(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "binary", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object uuid(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "uuid", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object ipAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "ipAddress", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object macAddress(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "macAddress", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object geometry(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "geometry", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "srid",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object point(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope133 scope = new Scope133();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.column = assignParameter(args, 0, false);
            scope.srid = assignParameter(args, 1, true);
            if (null == scope.srid) {
                scope.srid = ZVal.getNull();
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addColumn(
                                    env,
                                    "point",
                                    scope.column,
                                    function_compact.f.env(env).call(stack, "srid").value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object lineString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "linestring", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object polygon(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "polygon", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object geometryCollection(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "geometrycollection", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object multiPoint(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "multipoint", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object multiLineString(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "multilinestring", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object multiPolygon(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(this.addColumn(env, "multipolygon", column));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "indexName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object morphs(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object indexName = assignParameter(args, 1, true);
        if (null == indexName) {
            indexName = ZVal.getNull();
        }
        this.string(env, toStringR(name, env) + "_type");
        this.unsignedBigInteger(env, toStringR(name, env) + "_id");
        this.index(
                env,
                ZVal.newArray(
                        new ZPair(0, toStringR(name, env) + "_type"),
                        new ZPair(1, toStringR(name, env) + "_id")),
                indexName);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "indexName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object nullableMorphs(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object indexName = assignParameter(args, 1, true);
        if (null == indexName) {
            indexName = ZVal.getNull();
        }
        env.callMethod(
                this.string(env, toStringR(name, env) + "_type"), "nullable", Blueprint.class);
        env.callMethod(
                this.unsignedBigInteger(env, toStringR(name, env) + "_id"),
                "nullable",
                Blueprint.class);
        this.index(
                env,
                ZVal.newArray(
                        new ZPair(0, toStringR(name, env) + "_type"),
                        new ZPair(1, toStringR(name, env) + "_id")),
                indexName);
        return null;
    }

    @ConvertedMethod
    public Object rememberToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.string(env, "remember_token", 100), "nullable", Blueprint.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "columns")
    @ConvertedParameter(index = 2, name = "index")
    @ConvertedParameter(
        index = 3,
        name = "algorithm",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object indexCommand(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope134 scope = new Scope134();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.type = assignParameter(args, 0, false);
            scope.columns = assignParameter(args, 1, false);
            scope.index = assignParameter(args, 2, false);
            scope.algorithm = assignParameter(args, 3, true);
            if (null == scope.algorithm) {
                scope.algorithm = ZVal.getNull();
            }
            scope.ternaryExpressionTemp = null;
            scope.columns = ZVal.assign(rToArrayCast(scope.columns));
            scope.index =
                    ZVal.assign(
                            ZVal.isTrue(scope.ternaryExpressionTemp = scope.index)
                                    ? scope.ternaryExpressionTemp
                                    : this.createIndexName(env, scope.type, scope.columns));
            throw new IncludeEventException(
                    ZVal.assign(
                            this.addCommand(
                                    env,
                                    scope.type,
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "index", "columns", "algorithm")
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "index")
    protected Object dropIndexCommand(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object index = assignParameter(args, 2, false);
        Object columns = null;
        columns = ZVal.newArray();
        if (function_is_array.f.env(env).call(index).getBool()) {
            index = this.createIndexName(env, type, columns = ZVal.assign(index));
        }

        return ZVal.assign(this.indexCommand(env, command, columns, index));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "columns", typeHint = "array")
    protected Object createIndexName(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object columns = assignParameter(args, 1, false);
        Object index = null;
        index =
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(
                                toStringR(this.table, env)
                                        + "_"
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("_", columns)
                                                        .value(),
                                                env)
                                        + "_"
                                        + toStringR(type, env))
                        .value();
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("-", "."), "_", index)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object addColumn(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope135 scope = new Scope135();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.type = assignParameter(args, 0, false);
            scope.name = assignParameter(args, 1, false);
            scope.parameters = assignParameter(args, 2, true);
            if (null == scope.parameters) {
                scope.parameters = ZVal.newArray();
            }
            scope.column = null;
            new ReferenceClassProperty(scope._thisVarAlias, "columns", env)
                    .arrayAppend(env)
                    .set(
                            scope.column =
                                    new Fluent(
                                            env,
                                            function_array_merge
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_compact
                                                                    .f
                                                                    .env(env)
                                                                    .call(stack, "type", "name")
                                                                    .value(),
                                                            scope.parameters)
                                                    .value()));
            throw new IncludeEventException(ZVal.assign(scope.column));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object removeColumn(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
        Object name = assignParameter(args, 0, false);
        this.columns =
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                this.columns,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Database\\Schema",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "c")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        ReferenceContainer c =
                                                                new BasicReferenceContainer(
                                                                        assignParameter(
                                                                                args, 0, false));
                                                        Object name = null;
                                                        name =
                                                                this.contextReferences
                                                                        .getCapturedValue("name");
                                                        return ZVal.assign(
                                                                ZVal.notEqualityCheck(
                                                                        c.arrayGet(
                                                                                env,
                                                                                "attributes",
                                                                                "name"),
                                                                        name));
                                                    }
                                                }.use("name", name))
                                        .value())
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object addCommand(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object command = null;
        new ReferenceClassProperty(this, "commands", env)
                .arrayAppend(env)
                .set(command = this.createCommand(env, name, parameters));
        return ZVal.assign(command);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object createCommand(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope136 scope = new Scope136();
        stack.pushScope(scope);
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
            scope.name = assignParameter(args, 0, false);
            scope.parameters = assignParameter(args, 1, true);
            if (null == scope.parameters) {
                scope.parameters = ZVal.newArray();
            }
            throw new IncludeEventException(
                    ZVal.assign(
                            new Fluent(
                                    env,
                                    function_array_merge
                                            .f
                                            .env(env)
                                            .call(
                                                    function_compact
                                                            .f
                                                            .env(env)
                                                            .call(stack, "name")
                                                            .value(),
                                                    scope.parameters)
                                            .value())));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    public Object getTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.table);
    }

    @ConvertedMethod
    public Object getColumns(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.columns);
    }

    @ConvertedMethod
    public Object getCommands(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.commands);
    }

    @ConvertedMethod
    public Object getAddedColumns(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                this.columns,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "column")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object column = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                !toObjectR(column)
                                                        .accessProp(this, env)
                                                        .name("change")
                                                        .getBool());
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    public Object getChangedColumns(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Schema")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php");
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                this.columns,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Schema",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "column")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object column = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.toBool(
                                                        toObjectR(column)
                                                                .accessProp(this, env)
                                                                .name("change")
                                                                .value()));
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Blueprint.class)
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
                                                .namespaces
                                                .Schema
                                                .classes
                                                .Blueprint
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
                                            Blueprint.class,
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

    public static final Object CONST_class = "Illuminate\\Database\\Schema\\Blueprint";

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
                                    .namespaces
                                    .Schema
                                    .classes
                                    .Blueprint
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
                            Blueprint.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2307 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2307.getValue());
                env.callMethod(method, "setAccessible", Blueprint.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Blueprint.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Blueprint.class, mixin))
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
                                            .namespaces
                                            .Schema
                                            .classes
                                            .Blueprint
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Blueprint.class)
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
                                                    .namespaces
                                                    .Schema
                                                    .classes
                                                    .Blueprint
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
                                                                        .namespaces
                                                                        .Schema
                                                                        .classes
                                                                        .Blueprint
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
                                                            .namespaces
                                                            .Schema
                                                            .classes
                                                            .Blueprint
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
                    .setName("Illuminate\\Database\\Schema\\Blueprint")
                    .setLookup(
                            Blueprint.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "collation",
                            "columns",
                            "commands",
                            "engine",
                            "table",
                            "temporary")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Schema/Blueprint.php")
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

    private static class Scope111 implements UpdateRuntimeScopeInterface {

        Object commandName;
        Object grammar;
        Object column;
        Object _thisVarAlias;
        Object attributeName;
        Object value;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("commandName", this.commandName);
            stack.setVariable("grammar", this.grammar);
            stack.setVariable("column", this.column);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("attributeName", this.attributeName);
            stack.setVariable("value", this.value);
        }

        public void updateScope(RuntimeStack stack) {

            this.commandName = stack.getVariable("commandName");
            this.grammar = stack.getVariable("grammar");
            this.column = stack.getVariable("column");
            this._thisVarAlias = stack.getVariable("this");
            this.attributeName = stack.getVariable("attributeName");
            this.value = stack.getVariable("value");
        }
    }

    private static class Scope112 implements UpdateRuntimeScopeInterface {

        Object columns;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("columns", this.columns);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.columns = stack.getVariable("columns");
            this._thisVarAlias = stack.getVariable("this");
        }
    }

    private static class Scope113 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object from;
        Object to;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("from", this.from);
            stack.setVariable("to", this.to);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.from = stack.getVariable("from");
            this.to = stack.getVariable("to");
        }
    }

    private static class Scope114 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object from;
        Object to;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("from", this.from);
            stack.setVariable("to", this.to);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.from = stack.getVariable("from");
            this.to = stack.getVariable("to");
        }
    }

    private static class Scope115 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object to;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("to", this.to);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.to = stack.getVariable("to");
        }
    }

    private static class Scope116 implements UpdateRuntimeScopeInterface {

        Object length;
        Object _thisVarAlias;
        Object column;
        Object ternaryExpressionTemp;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("length", this.length);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
        }

        public void updateScope(RuntimeStack stack) {

            this.length = stack.getVariable("length");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
        }
    }

    private static class Scope117 implements UpdateRuntimeScopeInterface {

        Object length;
        Object _thisVarAlias;
        Object column;
        Object ternaryExpressionTemp;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("length", this.length);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
        }

        public void updateScope(RuntimeStack stack) {

            this.length = stack.getVariable("length");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
        }
    }

    private static class Scope118 implements UpdateRuntimeScopeInterface {

        Object autoIncrement;
        Object _thisVarAlias;
        Object column;
        Object unsigned;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("autoIncrement", this.autoIncrement);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("unsigned", this.unsigned);
        }

        public void updateScope(RuntimeStack stack) {

            this.autoIncrement = stack.getVariable("autoIncrement");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.unsigned = stack.getVariable("unsigned");
        }
    }

    private static class Scope119 implements UpdateRuntimeScopeInterface {

        Object autoIncrement;
        Object _thisVarAlias;
        Object column;
        Object unsigned;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("autoIncrement", this.autoIncrement);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("unsigned", this.unsigned);
        }

        public void updateScope(RuntimeStack stack) {

            this.autoIncrement = stack.getVariable("autoIncrement");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.unsigned = stack.getVariable("unsigned");
        }
    }

    private static class Scope120 implements UpdateRuntimeScopeInterface {

        Object autoIncrement;
        Object _thisVarAlias;
        Object column;
        Object unsigned;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("autoIncrement", this.autoIncrement);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("unsigned", this.unsigned);
        }

        public void updateScope(RuntimeStack stack) {

            this.autoIncrement = stack.getVariable("autoIncrement");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.unsigned = stack.getVariable("unsigned");
        }
    }

    private static class Scope121 implements UpdateRuntimeScopeInterface {

        Object autoIncrement;
        Object _thisVarAlias;
        Object column;
        Object unsigned;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("autoIncrement", this.autoIncrement);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("unsigned", this.unsigned);
        }

        public void updateScope(RuntimeStack stack) {

            this.autoIncrement = stack.getVariable("autoIncrement");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.unsigned = stack.getVariable("unsigned");
        }
    }

    private static class Scope122 implements UpdateRuntimeScopeInterface {

        Object autoIncrement;
        Object _thisVarAlias;
        Object column;
        Object unsigned;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("autoIncrement", this.autoIncrement);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("unsigned", this.unsigned);
        }

        public void updateScope(RuntimeStack stack) {

            this.autoIncrement = stack.getVariable("autoIncrement");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.unsigned = stack.getVariable("unsigned");
        }
    }

    private static class Scope123 implements UpdateRuntimeScopeInterface {

        Object total;
        Object places;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("total", this.total);
            stack.setVariable("places", this.places);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.total = stack.getVariable("total");
            this.places = stack.getVariable("places");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope124 implements UpdateRuntimeScopeInterface {

        Object total;
        Object places;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("total", this.total);
            stack.setVariable("places", this.places);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.total = stack.getVariable("total");
            this.places = stack.getVariable("places");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope125 implements UpdateRuntimeScopeInterface {

        Object total;
        Object places;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("total", this.total);
            stack.setVariable("places", this.places);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.total = stack.getVariable("total");
            this.places = stack.getVariable("places");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope126 implements UpdateRuntimeScopeInterface {

        Object allowed;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("allowed", this.allowed);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.allowed = stack.getVariable("allowed");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope127 implements UpdateRuntimeScopeInterface {

        Object precision;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("precision", this.precision);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.precision = stack.getVariable("precision");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope128 implements UpdateRuntimeScopeInterface {

        Object precision;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("precision", this.precision);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.precision = stack.getVariable("precision");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope129 implements UpdateRuntimeScopeInterface {

        Object precision;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("precision", this.precision);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.precision = stack.getVariable("precision");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope130 implements UpdateRuntimeScopeInterface {

        Object precision;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("precision", this.precision);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.precision = stack.getVariable("precision");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope131 implements UpdateRuntimeScopeInterface {

        Object precision;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("precision", this.precision);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.precision = stack.getVariable("precision");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope132 implements UpdateRuntimeScopeInterface {

        Object precision;
        Object _thisVarAlias;
        Object column;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("precision", this.precision);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
        }

        public void updateScope(RuntimeStack stack) {

            this.precision = stack.getVariable("precision");
            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
        }
    }

    private static class Scope133 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object column;
        Object srid;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("srid", this.srid);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.srid = stack.getVariable("srid");
        }
    }

    private static class Scope134 implements UpdateRuntimeScopeInterface {

        Object columns;
        Object _thisVarAlias;
        Object index;
        Object ternaryExpressionTemp;
        Object type;
        Object algorithm;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("columns", this.columns);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("index", this.index);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("type", this.type);
            stack.setVariable("algorithm", this.algorithm);
        }

        public void updateScope(RuntimeStack stack) {

            this.columns = stack.getVariable("columns");
            this._thisVarAlias = stack.getVariable("this");
            this.index = stack.getVariable("index");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.type = stack.getVariable("type");
            this.algorithm = stack.getVariable("algorithm");
        }
    }

    private static class Scope135 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object column;
        Object name;
        Object type;
        Object parameters;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("column", this.column);
            stack.setVariable("name", this.name);
            stack.setVariable("type", this.type);
            stack.setVariable("parameters", this.parameters);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.column = stack.getVariable("column");
            this.name = stack.getVariable("name");
            this.type = stack.getVariable("type");
            this.parameters = stack.getVariable("parameters");
        }
    }

    private static class Scope136 implements UpdateRuntimeScopeInterface {

        Object name;
        Object parameters;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("name", this.name);
            stack.setVariable("parameters", this.parameters);
        }

        public void updateScope(RuntimeStack stack) {

            this.name = stack.getVariable("name");
            this.parameters = stack.getVariable("parameters");
        }
    }
}
