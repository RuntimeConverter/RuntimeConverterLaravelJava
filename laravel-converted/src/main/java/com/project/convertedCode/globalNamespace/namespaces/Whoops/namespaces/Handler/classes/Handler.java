package com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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

 vendor/filp/whoops/src/Whoops/Handler/Handler.php

*/

public abstract class Handler extends RuntimeClassBase implements HandlerInterface {

    public Object run = null;

    public Object inspector = null;

    public Object exception = null;

    public Handler(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Handler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "run", typeHint = "Whoops\\RunInterface")
    public Object setRun(RuntimeEnv env, Object... args) {
        Object run = assignParameter(args, 0, false);
        this.run = run;
        return null;
    }

    @ConvertedMethod
    protected Object getRun(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.run);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "inspector", typeHint = "Whoops\\Exception\\Inspector")
    public Object setInspector(RuntimeEnv env, Object... args) {
        Object inspector = assignParameter(args, 0, false);
        this.inspector = inspector;
        return null;
    }

    @ConvertedMethod
    protected Object getInspector(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.inspector);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "exception")
    public Object setException(RuntimeEnv env, Object... args) {
        Object exception = assignParameter(args, 0, false);
        this.exception = exception;
        return null;
    }

    @ConvertedMethod
    protected Object getException(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.exception);
    }

    public static final Object CONST_DONE = 16;

    public static final Object CONST_LAST_HANDLER = 32;

    public static final Object CONST_QUIT = 48;

    public static final Object CONST_class = "Whoops\\Handler\\Handler";

    @ConvertedMethod()
    public abstract Object handle(RuntimeEnv env, Object... args);

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
                    .setName("Whoops\\Handler\\Handler")
                    .setLookup(
                            Handler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exception", "inspector", "run")
                    .setFilename("vendor/filp/whoops/src/Whoops/Handler/Handler.php")
                    .addInterface("Whoops\\Handler\\HandlerInterface")
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
