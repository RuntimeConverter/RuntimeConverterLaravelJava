package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractProcessingHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/MailHandler.php

*/

public abstract class MailHandler extends AbstractProcessingHandler {

    public MailHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MailHandler.class) {
            this.__construct(env, args);
        }
    }

    public MailHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object handleBatch(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object records = assignParameter(args, 0, false);
        ReferenceContainer record = new BasicReferenceContainer(null);
        ReferenceContainer messages = new BasicReferenceContainer(null);
        messages.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult789 : ZVal.getIterable(records, env, true)) {
            record.setObject(ZVal.assign(zpairResult789.getValue()));
            if (ZVal.isLessThan(
                    record.arrayGet(env, "level"),
                    '<',
                    toObjectR(this).accessProp(this, env).name("level").value())) {
                continue;
            }

            messages.arrayAppend(env)
                    .set(
                            env.callMethod(
                                    this, "processRecord", MailHandler.class, record.getObject()));
        }

        if (!ZVal.isEmpty(messages.getObject())) {
            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(1, messages),
                    "send",
                    MailHandler.class,
                    toStringR(
                            env.callMethod(
                                    env.callMethod(this, "getFormatter", MailHandler.class),
                                    "formatBatch",
                                    MailHandler.class,
                                    messages.getObject()),
                            env),
                    messages.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    protected Object write(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                this,
                new RuntimeArgsWithReferences(),
                "send",
                MailHandler.class,
                toStringR(record.arrayGet(env, "formatted"), env),
                ZVal.newArray(new ZPair(0, record.getObject())));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    protected Object getHighestRecord(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        ReferenceContainer highestRecord = new BasicReferenceContainer(null);
        ReferenceContainer record = new BasicReferenceContainer(null);
        highestRecord.setObject(ZVal.getNull());
        for (ZPair zpairResult790 : ZVal.getIterable(records, env, true)) {
            record.setObject(ZVal.assign(zpairResult790.getValue()));
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    highestRecord.getObject(), "===", ZVal.getNull()))
                    || ZVal.toBool(
                            ZVal.isLessThan(
                                    highestRecord.arrayGet(env, "level"),
                                    '<',
                                    record.arrayGet(env, "level")))) {
                highestRecord.setObject(ZVal.assign(record.getObject()));
            }
        }

        return ZVal.assign(highestRecord.getObject());
    }

    public static final Object CONST_class = "Monolog\\Handler\\MailHandler";

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
                    .setName("Monolog\\Handler\\MailHandler")
                    .setLookup(
                            MailHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "level", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/MailHandler.php")
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
