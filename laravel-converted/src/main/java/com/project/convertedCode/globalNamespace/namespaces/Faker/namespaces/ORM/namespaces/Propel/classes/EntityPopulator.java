package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Propel.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Propel.classes.ColumnTypeGuesser;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Guesser.classes.Name;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Propel/EntityPopulator.php

*/

public class EntityPopulator extends RuntimeClassBase {

    public Object _pClass = null;

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
    public Object getClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pClass);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columnFormatters")
    public Object setColumnFormatters(RuntimeEnv env, Object... args) {
        Object columnFormatters = assignParameter(args, 0, false);
        this.columnFormatters = columnFormatters;
        return null;
    }

    @ConvertedMethod
    public Object getColumnFormatters(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.columnFormatters);
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
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Faker\\Generator")
    public Object guessColumnFormatters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Propel")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/Propel/EntityPopulator.php");
        int runtimeConverterContinueCount;
        Object generator = assignParameter(args, 0, false);
        Object nameGuesser = null;
        Object formatter = null;
        Object peerClass = null;
        ReferenceContainer formatters = new BasicReferenceContainer(null);
        Object columnMap = null;
        Object relatedClass = null;
        Object _pClass = null;
        Object tableMap = null;
        Object columnTypeGuesser = null;
        formatters.setObject(ZVal.newArray());
        _pClass = ZVal.assign(this._pClass);
        peerClass = ZVal.assign(ClassConstantUtils.getConstantValueByClass(env, _pClass, "PEER"));
        tableMap =
                StaticMethodUtils.getStaticBaseClass(peerClass, env)
                        .callUnknownStaticMethod(env, "getTableMap");
        nameGuesser = new Name(env, generator);
        columnTypeGuesser = new ColumnTypeGuesser(env, generator);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult88 :
                ZVal.getIterable(
                        env.callMethod(tableMap, "getColumns", EntityPopulator.class), env, true)) {
            columnMap = ZVal.assign(zpairResult88.getValue());
            if (ZVal.isTrue(this.isColumnBehavior(env, columnMap))) {
                continue;
            }

            if (ZVal.isTrue(env.callMethod(columnMap, "isForeignKey", EntityPopulator.class))) {
                relatedClass =
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                columnMap, "getRelation", EntityPopulator.class),
                                        "getForeignTable",
                                        EntityPopulator.class),
                                "getClassname",
                                EntityPopulator.class);
                formatters
                        .arrayAccess(
                                env, env.callMethod(columnMap, "getPhpName", EntityPopulator.class))
                        .set(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Faker\\ORM\\Propel",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "inserted")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer inserted =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object relatedClass = null;
                                        relatedClass =
                                                this.contextReferences.getCapturedValue(
                                                        "relatedClass");
                                        return ZVal.assign(
                                                arrayActionR(
                                                                ArrayAction.ISSET,
                                                                inserted,
                                                                env,
                                                                relatedClass)
                                                        ? inserted.arrayGet(
                                                                env,
                                                                relatedClass,
                                                                NamespaceGlobal.mt_rand
                                                                        .env(env)
                                                                        .call(
                                                                                0,
                                                                                ZVal.subtract(
                                                                                        function_count
                                                                                                .f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        inserted
                                                                                                                .arrayGet(
                                                                                                                        env,
                                                                                                                        relatedClass))
                                                                                                .value(),
                                                                                        1))
                                                                        .value())
                                                        : ZVal.getNull());
                                    }
                                }.use("relatedClass", relatedClass));
                continue;
            }

            if (ZVal.isTrue(env.callMethod(columnMap, "isPrimaryKey", EntityPopulator.class))) {
                continue;
            }

            if (ZVal.isTrue(
                    formatter =
                            env.callMethod(
                                    nameGuesser,
                                    "guessFormat",
                                    EntityPopulator.class,
                                    env.callMethod(columnMap, "getPhpName", EntityPopulator.class),
                                    env.callMethod(columnMap, "getSize", EntityPopulator.class)))) {
                formatters
                        .arrayAccess(
                                env, env.callMethod(columnMap, "getPhpName", EntityPopulator.class))
                        .set(formatter);
                continue;
            }

            if (ZVal.isTrue(
                    formatter =
                            env.callMethod(
                                    columnTypeGuesser,
                                    "guessFormat",
                                    EntityPopulator.class,
                                    columnMap))) {
                formatters
                        .arrayAccess(
                                env, env.callMethod(columnMap, "getPhpName", EntityPopulator.class))
                        .set(formatter);
                continue;
            }
        }

        return ZVal.assign(formatters.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columnMap", typeHint = "ColumnMap")
    protected Object isColumnBehavior(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object columnMap = assignParameter(args, 0, false);
        Object columnNames = null;
        Object name = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        Object columnName = null;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult89 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(columnMap, "getTable", EntityPopulator.class),
                                "getBehaviors",
                                EntityPopulator.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult89.getKey());
            params.setObject(ZVal.assign(zpairResult89.getValue()));
            columnName =
                    Base.runtimeStaticObject.toLower(
                            env, env.callMethod(columnMap, "getName", EntityPopulator.class));
            switch (toStringR(name)) {
                case "nested_set":
                    columnNames =
                            ZVal.newArray(
                                    new ZPair(0, params.arrayGet(env, "left_column")),
                                    new ZPair(1, params.arrayGet(env, "right_column")),
                                    new ZPair(2, params.arrayGet(env, "level_column")));
                    if (function_in_array.f.env(env).call(columnName, columnNames).getBool()) {
                        return ZVal.assign(true);
                    }

                    break;
                case "timestampable":
                    columnNames =
                            ZVal.newArray(
                                    new ZPair(0, params.arrayGet(env, "create_column")),
                                    new ZPair(1, params.arrayGet(env, "update_column")));
                    if (function_in_array.f.env(env).call(columnName, columnNames).getBool()) {
                        return ZVal.assign(true);
                    }

                    break;
            }
            ;
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "modifiers")
    public Object setModifiers(RuntimeEnv env, Object... args) {
        Object modifiers = assignParameter(args, 0, false);
        this.modifiers = modifiers;
        return null;
    }

    @ConvertedMethod
    public Object getModifiers(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.modifiers);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "modifiers")
    public Object mergeModifiersWith(RuntimeEnv env, Object... args) {
        Object modifiers = assignParameter(args, 0, false);
        this.modifiers = function_array_merge.f.env(env).call(this.modifiers, modifiers).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Faker\\Generator")
    public Object guessModifiers(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Propel")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/Propel/EntityPopulator.php");
        int runtimeConverterBreakCount;
        Object generator = assignParameter(args, 0, false);
        Object peerClass = null;
        Object name = null;
        ReferenceContainer modifiers = new BasicReferenceContainer(null);
        Object params = null;
        Object _pClass = null;
        Object tableMap = null;
        modifiers.setObject(ZVal.newArray());
        _pClass = ZVal.assign(this._pClass);
        peerClass = ZVal.assign(ClassConstantUtils.getConstantValueByClass(env, _pClass, "PEER"));
        tableMap =
                StaticMethodUtils.getStaticBaseClass(peerClass, env)
                        .callUnknownStaticMethod(env, "getTableMap");
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult90 :
                ZVal.getIterable(
                        env.callMethod(tableMap, "getBehaviors", EntityPopulator.class),
                        env,
                        false)) {
            name = ZVal.assign(zpairResult90.getKey());
            params = ZVal.assign(zpairResult90.getValue());
            switch (toStringR(name)) {
                case "nested_set":
                    modifiers
                            .arrayAccess(env, "nested_set")
                            .set(
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\ORM\\Propel",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "obj")
                                        @ConvertedParameter(index = 1, name = "inserted")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object obj = assignParameter(args, 0, false);
                                            ReferenceContainer inserted =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 1, false));
                                            Object parent = null;
                                            Object generator = null;
                                            Object queryClass = null;
                                            Object _pClass = null;
                                            generator =
                                                    this.contextReferences.getCapturedValue(
                                                            "generator");
                                            _pClass =
                                                    this.contextReferences.getCapturedValue(
                                                            "class");
                                            if (arrayActionR(
                                                    ArrayAction.ISSET, inserted, env, _pClass)) {
                                                queryClass = toStringR(_pClass, env) + "Query";
                                                parent =
                                                        env.callMethod(
                                                                StaticMethodUtils
                                                                        .getStaticBaseClass(
                                                                                queryClass, env)
                                                                        .callUnknownStaticMethod(
                                                                                env, "create"),
                                                                "findPk",
                                                                EntityPopulator.class,
                                                                env.callMethod(
                                                                        generator,
                                                                        "randomElement",
                                                                        EntityPopulator.class,
                                                                        inserted.arrayGet(
                                                                                env, _pClass)));
                                                env.callMethod(
                                                        obj,
                                                        "insertAsLastChildOf",
                                                        EntityPopulator.class,
                                                        parent);

                                            } else {
                                                env.callMethod(
                                                        obj, "makeRoot", EntityPopulator.class);
                                            }

                                            return null;
                                        }
                                    }.use("generator", generator).use("class", _pClass));
                    break;
                case "sortable":
                    modifiers
                            .arrayAccess(env, "sortable")
                            .set(
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Faker\\ORM\\Propel",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "obj")
                                        @ConvertedParameter(index = 1, name = "inserted")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object obj = assignParameter(args, 0, false);
                                            ReferenceContainer inserted =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 1, false));
                                            Object _pClass = null;
                                            Object maxRank = null;
                                            _pClass =
                                                    this.contextReferences.getCapturedValue(
                                                            "class");
                                            maxRank =
                                                    ZVal.assign(
                                                            arrayActionR(
                                                                            ArrayAction.ISSET,
                                                                            inserted,
                                                                            env,
                                                                            _pClass)
                                                                    ? function_count
                                                                            .f
                                                                            .env(env)
                                                                            .call(
                                                                                    inserted
                                                                                            .arrayGet(
                                                                                                    env,
                                                                                                    _pClass))
                                                                            .value()
                                                                    : 0);
                                            env.callMethod(
                                                    obj,
                                                    "insertAtRank",
                                                    EntityPopulator.class,
                                                    NamespaceGlobal.mt_rand
                                                            .env(env)
                                                            .call(1, ZVal.add(maxRank, 1))
                                                            .value());
                                            return null;
                                        }
                                    }.use("class", _pClass));
                    break;
            }
            ;
        }

        return ZVal.assign(modifiers.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "con")
    @ConvertedParameter(index = 1, name = "insertedEntities")
    public Object execute(RuntimeEnv env, Object... args) {
        Object con = assignParameter(args, 0, false);
        ReferenceContainer insertedEntities =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer obj = new BasicReferenceContainer(null);
        Object modifier = null;
        Object column = null;
        Object format = null;
        obj.setObject(env.createNew(this._pClass));
        for (ZPair zpairResult91 : ZVal.getIterable(this.getColumnFormatters(env), env, false)) {
            column = ZVal.assign(zpairResult91.getKey());
            format = ZVal.assign(zpairResult91.getValue());
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", format)) {
                env.callMethod(
                        obj.getObject(),
                        "setByName",
                        EntityPopulator.class,
                        column,
                        function_is_callable.f.env(env).call(format).getBool()
                                ? env.callFunctionDynamic(
                                                format,
                                                new RuntimeArgsWithReferences()
                                                        .add(0, insertedEntities)
                                                        .add(1, obj),
                                                insertedEntities.getObject(),
                                                obj.getObject())
                                        .value()
                                : format);
            }
        }

        for (ZPair zpairResult92 : ZVal.getIterable(this.getModifiers(env), env, true)) {
            modifier = ZVal.assign(zpairResult92.getValue());
            env.callFunctionDynamic(
                    modifier,
                    new RuntimeArgsWithReferences().add(0, obj).add(1, insertedEntities),
                    obj.getObject(),
                    insertedEntities.getObject());
        }

        env.callMethod(obj.getObject(), "save", EntityPopulator.class, con);
        return ZVal.assign(env.callMethod(obj.getObject(), "getPrimaryKey", EntityPopulator.class));
    }

    public static final Object CONST_class = "Faker\\ORM\\Propel\\EntityPopulator";

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
                    .setName("Faker\\ORM\\Propel\\EntityPopulator")
                    .setLookup(
                            EntityPopulator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("class", "columnFormatters", "modifiers")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/ORM/Propel/EntityPopulator.php")
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
