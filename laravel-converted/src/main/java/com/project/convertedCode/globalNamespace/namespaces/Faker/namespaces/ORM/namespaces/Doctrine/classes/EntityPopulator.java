package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Doctrine.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Doctrine.classes.ColumnTypeGuesser;
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
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import java.lang.Class;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/EntityPopulator.php

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
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "Doctrine\\Common\\Persistence\\Mapping\\ClassMetadata"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        this._pClass = _pClass;
        return null;
    }

    @ConvertedMethod
    public Object getClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this._pClass, "getName", EntityPopulator.class));
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
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Doctrine")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/EntityPopulator.php");
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object generator = assignParameter(args, 0, false);
        Object nameGuesser = null;
        ReferenceContainer mapping = new BasicReferenceContainer(null);
        Object fieldName = null;
        Object assocName = null;
        Object relatedClass = null;
        ReferenceContainer index = new BasicReferenceContainer(null);
        Object optional = null;
        Object formatter = null;
        ReferenceContainer formatters = new BasicReferenceContainer(null);
        Object mappings = null;
        Object size = null;
        Object unique = null;
        Object columnTypeGuesser = null;
        formatters.setObject(ZVal.newArray());
        nameGuesser = new Name(env, generator);
        columnTypeGuesser = new ColumnTypeGuesser(env, generator);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult76 :
                ZVal.getIterable(
                        env.callMethod(this._pClass, "getFieldNames", EntityPopulator.class),
                        env,
                        true)) {
            fieldName = ZVal.assign(zpairResult76.getValue());
            if (ZVal.toBool(
                            env.callMethod(
                                    this._pClass, "isIdentifier", EntityPopulator.class, fieldName))
                    || ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            this._pClass,
                                            "hasField",
                                            EntityPopulator.class,
                                            fieldName)))) {
                continue;
            }

            size =
                    ZVal.assign(
                            arrayActionR(
                                            ArrayAction.ISSET,
                                            new ReferenceClassProperty(
                                                    this._pClass, "fieldMappings", env),
                                            env,
                                            fieldName,
                                            "length")
                                    ? new ReferenceClassProperty(this._pClass, "fieldMappings", env)
                                            .arrayGet(env, fieldName, "length")
                                    : ZVal.getNull());
            if (ZVal.isTrue(
                    formatter =
                            env.callMethod(
                                    nameGuesser,
                                    "guessFormat",
                                    EntityPopulator.class,
                                    fieldName,
                                    size))) {
                formatters.arrayAccess(env, fieldName).set(formatter);
                continue;
            }

            if (ZVal.isTrue(
                    formatter =
                            env.callMethod(
                                    columnTypeGuesser,
                                    "guessFormat",
                                    EntityPopulator.class,
                                    fieldName,
                                    this._pClass))) {
                formatters.arrayAccess(env, fieldName).set(formatter);
                continue;
            }
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult77 :
                ZVal.getIterable(
                        env.callMethod(this._pClass, "getAssociationNames", EntityPopulator.class),
                        env,
                        true)) {
            assocName = ZVal.assign(zpairResult77.getValue());
            if (ZVal.isTrue(
                    env.callMethod(
                            this._pClass,
                            "isCollectionValuedAssociation",
                            EntityPopulator.class,
                            assocName))) {
                continue;
            }

            relatedClass =
                    env.callMethod(
                            this._pClass,
                            "getAssociationTargetClass",
                            EntityPopulator.class,
                            assocName);
            unique = ZVal.assign(optional = false);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this._pClass,
                            (Class) null,
                            "Doctrine\\ORM\\Mapping\\ClassMetadata",
                            env))) {
                mappings =
                        env.callMethod(
                                this._pClass, "getAssociationMappings", EntityPopulator.class);
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult78 : ZVal.getIterable(mappings, env, true)) {
                    mapping.setObject(ZVal.assign(zpairResult78.getValue()));
                    if (ZVal.equalityCheck(mapping.arrayGet(env, "targetEntity"), relatedClass)) {
                        if (ZVal.equalityCheck(
                                mapping.arrayGet(env, "type"),
                                ClassConstantUtils.getConstantValueByClass(
                                        env,
                                        ZVal.resolveClassAlias(
                                                env, "Doctrine\\ORM\\Mapping\\ClassMetadata"),
                                        "ONE_TO_ONE"))) {
                            unique = true;
                            optional =
                                    ZVal.assign(
                                            arrayActionR(
                                                            ArrayAction.ISSET,
                                                            mapping,
                                                            env,
                                                            "joinColumns",
                                                            0,
                                                            "nullable")
                                                    ? mapping.arrayGet(
                                                            env, "joinColumns", 0, "nullable")
                                                    : false);
                            break;
                        }
                    }
                }

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            this._pClass,
                            (Class) null,
                            "Doctrine\\ODM\\MongoDB\\Mapping\\ClassMetadata",
                            env))) {
                mappings =
                        ZVal.assign(
                                toObjectR(this._pClass)
                                        .accessProp(this, env)
                                        .name("associationMappings")
                                        .value());
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult79 : ZVal.getIterable(mappings, env, true)) {
                    mapping.setObject(ZVal.assign(zpairResult79.getValue()));
                    if (ZVal.equalityCheck(mapping.arrayGet(env, "targetDocument"), relatedClass)) {
                        if (ZVal.toBool(
                                        ZVal.equalityCheck(
                                                mapping.arrayGet(env, "type"),
                                                ClassConstantUtils.getConstantValueByClass(
                                                        env,
                                                        ZVal.resolveClassAlias(
                                                                env,
                                                                "Doctrine\\ODM\\MongoDB\\Mapping\\ClassMetadata"),
                                                        "ONE")))
                                && ZVal.toBool(
                                        ZVal.equalityCheck(
                                                mapping.arrayGet(env, "association"),
                                                ClassConstantUtils.getConstantValueByClass(
                                                        env,
                                                        ZVal.resolveClassAlias(
                                                                env,
                                                                "Doctrine\\ODM\\MongoDB\\Mapping\\ClassMetadata"),
                                                        "REFERENCE_ONE")))) {
                            unique = true;
                            optional =
                                    ZVal.assign(
                                            arrayActionR(
                                                            ArrayAction.ISSET,
                                                            mapping,
                                                            env,
                                                            "nullable")
                                                    ? mapping.arrayGet(env, "nullable")
                                                    : false);
                            break;
                        }
                    }
                }
            }

            index.setObject(0);
            formatters
                    .arrayAccess(env, assocName)
                    .set(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Faker\\ORM\\Doctrine",
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
                                    Object related = null;
                                    Object unique = null;
                                    Object relatedClass = null;
                                    ReferenceContainer index = new BasicReferenceContainer(null);
                                    Object optional = null;
                                    unique = this.contextReferences.getCapturedValue("unique");
                                    relatedClass =
                                            this.contextReferences.getCapturedValue("relatedClass");
                                    index = this.contextReferences.getReferenceContainer("index");
                                    optional = this.contextReferences.getCapturedValue("optional");
                                    if (arrayActionR(
                                            ArrayAction.ISSET, inserted, env, relatedClass)) {
                                        if (ZVal.isTrue(unique)) {
                                            related = ZVal.getNull();
                                            if (ZVal.toBool(
                                                            arrayActionR(
                                                                    ArrayAction.ISSET,
                                                                    inserted,
                                                                    env,
                                                                    relatedClass,
                                                                    index.getObject()))
                                                    || ZVal.toBool(!ZVal.isTrue(optional))) {
                                                related =
                                                        ZVal.assign(
                                                                inserted.arrayGet(
                                                                        env,
                                                                        relatedClass,
                                                                        index.getObject()));
                                            }

                                            index.setObject(ZVal.increment(index.getObject()));
                                            return ZVal.assign(related);
                                        }

                                        return ZVal.assign(
                                                inserted.arrayGet(
                                                        env,
                                                        relatedClass,
                                                        NamespaceGlobal.mt_rand
                                                                .env(env)
                                                                .call(
                                                                        0,
                                                                        ZVal.subtract(
                                                                                function_count
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                inserted
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                relatedClass))
                                                                                        .value(),
                                                                                1))
                                                                .value()));
                                    }

                                    return ZVal.assign(ZVal.getNull());
                                }
                            }.useRef("index", index)
                                    .use("unique", unique)
                                    .use("relatedClass", relatedClass)
                                    .use("optional", optional));
        }

        return ZVal.assign(formatters.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "manager",
        typeHint = "Doctrine\\Common\\Persistence\\ObjectManager"
    )
    @ConvertedParameter(index = 1, name = "insertedEntities")
    @ConvertedParameter(
        index = 2,
        name = "generateId",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object execute(RuntimeEnv env, Object... args) {
        Object manager = assignParameter(args, 0, false);
        Object insertedEntities = assignParameter(args, 1, false);
        Object generateId = assignParameter(args, 2, true);
        if (null == generateId) {
            generateId = false;
        }
        Object idName = null;
        Object obj = null;
        Object id = null;
        Object idsName = null;
        obj = env.callMethod(this._pClass, "newInstance", EntityPopulator.class);
        this.fillColumns(env, obj, insertedEntities);
        this.callMethods(env, obj, insertedEntities);
        if (ZVal.isTrue(generateId)) {
            idsName = env.callMethod(this._pClass, "getIdentifier", EntityPopulator.class);
            for (ZPair zpairResult80 : ZVal.getIterable(idsName, env, true)) {
                idName = ZVal.assign(zpairResult80.getValue());
                id = this.generateId(env, obj, idName, manager);
                env.callMethod(
                        new ReferenceClassProperty(this._pClass, "reflFields", env)
                                .arrayGet(env, idName),
                        "setValue",
                        EntityPopulator.class,
                        obj,
                        id);
            }
        }

        env.callMethod(manager, "persist", EntityPopulator.class, obj);
        return ZVal.assign(obj);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "obj")
    @ConvertedParameter(index = 1, name = "insertedEntities")
    private Object fillColumns(RuntimeEnv env, Object... args) {
        ReferenceContainer obj = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer insertedEntities =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        Object ex = null;
        Object field = null;
        Object format = null;
        Object setter = null;
        ReferenceContainer value = new BasicReferenceContainer(null);
        for (ZPair zpairResult81 : ZVal.getIterable(this.columnFormatters, env, false)) {
            field = ZVal.assign(zpairResult81.getKey());
            format = ZVal.assign(zpairResult81.getValue());
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", format)) {
                try {
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
                } catch (ConvertedException convertedException12) {
                    if (convertedException12.instanceOf(
                            InvalidArgumentException.class, "InvalidArgumentException")) {
                        ex = convertedException12.getObject();
                        throw ZVal.getException(
                                env,
                                new InvalidArgumentException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Failed to generate a value for %s::%s: %s",
                                                        function_get_class
                                                                .f
                                                                .env(env)
                                                                .call(obj.getObject())
                                                                .value(),
                                                        field,
                                                        env.callMethod(
                                                                ex,
                                                                "getMessage",
                                                                EntityPopulator.class))
                                                .value()));
                    } else {
                        throw convertedException12;
                    }
                }

                setter =
                        function_sprintf
                                .f
                                .env(env)
                                .call("set%s", NamespaceGlobal.ucfirst.env(env).call(field).value())
                                .value();
                if (function_method_exists.f.env(env).call(obj.getObject(), setter).getBool()) {
                    env.callMethod(
                            obj.getObject(),
                            new RuntimeArgsWithReferences().add(0, value),
                            toStringR(setter, env),
                            EntityPopulator.class,
                            value.getObject());

                } else {
                    env.callMethod(
                            new ReferenceClassProperty(this._pClass, "reflFields", env)
                                    .arrayGet(env, field),
                            "setValue",
                            EntityPopulator.class,
                            obj.getObject(),
                            value.getObject());
                }
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
        for (ZPair zpairResult82 : ZVal.getIterable(this.getModifiers(env), env, true)) {
            modifier = ZVal.assign(zpairResult82.getValue());
            env.callFunctionDynamic(
                    modifier,
                    new RuntimeArgsWithReferences().add(0, obj).add(1, insertedEntities),
                    obj.getObject(),
                    insertedEntities.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "obj")
    @ConvertedParameter(index = 1, name = "column")
    @ConvertedParameter(
        index = 2,
        name = "manager",
        typeHint = "Doctrine\\Common\\Persistence\\ObjectManager"
    )
    private Object generateId(RuntimeEnv env, Object... args) {
        Object obj = assignParameter(args, 0, false);
        Object column = assignParameter(args, 1, false);
        Object manager = assignParameter(args, 2, false);
        Object result = null;
        Object ids = null;
        Object id = null;
        Object repository = null;
        repository =
                env.callMethod(
                        manager,
                        "getRepository",
                        EntityPopulator.class,
                        function_get_class.f.env(env).call(obj).value());
        result =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                repository,
                                                "createQueryBuilder",
                                                EntityPopulator.class,
                                                "e"),
                                        "select",
                                        EntityPopulator.class,
                                        function_sprintf.f.env(env).call("e.%s", column).value()),
                                "getQuery",
                                EntityPopulator.class),
                        "execute",
                        EntityPopulator.class);
        ids =
                function_array_map
                        .f
                        .env(env)
                        .call("current", env.callMethod(result, "toArray", EntityPopulator.class))
                        .value();
        id = ZVal.getNull();
        do {
            id = NamespaceGlobal.mt_rand.env(env).call().value();

        } while (function_in_array.f.env(env).call(id, ids).getBool());

        return ZVal.assign(id);
    }

    public static final Object CONST_class = "Faker\\ORM\\Doctrine\\EntityPopulator";

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
                    .setName("Faker\\ORM\\Doctrine\\EntityPopulator")
                    .setLookup(
                            EntityPopulator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("class", "columnFormatters", "modifiers")
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/EntityPopulator.php")
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
