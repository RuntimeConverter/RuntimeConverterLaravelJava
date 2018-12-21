package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VersionUpdater.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/VersionUpdater/Checker.php

*/

public interface Checker {

    public static final Object CONST_ALWAYS = "always";

    public static final Object CONST_DAILY = "daily";

    public static final Object CONST_WEEKLY = "weekly";

    public static final Object CONST_MONTHLY = "monthly";

    public static final Object CONST_NEVER = "never";

    public static final Object CONST_class = "Psy\\VersionUpdater\\Checker";

    @ConvertedMethod
    public Object isLatest(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getLatest(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\VersionUpdater\\Checker")
                    .setLookup(Checker.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/VersionUpdater/Checker.php")
                    .get();
}
