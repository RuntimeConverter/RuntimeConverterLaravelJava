package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Internal.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Internal/DiffElem.php

*/

public class DiffElem extends RuntimeClassBase {

    public Object type = null;

    public Object old = null;

    public Object _pNew = null;

    public DiffElem(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DiffElem.class) {
            this.__construct(env, args);
        }
    }

    public DiffElem(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type", typeHint = "int")
    @ConvertedParameter(index = 1, name = "old")
    @ConvertedParameter(index = 2, name = "new")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object old = assignParameter(args, 1, false);
        Object _pNew = assignParameter(args, 2, false);
        this.type = type;
        this.old = old;
        this._pNew = _pNew;
        return null;
    }

    public static final Object CONST_TYPE_KEEP = 0;

    public static final Object CONST_TYPE_REMOVE = 1;

    public static final Object CONST_TYPE_ADD = 2;

    public static final Object CONST_TYPE_REPLACE = 3;

    public static final Object CONST_class = "PhpParser\\Internal\\DiffElem";

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
                    .setName("PhpParser\\Internal\\DiffElem")
                    .setLookup(
                            DiffElem.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("new", "old", "type")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Internal/DiffElem.php")
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
