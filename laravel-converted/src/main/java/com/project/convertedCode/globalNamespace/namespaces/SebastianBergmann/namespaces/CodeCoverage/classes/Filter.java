package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes.Facade;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Filter.php

*/

public final class Filter extends RuntimeClassBase {

    public Object whitelistedFiles = ZVal.newArray();

    public Filter(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Filter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suffix", typeHint = "string")
    @ConvertedParameter(index = 2, name = "prefix", typeHint = "string")
    public Object addDirectoryToWhitelist(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object suffix = assignParameter(args, 1, true);
        if (null == suffix) {
            suffix = ".php";
        }
        Object prefix = assignParameter(args, 2, true);
        if (null == prefix) {
            prefix = "";
        }
        Object file = null;
        Object facade = null;
        Object files = null;
        facade = new Facade(env);
        files = env.callMethod(facade, "getFilesAsArray", Filter.class, directory, suffix, prefix);
        for (ZPair zpairResult1015 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult1015.getValue());
            this.addFileToWhitelist(env, file);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object addFileToWhitelist(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "whitelistedFiles", env)
                .arrayAccess(env, function_realpath.f.env(env).call(filename).value())
                .set(true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    public Object addFilesToWhitelist(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        Object file = null;
        for (ZPair zpairResult1016 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult1016.getValue());
            this.addFileToWhitelist(env, file);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory", typeHint = "string")
    @ConvertedParameter(index = 1, name = "suffix", typeHint = "string")
    @ConvertedParameter(index = 2, name = "prefix", typeHint = "string")
    public Object removeDirectoryFromWhitelist(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object suffix = assignParameter(args, 1, true);
        if (null == suffix) {
            suffix = ".php";
        }
        Object prefix = assignParameter(args, 2, true);
        if (null == prefix) {
            prefix = "";
        }
        Object file = null;
        Object facade = null;
        Object files = null;
        facade = new Facade(env);
        files = env.callMethod(facade, "getFilesAsArray", Filter.class, directory, suffix, prefix);
        for (ZPair zpairResult1017 : ZVal.getIterable(files, env, true)) {
            file = ZVal.assign(zpairResult1017.getValue());
            this.removeFileFromWhitelist(env, file);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object removeFileFromWhitelist(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        filename = function_realpath.f.env(env).call(filename).value();
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "whitelistedFiles", env),
                env,
                filename);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object isFile(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.toBool(
                                                                                        ZVal.toBool(
                                                                                                        ZVal
                                                                                                                        .toBool(
                                                                                                                                ZVal
                                                                                                                                        .strictEqualityCheck(
                                                                                                                                                filename,
                                                                                                                                                "===",
                                                                                                                                                "-"))
                                                                                                                || ZVal
                                                                                                                        .toBool(
                                                                                                                                ZVal
                                                                                                                                        .strictEqualityCheck(
                                                                                                                                                function_strpos
                                                                                                                                                        .f
                                                                                                                                                        .env(
                                                                                                                                                                env)
                                                                                                                                                        .call(
                                                                                                                                                                filename,
                                                                                                                                                                "vfs://")
                                                                                                                                                        .value(),
                                                                                                                                                "===",
                                                                                                                                                0)))
                                                                                                || ZVal
                                                                                                        .toBool(
                                                                                                                ZVal
                                                                                                                        .strictNotEqualityCheck(
                                                                                                                                function_strpos
                                                                                                                                        .f
                                                                                                                                        .env(
                                                                                                                                                env)
                                                                                                                                        .call(
                                                                                                                                                filename,
                                                                                                                                                "xdebug://debug-eval")
                                                                                                                                        .value(),
                                                                                                                                "!==",
                                                                                                                                false)))
                                                                                || ZVal.toBool(
                                                                                        ZVal
                                                                                                .strictNotEqualityCheck(
                                                                                                        function_strpos
                                                                                                                .f
                                                                                                                .env(
                                                                                                                        env)
                                                                                                                .call(
                                                                                                                        filename,
                                                                                                                        "eval()'d code")
                                                                                                                .value(),
                                                                                                        "!==",
                                                                                                        false)))
                                                                || ZVal.toBool(
                                                                        ZVal.strictNotEqualityCheck(
                                                                                function_strpos
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                filename,
                                                                                                "runtime-created function")
                                                                                        .value(),
                                                                                "!==",
                                                                                false)))
                                                || ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                function_strpos
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                filename,
                                                                                "runkit created function")
                                                                        .value(),
                                                                "!==",
                                                                false)))
                                || ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(filename, "assert code")
                                                        .value(),
                                                "!==",
                                                false)))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(filename, "regexp code").value(),
                                "!==",
                                false))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(function_file_exists.f.env(env).call(filename).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filename", typeHint = "string")
    public Object isFiltered(RuntimeEnv env, Object... args) {
        Object filename = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.isFile(env, filename))) {
            return ZVal.assign(true);
        }

        filename = function_realpath.f.env(env).call(filename).value();
        return ZVal.assign(
                !arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "whitelistedFiles", env),
                        env,
                        filename));
    }

    @ConvertedMethod
    public Object getWhitelist(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_array_keys.f.env(env).call(this.whitelistedFiles).value());
    }

    @ConvertedMethod
    public Object hasWhitelist(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.whitelistedFiles));
    }

    @ConvertedMethod
    public Object getWhitelistedFiles(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.whitelistedFiles);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "whitelistedFiles", typeHint = "array")
    public Object setWhitelistedFiles(RuntimeEnv env, Object... args) {
        Object whitelistedFiles = assignParameter(args, 0, false);
        this.whitelistedFiles = whitelistedFiles;
        return null;
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Filter";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Filter")
                    .setLookup(
                            Filter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("whitelistedFiles")
                    .setFilename("vendor/phpunit/php-code-coverage/src/Filter.php")
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
