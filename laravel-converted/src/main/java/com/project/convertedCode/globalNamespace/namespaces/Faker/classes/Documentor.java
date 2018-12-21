package com.project.convertedCode.globalNamespace.namespaces.Faker.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Faker.classes.UniqueGenerator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Faker.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Documentor.php

*/

public class Documentor extends RuntimeClassBase {

    public Object generator = null;

    public Documentor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Documentor.class) {
            this.__construct(env, args);
        }
    }

    public Documentor(NoConstructor n) {
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
    public Object getFormatters(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object e = null;
        Object reflmethod = null;
        Object methodName = null;
        Object refl = null;
        Object example = null;
        ReferenceContainer formatters = new BasicReferenceContainer(null);
        Object provider = null;
        Object parameter = null;
        Object reflparameter = null;
        ReferenceContainer parameters = new BasicReferenceContainer(null);
        ReferenceContainer providers = new BasicReferenceContainer(null);
        Object providerClass = null;
        formatters.setObject(ZVal.newArray());
        providers.setObject(
                function_array_reverse
                        .f
                        .env(env)
                        .call(env.callMethod(this.generator, "getProviders", Documentor.class))
                        .value());
        providers.arrayAppend(env).set(new Base(env, this.generator));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult64 : ZVal.getIterable(providers.getObject(), env, true)) {
            provider = ZVal.assign(zpairResult64.getValue());
            providerClass = function_get_class.f.env(env).call(provider).value();
            formatters.arrayAccess(env, providerClass).set(ZVal.newArray());
            refl = new ReflectionObject(env, provider);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult65 :
                    ZVal.getIterable(
                            env.callMethod(refl, "getMethods", Documentor.class, 256), env, true)) {
                reflmethod = ZVal.assign(zpairResult65.getValue());
                if (ZVal.toBool(
                                ZVal.equalityCheck(
                                        env.callMethod(
                                                env.callMethod(
                                                        reflmethod,
                                                        "getDeclaringClass",
                                                        Documentor.class),
                                                "getName",
                                                Documentor.class),
                                        "Faker\\Provider\\Base"))
                        && ZVal.toBool(
                                ZVal.notEqualityCheck(providerClass, "Faker\\Provider\\Base"))) {
                    continue;
                }

                methodName =
                        ZVal.assign(
                                toObjectR(reflmethod).accessProp(this, env).name("name").value());
                if (ZVal.isTrue(env.callMethod(reflmethod, "isConstructor", Documentor.class))) {
                    continue;
                }

                parameters.setObject(ZVal.newArray());
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult66 :
                        ZVal.getIterable(
                                env.callMethod(reflmethod, "getParameters", Documentor.class),
                                env,
                                true)) {
                    reflparameter = ZVal.assign(zpairResult66.getValue());
                    parameter =
                            "$"
                                    + toStringR(
                                            env.callMethod(
                                                    reflparameter, "getName", Documentor.class),
                                            env);
                    if (ZVal.isTrue(
                            env.callMethod(
                                    reflparameter, "isDefaultValueAvailable", Documentor.class))) {
                        parameter =
                                toStringR(parameter, env)
                                        + " = "
                                        + toStringR(
                                                NamespaceGlobal.var_export
                                                        .env(env)
                                                        .call(
                                                                env.callMethod(
                                                                        reflparameter,
                                                                        "getDefaultValue",
                                                                        Documentor.class),
                                                                true)
                                                        .value(),
                                                env);
                    }

                    parameters.arrayAppend(env).set(parameter);
                }

                parameters.setObject(
                        ZVal.assign(
                                ZVal.isTrue(parameters.getObject())
                                        ? "("
                                                + toStringR(
                                                        NamespaceGlobal.join
                                                                .env(env)
                                                                .call(", ", parameters.getObject())
                                                                .value(),
                                                        env)
                                                + ")"
                                        : ""));
                try {
                    example =
                            env.callMethod(this.generator, "format", Documentor.class, methodName);
                } catch (ConvertedException convertedException11) {
                    if (convertedException11.instanceOf(
                            InvalidArgumentException.class, "InvalidArgumentException")) {
                        e = convertedException11.getObject();
                        example = "";
                    } else {
                        throw convertedException11;
                    }
                }

                if (function_is_array.f.env(env).call(example).getBool()) {
                    example =
                            "array('"
                                    + toStringR(
                                            NamespaceGlobal.join
                                                    .env(env)
                                                    .call("', '", example)
                                                    .value(),
                                            env)
                                    + "')";

                } else if (ZVal.isTrue(
                        ZVal.checkInstanceType(example, DateTime.class, "DateTime"))) {
                    example =
                            "DateTime('"
                                    + toStringR(
                                            env.callMethod(
                                                    example,
                                                    "format",
                                                    Documentor.class,
                                                    "Y-m-d H:i:s"),
                                            env)
                                    + "')";

                } else if (ZVal.toBool(
                                ZVal.checkInstanceType(
                                        example, Generator.class, "Faker\\Generator"))
                        || ZVal.toBool(
                                ZVal.checkInstanceType(
                                        example,
                                        UniqueGenerator.class,
                                        "Faker\\UniqueGenerator"))) {
                    example = "";

                } else {
                    example = NamespaceGlobal.var_export.env(env).call(example, true).value();
                }

                formatters
                        .arrayAccess(
                                env,
                                providerClass,
                                toStringR(methodName, env) + toStringR(parameters.getObject(), env))
                        .set(example);
            }
        }

        return ZVal.assign(formatters.getObject());
    }

    public static final Object CONST_class = "Faker\\Documentor";

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
                    .setName("Faker\\Documentor")
                    .setLookup(
                            Documentor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Documentor.php")
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
