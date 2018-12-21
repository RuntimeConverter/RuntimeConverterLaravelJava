package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fclose;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.namespaces.Plugin.classes.PluginNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes.FilesystemNotFoundException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/MountManager.php

*/

public class MountManager extends RuntimeClassBase {

    public Object filesystems = ZVal.newArray();

    public Object plugins = ZVal.newArray();

    public MountManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MountManager.class) {
            this.__construct(env, args);
        }
    }

    public MountManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "filesystems",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filesystems = assignParameter(args, 0, true);
        if (null == filesystems) {
            filesystems = ZVal.newArray();
        }
        this.mountFilesystems(env, filesystems);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "filesystems", typeHint = "array")
    public Object mountFilesystems(RuntimeEnv env, Object... args) {
        Object filesystems = assignParameter(args, 0, false);
        Object prefix = null;
        Object filesystem = null;
        for (ZPair zpairResult663 : ZVal.getIterable(filesystems, env, false)) {
            prefix = ZVal.assign(zpairResult663.getKey());
            filesystem = ZVal.assign(zpairResult663.getValue());
            this.mountFilesystem(env, prefix, filesystem);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(
        index = 1,
        name = "filesystem",
        typeHint = "League\\Flysystem\\FilesystemInterface"
    )
    public Object mountFilesystem(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        Object filesystem = assignParameter(args, 1, false);
        if (!function_is_string.f.env(env).call(prefix).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            toStringR("MountManager::mountFilesystem", env)
                                    + " expects argument #1 to be a string."));
        }

        new ReferenceClassProperty(this, "filesystems", env)
                .arrayAccess(env, prefix)
                .set(filesystem);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object getFilesystem(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "filesystems", env),
                env,
                prefix)) {
            throw ZVal.getException(
                    env,
                    new FilesystemNotFoundException(
                            env, "No filesystem mounted with prefix " + toStringR(prefix, env)));
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "filesystems", env).arrayGet(env, prefix));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    public Object filterPrefix(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, false);
        Object path = null;
        Object prefix = null;
        Object runtimeTempArrayResult105 = null;
        if (ZVal.isEmpty(arguments)) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "At least one argument needed"));
        }

        path = function_array_shift.f.env(env).call(arguments).value();
        if (!function_is_string.f.env(env).call(path).getBool()) {
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "First argument should be a string"));
        }

        ZVal.list(
                runtimeTempArrayResult105 = this.getPrefixAndPath(env, path),
                (prefix = listGet(runtimeTempArrayResult105, 0, env)),
                (path = listGet(runtimeTempArrayResult105, 1, env)));
        function_array_unshift.f.env(env).call(arguments, path);
        return ZVal.assign(ZVal.newArray(new ZPair(0, prefix), new ZPair(1, arguments)));
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
        Object result = null;
        ReferenceContainer file = new BasicReferenceContainer(null);
        Object prefix = null;
        Object runtimeTempArrayResult106 = null;
        Object filesystem = null;
        ZVal.list(
                runtimeTempArrayResult106 = this.getPrefixAndPath(env, directory),
                (prefix = listGet(runtimeTempArrayResult106, 0, env)),
                (directory = listGet(runtimeTempArrayResult106, 1, env)));
        filesystem = this.getFilesystem(env, prefix);
        result =
                env.callMethod(
                        filesystem, "listContents", MountManager.class, directory, recursive);
        for (ZPair zpairResult664 : ZVal.getIterable(result, env, true)) {
            file = zpairResult664;
            file.arrayAccess(env, "filesystem").set(prefix);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "arguments")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object runtimeTempArrayResult107 = null;
        Object prefix = null;
        ZVal.list(
                runtimeTempArrayResult107 = this.filterPrefix(env, arguments),
                (prefix = listGet(runtimeTempArrayResult107, 0, env)),
                (arguments = listGet(runtimeTempArrayResult107, 1, env)));
        return ZVal.assign(this.invokePluginOnFilesystem(env, method, arguments, prefix));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object copy(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        Object config = assignParameter(args, 2, true);
        if (null == config) {
            config = ZVal.newArray();
        }
        Object result = null;
        Object runtimeTempArrayResult108 = null;
        Object prefixFrom = null;
        Object buffer = null;
        Object runtimeTempArrayResult109 = null;
        Object prefixTo = null;
        ZVal.list(
                runtimeTempArrayResult108 = this.getPrefixAndPath(env, from),
                (prefixFrom = listGet(runtimeTempArrayResult108, 0, env)),
                (from = listGet(runtimeTempArrayResult108, 1, env)));
        buffer =
                env.callMethod(
                        this.getFilesystem(env, prefixFrom),
                        "readStream",
                        MountManager.class,
                        from);
        if (ZVal.strictEqualityCheck(buffer, "===", false)) {
            return ZVal.assign(false);
        }

        ZVal.list(
                runtimeTempArrayResult109 = this.getPrefixAndPath(env, to),
                (prefixTo = listGet(runtimeTempArrayResult109, 0, env)),
                (to = listGet(runtimeTempArrayResult109, 1, env)));
        result =
                env.callMethod(
                        this.getFilesystem(env, prefixTo),
                        "writeStream",
                        MountManager.class,
                        to,
                        buffer,
                        config);
        if (function_is_resource.f.env(env).call(buffer).getBool()) {
            function_fclose.f.env(env).call(buffer);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "keys",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 1, name = "directory")
    @ConvertedParameter(
        index = 2,
        name = "recursive",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object listWith(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, true);
        if (null == keys) {
            keys = ZVal.newArray();
        }
        Object directory = assignParameter(args, 1, true);
        if (null == directory) {
            directory = "";
        }
        Object recursive = assignParameter(args, 2, true);
        if (null == recursive) {
            recursive = false;
        }
        Object prefix = null;
        Object arguments = null;
        Object runtimeTempArrayResult110 = null;
        ZVal.list(
                runtimeTempArrayResult110 = this.getPrefixAndPath(env, directory),
                (prefix = listGet(runtimeTempArrayResult110, 0, env)),
                (directory = listGet(runtimeTempArrayResult110, 1, env)));
        arguments =
                ZVal.newArray(new ZPair(0, keys), new ZPair(1, directory), new ZPair(2, recursive));
        return ZVal.assign(this.invokePluginOnFilesystem(env, "listWith", arguments, prefix));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "from")
    @ConvertedParameter(index = 1, name = "to")
    @ConvertedParameter(
        index = 2,
        name = "config",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object move(RuntimeEnv env, Object... args) {
        Object from = assignParameter(args, 0, false);
        Object to = assignParameter(args, 1, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == config.getObject()) {
            config.setObject(ZVal.newArray());
        }
        Object pathFrom = null;
        Object copied = null;
        Object prefixFrom = null;
        Object pathTo = null;
        Object filesystem = null;
        Object runtimeTempArrayResult112 = null;
        Object runtimeTempArrayResult111 = null;
        Object renamed = null;
        Object prefixTo = null;
        ZVal.list(
                runtimeTempArrayResult111 = this.getPrefixAndPath(env, from),
                (prefixFrom = listGet(runtimeTempArrayResult111, 0, env)),
                (pathFrom = listGet(runtimeTempArrayResult111, 1, env)));
        ZVal.list(
                runtimeTempArrayResult112 = this.getPrefixAndPath(env, to),
                (prefixTo = listGet(runtimeTempArrayResult112, 0, env)),
                (pathTo = listGet(runtimeTempArrayResult112, 1, env)));
        if (ZVal.strictEqualityCheck(prefixFrom, "===", prefixTo)) {
            filesystem = this.getFilesystem(env, prefixFrom);
            renamed = env.callMethod(filesystem, "rename", MountManager.class, pathFrom, pathTo);
            if (ZVal.toBool(renamed)
                    && ZVal.toBool(arrayActionR(ArrayAction.ISSET, config, env, "visibility"))) {
                return ZVal.assign(
                        env.callMethod(
                                filesystem,
                                "setVisibility",
                                MountManager.class,
                                pathTo,
                                config.arrayGet(env, "visibility")));
            }

            return ZVal.assign(renamed);
        }

        copied = this.copy(env, from, to, config.getObject());
        if (ZVal.isTrue(copied)) {
            return ZVal.assign(env.callMethod(this, "delete", MountManager.class, from));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "arguments")
    @ConvertedParameter(index = 2, name = "prefix")
    public Object invokePluginOnFilesystem(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object prefix = assignParameter(args, 2, false);
        Object e = null;
        Object callback = null;
        Object filesystem = null;
        filesystem = this.getFilesystem(env, prefix);
        try {
            return ZVal.assign(this.invokePlugin(env, method, arguments, filesystem));
        } catch (ConvertedException convertedException76) {
            if (convertedException76.instanceOf(
                    PluginNotFoundException.class,
                    "League\\Flysystem\\Plugin\\PluginNotFoundException")) {
                e = convertedException76.getObject();
            } else {
                throw convertedException76;
            }
        }

        callback = ZVal.newArray(new ZPair(0, filesystem), new ZPair(1, method));
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callback, arguments)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object getPrefixAndPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        if (ZVal.isLessThan(function_strpos.f.env(env).call(path, "://").value(), '<', 1)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "No prefix detected in path: " + toStringR(path, env)));
        }

        return ZVal.assign(function_explode.f.env(env).call("://", path, 2).value());
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
                .arrayAccess(env, env.callMethod(plugin, "getMethod", MountManager.class))
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
        env.callMethod(plugin, "setFilesystem", MountManager.class, filesystem);
        callback = ZVal.newArray(new ZPair(0, plugin), new ZPair(1, "handle"));
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callback, arguments)
                        .value());
    }

    public static final Object CONST_class = "League\\Flysystem\\MountManager";

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
                    .setName("League\\Flysystem\\MountManager")
                    .setLookup(
                            MountManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystems", "plugins")
                    .setFilename("vendor/league/flysystem/src/MountManager.php")
                    .addTrait("League\\Flysystem\\Plugin\\PluggableTrait")
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
