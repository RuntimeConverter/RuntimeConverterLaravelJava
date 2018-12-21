package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_stripos;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Config;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_reverse;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Util;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Util.classes.MimeType;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.AbstractFtpAdapter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fwrite;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.AdapterInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Adapter/Ftp.php

*/

public class Ftp extends AbstractFtpAdapter {

    public Object transferMode = 2;

    public Object ignorePassiveAddress = ZVal.getNull();

    public Object recurseManually = false;

    public Object utf8 = false;

    public Object isPureFtpd = null;

    public Ftp(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.configurable =
                ZVal.arrayFromList(
                        "host",
                        "port",
                        "username",
                        "password",
                        "ssl",
                        "timeout",
                        "root",
                        "permPrivate",
                        "permPublic",
                        "passive",
                        "transferMode",
                        "systemType",
                        "ignorePassiveAddress",
                        "recurseManually",
                        "utf8");
        if (this.getClass() == Ftp.class) {
            this.__construct(env, args);
        }
    }

    public Ftp(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "mode")
    public Object setTransferMode(RuntimeEnv env, Object... args) {
        Object mode = assignParameter(args, 0, false);
        this.transferMode = mode;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ssl")
    public Object setSsl(RuntimeEnv env, Object... args) {
        Object ssl = assignParameter(args, 0, false);
        toObjectR(this).accessProp(this, env).name("ssl").set(ZVal.toBool(ssl));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "passive",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object setPassive(RuntimeEnv env, Object... args) {
        Object passive = assignParameter(args, 0, true);
        if (null == passive) {
            passive = true;
        }
        toObjectR(this).accessProp(this, env).name("passive").set(passive);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ignorePassiveAddress")
    public Object setIgnorePassiveAddress(RuntimeEnv env, Object... args) {
        Object ignorePassiveAddress = assignParameter(args, 0, false);
        this.ignorePassiveAddress = ignorePassiveAddress;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "recurseManually")
    public Object setRecurseManually(RuntimeEnv env, Object... args) {
        Object recurseManually = assignParameter(args, 0, false);
        this.recurseManually = recurseManually;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "utf8")
    public Object setUtf8(RuntimeEnv env, Object... args) {
        Object utf8 = assignParameter(args, 0, false);
        this.utf8 = ZVal.toBool(utf8);
        return null;
    }

    @ConvertedMethod
    public Object connect(RuntimeEnv env, Object... args) {
        if (toObjectR(this).accessProp(this, env).name("ssl").getBool()) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("connection")
                    .set(
                            com.runtimeconverter.runtime.ZVal.functionNotFound("ftp_ssl_connect")
                                    .env(env)
                                    .call(
                                            env.callMethod(this, "getHost", Ftp.class),
                                            env.callMethod(this, "getPort", Ftp.class),
                                            env.callMethod(this, "getTimeout", Ftp.class))
                                    .value());

        } else {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("connection")
                    .set(
                            NamespaceGlobal.ftp_connect
                                    .env(env)
                                    .call(
                                            env.callMethod(this, "getHost", Ftp.class),
                                            env.callMethod(this, "getPort", Ftp.class),
                                            env.callMethod(this, "getTimeout", Ftp.class))
                                    .value());
        }

        if (!toObjectR(this).accessProp(this, env).name("connection").getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Could not connect to host: "
                                    + toStringR(env.callMethod(this, "getHost", Ftp.class), env)
                                    + ", port:"
                                    + toStringR(env.callMethod(this, "getPort", Ftp.class), env)));
        }

        this.login(env);
        this.setUtf8Mode(env);
        this.setConnectionPassiveMode(env);
        this.setConnectionRoot(env);
        this.isPureFtpd = this.isPureFtpdServer(env);
        return null;
    }

