package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractContextAwareMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/AbstractDefaultParametersMatcher.php

*/

public abstract class AbstractDefaultParametersMatcher extends AbstractContextAwareMatcher {

    public AbstractDefaultParametersMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractDefaultParametersMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionParameters", typeHint = "array")
    public Object getDefaultParameterCompletion(RuntimeEnv env, Object... args) {
        Object reflectionParameters = assignParameter(args, 0, false);
        ReferenceContainer parametersProcessed = new BasicReferenceContainer(null);
        Object defaultValue = null;
        Object parameter = null;
        parametersProcessed.setObject(ZVal.newArray());
        for (ZPair zpairResult1418 : ZVal.getIterable(reflectionParameters, env, true)) {
            parameter = ZVal.assign(zpairResult1418.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            parameter,
                            "isDefaultValueAvailable",
                            AbstractDefaultParametersMatcher.class))) {
                return ZVal.assign(ZVal.newArray());
            }

            defaultValue =
                    this.valueToShortString(
                            env,
                            env.callMethod(
                                    parameter,
                                    "getDefaultValue",
                                    AbstractDefaultParametersMatcher.class));
            parametersProcessed
                    .arrayAppend(env)
                    .set(
                            "$"
                                    + toStringR(
                                            env.callMethod(
                                                    parameter,
                                                    "getName",
                                                    AbstractDefaultParametersMatcher.class),
                                            env)
                                    + " = "
                                    + toStringR(defaultValue, env));
        }

        if (ZVal.isEmpty(parametersProcessed.getObject())) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", parametersProcessed.getObject())
                                                        .value(),
                                                env)
                                        + ")")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object valueToShortString(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object item = null;
        Object chunksToImplode = null;
        ReferenceContainer chunks = new BasicReferenceContainer(null);
        ReferenceContainer chunksSequential = new BasicReferenceContainer(null);
        Object allSequential = null;
        Object keyString = null;
        Object itemString = null;
        Object key = null;
        if (!function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(value).value());
        }

        chunks.setObject(ZVal.newArray());
        chunksSequential.setObject(ZVal.newArray());
        allSequential = true;
        for (ZPair zpairResult1419 : ZVal.getIterable(value, env, false)) {
            key = ZVal.assign(zpairResult1419.getKey());
            item = ZVal.assign(zpairResult1419.getValue());
            allSequential =
                    ZVal.toBool(
                                    ZVal.toBool(allSequential)
                                            && ZVal.toBool(
                                                    function_is_numeric
                                                            .f
                                                            .env(env)
                                                            .call(key)
                                                            .value()))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            key,
                                            "===",
                                            function_count
                                                    .f
                                                    .env(env)
                                                    .call(chunksSequential.getObject())
                                                    .value()));
            keyString = this.valueToShortString(env, key);
            itemString = this.valueToShortString(env, item);
            chunks.arrayAppend(env)
                    .set(toStringR(keyString, env) + " => " + toStringR(itemString, env));
            chunksSequential.arrayAppend(env).set(itemString);
        }

        chunksToImplode =
                ZVal.assign(
                        ZVal.isTrue(allSequential)
                                ? chunksSequential.getObject()
                                : chunks.getObject());
        return ZVal.assign(
                "["
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(", ", chunksToImplode)
                                        .value(),
                                env)
                        + "]");
    }

    public static final Object CONST_class =
            "Psy\\TabCompletion\\Matcher\\AbstractDefaultParametersMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractContextAwareMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\TabCompletion\\Matcher\\AbstractDefaultParametersMatcher")
                    .setLookup(
                            AbstractDefaultParametersMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("context")
                    .setFilename(
                            "vendor/psy/psysh/src/TabCompletion/Matcher/AbstractDefaultParametersMatcher.php")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass("Psy\\TabCompletion\\Matcher\\AbstractContextAwareMatcher")
                    .addExtendsClass("Psy\\TabCompletion\\Matcher\\AbstractMatcher")
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
