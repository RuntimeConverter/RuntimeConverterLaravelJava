package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.functions.mb_strtolower;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.functions.mb_stripos;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.functions.mb_strpos;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Constraint/StringContains.php

*/

public class StringContains extends Constraint {

    public Object string = null;

    public Object ignoreCase = null;

    public StringContains(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == StringContains.class) {
            this.__construct(env, args);
        }
    }

    public StringContains(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "ignoreCase",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object ignoreCase = assignParameter(args, 1, true);
        if (null == ignoreCase) {
            ignoreCase = false;
        }
        super.__construct(env);
        this.string = string;
        this.ignoreCase = ignoreCase;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object string = null;
        if (ZVal.isTrue(this.ignoreCase)) {
            string = mb_strtolower.f.env(env).call(this.string).value();

        } else {
            string = ZVal.assign(this.string);
        }

        return ZVal.assign(function_sprintf.f.env(env).call("contains \"%s\"", string).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "other")
    protected Object matches(RuntimeEnv env, Object... args) {
        Object other = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck("", "===", this.string)) {
            return ZVal.assign(true);
        }

        if (ZVal.isTrue(this.ignoreCase)) {
            return ZVal.assign(
                    ZVal.strictNotEqualityCheck(
                            mb_stripos.f.env(env).call(other, this.string).value(), "!==", false));
        }

        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        mb_strpos.f.env(env).call(other, this.string).value(), "!==", false));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\Constraint\\StringContains";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Constraint.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\Constraint\\StringContains")
                    .setLookup(
                            StringContains.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "ignoreCase", "string")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/Constraint/StringContains.php")
                    .addInterface("Countable")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addExtendsClass("PHPUnit\\Framework\\Constraint\\Constraint")
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
