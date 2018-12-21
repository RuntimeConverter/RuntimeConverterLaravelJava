package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Pop/Pop3Connection.php

*/

public interface Swift_Plugins_Pop_Pop3Connection {

    public static final Object CONST_class = "Swift_Plugins_Pop_Pop3Connection";

    @ConvertedMethod
    public Object connect(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object disconnect(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Plugins_Pop_Pop3Connection")
                    .setLookup(Swift_Plugins_Pop_Pop3Connection.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/Pop/Pop3Connection.php")
                    .get();
}
