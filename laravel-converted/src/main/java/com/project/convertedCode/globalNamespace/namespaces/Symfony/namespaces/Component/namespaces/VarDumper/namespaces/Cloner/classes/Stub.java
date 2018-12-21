package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Cloner/Stub.php

*/

public class Stub extends RuntimeClassBase implements Serializable {

    public Object type = CONST_TYPE_REF;

    public Object _pClass = "";

    public Object value = null;

    public Object cut = 0;

    public Object handle = 0;

    public Object refCount = 0;

    public Object position = 0;

    public Object attr = ZVal.newArray();

    public Stub(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Stub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_serialize
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, this._pClass),
                                        new ZPair(1, this.position),
                                        new ZPair(2, this.cut),
                                        new ZPair(3, this.type),
                                        new ZPair(4, this.value),
                                        new ZPair(5, this.handle),
                                        new ZPair(6, this.refCount),
                                        new ZPair(7, this.attr)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "serialized")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object serialized = assignParameter(args, 0, false);
        Object runtimeTempArrayResult217 = null;
        ZVal.list(
                runtimeTempArrayResult217 =
                        function_unserialize.f.env(env).call(serialized).value(),
                (this._pClass = listGet(runtimeTempArrayResult217, 0, env)),
                (this.position = listGet(runtimeTempArrayResult217, 1, env)),
                (this.cut = listGet(runtimeTempArrayResult217, 2, env)),
                (this.type = listGet(runtimeTempArrayResult217, 3, env)),
                (this.value = listGet(runtimeTempArrayResult217, 4, env)),
                (this.handle = listGet(runtimeTempArrayResult217, 5, env)),
                (this.refCount = listGet(runtimeTempArrayResult217, 6, env)),
                (this.attr = listGet(runtimeTempArrayResult217, 7, env)));
        return null;
    }

    public static final Object CONST_TYPE_REF = 1;

    public static final Object CONST_TYPE_STRING = 2;

    public static final Object CONST_TYPE_ARRAY = 3;

    public static final Object CONST_TYPE_OBJECT = 4;

    public static final Object CONST_TYPE_RESOURCE = 5;

    public static final Object CONST_STRING_BINARY = 1;

    public static final Object CONST_STRING_UTF8 = 2;

    public static final Object CONST_ARRAY_ASSOC = 1;

    public static final Object CONST_ARRAY_INDEXED = 2;

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Cloner\\Stub";

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
                    .setName("Symfony\\Component\\VarDumper\\Cloner\\Stub")
                    .setLookup(
                            Stub.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attr",
                            "class",
                            "cut",
                            "handle",
                            "position",
                            "refCount",
                            "type",
                            "value")
                    .setFilename("vendor/symfony/var-dumper/Cloner/Stub.php")
                    .addInterface("Serializable")
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
