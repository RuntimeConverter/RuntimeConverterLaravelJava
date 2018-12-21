package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeInterfaces.Serializable;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_unserialize;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.serialization.function_serialize;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Route.php

*/

public class Route extends RuntimeClassBase implements Serializable {

    public Object path = "/";

    public Object host = "";

    public Object schemes = ZVal.newArray();

    public Object methods = ZVal.newArray();

    public Object defaults = ZVal.newArray();

    public Object requirements = ZVal.newArray();

    public Object options = ZVal.newArray();

    public Object condition = "";

    public Object compiled = null;

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
    @ConvertedParameter(index = 0, name = "path", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "defaults",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "requirements",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(index = 4, name = "host")
    @ConvertedParameter(index = 5, name = "schemes", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(index = 6, name = "methods", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(index = 7, name = "condition")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object defaults = assignParameter(args, 1, true);
        if (null == defaults) {
            defaults = ZVal.newArray();
        }
        Object requirements = assignParameter(args, 2, true);
        if (null == requirements) {
            requirements = ZVal.newArray();
        }
        Object options = assignParameter(args, 3, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object host = assignParameter(args, 4, true);
        if (null == host) {
            host = "";
        }
        Object schemes = assignParameter(args, 5, true);
        if (null == schemes) {
            schemes = ZVal.newArray();
        }
        Object methods = assignParameter(args, 6, true);
        if (null == methods) {
            methods = ZVal.newArray();
        }
        Object condition = assignParameter(args, 7, true);
        if (null == condition) {
            condition = "";
        }
        this.setPath(env, path);
        this.addDefaults(env, defaults);
        this.addRequirements(env, requirements);
        this.setOptions(env, options);
        this.setHost(env, host);
        this.setSchemes(env, schemes);
        this.setMethods(env, methods);
        this.setCondition(env, condition);
        return null;
    }

    @ConvertedMethod
    public Object serialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_serialize
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair("path", this.path),
                                        new ZPair("host", this.host),
                                        new ZPair("defaults", this.defaults),
                                        new ZPair("requirements", this.requirements),
                                        new ZPair("options", this.options),
                                        new ZPair("schemes", this.schemes),
                                        new ZPair("methods", this.methods),
                                        new ZPair("condition", this.condition),
                                        new ZPair("compiled", this.compiled)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "serialized")
    public Object unserialize(RuntimeEnv env, Object... args) {
        Object serialized = assignParameter(args, 0, false);
        ReferenceContainer data = new BasicReferenceContainer(null);
        data.setObject(function_unserialize.f.env(env).call(serialized).value());
        this.path = data.arrayGet(env, "path");
        this.host = data.arrayGet(env, "host");
        this.defaults = data.arrayGet(env, "defaults");
        this.requirements = data.arrayGet(env, "requirements");
        this.options = data.arrayGet(env, "options");
        this.schemes = data.arrayGet(env, "schemes");
        this.methods = data.arrayGet(env, "methods");
        if (arrayActionR(ArrayAction.ISSET, data, env, "condition")) {
            this.condition = data.arrayGet(env, "condition");
        }

        if (arrayActionR(ArrayAction.ISSET, data, env, "compiled")) {
            this.compiled = data.arrayGet(env, "compiled");
        }

        return null;
    }

    @ConvertedMethod
    public Object getPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.path);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object setPath(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/routing")
                        .setFile("/vendor/symfony/routing/Route.php");
        Object pattern = assignParameter(args, 0, false);
        if (ZVal.strictNotEqualityCheck(
                false, "!==", NamespaceGlobal.strpbrk.env(env).call(pattern, "?<").value())) {
            pattern =
                    NamespaceGlobal.preg_replace_callback
                            .env(env)
                            .call(
                                    "#\\{(\\w++)(<.*?>)?(\\?[^\\}]*+)?\\}#",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Routing",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "m")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object _closureThisVar = this.getClosureThisVar();
                                            ReferenceContainer m =
                                                    new BasicReferenceContainer(
                                                            assignParameter(args, 0, false));
                                            if (arrayActionR(ArrayAction.ISSET, m, env, 3, 0)) {
                                                Route.this.setDefault(
                                                        env,
                                                        m.arrayGet(env, 1),
                                                        ZVal.strictNotEqualityCheck(
                                                                        "?",
                                                                        "!==",
                                                                        m.arrayGet(env, 3))
                                                                ? function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(m.arrayGet(env, 3), 1)
                                                                        .value()
                                                                : ZVal.getNull());
                                            }

                                            if (arrayActionR(ArrayAction.ISSET, m, env, 2, 0)) {
                                                Route.this.setRequirement(
                                                        env,
                                                        m.arrayGet(env, 1),
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(m.arrayGet(env, 2), 1, -1)
                                                                .value());
                                            }

                                            return ZVal.assign(
                                                    "{" + toStringR(m.arrayGet(env, 1), env) + "}");
                                        }
                                    },
                                    pattern)
                            .value();
        }

