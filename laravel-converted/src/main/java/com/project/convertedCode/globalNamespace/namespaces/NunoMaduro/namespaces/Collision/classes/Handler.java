package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes.Writer;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Handler.php

*/

public class Handler
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Whoops
                .namespaces
                .Handler
                .classes
                .Handler
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .NunoMaduro
                .namespaces
                .Collision
                .namespaces
                .Contracts
                .classes
                .Handler {

    public Object writer = null;

    public Handler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Handler.class) {
            this.__construct(env, args);
        }
    }

    public Handler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "writer",
        typeHint = "NunoMaduro\\Collision\\Contracts\\Writer",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object writer = assignParameter(args, 0, true);
        if (null == writer) {
            writer = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.writer =
                ZVal.isTrue(ternaryExpressionTemp = writer)
                        ? ternaryExpressionTemp
                        : new Writer(env);
        return null;
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.writer,
                "write",
                Handler.class,
                env.callMethod(this, "getInspector", Handler.class));
        return ZVal.assign(ClassConstantUtils.getConstantValueLateStatic(env, this, "QUIT"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object setOutput(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        env.callMethod(this.writer, "setOutput", Handler.class, output);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getWriter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.writer);
    }

    public static final Object CONST_class = "NunoMaduro\\Collision\\Handler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Whoops
                    .namespaces
                    .Handler
                    .classes
                    .Handler
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("NunoMaduro\\Collision\\Handler")
                    .setLookup(
                            Handler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exception", "inspector", "run", "writer")
                    .setFilename("vendor/nunomaduro/collision/src/Handler.php")
                    .addInterface("NunoMaduro\\Collision\\Contracts\\Handler")
                    .addInterface("Whoops\\Handler\\HandlerInterface")
                    .addExtendsClass("Whoops\\Handler\\Handler")
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
