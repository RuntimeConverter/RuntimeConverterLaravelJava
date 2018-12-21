package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/HeaderUtils.php

*/

public class HeaderUtils extends RuntimeClassBase {

    public HeaderUtils(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HeaderUtils.class) {
            this.__construct(env, args);
        }
    }

    public HeaderUtils(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    private Object __construct(RuntimeEnv env, Object... args) {
        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\HeaderUtils";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "header", typeHint = "string")
        @ConvertedParameter(index = 1, name = "separators", typeHint = "string")
        public Object split(RuntimeEnv env, Object... args) {
            Object header = assignParameter(args, 0, false);
            Object separators = assignParameter(args, 1, false);
            Object quotedSeparators = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            quotedSeparators = NamespaceGlobal.preg_quote.env(env).call(separators, "/").value();
            function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "\n            /\n                (?!\\s)\n                    (?:\n                        # quoted-string\n                        \"(?:[^\"\\\\]|\\\\.)*(?:\"|\\\\|$)\n                    |\n                        # token\n                        [^\""
                                    + toStringR(quotedSeparators, env)
                                    + "]+\n                    )+\n                (?<!\\s)\n            |\n                # separator\n                \\s*\n                (?<separator>["
                                    + toStringR(quotedSeparators, env)
                                    + "])\n                \\s*\n            /x",
                            function_trim.f.env(env).call(header).value(),
                            matches.getObject(),
                            2);
            return ZVal.assign(
                    runtimeStaticObject.groupParts(env, matches.getObject(), separators));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "parts", typeHint = "array")
        public Object combine(RuntimeEnv env, Object... args) {
            Object parts = assignParameter(args, 0, false);
            ReferenceContainer part = new BasicReferenceContainer(null);
            Object name = null;
            ReferenceContainer assoc = new BasicReferenceContainer(null);
            Object ternaryExpressionTemp = null;
            Object value = null;
            assoc.setObject(ZVal.newArray());
            for (ZPair zpairResult1854 : ZVal.getIterable(parts, env, true)) {
                part.setObject(ZVal.assign(zpairResult1854.getValue()));
                name = NamespaceGlobal.strtolower.env(env).call(part.arrayGet(env, 0)).value();
                value =
                        ZVal.assign(
                                ZVal.isDefined(ternaryExpressionTemp = part.arrayGet(env, 1))
                                        ? ternaryExpressionTemp
                                        : true);
                assoc.arrayAccess(env, name).set(value);
            }

            return ZVal.assign(assoc.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "assoc", typeHint = "array")
        @ConvertedParameter(index = 1, name = "separator", typeHint = "string")
        public Object toString(RuntimeEnv env, Object... args) {
            Object assoc = assignParameter(args, 0, false);
            Object separator = assignParameter(args, 1, false);
            ReferenceContainer parts = new BasicReferenceContainer(null);
            Object name = null;
            Object value = null;
            parts.setObject(ZVal.newArray());
            for (ZPair zpairResult1855 : ZVal.getIterable(assoc, env, false)) {
                name = ZVal.assign(zpairResult1855.getKey());
                value = ZVal.assign(zpairResult1855.getValue());
                if (ZVal.strictEqualityCheck(true, "===", value)) {
                    parts.arrayAppend(env).set(name);

                } else {
                    parts.arrayAppend(env)
                            .set(
                                    toStringR(name, env)
                                            + "="
                                            + toStringR(
                                                    runtimeStaticObject.quote(env, value), env));
                }
            }

            return ZVal.assign(
                    NamespaceGlobal.implode
                            .env(env)
                            .call(toStringR(separator, env) + " ", parts.getObject())
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s", typeHint = "string")
        public Object quote(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            if (function_preg_match.f.env(env).call("/^[a-z0-9!#$%&'*.^_`|~-]+$/i", s).getBool()) {
                return ZVal.assign(s);
            }

            return ZVal.assign(
                    "\""
                            + toStringR(
                                    NamespaceGlobal.addcslashes.env(env).call(s, "\"\\\"").value(),
                                    env)
                            + "\"");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "s", typeHint = "string")
        public Object unquote(RuntimeEnv env, Object... args) {
            Object s = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_preg_replace.f.env(env).call("/\\\\(.)|\"/", "$1", s).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "matches", typeHint = "array")
        @ConvertedParameter(index = 1, name = "separators", typeHint = "string")
        private Object groupParts(RuntimeEnv env, Object... args) {
            ReferenceContainer matches =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            ReferenceContainer separators =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            ReferenceContainer match = new BasicReferenceContainer(null);
            ReferenceContainer parts = new BasicReferenceContainer(null);
            ReferenceContainer i = new BasicReferenceContainer(null);
            ReferenceContainer partMatches = new BasicReferenceContainer(null);
            Object separator = null;
            Object partSeparators = null;
            separator = ZVal.assign(separators.arrayGet(env, 0));
            partSeparators = function_substr.f.env(env).call(separators.getObject(), 1).value();
            i.setObject(0);
            partMatches.setObject(ZVal.newArray());
            for (ZPair zpairResult1856 : ZVal.getIterable(matches.getObject(), env, true)) {
                match.setObject(ZVal.assign(zpairResult1856.getValue()));
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, match, env, "separator"))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        match.arrayGet(env, "separator"), "===", separator))) {
                    i.setObject(ZVal.increment(i.getObject()));

                } else {
                    partMatches.arrayAppend(env, i.getObject()).set(match.getObject());
                }
            }

            parts.setObject(ZVal.newArray());
            if (ZVal.isTrue(partSeparators)) {
                for (ZPair zpairResult1857 : ZVal.getIterable(partMatches.getObject(), env, true)) {
                    matches.setObject(ZVal.assign(zpairResult1857.getValue()));
                    parts.arrayAppend(env)
                            .set(
                                    runtimeStaticObject.groupParts(
                                            env, matches.getObject(), partSeparators));
                }

            } else {
                for (ZPair zpairResult1858 : ZVal.getIterable(partMatches.getObject(), env, true)) {
                    matches.setObject(ZVal.assign(zpairResult1858.getValue()));
                    parts.arrayAppend(env)
                            .set(runtimeStaticObject.unquote(env, matches.arrayGet(env, 0, 0)));
                }
            }

            return ZVal.assign(parts.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\HeaderUtils")
                    .setLookup(
                            HeaderUtils.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-foundation/HeaderUtils.php")
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
