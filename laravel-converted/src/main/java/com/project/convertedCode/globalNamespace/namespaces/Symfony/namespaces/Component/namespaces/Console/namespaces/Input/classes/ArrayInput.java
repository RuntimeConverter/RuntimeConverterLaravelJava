package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidOptionException;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.Input;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Input/ArrayInput.php

*/

public class ArrayInput extends Input {

    public Object parameters = null;

    public ArrayInput(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArrayInput.class) {
            this.__construct(env, args);
        }
    }

    public ArrayInput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        Object definition = assignParameter(args, 1, true);
        if (null == definition) {
            definition = ZVal.getNull();
        }
        this.parameters = parameters;
        super.__construct(env, definition);
        return null;
    }

    @ConvertedMethod
    public Object getFirstArgument(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object value = null;
        ReferenceContainer key = new BasicReferenceContainer(null);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1723 : ZVal.getIterable(this.parameters, env, false)) {
            key.setObject(ZVal.assign(zpairResult1723.getKey()));
            value = ZVal.assign(zpairResult1723.getValue());
            if (ZVal.toBool(key.getObject())
                    && ZVal.toBool(ZVal.strictEqualityCheck("-", "===", key.arrayGet(env, 0)))) {
                continue;
            }

            return ZVal.assign(value);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    @ConvertedParameter(
        index = 1,
        name = "onlyParams",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object hasParameterOption(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object onlyParams = assignParameter(args, 1, true);
        if (null == onlyParams) {
            onlyParams = false;
        }
        Object v = null;
        Object k = null;
        values = ZVal.assign(rToArrayCast(values));
        for (ZPair zpairResult1724 : ZVal.getIterable(this.parameters, env, false)) {
            k = ZVal.assign(zpairResult1724.getKey());
            v = ZVal.assign(zpairResult1724.getValue());
            if (!function_is_int.f.env(env).call(k).getBool()) {
                v = ZVal.assign(k);
            }

            if (ZVal.toBool(onlyParams) && ZVal.toBool(ZVal.strictEqualityCheck("--", "===", v))) {
                return ZVal.assign(false);
            }

            if (function_in_array.f.env(env).call(v, values).getBool()) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "onlyParams",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getParameterOption(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = false;
        }
        Object onlyParams = assignParameter(args, 2, true);
        if (null == onlyParams) {
            onlyParams = false;
        }
        Object v = null;
        Object k = null;
        values = ZVal.assign(rToArrayCast(values));
        for (ZPair zpairResult1725 : ZVal.getIterable(this.parameters, env, false)) {
            k = ZVal.assign(zpairResult1725.getKey());
            v = ZVal.assign(zpairResult1725.getValue());
            if (ZVal.toBool(onlyParams)
                    && ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck("--", "===", k))
                                    || ZVal.toBool(
                                            ZVal.toBool(function_is_int.f.env(env).call(k).value())
                                                    && ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "--", "===", v))))) {
                return ZVal.assign(false);
            }

            if (function_is_int.f.env(env).call(k).getBool()) {
                if (function_in_array.f.env(env).call(v, values).getBool()) {
                    return ZVal.assign(true);
                }

            } else if (function_in_array.f.env(env).call(k, values).getBool()) {
                return ZVal.assign(v);
            }
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object val = null;
        ReferenceContainer param = new BasicReferenceContainer(null);
        Object v = null;
        ReferenceContainer params = new BasicReferenceContainer(null);
        params.setObject(ZVal.newArray());
        for (ZPair zpairResult1726 : ZVal.getIterable(this.parameters, env, false)) {
            param.setObject(ZVal.assign(zpairResult1726.getKey()));
            val = ZVal.assign(zpairResult1726.getValue());
            if (ZVal.toBool(param.getObject())
                    && ZVal.toBool(ZVal.strictEqualityCheck("-", "===", param.arrayGet(env, 0)))) {
                if (function_is_array.f.env(env).call(val).getBool()) {
                    for (ZPair zpairResult1727 : ZVal.getIterable(val, env, true)) {
                        v = ZVal.assign(zpairResult1727.getValue());
                        params.arrayAppend(env)
                                .set(
                                        toStringR(param.getObject(), env)
                                                + toStringR(
                                                        ZVal.notEqualityCheck("", v)
                                                                ? "="
                                                                        + toStringR(
                                                                                env.callMethod(
                                                                                        this,
                                                                                        "escapeToken",
                                                                                        ArrayInput
                                                                                                .class,
                                                                                        v),
                                                                                env)
                                                                : "",
                                                        env));
                    }

                } else {
                    params.arrayAppend(env)
                            .set(
                                    toStringR(param.getObject(), env)
                                            + toStringR(
                                                    ZVal.notEqualityCheck("", val)
                                                            ? "="
                                                                    + toStringR(
                                                                            env.callMethod(
                                                                                    this,
                                                                                    "escapeToken",
                                                                                    ArrayInput
                                                                                            .class,
                                                                                    val),
                                                                            env)
                                                            : "",
                                                    env));
                }

            } else {
                params.arrayAppend(env)
                        .set(
                                function_is_array.f.env(env).call(val).getBool()
                                        ? NamespaceGlobal.implode
                                                .env(env)
                                                .call(
                                                        " ",
                                                        function_array_map
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        ZVal.newArray(
                                                                                new ZPair(0, this),
                                                                                new ZPair(
                                                                                        1,
                                                                                        "escapeToken")),
                                                                        val)
                                                                .value())
                                                .value()
                                        : env.callMethod(
                                                this, "escapeToken", ArrayInput.class, val));
            }
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(" ", params.getObject()).value());
    }

    @ConvertedMethod
    protected Object parse(RuntimeEnv env, Object... args) {
        Object value = null;
        ReferenceContainer key = new BasicReferenceContainer(null);
        for (ZPair zpairResult1728 : ZVal.getIterable(this.parameters, env, false)) {
            key.setObject(ZVal.assign(zpairResult1728.getKey()));
            value = ZVal.assign(zpairResult1728.getValue());
            if (ZVal.strictEqualityCheck("--", "===", key.getObject())) {
                return null;
            }

            if (ZVal.strictEqualityCheck(
                    0, "===", function_strpos.f.env(env).call(key.getObject(), "--").value())) {
                this.addLongOption(
                        env, function_substr.f.env(env).call(key.getObject(), 2).value(), value);

            } else if (ZVal.strictEqualityCheck("-", "===", key.arrayGet(env, 0))) {
                this.addShortOption(
                        env, function_substr.f.env(env).call(key.getObject(), 1).value(), value);

            } else {
                this.addArgument(env, key.getObject(), value);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shortcut")
    @ConvertedParameter(index = 1, name = "value")
    private Object addShortOption(RuntimeEnv env, Object... args) {
        Object shortcut = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "hasShortcut",
                        ArrayInput.class,
                        shortcut))) {
            throw ZVal.getException(
                    env,
                    new InvalidOptionException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"-%s\" option does not exist.", shortcut)
                                    .value()));
        }

        this.addLongOption(
                env,
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("definition").value(),
                                "getOptionForShortcut",
                                ArrayInput.class,
                                shortcut),
                        "getName",
                        ArrayInput.class),
                value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    private Object addLongOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object option = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "hasOption",
                        ArrayInput.class,
                        name))) {
            throw ZVal.getException(
                    env,
                    new InvalidOptionException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"--%s\" option does not exist.", name)
                                    .value()));
        }

        option =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "getOption",
                        ArrayInput.class,
                        name);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
            if (ZVal.isTrue(env.callMethod(option, "isValueRequired", ArrayInput.class))) {
                throw ZVal.getException(
                        env,
                        new InvalidOptionException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("The \"--%s\" option requires a value.", name)
                                        .value()));
            }

            if (!ZVal.isTrue(env.callMethod(option, "isValueOptional", ArrayInput.class))) {
                value = true;
            }
        }

        new ReferenceClassProperty(this, "options", env).arrayAccess(env, name).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    private Object addArgument(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "hasArgument",
                        ArrayInput.class,
                        name))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"%s\" argument does not exist.", name)
                                    .value()));
        }

        new ReferenceClassProperty(this, "arguments", env).arrayAccess(env, name).set(value);
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Input\\ArrayInput";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Input.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Input\\ArrayInput")
                    .setLookup(
                            ArrayInput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments",
                            "definition",
                            "interactive",
                            "options",
                            "parameters",
                            "stream")
                    .setFilename("vendor/symfony/console/Input/ArrayInput.php")
                    .addInterface("Symfony\\Component\\Console\\Input\\InputInterface")
                    .addInterface("Symfony\\Component\\Console\\Input\\StreamableInputInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Input\\Input")
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
