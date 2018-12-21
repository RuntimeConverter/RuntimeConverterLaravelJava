package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.FileIterator.classes.Factory;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-file-iterator/src/Facade.php

*/

public class Facade extends RuntimeClassBase {

    public Facade(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Facade(NoConstructor n) {
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
    @ConvertedParameter(
        index = 4,
        name = "commonPath",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getFilesAsArray(RuntimeEnv env, Object... args) {
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
        Object commonPath = assignParameter(args, 4, true);
        if (null == commonPath) {
            commonPath = false;
        }
        Object factory = null;
        Object path = null;
        Object iterator = null;
        Object file = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        if (function_is_string.f.env(env).call(paths).getBool()) {
            paths = ZVal.newArray(new ZPair(0, paths));
        }

        factory = new Factory(env);
        iterator =
                env.callMethod(
                        factory,
                        "getFileIterator",
                        Facade.class,
                        paths,
                        suffixes,
                        prefixes,
                        exclude);
        files.setObject(ZVal.newArray());
        for (ZPair zpairResult1110 : ZVal.getIterable(iterator, env, true)) {
            file = ZVal.assign(zpairResult1110.getValue());
            file = env.callMethod(file, "getRealPath", Facade.class);
            if (ZVal.isTrue(file)) {
                files.arrayAppend(env).set(file);
            }
        }

        for (ZPair zpairResult1111 : ZVal.getIterable(paths, env, true)) {
            path = ZVal.assign(zpairResult1111.getValue());
            if (function_is_file.f.env(env).call(path).getBool()) {
                files.arrayAppend(env).set(function_realpath.f.env(env).call(path).value());
            }
        }

        files.setObject(function_array_unique.f.env(env).call(files.getObject()).value());
        function_sort.f.env(env).call(files.getObject());
        if (ZVal.isTrue(commonPath)) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("commonPath", this.getCommonPath(env, files.getObject())),
                            new ZPair("files", files.getObject())));
        }

        return ZVal.assign(files.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "files", typeHint = "array")
    protected Object getCommonPath(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer files = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer _files = new BasicReferenceContainer(null);
        Object file = null;
        Object common = null;
        ReferenceContainer _fileParts = new BasicReferenceContainer(null);
        ReferenceContainer count = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer j = new BasicReferenceContainer(null);
        Object done = null;
        count.setObject(function_count.f.env(env).call(files.getObject()).value());
        if (ZVal.strictEqualityCheck(count.getObject(), "===", 0)) {
            return "";
        }

        if (ZVal.strictEqualityCheck(count.getObject(), "===", 1)) {
            return ZVal.assign(
                    toStringR(function_dirname.f.env(env).call(files.arrayGet(env, 0)).value(), env)
                            + toStringR("/", env));
        }

        _files.setObject(ZVal.newArray());
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1112 : ZVal.getIterable(files.getObject(), env, true)) {
            file = ZVal.assign(zpairResult1112.getValue());
            _files.arrayAppend(env)
                    .set(_fileParts.setObject(function_explode.f.env(env).call("/", file).value()));
            if (arrayActionR(ArrayAction.EMPTY, _fileParts, env, 0)) {
                _fileParts.arrayAccess(env, 0).set("/");
            }
        }

        common = "";
        done = false;
        j.setObject(0);
        count.setObject(ZVal.decrement(count.getObject()));
        runtimeConverterBreakCount = 0;
        while (!ZVal.isTrue(done)) {
            runtimeConverterBreakCount = 0;
            for (i.setObject(0);
                    ZVal.isLessThan(i.getObject(), '<', count.getObject());
                    i.setObject(ZVal.increment(i.getObject()))) {
                if (ZVal.notEqualityCheck(
                        _files.arrayGet(env, i.getObject(), j.getObject()),
                        _files.arrayGet(env, ZVal.add(i.getObject(), 1), j.getObject()))) {
                    done = true;
                    break;
                }
            }

            if (!ZVal.isTrue(done)) {
                common =
                        toStringR(common, env)
                                + toStringR(_files.arrayGet(env, 0, j.getObject()), env);
                if (ZVal.isGreaterThan(j.getObject(), '>', 0)) {
                    common = toStringR(common, env) + toStringR("/", env);
                }
            }

            j.setObject(ZVal.increment(j.getObject()));
        }

        return ZVal.assign(toStringR("/", env) + toStringR(common, env));
    }

    public static final Object CONST_class = "SebastianBergmann\\FileIterator\\Facade";

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
                    .setName("SebastianBergmann\\FileIterator\\Facade")
                    .setLookup(
                            Facade.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/phpunit/php-file-iterator/src/Facade.php")
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
