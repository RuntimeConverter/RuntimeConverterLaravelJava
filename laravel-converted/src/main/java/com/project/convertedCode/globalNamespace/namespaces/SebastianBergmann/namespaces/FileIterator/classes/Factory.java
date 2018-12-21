package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes;

import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveDirectoryIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes.Iterator;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.AppendIterator;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-file-iterator/src/Factory.php

*/

public class Factory extends RuntimeClassBase {

    public Factory(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Factory(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths")
    @ConvertedParameter(index = 1, name = "suffixes")
    @ConvertedParameter(index = 2, name = "prefixes")
    @ConvertedParameter(
        index = 3,
        name = "exclude",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getFileIterator(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, false);
        Object suffixes = assignParameter(args, 1, true);
        if (null == suffixes) {
            suffixes = "";
        }
        Object prefixes = assignParameter(args, 2, true);
        if (null == prefixes) {
            prefixes = "";
        }
        Object exclude = assignParameter(args, 3, true);
        if (null == exclude) {
            exclude = ZVal.newArray();
        }
        Object path = null;
        Object iterator = null;
        if (function_is_string.f.env(env).call(paths).getBool()) {
            paths = ZVal.newArray(new ZPair(0, paths));
        }

        paths = this.getPathsAfterResolvingWildcards(env, paths);
        exclude = this.getPathsAfterResolvingWildcards(env, exclude);
        if (function_is_string.f.env(env).call(prefixes).getBool()) {
            if (ZVal.strictNotEqualityCheck(prefixes, "!==", "")) {
                prefixes = ZVal.newArray(new ZPair(0, prefixes));

            } else {
                prefixes = ZVal.newArray();
            }
        }

        if (function_is_string.f.env(env).call(suffixes).getBool()) {
            if (ZVal.strictNotEqualityCheck(suffixes, "!==", "")) {
                suffixes = ZVal.newArray(new ZPair(0, suffixes));

            } else {
                suffixes = ZVal.newArray();
            }
        }

        iterator = new AppendIterator(env);
        for (ZPair zpairResult1113 : ZVal.getIterable(paths, env, true)) {
            path = ZVal.assign(zpairResult1113.getValue());
            if (function_is_dir.f.env(env).call(path).getBool()) {
                env.callMethod(
                        iterator,
                        "append",
                        Factory.class,
                        new Iterator(
                                env,
                                path,
                                new RecursiveIteratorIterator(
                                        env,
                                        new RecursiveDirectoryIterator(
                                                env, path, ZVal.toLong(512) | ZVal.toLong(4096))),
                                suffixes,
                                prefixes,
                                exclude));
            }
        }

        return ZVal.assign(iterator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths", typeHint = "array")
    protected Object getPathsAfterResolvingWildcards(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, false);
        Object path = null;
        ReferenceContainer _paths = new BasicReferenceContainer(null);
        Object locals = null;
        _paths.setObject(ZVal.newArray());
        for (ZPair zpairResult1114 : ZVal.getIterable(paths, env, true)) {
            path = ZVal.assign(zpairResult1114.getValue());
            if (ZVal.isTrue(locals = NamespaceGlobal.glob.env(env).call(path, 8192).value())) {
                _paths.setObject(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        _paths.getObject(),
                                        function_array_map
                                                .f
                                                .env(env)
                                                .call("\\realpath", locals)
                                                .value())
                                .value());

            } else {
                _paths.arrayAppend(env).set(function_realpath.f.env(env).call(path).value());
            }
        }

        return ZVal.assign(_paths.getObject());
    }

    public static final Object CONST_class = "SebastianBergmann\\FileIterator\\Factory";

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
                    .setName("SebastianBergmann\\FileIterator\\Factory")
                    .setLookup(
                            Factory.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-file-iterator/src/Factory.php")
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
