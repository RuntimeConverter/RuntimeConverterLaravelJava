package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/process/ExecutableFinder.php

*/

public class ExecutableFinder extends RuntimeClassBase {

    public Object suffixes = ZVal.arrayFromList(".exe", ".bat", ".cmd", ".com");

    public ExecutableFinder(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ExecutableFinder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suffixes", typeHint = "array")
    public Object setSuffixes(RuntimeEnv env, Object... args) {
        Object suffixes = assignParameter(args, 0, false);
        this.suffixes = suffixes;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "suffix")
    public Object addSuffix(RuntimeEnv env, Object... args) {
        Object suffix = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "suffixes", env).arrayAppend(env).set(suffix);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "extraDirs",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object find(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object extraDirs = assignParameter(args, 2, true);
        if (null == extraDirs) {
            extraDirs = ZVal.newArray();
        }
        Object suffixes = null;
        Object searchPath = null;
        ReferenceContainer dirs = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object dir = null;
        Object suffix = null;
        Object pathExt = null;
        Object path = null;
        Object file = null;
        if (function_ini_get.f.env(env).call("open_basedir").getBool()) {
            searchPath =
                    function_explode
                            .f
                            .env(env)
                            .call(":", function_ini_get.f.env(env).call("open_basedir").value())
                            .value();
            dirs.setObject(ZVal.newArray());
            for (ZPair zpairResult1991 : ZVal.getIterable(searchPath, env, true)) {
                path = ZVal.assign(zpairResult1991.getValue());
                if (ZVal.isTrue(function_is_dir.f.env(env).call(path).value())) {
                    dirs.arrayAppend(env).set(path);

                } else {
                    if (ZVal.toBool(
                                    ZVal.equalityCheck(
                                            NamespaceGlobal.basename.env(env).call(path).value(),
                                            name))
                            && ZVal.toBool(
                                    NamespaceGlobal.is_executable.env(env).call(path).value())) {
                        return ZVal.assign(path);
                    }
                }
            }

        } else {
            dirs.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(
                                                    ":",
                                                    ZVal.isTrue(
                                                                    ternaryExpressionTemp =
                                                                            NamespaceGlobal.getenv
                                                                                    .env(env)
                                                                                    .call("PATH")
                                                                                    .value())
                                                            ? ternaryExpressionTemp
                                                            : NamespaceGlobal.getenv
                                                                    .env(env)
                                                                    .call("Path")
                                                                    .value())
                                            .value(),
                                    extraDirs)
                            .value());
        }

        suffixes = ZVal.arrayFromList("");
        if (ZVal.strictEqualityCheck("\\", "===", "/")) {
            pathExt = NamespaceGlobal.getenv.env(env).call("PATHEXT").value();
            suffixes =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ZVal.isTrue(pathExt)
                                            ? function_explode.f.env(env).call(":", pathExt).value()
                                            : this.suffixes,
                                    suffixes)
                            .value();
        }

        for (ZPair zpairResult1992 : ZVal.getIterable(suffixes, env, true)) {
            suffix = ZVal.assign(zpairResult1992.getValue());
            for (ZPair zpairResult1993 : ZVal.getIterable(dirs.getObject(), env, true)) {
                dir = ZVal.assign(zpairResult1993.getValue());
                if (ZVal.toBool(
                                function_is_file
                                        .f
                                        .env(env)
                                        .call(
                                                file =
                                                        toStringR(dir, env)
                                                                + toStringR("/", env)
                                                                + toStringR(name, env)
                                                                + toStringR(suffix, env))
                                        .value())
                        && ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck("\\", "===", "/"))
                                        || ZVal.toBool(
                                                NamespaceGlobal.is_executable
                                                        .env(env)
                                                        .call(file)
                                                        .value()))) {
                    return ZVal.assign(file);
                }
            }
        }

        return ZVal.assign(_pDefault);
    }

    public static final Object CONST_class = "Symfony\\Component\\Process\\ExecutableFinder";

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
                    .setName("Symfony\\Component\\Process\\ExecutableFinder")
                    .setLookup(
                            ExecutableFinder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("suffixes")
                    .setFilename("vendor/symfony/process/ExecutableFinder.php")
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
