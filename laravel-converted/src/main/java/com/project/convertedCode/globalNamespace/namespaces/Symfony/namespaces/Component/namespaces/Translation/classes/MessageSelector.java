package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.PluralizationRules;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Translation.classes.Interval;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/translation/MessageSelector.php

*/

public class MessageSelector extends RuntimeClassBase {

    public MessageSelector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public MessageSelector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "number")
    @ConvertedParameter(index = 2, name = "locale")
    public Object choose(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object number = assignParameter(args, 1, false);
        Object locale = assignParameter(args, 2, false);
        ReferenceContainer explicitRules = new BasicReferenceContainer(null);
        Object part = null;
        Object parts = null;
        ReferenceContainer standardRules = new BasicReferenceContainer(null);
        Object interval = null;
        Object position = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object m = null;
        parts = ZVal.newArray();
        if (function_preg_match.f.env(env).call("/^\\|++$/", message).getBool()) {
            parts = function_explode.f.env(env).call("|", message).value();

        } else if (function_preg_match_all
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/(?:\\|\\||[^\\|])++/", message, matches.getObject())
                .getBool()) {
            parts = ZVal.assign(matches.arrayGet(env, 0));
        }

        explicitRules.setObject(ZVal.newArray());
        standardRules.setObject(ZVal.newArray());
        for (ZPair zpairResult2161 : ZVal.getIterable(parts, env, true)) {
            part = ZVal.assign(zpairResult2161.getValue());
            part =
                    function_trim
                            .f
                            .env(env)
                            .call(function_str_replace.f.env(env).call("||", "|", part).value())
                            .value();
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^(?P<interval>"
                                    + toStringR(
                                            Interval.runtimeStaticObject.getIntervalRegexp(env),
                                            env)
                                    + ")\\s*(?P<message>.*?)$/xs",
                            part,
                            matches.getObject())
                    .getBool()) {
                explicitRules
                        .arrayAccess(env, matches.arrayGet(env, "interval"))
                        .set(matches.arrayGet(env, "message"));

            } else if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/^\\w+\\:\\s*(.*?)$/", part, matches.getObject())
                    .getBool()) {
                standardRules.arrayAppend(env).set(matches.arrayGet(env, 1));

            } else {
                standardRules.arrayAppend(env).set(part);
            }
        }

        for (ZPair zpairResult2162 : ZVal.getIterable(explicitRules.getObject(), env, false)) {
            interval = ZVal.assign(zpairResult2162.getKey());
            m = ZVal.assign(zpairResult2162.getValue());
            if (ZVal.isTrue(Interval.runtimeStaticObject.test(env, number, interval))) {
                return ZVal.assign(m);
            }
        }

        position = PluralizationRules.runtimeStaticObject.get(env, number, locale);
        if (!arrayActionR(ArrayAction.ISSET, standardRules, env, position)) {
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    1, "===", function_count.f.env(env).call(parts).value()))
                    && ZVal.toBool(arrayActionR(ArrayAction.ISSET, standardRules, env, 0))) {
                return ZVal.assign(standardRules.arrayGet(env, 0));
            }

            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unable to choose a translation for \"%s\" with locale \"%s\" for value \"%d\". Double check that this translation has the correct plural options (e.g. \"There is one apple|There are %%count%% apples\").",
                                            message, locale, number)
                                    .value()));
        }

        return ZVal.assign(standardRules.arrayGet(env, position));
    }

    public static final Object CONST_class = "Symfony\\Component\\Translation\\MessageSelector";

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
                    .setName("Symfony\\Component\\Translation\\MessageSelector")
                    .setLookup(
                            MessageSelector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/translation/MessageSelector.php")
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
