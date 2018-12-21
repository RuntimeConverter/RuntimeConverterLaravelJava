package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Mandango.classes;

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
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Mandango.classes.EntityPopulator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Mandango/Populator.php

*/

public class Populator extends RuntimeClassBase {

    public Object generator = null;

    public Object mandango = null;

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
    @ConvertedParameter(index = 1, name = "mandango", typeHint = "Mandango\\Mandango")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        Object mandango = assignParameter(args, 1, false);
        this.generator = generator;
        this.mandango = mandango;
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
    public Object addEntity(RuntimeEnv env, Object... args) {
        Object entity = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object customColumnFormatters = assignParameter(args, 2, true);
        if (null == customColumnFormatters) {
            customColumnFormatters = ZVal.newArray();
        }
        Object _pClass = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        entity, EntityPopulator.class, "Faker\\ORM\\Mandango\\EntityPopulator"))) {
            entity = new EntityPopulator(env, entity);
        }

        env.callMethod(
                entity,
                "setColumnFormatters",
                Populator.class,
                env.callMethod(
                        entity,
                        "guessColumnFormatters",
                        Populator.class,
                        this.generator,
                        this.mandango));
        if (ZVal.isTrue(customColumnFormatters)) {
            env.callMethod(
                    entity, "mergeColumnFormattersWith", Populator.class, customColumnFormatters);
        }

        _pClass = env.callMethod(entity, "getClass", Populator.class);
        new ReferenceClassProperty(this, "entities", env).arrayAccess(env, _pClass).set(entity);
        new ReferenceClassProperty(this, "quantities", env).arrayAccess(env, _pClass).set(number);
        return null;
    }

    @ConvertedMethod
    public Object execute(RuntimeEnv env, Object... args) {
        Object number = null;
        ReferenceContainer insertedEntities = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object _pClass = null;
        insertedEntities.setObject(ZVal.newArray());
        for (ZPair zpairResult87 : ZVal.getIterable(this.quantities, env, false)) {
            _pClass = ZVal.assign(zpairResult87.getKey());
            number = ZVal.assign(zpairResult87.getValue());
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
                                        this.mandango,
                                        insertedEntities.getObject()));
            }
        }

        env.callMethod(this.mandango, "flush", Populator.class);
        return ZVal.assign(insertedEntities.getObject());
    }

    public static final Object CONST_class = "Faker\\ORM\\Mandango\\Populator";

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
                    .setName("Faker\\ORM\\Mandango\\Populator")
                    .setLookup(
                            Populator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("entities", "generator", "mandango", "quantities")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/ORM/Mandango/Populator.php")
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
