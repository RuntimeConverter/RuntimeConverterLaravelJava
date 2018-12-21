package com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.runtimeconverter.runtime.nativeFunctions.stream.function_stream_resolve_include_path;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Composer.namespaces.Autoload.functions.includeFile;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_unregister;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_spl_autoload_register;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/composer/ClassLoader.php

*/

public class ClassLoader extends RuntimeClassBase {

    public Object prefixLengthsPsr4 = ZVal.newArray();

    public Object prefixDirsPsr4 = ZVal.newArray();

    public Object fallbackDirsPsr4 = ZVal.newArray();

    public Object prefixesPsr0 = ZVal.newArray();

    public Object fallbackDirsPsr0 = ZVal.newArray();

    public Object useIncludePath = false;

    public Object classMap = ZVal.newArray();

    public Object classMapAuthoritative = false;

    public Object missingClasses = ZVal.newArray();

    public Object apcuPrefix = null;

    public ClassLoader(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassLoader(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getPrefixes(RuntimeEnv env, Object... args) {
        if (!ZVal.isEmpty(this.prefixesPsr0)) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call("array_merge", this.prefixesPsr0)
                            .value());
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object getPrefixesPsr4(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prefixDirsPsr4);
    }

    @ConvertedMethod
    public Object getFallbackDirs(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fallbackDirsPsr0);
    }

