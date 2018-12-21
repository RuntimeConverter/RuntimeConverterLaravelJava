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
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Input/InputOption.php

*/

public class InputOption extends RuntimeClassBase {

    public Object name = null;

    public Object shortcut = null;

    public Object mode = null;

    public Object _pDefault = null;

    public Object description = null;

    public InputOption(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InputOption.class) {
            this.__construct(env, args);
        }
    }

    public InputOption(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "shortcut",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "mode",
        typeHint = "int",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "description", typeHint = "string")
    @ConvertedParameter(
        index = 4,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object shortcut = assignParameter(args, 1, true);
        if (null == shortcut) {
            shortcut = ZVal.getNull();
        }
        Object mode = assignParameter(args, 2, true);
        if (null == mode) {
            mode = ZVal.getNull();
        }
        Object description = assignParameter(args, 3, true);
        if (null == description) {
            description = "";
        }
        Object _pDefault = assignParameter(args, 4, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object shortcuts = null;
        if (ZVal.strictEqualityCheck(
                0, "===", function_strpos.f.env(env).call(name, "--").value())) {
            name = function_substr.f.env(env).call(name, 2).value();
        }

        if (ZVal.isEmpty(name)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "An option name cannot be empty."));
        }

        if (ZVal.isEmpty(shortcut)) {
            shortcut = ZVal.getNull();
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", shortcut)) {
            if (function_is_array.f.env(env).call(shortcut).getBool()) {
                shortcut = NamespaceGlobal.implode.env(env).call("|", shortcut).value();
            }

            shortcuts =
                    NamespaceGlobal.preg_split
                            .env(env)
                            .call(
                                    "{(\\|)-?}",
                                    function_ltrim.f.env(env).call(shortcut, "-").value())
                            .value();
            shortcuts = function_array_filter.f.env(env).call(shortcuts).value();
            shortcut = NamespaceGlobal.implode.env(env).call("|", shortcuts).value();
            if (ZVal.isEmpty(shortcut)) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(env, "An option shortcut cannot be empty."));
            }
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", mode)) {
            mode = ZVal.assign(CONST_VALUE_NONE);

        } else if (ZVal.toBool(ZVal.isGreaterThan(mode, '>', 15))
                || ZVal.toBool(ZVal.isLessThan(mode, '<', 1))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Option mode \"%s\" is not valid.", mode)
                                    .value()));
        }

        this.name = name;
        this.shortcut = shortcut;
        this.mode = mode;
        this.description = description;
        if (ZVal.toBool(this.isArray(env)) && ZVal.toBool(!ZVal.isTrue(this.acceptValue(env)))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Impossible to have an option mode VALUE_IS_ARRAY if the option does not accept a value."));
        }

        this.setDefault(env, _pDefault);
        return null;
    }

    @ConvertedMethod
    public Object getShortcut(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.shortcut);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object acceptValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.isValueRequired(env)) || ZVal.toBool(this.isValueOptional(env)));
    }

    @ConvertedMethod
    public Object isValueRequired(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        CONST_VALUE_REQUIRED,
                        "===",
                        ZVal.toLong(CONST_VALUE_REQUIRED) & ZVal.toLong(this.mode)));
    }

    @ConvertedMethod
    public Object isValueOptional(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        CONST_VALUE_OPTIONAL,
                        "===",
                        ZVal.toLong(CONST_VALUE_OPTIONAL) & ZVal.toLong(this.mode)));
    }

    @ConvertedMethod
    public Object isArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        CONST_VALUE_IS_ARRAY,
                        "===",
                        ZVal.toLong(CONST_VALUE_IS_ARRAY) & ZVal.toLong(this.mode)));
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
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                CONST_VALUE_NONE,
                                "===",
                                ZVal.toLong(CONST_VALUE_NONE) & ZVal.toLong(this.mode)))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pDefault))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Cannot set a default value when using InputOption::VALUE_NONE mode."));
        }

        if (ZVal.isTrue(this.isArray(env))) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", _pDefault)) {
                _pDefault = ZVal.newArray();

            } else if (!function_is_array.f.env(env).call(_pDefault).getBool()) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env, "A default value for an array option must be an array."));
            }
        }

        this._pDefault = ZVal.isTrue(this.acceptValue(env)) ? _pDefault : false;
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

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "option", typeHint = "self")
    public Object equals(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                ZVal
                                                                                                        .strictEqualityCheck(
                                                                                                                env
                                                                                                                        .callMethod(
                                                                                                                                option,
                                                                                                                                "getName",
                                                                                                                                InputOption
                                                                                                                                        .class),
                                                                                                                "===",
                                                                                                                this
                                                                                                                        .getName(
                                                                                                                                env)))
                                                                                        && ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                .strictEqualityCheck(
                                                                                                                        env
                                                                                                                                .callMethod(
                                                                                                                                        option,
                                                                                                                                        "getShortcut",
                                                                                                                                        InputOption
                                                                                                                                                .class),
                                                                                                                        "===",
                                                                                                                        this
                                                                                                                                .getShortcut(
                                                                                                                                        env))))
                                                                        && ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                option,
                                                                                                                "getDefault",
                                                                                                                InputOption
                                                                                                                        .class),
                                                                                                "===",
                                                                                                this
                                                                                                        .getDefault(
                                                                                                                env))))
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        env.callMethod(
                                                                                option,
                                                                                "isArray",
                                                                                InputOption.class),
                                                                        "===",
                                                                        this.isArray(env))))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        env.callMethod(
                                                                option,
                                                                "isValueRequired",
                                                                InputOption.class),
                                                        "===",
                                                        this.isValueRequired(env))))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        env.callMethod(
                                                option, "isValueOptional", InputOption.class),
                                        "===",
                                        this.isValueOptional(env))));
    }

    public static final Object CONST_VALUE_NONE = 1;

    public static final Object CONST_VALUE_REQUIRED = 2;

    public static final Object CONST_VALUE_OPTIONAL = 4;

    public static final Object CONST_VALUE_IS_ARRAY = 8;

    public static final Object CONST_class = "Symfony\\Component\\Console\\Input\\InputOption";

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
                    .setName("Symfony\\Component\\Console\\Input\\InputOption")
                    .setLookup(
                            InputOption.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("default", "description", "mode", "name", "shortcut")
                    .setFilename("vendor/symfony/console/Input/InputOption.php")
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
