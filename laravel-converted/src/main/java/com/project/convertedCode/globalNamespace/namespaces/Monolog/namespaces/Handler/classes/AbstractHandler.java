package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.HandlerInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Formatter.classes.LineFormatter;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/AbstractHandler.php

*/

public abstract class AbstractHandler extends RuntimeClassBase implements HandlerInterface {

    public Object level = Logger.CONST_DEBUG;

    public Object bubble = true;

    public Object formatter = null;

    public Object processors = ZVal.newArray();

    public AbstractHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractHandler.class) {
            this.__construct(env, args);
        }
    }

    public AbstractHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(
        index = 1,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 1, true);
        if (null == bubble) {
            bubble = true;
        }
        this.setLevel(env, level);
        this.bubble = bubble;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object isHandling(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.isGreaterThanOrEqualTo(record.arrayGet(env, "level"), ">=", this.level));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        Object record = null;
        for (ZPair zpairResult762 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult762.getValue());
            env.callMethod(this, "handle", AbstractHandler.class, record);
        }

        return null;
    }

    @ConvertedMethod
    public Object close(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object pushProcessor(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        if (!function_is_callable.f.env(env).call(callback).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Processors must be valid callables (callback or object with an __invoke method), "
                                    + toStringR(
                                            NamespaceGlobal.var_export
                                                    .env(env)
                                                    .call(callback, true)
                                                    .value(),
                                            env)
                                    + " given"));
        }

        function_array_unshift.f.env(env).call(this.processors, callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object popProcessor(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.processors)) {
            throw ZVal.getException(
                    env,
                    new LogicException(env, "You tried to pop from an empty processor stack."));
        }

        return ZVal.assign(function_array_shift.f.env(env).call(this.processors).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Monolog\\Formatter\\FormatterInterface"
    )
    public Object setFormatter(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        this.formatter = formatter;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFormatter(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.formatter)) {
            this.formatter = this.getDefaultFormatter(env);
        }

        return ZVal.assign(this.formatter);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object setLevel(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        this.level = Logger.runtimeStaticObject.toMonologLevel(env, level);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getLevel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.level);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bubble")
    public Object setBubble(RuntimeEnv env, Object... args) {
        Object bubble = assignParameter(args, 0, false);
        this.bubble = bubble;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getBubble(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bubble);
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            this.close(env);
        } catch (ConvertedException convertedException89) {
            if (convertedException89.instanceOf(PHPException.class, "Exception")) {
                e = convertedException89.getObject();
            } else if (convertedException89.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException89.getObject();
            } else {
                throw convertedException89;
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object getDefaultFormatter(RuntimeEnv env, Object... args) {
        return ZVal.assign(new LineFormatter(env));
    }

    public static final Object CONST_class = "Monolog\\Handler\\AbstractHandler";

    @ConvertedMethod()
    public abstract Object handle(RuntimeEnv env, Object... args);

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
                    .setName("Monolog\\Handler\\AbstractHandler")
                    .setLookup(
                            AbstractHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "level", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/AbstractHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
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
