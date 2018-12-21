package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/generator/FactoryParameter.php

*/

public class FactoryParameter extends RuntimeClassBase {

    public Object method = null;

    public Object reflector = null;

    public FactoryParameter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FactoryParameter.class) {
            this.__construct(env, args);
        }
    }

    public FactoryParameter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "FactoryMethod")
    @ConvertedParameter(index = 1, name = "reflector", typeHint = "ReflectionParameter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object reflector = assignParameter(args, 1, false);
        this.method = method;
        this.reflector = reflector;
        return null;
    }

    @ConvertedMethod
    public Object getDeclaration(RuntimeEnv env, Object... args) {
        Object _pDefault = null;
        Object code = null;
        Object _pClass = null;
        if (ZVal.isTrue(env.callMethod(this.reflector, "isArray", FactoryParameter.class))) {
            code = "array ";

        } else {
            _pClass = env.callMethod(this.reflector, "getClass", FactoryParameter.class);
            if (ZVal.strictNotEqualityCheck(_pClass, "!==", ZVal.getNull())) {
                code =
                        "\\"
                                + toStringR(
                                        toObjectR(_pClass)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                        env)
                                + " ";

            } else {
                code = "";
            }
        }

        code =
                toStringR(code, env)
                        + "$"
                        + toStringR(
                                toObjectR(this.reflector)
                                        .accessProp(this, env)
                                        .name("name")
                                        .value(),
                                env);
        if (ZVal.isTrue(env.callMethod(this.reflector, "isOptional", FactoryParameter.class))) {
            _pDefault = env.callMethod(this.reflector, "getDefaultValue", FactoryParameter.class);
            if (function_is_null.f.env(env).call(_pDefault).getBool()) {
                _pDefault = "null";

            } else if (function_is_bool.f.env(env).call(_pDefault).getBool()) {
                _pDefault = ZVal.assign(ZVal.isTrue(_pDefault) ? "true" : "false");

            } else if (function_is_string.f.env(env).call(_pDefault).getBool()) {
                _pDefault = "'" + toStringR(_pDefault, env) + "'";

            } else if (function_is_numeric.f.env(env).call(_pDefault).getBool()) {
                _pDefault = NamespaceGlobal.strval.env(env).call(_pDefault).value();

            } else if (function_is_array.f.env(env).call(_pDefault).getBool()) {
                _pDefault = "array()";

            } else {
                env.echo(
                        "Warning: unknown default type for "
                                + toStringR(
                                        env.callMethod(
                                                this.getMethod(env),
                                                "getFullName",
                                                FactoryParameter.class),
                                        env)
                                + toStringR("\n", env));
                NamespaceGlobal.var_dump.env(env).call(_pDefault);
                _pDefault = "null";
            }

            code = toStringR(code, env) + " = " + toStringR(_pDefault, env);
        }

        return ZVal.assign(code);
    }

    @ConvertedMethod
    public Object getInvocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "$"
                        + toStringR(
                                toObjectR(this.reflector)
                                        .accessProp(this, env)
                                        .name("name")
                                        .value(),
                                env));
    }

    @ConvertedMethod
    public Object getMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.method);
    }

    public static final Object CONST_class = "FactoryParameter";

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
                    .setName("FactoryParameter")
                    .setLookup(
                            FactoryParameter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("method", "reflector")
                    .setFilename("vendor/hamcrest/hamcrest-php/generator/FactoryParameter.php")
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
