package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
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
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Relation.php

*/

public abstract class Relation extends RuntimeClassBase {

    public Object query = null;

    public Object parent = null;

    public Object related = null;

    public Relation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Relation.class) {
            this.__construct(env, args);
        }
    }

    public Relation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "parent",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        this.query = query;
        this.parent = parent;
        this.related = env.callMethod(query, "getModel", Relation.class);
        env.callMethod(this, "addConstraints", Relation.class);
        return null;
    }

    @ConvertedMethod
    public Object getEager(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.get(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        return ZVal.assign(env.callMethod(this.query, "get", Relation.class, columns));
    }

    @ConvertedMethod
    public Object touch(RuntimeEnv env, Object... args) {
        Object model = null;
        model = this.getRelated(env);
        if (!ZVal.isTrue(
                StaticMethodUtils.getStaticBaseClass(model, env)
                        .callUnknownStaticMethod(env, "isIgnoringTouch"))) {
            this.rawUpdate(
                    env,
                    ZVal.newArray(
                            new ZPair(
                                    env.callMethod(model, "getUpdatedAtColumn", Relation.class),
                                    env.callMethod(
                                            model, "freshTimestampString", Relation.class))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object rawUpdate(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.query, "withoutGlobalScopes", Relation.class),
                        "update",
                        Relation.class,
                        attributes));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "parentQuery",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    public Object getRelationExistenceCountQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parentQuery = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.getRelationExistenceQuery(
                                env, query, parentQuery, new Expression(env, "count(*)")),
                        "setBindings",
                        Relation.class,
                        ZVal.newArray(),
                        "select"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "parentQuery",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 2,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object getRelationExistenceQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parentQuery = assignParameter(args, 1, false);
        Object columns = assignParameter(args, 2, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(query, "select", Relation.class, columns),
                        "whereColumn",
                        Relation.class,
                        this.getQualifiedParentKeyName(env),
                        "=",
                        env.callMethod(this, "getExistenceCompareKey", Relation.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object getKeys(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Relation.php");
        Object models = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        collect.f.env(env).call(models).value(),
                                                        "map",
                                                        Relation.class,
                                                        new Closure(
                                                                env,
                                                                runtimeConverterFunctionClassConstants,
                                                                "Illuminate\\Database\\Eloquent\\Relations",
                                                                this) {
                                                            @Override
                                                            @ConvertedMethod
                                                            @ConvertedParameter(
                                                                index = 0,
                                                                name = "value"
                                                            )
                                                            public Object run(
                                                                    RuntimeEnv env,
                                                                    Object thisvar,
                                                                    PassByReferenceArgs
                                                                            runtimePassByReferenceArgs,
                                                                    Object... args) {
                                                                Object value =
                                                                        assignParameter(
                                                                                args, 0, false);
                                                                Object key = null;
                                                                key =
                                                                        this.contextReferences
                                                                                .getCapturedValue(
                                                                                        "key");
                                                                return ZVal.assign(
                                                                        ZVal.isTrue(key)
                                                                                ? env.callMethod(
                                                                                        value,
                                                                                        "getAttribute",
                                                                                        Relation
                                                                                                .class,
                                                                                        key)
                                                                                : env.callMethod(
                                                                                        value,
                                                                                        "getKey",
                                                                                        Relation
                                                                                                .class));
                                                            }
                                                        }.use("key", key)),
                                                "values",
                                                Relation.class),
                                        "unique",
                                        Relation.class),
                                "sort",
                                Relation.class),
                        "all",
                        Relation.class));
    }

    @ConvertedMethod
    public Object getQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.query);
    }

    @ConvertedMethod
    public Object getBaseQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.query, "getQuery", Relation.class));
    }

    @ConvertedMethod
    public Object getParent(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.parent);
    }

    @ConvertedMethod
    public Object getQualifiedParentKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.parent, "getQualifiedKeyName", Relation.class));
    }

    @ConvertedMethod
    public Object getRelated(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.related);
    }

    @ConvertedMethod
    public Object createdAt(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.parent, "getCreatedAtColumn", Relation.class));
    }

    @ConvertedMethod
    public Object updatedAt(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.parent, "getUpdatedAtColumn", Relation.class));
    }

    @ConvertedMethod
    public Object relatedUpdatedAt(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.related, "getUpdatedAtColumn", Relation.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object result = null;
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Relation.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            return ZVal.assign(
                    env.callMethod(
                            this, "macroCall", Relation.class, method.getObject(), parameters));
        }

        result =
                env.callMethod(
                        this.query,
                        new RuntimeArgsWithReferences(),
                        toStringR(method.getObject(), env),
                        Relation.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters)));
        if (ZVal.strictEqualityCheck(result, "===", this.query)) {
            return ZVal.assign(this);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.query = ((RuntimeClassInterface) this.query).phpClone(env);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Relations\\Relation";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
        public Object noConstraints(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            Object previous = null;
            previous =
                    ZVal.assign(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Database
                                                    .namespaces
                                                    .Eloquent
                                                    .namespaces
                                                    .Relations
                                                    .classes
                                                    .Relation
                                                    .RequestStaticProperties
                                                    .class)
                                    .constraints);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .namespaces
                                            .Relations
                                            .classes
                                            .Relation
                                            .RequestStaticProperties
                                            .class)
                            .constraints =
                    false;
            try {
                return ZVal.assign(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(callback)
                                .value());
            } catch (ConvertedException convertedException29) {

                throw convertedException29;
            } finally {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .namespaces
                                                .Eloquent
                                                .namespaces
                                                .Relations
                                                .classes
                                                .Relation
                                                .RequestStaticProperties
                                                .class)
                                .constraints =
                        previous;
            }
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "map",
            typeHint = "array",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "merge",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object morphMap(RuntimeEnv env, Object... args) {
            Object map = assignParameter(args, 0, true);
            if (null == map) {
                map = ZVal.getNull();
            }
            Object merge = assignParameter(args, 1, true);
            if (null == merge) {
                merge = true;
            }
            map =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Relation.class)
                            .method("buildMorphMapFromModels")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(map)
                            .value();
            if (function_is_array.f.env(env).call(map).getBool()) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .namespaces
                                                .Eloquent
                                                .namespaces
                                                .Relations
                                                .classes
                                                .Relation
                                                .RequestStaticProperties
                                                .class)
                                .morphMap =
                        ZVal.toBool(merge)
                                        && ZVal.toBool(
                                                env.getRequestStaticProperties(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Database
                                                                        .namespaces
                                                                        .Eloquent
                                                                        .namespaces
                                                                        .Relations
                                                                        .classes
                                                                        .Relation
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .morphMap)
                                ? ZVal.add(
                                        map,
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Database
                                                                .namespaces
                                                                .Eloquent
                                                                .namespaces
                                                                .Relations
                                                                .classes
                                                                .Relation
                                                                .RequestStaticProperties
                                                                .class)
                                                .morphMap)
                                : map;
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .namespaces
                                            .Relations
                                            .classes
                                            .Relation
                                            .RequestStaticProperties
                                            .class)
                            .morphMap);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "models",
            typeHint = "array",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        protected Object buildMorphMapFromModels(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Relation.php");
            Object models = assignParameter(args, 0, true);
            if (null == models) {
                models = ZVal.getNull();
            }
            if (ZVal.toBool(function_is_null.f.env(env).call(models).value())
                    || ZVal.toBool(Arr.runtimeStaticObject.isAssoc(env, models))) {
                return ZVal.assign(models);
            }

            return ZVal.assign(
                    function_array_combine
                            .f
                            .env(env)
                            .call(
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    new Closure(
                                                            env,
                                                            runtimeConverterFunctionClassConstants,
                                                            "Illuminate\\Database\\Eloquent\\Relations",
                                                            this) {
                                                        @Override
                                                        @ConvertedMethod
                                                        @ConvertedParameter(
                                                            index = 0,
                                                            name = "model"
                                                        )
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object model =
                                                                    assignParameter(args, 0, false);
                                                            return ZVal.assign(
                                                                    env.callMethod(
                                                                            env.createNew(model),
                                                                            "getTable",
                                                                            Relation.class));
                                                        }
                                                    },
                                                    models)
                                            .value(),
                                    models)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "alias")
        public Object getMorphedModel(RuntimeEnv env, Object... args) {
            Object alias = assignParameter(args, 0, false);
            Object ternaryExpressionTemp = null;
            return ZVal.assign(
                    ZVal.isDefined(
                                    ternaryExpressionTemp =
                                            env.getRequestStaticPropertiesReference(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Database
                                                                    .namespaces
                                                                    .Eloquent
                                                                    .namespaces
                                                                    .Relations
                                                                    .classes
                                                                    .Relation
                                                                    .RequestStaticProperties
                                                                    .class,
                                                            "morphMap")
                                                    .arrayGet(env, alias))
                            ? ternaryExpressionTemp
                            : ZVal.getNull());
        }

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
                                    .Eloquent
                                    .namespaces
                                    .Relations
                                    .classes
                                    .Relation
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
                            Relation.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2303 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2303.getValue());
                env.callMethod(method, "setAccessible", Relation.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Relation.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Relation.class, mixin))
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
                                            .Eloquent
                                            .namespaces
                                            .Relations
                                            .classes
                                            .Relation
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Relation.class)
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
                                                    .Eloquent
                                                    .namespaces
                                                    .Relations
                                                    .classes
                                                    .Relation
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
                                                                        .Eloquent
                                                                        .namespaces
                                                                        .Relations
                                                                        .classes
                                                                        .Relation
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
                                                            .Eloquent
                                                            .namespaces
                                                            .Relations
                                                            .classes
                                                            .Relation
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

        public Object constraints = true;

        public Object morphMap = ZVal.newArray();

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\Relation")
                    .setLookup(
                            Relation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parent", "query", "related")
                    .setStaticPropertyNames("constraints", "macros", "morphMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Relation.php")
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
