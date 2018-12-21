package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Util.classes;

import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
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
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Util/StreamHasher.php

*/

public class StreamHasher extends RuntimeClassBase {

    public Object algo = null;

    public StreamHasher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StreamHasher.class) {
            this.__construct(env, args);
        }
    }

    public StreamHasher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "algo")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object algo = assignParameter(args, 0, false);
        this.algo = algo;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    public Object hash(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object context = null;
        NamespaceGlobal.rewind.env(env).call(resource);
        context = NamespaceGlobal.hash_init.env(env).call(this.algo).value();
        NamespaceGlobal.hash_update_stream.env(env).call(context, resource);
        function_fclose.f.env(env).call(resource);
        return ZVal.assign(NamespaceGlobal.hash_final.env(env).call(context).value());
    }

    public static final Object CONST_class = "League\\Flysystem\\Util\\StreamHasher";

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
                    .setName("League\\Flysystem\\Util\\StreamHasher")
                    .setLookup(
                            StreamHasher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("algo")
                    .setFilename("vendor/league/flysystem/src/Util/StreamHasher.php")
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
