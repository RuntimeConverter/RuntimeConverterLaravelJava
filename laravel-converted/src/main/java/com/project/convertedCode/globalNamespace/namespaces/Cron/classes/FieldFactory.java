package com.project.convertedCode.globalNamespace.namespaces.Cron.classes;

import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.MonthField;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.MinutesField;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.DayOfMonthField;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.HoursField;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Cron.classes.DayOfWeekField;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/dragonmantank/cron-expression/src/Cron/FieldFactory.php

*/

public class FieldFactory extends RuntimeClassBase {

    public Object fields = ZVal.newArray();

    public FieldFactory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FieldFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "position")
    public Object getField(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object position = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "fields", env),
                env,
                position)) {
            SwitchEnumType1 switchVariable1 =
                    ZVal.getEnum(
                            position,
                            SwitchEnumType1.DEFAULT_CASE,
                            SwitchEnumType1.INTEGER_0,
                            0,
                            SwitchEnumType1.INTEGER_1,
                            1,
                            SwitchEnumType1.INTEGER_2,
                            2,
                            SwitchEnumType1.INTEGER_3,
                            3,
                            SwitchEnumType1.INTEGER_4,
                            4);
            switch (switchVariable1) {
                case INTEGER_0:
                    new ReferenceClassProperty(this, "fields", env)
                            .arrayAccess(env, position)
                            .set(new MinutesField(env));
                    break;
                case INTEGER_1:
                    new ReferenceClassProperty(this, "fields", env)
                            .arrayAccess(env, position)
                            .set(new HoursField(env));
                    break;
                case INTEGER_2:
                    new ReferenceClassProperty(this, "fields", env)
                            .arrayAccess(env, position)
                            .set(new DayOfMonthField(env));
                    break;
                case INTEGER_3:
                    new ReferenceClassProperty(this, "fields", env)
                            .arrayAccess(env, position)
                            .set(new MonthField(env));
                    break;
                case INTEGER_4:
                    new ReferenceClassProperty(this, "fields", env)
                            .arrayAccess(env, position)
                            .set(new DayOfWeekField(env));
                    break;
                case DEFAULT_CASE:
                    throw ZVal.getException(
                            env,
                            new InvalidArgumentException(
                                    env, toStringR(position, env) + " is not a valid position"));
            }
            ;
        }

        return ZVal.assign(new ReferenceClassProperty(this, "fields", env).arrayGet(env, position));
    }

    public static final Object CONST_class = "Cron\\FieldFactory";

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
                    .setName("Cron\\FieldFactory")
                    .setLookup(
                            FieldFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fields")
                    .setFilename("vendor/dragonmantank/cron-expression/src/Cron/FieldFactory.php")
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

    private enum SwitchEnumType1 {
        INTEGER_0,
        INTEGER_1,
        INTEGER_2,
        INTEGER_3,
        INTEGER_4,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
