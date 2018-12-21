package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.ConnectionResolverInterface;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/ConnectionResolver.php

*/

public class ConnectionResolver extends RuntimeClassBase implements ConnectionResolverInterface {

    public Object connections = ZVal.newArray();

    public Object _pDefault = null;

    public ConnectionResolver(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConnectionResolver.class) {
            this.__construct(env, args);
        }
    }

    public ConnectionResolver(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connections",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connections = assignParameter(args, 0, true);
        if (null == connections) {
            connections = ZVal.newArray();
        }
        Object name = null;
        Object connection = null;
        for (ZPair zpairResult251 : ZVal.getIterable(connections, env, false)) {
            name = ZVal.assign(zpairResult251.getKey());
            connection = ZVal.assign(zpairResult251.getValue());
            this.addConnection(env, name, connection);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object connection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(name).getBool()) {
            name = this.getDefaultConnection(env);
        }

        return ZVal.assign(
                new ReferenceClassProperty(this, "connections", env).arrayGet(env, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "connection",
        typeHint = "Illuminate\\Database\\ConnectionInterface"
    )
    public Object addConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object connection = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "connections", env).arrayAccess(env, name).set(connection);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "connections", env),
                        env,
                        name));
    }

    @ConvertedMethod
    public Object getDefaultConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pDefault);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this._pDefault = name;
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\ConnectionResolver";

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
                    .setName("Illuminate\\Database\\ConnectionResolver")
                    .setLookup(
                            ConnectionResolver.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connections", "default")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/ConnectionResolver.php")
                    .addInterface("Illuminate\\Database\\ConnectionResolverInterface")
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
