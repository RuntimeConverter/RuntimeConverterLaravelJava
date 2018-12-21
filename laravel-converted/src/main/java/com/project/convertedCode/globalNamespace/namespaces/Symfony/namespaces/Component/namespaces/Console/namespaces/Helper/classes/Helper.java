package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.HelperInterface;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/Helper.php

*/

public abstract class Helper extends RuntimeClassBase implements HelperInterface {

    public Object helperSet = ZVal.getNull();

    public Helper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Helper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "helperSet",
        typeHint = "Symfony\\Component\\Console\\Helper\\HelperSet",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setHelperSet(RuntimeEnv env, Object... args) {
        Object helperSet = assignParameter(args, 0, true);
        if (null == helperSet) {
            helperSet = ZVal.getNull();
        }
        this.helperSet = helperSet;
        return null;
    }

    @ConvertedMethod
    public Object getHelperSet(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.helperSet);
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\Helper";

    @ConvertedMethod()
    public abstract Object getName(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object strlen(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            Object encoding = null;
            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    encoding =
                            NamespaceGlobal.mb_detect_encoding
                                    .env(env)
                                    .call(string, ZVal.getNull(), true)
                                    .value())) {
                return ZVal.assign(function_strlen.f.env(env).call(string).value());
            }

            return ZVal.assign(NamespaceGlobal.mb_strwidth.env(env).call(string, encoding).value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        @ConvertedParameter(index = 1, name = "from")
        @ConvertedParameter(
            index = 2,
            name = "length",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object substr(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            Object from = assignParameter(args, 1, false);
            Object length = assignParameter(args, 2, true);
            if (null == length) {
                length = ZVal.getNull();
            }
            Object encoding = null;
            if (ZVal.strictEqualityCheck(
                    false,
                    "===",
                    encoding =
                            NamespaceGlobal.mb_detect_encoding
                                    .env(env)
                                    .call(string, ZVal.getNull(), true)
                                    .value())) {
                return ZVal.assign(function_substr.f.env(env).call(string, from, length).value());
            }

            return ZVal.assign(
                    NamespaceGlobal.mb_substr
                            .env(env)
                            .call(string, from, length, encoding)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "secs")
        public Object formatTime(RuntimeEnv env, Object... args) {
            Object secs = assignParameter(args, 0, false);
            ReferenceContainer format = new BasicReferenceContainer(null);
            Object index = null;
            ReferenceContainer timeFormats = new BasicReferenceContainer(null);
            timeFormats =
                    env.getInlineStatic(
                            25,
                            ZVal.newArray(
                                    new ZPair(0, ZVal.arrayFromList(0, "< 1 sec")),
                                    new ZPair(1, ZVal.arrayFromList(1, "1 sec")),
                                    new ZPair(2, ZVal.arrayFromList(2, "secs", 1)),
                                    new ZPair(3, ZVal.arrayFromList(60, "1 min")),
                                    new ZPair(4, ZVal.arrayFromList(120, "mins", 60)),
                                    new ZPair(5, ZVal.arrayFromList(3600, "1 hr")),
                                    new ZPair(6, ZVal.arrayFromList(7200, "hrs", 3600)),
                                    new ZPair(7, ZVal.arrayFromList(86400, "1 day")),
                                    new ZPair(8, ZVal.arrayFromList(172800, "days", 86400))));
            for (ZPair zpairResult1689 : ZVal.getIterable(timeFormats.getObject(), env, false)) {
                index = ZVal.assign(zpairResult1689.getKey());
                format.setObject(ZVal.assign(zpairResult1689.getValue()));
                if (ZVal.isGreaterThanOrEqualTo(secs, ">=", format.arrayGet(env, 0))) {
                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    arrayActionR(
                                                            ArrayAction.ISSET,
                                                            timeFormats,
                                                            env,
                                                            ZVal.add(index, 1)))
                                            && ZVal.toBool(
                                                    ZVal.isLessThan(
                                                            secs,
                                                            '<',
                                                            timeFormats.arrayGet(
                                                                    env, ZVal.add(index, 1), 0))))
                            || ZVal.toBool(
                                    ZVal.equalityCheck(
                                            index,
                                            ZVal.subtract(
                                                    function_count
                                                            .f
                                                            .env(env)
                                                            .call(timeFormats.getObject())
                                                            .value(),
                                                    1)))) {
                        if (ZVal.equalityCheck(
                                2, function_count.f.env(env).call(format.getObject()).value())) {
                            return ZVal.assign(format.arrayGet(env, 1));
                        }

                        return ZVal.assign(
                                toStringR(
                                                function_floor
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                ZVal.divide(
                                                                        secs,
                                                                        format.arrayGet(env, 2)))
                                                        .value(),
                                                env)
                                        + " "
                                        + toStringR(format.arrayGet(env, 1), env));
                    }
                }
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "memory")
        public Object formatMemory(RuntimeEnv env, Object... args) {
            Object memory = assignParameter(args, 0, false);
            if (ZVal.isGreaterThanOrEqualTo(
                    memory, ">=", ZVal.multiply(ZVal.multiply(1024, 1024), 1024))) {
                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%.1f GiB",
                                        ZVal.divide(
                                                ZVal.divide(ZVal.divide(memory, 1024), 1024), 1024))
                                .value());
            }

            if (ZVal.isGreaterThanOrEqualTo(memory, ">=", ZVal.multiply(1024, 1024))) {
                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call("%.1f MiB", ZVal.divide(ZVal.divide(memory, 1024), 1024))
                                .value());
            }

            if (ZVal.isGreaterThanOrEqualTo(memory, ">=", 1024)) {
                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call("%d KiB", ZVal.divide(memory, 1024))
                                .value());
            }

            return ZVal.assign(function_sprintf.f.env(env).call("%d B", memory).value());
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "formatter",
            typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface"
        )
        @ConvertedParameter(index = 1, name = "string")
        public Object strlenWithoutDecoration(RuntimeEnv env, Object... args) {
            Object formatter = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            return ZVal.assign(
                    runtimeStaticObject.strlen(
                            env, runtimeStaticObject.removeDecoration(env, formatter, string)));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "formatter",
            typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatterInterface"
        )
        @ConvertedParameter(index = 1, name = "string")
        public Object removeDecoration(RuntimeEnv env, Object... args) {
            Object formatter = assignParameter(args, 0, false);
            Object string = assignParameter(args, 1, false);
            Object isDecorated = null;
            isDecorated = env.callMethod(formatter, "isDecorated", Helper.class);
            env.callMethod(formatter, "setDecorated", Helper.class, false);
            string = env.callMethod(formatter, "format", Helper.class, string);
            string = function_preg_replace.f.env(env).call("/\u001B\\[[^m]*m/", "", string).value();
            env.callMethod(formatter, "setDecorated", Helper.class, isDecorated);
            return ZVal.assign(string);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\Helper")
                    .setLookup(
                            Helper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("helperSet")
                    .setFilename("vendor/symfony/console/Helper/Helper.php")
                    .addInterface("Symfony\\Component\\Console\\Helper\\HelperInterface")
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
