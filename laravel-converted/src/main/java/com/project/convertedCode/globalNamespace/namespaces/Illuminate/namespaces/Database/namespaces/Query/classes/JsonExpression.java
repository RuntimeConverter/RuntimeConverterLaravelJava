package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.classes.Expression;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/JsonExpression.php

*/

public class JsonExpression extends Expression {

    public JsonExpression(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == JsonExpression.class) {
            this.__construct(env, args);
        }
    }

    public JsonExpression(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        super.__construct(env, this.getJsonBindingParameter(env, value));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object getJsonBindingParameter(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object type = null;
        switch (toStringR(type = NamespaceGlobal.gettype.env(env).call(value).value())) {
            case "boolean":
                return ZVal.assign(ZVal.isTrue(value) ? "true" : "false");
            case "integer":
            case "double":
                return ZVal.assign(value);
            case "string":
                return "?";
            case "object":
            case "array":
                return "?";
        }
        ;
        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "JSON value is of illegal type: " + toStringR(type, env)));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Query\\JsonExpression";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Expression.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Query\\JsonExpression")
                    .setLookup(
                            JsonExpression.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("value")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/JsonExpression.php")
                    .addExtendsClass("Illuminate\\Database\\Query\\Expression")
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
