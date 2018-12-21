package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Guesser.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Guesser/Name.php

*/

public class Name extends RuntimeClassBase {

    public Object generator = null;

    public Name(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Name.class) {
            this.__construct(env, args);
        }
    }

    public Name(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "size",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object guessFormat(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker/Guesser")
                        .setFile("/vendor/fzaninotto/faker/src/Faker/Guesser/Name.php");
        int runtimeConverterBreakCount;
        Object name = assignParameter(args, 0, false);
        Object size = assignParameter(args, 1, true);
        if (null == size) {
            size = ZVal.getNull();
        }
        Object generator = null;
        name = Base.runtimeStaticObject.toLower(env, name);
        generator = ZVal.assign(this.generator);
        if (function_preg_match.f.env(env).call("/^is[_A-Z]/", name).getBool()) {
            return ZVal.assign(
                    new Closure(
                            env, runtimeConverterFunctionClassConstants, "Faker\\Guesser", this) {
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
        }

        if (function_preg_match.f.env(env).call("/(_a|A)t$/", name).getBool()) {
            return ZVal.assign(
                    new Closure(
                            env, runtimeConverterFunctionClassConstants, "Faker\\Guesser", this) {
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
        }

        switch (toStringR(function_str_replace.f.env(env).call("_", "", name).value())) {
            case "firstname":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("firstName")
                                                .value());
                            }
                        }.use("generator", generator));
            case "lastname":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("lastName")
                                                .value());
                            }
                        }.use("generator", generator));
            case "username":
            case "login":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("userName")
                                                .value());
                            }
                        }.use("generator", generator));
            case "email":
            case "emailaddress":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("email")
                                                .value());
                            }
                        }.use("generator", generator));
            case "phonenumber":
            case "phone":
            case "telephone":
            case "telnumber":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("phoneNumber")
                                                .value());
                            }
                        }.use("generator", generator));
            case "address":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("address")
                                                .value());
                            }
                        }.use("generator", generator));
            case "city":
            case "town":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("city")
                                                .value());
                            }
                        }.use("generator", generator));
            case "streetaddress":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("streetAddress")
                                                .value());
                            }
                        }.use("generator", generator));
            case "postcode":
            case "zipcode":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("postcode")
                                                .value());
                            }
                        }.use("generator", generator));
            case "state":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("state")
                                                .value());
                            }
                        }.use("generator", generator));
            case "county":
                if (ZVal.equalityCheck(
                        toObjectR(this.generator).accessProp(this, env).name("locale").value(),
                        "en_US")) {
                    return ZVal.assign(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Faker\\Guesser",
                                    this) {
                                @Override
                                @ConvertedMethod
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object generator = null;
                                    generator =
                                            this.contextReferences.getCapturedValue("generator");
                                    return ZVal.assign(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "%s County",
                                                            toObjectR(generator)
                                                                    .accessProp(this, env)
                                                                    .name("city")
                                                                    .value())
                                                    .value());
                                }
                            }.use("generator", generator));
                }

                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("state")
                                                .value());
                            }
                        }.use("generator", generator));
            case "country":
                SwitchEnumType2 switchVariable2 =
                        ZVal.getEnum(
                                size,
                                SwitchEnumType2.DEFAULT_CASE,
                                SwitchEnumType2.INTEGER_2,
                                2,
                                SwitchEnumType2.INTEGER_3,
                                3,
                                SwitchEnumType2.INTEGER_5,
                                5,
                                SwitchEnumType2.INTEGER_6,
                                6);
                switch (switchVariable2) {
                    case INTEGER_2:
                        return ZVal.assign(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Faker\\Guesser",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object generator = null;
                                        generator =
                                                this.contextReferences.getCapturedValue(
                                                        "generator");
                                        return ZVal.assign(
                                                toObjectR(generator)
                                                        .accessProp(this, env)
                                                        .name("countryCode")
                                                        .value());
                                    }
                                }.use("generator", generator));
                    case INTEGER_3:
                        return ZVal.assign(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Faker\\Guesser",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object generator = null;
                                        generator =
                                                this.contextReferences.getCapturedValue(
                                                        "generator");
                                        return ZVal.assign(
                                                toObjectR(generator)
                                                        .accessProp(this, env)
                                                        .name("countryISOAlpha3")
                                                        .value());
                                    }
                                }.use("generator", generator));
                    case INTEGER_5:
                    case INTEGER_6:
                        return ZVal.assign(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Faker\\Guesser",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object generator = null;
                                        generator =
                                                this.contextReferences.getCapturedValue(
                                                        "generator");
                                        return ZVal.assign(
                                                toObjectR(generator)
                                                        .accessProp(this, env)
                                                        .name("locale")
                                                        .value());
                                    }
                                }.use("generator", generator));
                    case DEFAULT_CASE:
                        return ZVal.assign(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Faker\\Guesser",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object generator = null;
                                        generator =
                                                this.contextReferences.getCapturedValue(
                                                        "generator");
                                        return ZVal.assign(
                                                toObjectR(generator)
                                                        .accessProp(this, env)
                                                        .name("country")
                                                        .value());
                                    }
                                }.use("generator", generator));
                }
                ;
                break;
            case "locale":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("locale")
                                                .value());
                            }
                        }.use("generator", generator));
            case "currency":
            case "currencycode":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("currencyCode")
                                                .value());
                            }
                        }.use("generator", generator));
            case "url":
            case "website":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("url")
                                                .value());
                            }
                        }.use("generator", generator));
            case "company":
            case "companyname":
            case "employer":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("company")
                                                .value());
                            }
                        }.use("generator", generator));
            case "title":
                if (ZVal.toBool(ZVal.strictNotEqualityCheck(size, "!==", ZVal.getNull()))
                        && ZVal.toBool(ZVal.isLessThanOrEqualTo(size, "<=", 10))) {
                    return ZVal.assign(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Faker\\Guesser",
                                    this) {
                                @Override
                                @ConvertedMethod
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object generator = null;
                                    generator =
                                            this.contextReferences.getCapturedValue("generator");
                                    return ZVal.assign(
                                            toObjectR(generator)
                                                    .accessProp(this, env)
                                                    .name("title")
                                                    .value());
                                }
                            }.use("generator", generator));
                }

                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
                                                .name("sentence")
                                                .value());
                            }
                        }.use("generator", generator));
            case "body":
            case "summary":
            case "article":
            case "description":
                return ZVal.assign(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Faker\\Guesser",
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
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Faker\\Guesser\\Name";

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
                    .setName("Faker\\Guesser\\Name")
                    .setLookup(
                            Name.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Guesser/Name.php")
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

    private enum SwitchEnumType2 {
        INTEGER_2,
        INTEGER_3,
        INTEGER_5,
        INTEGER_6,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
