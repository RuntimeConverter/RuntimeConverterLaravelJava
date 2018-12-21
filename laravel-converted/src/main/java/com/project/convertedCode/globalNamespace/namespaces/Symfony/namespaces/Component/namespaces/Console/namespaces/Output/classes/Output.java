package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Output/Output.php

*/

public abstract class Output extends RuntimeClassBase implements OutputInterface {

    public Object verbosity = null;

    public Object formatter = null;

    public Output(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Output.class) {
            this.__construct(env, args);
        }
    }

    public Output(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "verbosity")
    @ConvertedParameter(
        index = 1,
        name = "decorated",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object verbosity = assignParameter(args, 0, true);
        if (null == verbosity) {
            verbosity = CONST_VERBOSITY_NORMAL;
        }
        Object decorated = assignParameter(args, 1, true);
        if (null == decorated) {
            decorated = false;
        }
        Object formatter = assignParameter(args, 2, true);
        if (null == formatter) {
            formatter = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.verbosity =
                ZVal.strictEqualityCheck(ZVal.getNull(), "===", verbosity)
                        ? CONST_VERBOSITY_NORMAL
                        : verbosity;
        this.formatter =
                ZVal.isTrue(ternaryExpressionTemp = formatter)
                        ? ternaryExpressionTemp
                        : new OutputFormatter(env);
        env.callMethod(this.formatter, "setDecorated", Output.class, decorated);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        this.formatter = formatter;
        return null;
    }

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.formatter);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "decorated")
    public Object setDecorated(RuntimeEnv env, Object... args) {
        Object decorated = assignParameter(args, 0, false);
        env.callMethod(this.formatter, "setDecorated", Output.class, decorated);
        return null;
    }

    @ConvertedMethod
    public Object isDecorated(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.formatter, "isDecorated", Output.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object setVerbosity(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        this.verbosity = ZVal.toLong(level);
        return null;
    }

    @ConvertedMethod
    public Object getVerbosity(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.verbosity);
    }

    @ConvertedMethod
    public Object isQuiet(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(CONST_VERBOSITY_QUIET, "===", this.verbosity));
    }

    @ConvertedMethod
    public Object isVerbose(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isLessThanOrEqualTo(CONST_VERBOSITY_VERBOSE, "<=", this.verbosity));
    }

    @ConvertedMethod
    public Object isVeryVerbose(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isLessThanOrEqualTo(CONST_VERBOSITY_VERY_VERBOSE, "<=", this.verbosity));
    }

    @ConvertedMethod
    public Object isDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isLessThanOrEqualTo(CONST_VERBOSITY_DEBUG, "<=", this.verbosity));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "options")
    public Object writeln(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = CONST_OUTPUT_NORMAL;
        }
        this.write(env, messages, true, options);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(
        index = 1,
        name = "newline",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "options")
    public Object write(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object messages = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, true);
        if (null == newline) {
            newline = false;
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = CONST_OUTPUT_NORMAL;
        }
        Object types = null;
        Object verbosities = null;
        Object ternaryExpressionTemp = null;
        Object type = null;
        Object message = null;
        Object verbosity = null;
        if (!NamespaceGlobal.is_iterable.env(env).call(messages).getBool()) {
            messages = ZVal.newArray(new ZPair(0, messages));
        }

        types =
                ZVal.toLong(ZVal.toLong(CONST_OUTPUT_NORMAL) | ZVal.toLong(CONST_OUTPUT_RAW))
                        | ZVal.toLong(CONST_OUTPUT_PLAIN);
        type =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                ZVal.toLong(types) & ZVal.toLong(options))
                                ? ternaryExpressionTemp
                                : CONST_OUTPUT_NORMAL);
        verbosities =
                ZVal.toLong(
                                ZVal.toLong(
                                                ZVal.toLong(
                                                                ZVal.toLong(CONST_VERBOSITY_QUIET)
                                                                        | ZVal.toLong(
                                                                                CONST_VERBOSITY_NORMAL))
                                                        | ZVal.toLong(CONST_VERBOSITY_VERBOSE))
                                        | ZVal.toLong(CONST_VERBOSITY_VERY_VERBOSE))
                        | ZVal.toLong(CONST_VERBOSITY_DEBUG);
        verbosity =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                ZVal.toLong(verbosities) & ZVal.toLong(options))
                                ? ternaryExpressionTemp
                                : CONST_VERBOSITY_NORMAL);
        if (ZVal.isGreaterThan(verbosity, '>', this.getVerbosity(env))) {
            return null;
        }

        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1741 : ZVal.getIterable(messages, env, true)) {
            message = ZVal.assign(zpairResult1741.getValue());
            SwitchEnumType114 switchVariable114 =
                    ZVal.getEnum(
                            type,
                            SwitchEnumType114.DEFAULT_CASE,
                            SwitchEnumType114.DYNAMIC_TYPE_373,
                            OutputInterface.CONST_OUTPUT_NORMAL,
                            SwitchEnumType114.DYNAMIC_TYPE_374,
                            OutputInterface.CONST_OUTPUT_RAW,
                            SwitchEnumType114.DYNAMIC_TYPE_375,
                            OutputInterface.CONST_OUTPUT_PLAIN);
            switch (switchVariable114) {
                case DYNAMIC_TYPE_373:
                    message = env.callMethod(this.formatter, "format", Output.class, message);
                    break;
                case DYNAMIC_TYPE_374:
                    break;
                case DYNAMIC_TYPE_375:
                    message =
                            NamespaceGlobal.strip_tags
                                    .env(env)
                                    .call(
                                            env.callMethod(
                                                    this.formatter,
                                                    "format",
                                                    Output.class,
                                                    message))
                                    .value();
                    break;
            }
            ;
            env.callMethod(this, "doWrite", Output.class, message, newline);
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Output\\Output";

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
                    .setName("Symfony\\Component\\Console\\Output\\Output")
                    .setLookup(
                            Output.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("formatter", "verbosity")
                    .setFilename("vendor/symfony/console/Output/Output.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
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

    private enum SwitchEnumType114 {
        DYNAMIC_TYPE_373,
        DYNAMIC_TYPE_374,
        DYNAMIC_TYPE_375,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
