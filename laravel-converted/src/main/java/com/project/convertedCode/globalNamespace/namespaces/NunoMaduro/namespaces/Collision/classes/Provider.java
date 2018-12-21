package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes.Handler;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Whoops.classes.Run;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/Provider.php

*/

public class Provider extends RuntimeClassBase
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
                .Provider {

    public Object run = null;

    public Object handler = null;

    public Provider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Provider.class) {
            this.__construct(env, args);
        }
    }

    public Provider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "run",
        typeHint = "Whoops\\RunInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "handler",
        typeHint = "NunoMaduro\\Collision\\Contracts\\Handler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object run = assignParameter(args, 0, true);
        if (null == run) {
            run = ZVal.getNull();
        }
        Object handler = assignParameter(args, 1, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.run = ZVal.isTrue(ternaryExpressionTemp = run) ? ternaryExpressionTemp : new Run(env);
        this.handler =
                ZVal.isTrue(ternaryExpressionTemp = handler)
                        ? ternaryExpressionTemp
                        : new Handler(env);
        return null;
    }

    @ConvertedMethod
    public Object register(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(this.run, "pushHandler", Provider.class, this.handler),
                "register",
                Provider.class);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHandler(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.handler);
    }

    public static final Object CONST_class = "NunoMaduro\\Collision\\Provider";

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
                    .setName("NunoMaduro\\Collision\\Provider")
                    .setLookup(
                            Provider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("handler", "run")
                    .setFilename("vendor/nunomaduro/collision/src/Provider.php")
                    .addInterface("NunoMaduro\\Collision\\Contracts\\Provider")
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
