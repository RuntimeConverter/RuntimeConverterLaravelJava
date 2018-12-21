package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/sebastian/version/src/Version.php

*/

public class Version extends RuntimeClassBase {

    public Object path = null;

    public Object release = null;

    public Object version = null;

    public Version(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Version.class) {
            this.__construct(env, args);
        }
    }

    public Version(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "release")
    @ConvertedParameter(index = 1, name = "path")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object release = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        this.release = release;
        this.path = path;
        return null;
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        Object git = null;
        if (ZVal.strictEqualityCheck(this.version, "===", ZVal.getNull())) {
            if (ZVal.equalityCheck(
                    function_count
                            .f
                            .env(env)
                            .call(function_explode.f.env(env).call(".", this.release).value())
                            .value(),
                    3)) {
                this.version = this.release;

            } else {
                this.version = toStringR(this.release, env) + "-dev";
            }

            git = this.getGitInformation(env, this.path);
            if (ZVal.isTrue(git)) {
                if (ZVal.equalityCheck(
                        function_count
                                .f
                                .env(env)
                                .call(function_explode.f.env(env).call(".", this.release).value())
                                .value(),
                        3)) {
                    this.version = git;

                } else {
                    git = function_explode.f.env(env).call("-", git).value();
                    this.version =
                            toStringR(this.release, env)
                                    + "-"
                                    + toStringR(function_end.f.env(env).call(git).value(), env);
                }
            }
        }

        return ZVal.assign(this.version);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    private Object getGitInformation(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object result = null;
        Object returnCode = null;
        Object process = null;
        ReferenceContainer pipes = new BasicReferenceContainer(null);
        if (!function_is_dir
                .f
                .env(env)
                .call(toStringR(path, env) + toStringR("/", env) + ".git")
                .getBool()) {
            return ZVal.assign(false);
        }

        process =
                NamespaceGlobal.proc_open
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, pipes))
                        .call(
                                "git describe --tags",
                                ZVal.newArray(
                                        new ZPair(1, ZVal.arrayFromList("pipe", "w")),
                                        new ZPair(2, ZVal.arrayFromList("pipe", "w"))),
                                pipes.getObject(),
                                path)
                        .value();
        if (!function_is_resource.f.env(env).call(process).getBool()) {
            return ZVal.assign(false);
        }

        result =
                function_trim
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.stream_get_contents
                                        .env(env)
                                        .call(pipes.arrayGet(env, 1))
                                        .value())
                        .value();
        function_fclose.f.env(env).call(pipes.arrayGet(env, 1));
        function_fclose.f.env(env).call(pipes.arrayGet(env, 2));
        returnCode = NamespaceGlobal.proc_close.env(env).call(process).value();
        if (ZVal.strictNotEqualityCheck(returnCode, "!==", 0)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_class = "SebastianBergmann\\Version";

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
                    .setName("SebastianBergmann\\Version")
                    .setLookup(
                            Version.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("path", "release", "version")
                    .setFilename("vendor/sebastian/version/src/Version.php")
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
