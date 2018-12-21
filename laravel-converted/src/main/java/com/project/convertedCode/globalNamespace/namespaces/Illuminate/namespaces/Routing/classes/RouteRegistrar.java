package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/RouteRegistrar.php

*/

public class RouteRegistrar extends RuntimeClassBase {

    public Object router = null;

    public Object attributes = ZVal.newArray();

    public Object passthru =
            ZVal.arrayFromList("get", "post", "put", "patch", "delete", "options", "any");

    public Object allowedAttributes =
            ZVal.arrayFromList("as", "domain", "middleware", "name", "namespace", "prefix");

    public Object aliases = ZVal.newArray(new ZPair("name", "as"));

    public RouteRegistrar(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == RouteRegistrar.class) {
            this.__construct(env, args);
        }
    }

    public RouteRegistrar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "router", typeHint = "Illuminate\\Routing\\Router")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object router = assignParameter(args, 0, false);
        this.router = router;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object attribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (!function_in_array.f.env(env).call(key, this.allowedAttributes).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Attribute [" + toStringR(key, env) + "] does not exist."));
        }

        new ReferenceClassProperty(this, "attributes", env)
                .arrayAccess(env, Arr.runtimeStaticObject.get(env, this.aliases, key, key))
                .set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "controller")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object resource(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        this.router,
                        "resource",
                        RouteRegistrar.class,
                        name,
                        controller,
                        ZVal.add(this.attributes, options)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object group(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(this.router, "group", RouteRegistrar.class, this.attributes, callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(
        index = 2,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object match(RuntimeEnv env, Object... args) {
        ReferenceContainer methods = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer uri = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object action = assignParameter(args, 2, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        this.router,
                        new RuntimeArgsWithReferences().add(0, methods).add(1, uri),
                        "match",
                        RouteRegistrar.class,
                        methods.getObject(),
                        uri.getObject(),
                        this.compileAction(env, action)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(
        index = 2,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object registerRoute(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object method = assignParameter(args, 0, false);
        ReferenceContainer uri = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object action = assignParameter(args, 2, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        if (!function_is_array.f.env(env).call(action).getBool()) {
            action =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    this.attributes,
                                    ZVal.isTrue(action)
                                            ? ZVal.newArray(new ZPair("uses", action))
                                            : ZVal.newArray())
                            .value();
        }

        return ZVal.assign(
                env.callMethod(
                        this.router,
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(0, uri)
                                        .add(
                                                1,
                                                handleReturnReference(
                                                        this.compileAction(env, action))),
                        toStringR(method, env),
                        RouteRegistrar.class,
                        uri.getObject(),
                        rLastRefArgs.get(1)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    protected Object compileAction(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        if (function_is_null.f.env(env).call(action).getBool()) {
            return ZVal.assign(this.attributes);
        }

        if (ZVal.toBool(function_is_string.f.env(env).call(action).value())
                || ZVal.toBool(ZVal.checkInstanceType(action, Closure.class, "Closure"))) {
            action = ZVal.newArray(new ZPair("uses", action));
        }

        return ZVal.assign(function_array_merge.f.env(env).call(this.attributes, action).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        if (function_in_array.f.env(env).call(method, this.passthru).getBool()) {
            return ZVal.assign(
                    this.registerRoute(
                            env,
                            PackedVaradicArgs.unpack(
                                    method, new PackedVaradicArgs(parameters.getObject()))));
        }

        if (function_in_array.f.env(env).call(method, this.allowedAttributes).getBool()) {
            if (ZVal.equalityCheck(method, "middleware")) {
                return ZVal.assign(
                        this.attribute(
                                env,
                                method,
                                function_is_array
                                                .f
                                                .env(env)
                                                .call(parameters.arrayGet(env, 0))
                                                .getBool()
                                        ? parameters.arrayGet(env, 0)
                                        : parameters.getObject()));
            }

            return ZVal.assign(this.attribute(env, method, parameters.arrayGet(env, 0)));
        }

        throw ZVal.getException(
                env,
                new BadMethodCallException(
                        env,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "Method %s::%s does not exist.",
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        method)
                                .value()));
    }

    public static final Object CONST_class = "Illuminate\\Routing\\RouteRegistrar";

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
                    .setName("Illuminate\\Routing\\RouteRegistrar")
                    .setLookup(
                            RouteRegistrar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases", "allowedAttributes", "attributes", "passthru", "router")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/RouteRegistrar.php")
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
