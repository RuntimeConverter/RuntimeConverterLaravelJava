package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.ORM.namespaces.Mandango.classes;

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

 vendor/fzaninotto/faker/src/Faker/ORM/Mandango/ColumnTypeGuesser.php

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
    @ConvertedParameter(index = 0, name = "field")
    public Object guessFormat(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/ORM/Mandango")
                        .setFile(
                                "/vendor/fzaninotto/faker/src/Faker/ORM/Mandango/ColumnTypeGuesser.php");
        ReferenceContainer field = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object generator = null;
        generator = ZVal.assign(this.generator);
        SwitchEnumType5 switchVariable5 =
                ZVal.getEnum(
                        field.arrayGet(env, "type"),
                        SwitchEnumType5.DEFAULT_CASE,
                        SwitchEnumType5.STRING_boolean,
                        "boolean",
                        SwitchEnumType5.STRING_integer,
                        "integer",
                        SwitchEnumType5.STRING_float,
                        "float",
                        SwitchEnumType5.STRING_string,
                        "string",
                        SwitchEnumType5.STRING_date,
                        "date");
        switch (switchVariable5) {
            case STRING_boolean:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Mandango",
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
                                "Faker\\ORM\\Mandango",
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
                                                                .call("4294967295")
                                                                .value())
                                                .value());
                            }
                        });
            case STRING_float:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Mandango",
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
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Mandango",
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
                                                generator, "text", ColumnTypeGuesser.class, 255));
                            }
                        }.use("generator", generator));
            case STRING_date:
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\ORM\\Mandango",
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

    public static final Object CONST_class = "Faker\\ORM\\Mandango\\ColumnTypeGuesser";

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
                    .setName("Faker\\ORM\\Mandango\\ColumnTypeGuesser")
                    .setLookup(
                            ColumnTypeGuesser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator")
                    .setFilename(
                            "vendor/fzaninotto/faker/src/Faker/ORM/Mandango/ColumnTypeGuesser.php")
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

    private enum SwitchEnumType5 {
        STRING_boolean,
        STRING_integer,
        STRING_float,
        STRING_string,
        STRING_date,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
