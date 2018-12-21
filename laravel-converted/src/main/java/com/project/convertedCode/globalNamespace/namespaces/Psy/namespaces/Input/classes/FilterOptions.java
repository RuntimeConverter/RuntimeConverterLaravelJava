package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Input/FilterOptions.php

*/

public class FilterOptions extends RuntimeClassBase {

    public Object filter = false;

    public Object pattern = null;

    public Object insensitive = null;

    public Object invert = null;

    public FilterOptions(RuntimeEnv env, Object... args) {
        super(env);
    }

    public FilterOptions(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    public Object bind(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object pattern = null;
        Object insensitive = null;
        this.validateInput(env, input);
        if (!ZVal.isTrue(
                pattern = env.callMethod(input, "getOption", FilterOptions.class, "grep"))) {
            this.filter = false;
            return null;
        }

        if (!ZVal.isTrue(this.stringIsRegex(env, pattern))) {
            pattern =
                    "/"
                            + toStringR(
                                    NamespaceGlobal.preg_quote.env(env).call(pattern, "/").value(),
                                    env)
                            + "/";
        }

        if (ZVal.isTrue(
                insensitive =
                        env.callMethod(input, "getOption", FilterOptions.class, "insensitive"))) {
            pattern = toStringR(pattern, env) + "i";
        }

        this.validateRegex(env, pattern);
        this.filter = true;
        this.pattern = pattern;
        this.insensitive = insensitive;
        this.invert = env.callMethod(input, "getOption", FilterOptions.class, "invert");
        return null;
    }

    @ConvertedMethod
    public Object hasFilter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.filter);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "matches",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object match(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object string = assignParameter(args, 0, false);
        ReferenceContainer matches = assignParameterRef(runtimePassByReferenceArgs, args, 1, true);
        if (null == matches.getObject()) {
            matches.setObject(ZVal.getNull());
        }
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck(this.filter, "===", false))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                function_preg_match
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithReferences()
                                                                        .add(2, matches))
                                                        .call(
                                                                this.pattern,
                                                                string,
                                                                matches.getObject())
                                                        .value())
                                        ^ ZVal.toBool(this.invert)));
    }

    public Object match(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    private Object validateInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object option = null;
        if (!ZVal.isTrue(env.callMethod(input, "getOption", FilterOptions.class, "grep"))) {
            for (ZPair zpairResult1404 :
                    ZVal.getIterable(ZVal.arrayFromList("invert", "insensitive"), env, true)) {
                option = ZVal.assign(zpairResult1404.getValue());
                if (ZVal.isTrue(env.callMethod(input, "getOption", FilterOptions.class, option))) {
                    throw ZVal.getException(
                            env,
                            new RuntimeException(
                                    env,
                                    "--"
                                            + toStringR(option, env)
                                            + " does not make sense without --grep"));
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    private Object stringIsRegex(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(string, 0, 1)
                                                                .value(),
                                                        "===",
                                                        "/"))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(string, -1)
                                                                .value(),
                                                        "===",
                                                        "/")))
                        && ZVal.toBool(
                                ZVal.isGreaterThanOrEqualTo(
                                        function_strlen.f.env(env).call(string).value(), ">=", 3)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    private Object validateRegex(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        Object e = null;
        function_set_error_handler
                .f
                .env(env)
                .call(ZVal.arrayFromList("Psy\\Exception\\ErrorException", "throwException"));
        try {
            function_preg_match.f.env(env).call(pattern, "");
        } catch (ConvertedException convertedException194) {
            if (convertedException194.instanceOf(
                    ErrorException.class, "Psy\\Exception\\ErrorException")) {
                e = convertedException194.getObject();
                function_restore_error_handler.f.env(env).call();
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "preg_match(): ",
                                                "Invalid regular expression: ",
                                                env.callMethod(
                                                        e, "getRawMessage", FilterOptions.class))
                                        .value()));
            } else {
                throw convertedException194;
            }
        }

        function_restore_error_handler.f.env(env).call();
        return null;
    }

    public static final Object CONST_class = "Psy\\Input\\FilterOptions";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getOptions(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    new InputOption(
                                            env,
                                            "grep",
                                            "G",
                                            InputOption.CONST_VALUE_REQUIRED,
                                            "Limit to items matching the given pattern (string or regex).")),
                            new ZPair(
                                    1,
                                    new InputOption(
                                            env,
                                            "insensitive",
                                            "i",
                                            InputOption.CONST_VALUE_NONE,
                                            "Case-insensitive search (requires --grep).")),
                            new ZPair(
                                    2,
                                    new InputOption(
                                            env,
                                            "invert",
                                            "v",
                                            InputOption.CONST_VALUE_NONE,
                                            "Inverted search (requires --grep)."))));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Input\\FilterOptions")
                    .setLookup(
                            FilterOptions.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filter", "insensitive", "invert", "pattern")
                    .setFilename("vendor/psy/psysh/src/Input/FilterOptions.php")
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
