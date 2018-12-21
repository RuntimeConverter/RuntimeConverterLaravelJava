package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.TextDescriptor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.JsonDescriptor;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.MarkdownDescriptor;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Descriptor.classes.XmlDescriptor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/DescriptorHelper.php

*/

public class DescriptorHelper extends Helper {

    public Object descriptors = ZVal.newArray();

    public DescriptorHelper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DescriptorHelper.class) {
            this.__construct(env, args);
        }
    }

    public DescriptorHelper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                this.register(env, "txt", new TextDescriptor(env)),
                                "register",
                                DescriptorHelper.class,
                                "xml",
                                new XmlDescriptor(env)),
                        "register",
                        DescriptorHelper.class,
                        "json",
                        new JsonDescriptor(env)),
                "register",
                DescriptorHelper.class,
                "md",
                new MarkdownDescriptor(env));
        return null;
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
        Object output = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object descriptor = null;
        options.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("raw_text", false), new ZPair("format", "txt")),
                                options.getObject())
                        .value());
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "descriptors", env),
                env,
                options.arrayGet(env, "format"))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unsupported format \"%s\".",
                                            options.arrayGet(env, "format"))
                                    .value()));
        }

        descriptor =
                ZVal.assign(
                        new ReferenceClassProperty(this, "descriptors", env)
                                .arrayGet(env, options.arrayGet(env, "format")));
        env.callMethod(
                descriptor,
                "describe",
                DescriptorHelper.class,
                output,
                _object,
                options.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    @ConvertedParameter(
        index = 1,
        name = "descriptor",
        typeHint = "Symfony\\Component\\Console\\Descriptor\\DescriptorInterface"
    )
    public Object register(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        Object descriptor = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "descriptors", env)
                .arrayAccess(env, format)
                .set(descriptor);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "descriptor";
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Helper\\DescriptorHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Helper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\DescriptorHelper")
                    .setLookup(
                            DescriptorHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("descriptors", "helperSet")
                    .setFilename("vendor/symfony/console/Helper/DescriptorHelper.php")
                    .addInterface("Symfony\\Component\\Console\\Helper\\HelperInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Helper\\Helper")
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
