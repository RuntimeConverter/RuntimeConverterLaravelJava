package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Loader.classes.LoaderInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.MessageCatalogue;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Loader/ArrayLoader.php

*/

public class ArrayLoader extends RuntimeClassBase implements LoaderInterface {

    public ArrayLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ArrayLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(index = 1, name = "locale")
    @ConvertedParameter(index = 2, name = "domain")
    public Object load(RuntimeEnv env, Object... args) {
        ReferenceContainer resource = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object locale = assignParameter(args, 1, false);
        Object domain = assignParameter(args, 2, true);
        if (null == domain) {
            domain = "messages";
        }
        Object catalogue = null;
        env.callMethod(
                this,
                new RuntimeArgsWithReferences().add(0, resource),
                "flatten",
                ArrayLoader.class,
                resource.getObject());
        catalogue = new MessageCatalogue(env, locale);
        env.callMethod(
                catalogue,
                new RuntimeArgsWithReferences().add(0, resource),
                "add",
                ArrayLoader.class,
                resource.getObject(),
                domain);
        return ZVal.assign(catalogue);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "subnode",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    private Object flatten(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer messages =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer subnode = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == subnode.getObject()) {
            subnode.setObject(ZVal.getNull());
        }
        Object path = assignParameter(args, 2, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        Object nodePath = null;
        ReferenceContainer value = new BasicReferenceContainer(null);
        Object key = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", subnode.getObject())) {
            subnode = messages;
        }

        for (ZPair zpairResult2140 : ZVal.getIterable(subnode.getObject(), env, false)) {
            key = ZVal.assign(zpairResult2140.getKey());
            value.setObject(ZVal.assign(zpairResult2140.getValue()));
            if (function_is_array.f.env(env).call(value.getObject()).getBool()) {
                nodePath =
                        ZVal.assign(
                                ZVal.isTrue(path)
                                        ? toStringR(path, env) + "." + toStringR(key, env)
                                        : key);
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, messages).add(1, value),
                        "flatten",
                        ArrayLoader.class,
                        messages.getObject(),
                        value.getObject(),
                        nodePath);
                if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", path)) {
                    arrayActionR(ArrayAction.UNSET, messages, env, key);
                }

            } else if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", path)) {
                messages.arrayAccess(env, toStringR(path, env) + "." + toStringR(key, env))
                        .set(value.getObject());
            }
        }

        return null;
    }

    public Object flatten(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\Loader\\ArrayLoader";

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
                    .setName("Symfony\\Component\\Translation\\Loader\\ArrayLoader")
                    .setLookup(
                            ArrayLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Loader/ArrayLoader.php")
                    .addInterface("Symfony\\Component\\Translation\\Loader\\LoaderInterface")
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
