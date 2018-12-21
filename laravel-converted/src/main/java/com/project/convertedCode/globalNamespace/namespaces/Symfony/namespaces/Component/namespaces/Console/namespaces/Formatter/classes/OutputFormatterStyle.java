package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatterStyleInterface;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Formatter/OutputFormatterStyle.php

*/

public class OutputFormatterStyle extends RuntimeClassBase
        implements OutputFormatterStyleInterface {

    public Object foreground = null;

    public Object background = null;

    public Object options = ZVal.newArray();

    public OutputFormatterStyle(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == OutputFormatterStyle.class) {
            this.__construct(env, args);
        }
    }

    public OutputFormatterStyle(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "foreground",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "background",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object foreground = assignParameter(args, 0, true);
        if (null == foreground) {
            foreground = ZVal.getNull();
        }
        Object background = assignParameter(args, 1, true);
        if (null == background) {
            background = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", foreground)) {
            this.setForeground(env, foreground);
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", background)) {
            this.setBackground(env, background);
        }

        if (function_count.f.env(env).call(options).getBool()) {
            this.setOptions(env, options);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "color",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setForeground(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, true);
        if (null == color) {
            color = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", color)) {
            this.foreground = ZVal.getNull();
            return null;
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Console
                                .namespaces
                                .Formatter
                                .classes
                                .OutputFormatterStyle
                                .RequestStaticProperties
                                .class,
                        "availableForegroundColors"),
                env,
                color)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Invalid foreground color specified: \"%s\". Expected one of (%s)",
                                            color,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ", ",
                                                            function_array_keys
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            env
                                                                                    .getRequestStaticProperties(
                                                                                            com.project
                                                                                                    .convertedCode
                                                                                                    .globalNamespace
                                                                                                    .namespaces
                                                                                                    .Symfony
                                                                                                    .namespaces
                                                                                                    .Component
                                                                                                    .namespaces
                                                                                                    .Console
                                                                                                    .namespaces
                                                                                                    .Formatter
                                                                                                    .classes
                                                                                                    .OutputFormatterStyle
                                                                                                    .RequestStaticProperties
                                                                                                    .class)
                                                                                    .availableForegroundColors)
                                                                    .value())
                                                    .value())
                                    .value()));
        }

        this.foreground =
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Console
                                        .namespaces
                                        .Formatter
                                        .classes
                                        .OutputFormatterStyle
                                        .RequestStaticProperties
                                        .class,
                                "availableForegroundColors")
                        .arrayGet(env, color);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "color",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setBackground(RuntimeEnv env, Object... args) {
        Object color = assignParameter(args, 0, true);
        if (null == color) {
            color = ZVal.getNull();
        }
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", color)) {
            this.background = ZVal.getNull();
            return null;
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Console
                                .namespaces
                                .Formatter
                                .classes
                                .OutputFormatterStyle
                                .RequestStaticProperties
                                .class,
                        "availableBackgroundColors"),
                env,
                color)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Invalid background color specified: \"%s\". Expected one of (%s)",
                                            color,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ", ",
                                                            function_array_keys
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            env
                                                                                    .getRequestStaticProperties(
                                                                                            com.project
                                                                                                    .convertedCode
                                                                                                    .globalNamespace
                                                                                                    .namespaces
                                                                                                    .Symfony
                                                                                                    .namespaces
                                                                                                    .Component
                                                                                                    .namespaces
                                                                                                    .Console
                                                                                                    .namespaces
                                                                                                    .Formatter
                                                                                                    .classes
                                                                                                    .OutputFormatterStyle
                                                                                                    .RequestStaticProperties
                                                                                                    .class)
                                                                                    .availableBackgroundColors)
                                                                    .value())
                                                    .value())
                                    .value()));
        }

        this.background =
                env.getRequestStaticPropertiesReference(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Console
                                        .namespaces
                                        .Formatter
                                        .classes
                                        .OutputFormatterStyle
                                        .RequestStaticProperties
                                        .class,
                                "availableBackgroundColors")
                        .arrayGet(env, color);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "option")
    public Object setOption(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Console
                                .namespaces
                                .Formatter
                                .classes
                                .OutputFormatterStyle
                                .RequestStaticProperties
                                .class,
                        "availableOptions"),
                env,
                option)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Invalid option specified: \"%s\". Expected one of (%s)",
                                            option,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ", ",
                                                            function_array_keys
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            env
                                                                                    .getRequestStaticProperties(
                                                                                            com.project
                                                                                                    .convertedCode
                                                                                                    .globalNamespace
                                                                                                    .namespaces
                                                                                                    .Symfony
                                                                                                    .namespaces
                                                                                                    .Component
                                                                                                    .namespaces
                                                                                                    .Console
                                                                                                    .namespaces
                                                                                                    .Formatter
                                                                                                    .classes
                                                                                                    .OutputFormatterStyle
                                                                                                    .RequestStaticProperties
                                                                                                    .class)
                                                                                    .availableOptions)
                                                                    .value())
                                                    .value())
                                    .value()));
        }

        if (!function_in_array
                .f
                .env(env)
                .call(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Console
                                                .namespaces
                                                .Formatter
                                                .classes
                                                .OutputFormatterStyle
                                                .RequestStaticProperties
                                                .class,
                                        "availableOptions")
                                .arrayGet(env, option),
                        this.options)
                .getBool()) {
            new ReferenceClassProperty(this, "options", env)
                    .arrayAppend(env)
                    .set(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .namespaces
                                                    .Formatter
                                                    .classes
                                                    .OutputFormatterStyle
                                                    .RequestStaticProperties
                                                    .class,
                                            "availableOptions")
                                    .arrayGet(env, option));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "option")
    public Object unsetOption(RuntimeEnv env, Object... args) {
        Object option = assignParameter(args, 0, false);
        Object pos = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Console
                                .namespaces
                                .Formatter
                                .classes
                                .OutputFormatterStyle
                                .RequestStaticProperties
                                .class,
                        "availableOptions"),
                env,
                option)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Invalid option specified: \"%s\". Expected one of (%s)",
                                            option,
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ", ",
                                                            function_array_keys
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            env
                                                                                    .getRequestStaticProperties(
                                                                                            com.project
                                                                                                    .convertedCode
                                                                                                    .globalNamespace
                                                                                                    .namespaces
                                                                                                    .Symfony
                                                                                                    .namespaces
                                                                                                    .Component
                                                                                                    .namespaces
                                                                                                    .Console
                                                                                                    .namespaces
                                                                                                    .Formatter
                                                                                                    .classes
                                                                                                    .OutputFormatterStyle
                                                                                                    .RequestStaticProperties
                                                                                                    .class)
                                                                                    .availableOptions)
                                                                    .value())
                                                    .value())
                                    .value()));
        }

        pos =
                function_array_search
                        .f
                        .env(env)
                        .call(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Console
                                                        .namespaces
                                                        .Formatter
                                                        .classes
                                                        .OutputFormatterStyle
                                                        .RequestStaticProperties
                                                        .class,
                                                "availableOptions")
                                        .arrayGet(env, option),
                                this.options)
                        .value();
        if (ZVal.strictNotEqualityCheck(false, "!==", pos)) {
            arrayActionR(
                    ArrayAction.UNSET, new ReferenceClassProperty(this, "options", env), env, pos);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object option = null;
        this.options = ZVal.newArray();
        for (ZPair zpairResult1685 : ZVal.getIterable(options, env, true)) {
            option = ZVal.assign(zpairResult1685.getValue());
            this.setOption(env, option);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    public Object apply(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        ReferenceContainer setCodes = new BasicReferenceContainer(null);
        ReferenceContainer unsetCodes = new BasicReferenceContainer(null);
        ReferenceContainer option = new BasicReferenceContainer(null);
        setCodes.setObject(ZVal.newArray());
        unsetCodes.setObject(ZVal.newArray());
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.foreground)) {
            setCodes.arrayAppend(env)
                    .set(new ReferenceClassProperty(this, "foreground", env).arrayGet(env, "set"));
            unsetCodes
                    .arrayAppend(env)
                    .set(
                            new ReferenceClassProperty(this, "foreground", env)
                                    .arrayGet(env, "unset"));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.background)) {
            setCodes.arrayAppend(env)
                    .set(new ReferenceClassProperty(this, "background", env).arrayGet(env, "set"));
            unsetCodes
                    .arrayAppend(env)
                    .set(
                            new ReferenceClassProperty(this, "background", env)
                                    .arrayGet(env, "unset"));
        }

        if (function_count.f.env(env).call(this.options).getBool()) {
            for (ZPair zpairResult1686 : ZVal.getIterable(this.options, env, true)) {
                option.setObject(ZVal.assign(zpairResult1686.getValue()));
                setCodes.arrayAppend(env).set(option.arrayGet(env, "set"));
                unsetCodes.arrayAppend(env).set(option.arrayGet(env, "unset"));
            }
        }

        if (ZVal.strictEqualityCheck(
                0, "===", function_count.f.env(env).call(setCodes.getObject()).value())) {
            return ZVal.assign(text);
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "\u001B[%sm%s\u001B[%sm",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(";", setCodes.getObject())
                                        .value(),
                                text,
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(";", unsetCodes.getObject())
                                        .value())
                        .value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyle";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object availableForegroundColors =
                ZVal.newArray(
                        new ZPair(
                                "black",
                                ZVal.newArray(new ZPair("set", 30), new ZPair("unset", 39))),
                        new ZPair(
                                "red", ZVal.newArray(new ZPair("set", 31), new ZPair("unset", 39))),
                        new ZPair(
                                "green",
                                ZVal.newArray(new ZPair("set", 32), new ZPair("unset", 39))),
                        new ZPair(
                                "yellow",
                                ZVal.newArray(new ZPair("set", 33), new ZPair("unset", 39))),
                        new ZPair(
                                "blue",
                                ZVal.newArray(new ZPair("set", 34), new ZPair("unset", 39))),
                        new ZPair(
                                "magenta",
                                ZVal.newArray(new ZPair("set", 35), new ZPair("unset", 39))),
                        new ZPair(
                                "cyan",
                                ZVal.newArray(new ZPair("set", 36), new ZPair("unset", 39))),
                        new ZPair(
                                "white",
                                ZVal.newArray(new ZPair("set", 37), new ZPair("unset", 39))),
                        new ZPair(
                                "default",
                                ZVal.newArray(new ZPair("set", 39), new ZPair("unset", 39))));

        public Object availableBackgroundColors =
                ZVal.newArray(
                        new ZPair(
                                "black",
                                ZVal.newArray(new ZPair("set", 40), new ZPair("unset", 49))),
                        new ZPair(
                                "red", ZVal.newArray(new ZPair("set", 41), new ZPair("unset", 49))),
                        new ZPair(
                                "green",
                                ZVal.newArray(new ZPair("set", 42), new ZPair("unset", 49))),
                        new ZPair(
                                "yellow",
                                ZVal.newArray(new ZPair("set", 43), new ZPair("unset", 49))),
                        new ZPair(
                                "blue",
                                ZVal.newArray(new ZPair("set", 44), new ZPair("unset", 49))),
                        new ZPair(
                                "magenta",
                                ZVal.newArray(new ZPair("set", 45), new ZPair("unset", 49))),
                        new ZPair(
                                "cyan",
                                ZVal.newArray(new ZPair("set", 46), new ZPair("unset", 49))),
                        new ZPair(
                                "white",
                                ZVal.newArray(new ZPair("set", 47), new ZPair("unset", 49))),
                        new ZPair(
                                "default",
                                ZVal.newArray(new ZPair("set", 49), new ZPair("unset", 49))));

        public Object availableOptions =
                ZVal.newArray(
                        new ZPair(
                                "bold", ZVal.newArray(new ZPair("set", 1), new ZPair("unset", 22))),
                        new ZPair(
                                "underscore",
                                ZVal.newArray(new ZPair("set", 4), new ZPair("unset", 24))),
                        new ZPair(
                                "blink",
                                ZVal.newArray(new ZPair("set", 5), new ZPair("unset", 25))),
                        new ZPair(
                                "reverse",
                                ZVal.newArray(new ZPair("set", 7), new ZPair("unset", 27))),
                        new ZPair(
                                "conceal",
                                ZVal.newArray(new ZPair("set", 8), new ZPair("unset", 28))));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Formatter\\OutputFormatterStyle")
                    .setLookup(
                            OutputFormatterStyle.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("background", "foreground", "options")
                    .setStaticPropertyNames(
                            "availableBackgroundColors",
                            "availableForegroundColors",
                            "availableOptions")
                    .setFilename("vendor/symfony/console/Formatter/OutputFormatterStyle.php")
                    .addInterface(
                            "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleInterface")
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
