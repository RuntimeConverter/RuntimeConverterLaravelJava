package com.project.convertedCode.globalNamespace.namespaces.Cron.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.AbstractField;
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

 vendor/dragonmantank/cron-expression/src/Cron/MonthField.php

*/

public class MonthField extends AbstractField {

    public MonthField(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.rangeStart = 1;
        this.rangeEnd = 12;
        this.literals =
                ZVal.newArray(
                        new ZPair(1, "JAN"),
                        new ZPair(2, "FEB"),
                        new ZPair(3, "MAR"),
                        new ZPair(4, "APR"),
                        new ZPair(5, "MAY"),
                        new ZPair(6, "JUN"),
                        new ZPair(7, "JUL"),
                        new ZPair(8, "AUG"),
                        new ZPair(9, "SEP"),
                        new ZPair(10, "OCT"),
                        new ZPair(11, "NOV"),
                        new ZPair(12, "DEC"));
        if (this.getClass() == MonthField.class) {
            this.__construct(env, args);
        }
    }

    public MonthField(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    @ConvertedParameter(index = 1, name = "value")
    public Object isSatisfiedBy(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        value = env.callMethod(this, "convertLiterals", MonthField.class, value);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "isSatisfied",
                        MonthField.class,
                        env.callMethod(date, "format", MonthField.class, "m"),
                        value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTime")
    @ConvertedParameter(
        index = 1,
        name = "invert",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object increment(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        Object invert = assignParameter(args, 1, true);
        if (null == invert) {
            invert = false;
        }
        if (ZVal.isTrue(invert)) {
            env.callMethod(date, "modify", MonthField.class, "last day of previous month");
            env.callMethod(date, "setTime", MonthField.class, 23, 59);

        } else {
            env.callMethod(date, "modify", MonthField.class, "first day of next month");
            env.callMethod(date, "setTime", MonthField.class, 0, 0);
        }

        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Cron\\MonthField";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractField.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Cron\\MonthField")
                    .setLookup(
                            MonthField.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "fullRange",
                            "literals",
                            "literals",
                            "rangeEnd",
                            "rangeEnd",
                            "rangeStart",
                            "rangeStart")
                    .setFilename("vendor/dragonmantank/cron-expression/src/Cron/MonthField.php")
                    .addInterface("Cron\\FieldInterface")
                    .addExtendsClass("Cron\\AbstractField")
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
