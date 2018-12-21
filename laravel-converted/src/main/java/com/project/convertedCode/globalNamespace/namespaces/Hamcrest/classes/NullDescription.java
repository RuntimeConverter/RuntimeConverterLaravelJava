package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.Description;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/NullDescription.php

*/

public class NullDescription extends RuntimeClassBase implements Description {

    public NullDescription(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NullDescription(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    public Object appendText(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "Hamcrest\\SelfDescribing")
    public Object appendDescriptionOf(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object appendValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "separator")
    @ConvertedParameter(index = 2, name = "end")
    @ConvertedParameter(index = 3, name = "values")
    public Object appendValueList(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, false);
        Object separator = assignParameter(args, 1, false);
        Object end = assignParameter(args, 2, false);
        Object values = assignParameter(args, 3, false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "start")
    @ConvertedParameter(index = 1, name = "separator")
    @ConvertedParameter(index = 2, name = "end")
    @ConvertedParameter(index = 3, name = "values")
    public Object appendList(RuntimeEnv env, Object... args) {
        Object start = assignParameter(args, 0, false);
        Object separator = assignParameter(args, 1, false);
        Object end = assignParameter(args, 2, false);
        Object values = assignParameter(args, 3, false);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return "";
    }

    public static final Object CONST_class = "Hamcrest\\NullDescription";

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
                    .setName("Hamcrest\\NullDescription")
                    .setLookup(
                            NullDescription.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/NullDescription.php")
                    .addInterface("Hamcrest\\Description")
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
