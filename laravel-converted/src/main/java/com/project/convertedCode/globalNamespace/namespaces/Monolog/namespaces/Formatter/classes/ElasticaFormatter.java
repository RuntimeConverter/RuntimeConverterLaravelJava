package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.NormalizerFormatter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Formatter/ElasticaFormatter.php

*/

public class ElasticaFormatter extends NormalizerFormatter {

    public Object index = null;

    public Object type = null;

    public ElasticaFormatter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ElasticaFormatter.class) {
            this.__construct(env, args);
        }
    }

    public ElasticaFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "index")
    @ConvertedParameter(index = 1, name = "type")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object index = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        super.__construct(env, "Y-m-d\\TH:i:s.uP");
        this.index = index;
        this.type = type;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object format(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        record = super.format(env, record);
        return ZVal.assign(this.getDocument(env, record));
    }

    @ConvertedMethod
    public Object getIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.index);
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.type);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record")
    protected Object getDocument(RuntimeEnv env, Object... args) {
        Object record = assignParameter(args, 0, false);
        Object document = null;
        document = env.createNew(ZVal.resolveClassAlias(env, "Document"));
        env.callMethod(document, "setData", ElasticaFormatter.class, record);
        env.callMethod(document, "setType", ElasticaFormatter.class, this.type);
        env.callMethod(document, "setIndex", ElasticaFormatter.class, this.index);
        return ZVal.assign(document);
    }

    public static final Object CONST_class = "Monolog\\Formatter\\ElasticaFormatter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends NormalizerFormatter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Formatter\\ElasticaFormatter")
                    .setLookup(
                            ElasticaFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("dateFormat", "index", "type")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Formatter/ElasticaFormatter.php")
                    .addInterface("Monolog\\Formatter\\FormatterInterface")
                    .addExtendsClass("Monolog\\Formatter\\NormalizerFormatter")
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
