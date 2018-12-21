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
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Generator.php

*/

public class Generator extends RuntimeClassBase {

    public Object providers = ZVal.newArray();

    public Object formatters = ZVal.newArray();

    public Generator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Generator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    public Object addProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        function_array_unshift.f.env(env).call(this.providers, provider);
        return null;
    }

    @ConvertedMethod
    public Object getProviders(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.providers);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "seed",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object seed(RuntimeEnv env, Object... args) {
        Object seed = assignParameter(args, 0, true);
        if (null == seed) {
            seed = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(seed, "===", ZVal.getNull())) {
            NamespaceGlobal.mt_srand.env(env).call();

        } else {
            if (ZVal.isLessThan(70211, '<', 70100)) {
                NamespaceGlobal.mt_srand.env(env).call(ZVal.toLong(seed));

            } else {
                NamespaceGlobal.mt_srand.env(env).call(ZVal.toLong(seed), 1);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "formatter")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object format(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(this.getFormatter(env, formatter), arguments)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "formatter")
    public Object getFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        Object provider = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "formatters", env),
                env,
                formatter)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "formatters", env).arrayGet(env, formatter));
        }

        for (ZPair zpairResult68 : ZVal.getIterable(this.providers, env, true)) {
            provider = ZVal.assign(zpairResult68.getValue());
            if (function_method_exists.f.env(env).call(provider, formatter).getBool()) {
                new ReferenceClassProperty(this, "formatters", env)
                        .arrayAccess(env, formatter)
                        .set(ZVal.newArray(new ZPair(0, provider), new ZPair(1, formatter)));
                return ZVal.assign(
                        new ReferenceClassProperty(this, "formatters", env)
                                .arrayGet(env, formatter));
            }
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call("Unknown formatter \"%s\"", formatter)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    public Object parse(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/\\{\\{\\s?(\\w+)\\s?\\}\\}/u",
                                ZVal.newArray(
                                        new ZPair(0, this), new ZPair(1, "callFormatWithMatches")),
                                string)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matches")
    protected Object callFormatWithMatches(RuntimeEnv env, Object... args) {
        ReferenceContainer matches = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(this.format(env, matches.arrayGet(env, 1)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    public Object __get(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        return ZVal.assign(this.format(env, attribute));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "attributes")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, false);
        return ZVal.assign(this.format(env, method, attributes));
    }

    public static final Object CONST_class = "Faker\\Generator";

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
                    .setName("Faker\\Generator")
                    .setLookup(
                            Generator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("formatters", "providers")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Generator.php")
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
