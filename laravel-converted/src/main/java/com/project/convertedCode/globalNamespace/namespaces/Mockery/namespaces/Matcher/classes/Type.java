package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MatcherAbstract;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Matcher/Type.php

*/

public class Type extends MatcherAbstract {

    public Type(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Type.class) {
            this.__construct(env, args);
        }
    }

    public Type(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    public Object match(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer actual = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object function = null;
        function =
                "is_"
                        + toStringR(
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("_expected")
                                                        .value())
                                        .value(),
                                env);
        if (function_function_exists.f.env(env).call(function).getBool()) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    function,
                                    new RuntimeArgsWithReferences().add(0, actual),
                                    actual.getObject())
                            .value());

        } else if (ZVal.toBool(
                        function_is_string
                                .f
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("_expected")
                                                .value())
                                .value())
                && ZVal.toBool(
                        ZVal.toBool(
                                        function_class_exists
                                                .f
                                                .env(env)
                                                .call(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("_expected")
                                                                .value())
                                                .value())
                                || ZVal.toBool(
                                        NamespaceGlobal.interface_exists
                                                .env(env)
                                                .call(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("_expected")
                                                                .value())
                                                .value()))) {
            return ZVal.assign(
                    ZVal.checkInstanceTypeMatch(
                            actual.getObject(),
                            toObjectR(this).accessProp(this, env).name("_expected").value()));
        }

        return ZVal.assign(false);
    }

    public Object match(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "<"
                        + toStringR(
                                NamespaceGlobal.ucfirst
                                        .env(env)
                                        .call(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("_expected")
                                                        .value())
                                        .value(),
                                env)
                        + ">");
    }

    public static final Object CONST_class = "Mockery\\Matcher\\Type";

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
                    .setName("Mockery\\Matcher\\Type")
                    .setLookup(
                            Type.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expected")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Matcher/Type.php")
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
