package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Util.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes.ReflectionConstant_;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Reflection.classes.ReflectionClassConstant;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Util/Mirror.php

*/

public class Mirror extends RuntimeClassBase {

    public Mirror(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Mirror(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_CONSTANT = 1;

    public static final Object CONST_METHOD = 2;

    public static final Object CONST_STATIC_PROPERTY = 4;

    public static final Object CONST_PROPERTY = 8;

    public static final Object CONST_class = "Psy\\Util\\Mirror";

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
            name = "member",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "filter",
            defaultValue = "15",
            defaultValueType = "number"
        )
        public Object get(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            Object member = assignParameter(args, 1, true);
            if (null == member) {
                member = ZVal.getNull();
            }
            Object filter = assignParameter(args, 2, true);
            if (null == filter) {
                filter = 15;
            }
            Object _pClass = null;
            if (ZVal.toBool(ZVal.strictEqualityCheck(member, "===", ZVal.getNull()))
                    && ZVal.toBool(function_is_string.f.env(env).call(value).value())) {
                if (function_function_exists.f.env(env).call(value).getBool()) {
                    return ZVal.assign(new ReflectionFunction(env, value));

                } else if (ZVal.toBool(function_defined.f.env(env).call(value).value())
                        || ZVal.toBool(
                                ReflectionConstant_.runtimeStaticObject.isMagicConstant(
                                        env, value))) {
                    return ZVal.assign(new ReflectionConstant_(env, value));
                }
            }

            _pClass = runtimeStaticObject.getClass(env, value);
            if (ZVal.strictEqualityCheck(member, "===", ZVal.getNull())) {
                return ZVal.assign(_pClass);

            } else if (ZVal.toBool(ZVal.toLong(filter) & ZVal.toLong(CONST_CONSTANT))
                    && ZVal.toBool(env.callMethod(_pClass, "hasConstant", Mirror.class, member))) {
                return ZVal.assign(
                        ReflectionClassConstant.runtimeStaticObject.create(env, value, member));

            } else if (ZVal.toBool(ZVal.toLong(filter) & ZVal.toLong(CONST_METHOD))
                    && ZVal.toBool(env.callMethod(_pClass, "hasMethod", Mirror.class, member))) {
                return ZVal.assign(env.callMethod(_pClass, "getMethod", Mirror.class, member));

            } else if (ZVal.toBool(ZVal.toLong(filter) & ZVal.toLong(CONST_PROPERTY))
                    && ZVal.toBool(env.callMethod(_pClass, "hasProperty", Mirror.class, member))) {
                return ZVal.assign(env.callMethod(_pClass, "getProperty", Mirror.class, member));

            } else if (ZVal.toBool(
                            ZVal.toBool(ZVal.toLong(filter) & ZVal.toLong(CONST_STATIC_PROPERTY))
                                    && ZVal.toBool(
                                            env.callMethod(
                                                    _pClass, "hasProperty", Mirror.class, member)))
                    && ZVal.toBool(
                            env.callMethod(
                                    env.callMethod(_pClass, "getProperty", Mirror.class, member),
                                    "isStatic",
                                    Mirror.class))) {
                return ZVal.assign(env.callMethod(_pClass, "getProperty", Mirror.class, member));

            } else {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unknown member %s on class %s",
                                                member,
                                                function_is_object.f.env(env).call(value).getBool()
                                                        ? function_get_class
                                                                .f
                                                                .env(env)
                                                                .call(value)
                                                                .value()
                                                        : value)
                                        .value()));
            }
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "value")
        private Object getClass(RuntimeEnv env, Object... args) {
            Object value = assignParameter(args, 0, false);
            if (function_is_object.f.env(env).call(value).getBool()) {
                return ZVal.assign(new ReflectionObject(env, value));
            }

            if (!function_is_string.f.env(env).call(value).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(env, "Mirror expects an object or class"));

            } else if (ZVal.toBool(
                            ZVal.toBool(!function_class_exists.f.env(env).call(value).getBool())
                                    && ZVal.toBool(
                                            !NamespaceGlobal.interface_exists
                                                    .env(env)
                                                    .call(value)
                                                    .getBool()))
                    && ZVal.toBool(!NamespaceGlobal.trait_exists.env(env).call(value).getBool())) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Unknown class or function: " + toStringR(value, env)));
            }

            return ZVal.assign(new ReflectionClass(env, value));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Util\\Mirror")
                    .setLookup(
                            Mirror.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Util/Mirror.php")
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
