package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.TargetClassInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.Method;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/DefinedTargetClass.php

*/

public class DefinedTargetClass extends RuntimeClassBase implements TargetClassInterface {

    public Object rfc = null;

    public DefinedTargetClass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DefinedTargetClass.class) {
            this.__construct(env, args);
        }
    }

    public DefinedTargetClass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rfc", typeHint = "ReflectionClass")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object rfc = assignParameter(args, 0, false);
        this.rfc = rfc;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.rfc, "getName", DefinedTargetClass.class));
    }

    @ConvertedMethod
    public Object isAbstract(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.rfc, "isAbstract", DefinedTargetClass.class));
    }

    @ConvertedMethod
    public Object isFinal(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.rfc, "isFinal", DefinedTargetClass.class));
    }

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery/Generator")
                        .setFile(
                                "/vendor/mockery/mockery/library/Mockery/Generator/DefinedTargetClass.php");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery\\Generator",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "method")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object method = assignParameter(args, 0, false);
                                        return ZVal.assign(new Method(env, method));
                                    }
                                },
                                env.callMethod(this.rfc, "getMethods", DefinedTargetClass.class))
                        .value());
    }

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/mockery/mockery/library/Mockery/Generator")
                        .setFile(
                                "/vendor/mockery/mockery/library/Mockery/Generator/DefinedTargetClass.php");
        Object _pClass = null;
        _pClass = ZVal.assign("DefinedTargetClass");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Mockery\\Generator",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "interface")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _pInterface = assignParameter(args, 0, false);
                                        Object _pClass = null;
                                        _pClass = this.contextReferences.getCapturedValue("class");
                                        return ZVal.assign(env.createNew(_pClass, _pInterface));
                                    }
                                }.use("class", _pClass),
                                env.callMethod(this.rfc, "getInterfaces", DefinedTargetClass.class))
                        .value());
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getName(env));
    }

    @ConvertedMethod
    public Object getNamespaceName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.rfc, "getNamespaceName", DefinedTargetClass.class));
    }

    @ConvertedMethod
    public Object inNamespace(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.rfc, "inNamespace", DefinedTargetClass.class));
    }

    @ConvertedMethod
    public Object getShortName(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.rfc, "getShortName", DefinedTargetClass.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interface")
    public Object implementsInterface(RuntimeEnv env, Object... args) {
        Object _pInterface = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.rfc, "implementsInterface", DefinedTargetClass.class, _pInterface));
    }

    @ConvertedMethod
    public Object hasInternalAncestor(RuntimeEnv env, Object... args) {
        Object parent = null;
        Object child = null;
        if (ZVal.isTrue(env.callMethod(this.rfc, "isInternal", DefinedTargetClass.class))) {
            return ZVal.assign(true);
        }

        child = ZVal.assign(this.rfc);
        while (ZVal.isTrue(
                parent = env.callMethod(child, "getParentClass", DefinedTargetClass.class))) {
            if (ZVal.isTrue(env.callMethod(parent, "isInternal", DefinedTargetClass.class))) {
                return ZVal.assign(true);
            }

            child = ZVal.assign(parent);
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Mockery\\Generator\\DefinedTargetClass";

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
                            .DefinedTargetClass(env, new ReflectionClass(env, name)));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Generator\\DefinedTargetClass")
                    .setLookup(
                            DefinedTargetClass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("rfc")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/DefinedTargetClass.php")
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
