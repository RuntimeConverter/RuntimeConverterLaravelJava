package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Input/CodeArgument.php

*/

public class CodeArgument extends InputArgument {

    public CodeArgument(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CodeArgument.class) {
            this.__construct(env, args);
        }
    }

    public CodeArgument(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "mode",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "description")
    @ConvertedParameter(
        index = 3,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, true);
        if (null == mode) {
            mode = ZVal.getNull();
        }
        Object description = assignParameter(args, 2, true);
        if (null == description) {
            description = "";
        }
        Object _pDefault = assignParameter(args, 3, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (ZVal.isTrue(ZVal.toLong(mode) & ZVal.toLong(InputArgument.CONST_IS_ARRAY))) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Argument mode IS_ARRAY is not valid"));
        }

        super.__construct(env, name, mode, description, _pDefault);
        return null;
    }

    public static final Object CONST_class = "Psy\\Input\\CodeArgument";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends InputArgument.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Input\\CodeArgument")
                    .setLookup(
                            CodeArgument.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("default", "description", "mode", "name")
                    .setFilename("vendor/psy/psysh/src/Input/CodeArgument.php")
                    .addExtendsClass("Symfony\\Component\\Console\\Input\\InputArgument")
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
