package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes.ReflectionClassConstant;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Reflection/ReflectionConstant.php

*/

public class ReflectionConstant extends ReflectionClassConstant {

    public ReflectionConstant(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReflectionConstant.class) {
            this.__construct(env, args);
        }
    }

    public ReflectionConstant(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call("ReflectionConstant is now ReflectionClassConstant", 16384)
                .value();
        super.__construct(env, _pClass, name);
        return null;
    }

    public static final Object CONST_class = "Psy\\Reflection\\ReflectionConstant";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends ReflectionClassConstant.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Reflection\\ReflectionConstant")
                    .setLookup(
                            ReflectionConstant.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("class", "name", "value")
                    .setFilename("vendor/psy/psysh/src/Reflection/ReflectionConstant.php")
                    .addInterface("Reflector")
                    .addExtendsClass("Psy\\Reflection\\ReflectionClassConstant")
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
