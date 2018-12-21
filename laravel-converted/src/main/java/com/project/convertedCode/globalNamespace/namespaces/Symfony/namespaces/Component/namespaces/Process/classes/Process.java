package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.IteratorAggregate;
import com.runtimeconverter.runtime.arrays.RuntimeIterable;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_get_clean;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes.WindowsPipes;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.runtimeconverter.runtime.nativeFunctions.date.function_microtime;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.ProcessUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.ProcessTimedOutException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.outputBuffer.function_ob_start;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.ProcessSignaledException;
import com.runtimeconverter.runtime.nativeInterfaces.Iterator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Pipes.classes.UnixPipes;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.namespaces.Exception.classes.ProcessFailedException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/Process.php

*/

public class Process extends RuntimeClassBase implements IteratorAggregate {

    public Object callback = null;

    public Object hasCallback = false;

    public Object commandline = null;

    public Object cwd = null;

    public Object ___env = null;

    public Object input = null;

    public Object starttime = null;

    public Object lastOutputTime = null;

    public Object timeout = null;

    public Object idleTimeout = null;

    public Object exitcode = null;

    public Object fallbackStatus = ZVal.newArray();

    public Object processInformation = null;

    public Object outputDisabled = false;

    public Object stdout = null;

    public Object stderr = null;

    public Object process = null;

    public Object status = CONST_STATUS_READY;

    public Object incrementalOutputOffset = 0;

    public Object incrementalErrorOutputOffset = 0;

    public Object tty = null;

    public Object pty = null;

    public Object useFileHandles = false;

    public Object processPipes = null;

    public Object latestSignal = null;

