package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.Connector;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes.ConnectorInterface;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Connectors/SQLiteConnector.php

*/

public class SQLiteConnector extends Connector implements ConnectorInterface {

    public SQLiteConnector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SQLiteConnector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object connect(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object path = null;
        Object options = null;
        options = env.callMethod(this, "getOptions", SQLiteConnector.class, config.getObject());
        if (ZVal.equalityCheck(config.arrayGet(env, "database"), ":memory:")) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "createConnection",
                            SQLiteConnector.class,
                            "sqlite::memory:",
                            config.getObject(),
                            options));
        }

        path = function_realpath.f.env(env).call(config.arrayGet(env, "database")).value();
        if (ZVal.strictEqualityCheck(path, "===", false)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Database ("
                                    + toStringR(config.arrayGet(env, "database"), env)
                                    + ") does not exist."));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "createConnection",
                        SQLiteConnector.class,
                        "sqlite:" + toStringR(path, env),
                        config.getObject(),
                        options));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Connectors\\SQLiteConnector";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Connector.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Connectors\\SQLiteConnector")
                    .setLookup(
                            SQLiteConnector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("options")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Connectors/SQLiteConnector.php")
                    .addInterface("Illuminate\\Database\\Connectors\\ConnectorInterface")
                    .addExtendsClass("Illuminate\\Database\\Connectors\\Connector")
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
