package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Annotation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Annotation/Route.php

*/

public class Route extends RuntimeClassBase {

    public Object path = null;

    public Object localizedPaths = ZVal.newArray();

    public Object name = null;

    public Object requirements = ZVal.newArray();

    public Object options = ZVal.newArray();

    public Object defaults = ZVal.newArray();

    public Object host = null;

    public Object methods = ZVal.newArray();

    public Object schemes = ZVal.newArray();

    public Object condition = null;

    public Route(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Route.class) {
            this.__construct(env, args);
        }
    }

    public Route(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "data", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer data = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object method = null;
        ReferenceContainer value = new BasicReferenceContainer(null);
        Object key = null;
        if (arrayActionR(ArrayAction.ISSET, data, env, "localized_paths")) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unknown property \"localized_paths\" on annotation \"%s\".",
                                            function_get_class.f.env(env).call(this).value())
                                    .value()));
        }

        if (arrayActionR(ArrayAction.ISSET, data, env, "value")) {
            data.arrayAccess(
                            env,
                            function_is_array.f.env(env).call(data.arrayGet(env, "value")).getBool()
                                    ? "localized_paths"
                                    : "path")
                    .set(data.arrayGet(env, "value"));
            arrayActionR(ArrayAction.UNSET, data, env, "value");
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, data, env, "path"))
                && ZVal.toBool(
                        function_is_array.f.env(env).call(data.arrayGet(env, "path")).value())) {
            data.arrayAccess(env, "localized_paths").set(data.arrayGet(env, "path"));
            arrayActionR(ArrayAction.UNSET, data, env, "path");
        }

        for (ZPair zpairResult2008 : ZVal.getIterable(data.getObject(), env, false)) {
            key = ZVal.assign(zpairResult2008.getKey());
            value.setObject(ZVal.assign(zpairResult2008.getValue()));
            method =
                    "set"
                            + toStringR(
                                    function_str_replace.f.env(env).call("_", "", key).value(),
                                    env);
            if (!function_method_exists.f.env(env).call(this, method).getBool()) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unknown property \"%s\" on annotation \"%s\".",
                                                key,
                                                function_get_class.f.env(env).call(this).value())
                                        .value()));
            }

            env.callMethod(
                    this,
                    new RuntimeArgsWithReferences().add(0, value),
                    toStringR(method, env),
                    Route.class,
                    value.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object setPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.path = path;
        return null;
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "localizedPaths", typeHint = "array")
    public Object setLocalizedPaths(RuntimeEnv env, Object... args) {
        Object localizedPaths = assignParameter(args, 0, false);
        this.localizedPaths = localizedPaths;
        return null;
    }

    @ConvertedMethod
    public Object getLocalizedPaths(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.localizedPaths);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object setHost(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        this.host = pattern;
        return null;
    }

    @ConvertedMethod
    public Object getHost(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.host);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requirements")
    public Object setRequirements(RuntimeEnv env, Object... args) {
        Object requirements = assignParameter(args, 0, false);
        this.requirements = requirements;
        return null;
    }

    @ConvertedMethod
    public Object getRequirements(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.requirements);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options")
    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        this.options = options;
        return null;
    }

    @ConvertedMethod
    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.options);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults")
    public Object setDefaults(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        this.defaults = defaults;
        return null;
    }

    @ConvertedMethod
    public Object getDefaults(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.defaults);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schemes")
    public Object setSchemes(RuntimeEnv env, Object... args) {
        Object schemes = assignParameter(args, 0, false);
        this.schemes =
                function_is_array.f.env(env).call(schemes).getBool()
                        ? schemes
                        : ZVal.newArray(new ZPair(0, schemes));
        return null;
    }

    @ConvertedMethod
    public Object getSchemes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.schemes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    public Object setMethods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        this.methods =
                function_is_array.f.env(env).call(methods).getBool()
                        ? methods
                        : ZVal.newArray(new ZPair(0, methods));
        return null;
    }

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methods);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    public Object setCondition(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        this.condition = condition;
        return null;
    }

    @ConvertedMethod
    public Object getCondition(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.condition);
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Annotation\\Route";

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
                    .setName("Symfony\\Component\\Routing\\Annotation\\Route")
                    .setLookup(
                            Route.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "condition",
                            "defaults",
                            "host",
                            "localizedPaths",
                            "methods",
                            "name",
                            "options",
                            "path",
                            "requirements",
                            "schemes")
                    .setFilename("vendor/symfony/routing/Annotation/Route.php")
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
