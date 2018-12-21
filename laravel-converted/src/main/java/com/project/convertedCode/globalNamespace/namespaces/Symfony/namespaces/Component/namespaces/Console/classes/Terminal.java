package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Terminal.php

*/

public class Terminal extends RuntimeClassBase {

    public Terminal(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Terminal(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getWidth(RuntimeEnv env, Object... args) {
        Object width = null;
        Object ternaryExpressionTemp = null;
        width = NamespaceGlobal.getenv.env(env).call("COLUMNS").value();
        if (ZVal.strictNotEqualityCheck(false, "!==", width)) {
            return ZVal.assign(ZVal.toLong(function_trim.f.env(env).call(width).value()));
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Console
                                        .classes
                                        .Terminal
                                        .RequestStaticProperties
                                        .class)
                        .width)) {
            runtimeStaticObject.initDimensions(env);
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .Console
                                                                .classes
                                                                .Terminal
                                                                .RequestStaticProperties
                                                                .class)
                                                .width)
                        ? ternaryExpressionTemp
                        : 80);
    }

    @ConvertedMethod
    public Object getHeight(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        Object height = null;
        height = NamespaceGlobal.getenv.env(env).call("LINES").value();
        if (ZVal.strictNotEqualityCheck(false, "!==", height)) {
            return ZVal.assign(ZVal.toLong(function_trim.f.env(env).call(height).value()));
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .Console
                                        .classes
                                        .Terminal
                                        .RequestStaticProperties
                                        .class)
                        .height)) {
            runtimeStaticObject.initDimensions(env);
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .Console
                                                                .classes
                                                                .Terminal
                                                                .RequestStaticProperties
                                                                .class)
                                                .height)
                        ? ternaryExpressionTemp
                        : 50);
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Terminal";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        private Object initDimensions(RuntimeEnv env, Object... args) {
            Object sttyString = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            ReferenceContainer dimensions = new BasicReferenceContainer(null);
            if (ZVal.strictEqualityCheck("\\", "===", "/")) {
                if (function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                "/^(\\d+)x(\\d+)(?: \\((\\d+)x(\\d+)\\))?$/",
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.getenv
                                                        .env(env)
                                                        .call("ANSICON")
                                                        .value())
                                        .value(),
                                matches.getObject())
                        .getBool()) {
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .classes
                                                    .Terminal
                                                    .RequestStaticProperties
                                                    .class)
                                    .width =
                            ZVal.toLong(matches.arrayGet(env, 1));
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .classes
                                                    .Terminal
                                                    .RequestStaticProperties
                                                    .class)
                                    .height =
                            arrayActionR(ArrayAction.ISSET, matches, env, 4)
                                    ? ZVal.toLong(matches.arrayGet(env, 4))
                                    : ZVal.toLong(matches.arrayGet(env, 2));

                } else if (ZVal.strictNotEqualityCheck(
                        ZVal.getNull(),
                        "!==",
                        dimensions.setObject(runtimeStaticObject.getConsoleMode(env)))) {
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .classes
                                                    .Terminal
                                                    .RequestStaticProperties
                                                    .class)
                                    .width =
                            ZVal.toLong(dimensions.arrayGet(env, 0));
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .classes
                                                    .Terminal
                                                    .RequestStaticProperties
                                                    .class)
                                    .height =
                            ZVal.toLong(dimensions.arrayGet(env, 1));
                }

            } else if (ZVal.isTrue(sttyString = runtimeStaticObject.getSttyColumns(env))) {
                if (function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/rows.(\\d+);.columns.(\\d+);/i", sttyString, matches.getObject())
                        .getBool()) {
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .classes
                                                    .Terminal
                                                    .RequestStaticProperties
                                                    .class)
                                    .width =
                            ZVal.toLong(matches.arrayGet(env, 2));
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .classes
                                                    .Terminal
                                                    .RequestStaticProperties
                                                    .class)
                                    .height =
                            ZVal.toLong(matches.arrayGet(env, 1));

                } else if (function_preg_match
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call("/;.(\\d+).rows;.(\\d+).columns/i", sttyString, matches.getObject())
                        .getBool()) {
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .classes
                                                    .Terminal
                                                    .RequestStaticProperties
                                                    .class)
                                    .width =
                            ZVal.toLong(matches.arrayGet(env, 2));
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .Console
                                                    .classes
                                                    .Terminal
                                                    .RequestStaticProperties
                                                    .class)
                                    .height =
                            ZVal.toLong(matches.arrayGet(env, 1));
                }
            }

            return null;
        }

        @ConvertedMethod
        private Object getConsoleMode(RuntimeEnv env, Object... args) {
            Object process = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            ReferenceContainer pipes = new BasicReferenceContainer(null);
            Object descriptorspec = null;
            Object info = null;
            if (!function_function_exists.f.env(env).call("proc_open").getBool()) {
                return null;
            }

            descriptorspec =
                    ZVal.newArray(
                            new ZPair(1, ZVal.arrayFromList("pipe", "w")),
                            new ZPair(2, ZVal.arrayFromList("pipe", "w")));
            process =
                    NamespaceGlobal.proc_open
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                            .call(
                                    "mode CON",
                                    descriptorspec,
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
                    return ZVal.assign(
                            ZVal.newArray(
                                    new ZPair(0, ZVal.toLong(matches.arrayGet(env, 2))),
                                    new ZPair(1, ZVal.toLong(matches.arrayGet(env, 1)))));
                }
            }

            return null;
        }

        @ConvertedMethod
        private Object getSttyColumns(RuntimeEnv env, Object... args) {
            Object process = null;
            ReferenceContainer pipes = new BasicReferenceContainer(null);
            Object descriptorspec = null;
            Object info = null;
            if (!function_function_exists.f.env(env).call("proc_open").getBool()) {
                return null;
            }

            descriptorspec =
                    ZVal.newArray(
                            new ZPair(1, ZVal.arrayFromList("pipe", "w")),
                            new ZPair(2, ZVal.arrayFromList("pipe", "w")));
            process =
                    NamespaceGlobal.proc_open
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                            .call(
                                    "stty -a | grep columns",
                                    descriptorspec,
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
                return ZVal.assign(info);
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object width = null;

        public Object height = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Terminal")
                    .setLookup(
                            Terminal.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("height", "width")
                    .setFilename("vendor/symfony/console/Terminal.php")
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
