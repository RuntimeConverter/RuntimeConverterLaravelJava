package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Spot.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Spot.classes.ColumnTypeGuesser;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
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
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Spot/EntityPopulator.php

*/

public class EntityPopulator extends RuntimeClassBase {

    public Object mapper = null;

    public Object locator = null;

    public Object columnFormatters = ZVal.newArray();

    public Object modifiers = ZVal.newArray();

    public Object useExistingData = false;

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
    @ConvertedParameter(index = 0, name = "mapper", typeHint = "Spot\\Mapper")
    @ConvertedParameter(index = 1, name = "locator", typeHint = "Spot\\Locator")
    @ConvertedParameter(
        index = 2,
        name = "useExistingData",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object mapper = assignParameter(args, 0, false);
        Object locator = assignParameter(args, 1, false);
        Object useExistingData = assignParameter(args, 2, true);
        if (null == useExistingData) {
            useExistingData = false;
        }
        this.mapper = mapper;
        this.locator = locator;
        this.useExistingData = useExistingData;
        return null;
    }

    @ConvertedMethod
    public Object getMapper(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.mapper);
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
    @ConvertedParameter(index = 0, name = "modifiers", typeHint = "array")
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
    @ConvertedParameter(index = 0, name = "modifiers", typeHint = "array")
    public Object mergeModifiersWith(RuntimeEnv env, Object... args) {
        Object modifiers = assignParameter(args, 0, false);
        this.modifiers = function_array_merge.f.env(env).call(this.modifiers, modifiers).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Faker\\Generator")
    public Object guessColumnFormatters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Spot")
                        .setFile("/vendor/fzaninotto/faker/src/Faker/ORM/Spot/EntityPopulator.php");
        int runtimeConverterContinueCount;
        Object generator = assignParameter(args, 0, false);
        Object nameGuesser = null;
        Object fieldName = null;
        Object required = null;
        Object relation = null;
        Object formatter = null;
        ReferenceContainer formatters = new BasicReferenceContainer(null);
        ReferenceContainer field = new BasicReferenceContainer(null);
        Object entityName = null;
        ReferenceContainer fields = new BasicReferenceContainer(null);
        Object relations = null;
        Object locator = null;
        ReferenceContainer entity = new BasicReferenceContainer(null);
        Object columnTypeGuesser = null;
        formatters.setObject(ZVal.newArray());
        nameGuesser = new Name(env, generator);
        columnTypeGuesser = new ColumnTypeGuesser(env, generator);
        fields.setObject(env.callMethod(this.mapper, "fields", EntityPopulator.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult100 : ZVal.getIterable(fields.getObject(), env, false)) {
            fieldName = ZVal.assign(zpairResult100.getKey());
            field.setObject(ZVal.assign(zpairResult100.getValue()));
            if (ZVal.strictEqualityCheck(field.arrayGet(env, "primary"), "===", true)) {
                continue;
            }

            if (ZVal.isTrue(
                    formatter =
                            env.callMethod(
                                    nameGuesser,
                                    "guessFormat",
                                    EntityPopulator.class,
                                    fieldName))) {
                formatters.arrayAccess(env, fieldName).set(formatter);
                continue;
            }

            if (ZVal.isTrue(
                    formatter =
                            env.callMethod(
                                    columnTypeGuesser,
                                    "guessFormat",
                                    EntityPopulator.class,
                                    field.getObject()))) {
                formatters.arrayAccess(env, fieldName).set(formatter);
                continue;
            }
        }

        entityName = env.callMethod(this.mapper, "entity", EntityPopulator.class);
        entity.setObject(
                env.callMethod(this.mapper, "build", EntityPopulator.class, ZVal.newArray()));
        relations =
                StaticMethodUtils.getStaticBaseClass(entityName, env)
                        .callUnknownStaticMethod(
                                env,
                                "relations",
                                new RuntimeArgsWithReferences()
                                        .add(0, new ReferenceClassProperty(this, "mapper", env))
                                        .add(1, entity),
                                this.mapper,
                                entity.getObject());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult101 : ZVal.getIterable(relations, env, true)) {
            relation = ZVal.assign(zpairResult101.getValue());
            if (ZVal.isTrue(ZVal.checkInstanceType(relation, (Class) null, "BelongsTo", env))) {
                fieldName = env.callMethod(relation, "localKey", EntityPopulator.class);
                entityName = env.callMethod(relation, "entityName", EntityPopulator.class);
                field.setObject(ZVal.assign(fields.arrayGet(env, fieldName)));
                required = ZVal.assign(field.arrayGet(env, "required"));
                locator = ZVal.assign(this.locator);
                formatters
                        .arrayAccess(env, fieldName)
                        .set(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Faker\\ORM\\Spot",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "inserted")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer inserted =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ReferenceContainer records =
                                                new BasicReferenceContainer(null);
                                        Object entityName = null;
                                        Object mapper = null;
                                        Object id = null;
                                        Object locator = null;
                                        Object required = null;
                                        entityName =
                                                this.contextReferences.getCapturedValue(
                                                        "entityName");
                                        locator =
                                                this.contextReferences.getCapturedValue("locator");
                                        required =
                                                this.contextReferences.getCapturedValue("required");
                                        if (!arrayActionR(
                                                ArrayAction.EMPTY, inserted, env, entityName)) {
                                            return ZVal.assign(
                                                    env.callMethod(
                                                            inserted.arrayGet(
                                                                    env,
                                                                    entityName,
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
                                                                                                                            entityName))
                                                                                                    .value(),
                                                                                            1))
                                                                            .value()),
                                                            "getId",
                                                            EntityPopulator.class));

                                        } else {
                                            if (ZVal.toBool(required)
                                                    && ZVal.toBool(
                                                            EntityPopulator.this.useExistingData)) {
                                                mapper =
                                                        env.callMethod(
                                                                EntityPopulator.this.locator,
                                                                "mapper",
                                                                EntityPopulator.class,
                                                                entityName);
                                                records.setObject(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        env.callMethod(
                                                                                mapper,
                                                                                "all",
                                                                                EntityPopulator
                                                                                        .class),
                                                                        "limit",
                                                                        EntityPopulator.class,
                                                                        CONST_RELATED_FETCH_COUNT),
                                                                "toArray",
                                                                EntityPopulator.class));
                                                if (ZVal.isEmpty(records.getObject())) {
                                                    return ZVal.assign(ZVal.getNull());
                                                }

