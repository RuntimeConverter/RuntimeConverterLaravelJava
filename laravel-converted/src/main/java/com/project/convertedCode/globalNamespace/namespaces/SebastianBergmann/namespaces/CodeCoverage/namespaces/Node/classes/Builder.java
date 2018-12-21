package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.namespaces.Node.classes.Directory;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-code-coverage/src/Node/Builder.php

*/

public final class Builder extends RuntimeClassBase {

    public Builder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Builder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "coverage",
        typeHint = "SebastianBergmann\\CodeCoverage\\CodeCoverage"
    )
    public Object build(RuntimeEnv env, Object... args) {
        Object coverage = assignParameter(args, 0, false);
        Object root = null;
        Object commonPath = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        files.setObject(env.callMethod(coverage, "getData", Builder.class));
        commonPath =
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, files),
                        "reducePaths",
                        Builder.class,
                        files.getObject());
        root = new Directory(env, commonPath, ZVal.getNull());
        this.addItems(
                env,
                root,
                this.buildDirectoryStructure(env, files.getObject()),
                env.callMethod(coverage, "getTests", Builder.class),
                env.callMethod(coverage, "getCacheTokens", Builder.class));
        return ZVal.assign(root);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "root",
        typeHint = "SebastianBergmann\\CodeCoverage\\Node\\Directory"
    )
    @ConvertedParameter(index = 1, name = "items", typeHint = "array")
    @ConvertedParameter(index = 2, name = "tests", typeHint = "array")
    @ConvertedParameter(index = 3, name = "cacheTokens", typeHint = "bool")
    private Object addItems(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        Object items = assignParameter(args, 1, false);
        Object tests = assignParameter(args, 2, false);
        Object cacheTokens = assignParameter(args, 3, false);
        Object value = null;
        Object key = null;
        Object child = null;
        for (ZPair zpairResult1018 : ZVal.getIterable(items, env, false)) {
            key = ZVal.assign(zpairResult1018.getKey());
            value = ZVal.assign(zpairResult1018.getValue());
            if (ZVal.equalityCheck(function_substr.f.env(env).call(key, -2).value(), "/f")) {
                key = function_substr.f.env(env).call(key, 0, -2).value();
                if (function_file_exists
                        .f
                        .env(env)
                        .call(
                                toStringR(env.callMethod(root, "getPath", Builder.class), env)
                                        + toStringR("/", env)
                                        + toStringR(key, env))
                        .getBool()) {
                    env.callMethod(root, "addFile", Builder.class, key, value, tests, cacheTokens);
                }

            } else {
                child = env.callMethod(root, "addDirectory", Builder.class, key);
                this.addItems(env, child, value, tests, cacheTokens);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    private Object buildDirectoryStructure(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer path = new BasicReferenceContainer(null);
        ReferenceContainer pointer = new BasicReferenceContainer(null);
        Object file = null;
        Object max = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object type = null;
        result.setObject(ZVal.newArray());
        for (ZPair zpairResult1019 : ZVal.getIterable(files, env, false)) {
            path.setObject(ZVal.assign(zpairResult1019.getKey()));
            file = ZVal.assign(zpairResult1019.getValue());
            path.setObject(function_explode.f.env(env).call("/", path.getObject()).value());
            pointer = result;
            max = function_count.f.env(env).call(path.getObject()).value();
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', max);
                    i.setObject(ZVal.increment(i.getObject()))) {
                type = "";
                if (ZVal.equalityCheck(i.getObject(), ZVal.subtract(max, 1))) {
                    type = "/f";
                }

                pointer =
                        new ArrayDimensionReference(
                                pointer.getObject(),
                                toStringR(path.arrayGet(env, i.getObject()), env)
                                        + toStringR(type, env));
            }

            pointer.setObject(ZVal.assign(file));
        }

        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    private Object reducePaths(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer files = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        ReferenceContainer original = new BasicReferenceContainer(null);
        Object max = null;
        ReferenceContainer paths = new BasicReferenceContainer(null);
        Object commonPath = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object done = null;
        if (ZVal.isEmpty(files.getObject())) {
            return ".";
        }

        commonPath = "";
        paths.setObject(function_array_keys.f.env(env).call(files.getObject()).value());
        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(files.getObject()).value(), "===", 1)) {
            commonPath =
                    toStringR(function_dirname.f.env(env).call(paths.arrayGet(env, 0)).value(), env)
                            + "/";
            files.arrayAccess(
                            env,
                            NamespaceGlobal.basename.env(env).call(paths.arrayGet(env, 0)).value())
                    .set(files.arrayGet(env, paths.arrayGet(env, 0)));
            arrayActionR(ArrayAction.UNSET, files, env, paths.arrayGet(env, 0));
            return ZVal.assign(commonPath);
        }

        max = function_count.f.env(env).call(paths.getObject()).value();
        runtimeConverterBreakCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', max);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (ZVal.strictEqualityCheck(
                    function_strpos
                            .f
                            .env(env)
                            .call(paths.arrayGet(env, i.getObject()), "phar://")
                            .value(),
                    "===",
                    0)) {
                paths.arrayAccess(env, i.getObject())
                        .set(
                                function_substr
                                        .f
                                        .env(env)
                                        .call(paths.arrayGet(env, i.getObject()), 7)
                                        .value());
                paths.arrayAccess(env, i.getObject())
                        .set(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call("/", "/", paths.arrayGet(env, i.getObject()))
                                        .value());
            }

            paths.arrayAccess(env, i.getObject())
                    .set(
                            function_explode
                                    .f
                                    .env(env)
                                    .call("/", paths.arrayGet(env, i.getObject()))
                                    .value());
            if (arrayActionR(ArrayAction.EMPTY, paths, env, i.getObject(), 0)) {
                paths.arrayAccess(env, i.getObject(), 0).set("/");
            }
        }

        done = false;
        max = function_count.f.env(env).call(paths.getObject()).value();
        runtimeConverterBreakCount = 0;
        while (!ZVal.isTrue(done)) {
            runtimeConverterBreakCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', ZVal.subtract(max, 1));
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.toBool(
                                ZVal.toBool(
                                                !arrayActionR(
                                                        ArrayAction.ISSET,
                                                        paths,
                                                        env,
                                                        i.getObject(),
                                                        0))
                                        || ZVal.toBool(
                                                !arrayActionR(
                                                        ArrayAction.ISSET,
                                                        paths,
                                                        env,
                                                        ZVal.add(i.getObject(), 1),
                                                        0)))
                        || ZVal.toBool(
                                ZVal.notEqualityCheck(
                                        paths.arrayGet(env, i.getObject(), 0),
                                        paths.arrayGet(env, ZVal.add(i.getObject(), 1), 0)))) {
                    done = true;
                    break;
                }
            }

            if (!ZVal.isTrue(done)) {
                commonPath = toStringR(commonPath, env) + toStringR(paths.arrayGet(env, 0, 0), env);
                if (ZVal.notEqualityCheck(paths.arrayGet(env, 0, 0), "/")) {
                    commonPath = toStringR(commonPath, env) + toStringR("/", env);
                }

                runtimeConverterBreakCount = 0;
                for (i.setObject(0);
                        ZVal.isLessThan(i.getObject(), '<', max);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    function_array_shift.f.env(env).call(paths.arrayGet(env, i.getObject()));
                }
            }
        }

        original.setObject(function_array_keys.f.env(env).call(files.getObject()).value());
        max = function_count.f.env(env).call(original.getObject()).value();
        runtimeConverterBreakCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', max);
                i.setObject(ZVal.increment(i.getObject()))) {
            files.arrayAccess(
                            env,
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call("/", paths.arrayGet(env, i.getObject()))
                                    .value())
                    .set(files.arrayGet(env, original.arrayGet(env, i.getObject())));
            arrayActionR(ArrayAction.UNSET, files, env, original.arrayGet(env, i.getObject()));
        }

        function_ksort.f.env(env).call(files.getObject());
        return ZVal.assign(function_substr.f.env(env).call(commonPath, 0, -1).value());
    }

    public Object reducePaths(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "SebastianBergmann\\CodeCoverage\\Node\\Builder";

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
                    .setName("SebastianBergmann\\CodeCoverage\\Node\\Builder")
                    .setLookup(
                            Builder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-code-coverage/src/Node/Builder.php")
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