    @ConvertedMethod
    public Object getFallbackDirsPsr4(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fallbackDirsPsr4);
    }

    @ConvertedMethod
    public Object getClassMap(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.classMap);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classMap", typeHint = "array")
    public Object addClassMap(RuntimeEnv env, Object... args) {
        Object classMap = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.classMap)) {
            this.classMap = function_array_merge.f.env(env).call(this.classMap, classMap).value();

        } else {
            this.classMap = classMap;
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "paths")
    @ConvertedParameter(
        index = 2,
        name = "prepend",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object add(RuntimeEnv env, Object... args) {
        ReferenceContainer prefix = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object paths = assignParameter(args, 1, false);
        Object prepend = assignParameter(args, 2, true);
        if (null == prepend) {
            prepend = false;
        }
        Object first = null;
        if (!ZVal.isTrue(prefix.getObject())) {
            if (ZVal.isTrue(prepend)) {
                this.fallbackDirsPsr0 =
                        function_array_merge
                                .f
                                .env(env)
                                .call(rToArrayCast(paths), this.fallbackDirsPsr0)
                                .value();

            } else {
                this.fallbackDirsPsr0 =
                        function_array_merge
                                .f
                                .env(env)
                                .call(this.fallbackDirsPsr0, rToArrayCast(paths))
                                .value();
            }

            return null;
        }

        first = ZVal.assign(prefix.arrayGet(env, 0));
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "prefixesPsr0", env),
                env,
                first,
                prefix.getObject())) {
            new ReferenceClassProperty(this, "prefixesPsr0", env)
                    .arrayAccess(env, first, prefix.getObject())
                    .set(rToArrayCast(paths));
            return null;
        }

        if (ZVal.isTrue(prepend)) {
            new ReferenceClassProperty(this, "prefixesPsr0", env)
                    .arrayAccess(env, first, prefix.getObject())
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            rToArrayCast(paths),
                                            new ReferenceClassProperty(this, "prefixesPsr0", env)
                                                    .arrayGet(env, first, prefix.getObject()))
                                    .value());

        } else {
            new ReferenceClassProperty(this, "prefixesPsr0", env)
                    .arrayAccess(env, first, prefix.getObject())
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            new ReferenceClassProperty(this, "prefixesPsr0", env)
                                                    .arrayGet(env, first, prefix.getObject()),
                                            rToArrayCast(paths))
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "paths")
    @ConvertedParameter(
        index = 2,
        name = "prepend",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object addPsr4(RuntimeEnv env, Object... args) {
        ReferenceContainer prefix = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object paths = assignParameter(args, 1, false);
        Object prepend = assignParameter(args, 2, true);
        if (null == prepend) {
            prepend = false;
        }
        Object length = null;
        if (!ZVal.isTrue(prefix.getObject())) {
            if (ZVal.isTrue(prepend)) {
                this.fallbackDirsPsr4 =
                        function_array_merge
                                .f
                                .env(env)
                                .call(rToArrayCast(paths), this.fallbackDirsPsr4)
                                .value();

            } else {
                this.fallbackDirsPsr4 =
                        function_array_merge
                                .f
                                .env(env)
                                .call(this.fallbackDirsPsr4, rToArrayCast(paths))
                                .value();
            }

        } else if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "prefixDirsPsr4", env),
                env,
                prefix.getObject())) {
            length = function_strlen.f.env(env).call(prefix.getObject()).value();
            if (ZVal.strictNotEqualityCheck(
                    "\\", "!==", prefix.arrayGet(env, ZVal.subtract(length, 1)))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "A non-empty PSR-4 prefix must end with a namespace separator."));
            }

            new ReferenceClassProperty(this, "prefixLengthsPsr4", env)
                    .arrayAccess(env, prefix.arrayGet(env, 0), prefix.getObject())
                    .set(length);
            new ReferenceClassProperty(this, "prefixDirsPsr4", env)
                    .arrayAccess(env, prefix.getObject())
                    .set(rToArrayCast(paths));

        } else if (ZVal.isTrue(prepend)) {
            new ReferenceClassProperty(this, "prefixDirsPsr4", env)
                    .arrayAccess(env, prefix.getObject())
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            rToArrayCast(paths),
                                            new ReferenceClassProperty(this, "prefixDirsPsr4", env)
                                                    .arrayGet(env, prefix.getObject()))
                                    .value());

        } else {
            new ReferenceClassProperty(this, "prefixDirsPsr4", env)
                    .arrayAccess(env, prefix.getObject())
                    .set(
                            function_array_merge
                                    .f
                                    .env(env)
                                    .call(
                                            new ReferenceClassProperty(this, "prefixDirsPsr4", env)
                                                    .arrayGet(env, prefix.getObject()),
                                            rToArrayCast(paths))
                                    .value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "paths")
    public Object set(RuntimeEnv env, Object... args) {
        ReferenceContainer prefix = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object paths = assignParameter(args, 1, false);
        if (!ZVal.isTrue(prefix.getObject())) {
            this.fallbackDirsPsr0 = rToArrayCast(paths);

        } else {
            new ReferenceClassProperty(this, "prefixesPsr0", env)
                    .arrayAccess(env, prefix.arrayGet(env, 0), prefix.getObject())
                    .set(rToArrayCast(paths));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "paths")
    public Object setPsr4(RuntimeEnv env, Object... args) {
        ReferenceContainer prefix = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object paths = assignParameter(args, 1, false);
        Object length = null;
        if (!ZVal.isTrue(prefix.getObject())) {
            this.fallbackDirsPsr4 = rToArrayCast(paths);

        } else {
            length = function_strlen.f.env(env).call(prefix.getObject()).value();
            if (ZVal.strictNotEqualityCheck(
                    "\\", "!==", prefix.arrayGet(env, ZVal.subtract(length, 1)))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "A non-empty PSR-4 prefix must end with a namespace separator."));
            }

            new ReferenceClassProperty(this, "prefixLengthsPsr4", env)
                    .arrayAccess(env, prefix.arrayGet(env, 0), prefix.getObject())
                    .set(length);
            new ReferenceClassProperty(this, "prefixDirsPsr4", env)
                    .arrayAccess(env, prefix.getObject())
                    .set(rToArrayCast(paths));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "useIncludePath")
    public Object setUseIncludePath(RuntimeEnv env, Object... args) {
        Object useIncludePath = assignParameter(args, 0, false);
        this.useIncludePath = useIncludePath;
        return null;
    }

    @ConvertedMethod
    public Object getUseIncludePath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.useIncludePath);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "classMapAuthoritative")
    public Object setClassMapAuthoritative(RuntimeEnv env, Object... args) {
        Object classMapAuthoritative = assignParameter(args, 0, false);
        this.classMapAuthoritative = classMapAuthoritative;
        return null;
    }

    @ConvertedMethod
    public Object isClassMapAuthoritative(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.classMapAuthoritative);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "apcuPrefix")
    public Object setApcuPrefix(RuntimeEnv env, Object... args) {
        Object apcuPrefix = assignParameter(args, 0, false);
        this.apcuPrefix =
                ZVal.toBool(function_function_exists.f.env(env).call("apcu_fetch").value())
                                && ZVal.toBool(
                                        function_ini_get.f.env(env).call("apc.enabled").value())
                        ? apcuPrefix
                        : ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    public Object getApcuPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.apcuPrefix);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "prepend",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object register(RuntimeEnv env, Object... args) {
        Object prepend = assignParameter(args, 0, true);
        if (null == prepend) {
            prepend = false;
        }
        function_spl_autoload_register
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "loadClass")), true, prepend);
        return null;
    }

    @ConvertedMethod
    public Object unregister(RuntimeEnv env, Object... args) {
        function_spl_autoload_unregister
                .f
                .env(env)
                .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "loadClass")));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object loadClass(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object file = null;
        if (ZVal.isTrue(file = this.findFile(env, _pClass))) {
            includeFile.f.env(env).call(file);
            return ZVal.assign(true);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object findFile(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        ReferenceContainer hit = new BasicReferenceContainer(null);
        Object file = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "classMap", env),
                env,
                _pClass)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "classMap", env).arrayGet(env, _pClass));
        }

        if (ZVal.toBool(this.classMapAuthoritative)
                || ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "missingClasses", env),
                                env,
                                _pClass))) {
            return ZVal.assign(false);
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.apcuPrefix)) {
            file =
                    NamespaceGlobal.apcu_fetch
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithReferences().add(1, hit))
                            .call(
                                    toStringR(this.apcuPrefix, env) + toStringR(_pClass, env),
                                    hit.getObject())
                            .value();
            if (ZVal.isTrue(hit.getObject())) {
                return ZVal.assign(file);
            }
        }

        file = this.findFileWithExtension(env, _pClass, ".php");
        if (ZVal.toBool(ZVal.strictEqualityCheck(false, "===", file))
                && ZVal.toBool(function_defined.f.env(env).call("HHVM_VERSION").value())) {
            file = this.findFileWithExtension(env, _pClass, ".hh");
        }

        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.apcuPrefix)) {
            NamespaceGlobal.apcu_add
                    .env(env)
                    .call(toStringR(this.apcuPrefix, env) + toStringR(_pClass, env), file);
        }

        if (ZVal.strictEqualityCheck(false, "===", file)) {
            new ReferenceClassProperty(this, "missingClasses", env)
                    .arrayAccess(env, _pClass)
                    .set(true);
        }

        return ZVal.assign(file);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "ext")
    private Object findFileWithExtension(RuntimeEnv env, Object... args) {
        ReferenceContainer _pClass = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ext = assignParameter(args, 1, false);
        Object pathEnd = null;
        Object prefix = null;
        Object dirs = null;
        Object logicalPathPsr4 = null;
        Object dir = null;
        Object lastPos = null;
        Object logicalPathPsr0 = null;
        Object search = null;
        Object file = null;
        Object pos = null;
        Object subPath = null;
        Object first = null;
        logicalPathPsr4 =
                toStringR(
                                NamespaceGlobal.strtr
                                        .env(env)
                                        .call(_pClass.getObject(), "\\", "/")
                                        .value(),
                                env)
                        + toStringR(ext, env);
        first = ZVal.assign(_pClass.arrayGet(env, 0));
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "prefixLengthsPsr4", env),
                env,
                first)) {
            subPath = ZVal.assign(_pClass.getObject());
            while (ZVal.strictNotEqualityCheck(
                    false,
                    "!==",
                    lastPos = NamespaceGlobal.strrpos.env(env).call(subPath, "\\").value())) {
                subPath = function_substr.f.env(env).call(subPath, 0, lastPos).value();
                search = toStringR(subPath, env) + "\\";
                if (arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "prefixDirsPsr4", env),
                        env,
                        search)) {
                    pathEnd =
                            toStringR("/", env)
                                    + toStringR(
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(logicalPathPsr4, ZVal.add(lastPos, 1))
                                                    .value(),
                                            env);
                    for (ZPair zpairResult2 :
                            ZVal.getIterable(
                                    new ReferenceClassProperty(this, "prefixDirsPsr4", env)
                                            .arrayGet(env, search),
                                    env,
                                    true)) {
                        dir = ZVal.assign(zpairResult2.getValue());
                        if (function_file_exists
                                .f
                                .env(env)
                                .call(file = toStringR(dir, env) + toStringR(pathEnd, env))
                                .getBool()) {
                            return ZVal.assign(file);
                        }
                    }
                }
            }
        }

        for (ZPair zpairResult3 : ZVal.getIterable(this.fallbackDirsPsr4, env, true)) {
            dir = ZVal.assign(zpairResult3.getValue());
            if (function_file_exists
                    .f
                    .env(env)
                    .call(
                            file =
                                    toStringR(dir, env)
                                            + toStringR("/", env)
                                            + toStringR(logicalPathPsr4, env))
                    .getBool()) {
                return ZVal.assign(file);
            }
        }

        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                pos = NamespaceGlobal.strrpos.env(env).call(_pClass.getObject(), "\\").value())) {
            logicalPathPsr0 =
                    toStringR(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(logicalPathPsr4, 0, ZVal.add(pos, 1))
                                            .value(),
                                    env)
                            + toStringR(
                                    NamespaceGlobal.strtr
                                            .env(env)
                                            .call(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(logicalPathPsr4, ZVal.add(pos, 1))
                                                            .value(),
                                                    "_",
                                                    "/")
                                            .value(),
                                    env);

        } else {
            logicalPathPsr0 =
                    toStringR(
                                    NamespaceGlobal.strtr
                                            .env(env)
                                            .call(_pClass.getObject(), "_", "/")
                                            .value(),
                                    env)
                            + toStringR(ext, env);
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "prefixesPsr0", env),
                env,
                first)) {
            for (ZPair zpairResult4 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this, "prefixesPsr0", env)
                                    .arrayGet(env, first),
                            env,
                            false)) {
                prefix = ZVal.assign(zpairResult4.getKey());
                dirs = ZVal.assign(zpairResult4.getValue());
                if (ZVal.strictEqualityCheck(
                        0,
                        "===",
                        function_strpos.f.env(env).call(_pClass.getObject(), prefix).value())) {
                    for (ZPair zpairResult5 : ZVal.getIterable(dirs, env, true)) {
                        dir = ZVal.assign(zpairResult5.getValue());
                        if (function_file_exists
                                .f
                                .env(env)
                                .call(
                                        file =
                                                toStringR(dir, env)
                                                        + toStringR("/", env)
                                                        + toStringR(logicalPathPsr0, env))
                                .getBool()) {
                            return ZVal.assign(file);
                        }
                    }
                }
            }
        }

        for (ZPair zpairResult6 : ZVal.getIterable(this.fallbackDirsPsr0, env, true)) {
            dir = ZVal.assign(zpairResult6.getValue());
            if (function_file_exists
                    .f
                    .env(env)
                    .call(
                            file =
                                    toStringR(dir, env)
                                            + toStringR("/", env)
                                            + toStringR(logicalPathPsr0, env))
                    .getBool()) {
                return ZVal.assign(file);
            }
        }

        if (ZVal.toBool(this.useIncludePath)
                && ZVal.toBool(
                        file =
                                function_stream_resolve_include_path
                                        .f
                                        .env(env)
                                        .call(logicalPathPsr0)
                                        .value())) {
            return ZVal.assign(file);
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Composer\\Autoload\\ClassLoader";

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
                    .setName("Composer\\Autoload\\ClassLoader")
                    .setLookup(
                            ClassLoader.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "apcuPrefix",
                            "classMap",
                            "classMapAuthoritative",
                            "fallbackDirsPsr0",
                            "fallbackDirsPsr4",
                            "missingClasses",
                            "prefixDirsPsr4",
                            "prefixLengthsPsr4",
                            "prefixesPsr0",
                            "useIncludePath")
                    .setFilename("vendor/composer/ClassLoader.php")
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
