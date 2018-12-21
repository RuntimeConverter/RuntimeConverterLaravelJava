package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionObject;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Sudo.php

*/

public class Sudo extends RuntimeClassBase {

    public Sudo(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Sudo(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Psy\\Sudo";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        @ConvertedParameter(index = 1, name = "property")
        public Object fetchProperty(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            Object property = assignParameter(args, 1, false);
            Object prop = null;
            Object refl = null;
            refl = new ReflectionObject(env, _object);
            prop = env.callMethod(refl, "getProperty", Sudo.class, property);
            env.callMethod(prop, "setAccessible", Sudo.class, true);
            return ZVal.assign(env.callMethod(prop, "getValue", Sudo.class, _object));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        @ConvertedParameter(index = 1, name = "property")
        @ConvertedParameter(index = 2, name = "value")
        public Object assignProperty(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            Object property = assignParameter(args, 1, false);
            Object value = assignParameter(args, 2, false);
            Object prop = null;
            Object refl = null;
            refl = new ReflectionObject(env, _object);
            prop = env.callMethod(refl, "getProperty", Sudo.class, property);
            env.callMethod(prop, "setAccessible", Sudo.class, true);
            env.callMethod(prop, "setValue", Sudo.class, _object, value);
            return ZVal.assign(value);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "object")
        @ConvertedParameter(index = 1, name = "method")
        @ConvertedParameter(
            index = 2,
            name = "args",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object callMethod(RuntimeEnv env, Object... args) {
            Object _object = assignParameter(args, 0, false);
            Object method = assignParameter(args, 1, false);
            Object ___args = assignParameter(args, 2, true);
            if (null == ___args) {
                ___args = ZVal.getNull();
            }
            Object refl = null;
            Object reflMethod = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            _object = function_array_shift.f.env(env).call(___args).value();
            method = function_array_shift.f.env(env).call(___args).value();
            refl = new ReflectionObject(env, _object);
            reflMethod = env.callMethod(refl, "getMethod", Sudo.class, method);
            env.callMethod(reflMethod, "setAccessible", Sudo.class, true);
            return ZVal.assign(
                    env.callMethod(reflMethod, "invokeArgs", Sudo.class, _object, ___args));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "property")
        public Object fetchStaticProperty(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object property = assignParameter(args, 1, false);
            Object prop = null;
            Object refl = null;
            refl = new ReflectionClass(env, _pClass);
            prop = env.callMethod(refl, "getProperty", Sudo.class, property);
            env.callMethod(prop, "setAccessible", Sudo.class, true);
            return ZVal.assign(env.callMethod(prop, "getValue", Sudo.class));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "property")
        @ConvertedParameter(index = 2, name = "value")
        public Object assignStaticProperty(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object property = assignParameter(args, 1, false);
            Object value = assignParameter(args, 2, false);
            Object prop = null;
            Object refl = null;
            refl = new ReflectionClass(env, _pClass);
            prop = env.callMethod(refl, "getProperty", Sudo.class, property);
            env.callMethod(prop, "setAccessible", Sudo.class, true);
            env.callMethod(prop, "setValue", Sudo.class, value);
            return ZVal.assign(value);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "method")
        @ConvertedParameter(
            index = 2,
            name = "args",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object callStatic(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object method = assignParameter(args, 1, false);
            Object ___args = assignParameter(args, 2, true);
            if (null == ___args) {
                ___args = ZVal.getNull();
            }
            Object refl = null;
            Object reflMethod = null;
            ___args =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
            _pClass = function_array_shift.f.env(env).call(___args).value();
            method = function_array_shift.f.env(env).call(___args).value();
            refl = new ReflectionClass(env, _pClass);
            reflMethod = env.callMethod(refl, "getMethod", Sudo.class, method);
            env.callMethod(reflMethod, "setAccessible", Sudo.class, true);
            return ZVal.assign(
                    env.callMethod(reflMethod, "invokeArgs", Sudo.class, ZVal.getNull(), ___args));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        @ConvertedParameter(index = 1, name = "const")
        public Object fetchClassConst(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object _pConst = assignParameter(args, 1, false);
            Object refl = null;
            refl = new ReflectionClass(env, _pClass);
            return ZVal.assign(env.callMethod(refl, "getConstant", Sudo.class, _pConst));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Sudo")
                    .setLookup(
                            Sudo.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Sudo.php")
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
