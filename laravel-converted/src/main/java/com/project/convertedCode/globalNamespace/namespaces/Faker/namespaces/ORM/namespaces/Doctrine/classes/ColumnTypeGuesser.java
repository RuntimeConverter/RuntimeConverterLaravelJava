package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Doctrine.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/ColumnTypeGuesser.php

*/

public class ColumnTypeGuesser extends RuntimeClassBase {

    public Object generator = null;

    public ColumnTypeGuesser(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ColumnTypeGuesser.class) {
            this.__construct(env, args);
        }
    }

    public ColumnTypeGuesser(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "fieldName")
    @ConvertedParameter(
        index = 1,
        name = "class",
        typeHint = "Doctrine\\Common\\Persistence\\Mapping\\ClassMetadata"
    )
    public Object guessFormat(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Doctrine")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/ColumnTypeGuesser.php");
        Object fieldName = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        Object size = null;
        Object generator = null;
        Object type = null;
        generator = ZVal.assign(this.generator);
        type = env.callMethod(_pClass, "getTypeOfField", ColumnTypeGuesser.class, fieldName);
        SwitchEnumType4 switchVariable4 =
                ZVal.getEnum(
                        type,
                        SwitchEnumType4.DEFAULT_CASE,
                        SwitchEnumType4.STRING_boolean,
                        "boolean",
                        SwitchEnumType4.STRING_decimal,
                        "decimal",
                        SwitchEnumType4.STRING_smallint,
                        "smallint",
                        SwitchEnumType4.STRING_integer,
                        "integer",
                        SwitchEnumType4.STRING_bigint,
                        "bigint",
                        SwitchEnumType4.STRING_float,
                        "float",
                        SwitchEnumType4.STRING_string,
                        "string",
                        SwitchEnumType4.STRING_text,
                        "text",
                        SwitchEnumType4.STRING_datetime,
                        "datetime",
                        SwitchEnumType4.STRING_date,
                        "date",
                        SwitchEnumType4.STRING_time,
                        "time");
        switch (switchVariable4) {
            case STRING_boolean:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object generator = null;
                                generator = this.contextReferences.getCapturedValue("generator");
                                return ZVal.assign(
                                        toObjectR(generator)
                                                .accessProp(this, env)
                                                .name("boolean")
                                                .value());
                            }
                        }.use("generator", generator));
            case STRING_decimal:
                size =
                        ZVal.assign(
                                arrayActionR(
                                                ArrayAction.ISSET,
                                                new ReferenceClassProperty(
                                                        _pClass, "fieldMappings", env),
                                                env,
                                                fieldName,
                                                "precision")
                                        ? new ReferenceClassProperty(_pClass, "fieldMappings", env)
                                                .arrayGet(env, fieldName, "precision")
                                        : 2);
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object size = null;
                                Object generator = null;
                                size = this.contextReferences.getCapturedValue("size");
                                generator = this.contextReferences.getCapturedValue("generator");
                                return ZVal.assign(
                                        ZVal.divide(
                                                env.callMethod(
                                                        generator,
                                                        "randomNumber",
                                                        ColumnTypeGuesser.class,
                                                        ZVal.add(size, 2)),
                                                100));
                            }
                        }.use("size", size).use("generator", generator));
            case STRING_smallint:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return ZVal.assign(
                                        NamespaceGlobal.mt_rand.env(env).call(0, 65535).value());
                            }
                        });
            case STRING_integer:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return ZVal.assign(
                                        NamespaceGlobal.mt_rand
                                                .env(env)
                                                .call(
                                                        0,
                                                        NamespaceGlobal.intval
                                                                .env(env)
                                                                .call("2147483647")
                                                                .value())
                                                .value());
                            }
                        });
            case STRING_bigint:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return ZVal.assign(
                                        NamespaceGlobal.mt_rand
                                                .env(env)
                                                .call(
                                                        0,
                                                        NamespaceGlobal.intval
                                                                .env(env)
                                                                .call("18446744073709551615")
                                                                .value())
                                                .value());
                            }
                        });
            case STRING_float:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return ZVal.assign(
                                        ZVal.divide(
                                                NamespaceGlobal.mt_rand
                                                        .env(env)
                                                        .call(
                                                                0,
                                                                NamespaceGlobal.intval
                                                                        .env(env)
                                                                        .call("4294967295")
                                                                        .value())
                                                        .value(),
                                                NamespaceGlobal.mt_rand
                                                        .env(env)
                                                        .call(
                                                                1,
                                                                NamespaceGlobal.intval
                                                                        .env(env)
                                                                        .call("4294967295")
                                                                        .value())
                                                        .value()));
                            }
                        });
            case STRING_string:
                size =
                        ZVal.assign(
                                arrayActionR(
                                                ArrayAction.ISSET,
                                                new ReferenceClassProperty(
                                                        _pClass, "fieldMappings", env),
                                                env,
                                                fieldName,
                                                "length")
                                        ? new ReferenceClassProperty(_pClass, "fieldMappings", env)
                                                .arrayGet(env, fieldName, "length")
                                        : 255);
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object size = null;
                                Object generator = null;
                                size = this.contextReferences.getCapturedValue("size");
                                generator = this.contextReferences.getCapturedValue("generator");
                                return ZVal.assign(
                                        env.callMethod(
                                                generator, "text", ColumnTypeGuesser.class, size));
                            }
                        }.use("size", size).use("generator", generator));
            case STRING_text:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object generator = null;
                                generator = this.contextReferences.getCapturedValue("generator");
                                return ZVal.assign(
                                        toObjectR(generator)
                                                .accessProp(this, env)
                                                .name("text")
                                                .value());
                            }
                        }.use("generator", generator));
            case STRING_datetime:
            case STRING_date:
            case STRING_time:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Doctrine",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object generator = null;
                                generator = this.contextReferences.getCapturedValue("generator");
                                return ZVal.assign(
                                        toObjectR(generator)
                                                .accessProp(this, env)
                                                .name("datetime")
                                                .value());
                            }
                        }.use("generator", generator));
            case DEFAULT_CASE:
                return ZVal.assign(ZVal.getNull());
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Faker\\ORM\\Doctrine\\ColumnTypeGuesser";

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
                    .setName("Faker\\ORM\\Doctrine\\ColumnTypeGuesser")
                    .setLookup(
                            ColumnTypeGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator")
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/ORM/Doctrine/ColumnTypeGuesser.php")
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

    private enum SwitchEnumType4 {
        STRING_boolean,
        STRING_decimal,
        STRING_smallint,
        STRING_integer,
        STRING_bigint,
        STRING_float,
        STRING_string,
        STRING_text,
        STRING_datetime,
        STRING_date,
        STRING_time,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
