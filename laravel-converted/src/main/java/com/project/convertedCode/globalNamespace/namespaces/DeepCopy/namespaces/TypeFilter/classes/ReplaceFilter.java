package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.classes.TypeFilter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/ReplaceFilter.php

*/

public class ReplaceFilter extends RuntimeClassBase implements TypeFilter {

    public Object callback = null;

    public ReplaceFilter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReplaceFilter.class) {
            this.__construct(env, args);
        }
    }

    public ReplaceFilter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callable", typeHint = "callable")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object callable = assignParameter(args, 0, false);
        this.callback = callable;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element")
    public Object apply(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(this.callback, element)
                        .value());
    }

    public static final Object CONST_class = "DeepCopy\\TypeFilter\\ReplaceFilter";

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
                    .setName("DeepCopy\\TypeFilter\\ReplaceFilter")
                    .setLookup(
                            ReplaceFilter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("callback")
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/ReplaceFilter.php")
                    .addInterface("DeepCopy\\TypeFilter\\TypeFilter")
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
