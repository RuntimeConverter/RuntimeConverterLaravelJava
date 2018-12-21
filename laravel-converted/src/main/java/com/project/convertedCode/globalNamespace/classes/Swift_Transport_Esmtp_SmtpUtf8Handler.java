package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.classes.Swift_Transport_EsmtpHandler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/SmtpUtf8Handler.php

*/

public class Swift_Transport_Esmtp_SmtpUtf8Handler extends RuntimeClassBase
        implements Swift_Transport_EsmtpHandler {

    public Swift_Transport_Esmtp_SmtpUtf8Handler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Transport_Esmtp_SmtpUtf8Handler.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Transport_Esmtp_SmtpUtf8Handler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object getHandledKeyword(RuntimeEnv env, Object... args) {
        return "SMTPUTF8";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    public Object setKeywordParams(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "agent", typeHint = "Swift_Transport_SmtpAgent")
    public Object afterEhlo(RuntimeEnv env, Object... args) {
        Object agent = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    public Object getMailParams(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("SMTPUTF8"));
    }

    @ConvertedMethod
    public Object getRcptParams(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

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
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object agent = assignParameter(args, 0, false);
        Object command = assignParameter(args, 1, false);
        Object codes = assignParameter(args, 2, true);
        if (null == codes) {
            codes = ZVal.newArray();
        }
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 3, true);
        if (null == failedRecipients.getObject()) {
            failedRecipients.setObject(ZVal.getNull());
        }
        ReferenceContainer stop = assignParameterRef(runtimePassByReferenceArgs, args, 4, true);
        if (null == stop.getObject()) {
            stop.setObject(false);
        }
        return null;
    }

    public Object onCommand(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "esmtpKeyword")
    public Object getPriorityOver(RuntimeEnv env, Object... args) {
        Object esmtpKeyword = assignParameter(args, 0, false);
        return 0;
    }

    @ConvertedMethod
    public Object exposeMixinMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object resetState(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Swift_Transport_Esmtp_SmtpUtf8Handler";

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
                    .setName("Swift_Transport_Esmtp_SmtpUtf8Handler")
                    .setLookup(
                            Swift_Transport_Esmtp_SmtpUtf8Handler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Transport/Esmtp/SmtpUtf8Handler.php")
                    .addInterface("Swift_Transport_EsmtpHandler")
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
