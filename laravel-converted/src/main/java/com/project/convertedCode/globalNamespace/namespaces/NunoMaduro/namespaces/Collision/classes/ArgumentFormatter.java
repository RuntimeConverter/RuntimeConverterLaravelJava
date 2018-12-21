package com.project.convertedCode.globalNamespace.namespaces.NunoMaduro.namespaces.Collision.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nunomaduro/collision/src/ArgumentFormatter.php

*/

public class ArgumentFormatter extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .NunoMaduro
                .namespaces
                .Collision
                .namespaces
                .Contracts
                .classes
                .ArgumentFormatter {

    public ArgumentFormatter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ArgumentFormatter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object format(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object arguments = assignParameter(args, 0, false);
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = true;
        }
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object argument = null;
        Object associative = null;
        Object _pClass = null;
        result.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult908 : ZVal.getIterable(arguments, env, true)) {
            argument = ZVal.assign(zpairResult908.getValue());
            SwitchEnumType49 switchVariable49 =
                    ZVal.getEnum(
                            true,
                            SwitchEnumType49.DEFAULT_CASE,
                            SwitchEnumType49.DYNAMIC_TYPE_150,
                            function_is_string.f.env(env).call(argument).value(),
                            SwitchEnumType49.DYNAMIC_TYPE_151,
                            function_is_array.f.env(env).call(argument).value(),
                            SwitchEnumType49.DYNAMIC_TYPE_152,
                            function_is_object.f.env(env).call(argument).value());
            switch (switchVariable49) {
                case DYNAMIC_TYPE_150:
                    result.arrayAppend(env).set("\"" + toStringR(argument, env) + "\"");
                    break;
                case DYNAMIC_TYPE_151:
                    associative =
                            ZVal.strictNotEqualityCheck(
                                    function_array_keys.f.env(env).call(argument).value(),
                                    "!==",
                                    function_range
                                            .f
                                            .env(env)
                                            .call(
                                                    0,
                                                    ZVal.subtract(
                                                            function_count
                                                                    .f
                                                                    .env(env)
                                                                    .call(argument)
                                                                    .value(),
                                                            1))
                                            .value());
                    if (ZVal.toBool(ZVal.toBool(recursive) && ZVal.toBool(associative))
                            && ZVal.toBool(
                                    ZVal.isLessThanOrEqualTo(
                                            function_count.f.env(env).call(argument).value(),
                                            "<=",
                                            5))) {
                        result.arrayAppend(env)
                                .set("[" + toStringR(this.format(env, argument, false), env) + "]");
                    }

                    break;
                case DYNAMIC_TYPE_152:
                    _pClass = function_get_class.f.env(env).call(argument).value();
                    result.arrayAppend(env).set("Object(" + toStringR(_pClass, env) + ")");
                    break;
            }
            ;
        }

        return ZVal.assign(NamespaceGlobal.implode.env(env).call(", ", result.getObject()).value());
    }

    public static final Object CONST_class = "NunoMaduro\\Collision\\ArgumentFormatter";

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
                    .setName("NunoMaduro\\Collision\\ArgumentFormatter")
                    .setLookup(
                            ArgumentFormatter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/nunomaduro/collision/src/ArgumentFormatter.php")
                    .addInterface("NunoMaduro\\Collision\\Contracts\\ArgumentFormatter")
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

    private enum SwitchEnumType49 {
        DYNAMIC_TYPE_150,
        DYNAMIC_TYPE_151,
        DYNAMIC_TYPE_152,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
