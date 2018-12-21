package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.functions.last;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/ResourceRegistrar.php

*/

public class ResourceRegistrar extends RuntimeClassBase {

    public Object router = null;

    public Object resourceDefaults =
            ZVal.arrayFromList("index", "create", "store", "show", "edit", "update", "destroy");

    public Object parameters = null;

    public ResourceRegistrar(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ResourceRegistrar.class) {
            this.__construct(env, args);
        }
    }

    public ResourceRegistrar(NoConstructor n) {
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
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "controller")
    @ConvertedParameter(
        index = 2,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object register(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer controller =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object defaults = null;
        Object collection = null;
        Object m = null;
        ReferenceContainer base = new BasicReferenceContainer(null);
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, options, env, "parameters"))
                && ZVal.toBool(!ZVal.isset(this.parameters))) {
            this.parameters = options.arrayGet(env, "parameters");
        }

        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, name.getObject(), "/"))) {
            this.prefixedResource(
                    env, name.getObject(), controller.getObject(), options.getObject());
            return null;
        }

        base.setObject(
                this.getResourceWildcard(
                        env,
                        last.f
                                .env(env)
                                .call(
                                        function_explode
                                                .f
                                                .env(env)
                                                .call(".", name.getObject())
                                                .value())
                                .value()));
        defaults = ZVal.assign(this.resourceDefaults);
        collection = new RouteCollection(env);
        for (ZPair zpairResult518 :
                ZVal.getIterable(
                        this.getResourceMethods(env, defaults, options.getObject()), env, true)) {
            m = ZVal.assign(zpairResult518.getValue());
            env.callMethod(
                    collection,
                    rLastRefArgs =
                            new RuntimeArgsWithReferences()
                                    .add(
                                            0,
                                            handleReturnReference(
                                                    env.callMethod(
                                                            this,
                                                            new RuntimeArgsWithReferences()
                                                                    .add(0, name)
                                                                    .add(1, base)
                                                                    .add(2, controller)
                                                                    .add(3, options),
                                                            "addResource"
                                                                    + toStringR(
                                                                            NamespaceGlobal.ucfirst
                                                                                    .env(env)
                                                                                    .call(m)
                                                                                    .value(),
                                                                            env),
                                                            ResourceRegistrar.class,
                                                            name.getObject(),
                                                            base.getObject(),
                                                            controller.getObject(),
                                                            options.getObject()))),
                    "add",
                    ResourceRegistrar.class,
                    rLastRefArgs.get(0));
        }

        return ZVal.assign(collection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "controller")
    @ConvertedParameter(index = 2, name = "options", typeHint = "array")
    protected Object prefixedResource(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope153 scope = new Scope153();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Routing/ResourceRegistrar.php");
            scope.name = assignParameter(args, 0, false);
            scope.controller = assignParameter(args, 1, false);
            scope.options = assignParameter(args, 2, false);
            scope.prefix = null;
            scope.callback = null;
            scope.runtimeTempArrayResult76 = null;
            ZVal.list(
                    scope.runtimeTempArrayResult76 = this.getResourcePrefix(env, scope.name),
                    (scope.name = listGet(scope.runtimeTempArrayResult76, 0, env)),
                    (scope.prefix = listGet(scope.runtimeTempArrayResult76, 1, env)));
            scope.callback =
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Illuminate\\Routing",
                            this) {
                        @Override
                        @ConvertedMethod
                        @ConvertedParameter(index = 0, name = "me")
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            Object me = assignParameter(args, 0, false);
                            Object controller = null;
                            Object name = null;
                            Object options = null;
                            controller = this.contextReferences.getCapturedValue("controller");
                            name = this.contextReferences.getCapturedValue("name");
                            options = this.contextReferences.getCapturedValue("options");
                            env.callMethod(
                                    me,
                                    "resource",
                                    ResourceRegistrar.class,
                                    name,
                                    controller,
                                    options);
                            return null;
                        }
                    }.use("controller", scope.controller)
                            .use("name", scope.name)
                            .use("options", scope.options);
            throw new IncludeEventException(
                    ZVal.assign(
                            env.callMethod(
                                    this.router,
                                    "group",
                                    ResourceRegistrar.class,
                                    function_compact.f.env(env).call(stack, "prefix").value(),
                                    scope.callback)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getResourcePrefix(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object prefix = null;
        Object segments = null;
        segments = function_explode.f.env(env).call("/", name).value();
        prefix =
                NamespaceGlobal.implode
                        .env(env)
                        .call("/", function_array_slice.f.env(env).call(segments, 0, -1).value())
                        .value();
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, function_end.f.env(env).call(segments).value()),
                        new ZPair(1, prefix)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults")
    @ConvertedParameter(index = 1, name = "options")
    protected Object getResourceMethods(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (arrayActionR(ArrayAction.ISSET, options, env, "only")) {
            return ZVal.assign(
                    function_array_intersect
                            .f
                            .env(env)
                            .call(defaults, rToArrayCast(options.arrayGet(env, "only")))
                            .value());

        } else if (arrayActionR(ArrayAction.ISSET, options, env, "except")) {
            return ZVal.assign(
                    function_array_diff
                            .f
                            .env(env)
                            .call(defaults, rToArrayCast(options.arrayGet(env, "except")))
                            .value());
        }

        return ZVal.assign(defaults);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "base")
    @ConvertedParameter(index = 2, name = "controller")
    @ConvertedParameter(index = 3, name = "options")
    protected Object addResourceIndex(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object base = assignParameter(args, 1, false);
        Object controller = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object action = null;
        Object uri = null;
        uri = this.getResourceUri(env, name);
        action = this.getResourceAction(env, name, controller, "index", options);
        return ZVal.assign(
                env.callMethod(this.router, "get", ResourceRegistrar.class, uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "base")
    @ConvertedParameter(index = 2, name = "controller")
    @ConvertedParameter(index = 3, name = "options")
    protected Object addResourceCreate(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object base = assignParameter(args, 1, false);
        Object controller = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object action = null;
        Object uri = null;
        uri =
                toStringR(this.getResourceUri(env, name), env)
                        + "/"
                        + toStringR(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Illuminate
                                                        .namespaces
                                                        .Routing
                                                        .classes
                                                        .ResourceRegistrar
                                                        .RequestStaticProperties
                                                        .class,
                                                "verbs")
                                        .arrayGet(env, "create"),
                                env);
        action = this.getResourceAction(env, name, controller, "create", options);
        return ZVal.assign(
                env.callMethod(this.router, "get", ResourceRegistrar.class, uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "base")
    @ConvertedParameter(index = 2, name = "controller")
    @ConvertedParameter(index = 3, name = "options")
    protected Object addResourceStore(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object base = assignParameter(args, 1, false);
        Object controller = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object action = null;
        Object uri = null;
        uri = this.getResourceUri(env, name);
        action = this.getResourceAction(env, name, controller, "store", options);
        return ZVal.assign(
                env.callMethod(this.router, "post", ResourceRegistrar.class, uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "base")
    @ConvertedParameter(index = 2, name = "controller")
    @ConvertedParameter(index = 3, name = "options")
    protected Object addResourceShow(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object base = assignParameter(args, 1, false);
        Object controller = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object action = null;
        Object uri = null;
        uri = toStringR(this.getResourceUri(env, name), env) + "/{" + toStringR(base, env) + "}";
        action = this.getResourceAction(env, name, controller, "show", options);
        return ZVal.assign(
                env.callMethod(this.router, "get", ResourceRegistrar.class, uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "base")
    @ConvertedParameter(index = 2, name = "controller")
    @ConvertedParameter(index = 3, name = "options")
    protected Object addResourceEdit(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object base = assignParameter(args, 1, false);
        Object controller = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object action = null;
        Object uri = null;
        uri =
                toStringR(this.getResourceUri(env, name), env)
                        + "/{"
                        + toStringR(base, env)
                        + "}/"
                        + toStringR(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Illuminate
                                                        .namespaces
                                                        .Routing
                                                        .classes
                                                        .ResourceRegistrar
                                                        .RequestStaticProperties
                                                        .class,
                                                "verbs")
                                        .arrayGet(env, "edit"),
                                env);
        action = this.getResourceAction(env, name, controller, "edit", options);
        return ZVal.assign(
                env.callMethod(this.router, "get", ResourceRegistrar.class, uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "base")
    @ConvertedParameter(index = 2, name = "controller")
    @ConvertedParameter(index = 3, name = "options")
    protected Object addResourceUpdate(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object base = assignParameter(args, 1, false);
        Object controller = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object action = null;
        ReferenceContainer uri = new BasicReferenceContainer(null);
        uri.setObject(
                toStringR(this.getResourceUri(env, name), env) + "/{" + toStringR(base, env) + "}");
        action = this.getResourceAction(env, name, controller, "update", options);
        return ZVal.assign(
                env.callMethod(
                        this.router,
                        new RuntimeArgsWithReferences().add(1, uri),
                        "match",
                        ResourceRegistrar.class,
                        ZVal.arrayFromList("PUT", "PATCH"),
                        uri.getObject(),
                        action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "base")
    @ConvertedParameter(index = 2, name = "controller")
    @ConvertedParameter(index = 3, name = "options")
    protected Object addResourceDestroy(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object base = assignParameter(args, 1, false);
        Object controller = assignParameter(args, 2, false);
        Object options = assignParameter(args, 3, false);
        Object action = null;
        Object uri = null;
        uri = toStringR(this.getResourceUri(env, name), env) + "/{" + toStringR(base, env) + "}";
        action = this.getResourceAction(env, name, controller, "destroy", options);
        return ZVal.assign(
                env.callMethod(this.router, "delete", ResourceRegistrar.class, uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    public Object getResourceUri(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object uri = null;
        Object segments = null;
        if (!ZVal.isTrue(Str.runtimeStaticObject.contains(env, resource, "."))) {
            return ZVal.assign(resource);
        }

        segments = function_explode.f.env(env).call(".", resource).value();
        uri = this.getNestedResourceUri(env, segments);
        return ZVal.assign(
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "/{"
                                        + toStringR(
                                                this.getResourceWildcard(
                                                        env,
                                                        function_end
                                                                .f
                                                                .env(env)
                                                                .call(segments)
                                                                .value()),
                                                env)
                                        + "}",
                                "",
                                uri)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "segments", typeHint = "array")
    protected Object getNestedResourceUri(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/ResourceRegistrar.php");
        Object segments = assignParameter(args, 0, false);
        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "/",
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Routing",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "s")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object _closureThisVar =
                                                                this.getClosureThisVar();
                                                        Object s = assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                toStringR(s, env)
                                                                        + "/{"
                                                                        + toStringR(
                                                                                ResourceRegistrar
                                                                                        .this
                                                                                        .getResourceWildcard(
                                                                                                env,
                                                                                                s),
                                                                                env)
                                                                        + "}");
                                                    }
                                                },
                                                segments)
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object getResourceWildcard(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "parameters", env),
                env,
                value)) {
            value =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "parameters", env)
                                    .arrayGet(env, value));

        } else if (arrayActionR(
                ArrayAction.ISSET,
                env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Routing
                                .classes
                                .ResourceRegistrar
                                .RequestStaticProperties
                                .class,
                        "parameterMap"),
                env,
                value)) {
            value =
                    ZVal.assign(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Routing
                                                    .classes
                                                    .ResourceRegistrar
                                                    .RequestStaticProperties
                                                    .class,
                                            "parameterMap")
                                    .arrayGet(env, value));

        } else if (ZVal.toBool(ZVal.strictEqualityCheck(this.parameters, "===", "singular"))
                || ZVal.toBool(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Routing
                                                .classes
                                                .ResourceRegistrar
                                                .RequestStaticProperties
                                                .class)
                                .singularParameters)) {
            value = Str.runtimeStaticObject.singular(env, value);
        }

        return ZVal.assign(function_str_replace.f.env(env).call("-", "_", value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(index = 1, name = "controller")
    @ConvertedParameter(index = 2, name = "method")
    @ConvertedParameter(index = 3, name = "options")
    protected Object getResourceAction(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 3, false));
        Object name = null;
        ReferenceContainer action = new BasicReferenceContainer(null);
        name = this.getResourceRouteName(env, resource, method, options.getObject());
        action.setObject(
                ZVal.newArray(
                        new ZPair("as", name),
                        new ZPair(
                                "uses",
                                toStringR(controller, env) + "@" + toStringR(method, env))));
        if (arrayActionR(ArrayAction.ISSET, options, env, "middleware")) {
            action.arrayAccess(env, "middleware").set(options.arrayGet(env, "middleware"));
        }

        return ZVal.assign(action.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resource")
    @ConvertedParameter(index = 1, name = "method")
    @ConvertedParameter(index = 2, name = "options")
    protected Object getResourceRouteName(RuntimeEnv env, Object... args) {
        Object resource = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object prefix = null;
        Object name = null;
        name = ZVal.assign(resource);
        if (arrayActionR(ArrayAction.ISSET, options, env, "names")) {
            if (function_is_string.f.env(env).call(options.arrayGet(env, "names")).getBool()) {
                name = ZVal.assign(options.arrayGet(env, "names"));

            } else if (arrayActionR(ArrayAction.ISSET, options, env, "names", method)) {
                return ZVal.assign(options.arrayGet(env, "names", method));
            }
        }

        prefix =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, options, env, "as")
                                ? toStringR(options.arrayGet(env, "as"), env) + "."
                                : "");
        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("%s%s.%s", prefix, name, method)
                                        .value(),
                                ".")
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Routing\\ResourceRegistrar";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "singular",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object singularParameters(RuntimeEnv env, Object... args) {
            Object singular = assignParameter(args, 0, true);
            if (null == singular) {
                singular = true;
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Routing
                                            .classes
                                            .ResourceRegistrar
                                            .RequestStaticProperties
                                            .class)
                            .singularParameters =
                    ZVal.toBool(singular);
            return null;
        }

        @ConvertedMethod
        public Object getParameters(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Routing
                                            .classes
                                            .ResourceRegistrar
                                            .RequestStaticProperties
                                            .class)
                            .parameterMap);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "parameters",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object setParameters(RuntimeEnv env, Object... args) {
            Object parameters = assignParameter(args, 0, true);
            if (null == parameters) {
                parameters = ZVal.newArray();
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Routing
                                            .classes
                                            .ResourceRegistrar
                                            .RequestStaticProperties
                                            .class)
                            .parameterMap =
                    parameters;
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "verbs",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        public Object verbs(RuntimeEnv env, Object... args) {
            Object verbs = assignParameter(args, 0, true);
            if (null == verbs) {
                verbs = ZVal.newArray();
            }
            if (ZVal.isEmpty(verbs)) {
                return ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Routing
                                                .classes
                                                .ResourceRegistrar
                                                .RequestStaticProperties
                                                .class)
                                .verbs);

            } else {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Routing
                                                .classes
                                                .ResourceRegistrar
                                                .RequestStaticProperties
                                                .class)
                                .verbs =
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        env.getRequestStaticProperties(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Routing
                                                                .classes
                                                                .ResourceRegistrar
                                                                .RequestStaticProperties
                                                                .class)
                                                .verbs,
                                        verbs)
                                .value();
            }

            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object parameterMap = ZVal.newArray();

        public Object singularParameters = true;

        public Object verbs =
                ZVal.newArray(new ZPair("create", "create"), new ZPair("edit", "edit"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\ResourceRegistrar")
                    .setLookup(
                            ResourceRegistrar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("parameters", "resourceDefaults", "router")
                    .setStaticPropertyNames("parameterMap", "singularParameters", "verbs")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Routing/ResourceRegistrar.php")
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

    private static class Scope153 implements UpdateRuntimeScopeInterface {

        Object controller;
        Object prefix;
        Object name;
        Object _thisVarAlias;
        Object options;
        Object callback;
        Object runtimeTempArrayResult76;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("controller", this.controller);
            stack.setVariable("prefix", this.prefix);
            stack.setVariable("name", this.name);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("options", this.options);
            stack.setVariable("callback", this.callback);
            stack.setVariable("runtimeTempArrayResult76", this.runtimeTempArrayResult76);
        }

        public void updateScope(RuntimeStack stack) {

            this.controller = stack.getVariable("controller");
            this.prefix = stack.getVariable("prefix");
            this.name = stack.getVariable("name");
            this._thisVarAlias = stack.getVariable("this");
            this.options = stack.getVariable("options");
            this.callback = stack.getVariable("callback");
            this.runtimeTempArrayResult76 = stack.getVariable("runtimeTempArrayResult76");
        }
    }
}
