package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Comparator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.namespaces.Comparator.classes.Comparator;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Comparator/DateComparator.php

*/

public class DateComparator extends Comparator {

    public DateComparator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DateComparator.class) {
            this.__construct(env, args);
        }
    }

    public DateComparator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "test", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object test = assignParameter(args, 0, false);
        Object date = null;
        Object e = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object operator = null;
        Object target = null;
        if (!function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "#^\\s*(==|!=|[<>]=?|after|since|before|until)?\\s*(.+?)\\s*$#i",
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
                                    .call("Don't understand \"%s\" as a date test.", test)
                                    .value()));
        }

        try {
            date = new DateTime(env, matches.arrayGet(env, 2));
            target = env.callMethod(date, "format", DateComparator.class, "U");
        } catch (ConvertedException convertedException254) {
            if (convertedException254.instanceOf(PHPException.class, "Exception")) {
                e = convertedException254.getObject();
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "\"%s\" is not a valid date.",
                                                matches.arrayGet(env, 2))
                                        .value()));
            } else {
                throw convertedException254;
            }
        }

        operator =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, matches, env, 1)
                                ? matches.arrayGet(env, 1)
                                : "==");
        if (ZVal.toBool(ZVal.strictEqualityCheck("since", "===", operator))
                || ZVal.toBool(ZVal.strictEqualityCheck("after", "===", operator))) {
            operator = ">";
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck("until", "===", operator))
                || ZVal.toBool(ZVal.strictEqualityCheck("before", "===", operator))) {
            operator = "<";
        }

        env.callMethod(this, "setOperator", DateComparator.class, operator);
        env.callMethod(this, "setTarget", DateComparator.class, target);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Finder\\Comparator\\DateComparator";

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
                    .setName("Symfony\\Component\\Finder\\Comparator\\DateComparator")
                    .setLookup(
                            DateComparator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("operator", "target")
                    .setFilename("vendor/symfony/finder/Comparator/DateComparator.php")
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
