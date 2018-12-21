package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Comparator/Comparator.php

*/

public class Comparator extends RuntimeClassBase {

    public Object target = null;

    public Object operator = "==";

    public Comparator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Comparator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getTarget(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.target);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    public Object setTarget(RuntimeEnv env, Object... args) {
        Object target = assignParameter(args, 0, false);
        this.target = target;
        return null;
    }

    @ConvertedMethod
    public Object getOperator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.operator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "operator")
    public Object setOperator(RuntimeEnv env, Object... args) {
        Object operator = assignParameter(args, 0, false);
        if (!ZVal.isTrue(operator)) {
            operator = "==";
        }

        if (!function_in_array
                .f
                .env(env)
                .call(operator, ZVal.arrayFromList(">", "<", ">=", "<=", "==", "!="))
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Invalid operator \"%s\".", operator)
                                    .value()));
        }

        this.operator = operator;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test")
    public Object test(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        switch (toStringR(this.operator)) {
            case ">":
                return ZVal.assign(ZVal.isGreaterThan(test, '>', this.target));
            case ">=":
                return ZVal.assign(ZVal.isGreaterThanOrEqualTo(test, ">=", this.target));
            case "<":
                return ZVal.assign(ZVal.isLessThan(test, '<', this.target));
            case "<=":
                return ZVal.assign(ZVal.isLessThanOrEqualTo(test, "<=", this.target));
            case "!=":
                return ZVal.assign(ZVal.notEqualityCheck(test, this.target));
        }
        ;
        return ZVal.assign(ZVal.equalityCheck(test, this.target));
    }

    public static final Object CONST_class = "Symfony\\Component\\Finder\\Comparator\\Comparator";

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
                    .setName("Symfony\\Component\\Finder\\Comparator\\Comparator")
                    .setLookup(
                            Comparator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("operator", "target")
                    .setFilename("vendor/symfony/finder/Comparator/Comparator.php")
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
