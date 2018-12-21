package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.MessageBag;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/ViewErrorBag.php

*/

public class ViewErrorBag extends RuntimeClassBase implements Countable {

    public Object bags = ZVal.newArray();

    public ViewErrorBag(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ViewErrorBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasBag(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = "default";
        }
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "bags", env),
                        env,
                        key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getBag(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        Arr.runtimeStaticObject.get(env, this.bags, key))
                        ? ternaryExpressionTemp
                        : new MessageBag(env));
    }

    @ConvertedMethod
    public Object getBags(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bags);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "bag",
        typeHint = "Illuminate\\Contracts\\Support\\MessageBag"
    )
    public Object put(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object bag = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "bags", env).arrayAccess(env, key).set(bag);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object any(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isGreaterThan(this.count(env), '>', 0));
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.getBag(env, "default"), "count", ViewErrorBag.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.getBag(env, "default"),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        ViewErrorBag.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.getBag(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.put(env, key, value);
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.getBag(env, "default"), env));
    }

    public static final Object CONST_class = "Illuminate\\Support\\ViewErrorBag";

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
                    .setName("Illuminate\\Support\\ViewErrorBag")
                    .setLookup(
                            ViewErrorBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bags")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Support/ViewErrorBag.php")
                    .addInterface("Countable")
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
