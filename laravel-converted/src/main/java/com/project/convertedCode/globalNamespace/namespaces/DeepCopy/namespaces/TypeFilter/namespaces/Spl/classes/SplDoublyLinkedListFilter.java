package com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.namespaces.Spl.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.classes.DeepCopy;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.DeepCopy.namespaces.TypeFilter.classes.TypeFilter;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedListFilter.php

*/

public class SplDoublyLinkedListFilter extends RuntimeClassBase implements TypeFilter {

    public Object copier = null;

    public SplDoublyLinkedListFilter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SplDoublyLinkedListFilter.class) {
            this.__construct(env, args);
        }
    }

    public SplDoublyLinkedListFilter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "copier", typeHint = "DeepCopy\\DeepCopy")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object copier = assignParameter(args, 0, false);
        this.copier = copier;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "element")
    public Object apply(RuntimeEnv env, Object... args) {
        Object element = assignParameter(args, 0, false);
        ReferenceContainer newElement = new BasicReferenceContainer(null);
        Object copy = null;
        newElement.setObject(ZVal.assign(((RuntimeClassInterface) element).phpClone(env)));
        copy = this.createCopyClosure(env);
        return ZVal.assign(
                env.callFunctionDynamic(
                                copy,
                                new RuntimeArgsWithReferences().add(0, newElement),
                                newElement.getObject())
                        .value());
    }

    @ConvertedMethod
    private Object createCopyClosure(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl")
                        .setFile(
                                "/vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedListFilter.php");
        Object copier = null;
        Object copy = null;
        copier = ZVal.assign(this.copier);
        copy =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "DeepCopy\\TypeFilter\\Spl",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "list", typeHint = "SplDoublyLinkedList")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object list = assignParameter(args, 0, false);
                        Object copier = null;
                        ReferenceContainer i = new BasicReferenceContainer(null);
                        Object copy = null;
                        copier = this.contextReferences.getCapturedValue("copier");
                        for (i.setObject(1);
                                ZVal.isLessThanOrEqualTo(
                                        i.getObject(),
                                        "<=",
                                        env.callMethod(
                                                list, "count", SplDoublyLinkedListFilter.class));
                                i.setObject(ZVal.increment(i.getObject()))) {
                            copy =
                                    env.callMethod(
                                            copier,
                                            "recursiveCopy",
                                            SplDoublyLinkedListFilter.class,
                                            env.callMethod(
                                                    list,
                                                    "shift",
                                                    SplDoublyLinkedListFilter.class));
                            env.callMethod(list, "push", SplDoublyLinkedListFilter.class, copy);
                        }

                        return ZVal.assign(list);
                    }
                }.use("copier", copier);
        return ZVal.assign(
                Closure.runtimeStaticObject.bind(env, copy, ZVal.getNull(), DeepCopy.CONST_class));
    }

    public static final Object CONST_class = "DeepCopy\\TypeFilter\\Spl\\SplDoublyLinkedListFilter";

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
                    .setName("DeepCopy\\TypeFilter\\Spl\\SplDoublyLinkedListFilter")
                    .setLookup(
                            SplDoublyLinkedListFilter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("copier")
                    .setFilename(
                            "vendor/myclabs/deep-copy/src/DeepCopy/TypeFilter/Spl/SplDoublyLinkedListFilter.php")
                    .addInterface("DeepCopy\\TypeFilter\\TypeFilter")
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
