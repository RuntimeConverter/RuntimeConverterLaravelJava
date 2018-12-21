package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/TestHandler.php

*/

public class TestHandler extends AbstractProcessingHandler {

    public Object records = ZVal.newArray();

    public Object recordsByLevel = ZVal.newArray();

    public TestHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TestHandler.class) {
            this.__construct(env, args);
        }
    }

    public TestHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getRecords(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.records);
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        this.records = ZVal.newArray();
        this.recordsByLevel = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    public Object hasRecords(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "recordsByLevel", env),
                        env,
                        level));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record")
    @ConvertedParameter(index = 1, name = "level")
    public Object hasRecord(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Handler/TestHandler.php");
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object level = assignParameter(args, 1, false);
        if (function_is_array.f.env(env).call(record.getObject()).getBool()) {
            record.setObject(ZVal.assign(record.arrayGet(env, "message")));
        }

        return ZVal.assign(
                this.hasRecordThatPasses(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Monolog\\Handler",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "rec")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer rec =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object record = null;
                                record = this.contextReferences.getCapturedValue("record");
                                return ZVal.assign(
                                        ZVal.strictEqualityCheck(
                                                rec.arrayGet(env, "message"), "===", record));
                            }
                        }.use("record", record),
                        level));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "level")
    public Object hasRecordThatContains(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Handler/TestHandler.php");
        Object message = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, false);
        return ZVal.assign(
                this.hasRecordThatPasses(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Monolog\\Handler",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "rec")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer rec =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object message = null;
                                message = this.contextReferences.getCapturedValue("message");
                                return ZVal.assign(
                                        ZVal.strictNotEqualityCheck(
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(rec.arrayGet(env, "message"), message)
                                                        .value(),
                                                "!==",
                                                false));
                            }
                        }.use("message", message),
                        level));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "regex")
    @ConvertedParameter(index = 1, name = "level")
    public Object hasRecordThatMatches(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                        .setFile("/vendor/monolog/monolog/src/Monolog/Handler/TestHandler.php");
        Object regex = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, false);
        return ZVal.assign(
                this.hasRecordThatPasses(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Monolog\\Handler",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "rec")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer rec =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object regex = null;
                                regex = this.contextReferences.getCapturedValue("regex");
                                return ZVal.assign(
                                        ZVal.isGreaterThan(
                                                function_preg_match
                                                        .f
                                                        .env(env)
                                                        .call(regex, rec.arrayGet(env, "message"))
                                                        .value(),
                                                '>',
                                                0));
                            }
                        }.use("regex", regex),
                        level));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "predicate")
    @ConvertedParameter(index = 1, name = "level")
    public Object hasRecordThatPasses(RuntimeEnv env, Object... args) {
        Object predicate = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, false);
        Object rec = null;
        Object i = null;
        if (!function_is_callable.f.env(env).call(predicate).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Expected a callable for hasRecordThatSucceeds"));
        }

        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "recordsByLevel", env),
                env,
                level)) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult809 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "recordsByLevel", env)
                                .arrayGet(env, level),
                        env,
                        false)) {
            i = ZVal.assign(zpairResult809.getKey());
            rec = ZVal.assign(zpairResult809.getValue());
            if (function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(predicate, rec, i)
                    .getBool()) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        new ReferenceClassProperty(this, "recordsByLevel", env)
                .arrayAppend(env, record.arrayGet(env, "level"))
                .set(record.getObject());
        new ReferenceClassProperty(this, "records", env).arrayAppend(env).set(record.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "args")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        ReferenceContainer ___args = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object level = null;
        Object genericMethod = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.isGreaterThan(
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                "/(.*)(Debug|Info|Notice|Warning|Error|Critical|Alert|Emergency)(.*)/",
                                method,
                                matches.getObject())
                        .value(),
                '>',
                0)) {
            genericMethod =
                    toStringR(matches.arrayGet(env, 1), env)
                            + toStringR(
                                    ZVal.strictNotEqualityCheck(
                                                    "Records", "!==", matches.arrayGet(env, 3))
                                            ? "Record"
                                            : "",
                                    env)
                            + toStringR(matches.arrayGet(env, 3), env);
            level =
                    function_constant
                            .f
                            .env(env)
                            .call(
                                    "Monolog\\Logger::"
                                            + toStringR(
                                                    NamespaceGlobal.strtoupper
                                                            .env(env)
                                                            .call(matches.arrayGet(env, 2))
                                                            .value(),
                                                    env))
                            .value();
            if (function_method_exists.f.env(env).call(this, genericMethod).getBool()) {
                ___args.arrayAppend(env).set(level);
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        ZVal.newArray(
                                                new ZPair(0, this), new ZPair(1, genericMethod)),
                                        ___args.getObject())
                                .value());
            }
        }

        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env,
                        "Call to undefined method "
                                + toStringR(function_get_class.f.env(env).call(this).value(), env)
                                + "::"
                                + toStringR(method, env)
                                + "()"));
    }

    public static final Object CONST_class = "Monolog\\Handler\\TestHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractProcessingHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\TestHandler")
                    .setLookup(
                            TestHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bubble",
                            "formatter",
                            "level",
                            "processors",
                            "records",
                            "recordsByLevel")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/TestHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractProcessingHandler")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
