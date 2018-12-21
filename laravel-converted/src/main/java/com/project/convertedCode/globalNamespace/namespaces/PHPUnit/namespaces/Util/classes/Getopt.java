package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Util.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_next;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Util/Getopt.php

*/

public final class Getopt extends RuntimeClassBase {

    public Getopt(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Getopt(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "PHPUnit\\Util\\Getopt";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "args", typeHint = "array")
        @ConvertedParameter(index = 1, name = "short_options", typeHint = "string")
        @ConvertedParameter(
            index = 2,
            name = "long_options",
            typeHint = "array",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object getopt(RuntimeEnv env, Object... args) {
            int runtimeConverterBreakCount;
            int runtimeConverterContinueCount;
            ReferenceContainer ___args =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object short_options = assignParameter(args, 1, false);
            Object long_options = assignParameter(args, 2, true);
            if (null == long_options) {
                long_options = ZVal.getNull();
            }
            ReferenceContainer opts = new BasicReferenceContainer(null);
            ReferenceContainer arg = new BasicReferenceContainer(null);
            Object i = null;
            ReferenceContainer non_opts = new BasicReferenceContainer(null);
            if (ZVal.isEmpty(___args.getObject())) {
                return ZVal.assign(
                        ZVal.newArray(
                                new ZPair(0, ZVal.newArray()), new ZPair(1, ZVal.newArray())));
            }

            opts.setObject(ZVal.newArray());
            non_opts.setObject(ZVal.newArray());
            if (ZVal.isTrue(long_options)) {
                function_sort.f.env(env).call(long_options);
            }

            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, ___args, env, 0, 0))
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(___args.arrayGet(env, 0, 0), "!==", "-"))) {
                function_array_shift.f.env(env).call(___args.getObject());
            }

            function_reset.f.env(env).call(___args.getObject());
            ___args.setObject(
                    function_array_map.f.env(env).call("trim", ___args.getObject()).value());
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            while (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    arg.setObject(function_current.f.env(env).call(___args.getObject()).value()))) {
                i = function_key.f.env(env).call(___args.getObject()).value();
                function_next.f.env(env).call(___args.getObject());
                if (ZVal.strictEqualityCheck(arg.getObject(), "===", "")) {
                    continue;
                }

                if (ZVal.strictEqualityCheck(arg.getObject(), "===", "--")) {
                    non_opts.setObject(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            non_opts.getObject(),
                                            function_array_slice
                                                    .f
                                                    .env(env)
                                                    .call(___args.getObject(), ZVal.add(i, 1))
                                                    .value())
                                    .value());
                    break;
                }

                if (ZVal.toBool(ZVal.strictNotEqualityCheck(arg.arrayGet(env, 0), "!==", "-"))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.isGreaterThan(
                                                                        function_strlen
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        arg
                                                                                                .getObject())
                                                                                .value(),
                                                                        '>',
                                                                        1))
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        arg.arrayGet(env, 1),
                                                                        "===",
                                                                        "-")))
                                        && ZVal.toBool(!ZVal.isTrue(long_options)))) {
                    non_opts.arrayAppend(env).set(___args.arrayGet(env, i));
                    continue;
                }

                if (ZVal.toBool(
                                ZVal.isGreaterThan(
                                        function_strlen.f.env(env).call(arg.getObject()).value(),
                                        '>',
                                        1))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(arg.arrayGet(env, 1), "===", "-"))) {
                    runtimeStaticObject.parseLongOption(
                            env,
                            new RuntimeArgsWithReferences().add(2, opts).add(3, ___args),
                            function_substr.f.env(env).call(arg.getObject(), 2).value(),
                            long_options,
                            opts.getObject(),
                            ___args.getObject());

                } else {
                    runtimeStaticObject.parseShortOption(
                            env,
                            new RuntimeArgsWithReferences().add(2, opts).add(3, ___args),
                            function_substr.f.env(env).call(arg.getObject(), 1).value(),
                            short_options,
                            opts.getObject(),
                            ___args.getObject());
                }
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, opts.getObject()), new ZPair(1, non_opts.getObject())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "arg", typeHint = "string")
        @ConvertedParameter(index = 1, name = "short_options", typeHint = "string")
        @ConvertedParameter(index = 2, name = "opts", typeHint = "array")
        @ConvertedParameter(index = 3, name = "args", typeHint = "array")
        private Object parseShortOption(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            int runtimeConverterBreakCount;
            ReferenceContainer arg = new BasicReferenceContainer(assignParameter(args, 0, false));
            Object short_options = assignParameter(args, 1, false);
            ReferenceContainer opts =
                    assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
            ReferenceContainer ___args =
                    assignParameterRef(runtimePassByReferenceArgs, args, 3, false);
            Object opt = null;
            Object argLen = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object opt_arg = null;
            ReferenceContainer spec = new BasicReferenceContainer(null);
            argLen = function_strlen.f.env(env).call(arg.getObject()).value();
            runtimeConverterBreakCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', argLen);
                    i.setObject(ZVal.increment(i.getObject()))) {
                opt = ZVal.assign(arg.arrayGet(env, i.getObject()));
                opt_arg = ZVal.getNull();
                if (ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        arg.arrayGet(env, i.getObject()), "===", ":"))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        spec.setObject(
                                                NamespaceGlobal.strstr
                                                        .env(env)
                                                        .call(short_options, opt)
                                                        .value()),
                                        "===",
                                        false))) {
                    throw ZVal.getException(
                            env,
                            new Exception(env, "unrecognized option -- " + toStringR(opt, env)));
                }

                if (ZVal.toBool(
                                ZVal.isGreaterThan(
                                        function_strlen.f.env(env).call(spec.getObject()).value(),
                                        '>',
                                        1))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(spec.arrayGet(env, 1), "===", ":"))) {
                    if (ZVal.isLessThan(ZVal.add(i.getObject(), 1), '<', argLen)) {
                        opts.arrayAppend(env)
                                .set(
                                        ZVal.newArray(
                                                new ZPair(0, opt),
                                                new ZPair(
                                                        1,
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        arg.getObject(),
                                                                        ZVal.add(i.getObject(), 1))
                                                                .value())));
                        break;
                    }

                    if (!ZVal.toBool(
                                    ZVal.isGreaterThan(
                                            function_strlen
                                                    .f
                                                    .env(env)
                                                    .call(spec.getObject())
                                                    .value(),
                                            '>',
                                            2))
                            && ZVal.toBool(
                                    ZVal.strictEqualityCheck(spec.arrayGet(env, 2), "===", ":"))) {
                        if (ZVal.strictEqualityCheck(
                                false,
                                "===",
                                opt_arg =
                                        function_current
                                                .f
                                                .env(env)
                                                .call(___args.getObject())
                                                .value())) {
                            throw ZVal.getException(
                                    env,
                                    new Exception(
                                            env,
                                            "option requires an argument -- "
                                                    + toStringR(opt, env)));
                        }

                        function_next.f.env(env).call(___args.getObject());
                    }
                }

                opts.arrayAppend(env).set(ZVal.newArray(new ZPair(0, opt), new ZPair(1, opt_arg)));
            }

            return null;
        }

        public Object parseShortOption(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "arg", typeHint = "string")
        @ConvertedParameter(index = 1, name = "long_options", typeHint = "array")
        @ConvertedParameter(index = 2, name = "opts", typeHint = "array")
        @ConvertedParameter(index = 3, name = "args", typeHint = "array")
        private Object parseLongOption(
                RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
            int runtimeConverterContinueCount;
            Object arg = assignParameter(args, 0, false);
            ReferenceContainer long_options =
                    new BasicReferenceContainer(assignParameter(args, 1, false));
            ReferenceContainer opts =
                    assignParameterRef(runtimePassByReferenceArgs, args, 2, false);
            ReferenceContainer ___args =
                    assignParameterRef(runtimePassByReferenceArgs, args, 3, false);
            Object count = null;
            Object opt_len = null;
            ReferenceContainer i = new BasicReferenceContainer(null);
            Object opt_arg = null;
            ReferenceContainer list = new BasicReferenceContainer(null);
            Object full_option = null;
            Object long_opt = null;
            ReferenceContainer opt = new BasicReferenceContainer(null);
            Object opt_rest = null;
            Object opt_start = null;
            count = function_count.f.env(env).call(long_options.getObject()).value();
            list.setObject(function_explode.f.env(env).call("=", arg).value());
            opt.setObject(ZVal.assign(list.arrayGet(env, 0)));
            opt_arg = ZVal.getNull();
            if (ZVal.isGreaterThan(
                    function_count.f.env(env).call(list.getObject()).value(), '>', 1)) {
                opt_arg = ZVal.assign(list.arrayGet(env, 1));
            }

            opt_len = function_strlen.f.env(env).call(opt.getObject()).value();
            runtimeConverterContinueCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', count);
                    i.setObject(ZVal.increment(i.getObject()))) {
                long_opt = ZVal.assign(long_options.arrayGet(env, i.getObject()));
                opt_start = function_substr.f.env(env).call(long_opt, 0, opt_len).value();
                if (ZVal.strictNotEqualityCheck(opt_start, "!==", opt.getObject())) {
                    continue;
                }

                opt_rest = function_substr.f.env(env).call(long_opt, opt_len).value();
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                ZVal.strictNotEqualityCheck(
                                                                        opt_rest, "!==", ""))
                                                        && ZVal.toBool(
                                                                ZVal.isLessThan(
                                                                        ZVal.add(i.getObject(), 1),
                                                                        '<',
                                                                        count)))
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        opt.arrayGet(env, 0), "!==", "=")))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_strpos
                                                .f
                                                .env(env)
                                                .call(
                                                        long_options.arrayGet(
                                                                env, ZVal.add(i.getObject(), 1)),
                                                        opt.getObject())
                                                .value(),
                                        "===",
                                        0))) {
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    "option --"
                                            + toStringR(opt.getObject(), env)
                                            + " is ambiguous"));
                }

                if (ZVal.strictEqualityCheck(
                        function_substr.f.env(env).call(long_opt, -1).value(), "===", "=")) {
                    if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            function_substr.f.env(env).call(long_opt, -2).value(),
                                            "!==",
                                            "=="))
                            && ZVal.toBool(!function_strlen.f.env(env).call(opt_arg).getBool())) {
                        if (ZVal.strictEqualityCheck(
                                false,
                                "===",
                                opt_arg =
                                        function_current
                                                .f
                                                .env(env)
                                                .call(___args.getObject())
                                                .value())) {
                            throw ZVal.getException(
                                    env,
                                    new Exception(
                                            env,
                                            "option --"
                                                    + toStringR(opt.getObject(), env)
                                                    + " requires an argument"));
                        }

                        function_next.f.env(env).call(___args.getObject());
                    }

                } else if (ZVal.isTrue(opt_arg)) {
                    throw ZVal.getException(
                            env,
                            new Exception(
                                    env,
                                    "option --"
                                            + toStringR(opt.getObject(), env)
                                            + " doesn't allow an argument"));
                }

                full_option =
                        "--"
                                + toStringR(
                                        function_preg_replace
                                                .f
                                                .env(env)
                                                .call("/={1,2}$/", "", long_opt)
                                                .value(),
                                        env);
                opts.arrayAppend(env)
                        .set(ZVal.newArray(new ZPair(0, full_option), new ZPair(1, opt_arg)));
                return null;
            }

            throw ZVal.getException(
                    env,
                    new Exception(env, "unrecognized option --" + toStringR(opt.getObject(), env)));
        }

        public Object parseLongOption(RuntimeEnv env, Object... args) {
            throw new TemporaryStubFunctionException();
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Util\\Getopt")
                    .setLookup(
                            Getopt.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/phpunit/src/Util/Getopt.php")
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
