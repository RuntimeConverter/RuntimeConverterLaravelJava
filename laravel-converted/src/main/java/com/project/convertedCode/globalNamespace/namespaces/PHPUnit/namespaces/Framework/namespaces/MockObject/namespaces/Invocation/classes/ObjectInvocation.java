package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Invocation.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Invocation.classes.StaticInvocation;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/ObjectInvocation.php

*/

public class ObjectInvocation extends StaticInvocation {

    public Object _object = null;

    public ObjectInvocation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ObjectInvocation.class) {
            this.__construct(env, args);
        }
    }

    public ObjectInvocation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "className")
    @ConvertedParameter(index = 1, name = "methodName")
    @ConvertedParameter(index = 2, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 3, name = "returnType")
    @ConvertedParameter(index = 4, name = "object")
    @ConvertedParameter(
        index = 5,
        name = "cloneObjects",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object className = assignParameter(args, 0, false);
        Object methodName = assignParameter(args, 1, false);
        Object parameters = assignParameter(args, 2, false);
        Object returnType = assignParameter(args, 3, false);
        Object _object = assignParameter(args, 4, false);
        Object cloneObjects = assignParameter(args, 5, true);
        if (null == cloneObjects) {
            cloneObjects = false;
        }
        super.__construct(env, className, methodName, parameters, returnType, cloneObjects);
        this._object = _object;
        return null;
    }

    @ConvertedMethod
    public Object getObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._object);
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Invocation\\ObjectInvocation";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticInvocation.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Invocation\\ObjectInvocation")
                    .setLookup(
                            ObjectInvocation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "className",
                            "isReturnTypeNullable",
                            "methodName",
                            "object",
                            "parameters",
                            "returnType")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Invocation/ObjectInvocation.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Invocation")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\MockObject\\Invocation\\StaticInvocation")
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
