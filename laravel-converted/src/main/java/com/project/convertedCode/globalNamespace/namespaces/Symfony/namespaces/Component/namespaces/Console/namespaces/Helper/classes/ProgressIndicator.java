package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/ProgressIndicator.php

*/

public class ProgressIndicator extends RuntimeClassBase {

    public Object output = null;

    public Object startTime = null;

    public Object format = null;

    public Object message = null;

    public Object indicatorValues = null;

    public Object indicatorCurrent = null;

    public Object indicatorChangeInterval = null;

    public Object indicatorUpdateTime = null;

    public Object started = false;

    public ProgressIndicator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProgressIndicator.class) {
            this.__construct(env, args);
        }
    }

    public ProgressIndicator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "format",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "indicatorChangeInterval",
        typeHint = "int",
        defaultValue = "100",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 3,
        name = "indicatorValues",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object format = assignParameter(args, 1, true);
        if (null == format) {
            format = ZVal.getNull();
        }
        Object indicatorChangeInterval = assignParameter(args, 2, true);
        if (null == indicatorChangeInterval) {
            indicatorChangeInterval = 100;
        }
        Object indicatorValues = assignParameter(args, 3, true);
        if (null == indicatorValues) {
            indicatorValues = ZVal.getNull();
        }
        this.output = output;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", format)) {
            format = this.determineBestFormat(env);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", indicatorValues)) {
            indicatorValues = ZVal.arrayFromList("-", "\\", "|", "/");
        }

        indicatorValues = function_array_values.f.env(env).call(indicatorValues).value();
        if (ZVal.isGreaterThan(2, '>', function_count.f.env(env).call(indicatorValues).value())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Must have at least 2 indicator value characters."));
        }

        this.format = runtimeStaticObject.getFormatDefinition(env, format);
        this.indicatorChangeInterval = indicatorChangeInterval;
        this.indicatorValues = indicatorValues;
        this.startTime = NamespaceGlobal.time.env(env).call().value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object setMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.message = message;
        this.display(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object start(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.started)) {
            throw ZVal.getException(
                    env, new LogicException(env, "Progress indicator already started."));
        }

        this.message = message;
        this.started = true;
        this.startTime = NamespaceGlobal.time.env(env).call().value();
        this.indicatorUpdateTime =
                ZVal.add(this.getCurrentTimeInMilliseconds(env), this.indicatorChangeInterval);
        this.indicatorCurrent = 0;
        this.display(env);
        return null;
    }

    @ConvertedMethod
    public Object advance(RuntimeEnv env, Object... args) {
        Object currentTime = null;
        if (!ZVal.isTrue(this.started)) {
            throw ZVal.getException(
                    env, new LogicException(env, "Progress indicator has not yet been started."));
        }

        if (!ZVal.isTrue(env.callMethod(this.output, "isDecorated", ProgressIndicator.class))) {
            return null;
        }

        currentTime = this.getCurrentTimeInMilliseconds(env);
        if (ZVal.isLessThan(currentTime, '<', this.indicatorUpdateTime)) {
            return null;
        }

        this.indicatorUpdateTime = ZVal.add(currentTime, this.indicatorChangeInterval);
        this.indicatorCurrent = ZVal.increment(this.indicatorCurrent);
        this.display(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object finish(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.started)) {
            throw ZVal.getException(
                    env, new LogicException(env, "Progress indicator has not yet been started."));
        }

        this.message = message;
        this.display(env);
        env.callMethod(this.output, "writeln", ProgressIndicator.class, "");
        this.started = false;
        return null;
    }

    @ConvertedMethod
    private Object display(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Helper")
                        .setFile("/vendor/symfony/console/Helper/ProgressIndicator.php");
        Object self = null;
        if (ZVal.strictEqualityCheck(
                OutputInterface.CONST_VERBOSITY_QUIET,
                "===",
                env.callMethod(this.output, "getVerbosity", ProgressIndicator.class))) {
            return null;
        }

        self = ZVal.assign(this);
        this.overwrite(
                env,
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "{%([a-z\\-_]+)(?:\\:([^%]+))?%}i",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Console\\Helper",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object formatter = null;
                                        Object self = null;
                                        self = this.contextReferences.getCapturedValue("self");
                                        if (ZVal.isTrue(
                                                formatter =
                                                        StaticMethodUtils.getStaticBaseClass(
                                                                        self, env)
                                                                .callUnknownStaticMethod(
                                                                        env,
                                                                        "getPlaceholderFormatterDefinition",
                                                                        new RuntimeArgsWithReferences()
                                                                                .add(
                                                                                        0,
                                                                                        new ArrayDimensionReference(
                                                                                                matches
                                                                                                        .getObject(),
                                                                                                1)),
                                                                        matches.arrayGet(
                                                                                env, 1)))) {
                                            return ZVal.assign(
                                                    function_call_user_func
                                                            .f
                                                            .env(env)
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithInfo(
                                                                            args, this))
                                                            .call(formatter, self)
                                                            .value());
                                        }

                                        return ZVal.assign(matches.arrayGet(env, 0));
                                    }
                                }.use("self", self),
                                this.format)
                        .value());
        return null;
    }

    @ConvertedMethod
    private Object determineBestFormat(RuntimeEnv env, Object... args) {
        SwitchEnumType112 switchVariable112 =
                ZVal.getEnum(
                        env.callMethod(this.output, "getVerbosity", ProgressIndicator.class),
                        SwitchEnumType112.DEFAULT_CASE,
                        SwitchEnumType112.DYNAMIC_TYPE_366,
                        OutputInterface.CONST_VERBOSITY_VERBOSE,
                        SwitchEnumType112.DYNAMIC_TYPE_367,
                        OutputInterface.CONST_VERBOSITY_VERY_VERBOSE,
                        SwitchEnumType112.DYNAMIC_TYPE_368,
                        OutputInterface.CONST_VERBOSITY_DEBUG);
        switch (switchVariable112) {
            case DYNAMIC_TYPE_366:
                return ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                this.output,
                                                "isDecorated",
                                                ProgressIndicator.class))
                                ? "verbose"
                                : "verbose_no_ansi");
            case DYNAMIC_TYPE_367:
            case DYNAMIC_TYPE_368:
                return ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                this.output,
                                                "isDecorated",
                                                ProgressIndicator.class))
                                ? "very_verbose"
                                : "very_verbose_no_ansi");
            case DEFAULT_CASE:
                return ZVal.assign(
                        ZVal.isTrue(
                                        env.callMethod(
                                                this.output,
                                                "isDecorated",
                                                ProgressIndicator.class))
                                ? "normal"
                                : "normal_no_ansi");
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    private Object overwrite(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        if (ZVal.isTrue(env.callMethod(this.output, "isDecorated", ProgressIndicator.class))) {
            env.callMethod(this.output, "write", ProgressIndicator.class, "\r\u001B[2K");
            env.callMethod(this.output, "write", ProgressIndicator.class, message);

        } else {
            env.callMethod(this.output, "writeln", ProgressIndicator.class, message);
        }

        return null;
    }

    @ConvertedMethod
    private Object getCurrentTimeInMilliseconds(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_round
                        .f
                        .env(env)
                        .call(ZVal.multiply(function_microtime.f.env(env).call(true).value(), 1000))
                        .value());
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Helper\\ProgressIndicator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object getFormatDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
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
                                            .Helper
                                            .classes
                                            .ProgressIndicator
                                            .RequestStaticProperties
                                            .class)
                            .formats)) {
                env.getRequestStaticProperties(
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
                                                .Helper
                                                .classes
                                                .ProgressIndicator
                                                .RequestStaticProperties
                                                .class)
                                .formats =
                        runtimeStaticObject.initFormats(env);
            }

            return ZVal.assign(
                    arrayActionR(
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
                                                    .Helper
                                                    .classes
                                                    .ProgressIndicator
                                                    .RequestStaticProperties
                                                    .class,
                                            "formats"),
                                    env,
                                    name)
                            ? env.getRequestStaticPropertiesReference(
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
                                                    .Helper
                                                    .classes
                                                    .ProgressIndicator
                                                    .RequestStaticProperties
                                                    .class,
                                            "formats")
                                    .arrayGet(env, name)
                            : ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "callable")
        public Object setPlaceholderFormatterDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object callable = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
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
                                            .Helper
                                            .classes
                                            .ProgressIndicator
                                            .RequestStaticProperties
                                            .class)
                            .formatters)) {
                env.getRequestStaticProperties(
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
                                                .Helper
                                                .classes
                                                .ProgressIndicator
                                                .RequestStaticProperties
                                                .class)
                                .formatters =
                        runtimeStaticObject.initPlaceholderFormatters(env);
            }

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
                                    .Helper
                                    .classes
                                    .ProgressIndicator
                                    .RequestStaticProperties
                                    .class,
                            "formatters")
                    .arrayAccess(env, name)
                    .set(callable);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object getPlaceholderFormatterDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
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
                                            .Helper
                                            .classes
                                            .ProgressIndicator
                                            .RequestStaticProperties
                                            .class)
                            .formatters)) {
                env.getRequestStaticProperties(
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
                                                .Helper
                                                .classes
                                                .ProgressIndicator
                                                .RequestStaticProperties
                                                .class)
                                .formatters =
                        runtimeStaticObject.initPlaceholderFormatters(env);
            }

            return ZVal.assign(
                    arrayActionR(
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
                                                    .Helper
                                                    .classes
                                                    .ProgressIndicator
                                                    .RequestStaticProperties
                                                    .class,
                                            "formatters"),
                                    env,
                                    name)
                            ? env.getRequestStaticPropertiesReference(
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
                                                    .Helper
                                                    .classes
                                                    .ProgressIndicator
                                                    .RequestStaticProperties
                                                    .class,
                                            "formatters")
                                    .arrayGet(env, name)
                            : ZVal.getNull());
        }

        @ConvertedMethod
        private Object initPlaceholderFormatters(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/console/Helper")
                            .setFile("/vendor/symfony/console/Helper/ProgressIndicator.php");
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "indicator",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "indicator",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressIndicator"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object indicator = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    new ReferenceClassProperty(
                                                                    indicator,
                                                                    "indicatorValues",
                                                                    env)
                                                            .arrayGet(
                                                                    env,
                                                                    ZVal.modulus(
                                                                            toObjectR(indicator)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "indicatorCurrent")
                                                                                    .value(),
                                                                            function_count
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(
                                                                                            toObjectR(
                                                                                                            indicator)
                                                                                                    .accessProp(
                                                                                                            this,
                                                                                                            env)
                                                                                                    .name(
                                                                                                            "indicatorValues")
                                                                                                    .value())
                                                                                    .value())));
                                        }
                                    }),
                            new ZPair(
                                    "message",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "indicator",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressIndicator"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object indicator = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    toObjectR(indicator)
                                                            .accessProp(this, env)
                                                            .name("message")
                                                            .value());
                                        }
                                    }),
                            new ZPair(
                                    "elapsed",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "indicator",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressIndicator"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object indicator = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    Helper.runtimeStaticObject.formatTime(
                                                            env,
                                                            ZVal.subtract(
                                                                    NamespaceGlobal.time
                                                                            .env(env)
                                                                            .call()
                                                                            .value(),
                                                                    toObjectR(indicator)
                                                                            .accessProp(this, env)
                                                                            .name("startTime")
                                                                            .value())));
                                        }
                                    }),
                            new ZPair(
                                    "memory",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            return ZVal.assign(
                                                    Helper.runtimeStaticObject.formatMemory(
                                                            env,
                                                            NamespaceGlobal.memory_get_usage
                                                                    .env(env)
                                                                    .call(true)
                                                                    .value()));
                                        }
                                    })));
        }

        @ConvertedMethod
        private Object initFormats(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("normal", " %indicator% %message%"),
                            new ZPair("normal_no_ansi", " %message%"),
                            new ZPair("verbose", " %indicator% %message% (%elapsed:6s%)"),
                            new ZPair("verbose_no_ansi", " %message% (%elapsed:6s%)"),
                            new ZPair(
                                    "very_verbose",
                                    " %indicator% %message% (%elapsed:6s%, %memory:6s%)"),
                            new ZPair(
                                    "very_verbose_no_ansi",
                                    " %message% (%elapsed:6s%, %memory:6s%)")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formatters = null;

        public Object formats = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\ProgressIndicator")
                    .setLookup(
                            ProgressIndicator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "format",
                            "indicatorChangeInterval",
                            "indicatorCurrent",
                            "indicatorUpdateTime",
                            "indicatorValues",
                            "message",
                            "output",
                            "startTime",
                            "started")
                    .setStaticPropertyNames("formats", "formatters")
                    .setFilename("vendor/symfony/console/Helper/ProgressIndicator.php")
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

    private enum SwitchEnumType112 {
        DYNAMIC_TYPE_366,
        DYNAMIC_TYPE_367,
        DYNAMIC_TYPE_368,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
