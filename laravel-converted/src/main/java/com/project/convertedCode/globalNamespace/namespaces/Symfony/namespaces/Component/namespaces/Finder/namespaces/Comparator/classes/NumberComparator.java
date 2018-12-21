package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Comparator.classes.Comparator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Comparator/NumberComparator.php

*/

public class NumberComparator extends Comparator {

    public NumberComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NumberComparator.class) {
            this.__construct(env, args);
        }
    }

    public NumberComparator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test")
    public Object __construct(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object test = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object target = null;
        if (!function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "#^\\s*(==|!=|[<>]=?)?\\s*([0-9\\.]+)\\s*([kmg]i?)?\\s*$#i",
                        test,
                        matches.getObject())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Don't understand \"%s\" as a number test.", test)
                                    .value()));
        }

        target = ZVal.assign(matches.arrayGet(env, 2));
        if (!function_is_numeric.f.env(env).call(target).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Invalid number \"%s\".", target)
                                    .value()));
        }

        if (arrayActionR(ArrayAction.ISSET, matches, env, 3)) {
            switch (toStringR(
                    NamespaceGlobal.strtolower.env(env).call(matches.arrayGet(env, 3)).value())) {
                case "k":
                    target = ZAssignment.multiply("*=", target, 1000);
                    break;
                case "ki":
                    target = ZAssignment.multiply("*=", target, 1024);
                    break;
                case "m":
                    target = ZAssignment.multiply("*=", target, 1000000);
                    break;
                case "mi":
                    target = ZAssignment.multiply("*=", target, ZVal.multiply(1024, 1024));
                    break;
                case "g":
                    target = ZAssignment.multiply("*=", target, 1000000000);
                    break;
                case "gi":
                    target =
                            ZAssignment.multiply(
                                    "*=", target, ZVal.multiply(ZVal.multiply(1024, 1024), 1024));
                    break;
            }
            ;
        }

        env.callMethod(this, "setTarget", NumberComparator.class, target);
        env.callMethod(
                this,
                "setOperator",
                NumberComparator.class,
                arrayActionR(ArrayAction.ISSET, matches, env, 1) ? matches.arrayGet(env, 1) : "==");
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Comparator\\NumberComparator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Comparator.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\Comparator\\NumberComparator")
                    .setLookup(
                            NumberComparator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("operator", "target")
                    .setFilename("vendor/symfony/finder/Comparator/NumberComparator.php")
                    .addExtendsClass("Symfony\\Component\\Finder\\Comparator\\Comparator")
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
