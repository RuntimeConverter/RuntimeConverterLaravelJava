package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteSignatureParameters.php

*/

public class RouteSignatureParameters extends RuntimeClassBase {

    public RouteSignatureParameters(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RouteSignatureParameters(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteSignatureParameters";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "action", typeHint = "array")
        @ConvertedParameter(
            index = 1,
            name = "subClass",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object fromAction(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Routing/RouteSignatureParameters.php");
            ReferenceContainer action =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object subClass = assignParameter(args, 1, true);
            if (null == subClass) {
                subClass = ZVal.getNull();
            }
            Object parameters = null;
            parameters =
                    ZVal.assign(
                            function_is_string
                                            .f
                                            .env(env)
                                            .call(action.arrayGet(env, "uses"))
                                            .getBool()
                                    ? StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, RouteSignatureParameters.class)
                                            .method("fromClassMethodString")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(action.arrayGet(env, "uses"))
                                            .value()
                                    : env.callMethod(
                                            new ReflectionFunction(
                                                    env, action.arrayGet(env, "uses")),
                                            "getParameters",
                                            RouteSignatureParameters.class));
            return ZVal.assign(
                    function_is_null.f.env(env).call(subClass).getBool()
                            ? parameters
                            : function_array_filter
                                    .f
                                    .env(env)
                                    .call(
                                            parameters,
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Illuminate\\Routing",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "p")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object p = assignParameter(args, 0, false);
                                                    Object subClass = null;
                                                    subClass =
                                                            this.contextReferences.getCapturedValue(
                                                                    "subClass");
                                                    return ZVal.assign(
                                                            ZVal.toBool(
                                                                            env.callMethod(
                                                                                    p,
                                                                                    "getClass",
                                                                                    RouteSignatureParameters
                                                                                            .class))
                                                                    && ZVal.toBool(
                                                                            env.callMethod(
                                                                                    env.callMethod(
                                                                                            p,
                                                                                            "getClass",
                                                                                            RouteSignatureParameters
                                                                                                    .class),
                                                                                    "isSubclassOf",
                                                                                    RouteSignatureParameters
                                                                                            .class,
                                                                                    subClass)));
                                                }
                                            }.use("subClass", subClass))
                                    .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "uses")
        protected Object fromClassMethodString(RuntimeEnv env, Object... args) {
            Object uses = assignParameter(args, 0, false);
            Object method = null;
            Object runtimeTempArrayResult79 = null;
            Object _pClass = null;
            ZVal.list(
                    runtimeTempArrayResult79 = Str.runtimeStaticObject.parseCallback(env, uses),
                    (_pClass = listGet(runtimeTempArrayResult79, 0, env)),
                    (method = listGet(runtimeTempArrayResult79, 1, env)));
            if (ZVal.toBool(!function_method_exists.f.env(env).call(_pClass, method).getBool())
                    && ZVal.toBool(function_is_callable.f.env(env).call(_pClass, method).value())) {
                return ZVal.assign(ZVal.newArray());
            }

            return ZVal.assign(
                    env.callMethod(
                            new ReflectionMethod(env, _pClass, method),
                            "getParameters",
                            RouteSignatureParameters.class));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\RouteSignatureParameters")
                    .setLookup(
                            RouteSignatureParameters.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/RouteSignatureParameters.php")
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
