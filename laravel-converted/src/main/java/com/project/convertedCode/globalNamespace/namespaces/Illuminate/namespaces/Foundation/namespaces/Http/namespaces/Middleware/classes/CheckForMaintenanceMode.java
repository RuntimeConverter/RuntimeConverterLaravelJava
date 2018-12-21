package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Exceptions.classes.MaintenanceModeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpFoundation.classes.IpUtils;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/CheckForMaintenanceMode.php

*/

public class CheckForMaintenanceMode extends RuntimeClassBase {

    public Object app = null;

    public Object except = ZVal.newArray();

    public CheckForMaintenanceMode(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CheckForMaintenanceMode.class) {
            this.__construct(env, args);
        }
    }

    public CheckForMaintenanceMode(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        this.app = app;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "next", typeHint = "Closure")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object next = assignParameter(args, 1, false);
        ReferenceContainer data = new BasicReferenceContainer(null);
        if (ZVal.isTrue(
                env.callMethod(this.app, "isDownForMaintenance", CheckForMaintenanceMode.class))) {
            data.setObject(
                    NamespaceGlobal.json_decode
                            .env(env)
                            .call(
                                    function_file_get_contents
                                            .f
                                            .env(env)
                                            .call(
                                                    toStringR(
                                                                    env.callMethod(
                                                                            this.app,
                                                                            "storagePath",
                                                                            CheckForMaintenanceMode
                                                                                    .class),
                                                                    env)
                                                            + "/framework/down")
                                            .value(),
                                    true)
                            .value());
            if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, data, env, "allowed"))
                    && ZVal.toBool(
                            IpUtils.runtimeStaticObject.checkIp(
                                    env,
                                    env.callMethod(
                                            request.getObject(),
                                            "ip",
                                            CheckForMaintenanceMode.class),
                                    rToArrayCast(data.arrayGet(env, "allowed"))))) {
                return ZVal.assign(
                        env.callFunctionDynamic(
                                        next,
                                        new RuntimeArgsWithReferences().add(0, request),
                                        request.getObject())
                                .value());
            }

            if (ZVal.isTrue(this.inExceptArray(env, request.getObject()))) {
                return ZVal.assign(
                        env.callFunctionDynamic(
                                        next,
                                        new RuntimeArgsWithReferences().add(0, request),
                                        request.getObject())
                                .value());
            }

            throw ZVal.getException(
                    env,
                    new MaintenanceModeException(
                            env,
                            data.arrayGet(env, "time"),
                            data.arrayGet(env, "retry"),
                            data.arrayGet(env, "message")));
        }

        return ZVal.assign(
                env.callFunctionDynamic(
                                next,
                                new RuntimeArgsWithReferences().add(0, request),
                                request.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object inExceptArray(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object except = null;
        for (ZPair zpairResult419 : ZVal.getIterable(this.except, env, true)) {
            except = ZVal.assign(zpairResult419.getValue());
            if (ZVal.strictNotEqualityCheck(except, "!==", "/")) {
                except = function_trim.f.env(env).call(except, "/").value();
            }

            if (ZVal.toBool(
                            env.callMethod(
                                    request, "fullUrlIs", CheckForMaintenanceMode.class, except))
                    || ZVal.toBool(
                            env.callMethod(request, "is", CheckForMaintenanceMode.class, except))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Http\\Middleware\\CheckForMaintenanceMode";

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
                    .setName("Illuminate\\Foundation\\Http\\Middleware\\CheckForMaintenanceMode")
                    .setLookup(
                            CheckForMaintenanceMode.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "except")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/CheckForMaintenanceMode.php")
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
