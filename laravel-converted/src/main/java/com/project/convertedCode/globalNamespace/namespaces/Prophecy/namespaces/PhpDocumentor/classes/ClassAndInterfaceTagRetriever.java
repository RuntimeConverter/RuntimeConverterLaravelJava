package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.ClassTagRetriever;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.LegacyClassTagRetriever;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.MethodTagRetrieverInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/ClassAndInterfaceTagRetriever.php

*/

public final class ClassAndInterfaceTagRetriever extends RuntimeClassBase
        implements MethodTagRetrieverInterface {

    public Object classRetriever = null;

    public ClassAndInterfaceTagRetriever(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ClassAndInterfaceTagRetriever.class) {
            this.__construct(env, args);
        }
    }

    public ClassAndInterfaceTagRetriever(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "classRetriever",
        typeHint = "Prophecy\\PhpDocumentor\\MethodTagRetrieverInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object classRetriever = assignParameter(args, 0, true);
        if (null == classRetriever) {
            classRetriever = ZVal.getNull();
        }
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", classRetriever)) {
            this.classRetriever = classRetriever;
            return null;
        }

        this.classRetriever =
                ZVal.toBool(
                                        function_class_exists
                                                .f
                                                .env(env)
                                                .call("phpDocumentor\\Reflection\\DocBlockFactory")
                                                .value())
                                && ZVal.toBool(
                                        function_class_exists
                                                .f
                                                .env(env)
                                                .call(
                                                        "phpDocumentor\\Reflection\\Types\\ContextFactory")
                                                .value())
                        ? new ClassTagRetriever(env)
                        : new LegacyClassTagRetriever(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    public Object getTagList(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        this.classRetriever,
                                        "getTagList",
                                        ClassAndInterfaceTagRetriever.class,
                                        reflectionClass),
                                this.getInterfacesTagList(env, reflectionClass))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "reflectionClass", typeHint = "ReflectionClass")
    private Object getInterfacesTagList(RuntimeEnv env, Object... args) {
        Object reflectionClass = assignParameter(args, 0, false);
        Object tagList = null;
        Object interfaces = null;
        Object _pInterface = null;
        interfaces =
                env.callMethod(
                        reflectionClass, "getInterfaces", ClassAndInterfaceTagRetriever.class);
        tagList = ZVal.newArray();
        for (ZPair zpairResult964 : ZVal.getIterable(interfaces, env, true)) {
            _pInterface = ZVal.assign(zpairResult964.getValue());
            tagList =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    tagList,
                                    env.callMethod(
                                            this.classRetriever,
                                            "getTagList",
                                            ClassAndInterfaceTagRetriever.class,
                                            _pInterface))
                            .value();
        }

        return ZVal.assign(tagList);
    }

    public static final Object CONST_class =
            "Prophecy\\PhpDocumentor\\ClassAndInterfaceTagRetriever";

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
                    .setName("Prophecy\\PhpDocumentor\\ClassAndInterfaceTagRetriever")
                    .setLookup(
                            ClassAndInterfaceTagRetriever.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("classRetriever")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/PhpDocumentor/ClassAndInterfaceTagRetriever.php")
                    .addInterface("Prophecy\\PhpDocumentor\\MethodTagRetrieverInterface")
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