    public Process(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Process.class) {
            this.__construct(env, args);
        }
    }

    public Process(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commandline")
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
        name = "input",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "timeout",
        defaultValue = "60",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object commandline = assignParameter(args, 0, false);
        Object cwd = assignParameter(args, 1, true);
        if (null == cwd) {
            cwd = ZVal.getNull();
        }
        Object ___env = assignParameter(args, 2, true);
        if (null == ___env) {
            ___env = ZVal.getNull();
        }
        Object input = assignParameter(args, 3, true);
        if (null == input) {
            input = ZVal.getNull();
        }
        Object timeout = assignParameter(args, 4, true);
        if (null == timeout) {
            timeout = 60;
        }
        if (!function_function_exists.f.env(env).call("proc_open").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "The Process class relies on proc_open, which is not available on your PHP installation."));
        }

        this.commandline = commandline;
        this.cwd = cwd;
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.cwd))
                && ZVal.toBool(
                        ZVal.toBool(function_defined.f.env(env).call("ZEND_THREAD_SAFE").value())
                                || ZVal.toBool(ZVal.strictEqualityCheck("\\", "===", "/")))) {
            this.cwd = function_getcwd.f.env(env).call().value();
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", ___env)) {
            this.setEnv(env, ___env);
        }

        this.setInput(env, input);
        this.setTimeout(env, timeout);
        this.useFileHandles = ZVal.strictEqualityCheck("\\", "===", "/");
        this.pty = false;
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        this.stop(env, 0);
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        this.resetProcessData(env);
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
    public Object run(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ___env = assignParameter(args, 1, true);
        if (null == ___env) {
            ___env = ZVal.newArray();
        }
        this.start(env, callback, ___env);
        return ZVal.assign(this.wait(env));
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
    public Object mustRun(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ___env = assignParameter(args, 1, true);
        if (null == ___env) {
            ___env = ZVal.newArray();
        }
        if (ZVal.strictNotEqualityCheck(0, "!==", this.run(env, callback, ___env))) {
            throw ZVal.getException(env, new ProcessFailedException(env, this));
        }

        return ZVal.assign(this);
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
        ReferenceContainer ___env = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == ___env.getObject()) {
            ___env.setObject(ZVal.newArray());
        }
        ReferenceContainer descriptors = new BasicReferenceContainer(null);
        Object v = null;
        ReferenceContainer options = new BasicReferenceContainer(null);
        ReferenceContainer envPairs = new BasicReferenceContainer(null);
        Object k = null;
        Object ptsWorkaround = null;
        Object commandline = null;
        if (ZVal.isTrue(this.isRunning(env))) {
            throw ZVal.getException(env, new RuntimeException(env, "Process is already running"));
        }

        this.resetProcessData(env);
        this.starttime = this.lastOutputTime = function_microtime.f.env(env).call(true).value();
        this.callback = this.buildCallback(env, callback);
        this.hasCallback = ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callback);
        descriptors.setObject(this.getDescriptors(env));
        if (function_is_array
                .f
                .env(env)
                .call(commandline = ZVal.assign(this.commandline))
                .getBool()) {
            commandline =
                    NamespaceGlobal.implode
                            .env(env)
                            .call(
                                    " ",
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.newArray(
                                                            new ZPair(0, this),
                                                            new ZPair(1, "escapeArgument")),
                                                    commandline)
                                            .value())
                            .value();
            if (ZVal.strictNotEqualityCheck("\\", "!==", "/")) {
                commandline = "exec " + toStringR(commandline, env);
            }
        }

        if (ZVal.isTrue(this.___env)) {
            ___env.setObject(ZAssignment.add("+=", ___env.getObject(), this.___env));
        }

        ___env.setObject(ZAssignment.add("+=", ___env.getObject(), this.getDefaultEnv(env)));
        options.setObject(ZVal.newArray(new ZPair("suppress_errors", true)));
        if (ZVal.strictEqualityCheck("\\", "===", "/")) {
            options.arrayAccess(env, "bypass_shell").set(true);
            commandline =
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(1, ___env),
                            "prepareWindowsCommandLine",
                            Process.class,
                            commandline,
                            ___env.getObject());

        } else if (ZVal.toBool(!ZVal.isTrue(this.useFileHandles))
                && ZVal.toBool(this.isSigchildEnabled(env))) {
            descriptors.arrayAccess(env, 3).set(ZVal.arrayFromList("pipe", "w"));
            commandline = "{ (" + toStringR(commandline, env) + ") <&3 3<&- 3>/dev/null & } 3<&0;";
            commandline =
                    toStringR(commandline, env)
                            + "pid=$!; echo $pid >&3; wait $pid; code=$?; echo $code >&3; exit $code";
            ptsWorkaround =
                    function_fopen
                            .f
                            .env(env)
                            .call(
                                    env.addRootFilesystemPrefix(
                                            "/vendor/symfony/process/Process.php"),
                                    "r")
                            .value();
        }

        envPairs.setObject(ZVal.newArray());
        for (ZPair zpairResult2003 : ZVal.getIterable(___env.getObject(), env, false)) {
            k = ZVal.assign(zpairResult2003.getKey());
            v = ZVal.assign(zpairResult2003.getValue());
            if (ZVal.strictNotEqualityCheck(false, "!==", v)) {
                envPairs.arrayAppend(env).set(toStringR(k, env) + "=" + toStringR(v, env));
            }
        }

        if (!function_is_dir.f.env(env).call(this.cwd).getBool()) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "The provided cwd does not exist."));
        }

        this.process =
                NamespaceGlobal.proc_open
                        .env(env)
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                2,
                                                new ReferenceClassProperty(
                                                        this.processPipes, "pipes", env)))
                        .call(
                                commandline,
                                descriptors.getObject(),
                                toObjectR(this.processPipes)
                                        .accessProp(this, env)
                                        .name("pipes")
                                        .value(),
                                this.cwd,
                                envPairs.getObject(),
                                options.getObject())
                        .value();
        if (!function_is_resource.f.env(env).call(this.process).getBool()) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Unable to launch a new process."));
        }

        this.status = CONST_STATUS_STARTED;
        if (arrayActionR(ArrayAction.ISSET, descriptors, env, 3)) {
            new ReferenceClassProperty(this, "fallbackStatus", env)
                    .arrayAccess(env, "pid")
                    .set(
                            ZVal.toLong(
                                    NamespaceGlobal.fgets
                                            .env(env)
                                            .call(
                                                    new ReferenceClassProperty(
                                                                    this.processPipes, "pipes", env)
                                                            .arrayGet(env, 3))
                                            .value()));
        }

        if (ZVal.isTrue(this.tty)) {
            return null;
        }

        this.updateStatus(env, false);
        this.checkTimeout(env);
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
    public Object restart(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ___env = assignParameter(args, 1, true);
        if (null == ___env) {
            ___env = ZVal.newArray();
        }
        Object process = null;
        if (ZVal.isTrue(this.isRunning(env))) {
            throw ZVal.getException(env, new RuntimeException(env, "Process is already running"));
        }

        process = ZVal.assign(((RuntimeClassInterface) this).phpClone(env));
        env.callMethod(process, "start", Process.class, callback, ___env);
        return ZVal.assign(process);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object wait(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object running = null;
        this.requireProcessIsStarted(env, "wait");
        this.updateStatus(env, false);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callback)) {
            if (!ZVal.isTrue(env.callMethod(this.processPipes, "haveReadSupport", Process.class))) {
                this.stop(env, 0);
                throw ZVal.getException(
                        env,
                        new com.runtimeconverter
                                .runtime
                                .nativeClasses
                                .spl
                                .exceptions
                                .LogicException(
                                env,
                                "Pass the callback to the Process::start method or enableOutput to use a callback with Process::wait"));
            }

            this.callback = this.buildCallback(env, callback);
        }

        do {
            this.checkTimeout(env);
            running =
                    ZVal.assign(
                            ZVal.strictEqualityCheck("\\", "===", "/")
                                    ? this.isRunning(env)
                                    : env.callMethod(this.processPipes, "areOpen", Process.class));
            this.readPipes(
                    env,
                    running,
                    ZVal.toBool(ZVal.strictNotEqualityCheck("\\", "!==", "/"))
                            || ZVal.toBool(!ZVal.isTrue(running)));

        } while (ZVal.isTrue(running));

        while (ZVal.isTrue(this.isRunning(env))) {
            NamespaceGlobal.usleep.env(env).call(1000);
        }

        if (ZVal.toBool(
                        new ReferenceClassProperty(this, "processInformation", env)
                                .arrayGet(env, "signaled"))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                new ReferenceClassProperty(this, "processInformation", env)
                                        .arrayGet(env, "termsig"),
                                "!==",
                                this.latestSignal))) {
            throw ZVal.getException(env, new ProcessSignaledException(env, this));
        }

        return ZVal.assign(this.exitcode);
    }

    @ConvertedMethod
    public Object getPid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.isRunning(env))
                        ? new ReferenceClassProperty(this, "processInformation", env)
                                .arrayGet(env, "pid")
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "signal")
    public Object signal(RuntimeEnv env, Object... args) {
        Object signal = assignParameter(args, 0, false);
        this.doSignal(env, signal, true);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object disableOutput(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isRunning(env))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Disabling output while the process is running is not possible."));
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.idleTimeout)) {
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .Process
                            .namespaces
                            .Exception
                            .classes
                            .LogicException(
                            env, "Output can not be disabled while an idle timeout is set."));
        }

        this.outputDisabled = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object enableOutput(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isRunning(env))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "Enabling output while the process is running is not possible."));
        }

        this.outputDisabled = false;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isOutputDisabled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.outputDisabled);
    }

    @ConvertedMethod
    public Object getOutput(RuntimeEnv env, Object... args) {
        Object ret = null;
        this.readPipesForOutput(env, "getOutput");
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                ret =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(this.stdout, -1, 0)
                                .value())) {
            return "";
        }

        return ZVal.assign(ret);
    }

    @ConvertedMethod
    public Object getIncrementalOutput(RuntimeEnv env, Object... args) {
        Object latest = null;
        this.readPipesForOutput(env, "getIncrementalOutput");
        latest =
                NamespaceGlobal.stream_get_contents
                        .env(env)
                        .call(this.stdout, -1, this.incrementalOutputOffset)
                        .value();
        this.incrementalOutputOffset = NamespaceGlobal.ftell.env(env).call(this.stdout).value();
        if (ZVal.strictEqualityCheck(false, "===", latest)) {
            return "";
        }

        return ZVal.assign(latest);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "flags", defaultValue = "0", defaultValueType = "number")
    public Object getIterator(RuntimeEnv env, Object... args) {
        RuntimeIterable runtimeConverterYieldVariable = new RuntimeIterable(env);
        Object flags = assignParameter(args, 0, true);
        if (null == flags) {
            flags = 0;
        }
        ReferenceContainer err = new BasicReferenceContainer(null);
        Object clearOutput = null;
        Object blocking = null;
        Object yieldOut = null;
        Object yieldErr = null;
        ReferenceContainer out = new BasicReferenceContainer(null);
        this.readPipesForOutput(env, "getIterator", false);
        clearOutput = !ZVal.isTrue(ZVal.toLong(CONST_ITER_KEEP_OUTPUT) & ZVal.toLong(flags));
        blocking = !ZVal.isTrue(ZVal.toLong(CONST_ITER_NON_BLOCKING) & ZVal.toLong(flags));
        yieldOut = !ZVal.isTrue(ZVal.toLong(CONST_ITER_SKIP_OUT) & ZVal.toLong(flags));
        yieldErr = !ZVal.isTrue(ZVal.toLong(CONST_ITER_SKIP_ERR) & ZVal.toLong(flags));
        while (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                ZVal.getNull(), "!==", this.callback))
                                || ZVal.toBool(
                                        ZVal.toBool(yieldOut)
                                                && ZVal.toBool(
                                                        !NamespaceGlobal.feof
                                                                .env(env)
                                                                .call(this.stdout)
                                                                .getBool())))
                || ZVal.toBool(
                        ZVal.toBool(yieldErr)
                                && ZVal.toBool(
                                        !NamespaceGlobal.feof
                                                .env(env)
                                                .call(this.stderr)
                                                .getBool()))) {
            if (ZVal.isTrue(yieldOut)) {
                out.setObject(
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(this.stdout, -1, this.incrementalOutputOffset)
                                .value());
                if (arrayActionR(ArrayAction.ISSET, out, env, 0)) {
                    if (ZVal.isTrue(clearOutput)) {
                        this.clearOutput(env);

                    } else {
                        this.incrementalOutputOffset =
                                NamespaceGlobal.ftell.env(env).call(this.stdout).value();
                    }

                    runtimeConverterYieldVariable.add(CONST_OUT, out.getObject());
                }
            }

            if (ZVal.isTrue(yieldErr)) {
                err.setObject(
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(this.stderr, -1, this.incrementalErrorOutputOffset)
                                .value());
                if (arrayActionR(ArrayAction.ISSET, err, env, 0)) {
                    if (ZVal.isTrue(clearOutput)) {
                        this.clearErrorOutput(env);

                    } else {
                        this.incrementalErrorOutputOffset =
                                NamespaceGlobal.ftell.env(env).call(this.stderr).value();
                    }

                    runtimeConverterYieldVariable.add(CONST_ERR, err.getObject());
                }
            }

            if (ZVal.toBool(
                            ZVal.toBool(!ZVal.isTrue(blocking))
                                    && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, out, env, 0)))
                    && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, err, env, 0))) {
                runtimeConverterYieldVariable.add(CONST_OUT, "");
            }

            this.checkTimeout(env);
            this.readPipesForOutput(env, "getIterator", blocking);
        }

        return runtimeConverterYieldVariable;
    }

    @ConvertedMethod
    public Object clearOutput(RuntimeEnv env, Object... args) {
        NamespaceGlobal.ftruncate.env(env).call(this.stdout, 0);
        NamespaceGlobal.fseek.env(env).call(this.stdout, 0);
        this.incrementalOutputOffset = 0;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getErrorOutput(RuntimeEnv env, Object... args) {
        Object ret = null;
        this.readPipesForOutput(env, "getErrorOutput");
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                ret =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(this.stderr, -1, 0)
                                .value())) {
            return "";
        }

        return ZVal.assign(ret);
    }

    @ConvertedMethod
    public Object getIncrementalErrorOutput(RuntimeEnv env, Object... args) {
        Object latest = null;
        this.readPipesForOutput(env, "getIncrementalErrorOutput");
        latest =
                NamespaceGlobal.stream_get_contents
                        .env(env)
                        .call(this.stderr, -1, this.incrementalErrorOutputOffset)
                        .value();
        this.incrementalErrorOutputOffset =
                NamespaceGlobal.ftell.env(env).call(this.stderr).value();
        if (ZVal.strictEqualityCheck(false, "===", latest)) {
            return "";
        }

        return ZVal.assign(latest);
    }

    @ConvertedMethod
    public Object clearErrorOutput(RuntimeEnv env, Object... args) {
        NamespaceGlobal.ftruncate.env(env).call(this.stderr, 0);
        NamespaceGlobal.fseek.env(env).call(this.stderr, 0);
        this.incrementalErrorOutputOffset = 0;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getExitCode(RuntimeEnv env, Object... args) {
        this.updateStatus(env, false);
        return ZVal.assign(this.exitcode);
    }

    @ConvertedMethod
    public Object getExitCodeText(RuntimeEnv env, Object... args) {
        Object exitcode = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", exitcode = this.getExitCode(env))) {
            return null;
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
                                                .Process
                                                .classes
                                                .Process
                                                .RequestStaticProperties
                                                .class,
                                        "exitCodes"),
                                env,
                                exitcode)
                        ? env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Process
                                                .classes
                                                .Process
                                                .RequestStaticProperties
                                                .class,
                                        "exitCodes")
                                .arrayGet(env, exitcode)
                        : "Unknown error");
    }

    @ConvertedMethod
    public Object isSuccessful(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(0, "===", this.getExitCode(env)));
    }

    @ConvertedMethod
    public Object hasBeenSignaled(RuntimeEnv env, Object... args) {
        this.requireProcessIsTerminated(env, "hasBeenSignaled");
        return ZVal.assign(
                new ReferenceClassProperty(this, "processInformation", env)
                        .arrayGet(env, "signaled"));
    }

    @ConvertedMethod
    public Object getTermSignal(RuntimeEnv env, Object... args) {
        this.requireProcessIsTerminated(env, "getTermSignal");
        if (ZVal.toBool(this.isSigchildEnabled(env))
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                -1,
                                "===",
                                new ReferenceClassProperty(this, "processInformation", env)
                                        .arrayGet(env, "termsig")))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "This PHP has been compiled with --enable-sigchild. Term signal can not be retrieved."));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "processInformation", env)
                        .arrayGet(env, "termsig"));
    }

    @ConvertedMethod
    public Object hasBeenStopped(RuntimeEnv env, Object... args) {
        this.requireProcessIsTerminated(env, "hasBeenStopped");
        return ZVal.assign(
                new ReferenceClassProperty(this, "processInformation", env)
                        .arrayGet(env, "stopped"));
    }

    @ConvertedMethod
    public Object getStopSignal(RuntimeEnv env, Object... args) {
        this.requireProcessIsTerminated(env, "getStopSignal");
        return ZVal.assign(
                new ReferenceClassProperty(this, "processInformation", env)
                        .arrayGet(env, "stopsig"));
    }

    @ConvertedMethod
    public Object isRunning(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(CONST_STATUS_STARTED, "!==", this.status)) {
            return ZVal.assign(false);
        }

        this.updateStatus(env, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "processInformation", env)
                        .arrayGet(env, "running"));
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.notEqualityCheck(CONST_STATUS_READY, this.status));
    }

    @ConvertedMethod
    public Object isTerminated(RuntimeEnv env, Object... args) {
        this.updateStatus(env, false);
        return ZVal.assign(ZVal.equalityCheck(CONST_STATUS_TERMINATED, this.status));
    }

    @ConvertedMethod
    public Object getStatus(RuntimeEnv env, Object... args) {
        this.updateStatus(env, false);
        return ZVal.assign(this.status);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "timeout",
        defaultValue = "10",
        defaultValueType = "number"
    )
    @ConvertedParameter(
        index = 1,
        name = "signal",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object stop(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, true);
        if (null == timeout) {
            timeout = 10;
        }
        Object signal = assignParameter(args, 1, true);
        if (null == signal) {
            signal = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        Object timeoutMicro = null;
        timeoutMicro = ZVal.add(function_microtime.f.env(env).call(true).value(), timeout);
        if (ZVal.isTrue(this.isRunning(env))) {
            this.doSignal(env, 15, false);
            do {
                NamespaceGlobal.usleep.env(env).call(1000);

            } while (ZVal.toBool(this.isRunning(env))
                    && ZVal.toBool(
                            ZVal.isLessThan(
                                    function_microtime.f.env(env).call(true).value(),
                                    '<',
                                    timeoutMicro)));

            if (ZVal.isTrue(this.isRunning(env))) {
                this.doSignal(
                        env,
                        ZVal.isTrue(ternaryExpressionTemp = signal) ? ternaryExpressionTemp : 9,
                        false);
            }
        }

        if (ZVal.isTrue(this.isRunning(env))) {
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "fallbackStatus", env),
                    env,
                    "pid")) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "fallbackStatus", env),
                        env,
                        "pid");
                return ZVal.assign(this.stop(env, 0, signal));
            }

            this.close(env);
        }

        return ZVal.assign(this.exitcode);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line", typeHint = "string")
    public Object addOutput(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        this.lastOutputTime = function_microtime.f.env(env).call(true).value();
        NamespaceGlobal.fseek.env(env).call(this.stdout, 0, 2);
        function_fwrite.f.env(env).call(this.stdout, line);
        NamespaceGlobal.fseek.env(env).call(this.stdout, this.incrementalOutputOffset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line", typeHint = "string")
    public Object addErrorOutput(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        this.lastOutputTime = function_microtime.f.env(env).call(true).value();
        NamespaceGlobal.fseek.env(env).call(this.stderr, 0, 2);
        function_fwrite.f.env(env).call(this.stderr, line);
        NamespaceGlobal.fseek.env(env).call(this.stderr, this.incrementalErrorOutputOffset);
        return null;
    }

    @ConvertedMethod
    public Object getCommandLine(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_is_array.f.env(env).call(this.commandline).getBool()
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
                                                                new ZPair(1, "escapeArgument")),
                                                        this.commandline)
                                                .value())
                                .value()
                        : this.commandline);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commandline")
    public Object setCommandLine(RuntimeEnv env, Object... args) {
        Object commandline = assignParameter(args, 0, false);
        this.commandline = commandline;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.timeout);
    }

    @ConvertedMethod
    public Object getIdleTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.idleTimeout);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout")
    public Object setTimeout(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        this.timeout = this.validateTimeout(env, timeout);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout")
    public Object setIdleTimeout(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", timeout))
                && ZVal.toBool(this.outputDisabled)) {
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .Process
                            .namespaces
                            .Exception
                            .classes
                            .LogicException(
                            env, "Idle timeout can not be set while the output is disabled."));
        }

        this.idleTimeout = this.validateTimeout(env, timeout);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tty")
    public Object setTty(RuntimeEnv env, Object... args) {
        Object tty = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.strictEqualityCheck("\\", "===", "/")) && ZVal.toBool(tty)) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(env, "TTY mode is not supported on Windows platform."));
        }

        if (ZVal.toBool(tty)
                && ZVal.toBool(!ZVal.isTrue(runtimeStaticObject.isTtySupported(env)))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(env, "TTY mode requires /dev/tty to be read/writable."));
        }

        this.tty = ZVal.toBool(tty);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isTty(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tty);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bool")
    public Object setPty(RuntimeEnv env, Object... args) {
        Object bool = assignParameter(args, 0, false);
        this.pty = ZVal.toBool(bool);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isPty(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.pty);
    }

    @ConvertedMethod
    public Object getWorkingDirectory(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.cwd)) {
            return ZVal.assign(
                    ZVal.isTrue(ternaryExpressionTemp = function_getcwd.f.env(env).call().value())
                            ? ternaryExpressionTemp
                            : ZVal.getNull());
        }

        return ZVal.assign(this.cwd);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cwd")
    public Object setWorkingDirectory(RuntimeEnv env, Object... args) {
        Object cwd = assignParameter(args, 0, false);
        this.cwd = cwd;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getEnv(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.___env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "env", typeHint = "array")
    public Object setEnv(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/process")
                        .setFile("/vendor/symfony/process/Process.php");
        Object ___env = assignParameter(args, 0, false);
        ___env =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                ___env,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Process",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "value")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object value = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                !function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(value)
                                                        .getBool());
                                    }
                                })
                        .value();
        this.___env = ___env;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getInput(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.input);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    public Object setInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.isRunning(env))) {
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .Process
                            .namespaces
                            .Exception
                            .classes
                            .LogicException(
                            env, "Input can not be set while the process is running."));
        }

        this.input =
                ProcessUtils.runtimeStaticObject.validateInput(env, "Process::setInput", input);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "inheritEnv",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object inheritEnvironmentVariables(RuntimeEnv env, Object... args) {
        Object inheritEnv = assignParameter(args, 0, true);
        if (null == inheritEnv) {
            inheritEnv = true;
        }
        if (!ZVal.isTrue(inheritEnv)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Not inheriting environment variables is not supported."));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object checkTimeout(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(CONST_STATUS_STARTED, "!==", this.status)) {
            return null;
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.timeout))
                && ZVal.toBool(
                        ZVal.isLessThan(
                                this.timeout,
                                '<',
                                ZVal.subtract(
                                        function_microtime.f.env(env).call(true).value(),
                                        this.starttime)))) {
            this.stop(env, 0);
            throw ZVal.getException(
                    env,
                    new ProcessTimedOutException(
                            env, this, ProcessTimedOutException.CONST_TYPE_GENERAL));
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.idleTimeout))
                && ZVal.toBool(
                        ZVal.isLessThan(
                                this.idleTimeout,
                                '<',
                                ZVal.subtract(
                                        function_microtime.f.env(env).call(true).value(),
                                        this.lastOutputTime)))) {
            this.stop(env, 0);
            throw ZVal.getException(
                    env,
                    new ProcessTimedOutException(
                            env, this, ProcessTimedOutException.CONST_TYPE_IDLE));
        }

        return null;
    }

    @ConvertedMethod
    private Object getDescriptors(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(ZVal.checkInstanceType(this.input, Iterator.class, "Iterator"))) {
            env.callMethod(this.input, "rewind", Process.class);
        }

        if (ZVal.strictEqualityCheck("\\", "===", "/")) {
            this.processPipes =
                    new WindowsPipes(
                            env,
                            this.input,
                            ZVal.toBool(!ZVal.isTrue(this.outputDisabled))
                                    || ZVal.toBool(this.hasCallback));

        } else {
            this.processPipes =
                    new UnixPipes(
                            env,
                            this.isTty(env),
                            this.isPty(env),
                            this.input,
                            ZVal.toBool(!ZVal.isTrue(this.outputDisabled))
                                    || ZVal.toBool(this.hasCallback));
        }

        return ZVal.assign(env.callMethod(this.processPipes, "getDescriptors", Process.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object buildCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/process")
                        .setFile("/vendor/symfony/process/Process.php");
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object out = null;
        if (ZVal.isTrue(this.outputDisabled)) {
            return ZVal.assign(
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Symfony\\Component\\Process",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "type")
                        @ConvertedParameter(index = 1, name = "data")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object type = assignParameter(args, 0, false);
                            Object data = assignParameter(args, 1, false);
                            Object callback = null;
                            callback = this.contextReferences.getCapturedValue("callback");
                            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callback)) {
                                function_call_user_func
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call(callback, type, data);
                            }

                            return null;
                        }
                    }.use("callback", callback));
        }

        out = ZVal.assign(CONST_OUT);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Process",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "type")
                    @ConvertedParameter(index = 1, name = "data")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object type = assignParameter(args, 0, false);
                        Object data = assignParameter(args, 1, false);
                        Object callback = null;
                        Object out = null;
                        callback = this.contextReferences.getCapturedValue("callback");
                        out = this.contextReferences.getCapturedValue("out");
                        if (ZVal.equalityCheck(out, type)) {
                            Process.this.addOutput(env, data);

                        } else {
                            Process.this.addErrorOutput(env, data);
                        }

                        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", callback)) {
                            function_call_user_func
                                    .f
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                    .call(callback, type, data);
                        }

                        return null;
                    }
                }.use("callback", callback).use("out", out));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "blocking")
    protected Object updateStatus(RuntimeEnv env, Object... args) {
        Object blocking = assignParameter(args, 0, false);
        Object running = null;
        if (ZVal.strictNotEqualityCheck(CONST_STATUS_STARTED, "!==", this.status)) {
            return null;
        }

        this.processInformation =
                NamespaceGlobal.proc_get_status.env(env).call(this.process).value();
        running =
                ZVal.assign(
                        new ReferenceClassProperty(this, "processInformation", env)
                                .arrayGet(env, "running"));
        this.readPipes(
                env,
                ZVal.toBool(running) && ZVal.toBool(blocking),
                ZVal.toBool(ZVal.strictNotEqualityCheck("\\", "!==", "/"))
                        || ZVal.toBool(!ZVal.isTrue(running)));
        if (ZVal.toBool(this.fallbackStatus) && ZVal.toBool(this.isSigchildEnabled(env))) {
            this.processInformation = ZVal.add(this.fallbackStatus, this.processInformation);
        }

        if (!ZVal.isTrue(running)) {
            this.close(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object isSigchildEnabled(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Process
                                        .classes
                                        .Process
                                        .RequestStaticProperties
                                        .class)
                        .sigchild)) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .Process
                                            .classes
                                            .Process
                                            .RequestStaticProperties
                                            .class)
                            .sigchild);
        }

        if (!function_function_exists.f.env(env).call("phpinfo").getBool()) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Process
                                                    .classes
                                                    .Process
                                                    .RequestStaticProperties
                                                    .class)
                                    .sigchild =
                            false);
        }

        function_ob_start.f.env(env).call();
        NamespaceGlobal.phpinfo.env(env).call(1);
        return ZVal.assign(
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .Process
                                                .classes
                                                .Process
                                                .RequestStaticProperties
                                                .class)
                                .sigchild =
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(
                                                function_ob_get_clean.f.env(env).call().value(),
                                                "--enable-sigchild")
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "caller", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "blocking",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object readPipesForOutput(RuntimeEnv env, Object... args) {
        Object caller = assignParameter(args, 0, false);
        Object blocking = assignParameter(args, 1, true);
        if (null == blocking) {
            blocking = false;
        }
        if (ZVal.isTrue(this.outputDisabled)) {
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .Process
                            .namespaces
                            .Exception
                            .classes
                            .LogicException(env, "Output has been disabled."));
        }

        this.requireProcessIsStarted(env, caller);
        this.updateStatus(env, blocking);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout")
    private Object validateTimeout(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        timeout = ZVal.assign(ZVal.toDouble(timeout));
        if (ZVal.strictEqualityCheck(0.0, "===", timeout)) {
            timeout = ZVal.getNull();

        } else if (ZVal.isLessThan(timeout, '<', 0)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "The timeout value must be a valid positive integer or float number."));
        }

        return ZVal.assign(timeout);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "blocking", typeHint = "bool")
    @ConvertedParameter(index = 1, name = "close", typeHint = "bool")
    private Object readPipes(RuntimeEnv env, Object... args) {
        Object blocking = assignParameter(args, 0, false);
        Object close = assignParameter(args, 1, false);
        Object result = null;
        ReferenceContainer data = new BasicReferenceContainer(null);
        Object callback = null;
        Object type = null;
        result = env.callMethod(this.processPipes, "readAndWrite", Process.class, blocking, close);
        callback = ZVal.assign(this.callback);
        for (ZPair zpairResult2004 : ZVal.getIterable(result, env, false)) {
            type = ZVal.assign(zpairResult2004.getKey());
            data.setObject(ZVal.assign(zpairResult2004.getValue()));
            if (ZVal.strictNotEqualityCheck(3, "!==", type)) {
                env.callFunctionDynamic(
                        callback,
                        new RuntimeArgsWithReferences().add(1, data),
                        ZVal.strictEqualityCheck(CONST_STDOUT, "===", type) ? CONST_OUT : CONST_ERR,
                        data.getObject());

            } else if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "fallbackStatus", env),
                    env,
                    "signaled")) {
                new ReferenceClassProperty(this, "fallbackStatus", env)
                        .arrayAccess(env, "exitcode")
                        .set(ZVal.toLong(data.getObject()));
            }
        }

        return null;
    }

    @ConvertedMethod
    private Object close(RuntimeEnv env, Object... args) {
        env.callMethod(this.processPipes, "close", Process.class);
        if (function_is_resource.f.env(env).call(this.process).getBool()) {
            NamespaceGlobal.proc_close.env(env).call(this.process);
        }

        this.exitcode =
                new ReferenceClassProperty(this, "processInformation", env)
                        .arrayGet(env, "exitcode");
        this.status = CONST_STATUS_TERMINATED;
        if (ZVal.strictEqualityCheck(-1, "===", this.exitcode)) {
            if (ZVal.toBool(
                            new ReferenceClassProperty(this, "processInformation", env)
                                    .arrayGet(env, "signaled"))
                    && ZVal.toBool(
                            ZVal.isLessThan(
                                    0,
                                    '<',
                                    new ReferenceClassProperty(this, "processInformation", env)
                                            .arrayGet(env, "termsig")))) {
                this.exitcode =
                        ZVal.add(
                                128,
                                new ReferenceClassProperty(this, "processInformation", env)
                                        .arrayGet(env, "termsig"));

            } else if (ZVal.isTrue(this.isSigchildEnabled(env))) {
                new ReferenceClassProperty(this, "processInformation", env)
                        .arrayAccess(env, "signaled")
                        .set(true);
                new ReferenceClassProperty(this, "processInformation", env)
                        .arrayAccess(env, "termsig")
                        .set(-1);
            }
        }

        this.callback = ZVal.getNull();
        return ZVal.assign(this.exitcode);
    }

    @ConvertedMethod
    private Object resetProcessData(RuntimeEnv env, Object... args) {
        this.starttime = ZVal.getNull();
        this.callback = ZVal.getNull();
        this.exitcode = ZVal.getNull();
        this.fallbackStatus = ZVal.newArray();
        this.processInformation = ZVal.getNull();
        this.stdout =
                function_fopen
                        .f
                        .env(env)
                        .call(
                                "php://temp/maxmemory:" + toStringR(ZVal.multiply(1024, 1024), env),
                                "wb+")
                        .value();
        this.stderr =
                function_fopen
                        .f
                        .env(env)
                        .call(
                                "php://temp/maxmemory:" + toStringR(ZVal.multiply(1024, 1024), env),
                                "wb+")
                        .value();
        this.process = ZVal.getNull();
        this.latestSignal = ZVal.getNull();
        this.status = CONST_STATUS_READY;
        this.incrementalOutputOffset = 0;
        this.incrementalErrorOutputOffset = 0;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "signal", typeHint = "int")
    @ConvertedParameter(index = 1, name = "throwException", typeHint = "bool")
    private Object doSignal(RuntimeEnv env, Object... args) {
        Object signal = assignParameter(args, 0, false);
        Object throwException = assignParameter(args, 1, false);
        ReferenceContainer output = new BasicReferenceContainer(null);
        ReferenceContainer exitCode = new BasicReferenceContainer(null);
        Object pid = null;
        Object ok = null;
        ReferenceContainer pipes = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", pid = this.getPid(env))) {
            if (ZVal.isTrue(throwException)) {
                throw ZVal.getException(
                        env,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Process
                                .namespaces
                                .Exception
                                .classes
                                .LogicException(
                                env, "Can not send signal on a non running process."));
            }

            return ZVal.assign(false);
        }

        if (ZVal.strictEqualityCheck("\\", "===", "/")) {
            NamespaceGlobal.exec
                    .env(env)
                    .addReferenceArgs(
                            new RuntimeArgsWithReferences().add(1, output).add(2, exitCode))
                    .call(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("taskkill /F /T /PID %d 2>&1", pid)
                                    .value(),
                            output.getObject(),
                            exitCode.getObject());
            if (ZVal.toBool(exitCode.getObject()) && ZVal.toBool(this.isRunning(env))) {
                if (ZVal.isTrue(throwException)) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "Unable to kill the process (%s).",
                                                    NamespaceGlobal.implode
                                                            .env(env)
                                                            .call(" ", output.getObject())
                                                            .value())
                                            .value()));
                }

                return ZVal.assign(false);
            }

        } else {
            if (!ZVal.isTrue(this.isSigchildEnabled(env))) {
                ok = NamespaceGlobal.proc_terminate.env(env).call(this.process, signal).value();

            } else if (function_function_exists.f.env(env).call("posix_kill").getBool()) {
                ok = NamespaceGlobal.posix_kill.env(env).call(pid, signal).value();

            } else if (ZVal.isTrue(
                    ok =
                            NamespaceGlobal.proc_open
                                    .env(env)
                                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                                    .call(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call("kill -%d %d", signal, pid)
                                                    .value(),
                                            ZVal.newArray(
                                                    new ZPair(2, ZVal.arrayFromList("pipe", "w"))),
                                            pipes.getObject())
                                    .value())) {
                ok =
                        ZVal.strictEqualityCheck(
                                false,
                                "===",
                                NamespaceGlobal.fgets
                                        .env(env)
                                        .call(pipes.arrayGet(env, 2))
                                        .value());
            }

            if (!ZVal.isTrue(ok)) {
                if (ZVal.isTrue(throwException)) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call("Error while sending signal `%s`.", signal)
                                            .value()));
                }

                return ZVal.assign(false);
            }
        }

        this.latestSignal = signal;
        new ReferenceClassProperty(this, "fallbackStatus", env)
                .arrayAccess(env, "signaled")
                .set(true);
        new ReferenceClassProperty(this, "fallbackStatus", env)
                .arrayAccess(env, "exitcode")
                .set(-1);
        new ReferenceClassProperty(this, "fallbackStatus", env)
                .arrayAccess(env, "termsig")
                .set(this.latestSignal);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cmd", typeHint = "string")
    @ConvertedParameter(index = 1, name = "env", typeHint = "array")
    private Object prepareWindowsCommandLine(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/process")
                        .setFile("/vendor/symfony/process/Process.php");
        Object cmd = assignParameter(args, 0, false);
        ReferenceContainer ___env = assignParameterRef(runtimePassByReferenceArgs, args, 1, false);
        Object uid = null;
        Object filename = null;
        Object offset = null;
        ReferenceContainer varCache = new BasicReferenceContainer(null);
        ReferenceContainer varCount = new BasicReferenceContainer(null);
        uid = NamespaceGlobal.uniqid.env(env).call("", true).value();
        varCount.setObject(0);
        varCache.setObject(ZVal.newArray());
        cmd =
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "/\"(?:(\n                [^\"%!^]*+\n                (?:\n                    (?: !LF! | \"(?:\\^[%!^])?+\" )\n                    [^\"%!^]*+\n                )++\n            ) | [^\"]*+ )\"/x",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Process",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "m")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer m =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object uid = null;
                                        ReferenceContainer varCache =
                                                new BasicReferenceContainer(null);
                                        Object var = null;
                                        ReferenceContainer varCount =
                                                new BasicReferenceContainer(null);
                                        ReferenceContainer ___env =
                                                new BasicReferenceContainer(null);
                                        Object value = null;
                                        uid = this.contextReferences.getCapturedValue("uid");
                                        varCache =
                                                this.contextReferences.getReferenceContainer(
                                                        "varCache");
                                        varCount =
                                                this.contextReferences.getReferenceContainer(
                                                        "varCount");
                                        ___env =
                                                this.contextReferences.getReferenceContainer("env");
                                        if (!arrayActionR(ArrayAction.ISSET, m, env, 1)) {
                                            return ZVal.assign(m.arrayGet(env, 0));
                                        }

                                        if (arrayActionR(
                                                ArrayAction.ISSET,
                                                varCache,
                                                env,
                                                m.arrayGet(env, 0))) {
                                            return ZVal.assign(
                                                    varCache.arrayGet(env, m.arrayGet(env, 0)));
                                        }

                                        if (ZVal.strictNotEqualityCheck(
                                                false,
                                                "!==",
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                value =
                                                                        ZVal.assign(
                                                                                m.arrayGet(env, 1)),
                                                                "\u0000")
                                                        .value())) {
                                            value =
                                                    function_str_replace
                                                            .f
                                                            .env(env)
                                                            .call("\u0000", "?", value)
                                                            .value();
                                        }

                                        if (ZVal.strictEqualityCheck(
                                                false,
                                                "===",
                                                NamespaceGlobal.strpbrk
                                                        .env(env)
                                                        .call(value, "\"%!\n")
                                                        .value())) {
                                            return ZVal.assign("\"" + toStringR(value, env) + "\"");
                                        }

                                        value =
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.arrayFromList(
                                                                        "!LF!", "\"^!\"", "\"^%\"",
                                                                        "\"^^\"", "\"\""),
                                                                ZVal.arrayFromList(
                                                                        "\n", "!", "%", "^", "\""),
                                                                value)
                                                        .value();
                                        value =
                                                "\""
                                                        + toStringR(
                                                                function_preg_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "/(\\\\*)\"/",
                                                                                "$1$1\\\"",
                                                                                value)
                                                                        .value(),
                                                                env)
                                                        + "\"";
                                        var =
                                                toStringR(uid, env)
                                                        + toStringR(
                                                                ZVal.preIncrement(varCount), env);
                                        ___env.arrayAccess(env, var).set(value);
                                        return ZVal.assign(
                                                varCache.arrayAccess(env, m.arrayGet(env, 0))
                                                        .set("!" + toStringR(var, env) + "!"));
                                    }
                                }.useRef("varCache", varCache)
                                        .useRef("varCount", varCount)
                                        .useRef("env", ___env)
                                        .use("uid", uid),
                                cmd)
                        .value();
        cmd =
                "cmd /V:ON /E:ON /D /C ("
                        + toStringR(
                                function_str_replace.f.env(env).call("\n", " ", cmd).value(), env)
                        + ")";
        for (ZPair zpairResult2005 :
                ZVal.getIterable(
                        env.callMethod(this.processPipes, "getFiles", Process.class), env, false)) {
            offset = ZVal.assign(zpairResult2005.getKey());
            filename = ZVal.assign(zpairResult2005.getValue());
            cmd =
                    toStringR(cmd, env)
                            + " "
                            + toStringR(offset, env)
                            + ">\""
                            + toStringR(filename, env)
                            + "\"";
        }

        return ZVal.assign(cmd);
    }

    public Object prepareWindowsCommandLine(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "functionName", typeHint = "string")
    private Object requireProcessIsStarted(RuntimeEnv env, Object... args) {
        Object functionName = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.isStarted(env))) {
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .Process
                            .namespaces
                            .Exception
                            .classes
                            .LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Process must be started before calling %s.",
                                            functionName)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "functionName", typeHint = "string")
    private Object requireProcessIsTerminated(RuntimeEnv env, Object... args) {
        Object functionName = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.isTerminated(env))) {
            throw ZVal.getException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Symfony
                            .namespaces
                            .Component
                            .namespaces
                            .Process
                            .namespaces
                            .Exception
                            .classes
                            .LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Process must be terminated before calling %s.",
                                            functionName)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "argument", typeHint = "string")
    private Object escapeArgument(RuntimeEnv env, Object... args) {
        Object argument = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck("\\", "!==", "/")) {
            return ZVal.assign(
                    "'"
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("'", "'\\''", argument)
                                            .value(),
                                    env)
                            + "'");
        }

        if (ZVal.strictEqualityCheck("", "===", argument = ZVal.assign(toStringR(argument, env)))) {
            return "\"\"";
        }

        if (ZVal.strictNotEqualityCheck(
                false, "!==", function_strpos.f.env(env).call(argument, "\u0000").value())) {
            argument = function_str_replace.f.env(env).call("\u0000", "?", argument).value();
        }

        if (!function_preg_match.f.env(env).call("/[\\/()%!^\"<>&|\\s]/", argument).getBool()) {
            return ZVal.assign(argument);
        }

        argument = function_preg_replace.f.env(env).call("/(\\\\+)$/", "$1$1", argument).value();
        return ZVal.assign(
                "\""
                        + toStringR(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.arrayFromList("\"", "^", "%", "!", "\n"),
                                                ZVal.arrayFromList(
                                                        "\"\"", "\"^^\"", "\"^%\"", "\"^!\"",
                                                        "!LF!"),
                                                argument)
                                        .value(),
                                env)
                        + "\"");
    }

    @ConvertedMethod
    private Object getDefaultEnv(RuntimeEnv env, Object... args) {
        Object _ENV = null;
        Object v = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object k = null;
        ReferenceContainer ___env = new BasicReferenceContainer(null);
        ___env.setObject(ZVal.newArray());
        for (ZPair zpairResult2006 : ZVal.getIterable(_SERVER.getObject(), env, false)) {
            k = ZVal.assign(zpairResult2006.getKey());
            v = ZVal.assign(zpairResult2006.getValue());
            if (ZVal.toBool(function_is_string.f.env(env).call(v).value())
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    v = NamespaceGlobal.getenv.env(env).call(k).value()))) {
                ___env.arrayAccess(env, k).set(v);
            }
        }

        for (ZPair zpairResult2007 : ZVal.getIterable(_ENV, env, false)) {
            k = ZVal.assign(zpairResult2007.getKey());
            v = ZVal.assign(zpairResult2007.getValue());
            if (function_is_string.f.env(env).call(v).getBool()) {
                ___env.arrayAccess(env, k).set(v);
            }
        }

        return ZVal.assign(___env.getObject());
    }

    public static final Object CONST_ERR = "err";

    public static final Object CONST_OUT = "out";

    public static final Object CONST_STATUS_READY = "ready";

    public static final Object CONST_STATUS_STARTED = "started";

    public static final Object CONST_STATUS_TERMINATED = "terminated";

    public static final Object CONST_STDIN = 0;

    public static final Object CONST_STDOUT = 1;

    public static final Object CONST_STDERR = 2;

    public static final Object CONST_TIMEOUT_PRECISION = 0.2;

    public static final Object CONST_ITER_NON_BLOCKING = 1;

    public static final Object CONST_ITER_KEEP_OUTPUT = 2;

    public static final Object CONST_ITER_SKIP_OUT = 4;

    public static final Object CONST_ITER_SKIP_ERR = 8;

    public static final Object CONST_class = "Symfony\\Component\\Process\\Process";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object isTtySupported(RuntimeEnv env, Object... args) {
            ReferenceContainer isTtySupported = new BasicReferenceContainer(null);
            ReferenceContainer pipes = new BasicReferenceContainer(null);
            isTtySupported = env.getInlineStatic(36, null);
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", isTtySupported.getObject())) {
                isTtySupported.setObject(
                        ZVal.assign(
                                ZVal.toBool(
                                        NamespaceGlobal.proc_open
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithReferences()
                                                                .add(2, pipes))
                                                .call(
                                                        "echo 1 >/dev/null",
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        0,
                                                                        ZVal.arrayFromList(
                                                                                "file",
                                                                                "/dev/tty",
                                                                                "r")),
                                                                new ZPair(
                                                                        1,
                                                                        ZVal.arrayFromList(
                                                                                "file",
                                                                                "/dev/tty",
                                                                                "w")),
                                                                new ZPair(
                                                                        2,
                                                                        ZVal.arrayFromList(
                                                                                "file",
                                                                                "/dev/tty",
                                                                                "w"))),
                                                        pipes.getObject())
                                                .value())));
            }

            return ZVal.assign(isTtySupported.getObject());
        }

        @ConvertedMethod
        public Object isPtySupported(RuntimeEnv env, Object... args) {
            ReferenceContainer result = new BasicReferenceContainer(null);
            ReferenceContainer pipes = new BasicReferenceContainer(null);
            result = env.getInlineStatic(37, null);
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", result.getObject())) {
                return ZVal.assign(result.getObject());
            }

            if (ZVal.strictEqualityCheck("\\", "===", "/")) {
                return ZVal.assign(result.setObject(false));
            }

            return ZVal.assign(
                    result.setObject(
                            ZVal.assign(
                                    ZVal.toBool(
                                            NamespaceGlobal.proc_open
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences()
                                                                    .add(2, pipes))
                                                    .call(
                                                            "echo 1 >/dev/null",
                                                            ZVal.newArray(
                                                                    new ZPair(
                                                                            0,
                                                                            ZVal.arrayFromList(
                                                                                    "pty")),
                                                                    new ZPair(
                                                                            1,
                                                                            ZVal.arrayFromList(
                                                                                    "pty")),
                                                                    new ZPair(
                                                                            2,
                                                                            ZVal.arrayFromList(
                                                                                    "pty"))),
                                                            pipes.getObject())
                                                    .value()))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object sigchild = null;

        public Object exitCodes =
                ZVal.newArray(
                        new ZPair(0, "OK"),
                        new ZPair(1, "General error"),
                        new ZPair(2, "Misuse of shell builtins"),
                        new ZPair(126, "Invoked command cannot execute"),
                        new ZPair(127, "Command not found"),
                        new ZPair(128, "Invalid exit argument"),
                        new ZPair(129, "Hangup"),
                        new ZPair(130, "Interrupt"),
                        new ZPair(131, "Quit and dump core"),
                        new ZPair(132, "Illegal instruction"),
                        new ZPair(133, "Trace/breakpoint trap"),
                        new ZPair(134, "Process aborted"),
                        new ZPair(
                                135, "Bus error: \"access to undefined portion of memory object\""),
                        new ZPair(
                                136,
                                "Floating point exception: \"erroneous arithmetic operation\""),
                        new ZPair(137, "Kill (terminate immediately)"),
                        new ZPair(138, "User-defined 1"),
                        new ZPair(139, "Segmentation violation"),
                        new ZPair(140, "User-defined 2"),
                        new ZPair(141, "Write to pipe with no one reading"),
                        new ZPair(142, "Signal raised by alarm"),
                        new ZPair(143, "Termination (request to terminate)"),
                        new ZPair(145, "Child process terminated, stopped (or continued*)"),
                        new ZPair(146, "Continue if stopped"),
                        new ZPair(147, "Stop executing temporarily"),
                        new ZPair(148, "Terminal stop signal"),
                        new ZPair(149, "Background process attempting to read from tty (\"in\")"),
                        new ZPair(150, "Background process attempting to write to tty (\"out\")"),
                        new ZPair(151, "Urgent data available on socket"),
                        new ZPair(152, "CPU time limit exceeded"),
                        new ZPair(153, "File size limit exceeded"),
                        new ZPair(
                                154,
                                "Signal raised by timer counting virtual time: \"virtual timer expired\""),
                        new ZPair(155, "Profiling timer expired"),
                        new ZPair(157, "Pollable event"),
                        new ZPair(159, "Bad syscall"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Process\\Process")
                    .setLookup(
                            Process.class,
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
                    .setStaticPropertyNames("exitCodes", "sigchild")
                    .setFilename("vendor/symfony/process/Process.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
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
