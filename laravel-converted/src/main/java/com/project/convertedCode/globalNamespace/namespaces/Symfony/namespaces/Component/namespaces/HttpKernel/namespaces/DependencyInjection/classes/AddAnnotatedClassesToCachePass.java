package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes.ClassLoader;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.DebugClassLoader;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.DependencyInjection.classes.Extension;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/DependencyInjection/AddAnnotatedClassesToCachePass.php

*/

public class AddAnnotatedClassesToCachePass extends RuntimeClassBase {

    public Object kernel = null;

    public AddAnnotatedClassesToCachePass(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AddAnnotatedClassesToCachePass.class) {
            this.__construct(env, args);
        }
    }

    public AddAnnotatedClassesToCachePass(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "kernel",
        typeHint = "Symfony\\Component\\HttpKernel\\Kernel"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object kernel = assignParameter(args, 0, false);
        this.kernel = kernel;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Symfony\\Component\\DependencyInjection\\ContainerBuilder"
    )
    public Object process(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object extension = null;
        Object existingClasses = null;
        Object annotatedClasses = null;
        annotatedClasses =
                env.callMethod(
                        this.kernel,
                        "getAnnotatedClassesToCompile",
                        AddAnnotatedClassesToCachePass.class);
        for (ZPair zpairResult1925 :
                ZVal.getIterable(
                        env.callMethod(
                                container, "getExtensions", AddAnnotatedClassesToCachePass.class),
                        env,
                        true)) {
            extension = ZVal.assign(zpairResult1925.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            extension,
                            Extension.class,
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\Extension"))) {
                annotatedClasses =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        annotatedClasses,
                                        env.callMethod(
                                                extension,
                                                "getAnnotatedClassesToCompile",
                                                AddAnnotatedClassesToCachePass.class))
                                .value();
            }
        }

        existingClasses = this.getClassesInComposerClassMaps(env);
        annotatedClasses =
                env.callMethod(
                        env.callMethod(
                                container, "getParameterBag", AddAnnotatedClassesToCachePass.class),
                        "resolveValue",
                        AddAnnotatedClassesToCachePass.class,
                        annotatedClasses);
        env.callMethod(
                this.kernel,
                "setAnnotatedClassCache",
                AddAnnotatedClassesToCachePass.class,
                this.expandClasses(env, annotatedClasses, existingClasses));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns", typeHint = "array")
    @ConvertedParameter(index = 1, name = "classes", typeHint = "array")
    private Object expandClasses(RuntimeEnv env, Object... args) {
        ReferenceContainer patterns = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object classes = assignParameter(args, 1, false);
        Object regexps = null;
        ReferenceContainer expanded = new BasicReferenceContainer(null);
        Object pattern = null;
        Object _pClass = null;
        Object key = null;
        expanded.setObject(ZVal.newArray());
        for (ZPair zpairResult1926 : ZVal.getIterable(patterns.getObject(), env, false)) {
            key = ZVal.assign(zpairResult1926.getKey());
            pattern = ZVal.assign(zpairResult1926.getValue());
            if (ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    "\\",
                                    "!==",
                                    function_substr.f.env(env).call(pattern, -1).value()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    function_strpos.f.env(env).call(pattern, "*").value()))) {
                arrayActionR(ArrayAction.UNSET, patterns, env, key);
                expanded.arrayAppend(env)
                        .set(function_ltrim.f.env(env).call(pattern, "\\").value());
            }
        }

        regexps = this.patternsToRegexps(env, patterns.getObject());
        for (ZPair zpairResult1927 : ZVal.getIterable(classes, env, true)) {
            _pClass = ZVal.assign(zpairResult1927.getValue());
            _pClass = function_ltrim.f.env(env).call(_pClass, "\\").value();
            if (ZVal.isTrue(this.matchAnyRegexps(env, _pClass, regexps))) {
                expanded.arrayAppend(env).set(_pClass);
            }
        }

        return ZVal.assign(function_array_unique.f.env(env).call(expanded.getObject()).value());
    }

    @ConvertedMethod
    private Object getClassesInComposerClassMaps(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object classes = null;
        ReferenceContainer function = new BasicReferenceContainer(null);
        classes = ZVal.newArray();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1928 :
                ZVal.getIterable(
                        NamespaceGlobal.spl_autoload_functions.env(env).call().value(),
                        env,
                        true)) {
            function.setObject(ZVal.assign(zpairResult1928.getValue()));
            if (!function_is_array.f.env(env).call(function.getObject()).getBool()) {
                continue;
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            function.arrayGet(env, 0),
                            DebugClassLoader.class,
                            "Symfony\\Component\\Debug\\DebugClassLoader"))) {
                function.setObject(
                        env.callMethod(
                                function.arrayGet(env, 0),
                                "getClassLoader",
                                AddAnnotatedClassesToCachePass.class));
            }

            if (ZVal.toBool(function_is_array.f.env(env).call(function.getObject()).value())
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    function.arrayGet(env, 0),
                                    ClassLoader.class,
                                    "Composer\\Autoload\\ClassLoader"))) {
                classes =
                        ZAssignment.add(
                                "+=",
                                classes,
                                function_array_filter
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        function.arrayGet(env, 0),
                                                        "getClassMap",
                                                        AddAnnotatedClassesToCachePass.class))
                                        .value());
            }
        }

        return ZVal.assign(function_array_keys.f.env(env).call(classes).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    private Object patternsToRegexps(RuntimeEnv env, Object... args) {
        Object patterns = assignParameter(args, 0, false);
        ReferenceContainer regexps = new BasicReferenceContainer(null);
        Object regex = null;
        Object pattern = null;
        regexps.setObject(ZVal.newArray());
        for (ZPair zpairResult1929 : ZVal.getIterable(patterns, env, true)) {
            pattern = ZVal.assign(zpairResult1929.getValue());
            regex =
                    NamespaceGlobal.preg_quote
                            .env(env)
                            .call(function_ltrim.f.env(env).call(pattern, "\\").value())
                            .value();
            regex =
                    NamespaceGlobal.strtr
                            .env(env)
                            .call(
                                    regex,
                                    ZVal.newArray(
                                            new ZPair("\\*\\*", ".*?"),
                                            new ZPair("\\*", "[^\\\\]*?")))
                            .value();
            if (ZVal.strictNotEqualityCheck(
                    "\\", "!==", function_substr.f.env(env).call(regex, -1).value())) {
                regex = toStringR(regex, env) + "$";
            }

            regexps.arrayAppend(env).set("{^\\\\" + toStringR(regex, env) + "}");
        }

        return ZVal.assign(regexps.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "regexps")
    private Object matchAnyRegexps(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object _pClass = assignParameter(args, 0, false);
        Object regexps = assignParameter(args, 1, false);
        Object blacklisted = null;
        Object regex = null;
        blacklisted =
                ZVal.strictNotEqualityCheck(
                        false, "!==", function_strpos.f.env(env).call(_pClass, "Test").value());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1930 : ZVal.getIterable(regexps, env, true)) {
            regex = ZVal.assign(zpairResult1930.getValue());
            if (ZVal.toBool(blacklisted)
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    function_strpos.f.env(env).call(regex, "Test").value()))) {
                continue;
            }

            if (function_preg_match
                    .f
                    .env(env)
                    .call(regex, "\\" + toStringR(_pClass, env))
                    .getBool()) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\DependencyInjection\\AddAnnotatedClassesToCachePass";

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
                    .setName(
                            "Symfony\\Component\\HttpKernel\\DependencyInjection\\AddAnnotatedClassesToCachePass")
                    .setLookup(
                            AddAnnotatedClassesToCachePass.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("kernel")
                    .setFilename(
                            "vendor/symfony/http-kernel/DependencyInjection/AddAnnotatedClassesToCachePass.php")
                    .addInterface("CompilerPassInterface")
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
