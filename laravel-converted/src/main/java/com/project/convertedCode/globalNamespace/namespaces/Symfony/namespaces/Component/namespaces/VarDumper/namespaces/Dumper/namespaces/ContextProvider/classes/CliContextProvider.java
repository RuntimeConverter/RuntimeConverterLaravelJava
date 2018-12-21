package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.namespaces.ContextProvider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.namespaces.ContextProvider.classes.ContextProviderInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/ContextProvider/CliContextProvider.php

*/

public final class CliContextProvider extends RuntimeClassBase implements ContextProviderInterface {

    public CliContextProvider(RuntimeEnv env, Object... args) {
        super(env);
    }

    public CliContextProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getContext(RuntimeEnv env, Object... args) {
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object commandLine = null;
        if (ZVal.strictNotEqualityCheck("cli", "!==", "cli")) {
            return ZVal.assign(ZVal.getNull());
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "command_line",
                                commandLine =
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(" ", _SERVER.arrayGet(env, "argv"))
                                                .value()),
                        new ZPair(
                                "identifier",
                                NamespaceGlobal.hash
                                        .env(env)
                                        .call(
                                                "crc32b",
                                                toStringR(commandLine, env)
                                                        + toStringR(
                                                                _SERVER.arrayGet(
                                                                        env, "REQUEST_TIME_FLOAT"),
                                                                env))
                                        .value())));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\CliContextProvider";

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
                    .setName(
                            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\CliContextProvider")
                    .setLookup(
                            CliContextProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/symfony/var-dumper/Dumper/ContextProvider/CliContextProvider.php")
                    .addInterface(
                            "Symfony\\Component\\VarDumper\\Dumper\\ContextProvider\\ContextProviderInterface")
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
