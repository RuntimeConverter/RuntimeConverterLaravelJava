package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.AdapterInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Adapter/AbstractAdapter.php

*/

public abstract class AbstractAdapter extends RuntimeClassBase implements AdapterInterface {

    public Object pathPrefix = null;

    public Object pathSeparator = "/";

    public AbstractAdapter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public AbstractAdapter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object setPathPrefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        prefix = ZVal.assign(toStringR(prefix, env));
        if (ZVal.strictEqualityCheck(prefix, "===", "")) {
            this.pathPrefix = ZVal.getNull();
            return null;
        }

        this.pathPrefix =
                toStringR(function_rtrim.f.env(env).call(prefix, "\\/").value(), env)
                        + toStringR(this.pathSeparator, env);
        return null;
    }

    @ConvertedMethod
    public Object getPathPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pathPrefix);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object applyPathPrefix(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(this.getPathPrefix(env), env)
                        + toStringR(function_ltrim.f.env(env).call(path, "\\/").value(), env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object removePathPrefix(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                path,
                                function_strlen.f.env(env).call(this.getPathPrefix(env)).value())
                        .value());
    }

    public static final Object CONST_class = "League\\Flysystem\\Adapter\\AbstractAdapter";

    @ConvertedMethod()
    public abstract Object write(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object writeStream(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object update(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object updateStream(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object rename(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object copy(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object delete(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object deleteDir(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object createDir(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object setVisibility(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object has(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object read(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object readStream(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object listContents(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getMetadata(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getSize(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getMimetype(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getTimestamp(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getVisibility(RuntimeEnv env, Object... args);

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
                    .setName("League\\Flysystem\\Adapter\\AbstractAdapter")
                    .setLookup(
                            AbstractAdapter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("pathPrefix", "pathSeparator")
                    .setFilename("vendor/league/flysystem/src/Adapter/AbstractAdapter.php")
                    .addInterface("League\\Flysystem\\AdapterInterface")
                    .addInterface("League\\Flysystem\\ReadInterface")
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
