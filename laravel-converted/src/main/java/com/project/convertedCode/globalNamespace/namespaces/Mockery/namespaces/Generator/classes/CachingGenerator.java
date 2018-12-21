package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.Generator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/CachingGenerator.php

*/

public class CachingGenerator extends RuntimeClassBase implements Generator {

    public Object generator = null;

    public Object cache = ZVal.newArray();

    public CachingGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CachingGenerator.class) {
            this.__construct(env, args);
        }
    }

    public CachingGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Mockery\\Generator\\Generator")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object generator = assignParameter(args, 0, false);
        this.generator = generator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    public Object generate(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        Object definition = null;
        Object hash = null;
        hash = env.callMethod(config, "getHash", CachingGenerator.class);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "cache", env), env, hash)) {
            return ZVal.assign(new ReferenceClassProperty(this, "cache", env).arrayGet(env, hash));
        }

        definition = env.callMethod(this.generator, "generate", CachingGenerator.class, config);
        new ReferenceClassProperty(this, "cache", env).arrayAccess(env, hash).set(definition);
        return ZVal.assign(definition);
    }

    public static final Object CONST_class = "Mockery\\Generator\\CachingGenerator";

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
                    .setName("Mockery\\Generator\\CachingGenerator")
                    .setLookup(
                            CachingGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cache", "generator")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/CachingGenerator.php")
                    .addInterface("Mockery\\Generator\\Generator")
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
