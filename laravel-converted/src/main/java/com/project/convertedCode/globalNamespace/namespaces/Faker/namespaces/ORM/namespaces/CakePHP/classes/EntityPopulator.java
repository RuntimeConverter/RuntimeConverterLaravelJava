package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.CakePHP.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_rand;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.CakePHP.classes.ColumnTypeGuesser;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/EntityPopulator.php

*/

public class EntityPopulator extends RuntimeClassBase {

    public Object _pClass = null;

    public Object connectionName = null;

    public Object columnFormatters = ZVal.newArray();

    public Object modifiers = ZVal.newArray();

    public EntityPopulator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EntityPopulator.class) {
            this.__construct(env, args);
        }
    }

    public EntityPopulator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        this._pClass = _pClass;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(toObjectR(this).accessProp(this, env).name(name).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        toObjectR(this).accessProp(this, env).name(name).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columnFormatters")
    public Object mergeColumnFormattersWith(RuntimeEnv env, Object... args) {
        Object columnFormatters = assignParameter(args, 0, false);
        this.columnFormatters =
                function_array_merge
                        .f
                        .env(env)
                        .call(this.columnFormatters, columnFormatters)
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "modifiers")
    public Object mergeModifiersWith(RuntimeEnv env, Object... args) {
        Object modifiers = assignParameter(args, 0, false);
        this.modifiers = function_array_merge.f.env(env).call(this.modifiers, modifiers).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "populator")
    public Object guessColumnFormatters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/EntityPopulator.php");
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object populator = assignParameter(args, 0, false);
        Object schema = null;
        Object formatter = null;
        ReferenceContainer formatters = new BasicReferenceContainer(null);
        Object isForeignKey = null;
        ReferenceContainer column = new BasicReferenceContainer(null);
        Object guessers = null;
        Object guesser = null;
        ReferenceContainer pk = new BasicReferenceContainer(null);
        Object _pClass = null;
        Object table = null;
        formatters.setObject(ZVal.newArray());
        _pClass = ZVal.assign(this._pClass);
        table = this.getTable(env, _pClass);
        schema = env.callMethod(table, "schema", EntityPopulator.class);
        pk.setObject(env.callMethod(schema, "primaryKey", EntityPopulator.class));
        guessers =
                ZVal.add(
                        env.callMethod(populator, "getGuessers", EntityPopulator.class),
                        ZVal.newArray(
                                new ZPair(
                                        "ColumnTypeGuesser",
                                        new ColumnTypeGuesser(
                                                env,
                                                env.callMethod(
                                                        populator,
                                                        "getGenerator",
                                                        EntityPopulator.class)))));
        isForeignKey =
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Faker\\ORM\\CakePHP", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "column")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object column = assignParameter(args, 0, false);
                        Object assoc = null;
                        Object table = null;
                        table = this.contextReferences.getCapturedValue("table");
                        for (ZPair zpairResult69 :
                                ZVal.getIterable(
                                        env.callMethod(
                                                env.callMethod(
                                                        table,
                                                        "associations",
                                                        EntityPopulator.class),
                                                "type",
                                                EntityPopulator.class,
                                                "BelongsTo"),
                                        env,
                                        true)) {
                            assoc = ZVal.assign(zpairResult69.getValue());
                            if (ZVal.equalityCheck(
                                    column,
                                    env.callMethod(assoc, "foreignKey", EntityPopulator.class))) {
                                return ZVal.assign(true);
                            }
                        }

                        return ZVal.assign(false);
                    }
                }.use("table", table);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult70 :
                ZVal.getIterable(
                        env.callMethod(schema, "columns", EntityPopulator.class), env, true)) {
            column.setObject(ZVal.assign(zpairResult70.getValue()));
            if (ZVal.toBool(ZVal.equalityCheck(column.getObject(), pk.arrayGet(env, 0)))
                    || ZVal.toBool(
                            env.callFunctionDynamic(
                                            isForeignKey,
                                            new RuntimeArgsWithReferences().add(0, column),
                                            column.getObject())
                                    .value())) {
                continue;
            }

            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult71 : ZVal.getIterable(guessers, env, true)) {
                guesser = ZVal.assign(zpairResult71.getValue());
                if (ZVal.isTrue(
                        formatter =
                                env.callMethod(
                                        guesser,
                                        "guessFormat",
                                        EntityPopulator.class,
                                        column.getObject(),
                                        table))) {
                    formatters.arrayAccess(env, column.getObject()).set(formatter);
                    break;
                }
            }
        }

        return ZVal.assign(formatters.getObject());
    }

    @ConvertedMethod
    public Object guessModifiers(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/EntityPopulator.php");
        Object assoc = null;
        ReferenceContainer modifiers = new BasicReferenceContainer(null);
        Object belongsTo = null;
        Object table = null;
        modifiers.setObject(ZVal.newArray());
        table = this.getTable(env, this._pClass);
        belongsTo =
                env.callMethod(
                        env.callMethod(table, "associations", EntityPopulator.class),
                        "type",
                        EntityPopulator.class,
                        "BelongsTo");
        for (ZPair zpairResult72 : ZVal.getIterable(belongsTo, env, true)) {
            assoc = ZVal.assign(zpairResult72.getValue());
            modifiers
                    .arrayAccess(
                            env,
                            "belongsTo"
                                    + toStringR(
                                            env.callMethod(assoc, "name", EntityPopulator.class),
                                            env))
                    .set(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Faker\\ORM\\CakePHP",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "data")
                                @ConvertedParameter(index = 1, name = "insertedEntities")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    ContextConstants runtimeConverterFunctionClassConstants =
                                            new ContextConstants()
                                                    .setDir(
                                                            "/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP")
                                                    .setFile(
                                                            "/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/EntityPopulator.php");
                                    Object _closureThisVar = this.getClosureThisVar();
                                    ReferenceContainer data =
                                            new BasicReferenceContainer(
                                                    assignParameter(args, 0, false));
                                    ReferenceContainer insertedEntities =
                                            new BasicReferenceContainer(
                                                    assignParameter(args, 1, false));
                                    ReferenceContainer foreignKeys =
                                            new BasicReferenceContainer(null);
                                    Object assoc = null;
                                    Object foreignModel = null;
                                    Object foreignKey = null;
                                    Object table = null;
                                    assoc = this.contextReferences.getCapturedValue("assoc");
                                    table = env.callMethod(assoc, "target", EntityPopulator.class);
                                    foreignModel =
                                            env.callMethod(table, "alias", EntityPopulator.class);
                                    foreignKeys.setObject(ZVal.newArray());
                                    if (!arrayActionR(
                                            ArrayAction.EMPTY,
                                            insertedEntities,
                                            env,
                                            foreignModel)) {
                                        foreignKeys.setObject(
                                                ZVal.assign(
                                                        insertedEntities.arrayGet(
                                                                env, foreignModel)));

                                    } else {
                                        foreignKeys.setObject(
                                                env.callMethod(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        env.callMethod(
                                                                                table,
                                                                                "find",
                                                                                EntityPopulator
                                                                                        .class,
                                                                                "all"),
                                                                        "select",
                                                                        EntityPopulator.class,
                                                                        ZVal.arrayFromList("id")),
                                                                "map",
                                                                EntityPopulator.class,
                                                                new Closure(
                                                                        env,
                                                                        runtimeConverterFunctionClassConstants,
                                                                        "Faker\\ORM\\CakePHP",
                                                                        this) {
                                                                    @Override
                                                                    @ConvertedMethod
                                                                    @ConvertedParameter(
                                                                        index = 0,
                                                                        name = "row"
                                                                    )
                                                                    public Object run(
                                                                            RuntimeEnv env,
                                                                            Object thisvar,
                                                                            PassByReferenceArgs
                                                                                    runtimePassByReferenceArgs,
                                                                            Object... args) {
                                                                        Object row =
                                                                                assignParameter(
                                                                                        args, 0,
                                                                                        false);
                                                                        return ZVal.assign(
                                                                                toObjectR(row)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name("id")
                                                                                        .value());
                                                                    }
                                                                }),
                                                        "toArray",
                                                        EntityPopulator.class));
                                    }

                                    if (ZVal.isEmpty(foreignKeys.getObject())) {
                                        throw ZVal.getException(
                                                env,
                                                new PHPException(
                                                        env,
                                                        function_sprintf
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "%s belongsTo %s, which seems empty at this point.",
                                                                        env.callMethod(
                                                                                EntityPopulator.this
                                                                                        .getTable(
                                                                                                env,
                                                                                                EntityPopulator
                                                                                                        .this
                                                                                                        ._pClass),
                                                                                "table",
                                                                                EntityPopulator
                                                                                        .class),
                                                                        env.callMethod(
                                                                                assoc,
                                                                                "table",
                                                                                EntityPopulator
                                                                                        .class))
                                                                .value()));
                                    }

                                    foreignKey =
                                            ZVal.assign(
                                                    foreignKeys.arrayGet(
                                                            env,
                                                            function_array_rand
                                                                    .f
                                                                    .env(env)
                                                                    .call(foreignKeys.getObject())
                                                                    .value()));
                                    data.arrayAccess(
                                                    env,
                                                    env.callMethod(
                                                            assoc,
                                                            "foreignKey",
                                                            EntityPopulator.class))
                                            .set(foreignKey);
                                    return ZVal.assign(data.getObject());
                                }
                            }.use("assoc", assoc));
        }

        return ZVal.assign(modifiers.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "insertedEntities")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object execute(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        ReferenceContainer insertedEntities =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object modifier = null;
        Object column = null;
        Object format = null;
        ReferenceContainer pk = new BasicReferenceContainer(null);
        ReferenceContainer table = new BasicReferenceContainer(null);
        ReferenceContainer entity = new BasicReferenceContainer(null);
        table.setObject(this.getTable(env, _pClass));
        entity.setObject(env.callMethod(table.getObject(), "newEntity", EntityPopulator.class));
        for (ZPair zpairResult73 : ZVal.getIterable(this.columnFormatters, env, false)) {
            column = ZVal.assign(zpairResult73.getKey());
            format = ZVal.assign(zpairResult73.getValue());
            if (!function_is_null.f.env(env).call(format).getBool()) {
                toObjectR(entity.getObject())
                        .accessProp(this, env)
                        .name(column)
                        .set(
                                function_is_callable.f.env(env).call(format).getBool()
                                        ? env.callFunctionDynamic(
                                                        format,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, insertedEntities)
                                                                .add(1, table),
                                                        insertedEntities.getObject(),
                                                        table.getObject())
                                                .value()
                                        : format);
            }
        }

        for (ZPair zpairResult74 : ZVal.getIterable(this.modifiers, env, true)) {
            modifier = ZVal.assign(zpairResult74.getValue());
            entity.setObject(
                    env.callFunctionDynamic(
                                    modifier,
                                    new RuntimeArgsWithReferences()
                                            .add(0, entity)
                                            .add(1, insertedEntities),
                                    entity.getObject(),
                                    insertedEntities.getObject())
                            .value());
        }

        if (!ZVal.isTrue(
                entity.setObject(
                        env.callMethod(
                                table.getObject(),
                                "save",
                                EntityPopulator.class,
                                entity.getObject(),
                                options)))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Failed saving " + toStringR(_pClass, env) + " record"));
        }

        pk.setObject(env.callMethod(table.getObject(), "primaryKey", EntityPopulator.class));
        if (function_is_string.f.env(env).call(pk.getObject()).getBool()) {
            return ZVal.assign(
                    toObjectR(entity.getObject())
                            .accessProp(this, env)
                            .name(pk.getObject())
                            .value());
        }

        return ZVal.assign(
                toObjectR(entity.getObject())
                        .accessProp(this, env)
                        .name(pk.arrayGet(env, 0))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.connectionName = name;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object getTable(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(null);
        options.setObject(ZVal.newArray());
        if (!ZVal.isEmpty(this.connectionName)) {
            options.arrayAccess(env, "connection").set(this.connectionName);
        }

        return ZVal.assign(
                StaticMethodUtils.getStaticBaseClass(
                                ZVal.resolveClassAlias(env, "TableRegistry"), env)
                        .callUnknownStaticMethod(
                                env,
                                "get",
                                new RuntimeArgsWithReferences(),
                                _pClass,
                                options.getObject()));
    }

    public static final Object CONST_class = "Faker\\ORM\\CakePHP\\EntityPopulator";

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
                    .setName("Faker\\ORM\\CakePHP\\EntityPopulator")
                    .setLookup(
                            EntityPopulator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("class", "columnFormatters", "connectionName", "modifiers")
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/EntityPopulator.php")
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
