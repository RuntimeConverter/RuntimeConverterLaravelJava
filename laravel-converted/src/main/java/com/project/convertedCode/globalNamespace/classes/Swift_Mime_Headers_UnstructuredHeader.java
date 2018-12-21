package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Swift_Mime_Headers_AbstractHeader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/UnstructuredHeader.php

*/

public class Swift_Mime_Headers_UnstructuredHeader extends Swift_Mime_Headers_AbstractHeader {

    public Object value = null;

    public Swift_Mime_Headers_UnstructuredHeader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_Mime_Headers_UnstructuredHeader.class) {
            this.__construct(env, args);
        }
    }

    public Swift_Mime_Headers_UnstructuredHeader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "encoder", typeHint = "Swift_Mime_HeaderEncoder")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object encoder = assignParameter(args, 1, false);
        env.callMethod(this, "setFieldName", Swift_Mime_Headers_UnstructuredHeader.class, name);
        env.callMethod(this, "setEncoder", Swift_Mime_Headers_UnstructuredHeader.class, encoder);
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
        env.callMethod(
                this,
                "clearCachedValueIf",
                Swift_Mime_Headers_UnstructuredHeader.class,
                ZVal.notEqualityCheck(this.value, value));
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object getFieldBody(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(
                env.callMethod(
                        this, "getCachedValue", Swift_Mime_Headers_UnstructuredHeader.class))) {
            env.callMethod(
                    this,
                    "setCachedValue",
                    Swift_Mime_Headers_UnstructuredHeader.class,
                    env.callMethod(
                            this,
                            "encodeWords",
                            Swift_Mime_Headers_UnstructuredHeader.class,
                            this,
                            this.value));
        }

        return ZVal.assign(
                env.callMethod(
                        this, "getCachedValue", Swift_Mime_Headers_UnstructuredHeader.class));
    }

    public static final Object CONST_class = "Swift_Mime_Headers_UnstructuredHeader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_Mime_Headers_AbstractHeader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Mime_Headers_UnstructuredHeader")
                    .setLookup(
                            Swift_Mime_Headers_UnstructuredHeader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "cachedValue",
                            "charset",
                            "encoder",
                            "lang",
                            "lineLength",
                            "name",
                            "value")
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Mime/Headers/UnstructuredHeader.php")
                    .addInterface("Swift_Mime_Header")
                    .addExtendsClass("Swift_Mime_Headers_AbstractHeader")
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
