package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.ClassPatch.classes.ClassPatchInterface;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Doubler.namespaces.Generator.namespaces.Node.classes.MethodNode;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.PhpDocumentor.classes.ClassAndInterfaceTagRetriever;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/MagicCallPatch.php

*/

public class MagicCallPatch extends RuntimeClassBase implements ClassPatchInterface {

    public Object tagRetriever = null;

    public MagicCallPatch(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MagicCallPatch.class) {
            this.__construct(env, args);
        }
    }

    public MagicCallPatch(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "tagRetriever",
        typeHint = "Prophecy\\PhpDocumentor\\MethodTagRetrieverInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object tagRetriever = assignParameter(args, 0, true);
        if (null == tagRetriever) {
            tagRetriever = ZVal.getNull();
        }
        this.tagRetriever =
                ZVal.strictEqualityCheck(ZVal.getNull(), "===", tagRetriever)
                        ? new ClassAndInterfaceTagRetriever(env)
                        : tagRetriever;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object supports(RuntimeEnv env, Object... args) {
        Object node = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "node",
        typeHint = "Prophecy\\Doubler\\Generator\\Node\\ClassNode"
    )
    public Object apply(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch")
                        .setFile(
                                "/vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/MagicCallPatch.php");
        int runtimeConverterContinueCount;
        Object node = assignParameter(args, 0, false);
        Object tagList = null;
        ReferenceContainer types = new BasicReferenceContainer(null);
        Object methodNode = null;
        Object methodName = null;
        Object reflectionClass = null;
        Object tag = null;
        Object type = null;
        types.setObject(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                env.callMethod(node, "getInterfaces", MagicCallPatch.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Prophecy\\Doubler\\ClassPatch",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "interface")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _pInterface = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                ZVal.strictNotEqualityCheck(
                                                        0,
                                                        "!==",
                                                        function_strpos
                                                                .f
                                                                .env(env)
                                                                .call(_pInterface, "Prophecy\\")
                                                                .value()));
                                    }
                                })
                        .value());
        types.arrayAppend(env).set(env.callMethod(node, "getParentClass", MagicCallPatch.class));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult949 : ZVal.getIterable(types.getObject(), env, true)) {
            type = ZVal.assign(zpairResult949.getValue());
            reflectionClass = new ReflectionClass(env, type);
            tagList =
                    env.callMethod(
                            this.tagRetriever, "getTagList", MagicCallPatch.class, reflectionClass);
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult950 : ZVal.getIterable(tagList, env, true)) {
                tag = ZVal.assign(zpairResult950.getValue());
                methodName = env.callMethod(tag, "getMethodName", MagicCallPatch.class);
                if (ZVal.isEmpty(methodName)) {
                    continue;
                }

                if (!ZVal.isTrue(
                        env.callMethod(
                                reflectionClass, "hasMethod", MagicCallPatch.class, methodName))) {
                    methodNode = new MethodNode(env, methodName);
                    env.callMethod(
                            methodNode,
                            "setStatic",
                            MagicCallPatch.class,
                            env.callMethod(tag, "isStatic", MagicCallPatch.class));
                    env.callMethod(node, "addMethod", MagicCallPatch.class, methodNode);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getPriority(RuntimeEnv env, Object... args) {
        return 50;
    }

    public static final Object CONST_class = "Prophecy\\Doubler\\ClassPatch\\MagicCallPatch";

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
                    .setName("Prophecy\\Doubler\\ClassPatch\\MagicCallPatch")
                    .setLookup(
                            MagicCallPatch.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("tagRetriever")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Doubler/ClassPatch/MagicCallPatch.php")
                    .addInterface("Prophecy\\Doubler\\ClassPatch\\ClassPatchInterface")
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
