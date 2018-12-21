package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MatcherAbstract;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Matcher/Contains.php

*/

public class Contains extends MatcherAbstract {

    public Contains(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Contains.class) {
            this.__construct(env, args);
        }
    }

    public Contains(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    public Object match(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer actual = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object val = null;
        Object values = null;
        Object match = null;
        Object exp = null;
        values = function_array_values.f.env(env).call(actual.getObject()).value();
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult721 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("_expected").value(),
                        env,
                        true)) {
            exp = ZVal.assign(zpairResult721.getValue());
            match = false;
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult722 : ZVal.getIterable(values, env, true)) {
                val = ZVal.assign(zpairResult722.getValue());
                if (ZVal.toBool(ZVal.strictEqualityCheck(exp, "===", val))
                        || ZVal.toBool(ZVal.equalityCheck(exp, val))) {
                    match = true;
                    break;
                }
            }

            if (ZVal.strictEqualityCheck(match, "===", false)) {
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
        Object v = null;
        ReferenceContainer elements = new BasicReferenceContainer(null);
        Object _pReturn = null;
        _pReturn = "<Contains[";
        elements.setObject(ZVal.newArray());
        for (ZPair zpairResult723 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("_expected").value(),
                        env,
                        true)) {
            v = ZVal.assign(zpairResult723.getValue());
            elements.arrayAppend(env).set(toStringR(v, env));
        }

        _pReturn =
                toStringR(_pReturn, env)
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(", ", elements.getObject())
                                        .value(),
                                env)
                        + "]>";
        return ZVal.assign(_pReturn);
    }

    public static final Object CONST_class = "Mockery\\Matcher\\Contains";

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
                    .setName("Mockery\\Matcher\\Contains")
                    .setLookup(
                            Contains.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expected")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Matcher/Contains.php")
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
