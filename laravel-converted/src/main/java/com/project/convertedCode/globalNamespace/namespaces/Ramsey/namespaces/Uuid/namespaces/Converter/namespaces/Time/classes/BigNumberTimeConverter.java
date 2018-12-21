package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.namespaces.Time.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Converter.classes.TimeConverterInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Converter/Time/BigNumberTimeConverter.php

*/

public class BigNumberTimeConverter extends RuntimeClassBase implements TimeConverterInterface {

    public BigNumberTimeConverter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public BigNumberTimeConverter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "seconds")
    @ConvertedParameter(index = 1, name = "microSeconds")
    public Object calculateTime(RuntimeEnv env, Object... args) {
        Object seconds = assignParameter(args, 0, false);
        Object microSeconds = assignParameter(args, 1, false);
        Object uuidTime = null;
        ReferenceContainer sec = new BasicReferenceContainer(null);
        Object uuidTimeHex = null;
        ReferenceContainer usec = new BasicReferenceContainer(null);
        uuidTime = env.createNew(ZVal.resolveClassAlias(env, "BigNumber"), "0");
        sec.setObject(env.createNew(ZVal.resolveClassAlias(env, "BigNumber"), seconds));
        env.callMethod(sec.getObject(), "multiply", BigNumberTimeConverter.class, "10000000");
        usec.setObject(env.createNew(ZVal.resolveClassAlias(env, "BigNumber"), microSeconds));
        env.callMethod(usec.getObject(), "multiply", BigNumberTimeConverter.class, "10");
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                uuidTime,
                                new RuntimeArgsWithReferences().add(0, sec),
                                "add",
                                BigNumberTimeConverter.class,
                                sec.getObject()),
                        new RuntimeArgsWithReferences().add(0, usec),
                        "add",
                        BigNumberTimeConverter.class,
                        usec.getObject()),
                new RuntimeArgsWithReferences(),
                "add",
                BigNumberTimeConverter.class,
                "122192928000000000");
        uuidTimeHex =
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%016s",
                                env.callMethod(
                                        uuidTime,
                                        "convertToBase",
                                        BigNumberTimeConverter.class,
                                        16))
                        .value();
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("low", function_substr.f.env(env).call(uuidTimeHex, 8).value()),
                        new ZPair(
                                "mid", function_substr.f.env(env).call(uuidTimeHex, 4, 4).value()),
                        new ZPair(
                                "hi", function_substr.f.env(env).call(uuidTimeHex, 0, 4).value())));
    }

    public static final Object CONST_class =
            "Ramsey\\Uuid\\Converter\\Time\\BigNumberTimeConverter";

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
                    .setName("Ramsey\\Uuid\\Converter\\Time\\BigNumberTimeConverter")
                    .setLookup(
                            BigNumberTimeConverter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Converter/Time/BigNumberTimeConverter.php")
                    .addInterface("Ramsey\\Uuid\\Converter\\TimeConverterInterface")
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
