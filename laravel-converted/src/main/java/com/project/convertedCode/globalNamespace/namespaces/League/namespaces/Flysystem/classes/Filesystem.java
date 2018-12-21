package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Config;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes.PluginNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.FileNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.RootViolationException;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Util;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.CanOverwriteFiles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Util.classes.ContentListingFormatter;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Directory;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.FilesystemInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.File;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.FileExistsException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Filesystem.php

*/

public class Filesystem extends RuntimeClassBase implements FilesystemInterface {

    public Object adapter = null;

    public Object plugins = ZVal.newArray();

    public Object config = null;

    public Filesystem(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Filesystem.class) {
            this.__construct(env, args);
        }
    }

    public Filesystem(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "adapter",
        typeHint = "League\\Flysystem\\AdapterInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "config",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object adapter = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, true);
        if (null == config) {
            config = ZVal.getNull();
        }
        this.adapter = adapter;
        this.setConfig(env, config);
        return null;
    }

    @ConvertedMethod
    public Object getAdapter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.adapter);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object has(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        return ZVal.assign(
                ZVal.strictEqualityCheck(function_strlen.f.env(env).call(path).value(), "===", 0)
                        ? false
                        : ZVal.toBool(
                                env.callMethod(
                                        this.getAdapter(env), "has", Filesystem.class, path)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object write(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertAbsent(env, path);
        config = this.prepareConfig(env, config);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env),
                                "write",
                                Filesystem.class,
                                path,
                                contents,
                                config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object writeStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        if (!function_is_resource.f.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            toStringR("Filesystem::writeStream", env)
                                    + " expects argument #2 to be a valid resource."));
        }

        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertAbsent(env, path);
        config = this.prepareConfig(env, config);
        Util.runtimeStaticObject.rewindStream(env, resource);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env),
                                "writeStream",
                                Filesystem.class,
                                path,
                                resource,
                                config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object put(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        path = Util.runtimeStaticObject.normalizePath(env, path);
        config = this.prepareConfig(env, config);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        this.getAdapter(env),
                                        CanOverwriteFiles.class,
                                        "League\\Flysystem\\Adapter\\CanOverwriteFiles")))
                && ZVal.toBool(this.has(env, path))) {
            return ZVal.assign(
                    ZVal.toBool(
                            env.callMethod(
                                    this.getAdapter(env),
                                    "update",
                                    Filesystem.class,
                                    path,
                                    contents,
                                    config)));
        }

        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env),
                                "write",
                                Filesystem.class,
                                path,
                                contents,
                                config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object putStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        if (!function_is_resource.f.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            toStringR("Filesystem::putStream", env)
                                    + " expects argument #2 to be a valid resource."));
        }

        path = Util.runtimeStaticObject.normalizePath(env, path);
        config = this.prepareConfig(env, config);
        Util.runtimeStaticObject.rewindStream(env, resource);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        this.getAdapter(env),
                                        CanOverwriteFiles.class,
                                        "League\\Flysystem\\Adapter\\CanOverwriteFiles")))
                && ZVal.toBool(this.has(env, path))) {
            return ZVal.assign(
                    ZVal.toBool(
                            env.callMethod(
                                    this.getAdapter(env),
                                    "updateStream",
                                    Filesystem.class,
                                    path,
                                    resource,
                                    config)));
        }

        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env),
                                "writeStream",
                                Filesystem.class,
                                path,
                                resource,
                                config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object readAndDelete(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = null;
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        contents = this.read(env, path);
        if (ZVal.strictEqualityCheck(contents, "===", false)) {
            return ZVal.assign(false);
        }

        this.delete(env, path);
        return ZVal.assign(contents);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object update(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        path = Util.runtimeStaticObject.normalizePath(env, path);
        config = this.prepareConfig(env, config);
        this.assertPresent(env, path);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env),
                                "update",
                                Filesystem.class,
                                path,
                                contents,
                                config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object updateStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        if (!function_is_resource.f.env(env).call(resource).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            toStringR("Filesystem::updateStream", env)
                                    + " expects argument #2 to be a valid resource."));
        }

        path = Util.runtimeStaticObject.normalizePath(env, path);
        config = this.prepareConfig(env, config);
        this.assertPresent(env, path);
        Util.runtimeStaticObject.rewindStream(env, resource);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env),
                                "updateStream",
                                Filesystem.class,
                                path,
                                resource,
                                config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object read(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer _object = new BasicReferenceContainer(null);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        if (!ZVal.isTrue(
                _object.setObject(
                        env.callMethod(this.getAdapter(env), "read", Filesystem.class, path)))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(_object.arrayGet(env, "contents"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object readStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer _object = new BasicReferenceContainer(null);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        if (!ZVal.isTrue(
                _object.setObject(
                        env.callMethod(
                                this.getAdapter(env), "readStream", Filesystem.class, path)))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(_object.arrayGet(env, "stream"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object rename(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        newpath = Util.runtimeStaticObject.normalizePath(env, newpath);
        this.assertPresent(env, path);
        this.assertAbsent(env, newpath);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env), "rename", Filesystem.class, path, newpath)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object copy(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        newpath = Util.runtimeStaticObject.normalizePath(env, newpath);
        this.assertPresent(env, path);
        this.assertAbsent(env, newpath);
        return ZVal.assign(
                env.callMethod(this.getAdapter(env), "copy", Filesystem.class, path, newpath));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object delete(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        return ZVal.assign(env.callMethod(this.getAdapter(env), "delete", Filesystem.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    public Object deleteDir(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        dirname = Util.runtimeStaticObject.normalizePath(env, dirname);
        if (ZVal.strictEqualityCheck(dirname, "===", "")) {
            throw ZVal.getException(
                    env, new RootViolationException(env, "Root directories can not be deleted."));
        }

        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env), "deleteDir", Filesystem.class, dirname)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    @ConvertedParameter(
        index = 1,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object createDir(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        dirname = Util.runtimeStaticObject.normalizePath(env, dirname);
        config = this.prepareConfig(env, config);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env),
                                "createDir",
                                Filesystem.class,
                                dirname,
                                config)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object listContents(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = "";
        }
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = false;
        }
        Object contents = null;
        directory = Util.runtimeStaticObject.normalizePath(env, directory);
        contents =
                env.callMethod(
                        this.getAdapter(env),
                        "listContents",
                        Filesystem.class,
                        directory,
                        recursive);
        return ZVal.assign(
                env.callMethod(
                        new ContentListingFormatter(env, directory, recursive),
                        "formatListing",
                        Filesystem.class,
                        contents));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMimetype(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer _object = new BasicReferenceContainer(null);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                _object.setObject(
                                        env.callMethod(
                                                this.getAdapter(env),
                                                "getMimetype",
                                                Filesystem.class,
                                                path))))
                || ZVal.toBool(
                        !function_array_key_exists
                                .f
                                .env(env)
                                .call("mimetype", _object.getObject())
                                .getBool())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(_object.arrayGet(env, "mimetype"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getTimestamp(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer _object = new BasicReferenceContainer(null);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                _object.setObject(
                                        env.callMethod(
                                                this.getAdapter(env),
                                                "getTimestamp",
                                                Filesystem.class,
                                                path))))
                || ZVal.toBool(
                        !function_array_key_exists
                                .f
                                .env(env)
                                .call("timestamp", _object.getObject())
                                .getBool())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(_object.arrayGet(env, "timestamp"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getVisibility(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer _object = new BasicReferenceContainer(null);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                _object.setObject(
                                        env.callMethod(
                                                this.getAdapter(env),
                                                "getVisibility",
                                                Filesystem.class,
                                                path))))
                || ZVal.toBool(
                        !function_array_key_exists
                                .f
                                .env(env)
                                .call("visibility", _object.getObject())
                                .getBool())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(_object.arrayGet(env, "visibility"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getSize(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer _object = new BasicReferenceContainer(null);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                _object.setObject(
                                        env.callMethod(
                                                this.getAdapter(env),
                                                "getSize",
                                                Filesystem.class,
                                                path))))
                || ZVal.toBool(
                        !function_array_key_exists
                                .f
                                .env(env)
                                .call("size", _object.getObject())
                                .getBool())) {
            return ZVal.assign(false);
        }

        return ZVal.assign(ZVal.toLong(_object.arrayGet(env, "size")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object visibility = assignParameter(args, 1, false);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        return ZVal.assign(
                ZVal.toBool(
                        env.callMethod(
                                this.getAdapter(env),
                                "setVisibility",
                                Filesystem.class,
                                path,
                                visibility)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMetadata(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        this.assertPresent(env, path);
        return ZVal.assign(
                env.callMethod(this.getAdapter(env), "getMetadata", Filesystem.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "handler",
        typeHint = "League\\Flysystem\\Handler",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object handler = assignParameter(args, 1, true);
        if (null == handler) {
            handler = ZVal.getNull();
        }
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        path = Util.runtimeStaticObject.normalizePath(env, path);
        if (!ZVal.isTrue(handler)) {
            metadata.setObject(this.getMetadata(env, path));
            handler =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(metadata.arrayGet(env, "type"), "===", "file")
                                    ? new File(env, this, path)
                                    : new Directory(env, this, path));
        }

        env.callMethod(handler, "setPath", Filesystem.class, path);
        env.callMethod(handler, "setFilesystem", Filesystem.class, this);
        return ZVal.assign(handler);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object assertPresent(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                env.callMethod(
                                        this.config,
                                        "get",
                                        Filesystem.class,
                                        "disable_asserts",
                                        false),
                                "===",
                                false))
                && ZVal.toBool(!ZVal.isTrue(this.has(env, path)))) {
            throw ZVal.getException(env, new FileNotFoundException(env, path));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object assertAbsent(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                env.callMethod(
                                        this.config,
                                        "get",
                                        Filesystem.class,
                                        "disable_asserts",
                                        false),
                                "===",
                                false))
                && ZVal.toBool(this.has(env, path))) {
            throw ZVal.getException(env, new FileExistsException(env, path));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "plugin", typeHint = "League\\Flysystem\\PluginInterface")
    public Object addPlugin(RuntimeEnv env, Object... args) {
        Object plugin = assignParameter(args, 0, false);
        if (!function_method_exists.f.env(env).call(plugin, "handle").getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            toStringR(function_get_class.f.env(env).call(plugin).value(), env)
                                    + " does not have a handle method."));
        }

        new ReferenceClassProperty(this, "plugins", env)
                .arrayAccess(env, env.callMethod(plugin, "getMethod", Filesystem.class))
                .set(plugin);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    protected Object findPlugin(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "plugins", env), env, method)) {
            throw ZVal.getException(
                    env,
                    new PluginNotFoundException(
                            env, "Plugin not found for method: " + toStringR(method, env)));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "plugins", env).arrayGet(env, method));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "filesystem",
        typeHint = "League\\Flysystem\\FilesystemInterface"
    )
    protected Object invokePlugin(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object filesystem = assignParameter(args, 2, false);
        Object plugin = null;
        Object callback = null;
        plugin = this.findPlugin(env, method);
        env.callMethod(plugin, "setFilesystem", Filesystem.class, filesystem);
        callback = ZVal.newArray(new ZPair(0, plugin), new ZPair(1, "handle"));
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callback, arguments)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object e = null;
        try {
            return ZVal.assign(this.invokePlugin(env, method, arguments, this));
        } catch (ConvertedException convertedException74) {
            if (convertedException74.instanceOf(
                    PluginNotFoundException.class,
                    "League\\Flysystem\\Plugin\\PluginNotFoundException")) {
                e = convertedException74.getObject();
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                "Call to undefined method "
                                        + toStringR(
                                                function_get_class.f.env(env).call(this).value(),
                                                env)
                                        + "::"
                                        + toStringR(method, env)));
            } else {
                throw convertedException74;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config")
    protected Object setConfig(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        this.config =
                ZVal.isTrue(config)
                        ? Util.runtimeStaticObject.ensureConfig(env, config)
                        : new Config(env);
        return null;
    }

    @ConvertedMethod
    public Object getConfig(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.config);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    protected Object prepareConfig(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        config = new Config(env, config);
        env.callMethod(config, "setFallback", Filesystem.class, this.getConfig(env));
        return ZVal.assign(config);
    }

    public static final Object CONST_class = "League\\Flysystem\\Filesystem";

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
                    .setName("League\\Flysystem\\Filesystem")
                    .setLookup(
                            Filesystem.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("adapter", "config", "plugins")
                    .setFilename("vendor/league/flysystem/src/Filesystem.php")
                    .addInterface("League\\Flysystem\\FilesystemInterface")
                    .addTrait("League\\Flysystem\\Plugin\\PluggableTrait")
                    .addTrait("League\\Flysystem\\ConfigAwareTrait")
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
