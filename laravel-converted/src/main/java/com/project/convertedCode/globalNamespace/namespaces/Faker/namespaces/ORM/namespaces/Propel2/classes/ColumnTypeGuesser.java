package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Propel2.classes;

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

 vendor/fzaninotto/faker/src/Faker/ORM/Propel2/ColumnTypeGuesser.php

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
    @ConvertedParameter(index = 0, name = "column", typeHint = "Propel\\Runtime\\Map\\ColumnMap")
    public Object guessFormat(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Propel2")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/Propel2/ColumnTypeGuesser.php");
        Object column = assignParameter(args, 0, false);
        Object valueSet = null;
        Object size = null;
        Object generator = null;
        Object type = null;
        generator = ZVal.assign(this.generator);
        if (ZVal.isTrue(env.callMethod(column, "isTemporal", ColumnTypeGuesser.class))) {
            if (ZVal.toBool(
                            ZVal.equalityCheck(
                                    env.callMethod(column, "getType", ColumnTypeGuesser.class),
                                    ClassConstantUtils.getConstantValueByClass(
                                            env,
                                            ZVal.resolveClassAlias(env, "PropelTypes"),
                                            "BU_DATE")))
                    || ZVal.toBool(
                            ZVal.equalityCheck(
                                    env.callMethod(column, "getType", ColumnTypeGuesser.class),
                                    ClassConstantUtils.getConstantValueByClass(
                                            env,
                                            ZVal.resolveClassAlias(env, "PropelTypes"),
                                            "BU_TIMESTAMP")))) {
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
                                "Faker\\ORM\\Propel2",
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
        SwitchEnumType7 switchVariable7 =
                ZVal.getEnum(
                        type,
                        SwitchEnumType7.DEFAULT_CASE,
                        SwitchEnumType7.DYNAMIC_TYPE_24,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "BOOLEAN"),
                        SwitchEnumType7.DYNAMIC_TYPE_25,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "BOOLEAN_EMU"),
                        SwitchEnumType7.DYNAMIC_TYPE_26,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "NUMERIC"),
                        SwitchEnumType7.DYNAMIC_TYPE_27,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "DECIMAL"),
                        SwitchEnumType7.DYNAMIC_TYPE_28,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "TINYINT"),
                        SwitchEnumType7.DYNAMIC_TYPE_29,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "SMALLINT"),
                        SwitchEnumType7.DYNAMIC_TYPE_30,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "INTEGER"),
                        SwitchEnumType7.DYNAMIC_TYPE_31,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "BIGINT"),
                        SwitchEnumType7.DYNAMIC_TYPE_32,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "FLOAT"),
                        SwitchEnumType7.DYNAMIC_TYPE_33,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "DOUBLE"),
                        SwitchEnumType7.DYNAMIC_TYPE_34,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "REAL"),
                        SwitchEnumType7.DYNAMIC_TYPE_35,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "CHAR"),
                        SwitchEnumType7.DYNAMIC_TYPE_36,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "VARCHAR"),
                        SwitchEnumType7.DYNAMIC_TYPE_37,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "BINARY"),
                        SwitchEnumType7.DYNAMIC_TYPE_38,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "VARBINARY"),
                        SwitchEnumType7.DYNAMIC_TYPE_39,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "LONGVARCHAR"),
                        SwitchEnumType7.DYNAMIC_TYPE_40,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "LONGVARBINARY"),
                        SwitchEnumType7.DYNAMIC_TYPE_41,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "CLOB"),
                        SwitchEnumType7.DYNAMIC_TYPE_42,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "CLOB_EMU"),
                        SwitchEnumType7.DYNAMIC_TYPE_43,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "BLOB"),
                        SwitchEnumType7.DYNAMIC_TYPE_44,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "ENUM"),
                        SwitchEnumType7.DYNAMIC_TYPE_45,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "OBJECT"),
                        SwitchEnumType7.DYNAMIC_TYPE_46,
                        ClassConstantUtils.getConstantValueByClass(
                                env, ZVal.resolveClassAlias(env, "PropelTypes"), "PHP_ARRAY"));
        switch (switchVariable7) {
            case DYNAMIC_TYPE_24:
            case DYNAMIC_TYPE_25:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_26:
            case DYNAMIC_TYPE_27:
                size = env.callMethod(column, "getSize", ColumnTypeGuesser.class);
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_28:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_29:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_30:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_31:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_32:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_33:
            case DYNAMIC_TYPE_34:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_35:
            case DYNAMIC_TYPE_36:
            case DYNAMIC_TYPE_37:
            case DYNAMIC_TYPE_38:
                size = env.callMethod(column, "getSize", ColumnTypeGuesser.class);
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_39:
            case DYNAMIC_TYPE_40:
            case DYNAMIC_TYPE_41:
            case DYNAMIC_TYPE_42:
            case DYNAMIC_TYPE_43:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_44:
                valueSet = env.callMethod(column, "getValueSet", ColumnTypeGuesser.class);
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Propel2",
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
            case DYNAMIC_TYPE_45:
            case DYNAMIC_TYPE_46:
            case DEFAULT_CASE:
                return ZVal.assign(ZVal.getNull());
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Faker\\ORM\\Propel2\\ColumnTypeGuesser";

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
                    .setName("Faker\\ORM\\Propel2\\ColumnTypeGuesser")
                    .setLookup(
                            ColumnTypeGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator")
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/ORM/Propel2/ColumnTypeGuesser.php")
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

    private enum SwitchEnumType7 {
        DYNAMIC_TYPE_24,
        DYNAMIC_TYPE_25,
        DYNAMIC_TYPE_26,
        DYNAMIC_TYPE_27,
        DYNAMIC_TYPE_28,
        DYNAMIC_TYPE_29,
        DYNAMIC_TYPE_30,
        DYNAMIC_TYPE_31,
        DYNAMIC_TYPE_32,
        DYNAMIC_TYPE_33,
        DYNAMIC_TYPE_34,
        DYNAMIC_TYPE_35,
        DYNAMIC_TYPE_36,
        DYNAMIC_TYPE_37,
        DYNAMIC_TYPE_38,
        DYNAMIC_TYPE_39,
        DYNAMIC_TYPE_40,
        DYNAMIC_TYPE_41,
        DYNAMIC_TYPE_42,
        DYNAMIC_TYPE_43,
        DYNAMIC_TYPE_44,
        DYNAMIC_TYPE_45,
        DYNAMIC_TYPE_46,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
