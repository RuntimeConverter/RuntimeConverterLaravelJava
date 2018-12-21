package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Queue/Console/RetryCommand.php

*/

public class RetryCommand extends Command {

    public RetryCommand(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.signature =
                "queue:retry {id* : The ID of the failed job or \"all\" to retry all jobs.}";
        this.description = "Retry a failed queue job";
        if (this.getClass() == RetryCommand.class) {
            this.__construct(env, args);
        }
    }

    public RetryCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object handle(RuntimeEnv env, Object... args) {
        Object id = null;
        Object job = null;
        for (ZPair zpairResult507 : ZVal.getIterable(this.getJobIds(env), env, true)) {
            id = ZVal.assign(zpairResult507.getValue());
            job =
                    env.callMethod(
                            new ReferenceClassProperty(this, "laravel", env)
                                    .arrayGet(env, "queue.failer"),
                            "find",
                            RetryCommand.class,
                            id);
            if (function_is_null.f.env(env).call(job).getBool()) {
                env.callMethod(
                        this,
                        "error",
                        RetryCommand.class,
                        "Unable to find failed job with ID [" + toStringR(id, env) + "].");

            } else {
                this.retryJob(env, job);
                env.callMethod(
                        this,
                        "info",
                        RetryCommand.class,
                        "The failed job ["
                                + toStringR(id, env)
                                + "] has been pushed back onto the queue!");
                env.callMethod(
                        new ReferenceClassProperty(this, "laravel", env)
                                .arrayGet(env, "queue.failer"),
                        "forget",
                        RetryCommand.class,
                        id);
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object getJobIds(RuntimeEnv env, Object... args) {
        ReferenceContainer ids = new BasicReferenceContainer(null);
        ids.setObject(
                ZVal.assign(
                        rToArrayCast(env.callMethod(this, "argument", RetryCommand.class, "id"))));
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_count.f.env(env).call(ids.getObject()).value(), "===", 1))
                && ZVal.toBool(ZVal.strictEqualityCheck(ids.arrayGet(env, 0), "===", "all"))) {
            ids.setObject(
                    Arr.runtimeStaticObject.pluck(
                            env,
                            env.callMethod(
                                    new ReferenceClassProperty(this, "laravel", env)
                                            .arrayGet(env, "queue.failer"),
                                    "all",
                                    RetryCommand.class),
                            "id"));
        }

        return ZVal.assign(ids.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    protected Object retryJob(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        env.callMethod(
                env.callMethod(
                        new ReferenceClassProperty(this, "laravel", env).arrayGet(env, "queue"),
                        "connection",
                        RetryCommand.class,
                        toObjectR(job).accessProp(this, env).name("connection").value()),
                "pushRaw",
                RetryCommand.class,
                this.resetAttempts(
                        env, toObjectR(job).accessProp(this, env).name("payload").value()),
                toObjectR(job).accessProp(this, env).name("queue").value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    protected Object resetAttempts(RuntimeEnv env, Object... args) {
        ReferenceContainer payload = new BasicReferenceContainer(assignParameter(args, 0, false));
        payload.setObject(
                NamespaceGlobal.json_decode.env(env).call(payload.getObject(), true).value());
        if (arrayActionR(ArrayAction.ISSET, payload, env, "attempts")) {
            payload.arrayAccess(env, "attempts").set(0);
        }

        return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(payload.getObject()).value());
    }

    public static final Object CONST_class = "Illuminate\\Queue\\Console\\RetryCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Queue\\Console\\RetryCommand")
                    .setLookup(
                            RetryCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Queue/Console/RetryCommand.php")
                    .addExtendsClass("Illuminate\\Console\\Command")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
