package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.Process;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.ProcessFailedException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutputInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/ProcessHelper.php

*/

public class ProcessHelper extends Helper {

    public ProcessHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ProcessHelper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 1, name = "cmd")
    @ConvertedParameter(
        index = 2,
        name = "error",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 4, name = "verbosity")
    public Object run(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object cmd = assignParameter(args, 1, false);
        Object error = assignParameter(args, 2, true);
        if (null == error) {
            error = ZVal.getNull();
        }
        Object callback = assignParameter(args, 3, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object verbosity = assignParameter(args, 4, true);
        if (null == verbosity) {
            verbosity = OutputInterface.CONST_VERBOSITY_VERY_VERBOSE;
        }
        Object formatter = null;
        Object process = null;
        Object message = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        output,
                        ConsoleOutputInterface.class,
                        "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface"))) {
            output = env.callMethod(output, "getErrorOutput", ProcessHelper.class);
        }

        formatter =
                env.callMethod(
                        env.callMethod(this, "getHelperSet", ProcessHelper.class),
                        "get",
                        ProcessHelper.class,
                        "debug_formatter");
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        cmd, Process.class, "Symfony\\Component\\Process\\Process"))) {
            process = ZVal.assign(cmd);

        } else {
            process = new Process(env, cmd);
        }

        if (ZVal.isLessThanOrEqualTo(
                verbosity, "<=", env.callMethod(output, "getVerbosity", ProcessHelper.class))) {
            env.callMethod(
                    output,
                    "write",
                    ProcessHelper.class,
                    env.callMethod(
                            formatter,
                            "start",
                            ProcessHelper.class,
                            NamespaceGlobal.spl_object_hash.env(env).call(process).value(),
                            this.escapeString(
                                    env,
                                    env.callMethod(
                                            process, "getCommandLine", ProcessHelper.class))));
        }

        if (ZVal.isTrue(env.callMethod(output, "isDebug", ProcessHelper.class))) {
            callback = this.wrapCallback(env, output, process, callback);
        }

        env.callMethod(process, "run", ProcessHelper.class, callback);
        if (ZVal.isLessThanOrEqualTo(
                verbosity, "<=", env.callMethod(output, "getVerbosity", ProcessHelper.class))) {
            message =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    process, "isSuccessful", ProcessHelper.class))
                                    ? "Command ran successfully"
                                    : function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "%s Command did not run successfully",
                                                    env.callMethod(
                                                            process,
                                                            "getExitCode",
                                                            ProcessHelper.class))
                                            .value());
            env.callMethod(
                    output,
                    "write",
                    ProcessHelper.class,
                    env.callMethod(
                            formatter,
                            "stop",
                            ProcessHelper.class,
                            NamespaceGlobal.spl_object_hash.env(env).call(process).value(),
                            message,
                            env.callMethod(process, "isSuccessful", ProcessHelper.class)));
        }

        if (ZVal.toBool(!ZVal.isTrue(env.callMethod(process, "isSuccessful", ProcessHelper.class)))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", error))) {
            env.callMethod(
                    output,
                    "writeln",
                    ProcessHelper.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call("<error>%s</error>", this.escapeString(env, error))
                            .value());
        }

        return ZVal.assign(process);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 1, name = "cmd")
    @ConvertedParameter(
        index = 2,
        name = "error",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object mustRun(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object cmd = assignParameter(args, 1, false);
        Object error = assignParameter(args, 2, true);
        if (null == error) {
            error = ZVal.getNull();
        }
        Object callback = assignParameter(args, 3, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object process = null;
        process = this.run(env, output, cmd, error, callback);
        if (!ZVal.isTrue(env.callMethod(process, "isSuccessful", ProcessHelper.class))) {
            throw ZVal.getException(env, new ProcessFailedException(env, process));
        }

        return ZVal.assign(process);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "process",
        typeHint = "Symfony\\Component\\Process\\Process"
    )
    @ConvertedParameter(
        index = 2,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object wrapCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Helper")
                        .setFile("/vendor/symfony/console/Helper/ProcessHelper.php");
        Object output = assignParameter(args, 0, false);
        Object process = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object formatter = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        output,
                        ConsoleOutputInterface.class,
                        "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface"))) {
            output = env.callMethod(output, "getErrorOutput", ProcessHelper.class);
        }

        formatter =
                env.callMethod(
                        env.callMethod(this, "getHelperSet", ProcessHelper.class),
                        "get",
                        ProcessHelper.class,
                        "debug_formatter");
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Console\\Helper",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "type")
                    @ConvertedParameter(index = 1, name = "buffer")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object type = assignParameter(args, 0, false);
                        Object buffer = assignParameter(args, 1, false);
                        Object output = null;
                        Object formatter = null;
                        Object process = null;
                        Object callback = null;
                        output = this.contextReferences.getCapturedValue("output");
                        formatter = this.contextReferences.getCapturedValue("formatter");
                        process = this.contextReferences.getCapturedValue("process");
                        callback = this.contextReferences.getCapturedValue("callback");
                        env.callMethod(
                                output,
                                "write",
                                ProcessHelper.class,
                                env.callMethod(
                                        formatter,
                                        "progress",
                                        ProcessHelper.class,
                                        NamespaceGlobal.spl_object_hash
                                                .env(env)
                                                .call(process)
                                                .value(),
                                        ProcessHelper.this.escapeString(env, buffer),
                                        ZVal.strictEqualityCheck(Process.CONST_ERR, "===", type)));
                        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callback)) {
                            function_call_user_func
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(callback, type, buffer);
                        }

                        return null;
                    }
                }.use("output", output)
                        .use("formatter", formatter)
                        .use("process", process)
                        .use("callback", callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    private Object escapeString(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        return ZVal.assign(function_str_replace.f.env(env).call("<", "\\<", str).value());
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "process";
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\ProcessHelper";

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
                    .setName("Symfony\\Component\\Console\\Helper\\ProcessHelper")
                    .setLookup(
                            ProcessHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("helperSet")
                    .setFilename("vendor/symfony/console/Helper/ProcessHelper.php")
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
