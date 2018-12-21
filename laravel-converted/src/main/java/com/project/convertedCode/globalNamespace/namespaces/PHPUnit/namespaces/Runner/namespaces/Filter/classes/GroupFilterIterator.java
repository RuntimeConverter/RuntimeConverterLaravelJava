package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveFilterIterator;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Filter/GroupFilterIterator.php

*/

public abstract class GroupFilterIterator extends RecursiveFilterIterator {

    public Object groupTests = ZVal.newArray();

    public GroupFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == GroupFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public GroupFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "RecursiveIterator")
    @ConvertedParameter(index = 1, name = "groups", typeHint = "array")
    @ConvertedParameter(index = 2, name = "suite", typeHint = "PHPUnit\\Framework\\TestSuite")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object groups = assignParameter(args, 1, false);
        Object suite = assignParameter(args, 2, false);
        Object tests = null;
        Object testHashes = null;
        Object group = null;
        super.__construct(env, iterator);
        for (ZPair zpairResult1211 :
                ZVal.getIterable(
                        env.callMethod(suite, "getGroupDetails", GroupFilterIterator.class),
                        env,
                        false)) {
            group = ZVal.assign(zpairResult1211.getKey());
            tests = ZVal.assign(zpairResult1211.getValue());
            if (function_in_array.f.env(env).call(group, groups, true).getBool()) {
                testHashes = function_array_map.f.env(env).call("spl_object_hash", tests).value();
                this.groupTests =
                        function_array_merge.f.env(env).call(this.groupTests, testHashes).value();
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object test = null;
        test =
                env.callMethod(
                        env.callMethod(this, "getInnerIterator", GroupFilterIterator.class),
                        "current",
                        GroupFilterIterator.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestSuite.class, "PHPUnit\\Framework\\TestSuite"))) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "doAccept",
                        GroupFilterIterator.class,
                        NamespaceGlobal.spl_object_hash.env(env).call(test).value()));
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\Filter\\GroupFilterIterator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends RecursiveFilterIterator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Runner\\Filter\\GroupFilterIterator")
                    .setLookup(
                            GroupFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("groupTests")
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Filter/GroupFilterIterator.php")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
                    .addInterface("OuterIterator")
                    .addInterface("RecursiveIterator")
                    .addExtendsClass("RecursiveFilterIterator")
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
