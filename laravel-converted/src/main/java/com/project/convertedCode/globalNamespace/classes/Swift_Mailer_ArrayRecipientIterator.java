package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.classes.Swift_Mailer_RecipientIterator;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mailer/ArrayRecipientIterator.php

*/

public class Swift_Mailer_ArrayRecipientIterator extends RuntimeClassBase
        implements Swift_Mailer_RecipientIterator {

    public Object recipients = ZVal.newArray();

    public Swift_Mailer_ArrayRecipientIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mailer_ArrayRecipientIterator.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mailer_ArrayRecipientIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recipients", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object recipients = assignParameter(args, 0, false);
        this.recipients = recipients;
        return null;
    }

    @ConvertedMethod
    public Object hasNext(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.recipients));
    }

    @ConvertedMethod
    public Object nextRecipient(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_splice.f.env(env).call(this.recipients, 0, 1).value());
    }

    public static final Object CONST_class = "Swift_Mailer_ArrayRecipientIterator";

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
                    .setName("Swift_Mailer_ArrayRecipientIterator")
                    .setLookup(
                            Swift_Mailer_ArrayRecipientIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("recipients")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mailer/ArrayRecipientIterator.php")
                    .addInterface("Swift_Mailer_RecipientIterator")
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
