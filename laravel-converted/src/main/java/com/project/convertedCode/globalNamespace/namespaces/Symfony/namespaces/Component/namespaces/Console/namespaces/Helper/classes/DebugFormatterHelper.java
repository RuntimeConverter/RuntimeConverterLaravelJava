package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/DebugFormatterHelper.php

*/

public class DebugFormatterHelper extends Helper {

    public Object colors =
            ZVal.arrayFromList(
                    "black", "red", "green", "yellow", "blue", "magenta", "cyan", "white",
                    "default");

    public Object started = ZVal.newArray();

    public Object count = -1;

    public DebugFormatterHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DebugFormatterHelper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "prefix")
    public Object start(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, true);
        if (null == prefix) {
            prefix = "RUN";
        }
        new ReferenceClassProperty(this, "started", env)
                .arrayAccess(env, id)
                .set(
                        ZVal.newArray(
                                new ZPair(
                                        "border",
                                        ZVal.modulus(
                                                ZVal.preIncrement(
                                                        new ReferenceClassProperty(
                                                                this, "count", env)),
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(this.colors)
                                                        .value()))));
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s<bg=blue;fg=white> %s </> <fg=blue>%s</>\n",
                                this.getBorder(env, id), prefix, message)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "buffer")
    @ConvertedParameter(
        index = 2,
        name = "error",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "prefix")
    @ConvertedParameter(index = 4, name = "errorPrefix")
    public Object progress(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object buffer = assignParameter(args, 1, false);
        Object error = assignParameter(args, 2, true);
        if (null == error) {
            error = false;
        }
        Object prefix = assignParameter(args, 3, true);
        if (null == prefix) {
            prefix = "OUT";
        }
        Object errorPrefix = assignParameter(args, 4, true);
        if (null == errorPrefix) {
            errorPrefix = "ERR";
        }
        Object message = null;
        message = "";
        if (ZVal.isTrue(error)) {
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "started", env),
                    env,
                    id,
                    "out")) {
                message = toStringR(message, env) + "\n";
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "started", env),
                        env,
                        id,
                        "out");
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "started", env),
                    env,
                    id,
                    "err")) {
                message =
                        toStringR(message, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s<bg=red;fg=white> %s </> ",
                                                        this.getBorder(env, id), errorPrefix)
                                                .value(),
                                        env);
                new ReferenceClassProperty(this, "started", env)
                        .arrayAccess(env, id, "err")
                        .set(true);
            }

            message =
                    toStringR(message, env)
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "\n",
                                                    function_sprintf
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "\n%s<bg=red;fg=white> %s </> ",
                                                                    this.getBorder(env, id),
                                                                    errorPrefix)
                                                            .value(),
                                                    buffer)
                                            .value(),
                                    env);

        } else {
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "started", env),
                    env,
                    id,
                    "err")) {
                message = toStringR(message, env) + "\n";
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "started", env),
                        env,
                        id,
                        "err");
            }

            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "started", env),
                    env,
                    id,
                    "out")) {
                message =
                        toStringR(message, env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "%s<bg=green;fg=white> %s </> ",
                                                        this.getBorder(env, id), prefix)
                                                .value(),
                                        env);
                new ReferenceClassProperty(this, "started", env)
                        .arrayAccess(env, id, "out")
                        .set(true);
            }

            message =
                    toStringR(message, env)
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    "\n",
                                                    function_sprintf
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "\n%s<bg=green;fg=white> %s </> ",
                                                                    this.getBorder(env, id), prefix)
                                                            .value(),
                                                    buffer)
                                            .value(),
                                    env);
        }

        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(index = 2, name = "successful")
    @ConvertedParameter(index = 3, name = "prefix")
    public Object stop(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, false);
        Object successful = assignParameter(args, 2, false);
        Object prefix = assignParameter(args, 3, true);
        if (null == prefix) {
            prefix = "RES";
        }
        Object trailingEOL = null;
        trailingEOL =
                ZVal.assign(
                        ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        new ReferenceClassProperty(
                                                                this, "started", env),
                                                        env,
                                                        id,
                                                        "out"))
                                        || ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        new ReferenceClassProperty(
                                                                this, "started", env),
                                                        env,
                                                        id,
                                                        "err"))
                                ? "\n"
                                : "");
        if (ZVal.isTrue(successful)) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s%s<bg=green;fg=white> %s </> <fg=green>%s</>\n",
                                    trailingEOL, this.getBorder(env, id), prefix, message)
                            .value());
        }

        message =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s%s<bg=red;fg=white> %s </> <fg=red>%s</>\n",
                                trailingEOL, this.getBorder(env, id), prefix, message)
                        .value();
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "started", env),
                env,
                id,
                "out");
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "started", env),
                env,
                id,
                "err");
        return ZVal.assign(message);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    private Object getBorder(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<bg=%s> </>",
                                new ReferenceClassProperty(this, "colors", env)
                                        .arrayGet(
                                                env,
                                                new ReferenceClassProperty(this, "started", env)
                                                        .arrayGet(env, id, "border")))
                        .value());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "debug_formatter";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Helper\\DebugFormatterHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Helper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\DebugFormatterHelper")
                    .setLookup(
                            DebugFormatterHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("colors", "count", "helperSet", "started")
                    .setFilename("vendor/symfony/console/Helper/DebugFormatterHelper.php")
                    .addInterface("Symfony\\Component\\Console\\Helper\\HelperInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Helper\\Helper")
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
