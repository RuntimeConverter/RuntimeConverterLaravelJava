package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/RelationNotFoundException.php

*/

public class RelationNotFoundException extends RuntimeException {

    public Object model = null;

    public Object relation = null;

    public RelationNotFoundException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RelationNotFoundException.class) {
            this.__construct(env, args);
        }
    }

    public RelationNotFoundException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\RelationNotFoundException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "model")
        @ConvertedParameter(index = 1, name = "relation")
        public Object make(RuntimeEnv env, Object... args) {
            Object model = assignParameter(args, 0, false);
            Object relation = assignParameter(args, 1, false);
            Object instance = null;
            Object _pClass = null;
            _pClass = function_get_class.f.env(env).call(model).value();
            instance =
                    env.createNewWithLateStaticBindings(
                            this,
                            "Call to undefined relationship ["
                                    + toStringR(relation, env)
                                    + "] on model ["
                                    + toStringR(_pClass, env)
                                    + "].");
            toObjectR(instance).accessProp(this, env).name("model").set(model);
            toObjectR(instance).accessProp(this, env).name("relation").set(relation);
            return ZVal.assign(instance);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\RelationNotFoundException")
                    .setLookup(
                            RelationNotFoundException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("model", "relation")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/RelationNotFoundException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("RuntimeException")
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
