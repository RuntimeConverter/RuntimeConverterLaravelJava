package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Spot.classes;

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
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Spot.classes.EntityPopulator;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Spot/Populator.php

*/

public class Populator extends RuntimeClassBase {

    public Object generator = null;

    public Object locator = null;

    public Object entities = ZVal.newArray();

    public Object quantities = ZVal.newArray();

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
        name = "locator",
        typeHint = "Spot\\Locator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        Object locator = assignParameter(args, 1, true);
        if (null == locator) {
            locator = ZVal.getNull();
        }
        this.generator = generator;
        this.locator = locator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entityName")
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
        name = "useExistingData",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object addEntity(RuntimeEnv env, Object... args) {
        Object entityName = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object customColumnFormatters = assignParameter(args, 2, true);
        if (null == customColumnFormatters) {
            customColumnFormatters = ZVal.newArray();
        }
        Object customModifiers = assignParameter(args, 3, true);
        if (null == customModifiers) {
            customModifiers = ZVal.newArray();
        }
        Object useExistingData = assignParameter(args, 4, true);
        if (null == useExistingData) {
            useExistingData = false;
        }
        Object mapper = null;
        Object entity = null;
        mapper = env.callMethod(this.locator, "mapper", Populator.class, entityName);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", mapper)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "No mapper can be found for entity " + toStringR(entityName, env)));
        }

        entity = new EntityPopulator(env, mapper, this.locator, useExistingData);
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
        new ReferenceClassProperty(this, "entities", env).arrayAccess(env, entityName).set(entity);
        new ReferenceClassProperty(this, "quantities", env)
                .arrayAccess(env, entityName)
                .set(number);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "locator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object execute(RuntimeEnv env, Object... args) {
        Object locator = assignParameter(args, 0, true);
        if (null == locator) {
            locator = ZVal.getNull();
        }
        Object number = null;
        ReferenceContainer insertedEntities = new BasicReferenceContainer(null);
        Object entityName = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", locator)) {
            locator = ZVal.assign(this.locator);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", locator)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "No entity manager passed to Spot Populator."));
        }

        insertedEntities.setObject(ZVal.newArray());
        for (ZPair zpairResult104 : ZVal.getIterable(this.quantities, env, false)) {
            entityName = ZVal.assign(zpairResult104.getKey());
            number = ZVal.assign(zpairResult104.getValue());
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', number);
                    i.setObject(ZVal.increment(i.getObject()))) {
                insertedEntities
                        .arrayAppend(env, entityName)
                        .set(
                                env.callMethod(
                                        new ReferenceClassProperty(this, "entities", env)
                                                .arrayGet(env, entityName),
                                        "execute",
                                        Populator.class,
                                        insertedEntities.getObject()));
            }
        }

        return ZVal.assign(insertedEntities.getObject());
    }

    public static final Object CONST_class = "Faker\\ORM\\Spot\\Populator";

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
                    .setName("Faker\\ORM\\Spot\\Populator")
                    .setLookup(
                            Populator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("entities", "generator", "locator", "quantities")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/ORM/Spot/Populator.php")
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
