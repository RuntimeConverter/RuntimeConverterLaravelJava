package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/EsmtpHandler.php

*/

public interface Swift_Transport_EsmtpHandler {

    public static final Object CONST_class = "Swift_Transport_EsmtpHandler";

    @ConvertedMethod
    public Object getHandledKeyword(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    public Object setKeywordParams(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    public Object afterEhlo(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getMailParams(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getRcptParams(RuntimeEnv env, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    @ConvertedParameter(index = 1, name = "command")
    @ConvertedParameter(index = 2, name = "codes", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 3,
        name = "failedRecipients",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "stop",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object onCommand(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args);

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "esmtpKeyword")
    public Object getPriorityOver(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object exposeMixinMethods(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object resetState(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Transport_EsmtpHandler")
                    .setLookup(Swift_Transport_EsmtpHandler.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/EsmtpHandler.php")
                    .get();
}
