package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.ParameterBag;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.namespaces.File.classes.UploadedFile;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-foundation/FileBag.php

*/

public class FileBag extends ParameterBag {

    public FileBag(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FileBag.class) {
            this.__construct(env, args);
        }
    }

    public FileBag(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        this.replace(env, parameters);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "files",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object replace(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, true);
        if (null == files) {
            files = ZVal.newArray();
        }
        toObjectR(this).accessProp(this, env).name("parameters").set(ZVal.newArray());
        this.add(env, files);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.toBool(!function_is_array.f.env(env).call(value).getBool())
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        value,
                                        UploadedFile.class,
                                        "Symfony\\Component\\HttpFoundation\\File\\UploadedFile")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "An uploaded file must be an array or an instance of UploadedFile."));
        }

        super.set(env, key, this.convertFileInformation(env, value));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "files",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object files = assignParameter(args, 0, true);
        if (null == files) {
            files = ZVal.newArray();
        }
        Object file = null;
        Object key = null;
        for (ZPair zpairResult1847 : ZVal.getIterable(files, env, false)) {
            key = ZVal.assign(zpairResult1847.getKey());
            file = ZVal.assign(zpairResult1847.getValue());
            this.set(env, key, file);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    protected Object convertFileInformation(RuntimeEnv env, Object... args) {
        ReferenceContainer file = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object keys = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        file.getObject(),
                        UploadedFile.class,
                        "Symfony\\Component\\HttpFoundation\\File\\UploadedFile"))) {
            return ZVal.assign(file.getObject());
        }

        file.setObject(this.fixPhpFilesArray(env, file.getObject()));
        if (function_is_array.f.env(env).call(file.getObject()).getBool()) {
            keys = function_array_keys.f.env(env).call(file.getObject()).value();
            function_sort.f.env(env).call(keys);
            if (ZVal.equalityCheck(
                    keys,
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .HttpFoundation
                                            .classes
                                            .FileBag
                                            .RequestStaticProperties
                                            .class)
                            .fileKeys)) {
                if (ZVal.equalityCheck(4, file.arrayGet(env, "error"))) {
                    file.setObject(ZVal.getNull());

                } else {
                    file.setObject(
                            new UploadedFile(
                                    env,
                                    file.arrayGet(env, "tmp_name"),
                                    file.arrayGet(env, "name"),
                                    file.arrayGet(env, "type"),
                                    file.arrayGet(env, "error")));
                }

            } else {
                file.setObject(
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        ZVal.newArray(
                                                new ZPair(0, this),
                                                new ZPair(1, "convertFileInformation")),
                                        file.getObject())
                                .value());
                if (ZVal.strictEqualityCheck(
                        function_array_keys.f.env(env).call(keys).value(), "===", keys)) {
                    file.setObject(function_array_filter.f.env(env).call(file.getObject()).value());
                }
            }
        }

        return ZVal.assign(file.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data")
    protected Object fixPhpFilesArray(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object keys = null;
        Object name = null;
        ReferenceContainer files = new BasicReferenceContainer(null);
        Object k = null;
        Object key = null;
        if (!function_is_array.f.env(env).call(data.getObject()).getBool()) {
            return ZVal.assign(data.getObject());
        }

        keys = function_array_keys.f.env(env).call(data.getObject()).value();
        function_sort.f.env(env).call(keys);
        if (ZVal.toBool(
                        ZVal.toBool(
                                        ZVal.notEqualityCheck(
                                                env.getRequestStaticProperties(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Symfony
                                                                        .namespaces
                                                                        .Component
                                                                        .namespaces
                                                                        .HttpFoundation
                                                                        .classes
                                                                        .FileBag
                                                                        .RequestStaticProperties
                                                                        .class)
                                                        .fileKeys,
                                                keys))
                                || ZVal.toBool(!arrayActionR(ArrayAction.ISSET, data, env, "name")))
                || ZVal.toBool(
                        !function_is_array.f.env(env).call(data.arrayGet(env, "name")).getBool())) {
            return ZVal.assign(data.getObject());
        }

        files.setObject(ZVal.assign(data.getObject()));
        for (ZPair zpairResult1848 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .HttpFoundation
                                                .classes
                                                .FileBag
                                                .RequestStaticProperties
                                                .class)
                                .fileKeys,
                        env,
                        true)) {
            k = ZVal.assign(zpairResult1848.getValue());
            arrayActionR(ArrayAction.UNSET, files, env, k);
        }

        for (ZPair zpairResult1849 : ZVal.getIterable(data.arrayGet(env, "name"), env, false)) {
            key = ZVal.assign(zpairResult1849.getKey());
            name = ZVal.assign(zpairResult1849.getValue());
            files.arrayAccess(env, key)
                    .set(
                            this.fixPhpFilesArray(
                                    env,
                                    ZVal.newArray(
                                            new ZPair("error", data.arrayGet(env, "error", key)),
                                            new ZPair("name", name),
                                            new ZPair("type", data.arrayGet(env, "type", key)),
                                            new ZPair(
                                                    "tmp_name",
                                                    data.arrayGet(env, "tmp_name", key)),
                                            new ZPair("size", data.arrayGet(env, "size", key)))));
        }

        return ZVal.assign(files.getObject());
    }

    public static final Object CONST_class = "Symfony\\Component\\HttpFoundation\\FileBag";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ParameterBag.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object fileKeys = ZVal.arrayFromList("error", "name", "size", "tmp_name", "type");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpFoundation\\FileBag")
                    .setLookup(
                            FileBag.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parameters")
                    .setStaticPropertyNames("fileKeys")
                    .setFilename("vendor/symfony/http-foundation/FileBag.php")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Countable")
                    .addExtendsClass("Symfony\\Component\\HttpFoundation\\ParameterBag")
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
