package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.ControllerMetadata.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/ControllerMetadata/ArgumentMetadata.php

*/

public class ArgumentMetadata extends RuntimeClassBase {

    public Object name = null;

    public Object type = null;

    public Object isVariadic = null;

    public Object hasDefaultValue = null;

    public Object defaultValue = null;

    public Object isNullable = null;

    public ArgumentMetadata(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgumentMetadata.class) {
            this.__construct(env, args);
        }
    }

    public ArgumentMetadata(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "isVariadic", typeHint = "bool")
    @ConvertedParameter(index = 3, name = "hasDefaultValue", typeHint = "bool")
    @ConvertedParameter(index = 4, name = "defaultValue")
    @ConvertedParameter(
        index = 5,
        name = "isNullable",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object isVariadic = assignParameter(args, 2, false);
        Object hasDefaultValue = assignParameter(args, 3, false);
        Object defaultValue = assignParameter(args, 4, false);
        Object isNullable = assignParameter(args, 5, true);
        if (null == isNullable) {
            isNullable = false;
        }
        this.name = name;
        this.type = type;
        this.isVariadic = isVariadic;
        this.hasDefaultValue = hasDefaultValue;
        this.defaultValue = defaultValue;
        this.isNullable =
                ZVal.toBool(
                                ZVal.toBool(isNullable)
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        ZVal.getNull(), "===", type)))
                        || ZVal.toBool(
                                ZVal.toBool(hasDefaultValue)
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        ZVal.getNull(), "===", defaultValue)));
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.type);
    }

    @ConvertedMethod
    public Object isVariadic(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isVariadic);
    }

    @ConvertedMethod
    public Object hasDefaultValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hasDefaultValue);
    }

    @ConvertedMethod
    public Object isNullable(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isNullable);
    }

    @ConvertedMethod
    public Object getDefaultValue(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.hasDefaultValue)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Argument $%s does not have a default value. Use %s::hasDefaultValue() to avoid this exception.",
                                            this.name, "ArgumentMetadata")
                                    .value()));
        }

        return ZVal.assign(this.defaultValue);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadata";

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
                    .setName("Symfony\\Component\\HttpKernel\\ControllerMetadata\\ArgumentMetadata")
                    .setLookup(
                            ArgumentMetadata.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "defaultValue",
                            "hasDefaultValue",
                            "isNullable",
                            "isVariadic",
                            "name",
                            "type")
                    .setFilename(
                            "vendor/symfony/http-kernel/ControllerMetadata/ArgumentMetadata.php")
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
