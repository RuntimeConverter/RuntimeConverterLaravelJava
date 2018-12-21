package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Server.classes.Connection;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.DataDumperInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/ServerDumper.php

*/

public class ServerDumper extends RuntimeClassBase implements DataDumperInterface {

    public Object connection = null;

    public Object wrappedDumper = null;

    public ServerDumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ServerDumper.class) {
            this.__construct(env, args);
        }
    }

    public ServerDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "host", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "wrappedDumper",
        typeHint = "Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "contextProviders",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object host = assignParameter(args, 0, false);
        Object wrappedDumper = assignParameter(args, 1, true);
        if (null == wrappedDumper) {
            wrappedDumper = ZVal.getNull();
        }
        Object contextProviders = assignParameter(args, 2, true);
        if (null == contextProviders) {
            contextProviders = ZVal.newArray();
        }
        this.connection = new Connection(env, host, contextProviders);
        this.wrappedDumper = wrappedDumper;
        return null;
    }

    @ConvertedMethod
    public Object getContextProviders(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.connection, "getContextProviders", ServerDumper.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
    )
    public Object dump(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        !ZVal.isTrue(
                                env.callMethod(this.connection, "write", ServerDumper.class, data)))
                && ZVal.toBool(this.wrappedDumper)) {
            env.callMethod(this.wrappedDumper, "dump", ServerDumper.class, data);
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Dumper\\ServerDumper";

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
                    .setName("Symfony\\Component\\VarDumper\\Dumper\\ServerDumper")
                    .setLookup(
                            ServerDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "wrappedDumper")
                    .setFilename("vendor/symfony/var-dumper/Dumper/ServerDumper.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface")
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
