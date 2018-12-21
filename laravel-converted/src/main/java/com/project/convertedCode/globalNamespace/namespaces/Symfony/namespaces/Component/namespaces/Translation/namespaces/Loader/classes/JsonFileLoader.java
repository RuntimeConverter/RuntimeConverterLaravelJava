package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidResourceException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.FileLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/JsonFileLoader.php

*/

public class JsonFileLoader extends FileLoader {

    public JsonFileLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public JsonFileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    protected Object loadResource(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object data = null;
        Object messages = null;
        Object errorCode = null;
        messages = ZVal.newArray();
        if (ZVal.isTrue(data = function_file_get_contents.f.env(env).call(resource).value())) {
            messages = NamespaceGlobal.json_decode.env(env).call(data, true).value();
            if (ZVal.isLessThan(
                    0, '<', errorCode = NamespaceGlobal.json_last_error.env(env).call().value())) {
                throw ZVal.getException(
                        env,
                        new InvalidResourceException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Error parsing JSON - %s",
                                                this.getJSONErrorMessage(env, errorCode))
                                        .value()));
            }
        }

        return ZVal.assign(messages);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errorCode")
    private Object getJSONErrorMessage(RuntimeEnv env, Object... args) {
        Object errorCode = assignParameter(args, 0, false);
        SwitchEnumType139 switchVariable139 =
                ZVal.getEnum(
                        errorCode,
                        SwitchEnumType139.DEFAULT_CASE,
                        SwitchEnumType139.DYNAMIC_TYPE_403,
                        1,
                        SwitchEnumType139.DYNAMIC_TYPE_404,
                        2,
                        SwitchEnumType139.DYNAMIC_TYPE_405,
                        3,
                        SwitchEnumType139.DYNAMIC_TYPE_406,
                        4,
                        SwitchEnumType139.DYNAMIC_TYPE_407,
                        5);
        switch (switchVariable139) {
            case DYNAMIC_TYPE_403:
                return "Maximum stack depth exceeded";
            case DYNAMIC_TYPE_404:
                return "Underflow or the modes mismatch";
            case DYNAMIC_TYPE_405:
                return "Unexpected control character found";
            case DYNAMIC_TYPE_406:
                return "Syntax error, malformed JSON";
            case DYNAMIC_TYPE_407:
                return "Malformed UTF-8 characters, possibly incorrectly encoded";
            case DEFAULT_CASE:
                return "Unknown error";
        }
        ;
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Loader\\JsonFileLoader";

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
                    .setName("Symfony\\Component\\Translation\\Loader\\JsonFileLoader")
                    .setLookup(
                            JsonFileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/JsonFileLoader.php")
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

    private enum SwitchEnumType139 {
        DYNAMIC_TYPE_403,
        DYNAMIC_TYPE_404,
        DYNAMIC_TYPE_405,
        DYNAMIC_TYPE_406,
        DYNAMIC_TYPE_407,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
