package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilesystemIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_clearstatcache;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Filesystem.classes.FileNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.functions.windows_os;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Filesystem/Filesystem.php

*/

public class Filesystem extends RuntimeClassBase {

    public Filesystem(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Filesystem(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object exists(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(function_file_exists.f.env(env).call(path).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "lock",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object lock = assignParameter(args, 1, true);
        if (null == lock) {
            lock = false;
        }
        if (ZVal.isTrue(this.isFile(env, path))) {
            return ZVal.assign(
                    ZVal.isTrue(lock)
                            ? this.sharedGet(env, path)
                            : function_file_get_contents.f.env(env).call(path).value());
        }

        throw ZVal.getException(
                env,
                new FileNotFoundException(
                        env, "File does not exist at path " + toStringR(path, env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object sharedGet(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = null;
        Object handle = null;
        Object ternaryExpressionTemp = null;
        contents = "";
        handle = function_fopen.f.env(env).call(path, "rb").value();
        if (ZVal.isTrue(handle)) {
            try {
                if (NamespaceGlobal.flock.env(env).call(handle, 1).getBool()) {
                    function_clearstatcache.f.env(env).call(true, path);
                    contents =
                            function_fread
                                    .f
                                    .env(env)
                                    .call(
                                            handle,
                                            ZVal.isTrue(
                                                            ternaryExpressionTemp =
                                                                    this.size(env, path))
                                                    ? ternaryExpressionTemp
                                                    : 1)
                                    .value();
                    NamespaceGlobal.flock.env(env).call(handle, 3);
                }

            } catch (ConvertedException convertedException32) {

                throw convertedException32;
            } finally {
                function_fclose.f.env(env).call(handle);
            }
        }

        return ZVal.assign(contents);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getRequire(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope16 scope = new Scope16();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Filesystem")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Filesystem/Filesystem.php");
            scope.path = assignParameter(args, 0, false);
            if (ZVal.isTrue(this.isFile(env, scope.path))) {
                throw new IncludeEventException(
                        ZVal.assign(
                                env.include(
                                        toStringR(scope.path, env),
                                        stack,
                                        runtimeConverterFunctionClassConstants,
                                        true,
                                        false)));
            }

            throw ZVal.getException(
                    env,
                    new FileNotFoundException(
                            env, "File does not exist at path " + toStringR(scope.path, env)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object requireOnce(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope17 scope = new Scope17();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Filesystem")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Filesystem/Filesystem.php");
            scope.file = assignParameter(args, 0, false);
            env.include(
                    toStringR(scope.file, env),
                    stack,
                    runtimeConverterFunctionClassConstants,
                    true,
                    true);
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object hash(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.md5_file.env(env).call(path).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(
        index = 2,
        name = "lock",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object put(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = assignParameter(args, 1, false);
        Object lock = assignParameter(args, 2, true);
        if (null == lock) {
            lock = false;
        }
        return ZVal.assign(
                NamespaceGlobal.file_put_contents
                        .env(env)
                        .call(path, contents, ZVal.isTrue(lock) ? 2 : 0)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "data")
    public Object prepend(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        if (ZVal.isTrue(this.exists(env, path))) {
            return ZVal.assign(
                    this.put(
                            env, path, toStringR(data, env) + toStringR(this.get(env, path), env)));
        }

        return ZVal.assign(this.put(env, path, data));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "data")
    public Object append(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object data = assignParameter(args, 1, false);
        return ZVal.assign(NamespaceGlobal.file_put_contents.env(env).call(path, data, 8).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(
        index = 1,
        name = "mode",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object chmod(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, true);
        if (null == mode) {
            mode = ZVal.getNull();
        }
        if (ZVal.isTrue(mode)) {
            return ZVal.assign(NamespaceGlobal.chmod.env(env).call(path, mode).value());
        }

        return ZVal.assign(
                function_substr
                        .f
                        .env(env)
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "%o",
                                                NamespaceGlobal.fileperms
                                                        .env(env)
                                                        .call(path)
                                                        .value())
                                        .value(),
                                -4)
                        .value());
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
        for (ZPair zpairResult381 : ZVal.getIterable(paths, env, true)) {
            path = ZVal.assign(zpairResult381.getValue());
            try {
                if (!ZVal.isTrue(NamespaceGlobal.unlink.env(env).call(path).value())) {
                    success = false;
                }

            } catch (ConvertedException convertedException33) {
                if (convertedException33.instanceOf(ErrorException.class, "ErrorException")) {
                    e = convertedException33.getObject();
                    success = false;
                } else {
                    throw convertedException33;
                }
            }
        }

        return ZVal.assign(success);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "target")
    public Object move(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, false);
        return ZVal.assign(NamespaceGlobal.rename.env(env).call(path, target).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "target")
    public Object copy(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, false);
        return ZVal.assign(NamespaceGlobal.copy.env(env).call(path, target).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    @ConvertedParameter(index = 1, name = "link")
    public Object link(RuntimeEnv env, Object... args) {
        Object target = assignParameter(args, 0, false);
        Object link = assignParameter(args, 1, false);
        Object mode = null;
        if (!windows_os.f.env(env).call().getBool()) {
            return ZVal.assign(NamespaceGlobal.symlink.env(env).call(target, link).value());
        }

        mode = ZVal.assign(ZVal.isTrue(this.isDirectory(env, target)) ? "J" : "H");
        NamespaceGlobal.exec
                .env(env)
                .call(
                        "mklink /"
                                + toStringR(mode, env)
                                + " \""
                                + toStringR(link, env)
                                + "\" \""
                                + toStringR(target, env)
                                + "\"");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object name(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.pathinfo.env(env).call(path, 8).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object basename(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.pathinfo.env(env).call(path, 2).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object dirname(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.pathinfo.env(env).call(path, 1).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object extension(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.pathinfo.env(env).call(path, 4).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object type(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.filetype.env(env).call(path).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object mimeType(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.finfo_file
                        .env(env)
                        .call(NamespaceGlobal.finfo_open.env(env).call(16).value(), path)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object size(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.filesize.env(env).call(path).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object lastModified(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.filemtime.env(env).call(path).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    public Object isDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        return ZVal.assign(function_is_dir.f.env(env).call(directory).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object isReadable(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.is_readable.env(env).call(path).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object isWritable(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.is_writable.env(env).call(path).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object isFile(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        return ZVal.assign(function_is_file.f.env(env).call(file).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    @ConvertedParameter(index = 1, name = "flags", defaultValue = "0", defaultValueType = "number")
    public Object glob(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        Object flags = assignParameter(args, 1, true);
        if (null == flags) {
            flags = 0;
        }
        return ZVal.assign(NamespaceGlobal.glob.env(env).call(pattern, flags).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "hidden",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object files(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object hidden = assignParameter(args, 1, true);
        if (null == hidden) {
            hidden = false;
        }
        return ZVal.assign(
                NamespaceGlobal.iterator_to_array
                        .env(env)
                        .call(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                env.callMethod(
                                                                        Finder.runtimeStaticObject
                                                                                .create(env),
                                                                        "files",
                                                                        Filesystem.class),
                                                                "ignoreDotFiles",
                                                                Filesystem.class,
                                                                !ZVal.isTrue(hidden)),
                                                        "in",
                                                        Filesystem.class,
                                                        directory),
                                                "depth",
                                                Filesystem.class,
                                                0),
                                        "sortByName",
                                        Filesystem.class),
                                false)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "hidden",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object allFiles(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object hidden = assignParameter(args, 1, true);
        if (null == hidden) {
            hidden = false;
        }
        return ZVal.assign(
                NamespaceGlobal.iterator_to_array
                        .env(env)
                        .call(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        env.callMethod(
                                                                Finder.runtimeStaticObject.create(
                                                                        env),
                                                                "files",
                                                                Filesystem.class),
                                                        "ignoreDotFiles",
                                                        Filesystem.class,
                                                        !ZVal.isTrue(hidden)),
                                                "in",
                                                Filesystem.class,
                                                directory),
                                        "sortByName",
                                        Filesystem.class),
                                false)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    public Object directories(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        ReferenceContainer directories = new BasicReferenceContainer(null);
        Object dir = null;
        directories.setObject(ZVal.newArray());
        for (ZPair zpairResult382 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        Finder.runtimeStaticObject.create(env),
                                                        "in",
                                                        Filesystem.class,
                                                        directory),
                                                "directories",
                                                Filesystem.class),
                                        "depth",
                                        Filesystem.class,
                                        0),
                                "sortByName",
                                Filesystem.class),
                        env,
                        true)) {
            dir = ZVal.assign(zpairResult382.getValue());
            directories.arrayAppend(env).set(env.callMethod(dir, "getPathname", Filesystem.class));
        }

        return ZVal.assign(directories.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "mode", defaultValue = "493", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "force",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object makeDirectory(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, true);
        if (null == mode) {
            mode = 493;
        }
        Object recursive = assignParameter(args, 2, true);
        if (null == recursive) {
            recursive = false;
        }
        Object force = assignParameter(args, 3, true);
        if (null == force) {
            force = false;
        }
        if (ZVal.isTrue(force)) {
            return ZVal.assign(NamespaceGlobal.mkdir.env(env).call(path, mode, recursive).value());
        }

        return ZVal.assign(NamespaceGlobal.mkdir.env(env).call(path, mode, recursive).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    @ConvertedParameter(
        index = 2,
        name = "overwrite",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object moveDirectory(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        Object overwrite = assignParameter(args, 2, true);
        if (null == overwrite) {
            overwrite = false;
        }
        if (ZVal.toBool(overwrite) && ZVal.toBool(this.isDirectory(env, to))) {
            if (!ZVal.isTrue(this.deleteDirectory(env, to))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        NamespaceGlobal.rename.env(env).call(from, to).value(), "===", true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(index = 1, name = "destination")
    @ConvertedParameter(
        index = 2,
        name = "options",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object copyDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object destination = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.getNull();
        }
        Object path = null;
        Object item = null;
        Object ternaryExpressionTemp = null;
        Object items = null;
        Object target = null;
        if (!ZVal.isTrue(this.isDirectory(env, directory))) {
            return ZVal.assign(false);
        }

        options =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = options)
                                ? ternaryExpressionTemp
                                : 4096);
        if (!ZVal.isTrue(this.isDirectory(env, destination))) {
            this.makeDirectory(env, destination, 511, true);
        }

        items = new FilesystemIterator(env, directory, options);
        for (ZPair zpairResult383 : ZVal.getIterable(items, env, true)) {
            item = ZVal.assign(zpairResult383.getValue());
            target =
                    toStringR(destination, env)
                            + "/"
                            + toStringR(env.callMethod(item, "getBasename", Filesystem.class), env);
            if (ZVal.isTrue(env.callMethod(item, "isDir", Filesystem.class))) {
                path = env.callMethod(item, "getPathname", Filesystem.class);
                if (!ZVal.isTrue(this.copyDirectory(env, path, target, options))) {
                    return ZVal.assign(false);
                }

            } else {
                if (!ZVal.isTrue(
                        this.copy(
                                env,
                                env.callMethod(item, "getPathname", Filesystem.class),
                                target))) {
                    return ZVal.assign(false);
                }
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "preserve",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object deleteDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object preserve = assignParameter(args, 1, true);
        if (null == preserve) {
            preserve = false;
        }
        Object item = null;
        Object items = null;
        if (!ZVal.isTrue(this.isDirectory(env, directory))) {
            return ZVal.assign(false);
        }

        items = new FilesystemIterator(env, directory);
        for (ZPair zpairResult384 : ZVal.getIterable(items, env, true)) {
            item = ZVal.assign(zpairResult384.getValue());
            if (ZVal.toBool(env.callMethod(item, "isDir", Filesystem.class))
                    && ZVal.toBool(
                            !ZVal.isTrue(env.callMethod(item, "isLink", Filesystem.class)))) {
                this.deleteDirectory(env, env.callMethod(item, "getPathname", Filesystem.class));

            } else {
                this.delete(env, env.callMethod(item, "getPathname", Filesystem.class));
            }
        }

        if (!ZVal.isTrue(preserve)) {
            NamespaceGlobal.rmdir.env(env).call(directory).value();
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    public Object cleanDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        return ZVal.assign(this.deleteDirectory(env, directory, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Filesystem.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method %s::%s does not exist.",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            method.getObject())
                                    .value()));
        }

        macro =
                ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Filesystem
                                                .classes
                                                .Filesystem
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            Filesystem.class,
                                            this,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class")),
                                    parameters)
                            .value());
        }

        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(macro, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Filesystem\\Filesystem";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Filesystem
                                    .classes
                                    .Filesystem
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            Filesystem.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2308 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2308.getValue());
                env.callMethod(method, "setAccessible", Filesystem.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Filesystem.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Filesystem.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
                            ArrayAction.ISSET,
                            env.getRequestStaticPropertiesReference(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Filesystem
                                            .classes
                                            .Filesystem
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Filesystem.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Filesystem
                                                    .classes
                                                    .Filesystem
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Filesystem
                                                                        .classes
                                                                        .Filesystem
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Filesystem
                                                            .classes
                                                            .Filesystem
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Filesystem\\Filesystem")
                    .setLookup(
                            Filesystem.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Filesystem/Filesystem.php")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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

    private static class Scope16 implements UpdateRuntimeScopeInterface {

        Object path;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this._thisVarAlias = stack.getVariable("this");
        }
    }

    private static class Scope17 implements UpdateRuntimeScopeInterface {

        Object file;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("file", this.file);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.file = stack.getVariable("file");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
