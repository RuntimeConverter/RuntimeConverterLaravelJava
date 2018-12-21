package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Catalogue.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Catalogue.classes.AbstractOperation;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Catalogue/TargetOperation.php

*/

public class TargetOperation extends AbstractOperation {

    public TargetOperation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TargetOperation.class) {
            this.__construct(env, args);
        }
    }

    public TargetOperation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "domain")
    protected Object processDomain(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, false);
        Object id = null;
        Object message = null;
        Object keyMetadata = null;
        new ReferenceClassProperty(this, "messages", env)
                .arrayAccess(env, domain)
                .set(
                        ZVal.newArray(
                                new ZPair("all", ZVal.newArray()),
                                new ZPair("new", ZVal.newArray()),
                                new ZPair("obsolete", ZVal.newArray())));
        for (ZPair zpairResult2102 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("source").value(),
                                "all",
                                TargetOperation.class,
                                domain),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult2102.getKey());
            message = ZVal.assign(zpairResult2102.getValue());
            if (ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("target").value(),
                            "has",
                            TargetOperation.class,
                            id,
                            domain))) {
                new ReferenceClassProperty(this, "messages", env)
                        .arrayAccess(env, domain, "all", id)
                        .set(message);
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("result").value(),
                        new RuntimeArgsWithReferences(),
                        "add",
                        TargetOperation.class,
                        ZVal.newArray(new ZPair(id, message)),
                        domain);
                if (ZVal.strictNotEqualityCheck(
                        ZVal.getNull(),
                        "!==",
                        keyMetadata =
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("source")
                                                .value(),
                                        "getMetadata",
                                        TargetOperation.class,
                                        id,
                                        domain))) {
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("result").value(),
                            "setMetadata",
                            TargetOperation.class,
                            id,
                            keyMetadata,
                            domain);
                }

            } else {
                new ReferenceClassProperty(this, "messages", env)
                        .arrayAccess(env, domain, "obsolete", id)
                        .set(message);
            }
        }

        for (ZPair zpairResult2103 :
                ZVal.getIterable(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("target").value(),
                                "all",
                                TargetOperation.class,
                                domain),
                        env,
                        false)) {
            id = ZVal.assign(zpairResult2103.getKey());
            message = ZVal.assign(zpairResult2103.getValue());
            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("source").value(),
                            "has",
                            TargetOperation.class,
                            id,
                            domain))) {
                new ReferenceClassProperty(this, "messages", env)
                        .arrayAccess(env, domain, "all", id)
                        .set(message);
                new ReferenceClassProperty(this, "messages", env)
                        .arrayAccess(env, domain, "new", id)
                        .set(message);
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("result").value(),
                        new RuntimeArgsWithReferences(),
                        "add",
                        TargetOperation.class,
                        ZVal.newArray(new ZPair(id, message)),
                        domain);
                if (ZVal.strictNotEqualityCheck(
                        ZVal.getNull(),
                        "!==",
                        keyMetadata =
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("target")
                                                .value(),
                                        "getMetadata",
                                        TargetOperation.class,
                                        id,
                                        domain))) {
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("result").value(),
                            "setMetadata",
                            TargetOperation.class,
                            id,
                            keyMetadata,
                            domain);
                }
            }
        }

        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Translation\\Catalogue\\TargetOperation";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractOperation.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Catalogue\\TargetOperation")
                    .setLookup(
                            TargetOperation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("domains", "messages", "result", "source", "target")
                    .setFilename("vendor/symfony/translation/Catalogue/TargetOperation.php")
                    .addInterface("Symfony\\Component\\Translation\\Catalogue\\OperationInterface")
                    .addExtendsClass(
                            "Symfony\\Component\\Translation\\Catalogue\\AbstractOperation")
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
