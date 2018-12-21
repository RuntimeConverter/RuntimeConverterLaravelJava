package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.CakePHP.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
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

 vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/ColumnTypeGuesser.php

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
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "table")
    public Object guessFormat(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/ColumnTypeGuesser.php");
        Object column = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, false);
        Object schema = null;
        Object length = null;
        Object generator = null;
        ReferenceContainer columnData = new BasicReferenceContainer(null);
        generator = ZVal.assign(this.generator);
        schema = env.callMethod(table, "schema", ColumnTypeGuesser.class);
        SwitchEnumType3 switchVariable3 =
                ZVal.getEnum(
                        env.callMethod(schema, "columnType", ColumnTypeGuesser.class, column),
                        SwitchEnumType3.DEFAULT_CASE,
                        SwitchEnumType3.STRING_boolean,
                        "boolean",
                        SwitchEnumType3.STRING_integer,
                        "integer",
                        SwitchEnumType3.STRING_biginteger,
                        "biginteger",
                        SwitchEnumType3.STRING_decimal,
                        "decimal",
                        SwitchEnumType3.STRING_float,
                        "float",
                        SwitchEnumType3.STRING_uuid,
                        "uuid",
                        SwitchEnumType3.STRING_string,
                        "string",
                        SwitchEnumType3.STRING_text,
                        "text",
                        SwitchEnumType3.STRING_date,
                        "date",
                        SwitchEnumType3.STRING_datetime,
                        "datetime",
                        SwitchEnumType3.STRING_timestamp,
                        "timestamp",
                        SwitchEnumType3.STRING_time,
                        "time",
                        SwitchEnumType3.STRING_binary,
                        "binary");
        switch (switchVariable3) {
            case STRING_boolean:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\CakePHP",
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
            case STRING_integer:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\CakePHP",
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
            case STRING_biginteger:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\CakePHP",
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
            case STRING_decimal:
            case STRING_float:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\CakePHP",
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
                                        env.callMethod(
                                                generator, "randomFloat", ColumnTypeGuesser.class));
                            }
                        }.use("generator", generator));
            case STRING_uuid:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\CakePHP",
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
                                        env.callMethod(generator, "uuid", ColumnTypeGuesser.class));
                            }
                        }.use("generator", generator));
            case STRING_string:
                columnData.setObject(
                        env.callMethod(schema, "column", ColumnTypeGuesser.class, column));
                length = ZVal.assign(columnData.arrayGet(env, "length"));
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\CakePHP",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object length = null;
                                Object generator = null;
                                length = this.contextReferences.getCapturedValue("length");
                                generator = this.contextReferences.getCapturedValue("generator");
                                return ZVal.assign(
                                        env.callMethod(
                                                generator,
                                                "text",
                                                ColumnTypeGuesser.class,
                                                length));
                            }
                        }.use("length", length).use("generator", generator));
            case STRING_text:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\CakePHP",
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
                                        env.callMethod(generator, "text", ColumnTypeGuesser.class));
                            }
                        }.use("generator", generator));
            case STRING_date:
            case STRING_datetime:
            case STRING_timestamp:
            case STRING_time:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\CakePHP",
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
                                        env.callMethod(
                                                generator, "datetime", ColumnTypeGuesser.class));
                            }
                        }.use("generator", generator));
            case STRING_binary:
            case DEFAULT_CASE:
                return ZVal.assign(ZVal.getNull());
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Faker\\ORM\\CakePHP\\ColumnTypeGuesser";

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
                    .setName("Faker\\ORM\\CakePHP\\ColumnTypeGuesser")
                    .setLookup(
                            ColumnTypeGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator")
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/ORM/CakePHP/ColumnTypeGuesser.php")
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

    private enum SwitchEnumType3 {
        STRING_boolean,
        STRING_integer,
        STRING_biginteger,
        STRING_decimal,
        STRING_float,
        STRING_uuid,
        STRING_string,
        STRING_text,
        STRING_date,
        STRING_datetime,
        STRING_timestamp,
        STRING_time,
        STRING_binary,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
