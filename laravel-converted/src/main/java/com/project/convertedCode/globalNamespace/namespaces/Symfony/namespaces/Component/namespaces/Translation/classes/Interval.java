package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/Interval.php

*/

public class Interval extends RuntimeClassBase {

    public Interval(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Interval(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\Interval";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "number")
        @ConvertedParameter(index = 1, name = "interval")
        public Object test(RuntimeEnv env, Object... args) {
            Object number = assignParameter(args, 0, false);
            Object interval = assignParameter(args, 1, false);
            Object leftNumber = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object n = null;
            Object rightNumber = null;
            interval = function_trim.f.env(env).call(interval).value();
            if (!function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^"
                                    + toStringR(runtimeStaticObject.getIntervalRegexp(env), env)
                                    + "$/x",
                            interval,
                            matches.getObject())
                    .getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("\"%s\" is not a valid interval.", interval)
                                        .value()));
            }

            if (ZVal.isTrue(matches.arrayGet(env, 1))) {
                for (ZPair zpairResult2139 :
                        ZVal.getIterable(
                                function_explode
                                        .f
                                        .env(env)
                                        .call(",", matches.arrayGet(env, 2))
                                        .value(),
                                env,
                                true)) {
                    n = ZVal.assign(zpairResult2139.getValue());
                    if (ZVal.equalityCheck(number, n)) {
                        return ZVal.assign(true);
                    }
                }

            } else {
                leftNumber = runtimeStaticObject.convertNumber(env, matches.arrayGet(env, "left"));
                rightNumber =
                        runtimeStaticObject.convertNumber(env, matches.arrayGet(env, "right"));
                return ZVal.assign(
                        ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                        "[",
                                                        "===",
                                                        matches.arrayGet(env, "left_delimiter"))
                                                ? ZVal.isGreaterThanOrEqualTo(
                                                        number, ">=", leftNumber)
                                                : ZVal.isGreaterThan(number, '>', leftNumber))
                                && ZVal.toBool(
                                        ZVal.strictEqualityCheck(
                                                        "]",
                                                        "===",
                                                        matches.arrayGet(env, "right_delimiter"))
                                                ? ZVal.isLessThanOrEqualTo(
                                                        number, "<=", rightNumber)
                                                : ZVal.isLessThan(number, '<', rightNumber)));
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        public Object getIntervalRegexp(RuntimeEnv env, Object... args) {
            return "        ({\\s*\n            (\\-?\\d+(\\.\\d+)?[\\s*,\\s*\\-?\\d+(\\.\\d+)?]*)\n        \\s*})\n\n            |\n\n        (?P<left_delimiter>[\\[\\]])\n            \\s*\n            (?P<left>-Inf|\\-?\\d+(\\.\\d+)?)\n            \\s*,\\s*\n            (?P<right>\\+?Inf|\\-?\\d+(\\.\\d+)?)\n            \\s*\n        (?P<right_delimiter>[\\[\\]])";
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "number")
        private Object convertNumber(RuntimeEnv env, Object... args) {
            Object number = assignParameter(args, 0, false);
            if (ZVal.strictEqualityCheck("-Inf", "===", number)) {
                return ZVal.assign(NamespaceGlobal.log.env(env).call(0).value());

            } else if (ZVal.toBool(ZVal.strictEqualityCheck("+Inf", "===", number))
                    || ZVal.toBool(ZVal.strictEqualityCheck("Inf", "===", number))) {
                return ZVal.assign(ZVal.minusSign(NamespaceGlobal.log.env(env).call(0).value()));
            }

            return ZVal.assign(ZVal.toDouble(number));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Translation\\Interval")
                    .setLookup(
                            Interval.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/Interval.php")
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
