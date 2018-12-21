package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Resources.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Http/Resources/MergeValue.php

*/

public class MergeValue extends RuntimeClassBase {

    public Object data = null;

    public MergeValue(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MergeValue.class) {
            this.__construct(env, args);
        }
    }

    public MergeValue(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        this.data =
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        data, Collection.class, "Illuminate\\Support\\Collection"))
                        ? env.callMethod(data, "all", MergeValue.class)
                        : data;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Http\\Resources\\MergeValue";

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
                    .setName("Illuminate\\Http\\Resources\\MergeValue")
                    .setLookup(
                            MergeValue.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("data")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Http/Resources/MergeValue.php")
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
