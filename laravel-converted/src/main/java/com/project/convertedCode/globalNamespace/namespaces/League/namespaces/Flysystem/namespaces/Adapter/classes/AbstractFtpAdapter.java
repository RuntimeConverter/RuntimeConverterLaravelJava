package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.Config;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeClasses.date.DateTime;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_sum;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeFunctions.array.function_usort;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Adapter.classes.AbstractAdapter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.SafeStorage;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.AdapterInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.NotSupportedException;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Adapter/AbstractFtpAdapter.php

*/

public abstract class AbstractFtpAdapter extends AbstractAdapter {

    public Object connection = null;

    public Object host = null;

    public Object port = 21;

    public Object ssl = false;

    public Object timeout = 90;

    public Object passive = true;

    public Object separator = "/";

    public Object root = null;

    public Object permPublic = 484;

    public Object permPrivate = 448;

    public Object configurable = ZVal.newArray();

    public Object systemType = null;

    public Object alternativeRecursion = false;

    public Object safeStorage = null;

    public AbstractFtpAdapter(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AbstractFtpAdapter.class) {
            this.__construct(env, args);
        }
    }

    public AbstractFtpAdapter(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, false);
        this.safeStorage = new SafeStorage(env);
        this.setConfig(env, config);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object setConfig(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object method = null;
        Object setting = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult656 : ZVal.getIterable(this.configurable, env, true)) {
            setting = ZVal.assign(zpairResult656.getValue());
            if (!arrayActionR(ArrayAction.ISSET, config, env, setting)) {
                continue;
            }

            method = "set" + toStringR(NamespaceGlobal.ucfirst.env(env).call(setting).value(), env);
            if (function_method_exists.f.env(env).call(this, method).getBool()) {
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences()
                                .add(0, new ArrayDimensionReference(config.getObject(), setting)),
                        toStringR(method, env),
                        AbstractFtpAdapter.class,
                        config.arrayGet(env, setting));
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHost(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.host);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host")
    public Object setHost(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        this.host = host;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "permPublic")
    public Object setPermPublic(RuntimeEnv env, Object... args) {
        Object permPublic = assignParameter(args, 0, false);
        this.permPublic = permPublic;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "permPrivate")
    public Object setPermPrivate(RuntimeEnv env, Object... args) {
        Object permPrivate = assignParameter(args, 0, false);
        this.permPrivate = permPrivate;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPort(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.port);
    }

    @ConvertedMethod
    public Object getRoot(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.root);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "port")
    public Object setPort(RuntimeEnv env, Object... args) {
        Object port = assignParameter(args, 0, false);
        this.port = ZVal.toLong(port);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "root")
    public Object setRoot(RuntimeEnv env, Object... args) {
        Object root = assignParameter(args, 0, false);
        this.root =
                toStringR(function_rtrim.f.env(env).call(root, "\\/").value(), env)
                        + toStringR(this.separator, env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getUsername(RuntimeEnv env, Object... args) {
        Object username = null;
        username =
                env.callMethod(
                        this.safeStorage, "retrieveSafely", AbstractFtpAdapter.class, "username");
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(username, "!==", ZVal.getNull())
                        ? username
                        : "anonymous");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "username")
    public Object setUsername(RuntimeEnv env, Object... args) {
        Object username = assignParameter(args, 0, false);
        env.callMethod(
                this.safeStorage, "storeSafely", AbstractFtpAdapter.class, "username", username);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPassword(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.safeStorage, "retrieveSafely", AbstractFtpAdapter.class, "password"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "password")
    public Object setPassword(RuntimeEnv env, Object... args) {
        Object password = assignParameter(args, 0, false);
        env.callMethod(
                this.safeStorage, "storeSafely", AbstractFtpAdapter.class, "password", password);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getTimeout(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.timeout);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "timeout")
    public Object setTimeout(RuntimeEnv env, Object... args) {
        Object timeout = assignParameter(args, 0, false);
        this.timeout = ZVal.toLong(timeout);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSystemType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.systemType);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "systemType")
    public Object setSystemType(RuntimeEnv env, Object... args) {
        Object systemType = assignParameter(args, 0, false);
        this.systemType = NamespaceGlobal.strtolower.env(env).call(systemType).value();
        return ZVal.assign(this);
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
        return ZVal.assign(
                env.callMethod(
                        this,
                        "listDirectoryContents",
                        AbstractFtpAdapter.class,
                        directory,
                        recursive));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "listing", typeHint = "array")
    @ConvertedParameter(index = 1, name = "prefix")
    protected Object normalizeListing(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object listing = assignParameter(args, 0, false);
        Object prefix = assignParameter(args, 1, true);
        if (null == prefix) {
            prefix = "";
        }
        ReferenceContainer result = new BasicReferenceContainer(null);
        Object item = null;
        Object base = null;
        base = ZVal.assign(prefix);
        result.setObject(ZVal.newArray());
        listing = this.removeDotDirectories(env, listing);
        runtimeConverterContinueCount = 0;
        while (ZVal.isTrue(item = function_array_shift.f.env(env).call(listing).value())) {
            if (function_preg_match.f.env(env).call("#^.*:$#", item).getBool()) {
                base = function_preg_replace.f.env(env).call("~^\\./*|:$~", "", item).value();
                continue;
            }

            result.arrayAppend(env).set(this.normalizeObject(env, item, base));
        }

        return ZVal.assign(this.sortListing(env, result.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result", typeHint = "array")
    protected Object sortListing(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/league/flysystem/src/Adapter")
                        .setFile("/vendor/league/flysystem/src/Adapter/AbstractFtpAdapter.php");
        Object result = assignParameter(args, 0, false);
        Object compare = null;
        compare =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "League\\Flysystem\\Adapter",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "one")
                    @ConvertedParameter(index = 1, name = "two")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        ReferenceContainer one =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        ReferenceContainer two =
                                new BasicReferenceContainer(assignParameter(args, 1, false));
                        return ZVal.assign(
                                NamespaceGlobal.strnatcmp
                                        .env(env)
                                        .call(one.arrayGet(env, "path"), two.arrayGet(env, "path"))
                                        .value());
                    }
                };
        function_usort.f.env(env).call(result, compare);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "base")
    protected Object normalizeObject(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        Object base = assignParameter(args, 1, false);
        Object systemType = null;
        Object ternaryExpressionTemp = null;
        systemType =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = this.systemType)
                                ? ternaryExpressionTemp
                                : this.detectSystemType(env, item));
        if (ZVal.strictEqualityCheck(systemType, "===", "unix")) {
            return ZVal.assign(this.normalizeUnixObject(env, item, base));

        } else if (ZVal.strictEqualityCheck(systemType, "===", "windows")) {
            return ZVal.assign(this.normalizeWindowsObject(env, item, base));
        }

        throw ZVal.getException(
                env, NotSupportedException.runtimeStaticObject.forFtpSystemType(env, systemType));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "base")
    protected Object normalizeUnixObject(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope159 scope = new Scope159();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/AbstractFtpAdapter.php");
            scope.item = assignParameter(args, 0, false);
            scope.base = assignParameter(args, 1, false);
            scope.runtimeTempArrayResult103 = null;
            scope.path = null;
            scope.size = null;
            scope.visibility = null;
            scope.permissions = null;
            scope.name = null;
            scope.type = null;
            scope.item =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "#\\s+#",
                                    " ",
                                    function_trim.f.env(env).call(scope.item).value(),
                                    7)
                            .value();
            if (ZVal.strictNotEqualityCheck(
                    function_count
                            .f
                            .env(env)
                            .call(function_explode.f.env(env).call(" ", scope.item, 9).value())
                            .value(),
                    "!==",
                    9)) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Metadata can't be parsed from item '"
                                        + toStringR(scope.item, env)
                                        + "' , not enough parts."));
            }

            ZVal.list(
                    scope.runtimeTempArrayResult103 =
                            function_explode.f.env(env).call(" ", scope.item, 9).value(),
                    (scope.permissions = listGet(scope.runtimeTempArrayResult103, 0, env)),
                    (scope.size = listGet(scope.runtimeTempArrayResult103, 4, env)),
                    (scope.name = listGet(scope.runtimeTempArrayResult103, 8, env)));
            scope.type = this.detectType(env, scope.permissions);
            scope.path =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(scope.base, "===", "")
                                    ? scope.name
                                    : toStringR(scope.base, env)
                                            + toStringR(this.separator, env)
                                            + toStringR(scope.name, env));
            if (ZVal.strictEqualityCheck(scope.type, "===", "dir")) {
                throw new IncludeEventException(
                        ZVal.assign(
                                function_compact.f.env(env).call(stack, "type", "path").value()));
            }

            scope.permissions = this.normalizePermissions(env, scope.permissions);
            scope.visibility =
                    ZVal.assign(
                            ZVal.isTrue(ZVal.toLong(scope.permissions) & ZVal.toLong(36))
                                    ? AdapterInterface.CONST_VISIBILITY_PUBLIC
                                    : AdapterInterface.CONST_VISIBILITY_PRIVATE);
            scope.size = ZVal.assign(ZVal.toLong(scope.size));
            throw new IncludeEventException(
                    ZVal.assign(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "path", "visibility", "size")
                                    .value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    @ConvertedParameter(index = 1, name = "base")
    protected Object normalizeWindowsObject(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope161 scope = new Scope161();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/league/flysystem/src/Adapter")
                            .setFile("/vendor/league/flysystem/src/Adapter/AbstractFtpAdapter.php");
            scope.item = assignParameter(args, 0, false);
            scope.base = assignParameter(args, 1, false);
            scope.date = null;
            scope.visibility = null;
            scope.format = null;
            scope.type = null;
            scope.runtimeTempArrayResult104 = null;
            scope.dt = null;
            scope.path = null;
            scope.size = null;
            scope.name = null;
            scope.time = null;
            scope.timestamp = null;
            scope.item =
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "#\\s+#",
                                    " ",
                                    function_trim.f.env(env).call(scope.item).value(),
                                    3)
                            .value();
            if (ZVal.strictNotEqualityCheck(
                    function_count
                            .f
                            .env(env)
                            .call(function_explode.f.env(env).call(" ", scope.item, 4).value())
                            .value(),
                    "!==",
                    4)) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                "Metadata can't be parsed from item '"
                                        + toStringR(scope.item, env)
                                        + "' , not enough parts."));
            }

            ZVal.list(
                    scope.runtimeTempArrayResult104 =
                            function_explode.f.env(env).call(" ", scope.item, 4).value(),
                    (scope.date = listGet(scope.runtimeTempArrayResult104, 0, env)),
                    (scope.time = listGet(scope.runtimeTempArrayResult104, 1, env)),
                    (scope.size = listGet(scope.runtimeTempArrayResult104, 2, env)),
                    (scope.name = listGet(scope.runtimeTempArrayResult104, 3, env)));
            scope.path =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(scope.base, "===", "")
                                    ? scope.name
                                    : toStringR(scope.base, env)
                                            + toStringR(this.separator, env)
                                            + toStringR(scope.name, env));
            scope.format =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(
                                            function_strlen.f.env(env).call(scope.date).value(),
                                            "===",
                                            8)
                                    ? "m-d-yH:iA"
                                    : "Y-m-dH:i");
            scope.dt =
                    DateTime.runtimeStaticObject.createFromFormat(
                            env,
                            scope.format,
                            toStringR(scope.date, env) + toStringR(scope.time, env));
            scope.timestamp =
                    ZVal.assign(
                            ZVal.isTrue(scope.dt)
                                    ? env.callMethod(
                                            scope.dt, "getTimestamp", AbstractFtpAdapter.class)
                                    : ZVal.toLong(
                                            NamespaceGlobal.strtotime
                                                    .env(env)
                                                    .call(
                                                            toStringR(scope.date, env)
                                                                    + " "
                                                                    + toStringR(scope.time, env))
                                                    .value()));
            if (ZVal.strictEqualityCheck(scope.size, "===", "<DIR>")) {
                scope.type = "dir";
                throw new IncludeEventException(
                        ZVal.assign(
                                function_compact
                                        .f
                                        .env(env)
                                        .call(stack, "type", "path", "timestamp")
                                        .value()));
            }

            scope.type = "file";
            scope.visibility = ZVal.assign(AdapterInterface.CONST_VISIBILITY_PUBLIC);
            scope.size = ZVal.assign(ZVal.toLong(scope.size));
            throw new IncludeEventException(
                    ZVal.assign(
                            function_compact
                                    .f
                                    .env(env)
                                    .call(stack, "type", "path", "visibility", "size", "timestamp")
                                    .value()));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    protected Object detectSystemType(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(
                function_preg_match
                                .f
                                .env(env)
                                .call("/^[0-9]{2,4}-[0-9]{2}-[0-9]{2}/", item)
                                .getBool()
                        ? "windows"
                        : "unix");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "permissions")
    protected Object detectType(RuntimeEnv env, Object... args) {
        Object permissions = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                                function_substr.f.env(env).call(permissions, 0, 1).value(),
                                "===",
                                "d")
                        ? "dir"
                        : "file");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "permissions")
    protected Object normalizePermissions(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/league/flysystem/src/Adapter")
                        .setFile("/vendor/league/flysystem/src/Adapter/AbstractFtpAdapter.php");
        Object permissions = assignParameter(args, 0, false);
        Object parts = null;
        Object mapper = null;
        Object map = null;
        permissions = function_substr.f.env(env).call(permissions, 1).value();
        map =
                ZVal.newArray(
                        new ZPair("-", "0"),
                        new ZPair("r", "4"),
                        new ZPair("w", "2"),
                        new ZPair("x", "1"));
        permissions = NamespaceGlobal.strtr.env(env).call(permissions, map).value();
        parts = NamespaceGlobal.str_split.env(env).call(permissions, 3).value();
        mapper =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "League\\Flysystem\\Adapter",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "part")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object part = assignParameter(args, 0, false);
                        return ZVal.assign(
                                function_array_sum
                                        .f
                                        .env(env)
                                        .call(NamespaceGlobal.str_split.env(env).call(part).value())
                                        .value());
                    }
                };
        return ZVal.assign(
                NamespaceGlobal.octdec
                        .env(env)
                        .call(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(
                                                "",
                                                function_array_map
                                                        .f
                                                        .env(env)
                                                        .call(mapper, parts)
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "list", typeHint = "array")
    public Object removeDotDirectories(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/league/flysystem/src/Adapter")
                        .setFile("/vendor/league/flysystem/src/Adapter/AbstractFtpAdapter.php");
        Object list = assignParameter(args, 0, false);
        Object filter = null;
        filter =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "League\\Flysystem\\Adapter",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "line")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object line = assignParameter(args, 0, false);
                        return ZVal.assign(
                                ZVal.toBool(ZVal.strictNotEqualityCheck(line, "!==", ""))
                                        && ZVal.toBool(
                                                !function_preg_match
                                                        .f
                                                        .env(env)
                                                        .call("#.* \\.(\\.)?$|^total#", line)
                                                        .getBool()));
                    }
                };
        return ZVal.assign(function_array_filter.f.env(env).call(list, filter).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object has(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this, "getMetadata", AbstractFtpAdapter.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getSize(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this, "getMetadata", AbstractFtpAdapter.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object getVisibility(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this, "getMetadata", AbstractFtpAdapter.class, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dirname")
    public Object ensureDirectory(RuntimeEnv env, Object... args) {
        Object dirname = assignParameter(args, 0, false);
        dirname = ZVal.assign(toStringR(dirname, env));
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(dirname, "!==", ""))
                && ZVal.toBool(!ZVal.isTrue(this.has(env, dirname)))) {
            env.callMethod(this, "createDir", AbstractFtpAdapter.class, dirname, new Config(env));
        }

        return null;
    }

    @ConvertedMethod
    public Object getConnection(RuntimeEnv env, Object... args) {
        ReferenceContainer tries = new BasicReferenceContainer(null);
        tries.setObject(0);
        while (ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(this, "isConnected", AbstractFtpAdapter.class)))
                && ZVal.toBool(ZVal.isLessThan(tries.getObject(), '<', 3))) {
            tries.setObject(ZVal.increment(tries.getObject()));
            env.callMethod(this, "disconnect", AbstractFtpAdapter.class);
            env.callMethod(this, "connect", AbstractFtpAdapter.class);
        }

        return ZVal.assign(this.connection);
    }

    @ConvertedMethod
    public Object getPermPublic(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.permPublic);
    }

    @ConvertedMethod
    public Object getPermPrivate(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.permPrivate);
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        env.callMethod(this, "disconnect", AbstractFtpAdapter.class);
        return null;
    }

    public static final Object CONST_class = "League\\Flysystem\\Adapter\\AbstractFtpAdapter";

    @ConvertedMethod()
    public abstract Object write(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object writeStream(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object update(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object updateStream(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object rename(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object copy(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object delete(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object deleteDir(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object createDir(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object setVisibility(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object read(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object readStream(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getMetadata(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getMimetype(RuntimeEnv env, Object... args);

    @ConvertedMethod()
    public abstract Object getTimestamp(RuntimeEnv env, Object... args);

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractAdapter.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("League\\Flysystem\\Adapter\\AbstractFtpAdapter")
                    .setLookup(
                            AbstractFtpAdapter.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "alternativeRecursion",
                            "configurable",
                            "connection",
                            "host",
                            "passive",
                            "pathPrefix",
                            "pathSeparator",
                            "permPrivate",
                            "permPublic",
                            "port",
                            "root",
                            "safeStorage",
                            "separator",
                            "ssl",
                            "systemType",
                            "timeout")
                    .setFilename("vendor/league/flysystem/src/Adapter/AbstractFtpAdapter.php")
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

    private static class Scope158 implements UpdateRuntimeScopeInterface {

        Object runtimeTempArrayResult103;
        Object path;
        Object item;
        Object size;
        Object visibility;
        Object permissions;
        Object name;
        Object _thisVarAlias;
        Object type;
        Object base;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("runtimeTempArrayResult103", this.runtimeTempArrayResult103);
            stack.setVariable("path", this.path);
            stack.setVariable("item", this.item);
            stack.setVariable("size", this.size);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("permissions", this.permissions);
            stack.setVariable("name", this.name);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("type", this.type);
            stack.setVariable("base", this.base);
        }

        public void updateScope(RuntimeStack stack) {

            this.runtimeTempArrayResult103 = stack.getVariable("runtimeTempArrayResult103");
            this.path = stack.getVariable("path");
            this.item = stack.getVariable("item");
            this.size = stack.getVariable("size");
            this.visibility = stack.getVariable("visibility");
            this.permissions = stack.getVariable("permissions");
            this.name = stack.getVariable("name");
            this._thisVarAlias = stack.getVariable("this");
            this.type = stack.getVariable("type");
            this.base = stack.getVariable("base");
        }
    }

    private static class Scope159 implements UpdateRuntimeScopeInterface {

        Object runtimeTempArrayResult103;
        Object path;
        Object item;
        Object size;
        Object visibility;
        Object permissions;
        Object name;
        Object _thisVarAlias;
        Object type;
        Object base;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("runtimeTempArrayResult103", this.runtimeTempArrayResult103);
            stack.setVariable("path", this.path);
            stack.setVariable("item", this.item);
            stack.setVariable("size", this.size);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("permissions", this.permissions);
            stack.setVariable("name", this.name);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("type", this.type);
            stack.setVariable("base", this.base);
        }

        public void updateScope(RuntimeStack stack) {

            this.runtimeTempArrayResult103 = stack.getVariable("runtimeTempArrayResult103");
            this.path = stack.getVariable("path");
            this.item = stack.getVariable("item");
            this.size = stack.getVariable("size");
            this.visibility = stack.getVariable("visibility");
            this.permissions = stack.getVariable("permissions");
            this.name = stack.getVariable("name");
            this._thisVarAlias = stack.getVariable("this");
            this.type = stack.getVariable("type");
            this.base = stack.getVariable("base");
        }
    }

    private static class Scope160 implements UpdateRuntimeScopeInterface {

        Object date;
        Object item;
        Object visibility;
        Object _thisVarAlias;
        Object format;
        Object type;
        Object runtimeTempArrayResult104;
        Object dt;
        Object path;
        Object size;
        Object name;
        Object time;
        Object base;
        Object timestamp;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("date", this.date);
            stack.setVariable("item", this.item);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("format", this.format);
            stack.setVariable("type", this.type);
            stack.setVariable("runtimeTempArrayResult104", this.runtimeTempArrayResult104);
            stack.setVariable("dt", this.dt);
            stack.setVariable("path", this.path);
            stack.setVariable("size", this.size);
            stack.setVariable("name", this.name);
            stack.setVariable("time", this.time);
            stack.setVariable("base", this.base);
            stack.setVariable("timestamp", this.timestamp);
        }

        public void updateScope(RuntimeStack stack) {

            this.date = stack.getVariable("date");
            this.item = stack.getVariable("item");
            this.visibility = stack.getVariable("visibility");
            this._thisVarAlias = stack.getVariable("this");
            this.format = stack.getVariable("format");
            this.type = stack.getVariable("type");
            this.runtimeTempArrayResult104 = stack.getVariable("runtimeTempArrayResult104");
            this.dt = stack.getVariable("dt");
            this.path = stack.getVariable("path");
            this.size = stack.getVariable("size");
            this.name = stack.getVariable("name");
            this.time = stack.getVariable("time");
            this.base = stack.getVariable("base");
            this.timestamp = stack.getVariable("timestamp");
        }
    }

    private static class Scope161 implements UpdateRuntimeScopeInterface {

        Object date;
        Object item;
        Object visibility;
        Object _thisVarAlias;
        Object format;
        Object type;
        Object runtimeTempArrayResult104;
        Object dt;
        Object path;
        Object size;
        Object name;
        Object time;
        Object base;
        Object timestamp;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("date", this.date);
            stack.setVariable("item", this.item);
            stack.setVariable("visibility", this.visibility);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("format", this.format);
            stack.setVariable("type", this.type);
            stack.setVariable("runtimeTempArrayResult104", this.runtimeTempArrayResult104);
            stack.setVariable("dt", this.dt);
            stack.setVariable("path", this.path);
            stack.setVariable("size", this.size);
            stack.setVariable("name", this.name);
            stack.setVariable("time", this.time);
            stack.setVariable("base", this.base);
            stack.setVariable("timestamp", this.timestamp);
        }

        public void updateScope(RuntimeStack stack) {

            this.date = stack.getVariable("date");
            this.item = stack.getVariable("item");
            this.visibility = stack.getVariable("visibility");
            this._thisVarAlias = stack.getVariable("this");
            this.format = stack.getVariable("format");
            this.type = stack.getVariable("type");
            this.runtimeTempArrayResult104 = stack.getVariable("runtimeTempArrayResult104");
            this.dt = stack.getVariable("dt");
            this.path = stack.getVariable("path");
            this.size = stack.getVariable("size");
            this.name = stack.getVariable("name");
            this.time = stack.getVariable("time");
            this.base = stack.getVariable("base");
            this.timestamp = stack.getVariable("timestamp");
        }
    }
}
