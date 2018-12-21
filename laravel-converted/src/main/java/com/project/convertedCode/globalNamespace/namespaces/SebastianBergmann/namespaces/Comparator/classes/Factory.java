package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ObjectComparator;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.DateTimeComparator;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ScalarComparator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.NumericComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ArrayComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ResourceComparator;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.DOMNodeComparator;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.DoubleComparator;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.ExceptionComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.TypeComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.SplObjectStorageComparator;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Comparator.classes.MockObjectComparator;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/comparator/src/Factory.php

*/

public class Factory extends RuntimeClassBase {

    public Object customComparators = ZVal.newArray();

    public Object defaultComparators = ZVal.newArray();

    public Factory(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Factory.class) {
            this.__construct(env, args);
        }
    }

    public Factory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.registerDefaultComparators(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expected")
    @ConvertedParameter(index = 1, name = "actual")
    public Object getComparatorFor(RuntimeEnv env, Object... args) {
        Object expected = assignParameter(args, 0, false);
        Object actual = assignParameter(args, 1, false);
        Object comparator = null;
        for (ZPair zpairResult1435 : ZVal.getIterable(this.customComparators, env, true)) {
            comparator = ZVal.assign(zpairResult1435.getValue());
            if (ZVal.isTrue(
                    env.callMethod(comparator, "accepts", Factory.class, expected, actual))) {
                return ZVal.assign(comparator);
            }
        }

        for (ZPair zpairResult1436 : ZVal.getIterable(this.defaultComparators, env, true)) {
            comparator = ZVal.assign(zpairResult1436.getValue());
            if (ZVal.isTrue(
                    env.callMethod(comparator, "accepts", Factory.class, expected, actual))) {
                return ZVal.assign(comparator);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "comparator",
        typeHint = "SebastianBergmann\\Comparator\\Comparator"
    )
    public Object register(RuntimeEnv env, Object... args) {
        Object comparator = assignParameter(args, 0, false);
        function_array_unshift.f.env(env).call(this.customComparators, comparator);
        env.callMethod(comparator, "setFactory", Factory.class, this);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "comparator",
        typeHint = "SebastianBergmann\\Comparator\\Comparator"
    )
    public Object unregister(RuntimeEnv env, Object... args) {
        Object comparator = assignParameter(args, 0, false);
        Object _comparator = null;
        Object key = null;
        for (ZPair zpairResult1437 : ZVal.getIterable(this.customComparators, env, false)) {
            key = ZVal.assign(zpairResult1437.getKey());
            _comparator = ZVal.assign(zpairResult1437.getValue());
            if (ZVal.strictEqualityCheck(comparator, "===", _comparator)) {
                arrayActionR(
                        ArrayAction.UNSET,
                        new ReferenceClassProperty(this, "customComparators", env),
                        env,
                        key);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object reset(RuntimeEnv env, Object... args) {
        this.customComparators = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    private Object registerDefaultComparators(RuntimeEnv env, Object... args) {
        this.registerDefaultComparator(env, new TypeComparator(env));
        this.registerDefaultComparator(env, new ScalarComparator(env));
        this.registerDefaultComparator(env, new NumericComparator(env));
        this.registerDefaultComparator(env, new DoubleComparator(env));
        this.registerDefaultComparator(env, new ArrayComparator(env));
        this.registerDefaultComparator(env, new ResourceComparator(env));
        this.registerDefaultComparator(env, new ObjectComparator(env));
        this.registerDefaultComparator(env, new ExceptionComparator(env));
        this.registerDefaultComparator(env, new SplObjectStorageComparator(env));
        this.registerDefaultComparator(env, new DOMNodeComparator(env));
        this.registerDefaultComparator(env, new MockObjectComparator(env));
        this.registerDefaultComparator(env, new DateTimeComparator(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "comparator",
        typeHint = "SebastianBergmann\\Comparator\\Comparator"
    )
    private Object registerDefaultComparator(RuntimeEnv env, Object... args) {
        Object comparator = assignParameter(args, 0, false);
        function_array_unshift.f.env(env).call(this.defaultComparators, comparator);
        env.callMethod(comparator, "setFactory", Factory.class, this);
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\Comparator\\Factory";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getInstance(RuntimeEnv env, Object... args) {
            if (ZVal.strictEqualityCheck(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
                                            .namespaces
                                            .Comparator
                                            .classes
                                            .Factory
                                            .RequestStaticProperties
                                            .class)
                            .instance,
                    "===",
                    ZVal.getNull())) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .SebastianBergmann
                                                .namespaces
                                                .Comparator
                                                .classes
                                                .Factory
                                                .RequestStaticProperties
                                                .class)
                                .instance =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .SebastianBergmann
                                .namespaces
                                .Comparator
                                .classes
                                .Factory(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .SebastianBergmann
                                            .namespaces
                                            .Comparator
                                            .classes
                                            .Factory
                                            .RequestStaticProperties
                                            .class)
                            .instance);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instance = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\Comparator\\Factory")
                    .setLookup(
                            Factory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("customComparators", "defaultComparators")
                    .setStaticPropertyNames("instance")
                    .setFilename("vendor/sebastian/comparator/src/Factory.php")
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
