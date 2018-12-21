package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.DefaultTimeGenerator;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Generator/TimeGeneratorFactory.php

*/

public class TimeGeneratorFactory extends RuntimeClassBase {

    public Object nodeProvider = null;

    public Object timeConverter = null;

    public Object timeProvider = null;

    public TimeGeneratorFactory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TimeGeneratorFactory.class) {
            this.__construct(env, args);
        }
    }

    public TimeGeneratorFactory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "nodeProvider",
        typeHint = "Ramsey\\Uuid\\Provider\\NodeProviderInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "timeConverter",
        typeHint = "Ramsey\\Uuid\\Converter\\TimeConverterInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "timeProvider",
        typeHint = "Ramsey\\Uuid\\Provider\\TimeProviderInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object nodeProvider = assignParameter(args, 0, false);
        Object timeConverter = assignParameter(args, 1, false);
        Object timeProvider = assignParameter(args, 2, false);
        this.nodeProvider = nodeProvider;
        this.timeConverter = timeConverter;
        this.timeProvider = timeProvider;
        return null;
    }

    @ConvertedMethod
    public Object getGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new DefaultTimeGenerator(
                        env, this.nodeProvider, this.timeConverter, this.timeProvider));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Generator\\TimeGeneratorFactory";

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
                    .setName("Ramsey\\Uuid\\Generator\\TimeGeneratorFactory")
                    .setLookup(
                            TimeGeneratorFactory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("nodeProvider", "timeConverter", "timeProvider")
                    .setFilename("vendor/ramsey/uuid/src/Generator/TimeGeneratorFactory.php")
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
