package com.project.convertedCode.globalNamespace.classes;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Logger.php

*/

public interface Swift_Plugins_Logger {

    public static final Object CONST_class = "Swift_Plugins_Logger";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "entry")
    public Object add(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object dump(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Plugins_Logger")
                    .setLookup(Swift_Plugins_Logger.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Logger.php")
                    .get();
}
