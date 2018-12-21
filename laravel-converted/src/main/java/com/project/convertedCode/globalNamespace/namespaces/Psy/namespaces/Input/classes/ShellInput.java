package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.StringInput;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Input/ShellInput.php

*/

public class ShellInput extends StringInput {

    public Object hasCodeArgument = false;

    public Object tokenPairs = null;

    public ShellInput(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.parsed = null;
        if (this.getClass() == ShellInput.class) {
            this.__construct(env, args);
        }
    }

    public ShellInput(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        super.__construct(env, input);
        this.tokenPairs = this.tokenize(env, input);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition"
    )
    public Object bind(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, false);
        Object ___args = null;
        Object msg = null;
        Object lastArg = null;
        Object arg = null;
        Object hasCodeArgument = null;
        hasCodeArgument = false;
        if (ZVal.isGreaterThan(
                env.callMethod(definition, "getArgumentCount", ShellInput.class), '>', 0)) {
            ___args = env.callMethod(definition, "getArguments", ShellInput.class);
            lastArg = function_array_pop.f.env(env).call(___args).value();
            for (ZPair zpairResult1405 : ZVal.getIterable(___args, env, true)) {
                arg = ZVal.assign(zpairResult1405.getValue());
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                arg, CodeArgument.class, "Psy\\Input\\CodeArgument"))) {
                    msg =
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Unexpected CodeArgument before the final position: %s",
                                            env.callMethod(arg, "getName", ShellInput.class))
                                    .value();
                    throw ZVal.getException(env, new InvalidArgumentException(env, msg));
                }
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            lastArg, CodeArgument.class, "Psy\\Input\\CodeArgument"))) {
                hasCodeArgument = true;
            }
        }

        this.hasCodeArgument = hasCodeArgument;
        return ZVal.assign(super.bind(env, definition));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    private Object tokenize(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object cursor = null;
        Object length = null;
        ReferenceContainer match = new BasicReferenceContainer(null);
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        tokens.setObject(ZVal.newArray());
        length = function_strlen.f.env(env).call(input).value();
        cursor = 0;
        while (ZVal.isLessThan(cursor, '<', length)) {
            if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call("/\\s+/A", input, match.getObject(), ZVal.getNull(), cursor)
                    .getBool()) {

            } else if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call(
                            "/([^=\"'\\s]+?)(=?)("
                                    + toStringR(StringInput.CONST_REGEX_QUOTED_STRING, env)
                                    + "+)/A",
                            input,
                            match.getObject(),
                            ZVal.getNull(),
                            cursor)
                    .getBool()) {
                tokens.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                toStringR(match.arrayGet(env, 1), env)
                                                        + toStringR(match.arrayGet(env, 2), env)
                                                        + toStringR(
                                                                NamespaceGlobal.stripcslashes
                                                                        .env(env)
                                                                        .call(
                                                                                function_str_replace
                                                                                        .f
                                                                                        .env(env)
                                                                                        .call(
                                                                                                ZVal
                                                                                                        .arrayFromList(
                                                                                                                "\"'",
                                                                                                                "'\"",
                                                                                                                "''",
                                                                                                                "\"\""),
                                                                                                "",
                                                                                                function_substr
                                                                                                        .f
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                match
                                                                                                                        .arrayGet(
                                                                                                                                env,
                                                                                                                                3),
                                                                                                                1,
                                                                                                                ZVal
                                                                                                                        .subtract(
                                                                                                                                function_strlen
                                                                                                                                        .f
                                                                                                                                        .env(
                                                                                                                                                env)
                                                                                                                                        .call(
                                                                                                                                                match
                                                                                                                                                        .arrayGet(
                                                                                                                                                                env,
                                                                                                                                                                3))
                                                                                                                                        .value(),
                                                                                                                                2))
                                                                                                        .value())
                                                                                        .value())
                                                                        .value(),
                                                                env)),
                                        new ZPair(
                                                1,
                                                NamespaceGlobal.stripcslashes
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(input, cursor)
                                                                        .value())
                                                        .value())));

            } else if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call(
                            "/" + toStringR(StringInput.CONST_REGEX_QUOTED_STRING, env) + "/A",
                            input,
                            match.getObject(),
                            ZVal.getNull(),
                            cursor)
                    .getBool()) {
                tokens.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                NamespaceGlobal.stripcslashes
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                match.arrayGet(
                                                                                        env, 0),
                                                                                1,
                                                                                ZVal.subtract(
                                                                                        function_strlen
                                                                                                .f
                                                                                                .env(
                                                                                                        env)
                                                                                                .call(
                                                                                                        match
                                                                                                                .arrayGet(
                                                                                                                        env,
                                                                                                                        0))
                                                                                                .value(),
                                                                                        2))
                                                                        .value())
                                                        .value()),
                                        new ZPair(
                                                1,
                                                NamespaceGlobal.stripcslashes
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(input, cursor)
                                                                        .value())
                                                        .value())));

            } else if (function_preg_match
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                    .call(
                            "/" + toStringR(StringInput.CONST_REGEX_STRING, env) + "/A",
                            input,
                            match.getObject(),
                            ZVal.getNull(),
                            cursor)
                    .getBool()) {
                tokens.arrayAppend(env)
                        .set(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                NamespaceGlobal.stripcslashes
                                                        .env(env)
                                                        .call(match.arrayGet(env, 1))
                                                        .value()),
                                        new ZPair(
                                                1,
                                                NamespaceGlobal.stripcslashes
                                                        .env(env)
                                                        .call(
                                                                function_substr
                                                                        .f
                                                                        .env(env)
                                                                        .call(input, cursor)
                                                                        .value())
                                                        .value())));

            } else {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Unable to parse input near \"... %s ...\"",
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(input, cursor, 10)
                                                        .value())
                                        .value()));
            }

            cursor =
                    ZAssignment.add(
                            "+=",
                            cursor,
                            function_strlen.f.env(env).call(match.arrayGet(env, 0)).value());
        }

        return ZVal.assign(tokens.getObject());
    }

    @ConvertedMethod
    protected Object parse(RuntimeEnv env, Object... args) {
        Object rest = null;
        Object parseOptions = null;
        Object runtimeTempArrayResult156 = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        Object tokenPair = null;
        parseOptions = true;
        this.parsed = this.tokenPairs;
        while (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                tokenPair = function_array_shift.f.env(env).call(this.parsed).value())) {
            ZVal.list(
                    runtimeTempArrayResult156 = tokenPair,
                    (token.setObject(listGet(runtimeTempArrayResult156, 0, env))),
                    (rest = listGet(runtimeTempArrayResult156, 1, env)));
            if (ZVal.toBool(parseOptions)
                    && ZVal.toBool(ZVal.strictEqualityCheck("", "===", token.getObject()))) {
                this.parseShellArgument(env, token.getObject(), rest);

            } else if (ZVal.toBool(parseOptions)
                    && ZVal.toBool(ZVal.strictEqualityCheck("--", "===", token.getObject()))) {
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
                this.parseShellArgument(env, token.getObject(), rest);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "token")
    @ConvertedParameter(index = 1, name = "rest")
    private Object parseShellArgument(RuntimeEnv env, Object... args) {
        Object token = assignParameter(args, 0, false);
        Object rest = assignParameter(args, 1, false);
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
                        ShellInput.class,
                        c))) {
            arg =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("definition").value(),
                            "getArgument",
                            ShellInput.class,
                            c);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(arg, CodeArgument.class, "Psy\\Input\\CodeArgument"))) {
                this.parsed = ZVal.newArray();
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, env.callMethod(arg, "getName", ShellInput.class))
                        .set(rest);

            } else {
                new ReferenceClassProperty(this, "arguments", env)
                        .arrayAccess(env, env.callMethod(arg, "getName", ShellInput.class))
                        .set(
                                ZVal.isTrue(env.callMethod(arg, "isArray", ShellInput.class))
                                        ? ZVal.newArray(new ZPair(0, token))
                                        : token);
            }

            return null;
        }

        if (ZVal.toBool(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("definition").value(),
                                "hasArgument",
                                ShellInput.class,
                                ZVal.subtract(c, 1)))
                && ZVal.toBool(
                        env.callMethod(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("definition")
                                                .value(),
                                        "getArgument",
                                        ShellInput.class,
                                        ZVal.subtract(c, 1)),
                                "isArray",
                                ShellInput.class))) {
            arg =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("definition").value(),
                            "getArgument",
                            ShellInput.class,
                            ZVal.subtract(c, 1));
            new ReferenceClassProperty(this, "arguments", env)
                    .arrayAppend(env, env.callMethod(arg, "getName", ShellInput.class))
                    .set(token);
            return null;
        }

        all =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "getArguments",
                        ShellInput.class);
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
                                    ShellInput.class,
                                    name.arrayGet(env, 0)))
                    && ZVal.toBool(
                            env.callMethod(
                                    env.callMethod(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("definition")
                                                    .value(),
                                            "getOptionForShortcut",
                                            ShellInput.class,
                                            name.arrayGet(env, 0)),
                                    "acceptValue",
                                    ShellInput.class))) {
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
                            ShellInput.class,
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
                            ShellInput.class,
                            name.arrayGet(env, i.getObject()));
            if (ZVal.isTrue(env.callMethod(option, "acceptValue", ShellInput.class))) {
                this.addLongOption(
                        env,
                        env.callMethod(option, "getName", ShellInput.class),
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
                        env, env.callMethod(option, "getName", ShellInput.class), ZVal.getNull());
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
                if (ZVal.toBool(ZVal.isLessThan(70211, '<', 70000))
                        && ZVal.toBool(ZVal.strictEqualityCheck(false, "===", value))) {
                    value = "";
                }

                function_array_unshift
                        .f
                        .env(env)
                        .call(
                                this.parsed,
                                ZVal.newArray(new ZPair(0, value), new ZPair(1, ZVal.getNull())));
            }

            this.addLongOption(env, function_substr.f.env(env).call(name, 0, pos).value(), value);

        } else {
            this.addLongOption(env, name, ZVal.getNull());
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
                        ShellInput.class,
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
                                ShellInput.class,
                                shortcut),
                        "getName",
                        ShellInput.class),
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
        ReferenceContainer nextToken = new BasicReferenceContainer(null);
        Object option = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("definition").value(),
                        "hasOption",
                        ShellInput.class,
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
                        ShellInput.class,
                        name);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", value))
                && ZVal.toBool(
                        !ZVal.isTrue(env.callMethod(option, "acceptValue", ShellInput.class)))) {
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
                                        env.callMethod(option, "acceptValue", ShellInput.class)))
                && ZVal.toBool(function_count.f.env(env).call(this.parsed).value())) {
            next.setObject(function_array_shift.f.env(env).call(this.parsed).value());
            nextToken.setObject(ZVal.assign(next.arrayGet(env, 0)));
            if (ZVal.toBool(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, nextToken, env, 0))
                                    && ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    "-", "!==", nextToken.arrayGet(env, 0))))
                    || ZVal.toBool(
                            function_in_array
                                    .f
                                    .env(env)
                                    .call(
                                            nextToken.getObject(),
                                            ZVal.newArray(
                                                    new ZPair(0, ""), new ZPair(1, ZVal.getNull())),
                                            true)
                                    .value())) {
                value = ZVal.assign(nextToken.getObject());

            } else {
                function_array_unshift.f.env(env).call(this.parsed, next.getObject());
            }
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", value)) {
            if (ZVal.isTrue(env.callMethod(option, "isValueRequired", ShellInput.class))) {
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

            if (ZVal.toBool(!ZVal.isTrue(env.callMethod(option, "isArray", ShellInput.class)))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(option, "isValueOptional", ShellInput.class)))) {
                value = true;
            }
        }

        if (ZVal.isTrue(env.callMethod(option, "isArray", ShellInput.class))) {
            new ReferenceClassProperty(this, "options", env).arrayAppend(env, name).set(value);

        } else {
            new ReferenceClassProperty(this, "options", env).arrayAccess(env, name).set(value);
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\Input\\ShellInput";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StringInput.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Input\\ShellInput")
                    .setLookup(
                            ShellInput.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "arguments",
                            "definition",
                            "hasCodeArgument",
                            "interactive",
                            "options",
                            "parsed",
                            "parsed",
                            "stream",
                            "tokenPairs",
                            "tokens")
                    .setFilename("vendor/psy/psysh/src/Input/ShellInput.php")
                    .addInterface("Symfony\\Component\\Console\\Input\\InputInterface")
                    .addInterface("Symfony\\Component\\Console\\Input\\StreamableInputInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Input\\StringInput")
                    .addExtendsClass("Symfony\\Component\\Console\\Input\\ArgvInput")
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
