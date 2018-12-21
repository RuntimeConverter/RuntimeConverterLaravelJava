package com.project.convertedCode.includes.config;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.___env;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 config/queue.php

*/

public class file_queue_php implements RuntimeIncludable {

    public static final file_queue_php instance = new file_queue_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope210 scope = new Scope210();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope210 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair(
                                        "default",
                                        ___env.f.env(env).call("QUEUE_DRIVER", "sync").value()),
                                new ZPair(
                                        "connections",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "sync",
                                                        ZVal.newArray(new ZPair("driver", "sync"))),
                                                new ZPair(
                                                        "database",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "database"),
                                                                new ZPair("table", "jobs"),
                                                                new ZPair("queue", "default"),
                                                                new ZPair("retry_after", 90))),
                                                new ZPair(
                                                        "beanstalkd",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "beanstalkd"),
                                                                new ZPair("host", "localhost"),
                                                                new ZPair("queue", "default"),
                                                                new ZPair("retry_after", 90))),
                                                new ZPair(
                                                        "sqs",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "sqs"),
                                                                new ZPair(
                                                                        "key",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "SQS_KEY",
                                                                                        "your-public-key")
                                                                                .value()),
                                                                new ZPair(
                                                                        "secret",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "SQS_SECRET",
                                                                                        "your-secret-key")
                                                                                .value()),
                                                                new ZPair(
                                                                        "prefix",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "SQS_PREFIX",
                                                                                        "https://sqs.us-east-1.amazonaws.com/your-account-id")
                                                                                .value()),
                                                                new ZPair(
                                                                        "queue",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "SQS_QUEUE",
                                                                                        "your-queue-name")
                                                                                .value()),
                                                                new ZPair(
                                                                        "region",
                                                                        ___env.f
                                                                                .env(env)
                                                                                .call(
                                                                                        "SQS_REGION",
                                                                                        "us-east-1")
                                                                                .value()))),
                                                new ZPair(
                                                        "redis",
                                                        ZVal.newArray(
                                                                new ZPair("driver", "redis"),
                                                                new ZPair("connection", "default"),
                                                                new ZPair("queue", "default"),
                                                                new ZPair("retry_after", 90),
                                                                new ZPair(
                                                                        "block_for",
                                                                        ZVal.getNull()))))),
                                new ZPair(
                                        "failed",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "database",
                                                        ___env.f
                                                                .env(env)
                                                                .call("DB_CONNECTION", "mysql")
                                                                .value()),
                                                new ZPair("table", "failed_jobs"))))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants().setDir("/config").setFile("/config/queue.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope210 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
