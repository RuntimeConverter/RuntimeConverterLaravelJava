package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Generator.classes.DefinedTargetClass;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Generator/Parameter.php

*/

public class Parameter extends RuntimeClassBase {

    public Object rfp = null;

    public Parameter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Parameter.class) {
            this.__construct(env, args);
        }
    }

    public Parameter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rfp", typeHint = "ReflectionParameter")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object rfp = assignParameter(args, 0, false);
        this.rfp = rfp;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args", typeHint = "array")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(ZVal.newArray(new ZPair(0, this.rfp), new ZPair(1, method)), ___args)
                        .value());
    }

    @ConvertedMethod
    public Object getClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new DefinedTargetClass(env, env.callMethod(this.rfp, "getClass", Parameter.class)));
    }

    @ConvertedMethod
    public Object getTypeHintAsString(RuntimeEnv env, Object... args) {
        Object re = null;
        ReferenceContainer typehintMatch = new BasicReferenceContainer(null);
        Object typehint = null;
        if (function_method_exists.f.env(env).call(this.rfp, "getTypehintText").getBool()) {
            typehint = env.callMethod(this.rfp, "getTypehintText", Parameter.class);
            if (function_in_array
                    .f
                    .env(env)
                    .call(
                            typehint,
                            ZVal.arrayFromList(
                                    "int", "integer", "float", "string", "bool", "boolean"))
                    .getBool()) {
                return "";
            }

            return ZVal.assign(typehint);
        }

        if (ZVal.isTrue(env.callMethod(this.rfp, "isArray", Parameter.class))) {
            return "array";
        }

        if (ZVal.isGreaterThanOrEqualTo(
                NamespaceGlobal.version_compare.env(env).call("7.2.11-dev", "5.4.1").value(),
                ">=",
                0)) {
            try {
                if (ZVal.isTrue(env.callMethod(this.rfp, "getClass", Parameter.class))) {
                    return ZVal.assign(
                            env.callMethod(
                                    env.callMethod(this.rfp, "getClass", Parameter.class),
                                    "getName",
                                    Parameter.class));
                }

            } catch (ConvertedException convertedException83) {
                if (convertedException83.instanceOf(
                        ReflectionException.class, "ReflectionException")) {
                    re = convertedException83.getObject();
                } else {
                    throw convertedException83;
                }
            }
        }

        if (ZVal.toBool(
                        ZVal.isGreaterThanOrEqualTo(
                                NamespaceGlobal.version_compare
                                        .env(env)
                                        .call("7.2.11-dev", "7.0.0-dev")
                                        .value(),
                                ">=",
                                0))
                && ZVal.toBool(env.callMethod(this.rfp, "hasType", Parameter.class))) {
            return ZVal.assign(
                    toStringR(env.callMethod(this.rfp, "getType", Parameter.class), env));
        }

        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, typehintMatch))
                .call(
                        "/^Parameter #[0-9]+ \\[ \\<(required|optional)\\> (?<typehint>\\S+ )?.*\\$"
                                + toStringR(
                                        env.callMethod(this.rfp, "getName", Parameter.class), env)
                                + " .*\\]$/",
                        env.callMethod(this.rfp, "__toString", Parameter.class),
                        typehintMatch.getObject())
                .getBool()) {
            if (!arrayActionR(ArrayAction.EMPTY, typehintMatch, env, "typehint")) {
                return ZVal.assign(typehintMatch.arrayGet(env, "typehint"));
            }
        }

        return "";
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        Object name = null;
        name = env.callMethod(this.rfp, "getName", Parameter.class);
        if (ZVal.toBool(!ZVal.isTrue(name)) || ZVal.toBool(ZVal.equalityCheck(name, "..."))) {
            name =
                    "arg"
                            + toStringR(
                                    ZVal.postIncrement(
                                            env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Mockery
                                                            .namespaces
                                                            .Generator
                                                            .classes
                                                            .Parameter
                                                            .RequestStaticProperties
                                                            .class,
                                                    "parameterCounter")),
                                    env);
        }

        return ZVal.assign(name);
    }

    @ConvertedMethod
    public Object isVariadic(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.rfp, "isVariadic", Parameter.class));
    }

    public static final Object CONST_class = "Mockery\\Generator\\Parameter";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object parameterCounter = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Generator\\Parameter")
                    .setLookup(
                            Parameter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("rfp")
                    .setStaticPropertyNames("parameterCounter")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Generator/Parameter.php")
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
