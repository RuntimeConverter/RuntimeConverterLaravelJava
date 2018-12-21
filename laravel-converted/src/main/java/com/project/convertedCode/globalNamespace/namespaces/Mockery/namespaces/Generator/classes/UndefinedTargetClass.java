package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.TargetClassInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/UndefinedTargetClass.php

*/

public class UndefinedTargetClass extends RuntimeClassBase implements TargetClassInterface {

    public Object name = null;

    public UndefinedTargetClass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UndefinedTargetClass.class) {
            this.__construct(env, args);
        }
    }

    public UndefinedTargetClass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object isAbstract(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object isFinal(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object getNamespaceName(RuntimeEnv env, Object... args) {
        Object parts = null;
        parts =
                function_explode
                        .f
                        .env(env)
                        .call("\\", function_ltrim.f.env(env).call(this.getName(env), "\\").value())
                        .value();
        function_array_pop.f.env(env).call(parts);
        return ZVal.assign(NamespaceGlobal.implode.env(env).call("\\", parts).value());
    }

    @ConvertedMethod
    public Object inNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictNotEqualityCheck(this.getNamespaceName(env), "!==", ""));
    }

    @ConvertedMethod
    public Object getShortName(RuntimeEnv env, Object... args) {
        Object parts = null;
        parts = function_explode.f.env(env).call("\\", this.getName(env)).value();
        return ZVal.assign(function_array_pop.f.env(env).call(parts).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object implementsInterface(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, false);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object hasInternalAncestor(RuntimeEnv env, Object... args) {
        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Mockery\\Generator\\UndefinedTargetClass";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object factory(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Mockery
                            .namespaces
                            .Generator
                            .classes
                            .UndefinedTargetClass(env, name));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Generator\\UndefinedTargetClass")
                    .setLookup(
                            UndefinedTargetClass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("name")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/UndefinedTargetClass.php")
                    .addInterface("Mockery\\Generator\\TargetClassInterface")
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
