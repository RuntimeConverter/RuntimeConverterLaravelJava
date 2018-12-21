package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MatcherAbstract;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Matcher/Ducktype.php

*/

public class Ducktype extends MatcherAbstract {

    public Ducktype(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Ducktype.class) {
            this.__construct(env, args);
        }
    }

    public Ducktype(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    public Object match(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer actual = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object method = null;
        if (!function_is_object.f.env(env).call(actual.getObject()).getBool()) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult724 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("_expected").value(),
                        env,
                        true)) {
            method = ZVal.assign(zpairResult724.getValue());
            if (!function_method_exists.f.env(env).call(actual.getObject(), method).getBool()) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    public Object match(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "<Ducktype["
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                ", ",
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("_expected")
                                                        .value())
                                        .value(),
                                env)
                        + "]>");
    }

    public static final Object CONST_class = "Mockery\\Matcher\\Ducktype";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MatcherAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Matcher\\Ducktype")
                    .setLookup(
                            Ducktype.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expected")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Matcher/Ducktype.php")
                    .addExtendsClass("Mockery\\Matcher\\MatcherAbstract")
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
