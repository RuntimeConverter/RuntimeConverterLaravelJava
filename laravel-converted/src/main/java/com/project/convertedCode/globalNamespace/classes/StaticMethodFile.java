package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.FactoryFile;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/generator/StaticMethodFile.php

*/

public class StaticMethodFile extends FactoryFile {

    public Object methods = null;

    public StaticMethodFile(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StaticMethodFile.class) {
            this.__construct(env, args);
        }
    }

    public StaticMethodFile(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        super.__construct(env, file, "    ");
        this.methods = "";
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "call", typeHint = "FactoryCall")
    public Object addCall(RuntimeEnv env, Object... args) {
        Object call = assignParameter(args, 0, false);
        this.methods =
                toStringR(this.methods, env)
                        + toStringR("\n", env)
                        + toStringR(
                                env.callMethod(
                                        this, "generateFactoryCall", StaticMethodFile.class, call),
                                env);
        return null;
    }

    @ConvertedMethod
    public Object getDeclarationModifiers(RuntimeEnv env, Object... args) {
        return "public static ";
    }

    @ConvertedMethod
    public Object build(RuntimeEnv env, Object... args) {
        env.callMethod(this, "addFileHeader", StaticMethodFile.class);
        env.callMethod(this, "addPart", StaticMethodFile.class, "matchers_imports");
        env.callMethod(this, "addPart", StaticMethodFile.class, "matchers_header");
        env.callMethod(this, "addCode", StaticMethodFile.class, this.methods);
        env.callMethod(this, "addPart", StaticMethodFile.class, "matchers_footer");
        return null;
    }

    public static final Object CONST_class = "StaticMethodFile";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FactoryFile.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("StaticMethodFile")
                    .setLookup(
                            StaticMethodFile.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("code", "file", "indent", "methods")
                    .setFilename("vendor/hamcrest/hamcrest-php/generator/StaticMethodFile.php")
                    .addExtendsClass("FactoryFile")
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
