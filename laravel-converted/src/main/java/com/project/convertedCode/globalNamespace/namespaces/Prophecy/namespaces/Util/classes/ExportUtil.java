package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.RecursionContext.classes.Context;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Prophecy.classes.ProphecyInterface;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Util/ExportUtil.php

*/

public class ExportUtil extends RuntimeClassBase {

    public ExportUtil(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ExportUtil(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Prophecy\\Util\\ExportUtil";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "indentation",
            defaultValue = "0",
            defaultValueType = "number"
        )
        public Object export(RuntimeEnv env, Object... args) {
            ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object indentation = assignParameter(args, 1, true);
            if (null == indentation) {
                indentation = 0;
            }
            return ZVal.assign(
                    runtimeStaticObject.recursiveExport(
                            env,
                            new RuntimeArgsWithReferences().add(0, value),
                            value.getObject(),
                            indentation));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        public Object toArray(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            Object value = assignParameter(args, 0, false);
            Object val = null;
            ReferenceContainer array = new BasicReferenceContainer(null);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object key = null;
            if (!function_is_object.f.env(env).call(value).getBool()) {
                return ZVal.assign(rToArrayCast(value));
            }

            array.setObject(ZVal.newArray());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult969 : ZVal.getIterable(rToArrayCast(value), env, false)) {
                key = ZVal.assign(zpairResult969.getKey());
                val = ZVal.assign(zpairResult969.getValue());
                if (function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/^\\0.+\\0(.+)$/", key, matches.getObject())
                        .getBool()) {
                    key = ZVal.assign(matches.arrayGet(env, 1));
                }

                if (ZVal.strictEqualityCheck(key, "===", "\u0000gcdata")) {
                    continue;
                }

                array.arrayAccess(env, key).set(val);
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(value, SplObjectStorage.class, "SplObjectStorage"))) {
                if (function_property_exists
                        .f
                        .env(env)
                        .call("\\SplObjectStorage", "__storage")
                        .getBool()) {
                    arrayActionR(ArrayAction.UNSET, array, env, "__storage");

                } else if (function_property_exists
                        .f
                        .env(env)
                        .call("\\SplObjectStorage", "storage")
                        .getBool()) {
                    arrayActionR(ArrayAction.UNSET, array, env, "storage");
                }

                if (function_property_exists
                        .f
                        .env(env)
                        .call("\\SplObjectStorage", "__key")
                        .getBool()) {
                    arrayActionR(ArrayAction.UNSET, array, env, "__key");
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult970 : ZVal.getIterable(value, env, false)) {
                    key = ZVal.assign(zpairResult970.getKey());
                    val = ZVal.assign(zpairResult970.getValue());
                    array.arrayAccess(
                                    env, NamespaceGlobal.spl_object_hash.env(env).call(val).value())
                            .set(
                                    ZVal.newArray(
                                            new ZPair("obj", val),
                                            new ZPair(
                                                    "inf",
                                                    env.callMethod(
                                                            value, "getInfo", ExportUtil.class))));
                }
            }

            return ZVal.assign(array.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "indentation")
        @ConvertedParameter(
            index = 2,
            name = "processed",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        protected Object recursiveExport(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            ReferenceContainer value =
                    assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
            Object indentation = assignParameter(args, 1, false);
            Object processed = assignParameter(args, 2, true);
            if (null == processed) {
                processed = ZVal.getNull();
            }
            Object array = null;
            ReferenceContainer v = new BasicReferenceContainer(null);
            Object values = null;
            ReferenceContainer k = new BasicReferenceContainer(null);
            Object whitespace = null;
            Object _pClass = null;
            Object key = null;
            Object hash = null;
            if (ZVal.strictEqualityCheck(value.getObject(), "===", ZVal.getNull())) {
                return "null";
            }

            if (ZVal.strictEqualityCheck(value.getObject(), "===", true)) {
                return "true";
            }

            if (ZVal.strictEqualityCheck(value.getObject(), "===", false)) {
                return "false";
            }

            if (ZVal.toBool(function_is_float.f.env(env).call(value.getObject()).value())
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    NamespaceGlobal.floatval
                                            .env(env)
                                            .call(
                                                    NamespaceGlobal.intval
                                                            .env(env)
                                                            .call(value.getObject())
                                                            .value())
                                            .value(),
                                    "===",
                                    value.getObject()))) {
                return ZVal.assign(toStringR(value.getObject(), env) + ".0");
            }

            if (function_is_resource.f.env(env).call(value.getObject()).getBool()) {
                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "resource(%d) of type (%s)",
                                        value.getObject(),
                                        NamespaceGlobal.get_resource_type
                                                .env(env)
                                                .call(value.getObject())
                                                .value())
                                .value());
            }

            if (function_is_string.f.env(env).call(value.getObject()).getBool()) {
                if (function_preg_match
                        .f
                        .env(env)
                        .call("/[^\\x09-\\x0d\\x20-\\xff]/", value.getObject())
                        .getBool()) {
                    return ZVal.assign(
                            "Binary String: 0x"
                                    + toStringR(
                                            NamespaceGlobal.bin2hex
                                                    .env(env)
                                                    .call(value.getObject())
                                                    .value(),
                                            env));
                }

                return ZVal.assign(
                        "'"
                                + toStringR(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call(
                                                        ZVal.arrayFromList("\r\n", "\n\r", "\r"),
                                                        ZVal.arrayFromList("\n", "\n", "\n"),
                                                        value.getObject())
                                                .value(),
                                        env)
                                + "'");
            }

            whitespace =
                    function_str_repeat.f.env(env).call(" ", ZVal.multiply(4, indentation)).value();
            if (!ZVal.isTrue(processed)) {
                processed = new Context(env);
            }

            if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
                if (ZVal.strictNotEqualityCheck(
                        key =
                                env.callMethod(
                                        processed,
                                        new RuntimeArgsWithReferences().add(0, value),
                                        "contains",
                                        ExportUtil.class,
                                        value.getObject()),
                        "!==",
                        false)) {
                    return ZVal.assign("Array &" + toStringR(key, env));
                }

                array = ZVal.assign(value.getObject());
                key =
                        env.callMethod(
                                processed,
                                new RuntimeArgsWithReferences().add(0, value),
                                "add",
                                ExportUtil.class,
                                value.getObject());
                values = "";
                if (ZVal.isGreaterThan(function_count.f.env(env).call(array).value(), '>', 0)) {
                    for (ZPair zpairResult971 : ZVal.getIterable(array, env, false)) {
                        k.setObject(ZVal.assign(zpairResult971.getKey()));
                        v.setObject(ZVal.assign(zpairResult971.getValue()));
                        values =
                                toStringR(values, env)
                                        + toStringR(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "%s    %s => %s" + "\n",
                                                                whitespace,
                                                                runtimeStaticObject.recursiveExport(
                                                                        env,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, k),
                                                                        k.getObject(),
                                                                        indentation),
                                                                runtimeStaticObject.recursiveExport(
                                                                        env,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(
                                                                                        0,
                                                                                        new ArrayDimensionReference(
                                                                                                value
                                                                                                        .getObject(),
                                                                                                k
                                                                                                        .getObject())),
                                                                        value.arrayGet(
                                                                                env, k.getObject()),
                                                                        ZVal.add(indentation, 1),
                                                                        processed))
                                                        .value(),
                                                env);
                    }

                    values = "\n" + toStringR(values, env) + toStringR(whitespace, env);
                }

                return ZVal.assign(
                        function_sprintf.f.env(env).call("Array &%s (%s)", key, values).value());
            }

            if (function_is_object.f.env(env).call(value.getObject()).getBool()) {
                _pClass = function_get_class.f.env(env).call(value.getObject()).value();
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                value.getObject(),
                                ProphecyInterface.class,
                                "Prophecy\\Prophecy\\ProphecyInterface"))) {
                    return ZVal.assign(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("%s Object (*Prophecy*)", _pClass)
                                    .value());

                } else if (ZVal.isTrue(
                        hash =
                                env.callMethod(
                                        processed,
                                        new RuntimeArgsWithReferences().add(0, value),
                                        "contains",
                                        ExportUtil.class,
                                        value.getObject()))) {
                    return ZVal.assign(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("%s:%s Object", _pClass, hash)
                                    .value());
                }

                hash =
                        env.callMethod(
                                processed,
                                new RuntimeArgsWithReferences().add(0, value),
                                "add",
                                ExportUtil.class,
                                value.getObject());
                values = "";
                array = runtimeStaticObject.toArray(env, value.getObject());
                if (ZVal.isGreaterThan(function_count.f.env(env).call(array).value(), '>', 0)) {
                    for (ZPair zpairResult972 : ZVal.getIterable(array, env, false)) {
                        k.setObject(ZVal.assign(zpairResult972.getKey()));
                        v.setObject(ZVal.assign(zpairResult972.getValue()));
                        values =
                                toStringR(values, env)
                                        + toStringR(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "%s    %s => %s" + "\n",
                                                                whitespace,
                                                                runtimeStaticObject.recursiveExport(
                                                                        env,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, k),
                                                                        k.getObject(),
                                                                        indentation),
                                                                runtimeStaticObject.recursiveExport(
                                                                        env,
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(0, v),
                                                                        v.getObject(),
                                                                        ZVal.add(indentation, 1),
                                                                        processed))
                                                        .value(),
                                                env);
                    }

                    values = "\n" + toStringR(values, env) + toStringR(whitespace, env);
                }

                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call("%s:%s Object (%s)", _pClass, hash, values)
                                .value());
            }

            return ZVal.assign(
                    NamespaceGlobal.var_export.env(env).call(value.getObject(), true).value());
        }

        public Object recursiveExport(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Util\\ExportUtil")
                    .setLookup(
                            ExportUtil.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Util/ExportUtil.php")
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
