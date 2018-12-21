package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes.StyleInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.ProgressBar;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutputInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Style/OutputStyle.php

*/

public abstract class OutputStyle extends RuntimeClassBase
        implements OutputInterface, StyleInterface {

    public Object output = null;

    public OutputStyle(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == OutputStyle.class) {
            this.__construct(env, args);
        }
    }

    public OutputStyle(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        this.output = output;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", defaultValue = "1", defaultValueType = "number")
    public Object newLine(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, true);
        if (null == count) {
            count = 1;
        }
        env.callMethod(
                this.output,
                "write",
                OutputStyle.class,
                function_str_repeat.f.env(env).call("\n", count).value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "max", defaultValue = "0", defaultValueType = "number")
    public Object createProgressBar(RuntimeEnv env, Object... args) {
        Object max = assignParameter(args, 0, true);
        if (null == max) {
            max = 0;
        }
        return ZVal.assign(new ProgressBar(env, this.output, max));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(
        index = 1,
        name = "newline",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "type")
    public Object write(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, true);
        if (null == newline) {
            newline = false;
        }
        Object type = assignParameter(args, 2, true);
        if (null == type) {
            type = CONST_OUTPUT_NORMAL;
        }
        env.callMethod(this.output, "write", OutputStyle.class, messages, newline, type);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "type")
    public Object writeln(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = CONST_OUTPUT_NORMAL;
        }
        env.callMethod(this.output, "writeln", OutputStyle.class, messages, type);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object setVerbosity(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        env.callMethod(this.output, "setVerbosity", OutputStyle.class, level);
        return null;
    }

    @ConvertedMethod
    public Object getVerbosity(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "getVerbosity", OutputStyle.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "decorated")
    public Object setDecorated(RuntimeEnv env, Object... args) {
        Object decorated = assignParameter(args, 0, false);
        env.callMethod(this.output, "setDecorated", OutputStyle.class, decorated);
        return null;
    }

    @ConvertedMethod
    public Object isDecorated(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isDecorated", OutputStyle.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        env.callMethod(this.output, "setFormatter", OutputStyle.class, formatter);
        return null;
    }

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "getFormatter", OutputStyle.class));
    }

    @ConvertedMethod
    public Object isQuiet(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isQuiet", OutputStyle.class));
    }

    @ConvertedMethod
    public Object isVerbose(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isVerbose", OutputStyle.class));
    }

    @ConvertedMethod
    public Object isVeryVerbose(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isVeryVerbose", OutputStyle.class));
    }

    @ConvertedMethod
    public Object isDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.output, "isDebug", OutputStyle.class));
    }

    @ConvertedMethod
    protected Object getErrorOutput(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.output,
                        ConsoleOutputInterface.class,
                        "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface"))) {
            return ZVal.assign(this.output);
        }

        return ZVal.assign(env.callMethod(this.output, "getErrorOutput", OutputStyle.class));
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Style\\OutputStyle";

    @ConvertedMethod()
    public abstract Object title(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object section(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object listing(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object text(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object success(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object error(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object warning(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object note(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object caution(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object table(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object ask(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object askHidden(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object confirm(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object choice(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object progressStart(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object progressAdvance(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object progressFinish(RuntimeEnv env, Object... args);

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
                    .setName("Symfony\\Component\\Console\\Style\\OutputStyle")
                    .setLookup(
                            OutputStyle.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("output")
                    .setFilename("vendor/symfony/console/Style/OutputStyle.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .addInterface("Symfony\\Component\\Console\\Style\\StyleInterface")
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
