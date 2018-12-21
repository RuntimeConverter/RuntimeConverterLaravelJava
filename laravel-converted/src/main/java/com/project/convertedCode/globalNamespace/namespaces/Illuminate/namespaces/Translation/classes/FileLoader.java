package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Translation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace_recursive;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Translation.classes.Loader;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Translation/FileLoader.php

*/

public class FileLoader extends RuntimeClassBase implements Loader {

    public Object files = null;

    public Object path = null;

    public Object jsonPaths = ZVal.newArray();

    public Object hints = ZVal.newArray();

    public FileLoader(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileLoader.class) {
            this.__construct(env, args);
        }
    }

    public FileLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "Illuminate\\Filesystem\\Filesystem")
    @ConvertedParameter(index = 1, name = "path")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        this.path = path;
        this.files = files;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "group")
    @ConvertedParameter(
        index = 2,
        name = "namespace",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object load(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object group = assignParameter(args, 1, false);
        Object namespace = assignParameter(args, 2, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        if (ZVal.toBool(ZVal.equalityCheck(group, "*"))
                && ZVal.toBool(ZVal.equalityCheck(namespace, "*"))) {
            return ZVal.assign(this.loadJsonPaths(env, locale));
        }

        if (ZVal.toBool(function_is_null.f.env(env).call(namespace).value())
                || ZVal.toBool(ZVal.equalityCheck(namespace, "*"))) {
            return ZVal.assign(this.loadPath(env, this.path, locale, group));
        }

        return ZVal.assign(this.loadNamespaced(env, locale, group, namespace));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    @ConvertedParameter(index = 1, name = "group")
    @ConvertedParameter(index = 2, name = "namespace")
    protected Object loadNamespaced(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        Object group = assignParameter(args, 1, false);
        Object namespace = assignParameter(args, 2, false);
        Object lines = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "hints", env),
                env,
                namespace)) {
            lines =
                    this.loadPath(
                            env,
                            new ReferenceClassProperty(this, "hints", env).arrayGet(env, namespace),
                            locale,
                            group);
            return ZVal.assign(this.loadNamespaceOverrides(env, lines, locale, group, namespace));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "lines", typeHint = "array")
    @ConvertedParameter(index = 1, name = "locale")
    @ConvertedParameter(index = 2, name = "group")
    @ConvertedParameter(index = 3, name = "namespace")
    protected Object loadNamespaceOverrides(RuntimeEnv env, Object... args) {
        Object lines = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        Object group = assignParameter(args, 2, false);
        Object namespace = assignParameter(args, 3, false);
        Object file = null;
        file =
                ZVal.assign(
                        toStringR(this.path, env)
                                + "/vendor/"
                                + toStringR(namespace, env)
                                + "/"
                                + toStringR(locale, env)
                                + "/"
                                + toStringR(group, env)
                                + ".php");
        if (ZVal.isTrue(env.callMethod(this.files, "exists", FileLoader.class, file))) {
            return ZVal.assign(
                    function_array_replace_recursive
                            .f
                            .env(env)
                            .call(
                                    lines,
                                    env.callMethod(
                                            this.files, "getRequire", FileLoader.class, file))
                            .value());
        }

        return ZVal.assign(lines);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "locale")
    @ConvertedParameter(index = 2, name = "group")
    protected Object loadPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object locale = assignParameter(args, 1, false);
        Object group = assignParameter(args, 2, false);
        Object full = null;
        if (ZVal.isTrue(
                env.callMethod(
                        this.files,
                        "exists",
                        FileLoader.class,
                        full =
                                ZVal.assign(
                                        toStringR(path, env)
                                                + "/"
                                                + toStringR(locale, env)
                                                + "/"
                                                + toStringR(group, env)
                                                + ".php")))) {
            return ZVal.assign(env.callMethod(this.files, "getRequire", FileLoader.class, full));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    protected Object loadJsonPaths(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Translation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Translation/FileLoader.php");
        Object locale = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        collect.f
                                .env(env)
                                .call(
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        this.jsonPaths,
                                                        ZVal.newArray(new ZPair(0, this.path)))
                                                .value())
                                .value(),
                        "reduce",
                        FileLoader.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Translation",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "output")
                            @ConvertedParameter(index = 1, name = "path")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object output = assignParameter(args, 0, false);
                                Object path = assignParameter(args, 1, false);
                                Object decoded = null;
                                Object locale = null;
                                Object full = null;
                                locale = this.contextReferences.getCapturedValue("locale");
                                if (ZVal.isTrue(
                                        env.callMethod(
                                                FileLoader.this.files,
                                                "exists",
                                                FileLoader.class,
                                                full =
                                                        ZVal.assign(
                                                                toStringR(path, env)
                                                                        + "/"
                                                                        + toStringR(locale, env)
                                                                        + ".json")))) {
                                    decoded =
                                            NamespaceGlobal.json_decode
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    FileLoader.this.files,
                                                                    "get",
                                                                    FileLoader.class,
                                                                    full),
                                                            true)
                                                    .value();
                                    if (ZVal.toBool(
                                                    function_is_null
                                                            .f
                                                            .env(env)
                                                            .call(decoded)
                                                            .value())
                                            || ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            NamespaceGlobal.json_last_error
                                                                    .env(env)
                                                                    .call()
                                                                    .value(),
                                                            "!==",
                                                            0))) {
                                        throw ZVal.getException(
                                                env,
                                                new RuntimeException(
                                                        env,
                                                        "Translation file ["
                                                                + toStringR(full, env)
                                                                + "] contains an invalid JSON structure."));
                                    }

                                    output =
                                            function_array_merge
                                                    .f
                                                    .env(env)
                                                    .call(output, decoded)
                                                    .value();
                                }

                                return ZVal.assign(output);
                            }
                        }.use("locale", locale),
                        ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    @ConvertedParameter(index = 1, name = "hint")
    public Object addNamespace(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        Object hint = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "hints", env).arrayAccess(env, namespace).set(hint);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object addJsonPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "jsonPaths", env).arrayAppend(env).set(path);
        return null;
    }

    @ConvertedMethod
    public Object namespaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hints);
    }

    public static final Object CONST_class = "Illuminate\\Translation\\FileLoader";

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
                    .setName("Illuminate\\Translation\\FileLoader")
                    .setLookup(
                            FileLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("files", "hints", "jsonPaths", "path")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Translation/FileLoader.php")
                    .addInterface("Illuminate\\Contracts\\Translation\\Loader")
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
