package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.StreamedResponse;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.Assert;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Filesystem.classes.Filesystem;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.Local;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.UploadedFile;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Filesystem.classes.Cloud;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.AdapterInterface;
import java.lang.Class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.File;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemAdapter.php

*/

public class FilesystemAdapter extends RuntimeClassBase implements Filesystem, Cloud {

    public Object driver = null;

    public FilesystemAdapter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FilesystemAdapter.class) {
            this.__construct(env, args);
        }
    }

    public FilesystemAdapter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "driver",
        typeHint = "League\\Flysystem\\FilesystemInterface"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        this.driver = driver;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object assertExists(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertTrue(
                env,
                this.exists(env, path),
                "Unable to find a file at path [" + toStringR(path, env) + "].");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object assertMissing(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Assert.runtimeStaticObject.assertFalse(
                env,
                this.exists(env, path),
                "Found unexpected file at path [" + toStringR(path, env) + "].");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object exists(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.driver, "has", FilesystemAdapter.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object path(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        env.callMethod(
                                                this.driver, "getAdapter", FilesystemAdapter.class),
                                        "getPathPrefix",
                                        FilesystemAdapter.class),
                                env)
                        + toStringR(path, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object get(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object e = null;
        try {
            return ZVal.assign(env.callMethod(this.driver, "read", FilesystemAdapter.class, path));
        } catch (ConvertedException convertedException34) {
            if (convertedException34.instanceOf(
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .League
                            .namespaces
                            .Flysystem
                            .classes
                            .FileNotFoundException
                            .class,
                    "League\\Flysystem\\FileNotFoundException")) {
                e = convertedException34.getObject();
                throw ZVal.getException(
                        env,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Contracts
                                .namespaces
                                .Filesystem
                                .classes
                                .FileNotFoundException(
                                env,
                                path,
                                env.callMethod(e, "getCode", FilesystemAdapter.class),
                                e));
            } else {
                throw convertedException34;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 3, name = "disposition")
    public Object response(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Filesystem")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemAdapter.php");
        Object path = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        Object disposition = assignParameter(args, 3, true);
        if (null == disposition) {
            disposition = "inline";
        }
        Object response = null;
        Object ternaryExpressionTemp = null;
        response = new StreamedResponse(env);
        disposition =
                env.callMethod(
                        toObjectR(response).accessProp(this, env).name("headers").value(),
                        "makeDisposition",
                        FilesystemAdapter.class,
                        disposition,
                        ZVal.isDefined(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : NamespaceGlobal.basename.env(env).call(path).value());
        env.callMethod(
                toObjectR(response).accessProp(this, env).name("headers").value(),
                "replace",
                FilesystemAdapter.class,
                ZVal.add(
                        headers,
                        ZVal.newArray(
                                new ZPair("Content-Type", this.mimeType(env, path)),
                                new ZPair("Content-Length", this.size(env, path)),
                                new ZPair("Content-Disposition", disposition))));
        env.callMethod(
                response,
                "setCallback",
                FilesystemAdapter.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Filesystem",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object path = null;
                        Object stream = null;
                        path = this.contextReferences.getCapturedValue("path");
                        stream =
                                env.callMethod(
                                        FilesystemAdapter.this.driver,
                                        "readStream",
                                        FilesystemAdapter.class,
                                        path);
                        NamespaceGlobal.fpassthru.env(env).call(stream);
                        function_fclose.f.env(env).call(stream);
                        return null;
                    }
                }.use("path", path));
        return ZVal.assign(response);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object download(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        return ZVal.assign(this.response(env, path, name, headers, "attachment"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object put(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        options =
                ZVal.assign(
                        function_is_string.f.env(env).call(options).getBool()
                                ? ZVal.newArray(new ZPair("visibility", options))
                                : rToArrayCast(options));
        if (ZVal.toBool(ZVal.checkInstanceType(contents, File.class, "Illuminate\\Http\\File"))
                || ZVal.toBool(
                        ZVal.checkInstanceType(
                                contents, UploadedFile.class, "Illuminate\\Http\\UploadedFile"))) {
            return ZVal.assign(this.putFile(env, path, contents, options));
        }

        return ZVal.assign(
                function_is_resource.f.env(env).call(contents).getBool()
                        ? env.callMethod(
                                this.driver,
                                "putStream",
                                FilesystemAdapter.class,
                                path,
                                contents,
                                options)
                        : env.callMethod(
                                this.driver,
                                "put",
                                FilesystemAdapter.class,
                                path,
                                contents,
                                options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "file")
    @ConvertedParameter(index = 2, name = "options", defaultValue = "", defaultValueType = "array")
    public Object putFile(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return ZVal.assign(
                this.putFileAs(
                        env,
                        path,
                        file,
                        env.callMethod(file, "hashName", FilesystemAdapter.class),
                        options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "file")
    @ConvertedParameter(index = 2, name = "name")
    @ConvertedParameter(index = 3, name = "options", defaultValue = "", defaultValueType = "array")
    public Object putFileAs(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object result = null;
        Object stream = null;
        stream =
                function_fopen
                        .f
                        .env(env)
                        .call(env.callMethod(file, "getRealPath", FilesystemAdapter.class), "r")
                        .value();
        result =
                this.put(
                        env,
                        path =
                                function_trim
                                        .f
                                        .env(env)
                                        .call(
                                                toStringR(path, env) + "/" + toStringR(name, env),
                                                "/")
                                        .value(),
                        stream,
                        options);
        if (function_is_resource.f.env(env).call(stream).getBool()) {
            function_fclose.f.env(env).call(stream);
        }

        return ZVal.assign(ZVal.isTrue(result) ? path : false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getVisibility(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (ZVal.equalityCheck(
                env.callMethod(this.driver, "getVisibility", FilesystemAdapter.class, path),
                AdapterInterface.CONST_VISIBILITY_PUBLIC)) {
            return ZVal.assign(Filesystem.CONST_VISIBILITY_PUBLIC);
        }

        return ZVal.assign(Filesystem.CONST_VISIBILITY_PRIVATE);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object visibility = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.driver,
                        "setVisibility",
                        FilesystemAdapter.class,
                        path,
                        this.parseVisibility(env, visibility)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(index = 2, name = "separator")
    public Object prepend(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object separator = assignParameter(args, 2, true);
        if (null == separator) {
            separator = "\n";
        }
        if (ZVal.isTrue(this.exists(env, path))) {
            return ZVal.assign(
                    this.put(
                            env,
                            path,
                            toStringR(data, env)
                                    + toStringR(separator, env)
                                    + toStringR(this.get(env, path), env)));
        }

        return ZVal.assign(this.put(env, path, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "data")
    @ConvertedParameter(index = 2, name = "separator")
    public Object append(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        Object separator = assignParameter(args, 2, true);
        if (null == separator) {
            separator = "\n";
        }
        if (ZVal.isTrue(this.exists(env, path))) {
            return ZVal.assign(
                    this.put(
                            env,
                            path,
                            toStringR(this.get(env, path), env)
                                    + toStringR(separator, env)
                                    + toStringR(data, env)));
        }

        return ZVal.assign(this.put(env, path, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths")
    public Object delete(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, false);
        Object path = null;
        Object e = null;
        Object success = null;
        paths =
                ZVal.assign(
                        function_is_array.f.env(env).call(paths).getBool()
                                ? paths
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        success = true;
        for (ZPair zpairResult385 : ZVal.getIterable(paths, env, true)) {
            path = ZVal.assign(zpairResult385.getValue());
            try {
                if (!ZVal.isTrue(
                        env.callMethod(this.driver, "delete", FilesystemAdapter.class, path))) {
                    success = false;
                }

            } catch (ConvertedException convertedException35) {
                if (convertedException35.instanceOf(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .League
                                .namespaces
                                .Flysystem
                                .classes
                                .FileNotFoundException
                                .class,
                        "League\\Flysystem\\FileNotFoundException")) {
                    e = convertedException35.getObject();
                    success = false;
                } else {
                    throw convertedException35;
                }
            }
        }

        return ZVal.assign(success);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    public Object copy(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        return ZVal.assign(env.callMethod(this.driver, "copy", FilesystemAdapter.class, from, to));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    public Object move(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(this.driver, "rename", FilesystemAdapter.class, from, to));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object size(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.driver, "getSize", FilesystemAdapter.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object mimeType(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.driver, "getMimetype", FilesystemAdapter.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object lastModified(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.driver, "getTimestamp", FilesystemAdapter.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object url(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object adapter = null;
        adapter = env.callMethod(this.driver, "getAdapter", FilesystemAdapter.class);
        if (ZVal.isTrue(ZVal.checkInstanceType(adapter, (Class) null, "CachedAdapter", env))) {
            adapter = env.callMethod(adapter, "getAdapter", FilesystemAdapter.class);
        }

        if (function_method_exists.f.env(env).call(adapter, "getUrl").getBool()) {
            return ZVal.assign(env.callMethod(adapter, "getUrl", FilesystemAdapter.class, path));

        } else if (function_method_exists.f.env(env).call(this.driver, "getUrl").getBool()) {
            return ZVal.assign(
                    env.callMethod(this.driver, "getUrl", FilesystemAdapter.class, path));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(adapter, (Class) null, "AwsS3Adapter", env))) {
            return ZVal.assign(this.getAwsUrl(env, adapter, path));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(adapter, (Class) null, "RackspaceAdapter", env))) {
            return ZVal.assign(this.getRackspaceUrl(env, adapter, path));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        adapter, Local.class, "League\\Flysystem\\Adapter\\Local"))) {
            return ZVal.assign(this.getLocalUrl(env, path));

        } else {
            throw ZVal.getException(
                    env,
                    new RuntimeException(env, "This driver does not support retrieving URLs."));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "adapter")
    @ConvertedParameter(index = 1, name = "path")
    protected Object getAwsUrl(RuntimeEnv env, Object... args) {
        Object adapter = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object url = null;
        if (!function_is_null
                .f
                .env(env)
                .call(
                        url =
                                env.callMethod(
                                        env.callMethod(
                                                this.driver, "getConfig", FilesystemAdapter.class),
                                        "get",
                                        FilesystemAdapter.class,
                                        "url"))
                .getBool()) {
            return ZVal.assign(
                    this.concatPathToUrl(
                            env,
                            url,
                            toStringR(
                                            env.callMethod(
                                                    adapter,
                                                    "getPathPrefix",
                                                    FilesystemAdapter.class),
                                            env)
                                    + toStringR(path, env)));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(adapter, "getClient", FilesystemAdapter.class),
                        "getObjectUrl",
                        FilesystemAdapter.class,
                        env.callMethod(adapter, "getBucket", FilesystemAdapter.class),
                        toStringR(
                                        env.callMethod(
                                                adapter, "getPathPrefix", FilesystemAdapter.class),
                                        env)
                                + toStringR(path, env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "adapter")
    @ConvertedParameter(index = 1, name = "path")
    protected Object getRackspaceUrl(RuntimeEnv env, Object... args) {
        Object adapter = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        return ZVal.assign(
                toStringR(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                adapter, "getContainer", FilesystemAdapter.class),
                                        "getObject",
                                        FilesystemAdapter.class,
                                        path),
                                "getPublicUrl",
                                FilesystemAdapter.class),
                        env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object getLocalUrl(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object config = null;
        config = env.callMethod(this.driver, "getConfig", FilesystemAdapter.class);
        if (ZVal.isTrue(env.callMethod(config, "has", FilesystemAdapter.class, "url"))) {
            return ZVal.assign(
                    this.concatPathToUrl(
                            env,
                            env.callMethod(config, "get", FilesystemAdapter.class, "url"),
                            path));
        }

        path = "/storage/" + toStringR(path, env);
        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, path, "/storage/public/"))) {
            return ZVal.assign(Str.runtimeStaticObject.replaceFirst(env, "/public/", "/", path));
        }

        return ZVal.assign(path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "expiration")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object temporaryUrl(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object expiration = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object adapter = null;
        adapter = env.callMethod(this.driver, "getAdapter", FilesystemAdapter.class);
        if (ZVal.isTrue(ZVal.checkInstanceType(adapter, (Class) null, "CachedAdapter", env))) {
            adapter = env.callMethod(adapter, "getAdapter", FilesystemAdapter.class);
        }

        if (function_method_exists.f.env(env).call(adapter, "getTemporaryUrl").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            adapter,
                            "getTemporaryUrl",
                            FilesystemAdapter.class,
                            path,
                            expiration,
                            options));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(adapter, (Class) null, "AwsS3Adapter", env))) {
            return ZVal.assign(this.getAwsTemporaryUrl(env, adapter, path, expiration, options));

        } else if (ZVal.isTrue(
                ZVal.checkInstanceType(adapter, (Class) null, "RackspaceAdapter", env))) {
            return ZVal.assign(
                    this.getRackspaceTemporaryUrl(env, adapter, path, expiration, options));

        } else {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env, "This driver does not support creating temporary URLs."));
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "adapter")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(index = 2, name = "expiration")
    @ConvertedParameter(index = 3, name = "options")
    public Object getAwsTemporaryUrl(RuntimeEnv env, Object... args) {
        Object adapter = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object expiration = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object client = null;
        Object command = null;
        client = env.callMethod(adapter, "getClient", FilesystemAdapter.class);
        command =
                env.callMethod(
                        client,
                        "getCommand",
                        FilesystemAdapter.class,
                        "GetObject",
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        ZVal.newArray(
                                                new ZPair(
                                                        "Bucket",
                                                        env.callMethod(
                                                                adapter,
                                                                "getBucket",
                                                                FilesystemAdapter.class)),
                                                new ZPair(
                                                        "Key",
                                                        toStringR(
                                                                        env.callMethod(
                                                                                adapter,
                                                                                "getPathPrefix",
                                                                                FilesystemAdapter
                                                                                        .class),
                                                                        env)
                                                                + toStringR(path, env))),
                                        options)
                                .value());
        return ZVal.assign(
                toStringR(
                        env.callMethod(
                                env.callMethod(
                                        client,
                                        "createPresignedRequest",
                                        FilesystemAdapter.class,
                                        command,
                                        expiration),
                                "getUri",
                                FilesystemAdapter.class),
                        env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "adapter")
    @ConvertedParameter(index = 1, name = "path")
    @ConvertedParameter(index = 2, name = "expiration")
    @ConvertedParameter(index = 3, name = "options")
    public Object getRackspaceTemporaryUrl(RuntimeEnv env, Object... args) {
        Object adapter = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object expiration = assignParameter(args, 2, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 3, false));
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(adapter, "getContainer", FilesystemAdapter.class),
                                "getObject",
                                FilesystemAdapter.class,
                                path),
                        "getTemporaryUrl",
                        FilesystemAdapter.class,
                        env.callMethod(
                                Carbon.runtimeStaticObject.now(env),
                                "diffInSeconds",
                                FilesystemAdapter.class,
                                expiration),
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "method"))
                                ? ternaryExpressionTemp
                                : "GET",
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                options.arrayGet(env, "forcePublicUrl"))
                                ? ternaryExpressionTemp
                                : true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    @ConvertedParameter(index = 1, name = "path")
    protected Object concatPathToUrl(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        return ZVal.assign(
                toStringR(function_rtrim.f.env(env).call(url, "/").value(), env)
                        + "/"
                        + toStringR(function_ltrim.f.env(env).call(path, "/").value(), env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "directory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object files(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = ZVal.getNull();
        }
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = false;
        }
        Object contents = null;
        contents =
                env.callMethod(
                        this.driver, "listContents", FilesystemAdapter.class, directory, recursive);
        return ZVal.assign(this.filterContentsByType(env, contents, "file"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "directory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object allFiles(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = ZVal.getNull();
        }
        return ZVal.assign(this.files(env, directory, true));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "directory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object directories(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = ZVal.getNull();
        }
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = false;
        }
        Object contents = null;
        contents =
                env.callMethod(
                        this.driver, "listContents", FilesystemAdapter.class, directory, recursive);
        return ZVal.assign(this.filterContentsByType(env, contents, "dir"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "directory",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object allDirectories(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = ZVal.getNull();
        }
        return ZVal.assign(this.directories(env, directory, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object makeDirectory(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.driver, "createDir", FilesystemAdapter.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    public Object deleteDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.driver, "deleteDir", FilesystemAdapter.class, directory));
    }

    @ConvertedMethod
    public Object flushCache(RuntimeEnv env, Object... args) {
        Object adapter = null;
        adapter = env.callMethod(this.driver, "getAdapter", FilesystemAdapter.class);
        if (ZVal.isTrue(ZVal.checkInstanceType(adapter, (Class) null, "CachedAdapter", env))) {
            env.callMethod(
                    env.callMethod(adapter, "getCache", FilesystemAdapter.class),
                    "flush",
                    FilesystemAdapter.class);
        }

        return null;
    }

    @ConvertedMethod
    public Object getDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.driver);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "contents")
    @ConvertedParameter(index = 1, name = "type")
    protected Object filterContentsByType(RuntimeEnv env, Object... args) {
        Object contents = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                Collection.runtimeStaticObject.make(env, contents),
                                                "where",
                                                FilesystemAdapter.class,
                                                "type",
                                                type),
                                        "pluck",
                                        FilesystemAdapter.class,
                                        "path"),
                                "values",
                                FilesystemAdapter.class),
                        "all",
                        FilesystemAdapter.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "visibility")
    protected Object parseVisibility(RuntimeEnv env, Object... args) {
        Object visibility = assignParameter(args, 0, false);
        if (function_is_null.f.env(env).call(visibility).getBool()) {
            return null;
        }

        SwitchEnumType26 switchVariable26 =
                ZVal.getEnum(
                        visibility,
                        SwitchEnumType26.DEFAULT_CASE,
                        SwitchEnumType26.DYNAMIC_TYPE_92,
                        Filesystem.CONST_VISIBILITY_PUBLIC,
                        SwitchEnumType26.DYNAMIC_TYPE_93,
                        Filesystem.CONST_VISIBILITY_PRIVATE);
        switch (switchVariable26) {
            case DYNAMIC_TYPE_92:
                return ZVal.assign(AdapterInterface.CONST_VISIBILITY_PUBLIC);
            case DYNAMIC_TYPE_93:
                return ZVal.assign(AdapterInterface.CONST_VISIBILITY_PRIVATE);
        }
        ;
        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env, "Unknown visibility: " + toStringR(visibility, env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters", typeHint = "array")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(new ZPair(0, this.driver), new ZPair(1, method)),
                                parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Filesystem\\FilesystemAdapter";

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
                    .setName("Illuminate\\Filesystem\\FilesystemAdapter")
                    .setLookup(
                            FilesystemAdapter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("driver")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Filesystem/FilesystemAdapter.php")
                    .addInterface("Illuminate\\Contracts\\Filesystem\\Filesystem")
                    .addInterface("Illuminate\\Contracts\\Filesystem\\Cloud")
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

    private enum SwitchEnumType26 {
        DYNAMIC_TYPE_92,
        DYNAMIC_TYPE_93,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
