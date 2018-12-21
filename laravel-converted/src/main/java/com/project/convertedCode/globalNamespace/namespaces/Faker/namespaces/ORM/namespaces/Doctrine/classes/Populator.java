package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Doctrine.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Doctrine.classes.EntityPopulator;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/Populator.php

*/

public class Populator extends RuntimeClassBase {

    public Object generator = null;

    public Object manager = null;

    public Object entities = ZVal.newArray();

    public Object quantities = ZVal.newArray();

    public Object generateId = ZVal.newArray();

    public Populator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Populator.class) {
            this.__construct(env, args);
        }
    }

    public Populator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Faker\\Generator")
    @ConvertedParameter(
        index = 1,
        name = "manager",
        typeHint = "Doctrine\\Common\\Persistence\\ObjectManager",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        Object manager = assignParameter(args, 1, true);
        if (null == manager) {
            manager = ZVal.getNull();
        }
        this.generator = generator;
        this.manager = manager;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entity")
    @ConvertedParameter(index = 1, name = "number")
    @ConvertedParameter(
        index = 2,
        name = "customColumnFormatters",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "customModifiers",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "generateId",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object addEntity(RuntimeEnv env, Object... args) {
        Object entity = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object customColumnFormatters = assignParameter(args, 2, true);
        if (null == customColumnFormatters) {
            customColumnFormatters = ZVal.newArray();
        }
        Object customModifiers = assignParameter(args, 3, true);
        if (null == customModifiers) {
            customModifiers = ZVal.newArray();
        }
        Object generateId = assignParameter(args, 4, true);
        if (null == generateId) {
            generateId = false;
        }
        Object _pClass = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        entity, EntityPopulator.class, "Faker\\ORM\\Doctrine\\EntityPopulator"))) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.manager)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "No entity manager passed to Doctrine Populator."));
            }

            entity =
                    new EntityPopulator(
                            env,
                            env.callMethod(
                                    this.manager, "getClassMetadata", Populator.class, entity));
        }

        env.callMethod(
                entity,
                "setColumnFormatters",
                Populator.class,
                env.callMethod(entity, "guessColumnFormatters", Populator.class, this.generator));
        if (ZVal.isTrue(customColumnFormatters)) {
            env.callMethod(
                    entity, "mergeColumnFormattersWith", Populator.class, customColumnFormatters);
        }

        env.callMethod(entity, "mergeModifiersWith", Populator.class, customModifiers);
        new ReferenceClassProperty(this, "generateId", env)
                .arrayAccess(env, env.callMethod(entity, "getClass", Populator.class))
                .set(generateId);
        _pClass = env.callMethod(entity, "getClass", Populator.class);
        new ReferenceClassProperty(this, "entities", env).arrayAccess(env, _pClass).set(entity);
        new ReferenceClassProperty(this, "quantities", env).arrayAccess(env, _pClass).set(number);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "entityManager",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object execute(RuntimeEnv env, Object... args) {
        Object entityManager = assignParameter(args, 0, true);
        if (null == entityManager) {
            entityManager = ZVal.getNull();
        }
        Object number = null;
        ReferenceContainer insertedEntities = new BasicReferenceContainer(null);
        Object generateId = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object _pClass = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", entityManager)) {
            entityManager = ZVal.assign(this.manager);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", entityManager)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "No entity manager passed to Doctrine Populator."));
        }

        insertedEntities.setObject(ZVal.newArray());
        for (ZPair zpairResult83 : ZVal.getIterable(this.quantities, env, false)) {
            _pClass = ZVal.assign(zpairResult83.getKey());
            number = ZVal.assign(zpairResult83.getValue());
            generateId =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "generateId", env)
                                    .arrayGet(env, _pClass));
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', number);
                    i.setObject(ZVal.increment(i.getObject()))) {
                insertedEntities
                        .arrayAppend(env, _pClass)
                        .set(
                                env.callMethod(
                                        new ReferenceClassProperty(this, "entities", env)
                                                .arrayGet(env, _pClass),
                                        "execute",
                                        Populator.class,
                                        entityManager,
                                        insertedEntities.getObject(),
                                        generateId));
            }

            env.callMethod(entityManager, "flush", Populator.class);
        }

        return ZVal.assign(insertedEntities.getObject());
    }

    public static final Object CONST_class = "Faker\\ORM\\Doctrine\\Populator";

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
                    .setName("Faker\\ORM\\Doctrine\\Populator")
                    .setLookup(
                            Populator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "entities", "generateId", "generator", "manager", "quantities")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/Populator.php")
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
