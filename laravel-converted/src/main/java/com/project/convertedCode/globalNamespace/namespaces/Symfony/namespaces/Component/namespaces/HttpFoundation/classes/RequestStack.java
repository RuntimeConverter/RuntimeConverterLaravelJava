package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/RequestStack.php

*/

public class RequestStack extends RuntimeClassBase {

    public Object requests = ZVal.newArray();

    public RequestStack(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RequestStack(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    public Object push(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "requests", env).arrayAppend(env).set(request);
        return null;
    }

    @ConvertedMethod
    public Object pop(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.requests)) {
            return null;
        }

        return ZVal.assign(function_array_pop.f.env(env).call(this.requests).value());
    }

    @ConvertedMethod
    public Object getCurrentRequest(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        function_end.f.env(env).call(this.requests).value())
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getMasterRequest(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.requests)) {
            return null;
        }

        return ZVal.assign(new ReferenceClassProperty(this, "requests", env).arrayGet(env, 0));
    }

    @ConvertedMethod
    public Object getParentRequest(RuntimeEnv env, Object... args) {
        Object pos = null;
        pos = ZVal.subtract(function_count.f.env(env).call(this.requests).value(), 2);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "requests", env), env, pos)) {
            return null;
        }

        return ZVal.assign(new ReferenceClassProperty(this, "requests", env).arrayGet(env, pos));
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\RequestStack";

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
                    .setName("Symfony\\Component\\HttpFoundation\\RequestStack")
                    .setLookup(
                            RequestStack.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("requests")
                    .setFilename("vendor/symfony/http-foundation/RequestStack.php")
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
