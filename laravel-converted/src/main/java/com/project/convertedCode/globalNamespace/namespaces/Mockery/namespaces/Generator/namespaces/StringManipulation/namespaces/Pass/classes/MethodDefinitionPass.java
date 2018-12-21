package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Mockery;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.namespaces.StringManipulation.namespaces.Pass.classes.Pass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/MethodDefinitionPass.php

*/

public class MethodDefinitionPass extends RuntimeClassBase implements Pass {

    public MethodDefinitionPass(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MethodDefinitionPass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "config",
        typeHint = "Mockery\\Generator\\MockConfiguration"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object method = null;
        Object methodDef = null;
        for (ZPair zpairResult717 :
                ZVal.getIterable(
                        env.callMethod(config, "getMethodsToMock", MethodDefinitionPass.class),
                        env,
                        true)) {
            method = ZVal.assign(zpairResult717.getValue());
            if (ZVal.isTrue(env.callMethod(method, "isPublic", MethodDefinitionPass.class))) {
                methodDef = "public";

            } else if (ZVal.isTrue(
                    env.callMethod(method, "isProtected", MethodDefinitionPass.class))) {
                methodDef = "protected";

            } else {
                methodDef = "private";
            }

            if (ZVal.isTrue(env.callMethod(method, "isStatic", MethodDefinitionPass.class))) {
                methodDef = toStringR(methodDef, env) + " static";
            }

            methodDef = toStringR(methodDef, env) + " function ";
            methodDef =
                    toStringR(methodDef, env)
                            + toStringR(
                                    ZVal.isTrue(
                                                    env.callMethod(
                                                            method,
                                                            "returnsReference",
                                                            MethodDefinitionPass.class))
                                            ? " & "
                                            : "",
                                    env);
            methodDef =
                    toStringR(methodDef, env)
                            + toStringR(
                                    env.callMethod(method, "getName", MethodDefinitionPass.class),
                                    env);
            methodDef =
                    toStringR(methodDef, env)
                            + toStringR(this.renderParams(env, method, config), env);
            methodDef =
                    toStringR(methodDef, env) + toStringR(this.renderReturnType(env, method), env);
            methodDef =
                    toStringR(methodDef, env)
                            + toStringR(this.renderMethodBody(env, method, config), env);
            code = this.appendToClass(env, code, methodDef);
        }

        return ZVal.assign(code);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "Mockery\\Generator\\Method")
    @ConvertedParameter(index = 1, name = "config")
    protected Object renderParams(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        ReferenceContainer methodParams = new BasicReferenceContainer(null);
        Object param = null;
        Object paramDef = null;
        ReferenceContainer overrides = new BasicReferenceContainer(null);
        Object params = null;
        Object _pClass = null;
        _pClass = env.callMethod(method, "getDeclaringClass", MethodDefinitionPass.class);
        if (ZVal.isTrue(env.callMethod(_pClass, "isInternal", MethodDefinitionPass.class))) {
            overrides.setObject(
                    env.callMethod(config, "getParameterOverrides", MethodDefinitionPass.class));
            if (arrayActionR(
                    ArrayAction.ISSET,
                    overrides,
                    env,
                    NamespaceGlobal.strtolower
                            .env(env)
                            .call(env.callMethod(_pClass, "getName", MethodDefinitionPass.class))
                            .value(),
                    env.callMethod(method, "getName", MethodDefinitionPass.class))) {
                return ZVal.assign(
                        "("
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(
                                                        ",",
                                                        overrides.arrayGet(
                                                                env,
                                                                NamespaceGlobal.strtolower
                                                                        .env(env)
                                                                        .call(
                                                                                env.callMethod(
                                                                                        _pClass,
                                                                                        "getName",
                                                                                        MethodDefinitionPass
                                                                                                .class))
                                                                        .value(),
                                                                env.callMethod(
                                                                        method,
                                                                        "getName",
                                                                        MethodDefinitionPass
                                                                                .class)))
                                                .value(),
                                        env)
                                + ")");
            }
        }

