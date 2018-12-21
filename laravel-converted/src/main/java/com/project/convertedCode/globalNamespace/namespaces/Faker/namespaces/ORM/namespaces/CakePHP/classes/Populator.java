package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.CakePHP.classes;

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
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.CakePHP.classes.EntityPopulator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/Populator.php

*/

public class Populator extends RuntimeClassBase {

    public Object generator = null;

    public Object entities = ZVal.newArray();

    public Object quantities = ZVal.newArray();

    public Object guessers = ZVal.newArray();

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
    public Object getGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.generator);
    }

    @ConvertedMethod
    public Object getGuessers(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.guessers);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object removeGuesser(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.isTrue(new ReferenceClassProperty(this, "guessers", env).arrayGet(env, name))) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "guessers", env),
                    env,
                    name);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object addGuesser(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        if (!function_is_object.f.env(env).call(_pClass).getBool()) {
            _pClass = env.createNew(_pClass, this.generator);
        }

        if (!function_method_exists.f.env(env).call(_pClass, "guessFormat").getBool()) {
            throw ZVal.getException(
                    env,
                    new PHPException(
                            env,
                            "Missing required custom guesser method: "
                                    + toStringR(
                                            function_get_class.f.env(env).call(_pClass).value(),
                                            env)
                                    + "::guessFormat()"));
        }

        new ReferenceClassProperty(this, "guessers", env)
                .arrayAccess(env, function_get_class.f.env(env).call(_pClass).value())
                .set(_pClass);
        return ZVal.assign(this);
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
                        entity, EntityPopulator.class, "Faker\\ORM\\CakePHP\\EntityPopulator"))) {
            entity = new EntityPopulator(env, entity);
        }

        toObjectR(entity)
                .accessProp(this, env)
                .name("columnFormatters")
                .set(env.callMethod(entity, "guessColumnFormatters", Populator.class, this));
        if (ZVal.isTrue(customColumnFormatters)) {
            env.callMethod(
                    entity, "mergeColumnFormattersWith", Populator.class, customColumnFormatters);
        }

        toObjectR(entity)
                .accessProp(this, env)
                .name("modifiers")
                .set(env.callMethod(entity, "guessModifiers", Populator.class, this));
        if (ZVal.isTrue(customModifiers)) {
            env.callMethod(entity, "mergeModifiersWith", Populator.class, customModifiers);
        }

        _pClass = ZVal.assign(toObjectR(entity).accessProp(this, env).name("class").value());
        new ReferenceClassProperty(this, "entities", env).arrayAccess(env, _pClass).set(entity);
        new ReferenceClassProperty(this, "quantities", env).arrayAccess(env, _pClass).set(number);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", defaultValue = "", defaultValueType = "array")
    public Object execute(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object number = null;
        ReferenceContainer insertedEntities = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object _pClass = null;
        insertedEntities.setObject(ZVal.newArray());
        for (ZPair zpairResult75 : ZVal.getIterable(this.quantities, env, false)) {
            _pClass = ZVal.assign(zpairResult75.getKey());
            number = ZVal.assign(zpairResult75.getValue());
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
                                        _pClass,
                                        insertedEntities.getObject(),
                                        options));
            }
        }

        return ZVal.assign(insertedEntities.getObject());
    }

    public static final Object CONST_class = "Faker\\ORM\\CakePHP\\Populator";

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
                    .setName("Faker\\ORM\\CakePHP\\Populator")
                    .setLookup(
                            Populator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("entities", "generator", "guessers", "quantities")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/Populator.php")
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
