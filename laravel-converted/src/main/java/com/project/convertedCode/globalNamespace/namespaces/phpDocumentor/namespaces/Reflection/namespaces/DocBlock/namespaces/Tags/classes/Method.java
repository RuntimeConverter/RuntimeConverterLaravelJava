package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.Types.classes.Void_;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Method.php

*/

public final class Method extends BaseTag implements StaticMethod {

    public Object methodName = "";

    public Object arguments = ZVal.newArray();

    public Object isStatic = false;

    public Object returnType = null;

    public Method(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "method";
        if (this.getClass() == Method.class) {
            this.__construct(env, args);
        }
    }

    public Method(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodName")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "returnType",
        typeHint = "phpDocumentor\\Reflection\\Type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "static",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object methodName = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object returnType = assignParameter(args, 2, true);
        if (null == returnType) {
            returnType = ZVal.getNull();
        }
        Object _pStatic = assignParameter(args, 3, true);
        if (null == _pStatic) {
            _pStatic = false;
        }
        Object description = assignParameter(args, 4, true);
        if (null == description) {
            description = ZVal.getNull();
        }
        Assert.runtimeStaticObject.stringNotEmpty(env, methodName);
        Assert.runtimeStaticObject._pBoolean(env, _pStatic);
        if (ZVal.strictEqualityCheck(returnType, "===", ZVal.getNull())) {
            returnType = new Void_(env);
        }

        this.methodName = methodName;
        this.arguments = this.filterArguments(env, arguments);
        this.returnType = returnType;
        this.isStatic = _pStatic;
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methodName);
    }

    @ConvertedMethod
    public Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.arguments);
    }

    @ConvertedMethod
    public Object isStatic(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.isStatic);
    }

    @ConvertedMethod
    public Object getReturnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.returnType);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        ReferenceContainer argument = new BasicReferenceContainer(null);
        ReferenceContainer arguments = new BasicReferenceContainer(null);
        arguments.setObject(ZVal.newArray());
        for (ZPair zpairResult932 : ZVal.getIterable(this.arguments, env, true)) {
            argument.setObject(ZVal.assign(zpairResult932.getValue()));
            arguments
                    .arrayAppend(env)
                    .set(
                            toStringR(argument.arrayGet(env, "type"), env)
                                    + " $"
                                    + toStringR(argument.arrayGet(env, "name"), env));
        }

        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                toStringR(ZVal.isTrue(this.isStatic(env)) ? "static " : "", env)
                                        + toStringR(toStringR(this.returnType, env), env)
                                        + " "
                                        + toStringR(this.methodName, env)
                                        + "("
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", arguments.getObject())
                                                        .value(),
                                                env)
                                        + ")"
                                        + toStringR(
                                                toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("description")
                                                                .getBool()
                                                        ? " "
                                                                + toStringR(
                                                                        env.callMethod(
                                                                                toObjectR(this)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "description")
                                                                                        .value(),
                                                                                "render",
                                                                                Method.class),
                                                                        env)
                                                        : "",
                                                env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments")
    private Object filterArguments(RuntimeEnv env, Object... args) {
        Object arguments = assignParameter(args, 0, false);
        ReferenceContainer argument = new BasicReferenceContainer(null);
        Object keys = null;
        for (ZPair zpairResult933 : ZVal.getIterable(arguments, env, true)) {
            argument = zpairResult933;
            if (function_is_string.f.env(env).call(argument.getObject()).getBool()) {
                argument.setObject(ZVal.newArray(new ZPair("name", argument.getObject())));
            }

            if (!arrayActionR(ArrayAction.ISSET, argument, env, "type")) {
                argument.arrayAccess(env, "type").set(new Void_(env));
            }

            keys = function_array_keys.f.env(env).call(argument.getObject()).value();
            function_sort.f.env(env).call(keys);
            if (ZVal.strictNotEqualityCheck(keys, "!==", ZVal.arrayFromList("name", "type"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Arguments can only have the \"name\" and \"type\" fields, found: "
                                        + toStringR(
                                                NamespaceGlobal.var_export
                                                        .env(env)
                                                        .call(keys, true)
                                                        .value(),
                                                env)));
            }
        }

        return ZVal.assign(arguments);
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Method";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        @ConvertedParameter(
            index = 1,
            name = "typeResolver",
            typeHint = "phpDocumentor\\Reflection\\TypeResolver",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "descriptionFactory",
            typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "context",
            typeHint = "phpDocumentor\\Reflection\\Types\\Context",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, false);
            Object typeResolver = assignParameter(args, 1, true);
            if (null == typeResolver) {
                typeResolver = ZVal.getNull();
            }
            Object descriptionFactory = assignParameter(args, 2, true);
            if (null == descriptionFactory) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 3, true);
            if (null == context) {
                context = ZVal.getNull();
            }
            ReferenceContainer argument = new BasicReferenceContainer(null);
            Object _pStatic = null;
            Object argumentName = null;
            Object methodName = null;
            Object description = null;
            ReferenceContainer matches = new BasicReferenceContainer(null);
            Object argumentType = null;
            Object arguments = null;
            Object returnType = null;
            Object runtimeTempArrayResult131 = null;
            Assert.runtimeStaticObject.stringNotEmpty(env, body);
            Assert.runtimeStaticObject.callUnknownStaticMethod(
                    env,
                    "allNotNull",
                    new RuntimeArgsWithReferences(),
                    ZVal.newArray(new ZPair(0, typeResolver), new ZPair(1, descriptionFactory)));
            if (!function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/^\n                # Static keyword\n                # Declares a static method ONLY if type is also present\n                (?:\n                    (static)\n                    \\s+\n                )?\n                # Return type\n                (?:\n                    (   \n                        (?:[\\w\\|_\\\\]*\\$this[\\w\\|_\\\\]*)\n                        |\n                        (?:\n                            (?:[\\w\\|_\\\\]+)\n                            # array notation           \n                            (?:\\[\\])*\n                        )*\n                    )\n                    \\s+\n                )?\n                # Legacy method name (not captured)\n                (?:\n                    [\\w_]+\\(\\)\\s+\n                )?\n                # Method name\n                ([\\w\\|_\\\\]+)\n                # Arguments\n                (?:\n                    \\(([^\\)]*)\\)\n                )?\n                \\s*\n                # Description\n                (.*)\n            $/sux",
                            body,
                            matches.getObject())
                    .getBool()) {
                return ZVal.assign(ZVal.getNull());
            }

            ZVal.list(
                    runtimeTempArrayResult131 = matches.getObject(),
                    (_pStatic = listGet(runtimeTempArrayResult131, 1, env)),
                    (returnType = listGet(runtimeTempArrayResult131, 2, env)),
                    (methodName = listGet(runtimeTempArrayResult131, 3, env)),
                    (arguments = listGet(runtimeTempArrayResult131, 4, env)),
                    (description = listGet(runtimeTempArrayResult131, 5, env)));
            _pStatic = ZVal.strictEqualityCheck(_pStatic, "===", "static");
            if (ZVal.strictEqualityCheck(returnType, "===", "")) {
                returnType = "void";
            }

            returnType = env.callMethod(typeResolver, "resolve", Method.class, returnType, context);
            description =
                    env.callMethod(
                            descriptionFactory, "create", Method.class, description, context);
            if (ZVal.toBool(function_is_string.f.env(env).call(arguments).value())
                    && ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_strlen.f.env(env).call(arguments).value(), '>', 0))) {
                arguments = function_explode.f.env(env).call(",", arguments).value();
                for (ZPair zpairResult931 : ZVal.getIterable(arguments, env, true)) {
                    argument = zpairResult931;
                    argument.setObject(
                            function_explode
                                    .f
                                    .env(env)
                                    .call(
                                            " ",
                                            runtimeStaticObject.stripRestArg(
                                                    env,
                                                    function_trim
                                                            .f
                                                            .env(env)
                                                            .call(argument.getObject())
                                                            .value()),
                                            2)
                                    .value());
                    if (ZVal.strictEqualityCheck(argument.arrayGet(env, 0, 0), "===", "$")) {
                        argumentName =
                                function_substr
                                        .f
                                        .env(env)
                                        .call(argument.arrayGet(env, 0), 1)
                                        .value();
                        argumentType = new Void_(env);

                    } else {
                        argumentType =
                                env.callMethod(
                                        typeResolver,
                                        "resolve",
                                        Method.class,
                                        argument.arrayGet(env, 0),
                                        context);
                        argumentName = "";
                        if (arrayActionR(ArrayAction.ISSET, argument, env, 1)) {
                            argument.arrayAccess(env, 1)
                                    .set(
                                            runtimeStaticObject.stripRestArg(
                                                    env, argument.arrayGet(env, 1)));
                            argumentName =
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(argument.arrayGet(env, 1), 1)
                                            .value();
                        }
                    }

                    argument.setObject(
                            ZVal.newArray(
                                    new ZPair("name", argumentName),
                                    new ZPair("type", argumentType)));
                }

            } else {
                arguments = ZVal.newArray();
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, methodName, arguments, returnType, _pStatic, description));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "argument")
        private Object stripRestArg(RuntimeEnv env, Object... args) {
            Object argument = assignParameter(args, 0, false);
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(argument, "...").value(), "===", 0)) {
                argument =
                        function_trim
                                .f
                                .env(env)
                                .call(function_substr.f.env(env).call(argument, 3).value())
                                .value();
            }

            return ZVal.assign(argument);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\Method")
                    .setLookup(
                            Method.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments",
                            "description",
                            "isStatic",
                            "methodName",
                            "name",
                            "name",
                            "returnType")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/Method.php")
                    .addInterface(
                            "phpDocumentor\\Reflection\\DocBlock\\Tags\\Factory\\StaticMethod")
                    .addInterface("phpDocumentor\\Reflection\\DocBlock\\Tag")
                    .addExtendsClass("phpDocumentor\\Reflection\\DocBlock\\Tags\\BaseTag")
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
