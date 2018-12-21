package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.classes.BinaryUtils;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.TimeGeneratorInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Generator/DefaultTimeGenerator.php

*/

public class DefaultTimeGenerator extends RuntimeClassBase implements TimeGeneratorInterface {

    public Object nodeProvider = null;

    public Object timeConverter = null;

    public Object timeProvider = null;

    public DefaultTimeGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DefaultTimeGenerator.class) {
            this.__construct(env, args);
        }
    }

    public DefaultTimeGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "nodeProvider",
        typeHint = "Ramsey\\Uuid\\Provider\\NodeProviderInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "timeConverter",
        typeHint = "Ramsey\\Uuid\\Converter\\TimeConverterInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "timeProvider",
        typeHint = "Ramsey\\Uuid\\Provider\\TimeProviderInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object nodeProvider = assignParameter(args, 0, false);
        Object timeConverter = assignParameter(args, 1, false);
        Object timeProvider = assignParameter(args, 2, false);
        this.nodeProvider = nodeProvider;
        this.timeConverter = timeConverter;
        this.timeProvider = timeProvider;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "clockSeq",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object generate(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, true);
        if (null == node) {
            node = ZVal.getNull();
        }
        Object clockSeq = assignParameter(args, 1, true);
        if (null == clockSeq) {
            clockSeq = ZVal.getNull();
        }
        ReferenceContainer uuidTime = new BasicReferenceContainer(null);
        Object timeHi = null;
        Object clockSeqHi = null;
        Object hex = null;
        ReferenceContainer timeOfDay = new BasicReferenceContainer(null);
        node = this.getValidNode(env, node);
        if (ZVal.strictEqualityCheck(clockSeq, "===", ZVal.getNull())) {
            clockSeq = NamespaceGlobal.random_int.env(env).call(0, 16383).value();
        }

        timeOfDay.setObject(
                env.callMethod(this.timeProvider, "currentTime", DefaultTimeGenerator.class));
        uuidTime.setObject(
                env.callMethod(
                        this.timeConverter,
                        "calculateTime",
                        DefaultTimeGenerator.class,
                        timeOfDay.arrayGet(env, "sec"),
                        timeOfDay.arrayGet(env, "usec")));
        timeHi = BinaryUtils.runtimeStaticObject.applyVersion(env, uuidTime.arrayGet(env, "hi"), 1);
        clockSeqHi =
                BinaryUtils.runtimeStaticObject.applyVariant(
                        env, ZVal.toLong(clockSeq) >> ZVal.toLong(8));
        hex =
                NamespaceGlobal.vsprintf
                        .env(env)
                        .call(
                                "%08s%04s%04s%02s%02s%012s",
                                ZVal.newArray(
                                        new ZPair(0, uuidTime.arrayGet(env, "low")),
                                        new ZPair(1, uuidTime.arrayGet(env, "mid")),
                                        new ZPair(
                                                2,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call("%04x", timeHi)
                                                        .value()),
                                        new ZPair(
                                                3,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call("%02x", clockSeqHi)
                                                        .value()),
                                        new ZPair(
                                                4,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "%02x",
                                                                ZVal.toLong(clockSeq)
                                                                        & ZVal.toLong(255))
                                                        .value()),
                                        new ZPair(5, node)))
                        .value();
        return ZVal.assign(NamespaceGlobal.hex2bin.env(env).call(hex).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "node")
    protected Object getValidNode(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(node, "===", ZVal.getNull())) {
            node = env.callMethod(this.nodeProvider, "getNode", DefaultTimeGenerator.class);
        }

        if (function_is_int.f.env(env).call(node).getBool()) {
            node = function_sprintf.f.env(env).call("%012x", node).value();
        }

        if (ZVal.toBool(!NamespaceGlobal.ctype_xdigit.env(env).call(node).getBool())
                || ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_strlen.f.env(env).call(node).value(), '>', 12))) {
            throw ZVal.getException(env, new InvalidArgumentException(env, "Invalid node value"));
        }

        return ZVal.assign(
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(function_sprintf.f.env(env).call("%012s", node).value())
                        .value());
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Generator\\DefaultTimeGenerator";

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
                    .setName("Ramsey\\Uuid\\Generator\\DefaultTimeGenerator")
                    .setLookup(
                            DefaultTimeGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("nodeProvider", "timeConverter", "timeProvider")
                    .setFilename("vendor/ramsey/uuid/src/Generator/DefaultTimeGenerator.php")
                    .addInterface("Ramsey\\Uuid\\Generator\\TimeGeneratorInterface")
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
