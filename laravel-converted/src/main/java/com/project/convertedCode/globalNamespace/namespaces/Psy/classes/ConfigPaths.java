package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_error_handler;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.project.convertedCode.globalNamespace.namespaces.XdgBaseDir.classes.Xdg;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_error_handler;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/ConfigPaths.php

*/

public class ConfigPaths extends RuntimeClassBase {

    public ConfigPaths(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ConfigPaths(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Psy\\ConfigPaths";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getConfigDirs(RuntimeEnv env, Object... args) {
            Object xdg = null;
            xdg = new Xdg(env);
            return ZVal.assign(
                    runtimeStaticObject.getDirNames(
                            env, env.callMethod(xdg, "getConfigDirs", ConfigPaths.class)));
        }

        @ConvertedMethod
        public Object getHomeConfigDirs(RuntimeEnv env, Object... args) {
            Object xdg = null;
            xdg = new Xdg(env);
            return ZVal.assign(
                    runtimeStaticObject.getDirNames(
                            env,
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            env.callMethod(
                                                    xdg, "getHomeConfigDir", ConfigPaths.class)))));
        }

        @ConvertedMethod
        public Object getCurrentConfigDir(RuntimeEnv env, Object... args) {
            ReferenceContainer configDirs = new BasicReferenceContainer(null);
            Object configDir = null;
            configDirs.setObject(runtimeStaticObject.getHomeConfigDirs(env));
            for (ZPair zpairResult1386 : ZVal.getIterable(configDirs.getObject(), env, true)) {
                configDir = ZVal.assign(zpairResult1386.getValue());
                if (ZVal.isTrue(function_is_dir.f.env(env).call(configDir).value())) {
                    return ZVal.assign(configDir);
                }
            }

            return ZVal.assign(configDirs.arrayGet(env, 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "names", typeHint = "array")
        @ConvertedParameter(
            index = 1,
            name = "configDir",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object getConfigFiles(RuntimeEnv env, Object... args) {
            Object names = assignParameter(args, 0, false);
            Object configDir = assignParameter(args, 1, true);
            if (null == configDir) {
                configDir = ZVal.getNull();
            }
            Object dirs = null;
            dirs =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(configDir, "===", ZVal.getNull())
                                    ? runtimeStaticObject.getConfigDirs(env)
                                    : ZVal.newArray(new ZPair(0, configDir)));
            return ZVal.assign(runtimeStaticObject.getRealFiles(env, dirs, names));
        }

        @ConvertedMethod
        public Object getDataDirs(RuntimeEnv env, Object... args) {
            Object xdg = null;
            xdg = new Xdg(env);
            return ZVal.assign(
                    runtimeStaticObject.getDirNames(
                            env, env.callMethod(xdg, "getDataDirs", ConfigPaths.class)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "names", typeHint = "array")
        @ConvertedParameter(
            index = 1,
            name = "dataDir",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object getDataFiles(RuntimeEnv env, Object... args) {
            Object names = assignParameter(args, 0, false);
            Object dataDir = assignParameter(args, 1, true);
            if (null == dataDir) {
                dataDir = ZVal.getNull();
            }
            Object dirs = null;
            dirs =
                    ZVal.assign(
                            ZVal.strictEqualityCheck(dataDir, "===", ZVal.getNull())
                                    ? runtimeStaticObject.getDataDirs(env)
                                    : ZVal.newArray(new ZPair(0, dataDir)));
            return ZVal.assign(runtimeStaticObject.getRealFiles(env, dirs, names));
        }

        @ConvertedMethod
        public Object getRuntimeDir(RuntimeEnv env, Object... args) {
            Object e = null;
            Object xdg = null;
            Object runtimeDir = null;
            xdg = new Xdg(env);
            function_set_error_handler
                    .f
                    .env(env)
                    .call(ZVal.arrayFromList("Psy\\Exception\\ErrorException", "throwException"));
            try {
                runtimeDir = env.callMethod(xdg, "getRuntimeDir", ConfigPaths.class, false);
            } catch (ConvertedException convertedException185) {
                if (convertedException185.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException185.getObject();
                    runtimeDir = NamespaceGlobal.sys_get_temp_dir.env(env).call().value();
                } else {
                    throw convertedException185;
                }
            }

            function_restore_error_handler.f.env(env).call();
            return ZVal.assign(
                    toStringR(
                                    NamespaceGlobal.strtr
                                            .env(env)
                                            .call(runtimeDir, "\\", "/")
                                            .value(),
                                    env)
                            + "/psysh");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "baseDirs", typeHint = "array")
        private Object getDirNames(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/psy/psysh/src")
                            .setFile("/vendor/psy/psysh/src/ConfigPaths.php");
            Object baseDirs = assignParameter(args, 0, false);
            ReferenceContainer dirs = new BasicReferenceContainer(null);
            Object dir = null;
            Object appData = null;
            Object home = null;
            dirs.setObject(
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Psy",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "dir")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object dir = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    toStringR(
                                                                    NamespaceGlobal.strtr
                                                                            .env(env)
                                                                            .call(dir, "\\", "/")
                                                                            .value(),
                                                                    env)
                                                            + "/psysh");
                                        }
                                    },
                                    baseDirs)
                            .value());
            if (ZVal.isTrue(home = NamespaceGlobal.getenv.env(env).call("HOME").value())) {
                dirs.arrayAppend(env)
                        .set(
                                toStringR(
                                                NamespaceGlobal.strtr
                                                        .env(env)
                                                        .call(home, "\\", "/")
                                                        .value(),
                                                env)
                                        + "/.psysh");
            }

            if (function_defined.f.env(env).call("PHP_WINDOWS_VERSION_MAJOR").getBool()) {
                if (ZVal.isTrue(
                        appData = NamespaceGlobal.getenv.env(env).call("APPDATA").value())) {
                    function_array_unshift
                            .f
                            .env(env)
                            .call(
                                    dirs.getObject(),
                                    toStringR(
                                                    NamespaceGlobal.strtr
                                                            .env(env)
                                                            .call(appData, "\\", "/")
                                                            .value(),
                                                    env)
                                            + "/PsySH");
                }

                dir =
                        toStringR(
                                        NamespaceGlobal.strtr
                                                .env(env)
                                                .call(
                                                        toStringR(
                                                                        NamespaceGlobal.getenv
                                                                                .env(env)
                                                                                .call("HOMEDRIVE")
                                                                                .value(),
                                                                        env)
                                                                + "/"
                                                                + toStringR(
                                                                        NamespaceGlobal.getenv
                                                                                .env(env)
                                                                                .call("HOMEPATH")
                                                                                .value(),
                                                                        env),
                                                        "\\",
                                                        "/")
                                                .value(),
                                        env)
                                + "/.psysh";
                if (!function_in_array.f.env(env).call(dir, dirs.getObject()).getBool()) {
                    dirs.arrayAppend(env).set(dir);
                }
            }

            return ZVal.assign(dirs.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "dirNames", typeHint = "array")
        @ConvertedParameter(index = 1, name = "fileNames", typeHint = "array")
        private Object getRealFiles(RuntimeEnv env, Object... args) {
            Object dirNames = assignParameter(args, 0, false);
            Object fileNames = assignParameter(args, 1, false);
            Object file = null;
            Object name = null;
            ReferenceContainer files = new BasicReferenceContainer(null);
            Object dir = null;
            files.setObject(ZVal.newArray());
            for (ZPair zpairResult1387 : ZVal.getIterable(dirNames, env, true)) {
                dir = ZVal.assign(zpairResult1387.getValue());
                for (ZPair zpairResult1388 : ZVal.getIterable(fileNames, env, true)) {
                    name = ZVal.assign(zpairResult1388.getValue());
                    file = toStringR(dir, env) + "/" + toStringR(name, env);
                    if (ZVal.isTrue(function_is_file.f.env(env).call(file).value())) {
                        files.arrayAppend(env).set(file);
                    }
                }
            }

            return ZVal.assign(files.getObject());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "file")
        public Object touchFileWithMkdir(RuntimeEnv env, Object... args) {
            Object file = assignParameter(args, 0, false);
            Object dir = null;
            if (function_file_exists.f.env(env).call(file).getBool()) {
                if (NamespaceGlobal.is_writable.env(env).call(file).getBool()) {
                    return ZVal.assign(file);
                }

                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Writing to %s is not allowed.", file)
                                        .value(),
                                1024);
                return ZVal.assign(false);
            }

            dir = function_dirname.f.env(env).call(file).value();
            if (!function_is_dir.f.env(env).call(dir).getBool()) {
                NamespaceGlobal.mkdir.env(env).call(dir, 448, true).value();
            }

            if (ZVal.toBool(!function_is_dir.f.env(env).call(dir).getBool())
                    || ZVal.toBool(!NamespaceGlobal.is_writable.env(env).call(dir).getBool())) {
                NamespaceGlobal.trigger_error
                        .env(env)
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Writing to %s is not allowed.", dir)
                                        .value(),
                                1024);
                return ZVal.assign(false);
            }

            NamespaceGlobal.touch.env(env).call(file);
            return ZVal.assign(file);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\ConfigPaths")
                    .setLookup(
                            ConfigPaths.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/psy/psysh/src/ConfigPaths.php")
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
