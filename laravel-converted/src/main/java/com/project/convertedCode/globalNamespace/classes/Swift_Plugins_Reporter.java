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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Reporter.php

*/

public interface Swift_Plugins_Reporter {

    public static final Object CONST_RESULT_PASS = 1;

    public static final Object CONST_RESULT_FAIL = 16;

    public static final Object CONST_class = "Swift_Plugins_Reporter";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    @ConvertedParameter(index = 1, name = "address")
    @ConvertedParameter(index = 2, name = "result")
    public Object notify(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Plugins_Reporter")
                    .setLookup(Swift_Plugins_Reporter.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Reporter.php")
                    .get();
}
