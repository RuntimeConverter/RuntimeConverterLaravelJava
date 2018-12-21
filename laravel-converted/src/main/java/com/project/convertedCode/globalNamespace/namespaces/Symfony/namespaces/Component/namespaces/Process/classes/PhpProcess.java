package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.Process;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.PhpExecutableFinder;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_register_shutdown_function;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/PhpProcess.php

*/

public class PhpProcess extends Process {

    public PhpProcess(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhpProcess.class) {
            this.__construct(env, args);
        }
    }

    public PhpProcess(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "script", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "cwd",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "env",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "timeout",
        typeHint = "int",
        defaultValue = "60",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object script = assignParameter(args, 0, false);
        Object cwd = assignParameter(args, 1, true);
        if (null == cwd) {
            cwd = ZVal.getNull();
        }
        Object ___env = assignParameter(args, 2, true);
        if (null == ___env) {
            ___env = ZVal.getNull();
        }
        Object timeout = assignParameter(args, 3, true);
        if (null == timeout) {
            timeout = 60;
        }
        Object file = null;
        ReferenceContainer php = new BasicReferenceContainer(null);
        Object executableFinder = null;
        executableFinder = new PhpExecutableFinder(env);
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                php.setObject(env.callMethod(executableFinder, "find", PhpProcess.class, false)))) {
            php.setObject(ZVal.getNull());

        } else {
            php.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(new ZPair(0, php.getObject())),
                                    env.callMethod(
                                            executableFinder, "findArguments", PhpProcess.class))
                            .value());
        }

        if (ZVal.strictEqualityCheck("phpdbg", "===", "cli")) {
            file =
                    NamespaceGlobal.tempnam
                            .env(env)
                            .call(NamespaceGlobal.sys_get_temp_dir.env(env).call().value(), "dbg")
                            .value();
            NamespaceGlobal.file_put_contents.env(env).call(file, script);
            function_register_shutdown_function.f.env(env).call("unlink", file);
            php.arrayAppend(env).set(file);
            script = ZVal.getNull();
        }

        super.__construct(env, php.getObject(), cwd, ___env, script, timeout);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "php")
    public Object setPhpBinary(RuntimeEnv env, Object... args) {
        Object php = assignParameter(args, 0, false);
        env.callMethod(this, "setCommandLine", PhpProcess.class, php);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "env",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object start(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ___env = assignParameter(args, 1, true);
        if (null == ___env) {
            ___env = ZVal.newArray();
        }
        if (ZVal.strictEqualityCheck(
                ZVal.getNull(), "===", env.callMethod(this, "getCommandLine", PhpProcess.class))) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Unable to find the PHP executable."));
        }

        super.start(env, callback, ___env);
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Process\\PhpProcess";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Process.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Process\\PhpProcess")
                    .setLookup(
                            PhpProcess.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "callback",
                            "commandline",
                            "cwd",
                            "env",
                            "exitcode",
                            "fallbackStatus",
                            "hasCallback",
                            "idleTimeout",
                            "incrementalErrorOutputOffset",
                            "incrementalOutputOffset",
                            "input",
                            "lastOutputTime",
                            "latestSignal",
                            "outputDisabled",
                            "process",
                            "processInformation",
                            "processPipes",
                            "pty",
                            "starttime",
                            "status",
                            "stderr",
                            "stdout",
                            "timeout",
                            "tty",
                            "useFileHandles")
                    .setFilename("vendor/symfony/process/PhpProcess.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addExtendsClass("Symfony\\Component\\Process\\Process")
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
