package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.DefaultPhpProcess;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes.Runtime;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.SyntheticError;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.namespaces.PHP.classes.WindowsPhpProcess;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.__PHP_Incomplete_Class;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/PHP/AbstractPhpProcess.php

*/

public abstract class AbstractPhpProcess extends RuntimeClassBase {

    public Object runtime = null;

    public Object stderrRedirection = false;

    public Object stdin = "";

    public Object ___args = "";

    public Object ___env = ZVal.newArray();

    public Object timeout = 0;

    public AbstractPhpProcess(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractPhpProcess.class) {
            this.__construct(env, args);
        }
    }

    public AbstractPhpProcess(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.runtime = new Runtime(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stderrRedirection", typeHint = "bool")
    public Object setUseStderrRedirection(RuntimeEnv env, Object... args) {
        Object stderrRedirection = assignParameter(args, 0, false);
        this.stderrRedirection = stderrRedirection;
        return null;
    }

    @ConvertedMethod
    public Object useStderrRedirection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stderrRedirection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stdin", typeHint = "string")
    public Object setStdin(RuntimeEnv env, Object... args) {
        Object stdin = assignParameter(args, 0, false);
        this.stdin = stdin;
        return null;
    }

    @ConvertedMethod
    public Object getStdin(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stdin);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "args", typeHint = "string")
    public Object setArgs(RuntimeEnv env, Object... args) {
        Object ___args = assignParameter(args, 0, false);
        this.___args = ___args;
        return null;
    }

    @ConvertedMethod
    public Object getArgs(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.___args);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "env", typeHint = "array")
    public Object setEnv(RuntimeEnv env, Object... args) {
        Object ___env = assignParameter(args, 0, false);
        this.___env = ___env;
        return null;
    }

    @ConvertedMethod
    public Object getEnv(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.___env);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout", typeHint = "int")
    public Object setTimeout(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        this.timeout = timeout;
        return null;
    }

    @ConvertedMethod
    public Object getTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.timeout);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job", typeHint = "string")
    @ConvertedParameter(index = 1, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 2, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    public Object runTestJob(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object test = assignParameter(args, 1, false);
        Object result = assignParameter(args, 2, false);
        ReferenceContainer _result = new BasicReferenceContainer(null);
        env.callMethod(result, "startTest", AbstractPhpProcess.class, test);
        _result.setObject(env.callMethod(this, "runJob", AbstractPhpProcess.class, job));
        this.processChildResult(
                env,
                test,
                result,
                _result.arrayGet(env, "stdout"),
                _result.arrayGet(env, "stderr"));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "settings", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "file",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getCommand(RuntimeEnv env, Object... args) {
        Object settings = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, true);
        if (null == file) {
            file = ZVal.getNull();
        }
        Object command = null;
        command = env.callMethod(this.runtime, "getBinary", AbstractPhpProcess.class);
        command =
                toStringR(command, env) + toStringR(this.settingsToParameters(env, settings), env);
        if (ZVal.strictEqualityCheck("cli", "===", "phpdbg")) {
            command = toStringR(command, env) + " -qrr ";
            if (ZVal.isTrue(file)) {
                command =
                        toStringR(command, env)
                                + "-e "
                                + toStringR(
                                        NamespaceGlobal.escapeshellarg.env(env).call(file).value(),
                                        env);

            } else {
                command =
                        toStringR(command, env)
                                + toStringR(
                                        NamespaceGlobal.escapeshellarg
                                                .env(env)
                                                .call(
                                                        toStringR(
                                                                        env.addRootFilesystemPrefix(
                                                                                "/vendor/phpunit/phpunit/src/Util/PHP"),
                                                                        env)
                                                                + "/eval-stdin.php")
                                                .value(),
                                        env);
            }

        } else if (ZVal.isTrue(file)) {
            command =
                    toStringR(command, env)
                            + " -f "
                            + toStringR(
                                    NamespaceGlobal.escapeshellarg.env(env).call(file).value(),
                                    env);
        }

        if (ZVal.isTrue(this.___args)) {
            command = toStringR(command, env) + " -- " + toStringR(this.___args, env);
        }

        if (ZVal.strictEqualityCheck(this.stderrRedirection, "===", true)) {
            command = toStringR(command, env) + " 2>&1";
        }

        return ZVal.assign(command);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "settings", typeHint = "array")
    protected Object settingsToParameters(RuntimeEnv env, Object... args) {
        Object settings = assignParameter(args, 0, false);
        Object buffer = null;
        Object setting = null;
        buffer = "";
        for (ZPair zpairResult1295 : ZVal.getIterable(settings, env, true)) {
            setting = ZVal.assign(zpairResult1295.getValue());
            buffer =
                    toStringR(buffer, env)
                            + " -d "
                            + toStringR(
                                    NamespaceGlobal.escapeshellarg.env(env).call(setting).value(),
                                    env);
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "PHPUnit\\Framework\\Test")
    @ConvertedParameter(index = 1, name = "result", typeHint = "PHPUnit\\Framework\\TestResult")
    @ConvertedParameter(index = 2, name = "stdout", typeHint = "string")
    @ConvertedParameter(index = 3, name = "stderr", typeHint = "string")
    private Object processChildResult(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpunit/phpunit/src/Util/PHP")
                        .setFile("/vendor/phpunit/phpunit/src/Util/PHP/AbstractPhpProcess.php");
        Object test = assignParameter(args, 0, false);
        Object result = assignParameter(args, 1, false);
        Object stdout = assignParameter(args, 2, false);
        Object stderr = assignParameter(args, 3, false);
        ReferenceContainer childResult = new BasicReferenceContainer(null);
        ReferenceContainer failures = new BasicReferenceContainer(null);
        Object e = null;
        ReferenceContainer warnings = new BasicReferenceContainer(null);
        ReferenceContainer skipped = new BasicReferenceContainer(null);
        Object output = null;
        ReferenceContainer notImplemented = new BasicReferenceContainer(null);
        Object time = null;
        ReferenceContainer risky = new BasicReferenceContainer(null);
        ReferenceContainer errors = new BasicReferenceContainer(null);
        time = 0;
        if (!ZVal.isEmpty(stderr)) {
            env.callMethod(
                    result,
                    "addError",
                    AbstractPhpProcess.class,
                    test,
                    new Exception(env, function_trim.f.env(env).call(stderr).value()),
                    time);

        } else {
            function_set_error_handler
                    .f
                    .env(env)
                    .call(
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "PHPUnit\\Util\\PHP",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "errno")
                                @ConvertedParameter(index = 1, name = "errstr")
                                @ConvertedParameter(index = 2, name = "errfile")
                                @ConvertedParameter(index = 3, name = "errline")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object errno = assignParameter(args, 0, false);
                                    Object errstr = assignParameter(args, 1, false);
                                    Object errfile = assignParameter(args, 2, false);
                                    Object errline = assignParameter(args, 3, false);
                                    throw ZVal.getException(
                                            env,
                                            new ErrorException(
                                                    env, errstr, errno, errno, errfile, errline));
                                }
                            });
            try {
                if (ZVal.strictEqualityCheck(
                        function_strpos.f.env(env).call(stdout, "#!/usr/bin/env php\n").value(),
                        "===",
                        0)) {
                    stdout = function_substr.f.env(env).call(stdout, 19).value();
                }

                childResult.setObject(
                        function_unserialize
                                .f
                                .env(env)
                                .call(
                                        function_str_replace
                                                .f
                                                .env(env)
                                                .call("#!/usr/bin/env php\n", "", stdout)
                                                .value())
                                .value());
                function_restore_error_handler.f.env(env).call();
            } catch (ConvertedException convertedException167) {
                if (convertedException167.instanceOf(ErrorException.class, "ErrorException")) {
                    e = convertedException167.getObject();
                    function_restore_error_handler.f.env(env).call();
                    childResult.setObject(false);
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            new Exception(env, function_trim.f.env(env).call(stdout).value(), 0, e),
                            time);
                } else {
                    throw convertedException167;
                }
            }

            if (ZVal.strictNotEqualityCheck(childResult.getObject(), "!==", false)) {
                if (!arrayActionR(ArrayAction.EMPTY, childResult, env, "output")) {
                    output = ZVal.assign(childResult.arrayGet(env, "output"));
                }

                env.callMethod(
                        test,
                        "setResult",
                        AbstractPhpProcess.class,
                        childResult.arrayGet(env, "testResult"));
                env.callMethod(
                        test,
                        "addToAssertionCount",
                        AbstractPhpProcess.class,
                        childResult.arrayGet(env, "numAssertions"));
                childResult.setObject(ZVal.assign(childResult.arrayGet(env, "result")));
                if (ZVal.isTrue(
                        env.callMethod(
                                result,
                                "getCollectCodeCoverageInformation",
                                AbstractPhpProcess.class))) {
                    env.callMethod(
                            env.callMethod(result, "getCodeCoverage", AbstractPhpProcess.class),
                            "merge",
                            AbstractPhpProcess.class,
                            env.callMethod(
                                    childResult.getObject(),
                                    "getCodeCoverage",
                                    AbstractPhpProcess.class));
                }

                time = env.callMethod(childResult.getObject(), "time", AbstractPhpProcess.class);
                notImplemented.setObject(
                        env.callMethod(
                                childResult.getObject(),
                                "notImplemented",
                                AbstractPhpProcess.class));
                risky.setObject(
                        env.callMethod(childResult.getObject(), "risky", AbstractPhpProcess.class));
                skipped.setObject(
                        env.callMethod(
                                childResult.getObject(), "skipped", AbstractPhpProcess.class));
                errors.setObject(
                        env.callMethod(
                                childResult.getObject(), "errors", AbstractPhpProcess.class));
                warnings.setObject(
                        env.callMethod(
                                childResult.getObject(), "warnings", AbstractPhpProcess.class));
                failures.setObject(
                        env.callMethod(
                                childResult.getObject(), "failures", AbstractPhpProcess.class));
                if (!ZVal.isEmpty(notImplemented.getObject())) {
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            this.getException(env, notImplemented.arrayGet(env, 0)),
                            time);

                } else if (!ZVal.isEmpty(risky.getObject())) {
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            this.getException(env, risky.arrayGet(env, 0)),
                            time);

                } else if (!ZVal.isEmpty(skipped.getObject())) {
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            this.getException(env, skipped.arrayGet(env, 0)),
                            time);

                } else if (!ZVal.isEmpty(errors.getObject())) {
                    env.callMethod(
                            result,
                            "addError",
                            AbstractPhpProcess.class,
                            test,
                            this.getException(env, errors.arrayGet(env, 0)),
                            time);

                } else if (!ZVal.isEmpty(warnings.getObject())) {
                    env.callMethod(
                            result,
                            "addWarning",
                            AbstractPhpProcess.class,
                            test,
                            this.getException(env, warnings.arrayGet(env, 0)),
                            time);

                } else if (!ZVal.isEmpty(failures.getObject())) {
                    env.callMethod(
                            result,
                            "addFailure",
                            AbstractPhpProcess.class,
                            test,
                            this.getException(env, failures.arrayGet(env, 0)),
                            time);
                }
            }
        }

        env.callMethod(result, "endTest", AbstractPhpProcess.class, test, time);
        if (!ZVal.isEmpty(output)) {
            env.echo(output);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "error", typeHint = "PHPUnit\\Framework\\TestFailure")
    private Object getException(RuntimeEnv env, Object... args) {
        Object error = assignParameter(args, 0, false);
        Object exception = null;
        ReferenceContainer exceptionArray = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        exception = env.callMethod(error, "thrownException", AbstractPhpProcess.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        exception, __PHP_Incomplete_Class.class, "__PHP_Incomplete_Class"))) {
            exceptionArray.setObject(ZVal.newArray());
            for (ZPair zpairResult1296 : ZVal.getIterable(rToArrayCast(exception), env, false)) {
                key = ZVal.assign(zpairResult1296.getKey());
                value = ZVal.assign(zpairResult1296.getValue());
                key =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        key,
                                        ZVal.add(
                                                NamespaceGlobal.strrpos
                                                        .env(env)
                                                        .call(key, "\u0000")
                                                        .value(),
                                                1))
                                .value();
                exceptionArray.arrayAccess(env, key).set(value);
            }

            exception =
                    new SyntheticError(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s: %s",
                                            exceptionArray.arrayGet(
                                                    env, "_PHP_Incomplete_Class_Name"),
                                            exceptionArray.arrayGet(env, "message"))
                                    .value(),
                            exceptionArray.arrayGet(env, "code"),
                            exceptionArray.arrayGet(env, "file"),
                            exceptionArray.arrayGet(env, "line"),
                            exceptionArray.arrayGet(env, "trace"));
        }

        return ZVal.assign(exception);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\PHP\\AbstractPhpProcess";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object factory(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck("/", "===", "\\")) {
                return ZVal.assign(new WindowsPhpProcess(env));
            }

            return ZVal.assign(new DefaultPhpProcess(env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\PHP\\AbstractPhpProcess")
                    .setLookup(
                            AbstractPhpProcess.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "args", "env", "runtime", "stderrRedirection", "stdin", "timeout")
                    .setFilename("vendor/phpunit/phpunit/src/Util/PHP/AbstractPhpProcess.php")
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
