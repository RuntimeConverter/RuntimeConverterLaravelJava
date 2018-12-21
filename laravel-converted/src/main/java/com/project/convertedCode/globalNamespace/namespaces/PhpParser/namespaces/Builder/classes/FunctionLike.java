package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Param;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes.Declaration;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/FunctionLike.php

*/

public abstract class FunctionLike extends Declaration {

    public Object returnByRef = false;

    public Object params = ZVal.newArray();

    public Object returnType = ZVal.getNull();

    public FunctionLike(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FunctionLike(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object makeReturnByRef(RuntimeEnv env, Object... args) {
        this.returnByRef = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "param")
    public Object addParam(RuntimeEnv env, Object... args) {
        Object param = assignParameter(args, 0, false);
        param = BuilderHelpers.runtimeStaticObject.normalizeNode(env, param);
        if (!ZVal.isTrue(ZVal.checkInstanceType(param, Param.class, "PhpParser\\Node\\Param"))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Expected parameter node, got \"%s\"",
                                            env.callMethod(param, "getType", FunctionLike.class))
                                    .value()));
        }

        new ReferenceClassProperty(this, "params", env).arrayAppend(env).set(param);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "params", typeHint = "array")
    public Object addParams(RuntimeEnv env, Object... args) {
        Object params = assignParameter(args, 0, false);
        Object param = null;
        for (ZPair zpairResult842 : ZVal.getIterable(params, env, true)) {
            param = ZVal.assign(zpairResult842.getValue());
            this.addParam(env, param);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object setReturnType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        this.returnType = BuilderHelpers.runtimeStaticObject.normalizeType(env, type);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "PhpParser\\Builder\\FunctionLike";

    @ConvertedMethod()
    public abstract Object getNode(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Declaration.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Builder\\FunctionLike")
                    .setLookup(
                            FunctionLike.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "params", "returnByRef", "returnType")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/FunctionLike.php")
                    .addInterface("PhpParser\\Builder")
                    .addExtendsClass("PhpParser\\Builder\\Declaration")
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
