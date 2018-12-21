package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Lexer.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Lexer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Lexer/Emulative.php

*/

public class Emulative extends Lexer {

    public Emulative(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Emulative.class) {
            this.__construct(env, args);
        }
    }

    public Emulative(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PhpParser\\Lexer\\Emulative";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Lexer.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Lexer\\Emulative")
                    .setLookup(
                            Emulative.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "code",
                            "dropTokens",
                            "filePos",
                            "line",
                            "pos",
                            "prevCloseTagHasNewline",
                            "tokenMap",
                            "tokens",
                            "usedAttributes")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Lexer/Emulative.php")
                    .addExtendsClass("PhpParser\\Lexer")
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
