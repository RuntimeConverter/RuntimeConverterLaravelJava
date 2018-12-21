package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

 vendor/phpdocumentor/reflection-common/src/Location.php

*/

public final class Location extends RuntimeClassBase {

    public Object lineNumber = 0;

    public Object columnNumber = 0;

    public Location(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Location.class) {
            this.__construct(env, args);
        }
    }

    public Location(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lineNumber")
    @ConvertedParameter(
        index = 1,
        name = "columnNumber",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object lineNumber = assignParameter(args, 0, false);
        Object columnNumber = assignParameter(args, 1, true);
        if (null == columnNumber) {
            columnNumber = 0;
        }
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
        return null;
    }

    @ConvertedMethod
    public Object getLineNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.lineNumber);
    }

    @ConvertedMethod
    public Object getColumnNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.columnNumber);
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\Location";

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
                    .setName("phpDocumentor\\Reflection\\Location")
                    .setLookup(
                            Location.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("columnNumber", "lineNumber")
                    .setFilename("vendor/phpdocumentor/reflection-common/src/Location.php")
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
