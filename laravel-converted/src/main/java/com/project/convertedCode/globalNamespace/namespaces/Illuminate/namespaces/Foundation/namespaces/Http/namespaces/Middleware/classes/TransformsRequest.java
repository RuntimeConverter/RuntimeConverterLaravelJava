package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/TransformsRequest.php

*/

public class TransformsRequest extends RuntimeClassBase {

    public Object attributes = ZVal.newArray();

    public TransformsRequest(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TransformsRequest(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    @ConvertedParameter(index = 2, name = "attributes")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        Object attributes = assignParameterVarArgs(args, 2);
        this.attributes = attributes;
        this.clean(env, request.getObject());
        return ZVal.assign(
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object clean(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.cleanParameterBag(env, toObjectR(request).accessProp(this, env).name("query").value());
        if (ZVal.isTrue(env.callMethod(request, "isJson", TransformsRequest.class))) {
            this.cleanParameterBag(env, env.callMethod(request, "json", TransformsRequest.class));

        } else {
            this.cleanParameterBag(
                    env, toObjectR(request).accessProp(this, env).name("request").value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "bag",
        typeHint = "Symfony\\Component\\HttpFoundation\\ParameterBag"
    )
    protected Object cleanParameterBag(RuntimeEnv env, Object... args) {
        Object bag = assignParameter(args, 0, false);
        env.callMethod(
                bag,
                "replace",
                TransformsRequest.class,
                this.cleanArray(env, env.callMethod(bag, "all", TransformsRequest.class)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    protected Object cleanArray(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/TransformsRequest.php");
        Object data = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(data).value(),
                                "map",
                                TransformsRequest.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Foundation\\Http\\Middleware",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    @ConvertedParameter(index = 1, name = "key")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object value = assignParameter(args, 0, false);
                                        Object key = assignParameter(args, 1, false);
                                        return ZVal.assign(
                                                TransformsRequest.this.cleanValue(env, key, value));
                                    }
                                }),
                        "all",
                        TransformsRequest.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object cleanValue(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(this.cleanArray(env, value));
        }

        return ZVal.assign(this.transform(env, key, value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object transform(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(value);
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Http\\Middleware\\TransformsRequest";

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
                    .setName("Illuminate\\Foundation\\Http\\Middleware\\TransformsRequest")
                    .setLookup(
                            TransformsRequest.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/TransformsRequest.php")
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
