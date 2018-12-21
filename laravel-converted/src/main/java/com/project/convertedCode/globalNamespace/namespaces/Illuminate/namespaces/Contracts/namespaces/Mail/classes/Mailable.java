package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Mail.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Mail/Mailable.php

*/

public interface Mailable {

    public static final Object CONST_class = "Illuminate\\Contracts\\Mail\\Mailable";

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "mailer",
        typeHint = "Illuminate\\Contracts\\Mail\\Mailer"
    )
    public Object send(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        typeHint = "Illuminate\\Contracts\\Queue\\Factory"
    )
    public Object queue(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        typeHint = "Illuminate\\Contracts\\Queue\\Factory"
    )
    public Object later(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Contracts\\Mail\\Mailable")
                    .setLookup(Mailable.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Mail/Mailable.php")
                    .get();
}
