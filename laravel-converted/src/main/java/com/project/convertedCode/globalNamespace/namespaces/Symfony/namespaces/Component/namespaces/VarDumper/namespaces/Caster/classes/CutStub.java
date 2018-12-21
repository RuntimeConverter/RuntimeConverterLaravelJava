package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Caster.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Caster/CutStub.php

*/

public class CutStub extends Stub {

    public CutStub(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CutStub.class) {
            this.__construct(env, args);
        }
    }

    public CutStub(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object __construct(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object value = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("value").set(value);
        switch (toStringR(NamespaceGlobal.gettype.env(env).call(value).value())) {
            case "object":
                toObjectR(this).accessProp(this, env).name("type").set(CONST_TYPE_OBJECT);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("class")
                        .set(function_get_class.f.env(env).call(value).value());
                toObjectR(this).accessProp(this, env).name("cut").set(-1);
                break;
            case "array":
                toObjectR(this).accessProp(this, env).name("type").set(CONST_TYPE_ARRAY);
                toObjectR(this).accessProp(this, env).name("class").set(CONST_ARRAY_ASSOC);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("cut")
                        .set(
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("value")
                                        .set(function_count.f.env(env).call(value).value()));
                break;
            case "resource":
            case "unknown type":
            case "resource (closed)":
                toObjectR(this).accessProp(this, env).name("type").set(CONST_TYPE_RESOURCE);
                toObjectR(this).accessProp(this, env).name("handle").set(ZVal.toLong(value));
                if (ZVal.strictEqualityCheck(
                        "Unknown",
                        "===",
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("class")
                                .set(
                                        NamespaceGlobal.get_resource_type
                                                .env(env)
                                                .call(value)
                                                .value()))) {
                    toObjectR(this).accessProp(this, env).name("class").set("Closed");
                }

                toObjectR(this).accessProp(this, env).name("cut").set(-1);
                break;
            case "string":
                toObjectR(this).accessProp(this, env).name("type").set(CONST_TYPE_STRING);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("class")
                        .set(
                                function_preg_match.f.env(env).call("//u", value).getBool()
                                        ? CONST_STRING_UTF8
                                        : CONST_STRING_BINARY);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("cut")
                        .set(
                                ZVal.strictEqualityCheck(
                                                CONST_STRING_BINARY,
                                                "===",
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("class")
                                                        .value())
                                        ? function_strlen.f.env(env).call(value).value()
                                        : NamespaceGlobal.mb_strlen
                                                .env(env)
                                                .call(value, "UTF-8")
                                                .value());
                toObjectR(this).accessProp(this, env).name("value").set("");
                break;
        }
        ;
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Caster\\CutStub";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Stub.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Caster\\CutStub")
                    .setLookup(
                            CutStub.class,
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
                    .setFilename("vendor/symfony/var-dumper/Caster/CutStub.php")
                    .addInterface("Serializable")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Cloner\\Stub")
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
