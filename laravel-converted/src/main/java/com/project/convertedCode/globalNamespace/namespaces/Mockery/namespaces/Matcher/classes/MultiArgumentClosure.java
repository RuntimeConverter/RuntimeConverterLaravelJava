package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.ArgumentListMatcher;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MatcherAbstract;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Matcher/MultiArgumentClosure.php

*/

public class MultiArgumentClosure extends MatcherAbstract implements ArgumentListMatcher {

    public MultiArgumentClosure(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MultiArgumentClosure.class) {
            this.__construct(env, args);
        }
    }

    public MultiArgumentClosure(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    public Object match(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer actual = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object closure = null;
        closure = ZVal.assign(toObjectR(this).accessProp(this, env).name("_expected").value());
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        true,
                        "===",
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(closure, actual.getObject())
                                .value()));
    }

    public Object match(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return "<MultiArgumentClosure===true>";
    }

    public static final Object CONST_class = "Mockery\\Matcher\\MultiArgumentClosure";

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
                    .setName("Mockery\\Matcher\\MultiArgumentClosure")
                    .setLookup(
                            MultiArgumentClosure.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expected")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Matcher/MultiArgumentClosure.php")
                    .addInterface("Mockery\\Matcher\\ArgumentListMatcher")
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
