package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes.Caster;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/StubCaster.php

*/

public class StubCaster extends RuntimeClassBase {

    public StubCaster(RuntimeEnv env, Object... args) {
        super(env);
    }

    public StubCaster(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\StubCaster";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "c",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castStub(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            if (ZVal.isTrue(isNested)) {
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("type")
                        .set(toObjectR(c).accessProp(this, env).name("type").value());
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("class")
                        .set(toObjectR(c).accessProp(this, env).name("class").value());
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("value")
                        .set(toObjectR(c).accessProp(this, env).name("value").value());
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("handle")
                        .set(toObjectR(c).accessProp(this, env).name("handle").value());
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("cut")
                        .set(toObjectR(c).accessProp(this, env).name("cut").value());
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("attr")
                        .set(toObjectR(c).accessProp(this, env).name("attr").value());
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        Stub.CONST_TYPE_REF,
                                                                        "===",
                                                                        toObjectR(c)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("type")
                                                                                .value()))
                                                        && ZVal.toBool(
                                                                !toObjectR(c)
                                                                        .accessProp(this, env)
                                                                        .name("class")
                                                                        .getBool()))
                                        && ZVal.toBool(
                                                function_is_string
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                toObjectR(c)
                                                                        .accessProp(this, env)
                                                                        .name("value")
                                                                        .value())
                                                        .value()))
                        && ZVal.toBool(
                                !function_preg_match
                                        .f
                                        .env(env)
                                        .call(
                                                "//u",
                                                toObjectR(c)
                                                        .accessProp(this, env)
                                                        .name("value")
                                                        .value())
                                        .getBool())) {
                    toObjectR(stub).accessProp(this, env).name("type").set(Stub.CONST_TYPE_STRING);
                    toObjectR(stub)
                            .accessProp(this, env)
                            .name("class")
                            .set(Stub.CONST_STRING_BINARY);
                }

                a = ZVal.newArray();
            }

            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "c",
            typeHint = "Symfony\\Component\\VarDumper\\Caster\\CutArrayStub"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castCutArray(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            return ZVal.assign(
                    ZVal.isTrue(isNested)
                            ? toObjectR(c).accessProp(this, env).name("preservedSubset").value()
                            : a);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "obj")
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object cutInternals(RuntimeEnv env, Object... args) {
            Object obj = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            if (ZVal.isTrue(isNested)) {
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("cut")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        toObjectR(stub).accessProp(this, env).name("cut").value(),
                                        function_count.f.env(env).call(a).value()));
                return ZVal.assign(ZVal.newArray());
            }

            return ZVal.assign(a);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "c",
            typeHint = "Symfony\\Component\\VarDumper\\Caster\\EnumStub"
        )
        @ConvertedParameter(index = 1, name = "a", typeHint = "array")
        @ConvertedParameter(
            index = 2,
            name = "stub",
            typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Stub"
        )
        @ConvertedParameter(index = 3, name = "isNested")
        public Object castEnum(RuntimeEnv env, Object... args) {
            Object c = assignParameter(args, 0, false);
            Object a = assignParameter(args, 1, false);
            Object stub = assignParameter(args, 2, false);
            Object isNested = assignParameter(args, 3, false);
            ReferenceContainer keys = new BasicReferenceContainer(null);
            ReferenceContainer k = new BasicReferenceContainer(null);
            if (ZVal.isTrue(isNested)) {
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("class")
                        .set(
                                toObjectR(c).accessProp(this, env).name("dumpKeys").getBool()
                                        ? ""
                                        : ZVal.getNull());
                toObjectR(stub).accessProp(this, env).name("handle").set(0);
                toObjectR(stub).accessProp(this, env).name("value").set(ZVal.getNull());
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("cut")
                        .set(toObjectR(c).accessProp(this, env).name("cut").value());
                toObjectR(stub)
                        .accessProp(this, env)
                        .name("attr")
                        .set(toObjectR(c).accessProp(this, env).name("attr").value());
                a = ZVal.newArray();
                if (toObjectR(c).accessProp(this, env).name("value").getBool()) {
                    for (ZPair zpairResult2205 :
                            ZVal.getIterable(
                                    function_array_keys
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(c)
                                                            .accessProp(this, env)
                                                            .name("value")
                                                            .value())
                                            .value(),
                                    env,
                                    true)) {
                        k.setObject(ZVal.assign(zpairResult2205.getValue()));
                        keys.arrayAppend(env)
                                .set(
                                        ZVal.toBool(!arrayActionR(ArrayAction.ISSET, k, env, 0))
                                                        || ZVal.toBool(
                                                                ZVal.strictNotEqualityCheck(
                                                                        "\u0000",
                                                                        "!==",
                                                                        k.arrayGet(env, 0)))
                                                ? toStringR(Caster.CONST_PREFIX_VIRTUAL, env)
                                                        + toStringR(k.getObject(), env)
                                                : k.getObject());
                    }

                    a =
                            function_array_combine
                                    .f
                                    .env(env)
                                    .call(
                                            keys.getObject(),
                                            toObjectR(c)
                                                    .accessProp(this, env)
                                                    .name("value")
                                                    .value())
                                    .value();
                }
            }

            return ZVal.assign(a);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\StubCaster")
                    .setLookup(
                            StubCaster.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/var-dumper/Caster/StubCaster.php")
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
