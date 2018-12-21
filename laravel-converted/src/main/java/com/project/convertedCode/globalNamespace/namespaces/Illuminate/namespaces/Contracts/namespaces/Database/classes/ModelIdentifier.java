package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Database.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Contracts/Database/ModelIdentifier.php

*/

public class ModelIdentifier extends RuntimeClassBase {

    public Object _pClass = null;

    public Object id = null;

    public Object relations = null;

    public Object connection = null;

    public ModelIdentifier(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ModelIdentifier.class) {
            this.__construct(env, args);
        }
    }

    public ModelIdentifier(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "id")
    @ConvertedParameter(index = 2, name = "relations", typeHint = "array")
    @ConvertedParameter(index = 3, name = "connection")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object id = assignParameter(args, 1, false);
        Object relations = assignParameter(args, 2, false);
        Object connection = assignParameter(args, 3, false);
        this.id = id;
        this._pClass = _pClass;
        this.relations = relations;
        this.connection = connection;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Contracts\\Database\\ModelIdentifier";

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
                    .setName("Illuminate\\Contracts\\Database\\ModelIdentifier")
                    .setLookup(
                            ModelIdentifier.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("class", "connection", "id", "relations")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Contracts/Database/ModelIdentifier.php")
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