    @ConvertedMethod
    protected Object setUtf8Mode(RuntimeEnv env, Object... args) {
        ReferenceContainer response = new BasicReferenceContainer(null);
        if (ZVal.isTrue(this.utf8)) {
            response.setObject(
                    NamespaceGlobal.ftp_raw
                            .env(env)
                            .call(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("connection")
                                            .value(),
                                    "OPTS UTF8 ON")
                            .value());
            if (ZVal.strictNotEqualityCheck(
                    function_substr.f.env(env).call(response.arrayGet(env, 0), 0, 3).value(),
                    "!==",
                    "200")) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Could not set UTF-8 mode for connection: "
                                        + toStringR(env.callMethod(this, "getHost", Ftp.class), env)
                                        + "::"
                                        + toStringR(
                                                env.callMethod(this, "getPort", Ftp.class), env)));
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object setConnectionPassiveMode(RuntimeEnv env, Object... args) {
        if (ZVal.toBool(function_is_bool.f.env(env).call(this.ignorePassiveAddress).value())
                && ZVal.toBool(function_defined.f.env(env).call("FTP_USEPASVADDRESS").value())) {
            NamespaceGlobal.ftp_set_option
                    .env(env)
                    .call(
                            toObjectR(this).accessProp(this, env).name("connection").value(),
                            2,
                            !ZVal.isTrue(this.ignorePassiveAddress));
        }

        if (!NamespaceGlobal.ftp_pasv
                .env(env)
                .call(
                        toObjectR(this).accessProp(this, env).name("connection").value(),
                        toObjectR(this).accessProp(this, env).name("passive").value())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Could not set passive mode for connection: "
                                    + toStringR(env.callMethod(this, "getHost", Ftp.class), env)
                                    + "::"
                                    + toStringR(env.callMethod(this, "getPort", Ftp.class), env)));
        }

        return null;
    }

    @ConvertedMethod
    protected Object setConnectionRoot(RuntimeEnv env, Object... args) {
        Object root = null;
        Object connection = null;
        root = env.callMethod(this, "getRoot", Ftp.class);
        connection = ZVal.assign(toObjectR(this).accessProp(this, env).name("connection").value());
        if (ZVal.toBool(root)
                && ZVal.toBool(
                        !NamespaceGlobal.ftp_chdir.env(env).call(connection, root).getBool())) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Root is invalid or does not exist: "
                                    + toStringR(env.callMethod(this, "getRoot", Ftp.class), env)));
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("root")
                .set(NamespaceGlobal.ftp_pwd.env(env).call(connection).value());
        return null;
    }

    @ConvertedMethod
    protected Object login(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/league/flysystem/src/Adapter")
                        .setFile("/vendor/league/flysystem/src/Adapter/Ftp.php");
        Object isLoggedIn = null;
        function_set_error_handler
                .f
                .env(env)
                .call(
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "League\\Flysystem\\Adapter",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                return null;
                            }
                        });
        isLoggedIn =
                NamespaceGlobal.ftp_login
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("connection").value(),
                                env.callMethod(this, "getUsername", Ftp.class),
                                env.callMethod(this, "getPassword", Ftp.class))
                        .value();
        function_restore_error_handler.f.env(env).call();
        if (!ZVal.isTrue(isLoggedIn)) {
            this.disconnect(env);
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            "Could not login with connection: "
                                    + toStringR(env.callMethod(this, "getHost", Ftp.class), env)
                                    + "::"
                                    + toStringR(env.callMethod(this, "getPort", Ftp.class), env)
                                    + ", username: "
                                    + toStringR(
                                            env.callMethod(this, "getUsername", Ftp.class), env)));
        }

        return null;
    }

    @ConvertedMethod
    public Object disconnect(RuntimeEnv env, Object... args) {
        if (function_is_resource
                .f
                .env(env)
                .call(toObjectR(this).accessProp(this, env).name("connection").value())
                .getBool()) {
            NamespaceGlobal.ftp_close
                    .env(env)
                    .call(toObjectR(this).accessProp(this, env).name("connection").value());
        }

        toObjectR(this).accessProp(this, env).name("connection").set(ZVal.getNull());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object write(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object stream = null;
        stream = function_fopen.f.env(env).call("php://temp", "w+b").value();
        function_fwrite.f.env(env).call(stream, contents);
        NamespaceGlobal.rewind.env(env).call(stream);
        result.setObject(this.writeStream(env, path, stream, config));
        function_fclose.f.env(env).call(stream);
        if (ZVal.strictEqualityCheck(result.getObject(), "===", false)) {
            return ZVal.assign(false);
        }

        result.arrayAccess(env, "contents").set(contents);
        result.arrayAccess(env, "mimetype")
                .set(Util.runtimeStaticObject.guessMimeType(env, path, contents));
        return ZVal.assign(result.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "resource")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object writeStream(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope162 scope = new Scope162();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/Ftp.php");
            scope.path = assignParameter(args, 0, false);
            scope.resource = assignParameter(args, 1, false);
            scope.config = assignParameter(args, 2, false);
            scope.visibility = null;
            scope.type = null;
            env.callMethod(
                    scope._thisVarAlias,
                    "ensureDirectory",
                    Ftp.class,
                    Util.runtimeStaticObject.dirname(env, scope.path));
            if (!NamespaceGlobal.ftp_fput
                    .env(env)
                    .call(
                            env.callMethod(scope._thisVarAlias, "getConnection", Ftp.class),
                            scope.path,
                            scope.resource,
                            this.transferMode)
                    .getBool()) {
                throw new IncludeEventException(ZVal.assign(false));
            }

            if (ZVal.isTrue(
                    scope.visibility =
                            env.callMethod(scope.config, "get", Ftp.class, "visibility"))) {
                this.setVisibility(env, scope.path, scope.visibility);
            }

            scope.type = "file";
            throw new IncludeEventException(
                    ZVal.assign(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "path", "visibility")
                                    .value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "contents")
    @ConvertedParameter(index = 2, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object update(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object contents = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, false);
        return ZVal.assign(this.write(env, path, contents, config));
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
    @ConvertedParameter(index = 1, name = "newpath")
    public Object rename(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        return ZVal.assign(
                NamespaceGlobal.ftp_rename
                        .env(env)
                        .call(env.callMethod(this, "getConnection", Ftp.class), path, newpath)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object delete(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.ftp_delete
                        .env(env)
                        .call(env.callMethod(this, "getConnection", Ftp.class), path)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    public Object deleteDir(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        Object contents = null;
        Object connection = null;
        ReferenceContainer _object = new BasicReferenceContainer(null);
        connection = env.callMethod(this, "getConnection", Ftp.class);
        contents =
                function_array_reverse
                        .f
                        .env(env)
                        .call(this.listDirectoryContents(env, dirname, false))
                        .value();
        for (ZPair zpairResult657 : ZVal.getIterable(contents, env, true)) {
            _object.setObject(ZVal.assign(zpairResult657.getValue()));
            if (ZVal.strictEqualityCheck(_object.arrayGet(env, "type"), "===", "file")) {
                if (!NamespaceGlobal.ftp_delete
                        .env(env)
                        .call(connection, _object.arrayGet(env, "path"))
                        .getBool()) {
                    return ZVal.assign(false);
                }

            } else if (!ZVal.isTrue(this.deleteDir(env, _object.arrayGet(env, "path")))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(NamespaceGlobal.ftp_rmdir.env(env).call(connection, dirname).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    @ConvertedParameter(index = 1, name = "config", typeHint = "League\\Flysystem\\Config")
    public Object createDir(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        Object config = assignParameter(args, 1, false);
        Object directories = null;
        Object connection = null;
        Object directory = null;
        connection = env.callMethod(this, "getConnection", Ftp.class);
        directories = function_explode.f.env(env).call("/", dirname).value();
        for (ZPair zpairResult658 : ZVal.getIterable(directories, env, true)) {
            directory = ZVal.assign(zpairResult658.getValue());
            if (ZVal.strictEqualityCheck(
                    false, "===", this.createActualDirectory(env, directory, connection))) {
                this.setConnectionRoot(env);
                return ZVal.assign(false);
            }

            NamespaceGlobal.ftp_chdir.env(env).call(connection, directory);
        }

        this.setConnectionRoot(env);
        return ZVal.assign(ZVal.newArray(new ZPair("type", "dir"), new ZPair("path", dirname)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(index = 1, name = "connection")
    protected Object createActualDirectory(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object connection = assignParameter(args, 1, false);
        Object item = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer listing = new BasicReferenceContainer(null);
        Object key = null;
        listing.setObject(
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                NamespaceGlobal.ftp_nlist
                                                        .env(env)
                                                        .call(connection, ".")
                                                        .value())
                                ? ternaryExpressionTemp
                                : ZVal.newArray()));
        for (ZPair zpairResult659 : ZVal.getIterable(listing.getObject(), env, false)) {
            key = ZVal.assign(zpairResult659.getKey());
            item = ZVal.assign(zpairResult659.getValue());
            if (function_preg_match.f.env(env).call("~^\\./.*~", item).getBool()) {
                listing.arrayAccess(env, key).set(function_substr.f.env(env).call(item, 2).value());
            }
        }

        if (function_in_array.f.env(env).call(directory, listing.getObject(), true).getBool()) {
            return ZVal.assign(true);
        }

        return ZVal.assign(
                ZVal.toBool(
                        NamespaceGlobal.ftp_mkdir.env(env).call(connection, directory).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMetadata(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object connection = null;
        ReferenceContainer listing = new BasicReferenceContainer(null);
        connection = env.callMethod(this, "getConnection", Ftp.class);
        if (ZVal.strictEqualityCheck(path, "===", "")) {
            return ZVal.assign(ZVal.newArray(new ZPair("type", "dir"), new ZPair("path", "")));
        }

        if (ZVal.strictEqualityCheck(
                NamespaceGlobal.ftp_chdir.env(env).call(connection, path).value(), "===", true)) {
            this.setConnectionRoot(env);
            return ZVal.assign(ZVal.newArray(new ZPair("type", "dir"), new ZPair("path", path)));
        }

        listing.setObject(
                this.ftpRawlist(
                        env, "-A", function_str_replace.f.env(env).call("*", "\\*", path).value()));
        if (ZVal.toBool(ZVal.isEmpty(listing.getObject()))
                || ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call("total 0", listing.getObject(), true)
                                .value())) {
            return ZVal.assign(false);
        }

        if (function_preg_match
                .f
                .env(env)
                .call("/.* not found/", listing.arrayGet(env, 0))
                .getBool()) {
            return ZVal.assign(false);
        }

        if (function_preg_match
                .f
                .env(env)
                .call("/^total [0-9]*$/", listing.arrayGet(env, 0))
                .getBool()) {
            function_array_shift.f.env(env).call(listing.getObject());
        }

        return ZVal.assign(
                env.callMethod(this, "normalizeObject", Ftp.class, listing.arrayGet(env, 0), ""));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getMimetype(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(metadata.setObject(this.getMetadata(env, path)))) {
            return ZVal.assign(false);
        }

        metadata.arrayAccess(env, "mimetype")
                .set(MimeType.runtimeStaticObject.detectByFilename(env, path));
        return ZVal.assign(metadata.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getTimestamp(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object timestamp = null;
        timestamp =
                NamespaceGlobal.ftp_mdtm
                        .env(env)
                        .call(env.callMethod(this, "getConnection", Ftp.class), path)
                        .value();
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(timestamp, "!==", -1)
                        ? ZVal.newArray(new ZPair("path", path), new ZPair("timestamp", timestamp))
                        : false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object read(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        ReferenceContainer _object = new BasicReferenceContainer(null);
        if (!ZVal.isTrue(_object.setObject(this.readStream(env, path)))) {
            return ZVal.assign(false);
        }

        _object.arrayAccess(env, "contents")
                .set(
                        NamespaceGlobal.stream_get_contents
                                .env(env)
                                .call(_object.arrayGet(env, "stream"))
                                .value());
        function_fclose.f.env(env).call(_object.arrayGet(env, "stream"));
        arrayActionR(ArrayAction.UNSET, _object, env, "stream");
        return ZVal.assign(_object.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object readStream(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object result = null;
        Object stream = null;
        stream = function_fopen.f.env(env).call("php://temp", "w+b").value();
        result =
                NamespaceGlobal.ftp_fget
                        .env(env)
                        .call(
                                env.callMethod(this, "getConnection", Ftp.class),
                                stream,
                                path,
                                this.transferMode)
                        .value();
        NamespaceGlobal.rewind.env(env).call(stream);
        if (!ZVal.isTrue(result)) {
            function_fclose.f.env(env).call(stream);
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.newArray(
                        new ZPair("type", "file"),
                        new ZPair("path", path),
                        new ZPair("stream", stream)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "visibility")
    public Object setVisibility(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope163 scope = new Scope163();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/Ftp.php");
            scope.path = assignParameter(args, 0, false);
            scope.visibility = assignParameter(args, 1, false);
            scope.mode = null;
            scope.mode =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(
                                            scope.visibility,
                                            "===",
                                            AdapterInterface.CONST_VISIBILITY_PUBLIC)
                                    ? env.callMethod(
                                            scope._thisVarAlias, "getPermPublic", Ftp.class)
                                    : env.callMethod(
                                            scope._thisVarAlias, "getPermPrivate", Ftp.class));
            if (!NamespaceGlobal.ftp_chmod
                    .env(env)
                    .call(
                            env.callMethod(scope._thisVarAlias, "getConnection", Ftp.class),
                            scope.mode,
                            scope.path)
                    .getBool()) {
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
    @ConvertedParameter(index = 0, name = "directory")
    @ConvertedParameter(
        index = 1,
        name = "recursive",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object listDirectoryContents(RuntimeEnv env, Object... args) {
        Object directory = assignParameter(args, 0, false);
        Object recursive = assignParameter(args, 1, true);
        if (null == recursive) {
            recursive = true;
        }
        Object options = null;
        Object listing = null;
        directory = function_str_replace.f.env(env).call("*", "\\*", directory).value();
        if (ZVal.toBool(recursive) && ZVal.toBool(this.recurseManually)) {
            return ZVal.assign(this.listDirectoryContentsRecursive(env, directory));
        }

        options = ZVal.assign(ZVal.isTrue(recursive) ? "-alnR" : "-aln");
        listing = this.ftpRawlist(env, options, directory);
        return ZVal.assign(
                ZVal.isTrue(listing)
                        ? env.callMethod(this, "normalizeListing", Ftp.class, listing, directory)
                        : ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "directory")
    protected Object listDirectoryContentsRecursive(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object directory = assignParameter(args, 0, false);
        ReferenceContainer output = new BasicReferenceContainer(null);
        ReferenceContainer item = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object listing = null;
        listing =
                env.callMethod(
                        this,
                        "normalizeListing",
                        Ftp.class,
                        ZVal.isTrue(ternaryExpressionTemp = this.ftpRawlist(env, "-aln", directory))
                                ? ternaryExpressionTemp
                                : ZVal.newArray(),
                        directory);
        output.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult660 : ZVal.getIterable(listing, env, true)) {
            item.setObject(ZVal.assign(zpairResult660.getValue()));
            output.arrayAppend(env).set(item.getObject());
            if (ZVal.strictNotEqualityCheck(item.arrayGet(env, "type"), "!==", "dir")) {
                continue;
            }

            output.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    output.getObject(),
                                    this.listDirectoryContentsRecursive(
                                            env, item.arrayGet(env, "path")))
                            .value());
        }

        return ZVal.assign(output.getObject());
    }

    @ConvertedMethod
    public Object isConnected(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            return ZVal.assign(
                    ZVal.toBool(
                                    function_is_resource
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("connection")
                                                            .value())
                                            .value())
                            && ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            NamespaceGlobal.ftp_rawlist
                                                    .env(env)
                                                    .call(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("connection")
                                                                    .value(),
                                                            env.callMethod(
                                                                    this, "getRoot", Ftp.class))
                                                    .value(),
                                            "!==",
                                            false)));
        } catch (ConvertedException convertedException73) {
            if (convertedException73.instanceOf(ErrorException.class, "ErrorException")) {
                e = convertedException73.getObject();
                if (ZVal.strictEqualityCheck(
                        function_strpos
                                .f
                                .env(env)
                                .call(env.callMethod(e, "getMessage", Ftp.class), "ftp_rawlist")
                                .value(),
                        "===",
                        false)) {
                    throw ZVal.getException(env, e);
                }

                return ZVal.assign(false);
            } else {
                throw convertedException73;
            }
        }
    }

    @ConvertedMethod
    protected Object isPureFtpdServer(RuntimeEnv env, Object... args) {
        Object response = null;
        response =
                NamespaceGlobal.ftp_raw
                        .env(env)
                        .call(
                                toObjectR(this).accessProp(this, env).name("connection").value(),
                                "HELP")
                        .value();
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                        function_stripos
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call(" ", response)
                                                .value(),
                                        "Pure-FTPd")
                                .value(),
                        "!==",
                        false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    @ConvertedParameter(index = 1, name = "path")
    protected Object ftpRawlist(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object connection = null;
        connection = env.callMethod(this, "getConnection", Ftp.class);
        if (ZVal.isTrue(this.isPureFtpd)) {
            path = function_str_replace.f.env(env).call(" ", "\\ ", path).value();
        }

        return ZVal.assign(
                NamespaceGlobal.ftp_rawlist
                        .env(env)
                        .call(connection, toStringR(options, env) + " " + toStringR(path, env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "newpath")
    public Object copy(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object newpath = assignParameter(args, 1, false);
        Object result = null;
        ReferenceContainer response = new BasicReferenceContainer(null);
        response.setObject(this.readStream(env, path));
        if (ZVal.toBool(ZVal.strictEqualityCheck(response.getObject(), "===", false))
                || ZVal.toBool(
                        !function_is_resource
                                .f
                                .env(env)
                                .call(response.arrayGet(env, "stream"))
                                .getBool())) {
            return ZVal.assign(false);
        }

        result = this.writeStream(env, newpath, response.arrayGet(env, "stream"), new Config(env));
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(result, "!==", false))
                && ZVal.toBool(
                        function_is_resource
                                .f
                                .env(env)
                                .call(response.arrayGet(env, "stream"))
                                .value())) {
            function_fclose.f.env(env).call(response.arrayGet(env, "stream"));
        }

        return ZVal.assign(ZVal.strictNotEqualityCheck(result, "!==", false));
    }

    public static final Object CONST_class = "League\\Flysystem\\Adapter\\Ftp";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractFtpAdapter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Adapter\\Ftp")
                    .setLookup(
                            Ftp.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativeRecursion",
                            "configurable",
                            "configurable",
                            "connection",
                            "host",
                            "ignorePassiveAddress",
                            "isPureFtpd",
                            "passive",
                            "pathPrefix",
                            "pathSeparator",
                            "permPrivate",
                            "permPublic",
                            "port",
                            "recurseManually",
                            "root",
                            "safeStorage",
                            "separator",
                            "ssl",
                            "systemType",
                            "timeout",
                            "transferMode",
                            "utf8")
                    .setFilename("vendor/league/flysystem/src/Adapter/Ftp.php")
                    .addInterface("League\\Flysystem\\AdapterInterface")
                    .addInterface("League\\Flysystem\\ReadInterface")
                    .addTrait("League\\Flysystem\\Adapter\\Polyfill\\StreamedCopyTrait")
                    .addExtendsClass("League\\Flysystem\\Adapter\\AbstractFtpAdapter")
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

    private static class Scope162 implements UpdateRuntimeScopeInterface {

        Object path;
        Object visibility;
        Object resource;
        Object _thisVarAlias;
        Object type;
        Object config;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("resource", this.resource);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("type", this.type);
            stack.setVariable("config", this.config);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this.visibility = stack.getVariable("visibility");
            this.resource = stack.getVariable("resource");
            this._thisVarAlias = stack.getVariable("this");
            this.type = stack.getVariable("type");
            this.config = stack.getVariable("config");
        }
    }

    private static class Scope163 implements UpdateRuntimeScopeInterface {

        Object mode;
        Object path;
        Object visibility;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("mode", this.mode);
            stack.setVariable("path", this.path);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.mode = stack.getVariable("mode");
            this.path = stack.getVariable("path");
            this.visibility = stack.getVariable("visibility");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
