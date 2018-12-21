package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.nativeInterfaces.Countable;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.OutOfBoundsException;
import com.project.convertedCode.globalNamespace.classes.PHP_Token_CLASS;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeInterfaces.SeekableIterator;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token/Stream.php

*/

public class PHP_Token_Stream extends RuntimeClassBase
        implements ArrayAccess, Countable, SeekableIterator {

    public Object filename = null;

    public Object tokens = ZVal.newArray();

    public Object position = 0;

    public Object linesOfCode =
            ZVal.newArray(new ZPair("loc", 0), new ZPair("cloc", 0), new ZPair("ncloc", 0));

    public Object classes = null;

    public Object functions = null;

    public Object includes = null;

    public Object interfaces = null;

    public Object traits = null;

    public Object lineToFunctionMap = ZVal.newArray();

    public PHP_Token_Stream(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PHP_Token_Stream.class) {
            this.__construct(env, args);
        }
    }

    public PHP_Token_Stream(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sourceCode")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object sourceCode = assignParameter(args, 0, false);
        if (function_is_file.f.env(env).call(sourceCode).getBool()) {
            this.filename = sourceCode;
            sourceCode = function_file_get_contents.f.env(env).call(sourceCode).value();
        }

        this.scan(env, sourceCode);
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        this.tokens = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        Object buffer = null;
        Object token = null;
        buffer = "";
        for (ZPair zpairResult1119 : ZVal.getIterable(this, env, true)) {
            token = ZVal.assign(zpairResult1119.getValue());
            buffer = toStringR(buffer, env) + toStringR(token, env);
        }

        return ZVal.assign(buffer);
    }

    @ConvertedMethod
    public Object getFilename(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.filename);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "sourceCode")
    protected Object scan(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object sourceCode = assignParameter(args, 0, false);
        Object tokenClass = null;
        Object line = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object skip = null;
        ReferenceContainer token = new BasicReferenceContainer(null);
        Object lastNonWhitespaceTokenWasDoubleColon = null;
        Object name = null;
        ReferenceContainer tokens = new BasicReferenceContainer(null);
        ReferenceContainer id = new BasicReferenceContainer(null);
        Object text = null;
        Object lines = null;
        Object numTokens = null;
        id.setObject(0);
        line = 1;
        tokens.setObject(NamespaceGlobal.token_get_all.env(env).call(sourceCode).value());
        numTokens = function_count.f.env(env).call(tokens.getObject()).value();
        lastNonWhitespaceTokenWasDoubleColon = false;
        runtimeConverterBreakCount = 0;
        for (i.setObject(0);
                ZVal.isLessThan(i.getObject(), '<', numTokens);
                i.setObject(ZVal.increment(i.getObject()))) {
            token.setObject(ZVal.assign(tokens.arrayGet(env, i.getObject())));
            skip = 0;
            if (function_is_array.f.env(env).call(token.getObject()).getBool()) {
                name =
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.token_name
                                                .env(env)
                                                .call(token.arrayGet(env, 0))
                                                .value(),
                                        2)
                                .value();
                text = ZVal.assign(token.arrayGet(env, 1));
                if (ZVal.toBool(lastNonWhitespaceTokenWasDoubleColon)
                        && ZVal.toBool(ZVal.equalityCheck(name, "CLASS"))) {
                    name = "CLASS_NAME_CONSTANT";

                } else if (ZVal.toBool(
                                ZVal.toBool(ZVal.equalityCheck(name, "USE"))
                                        && ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        tokens,
                                                        env,
                                                        ZVal.add(i.getObject(), 2),
                                                        0)))
                        && ZVal.toBool(
                                ZVal.equalityCheck(
                                        tokens.arrayGet(env, ZVal.add(i.getObject(), 2), 0),
                                        346))) {
                    name = "USE_FUNCTION";
                    text =
                            toStringR(text, env)
                                    + toStringR(
                                            tokens.arrayGet(env, ZVal.add(i.getObject(), 1), 1),
                                            env)
                                    + toStringR(
                                            tokens.arrayGet(env, ZVal.add(i.getObject(), 2), 1),
                                            env);
                    skip = 2;
                }

                tokenClass = "PHP_Token_" + toStringR(name, env);

            } else {
                text = ZVal.assign(token.getObject());
                tokenClass =
                        ZVal.assign(
                                env.getRequestStaticPropertiesReference(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .classes
                                                        .PHP_Token_Stream
                                                        .RequestStaticProperties
                                                        .class,
                                                "customTokens")
                                        .arrayGet(env, token.getObject()));
            }

            new ReferenceClassProperty(this, "tokens", env)
                    .arrayAppend(env)
                    .set(env.createNew(tokenClass, text, line, this, ZVal.postIncrement(id)));
            lines = NamespaceGlobal.substr_count.env(env).call(text, "\n").value();
            line = ZAssignment.add("+=", line, lines);
            if (ZVal.equalityCheck(tokenClass, "PHP_Token_HALT_COMPILER")) {
                break;

            } else if (ZVal.toBool(ZVal.equalityCheck(tokenClass, "PHP_Token_COMMENT"))
                    || ZVal.toBool(ZVal.equalityCheck(tokenClass, "PHP_Token_DOC_COMMENT"))) {
                new ReferenceClassProperty(this, "linesOfCode", env)
                        .arrayAccess(env, "cloc")
                        .set(
                                ZAssignment.add(
                                        "+=",
                                        new ReferenceClassProperty(this, "linesOfCode", env)
                                                .arrayGet(env, "cloc"),
                                        ZVal.add(lines, 1)));
            }

            if (ZVal.equalityCheck(name, "DOUBLE_COLON")) {
                lastNonWhitespaceTokenWasDoubleColon = true;

            } else if (ZVal.notEqualityCheck(name, "WHITESPACE")) {
                lastNonWhitespaceTokenWasDoubleColon = false;
            }

            i.setObject(ZAssignment.add("+=", i.getObject(), skip));
        }

        new ReferenceClassProperty(this, "linesOfCode", env)
                .arrayAccess(env, "loc")
                .set(NamespaceGlobal.substr_count.env(env).call(sourceCode, "\n").value());
        new ReferenceClassProperty(this, "linesOfCode", env)
                .arrayAccess(env, "ncloc")
                .set(
                        ZVal.subtract(
                                new ReferenceClassProperty(this, "linesOfCode", env)
                                        .arrayGet(env, "loc"),
                                new ReferenceClassProperty(this, "linesOfCode", env)
                                        .arrayGet(env, "cloc")));
        return null;
    }

    @ConvertedMethod
    public Object count(RuntimeEnv env, Object... args) {
        return ZVal.assign(function_count.f.env(env).call(this.tokens).value());
    }

    @ConvertedMethod
    public Object tokens(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.tokens);
    }

    @ConvertedMethod
    public Object getClasses(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(this.classes, "!==", ZVal.getNull())) {
            return ZVal.assign(this.classes);
        }

        this.parse(env);
        return ZVal.assign(this.classes);
    }

    @ConvertedMethod
    public Object getFunctions(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(this.functions, "!==", ZVal.getNull())) {
            return ZVal.assign(this.functions);
        }

        this.parse(env);
        return ZVal.assign(this.functions);
    }

    @ConvertedMethod
    public Object getInterfaces(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(this.interfaces, "!==", ZVal.getNull())) {
            return ZVal.assign(this.interfaces);
        }

        this.parse(env);
        return ZVal.assign(this.interfaces);
    }

    @ConvertedMethod
    public Object getTraits(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck(this.traits, "!==", ZVal.getNull())) {
            return ZVal.assign(this.traits);
        }

        this.parse(env);
        return ZVal.assign(this.traits);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "categorize",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "category",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getIncludes(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object categorize = assignParameter(args, 0, true);
        if (null == categorize) {
            categorize = false;
        }
        Object category = assignParameter(args, 1, true);
        if (null == category) {
            category = ZVal.getNull();
        }
        Object includes = null;
        Object token = null;
        if (ZVal.strictEqualityCheck(this.includes, "===", ZVal.getNull())) {
            this.includes =
                    ZVal.newArray(
                            new ZPair("require_once", ZVal.newArray()),
                            new ZPair("require", ZVal.newArray()),
                            new ZPair("include_once", ZVal.newArray()),
                            new ZPair("include", ZVal.newArray()));
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1120 : ZVal.getIterable(this.tokens, env, true)) {
                token = ZVal.assign(zpairResult1120.getValue());
                switch (toStringR(function_get_class.f.env(env).call(token).value())) {
                    case "PHP_Token_REQUIRE_ONCE":
                    case "PHP_Token_REQUIRE":
                    case "PHP_Token_INCLUDE_ONCE":
                    case "PHP_Token_INCLUDE":
                        new ReferenceClassProperty(this, "includes", env)
                                .arrayAppend(
                                        env,
                                        env.callMethod(token, "getType", PHP_Token_Stream.class))
                                .set(env.callMethod(token, "getName", PHP_Token_Stream.class));
                        break;
                }
                ;
            }
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "includes", env),
                env,
                category)) {
            includes =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "includes", env)
                                    .arrayGet(env, category));

        } else if (ZVal.strictEqualityCheck(categorize, "===", false)) {
            includes =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    new ReferenceClassProperty(this, "includes", env)
                                            .arrayGet(env, "require_once"),
                                    new ReferenceClassProperty(this, "includes", env)
                                            .arrayGet(env, "require"),
                                    new ReferenceClassProperty(this, "includes", env)
                                            .arrayGet(env, "include_once"),
                                    new ReferenceClassProperty(this, "includes", env)
                                            .arrayGet(env, "include"))
                            .value();

        } else {
            includes = ZVal.assign(this.includes);
        }

        return ZVal.assign(includes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    public Object getFunctionForLine(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        this.parse(env);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "lineToFunctionMap", env),
                env,
                line)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "lineToFunctionMap", env).arrayGet(env, line));
        }

        return null;
    }

    @ConvertedMethod
    protected Object parse(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        ReferenceContainer tmp = new BasicReferenceContainer(null);
        Object interfaceEndLine = null;
        ReferenceContainer classEndLine = new BasicReferenceContainer(null);
        Object name = null;
        Object trait = null;
        Object _pInterface = null;
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        Object traitEndLine = null;
        Object token = null;
        this.interfaces = ZVal.newArray();
        this.classes = ZVal.newArray();
        this.traits = ZVal.newArray();
        this.functions = ZVal.newArray();
        _pClass.setObject(ZVal.newArray());
        classEndLine.setObject(ZVal.newArray());
        trait = false;
        traitEndLine = false;
        _pInterface = false;
        interfaceEndLine = false;
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult1121 : ZVal.getIterable(this.tokens, env, true)) {
            token = ZVal.assign(zpairResult1121.getValue());
            switch (toStringR(function_get_class.f.env(env).call(token).value())) {
                case "PHP_Token_HALT_COMPILER":
                    return null;
                case "PHP_Token_INTERFACE":
                    _pInterface = env.callMethod(token, "getName", PHP_Token_Stream.class);
                    interfaceEndLine = env.callMethod(token, "getEndLine", PHP_Token_Stream.class);
                    new ReferenceClassProperty(this, "interfaces", env)
                            .arrayAccess(env, _pInterface)
                            .set(
                                    ZVal.newArray(
                                            new ZPair("methods", ZVal.newArray()),
                                            new ZPair(
                                                    "parent",
                                                    env.callMethod(
                                                            token,
                                                            "getParent",
                                                            PHP_Token_Stream.class)),
                                            new ZPair(
                                                    "keywords",
                                                    env.callMethod(
                                                            token,
                                                            "getKeywords",
                                                            PHP_Token_Stream.class)),
                                            new ZPair(
                                                    "docblock",
                                                    env.callMethod(
                                                            token,
                                                            "getDocblock",
                                                            PHP_Token_Stream.class)),
                                            new ZPair(
                                                    "startLine",
                                                    env.callMethod(
                                                            token,
                                                            "getLine",
                                                            PHP_Token_Stream.class)),
                                            new ZPair("endLine", interfaceEndLine),
                                            new ZPair(
                                                    "package",
                                                    env.callMethod(
                                                            token,
                                                            "getPackage",
                                                            PHP_Token_Stream.class)),
                                            new ZPair("file", this.filename)));
                    break;
                case "PHP_Token_CLASS":
                case "PHP_Token_TRAIT":
                    tmp.setObject(
                            ZVal.newArray(
                                    new ZPair("methods", ZVal.newArray()),
                                    new ZPair(
                                            "parent",
                                            env.callMethod(
                                                    token, "getParent", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "interfaces",
                                            env.callMethod(
                                                    token,
                                                    "getInterfaces",
                                                    PHP_Token_Stream.class)),
                                    new ZPair(
                                            "keywords",
                                            env.callMethod(
                                                    token, "getKeywords", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "docblock",
                                            env.callMethod(
                                                    token, "getDocblock", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "startLine",
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "endLine",
                                            env.callMethod(
                                                    token, "getEndLine", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "package",
                                            env.callMethod(
                                                    token, "getPackage", PHP_Token_Stream.class)),
                                    new ZPair("file", this.filename)));
                    if (ZVal.isTrue(
                            ZVal.checkInstanceType(
                                    token, PHP_Token_CLASS.class, "PHP_Token_CLASS"))) {
                        _pClass.arrayAppend(env)
                                .set(env.callMethod(token, "getName", PHP_Token_Stream.class));
                        classEndLine
                                .arrayAppend(env)
                                .set(env.callMethod(token, "getEndLine", PHP_Token_Stream.class));
                        new ReferenceClassProperty(this, "classes", env)
                                .arrayAccess(
                                        env,
                                        _pClass.arrayGet(
                                                env,
                                                ZVal.subtract(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(_pClass.getObject())
                                                                .value(),
                                                        1)))
                                .set(tmp.getObject());

                    } else {
                        trait = env.callMethod(token, "getName", PHP_Token_Stream.class);
                        traitEndLine = env.callMethod(token, "getEndLine", PHP_Token_Stream.class);
                        new ReferenceClassProperty(this, "traits", env)
                                .arrayAccess(env, trait)
                                .set(tmp.getObject());
                    }

                    break;
                case "PHP_Token_FUNCTION":
                    name = env.callMethod(token, "getName", PHP_Token_Stream.class);
                    tmp.setObject(
                            ZVal.newArray(
                                    new ZPair(
                                            "docblock",
                                            env.callMethod(
                                                    token, "getDocblock", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "keywords",
                                            env.callMethod(
                                                    token, "getKeywords", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "visibility",
                                            env.callMethod(
                                                    token,
                                                    "getVisibility",
                                                    PHP_Token_Stream.class)),
                                    new ZPair(
                                            "signature",
                                            env.callMethod(
                                                    token, "getSignature", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "startLine",
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "endLine",
                                            env.callMethod(
                                                    token, "getEndLine", PHP_Token_Stream.class)),
                                    new ZPair(
                                            "ccn",
                                            env.callMethod(
                                                    token, "getCCN", PHP_Token_Stream.class)),
                                    new ZPair("file", this.filename)));
                    if (ZVal.toBool(
                                    ZVal.toBool(ZVal.isEmpty(_pClass.getObject()))
                                            && ZVal.toBool(
                                                    ZVal.strictEqualityCheck(trait, "===", false)))
                            && ZVal.toBool(ZVal.strictEqualityCheck(_pInterface, "===", false))) {
                        new ReferenceClassProperty(this, "functions", env)
                                .arrayAccess(env, name)
                                .set(tmp.getObject());
                        this.addFunctionToMap(
                                env,
                                name,
                                tmp.arrayGet(env, "startLine"),
                                tmp.arrayGet(env, "endLine"));

                    } else if (!ZVal.isEmpty(_pClass.getObject())) {
                        new ReferenceClassProperty(this, "classes", env)
                                .arrayAccess(
                                        env,
                                        _pClass.arrayGet(
                                                env,
                                                ZVal.subtract(
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(_pClass.getObject())
                                                                .value(),
                                                        1)),
                                        "methods",
                                        name)
                                .set(tmp.getObject());
                        this.addFunctionToMap(
                                env,
                                toStringR(
                                                _pClass.arrayGet(
                                                        env,
                                                        ZVal.subtract(
                                                                function_count
                                                                        .f
                                                                        .env(env)
                                                                        .call(_pClass.getObject())
                                                                        .value(),
                                                                1)),
                                                env)
                                        + "::"
                                        + toStringR(name, env),
                                tmp.arrayGet(env, "startLine"),
                                tmp.arrayGet(env, "endLine"));

                    } else if (ZVal.strictNotEqualityCheck(trait, "!==", false)) {
                        new ReferenceClassProperty(this, "traits", env)
                                .arrayAccess(env, trait, "methods", name)
                                .set(tmp.getObject());
                        this.addFunctionToMap(
                                env,
                                toStringR(trait, env) + "::" + toStringR(name, env),
                                tmp.arrayGet(env, "startLine"),
                                tmp.arrayGet(env, "endLine"));

                    } else {
                        new ReferenceClassProperty(this, "interfaces", env)
                                .arrayAccess(env, _pInterface, "methods", name)
                                .set(tmp.getObject());
                    }

                    break;
                case "PHP_Token_CLOSE_CURLY":
                    if (ZVal.toBool(!ZVal.isEmpty(classEndLine.getObject()))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            classEndLine.arrayGet(
                                                    env,
                                                    ZVal.subtract(
                                                            function_count
                                                                    .f
                                                                    .env(env)
                                                                    .call(classEndLine.getObject())
                                                                    .value(),
                                                            1)),
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)))) {
                        function_array_pop.f.env(env).call(classEndLine.getObject());
                        function_array_pop.f.env(env).call(_pClass.getObject());

                    } else if (ZVal.toBool(ZVal.strictNotEqualityCheck(traitEndLine, "!==", false))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            traitEndLine,
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)))) {
                        trait = false;
                        traitEndLine = false;

                    } else if (ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(interfaceEndLine, "!==", false))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            interfaceEndLine,
                                            env.callMethod(
                                                    token, "getLine", PHP_Token_Stream.class)))) {
                        _pInterface = false;
                        interfaceEndLine = false;
                    }

                    break;
            }
            ;
        }

        return null;
    }

    @ConvertedMethod
    public Object getLinesOfCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.linesOfCode);
    }

    @ConvertedMethod
    public Object rewind(RuntimeEnv env, Object... args) {
        this.position = 0;
        return null;
    }

    @ConvertedMethod
    public Object valid(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "tokens", env),
                        env,
                        this.position));
    }

    @ConvertedMethod
    public Object key(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.position);
    }

    @ConvertedMethod
    public Object current(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "tokens", env).arrayGet(env, this.position));
    }

    @ConvertedMethod
    public Object next(RuntimeEnv env, Object... args) {
        this.position = ZVal.increment(this.position);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "tokens", env),
                        env,
                        offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.offsetExists(env, offset))) {
            throw ZVal.getException(
                    env,
                    new OutOfBoundsException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("No token at position \"%s\"", offset)
                                    .value()));
        }

        return ZVal.assign(new ReferenceClassProperty(this, "tokens", env).arrayGet(env, offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "tokens", env).arrayAccess(env, offset).set(value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        if (!ZVal.isTrue(this.offsetExists(env, offset))) {
            throw ZVal.getException(
                    env,
                    new OutOfBoundsException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("No token at position \"%s\"", offset)
                                    .value()));
        }

        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "tokens", env), env, offset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "position")
    public Object seek(RuntimeEnv env, Object... args) {
        Object position = assignParameter(args, 0, false);
        this.position = position;
        if (!ZVal.isTrue(this.valid(env))) {
            throw ZVal.getException(
                    env,
                    new OutOfBoundsException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("No token at position \"%s\"", this.position)
                                    .value()));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "startLine")
    @ConvertedParameter(index = 2, name = "endLine")
    private Object addFunctionToMap(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object startLine = assignParameter(args, 1, false);
        Object endLine = assignParameter(args, 2, false);
        ReferenceContainer line = new BasicReferenceContainer(null);
        for (line.setObject(ZVal.assign(startLine));
                ZVal.isLessThanOrEqualTo(line.getObject(), "<=", endLine);
                line.setObject(ZVal.increment(line.getObject()))) {
            new ReferenceClassProperty(this, "lineToFunctionMap", env)
                    .arrayAccess(env, line.getObject())
                    .set(name);
        }

        return null;
    }

    public static final Object CONST_class = "PHP_Token_Stream";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object customTokens =
                ZVal.newArray(
                        new ZPair("(", "PHP_Token_OPEN_BRACKET"),
                        new ZPair(")", "PHP_Token_CLOSE_BRACKET"),
                        new ZPair("[", "PHP_Token_OPEN_SQUARE"),
                        new ZPair("]", "PHP_Token_CLOSE_SQUARE"),
                        new ZPair("{", "PHP_Token_OPEN_CURLY"),
                        new ZPair("}", "PHP_Token_CLOSE_CURLY"),
                        new ZPair(";", "PHP_Token_SEMICOLON"),
                        new ZPair(".", "PHP_Token_DOT"),
                        new ZPair(",", "PHP_Token_COMMA"),
                        new ZPair("=", "PHP_Token_EQUAL"),
                        new ZPair("<", "PHP_Token_LT"),
                        new ZPair(">", "PHP_Token_GT"),
                        new ZPair("+", "PHP_Token_PLUS"),
                        new ZPair("-", "PHP_Token_MINUS"),
                        new ZPair("*", "PHP_Token_MULT"),
                        new ZPair("/", "PHP_Token_DIV"),
                        new ZPair("?", "PHP_Token_QUESTION_MARK"),
                        new ZPair("!", "PHP_Token_EXCLAMATION_MARK"),
                        new ZPair(":", "PHP_Token_COLON"),
                        new ZPair("\"", "PHP_Token_DOUBLE_QUOTES"),
                        new ZPair("@", "PHP_Token_AT"),
                        new ZPair("&", "PHP_Token_AMPERSAND"),
                        new ZPair("%", "PHP_Token_PERCENT"),
                        new ZPair("|", "PHP_Token_PIPE"),
                        new ZPair("$", "PHP_Token_DOLLAR"),
                        new ZPair("^", "PHP_Token_CARET"),
                        new ZPair("~", "PHP_Token_TILDE"),
                        new ZPair("`", "PHP_Token_BACKTICK"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHP_Token_Stream")
                    .setLookup(
                            PHP_Token_Stream.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "classes",
                            "filename",
                            "functions",
                            "includes",
                            "interfaces",
                            "lineToFunctionMap",
                            "linesOfCode",
                            "position",
                            "tokens",
                            "traits")
                    .setStaticPropertyNames("customTokens")
                    .setFilename("vendor/phpunit/php-token-stream/src/Token/Stream.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Countable")
                    .addInterface("SeekableIterator")
                    .addInterface("Iterator")
                    .addInterface("Traversable")
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
