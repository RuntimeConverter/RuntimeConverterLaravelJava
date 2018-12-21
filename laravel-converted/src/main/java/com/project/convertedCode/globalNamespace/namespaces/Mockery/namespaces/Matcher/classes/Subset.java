package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace_recursive;
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
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Matcher/Subset.php

*/

public class Subset extends MatcherAbstract {

    public Object expected = null;

    public Object strict = true;

    public Subset(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Subset.class) {
            this.__construct(env, args);
        }
    }

    public Subset(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "strict",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, false);
        Object strict = assignParameter(args, 1, true);
        if (null == strict) {
            strict = true;
        }
        this.expected = expected;
        this.strict = strict;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    public Object match(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer actual = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        if (!function_is_array.f.env(env).call(actual.getObject()).getBool()) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.strict)) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            actual.getObject(),
                            "===",
                            function_array_replace_recursive
                                    .f
                                    .env(env)
                                    .call(actual.getObject(), this.expected)
                                    .value()));
        }

        return ZVal.assign(
                ZVal.equalityCheck(
                        actual.getObject(),
                        function_array_replace_recursive
                                .f
                                .env(env)
                                .call(actual.getObject(), this.expected)
                                .value()));
    }

    public Object match(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object v = null;
        ReferenceContainer elements = new BasicReferenceContainer(null);
        Object k = null;
        Object _pReturn = null;
        _pReturn = "<Subset[";
        elements.setObject(ZVal.newArray());
        for (ZPair zpairResult726 : ZVal.getIterable(this.expected, env, false)) {
            k = ZVal.assign(zpairResult726.getKey());
            v = ZVal.assign(zpairResult726.getValue());
            elements.arrayAppend(env)
                    .set(toStringR(k, env) + "=" + toStringR(toStringR(v, env), env));
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

    public static final Object CONST_class = "Mockery\\Matcher\\Subset";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MatcherAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "array")
        public Object strict(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            return ZVal.assign(env.createNewWithLateStaticBindings(this, expected, true));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expected", typeHint = "array")
        public Object loose(RuntimeEnv env, Object... args) {
            Object expected = assignParameter(args, 0, false);
            return ZVal.assign(env.createNewWithLateStaticBindings(this, expected, false));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Matcher\\Subset")
                    .setLookup(
                            Subset.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expected", "expected", "strict")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Matcher/Subset.php")
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
