package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.RandomGeneratorInterface;
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

 vendor/ramsey/uuid/src/Generator/RandomLibAdapter.php

*/

public class RandomLibAdapter extends RuntimeClassBase implements RandomGeneratorInterface {

    public Object generator = null;

    public RandomLibAdapter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RandomLibAdapter.class) {
            this.__construct(env, args);
        }
    }

    public RandomLibAdapter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "generator",
        typeHint = "RandomLib\\Generator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, true);
        if (null == generator) {
            generator = ZVal.getNull();
        }
        Object factory = null;
        this.generator = generator;
        if (ZVal.strictEqualityCheck(this.generator, "===", ZVal.getNull())) {
            factory = env.createNew(ZVal.resolveClassAlias(env, "Factory"));
            this.generator =
                    env.callMethod(factory, "getMediumStrengthGenerator", RandomLibAdapter.class);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object generate(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.generator, "generate", RandomLibAdapter.class, length));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Generator\\RandomLibAdapter";

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
                    .setName("Ramsey\\Uuid\\Generator\\RandomLibAdapter")
                    .setLookup(
                            RandomLibAdapter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator")
                    .setFilename("vendor/ramsey/uuid/src/Generator/RandomLibAdapter.php")
                    .addInterface("Ramsey\\Uuid\\Generator\\RandomGeneratorInterface")
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
