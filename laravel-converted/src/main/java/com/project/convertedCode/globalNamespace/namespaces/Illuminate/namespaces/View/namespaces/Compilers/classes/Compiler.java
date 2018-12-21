package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Compilers.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/Compilers/Compiler.php

*/

public abstract class Compiler extends RuntimeClassBase {

    public Object files = null;

    public Object cachePath = null;

    public Compiler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Compiler.class) {
            this.__construct(env, args);
        }
    }

    public Compiler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 1, name = "cachePath")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object cachePath = assignParameter(args, 1, false);
        if (!ZVal.isTrue(cachePath)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Please provide a valid cache path."));
        }

        this.files = files;
        this.cachePath = cachePath;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getCompiledPath(RuntimeEnv env, Object... args) {
        String path = ZVal.toStringR(assignParameter(args, 0, false));
        path = Paths.get(path).getFileName().toString();
        String result =
                toStringR(this.cachePath, env)
                        + "/"
                        + toStringR(NamespaceGlobal.sha1.env(env).call(path).value(), env)
                        + ".php";
        Path resultPath = Paths.get(result);
        if (!Files.exists(resultPath)){
            throw new RuntimeException("Cannot file \""+resultPath+"\"");
        }
        return result;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object isExpired(RuntimeEnv env, Object... args) {
        return false;
    }

    public static final Object CONST_class = "Illuminate\\View\\Compilers\\Compiler";

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
                    .setName("Illuminate\\View\\Compilers\\Compiler")
                    .setLookup(
                            Compiler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cachePath", "files")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/View/Compilers/Compiler.php")
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
