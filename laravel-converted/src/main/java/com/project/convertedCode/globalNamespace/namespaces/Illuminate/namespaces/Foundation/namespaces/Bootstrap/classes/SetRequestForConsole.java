package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.Request;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/SetRequestForConsole.php

*/

public class SetRequestForConsole extends RuntimeClassBase {

    public SetRequestForConsole(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SetRequestForConsole(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    public Object bootstrap(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        Object server = null;
        ReferenceContainer components = new BasicReferenceContainer(null);
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object uri = null;
        uri =
                env.callMethod(
                        env.callMethod(app, "make", SetRequestForConsole.class, "config"),
                        "get",
                        SetRequestForConsole.class,
                        "app.url",
                        "http://localhost");
        components.setObject(NamespaceGlobal.parse_url.env(env).call(uri).value());
        server = ZVal.assign(_SERVER.getObject());
        if (arrayActionR(ArrayAction.ISSET, components, env, "path")) {
            server =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    server,
                                    ZVal.newArray(
                                            new ZPair(
                                                    "SCRIPT_FILENAME",
                                                    components.arrayGet(env, "path")),
                                            new ZPair(
                                                    "SCRIPT_NAME",
                                                    components.arrayGet(env, "path"))))
                            .value();
        }

        env.callMethod(
                app,
                "instance",
                SetRequestForConsole.class,
                "request",
                Request.runtimeStaticObject.create(
                        env,
                        uri,
                        "GET",
                        ZVal.newArray(),
                        ZVal.newArray(),
                        ZVal.newArray(),
                        server));
        return null;
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Bootstrap\\SetRequestForConsole";

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
                    .setName("Illuminate\\Foundation\\Bootstrap\\SetRequestForConsole")
                    .setLookup(
                            SetRequestForConsole.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Bootstrap/SetRequestForConsole.php")
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
