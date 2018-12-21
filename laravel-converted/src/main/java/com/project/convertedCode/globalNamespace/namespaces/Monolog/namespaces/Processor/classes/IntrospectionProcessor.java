package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Processor.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Processor/IntrospectionProcessor.php

*/

public class IntrospectionProcessor extends RuntimeClassBase {

    public Object level = null;

    public Object skipClassesPartials = null;

    public Object skipStackFramesCount = null;

    public Object skipFunctions = ZVal.arrayFromList("call_user_func", "call_user_func_array");

    public IntrospectionProcessor(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == IntrospectionProcessor.class) {
            this.__construct(env, args);
        }
    }

    public IntrospectionProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    @ConvertedParameter(
        index = 1,
        name = "skipClassesPartials",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "skipStackFramesCount",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object skipClassesPartials = assignParameter(args, 1, true);
        if (null == skipClassesPartials) {
            skipClassesPartials = ZVal.newArray();
        }
        Object skipStackFramesCount = assignParameter(args, 2, true);
        if (null == skipStackFramesCount) {
            skipStackFramesCount = 0;
        }
        this.level = Logger.runtimeStaticObject.toMonologLevel(env, level);
        this.skipClassesPartials =
                function_array_merge
                        .f
                        .env(env)
                        .call(ZVal.arrayFromList("Monolog\\"), skipClassesPartials)
                        .value();
        this.skipStackFramesCount = skipStackFramesCount;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object __invoke(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer trace = new BasicReferenceContainer(null);
        Object part = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        if (ZVal.isLessThan(record.arrayGet(env, "level"), '<', this.level)) {
            return ZVal.assign(record.getObject());
        }

        trace.setObject(
                NamespaceGlobal.debug_backtrace
                        .env(env)
                        .call(ZVal.isLessThan(70211, '<', 50306) ? 2 : 2)
                        .value());
        function_array_shift.f.env(env).call(trace.getObject());
        function_array_shift.f.env(env).call(trace.getObject());
        i.setObject(0);
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(
                this.isTraceClassOrSkippedFunction(env, trace.getObject(), i.getObject()))) {
            if (arrayActionR(ArrayAction.ISSET, trace, env, i.getObject(), "class")) {
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult816 : ZVal.getIterable(this.skipClassesPartials, env, true)) {
                    part = ZVal.assign(zpairResult816.getValue());
                    if (ZVal.strictNotEqualityCheck(
                            function_strpos
                                    .f
                                    .env(env)
                                    .call(trace.arrayGet(env, i.getObject(), "class"), part)
                                    .value(),
                            "!==",
                            false)) {
                        i.setObject(ZVal.increment(i.getObject()));
                        runtimeConverterContinueCount = 2;
                        runtimeConverterContinueCount--;
                        continue;
                    }
                }

            } else if (function_in_array
                    .f
                    .env(env)
                    .call(trace.arrayGet(env, i.getObject(), "function"), this.skipFunctions)
                    .getBool()) {
                i.setObject(ZVal.increment(i.getObject()));
                continue;
            }

            break;
        }

        i.setObject(ZAssignment.add("+=", i.getObject(), this.skipStackFramesCount));
        record.arrayAccess(env, "extra")
                .set(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        record.arrayGet(env, "extra"),
                                        ZVal.newArray(
                                                new ZPair(
                                                        "file",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        trace,
                                                                        env,
                                                                        ZVal.subtract(
                                                                                i.getObject(), 1),
                                                                        "file")
                                                                ? trace.arrayGet(
                                                                        env,
                                                                        ZVal.subtract(
                                                                                i.getObject(), 1),
                                                                        "file")
                                                                : ZVal.getNull()),
                                                new ZPair(
                                                        "line",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        trace,
                                                                        env,
                                                                        ZVal.subtract(
                                                                                i.getObject(), 1),
                                                                        "line")
                                                                ? trace.arrayGet(
                                                                        env,
                                                                        ZVal.subtract(
                                                                                i.getObject(), 1),
                                                                        "line")
                                                                : ZVal.getNull()),
                                                new ZPair(
                                                        "class",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        trace,
                                                                        env,
                                                                        i.getObject(),
                                                                        "class")
                                                                ? trace.arrayGet(
                                                                        env, i.getObject(), "class")
                                                                : ZVal.getNull()),
                                                new ZPair(
                                                        "function",
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        trace,
                                                                        env,
                                                                        i.getObject(),
                                                                        "function")
                                                                ? trace.arrayGet(
                                                                        env,
                                                                        i.getObject(),
                                                                        "function")
                                                                : ZVal.getNull())))
                                .value());
        return ZVal.assign(record.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "trace", typeHint = "array")
    @ConvertedParameter(index = 1, name = "index")
    private Object isTraceClassOrSkippedFunction(RuntimeEnv env, Object... args) {
        ReferenceContainer trace = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object index = assignParameter(args, 1, false);
        if (!arrayActionR(ArrayAction.ISSET, trace, env, index)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, trace, env, index, "class"))
                        || ZVal.toBool(
                                function_in_array
                                        .f
                                        .env(env)
                                        .call(
                                                trace.arrayGet(env, index, "function"),
                                                this.skipFunctions)
                                        .value()));
    }

    public static final Object CONST_class = "Monolog\\Processor\\IntrospectionProcessor";

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
                    .setName("Monolog\\Processor\\IntrospectionProcessor")
                    .setLookup(
                            IntrospectionProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "level", "skipClassesPartials", "skipFunctions", "skipStackFramesCount")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Processor/IntrospectionProcessor.php")
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
