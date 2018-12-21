package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/CompiledRoute.php

*/

public class CompiledRoute extends RuntimeClassBase implements Serializable {

    public Object variables = null;

    public Object tokens = null;

    public Object staticPrefix = null;

    public Object regex = null;

    public Object pathVariables = null;

    public Object hostVariables = null;

    public Object hostRegex = null;

    public Object hostTokens = null;

    public CompiledRoute(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CompiledRoute.class) {
            this.__construct(env, args);
        }
    }

    public CompiledRoute(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "staticPrefix", typeHint = "string")
    @ConvertedParameter(index = 1, name = "regex", typeHint = "string")
    @ConvertedParameter(index = 2, name = "tokens", typeHint = "array")
    @ConvertedParameter(index = 3, name = "pathVariables", typeHint = "array")
    @ConvertedParameter(
        index = 4,
        name = "hostRegex",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "hostTokens",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 6,
        name = "hostVariables",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 7,
        name = "variables",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object staticPrefix = assignParameter(args, 0, false);
        Object regex = assignParameter(args, 1, false);
        Object tokens = assignParameter(args, 2, false);
        Object pathVariables = assignParameter(args, 3, false);
        Object hostRegex = assignParameter(args, 4, true);
        if (null == hostRegex) {
            hostRegex = ZVal.getNull();
        }
        Object hostTokens = assignParameter(args, 5, true);
        if (null == hostTokens) {
            hostTokens = ZVal.newArray();
        }
        Object hostVariables = assignParameter(args, 6, true);
        if (null == hostVariables) {
            hostVariables = ZVal.newArray();
        }
        Object variables = assignParameter(args, 7, true);
        if (null == variables) {
            variables = ZVal.newArray();
        }
        this.staticPrefix = staticPrefix;
        this.regex = regex;
        this.tokens = tokens;
        this.pathVariables = pathVariables;
        this.hostRegex = hostRegex;
        this.hostTokens = hostTokens;
        this.hostVariables = hostVariables;
        this.variables = variables;
        return null;
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_serialize
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("vars", this.variables),
                                        new ZPair("path_prefix", this.staticPrefix),
                                        new ZPair("path_regex", this.regex),
                                        new ZPair("path_tokens", this.tokens),
                                        new ZPair("path_vars", this.pathVariables),
                                        new ZPair("host_regex", this.hostRegex),
                                        new ZPair("host_tokens", this.hostTokens),
                                        new ZPair("host_vars", this.hostVariables)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "serialized")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object serialized = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(null);
        data.setObject(
                function_unserialize
                        .f
                        .env(env)
                        .call(serialized, ZVal.newArray(new ZPair("allowed_classes", false)))
                        .value());
        this.variables = data.arrayGet(env, "vars");
        this.staticPrefix = data.arrayGet(env, "path_prefix");
        this.regex = data.arrayGet(env, "path_regex");
        this.tokens = data.arrayGet(env, "path_tokens");
        this.pathVariables = data.arrayGet(env, "path_vars");
        this.hostRegex = data.arrayGet(env, "host_regex");
        this.hostTokens = data.arrayGet(env, "host_tokens");
        this.hostVariables = data.arrayGet(env, "host_vars");
        return null;
    }

    @ConvertedMethod
    public Object getStaticPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.staticPrefix);
    }

    @ConvertedMethod
    public Object getRegex(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.regex);
    }

    @ConvertedMethod
    public Object getHostRegex(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hostRegex);
    }

    @ConvertedMethod
    public Object getTokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tokens);
    }

    @ConvertedMethod
    public Object getHostTokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hostTokens);
    }

    @ConvertedMethod
    public Object getVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.variables);
    }

    @ConvertedMethod
    public Object getPathVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pathVariables);
    }

    @ConvertedMethod
    public Object getHostVariables(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hostVariables);
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\CompiledRoute";

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
                    .setName("Symfony\\Component\\Routing\\CompiledRoute")
                    .setLookup(
                            CompiledRoute.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "hostRegex",
                            "hostTokens",
                            "hostVariables",
                            "pathVariables",
                            "regex",
                            "staticPrefix",
                            "tokens",
                            "variables")
                    .setFilename("vendor/symfony/routing/CompiledRoute.php")
                    .addInterface("Serializable")
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
