package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.CutStub;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/DoctrineCaster.php

*/

public class DoctrineCaster extends RuntimeClassBase {

    public DoctrineCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public DoctrineCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\VarDumper\\Caster\\DoctrineCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "proxy", typeHint = "Doctrine\\Common\\Proxy\\Proxy")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castCommonProxy(RuntimeEnv env, Object... args) {
            Object proxy = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object k = null;
            for (ZPair zpairResult2182 :
                    ZVal.getIterable(
                            ZVal.arrayFromList("__cloner__", "__initializer__"), env, true)) {
                k = ZVal.assign(zpairResult2182.getValue());
                if (function_array_key_exists.f.env(env).call(k, a.getObject()).getBool()) {
                    arrayActionR(ArrayAction.UNSET, a, env, k);
                    toObjectR(stub)
                            .accessProp(this, env)
                            .name("cut")
                            .set(
                                    ZVal.increment(
                                            toObjectR(stub)
                                                    .accessProp(this, env)
                                                    .name("cut")
                                                    .value()));
                }
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "proxy", typeHint = "Doctrine\\ORM\\Proxy\\Proxy")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castOrmProxy(RuntimeEnv env, Object... args) {
            Object proxy = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object k = null;
            for (ZPair zpairResult2183 :
                    ZVal.getIterable(
                            ZVal.arrayFromList("_entityPersister", "_identifier"), env, true)) {
                k = ZVal.assign(zpairResult2183.getValue());
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                k = "\u0000Doctrine\\ORM\\Proxy\\Proxy\u0000" + toStringR(k, env),
                                a.getObject())
                        .getBool()) {
                    arrayActionR(ArrayAction.UNSET, a, env, k);
                    toObjectR(stub)
                            .accessProp(this, env)
                            .name("cut")
                            .set(
                                    ZVal.increment(
                                            toObjectR(stub)
                                                    .accessProp(this, env)
                                                    .name("cut")
                                                    .value()));
                }
            }

            return ZVal.assign(a.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "coll",
            typeHint = "Doctrine\\ORM\\PersistentCollection"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castPersistentCollection(RuntimeEnv env, Object... args) {
            Object coll = assignParameter(args, 0, false);
            ReferenceContainer a = new BasicReferenceContainer(assignParameter(args, 1, false));
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            Object k = null;
            for (ZPair zpairResult2184 :
                    ZVal.getIterable(
                            ZVal.arrayFromList("snapshot", "association", "typeClass"),
                            env,
                            true)) {
                k = ZVal.assign(zpairResult2184.getValue());
                if (function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                k =
                                        "\u0000Doctrine\\ORM\\PersistentCollection\u0000"
                                                + toStringR(k, env),
                                a.getObject())
                        .getBool()) {
                    a.arrayAccess(env, k).set(new CutStub(env, a.arrayGet(env, k)));
                }
            }

            return ZVal.assign(a.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\DoctrineCaster")
                    .setLookup(
                            DoctrineCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/var-dumper/Caster/DoctrineCaster.php")
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
