package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveDirectoryIterator;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Util;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.UnreadableFileException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_replace_recursive;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.AdapterInterface;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.DirectoryIterator;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.NotSupportedException;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.FilesystemIterator;
import com.runtimeconverter.runtime.nativeFunctions.file.function_clearstatcache;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Util.classes.MimeType;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeClasses.otherProxyClasses.finfo;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.files.SplFileInfo;
import com.runtimeconverter.runtime.nativeClasses.spl.iterators.RecursiveIteratorIterator;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.AbstractAdapter;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Exception;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Adapter/Local.php

*/

public class Local extends AbstractAdapter {

    public Object permissionMap = null;

    public Object writeFlags = null;

    public Object linkHandling = null;

    public Local(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.pathSeparator = "/";
        if (this.getClass() == Local.class) {
            this.__construct(env, args);
        }
    }

    public Local(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root")
    @ConvertedParameter(index = 1, name = "writeFlags")
    @ConvertedParameter(index = 2, name = "linkHandling")
    @ConvertedParameter(
        index = 3,
        name = "permissions",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        Object writeFlags = assignParameter(args, 1, true);
        if (null == writeFlags) {
            writeFlags = 2;
        }
        Object linkHandling = assignParameter(args, 2, true);
        if (null == linkHandling) {
            linkHandling = CONST_DISALLOW_LINKS;
        }
        Object permissions = assignParameter(args, 3, true);
        if (null == permissions) {
            permissions = ZVal.newArray();
        }
        root =
                ZVal.assign(
                        NamespaceGlobal.is_link.env(env).call(root).getBool()
                                ? function_realpath.f.env(env).call(root).value()
                                : root);
        this.permissionMap =
                function_array_replace_recursive
                        .f
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .League
                                                        .namespaces
                                                        .Flysystem
                                                        .namespaces
                                                        .Adapter
                                                        .classes
                                                        .Local
                                                        .RequestStaticProperties
                                                        .class)
                                        .permissions,
                                permissions)
                        .value();
        this.ensureDirectory(env, root);
        if (ZVal.toBool(!function_is_dir.f.env(env).call(root).getBool())
                || ZVal.toBool(!NamespaceGlobal.is_readable.env(env).call(root).getBool())) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "The root path " + toStringR(root, env) + " is not readable."));
        }

        env.callMethod(this, "setPathPrefix", Local.class, root);
        this.writeFlags = writeFlags;
        this.linkHandling = linkHandling;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root")
    protected Object ensureDirectory(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        Object umask = null;
        if (!function_is_dir.f.env(env).call(root).getBool()) {
            umask = NamespaceGlobal.umask.env(env).call(0).value();
            NamespaceGlobal.mkdir
                    .env(env)
                    .call(
                            root,
                            new ReferenceClassProperty(this, "permissionMap", env)
                                    .arrayGet(env, "dir", "public"),
                            true)
                    .value();
            NamespaceGlobal.umask.env(env).call(umask);
            if (!function_is_dir.f.env(env).call(root).getBool()) {
                throw ZVal.getException(
                        env,
                        new Exception(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Impossible to create the root directory \"%s\".",
                                                root)
                                        .value()));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object has(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object location = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, path);
        return ZVal.assign(function_file_exists.f.env(env).call(location).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object write(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope164 scope = new Scope164();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/Local.php");
            scope.path = assignParameter(args, 0, false);
            scope.contents = assignParameter(args, 1, false);
            scope.config = assignParameter(args, 2, false);
            scope.result = new BasicReferenceContainer(null);
            scope.size = null;
            scope.visibility = null;
            scope.location = null;
            scope.type = null;
            scope.location =
                    env.callMethod(scope._thisVarAlias, "applyPathPrefix", Local.class, scope.path);
            this.ensureDirectory(env, function_dirname.f.env(env).call(scope.location).value());
            if (ZVal.strictEqualityCheck(
                    scope.size =
                            NamespaceGlobal.file_put_contents
                                    .env(env)
                                    .call(scope.location, scope.contents, this.writeFlags)
                                    .value(),
                    "===",
                    false)) {
                throw new IncludeEventException(ZVal.assign(false));
            }

            scope.type = "file";
            scope.result.setObject(
                    function_compact
                            .f
                            .env(env)
                            .call(stack, "contents", "type", "size", "path")
                            .value());
            if (ZVal.isTrue(
                    scope.visibility =
                            env.callMethod(scope.config, "get", Local.class, "visibility"))) {
                scope.result.arrayAccess(env, "visibility").set(scope.visibility);
                this.setVisibility(env, scope.path, scope.visibility);
            }

            throw new IncludeEventException(ZVal.assign(scope.result.getObject()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object writeStream(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope165 scope = new Scope165();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/Local.php");
            scope.path = assignParameter(args, 0, false);
            scope.resource = assignParameter(args, 1, false);
            scope.config = assignParameter(args, 2, false);
            scope.result = new BasicReferenceContainer(null);
            scope.visibility = null;
            scope.stream = null;
            scope.location = null;
            scope.type = null;
            scope.location =
                    env.callMethod(scope._thisVarAlias, "applyPathPrefix", Local.class, scope.path);
            this.ensureDirectory(env, function_dirname.f.env(env).call(scope.location).value());
            scope.stream = function_fopen.f.env(env).call(scope.location, "w+b").value();
            if (!ZVal.isTrue(scope.stream)) {
                throw new IncludeEventException(ZVal.assign(false));
            }

            NamespaceGlobal.stream_copy_to_stream.env(env).call(scope.resource, scope.stream);
            if (!function_fclose.f.env(env).call(scope.stream).getBool()) {
                throw new IncludeEventException(ZVal.assign(false));
            }

            scope.type = "file";
            scope.result.setObject(function_compact.f.env(env).call(stack, "type", "path").value());
            if (ZVal.isTrue(
                    scope.visibility =
                            env.callMethod(scope.config, "get", Local.class, "visibility"))) {
                this.setVisibility(env, scope.path, scope.visibility);
                scope.result.arrayAccess(env, "visibility").set(scope.visibility);
            }

            throw new IncludeEventException(ZVal.assign(scope.result.getObject()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object readStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object stream = null;
        Object location = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, path);
        stream = function_fopen.f.env(env).call(location, "rb").value();
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("type", "file"),
                        new ZPair("path", path),
                        new ZPair("stream", stream)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object updateStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object resource = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, false);
        return ZVal.assign(this.writeStream(env, path, resource, config));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object update(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope166 scope = new Scope166();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/Local.php");
            scope.path = assignParameter(args, 0, false);
            scope.contents = assignParameter(args, 1, false);
            scope.config = assignParameter(args, 2, false);
            scope.result = new BasicReferenceContainer(null);
            scope.size = null;
            scope.location = null;
            scope.mimetype = null;
            scope.type = null;
            scope.location =
                    env.callMethod(scope._thisVarAlias, "applyPathPrefix", Local.class, scope.path);
            scope.size =
                    NamespaceGlobal.file_put_contents
                            .env(env)
                            .call(scope.location, scope.contents, this.writeFlags)
                            .value();
            if (ZVal.strictEqualityCheck(scope.size, "===", false)) {
                throw new IncludeEventException(ZVal.assign(false));
            }

            scope.type = "file";
            scope.result.setObject(
                    function_compact
                            .f
                            .env(env)
                            .call(stack, "type", "path", "size", "contents")
                            .value());
            if (ZVal.isTrue(
                    scope.mimetype =
                            Util.runtimeStaticObject.guessMimeType(
                                    env, scope.path, scope.contents))) {
                scope.result.arrayAccess(env, "mimetype").set(scope.mimetype);
            }

            throw new IncludeEventException(ZVal.assign(scope.result.getObject()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object read(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = null;
        Object location = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, path);
        contents = function_file_get_contents.f.env(env).call(location).value();
        if (ZVal.strictEqualityCheck(contents, "===", false)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("type", "file"),
                        new ZPair("path", path),
                        new ZPair("contents", contents)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object rename(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        Object parentDirectory = null;
        Object destination = null;
        Object location = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, path);
        destination = env.callMethod(this, "applyPathPrefix", Local.class, newpath);
        parentDirectory =
                env.callMethod(
                        this,
                        "applyPathPrefix",
                        Local.class,
                        Util.runtimeStaticObject.dirname(env, newpath));
        this.ensureDirectory(env, parentDirectory);
        return ZVal.assign(NamespaceGlobal.rename.env(env).call(location, destination).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object copy(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        Object destination = null;
        Object location = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, path);
        destination = env.callMethod(this, "applyPathPrefix", Local.class, newpath);
        this.ensureDirectory(env, function_dirname.f.env(env).call(destination).value());
        return ZVal.assign(NamespaceGlobal.copy.env(env).call(location, destination).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object delete(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object location = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, path);
        return ZVal.assign(NamespaceGlobal.unlink.env(env).call(location).value());
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
        int runtimeConverterContinueCount;
        Object directory = assignParameter(args, 0, true);
        if (null == directory) {
            directory = "";
        }
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = false;
        }
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object path = null;
        Object iterator = null;
        Object file = null;
        Object location = null;
        result.setObject(ZVal.newArray());
        location = env.callMethod(this, "applyPathPrefix", Local.class, directory);
        if (!function_is_dir.f.env(env).call(location).getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        iterator =
                ZVal.assign(
                        ZVal.isTrue(recursive)
                                ? this.getRecursiveDirectoryIterator(env, location)
                                : this.getDirectoryIterator(env, location));
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult661 : ZVal.getIterable(iterator, env, true)) {
            file = ZVal.assign(zpairResult661.getValue());
            path = this.getFilePath(env, file);
            if (function_preg_match.f.env(env).call("#(^|/|\\\\)\\.{1,2}$#", path).getBool()) {
                continue;
            }

            result.arrayAppend(env).set(this.normalizeFileInfo(env, file));
        }

        return ZVal.assign(function_array_filter.f.env(env).call(result.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMetadata(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object location = null;
        Object info = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, path);
        info = new SplFileInfo(env, location);
        return ZVal.assign(this.normalizeFileInfo(env, info));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getSize(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(this.getMetadata(env, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMimetype(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object location = null;
        Object finfo = null;
        Object mimetype = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, path);
        finfo = new finfo(env, 16);
        mimetype = env.callMethod(finfo, "file", Local.class, location);
        if (function_in_array
                .f
                .env(env)
                .call(mimetype, ZVal.arrayFromList("application/octet-stream", "inode/x-empty"))
                .getBool()) {
            mimetype = MimeType.runtimeStaticObject.detectByFilename(env, location);
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("path", path),
                        new ZPair("type", "file"),
                        new ZPair("mimetype", mimetype)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getTimestamp(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(this.getMetadata(env, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getVisibility(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope167 scope = new Scope167();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/Local.php");
            scope.path = assignParameter(args, 0, false);
            scope.visibility = null;
            scope.permissions = null;
            scope.location = null;
            scope.location =
                    env.callMethod(scope._thisVarAlias, "applyPathPrefix", Local.class, scope.path);
            function_clearstatcache.f.env(env).call(false, scope.location);
            scope.permissions =
                    NamespaceGlobal.octdec
                            .env(env)
                            .call(
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
                                                                            .call(scope.location)
                                                                            .value())
                                                            .value(),
                                                    -4)
                                            .value())
                            .value();
            scope.visibility =
                    ZVal.assign(
                            ZVal.isTrue(ZVal.toLong(scope.permissions) & ZVal.toLong(36))
                                    ? AdapterInterface.CONST_VISIBILITY_PUBLIC
                                    : AdapterInterface.CONST_VISIBILITY_PRIVATE);
            throw new IncludeEventException(
                    ZVal.assign(
                            function_compact.f.env(env).call(stack, "path", "visibility").value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope168 scope = new Scope168();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/Local.php");
            scope.path = assignParameter(args, 0, false);
            scope.visibility = assignParameter(args, 1, false);
            scope.success = null;
            scope.location = null;
            scope.type = null;
            scope.location =
                    env.callMethod(scope._thisVarAlias, "applyPathPrefix", Local.class, scope.path);
            scope.type =
                    ZVal.assign(
                            function_is_dir.f.env(env).call(scope.location).getBool()
                                    ? "dir"
                                    : "file");
            scope.success =
                    NamespaceGlobal.chmod
                            .env(env)
                            .call(
                                    scope.location,
                                    new ReferenceClassProperty(
                                                    scope._thisVarAlias, "permissionMap", env)
                                            .arrayGet(env, scope.type, scope.visibility))
                            .value();
            if (ZVal.strictEqualityCheck(scope.success, "===", false)) {
                throw new IncludeEventException(ZVal.assign(false));
            }

            throw new IncludeEventException(
                    ZVal.assign(
                            function_compact.f.env(env).call(stack, "path", "visibility").value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    @ConvertedParameter(index = 1, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object createDir(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object umask = null;
        Object visibility = null;
        Object location = null;
        Object _pReturn = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, dirname);
        umask = NamespaceGlobal.umask.env(env).call(0).value();
        visibility = env.callMethod(config, "get", Local.class, "visibility", "public");
        if (ZVal.toBool(!function_is_dir.f.env(env).call(location).getBool())
                && ZVal.toBool(
                        !NamespaceGlobal.mkdir
                                .env(env)
                                .call(
                                        location,
                                        new ReferenceClassProperty(this, "permissionMap", env)
                                                .arrayGet(env, "dir", visibility),
                                        true)
                                .getBool())) {
            _pReturn = false;

        } else {
            _pReturn = ZVal.newArray(new ZPair("path", dirname), new ZPair("type", "dir"));
        }

        NamespaceGlobal.umask.env(env).call(umask);
        return ZVal.assign(_pReturn);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    public Object deleteDir(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        Object file = null;
        Object contents = null;
        Object location = null;
        location = env.callMethod(this, "applyPathPrefix", Local.class, dirname);
        if (!function_is_dir.f.env(env).call(location).getBool()) {
            return ZVal.assign(false);
        }

        contents = this.getRecursiveDirectoryIterator(env, location, 2);
        for (ZPair zpairResult662 : ZVal.getIterable(contents, env, true)) {
            file = ZVal.assign(zpairResult662.getValue());
            this.guardAgainstUnreadableFileInfo(env, file);
            this.deleteFileInfoObject(env, file);
        }

        return ZVal.assign(NamespaceGlobal.rmdir.env(env).call(location).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "SplFileInfo")
    protected Object deleteFileInfoObject(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object file = assignParameter(args, 0, false);
        SwitchEnumType33 switchVariable33 =
                ZVal.getEnum(
                        env.callMethod(file, "getType", Local.class),
                        SwitchEnumType33.DEFAULT_CASE,
                        SwitchEnumType33.STRING_dir,
                        "dir",
                        SwitchEnumType33.STRING_link,
                        "link");
        switch (switchVariable33) {
            case STRING_dir:
                NamespaceGlobal.rmdir
                        .env(env)
                        .call(env.callMethod(file, "getRealPath", Local.class));
                break;
            case STRING_link:
                NamespaceGlobal.unlink
                        .env(env)
                        .call(env.callMethod(file, "getPathname", Local.class));
                break;
            case DEFAULT_CASE:
                NamespaceGlobal.unlink
                        .env(env)
                        .call(env.callMethod(file, "getRealPath", Local.class));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "SplFileInfo")
    protected Object normalizeFileInfo(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(file, "isLink", Local.class))) {
            return ZVal.assign(this.mapFileInfo(env, file));
        }

        if (ZVal.isTrue(ZVal.toLong(this.linkHandling) & ZVal.toLong(CONST_DISALLOW_LINKS))) {
            throw ZVal.getException(
                    env, NotSupportedException.runtimeStaticObject.forLink(env, file));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "SplFileInfo")
    protected Object getFilePath(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object path = null;
        Object location = null;
        location = env.callMethod(file, "getPathname", Local.class);
        path = env.callMethod(this, "removePathPrefix", Local.class, location);
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(function_str_replace.f.env(env).call("\\", "/", path).value(), "/")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "mode")
    protected Object getRecursiveDirectoryIterator(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, true);
        if (null == mode) {
            mode = 1;
        }
        return ZVal.assign(
                new RecursiveIteratorIterator(
                        env, new RecursiveDirectoryIterator(env, path, 4096), mode));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object getDirectoryIterator(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object iterator = null;
        iterator = new DirectoryIterator(env, path);
        return ZVal.assign(iterator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "SplFileInfo")
    protected Object mapFileInfo(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        ReferenceContainer normalized = new BasicReferenceContainer(null);
        normalized.setObject(
                ZVal.newArray(
                        new ZPair("type", env.callMethod(file, "getType", Local.class)),
                        new ZPair("path", this.getFilePath(env, file))));
        normalized.arrayAccess(env, "timestamp").set(env.callMethod(file, "getMTime", Local.class));
        if (ZVal.strictEqualityCheck(normalized.arrayGet(env, "type"), "===", "file")) {
            normalized.arrayAccess(env, "size").set(env.callMethod(file, "getSize", Local.class));
        }

        return ZVal.assign(normalized.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file", typeHint = "SplFileInfo")
    protected Object guardAgainstUnreadableFileInfo(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        if (!ZVal.isTrue(env.callMethod(file, "isReadable", Local.class))) {
            throw ZVal.getException(
                    env, UnreadableFileException.runtimeStaticObject.forFileInfo(env, file));
        }

        return null;
    }

    public static final Object CONST_SKIP_LINKS = 1;

    public static final Object CONST_DISALLOW_LINKS = 2;

    public static final Object CONST_class = "League\\Flysystem\\Adapter\\Local";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractAdapter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object permissions =
                ZVal.newArray(
                        new ZPair(
                                "file",
                                ZVal.newArray(new ZPair("public", 420), new ZPair("private", 384))),
                        new ZPair(
                                "dir",
                                ZVal.newArray(
                                        new ZPair("public", 493), new ZPair("private", 448))));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Adapter\\Local")
                    .setLookup(
                            Local.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "linkHandling",
                            "pathPrefix",
                            "pathSeparator",
                            "pathSeparator",
                            "permissionMap",
                            "writeFlags")
                    .setStaticPropertyNames("permissions")
                    .setFilename("vendor/league/flysystem/src/Adapter/Local.php")
                    .addInterface("League\\Flysystem\\AdapterInterface")
                    .addInterface("League\\Flysystem\\ReadInterface")
                    .addExtendsClass("League\\Flysystem\\Adapter\\AbstractAdapter")
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

    private static class Scope164 implements UpdateRuntimeScopeInterface {

        ReferenceContainer result;
        Object path;
        Object size;
        Object visibility;
        Object contents;
        Object _thisVarAlias;
        Object location;
        Object type;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("result", this.result);
            stack.setVariable("path", this.path);
            stack.setVariable("size", this.size);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("contents", this.contents);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("location", this.location);
            stack.setVariable("type", this.type);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.result = ZVal.getStackReference(stack.getVariable("result"));
            this.path = stack.getVariable("path");
            this.size = stack.getVariable("size");
            this.visibility = stack.getVariable("visibility");
            this.contents = stack.getVariable("contents");
            this._thisVarAlias = stack.getVariable("this");
            this.location = stack.getVariable("location");
            this.type = stack.getVariable("type");
            this.config = stack.getVariable("config");
        }
    }

    private static class Scope165 implements UpdateRuntimeScopeInterface {

        ReferenceContainer result;
        Object path;
        Object visibility;
        Object stream;
        Object resource;
        Object _thisVarAlias;
        Object location;
        Object type;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("result", this.result);
            stack.setVariable("path", this.path);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("stream", this.stream);
            stack.setVariable("resource", this.resource);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("location", this.location);
            stack.setVariable("type", this.type);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.result = ZVal.getStackReference(stack.getVariable("result"));
            this.path = stack.getVariable("path");
            this.visibility = stack.getVariable("visibility");
            this.stream = stack.getVariable("stream");
            this.resource = stack.getVariable("resource");
            this._thisVarAlias = stack.getVariable("this");
            this.location = stack.getVariable("location");
            this.type = stack.getVariable("type");
            this.config = stack.getVariable("config");
        }
    }

    private static class Scope166 implements UpdateRuntimeScopeInterface {

        ReferenceContainer result;
        Object path;
        Object size;
        Object contents;
        Object _thisVarAlias;
        Object location;
        Object mimetype;
        Object type;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("result", this.result);
            stack.setVariable("path", this.path);
            stack.setVariable("size", this.size);
            stack.setVariable("contents", this.contents);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("location", this.location);
            stack.setVariable("mimetype", this.mimetype);
            stack.setVariable("type", this.type);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.result = ZVal.getStackReference(stack.getVariable("result"));
            this.path = stack.getVariable("path");
            this.size = stack.getVariable("size");
            this.contents = stack.getVariable("contents");
            this._thisVarAlias = stack.getVariable("this");
            this.location = stack.getVariable("location");
            this.mimetype = stack.getVariable("mimetype");
            this.type = stack.getVariable("type");
            this.config = stack.getVariable("config");
        }
    }

    private static class Scope167 implements UpdateRuntimeScopeInterface {

        Object path;
        Object visibility;
        Object permissions;
        Object _thisVarAlias;
        Object location;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("permissions", this.permissions);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("location", this.location);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this.visibility = stack.getVariable("visibility");
            this.permissions = stack.getVariable("permissions");
            this._thisVarAlias = stack.getVariable("this");
            this.location = stack.getVariable("location");
        }
    }

    private static class Scope168 implements UpdateRuntimeScopeInterface {

        Object path;
        Object visibility;
        Object success;
        Object _thisVarAlias;
        Object location;
        Object type;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("success", this.success);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("location", this.location);
            stack.setVariable("type", this.type);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this.visibility = stack.getVariable("visibility");
            this.success = stack.getVariable("success");
            this._thisVarAlias = stack.getVariable("this");
            this.location = stack.getVariable("location");
            this.type = stack.getVariable("type");
        }
    }

    private enum SwitchEnumType33 {
        STRING_dir,
        STRING_link,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
