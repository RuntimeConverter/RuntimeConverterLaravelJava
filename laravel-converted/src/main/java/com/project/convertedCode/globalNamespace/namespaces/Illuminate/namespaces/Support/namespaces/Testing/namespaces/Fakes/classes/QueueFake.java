package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Testing.namespaces.Fakes.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.Queue;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.QueueManager;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/QueueFake.php

*/

public class QueueFake extends QueueManager implements Queue {

    public Object jobs = ZVal.newArray();

    public QueueFake(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == QueueFake.class) {
            this.__construct(env, args);
        }
    }

    public QueueFake(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertPushed(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (function_is_numeric.f.env(env).call(callback).getBool()) {
            return ZVal.assign(this.assertPushedTimes(env, job, callback));
        }

        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.isGreaterThan(
                        env.callMethod(this.pushed(env, job, callback), "count", QueueFake.class),
                        '>',
                        0),
                "The expected [" + toStringR(job, env) + "] job was not pushed.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "times", defaultValue = "1", defaultValueType = "number")
    protected Object assertPushedTimes(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object times = assignParameter(args, 1, true);
        if (null == times) {
            times = 1;
        }
        Object count = null;
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        count = env.callMethod(this.pushed(env, job), "count", QueueFake.class),
                        "===",
                        times),
                "The expected ["
                        + toStringR(job, env)
                        + "] job was pushed "
                        + toStringR(count, env)
                        + " times instead of "
                        + toStringR(times, env)
                        + " times.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(
        index = 2,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertPushedOn(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/QueueFake.php");
        Object queue = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        return ZVal.assign(
                this.assertPushed(
                        env,
                        job,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "job")
                            @ConvertedParameter(index = 1, name = "pushedQueue")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object job = assignParameter(args, 0, false);
                                Object pushedQueue = assignParameter(args, 1, false);
                                Object callback = null;
                                Object queue = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                queue = this.contextReferences.getCapturedValue("queue");
                                if (ZVal.strictNotEqualityCheck(pushedQueue, "!==", queue)) {
                                    return ZVal.assign(false);
                                }

                                return ZVal.assign(
                                        ZVal.isTrue(callback)
                                                ? env.callFunctionDynamic(
                                                                callback,
                                                                new RuntimeArgsWithReferences(),
                                                                PackedVaradicArgs.unpack(
                                                                        new PackedVaradicArgs(
                                                                                function_func_get_args
                                                                                        .f
                                                                                        .env(env)
                                                                                        .addReferenceArgs(
                                                                                                new RuntimeArgsWithInfo(
                                                                                                        args,
                                                                                                        this))
                                                                                        .call()
                                                                                        .value())))
                                                        .value()
                                                : true);
                            }
                        }.use("callback", callback).use("queue", queue)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(
        index = 1,
        name = "expectedChain",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertPushedWithChain(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object expectedChain = assignParameter(args, 1, true);
        if (null == expectedChain) {
            expectedChain = ZVal.newArray();
        }
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(this.pushed(env, job, callback), "isNotEmpty", QueueFake.class),
                "The expected [" + toStringR(job, env) + "] job was not pushed.");
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(
                        collect.f.env(env).call(expectedChain).value(),
                        "isNotEmpty",
                        QueueFake.class),
                "The expected chain can not be empty.");
        ZVal.ternaryExpression(
                ZVal.isTrue(this.isChainOfObjects(env, expectedChain))
                        ? this.assertPushedWithChainOfObjects(env, job, expectedChain, callback)
                        : this.assertPushedWithChainOfClasses(env, job, expectedChain, callback));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "expectedChain")
    @ConvertedParameter(index = 2, name = "callback")
    protected Object assertPushedWithChainOfObjects(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/QueueFake.php");
        Object job = assignParameter(args, 0, false);
        Object expectedChain = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        Object chain = null;
        chain =
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(expectedChain).value(),
                                "map",
                                QueueFake.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support\\Testing\\Fakes",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "job")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object job = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_serialize.f.env(env).call(job).value());
                                    }
                                }),
                        "all",
                        QueueFake.class);
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(
                        env.callMethod(
                                this.pushed(env, job, callback),
                                "filter",
                                QueueFake.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support\\Testing\\Fakes",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "job")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object job = assignParameter(args, 0, false);
                                        Object chain = null;
                                        chain = this.contextReferences.getCapturedValue("chain");
                                        return ZVal.assign(
                                                ZVal.equalityCheck(
                                                        toObjectR(job)
                                                                .accessProp(this, env)
                                                                .name("chained")
                                                                .value(),
                                                        chain));
                                    }
                                }.use("chain", chain)),
                        "isNotEmpty",
                        QueueFake.class),
                "The expected chain was not pushed.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "expectedChain")
    @ConvertedParameter(index = 2, name = "callback")
    protected Object assertPushedWithChainOfClasses(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/QueueFake.php");
        Object job = assignParameter(args, 0, false);
        Object expectedChain = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, false);
        Object matching = null;
        matching =
                env.callMethod(
                        env.callMethod(
                                toObjectR(this.pushed(env, job, callback))
                                        .accessProp(this, env)
                                        .name("map")
                                        .getObject()
                                        .accessProp(this, env)
                                        .name("chained")
                                        .value(),
                                "map",
                                QueueFake.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support\\Testing\\Fakes",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "chain")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ContextConstants runtimeConverterFunctionClassConstants =
                                                new ContextConstants()
                                                        .setDir(
                                                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                                                        .setFile(
                                                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/QueueFake.php");
                                        Object chain = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                env.callMethod(
                                                        collect.f.env(env).call(chain).value(),
                                                        "map",
                                                        QueueFake.class,
                                                        new Closure(
                                                                env,
                                                                runtimeConverterFunctionClassConstants,
                                                                "Illuminate\\Support\\Testing\\Fakes",
                                                                this) {
                                                            @Override
                                                            @ConvertedMethod
                                                            @ConvertedParameter(
                                                                index = 0,
                                                                name = "job"
                                                            )
                                                            public Object run(
                                                                    RuntimeEnv env,
                                                                    Object thisvar,
                                                                    PassByReferenceArgs
                                                                            runtimePassByReferenceArgs,
                                                                    Object... args) {
                                                                Object job =
                                                                        assignParameter(
                                                                                args, 0, false);
                                                                return ZVal.assign(
                                                                        function_get_class
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        function_unserialize
                                                                                                .f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        job)
                                                                                                .value())
                                                                                .value());
                                                            }
                                                        }));
                                    }
                                }),
                        "filter",
                        QueueFake.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Support\\Testing\\Fakes",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "chain")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object chain = assignParameter(args, 0, false);
                                Object expectedChain = null;
                                expectedChain =
                                        this.contextReferences.getCapturedValue("expectedChain");
                                return ZVal.assign(
                                        ZVal.strictEqualityCheck(
                                                env.callMethod(chain, "all", QueueFake.class),
                                                "===",
                                                expectedChain));
                            }
                        }.use("expectedChain", expectedChain));
        Assert.runtimeStaticObject.assertTrue(
                env,
                env.callMethod(matching, "isNotEmpty", QueueFake.class),
                "The expected chain was not pushed.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "chain")
    protected Object isChainOfObjects(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/QueueFake.php");
        Object chain = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.equalityCheck(
                        env.callMethod(
                                collect.f.env(env).call(chain).value(), "count", QueueFake.class),
                        env.callMethod(
                                env.callMethod(
                                        collect.f.env(env).call(chain).value(),
                                        "filter",
                                        QueueFake.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Support\\Testing\\Fakes",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "job")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object job = assignParameter(args, 0, false);
                                                return ZVal.assign(
                                                        function_is_object
                                                                .f
                                                                .env(env)
                                                                .call(job)
                                                                .value());
                                            }
                                        }),
                                "count",
                                QueueFake.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object assertNotPushed(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Assert.runtimeStaticObject.assertTrue(
                env,
                ZVal.strictEqualityCheck(
                        env.callMethod(this.pushed(env, job, callback), "count", QueueFake.class),
                        "===",
                        0),
                "The unexpected [" + toStringR(job, env) + "] job was pushed.");
        return null;
    }

    @ConvertedMethod
    public Object assertNothingPushed(RuntimeEnv env, Object... args) {
        Assert.runtimeStaticObject.assertEmpty(env, this.jobs, "Jobs were pushed unexpectedly.");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pushed(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/QueueFake.php");
        Object job = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.hasPushed(env, job))) {
            return ZVal.assign(collect.f.env(env).call().value());
        }

        callback =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = callback)
                                ? ternaryExpressionTemp
                                : new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support\\Testing\\Fakes",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        return ZVal.assign(true);
                                    }
                                });
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                new ReferenceClassProperty(this, "jobs", env)
                                                        .arrayGet(env, job))
                                        .value(),
                                "filter",
                                QueueFake.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Support\\Testing\\Fakes",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "data")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer data =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object callback = null;
                                        callback =
                                                this.contextReferences.getCapturedValue("callback");
                                        return ZVal.assign(
                                                env.callFunctionDynamic(
                                                                callback,
                                                                new RuntimeArgsWithReferences()
                                                                        .add(
                                                                                0,
                                                                                new ArrayDimensionReference(
                                                                                        data
                                                                                                .getObject(),
                                                                                        "job"))
                                                                        .add(
                                                                                1,
                                                                                new ArrayDimensionReference(
                                                                                        data
                                                                                                .getObject(),
                                                                                        "queue")),
                                                                data.arrayGet(env, "job"),
                                                                data.arrayGet(env, "queue"))
                                                        .value());
                                    }
                                }.use("callback", callback)),
                        "pluck",
                        QueueFake.class,
                        "job"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    public Object hasPushed(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "jobs", env),
                                        env,
                                        job))
                        && ZVal.toBool(
                                !arrayActionR(
                                        ArrayAction.EMPTY,
                                        new ReferenceClassProperty(this, "jobs", env),
                                        env,
                                        job)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object connection(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object size(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return ZVal.assign(function_count.f.env(env).call(this.jobs).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "job")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object push(RuntimeEnv env, Object... args) {
        Object job = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        new ReferenceClassProperty(this, "jobs", env)
                .arrayAppend(
                        env,
                        function_is_object.f.env(env).call(job).getBool()
                                ? function_get_class.f.env(env).call(job).value()
                                : job)
                .set(ZVal.newArray(new ZPair("job", job), new ZPair("queue", queue)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "payload")
    @ConvertedParameter(
        index = 1,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object pushRaw(RuntimeEnv env, Object... args) {
        Object payload = assignParameter(args, 0, false);
        Object queue = assignParameter(args, 1, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "delay")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "data")
    @ConvertedParameter(
        index = 3,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object later(RuntimeEnv env, Object... args) {
        Object delay = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 3, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return ZVal.assign(this.push(env, job, data, queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "job")
    @ConvertedParameter(index = 2, name = "data")
    public Object pushOn(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object job = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = "";
        }
        return ZVal.assign(this.push(env, job, data, queue));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "queue")
    @ConvertedParameter(index = 1, name = "delay")
    @ConvertedParameter(index = 2, name = "job")
    @ConvertedParameter(index = 3, name = "data")
    public Object laterOn(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, false);
        Object delay = assignParameter(args, 1, false);
        Object job = assignParameter(args, 2, false);
        Object data = assignParameter(args, 3, true);
        if (null == data) {
            data = "";
        }
        return ZVal.assign(this.push(env, job, data, queue));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pop(RuntimeEnv env, Object... args) {
        Object queue = assignParameter(args, 0, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "jobs")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(
        index = 2,
        name = "queue",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object bulk(RuntimeEnv env, Object... args) {
        Object jobs = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, true);
        if (null == data) {
            data = "";
        }
        Object queue = assignParameter(args, 2, true);
        if (null == queue) {
            queue = ZVal.getNull();
        }
        Object job = null;
        for (ZPair zpairResult593 : ZVal.getIterable(jobs, env, true)) {
            job = ZVal.assign(zpairResult593.getValue());
            this.push(env, job, data, queue);
        }

        return null;
    }

    @ConvertedMethod
    public Object getConnectionName(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setConnectionName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Illuminate\\Support\\Testing\\Fakes\\QueueFake";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends QueueManager.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\Testing\\Fakes\\QueueFake")
                    .setLookup(
                            QueueFake.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "connections", "connectors", "jobs")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/Testing/Fakes/QueueFake.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\Queue")
                    .addInterface("Illuminate\\Contracts\\Queue\\Factory")
                    .addInterface("Illuminate\\Contracts\\Queue\\Monitor")
                    .addExtendsClass("Illuminate\\Queue\\QueueManager")
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
