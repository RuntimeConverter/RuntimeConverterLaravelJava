package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes.Variable;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Builder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Param.php

*/

public class Param extends RuntimeClassBase implements Builder {

    public Object name = null;

    public Object _pDefault = ZVal.getNull();

    public Object type = ZVal.getNull();

    public Object byRef = false;

    public Object variadic = false;

    public Param(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Param.class) {
            this.__construct(env, args);
        }
    }

    public Param(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setDefault(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this._pDefault = BuilderHelpers.runtimeStaticObject.normalizeValue(env, value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object setTypeHint(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        this.type = BuilderHelpers.runtimeStaticObject.normalizeType(env, type);
        if (ZVal.equalityCheck(this.type, "void")) {
            throw ZVal.getException(env, new LogicException(env, "Parameter type cannot be void"));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makeByRef(RuntimeEnv env, Object... args) {
        this.byRef = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object makeVariadic(RuntimeEnv env, Object... args) {
        this.variadic = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getNode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .PhpParser
                        .namespaces
                        .Node
                        .classes
                        .Param(
                        env,
                        new Variable(env, this.name),
                        this._pDefault,
                        this.type,
                        this.byRef,
                        this.variadic));
    }

    public static final Object CONST_class = "PhpParser\\Builder\\Param";

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
                    .setName("PhpParser\\Builder\\Param")
                    .setLookup(
                            Param.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("byRef", "default", "name", "type", "variadic")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Param.php")
                    .addInterface("PhpParser\\Builder")
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
