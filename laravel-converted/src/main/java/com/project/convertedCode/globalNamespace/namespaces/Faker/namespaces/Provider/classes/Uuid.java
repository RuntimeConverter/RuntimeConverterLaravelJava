package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.classes.Base;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/Uuid.php

*/

public class Uuid extends Base {

    public Uuid(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Uuid.class) {
            this.__construct(env, args);
        }
    }

    public Uuid(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\Uuid";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Base.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object uuid(RuntimeEnv env, Object... args) {
            Object val = null;
            Object tMi = null;
            Object seed = null;
            Object tHi = null;
            ReferenceContainer _pByte = new BasicReferenceContainer(null);
            Object tLo = null;
            Object csLo = null;
            Object uuid = null;
            Object csHi = null;
            seed =
                    toStringR(NamespaceGlobal.mt_rand.env(env).call(0, 2147483647L).value(), env)
                            + "#"
                            + toStringR(
                                    NamespaceGlobal.mt_rand.env(env).call(0, 2147483647L).value(),
                                    env);
            val = NamespaceGlobal.md5.env(env).call(seed, true).value();
            _pByte.setObject(
                    function_array_values
                            .f
                            .env(env)
                            .call(NamespaceGlobal.unpack.env(env).call("C16", val).value())
                            .value());
            tLo =
                    ZVal.toLong(
                                    ZVal.toLong(
                                                    ZVal.toLong(
                                                                    ZVal.toLong(
                                                                                    _pByte.arrayGet(
                                                                                            env, 0))
                                                                            << ZVal.toLong(24))
                                                            | ZVal.toLong(
                                                                    ZVal.toLong(
                                                                                    _pByte.arrayGet(
                                                                                            env, 1))
                                                                            << ZVal.toLong(16)))
                                            | ZVal.toLong(
                                                    ZVal.toLong(_pByte.arrayGet(env, 2))
                                                            << ZVal.toLong(8)))
                            | ZVal.toLong(_pByte.arrayGet(env, 3));
            tMi =
                    ZVal.toLong(ZVal.toLong(_pByte.arrayGet(env, 4)) << ZVal.toLong(8))
                            | ZVal.toLong(_pByte.arrayGet(env, 5));
            tHi =
                    ZVal.toLong(ZVal.toLong(_pByte.arrayGet(env, 6)) << ZVal.toLong(8))
                            | ZVal.toLong(_pByte.arrayGet(env, 7));
            csLo = ZVal.assign(_pByte.arrayGet(env, 9));
            csHi =
                    ZVal.toLong(ZVal.toLong(_pByte.arrayGet(env, 8)) & ZVal.toLong(63))
                            | ZVal.toLong(ZVal.toLong(1) << ZVal.toLong(7));
            if (ZVal.equalityCheck(
                    NamespaceGlobal.pack.env(env).call("L", 1633843578).value(),
                    NamespaceGlobal.pack.env(env).call("N", 1633843578).value())) {
                tLo =
                        ZVal.toLong(
                                        ZVal.toLong(
                                                        ZVal.toLong(
                                                                        ZVal.toLong(
                                                                                        ZVal.toLong(
                                                                                                        tLo)
                                                                                                & ZVal
                                                                                                        .toLong(
                                                                                                                255))
                                                                                << ZVal.toLong(24))
                                                                | ZVal.toLong(
                                                                        ZVal.toLong(
                                                                                        ZVal.toLong(
                                                                                                        tLo)
                                                                                                & ZVal
                                                                                                        .toLong(
                                                                                                                65280))
                                                                                << ZVal.toLong(8)))
                                                | ZVal.toLong(
                                                        ZVal.toLong(
                                                                        ZVal.toLong(tLo)
                                                                                & ZVal.toLong(
                                                                                        16711680))
                                                                >> ZVal.toLong(8)))
                                | ZVal.toLong(
                                        ZVal.toLong(ZVal.toLong(tLo) & ZVal.toLong(4278190080L))
                                                >> ZVal.toLong(24));
                tMi =
                        ZVal.toLong(
                                        ZVal.toLong(ZVal.toLong(tMi) & ZVal.toLong(255))
                                                << ZVal.toLong(8))
                                | ZVal.toLong(
                                        ZVal.toLong(ZVal.toLong(tMi) & ZVal.toLong(65280))
                                                >> ZVal.toLong(8));
                tHi =
                        ZVal.toLong(
                                        ZVal.toLong(ZVal.toLong(tHi) & ZVal.toLong(255))
                                                << ZVal.toLong(8))
                                | ZVal.toLong(
                                        ZVal.toLong(ZVal.toLong(tHi) & ZVal.toLong(65280))
                                                >> ZVal.toLong(8));
            }

            tHi = ZAssignment.and("&=", tHi, 4095);
            tHi = ZAssignment.or("|=", tHi, ZVal.toLong(3) << ZVal.toLong(12));
            uuid =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%08x-%04x-%04x-%02x%02x-%02x%02x%02x%02x%02x%02x",
                                    tLo,
                                    tMi,
                                    tHi,
                                    csHi,
                                    csLo,
                                    _pByte.arrayGet(env, 10),
                                    _pByte.arrayGet(env, 11),
                                    _pByte.arrayGet(env, 12),
                                    _pByte.arrayGet(env, 13),
                                    _pByte.arrayGet(env, 14),
                                    _pByte.arrayGet(env, 15))
                            .value();
            return ZVal.assign(uuid);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\Uuid")
                    .setLookup(
                            Uuid.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/Uuid.php")
                    .addExtendsClass("Faker\\Provider\\Base")
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
