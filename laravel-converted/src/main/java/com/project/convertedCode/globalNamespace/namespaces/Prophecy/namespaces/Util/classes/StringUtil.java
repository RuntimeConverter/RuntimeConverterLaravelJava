package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_integer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes.ExportUtil;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Util/StringUtil.php

*/

public class StringUtil extends RuntimeClassBase {

    public StringUtil(RuntimeEnv env, Object... args) {
        super(env);
    }

    public StringUtil(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "exportObject",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object stringify(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Util")
                        .setFile("/vendor/phpspec/prophecy/src/Prophecy/Util/StringUtil.php");
        Object value = assignParameter(args, 0, false);
        Object exportObject = assignParameter(args, 1, true);
        if (null == exportObject) {
            exportObject = true;
        }
        Object str = null;
        Object stringify = null;
        if (function_is_array.f.env(env).call(value).getBool()) {
            if (ZVal.strictEqualityCheck(
                    function_range
                            .f
                            .env(env)
                            .call(
                                    0,
                                    ZVal.subtract(function_count.f.env(env).call(value).value(), 1))
                            .value(),
                    "===",
                    function_array_keys.f.env(env).call(value).value())) {
                return ZVal.assign(
                        "["
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(
                                                        ", ",
                                                        function_array_map
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        ZVal.newArray(
                                                                                new ZPair(0, this),
                                                                                new ZPair(
                                                                                        1,
                                                                                        "stringify")),
                                                                        value)
                                                                .value())
                                                .value(),
                                        env)
                                + "]");
            }

            stringify = ZVal.newArray(new ZPair(0, this), new ZPair(1, "stringify"));
            return ZVal.assign(
                    "["
                            + toStringR(
                                    NamespaceGlobal.implode
                                            .env(env)
                                            .call(
                                                    ", ",
                                                    function_array_map
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    new Closure(
                                                                            env,
                                                                            runtimeConverterFunctionClassConstants,
                                                                            "Prophecy\\Util",
                                                                            this) {
                                                                        @Override
                                                                        @ConvertedMethod
                                                                        @ConvertedParameter(
                                                                            index = 0,
                                                                            name = "item"
                                                                        )
                                                                        @ConvertedParameter(
                                                                            index = 1,
                                                                            name = "key"
                                                                        )
                                                                        public Object run(
                                                                                RuntimeEnv env,
                                                                                Object thisvar,
                                                                                PassByReferenceArgs
                                                                                        runtimePassByReferenceArgs,
                                                                                Object... args) {
                                                                            Object item =
                                                                                    assignParameter(
                                                                                            args, 0,
                                                                                            false);
                                                                            Object key =
                                                                                    assignParameter(
                                                                                            args, 1,
                                                                                            false);
                                                                            Object stringify = null;
                                                                            stringify =
                                                                                    this
                                                                                            .contextReferences
                                                                                            .getCapturedValue(
                                                                                                    "stringify");
                                                                            return ZVal.assign(
                                                                                    toStringR(
                                                                                                    function_is_integer
                                                                                                                    .f
                                                                                                                    .env(
                                                                                                                            env)
                                                                                                                    .call(
                                                                                                                            key)
                                                                                                                    .getBool()
                                                                                                            ? key
                                                                                                            : "\""
                                                                                                                    + toStringR(
                                                                                                                            key,
                                                                                                                            env)
                                                                                                                    + "\"",
                                                                                                    env)
                                                                                            + " => "
                                                                                            + toStringR(
                                                                                                    function_call_user_func
                                                                                                            .f
                                                                                                            .env(
                                                                                                                    env)
                                                                                                            .addReferenceArgs(
                                                                                                                    new RuntimeArgsWithInfo(
                                                                                                                            args,
                                                                                                                            this))
                                                                                                            .call(
                                                                                                                    stringify,
                                                                                                                    item)
                                                                                                            .value(),
                                                                                                    env));
                                                                        }
                                                                    }.use("stringify", stringify),
                                                                    value,
                                                                    function_array_keys
                                                                            .f
                                                                            .env(env)
                                                                            .call(value)
                                                                            .value())
                                                            .value())
                                            .value(),
                                    env)
                            + "]");
        }

        if (function_is_resource.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    toStringR(NamespaceGlobal.get_resource_type.env(env).call(value).value(), env)
                            + ":"
                            + toStringR(value, env));
        }

        if (function_is_object.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    ZVal.isTrue(exportObject)
                            ? ExportUtil.runtimeStaticObject.export(env, value)
                            : function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s:%s",
                                            function_get_class.f.env(env).call(value).value(),
                                            NamespaceGlobal.spl_object_hash
                                                    .env(env)
                                                    .call(value)
                                                    .value())
                                    .value());
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(true, "===", value))
                || ZVal.toBool(ZVal.strictEqualityCheck(false, "===", value))) {
            return ZVal.assign(ZVal.isTrue(value) ? "true" : "false");
        }

        if (function_is_string.f.env(env).call(value).getBool()) {
            str =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "\"%s\"",
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("\n", "\\n", value)
                                            .value())
                            .value();
            if (ZVal.isLessThanOrEqualTo(50, "<=", function_strlen.f.env(env).call(str).value())) {
                return ZVal.assign(
                        toStringR(function_substr.f.env(env).call(str, 0, 50).value(), env)
                                + "\"...");
            }

            return ZVal.assign(str);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
            return "null";
        }

        return ZVal.assign(toStringR(value, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "calls", typeHint = "array")
    public Object stringifyCalls(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Util")
                        .setFile("/vendor/phpspec/prophecy/src/Prophecy/Util/StringUtil.php");
        Object calls = assignParameter(args, 0, false);
        Object self = null;
        self = ZVal.assign(this);
        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "\n",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Prophecy\\Util",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(
                                                        index = 0,
                                                        name = "call",
                                                        typeHint = "Prophecy\\Call\\Call"
                                                    )
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object call =
                                                                assignParameter(args, 0, false);
                                                        Object self = null;
                                                        self =
                                                                this.contextReferences
                                                                        .getCapturedValue("self");
                                                        return ZVal.assign(
                                                                function_sprintf
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "  - %s(%s) @ %s",
                                                                                env.callMethod(
                                                                                        call,
                                                                                        "getMethodName",
                                                                                        StringUtil
                                                                                                .class),
                                                                                NamespaceGlobal
                                                                                        .implode
                                                                                        .env(env)
                                                                                        .call(
                                                                                                ", ",
                                                                                                function_array_map
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                ZVal
                                                                                                                        .newArray(
                                                                                                                                new ZPair(
                                                                                                                                        0,
                                                                                                                                        self),
                                                                                                                                new ZPair(
                                                                                                                                        1,
                                                                                                                                        "stringify")),
                                                                                                                env
                                                                                                                        .callMethod(
                                                                                                                                call,
                                                                                                                                "getArguments",
                                                                                                                                StringUtil
                                                                                                                                        .class))
                                                                                                        .value())
                                                                                        .value(),
                                                                                function_str_replace
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                toStringR(
                                                                                                                function_getcwd
                                                                                                                        .f
                                                                                                                        .env(
                                                                                                                                env)
                                                                                                                        .call()
                                                                                                                        .value(),
                                                                                                                env)
                                                                                                        + toStringR(
                                                                                                                "/",
                                                                                                                env),
                                                                                                "",
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                call,
                                                                                                                "getCallPlace",
                                                                                                                StringUtil
                                                                                                                        .class))
                                                                                        .value())
                                                                        .value());
                                                    }
                                                }.use("self", self),
                                                calls)
                                        .value())
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Util\\StringUtil";

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
                    .setName("Prophecy\\Util\\StringUtil")
                    .setLookup(
                            StringUtil.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Util/StringUtil.php")
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
