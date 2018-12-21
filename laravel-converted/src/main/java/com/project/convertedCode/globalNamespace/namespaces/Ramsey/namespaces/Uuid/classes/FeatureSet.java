package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.TimeGeneratorFactory;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.namespaces.Number.classes.DegradedNumberConverter;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.namespaces.Node.classes.SystemNodeProvider;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.namespaces.Node.classes.FallbackNodeProvider;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Builder.classes.DegradedUuidBuilder;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Builder.classes.DefaultUuidBuilder;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.namespaces.Number.classes.BigNumberConverter;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.namespaces.Time.classes.PhpTimeConverter;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.RandomGeneratorFactory;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.namespaces.Time.classes.SystemTimeProvider;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.PeclUuidTimeGenerator;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes.GuidStringCodec;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Provider.namespaces.Node.classes.RandomNodeProvider;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Codec.classes.StringCodec;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.namespaces.Time.classes.BigNumberTimeConverter;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.namespaces.Time.classes.DegradedTimeConverter;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/FeatureSet.php

*/

public class FeatureSet extends RuntimeClassBase {

    public Object disableBigNumber = false;

    public Object disable64Bit = false;

    public Object ignoreSystemNode = false;

    public Object enablePecl = false;

    public Object builder = null;

    public Object codec = null;

    public Object nodeProvider = null;

    public Object numberConverter = null;

    public Object randomGenerator = null;

    public Object timeGenerator = null;

    public FeatureSet(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FeatureSet.class) {
            this.__construct(env, args);
        }
    }

    public FeatureSet(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "useGuids",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "force32Bit",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "forceNoBigNumber",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "ignoreSystemNode",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "enablePecl",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object useGuids = assignParameter(args, 0, true);
        if (null == useGuids) {
            useGuids = false;
        }
        Object force32Bit = assignParameter(args, 1, true);
        if (null == force32Bit) {
            force32Bit = false;
        }
        Object forceNoBigNumber = assignParameter(args, 2, true);
        if (null == forceNoBigNumber) {
            forceNoBigNumber = false;
        }
        Object ignoreSystemNode = assignParameter(args, 3, true);
        if (null == ignoreSystemNode) {
            ignoreSystemNode = false;
        }
        Object enablePecl = assignParameter(args, 4, true);
        if (null == enablePecl) {
            enablePecl = false;
        }
        this.disableBigNumber = forceNoBigNumber;
        this.disable64Bit = force32Bit;
        this.ignoreSystemNode = ignoreSystemNode;
        this.enablePecl = enablePecl;
        this.numberConverter = this.buildNumberConverter(env);
        this.builder = this.buildUuidBuilder(env);
        this.codec = this.buildCodec(env, useGuids);
        this.nodeProvider = this.buildNodeProvider(env);
        this.randomGenerator = this.buildRandomGenerator(env);
        this.setTimeProvider(env, new SystemTimeProvider(env));
        return null;
    }

    @ConvertedMethod
    public Object getBuilder(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.builder);
    }

    @ConvertedMethod
    public Object getCodec(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.codec);
    }

    @ConvertedMethod
    public Object getNodeProvider(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.nodeProvider);
    }

    @ConvertedMethod
    public Object getNumberConverter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.numberConverter);
    }

    @ConvertedMethod
    public Object getRandomGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.randomGenerator);
    }

    @ConvertedMethod
    public Object getTimeGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.timeGenerator);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "timeProvider",
        typeHint = "Ramsey\\Uuid\\Provider\\TimeProviderInterface"
    )
    public Object setTimeProvider(RuntimeEnv env, Object... args) {
        Object timeProvider = assignParameter(args, 0, false);
        this.timeGenerator = this.buildTimeGenerator(env, timeProvider);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "useGuids",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object buildCodec(RuntimeEnv env, Object... args) {
        Object useGuids = assignParameter(args, 0, true);
        if (null == useGuids) {
            useGuids = false;
        }
        if (ZVal.isTrue(useGuids)) {
            return ZVal.assign(new GuidStringCodec(env, this.builder));
        }

        return ZVal.assign(new StringCodec(env, this.builder));
    }

    @ConvertedMethod
    protected Object buildNodeProvider(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.ignoreSystemNode)) {
            return ZVal.assign(new RandomNodeProvider(env));
        }

        return ZVal.assign(
                new FallbackNodeProvider(
                        env,
                        ZVal.newArray(
                                new ZPair(0, new SystemNodeProvider(env)),
                                new ZPair(1, new RandomNodeProvider(env)))));
    }

    @ConvertedMethod
    protected Object buildNumberConverter(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.hasBigNumber(env))) {
            return ZVal.assign(new BigNumberConverter(env));
        }

        return ZVal.assign(new DegradedNumberConverter(env));
    }

    @ConvertedMethod
    protected Object buildRandomGenerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(new RandomGeneratorFactory(env), "getGenerator", FeatureSet.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "timeProvider",
        typeHint = "Ramsey\\Uuid\\Provider\\TimeProviderInterface"
    )
    protected Object buildTimeGenerator(RuntimeEnv env, Object... args) {
        Object timeProvider = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.enablePecl)) {
            return ZVal.assign(new PeclUuidTimeGenerator(env));
        }

        return ZVal.assign(
                env.callMethod(
                        new TimeGeneratorFactory(
                                env, this.nodeProvider, this.buildTimeConverter(env), timeProvider),
                        "getGenerator",
                        FeatureSet.class));
    }

    @ConvertedMethod
    protected Object buildTimeConverter(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.is64BitSystem(env))) {
            return ZVal.assign(new PhpTimeConverter(env));

        } else if (ZVal.isTrue(this.hasBigNumber(env))) {
            return ZVal.assign(new BigNumberTimeConverter(env));
        }

        return ZVal.assign(new DegradedTimeConverter(env));
    }

    @ConvertedMethod
    protected Object buildUuidBuilder(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.is64BitSystem(env))) {
            return ZVal.assign(new DefaultUuidBuilder(env, this.numberConverter));
        }

        return ZVal.assign(new DegradedUuidBuilder(env, this.numberConverter));
    }

    @ConvertedMethod
    protected Object hasBigNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                function_class_exists
                                        .f
                                        .env(env)
                                        .call("Moontoast\\Math\\BigNumber")
                                        .value())
                        && ZVal.toBool(!ZVal.isTrue(this.disableBigNumber)));
    }

    @ConvertedMethod
    protected Object is64BitSystem(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(ZVal.equalityCheck(8, 8))
                        && ZVal.toBool(!ZVal.isTrue(this.disable64Bit)));
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\FeatureSet";

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
                    .setName("Ramsey\\Uuid\\FeatureSet")
                    .setLookup(
                            FeatureSet.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "builder",
                            "codec",
                            "disable64Bit",
                            "disableBigNumber",
                            "enablePecl",
                            "ignoreSystemNode",
                            "nodeProvider",
                            "numberConverter",
                            "randomGenerator",
                            "timeGenerator")
                    .setFilename("vendor/ramsey/uuid/src/FeatureSet.php")
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
