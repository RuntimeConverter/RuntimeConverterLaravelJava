package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/NameGenerator.php

*/

public class NameGenerator extends RuntimeClassBase {

    public NameGenerator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public NameGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "class",
        typeHint = "ReflectionClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 1, name = "interfaces", typeHint = "array")
    public Object name(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, true);
        if (null == _pClass) {
            _pClass = ZVal.getNull();
        }
        Object interfaces = assignParameter(args, 1, false);
        ReferenceContainer parts = new BasicReferenceContainer(null);
        Object _pInterface = null;
        parts.setObject(ZVal.newArray());
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pClass)) {
            parts.arrayAppend(env).set(env.callMethod(_pClass, "getName", NameGenerator.class));

        } else {
            for (ZPair zpairResult963 : ZVal.getIterable(interfaces, env, true)) {
                _pInterface = ZVal.assign(zpairResult963.getValue());
                parts.arrayAppend(env)
                        .set(env.callMethod(_pInterface, "getShortName", NameGenerator.class));
            }
        }

        if (!function_count.f.env(env).call(parts.getObject()).getBool()) {
            parts.arrayAppend(env).set("stdClass");
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "Double\\%s\\P%d",
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call("\\", parts.getObject())
                                        .value(),
                                ZVal.postIncrement(
                                        env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Prophecy
                                                        .namespaces
                                                        .Doubler
                                                        .classes
                                                        .NameGenerator
                                                        .RequestStaticProperties
                                                        .class,
                                                "counter")))
                        .value());
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\NameGenerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object counter = 1;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Doubler\\NameGenerator")
                    .setLookup(
                            NameGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("counter")
                    .setFilename("vendor/phpspec/prophecy/src/Prophecy/Doubler/NameGenerator.php")
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
