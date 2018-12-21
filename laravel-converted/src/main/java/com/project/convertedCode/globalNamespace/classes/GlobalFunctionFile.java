package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.FactoryFile;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/generator/GlobalFunctionFile.php

*/

public class GlobalFunctionFile extends FactoryFile {

    public Object functions = null;

    public GlobalFunctionFile(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GlobalFunctionFile.class) {
            this.__construct(env, args);
        }
    }

    public GlobalFunctionFile(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        super.__construct(env, file, "    ");
        this.functions = "";
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "call", typeHint = "FactoryCall")
    public Object addCall(RuntimeEnv env, Object... args) {
        Object call = assignParameter(args, 0, false);
        this.functions =
                toStringR(this.functions, env)
                        + toStringR("\n", env)
                        + toStringR(this.generateFactoryCall(env, call), env);
        return null;
    }

    @ConvertedMethod
    public Object build(RuntimeEnv env, Object... args) {
        env.callMethod(this, "addFileHeader", GlobalFunctionFile.class);
        env.callMethod(this, "addPart", GlobalFunctionFile.class, "functions_imports");
        env.callMethod(this, "addPart", GlobalFunctionFile.class, "functions_header");
        env.callMethod(this, "addCode", GlobalFunctionFile.class, this.functions);
        env.callMethod(this, "addPart", GlobalFunctionFile.class, "functions_footer");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "call", typeHint = "FactoryCall")
    public Object generateFactoryCall(RuntimeEnv env, Object... args) {
        Object call = assignParameter(args, 0, false);
        Object code = null;
        code =
                ZVal.assign(
                        "if (!function_exists('"
                                + toStringR(
                                        env.callMethod(call, "getName", GlobalFunctionFile.class),
                                        env)
                                + "')) {");
        code = toStringR(code, env) + toStringR(super.generateFactoryCall(env, call), env);
        code = toStringR(code, env) + "}\n";
        return ZVal.assign(code);
    }

    public static final Object CONST_class = "GlobalFunctionFile";

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
                    .setName("GlobalFunctionFile")
                    .setLookup(
                            GlobalFunctionFile.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("code", "file", "functions", "indent")
                    .setFilename("vendor/hamcrest/hamcrest-php/generator/GlobalFunctionFile.php")
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
