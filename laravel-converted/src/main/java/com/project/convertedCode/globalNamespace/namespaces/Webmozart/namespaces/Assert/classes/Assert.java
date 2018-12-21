package com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_implements;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_float;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/webmozart/assert/src/Assert.php

*/

public class Assert extends RuntimeClassBase {

    public Assert(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Assert.class) {
            this.__construct(env, args);
        }
    }

    public Assert(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    private Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Webmozart\\Assert\\Assert";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object string(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_string.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a string. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object stringNotEmpty(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("string")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(value, message)
                    .value();
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("notEq")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(value, "", message)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object integer(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_int.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an integer. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object integerish(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.toBool(!function_is_numeric.f.env(env).call(value).getBool())
                    || ZVal.toBool(ZVal.notEqualityCheck(value, ZVal.toLong(value)))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an integerish value. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod(name = "float")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _pFloat(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_float.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a float. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object numeric(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_numeric.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a numeric. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object natural(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.toBool(!function_is_int.f.env(env).call(value).getBool())
                    || ZVal.toBool(ZVal.isLessThan(value, '<', 0))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a non-negative integer. Got %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod(name = "boolean")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _pBoolean(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_bool.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a boolean. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object scalar(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_scalar.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a scalar. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod(name = "object")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _object(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_object.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an object. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(
            index = 1,
            name = "type",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 2, name = "message")
        public Object resource(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object type = assignParameter(args, 1, true);
            if (null == type) {
                type = ZVal.getNull();
            }
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_resource.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a resource. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            if (ZVal.toBool(type)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    type,
                                    "!==",
                                    NamespaceGlobal.get_resource_type
                                            .env(env)
                                            .call(value)
                                            .value()))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a resource of type %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                type)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isCallable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_callable.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a callable. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isArray(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_is_array.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an array. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isTraversable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            NamespaceGlobal.trigger_error
                    .env(env)
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The \"%s\" assertion is deprecated. You should stop using it, as it will soon be removed in 2.0 version. Use \"isIterable\" or \"isInstanceOf\" instead.",
                                            "Assert::isTraversable")
                                    .value(),
                            16384)
                    .value();
            if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            value, Traversable.class, "Traversable")))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a traversable. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isArrayAccessible(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            value, ArrayAccess.class, "ArrayAccess")))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an array accessible. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isCountable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(value, Countable.class, "Countable")))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a countable. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isIterable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            value, Traversable.class, "Traversable")))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an iterable. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "message")
        public Object isInstanceOf(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object _pClass = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!ZVal.isTrue(ZVal.checkInstanceTypeMatch(value, _pClass))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an instance of %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                _pClass)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "message")
        public Object notInstanceOf(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object _pClass = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(value, _pClass))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an instance other than %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("typeToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                _pClass)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "classes", typeHint = "array")
        @ConvertedParameter(index = 2, name = "message")
        public Object isInstanceOfAny(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object classes = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            Object _pClass = null;
            for (ZPair zpairResult2251 : ZVal.getIterable(classes, env, true)) {
                _pClass = ZVal.assign(zpairResult2251.getValue());
                if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(value, _pClass))) {
                    return null;
                }
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("reportInvalidArgument")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.isTrue(ternaryExpressionTemp = message)
                                                    ? ternaryExpressionTemp
                                                    : "Expected an instance of any of %2$s. Got: %s",
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Assert.class)
                                                    .method("typeToString")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(value)
                                                    .value(),
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ", ",
                                                            function_array_map
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            ZVal.arrayFromList(
                                                                                    "static",
                                                                                    "valueToString"),
                                                                            classes)
                                                                    .value())
                                                    .value())
                                    .value())
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object isEmpty(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!ZVal.isEmpty(value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an empty value. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object notEmpty(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isEmpty(value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a non-empty value. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod(name = "null")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _null(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected null. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object notNull(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                ZVal.isTrue(ternaryExpressionTemp = message)
                                        ? ternaryExpressionTemp
                                        : "Expected a value other than null.")
                        .value();
            }

            return null;
        }

        @ConvertedMethod(name = "true")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _true(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictNotEqualityCheck(true, "!==", value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to be true. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod(name = "false")
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object _false(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictNotEqualityCheck(false, "!==", value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to be false. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "value2")
        @ConvertedParameter(index = 2, name = "message")
        public Object eq(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object value2 = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.notEqualityCheck(value2, value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value equal to %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value2)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "value2")
        @ConvertedParameter(index = 2, name = "message")
        public Object notEq(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object value2 = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.equalityCheck(value2, value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a different value than %s.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value2)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "value2")
        @ConvertedParameter(index = 2, name = "message")
        public Object same(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object value2 = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictNotEqualityCheck(value2, "!==", value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value identical to %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value2)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "value2")
        @ConvertedParameter(index = 2, name = "message")
        public Object notSame(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object value2 = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictEqualityCheck(value2, "===", value)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value not identical to %s.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value2)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "limit")
        @ConvertedParameter(index = 2, name = "message")
        public Object greaterThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object limit = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isLessThanOrEqualTo(value, "<=", limit)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value greater than %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(limit)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "limit")
        @ConvertedParameter(index = 2, name = "message")
        public Object greaterThanEq(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object limit = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isLessThan(value, '<', limit)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value greater than or equal to %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(limit)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "limit")
        @ConvertedParameter(index = 2, name = "message")
        public Object lessThan(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object limit = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isGreaterThanOrEqualTo(value, ">=", limit)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value less than %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(limit)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "limit")
        @ConvertedParameter(index = 2, name = "message")
        public Object lessThanEq(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object limit = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isGreaterThan(value, '>', limit)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value less than or equal to %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(limit)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "max")
        @ConvertedParameter(index = 3, name = "message")
        public Object range(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object min = assignParameter(args, 1, false);
            Object max = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.toBool(ZVal.isLessThan(value, '<', min))
                    || ZVal.toBool(ZVal.isGreaterThan(value, '>', max))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value between %2$s and %3$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(min)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(max)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "values", typeHint = "array")
        @ConvertedParameter(index = 2, name = "message")
        public Object oneOf(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object values = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_in_array.f.env(env).call(value, values, true).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected one of: %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                ", ",
                                                                function_array_map
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                ZVal.arrayFromList(
                                                                                        "static",
                                                                                        "valueToString"),
                                                                                values)
                                                                        .value())
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "subString")
        @ConvertedParameter(index = 2, name = "message")
        public Object contains(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object subString = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictEqualityCheck(
                    false, "===", function_strpos.f.env(env).call(value, subString).value())) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(subString)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "subString")
        @ConvertedParameter(index = 2, name = "message")
        public Object notContains(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object subString = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictNotEqualityCheck(
                    false, "!==", function_strpos.f.env(env).call(value, subString).value())) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "%2$s was not expected to be contained in a value. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(subString)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object notWhitespaceOnly(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (function_preg_match.f.env(env).call("/^\\s*$/", value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a non-whitespace string. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "prefix")
        @ConvertedParameter(index = 2, name = "message")
        public Object startsWith(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object prefix = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictNotEqualityCheck(
                    0, "!==", function_strpos.f.env(env).call(value, prefix).value())) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to start with %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(prefix)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object startsWithLetter(RuntimeEnv env, Object... args) {
            ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object valid = null;
            Object ternaryExpressionTemp = null;
            Object locale = null;
            valid = ZVal.assign(arrayActionR(ArrayAction.ISSET, value, env, 0));
            if (ZVal.isTrue(valid)) {
                locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
                NamespaceGlobal.setlocale.env(env).call(0, "C");
                valid = NamespaceGlobal.ctype_alpha.env(env).call(value.arrayGet(env, 0)).value();
                NamespaceGlobal.setlocale.env(env).call(0, locale);
            }

            if (!ZVal.isTrue(valid)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to start with a letter. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value.getObject())
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "suffix")
        @ConvertedParameter(index = 2, name = "message")
        public Object endsWith(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object suffix = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictNotEqualityCheck(
                    suffix,
                    "!==",
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    value,
                                    ZVal.minusSign(
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Assert.class)
                                                    .method("strlen")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(suffix)
                                                    .value()))
                            .value())) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to end with %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(suffix)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "pattern")
        @ConvertedParameter(index = 2, name = "message")
        public Object regex(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object pattern = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_preg_match.f.env(env).call(pattern, value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "The value %s does not match the expected pattern.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object alpha(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object valid = null;
            Object ternaryExpressionTemp = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_alpha.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain only letters. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object digits(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object valid = null;
            Object ternaryExpressionTemp = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_digit.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain digits only. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object alnum(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object valid = null;
            Object ternaryExpressionTemp = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_alnum.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain letters and digits only. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object lower(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object valid = null;
            Object ternaryExpressionTemp = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_lower.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain lowercase characters only. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object upper(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object valid = null;
            Object ternaryExpressionTemp = null;
            Object locale = null;
            locale = NamespaceGlobal.setlocale.env(env).call(0, 0).value();
            NamespaceGlobal.setlocale.env(env).call(0, "C");
            valid = !NamespaceGlobal.ctype_upper.env(env).call(value).getBool();
            NamespaceGlobal.setlocale.env(env).call(0, locale);
            if (ZVal.isTrue(valid)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain uppercase characters only. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "length")
        @ConvertedParameter(index = 2, name = "message")
        public Object length(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object length = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.strictNotEqualityCheck(
                    length,
                    "!==",
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                            .method("strlen")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(value)
                            .value())) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain %2$s characters. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                length)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "message")
        public Object minLength(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object min = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isLessThan(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                            .method("strlen")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(value)
                            .value(),
                    '<',
                    min)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain at least %2$s characters. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                min)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "max")
        @ConvertedParameter(index = 2, name = "message")
        public Object maxLength(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object max = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isGreaterThan(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                            .method("strlen")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(value)
                            .value(),
                    '>',
                    max)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain at most %2$s characters. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                max)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "max")
        @ConvertedParameter(index = 3, name = "message")
        public Object lengthBetween(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object min = assignParameter(args, 1, false);
            Object max = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object length = null;
            Object ternaryExpressionTemp = null;
            length =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                            .method("strlen")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(value)
                            .value();
            if (ZVal.toBool(ZVal.isLessThan(length, '<', min))
                    || ZVal.toBool(ZVal.isGreaterThan(length, '>', max))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a value to contain between %2$s and %3$s characters. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                min,
                                                max)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object fileExists(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("string")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(value)
                    .value();
            if (!function_file_exists.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "The file %s does not exist.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object file(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("fileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(value, message)
                    .value();
            if (!function_is_file.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "The path %s is not a file.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object directory(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("fileExists")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(value, message)
                    .value();
            if (!function_is_dir.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "The path %s is no directory.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object readable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!NamespaceGlobal.is_readable.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "The path %s is not readable.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object writable(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!NamespaceGlobal.is_writable.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "The path %s is not writable.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object classExists(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_class_exists.f.env(env).call(value).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an existing class name. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "message")
        public Object subclassOf(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object _pClass = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!NamespaceGlobal.is_subclass_of.env(env).call(value, _pClass).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected a sub-class of %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(_pClass)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "interface")
        @ConvertedParameter(index = 2, name = "message")
        public Object implementsInterface(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object _pInterface = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_in_array
                    .f
                    .env(env)
                    .call(_pInterface, function_class_implements.f.env(env).call(value).value())
                    .getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an implementation of %2$s. Got: %s",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value(),
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(_pInterface)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "property")
        @ConvertedParameter(index = 2, name = "message")
        public Object propertyExists(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, false);
            Object property = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_property_exists.f.env(env).call(classOrObject, property).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected the property %s to exist.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(property)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "property")
        @ConvertedParameter(index = 2, name = "message")
        public Object propertyNotExists(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, false);
            Object property = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (function_property_exists.f.env(env).call(classOrObject, property).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected the property %s to not exist.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(property)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "method")
        @ConvertedParameter(index = 2, name = "message")
        public Object methodExists(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, false);
            Object method = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_method_exists.f.env(env).call(classOrObject, method).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected the method %s to exist.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(method)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classOrObject")
        @ConvertedParameter(index = 1, name = "method")
        @ConvertedParameter(index = 2, name = "message")
        public Object methodNotExists(RuntimeEnv env, Object... args) {
            Object classOrObject = assignParameter(args, 0, false);
            Object method = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (function_method_exists.f.env(env).call(classOrObject, method).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected the method %s to not exist.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(method)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(index = 2, name = "message")
        public Object keyExists(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object key = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (!function_array_key_exists.f.env(env).call(key, array).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected the key %s to exist.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(key)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "key")
        @ConvertedParameter(index = 2, name = "message")
        public Object keyNotExists(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object key = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (function_array_key_exists.f.env(env).call(key, array).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected the key %s to not exist.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(key)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "number")
        @ConvertedParameter(index = 2, name = "message")
        public Object count(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object number = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("eq")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            function_count.f.env(env).call(array).value(),
                            number,
                            ZVal.isTrue(ternaryExpressionTemp = message)
                                    ? ternaryExpressionTemp
                                    : function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Expected an array to contain %d elements. Got: %d.",
                                                    number,
                                                    function_count.f.env(env).call(array).value())
                                            .value())
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "message")
        public Object minCount(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object min = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isLessThan(function_count.f.env(env).call(array).value(), '<', min)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an array to contain at least %2$d elements. Got: %d",
                                                function_count.f.env(env).call(array).value(),
                                                min)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "max")
        @ConvertedParameter(index = 2, name = "message")
        public Object maxCount(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object max = assignParameter(args, 1, false);
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            if (ZVal.isGreaterThan(function_count.f.env(env).call(array).value(), '>', max)) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an array to contain at most %2$d elements. Got: %d",
                                                function_count.f.env(env).call(array).value(),
                                                max)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "array")
        @ConvertedParameter(index = 1, name = "min")
        @ConvertedParameter(index = 2, name = "max")
        @ConvertedParameter(index = 3, name = "message")
        public Object countBetween(RuntimeEnv env, Object... args) {
            Object array = assignParameter(args, 0, false);
            Object min = assignParameter(args, 1, false);
            Object max = assignParameter(args, 2, false);
            Object message = assignParameter(args, 3, true);
            if (null == message) {
                message = "";
            }
            Object count = null;
            Object ternaryExpressionTemp = null;
            count = function_count.f.env(env).call(array).value();
            if (ZVal.toBool(ZVal.isLessThan(count, '<', min))
                    || ZVal.toBool(ZVal.isGreaterThan(count, '>', max))) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Expected an array to contain between %2$d and %3$d elements. Got: %d",
                                                count,
                                                min,
                                                max)
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        @ConvertedParameter(index = 1, name = "message")
        public Object uuid(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object message = assignParameter(args, 1, true);
            if (null == message) {
                message = "";
            }
            Object ternaryExpressionTemp = null;
            value =
                    function_str_replace
                            .f
                            .env(env)
                            .call(ZVal.arrayFromList("urn:", "uuid:", "{", "}"), "", value)
                            .value();
            if (ZVal.strictEqualityCheck("00000000-0000-0000-0000-000000000000", "===", value)) {
                return null;
            }

            if (!function_preg_match
                    .f
                    .env(env)
                    .call(
                            "/^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$/",
                            value)
                    .getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("reportInvalidArgument")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.isTrue(ternaryExpressionTemp = message)
                                                        ? ternaryExpressionTemp
                                                        : "Value %s is not a valid UUID.",
                                                StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                env, this, Assert.class)
                                                        .method("valueToString")
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences())
                                                        .call(value)
                                                        .value())
                                        .value())
                        .value();
            }

            return null;
        }

        @ConvertedMethod(name = "throws")
        @ConvertedParameter(index = 0, name = "expression", typeHint = "Closure")
        @ConvertedParameter(index = 1, name = "class")
        @ConvertedParameter(index = 2, name = "message")
        public Object _pThrows(RuntimeEnv env, Object... args) {
            Object expression = assignParameter(args, 0, false);
            Object _pClass = assignParameter(args, 1, true);
            if (null == _pClass) {
                _pClass = "Exception";
            }
            Object message = assignParameter(args, 2, true);
            if (null == message) {
                message = "";
            }
            Object actual = null;
            Object e = null;
            Object ternaryExpressionTemp = null;
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("string")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(_pClass)
                    .value();
            actual = "none";
            try {
                env.callFunctionDynamic(expression, new RuntimeArgsWithReferences());
            } catch (ConvertedException convertedException331) {
                if (convertedException331.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException331.getObject();
                    actual = function_get_class.f.env(env).call(e).value();
                    if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(e, _pClass))) {
                        return null;
                    }

                } else if (convertedException331.instanceOf(Throwable.class, "Throwable")) {
                    e = convertedException331.getObject();
                    actual = function_get_class.f.env(env).call(e).value();
                    if (ZVal.isTrue(ZVal.checkInstanceTypeMatch(e, _pClass))) {
                        return null;
                    }

                } else {
                    throw convertedException331;
                }
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                    .method("reportInvalidArgument")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            ZVal.isTrue(ternaryExpressionTemp = message)
                                    ? ternaryExpressionTemp
                                    : function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Expected to throw \"%s\", got \"%s\"",
                                                    _pClass, actual)
                                            .value())
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "arguments")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            ReferenceContainer arguments =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            ReferenceContainer ___args = new BasicReferenceContainer(null);
            Object entry = null;
            Object method = null;
            if (ZVal.strictEqualityCheck(
                    "nullOr", "===", function_substr.f.env(env).call(name, 0, 6).value())) {
                if (ZVal.strictNotEqualityCheck(
                        ZVal.getNull(), "!==", arguments.arrayGet(env, 0))) {
                    method =
                            NamespaceGlobal.lcfirst
                                    .env(env)
                                    .call(function_substr.f.env(env).call(name, 6).value())
                                    .value();
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(new ZPair(0, "static"), new ZPair(1, method)),
                                    arguments.getObject());
                }

                return null;
            }

            if (ZVal.strictEqualityCheck(
                    "all", "===", function_substr.f.env(env).call(name, 0, 3).value())) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Assert.class)
                        .method("isIterable")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(arguments.arrayGet(env, 0))
                        .value();
                method =
                        NamespaceGlobal.lcfirst
                                .env(env)
                                .call(function_substr.f.env(env).call(name, 3).value())
                                .value();
                ___args.setObject(ZVal.assign(arguments.getObject()));
                for (ZPair zpairResult2252 :
                        ZVal.getIterable(arguments.arrayGet(env, 0), env, true)) {
                    entry = ZVal.assign(zpairResult2252.getValue());
                    ___args.arrayAccess(env, 0).set(entry);
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(new ZPair(0, "static"), new ZPair(1, method)),
                                    ___args.getObject());
                }

                return null;
            }

            throw ZVal.getException(
                    env,
                    new BadMethodCallException(env, "No such method: " + toStringR(name, env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        protected Object valueToString(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
                return "null";
            }

            if (ZVal.strictEqualityCheck(true, "===", value)) {
                return "true";
            }

            if (ZVal.strictEqualityCheck(false, "===", value)) {
                return "false";
            }

            if (function_is_array.f.env(env).call(value).getBool()) {
                return "array";
            }

            if (function_is_object.f.env(env).call(value).getBool()) {
                return ZVal.assign(function_get_class.f.env(env).call(value).value());
            }

            if (function_is_resource.f.env(env).call(value).getBool()) {
                return "resource";
            }

            if (function_is_string.f.env(env).call(value).getBool()) {
                return ZVal.assign("\"" + toStringR(value, env) + "\"");
            }

            return ZVal.assign(toStringR(value, env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        protected Object typeToString(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_is_object.f.env(env).call(value).getBool()
                            ? function_get_class.f.env(env).call(value).value()
                            : NamespaceGlobal.gettype.env(env).call(value).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        protected Object strlen(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object encoding = null;
            if (!function_function_exists.f.env(env).call("mb_detect_encoding").getBool()) {
                return ZVal.assign(function_strlen.f.env(env).call(value).value());
            }

            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    encoding = NamespaceGlobal.mb_detect_encoding.env(env).call(value).value())) {
                return ZVal.assign(function_strlen.f.env(env).call(value).value());
            }

            return ZVal.assign(NamespaceGlobal.mb_strwidth.env(env).call(value, encoding).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "message")
        protected Object reportInvalidArgument(RuntimeEnv env, Object... args) {
            Object message = assignParameter(args, 0, false);
            throw ZVal.getException(env, new InvalidArgumentException(env, message));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Webmozart\\Assert\\Assert")
                    .setLookup(
                            Assert.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/webmozart/assert/src/Assert.php")
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
