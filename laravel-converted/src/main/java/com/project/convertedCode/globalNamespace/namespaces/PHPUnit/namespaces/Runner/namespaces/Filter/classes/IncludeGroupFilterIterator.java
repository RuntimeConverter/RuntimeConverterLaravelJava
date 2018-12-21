package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes.GroupFilterIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Filter/IncludeGroupFilterIterator.php

*/

public class IncludeGroupFilterIterator extends GroupFilterIterator {

    public IncludeGroupFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IncludeGroupFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public IncludeGroupFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hash", typeHint = "string")
    protected Object doAccept(RuntimeEnv env, Object... args) {
        Object hash = assignParameter(args, 0, false);
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                hash,
                                toObjectR(this).accessProp(this, env).name("groupTests").value(),
                                true)
                        .value());
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\Filter\\IncludeGroupFilterIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends GroupFilterIterator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\Filter\\IncludeGroupFilterIterator")
                    .setLookup(
                            IncludeGroupFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("groupTests")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Runner/Filter/IncludeGroupFilterIterator.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addInterface("OuterIterator")
                    .addInterface("RecursiveIterator")
                    .addExtendsClass("PHPUnit\\Runner\\Filter\\GroupFilterIterator")
                    .addExtendsClass("RecursiveFilterIterator")
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
