package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Header;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/OpenDKIMHeader.php

*/

public class Swift_Mime_Headers_OpenDKIMHeader extends RuntimeClassBase
        implements Swift_Mime_Header {

    public Object value = null;

    public Object fieldName = null;

    public Swift_Mime_Headers_OpenDKIMHeader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_Headers_OpenDKIMHeader.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_Headers_OpenDKIMHeader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.fieldName = name;
        return null;
    }

    @ConvertedMethod
    public Object getFieldType(RuntimeEnv env, Object... args) {
        return ZVal.assign(CONST_TYPE_TEXT);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object setFieldBodyModel(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        this.setValue(env, model);
        return null;
    }

    @ConvertedMethod
    public Object getFieldBodyModel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getValue(env));
    }

    @ConvertedMethod
    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setValue(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object getFieldBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.fieldName, env) + ": " + toStringR(this.value, env) + "\r\n");
    }

    @ConvertedMethod
    public Object getFieldName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fieldName);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "charset")
    public Object setCharset(RuntimeEnv env, Object... args) {
        Object charset = assignParameter(args, 0, false);
        return null;
    }

    public static final Object CONST_class = "Swift_Mime_Headers_OpenDKIMHeader";

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
                    .setName("Swift_Mime_Headers_OpenDKIMHeader")
                    .setLookup(
                            Swift_Mime_Headers_OpenDKIMHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("fieldName", "value")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/OpenDKIMHeader.php")
                    .addInterface("Swift_Mime_Header")
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
