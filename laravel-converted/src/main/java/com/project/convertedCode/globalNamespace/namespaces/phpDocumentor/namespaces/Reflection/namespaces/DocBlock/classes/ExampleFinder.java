package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/ExampleFinder.php

*/

public class ExampleFinder extends RuntimeClassBase {

    public Object sourceDirectory = "";

    public Object exampleDirectories = ZVal.newArray();

    public ExampleFinder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ExampleFinder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "example",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Example"
    )
    public Object find(RuntimeEnv env, Object... args) {
        Object example = assignParameter(args, 0, false);
        Object filename = null;
        Object file = null;
        filename = env.callMethod(example, "getFilePath", ExampleFinder.class);
        file = this.getExampleFileContents(env, filename);
        if (!ZVal.isTrue(file)) {
            return ZVal.assign("** File not found : " + toStringR(filename, env) + " **");
        }

        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "",
                                function_array_slice
                                        .f
                                        .env(env)
                                        .call(
                                                file,
                                                ZVal.subtract(
                                                        env.callMethod(
                                                                example,
                                                                "getStartingLine",
                                                                ExampleFinder.class),
                                                        1),
                                                env.callMethod(
                                                        example,
                                                        "getLineCount",
                                                        ExampleFinder.class))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    public Object setSourceDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = "";
        }
        this.sourceDirectory = directory;
        return null;
    }

    @ConvertedMethod
    public Object getSourceDirectory(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.sourceDirectory);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directories", typeHint = "array")
    public Object setExampleDirectories(RuntimeEnv env, Object... args) {
        Object directories = assignParameter(args, 0, false);
        this.exampleDirectories = directories;
        return null;
    }

    @ConvertedMethod
    public Object getExampleDirectories(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.exampleDirectories);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename")
    private Object getExampleFileContents(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object filename = assignParameter(args, 0, false);
        Object normalizedPath = null;
        Object exampleFileFromConfig = null;
        Object directory = null;
        normalizedPath = ZVal.getNull();
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult927 : ZVal.getIterable(this.exampleDirectories, env, true)) {
            directory = ZVal.assign(zpairResult927.getValue());
            exampleFileFromConfig = this.constructExamplePath(env, directory, filename);
            if (NamespaceGlobal.is_readable.env(env).call(exampleFileFromConfig).getBool()) {
                normalizedPath = ZVal.assign(exampleFileFromConfig);
                break;
            }
        }

        if (!ZVal.isTrue(normalizedPath)) {
            if (NamespaceGlobal.is_readable
                    .env(env)
                    .call(this.getExamplePathFromSource(env, filename))
                    .getBool()) {
                normalizedPath = this.getExamplePathFromSource(env, filename);

            } else if (NamespaceGlobal.is_readable
                    .env(env)
                    .call(this.getExamplePathFromExampleDirectory(env, filename))
                    .getBool()) {
                normalizedPath = this.getExamplePathFromExampleDirectory(env, filename);

            } else if (NamespaceGlobal.is_readable.env(env).call(filename).getBool()) {
                normalizedPath = ZVal.assign(filename);
            }
        }

        return ZVal.assign(
                ZVal.toBool(normalizedPath)
                                && ZVal.toBool(
                                        NamespaceGlobal.is_readable
                                                .env(env)
                                                .call(normalizedPath)
                                                .value())
                        ? NamespaceGlobal.file.env(env).call(normalizedPath).value()
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    private Object getExamplePathFromExampleDirectory(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(function_getcwd.f.env(env).call().value(), env)
                        + toStringR("/", env)
                        + "examples"
                        + toStringR("/", env)
                        + toStringR(file, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(index = 1, name = "file")
    private Object constructExamplePath(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        return ZVal.assign(
                toStringR(function_rtrim.f.env(env).call(directory, "\\/").value(), env)
                        + toStringR("/", env)
                        + toStringR(file, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    private Object getExamplePathFromSource(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s%s%s",
                                function_trim
                                        .f
                                        .env(env)
                                        .call(this.getSourceDirectory(env), "\\/")
                                        .value(),
                                "/",
                                function_trim.f.env(env).call(file, "\"").value())
                        .value());
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\ExampleFinder";

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
                    .setName("phpDocumentor\\Reflection\\DocBlock\\ExampleFinder")
                    .setLookup(
                            ExampleFinder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("exampleDirectories", "sourceDirectory")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/ExampleFinder.php")
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
