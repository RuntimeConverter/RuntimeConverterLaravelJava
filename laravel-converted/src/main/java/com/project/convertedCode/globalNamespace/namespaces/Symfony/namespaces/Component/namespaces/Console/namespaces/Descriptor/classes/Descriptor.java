package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputDefinition;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.DescriptorInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Application;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Descriptor/Descriptor.php

*/

public abstract class Descriptor extends RuntimeClassBase implements DescriptorInterface {

    public Object output = null;

    public Descriptor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Descriptor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 1, name = "object")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object describe(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object output = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        this.output = output;
        SwitchEnumType110 switchVariable110 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType110.DEFAULT_CASE,
                        SwitchEnumType110.DYNAMIC_TYPE_358,
                        ZVal.checkInstanceType(
                                _object,
                                InputArgument.class,
                                "Symfony\\Component\\Console\\Input\\InputArgument"),
                        SwitchEnumType110.DYNAMIC_TYPE_359,
                        ZVal.checkInstanceType(
                                _object,
                                InputOption.class,
                                "Symfony\\Component\\Console\\Input\\InputOption"),
                        SwitchEnumType110.DYNAMIC_TYPE_360,
                        ZVal.checkInstanceType(
                                _object,
                                InputDefinition.class,
                                "Symfony\\Component\\Console\\Input\\InputDefinition"),
                        SwitchEnumType110.DYNAMIC_TYPE_361,
                        ZVal.checkInstanceType(
                                _object,
                                Command.class,
                                "Symfony\\Component\\Console\\Command\\Command"),
                        SwitchEnumType110.DYNAMIC_TYPE_362,
                        ZVal.checkInstanceType(
                                _object,
                                Application.class,
                                "Symfony\\Component\\Console\\Application"));
        switch (switchVariable110) {
            case DYNAMIC_TYPE_358:
                env.callMethod(this, "describeInputArgument", Descriptor.class, _object, options);
                break;
            case DYNAMIC_TYPE_359:
                env.callMethod(this, "describeInputOption", Descriptor.class, _object, options);
                break;
            case DYNAMIC_TYPE_360:
                env.callMethod(this, "describeInputDefinition", Descriptor.class, _object, options);
                break;
            case DYNAMIC_TYPE_361:
                env.callMethod(this, "describeCommand", Descriptor.class, _object, options);
                break;
            case DYNAMIC_TYPE_362:
                env.callMethod(this, "describeApplication", Descriptor.class, _object, options);
                break;
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Object of type \"%s\" is not describable.",
                                                function_get_class.f.env(env).call(_object).value())
                                        .value()));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "content")
    @ConvertedParameter(
        index = 1,
        name = "decorated",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object write(RuntimeEnv env, Object... args) {
        Object content = assignParameter(args, 0, false);
        Object decorated = assignParameter(args, 1, true);
        if (null == decorated) {
            decorated = false;
        }
        env.callMethod(
                this.output,
                "write",
                Descriptor.class,
                content,
                false,
                ZVal.isTrue(decorated)
                        ? OutputInterface.CONST_OUTPUT_NORMAL
                        : OutputInterface.CONST_OUTPUT_RAW);
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Descriptor\\Descriptor";

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
                    .setName("Symfony\\Component\\Console\\Descriptor\\Descriptor")
                    .setLookup(
                            Descriptor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("output")
                    .setFilename("vendor/symfony/console/Descriptor/Descriptor.php")
                    .addInterface("Symfony\\Component\\Console\\Descriptor\\DescriptorInterface")
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

    private enum SwitchEnumType110 {
        DYNAMIC_TYPE_358,
        DYNAMIC_TYPE_359,
        DYNAMIC_TYPE_360,
        DYNAMIC_TYPE_361,
        DYNAMIC_TYPE_362,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
