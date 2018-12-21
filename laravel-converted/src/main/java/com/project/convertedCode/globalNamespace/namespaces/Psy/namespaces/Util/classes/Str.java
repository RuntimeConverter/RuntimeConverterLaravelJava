package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Util/Str.php

*/

public class Str extends RuntimeClassBase {

    public Str(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Str(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_UNVIS_RX =
            "/\n    \\\\(?:\n        ((?:040)|s)\n        | (240)\n        | (?: M-(.) )\n        | (?: M\\^(.) )\n        | (?: \\^(.) )\n    )\n/xS";

    public static final Object CONST_class = "Psy\\Util\\Str";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "input")
        public Object unvis(RuntimeEnv env, Object... args) {
            Object input = assignParameter(args, 0, false);
            Object output = null;
            output =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(CONST_UNVIS_RX, "self::unvisReplace", input)
                            .value();
            return ZVal.assign(NamespaceGlobal.stripcslashes.env(env).call(output).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "match")
        protected Object unvisReplace(RuntimeEnv env, Object... args) {
            ReferenceContainer match = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object chr = null;
            Object cp = null;
            if (!arrayActionR(ArrayAction.EMPTY, match, env, 1)) {
                return " ";
            }

            if (!arrayActionR(ArrayAction.EMPTY, match, env, 2)) {
                return ZVal.assign(ZVal.base64Decode("oA=="));
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, match, env, 3))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(match.arrayGet(env, 3), "!==", ""))) {
                chr = ZVal.assign(match.arrayGet(env, 3));
                cp = 128;
                cp = ZAssignment.or("|=", cp, NamespaceGlobal.ord.env(env).call(chr).value());
                return ZVal.assign(NamespaceGlobal.chr.env(env).call(cp).value());
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, match, env, 4))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(match.arrayGet(env, 4), "!==", ""))) {
                chr = ZVal.assign(match.arrayGet(env, 4));
                cp = 128;
                cp =
                        ZAssignment.or(
                                "|=",
                                cp,
                                ZVal.strictEqualityCheck(chr, "===", "?")
                                        ? 127
                                        : ZVal.toLong(
                                                        NamespaceGlobal.ord
                                                                .env(env)
                                                                .call(chr)
                                                                .value())
                                                & ZVal.toLong(31));
                return ZVal.assign(NamespaceGlobal.chr.env(env).call(cp).value());
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, match, env, 5))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(match.arrayGet(env, 5), "!==", ""))) {
                chr = ZVal.assign(match.arrayGet(env, 5));
                cp = 0;
                cp =
                        ZAssignment.or(
                                "|=",
                                cp,
                                ZVal.strictEqualityCheck(chr, "===", "?")
                                        ? 127
                                        : ZVal.toLong(
                                                        NamespaceGlobal.ord
                                                                .env(env)
                                                                .call(chr)
                                                                .value())
                                                & ZVal.toLong(31));
                return ZVal.assign(NamespaceGlobal.chr.env(env).call(cp).value());
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Util\\Str")
                    .setLookup(
                            Str.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/Util/Str.php")
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
