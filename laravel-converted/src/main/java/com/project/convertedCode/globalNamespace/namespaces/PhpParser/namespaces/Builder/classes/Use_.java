package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Builder.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Builder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.UseUse;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.BuilderHelpers;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Builder/Use_.php

*/

public class Use_ extends RuntimeClassBase implements Builder {

    public Object name = null;

    public Object type = null;

    public Object alias = ZVal.getNull();

    public Use_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Use_.class) {
            this.__construct(env, args);
        }
    }

    public Use_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "type", typeHint = "int")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        this.name = BuilderHelpers.runtimeStaticObject.normalizeName(env, name);
        this.type = type;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "alias", typeHint = "string")
    public Object as(RuntimeEnv env, Object... args) {
        Object alias = assignParameter(args, 0, false);
        this.alias = alias;
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
                        .namespaces
                        .Stmt
                        .classes
                        .Use_(
                        env,
                        ZVal.newArray(new ZPair(0, new UseUse(env, this.name, this.alias))),
                        this.type));
    }

    public static final Object CONST_class = "PhpParser\\Builder\\Use_";

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
                    .setName("PhpParser\\Builder\\Use_")
                    .setLookup(
                            Use_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("alias", "name", "type")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Builder/Use_.php")
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
