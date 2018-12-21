package com.project.convertedCode.globalNamespace.namespaces.Faker.classes;

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
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.OverflowException;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/UniqueGenerator.php

*/

public class UniqueGenerator extends RuntimeClassBase {

    public Object generator = null;

    public Object maxRetries = null;

    public Object uniques = ZVal.newArray();

    public UniqueGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UniqueGenerator.class) {
            this.__construct(env, args);
        }
    }

    public UniqueGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Faker\\Generator")
    @ConvertedParameter(
        index = 1,
        name = "maxRetries",
        defaultValue = "10000",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        Object maxRetries = assignParameter(args, 1, true);
        if (null == maxRetries) {
            maxRetries = 10000;
        }
        this.generator = generator;
        this.maxRetries = maxRetries;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    public Object __get(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        return ZVal.assign(this.__call(env, attribute, ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "arguments")
    public Object __call(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object res = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "uniques", env), env, name)) {
            new ReferenceClassProperty(this, "uniques", env)
                    .arrayAccess(env, name)
                    .set(ZVal.newArray());
        }

        i.setObject(0);
        do {
            res =
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(new ZPair(0, this.generator), new ZPair(1, name)),
                                    arguments)
                            .value();
            i.setObject(ZVal.increment(i.getObject()));
            if (ZVal.isGreaterThan(i.getObject(), '>', this.maxRetries)) {
                throw ZVal.getException(
                        env,
                        new OverflowException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Maximum retries of %d reached without finding a unique value",
                                                this.maxRetries)
                                        .value()));
            }

        } while (function_array_key_exists
                .f
                .env(env)
                .call(
                        function_serialize.f.env(env).call(res).value(),
                        new ReferenceClassProperty(this, "uniques", env).arrayGet(env, name))
                .getBool());

        new ReferenceClassProperty(this, "uniques", env)
                .arrayAccess(env, name, function_serialize.f.env(env).call(res).value())
                .set(ZVal.getNull());
        return ZVal.assign(res);
    }

    public static final Object CONST_class = "Faker\\UniqueGenerator";

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
                    .setName("Faker\\UniqueGenerator")
                    .setLookup(
                            UniqueGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "maxRetries", "uniques")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/UniqueGenerator.php")
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
