package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.exceptions.missingDefinitions.ClassNotFoundDuringConversion;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidResourceException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.FileLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/YamlFileLoader.php

*/

public class YamlFileLoader extends FileLoader {

    public Object yamlParser = null;

    public YamlFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public YamlFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    protected Object loadResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object e = null;
        Object messages = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.yamlParser)) {
            if (!function_class_exists
                    .f
                    .env(env)
                    .call("Symfony\\Component\\Yaml\\Parser")
                    .getBool()) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                "Loading translations from the YAML format requires the Symfony Yaml component."));
            }

            this.yamlParser = env.createNew(ZVal.resolveClassAlias(env, "YamlParser"));
        }

        try {
            messages =
                    env.callMethod(
                            this.yamlParser,
                            "parseFile",
                            YamlFileLoader.class,
                            resource,
                            ClassConstantUtils.getConstantValueByClass(
                                    env, ZVal.resolveClassAlias(env, "Yaml"), "PARSE_CONSTANT"));
        } catch (ConvertedException convertedException313) {
            if (ClassNotFoundDuringConversion.missingClassInCatchBlock("ParseException")) {
                e = convertedException313.getObject();
                throw ZVal.getException(
                        env,
                        new InvalidResourceException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Error parsing YAML, invalid file \"%s\"", resource)
                                        .value(),
                                0,
                                e));
            } else {
                throw convertedException313;
            }
        }

        return ZVal.assign(messages);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\YamlFileLoader";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends FileLoader.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Loader\\YamlFileLoader")
                    .setLookup(
                            YamlFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("yamlParser")
                    .setFilename("vendor/symfony/translation/Loader/YamlFileLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\FileLoader")
                    .addExtendsClass("Symfony\\Component\\Translation\\Loader\\ArrayLoader")
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
