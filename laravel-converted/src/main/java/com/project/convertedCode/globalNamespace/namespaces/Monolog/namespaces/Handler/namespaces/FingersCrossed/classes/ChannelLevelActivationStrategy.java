package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.FingersCrossed.classes;

import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.namespaces.FingersCrossed.classes.ActivationStrategyInterface;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/FingersCrossed/ChannelLevelActivationStrategy.php

*/

public class ChannelLevelActivationStrategy extends RuntimeClassBase
        implements ActivationStrategyInterface {

    public Object defaultActionLevel = null;

    public Object channelToActionLevel = null;

    public ChannelLevelActivationStrategy(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ChannelLevelActivationStrategy.class) {
            this.__construct(env, args);
        }
    }

    public ChannelLevelActivationStrategy(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaultActionLevel")
    @ConvertedParameter(
        index = 1,
        name = "channelToActionLevel",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object defaultActionLevel = assignParameter(args, 0, false);
        Object channelToActionLevel = assignParameter(args, 1, true);
        if (null == channelToActionLevel) {
            channelToActionLevel = ZVal.newArray();
        }
        this.defaultActionLevel =
                Logger.runtimeStaticObject.toMonologLevel(env, defaultActionLevel);
        this.channelToActionLevel =
                function_array_map
                        .f
                        .env(env)
                        .call("Monolog\\Logger::toMonologLevel", channelToActionLevel)
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object isHandlerActivated(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "channelToActionLevel", env),
                env,
                record.arrayGet(env, "channel"))) {
            return ZVal.assign(
                    ZVal.isGreaterThanOrEqualTo(
                            record.arrayGet(env, "level"),
                            ">=",
                            new ReferenceClassProperty(this, "channelToActionLevel", env)
                                    .arrayGet(env, record.arrayGet(env, "channel"))));
        }

        return ZVal.assign(
                ZVal.isGreaterThanOrEqualTo(
                        record.arrayGet(env, "level"), ">=", this.defaultActionLevel));
    }

    public static final Object CONST_class =
            "Monolog\\Handler\\FingersCrossed\\ChannelLevelActivationStrategy";

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
                    .setName("Monolog\\Handler\\FingersCrossed\\ChannelLevelActivationStrategy")
                    .setLookup(
                            ChannelLevelActivationStrategy.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("channelToActionLevel", "defaultActionLevel")
                    .setFilename(
                            "vendor/monolog/monolog/src/Monolog/Handler/FingersCrossed/ChannelLevelActivationStrategy.php")
                    .addInterface("Monolog\\Handler\\FingersCrossed\\ActivationStrategyInterface")
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
