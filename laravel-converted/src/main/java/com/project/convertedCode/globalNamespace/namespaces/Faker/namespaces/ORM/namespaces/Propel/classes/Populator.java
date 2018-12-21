package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Propel.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Propel.classes.EntityPopulator;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Propel/Populator.php

*/

public class Populator extends RuntimeClassBase {

    public Object generator = null;

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
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        this.generator = generator;
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
        Object _pClass = null;
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        entity, EntityPopulator.class, "Faker\\ORM\\Propel\\EntityPopulator"))) {
            entity = new EntityPopulator(env, entity);
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

        env.callMethod(
                entity,
                "setModifiers",
                Populator.class,
                env.callMethod(entity, "guessModifiers", Populator.class, this.generator));
        if (ZVal.isTrue(customModifiers)) {
            env.callMethod(entity, "mergeModifiersWith", Populator.class, customModifiers);
        }

        _pClass = env.callMethod(entity, "getClass", Populator.class);
        new ReferenceClassProperty(this, "entities", env).arrayAccess(env, _pClass).set(entity);
        new ReferenceClassProperty(this, "quantities", env).arrayAccess(env, _pClass).set(number);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "con",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object execute(RuntimeEnv env, Object... args) {
        Object con = assignParameter(args, 0, true);
        if (null == con) {
            con = ZVal.getNull();
        }
        Object number = null;
        ReferenceContainer insertedEntities = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object _pClass = null;
        Object isInstancePoolingEnabled = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", con)) {
            con = this.getConnection(env);
        }

        isInstancePoolingEnabled =
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Propel"), env)
                        .callUnknownStaticMethod(env, "isInstancePoolingEnabled");
        StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Propel"), env)
                .callUnknownStaticMethod(env, "disableInstancePooling");
        insertedEntities.setObject(ZVal.newArray());
        env.callMethod(con, "beginTransaction", Populator.class);
        for (ZPair zpairResult93 : ZVal.getIterable(this.quantities, env, false)) {
            _pClass = ZVal.assign(zpairResult93.getKey());
            number = ZVal.assign(zpairResult93.getValue());
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
                                        con,
                                        insertedEntities.getObject()));
            }
        }

        env.callMethod(con, "commit", Populator.class);
        if (ZVal.isTrue(isInstancePoolingEnabled)) {
            StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Propel"), env)
                    .callUnknownStaticMethod(env, "enableInstancePooling");
        }

        return ZVal.assign(insertedEntities.getObject());
    }

    @ConvertedMethod
    protected Object getConnection(RuntimeEnv env, Object... args) {
        Object peer = null;
        Object _pClass = null;
        _pClass = function_key.f.env(env).call(this.entities).value();
        if (!ZVal.isTrue(_pClass)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "No class found from entities. Did you add entities to the Populator ?"));
        }

        peer = ZVal.assign(ClassConstantUtils.getConstantValueByClass(env, _pClass, "PEER"));
        return ZVal.assign(
                StaticMethodUtils.getStaticBaseClass(ZVal.resolveClassAlias(env, "Propel"), env)
                        .callUnknownStaticMethod(
                                env,
                                "getConnection",
                                new RuntimeArgsWithReferences(),
                                ClassConstantUtils.getConstantValueByClass(
                                        env, peer, "DATABASE_NAME"),
                                ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(env, "Propel"),
                                        "CONNECTION_WRITE")));
    }

    public static final Object CONST_class = "Faker\\ORM\\Propel\\Populator";

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
                    .setName("Faker\\ORM\\Propel\\Populator")
                    .setLookup(
                            Populator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("entities", "generator", "quantities")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/ORM/Propel/Populator.php")
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
