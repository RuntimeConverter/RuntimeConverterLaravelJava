package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Ctype.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-ctype/Ctype.php

*/

public final class Ctype extends RuntimeClassBase {

    public Ctype(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Ctype(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Polyfill\\Ctype\\Ctype";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_alnum(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^A-Za-z0-9]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_alpha(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^A-Za-z]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_cntrl(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^\\x00-\\x1f\\x7f]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_digit(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^0-9]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_graph(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^!-~]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_lower(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^a-z]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_print(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^ -~]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_punct(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^!-\\/\\:-@\\[-`\\{-~]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_space(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^\\s]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_upper(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^A-Z]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "text")
        public Object ctype_xdigit(RuntimeEnv env, Object... args) {
            Object text = assignParameter(args, 0, false);
            text = runtimeStaticObject.convert_int_to_char_for_ctype(env, text);
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(function_is_string.f.env(env).call(text).value())
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck("", "!==", text)))
                            && ZVal.toBool(
                                    !function_preg_match
                                            .f
                                            .env(env)
                                            .call("/[^A-Fa-f0-9]/", text)
                                            .getBool()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "int")
        private Object convert_int_to_char_for_ctype(RuntimeEnv env, Object... args) {
            Object _pInt = assignParameter(args, 0, false);
            if (!function_is_int.f.env(env).call(_pInt).getBool()) {
                return ZVal.assign(_pInt);
            }

            if (ZVal.toBool(ZVal.isLessThan(_pInt, '<', -128))
                    || ZVal.toBool(ZVal.isGreaterThan(_pInt, '>', 255))) {
                return ZVal.assign(toStringR(_pInt, env));
            }

            if (ZVal.isLessThan(_pInt, '<', 0)) {
                _pInt = ZAssignment.add("+=", _pInt, 256);
            }

            return ZVal.assign(NamespaceGlobal.chr.env(env).call(_pInt).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Polyfill\\Ctype\\Ctype")
                    .setLookup(
                            Ctype.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/polyfill-ctype/Ctype.php")
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
