package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteRegistrar;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.classes.JsonResponse;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeClasses.spl.misc.ArrayObject;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Route;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteBinding;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteGroup;
import com.runtimeconverter.runtime.RuntimeStack;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import java.lang.Class;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.MiddlewareNameResolver;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.PendingResourceRegistration;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.SortedMiddleware;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.ImplicitRouteBinding;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.Registrar;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.BindingRegistrar;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Responsable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.ResourceRegistrar;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Events.classes.RouteMatched;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Pipeline;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Router.php

*/

public class Router extends RuntimeClassBase implements Registrar, BindingRegistrar {

    public Object events = null;

    public Object container = null;

    public Object routes = null;

    public Object current = null;

    public Object currentRequest = null;

    public Object middleware = ZVal.newArray();

    public Object middlewareGroups = ZVal.newArray();

    public Object middlewarePriority = ZVal.newArray();

    public Object binders = ZVal.newArray();

    public Object patterns = ZVal.newArray();

    public Object groupStack = ZVal.newArray();

    public Router(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Router.class) {
            this.__construct(env, args);
        }
    }

    public Router(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    @ConvertedParameter(
        index = 1,
        name = "container",
        typeHint = "Illuminate\\Container\\Container",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object events = assignParameter(args, 0, false);
        Object container = assignParameter(args, 1, true);
        if (null == container) {
            container = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.events = events;
        this.routes = new RouteCollection(env);
        this.container =
                ZVal.isTrue(ternaryExpressionTemp = container)
                        ? ternaryExpressionTemp
                        : new Container(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object get(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object action = assignParameter(args, 1, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(this.addRoute(env, ZVal.arrayFromList("GET", "HEAD"), uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object post(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object action = assignParameter(args, 1, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(this.addRoute(env, "POST", uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object put(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object action = assignParameter(args, 1, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(this.addRoute(env, "PUT", uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object patch(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object action = assignParameter(args, 1, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(this.addRoute(env, "PATCH", uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object delete(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object action = assignParameter(args, 1, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(this.addRoute(env, "DELETE", uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object options(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object action = assignParameter(args, 1, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(this.addRoute(env, "OPTIONS", uri, action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(
        index = 1,
        name = "action",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object any(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object action = assignParameter(args, 1, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(
                this.addRoute(
                        env,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Routing
                                                .classes
                                                .Router
                                                .RequestStaticProperties
                                                .class)
                                .verbs,
                        uri,
                        action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    public Object fallback(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        Object placeholder = null;
        placeholder = "fallbackPlaceholder";
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.addRoute(
                                        env,
                                        "GET",
                                        "{" + toStringR(placeholder, env) + "}",
                                        action),
                                "where",
                                Router.class,
                                placeholder,
                                ".*"),
                        "fallback",
                        Router.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(index = 1, name = "destination")
    @ConvertedParameter(
        index = 2,
        name = "status",
        defaultValue = "301",
        defaultValueType = "number"
    )
    public Object redirect(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object destination = assignParameter(args, 1, false);
        Object status = assignParameter(args, 2, true);
        if (null == status) {
            status = 301;
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.any(env, uri, "\\Illuminate\\Routing\\RedirectController"),
                                "defaults",
                                Router.class,
                                "destination",
                                destination),
                        "defaults",
                        Router.class,
                        "status",
                        status));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    @ConvertedParameter(index = 1, name = "view")
    @ConvertedParameter(index = 2, name = "data", defaultValue = "", defaultValueType = "array")
    public Object view(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object view = assignParameter(args, 1, false);
        Object data = assignParameter(args, 2, true);
        if (null == data) {
            data = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this.match(
                                        env,
                                        ZVal.arrayFromList("GET", "HEAD"),
                                        uri,
                                        "\\Illuminate\\Routing\\ViewController"),
                                "defaults",
                                Router.class,
                                "view",
                                view),
                        "defaults",
                        Router.class,
                        "data",
                        data));
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
        Object methods = assignParameter(args, 0, false);
        Object uri = assignParameter(args, 1, false);
        Object action = assignParameter(args, 2, true);
        if (null == action) {
            action = ZVal.getNull();
        }
        return ZVal.assign(
                this.addRoute(
                        env,
                        function_array_map
                                .f
                                .env(env)
                                .call("strtoupper", rToArrayCast(methods))
                                .value(),
                        uri,
                        action));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resources", typeHint = "array")
    public Object resources(RuntimeEnv env, Object... args) {
        Object resources = assignParameter(args, 0, false);
        Object controller = null;
        Object name = null;
        for (ZPair zpairResult530 : ZVal.getIterable(resources, env, false)) {
            name = ZVal.assign(zpairResult530.getKey());
            controller = ZVal.assign(zpairResult530.getValue());
            this.resource(env, name, controller);
        }

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
    public Object resource(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        Object options = assignParameter(args, 2, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object registrar = null;
        if (ZVal.toBool(this.container)
                && ZVal.toBool(
                        env.callMethod(
                                this.container,
                                "bound",
                                Router.class,
                                ResourceRegistrar.CONST_class))) {
            registrar =
                    env.callMethod(
                            this.container, "make", Router.class, ResourceRegistrar.CONST_class);

        } else {
            registrar = new ResourceRegistrar(env, this);
        }

        return ZVal.assign(
                new PendingResourceRegistration(env, registrar, name, controller, options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "resources", typeHint = "array")
    public Object apiResources(RuntimeEnv env, Object... args) {
        Object resources = assignParameter(args, 0, false);
        Object controller = null;
        Object name = null;
        for (ZPair zpairResult531 : ZVal.getIterable(resources, env, false)) {
            name = ZVal.assign(zpairResult531.getKey());
            controller = ZVal.assign(zpairResult531.getValue());
            this.apiResource(env, name, controller);
        }

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
    public Object apiResource(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object controller = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object only = null;
        only = ZVal.arrayFromList("index", "show", "store", "update", "destroy");
        if (arrayActionR(ArrayAction.ISSET, options, env, "except")) {
            only =
                    function_array_diff
                            .f
                            .env(env)
                            .call(only, rToArrayCast(options.arrayGet(env, "except")))
                            .value();
        }

        return ZVal.assign(
                this.resource(
                        env,
                        name,
                        controller,
                        function_array_merge
                                .f
                                .env(env)
                                .call(ZVal.newArray(new ZPair("only", only)), options.getObject())
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "routes")
    public Object group(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object routes = assignParameter(args, 1, false);
        this.updateGroupStack(env, attributes);
        this.loadRoutes(env, routes);
        function_array_pop.f.env(env).call(this.groupStack);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    protected Object updateGroupStack(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        if (!ZVal.isEmpty(this.groupStack)) {
            attributes =
                    RouteGroup.runtimeStaticObject.merge(
                            env, attributes, function_end.f.env(env).call(this.groupStack).value());
        }

        new ReferenceClassProperty(this, "groupStack", env).arrayAppend(env).set(attributes);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "new")
    public Object mergeWithLastGroup(RuntimeEnv env, Object... args) {
        Object _pNew = assignParameter(args, 0, false);
        return ZVal.assign(
                RouteGroup.runtimeStaticObject.merge(
                        env, _pNew, function_end.f.env(env).call(this.groupStack).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "routes")
    protected Object loadRoutes(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope28 scope = new Scope28();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                            .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Router.php");
            scope.routes = assignParameter(args, 0, false);
            scope.router = null;
            if (ZVal.isTrue(ZVal.checkInstanceType(scope.routes, Closure.class, "Closure"))) {
                env.callFunctionDynamic(
                        scope.routes,
                        new RuntimeArgsWithReferences()
                                .add(0, new ReadOnlyReferenceContainer(this)),
                        scope._thisVarAlias);

            } else {
                scope.router = ZVal.assign(scope._thisVarAlias);
                env.include(
                        toStringR(scope.routes, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    public Object getLastGroupPrefix(RuntimeEnv env, Object... args) {
        ReferenceContainer last = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        if (!ZVal.isEmpty(this.groupStack)) {
            last.setObject(function_end.f.env(env).call(this.groupStack).value());
            return ZVal.assign(
                    ZVal.isDefined(ternaryExpressionTemp = last.arrayGet(env, "prefix"))
                            ? ternaryExpressionTemp
                            : "");
        }

        return "";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(index = 2, name = "action")
    protected Object addRoute(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object methods = assignParameter(args, 0, false);
        Object uri = assignParameter(args, 1, false);
        Object action = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        this.routes,
                        rLastRefArgs =
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                handleReturnReference(
                                                        this.createRoute(
                                                                env, methods, uri, action))),
                        "add",
                        Router.class,
                        rLastRefArgs.get(0)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(index = 2, name = "action")
    protected Object createRoute(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        Object uri = assignParameter(args, 1, false);
        Object action = assignParameter(args, 2, false);
        Object route = null;
        if (ZVal.isTrue(this.actionReferencesController(env, action))) {
            action = this.convertToControllerAction(env, action);
        }

        route = this.newRoute(env, methods, this.prefix(env, uri), action);
        if (ZVal.isTrue(this.hasGroupStack(env))) {
            this.mergeGroupAttributesIntoRoute(env, route);
        }

        this.addWhereClausesToRoute(env, route);
        return ZVal.assign(route);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    protected Object actionReferencesController(RuntimeEnv env, Object... args) {
        ReferenceContainer action = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (!ZVal.isTrue(ZVal.checkInstanceType(action.getObject(), Closure.class, "Closure"))) {
            return ZVal.assign(
                    ZVal.toBool(function_is_string.f.env(env).call(action.getObject()).value())
                            || ZVal.toBool(
                                    ZVal.toBool(
                                                    arrayActionR(
                                                            ArrayAction.ISSET, action, env, "uses"))
                                            && ZVal.toBool(
                                                    function_is_string
                                                            .f
                                                            .env(env)
                                                            .call(action.arrayGet(env, "uses"))
                                                            .value())));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    protected Object convertToControllerAction(RuntimeEnv env, Object... args) {
        ReferenceContainer action = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (function_is_string.f.env(env).call(action.getObject()).getBool()) {
            action.setObject(ZVal.newArray(new ZPair("uses", action.getObject())));
        }

        if (!ZVal.isEmpty(this.groupStack)) {
            action.arrayAccess(env, "uses")
                    .set(this.prependGroupNamespace(env, action.arrayGet(env, "uses")));
        }

        action.arrayAccess(env, "controller").set(action.arrayGet(env, "uses"));
        return ZVal.assign(action.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object prependGroupNamespace(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        ReferenceContainer group = new BasicReferenceContainer(null);
        group.setObject(function_end.f.env(env).call(this.groupStack).value());
        return ZVal.assign(
                ZVal.toBool(arrayActionR(ArrayAction.ISSET, group, env, "namespace"))
                                && ZVal.toBool(
                                        ZVal.strictNotEqualityCheck(
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(_pClass, "\\")
                                                        .value(),
                                                "!==",
                                                0))
                        ? toStringR(group.arrayGet(env, "namespace"), env)
                                + "\\"
                                + toStringR(_pClass, env)
                        : _pClass);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(index = 2, name = "action")
    protected Object newRoute(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        Object uri = assignParameter(args, 1, false);
        Object action = assignParameter(args, 2, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                new Route(env, methods, uri, action),
                                "setRouter",
                                Router.class,
                                this),
                        "setContainer",
                        Router.class,
                        this.container));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    protected Object prefix(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(
                                                        toStringR(
                                                                        function_trim
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        this
                                                                                                .getLastGroupPrefix(
                                                                                                        env),
                                                                                        "/")
                                                                                .value(),
                                                                        env)
                                                                + "/"
                                                                + toStringR(
                                                                        function_trim
                                                                                .f
                                                                                .env(env)
                                                                                .call(uri, "/")
                                                                                .value(),
                                                                        env),
                                                        "/")
                                                .value())
                        ? ternaryExpressionTemp
                        : "/");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    protected Object addWhereClausesToRoute(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        env.callMethod(
                route,
                "where",
                Router.class,
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.patterns,
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        handleReturnReference(
                                                                        env.callMethod(
                                                                                route,
                                                                                "getAction",
                                                                                Router.class))
                                                                .arrayGet(env, "where"))
                                        ? ternaryExpressionTemp
                                        : ZVal.newArray())
                        .value());
        return ZVal.assign(route);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    protected Object mergeGroupAttributesIntoRoute(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        env.callMethod(
                route,
                "setAction",
                Router.class,
                this.mergeWithLastGroup(env, env.callMethod(route, "getAction", Router.class)));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object respondWithRoute(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object route = null;
        route =
                env.callMethod(
                        tap.f
                                .env(env)
                                .call(env.callMethod(this.routes, "getByName", Router.class, name))
                                .value(),
                        "bind",
                        Router.class,
                        this.currentRequest);
        return ZVal.assign(this.runRoute(env, this.currentRequest, route));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object dispatch(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.currentRequest = request;
        return ZVal.assign(this.dispatchToRoute(env, request));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object dispatchToRoute(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        return ZVal.assign(this.runRoute(env, request, this.findRoute(env, request)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    protected Object findRoute(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object route = null;
        this.current =
                route =
                        env.callMethod(
                                this.routes,
                                new RuntimeArgsWithReferences().add(0, request),
                                "match",
                                Router.class,
                                request.getObject());
        env.callMethod(this.container, "instance", Router.class, Route.CONST_class, route);
        return ZVal.assign(route);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(index = 1, name = "route", typeHint = "Illuminate\\Routing\\Route")
    protected Object runRoute(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Router.php");
        Object request = assignParameter(args, 0, false);
        Object route = assignParameter(args, 1, false);
        env.callMethod(
                request,
                "setRouteResolver",
                Router.class,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Routing", this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object route = null;
                        route = this.contextReferences.getCapturedValue("route");
                        return ZVal.assign(route);
                    }
                }.use("route", route));
        env.callMethod(
                this.events, "dispatch", Router.class, new RouteMatched(env, route, request));
        return ZVal.assign(
                this.prepareResponse(env, request, this.runRouteWithinStack(env, route, request)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Illuminate\\Routing\\Route")
    @ConvertedParameter(index = 1, name = "request", typeHint = "Illuminate\\Http\\Request")
    protected Object runRouteWithinStack(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Router.php");
        Object route = assignParameter(args, 0, false);
        Object request = assignParameter(args, 1, false);
        Object shouldSkipMiddleware = null;
        Object middleware = null;
        shouldSkipMiddleware =
                ZVal.toBool(
                                env.callMethod(
                                        this.container,
                                        "bound",
                                        Router.class,
                                        "middleware.disable"))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        env.callMethod(
                                                this.container,
                                                "make",
                                                Router.class,
                                                "middleware.disable"),
                                        "===",
                                        true));
        middleware =
                ZVal.assign(
                        ZVal.isTrue(shouldSkipMiddleware)
                                ? ZVal.newArray()
                                : this.gatherRouteMiddleware(env, route));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        new Pipeline(env, this.container),
                                        "send",
                                        Router.class,
                                        request),
                                "through",
                                Router.class,
                                middleware),
                        "then",
                        Router.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Routing",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "request")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object request = assignParameter(args, 0, false);
                                Object route = null;
                                route = this.contextReferences.getCapturedValue("route");
                                return ZVal.assign(
                                        Router.this.prepareResponse(
                                                env,
                                                request,
                                                env.callMethod(route, "run", Router.class)));
                            }
                        }.use("route", route)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route", typeHint = "Illuminate\\Routing\\Route")
    public Object gatherRouteMiddleware(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Router.php");
        Object route = assignParameter(args, 0, false);
        Object middleware = null;
        middleware =
                env.callMethod(
                        env.callMethod(
                                collect.f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        route, "gatherMiddleware", Router.class))
                                        .value(),
                                "map",
                                Router.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "name")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object name = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                rToArrayCast(
                                                        MiddlewareNameResolver.runtimeStaticObject
                                                                .resolve(
                                                                        env,
                                                                        name,
                                                                        Router.this.middleware,
                                                                        Router.this
                                                                                .middlewareGroups)));
                                    }
                                }),
                        "flatten",
                        Router.class);
        return ZVal.assign(this.sortMiddleware(env, middleware));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "middlewares",
        typeHint = "Illuminate\\Support\\Collection"
    )
    protected Object sortMiddleware(RuntimeEnv env, Object... args) {
        Object middlewares = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        new SortedMiddleware(env, this.middlewarePriority, middlewares),
                        "all",
                        Router.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request")
    @ConvertedParameter(index = 1, name = "response")
    public Object prepareResponse(RuntimeEnv env, Object... args) {
        ReferenceContainer request = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer response = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Router.class)
                        .method("toResponse")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences().add(0, request).add(1, response))
                        .call(request.getObject(), response.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    public Object substituteBindings(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        for (ZPair zpairResult532 :
                ZVal.getIterable(env.callMethod(route, "parameters", Router.class), env, false)) {
            key = ZVal.assign(zpairResult532.getKey());
            value = ZVal.assign(zpairResult532.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "binders", env),
                    env,
                    key)) {
                env.callMethod(
                        route,
                        "setParameter",
                        Router.class,
                        key,
                        this.performBinding(env, key, value, route));
            }
        }

        return ZVal.assign(route);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "route")
    public Object substituteImplicitBindings(RuntimeEnv env, Object... args) {
        Object route = assignParameter(args, 0, false);
        ImplicitRouteBinding.runtimeStaticObject.resolveForRoute(env, this.container, route);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "route")
    protected Object performBinding(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object route = assignParameter(args, 2, false);
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "binders", env).arrayGet(env, key),
                                value,
                                route)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object matched(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        env.callMethod(this.events, "listen", Router.class, RouteMatched.CONST_class, callback);
        return null;
    }

    @ConvertedMethod
    public Object getMiddleware(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.middleware);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "class")
    public Object aliasMiddleware(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "middleware", env).arrayAccess(env, name).set(_pClass);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasMiddlewareGroup(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(name, this.middlewareGroups).value());
    }

    @ConvertedMethod
    public Object getMiddlewareGroups(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.middlewareGroups);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "middleware", typeHint = "array")
    public Object middlewareGroup(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object middleware = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "middlewareGroups", env)
                .arrayAccess(env, name)
                .set(middleware);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "group")
    @ConvertedParameter(index = 1, name = "middleware")
    public Object prependMiddlewareToGroup(RuntimeEnv env, Object... args) {
        Object group = assignParameter(args, 0, false);
        Object middleware = assignParameter(args, 1, false);
        if (ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "middlewareGroups", env),
                                env,
                                group))
                && ZVal.toBool(
                        !function_in_array
                                .f
                                .env(env)
                                .call(
                                        middleware,
                                        new ReferenceClassProperty(this, "middlewareGroups", env)
                                                .arrayGet(env, group))
                                .getBool())) {
            function_array_unshift
                    .f
                    .env(env)
                    .call(
                            new ReferenceClassProperty(this, "middlewareGroups", env)
                                    .arrayGet(env, group),
                            middleware);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "group")
    @ConvertedParameter(index = 1, name = "middleware")
    public Object pushMiddlewareToGroup(RuntimeEnv env, Object... args) {
        Object group = assignParameter(args, 0, false);
        Object middleware = assignParameter(args, 1, false);
        if (!function_array_key_exists.f.env(env).call(group, this.middlewareGroups).getBool()) {
            new ReferenceClassProperty(this, "middlewareGroups", env)
                    .arrayAccess(env, group)
                    .set(ZVal.newArray());
        }

        if (!function_in_array
                .f
                .env(env)
                .call(
                        middleware,
                        new ReferenceClassProperty(this, "middlewareGroups", env)
                                .arrayGet(env, group))
                .getBool()) {
            new ReferenceClassProperty(this, "middlewareGroups", env)
                    .arrayAppend(env, group)
                    .set(middleware);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "binder")
    public Object bind(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object binder = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "binders", env)
                .arrayAccess(env, function_str_replace.f.env(env).call("-", "_", key).value())
                .set(RouteBinding.runtimeStaticObject.forCallback(env, this.container, binder));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "class")
    @ConvertedParameter(
        index = 2,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object model(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        Object callback = assignParameter(args, 2, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        this.bind(
                env,
                key,
                RouteBinding.runtimeStaticObject.forModel(env, this.container, _pClass, callback));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getBindingCallback(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "binders", env),
                env,
                key = function_str_replace.f.env(env).call("-", "_", key).value())) {
            return ZVal.assign(new ReferenceClassProperty(this, "binders", env).arrayGet(env, key));
        }

        return null;
    }

    @ConvertedMethod
    public Object getPatterns(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.patterns);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "pattern")
    public Object pattern(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object pattern = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "patterns", env).arrayAccess(env, key).set(pattern);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    public Object patterns(RuntimeEnv env, Object... args) {
        Object patterns = assignParameter(args, 0, false);
        Object pattern = null;
        Object key = null;
        for (ZPair zpairResult533 : ZVal.getIterable(patterns, env, false)) {
            key = ZVal.assign(zpairResult533.getKey());
            pattern = ZVal.assign(zpairResult533.getValue());
            this.pattern(env, key, pattern);
        }

        return null;
    }

    @ConvertedMethod
    public Object hasGroupStack(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.groupStack));
    }

    @ConvertedMethod
    public Object getGroupStack(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.groupStack);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object input(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(this.current(env), "parameter", Router.class, key, _pDefault));
    }

    @ConvertedMethod
    public Object getCurrentRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.currentRequest);
    }

    @ConvertedMethod
    public Object getCurrentRoute(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.current(env));
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.current);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object names = null;
        Object value = null;
        names =
                ZVal.assign(
                        function_is_array.f.env(env).call(name).getBool()
                                ? name
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        for (ZPair zpairResult534 : ZVal.getIterable(names, env, true)) {
            value = ZVal.assign(zpairResult534.getValue());
            if (!ZVal.isTrue(env.callMethod(this.routes, "hasNamedRoute", Router.class, value))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object currentRouteName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.current(env))
                        ? env.callMethod(this.current(env), "getName", Router.class)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    public Object is(RuntimeEnv env, Object... args) {
        Object patterns = assignParameterVarArgs(args, 0);
        return ZVal.assign(
                this.currentRouteNamed(
                        env, PackedVaradicArgs.unpack(new PackedVaradicArgs(patterns))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    public Object currentRouteNamed(RuntimeEnv env, Object... args) {
        Object patterns = assignParameterVarArgs(args, 0);
        return ZVal.assign(
                ZVal.toBool(this.current(env))
                        && ZVal.toBool(
                                env.callMethod(
                                        this.current(env),
                                        "named",
                                        Router.class,
                                        PackedVaradicArgs.unpack(
                                                new PackedVaradicArgs(patterns)))));
    }

    @ConvertedMethod
    public Object currentRouteAction(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(this.current(env))) {
            return ZVal.assign(
                    ZVal.isDefined(
                                    ternaryExpressionTemp =
                                            handleReturnReference(
                                                            env.callMethod(
                                                                    this.current(env),
                                                                    "getAction",
                                                                    Router.class))
                                                    .arrayGet(env, "controller"))
                            ? ternaryExpressionTemp
                            : ZVal.getNull());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    public Object uses(RuntimeEnv env, Object... args) {
        Object patterns = assignParameterVarArgs(args, 0);
        Object pattern = null;
        for (ZPair zpairResult535 : ZVal.getIterable(patterns, env, true)) {
            pattern = ZVal.assign(zpairResult535.getValue());
            if (ZVal.isTrue(
                    Str.runtimeStaticObject.is(env, pattern, this.currentRouteAction(env)))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    public Object currentRouteUses(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.equalityCheck(this.currentRouteAction(env), action));
    }

    @ConvertedMethod
    public Object auth(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.get(env, "login", "Auth\\LoginController@showLoginForm"),
                "name",
                Router.class,
                "login");
        this.post(env, "login", "Auth\\LoginController@login");
        env.callMethod(
                this.post(env, "logout", "Auth\\LoginController@logout"),
                "name",
                Router.class,
                "logout");
        env.callMethod(
                this.get(env, "register", "Auth\\RegisterController@showRegistrationForm"),
                "name",
                Router.class,
                "register");
        this.post(env, "register", "Auth\\RegisterController@register");
        env.callMethod(
                this.get(
                        env,
                        "password/reset",
                        "Auth\\ForgotPasswordController@showLinkRequestForm"),
                "name",
                Router.class,
                "password.request");
        env.callMethod(
                this.post(
                        env, "password/email", "Auth\\ForgotPasswordController@sendResetLinkEmail"),
                "name",
                Router.class,
                "password.email");
        env.callMethod(
                this.get(
                        env,
                        "password/reset/{token}",
                        "Auth\\ResetPasswordController@showResetForm"),
                "name",
                Router.class,
                "password.reset");
        this.post(env, "password/reset", "Auth\\ResetPasswordController@reset");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "singular",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object singularResourceParameters(RuntimeEnv env, Object... args) {
        Object singular = assignParameter(args, 0, true);
        if (null == singular) {
            singular = true;
        }
        ResourceRegistrar.runtimeStaticObject.singularParameters(env, singular);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object resourceParameters(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        ResourceRegistrar.runtimeStaticObject.setParameters(env, parameters);
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
    public Object resourceVerbs(RuntimeEnv env, Object... args) {
        Object verbs = assignParameter(args, 0, true);
        if (null == verbs) {
            verbs = ZVal.newArray();
        }
        return ZVal.assign(ResourceRegistrar.runtimeStaticObject.verbs(env, verbs));
    }

    @ConvertedMethod
    public Object getRoutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.routes);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "routes",
        typeHint = "Illuminate\\Routing\\RouteCollection"
    )
    public Object setRoutes(RuntimeEnv env, Object... args) {
        Object routes = assignParameter(args, 0, false);
        Object route = null;
        for (ZPair zpairResult536 : ZVal.getIterable(routes, env, true)) {
            route = ZVal.assign(zpairResult536.getValue());
            env.callMethod(
                    env.callMethod(route, "setRouter", Router.class, this),
                    "setContainer",
                    Router.class,
                    this.container);
        }

        this.routes = routes;
        env.callMethod(this.container, "instance", Router.class, "routes", this.routes);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        if (ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Router.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "macroCall",
                            Router.class,
                            method.getObject(),
                            parameters.getObject()));
        }

        if (ZVal.equalityCheck(method.getObject(), "middleware")) {
            return ZVal.assign(
                    env.callMethod(
                            new RouteRegistrar(env, this),
                            "attribute",
                            Router.class,
                            method.getObject(),
                            function_is_array.f.env(env).call(parameters.arrayGet(env, 0)).getBool()
                                    ? parameters.arrayGet(env, 0)
                                    : parameters.getObject()));
        }

        return ZVal.assign(
                env.callMethod(
                        new RouteRegistrar(env, this),
                        "attribute",
                        Router.class,
                        method.getObject(),
                        parameters.arrayGet(env, 0)));
    }

    public static final Object CONST_class = "Illuminate\\Routing\\Router";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "request")
        @ConvertedParameter(index = 1, name = "response")
        public Object toResponse(RuntimeEnv env, Object... args) {
            Object request = assignParameter(args, 0, false);
            Object response = assignParameter(args, 1, false);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            response,
                            Responsable.class,
                            "Illuminate\\Contracts\\Support\\Responsable"))) {
                response = env.callMethod(response, "toResponse", Router.class, request);
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(response, (Class) null, "PsrResponseInterface", env))) {
                response =
                        env.callMethod(
                                env.createNew(ZVal.resolveClassAlias(env, "HttpFoundationFactory")),
                                "createResponse",
                                Router.class,
                                response);

            } else if (ZVal.toBool(
                            ZVal.checkInstanceType(
                                    response, Model.class, "Illuminate\\Database\\Eloquent\\Model"))
                    && ZVal.toBool(
                            toObjectR(response)
                                    .accessProp(this, env)
                                    .name("wasRecentlyCreated")
                                    .value())) {
                response = new JsonResponse(env, response, 201);

            } else if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            response,
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Symfony
                                                    .namespaces
                                                    .Component
                                                    .namespaces
                                                    .HttpFoundation
                                                    .classes
                                                    .Response
                                                    .class,
                                            "Symfony\\Component\\HttpFoundation\\Response")))
                    && ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.toBool(
                                                                            ZVal.toBool(
                                                                                            ZVal
                                                                                                    .checkInstanceType(
                                                                                                            response,
                                                                                                            Arrayable
                                                                                                                    .class,
                                                                                                            "Illuminate\\Contracts\\Support\\Arrayable"))
                                                                                    || ZVal.toBool(
                                                                                            ZVal
                                                                                                    .checkInstanceType(
                                                                                                            response,
                                                                                                            Jsonable
                                                                                                                    .class,
                                                                                                            "Illuminate\\Contracts\\Support\\Jsonable")))
                                                                    || ZVal.toBool(
                                                                            ZVal.checkInstanceType(
                                                                                    response,
                                                                                    ArrayObject
                                                                                            .class,
                                                                                    "ArrayObject")))
                                                    || ZVal.toBool(
                                                            ZVal.checkInstanceType(
                                                                    response,
                                                                    JsonSerializable.class,
                                                                    "JsonSerializable")))
                                    || ZVal.toBool(
                                            function_is_array.f.env(env).call(response).value()))) {
                response = new JsonResponse(env, response);

            } else if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            response,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Symfony
                                    .namespaces
                                    .Component
                                    .namespaces
                                    .HttpFoundation
                                    .classes
                                    .Response
                                    .class,
                            "Symfony\\Component\\HttpFoundation\\Response"))) {
                response =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Http
                                .classes
                                .Response(env, response);
            }

            if (ZVal.strictEqualityCheck(
                    env.callMethod(response, "getStatusCode", Router.class),
                    "===",
                    com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Illuminate
                            .namespaces
                            .Http
                            .classes
                            .Response
                            .CONST_HTTP_NOT_MODIFIED)) {
                env.callMethod(response, "setNotModified", Router.class);
            }

            return ZVal.assign(env.callMethod(response, "prepare", Router.class, request));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Routing
                                    .classes
                                    .Router
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            Router.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2357 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2357.getValue());
                env.callMethod(method, "setAccessible", Router.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Router.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Router.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
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
                                            .Router
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Router.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
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

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Routing
                                                    .classes
                                                    .Router
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
                                                env.getRequestStaticPropertiesReference(
                                                                com.project
                                                                        .convertedCode
                                                                        .globalNamespace
                                                                        .namespaces
                                                                        .Illuminate
                                                                        .namespaces
                                                                        .Routing
                                                                        .classes
                                                                        .Router
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.getRequestStaticPropertiesReference(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Routing
                                                            .classes
                                                            .Router
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object verbs =
                ZVal.arrayFromList("GET", "HEAD", "POST", "PUT", "PATCH", "DELETE", "OPTIONS");

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\Router")
                    .setLookup(
                            Router.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "binders",
                            "container",
                            "current",
                            "currentRequest",
                            "events",
                            "groupStack",
                            "middleware",
                            "middlewareGroups",
                            "middlewarePriority",
                            "patterns",
                            "routes")
                    .setStaticPropertyNames("macros", "verbs")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/Router.php")
                    .addInterface("Illuminate\\Contracts\\Routing\\Registrar")
                    .addInterface("Illuminate\\Contracts\\Routing\\BindingRegistrar")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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

    private static class Scope28 implements UpdateRuntimeScopeInterface {

        Object routes;
        Object router;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("routes", this.routes);
            stack.setVariable("router", this.router);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.routes = stack.getVariable("routes");
            this.router = stack.getVariable("router");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
