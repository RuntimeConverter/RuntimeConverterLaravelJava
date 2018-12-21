package com.project.convertedCode.globalNamespace.namespaces.Psy.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputDefinition;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Configuration;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Shell;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArgvInput;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/functions.php

*/

public class bin extends FunctionBaseRegular {

    public static bin f = new bin();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src")
                        .setFile("/vendor/psy/psysh/src/functions.php");
        return ZVal.assign(
                new Closure(env, runtimeConverterFunctionClassConstants, "Psy", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object input = null;
                        Object e = null;
                        Object shell = null;
                        Object usageException = null;
                        Object configFile = null;
                        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
                        Object name = null;
                        ReferenceContainer config = new BasicReferenceContainer(null);
                        Object version = null;
                        usageException = ZVal.getNull();
                        input = new ArgvInput(env);
                        try {
                            env.callMethod(
                                    input,
                                    "bind",
                                    bin.class,
                                    new InputDefinition(
                                            env,
                                            ZVal.newArray(
                                                    new ZPair(
                                                            0,
                                                            new InputOption(
                                                                    env,
                                                                    "help",
                                                                    "h",
                                                                    InputOption.CONST_VALUE_NONE)),
                                                    new ZPair(
                                                            1,
                                                            new InputOption(
                                                                    env,
                                                                    "config",
                                                                    "c",
                                                                    InputOption
                                                                            .CONST_VALUE_REQUIRED)),
                                                    new ZPair(
                                                            2,
                                                            new InputOption(
                                                                    env,
                                                                    "version",
                                                                    "v",
                                                                    InputOption.CONST_VALUE_NONE)),
                                                    new ZPair(
                                                            3,
                                                            new InputOption(
                                                                    env,
                                                                    "cwd",
                                                                    ZVal.getNull(),
                                                                    InputOption
                                                                            .CONST_VALUE_REQUIRED)),
                                                    new ZPair(
                                                            4,
                                                            new InputOption(
                                                                    env,
                                                                    "color",
                                                                    ZVal.getNull(),
                                                                    InputOption.CONST_VALUE_NONE)),
                                                    new ZPair(
                                                            5,
                                                            new InputOption(
                                                                    env,
                                                                    "no-color",
                                                                    ZVal.getNull(),
                                                                    InputOption.CONST_VALUE_NONE)),
                                                    new ZPair(
                                                            6,
                                                            new InputArgument(
                                                                    env,
                                                                    "include",
                                                                    InputArgument
                                                                            .CONST_IS_ARRAY)))));
                        } catch (ConvertedException convertedException210) {
                            if (convertedException210.instanceOf(
                                    RuntimeException.class, "RuntimeException")) {
                                e = convertedException210.getObject();
                                usageException = ZVal.assign(e);
                            } else {
                                throw convertedException210;
                            }
                        }

                        config.setObject(ZVal.newArray());
                        if (ZVal.isTrue(
                                configFile =
                                        env.callMethod(input, "getOption", bin.class, "config"))) {
                            config.arrayAccess(env, "configFile").set(configFile);
                        }

                        if (ZVal.toBool(env.callMethod(input, "getOption", bin.class, "color"))
                                && ZVal.toBool(
                                        env.callMethod(
                                                input, "getOption", bin.class, "no-color"))) {
                            usageException =
                                    new RuntimeException(
                                            env,
                                            "Using both \"--color\" and \"--no-color\" options is invalid");

                        } else if (ZVal.isTrue(
                                env.callMethod(input, "getOption", bin.class, "color"))) {
                            config.arrayAccess(env, "colorMode")
                                    .set(Configuration.CONST_COLOR_MODE_FORCED);

                        } else if (ZVal.isTrue(
                                env.callMethod(input, "getOption", bin.class, "no-color"))) {
                            config.arrayAccess(env, "colorMode")
                                    .set(Configuration.CONST_COLOR_MODE_DISABLED);
                        }

                        shell = new Shell(env, new Configuration(env, config.getObject()));
                        if (ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                usageException, "!==", ZVal.getNull()))
                                || ZVal.toBool(
                                        env.callMethod(input, "getOption", bin.class, "help"))) {
                            if (ZVal.strictNotEqualityCheck(
                                    usageException, "!==", ZVal.getNull())) {
                                env.echo(
                                        toStringR(
                                                        env.callMethod(
                                                                usageException,
                                                                "getMessage",
                                                                bin.class),
                                                        env)
                                                + toStringR("\n", env)
                                                + toStringR("\n", env));
                            }

                            version = env.callMethod(shell, "getVersion", bin.class);
                            name =
                                    NamespaceGlobal.basename
                                            .env(env)
                                            .call(
                                                    function_reset
                                                            .f
                                                            .env(env)
                                                            .call(_SERVER.arrayGet(env, "argv"))
                                                            .value())
                                            .value();
                            env.echo(
                                    toStringR(version, env)
                                            + "\n\nUsage:\n  "
                                            + toStringR(name, env)
                                            + " [--version] [--help] [files...]\n\nOptions:\n  --help     -h Display this help message.\n  --config   -c Use an alternate PsySH config file location.\n  --cwd         Use an alternate working directory.\n  --version  -v Display the PsySH version.\n  --color       Force colors in output.\n  --no-color    Disable colors in output.\n");
                            env.exit(
                                    ZVal.strictEqualityCheck(usageException, "===", ZVal.getNull())
                                            ? 0
                                            : 1);
                        }

                        if (ZVal.isTrue(env.callMethod(input, "getOption", bin.class, "version"))) {
                            env.echo(
                                    toStringR(env.callMethod(shell, "getVersion", bin.class), env)
                                            + toStringR("\n", env));
                            env.exit(0);
                        }

                        env.callMethod(
                                shell,
                                "setIncludes",
                                bin.class,
                                env.callMethod(input, "getArgument", bin.class, "include"));
                        try {
                            env.callMethod(shell, "run", bin.class);
                        } catch (ConvertedException convertedException211) {
                            if (convertedException211.instanceOf(PHPException.class, "Exception")) {
                                e = convertedException211.getObject();
                                env.echo(
                                        toStringR(env.callMethod(e, "getMessage", bin.class), env)
                                                + toStringR("\n", env));
                            } else {
                                throw convertedException211;
                            }
                        }

                        return null;
                    }
                });
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/psy/psysh/src")
                .setFile("/vendor/psy/psysh/src/functions.php");
    }
}
