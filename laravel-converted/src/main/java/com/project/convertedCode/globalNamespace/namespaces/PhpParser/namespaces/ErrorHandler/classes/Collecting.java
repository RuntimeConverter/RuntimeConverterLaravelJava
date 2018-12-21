package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.ErrorHandler.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.ErrorHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/ErrorHandler/Collecting.php

*/

public class Collecting extends RuntimeClassBase implements ErrorHandler {

    public Object errors = ZVal.newArray();

    public Collecting(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Collecting(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "PhpParser\\Error")
    public Object handleError(RuntimeEnv env, Object... args) {
        Object error = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "errors", env).arrayAppend(env).set(error);
        return null;
    }

    @ConvertedMethod
    public Object getErrors(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.errors);
    }

    @ConvertedMethod
    public Object hasErrors(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.errors));
    }

    @ConvertedMethod
    public Object clearErrors(RuntimeEnv env, Object... args) {
        this.errors = ZVal.newArray();
        return null;
    }

    public static final Object CONST_class = "PhpParser\\ErrorHandler\\Collecting";

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
                    .setName("PhpParser\\ErrorHandler\\Collecting")
                    .setLookup(
                            Collecting.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("errors")
                    .setFilename(
                            "vendor/nikic/php-parser/lib/PhpParser/ErrorHandler/Collecting.php")
                    .addInterface("PhpParser\\ErrorHandler")
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