        methodParams.setObject(ZVal.newArray());
        params = env.callMethod(method, "getParameters", MethodDefinitionPass.class);
        for (ZPair zpairResult718 : ZVal.getIterable(params, env, true)) {
            param = ZVal.assign(zpairResult718.getValue());
            paramDef = this.renderTypeHint(env, param);
            paramDef =
                    toStringR(paramDef, env)
                            + toStringR(
                                    ZVal.isTrue(
                                                    env.callMethod(
                                                            param,
                                                            "isPassedByReference",
                                                            MethodDefinitionPass.class))
                                            ? "&"
                                            : "",
                                    env);
            paramDef =
                    toStringR(paramDef, env)
                            + toStringR(
                                    ZVal.isTrue(
                                                    env.callMethod(
                                                            param,
                                                            "isVariadic",
                                                            MethodDefinitionPass.class))
                                            ? "..."
                                            : "",
                                    env);
            paramDef =
                    toStringR(paramDef, env)
                            + "$"
                            + toStringR(
                                    env.callMethod(param, "getName", MethodDefinitionPass.class),
                                    env);
            if (!ZVal.isTrue(env.callMethod(param, "isVariadic", MethodDefinitionPass.class))) {
                if (ZVal.strictNotEqualityCheck(
                        false,
                        "!==",
                        env.callMethod(
                                param, "isDefaultValueAvailable", MethodDefinitionPass.class))) {
                    paramDef =
                            toStringR(paramDef, env)
                                    + " = "
                                    + toStringR(
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    param,
                                                                    "getDefaultValue",
                                                                    MethodDefinitionPass.class),
                                                            true)
                                                    .value(),
                                            env);

                } else if (ZVal.isTrue(
                        env.callMethod(param, "isOptional", MethodDefinitionPass.class))) {
                    paramDef = toStringR(paramDef, env) + " = null";
                }
            }

            methodParams.arrayAppend(env).set(paramDef);
        }

        return ZVal.assign(
                "("
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(", ", methodParams.getObject())
                                        .value(),
                                env)
                        + ")");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method", typeHint = "Mockery\\Generator\\Method")
    protected Object renderReturnType(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object type = null;
        type = env.callMethod(method, "getReturnType", MethodDefinitionPass.class);
        return ZVal.assign(
                ZVal.isTrue(type) ? function_sprintf.f.env(env).call(": %s", type).value() : "");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "code")
    protected Object appendToClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object code = assignParameter(args, 1, false);
        Object lastBrace = null;
        lastBrace = NamespaceGlobal.strrpos.env(env).call(_pClass, "}").value();
        _pClass =
                toStringR(function_substr.f.env(env).call(_pClass, 0, lastBrace).value(), env)
                        + toStringR(code, env)
                        + "\n    }\n";
        return ZVal.assign(_pClass);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "param", typeHint = "Mockery\\Generator\\Parameter")
    protected Object renderTypeHint(RuntimeEnv env, Object... args) {
        Object param = assignParameter(args, 0, false);
        Object typeHint = null;
        typeHint =
                function_trim
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        param, "getTypeHintAsString", MethodDefinitionPass.class))
                        .value();
        if (!ZVal.isEmpty(typeHint)) {
            if (!ZVal.isTrue(Mockery.runtimeStaticObject.isBuiltInType(env, typeHint))) {
                typeHint = "\\" + toStringR(typeHint, env);
            }

            if (ZVal.toBool(
                            ZVal.isGreaterThanOrEqualTo(
                                    NamespaceGlobal.version_compare
                                            .env(env)
                                            .call("7.2.11-dev", "7.1.0-dev")
                                            .value(),
                                    ">=",
                                    0))
                    && ZVal.toBool(
                            env.callMethod(param, "allowsNull", MethodDefinitionPass.class))) {
                typeHint = "?" + toStringR(typeHint, env);
            }
        }

        return ZVal.assign(typeHint = toStringR(typeHint, env) + " ");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "config")
    private Object renderMethodBody(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object method = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object paramCount = null;
        Object param = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object invoke = null;
        ReferenceContainer overrides = new BasicReferenceContainer(null);
        Object body = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        Object _pClass = null;
        Object class_name = null;
        invoke =
                ZVal.assign(
                        ZVal.isTrue(env.callMethod(method, "isStatic", MethodDefinitionPass.class))
                                ? "static::_mockery_handleStaticMethodCall"
                                : "$this->_mockery_handleMethodCall");
        body = "{\n$argc = func_num_args();\n$argv = func_get_args();\n";
        _pClass = env.callMethod(method, "getDeclaringClass", MethodDefinitionPass.class);
        class_name =
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(env.callMethod(_pClass, "getName", MethodDefinitionPass.class))
                        .value();
        overrides.setObject(
                env.callMethod(config, "getParameterOverrides", MethodDefinitionPass.class));
        if (arrayActionR(
                ArrayAction.ISSET,
                overrides,
                env,
                class_name,
                env.callMethod(method, "getName", MethodDefinitionPass.class))) {
            params.setObject(
                    function_array_values
                            .f
                            .env(env)
                            .call(
                                    overrides.arrayGet(
                                            env,
                                            class_name,
                                            env.callMethod(
                                                    method, "getName", MethodDefinitionPass.class)))
                            .value());
            paramCount = function_count.f.env(env).call(params.getObject()).value();
            runtimeConverterContinueCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', paramCount);
                    i.setObject(ZVal.increment(i.getObject()))) {
                param = ZVal.assign(params.arrayGet(env, i.getObject()));
                if (ZVal.strictNotEqualityCheck(
                        function_strpos.f.env(env).call(param, "&").value(), "!==", false)) {
                    body =
                            toStringR(body, env)
                                    + toStringR(
                                            "if ($argc > "
                                                    + toStringR(i.getObject(), env)
                                                    + ") {\n    $argv["
                                                    + toStringR(i.getObject(), env)
                                                    + "] = "
                                                    + toStringR(param, env)
                                                    + ";\n}\n",
                                            env);
                }
            }

        } else {
            params.setObject(
                    function_array_values
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(
                                            method, "getParameters", MethodDefinitionPass.class))
                            .value());
            paramCount = function_count.f.env(env).call(params.getObject()).value();
            runtimeConverterContinueCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', paramCount);
                    i.setObject(ZVal.increment(i.getObject()))) {
                param = ZVal.assign(params.arrayGet(env, i.getObject()));
                if (!ZVal.isTrue(
                        env.callMethod(param, "isPassedByReference", MethodDefinitionPass.class))) {
                    continue;
                }

                body =
                        toStringR(body, env)
                                + toStringR(
                                        "if ($argc > "
                                                + toStringR(i.getObject(), env)
                                                + ") {\n    $argv["
                                                + toStringR(i.getObject(), env)
                                                + "] =& $"
                                                + toStringR(
                                                        env.callMethod(
                                                                param,
                                                                "getName",
                                                                MethodDefinitionPass.class),
                                                        env)
                                                + ";\n}\n",
                                        env);
            }
        }

        body =
                toStringR(body, env)
                        + toStringR(
                                "$ret = " + toStringR(invoke, env) + "(__FUNCTION__, $argv);\n",
                                env);
        if (ZVal.strictNotEqualityCheck(
                env.callMethod(method, "getReturnType", MethodDefinitionPass.class),
                "!==",
                "void")) {
            body = toStringR(body, env) + "return $ret;\n";
        }

        body = toStringR(body, env) + "}\n";
        return ZVal.assign(body);
    }

    public static final Object CONST_class =
            "Mockery\\Generator\\StringManipulation\\Pass\\MethodDefinitionPass";

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
                    .setName("Mockery\\Generator\\StringManipulation\\Pass\\MethodDefinitionPass")
                    .setLookup(
                            MethodDefinitionPass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/MethodDefinitionPass.php")
                    .addInterface("Mockery\\Generator\\StringManipulation\\Pass\\Pass")
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
