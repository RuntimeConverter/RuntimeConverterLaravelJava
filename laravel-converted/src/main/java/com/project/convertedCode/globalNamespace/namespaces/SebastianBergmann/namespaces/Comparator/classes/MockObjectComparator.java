package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ObjectComparator;
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
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.MockObject;
import com.project.convertedCode.globalNamespace.classes.PHPUnit_Framework_MockObject_MockObject;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/MockObjectComparator.php

*/

public class MockObjectComparator extends ObjectComparator {

    public MockObjectComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MockObjectComparator.class) {
            this.__construct(env, args);
        }
    }

    public MockObjectComparator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object accepts(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, false);
        Object actual = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        expected,
                                                        PHPUnit_Framework_MockObject_MockObject
                                                                .class,
                                                        "PHPUnit_Framework_MockObject_MockObject"))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        expected,
                                                        MockObject.class,
                                                        "PHPUnit\\Framework\\MockObject\\MockObject")))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        actual,
                                                        PHPUnit_Framework_MockObject_MockObject
                                                                .class,
                                                        "PHPUnit_Framework_MockObject_MockObject"))
                                        || ZVal.toBool(
                                                ZVal.checkInstanceType(
                                                        actual,
                                                        MockObject.class,
                                                        "PHPUnit\\Framework\\MockObject\\MockObject"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    protected Object toArray(RuntimeEnv env, Object... args) {
        Object _object = assignParameter(args, 0, false);
        ReferenceContainer array = new BasicReferenceContainer(null);
        array.setObject(super.toArray(env, _object));
        arrayActionR(ArrayAction.UNSET, array, env, "__phpunit_invocationMocker");
        return ZVal.assign(array.getObject());
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\MockObjectComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ObjectComparator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\MockObjectComparator")
                    .setLookup(
                            MockObjectComparator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exporter", "factory")
                    .setFilename("vendor/sebastian/comparator/src/MockObjectComparator.php")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ObjectComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\ArrayComparator")
                    .addExtendsClass("SebastianBergmann\\Comparator\\Comparator")
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
