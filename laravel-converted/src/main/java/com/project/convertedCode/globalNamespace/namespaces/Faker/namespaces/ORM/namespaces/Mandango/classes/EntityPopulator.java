package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Mandango.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Mandango.classes.ColumnTypeGuesser;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Guesser.classes.Name;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Mandango/EntityPopulator.php

*/

public class EntityPopulator extends RuntimeClassBase {

    public Object _pClass = null;

    public Object columnFormatters = ZVal.newArray();

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
    @ConvertedParameter(index = 1, name = "mandango", typeHint = "Mandango\\Mandango")
    public Object guessColumnFormatters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Mandango")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/Mandango/EntityPopulator.php");
        int runtimeConverterContinueCount;
        Object generator = assignParameter(args, 0, false);
        Object mandango = assignParameter(args, 1, false);
        Object nameGuesser = null;
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        Object fieldName = null;
        Object formatter = null;
        ReferenceContainer reference = new BasicReferenceContainer(null);
        ReferenceContainer formatters = new BasicReferenceContainer(null);
        Object field = null;
        Object columnTypeGuesser = null;
        Object referenceClass = null;
        Object referenceName = null;
        formatters.setObject(ZVal.newArray());
        nameGuesser = new Name(env, generator);
        columnTypeGuesser = new ColumnTypeGuesser(env, generator);
        metadata.setObject(
                env.callMethod(mandango, "getMetadata", EntityPopulator.class, this._pClass));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult84 : ZVal.getIterable(metadata.arrayGet(env, "fields"), env, false)) {
            fieldName = ZVal.assign(zpairResult84.getKey());
            field = ZVal.assign(zpairResult84.getValue());
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
                                    field))) {
                formatters.arrayAccess(env, fieldName).set(formatter);
                continue;
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult85 :
                ZVal.getIterable(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        metadata.arrayGet(env, "referencesOne"),
                                        metadata.arrayGet(env, "referencesMany"))
                                .value(),
                        env,
                        false)) {
            referenceName = ZVal.assign(zpairResult85.getKey());
            reference.setObject(ZVal.assign(zpairResult85.getValue()));
            if (!arrayActionR(ArrayAction.ISSET, reference, env, "class")) {
                continue;
            }

            referenceClass = ZVal.assign(reference.arrayGet(env, "class"));
            formatters
                    .arrayAccess(env, referenceName)
                    .set(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Faker\\ORM\\Mandango",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "insertedEntities")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    ReferenceContainer insertedEntities =
                                            new BasicReferenceContainer(
                                                    assignParameter(args, 0, false));
                                    Object referenceClass = null;
                                    referenceClass =
                                            this.contextReferences.getCapturedValue(
                                                    "referenceClass");
                                    if (arrayActionR(
                                            ArrayAction.ISSET,
                                            insertedEntities,
                                            env,
                                            referenceClass)) {
                                        return ZVal.assign(
                                                Base.runtimeStaticObject.randomElement(
                                                        env,
                                                        insertedEntities.arrayGet(
                                                                env, referenceClass)));
                                    }

                                    return null;
                                }
                            }.use("referenceClass", referenceClass));
        }

        return ZVal.assign(formatters.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mandango", typeHint = "Mandango\\Mandango")
    @ConvertedParameter(index = 1, name = "insertedEntities")
    public Object execute(RuntimeEnv env, Object... args) {
        Object mandango = assignParameter(args, 0, false);
        ReferenceContainer insertedEntities =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        ReferenceContainer obj = new BasicReferenceContainer(null);
        Object format = null;
        Object column = null;
        Object adder = null;
        ReferenceContainer value = new BasicReferenceContainer(null);
        metadata.setObject(
                env.callMethod(mandango, "getMetadata", EntityPopulator.class, this._pClass));
        obj.setObject(env.callMethod(mandango, "create", EntityPopulator.class, this._pClass));
        for (ZPair zpairResult86 : ZVal.getIterable(this.columnFormatters, env, false)) {
            column = ZVal.assign(zpairResult86.getKey());
            format = ZVal.assign(zpairResult86.getValue());
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", format)) {
                value.setObject(
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
                                        : format));
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, metadata, env, "fields", column))
                        || ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        metadata,
                                        env,
                                        "referencesOne",
                                        column))) {
                    env.callMethod(
                            obj.getObject(),
                            "set",
                            EntityPopulator.class,
                            column,
                            value.getObject());
                }

                if (arrayActionR(ArrayAction.ISSET, metadata, env, "referencesMany", column)) {
                    adder =
                            "add"
                                    + toStringR(
                                            NamespaceGlobal.ucfirst.env(env).call(column).value(),
                                            env);
                    env.callMethod(
                            obj.getObject(),
                            new RuntimeArgsWithReferences().add(0, value),
                            toStringR(adder, env),
                            EntityPopulator.class,
                            value.getObject());
                }
            }
        }

        env.callMethod(mandango, "persist", EntityPopulator.class, obj.getObject());
        return ZVal.assign(obj.getObject());
    }

    public static final Object CONST_class = "Faker\\ORM\\Mandango\\EntityPopulator";

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
                    .setName("Faker\\ORM\\Mandango\\EntityPopulator")
                    .setLookup(
                            EntityPopulator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("class", "columnFormatters")
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/ORM/Mandango/EntityPopulator.php")
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
