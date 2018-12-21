package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/InvalidArgumentHelper.php

*/

public final class InvalidArgumentHelper extends RuntimeClassBase {

    public InvalidArgumentHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public InvalidArgumentHelper(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\InvalidArgumentHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument", typeHint = "int")
        @ConvertedParameter(index = 1, name = "type", typeHint = "string")
        @ConvertedParameter(
            index = 2,
            name = "value",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object factory(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, false);
            Object type = assignParameter(args, 1, false);
            Object value = assignParameter(args, 2, true);
            if (null == value) {
                value = ZVal.getNull();
            }
            ReferenceContainer stack = new BasicReferenceContainer(null);
            stack.setObject(NamespaceGlobal.debug_backtrace.env(env).call().value());
            return ZVal.assign(
                    new Exception(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Argument #%d%sof %s::%s() must be a %s",
                                            argument,
                                            ZVal.strictNotEqualityCheck(
                                                            value, "!==", ZVal.getNull())
                                                    ? " ("
                                                            + toStringR(
                                                                    NamespaceGlobal.gettype
                                                                            .env(env)
                                                                            .call(value)
                                                                            .value(),
                                                                    env)
                                                            + "#"
                                                            + toStringR(value, env)
                                                            + ")"
                                                    : " (No Value) ",
                                            stack.arrayGet(env, 1, "class"),
                                            stack.arrayGet(env, 1, "function"),
                                            type)
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\InvalidArgumentHelper")
                    .setLookup(
                            InvalidArgumentHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/InvalidArgumentHelper.php")
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
