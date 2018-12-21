package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Comment.classes;

import com.project.convertedCode.globalNamespace.namespaces.PhpParser.classes.Comment;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Comment/Doc.php

*/

public class Doc extends Comment {

    public Doc(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Doc.class) {
            this.__construct(env, args);
        }
    }

    public Doc(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PhpParser\\Comment\\Doc";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Comment.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Comment\\Doc")
                    .setLookup(
                            Doc.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filePos", "line", "text", "tokenPos")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Comment/Doc.php")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Comment")
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
