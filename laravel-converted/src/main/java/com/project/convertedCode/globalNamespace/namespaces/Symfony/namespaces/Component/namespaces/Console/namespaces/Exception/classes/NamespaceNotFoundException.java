package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.CommandNotFoundException;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Exception/NamespaceNotFoundException.php

*/

public class NamespaceNotFoundException extends CommandNotFoundException {

    public NamespaceNotFoundException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NamespaceNotFoundException.class) {
            this.__construct(env, args);
        }
    }

    public NamespaceNotFoundException(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Exception\\NamespaceNotFoundException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends CommandNotFoundException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Exception\\NamespaceNotFoundException")
                    .setLookup(
                            NamespaceNotFoundException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("alternatives")
                    .setFilename("vendor/symfony/console/Exception/NamespaceNotFoundException.php")
                    .addInterface("Symfony\\Component\\Console\\Exception\\ExceptionInterface")
                    .addInterface("Throwable")
                    .addExtendsClass(
                            "Symfony\\Component\\Console\\Exception\\CommandNotFoundException")
                    .addExtendsClass("InvalidArgumentException")
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