                                                id =
                                                        ZVal.assign(
                                                                records.arrayGet(
                                                                        env,
                                                                        NamespaceGlobal.mt_rand
                                                                                .env(env)
                                                                                .call(
                                                                                        0,
                                                                                        ZVal
                                                                                                .subtract(
                                                                                                        function_count
                                                                                                                .f
                                                                                                                .env(
                                                                                                                        env)
                                                                                                                .call(
                                                                                                                        records
                                                                                                                                .getObject())
                                                                                                                .value(),
                                                                                                        1))
                                                                                .value(),
                                                                        "id"));
                                                return ZVal.assign(id);

                                            } else {
                                                return ZVal.assign(ZVal.getNull());
                                            }
                                        }
                                    }
                                }.use("entityName", entityName)
                                        .use("locator", locator)
                                        .use("required", required));
            }
        }

        return ZVal.assign(formatters.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "insertedEntities")
    public Object execute(RuntimeEnv env, Object... args) {
        Object insertedEntities = assignParameter(args, 0, false);
        Object obj = null;
        obj = env.callMethod(this.mapper, "build", EntityPopulator.class, ZVal.newArray());
        this.fillColumns(env, obj, insertedEntities);
        this.callMethods(env, obj, insertedEntities);
        env.callMethod(this.mapper, "insert", EntityPopulator.class, obj);
        return ZVal.assign(obj);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "obj")
    @ConvertedParameter(index = 1, name = "insertedEntities")
    private Object fillColumns(RuntimeEnv env, Object... args) {
        ReferenceContainer obj = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer insertedEntities =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object field = null;
        Object format = null;
        Object value = null;
        for (ZPair zpairResult102 : ZVal.getIterable(this.columnFormatters, env, false)) {
            field = ZVal.assign(zpairResult102.getKey());
            format = ZVal.assign(zpairResult102.getValue());
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", format)) {
                value =
                        ZVal.assign(
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
                env.callMethod(obj.getObject(), "set", EntityPopulator.class, field, value);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "obj")
    @ConvertedParameter(index = 1, name = "insertedEntities")
    private Object callMethods(RuntimeEnv env, Object... args) {
        ReferenceContainer obj = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer insertedEntities =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object modifier = null;
        for (ZPair zpairResult103 : ZVal.getIterable(this.getModifiers(env), env, true)) {
            modifier = ZVal.assign(zpairResult103.getValue());
            env.callFunctionDynamic(
                    modifier,
                    new RuntimeArgsWithReferences().add(0, obj).add(1, insertedEntities),
                    obj.getObject(),
                    insertedEntities.getObject());
        }

        return null;
    }

    public static final Object CONST_RELATED_FETCH_COUNT = 10;

    public static final Object CONST_class = "Faker\\ORM\\Spot\\EntityPopulator";

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
                    .setName("Faker\\ORM\\Spot\\EntityPopulator")
                    .setLookup(
                            EntityPopulator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "columnFormatters", "locator", "mapper", "modifiers", "useExistingData")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/ORM/Spot/EntityPopulator.php")
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
