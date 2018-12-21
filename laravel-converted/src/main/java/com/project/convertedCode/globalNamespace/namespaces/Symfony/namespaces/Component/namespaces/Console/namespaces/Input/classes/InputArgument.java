package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Input/InputArgument.php

*/

public class InputArgument extends RuntimeClassBase {

    public Object name = null;

    public Object mode = null;

    public Object _pDefault = null;

    public Object description = null;

    public InputArgument(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InputArgument.class) {
            this.__construct(env, args);
        }
    }

    public InputArgument(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "mode",
        typeHint = "int",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "description", typeHint = "string")
    @ConvertedParameter(
        index = 3,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, true);
        if (null == mode) {
            mode = ZVal.getNull();
        }
        Object description = assignParameter(args, 2, true);
        if (null == description) {
            description = "";
        }
        Object _pDefault = assignParameter(args, 3, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", mode)) {
            mode = ZVal.assign(CONST_OPTIONAL);

        } else if (ZVal.toBool(ZVal.isGreaterThan(mode, '>', 7))
                || ZVal.toBool(ZVal.isLessThan(mode, '<', 1))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Argument mode \"%s\" is not valid.", mode)
                                    .value()));
        }

        this.name = name;
        this.mode = mode;
        this.description = description;
        this.setDefault(env, _pDefault);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object isRequired(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        CONST_REQUIRED,
                        "===",
                        ZVal.toLong(CONST_REQUIRED) & ZVal.toLong(this.mode)));
    }

    @ConvertedMethod
    public Object isArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        CONST_IS_ARRAY,
                        "===",
                        ZVal.toLong(CONST_IS_ARRAY) & ZVal.toLong(this.mode)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setDefault(RuntimeEnv env, Object... args) {
        Object _pDefault = assignParameter(args, 0, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (ZVal.toBool(ZVal.strictEqualityCheck(CONST_REQUIRED, "===", this.mode))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pDefault))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Cannot set a default value except for InputArgument::OPTIONAL mode."));
        }

        if (ZVal.isTrue(this.isArray(env))) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", _pDefault)) {
                _pDefault = ZVal.newArray();

            } else if (!function_is_array.f.env(env).call(_pDefault).getBool()) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env, "A default value for an array argument must be an array."));
            }
        }

        this._pDefault = _pDefault;
        return null;
    }

    @ConvertedMethod
    public Object getDefault(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pDefault);
    }

    @ConvertedMethod
    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.description);
    }

    public static final Object CONST_REQUIRED = 1;

    public static final Object CONST_OPTIONAL = 2;

    public static final Object CONST_IS_ARRAY = 4;

    public static final Object CONST_class = "Symfony\\Component\\Console\\Input\\InputArgument";

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
                    .setName("Symfony\\Component\\Console\\Input\\InputArgument")
                    .setLookup(
                            InputArgument.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("default", "description", "mode", "name")
                    .setFilename("vendor/symfony/console/Input/InputArgument.php")
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
