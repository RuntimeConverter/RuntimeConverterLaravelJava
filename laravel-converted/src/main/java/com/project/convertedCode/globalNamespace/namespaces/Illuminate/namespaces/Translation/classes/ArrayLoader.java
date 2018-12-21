package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Translation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Translation.classes.Loader;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Translation/ArrayLoader.php

*/

public class ArrayLoader extends RuntimeClassBase implements Loader {

    public Object messages = ZVal.newArray();

    public ArrayLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ArrayLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "group")
    @ConvertedParameter(
        index = 2,
        name = "namespace",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object group = assignParameter(args, 1, false);
        Object namespace = assignParameter(args, 2, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        namespace =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = namespace)
                                ? ternaryExpressionTemp
                                : "*");
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "messages", env),
                env,
                namespace,
                locale,
                group)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "messages", env)
                            .arrayGet(env, namespace, locale, group));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hint")
    public Object addNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object hint = assignParameter(args, 1, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object addJsonPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "group")
    @ConvertedParameter(index = 2, name = "messages", typeHint = "array")
    @ConvertedParameter(
        index = 3,
        name = "namespace",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addMessages(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object group = assignParameter(args, 1, false);
        Object messages = assignParameter(args, 2, false);
        Object namespace = assignParameter(args, 3, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        namespace =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = namespace)
                                ? ternaryExpressionTemp
                                : "*");
        new ReferenceClassProperty(this, "messages", env)
                .arrayAccess(env, namespace, locale, group)
                .set(messages);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object namespaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    public static final Object CONST_class = "Illuminate\\Translation\\ArrayLoader";

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
                    .setName("Illuminate\\Translation\\ArrayLoader")
                    .setLookup(
                            ArrayLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("messages")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Translation/ArrayLoader.php")
                    .addInterface("Illuminate\\Contracts\\Translation\\Loader")
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
