package com.project.convertedCode.globalNamespace.namespaces.Carbon.namespaces.Exceptions.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nesbot/carbon/src/Carbon/Exceptions/InvalidDateException.php

*/

public class InvalidDateException extends InvalidArgumentException {

    public Object field = null;

    public Object value = null;

    public InvalidDateException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvalidDateException.class) {
            this.__construct(env, args);
        }
    }

    public InvalidDateException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "field")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "code", defaultValue = "0", defaultValueType = "number")
    @ConvertedParameter(
        index = 3,
        name = "previous",
        typeHint = "Exception",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object field = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object code = assignParameter(args, 2, true);
        if (null == code) {
            code = 0;
        }
        Object previous = assignParameter(args, 3, true);
        if (null == previous) {
            previous = ZVal.getNull();
        }
        this.field = field;
        this.value = value;
        super.__construct(
                env,
                toStringR(field, env) + " : " + toStringR(value, env) + " is not a valid value.",
                code,
                previous);
        return null;
    }

    @ConvertedMethod
    public Object getField(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.field);
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    public static final Object CONST_class = "Carbon\\Exceptions\\InvalidDateException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends InvalidArgumentException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Carbon\\Exceptions\\InvalidDateException")
                    .setLookup(
                            InvalidDateException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("field", "value")
                    .setFilename(
                            "vendor/nesbot/carbon/src/Carbon/Exceptions/InvalidDateException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("InvalidArgumentException")
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
