package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Recaller.php

*/

public class Recaller extends RuntimeClassBase {

    public Object recaller = null;

    public Recaller(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Recaller.class) {
            this.__construct(env, args);
        }
    }

    public Recaller(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recaller")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object recaller = assignParameter(args, 0, false);
        this.recaller = recaller;
        return null;
    }

    @ConvertedMethod
    public Object id(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                handleReturnReference(
                                function_explode.f.env(env).call("|", this.recaller, 3).value())
                        .arrayGet(env, 0));
    }

    @ConvertedMethod
    public Object token(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                handleReturnReference(
                                function_explode.f.env(env).call("|", this.recaller, 3).value())
                        .arrayGet(env, 1));
    }

    @ConvertedMethod
    public Object hash(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                handleReturnReference(
                                function_explode.f.env(env).call("|", this.recaller, 3).value())
                        .arrayGet(env, 2));
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.properString(env)) && ZVal.toBool(this.hasAllSegments(env)));
    }

    @ConvertedMethod
    protected Object properString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(function_is_string.f.env(env).call(this.recaller).value())
                        && ZVal.toBool(Str.runtimeStaticObject.contains(env, this.recaller, "|")));
    }

    @ConvertedMethod
    protected Object hasAllSegments(RuntimeEnv env, Object... args) {
        ReferenceContainer segments = new BasicReferenceContainer(null);
        segments.setObject(function_explode.f.env(env).call("|", this.recaller).value());
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.equalityCheck(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(segments.getObject())
                                                                .value(),
                                                        3))
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        function_trim
                                                                .f
                                                                .env(env)
                                                                .call(segments.arrayGet(env, 0))
                                                                .value(),
                                                        "!==",
                                                        "")))
                        && ZVal.toBool(
                                ZVal.strictNotEqualityCheck(
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(segments.arrayGet(env, 1))
                                                .value(),
                                        "!==",
                                        "")));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Recaller";

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
                    .setName("Illuminate\\Auth\\Recaller")
                    .setLookup(
                            Recaller.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("recaller")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Auth/Recaller.php")
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
