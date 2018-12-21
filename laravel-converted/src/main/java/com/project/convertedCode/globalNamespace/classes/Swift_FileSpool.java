package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_IoException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.classes.Swift_ConfigurableSpool;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.project.convertedCode.globalNamespace.functions.random_int;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.DirectoryIterator;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/FileSpool.php

*/

public class Swift_FileSpool extends Swift_ConfigurableSpool {

    public Object path = null;

    public Object retryLimit = 10;

    public Swift_FileSpool(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Swift_FileSpool.class) {
            this.__construct(env, args);
        }
    }

    public Swift_FileSpool(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.path = path;
        if (!function_file_exists.f.env(env).call(this.path).getBool()) {
            if (!NamespaceGlobal.mkdir.env(env).call(this.path, 511, true).getBool()) {
                throw ZVal.getException(
                        env,
                        new Swift_IoException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Unable to create path \"%s\".", this.path)
                                        .value()));
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object isStarted(RuntimeEnv env, Object... args) {
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object start(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    public Object stop(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "limit")
    public Object setRetryLimit(RuntimeEnv env, Object... args) {
        Object limit = assignParameter(args, 0, false);
        this.retryLimit = limit;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "Swift_Mime_SimpleMessage")
    public Object queueMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object ser = null;
        Object fileName = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object fp = null;
        ser = function_serialize.f.env(env).call(message).value();
        fileName = toStringR(this.path, env) + "/" + toStringR(this.getRandomString(env, 10), env);
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', this.retryLimit);
                i.setObject(ZVal.increment(i.getObject()))) {
            fp =
                    function_fopen
                            .f
                            .env(env)
                            .call(toStringR(fileName, env) + ".message", "xb")
                            .value();
            if (ZVal.strictNotEqualityCheck(false, "!==", fp)) {
                if (ZVal.strictEqualityCheck(
                        false, "===", function_fwrite.f.env(env).call(fp, ser).value())) {
                    return ZVal.assign(false);
                }

                return ZVal.assign(function_fclose.f.env(env).call(fp).value());

            } else {
                fileName = toStringR(fileName, env) + toStringR(this.getRandomString(env, 1), env);
            }
        }

        throw ZVal.getException(
                env,
                new Swift_IoException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Unable to create a file for enqueuing Message in \"%s\".",
                                        this.path)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "timeout",
        defaultValue = "900",
        defaultValueType = "number"
    )
    public Object recover(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, true);
        if (null == timeout) {
            timeout = 900;
        }
        Object lockedtime = null;
        Object file = null;
        for (ZPair zpairResult1508 :
                ZVal.getIterable(new DirectoryIterator(env, this.path), env, true)) {
            file = ZVal.assign(zpairResult1508.getValue());
            file = env.callMethod(file, "getRealPath", Swift_FileSpool.class);
            if (ZVal.equalityCheck(
                    ".message.sending", function_substr.f.env(env).call(file, -16).value())) {
                lockedtime = NamespaceGlobal.filectime.env(env).call(file).value();
                if (ZVal.isGreaterThan(
                        ZVal.subtract(NamespaceGlobal.time.env(env).call().value(), lockedtime),
                        '>',
                        timeout)) {
                    NamespaceGlobal.rename
                            .env(env)
                            .call(file, function_substr.f.env(env).call(file, 0, -8).value());
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "transport", typeHint = "Swift_Transport")
    @ConvertedParameter(
        index = 1,
        name = "failedRecipients",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object flushQueue(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object transport = assignParameter(args, 0, false);
        ReferenceContainer failedRecipients =
                assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == failedRecipients.getObject()) {
            failedRecipients.setObject(ZVal.getNull());
        }
        Object directoryIterator = null;
        Object file = null;
        Object count = null;
        Object time = null;
        Object message = null;
        directoryIterator = new DirectoryIterator(env, this.path);
        if (!ZVal.isTrue(env.callMethod(transport, "isStarted", Swift_FileSpool.class))) {
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1509 : ZVal.getIterable(directoryIterator, env, true)) {
                file = ZVal.assign(zpairResult1509.getValue());
                if (ZVal.equalityCheck(
                        ".message",
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        env.callMethod(file, "getRealPath", Swift_FileSpool.class),
                                        -8)
                                .value())) {
                    env.callMethod(transport, "start", Swift_FileSpool.class);
                    break;
                }
            }
        }

        failedRecipients.setObject(ZVal.assign(rToArrayCast(failedRecipients.getObject())));
        count = 0;
        time = NamespaceGlobal.time.env(env).call().value();
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1510 : ZVal.getIterable(directoryIterator, env, true)) {
            file = ZVal.assign(zpairResult1510.getValue());
            file = env.callMethod(file, "getRealPath", Swift_FileSpool.class);
            if (ZVal.notEqualityCheck(
                    ".message", function_substr.f.env(env).call(file, -8).value())) {
                continue;
            }

            if (NamespaceGlobal.rename
                    .env(env)
                    .call(file, toStringR(file, env) + ".sending")
                    .getBool()) {
                message =
                        function_unserialize
                                .f
                                .env(env)
                                .call(
                                        function_file_get_contents
                                                .f
                                                .env(env)
                                                .call(toStringR(file, env) + ".sending")
                                                .value())
                                .value();
                count =
                        ZAssignment.add(
                                "+=",
                                count,
                                env.callMethod(
                                        transport,
                                        new RuntimeArgsWithReferences().add(1, failedRecipients),
                                        "send",
                                        Swift_FileSpool.class,
                                        message,
                                        failedRecipients.getObject()));
                NamespaceGlobal.unlink.env(env).call(toStringR(file, env) + ".sending");

            } else {
                continue;
            }

            if (ZVal.toBool(env.callMethod(this, "getMessageLimit", Swift_FileSpool.class))
                    && ZVal.toBool(
                            ZVal.isGreaterThanOrEqualTo(
                                    count,
                                    ">=",
                                    env.callMethod(
                                            this, "getMessageLimit", Swift_FileSpool.class)))) {
                break;
            }

            if (ZVal.toBool(env.callMethod(this, "getTimeLimit", Swift_FileSpool.class))
                    && ZVal.toBool(
                            ZVal.isGreaterThanOrEqualTo(
                                    ZVal.subtract(
                                            NamespaceGlobal.time.env(env).call().value(), time),
                                    ">=",
                                    env.callMethod(this, "getTimeLimit", Swift_FileSpool.class)))) {
                break;
            }
        }

        return ZVal.assign(count);
    }

    public Object flushQueue(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    protected Object getRandomString(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object ret = null;
        Object strlen = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer base = new BasicReferenceContainer(null);
        base.setObject("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_-");
        ret = "";
        strlen = function_strlen.f.env(env).call(base.getObject()).value();
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', count);
                i.setObject(ZVal.increment(i.getObject()))) {
            ret =
                    toStringR(ret, env)
                            + toStringR(
                                    base.arrayGet(
                                            env,
                                            random_int
                                                    .f
                                                    .env(env)
                                                    .call(0, ZVal.subtract(strlen, 1))
                                                    .value()),
                                    env);
        }

        return ZVal.assign(ret);
    }

    public static final Object CONST_class = "Swift_FileSpool";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends Swift_ConfigurableSpool.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_FileSpool")
                    .setLookup(
                            Swift_FileSpool.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("message_limit", "path", "retryLimit", "time_limit")
                    .setFilename("vendor/swiftmailer/swiftmailer/lib/classes/Swift/FileSpool.php")
                    .addInterface("Swift_Spool")
                    .addExtendsClass("Swift_ConfigurableSpool")
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
