package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Propel.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ORM/Propel/ColumnTypeGuesser.php

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
    @ConvertedParameter(index = 0, name = "column", typeHint = "ColumnMap")
    public Object guessFormat(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Propel")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/Propel/ColumnTypeGuesser.php");
        Object column = assignParameter(args, 0, false);
        Object valueSet = null;
        Object size = null;
        Object generator = null;
        Object type = null;
        generator = ZVal.assign(this.generator);
        if (ZVal.isTrue(env.callMethod(column, "isTemporal", ColumnTypeGuesser.class))) {
            if (ZVal.isTrue(env.callMethod(column, "isEpochTemporal", ColumnTypeGuesser.class))) {
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
                                                .name("dateTime")
                                                .value());
                            }
                        }.use("generator", generator));

            } else {
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
                                                .name("dateTimeAD")
                                                .value());
                            }
                        }.use("generator", generator));
            }
        }

        type = env.callMethod(column, "getType", ColumnTypeGuesser.class);
        SwitchEnumType6 switchVariable6 =
                ZVal.getEnum(
                        type,
                        SwitchEnumType6.DEFAULT_CASE,
                        SwitchEnumType6.DYNAMIC_TYPE_1,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "BOOLEAN"),
                        SwitchEnumType6.DYNAMIC_TYPE_2,
                        ClassConstantUtils.getConstantValueByClass(
                                env,
                                ZVal.resolveClassAlias(env, "PropelColumnTypes"),
                                "BOOLEAN_EMU"),
                        SwitchEnumType6.DYNAMIC_TYPE_3,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "NUMERIC"),
                        SwitchEnumType6.DYNAMIC_TYPE_4,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "DECIMAL"),
                        SwitchEnumType6.DYNAMIC_TYPE_5,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "TINYINT"),
                        SwitchEnumType6.DYNAMIC_TYPE_6,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "SMALLINT"),
                        SwitchEnumType6.DYNAMIC_TYPE_7,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "INTEGER"),
                        SwitchEnumType6.DYNAMIC_TYPE_8,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "BIGINT"),
                        SwitchEnumType6.DYNAMIC_TYPE_9,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "FLOAT"),
                        SwitchEnumType6.DYNAMIC_TYPE_10,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "DOUBLE"),
                        SwitchEnumType6.DYNAMIC_TYPE_11,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "REAL"),
                        SwitchEnumType6.DYNAMIC_TYPE_12,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "CHAR"),
                        SwitchEnumType6.DYNAMIC_TYPE_13,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "VARCHAR"),
                        SwitchEnumType6.DYNAMIC_TYPE_14,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "BINARY"),
                        SwitchEnumType6.DYNAMIC_TYPE_15,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "VARBINARY"),
                        SwitchEnumType6.DYNAMIC_TYPE_16,
                        ClassConstantUtils.getConstantValueByClass(
                                env,
                                ZVal.resolveClassAlias(env, "PropelColumnTypes"),
                                "LONGVARCHAR"),
                        SwitchEnumType6.DYNAMIC_TYPE_17,
                        ClassConstantUtils.getConstantValueByClass(
                                env,
                                ZVal.resolveClassAlias(env, "PropelColumnTypes"),
                                "LONGVARBINARY"),
                        SwitchEnumType6.DYNAMIC_TYPE_18,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "CLOB"),
                        SwitchEnumType6.DYNAMIC_TYPE_19,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "CLOB_EMU"),
                        SwitchEnumType6.DYNAMIC_TYPE_20,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "BLOB"),
                        SwitchEnumType6.DYNAMIC_TYPE_21,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "ENUM"),
                        SwitchEnumType6.DYNAMIC_TYPE_22,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelColumnTypes"), "OBJECT"),
                        SwitchEnumType6.DYNAMIC_TYPE_23,
                        ClassConstantUtils.getConstantValueByClass(
                                env,
                                ZVal.resolveClassAlias(env, "PropelColumnTypes"),
                                "PHP_ARRAY"));
        switch (switchVariable6) {
            case DYNAMIC_TYPE_1:
            case DYNAMIC_TYPE_2:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
            case DYNAMIC_TYPE_3:
            case DYNAMIC_TYPE_4:
                size = env.callMethod(column, "getSize", ColumnTypeGuesser.class);
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
            case DYNAMIC_TYPE_5:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return ZVal.assign(
                                        NamespaceGlobal.mt_rand.env(env).call(0, 127).value());
                            }
                        });
            case DYNAMIC_TYPE_6:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return ZVal.assign(
                                        NamespaceGlobal.mt_rand.env(env).call(0, 32767).value());
                            }
                        });
            case DYNAMIC_TYPE_7:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
            case DYNAMIC_TYPE_8:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
                                                                .call("9223372036854775807")
                                                                .value())
                                                .value());
                            }
                        });
            case DYNAMIC_TYPE_9:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
                                                                        .call("2147483647")
                                                                        .value())
                                                        .value(),
                                                NamespaceGlobal.mt_rand
                                                        .env(env)
                                                        .call(
                                                                1,
                                                                NamespaceGlobal.intval
                                                                        .env(env)
                                                                        .call("2147483647")
                                                                        .value())
                                                        .value()));
                            }
                        });
            case DYNAMIC_TYPE_10:
            case DYNAMIC_TYPE_11:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
                                                                        .call("9223372036854775807")
                                                                        .value())
                                                        .value(),
                                                NamespaceGlobal.mt_rand
                                                        .env(env)
                                                        .call(
                                                                1,
                                                                NamespaceGlobal.intval
                                                                        .env(env)
                                                                        .call("9223372036854775807")
                                                                        .value())
                                                        .value()));
                            }
                        });
            case DYNAMIC_TYPE_12:
            case DYNAMIC_TYPE_13:
            case DYNAMIC_TYPE_14:
            case DYNAMIC_TYPE_15:
                size = env.callMethod(column, "getSize", ColumnTypeGuesser.class);
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
            case DYNAMIC_TYPE_16:
            case DYNAMIC_TYPE_17:
            case DYNAMIC_TYPE_18:
            case DYNAMIC_TYPE_19:
            case DYNAMIC_TYPE_20:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
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
            case DYNAMIC_TYPE_21:
                valueSet = env.callMethod(column, "getValueSet", ColumnTypeGuesser.class);
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object valueSet = null;
                                Object generator = null;
                                valueSet = this.contextReferences.getCapturedValue("valueSet");
                                generator = this.contextReferences.getCapturedValue("generator");
                                return ZVal.assign(
                                        env.callMethod(
                                                generator,
                                                "randomElement",
                                                ColumnTypeGuesser.class,
                                                valueSet));
                            }
                        }.use("valueSet", valueSet).use("generator", generator));
            case DYNAMIC_TYPE_22:
            case DYNAMIC_TYPE_23:
            case DEFAULT_CASE:
                return ZVal.assign(ZVal.getNull());
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Faker\\ORM\\Propel\\ColumnTypeGuesser";

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
                    .setName("Faker\\ORM\\Propel\\ColumnTypeGuesser")
                    .setLookup(
                            ColumnTypeGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator")
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/ORM/Propel/ColumnTypeGuesser.php")
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

    private enum SwitchEnumType6 {
        DYNAMIC_TYPE_1,
        DYNAMIC_TYPE_2,
        DYNAMIC_TYPE_3,
        DYNAMIC_TYPE_4,
        DYNAMIC_TYPE_5,
        DYNAMIC_TYPE_6,
        DYNAMIC_TYPE_7,
        DYNAMIC_TYPE_8,
        DYNAMIC_TYPE_9,
        DYNAMIC_TYPE_10,
        DYNAMIC_TYPE_11,
        DYNAMIC_TYPE_12,
        DYNAMIC_TYPE_13,
        DYNAMIC_TYPE_14,
        DYNAMIC_TYPE_15,
        DYNAMIC_TYPE_16,
        DYNAMIC_TYPE_17,
        DYNAMIC_TYPE_18,
        DYNAMIC_TYPE_19,
        DYNAMIC_TYPE_20,
        DYNAMIC_TYPE_21,
        DYNAMIC_TYPE_22,
        DYNAMIC_TYPE_23,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
