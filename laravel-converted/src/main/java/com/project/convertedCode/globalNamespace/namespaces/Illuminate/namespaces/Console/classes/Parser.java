package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Parser.php

*/

public class Parser extends RuntimeClassBase {

    public Parser(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Parser(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Illuminate\\Console\\Parser";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expression")
        public Object parse(RuntimeEnv env, Object... args) {
            Object expression = assignParameter(args, 0, false);
            Object name = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            name =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Parser.class)
                            .method("name")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(expression)
                            .value();
            if (function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/\\{\\s*(.*?)\\s*\\}/", expression, matches.getObject())
                    .getBool()) {
                if (function_count.f.env(env).call(matches.arrayGet(env, 1)).getBool()) {
                    return ZVal.assign(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            ZVal.newArray(new ZPair(0, name)),
                                            StaticMethodUtils.accessUnknownLateStaticMethod(
                                                            env, this, Parser.class)
                                                    .method("parameters")
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithReferences())
                                                    .call(matches.arrayGet(env, 1))
                                                    .value())
                                    .value());
                }
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, name),
                            new ZPair(1, ZVal.newArray()),
                            new ZPair(2, ZVal.newArray())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "expression")
        protected Object name(RuntimeEnv env, Object... args) {
            Object expression = assignParameter(args, 0, false);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            if (ZVal.strictEqualityCheck(
                    function_trim.f.env(env).call(expression).value(), "===", "")) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(env, "Console command definition is empty."));
            }

            if (!function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call("/[^\\s]+/", expression, matches.getObject())
                    .getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Unable to determine command name from signature."));
            }

            return ZVal.assign(matches.arrayGet(env, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
        protected Object parameters(RuntimeEnv env, Object... args) {
            Object tokens = assignParameter(args, 0, false);
            ReferenceContainer options = new BasicReferenceContainer(null);
            ReferenceContainer arguments = new BasicReferenceContainer(null);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object token = null;
            arguments.setObject(ZVal.newArray());
            options.setObject(ZVal.newArray());
            for (ZPair zpairResult226 : ZVal.getIterable(tokens, env, true)) {
                token = ZVal.assign(zpairResult226.getValue());
                if (function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/-{2,}(.*)/", token, matches.getObject())
                        .getBool()) {
                    options.arrayAppend(env)
                            .set(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Parser.class)
                                            .method("parseOption")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(matches.arrayGet(env, 1))
                                            .value());

                } else {
                    arguments
                            .arrayAppend(env)
                            .set(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Parser.class)
                                            .method("parseArgument")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(token)
                                            .value());
                }
            }

            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, arguments.getObject()),
                            new ZPair(1, options.getObject())));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "token")
        protected Object parseArgument(RuntimeEnv env, Object... args) {
            Object token = assignParameter(args, 0, false);
            Object runtimeTempArrayResult14 = null;
            Object description = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            ZVal.list(
                    runtimeTempArrayResult14 =
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Parser.class)
                                    .method("extractDescription")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(token)
                                    .value(),
                    (token = listGet(runtimeTempArrayResult14, 0, env)),
                    (description = listGet(runtimeTempArrayResult14, 1, env)));
            SwitchEnumType21 switchVariable21 =
                    ZVal.getEnum(
                            true,
                            SwitchEnumType21.DEFAULT_CASE,
                            SwitchEnumType21.DYNAMIC_TYPE_83,
                            Str.runtimeStaticObject.endsWith(env, token, "?*"),
                            SwitchEnumType21.DYNAMIC_TYPE_84,
                            Str.runtimeStaticObject.endsWith(env, token, "*"),
                            SwitchEnumType21.DYNAMIC_TYPE_85,
                            Str.runtimeStaticObject.endsWith(env, token, "?"),
                            SwitchEnumType21.DYNAMIC_TYPE_86,
                            function_preg_match
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call("/(.+)\\=\\*(.+)/", token, matches.getObject())
                                    .value(),
                            SwitchEnumType21.DYNAMIC_TYPE_87,
                            function_preg_match
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call("/(.+)\\=(.+)/", token, matches.getObject())
                                    .value());
            switch (switchVariable21) {
                case DYNAMIC_TYPE_83:
                    return ZVal.assign(
                            new InputArgument(
                                    env,
                                    function_trim.f.env(env).call(token, "?*").value(),
                                    InputArgument.CONST_IS_ARRAY,
                                    description));
                case DYNAMIC_TYPE_84:
                    return ZVal.assign(
                            new InputArgument(
                                    env,
                                    function_trim.f.env(env).call(token, "*").value(),
                                    ZVal.toLong(InputArgument.CONST_IS_ARRAY)
                                            | ZVal.toLong(InputArgument.CONST_REQUIRED),
                                    description));
                case DYNAMIC_TYPE_85:
                    return ZVal.assign(
                            new InputArgument(
                                    env,
                                    function_trim.f.env(env).call(token, "?").value(),
                                    InputArgument.CONST_OPTIONAL,
                                    description));
                case DYNAMIC_TYPE_86:
                    return ZVal.assign(
                            new InputArgument(
                                    env,
                                    matches.arrayGet(env, 1),
                                    InputArgument.CONST_IS_ARRAY,
                                    description,
                                    NamespaceGlobal.preg_split
                                            .env(env)
                                            .call("/,\\s?/", matches.arrayGet(env, 2))
                                            .value()));
                case DYNAMIC_TYPE_87:
                    return ZVal.assign(
                            new InputArgument(
                                    env,
                                    matches.arrayGet(env, 1),
                                    InputArgument.CONST_OPTIONAL,
                                    description,
                                    matches.arrayGet(env, 2)));
                case DEFAULT_CASE:
                    return ZVal.assign(
                            new InputArgument(
                                    env, token, InputArgument.CONST_REQUIRED, description));
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "token")
        protected Object parseOption(RuntimeEnv env, Object... args) {
            Object token = assignParameter(args, 0, false);
            Object shortcut = null;
            Object description = null;
            Object runtimeTempArrayResult15 = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            ZVal.list(
                    runtimeTempArrayResult15 =
                            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Parser.class)
                                    .method("extractDescription")
                                    .addReferenceArgs(new RuntimeArgsWithReferences())
                                    .call(token)
                                    .value(),
                    (token = listGet(runtimeTempArrayResult15, 0, env)),
                    (description = listGet(runtimeTempArrayResult15, 1, env)));
            matches.setObject(
                    NamespaceGlobal.preg_split.env(env).call("/\\s*\\|\\s*/", token, 2).value());
            if (arrayActionR(ArrayAction.ISSET, matches, env, 1)) {
                shortcut = ZVal.assign(matches.arrayGet(env, 0));
                token = ZVal.assign(matches.arrayGet(env, 1));

            } else {
                shortcut = ZVal.getNull();
            }

            SwitchEnumType22 switchVariable22 =
                    ZVal.getEnum(
                            true,
                            SwitchEnumType22.DEFAULT_CASE,
                            SwitchEnumType22.DYNAMIC_TYPE_88,
                            Str.runtimeStaticObject.endsWith(env, token, "="),
                            SwitchEnumType22.DYNAMIC_TYPE_89,
                            Str.runtimeStaticObject.endsWith(env, token, "=*"),
                            SwitchEnumType22.DYNAMIC_TYPE_90,
                            function_preg_match
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call("/(.+)\\=\\*(.+)/", token, matches.getObject())
                                    .value(),
                            SwitchEnumType22.DYNAMIC_TYPE_91,
                            function_preg_match
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call("/(.+)\\=(.+)/", token, matches.getObject())
                                    .value());
            switch (switchVariable22) {
                case DYNAMIC_TYPE_88:
                    return ZVal.assign(
                            new InputOption(
                                    env,
                                    function_trim.f.env(env).call(token, "=").value(),
                                    shortcut,
                                    InputOption.CONST_VALUE_OPTIONAL,
                                    description));
                case DYNAMIC_TYPE_89:
                    return ZVal.assign(
                            new InputOption(
                                    env,
                                    function_trim.f.env(env).call(token, "=*").value(),
                                    shortcut,
                                    ZVal.toLong(InputOption.CONST_VALUE_OPTIONAL)
                                            | ZVal.toLong(InputOption.CONST_VALUE_IS_ARRAY),
                                    description));
                case DYNAMIC_TYPE_90:
                    return ZVal.assign(
                            new InputOption(
                                    env,
                                    matches.arrayGet(env, 1),
                                    shortcut,
                                    ZVal.toLong(InputOption.CONST_VALUE_OPTIONAL)
                                            | ZVal.toLong(InputOption.CONST_VALUE_IS_ARRAY),
                                    description,
                                    NamespaceGlobal.preg_split
                                            .env(env)
                                            .call("/,\\s?/", matches.arrayGet(env, 2))
                                            .value()));
                case DYNAMIC_TYPE_91:
                    return ZVal.assign(
                            new InputOption(
                                    env,
                                    matches.arrayGet(env, 1),
                                    shortcut,
                                    InputOption.CONST_VALUE_OPTIONAL,
                                    description,
                                    matches.arrayGet(env, 2)));
                case DEFAULT_CASE:
                    return ZVal.assign(
                            new InputOption(
                                    env,
                                    token,
                                    shortcut,
                                    InputOption.CONST_VALUE_NONE,
                                    description));
            }
            ;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "token")
        protected Object extractDescription(RuntimeEnv env, Object... args) {
            Object token = assignParameter(args, 0, false);
            Object parts = null;
            parts =
                    NamespaceGlobal.preg_split
                            .env(env)
                            .call("/\\s+:\\s+/", function_trim.f.env(env).call(token).value(), 2)
                            .value();
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                                    function_count.f.env(env).call(parts).value(), "===", 2)
                            ? parts
                            : ZVal.newArray(new ZPair(0, token), new ZPair(1, "")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Console\\Parser")
                    .setLookup(
                            Parser.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/laravel/framework/src/Illuminate/Console/Parser.php")
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

    private enum SwitchEnumType21 {
        DYNAMIC_TYPE_83,
        DYNAMIC_TYPE_84,
        DYNAMIC_TYPE_85,
        DYNAMIC_TYPE_86,
        DYNAMIC_TYPE_87,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType22 {
        DYNAMIC_TYPE_88,
        DYNAMIC_TYPE_89,
        DYNAMIC_TYPE_90,
        DYNAMIC_TYPE_91,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
