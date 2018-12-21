package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Engines.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.functions.last;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Engines.classes.PhpEngine;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/View/Engines/CompilerEngine.php

*/

public class CompilerEngine extends PhpEngine {

    public Object compiler = null;

    public Object lastCompiled = ZVal.newArray();

    public CompilerEngine(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CompilerEngine.class) {
            this.__construct(env, args);
        }
    }

    public CompilerEngine(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "compiler",
        typeHint = "Illuminate\\View\\Compilers\\CompilerInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object compiler = assignParameter(args, 0, false);
        this.compiler = compiler;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "data",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        Object compiled = null;
        Object results = null;
        new ReferenceClassProperty(this, "lastCompiled", env).arrayAppend(env).set(path);
        if (ZVal.isTrue(env.callMethod(this.compiler, "isExpired", CompilerEngine.class, path))) {
            env.callMethod(this.compiler, "compile", CompilerEngine.class, path);
        }

        compiled = env.callMethod(this.compiler, "getCompiledPath", CompilerEngine.class, path);
        results = env.callMethod(this, "evaluatePath", CompilerEngine.class, compiled, data);
        function_array_pop.f.env(env).call(this.lastCompiled);
        return ZVal.assign(results);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    @ConvertedParameter(index = 1, name = "obLevel")
    protected Object handleViewException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object obLevel = assignParameter(args, 1, false);
        e =
                new ErrorException(
                        env,
                        this.getMessage(env, e),
                        0,
                        1,
                        env.callMethod(e, "getFile", CompilerEngine.class),
                        env.callMethod(e, "getLine", CompilerEngine.class),
                        e);
        super.handleViewException(env, e, obLevel);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object getMessage(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(env.callMethod(e, "getMessage", CompilerEngine.class), env)
                        + " (View: "
                        + toStringR(
                                function_realpath
                                        .f
                                        .env(env)
                                        .call(last.f.env(env).call(this.lastCompiled).value())
                                        .value(),
                                env)
                        + ")");
    }

    @ConvertedMethod
    public Object getCompiler(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.compiler);
    }

    public static final Object CONST_class = "Illuminate\\View\\Engines\\CompilerEngine";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PhpEngine.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\View\\Engines\\CompilerEngine")
                    .setLookup(
                            CompilerEngine.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("compiler", "lastCompiled")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/View/Engines/CompilerEngine.php")
                    .addInterface("Illuminate\\Contracts\\View\\Engine")
                    .addExtendsClass("Illuminate\\View\\Engines\\PhpEngine")
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
