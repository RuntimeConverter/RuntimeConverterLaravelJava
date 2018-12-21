package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Connectors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeClasses.pdo.PDO;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Connectors/Connector.php

*/

public class Connector extends RuntimeClassBase {

    public Object options =
            ZVal.newArray(
                    new ZPair(8, 0),
                    new ZPair(3, 2),
                    new ZPair(11, 0),
                    new ZPair(17, false),
                    new ZPair(20, false));

    public Connector(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Connector(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dsn")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    @ConvertedParameter(index = 2, name = "options", typeHint = "array")
    public Object createConnection(RuntimeEnv env, Object... args) {
        Object dsn = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object options = assignParameter(args, 2, false);
        Object password = null;
        Object runtimeTempArrayResult18 = null;
        Object e = null;
        Object ternaryExpressionTemp = null;
        Object username = null;
        ZVal.list(
                runtimeTempArrayResult18 =
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                config.arrayGet(env, "username"))
                                                ? ternaryExpressionTemp
                                                : ZVal.getNull()),
                                new ZPair(
                                        1,
                                        ZVal.isDefined(
                                                        ternaryExpressionTemp =
                                                                config.arrayGet(env, "password"))
                                                ? ternaryExpressionTemp
                                                : ZVal.getNull())),
                (username = listGet(runtimeTempArrayResult18, 0, env)),
                (password = listGet(runtimeTempArrayResult18, 1, env)));
        try {
            return ZVal.assign(this.createPdoConnection(env, dsn, username, password, options));
        } catch (ConvertedException convertedException24) {
            if (convertedException24.instanceOf(PHPException.class, "Exception")) {
                e = convertedException24.getObject();
                return ZVal.assign(
                        this.tryAgainIfCausedByLostConnection(
                                env, e, dsn, username, password, options));
            } else {
                throw convertedException24;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dsn")
    @ConvertedParameter(index = 1, name = "username")
    @ConvertedParameter(index = 2, name = "password")
    @ConvertedParameter(index = 3, name = "options")
    protected Object createPdoConnection(RuntimeEnv env, Object... args) {
        Object dsn = assignParameter(args, 0, false);
        Object username = assignParameter(args, 1, false);
        Object password = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        if (ZVal.toBool(
                        function_class_exists
                                .f
                                .env(env)
                                .call("Doctrine\\DBAL\\Driver\\PDOConnection")
                                .value())
                && ZVal.toBool(!ZVal.isTrue(this.isPersistentConnection(env, options)))) {
            return ZVal.assign(
                    env.createNew(
                            ZVal.resolveClassAlias(env, "PDOConnection"),
                            dsn,
                            username,
                            password,
                            options));
        }

        return ZVal.assign(new PDO(env, dsn, username, password, options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    protected Object isPersistentConnection(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, 12))
                        && ZVal.toBool(options.arrayGet(env, 12)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Throwable")
    @ConvertedParameter(index = 1, name = "dsn")
    @ConvertedParameter(index = 2, name = "username")
    @ConvertedParameter(index = 3, name = "password")
    @ConvertedParameter(index = 4, name = "options")
    protected Object tryAgainIfCausedByLostConnection(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object dsn = assignParameter(args, 1, false);
        Object username = assignParameter(args, 2, false);
        Object password = assignParameter(args, 3, false);
        Object options = assignParameter(args, 4, false);
        if (ZVal.isTrue(this.causedByLostConnection(env, e))) {
            return ZVal.assign(this.createPdoConnection(env, dsn, username, password, options));
        }

        throw ZVal.getException(env, e);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config", typeHint = "array")
    public Object getOptions(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object options = null;
        Object ternaryExpressionTemp = null;
        options =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "options"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        return ZVal.assign(
                ZVal.add(
                        function_array_diff_key.f.env(env).call(this.options, options).value(),
                        options));
    }

    @ConvertedMethod
    public Object getDefaultOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.options);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object setDefaultOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        this.options = options;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Throwable")
    protected Object causedByLostConnection(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object message = null;
        message = env.callMethod(e, "getMessage", Connector.class);
        return ZVal.assign(
                Str.runtimeStaticObject.contains(
                        env,
                        message,
                        ZVal.arrayFromList(
                                "server has gone away",
                                "no connection to the server",
                                "Lost connection",
                                "is dead or not enabled",
                                "Error while sending",
                                "decryption failed or bad record mac",
                                "server closed the connection unexpectedly",
                                "SSL connection has been closed unexpectedly",
                                "Error writing data to the connection",
                                "Resource deadlock avoided",
                                "Transaction() on null",
                                "child connection forced to terminate due to client_idle_limit",
                                "query_wait_timeout",
                                "reset by peer",
                                "Physical connection is not usable",
                                "TCP Provider: Error code 0x68")));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Connectors\\Connector";

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
                    .setName("Illuminate\\Database\\Connectors\\Connector")
                    .setLookup(
                            Connector.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("options")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Connectors/Connector.php")
                    .addTrait("Illuminate\\Database\\DetectsLostConnections")
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
