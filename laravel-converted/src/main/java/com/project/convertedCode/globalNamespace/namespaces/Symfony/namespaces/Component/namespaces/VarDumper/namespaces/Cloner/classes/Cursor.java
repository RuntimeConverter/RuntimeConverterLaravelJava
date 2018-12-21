package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Cloner/Cursor.php

*/

public class Cursor extends RuntimeClassBase {

    public Object depth = 0;

    public Object refIndex = 0;

    public Object softRefTo = 0;

    public Object softRefCount = 0;

    public Object softRefHandle = 0;

    public Object hardRefTo = 0;

    public Object hardRefCount = 0;

    public Object hardRefHandle = 0;

    public Object hashType = null;

    public Object hashKey = null;

    public Object hashKeyIsBinary = null;

    public Object hashIndex = 0;

    public Object hashLength = 0;

    public Object hashCut = 0;

    public Object stop = false;

    public Object attr = ZVal.newArray();

    public Object skipChildren = false;

    public Cursor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Cursor(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_HASH_INDEXED = Stub.CONST_ARRAY_INDEXED;

    public static final Object CONST_HASH_ASSOC = Stub.CONST_ARRAY_ASSOC;

    public static final Object CONST_HASH_OBJECT = Stub.CONST_TYPE_OBJECT;

    public static final Object CONST_HASH_RESOURCE = Stub.CONST_TYPE_RESOURCE;

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Cloner\\Cursor";

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
                    .setName("Symfony\\Component\\VarDumper\\Cloner\\Cursor")
                    .setLookup(
                            Cursor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attr",
                            "depth",
                            "hardRefCount",
                            "hardRefHandle",
                            "hardRefTo",
                            "hashCut",
                            "hashIndex",
                            "hashKey",
                            "hashKeyIsBinary",
                            "hashLength",
                            "hashType",
                            "refIndex",
                            "skipChildren",
                            "softRefCount",
                            "softRefHandle",
                            "softRefTo",
                            "stop")
                    .setFilename("vendor/symfony/var-dumper/Cloner/Cursor.php")
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
