package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteCompiler;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.Container;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.functions.last;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteParameterBinder;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteSignatureParameters;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Http.namespaces.Exceptions.classes.HttpResponseException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Matching.classes.SchemeValidator;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Matching.classes.UriValidator;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Matching.classes.HostValidator;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RouteAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.namespaces.Matching.classes.MethodValidator;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;
import static com.runtimeconverter.runtime.ZVal.assignParameterVarArgs;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Routing/Route.php

*/

public class Route extends RuntimeClassBase {

    public Object uri = null;

    public Object methods = null;

    public Object action = null;

    public Object isFallback = false;

    public Object controller = null;

    public Object defaults = ZVal.newArray();

    public Object wheres = ZVal.newArray();

    public Object parameters = null;

    public Object parameterNames = null;

    public Object computedMiddleware = null;

    public Object compiled = null;

    public Object router = null;

    public Object container = null;

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
    @ConvertedParameter(index = 0, name = "methods")
    @ConvertedParameter(index = 1, name = "uri")
    @ConvertedParameter(index = 2, name = "action")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        Object uri = assignParameter(args, 1, false);
        Object action = assignParameter(args, 2, false);
        this.uri = uri;
        this.methods = rToArrayCast(methods);
        this.action = this.parseAction(env, action);
        if (ZVal.toBool(function_in_array.f.env(env).call("GET", this.methods).value())
                && ZVal.toBool(
                        !function_in_array.f.env(env).call("HEAD", this.methods).getBool())) {
            new ReferenceClassProperty(this, "methods", env).arrayAppend(env).set("HEAD");
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "action", env),
                env,
                "prefix")) {
            this.prefix(
                    env, new ReferenceClassProperty(this, "action", env).arrayGet(env, "prefix"));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    protected Object parseAction(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        return ZVal.assign(RouteAction.runtimeStaticObject.parse(env, this.uri, action));
    }

    @ConvertedMethod
    public Object run(RuntimeEnv env, Object... args) {
        Object e = null;
        Object ternaryExpressionTemp = null;
        this.container =
                ZVal.isTrue(ternaryExpressionTemp = this.container)
                        ? ternaryExpressionTemp
                        : new Container(env);
        try {
            if (ZVal.isTrue(this.isControllerAction(env))) {
                return ZVal.assign(this.runController(env));
            }

            return ZVal.assign(this.runCallable(env));
        } catch (ConvertedException convertedException61) {
            if (convertedException61.instanceOf(
                    HttpResponseException.class,
                    "Illuminate\\Http\\Exceptions\\HttpResponseException")) {
                e = convertedException61.getObject();
                return ZVal.assign(env.callMethod(e, "getResponse", Route.class));
            } else {
                throw convertedException61;
            }
        }
    }

    @ConvertedMethod
    protected Object isControllerAction(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_is_string
                        .f
                        .env(env)
                        .call(new ReferenceClassProperty(this, "action", env).arrayGet(env, "uses"))
                        .value());
    }

    @ConvertedMethod
    protected Object runCallable(RuntimeEnv env, Object... args) {
        Object callable = null;
        callable =
                ZVal.assign(new ReferenceClassProperty(this, "action", env).arrayGet(env, "uses"));
        return ZVal.assign(
                env.callFunctionDynamic(
                                callable,
                                new RuntimeArgsWithReferences(),
                                PackedVaradicArgs.unpack(
                                        new PackedVaradicArgs(
                                                function_array_values
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                this.resolveMethodDependencies(
                                                                        env,
                                                                        this.parametersWithoutNulls(
                                                                                env),
                                                                        new ReflectionFunction(
                                                                                env,
                                                                                new ReferenceClassProperty(
                                                                                                this,
                                                                                                "action",
                                                                                                env)
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                "uses"))))
                                                        .value())))
                        .value());
    }

    @ConvertedMethod
    protected Object runController(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.controllerDispatcher(env),
                        "dispatch",
                        Route.class,
                        this,
                        this.getController(env),
                        this.getControllerMethod(env)));
    }

    @ConvertedMethod
    public Object getController(RuntimeEnv env, Object... args) {
        Object _pClass = null;
        if (!ZVal.isTrue(this.controller)) {
            _pClass =
                    ZVal.assign(
                            handleReturnReference(this.parseControllerCallback(env))
                                    .arrayGet(env, 0));
            this.controller =
                    env.callMethod(
                            this.container,
                            "make",
                            Route.class,
                            function_ltrim.f.env(env).call(_pClass, "\\").value());
        }

        return ZVal.assign(this.controller);
    }

    @ConvertedMethod
    protected Object getControllerMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                handleReturnReference(this.parseControllerCallback(env)).arrayGet(env, 1));
    }

    @ConvertedMethod
    protected Object parseControllerCallback(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                Str.runtimeStaticObject.parseCallback(
                        env,
                        new ReferenceClassProperty(this, "action", env).arrayGet(env, "uses")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    @ConvertedParameter(
        index = 1,
        name = "includingMethod",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object request = assignParameter(args, 0, false);
        Object includingMethod = assignParameter(args, 1, true);
        if (null == includingMethod) {
            includingMethod = true;
        }
        Object validator = null;
        this.compileRoute(env);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult519 :
                ZVal.getIterable(env.callMethod(this, "getValidators", Route.class), env, true)) {
            validator = ZVal.assign(zpairResult519.getValue());
            if (ZVal.toBool(!ZVal.isTrue(includingMethod))
                    && ZVal.toBool(
                            ZVal.checkInstanceType(
                                    validator,
                                    MethodValidator.class,
                                    "Illuminate\\Routing\\Matching\\MethodValidator"))) {
                continue;
            }

            if (!ZVal.isTrue(env.callMethod(validator, "matches", Route.class, this, request))) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    protected Object compileRoute(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.compiled)) {
            this.compiled = env.callMethod(new RouteCompiler(env, this), "compile", Route.class);
        }

        return ZVal.assign(this.compiled);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "request", typeHint = "Illuminate\\Http\\Request")
    public Object bind(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        this.compileRoute(env);
        this.parameters =
                env.callMethod(
                        new RouteParameterBinder(env, this), "parameters", Route.class, request);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object hasParameters(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.isset(this.parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.hasParameters(env))) {
            return ZVal.assign(
                    function_array_key_exists.f.env(env).call(name, this.parameters(env)).value());
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object parameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.parameters(env), name, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object setParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.parameters(env);
        new ReferenceClassProperty(this, "parameters", env).arrayAccess(env, name).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object forgetParameter(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.parameters(env);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "parameters", env), env, name);
        return null;
    }

    @ConvertedMethod
    public Object parameters(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.parameters)) {
            return ZVal.assign(this.parameters);
        }

        throw ZVal.getException(env, new LogicException(env, "Route is not bound."));
    }

    @ConvertedMethod
    public Object parametersWithoutNulls(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Route.php");
        return ZVal.assign(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                this.parameters(env),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Routing",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "p")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object p = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                !function_is_null.f.env(env).call(p).getBool());
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    public Object parameterNames(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.parameterNames)) {
            return ZVal.assign(this.parameterNames);
        }

        return ZVal.assign(this.parameterNames = this.compileParameterNames(env));
    }

    @ConvertedMethod
    protected Object compileParameterNames(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Routing/Route.php");
        ReferenceContainer matches = new BasicReferenceContainer(null);
        function_preg_match_all
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call(
                        "/\\{(.*?)\\}/",
                        toStringR(this.getDomain(env), env) + toStringR(this.uri, env),
                        matches.getObject());
        return ZVal.assign(
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
                                    @ConvertedParameter(index = 0, name = "m")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object m = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_trim.f.env(env).call(m, "?").value());
                                    }
                                },
                                matches.arrayGet(env, 1))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "subClass",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object signatureParameters(RuntimeEnv env, Object... args) {
        Object subClass = assignParameter(args, 0, true);
        if (null == subClass) {
            subClass = ZVal.getNull();
        }
        return ZVal.assign(
                RouteSignatureParameters.runtimeStaticObject.fromAction(
                        env, this.action, subClass));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object defaults(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "defaults", env).arrayAccess(env, key).set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "expression",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object where(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object expression = assignParameter(args, 1, true);
        if (null == expression) {
            expression = ZVal.getNull();
        }
        for (ZPair zpairResult520 :
                ZVal.getIterable(this.parseWhere(env, name, expression), env, false)) {
            name = ZVal.assign(zpairResult520.getKey());
            expression = ZVal.assign(zpairResult520.getValue());
            new ReferenceClassProperty(this, "wheres", env).arrayAccess(env, name).set(expression);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "expression")
    protected Object parseWhere(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object expression = assignParameter(args, 1, false);
        return ZVal.assign(
                function_is_array.f.env(env).call(name).getBool()
                        ? name
                        : ZVal.newArray(new ZPair(name, expression)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "wheres", typeHint = "array")
    protected Object whereArray(RuntimeEnv env, Object... args) {
        Object wheres = assignParameter(args, 0, false);
        Object expression = null;
        Object name = null;
        for (ZPair zpairResult521 : ZVal.getIterable(wheres, env, false)) {
            name = ZVal.assign(zpairResult521.getKey());
            expression = ZVal.assign(zpairResult521.getValue());
            this.where(env, name, expression);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object fallback(RuntimeEnv env, Object... args) {
        this.isFallback = true;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object methods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methods);
    }

    @ConvertedMethod
    public Object httpOnly(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_in_array.f.env(env).call("http", this.action, true).value());
    }

    @ConvertedMethod
    public Object httpsOnly(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.secure(env));
    }

    @ConvertedMethod
    public Object secure(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_in_array.f.env(env).call("https", this.action, true).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "domain",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object domain(RuntimeEnv env, Object... args) {
        Object domain = assignParameter(args, 0, true);
        if (null == domain) {
            domain = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(domain).getBool()) {
            return ZVal.assign(this.getDomain(env));
        }

        new ReferenceClassProperty(this, "action", env).arrayAccess(env, "domain").set(domain);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "action", env),
                                env,
                                "domain")
                        ? function_str_replace
                                .f
                                .env(env)
                                .call(
                                        ZVal.arrayFromList("http://", "https://"),
                                        "",
                                        new ReferenceClassProperty(this, "action", env)
                                                .arrayGet(env, "domain"))
                                .value()
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getPrefix(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "action", env)
                                                .arrayGet(env, "prefix"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public Object prefix(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        Object uri = null;
        uri =
                toStringR(function_rtrim.f.env(env).call(prefix, "/").value(), env)
                        + "/"
                        + toStringR(function_ltrim.f.env(env).call(this.uri, "/").value(), env);
        this.uri = function_trim.f.env(env).call(uri, "/").value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object uri(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.uri);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uri")
    public Object setUri(RuntimeEnv env, Object... args) {
        Object uri = assignParameter(args, 0, false);
        this.uri = uri;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "action", env)
                                                .arrayGet(env, "as"))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object name(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "action", env)
                .arrayAccess(env, "as")
                .set(
                        arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "action", env),
                                        env,
                                        "as")
                                ? toStringR(
                                                new ReferenceClassProperty(this, "action", env)
                                                        .arrayGet(env, "as"),
                                                env)
                                        + toStringR(name, env)
                                : name);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "patterns")
    public Object named(RuntimeEnv env, Object... args) {
        Object patterns = assignParameterVarArgs(args, 0);
        Object pattern = null;
        Object routeName = null;
        if (function_is_null.f.env(env).call(routeName = this.getName(env)).getBool()) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult522 : ZVal.getIterable(patterns, env, true)) {
            pattern = ZVal.assign(zpairResult522.getValue());
            if (ZVal.isTrue(Str.runtimeStaticObject.is(env, pattern, routeName))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    public Object uses(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        action =
                ZVal.assign(
                        function_is_string.f.env(env).call(action).getBool()
                                ? this.addGroupNamespaceToStringUses(env, action)
                                : action);
        return ZVal.assign(
                this.setAction(
                        env,
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        this.action,
                                        this.parseAction(
                                                env,
                                                ZVal.newArray(
                                                        new ZPair("uses", action),
                                                        new ZPair("controller", action))))
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action")
    protected Object addGroupNamespaceToStringUses(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        ReferenceContainer groupStack = new BasicReferenceContainer(null);
        groupStack.setObject(
                last.f
                        .env(env)
                        .call(env.callMethod(this.router, "getGroupStack", Route.class))
                        .value());
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, groupStack, env, "namespace"))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(action, "\\").value(), "!==", 0))) {
            return ZVal.assign(
                    toStringR(groupStack.arrayGet(env, "namespace"), env)
                            + "\\"
                            + toStringR(action, env));
        }

        return ZVal.assign(action);
    }

    @ConvertedMethod
    public Object getActionName(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "action", env)
                                                .arrayGet(env, "controller"))
                        ? ternaryExpressionTemp
                        : "Closure");
    }

    @ConvertedMethod
    public Object getActionMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                Arr.runtimeStaticObject.last(
                        env,
                        function_explode.f.env(env).call("@", this.getActionName(env)).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getAction(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.action, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "action", typeHint = "array")
    public Object setAction(RuntimeEnv env, Object... args) {
        Object action = assignParameter(args, 0, false);
        this.action = action;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object gatherMiddleware(RuntimeEnv env, Object... args) {
        if (!function_is_null.f.env(env).call(this.computedMiddleware).getBool()) {
            return ZVal.assign(this.computedMiddleware);
        }

        this.computedMiddleware = ZVal.newArray();
        return ZVal.assign(
                this.computedMiddleware =
                        function_array_unique
                                .f
                                .env(env)
                                .call(
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(
                                                        this.middleware(env),
                                                        this.controllerMiddleware(env))
                                                .value(),
                                        0)
                                .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "middleware",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object middleware(RuntimeEnv env, Object... args) {
        Object middleware = assignParameter(args, 0, true);
        if (null == middleware) {
            middleware = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        if (function_is_null.f.env(env).call(middleware).getBool()) {
            return ZVal.assign(
                    rToArrayCast(
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    new ReferenceClassProperty(this, "action", env)
                                                            .arrayGet(env, "middleware"))
                                    ? ternaryExpressionTemp
                                    : ZVal.newArray()));
        }

        if (function_is_string.f.env(env).call(middleware).getBool()) {
            middleware =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
        }

        new ReferenceClassProperty(this, "action", env)
                .arrayAccess(env, "middleware")
                .set(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        rToArrayCast(
                                                ZVal.isDefined(
                                                                ternaryExpressionTemp =
                                                                        new ReferenceClassProperty(
                                                                                        this,
                                                                                        "action",
                                                                                        env)
                                                                                .arrayGet(
                                                                                        env,
                                                                                        "middleware"))
                                                        ? ternaryExpressionTemp
                                                        : ZVal.newArray()),
                                        middleware)
                                .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object controllerMiddleware(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.isControllerAction(env))) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                env.callMethod(
                        this.controllerDispatcher(env),
                        "getMiddleware",
                        Route.class,
                        this.getController(env),
                        this.getControllerMethod(env)));
    }

    @ConvertedMethod
    public Object controllerDispatcher(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                env.callMethod(
                        this.container,
                        "bound",
                        Route.class,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Routing
                                .namespaces
                                .Contracts
                                .classes
                                .ControllerDispatcher
                                .CONST_class))) {
            return ZVal.assign(
                    env.callMethod(
                            this.container,
                            "make",
                            Route.class,
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Routing
                                    .namespaces
                                    .Contracts
                                    .classes
                                    .ControllerDispatcher
                                    .CONST_class));
        }

        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Routing
                        .classes
                        .ControllerDispatcher(env, this.container));
    }

    @ConvertedMethod
    public Object getCompiled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.compiled);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "router", typeHint = "Illuminate\\Routing\\Router")
    public Object setRouter(RuntimeEnv env, Object... args) {
        Object router = assignParameter(args, 0, false);
        this.router = router;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Container\\Container"
    )
    public Object setContainer(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        this.container = container;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object prepareForSerialization(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        new ReferenceClassProperty(this, "action", env).arrayGet(env, "uses"),
                        Closure.class,
                        "Closure"))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            "Unable to prepare route ["
                                    + toStringR(this.uri, env)
                                    + "] for serialization. Uses Closure."));
        }

        this.compileRoute(env);
        this.router = null;
        this.container = null;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.parameter(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Route.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
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
                                            method.getObject())
                                    .value()));
        }

        macro =
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
                                                .Route
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            Route.class,
                                            this,
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
                        .call(macro, parameters)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 1, name = "instance")
    @ConvertedParameter(index = 2, name = "method")
    protected Object resolveClassMethodDependencies(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        Object instance = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        if (!function_method_exists.f.env(env).call(instance, method).getBool()) {
            return ZVal.assign(parameters);
        }

        return ZVal.assign(
                this.resolveMethodDependencies(
                        env, parameters, new ReflectionMethod(env, instance, method)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 1, name = "reflector", typeHint = "ReflectionFunctionAbstract")
    public Object resolveMethodDependencies(RuntimeEnv env, Object... args) {
        ReferenceContainer parameters =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object reflector = assignParameter(args, 1, false);
        Object instance = null;
        ReferenceContainer instanceCount = new BasicReferenceContainer(null);
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object parameter = null;
        Object key = null;
        instanceCount.setObject(0);
        values.setObject(function_array_values.f.env(env).call(parameters.getObject()).value());
        for (ZPair zpairResult2356 :
                ZVal.getIterable(
                        env.callMethod(reflector, "getParameters", Route.class), env, false)) {
            key = ZVal.assign(zpairResult2356.getKey());
            parameter = ZVal.assign(zpairResult2356.getValue());
            instance = this.transformDependency(env, parameter, parameters.getObject());
            if (!function_is_null.f.env(env).call(instance).getBool()) {
                instanceCount.setObject(ZVal.increment(instanceCount.getObject()));
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, parameters),
                        "spliceIntoParameters",
                        Route.class,
                        parameters.getObject(),
                        key,
                        instance);

            } else if (ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.ISSET,
                                    values,
                                    env,
                                    ZVal.subtract(key, instanceCount.getObject())))
                    && ZVal.toBool(
                            env.callMethod(parameter, "isDefaultValueAvailable", Route.class))) {
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, parameters),
                        "spliceIntoParameters",
                        Route.class,
                        parameters.getObject(),
                        key,
                        env.callMethod(parameter, "getDefaultValue", Route.class));
            }
        }

        return ZVal.assign(parameters.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    @ConvertedParameter(index = 1, name = "parameters")
    protected Object transformDependency(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        Object _pClass = null;
        _pClass = env.callMethod(parameter, "getClass", Route.class);
        if (ZVal.toBool(_pClass)
                && ZVal.toBool(
                        !ZVal.isTrue(
                                this.alreadyInParameters(
                                        env,
                                        toObjectR(_pClass)
                                                .accessProp(this, env)
                                                .name("name")
                                                .value(),
                                        parameters)))) {
            return ZVal.assign(
                    ZVal.isTrue(env.callMethod(parameter, "isDefaultValueAvailable", Route.class))
                            ? env.callMethod(parameter, "getDefaultValue", Route.class)
                            : env.callMethod(
                                    this.container,
                                    "make",
                                    Route.class,
                                    toObjectR(_pClass).accessProp(this, env).name("name").value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "parameters", typeHint = "array")
    protected Object alreadyInParameters(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Routing")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Routing/RouteDependencyResolverTrait.php");
        Object _pClass = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                !function_is_null
                        .f
                        .env(env)
                        .call(
                                Arr.runtimeStaticObject.first(
                                        env,
                                        parameters,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Routing",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "value")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object value = assignParameter(args, 0, false);
                                                Object _pClass = null;
                                                _pClass =
                                                        this.contextReferences.getCapturedValue(
                                                                "class");
                                                return ZVal.assign(
                                                        ZVal.checkInstanceTypeMatch(
                                                                value, _pClass));
                                            }
                                        }.use("class", _pClass)))
                        .getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    @ConvertedParameter(index = 1, name = "offset")
    @ConvertedParameter(index = 2, name = "value")
    protected Object spliceIntoParameters(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer parameters =
                assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object offset = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        function_array_splice
                .f
                .env(env)
                .call(parameters.getObject(), offset, 0, ZVal.newArray(new ZPair(0, value)));
        return null;
    }

    public Object spliceIntoParameters(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    public static final Object CONST_class = "Illuminate\\Routing\\Route";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getValidators(RuntimeEnv env, Object... args) {
            if (ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Routing
                                            .classes
                                            .Route
                                            .RequestStaticProperties
                                            .class)
                            .validators)) {
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
                                                .Route
                                                .RequestStaticProperties
                                                .class)
                                .validators);
            }

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
                                                    .Route
                                                    .RequestStaticProperties
                                                    .class)
                                    .validators =
                            ZVal.newArray(
                                    new ZPair(0, new UriValidator(env)),
                                    new ZPair(1, new MethodValidator(env)),
                                    new ZPair(2, new SchemeValidator(env)),
                                    new ZPair(3, new HostValidator(env))));
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
                                    .Route
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
                            Route.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2355 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2355.getValue());
                env.callMethod(method, "setAccessible", Route.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Route.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Route.class, mixin))
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
                                            .Route
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Route.class)
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
                                                    .Route
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
                                                                        .Route
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
                                                            .Route
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

        public Object validators = null;

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Routing\\Route")
                    .setLookup(
                            Route.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "action",
                            "compiled",
                            "computedMiddleware",
                            "container",
                            "controller",
                            "defaults",
                            "isFallback",
                            "methods",
                            "parameterNames",
                            "parameters",
                            "router",
                            "uri",
                            "wheres")
                    .setStaticPropertyNames("macros", "validators")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Routing/Route.php")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
                    .addTrait("Illuminate\\Routing\\RouteDependencyResolverTrait")
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
