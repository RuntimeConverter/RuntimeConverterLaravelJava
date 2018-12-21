package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
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
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/finder/Glob.php

*/

public class Glob extends RuntimeClassBase {

    public Glob(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Glob(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Symfony\\Component\\Finder\\Glob";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "glob")
        @ConvertedParameter(
            index = 1,
            name = "strictLeadingDot",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "strictWildcardSlash",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        @ConvertedParameter(index = 3, name = "delimiter")
        public Object toRegex(RuntimeEnv env, Object... args) {
            int runtimeConverterContinueCount;
            ReferenceContainer glob = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object strictLeadingDot = assignParameter(args, 1, true);
            if (null == strictLeadingDot) {
                strictLeadingDot = true;
            }
            Object strictWildcardSlash = assignParameter(args, 2, true);
            if (null == strictWildcardSlash) {
                strictWildcardSlash = true;
            }
            Object delimiter = assignParameter(args, 3, true);
            if (null == delimiter) {
                delimiter = "#";
            }
            Object escaping = null;
            ReferenceContainer inCurlies = new BasicReferenceContainer(null);
            Object regex = null;
            Object car = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object sizeGlob = null;
            Object firstByte = null;
            firstByte = true;
            escaping = false;
            inCurlies.setObject(0);
            regex = "";
            sizeGlob = function_strlen.f.env(env).call(glob.getObject()).value();
            runtimeConverterContinueCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', sizeGlob);
                    i.setObject(ZVal.increment(i.getObject()))) {
                car = ZVal.assign(glob.arrayGet(env, i.getObject()));
                if (ZVal.toBool(ZVal.toBool(firstByte) && ZVal.toBool(strictLeadingDot))
                        && ZVal.toBool(ZVal.strictNotEqualityCheck(".", "!==", car))) {
                    regex = toStringR(regex, env) + "(?=[^\\.])";
                }

                firstByte = ZVal.strictEqualityCheck("/", "===", car);
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(firstByte)
                                                                        && ZVal.toBool(
                                                                                strictWildcardSlash))
                                                        && ZVal.toBool(
                                                                arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        glob,
                                                                        env,
                                                                        ZVal.add(
                                                                                i.getObject(), 2))))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "**",
                                                        "===",
                                                        toStringR(
                                                                        glob.arrayGet(
                                                                                env,
                                                                                ZVal.add(
                                                                                        i
                                                                                                .getObject(),
                                                                                        1)),
                                                                        env)
                                                                + toStringR(
                                                                        glob.arrayGet(
                                                                                env,
                                                                                ZVal.add(
                                                                                        i
                                                                                                .getObject(),
                                                                                        2)),
                                                                        env))))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                !arrayActionR(
                                                        ArrayAction.ISSET,
                                                        glob,
                                                        env,
                                                        ZVal.add(i.getObject(), 3)))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "/",
                                                        "===",
                                                        glob.arrayGet(
                                                                env,
                                                                ZVal.add(i.getObject(), 3)))))) {
                    car = "[^/]++/";
                    if (!arrayActionR(ArrayAction.ISSET, glob, env, ZVal.add(i.getObject(), 3))) {
                        car = toStringR(car, env) + "?";
                    }

                    if (ZVal.isTrue(strictLeadingDot)) {
                        car = "(?=[^\\.])" + toStringR(car, env);
                    }

                    car = "/(?:" + toStringR(car, env) + ")*";
                    i.setObject(
                            ZAssignment.add(
                                    "+=",
                                    i.getObject(),
                                    ZVal.add(
                                            2,
                                            arrayActionR(
                                                    ArrayAction.ISSET,
                                                    glob,
                                                    env,
                                                    ZVal.add(i.getObject(), 3)))));
                    if (ZVal.strictEqualityCheck("/", "===", delimiter)) {
                        car = function_str_replace.f.env(env).call("/", "\\/", car).value();
                    }
                }

                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.toBool(
                                                                                ZVal.toBool(
                                                                                                ZVal
                                                                                                                .toBool(
                                                                                                                        ZVal
                                                                                                                                        .toBool(
                                                                                                                                                ZVal
                                                                                                                                                        .strictEqualityCheck(
                                                                                                                                                                delimiter,
                                                                                                                                                                "===",
                                                                                                                                                                car))
                                                                                                                                || ZVal
                                                                                                                                        .toBool(
                                                                                                                                                ZVal
                                                                                                                                                        .strictEqualityCheck(
                                                                                                                                                                ".",
                                                                                                                                                                "===",
                                                                                                                                                                car)))
                                                                                                        || ZVal
                                                                                                                .toBool(
                                                                                                                        ZVal
                                                                                                                                .strictEqualityCheck(
                                                                                                                                        "(",
                                                                                                                                        "===",
                                                                                                                                        car)))
                                                                                        || ZVal
                                                                                                .toBool(
                                                                                                        ZVal
                                                                                                                .strictEqualityCheck(
                                                                                                                        ")",
                                                                                                                        "===",
                                                                                                                        car)))
                                                                        || ZVal.toBool(
                                                                                ZVal
                                                                                        .strictEqualityCheck(
                                                                                                "|",
                                                                                                "===",
                                                                                                car)))
                                                        || ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        "+", "===", car)))
                                        || ZVal.toBool(ZVal.strictEqualityCheck("^", "===", car)))
                        || ZVal.toBool(ZVal.strictEqualityCheck("$", "===", car))) {
                    regex = toStringR(regex, env) + toStringR("\\" + toStringR(car, env), env);

                } else if (ZVal.strictEqualityCheck("*", "===", car)) {
                    regex =
                            toStringR(regex, env)
                                    + toStringR(
                                            ZVal.isTrue(escaping)
                                                    ? "\\*"
                                                    : ZVal.isTrue(strictWildcardSlash)
                                                            ? "[^/]*"
                                                            : ".*",
                                            env);

                } else if (ZVal.strictEqualityCheck("?", "===", car)) {
                    regex =
                            toStringR(regex, env)
                                    + toStringR(
                                            ZVal.isTrue(escaping)
                                                    ? "\\?"
                                                    : ZVal.isTrue(strictWildcardSlash)
                                                            ? "[^/]"
                                                            : ".",
                                            env);

                } else if (ZVal.strictEqualityCheck("{", "===", car)) {
                    regex =
                            toStringR(regex, env)
                                    + toStringR(ZVal.isTrue(escaping) ? "\\{" : "(", env);
                    if (!ZVal.isTrue(escaping)) {
                        inCurlies.setObject(ZVal.increment(inCurlies.getObject()));
                    }

                } else if (ZVal.toBool(ZVal.strictEqualityCheck("}", "===", car))
                        && ZVal.toBool(inCurlies.getObject())) {
                    regex =
                            toStringR(regex, env)
                                    + toStringR(ZVal.isTrue(escaping) ? "}" : ")", env);
                    if (!ZVal.isTrue(escaping)) {
                        inCurlies.setObject(ZVal.decrement(inCurlies.getObject()));
                    }

                } else if (ZVal.toBool(ZVal.strictEqualityCheck(",", "===", car))
                        && ZVal.toBool(inCurlies.getObject())) {
                    regex =
                            toStringR(regex, env)
                                    + toStringR(ZVal.isTrue(escaping) ? "," : "|", env);

                } else if (ZVal.strictEqualityCheck("\\", "===", car)) {
                    if (ZVal.isTrue(escaping)) {
                        regex = toStringR(regex, env) + "\\\\";
                        escaping = false;

                    } else {
                        escaping = true;
                    }

                    continue;

                } else {
                    regex = toStringR(regex, env) + toStringR(car, env);
                }

                escaping = false;
            }

            return ZVal.assign(
                    toStringR(delimiter, env)
                            + "^"
                            + toStringR(regex, env)
                            + "$"
                            + toStringR(delimiter, env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Finder\\Glob")
                    .setLookup(
                            Glob.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/symfony/finder/Glob.php")
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
