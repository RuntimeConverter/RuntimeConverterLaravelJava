package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes;

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
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeClasses.spl.datastructures.SplObjectStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/exporter/src/Exporter.php

*/

public class Exporter extends RuntimeClassBase {

    public Exporter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Exporter(NoConstructor n) {
        super(n);
    }

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
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, value),
                        "recursiveExport",
                        Exporter.class,
                        value.getObject(),
                        indentation));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    @ConvertedParameter(
        index = 1,
        name = "context",
        typeHint = "SebastianBergmann\\RecursionContext\\Context",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object shortenedRecursiveExport(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer data = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object context = assignParameter(args, 1, true);
        if (null == context) {
            context = ZVal.getNull();
        }
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object exporter = null;
        Object array = null;
        Object value = null;
        Object key = null;
        result.setObject(ZVal.newArray());
        exporter =
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .SebastianBergmann
                        .namespaces
                        .Exporter
                        .classes
                        .Exporter(env);
        if (!ZVal.isTrue(context)) {
            context = new Context(env);
        }

        array = ZVal.assign(data.getObject());
        env.callMethod(
                context,
                new RuntimeArgsWithReferences().add(0, data),
                "add",
                Exporter.class,
                data.getObject());
        for (ZPair zpairResult1454 : ZVal.getIterable(array, env, false)) {
            key = ZVal.assign(zpairResult1454.getKey());
            value = ZVal.assign(zpairResult1454.getValue());
            if (function_is_array.f.env(env).call(value).getBool()) {
                if (ZVal.strictNotEqualityCheck(
                        env.callMethod(
                                context,
                                new RuntimeArgsWithReferences()
                                        .add(0, new ArrayDimensionReference(data.getObject(), key)),
                                "contains",
                                Exporter.class,
                                data.arrayGet(env, key)),
                        "!==",
                        false)) {
                    result.arrayAppend(env).set("*RECURSION*");

                } else {
                    result.arrayAppend(env)
                            .set(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "array(%s)",
                                                    env.callMethod(
                                                            this,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(
                                                                            0,
                                                                            new ArrayDimensionReference(
                                                                                    data
                                                                                            .getObject(),
                                                                                    key)),
                                                            "shortenedRecursiveExport",
                                                            Exporter.class,
                                                            data.arrayGet(env, key),
                                                            context))
                                            .value());
                }

            } else {
                result.arrayAppend(env)
                        .set(env.callMethod(exporter, "shortenedExport", Exporter.class, value));
            }
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(", ", result.getObject()).value());
    }

    public Object shortenedRecursiveExport(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object shortenedExport(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object string = null;
        if (function_is_string.f.env(env).call(value).getBool()) {
            string =
                    function_str_replace.f.env(env).call("\n", "", this.export(env, value)).value();
            if (function_function_exists.f.env(env).call("mb_strlen").getBool()) {
                if (ZVal.isGreaterThan(
                        NamespaceGlobal.mb_strlen.env(env).call(string).value(), '>', 40)) {
                    string =
                            toStringR(
                                            NamespaceGlobal.mb_substr
                                                    .env(env)
                                                    .call(string, 0, 30)
                                                    .value(),
                                            env)
                                    + "..."
                                    + toStringR(
                                            NamespaceGlobal.mb_substr
                                                    .env(env)
                                                    .call(string, -7)
                                                    .value(),
                                            env);
                }

            } else {
                if (ZVal.isGreaterThan(function_strlen.f.env(env).call(string).value(), '>', 40)) {
                    string =
                            toStringR(function_substr.f.env(env).call(string, 0, 30).value(), env)
                                    + "..."
                                    + toStringR(
                                            function_substr.f.env(env).call(string, -7).value(),
                                            env);
                }
            }

            return ZVal.assign(string);
        }

        if (function_is_object.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s Object (%s)",
                                    function_get_class.f.env(env).call(value).value(),
                                    ZVal.isGreaterThan(
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(this.toArray(env, value))
                                                            .value(),
                                                    '>',
                                                    0)
                                            ? "..."
                                            : "")
                            .value());
        }

        if (function_is_array.f.env(env).call(value).getBool()) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Array (%s)",
                                    ZVal.isGreaterThan(
                                                    function_count.f.env(env).call(value).value(),
                                                    '>',
                                                    0)
                                            ? "..."
                                            : "")
                            .value());
        }

        return ZVal.assign(this.export(env, value));
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
        for (ZPair zpairResult1455 : ZVal.getIterable(rToArrayCast(value), env, false)) {
            key = ZVal.assign(zpairResult1455.getKey());
            val = ZVal.assign(zpairResult1455.getValue());
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

            if (function_property_exists.f.env(env).call("\\SplObjectStorage", "__key").getBool()) {
                arrayActionR(ArrayAction.UNSET, array, env, "__key");
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1456 : ZVal.getIterable(value, env, false)) {
                key = ZVal.assign(zpairResult1456.getKey());
                val = ZVal.assign(zpairResult1456.getValue());
                array.arrayAccess(env, NamespaceGlobal.spl_object_hash.env(env).call(val).value())
                        .set(
                                ZVal.newArray(
                                        new ZPair("obj", val),
                                        new ZPair(
                                                "inf",
                                                env.callMethod(value, "getInfo", Exporter.class))));
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
        ReferenceContainer value = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
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
                    .call("/[^\\x09-\\x0d\\x1b\\x20-\\xff]/", value.getObject())
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
                                                    "<lf>",
                                                    "\n",
                                                    function_str_replace
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    ZVal.arrayFromList(
                                                                            "\r\n", "\n\r", "\r",
                                                                            "\n"),
                                                                    ZVal.arrayFromList(
                                                                            "\\r\\n<lf>",
                                                                            "\\n\\r<lf>",
                                                                            "\\r<lf>",
                                                                            "\\n<lf>"),
                                                                    value.getObject())
                                                            .value())
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
                                    Exporter.class,
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
                            Exporter.class,
                            value.getObject());
            values = "";
            if (ZVal.isGreaterThan(function_count.f.env(env).call(array).value(), '>', 0)) {
                for (ZPair zpairResult1457 : ZVal.getIterable(array, env, false)) {
                    k.setObject(ZVal.assign(zpairResult1457.getKey()));
                    v.setObject(ZVal.assign(zpairResult1457.getValue()));
                    values =
                            toStringR(values, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "%s    %s => %s" + "\n",
                                                            whitespace,
                                                            env.callMethod(
                                                                    this,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, k),
                                                                    "recursiveExport",
                                                                    Exporter.class,
                                                                    k.getObject(),
                                                                    indentation),
                                                            env.callMethod(
                                                                    this,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(
                                                                                    0,
                                                                                    new ArrayDimensionReference(
                                                                                            value
                                                                                                    .getObject(),
                                                                                            k
                                                                                                    .getObject())),
                                                                    "recursiveExport",
                                                                    Exporter.class,
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
                    hash =
                            env.callMethod(
                                    processed,
                                    new RuntimeArgsWithReferences().add(0, value),
                                    "contains",
                                    Exporter.class,
                                    value.getObject()))) {
                return ZVal.assign(
                        function_sprintf.f.env(env).call("%s Object &%s", _pClass, hash).value());
            }

            hash =
                    env.callMethod(
                            processed,
                            new RuntimeArgsWithReferences().add(0, value),
                            "add",
                            Exporter.class,
                            value.getObject());
            values = "";
            array = this.toArray(env, value.getObject());
            if (ZVal.isGreaterThan(function_count.f.env(env).call(array).value(), '>', 0)) {
                for (ZPair zpairResult1458 : ZVal.getIterable(array, env, false)) {
                    k.setObject(ZVal.assign(zpairResult1458.getKey()));
                    v.setObject(ZVal.assign(zpairResult1458.getValue()));
                    values =
                            toStringR(values, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "%s    %s => %s" + "\n",
                                                            whitespace,
                                                            env.callMethod(
                                                                    this,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, k),
                                                                    "recursiveExport",
                                                                    Exporter.class,
                                                                    k.getObject(),
                                                                    indentation),
                                                            env.callMethod(
                                                                    this,
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, v),
                                                                    "recursiveExport",
                                                                    Exporter.class,
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
                            .call("%s Object &%s (%s)", _pClass, hash, values)
                            .value());
        }

        return ZVal.assign(
                NamespaceGlobal.var_export.env(env).call(value.getObject(), true).value());
    }

    public Object recursiveExport(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "SebastianBergmann\\Exporter\\Exporter";

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
                    .setName("SebastianBergmann\\Exporter\\Exporter")
                    .setLookup(
                            Exporter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/exporter/src/Exporter.php")
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
