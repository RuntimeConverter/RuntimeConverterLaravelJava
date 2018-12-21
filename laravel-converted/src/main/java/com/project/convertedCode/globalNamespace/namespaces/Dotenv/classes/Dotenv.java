package com.project.convertedCode.globalNamespace.namespaces.Dotenv.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.classes.Loader;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.namespaces.Exception.classes.InvalidPathException;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.classes.Validator;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/vlucas/phpdotenv/src/Dotenv.php

*/

public class Dotenv extends RuntimeClassBase {

    public Object filePath = null;

    public Object loader = null;

    public Dotenv(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Dotenv.class) {
            this.__construct(env, args);
        }
    }

    public Dotenv(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "file")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, true);
        if (null == file) {
            file = ".env";
        }
        this.filePath = this.getFilePath(env, path, file);
        this.loader = new Loader(env, this.filePath, true);
        return null;
    }

    @ConvertedMethod
    public Object load(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.loadData(env));
    }

    @ConvertedMethod
    public Object safeLoad(RuntimeEnv env, Object... args) {
        Object e = null;
        try {
            return ZVal.assign(this.loadData(env));
        } catch (ConvertedException convertedException330) {
            if (convertedException330.instanceOf(
                    InvalidPathException.class, "Dotenv\\Exception\\InvalidPathException")) {
                e = convertedException330.getObject();
                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException330;
            }
        }
    }

    @ConvertedMethod
    public Object overload(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.loadData(env, true));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "file")
    protected Object getFilePath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
        Object filePath = null;
        if (!function_is_string.f.env(env).call(file).getBool()) {
            file = ".env";
        }

        filePath =
                toStringR(function_rtrim.f.env(env).call(path, "/").value(), env)
                        + toStringR("/", env)
                        + toStringR(file, env);
        return ZVal.assign(filePath);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "overload",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object loadData(RuntimeEnv env, Object... args) {
        Object overload = assignParameter(args, 0, true);
        if (null == overload) {
            overload = false;
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.loader, "setImmutable", Dotenv.class, !ZVal.isTrue(overload)),
                        "load",
                        Dotenv.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variable")
    public Object required(RuntimeEnv env, Object... args) {
        Object variable = assignParameter(args, 0, false);
        return ZVal.assign(new Validator(env, rToArrayCast(variable), this.loader));
    }

    @ConvertedMethod
    public Object getEnvironmentVariableNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this.loader).accessProp(this, env).name("variableNames").value());
    }

    public static final Object CONST_class = "Dotenv\\Dotenv";

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
                    .setName("Dotenv\\Dotenv")
                    .setLookup(
                            Dotenv.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("filePath", "loader")
                    .setFilename("vendor/vlucas/phpdotenv/src/Dotenv.php")
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
