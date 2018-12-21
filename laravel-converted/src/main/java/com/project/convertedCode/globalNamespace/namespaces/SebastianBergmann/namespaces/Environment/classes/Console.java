package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Environment.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/environment/src/Console.php

*/

public final class Console extends RuntimeClassBase {

    public Console(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Console(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object hasColorSupport(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isWindows(env))) {
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            false,
                                                            "!==",
                                                            NamespaceGlobal.getenv
                                                                    .env(env)
                                                                    .call("ANSICON")
                                                                    .value()))
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            "ON",
                                                            "===",
                                                            NamespaceGlobal.getenv
                                                                    .env(env)
                                                                    .call("ConEmuANSI")
                                                                    .value())))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            "xterm",
                                            "===",
                                            NamespaceGlobal.getenv.env(env).call("TERM").value())));
        }

        if (!function_defined.f.env(env).call("STDOUT").getBool()) {
            return ZVal.assign(false);
        }

        return ZVal.assign(this.isInteractive(env, function_constant.get(env, "STDOUT")));
    }

    @ConvertedMethod
    public Object getNumberOfColumns(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.isWindows(env))) {
            return ZVal.assign(this.getNumberOfColumnsWindows(env));
        }

        if (!ZVal.isTrue(this.isInteractive(env, CONST_STDIN))) {
            return 80;
        }

        return ZVal.assign(this.getNumberOfColumnsInteractive(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fileDescriptor")
    public Object isInteractive(RuntimeEnv env, Object... args) {
        Object fileDescriptor = assignParameter(args, 0, true);
        if (null == fileDescriptor) {
            fileDescriptor = CONST_STDOUT;
        }
        return ZVal.assign(
                ZVal.toBool(function_function_exists.f.env(env).call("posix_isatty").value())
                        && ZVal.toBool(
                                NamespaceGlobal.posix_isatty
                                        .env(env)
                                        .call(fileDescriptor)
                                        .value()));
    }

    @ConvertedMethod
    private Object isWindows(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck("/", "===", "\\"));
    }

    @ConvertedMethod
    private Object getNumberOfColumnsInteractive(RuntimeEnv env, Object... args) {
        ReferenceContainer match = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        if (ZVal.toBool(function_function_exists.f.env(env).call("shell_exec").value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(2, match))
                                        .call(
                                                "#\\d+ (\\d+)#",
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        NamespaceGlobal.shell_exec
                                                                                .env(env)
                                                                                .call("stty size")
                                                                                .value())
                                                        ? ternaryExpressionTemp
                                                        : "",
                                                match.getObject())
                                        .value(),
                                "===",
                                1))) {
            if (ZVal.isGreaterThan(ZVal.toLong(match.arrayGet(env, 1)), '>', 0)) {
                return ZVal.assign(ZVal.toLong(match.arrayGet(env, 1)));
            }
        }

        if (ZVal.toBool(function_function_exists.f.env(env).call("shell_exec").value())
                && ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                function_preg_match
                                        .f
                                        .env(env)
                                        .addReferenceArgs(
                                                new RuntimeArgsWithReferences().add(2, match))
                                        .call(
                                                "#columns = (\\d+);#",
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        NamespaceGlobal.shell_exec
                                                                                .env(env)
                                                                                .call("stty")
                                                                                .value())
                                                        ? ternaryExpressionTemp
                                                        : "",
                                                match.getObject())
                                        .value(),
                                "===",
                                1))) {
            if (ZVal.isGreaterThan(ZVal.toLong(match.arrayGet(env, 1)), '>', 0)) {
                return ZVal.assign(ZVal.toLong(match.arrayGet(env, 1)));
            }
        }

        return 80;
    }

    @ConvertedMethod
    private Object getNumberOfColumnsWindows(RuntimeEnv env, Object... args) {
        Object process = null;
        Object columns = null;
        Object ansicon = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        ReferenceContainer pipes = new BasicReferenceContainer(null);
        Object info = null;
        ansicon = NamespaceGlobal.getenv.env(env).call("ANSICON").value();
        columns = 80;
        if (ZVal.toBool(function_is_string.f.env(env).call(ansicon).value())
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call(
                                        "/^(\\d+)x\\d+ \\(\\d+x(\\d+)\\)$/",
                                        function_trim.f.env(env).call(ansicon).value(),
                                        matches.getObject())
                                .value())) {
            columns = ZVal.assign(matches.arrayGet(env, 1));

        } else if (function_function_exists.f.env(env).call("proc_open").getBool()) {
            process =
                    NamespaceGlobal.proc_open
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                            .call(
                                    "mode CON",
                                    ZVal.newArray(
                                            new ZPair(1, ZVal.arrayFromList("pipe", "w")),
                                            new ZPair(2, ZVal.arrayFromList("pipe", "w"))),
                                    pipes.getObject(),
                                    ZVal.getNull(),
                                    ZVal.getNull(),
                                    ZVal.newArray(new ZPair("suppress_errors", true)))
                            .value();
            if (function_is_resource.f.env(env).call(process).getBool()) {
                info =
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(pipes.arrayGet(env, 1))
                                .value();
                function_fclose.f.env(env).call(pipes.arrayGet(env, 1));
                function_fclose.f.env(env).call(pipes.arrayGet(env, 2));
                NamespaceGlobal.proc_close.env(env).call(process);
                if (function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                "/--------+\\r?\\n.+?(\\d+)\\r?\\n.+?(\\d+)\\r?\\n/",
                                info,
                                matches.getObject())
                        .getBool()) {
                    columns = ZVal.assign(matches.arrayGet(env, 2));
                }
            }
        }

        return ZVal.assign(ZVal.subtract(columns, 1));
    }

    public static final Object CONST_STDIN = 0;

    public static final Object CONST_STDOUT = 1;

    public static final Object CONST_STDERR = 2;

    public static final Object CONST_class = "SebastianBergmann\\Environment\\Console";

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
                    .setName("SebastianBergmann\\Environment\\Console")
                    .setLookup(
                            Console.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/sebastian/environment/src/Console.php")
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