        this.path =
                "/"
                        + toStringR(
                                function_ltrim
                                        .f
                                        .env(env)
                                        .call(function_trim.f.env(env).call(pattern).value(), "/")
                                        .value(),
                                env);
        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getHost(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.host);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern")
    public Object setHost(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        this.host = toStringR(pattern, env);
        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getSchemes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.schemes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schemes")
    public Object setSchemes(RuntimeEnv env, Object... args) {
        Object schemes = assignParameter(args, 0, false);
        this.schemes =
                function_array_map.f.env(env).call("strtolower", rToArrayCast(schemes)).value();
        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "scheme")
    public Object hasScheme(RuntimeEnv env, Object... args) {
        Object scheme = assignParameter(args, 0, false);
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.strtolower.env(env).call(scheme).value(),
                                this.schemes,
                                true)
                        .value());
    }

    @ConvertedMethod
    public Object getMethods(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methods);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods")
    public Object setMethods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        this.methods =
                function_array_map.f.env(env).call("strtoupper", rToArrayCast(methods)).value();
        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.options);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        this.options =
                ZVal.newArray(
                        new ZPair("compiler_class", "Symfony\\Component\\Routing\\RouteCompiler"));
        return ZVal.assign(this.addOptions(env, options));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public Object addOptions(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        Object name = null;
        Object option = null;
        for (ZPair zpairResult2072 : ZVal.getIterable(options, env, false)) {
            name = ZVal.assign(zpairResult2072.getKey());
            option = ZVal.assign(zpairResult2072.getValue());
            new ReferenceClassProperty(this, "options", env).arrayAccess(env, name).set(option);
        }

        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    public Object setOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "options", env).arrayAccess(env, name).set(value);
        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "options", env),
                                env,
                                name)
                        ? new ReferenceClassProperty(this, "options", env).arrayGet(env, name)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(name, this.options).value());
    }

    @ConvertedMethod
    public Object getDefaults(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.defaults);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults", typeHint = "array")
    public Object setDefaults(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        this.defaults = ZVal.newArray();
        return ZVal.assign(this.addDefaults(env, defaults));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults", typeHint = "array")
    public Object addDefaults(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        Object _pDefault = null;
        Object name = null;
        for (ZPair zpairResult2073 : ZVal.getIterable(defaults, env, false)) {
            name = ZVal.assign(zpairResult2073.getKey());
            _pDefault = ZVal.assign(zpairResult2073.getValue());
            new ReferenceClassProperty(this, "defaults", env).arrayAccess(env, name).set(_pDefault);
        }

        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getDefault(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "defaults", env),
                                env,
                                name)
                        ? new ReferenceClassProperty(this, "defaults", env).arrayGet(env, name)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasDefault(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(name, this.defaults).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "default")
    public Object setDefault(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "defaults", env).arrayAccess(env, name).set(_pDefault);
        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getRequirements(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.requirements);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requirements", typeHint = "array")
    public Object setRequirements(RuntimeEnv env, Object... args) {
        Object requirements = assignParameter(args, 0, false);
        this.requirements = ZVal.newArray();
        return ZVal.assign(this.addRequirements(env, requirements));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requirements", typeHint = "array")
    public Object addRequirements(RuntimeEnv env, Object... args) {
        Object requirements = assignParameter(args, 0, false);
        Object regex = null;
        Object key = null;
        for (ZPair zpairResult2074 : ZVal.getIterable(requirements, env, false)) {
            key = ZVal.assign(zpairResult2074.getKey());
            regex = ZVal.assign(zpairResult2074.getValue());
            new ReferenceClassProperty(this, "requirements", env)
                    .arrayAccess(env, key)
                    .set(this.sanitizeRequirement(env, key, regex));
        }

        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getRequirement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "requirements", env),
                                env,
                                key)
                        ? new ReferenceClassProperty(this, "requirements", env).arrayGet(env, key)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasRequirement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists.f.env(env).call(key, this.requirements).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "regex")
    public Object setRequirement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object regex = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "requirements", env)
                .arrayAccess(env, key)
                .set(this.sanitizeRequirement(env, key, regex));
        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getCondition(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.condition);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition")
    public Object setCondition(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        this.condition = toStringR(condition, env);
        this.compiled = ZVal.getNull();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object compile(RuntimeEnv env, Object... args) {
        Object _pClass = null;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.compiled)) {
            return ZVal.assign(this.compiled);
        }

        _pClass = this.getOption(env, "compiler_class");
        return ZVal.assign(
                this.compiled =
                        StaticMethodUtils.getStaticBaseClass(_pClass, env)
                                .callUnknownStaticMethod(
                                        env,
                                        "compile",
                                        new RuntimeArgsWithReferences()
                                                .add(0, new ReadOnlyReferenceContainer(this)),
                                        this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "regex")
    private Object sanitizeRequirement(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        ReferenceContainer regex = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (!function_is_string.f.env(env).call(regex.getObject()).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Routing requirement for \"%s\" must be a string.", key)
                                    .value()));
        }

        if (ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", regex.getObject()))
                && ZVal.toBool(ZVal.strictEqualityCheck("^", "===", regex.arrayGet(env, 0)))) {
            regex.setObject(
                    ZVal.assign(
                            toStringR(
                                    function_substr.f.env(env).call(regex.getObject(), 1).value(),
                                    env)));
        }

        if (ZVal.strictEqualityCheck(
                "$", "===", function_substr.f.env(env).call(regex.getObject(), -1).value())) {
            regex.setObject(function_substr.f.env(env).call(regex.getObject(), 0, -1).value());
        }

        if (ZVal.strictEqualityCheck("", "===", regex.getObject())) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("Routing requirement for \"%s\" cannot be empty.", key)
                                    .value()));
        }

        return ZVal.assign(regex.getObject());
    }

    public static final Object CONST_class = "Symfony\\Component\\Routing\\Route";

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
                    .setName("Symfony\\Component\\Routing\\Route")
                    .setLookup(
                            Route.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "compiled",
                            "condition",
                            "defaults",
                            "host",
                            "methods",
                            "options",
                            "path",
                            "requirements",
                            "schemes")
                    .setFilename("vendor/symfony/routing/Route.php")
                    .addInterface("Serializable")
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
