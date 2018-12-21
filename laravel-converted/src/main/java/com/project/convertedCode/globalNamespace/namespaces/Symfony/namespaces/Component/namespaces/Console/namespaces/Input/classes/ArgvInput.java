package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.Input;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Input/ArgvInput.php

*/

public class ArgvInput extends Input {

    public Object tokens = null;

    public Object parsed = null;

    public ArgvInput(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ArgvInput.class) {
            this.__construct(env, args);
        }
    }

    public ArgvInput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "argv",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object argv = assignParameter(args, 0, true);
        if (null == argv) {
            argv = ZVal.getNull();
        }
        Object definition = assignParameter(args, 1, true);
        if (null == definition) {
            definition = ZVal.getNull();
        }
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", argv)) {
            argv = ZVal.assign(_SERVER.arrayGet(env, "argv"));
        }

        function_array_shift.f.env(env).call(argv);
        this.tokens = argv;
        super.__construct(env, definition);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    protected Object setTokens(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        this.tokens = tokens;
        return null;
    }

    @ConvertedMethod
    protected Object parse(RuntimeEnv env, Object... args) {
        Object parseOptions = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        parseOptions = true;
        this.parsed = this.tokens;
        while (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                token.setObject(function_array_shift.f.env(env).call(this.parsed).value()))) {
            if (ZVal.toBool(parseOptions)
                    && ZVal.toBool(ZVal.equalityCheck("", token.getObject()))) {
                this.parseArgument(env, token.getObject());

            } else if (ZVal.toBool(parseOptions)
                    && ZVal.toBool(ZVal.equalityCheck("--", token.getObject()))) {
                parseOptions = false;

            } else if (ZVal.toBool(parseOptions)
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(token.getObject(), "--")
                                            .value()))) {
                this.parseLongOption(env, token.getObject());

            } else if (ZVal.toBool(
                            ZVal.toBool(parseOptions)
                                    && ZVal.toBool(
                                            ZVal.strictEqualityCheck(
                                                    "-", "===", token.arrayGet(env, 0))))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck("-", "!==", token.getObject()))) {
                this.parseShortOption(env, token.getObject());

            } else {
                this.parseArgument(env, token.getObject());
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    private Object parseShortOption(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        ReferenceContainer name = new BasicReferenceContainer(null);
        name.setObject(function_substr.f.env(env).call(token, 1).value());
        if (ZVal.isGreaterThan(function_strlen.f.env(env).call(name.getObject()).value(), '>', 1)) {
            if (ZVal.toBool(
                            env.callMethod(
                                    toObjectR(this)
                                            .accessProp(this, env)
                                            .name("definition")
                                            .value(),
                                    "hasShortcut",
                                    ArgvInput.class,
                                    name.arrayGet(env, 0)))
                    && ZVal.toBool(
                            env.callMethod(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("definition")
                                                    .value(),
                                            "getOptionForShortcut",
                                            ArgvInput.class,
                                            name.arrayGet(env, 0)),
                                    "acceptValue",
                                    ArgvInput.class))) {
                this.addShortOption(
                        env,
                        name.arrayGet(env, 0),
                        function_substr.f.env(env).call(name.getObject(), 1).value());

            } else {
                this.parseShortOptionSet(env, name.getObject());
            }

        } else {
            this.addShortOption(env, name.getObject(), ZVal.getNull());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object parseShortOptionSet(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object len = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object option = null;
        len = function_strlen.f.env(env).call(name.getObject()).value();
        runtimeConverterBreakCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', len);
                i.setObject(ZVal.increment(i.getObject()))) {
            if (!ZVal.isTrue(
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("definition").value(),
                            "hasShortcut",
                            ArgvInput.class,
                            name.arrayGet(env, i.getObject())))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "The \"-%s\" option does not exist.",
                                                name.arrayGet(env, i.getObject()))
                                        .value()));
            }

            option =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("definition").value(),
                            "getOptionForShortcut",
                            ArgvInput.class,
                            name.arrayGet(env, i.getObject()));
            if (ZVal.isTrue(env.callMethod(option, "acceptValue", ArgvInput.class))) {
                this.addLongOption(
                        env,
                        env.callMethod(option, "getName", ArgvInput.class),
                        ZVal.strictEqualityCheck(i.getObject(), "===", ZVal.subtract(len, 1))
                                ? ZVal.getNull()
                                : function_substr
                                        .f
                                        .env(env)
                                        .call(name.getObject(), ZVal.add(i.getObject(), 1))
                                        .value());
                break;

            } else {
                this.addLongOption(
                        env, env.callMethod(option, "getName", ArgvInput.class), ZVal.getNull());
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    private Object parseLongOption(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object pos = null;
        Object name = null;
        Object value = null;
        name = function_substr.f.env(env).call(token, 2).value();
        if (ZVal.strictNotEqualityCheck(
                false, "!==", pos = function_strpos.f.env(env).call(name, "=").value())) {
            if (ZVal.strictEqualityCheck(
                    0,
                    "===",
                    function_strlen
                            .f
                            .env(env)
                            .call(
                                    value =
                                            function_substr
                                                    .f
                                                    .env(env)
                                                    .call(name, ZVal.add(pos, 1))
                                                    .value())
                            .value())) {
                function_array_unshift.f.env(env).call(this.parsed, value);
            }

            this.addLongOption(env, function_substr.f.env(env).call(name, 0, pos).value(), value);

        } else {
            this.addLongOption(env, name, ZVal.getNull());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    private Object parseArgument(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object all = null;
        Object c = null;
        Object arg = null;
        c =
                function_count
                        .f
                        .env(env)
                        .call(toObjectR(this).accessProp(this, env).name("arguments").value())
                        .value();
        if (ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "hasArgument",
                        ArgvInput.class,
                        c))) {
            arg =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("definition").value(),
                            "getArgument",
                            ArgvInput.class,
                            c);
            new ReferenceClassProperty(this, "arguments", env)
                    .arrayAccess(env, env.callMethod(arg, "getName", ArgvInput.class))
                    .set(
                            ZVal.isTrue(env.callMethod(arg, "isArray", ArgvInput.class))
                                    ? ZVal.newArray(new ZPair(0, token))
                                    : token);

        } else if (ZVal.toBool(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("definition").value(),
                                "hasArgument",
                                ArgvInput.class,
                                ZVal.subtract(c, 1)))
                && ZVal.toBool(
                        env.callMethod(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("definition")
                                                .value(),
                                        "getArgument",
                                        ArgvInput.class,
                                        ZVal.subtract(c, 1)),
                                "isArray",
                                ArgvInput.class))) {
            arg =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("definition").value(),
                            "getArgument",
                            ArgvInput.class,
                            ZVal.subtract(c, 1));
            new ReferenceClassProperty(this, "arguments", env)
                    .arrayAppend(env, env.callMethod(arg, "getName", ArgvInput.class))
                    .set(token);

        } else {
            all =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("definition").value(),
                            "getArguments",
                            ArgvInput.class);
            if (function_count.f.env(env).call(all).getBool()) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Too many arguments, expected arguments \"%s\".",
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "\" \"",
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(all)
                                                                        .value())
                                                        .value())
                                        .value()));
            }

            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("No arguments expected, got \"%s\".", token)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "shortcut")
    @ConvertedParameter(index = 1, name = "value")
    private Object addShortOption(RuntimeEnv env, Object... args) {
        Object shortcut = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "hasShortcut",
                        ArgvInput.class,
                        shortcut))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"-%s\" option does not exist.", shortcut)
                                    .value()));
        }

        this.addLongOption(
                env,
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("definition").value(),
                                "getOptionForShortcut",
                                ArgvInput.class,
                                shortcut),
                        "getName",
                        ArgvInput.class),
                value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "value")
    private Object addLongOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer next = new BasicReferenceContainer(null);
        Object option = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "hasOption",
                        ArgvInput.class,
                        name))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"--%s\" option does not exist.", name)
                                    .value()));
        }

        option =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "getOption",
                        ArgvInput.class,
                        name);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(option, "acceptValue", ArgvInput.class)))) {
            throw ZVal.getException(
                    env,
                    new RuntimeException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The \"--%s\" option does not accept a value.", name)
                                    .value()));
        }

        if (ZVal.toBool(
                        ZVal.toBool(
                                        function_in_array
                                                .f
                                                .env(env)
                                                .call(
                                                        value,
                                                        ZVal.newArray(
                                                                new ZPair(0, ""),
                                                                new ZPair(1, ZVal.getNull())),
                                                        true)
                                                .value())
                                && ZVal.toBool(
                                        env.callMethod(option, "acceptValue", ArgvInput.class)))
                && ZVal.toBool(function_count.f.env(env).call(this.parsed).value())) {
            next.setObject(function_array_shift.f.env(env).call(this.parsed).value());
            if (ZVal.toBool(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, next, env, 0))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    "-", "!==", next.arrayGet(env, 0))))
                    || ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            next.getObject(),
                                            ZVal.newArray(
                                                    new ZPair(0, ""), new ZPair(1, ZVal.getNull())),
                                            true)
                                    .value())) {
                value = ZVal.assign(next.getObject());

            } else {
                function_array_unshift.f.env(env).call(this.parsed, next.getObject());
            }
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
            if (ZVal.isTrue(env.callMethod(option, "isValueRequired", ArgvInput.class))) {
                throw ZVal.getException(
                        env,
                        new RuntimeException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("The \"--%s\" option requires a value.", name)
                                        .value()));
            }

            if (ZVal.toBool(!ZVal.isTrue(env.callMethod(option, "isArray", ArgvInput.class)))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(option, "isValueOptional", ArgvInput.class)))) {
                value = true;
            }
        }

        if (ZVal.isTrue(env.callMethod(option, "isArray", ArgvInput.class))) {
            new ReferenceClassProperty(this, "options", env).arrayAppend(env, name).set(value);

        } else {
            new ReferenceClassProperty(this, "options", env).arrayAccess(env, name).set(value);
        }

        return null;
    }

    @ConvertedMethod
    public Object getFirstArgument(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer token = new BasicReferenceContainer(null);
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1719 : ZVal.getIterable(this.tokens, env, true)) {
            token.setObject(ZVal.assign(zpairResult1719.getValue()));
            if (ZVal.toBool(token.getObject())
                    && ZVal.toBool(ZVal.strictEqualityCheck("-", "===", token.arrayGet(env, 0)))) {
                continue;
            }

            return ZVal.assign(token.getObject());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    @ConvertedParameter(
        index = 1,
        name = "onlyParams",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object hasParameterOption(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object onlyParams = assignParameter(args, 1, true);
        if (null == onlyParams) {
            onlyParams = false;
        }
        Object leading = null;
        Object value = null;
        Object token = null;
        values = ZVal.assign(rToArrayCast(values));
        for (ZPair zpairResult1720 : ZVal.getIterable(this.tokens, env, true)) {
            token = ZVal.assign(zpairResult1720.getValue());
            if (ZVal.toBool(onlyParams)
                    && ZVal.toBool(ZVal.strictEqualityCheck("--", "===", token))) {
                return ZVal.assign(false);
            }

            for (ZPair zpairResult1721 : ZVal.getIterable(values, env, true)) {
                value = ZVal.assign(zpairResult1721.getValue());
                leading =
                        ZVal.assign(
                                ZVal.strictEqualityCheck(
                                                0,
                                                "===",
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(value, "--")
                                                        .value())
                                        ? toStringR(value, env) + "="
                                        : value);
                if (ZVal.toBool(ZVal.strictEqualityCheck(token, "===", value))
                        || ZVal.toBool(
                                ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", leading))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        0,
                                                        "===",
                                                        function_strpos
                                                                .f
                                                                .env(env)
                                                                .call(token, leading)
                                                                .value())))) {
                    return ZVal.assign(true);
                }
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "onlyParams",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object getParameterOption(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = false;
        }
        Object onlyParams = assignParameter(args, 2, true);
        if (null == onlyParams) {
            onlyParams = false;
        }
        Object leading = null;
        Object tokens = null;
        Object value = null;
        Object token = null;
        values = ZVal.assign(rToArrayCast(values));
        tokens = ZVal.assign(this.tokens);
        while (ZVal.isLessThan(0, '<', function_count.f.env(env).call(tokens).value())) {
            token = function_array_shift.f.env(env).call(tokens).value();
            if (ZVal.toBool(onlyParams)
                    && ZVal.toBool(ZVal.strictEqualityCheck("--", "===", token))) {
                return ZVal.assign(false);
            }

            for (ZPair zpairResult1722 : ZVal.getIterable(values, env, true)) {
                value = ZVal.assign(zpairResult1722.getValue());
                if (ZVal.strictEqualityCheck(token, "===", value)) {
                    return ZVal.assign(function_array_shift.f.env(env).call(tokens).value());
                }

                leading =
                        ZVal.assign(
                                ZVal.strictEqualityCheck(
                                                0,
                                                "===",
                                                function_strpos
                                                        .f
                                                        .env(env)
                                                        .call(value, "--")
                                                        .value())
                                        ? toStringR(value, env) + "="
                                        : value);
                if (ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", leading))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        0,
                                        "===",
                                        function_strpos.f.env(env).call(token, leading).value()))) {
                    return ZVal.assign(
                            function_substr
                                    .f
                                    .env(env)
                                    .call(token, function_strlen.f.env(env).call(leading).value())
                                    .value());
                }
            }
        }

        return ZVal.assign(_pDefault);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Input")
                        .setFile("/vendor/symfony/console/Input/ArgvInput.php");
        Object tokens = null;
        tokens =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Console\\Input",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "token")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        ReferenceContainer token =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        ReferenceContainer match =
                                                new BasicReferenceContainer(null);
                                        if (function_preg_match
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithReferences()
                                                                .add(2, match))
                                                .call(
                                                        "{^(-[^=]+=)(.+)}",
                                                        token.getObject(),
                                                        match.getObject())
                                                .getBool()) {
                                            return ZVal.assign(
                                                    toStringR(match.arrayGet(env, 1), env)
                                                            + toStringR(
                                                                    env.callMethod(
                                                                            _closureThisVar,
                                                                            "escapeToken",
                                                                            ArgvInput.class,
                                                                            match.arrayGet(env, 2)),
                                                                    env));
                                        }

                                        if (ZVal.toBool(token.getObject())
                                                && ZVal.toBool(
                                                        ZVal.strictNotEqualityCheck(
                                                                "-",
                                                                "!==",
                                                                token.arrayGet(env, 0)))) {
                                            return ZVal.assign(
                                                    env.callMethod(
                                                            _closureThisVar,
                                                            "escapeToken",
                                                            ArgvInput.class,
                                                            token.getObject()));
                                        }

                                        return ZVal.assign(token.getObject());
                                    }
                                },
                                this.tokens)
                        .value();
        return ZVal.assign(NamespaceGlobal.implode.env(env).call(" ", tokens).value());
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Input\\ArgvInput";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Input.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Input\\ArgvInput")
                    .setLookup(
                            ArgvInput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments",
                            "definition",
                            "interactive",
                            "options",
                            "parsed",
                            "stream",
                            "tokens")
                    .setFilename("vendor/symfony/console/Input/ArgvInput.php")
                    .addInterface("Symfony\\Component\\Console\\Input\\InputInterface")
                    .addInterface("Symfony\\Component\\Console\\Input\\StreamableInputInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Input\\Input")
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
