package com.project.convertedCode.globalNamespace.namespaces.League.namespaces.Flysystem.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/league/flysystem/src/Handler.php

*/

public abstract class Handler extends RuntimeClassBase {

    public Object path = null;

    public Object filesystem = null;

    public Handler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Handler.class) {
            this.__construct(env, args);
        }
    }

    public Handler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "filesystem",
        typeHint = "League\\Flysystem\\FilesystemInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "path",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object filesystem = assignParameter(args, 0, true);
        if (null == filesystem) {
            filesystem = ZVal.getNull();
        }
        Object path = assignParameter(args, 1, true);
        if (null == path) {
            path = ZVal.getNull();
        }
        this.path = path;
        this.filesystem = filesystem;
        return null;
    }

    @ConvertedMethod
    public Object isDir(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(this.getType(env), "===", "dir"));
    }

    @ConvertedMethod
    public Object isFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(this.getType(env), "===", "file"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        ReferenceContainer metadata = new BasicReferenceContainer(null);
        metadata.setObject(
                env.callMethod(this.filesystem, "getMetadata", Handler.class, this.path));
        return ZVal.assign(metadata.arrayGet(env, "type"));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "filesystem",
        typeHint = "League\\Flysystem\\FilesystemInterface"
    )
    public Object setFilesystem(RuntimeEnv env, Object... args) {
        Object filesystem = assignParameter(args, 0, false);
        this.filesystem = filesystem;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFilesystem(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.filesystem);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object setPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.path = path;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "arguments", typeHint = "array")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object e = null;
        Object callback = null;
        function_array_unshift.f.env(env).call(arguments, this.path);
        callback = ZVal.newArray(new ZPair(0, this.filesystem), new ZPair(1, method));
        try {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(callback, arguments)
                            .value());
        } catch (ConvertedException convertedException75) {
            if (convertedException75.instanceOf(
                    BadMethodCallException.class, "BadMethodCallException")) {
                e = convertedException75.getObject();
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                "Call to undefined method "
                                        + toStringR(
                                                NamespaceGlobal.get_called_class
                                                        .env(env)
                                                        .call()
                                                        .value(),
                                                env)
                                        + "::"
                                        + toStringR(method, env)));
            } else {
                throw convertedException75;
            }
        }
    }

    public static final Object CONST_class = "League\\Flysystem\\Handler";

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
                    .setName("League\\Flysystem\\Handler")
                    .setLookup(
                            Handler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filesystem", "path")
                    .setFilename("vendor/league/flysystem/src/Handler.php")
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
