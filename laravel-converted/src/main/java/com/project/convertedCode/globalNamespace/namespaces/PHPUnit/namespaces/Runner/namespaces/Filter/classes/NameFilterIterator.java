package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Runner.namespaces.Filter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.RegularExpression;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.TestSuite;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes.Test;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.WarningTestCase;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveFilterIterator;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Runner/Filter/NameFilterIterator.php

*/

public class NameFilterIterator extends RecursiveFilterIterator {

    public Object filter = null;

    public Object filterMin = null;

    public Object filterMax = null;

    public NameFilterIterator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NameFilterIterator.class) {
            this.__construct(env, args);
        }
    }

    public NameFilterIterator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "iterator", typeHint = "RecursiveIterator")
    @ConvertedParameter(index = 1, name = "filter", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object iterator = assignParameter(args, 0, false);
        Object filter = assignParameter(args, 1, false);
        super.__construct(env, iterator);
        this.setFilter(env, filter);
        return null;
    }

    @ConvertedMethod
    public Object accept(RuntimeEnv env, Object... args) {
        Object set = null;
        Object test = null;
        ReferenceContainer tmp = new BasicReferenceContainer(null);
        Object name = null;
        Object accepted = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        test =
                env.callMethod(
                        env.callMethod(this, "getInnerIterator", NameFilterIterator.class),
                        "current",
                        NameFilterIterator.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(test, TestSuite.class, "PHPUnit\\Framework\\TestSuite"))) {
            return ZVal.assign(true);
        }

        tmp.setObject(Test.runtimeStaticObject.describe(env, test));
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        test, WarningTestCase.class, "PHPUnit\\Framework\\WarningTestCase"))) {
            name = env.callMethod(test, "getMessage", NameFilterIterator.class);

        } else {
            if (ZVal.notEqualityCheck(tmp.arrayGet(env, 0), "")) {
                name = NamespaceGlobal.implode.env(env).call("::", tmp.getObject()).value();

            } else {
                name = ZVal.assign(tmp.arrayGet(env, 1));
            }
        }

        accepted =
                function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(this.filter, name, matches.getObject())
                        .value();
        if (ZVal.toBool(accepted) && ZVal.toBool(ZVal.isset(this.filterMax))) {
            set = function_end.f.env(env).call(matches.getObject()).value();
            accepted =
                    ZVal.toBool(ZVal.isGreaterThanOrEqualTo(set, ">=", this.filterMin))
                            && ZVal.toBool(ZVal.isLessThanOrEqualTo(set, "<=", this.filterMax));
        }

        return ZVal.assign(accepted);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filter", typeHint = "string")
    protected Object setFilter(RuntimeEnv env, Object... args) {
        Object filter = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                RegularExpression.runtimeStaticObject.safeMatch(env, filter, ""), "===", false)) {
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^(.*?)#(\\d+)(?:-(\\d+))?$/", filter, matches.getObject())
                    .getBool()) {
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, matches, env, 3))
                        && ZVal.toBool(
                                ZVal.isLessThan(
                                        matches.arrayGet(env, 2), '<', matches.arrayGet(env, 3)))) {
                    filter =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("%s.*with data set #(\\d+)$", matches.arrayGet(env, 1))
                                    .value();
                    this.filterMin = matches.arrayGet(env, 2);
                    this.filterMax = matches.arrayGet(env, 3);

                } else {
                    filter =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s.*with data set #%s$",
                                            matches.arrayGet(env, 1), matches.arrayGet(env, 2))
                                    .value();
                }

            } else if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^(.*?)@(.+)$/", filter, matches.getObject())
                    .getBool()) {
                filter =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s.*with data set \"%s\"$",
                                        matches.arrayGet(env, 1), matches.arrayGet(env, 2))
                                .value();
            }

            filter =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "/%s/",
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call("/", "\\/", filter)
                                            .value())
                            .value();
        }

        this.filter = filter;
        return null;
    }

    public static final Object CONST_class = "PHPUnit\\Runner\\Filter\\NameFilterIterator";

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
                    .setName("PHPUnit\\Runner\\Filter\\NameFilterIterator")
                    .setLookup(
                            NameFilterIterator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "filterMax", "filterMin")
                    .setFilename("vendor/phpunit/phpunit/src/Runner/Filter/NameFilterIterator.php")
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
