package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/TagProcessor.php

*/

public class TagProcessor extends RuntimeClassBase {

    public Object tags = null;

    public TagProcessor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TagProcessor.class) {
            this.__construct(env, args);
        }
    }

    public TagProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tags",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, true);
        if (null == tags) {
            tags = ZVal.newArray();
        }
        this.setTags(env, tags);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tags",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object addTags(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, true);
        if (null == tags) {
            tags = ZVal.newArray();
        }
        this.tags = function_array_merge.f.env(env).call(this.tags, tags).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tags",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object setTags(RuntimeEnv env, Object... args) {
        Object tags = assignParameter(args, 0, true);
        if (null == tags) {
            tags = ZVal.newArray();
        }
        this.tags = tags;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object __invoke(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        record.arrayAccess(env, "extra", "tags").set(this.tags);
        return ZVal.assign(record.getObject());
    }

    public static final Object CONST_class = "Monolog\\Processor\\TagProcessor";

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
                    .setName("Monolog\\Processor\\TagProcessor")
                    .setLookup(
                            TagProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("tags")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Processor/TagProcessor.php")
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
