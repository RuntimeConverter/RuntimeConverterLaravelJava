package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cookie.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Cookie/Middleware/AddQueuedCookiesToResponse.php

*/

public class AddQueuedCookiesToResponse extends RuntimeClassBase {

    public Object cookies = null;

    public AddQueuedCookiesToResponse(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AddQueuedCookiesToResponse.class) {
            this.__construct(env, args);
        }
    }

    public AddQueuedCookiesToResponse(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cookies",
        typeHint = "Illuminate\\Contracts\\Cookie\\QueueingFactory"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object cookies = assignParameter(args, 0, false);
        this.cookies = cookies;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object cookie = null;
        Object response = null;
        response =
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value();
        for (ZPair zpairResult244 :
                ZVal.getIterable(
                        env.callMethod(
                                this.cookies, "getQueuedCookies", AddQueuedCookiesToResponse.class),
                        env,
                        true)) {
            cookie = ZVal.assign(zpairResult244.getValue());
            env.callMethod(
                    toObjectR(response).accessProp(this, env).name("headers").value(),
                    "setCookie",
                    AddQueuedCookiesToResponse.class,
                    cookie);
        }

        return ZVal.assign(response);
    }

    public static final Object CONST_class =
            "Illuminate\\Cookie\\Middleware\\AddQueuedCookiesToResponse";

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
                    .setName("Illuminate\\Cookie\\Middleware\\AddQueuedCookiesToResponse")
                    .setLookup(
                            AddQueuedCookiesToResponse.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("cookies")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Cookie/Middleware/AddQueuedCookiesToResponse.php")
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
