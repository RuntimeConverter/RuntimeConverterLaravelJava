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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mailer/RecipientIterator.php

*/

public interface Swift_Mailer_RecipientIterator {

    public static final Object CONST_class = "Swift_Mailer_RecipientIterator";

    @ConvertedMethod
    public Object hasNext(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object nextRecipient(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mailer_RecipientIterator")
                    .setLookup(Swift_Mailer_RecipientIterator.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mailer/RecipientIterator.php")
                    .get();
}
