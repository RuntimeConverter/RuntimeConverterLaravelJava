package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.CliDumper;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_ini_get;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Cursor;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.AbstractDumper;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_scalar;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.functions.esc;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/HtmlDumper.php

*/

public class HtmlDumper extends CliDumper {

    public Object dumpHeader = null;

    public Object dumpPrefix = "<pre class=sf-dump id=%s data-indent-pad=\"%s\">";

    public Object dumpSuffix = "</pre><script>Sfdump(%s)</script>";

    public Object dumpId = "sf-dump";

    public Object headerIsDumped = false;

    public Object lastDepth = -1;

    public Object displayOptions =
            ZVal.newArray(
                    new ZPair("maxDepth", 1),
                    new ZPair("maxStringLength", 160),
                    new ZPair("fileLinkFormat", ZVal.getNull()));

    public Object extraDisplayOptions = ZVal.newArray();

    public HtmlDumper(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.colors = true;
        this.styles =
                ZVal.newArray(
                        new ZPair(
                                "default",
                                "background-color:#18171B; color:#FF8400; line-height:1.2em; font:12px Menlo, Monaco, Consolas, monospace; word-wrap: break-word; white-space: pre-wrap; position:relative; z-index:99999; word-break: break-all"),
                        new ZPair("num", "font-weight:bold; color:#1299DA"),
                        new ZPair("const", "font-weight:bold"),
                        new ZPair("str", "font-weight:bold; color:#56DB3A"),
                        new ZPair("note", "color:#1299DA"),
                        new ZPair("ref", "color:#A0A0A0"),
                        new ZPair("public", "color:#FFFFFF"),
                        new ZPair("protected", "color:#FFFFFF"),
                        new ZPair("private", "color:#FFFFFF"),
                        new ZPair("meta", "color:#B729D9"),
                        new ZPair("key", "color:#56DB3A"),
                        new ZPair("index", "color:#1299DA"),
                        new ZPair("ellipsis", "color:#FF8400"));
        if (this.getClass() == HtmlDumper.class) {
            this.__construct(env, args);
        }
    }

    public HtmlDumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "charset",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "flags",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, true);
        if (null == output) {
            output = ZVal.getNull();
        }
        Object charset = assignParameter(args, 1, true);
        if (null == charset) {
            charset = ZVal.getNull();
        }
        Object flags = assignParameter(args, 2, true);
        if (null == flags) {
            flags = 0;
        }
        Object ternaryExpressionTemp = null;
        StaticMethodUtils.callNonStaticMethodStatically(
                env, AbstractDumper.class, "__construct", output, charset, flags);
        this.dumpId = "sf-dump-" + toStringR(NamespaceGlobal.mt_rand.env(env).call().value(), env);
        new ReferenceClassProperty(this, "displayOptions", env)
                .arrayAccess(env, "fileLinkFormat")
                .set(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                function_ini_get
                                                        .f
                                                        .env(env)
                                                        .call("xdebug.file_link_format")
                                                        .value())
                                ? ternaryExpressionTemp
                                : NamespaceGlobal.get_cfg_var
                                        .env(env)
                                        .call("xdebug.file_link_format")
                                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "styles", typeHint = "array")
    public Object setStyles(RuntimeEnv env, Object... args) {
        Object styles = assignParameter(args, 0, false);
        this.headerIsDumped = false;
        this.styles = ZVal.add(styles, this.styles);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "displayOptions", typeHint = "array")
    public Object setDisplayOptions(RuntimeEnv env, Object... args) {
        Object displayOptions = assignParameter(args, 0, false);
        this.headerIsDumped = false;
        this.displayOptions = ZVal.add(displayOptions, this.displayOptions);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "header")
    public Object setDumpHeader(RuntimeEnv env, Object... args) {
        Object header = assignParameter(args, 0, false);
        this.dumpHeader = header;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    @ConvertedParameter(index = 1, name = "suffix")
    public Object setDumpBoundaries(RuntimeEnv env, Object... args) {
        Object prefix = assignParameter(args, 0, false);
        Object suffix = assignParameter(args, 1, false);
        this.dumpPrefix = prefix;
        this.dumpSuffix = suffix;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "data",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Data"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "extraDisplayOptions",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object dump(RuntimeEnv env, Object... args) {
        Object data = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, true);
        if (null == output) {
            output = ZVal.getNull();
        }
        Object extraDisplayOptions = assignParameter(args, 2, true);
        if (null == extraDisplayOptions) {
            extraDisplayOptions = ZVal.newArray();
        }
        Object result = null;
        this.extraDisplayOptions = extraDisplayOptions;
        result = super.dump(env, data, output);
        this.dumpId = "sf-dump-" + toStringR(NamespaceGlobal.mt_rand.env(env).call().value(), env);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    protected Object getDumpHeader(RuntimeEnv env, Object... args) {
        Object line = null;
        Object style = null;
        Object _pClass = null;
        this.headerIsDumped =
                ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                toObjectR(this).accessProp(this, env).name("outputStream").value())
                        ? toObjectR(this).accessProp(this, env).name("outputStream").value()
                        : toObjectR(this).accessProp(this, env).name("lineDumper").value();
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.dumpHeader)) {
            return ZVal.assign(this.dumpHeader);
        }

        line =
                function_str_replace
                        .f
                        .env(env)
                        .call(
                                "{$options}",
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(this.displayOptions, 16)
                                        .value(),
                                ZVal.getResourceAsString("stringLiterals/stringLiteral3570.txt"))
                        .value();
        for (ZPair zpairResult2227 : ZVal.getIterable(this.styles, env, false)) {
            _pClass = ZVal.assign(zpairResult2227.getKey());
            style = ZVal.assign(zpairResult2227.getValue());
            line =
                    toStringR(line, env)
                            + "pre.sf-dump"
                            + toStringR(
                                    ZVal.strictEqualityCheck("default", "===", _pClass)
                                            ? ", pre.sf-dump"
                                            : "",
                                    env)
                            + " .sf-dump-"
                            + toStringR(_pClass, env)
                            + "{"
                            + toStringR(style, env)
                            + "}";
        }

        return ZVal.assign(
                this.dumpHeader =
                        toStringR(
                                        function_preg_replace
                                                .f
                                                .env(env)
                                                .call("/\\s+/", " ", line)
                                                .value(),
                                        env)
                                + "</style>"
                                + toStringR(this.dumpHeader, env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "class")
    @ConvertedParameter(index = 3, name = "hasChild")
    public Object enterHash(RuntimeEnv env, Object... args) {
        Object cursor = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object _pClass = assignParameter(args, 2, false);
        Object hasChild = assignParameter(args, 3, false);
        Object r = null;
        Object eol = null;
        super.enterHash(env, cursor, type, _pClass, false);
        if (toObjectR(cursor).accessProp(this, env).name("skipChildren").getBool()) {
            toObjectR(cursor).accessProp(this, env).name("skipChildren").set(false);
            eol = " class=sf-dump-compact>";

        } else if (toObjectR(this).accessProp(this, env).name("expandNextHash").getBool()) {
            toObjectR(this).accessProp(this, env).name("expandNextHash").set(false);
            eol = " class=sf-dump-expanded>";

        } else {
            eol = ">";
        }

        if (ZVal.isTrue(hasChild)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("line")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value(),
                                            env)
                                    + "<samp");
            if (toObjectR(cursor).accessProp(this, env).name("refIndex").getBool()) {
                r =
                        ZVal.assign(
                                ZVal.strictNotEqualityCheck(Cursor.CONST_HASH_OBJECT, "!==", type)
                                        ? ZVal.subtract(
                                                1,
                                                ZVal.strictNotEqualityCheck(
                                                        Cursor.CONST_HASH_RESOURCE, "!==", type))
                                        : 2);
                r =
                        toStringR(r, env)
                                + toStringR(
                                        ZVal.toBool(r)
                                                        && ZVal.toBool(
                                                                ZVal.isLessThan(
                                                                        0,
                                                                        '<',
                                                                        toObjectR(cursor)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name(
                                                                                        "softRefHandle")
                                                                                .value()))
                                                ? toObjectR(cursor)
                                                        .accessProp(this, env)
                                                        .name("softRefHandle")
                                                        .value()
                                                : toObjectR(cursor)
                                                        .accessProp(this, env)
                                                        .name("refIndex")
                                                        .value(),
                                        env);
                toObjectR(this)
                        .accessProp(this, env)
                        .name("line")
                        .set(
                                toStringR(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("line")
                                                        .value(),
                                                env)
                                        + toStringR(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(" id=%s-ref%s", this.dumpId, r)
                                                        .value(),
                                                env));
            }

            toObjectR(this)
                    .accessProp(this, env)
                    .name("line")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value(),
                                            env)
                                    + toStringR(eol, env));
            this.dumpLine(env, toObjectR(cursor).accessProp(this, env).name("depth").value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "class")
    @ConvertedParameter(index = 3, name = "hasChild")
    @ConvertedParameter(index = 4, name = "cut")
    public Object leaveHash(RuntimeEnv env, Object... args) {
        Object cursor = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object _pClass = assignParameter(args, 2, false);
        Object hasChild = assignParameter(args, 3, false);
        Object cut = assignParameter(args, 4, false);
        env.callMethod(this, "dumpEllipsis", HtmlDumper.class, cursor, hasChild, cut);
        if (ZVal.isTrue(hasChild)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("line")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value(),
                                            env)
                                    + "</samp>");
        }

        super.leaveHash(env, cursor, type, _pClass, hasChild, 0);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "style")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "attr", defaultValue = "", defaultValueType = "array")
    protected Object style(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/var-dumper/Dumper")
                        .setFile("/vendor/symfony/var-dumper/Dumper/HtmlDumper.php");
        Object style = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        ReferenceContainer attr = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == attr.getObject()) {
            attr.setObject(ZVal.newArray());
        }
        Object c = null;
        Object tail = null;
        Object label = null;
        Object target = null;
        Object r = null;
        ReferenceContainer v = new BasicReferenceContainer(null);
        Object href = null;
        Object map = null;
        Object _pClass = null;
        if (ZVal.strictEqualityCheck("", "===", value)) {
            return "";
        }

        v.setObject(esc.f.env(env).call(value).value());
        if (ZVal.strictEqualityCheck("ref", "===", style)) {
            if (arrayActionR(ArrayAction.EMPTY, attr, env, "count")) {
                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call("<a class=sf-dump-ref>%s</a>", v.getObject())
                                .value());
            }

            r =
                    toStringR(
                                    ZVal.strictNotEqualityCheck("#", "!==", v.arrayGet(env, 0))
                                            ? ZVal.subtract(
                                                    1,
                                                    ZVal.strictNotEqualityCheck(
                                                            "@", "!==", v.arrayGet(env, 0)))
                                            : 2,
                                    env)
                            + toStringR(function_substr.f.env(env).call(value, 1).value(), env);
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<a class=sf-dump-ref href=#%s-ref%s title=\"%d occurrences\">%s</a>",
                                    this.dumpId,
                                    r,
                                    ZVal.add(1, attr.arrayGet(env, "count")),
                                    v.getObject())
                            .value());
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck("const", "===", style))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, attr, env, "value"))) {
            style =
                    toStringR(style, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " title=\"%s\"",
                                                    esc.f
                                                            .env(env)
                                                            .call(
                                                                    function_is_scalar
                                                                                    .f
                                                                                    .env(env)
                                                                                    .call(
                                                                                            attr
                                                                                                    .arrayGet(
                                                                                                            env,
                                                                                                            "value"))
                                                                                    .getBool()
                                                                            ? attr.arrayGet(
                                                                                    env, "value")
                                                                            : NamespaceGlobal
                                                                                    .json_encode
                                                                                    .env(env)
                                                                                    .call(
                                                                                            attr
                                                                                                    .arrayGet(
                                                                                                            env,
                                                                                                            "value"))
                                                                                    .value())
                                                            .value())
                                            .value(),
                                    env);

        } else if (ZVal.strictEqualityCheck("public", "===", style)) {
            style =
                    toStringR(style, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " title=\"%s\"",
                                                    arrayActionR(
                                                                    ArrayAction.EMPTY,
                                                                    attr,
                                                                    env,
                                                                    "dynamic")
                                                            ? "Public property"
                                                            : "Runtime added dynamic property")
                                            .value(),
                                    env);

        } else if (ZVal.toBool(ZVal.strictEqualityCheck("str", "===", style))
                && ZVal.toBool(ZVal.isLessThan(1, '<', attr.arrayGet(env, "length")))) {
            style =
                    toStringR(style, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " title=\"%d%s characters\"",
                                                    attr.arrayGet(env, "length"),
                                                    ZVal.isTrue(attr.arrayGet(env, "binary"))
                                                            ? " binary or non-UTF-8"
                                                            : "")
                                            .value(),
                                    env);

        } else if (ZVal.toBool(ZVal.strictEqualityCheck("note", "===", style))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                false,
                                "!==",
                                c =
                                        NamespaceGlobal.strrpos
                                                .env(env)
                                                .call(v.getObject(), "\\")
                                                .value()))) {
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<abbr title=\"%s\" class=sf-dump-%s>%s</abbr>",
                                    v.getObject(),
                                    style,
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(v.getObject(), ZVal.add(c, 1))
                                            .value())
                            .value());

        } else if (ZVal.strictEqualityCheck("protected", "===", style)) {
            style = toStringR(style, env) + " title=\"Protected property\"";

        } else if (ZVal.toBool(ZVal.strictEqualityCheck("meta", "===", style))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, attr, env, "title"))) {
            style =
                    toStringR(style, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " title=\"%s\"",
                                                    esc.f
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            this,
                                                                            "utf8Encode",
                                                                            HtmlDumper.class,
                                                                            attr.arrayGet(
                                                                                    env, "title")))
                                                            .value())
                                            .value(),
                                    env);

        } else if (ZVal.strictEqualityCheck("private", "===", style)) {
            style =
                    toStringR(style, env)
                            + toStringR(
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    " title=\"Private property defined in class:&#10;`%s`\"",
                                                    esc.f
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            this,
                                                                            "utf8Encode",
                                                                            HtmlDumper.class,
                                                                            attr.arrayGet(
                                                                                    env, "class")))
                                                            .value())
                                            .value(),
                                    env);
        }

        map =
                ZVal.assign(
                        env.getRequestStaticProperties(CliDumper.RequestStaticProperties.class)
                                .controlCharsMap);
        if (arrayActionR(ArrayAction.ISSET, attr, env, "ellipsis")) {
            _pClass = "sf-dump-ellipsis";
            if (arrayActionR(ArrayAction.ISSET, attr, env, "ellipsis-type")) {
                _pClass =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "\"%s sf-dump-ellipsis-%s\"",
                                        _pClass, attr.arrayGet(env, "ellipsis-type"))
                                .value();
            }

            label =
                    esc.f
                            .env(env)
                            .call(
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    value,
                                                    ZVal.minusSign(attr.arrayGet(env, "ellipsis")))
                                            .value())
                            .value();
            style =
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    " title=\"",
                                    " title=\"" + toStringR(v.getObject(), env) + "\n",
                                    style)
                            .value();
            v.setObject(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<span class=%s>%s</span>",
                                    _pClass,
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    v.getObject(),
                                                    0,
                                                    ZVal.minusSign(
                                                            function_strlen
                                                                    .f
                                                                    .env(env)
                                                                    .call(label)
                                                                    .value()))
                                            .value())
                            .value());
            if (!arrayActionR(ArrayAction.EMPTY, attr, env, "ellipsis-tail")) {
                tail =
                        function_strlen
                                .f
                                .env(env)
                                .call(
                                        esc.f
                                                .env(env)
                                                .call(
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        value,
                                                                        ZVal.minusSign(
                                                                                attr.arrayGet(
                                                                                        env,
                                                                                        "ellipsis")),
                                                                        attr.arrayGet(
                                                                                env,
                                                                                "ellipsis-tail"))
                                                                .value())
                                                .value())
                                .value();
                v.setObject(
                        toStringR(v.getObject(), env)
                                + toStringR(
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "<span class=sf-dump-ellipsis>%s</span>%s",
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(label, 0, tail)
                                                                .value(),
                                                        function_substr
                                                                .f
                                                                .env(env)
                                                                .call(label, tail)
                                                                .value())
                                                .value(),
                                        env));

            } else {
                v.setObject(toStringR(v.getObject(), env) + toStringR(label, env));
            }
        }

        v.setObject(
                toStringR("<span class=sf-dump-" + toStringR(style, env) + ">", env)
                        + toStringR(
                                NamespaceGlobal.preg_replace_callback
                                        .env(env)
                                        .call(
                                                env.getRequestStaticProperties(
                                                                CliDumper.RequestStaticProperties
                                                                        .class)
                                                        .controlCharsRx,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Symfony\\Component\\VarDumper\\Dumper",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "c")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        ReferenceContainer c =
                                                                new BasicReferenceContainer(
                                                                        assignParameter(
                                                                                args, 0, false));
                                                        Object s = null;
                                                        ReferenceContainer i =
                                                                new BasicReferenceContainer(null);
                                                        ReferenceContainer map =
                                                                new BasicReferenceContainer(null);
                                                        map =
                                                                this.contextReferences
                                                                        .getReferenceContainer(
                                                                                "map");
                                                        s = "<span class=sf-dump-default>";
                                                        c.setObject(
                                                                ZVal.assign(
                                                                        c.arrayGet(
                                                                                env,
                                                                                i.setObject(0))));
                                                        do {
                                                            s =
                                                                    toStringR(s, env)
                                                                            + toStringR(
                                                                                    arrayActionR(
                                                                                                    ArrayAction
                                                                                                            .ISSET,
                                                                                                    map,
                                                                                                    env,
                                                                                                    c
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    i
                                                                                                                            .getObject()))
                                                                                            ? map
                                                                                                    .arrayGet(
                                                                                                            env,
                                                                                                            c
                                                                                                                    .arrayGet(
                                                                                                                            env,
                                                                                                                            i
                                                                                                                                    .getObject()))
                                                                                            : function_sprintf
                                                                                                    .f
                                                                                                    .env(
                                                                                                            env)
                                                                                                    .call(
                                                                                                            "\\x%02X",
                                                                                                            NamespaceGlobal
                                                                                                                    .ord
                                                                                                                    .env(
                                                                                                                            env)
                                                                                                                    .call(
                                                                                                                            c
                                                                                                                                    .arrayGet(
                                                                                                                                            env,
                                                                                                                                            i
                                                                                                                                                    .getObject()))
                                                                                                                    .value())
                                                                                                    .value(),
                                                                                    env);

                                                        } while (arrayActionR(
                                                                ArrayAction.ISSET,
                                                                c,
                                                                env,
                                                                i.setObject(
                                                                        ZVal.increment(
                                                                                i.getObject()))));

                                                        return ZVal.assign(
                                                                toStringR(s, env) + "</span>");
                                                    }
                                                }.use("map", map),
                                                v.getObject())
                                        .value(),
                                env)
                        + "</span>");
        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, attr, env, "file"))
                && ZVal.toBool(
                        href =
                                this.getSourceLink(
                                        env,
                                        attr.arrayGet(env, "file"),
                                        arrayActionR(ArrayAction.ISSET, attr, env, "line")
                                                ? attr.arrayGet(env, "line")
                                                : 0))) {
            attr.arrayAccess(env, "href").set(href);
        }

        if (arrayActionR(ArrayAction.ISSET, attr, env, "href")) {
            target =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, attr, env, "file")
                                    ? ""
                                    : " target=\"_blank\"");
            v.setObject(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<a href=\"%s\"%s rel=\"noopener noreferrer\">%s</a>",
                                    esc.f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            this,
                                                            "utf8Encode",
                                                            HtmlDumper.class,
                                                            attr.arrayGet(env, "href")))
                                            .value(),
                                    target,
                                    v.getObject())
                            .value());
        }

        if (arrayActionR(ArrayAction.ISSET, attr, env, "lang")) {
            v.setObject(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<code class=\"%s\">%s</code>",
                                    esc.f.env(env).call(attr.arrayGet(env, "lang")).value(),
                                    v.getObject())
                            .value());
        }

        return ZVal.assign(v.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "depth")
    @ConvertedParameter(
        index = 1,
        name = "endOfValue",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object dumpLine(RuntimeEnv env, Object... args) {
        Object depth = assignParameter(args, 0, false);
        Object endOfValue = assignParameter(args, 1, true);
        if (null == endOfValue) {
            endOfValue = false;
        }
        ReferenceContainer ___args = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(-1, "===", this.lastDepth)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("line")
                    .set(
                            toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            this.dumpPrefix,
                                                            this.dumpId,
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("indentPad")
                                                                    .value())
                                                    .value(),
                                            env)
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value(),
                                            env));
        }

        if (ZVal.strictNotEqualityCheck(
                this.headerIsDumped,
                "!==",
                ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                toObjectR(this).accessProp(this, env).name("outputStream").value())
                        ? toObjectR(this).accessProp(this, env).name("outputStream").value()
                        : toObjectR(this).accessProp(this, env).name("lineDumper").value())) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("line")
                    .set(
                            toStringR(this.getDumpHeader(env), env)
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value(),
                                            env));
        }

        if (ZVal.strictEqualityCheck(-1, "===", depth)) {
            ___args.setObject(
                    ZVal.newArray(new ZPair(0, "\"" + toStringR(this.dumpId, env) + "\"")));
            if (ZVal.isTrue(this.extraDisplayOptions)) {
                ___args.arrayAppend(env)
                        .set(
                                NamespaceGlobal.json_encode
                                        .env(env)
                                        .call(this.extraDisplayOptions, 16)
                                        .value());
            }

            toObjectR(this)
                    .accessProp(this, env)
                    .name("line")
                    .set(
                            toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value(),
                                            env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            function_str_replace
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            "\"%s\"",
                                                                            "%s", this.dumpSuffix)
                                                                    .value(),
                                                            NamespaceGlobal.implode
                                                                    .env(env)
                                                                    .call(", ", ___args.getObject())
                                                                    .value())
                                                    .value(),
                                            env));
        }

        this.lastDepth = depth;
        toObjectR(this)
                .accessProp(this, env)
                .name("line")
                .set(
                        NamespaceGlobal.mb_convert_encoding
                                .env(env)
                                .call(
                                        toObjectR(this).accessProp(this, env).name("line").value(),
                                        "HTML-ENTITIES",
                                        "UTF-8")
                                .value());
        if (ZVal.strictEqualityCheck(-1, "===", depth)) {
            StaticMethodUtils.callNonStaticMethodStatically(
                    env, AbstractDumper.class, "dumpLine", 0);
        }

        StaticMethodUtils.callNonStaticMethodStatically(
                env, AbstractDumper.class, "dumpLine", depth);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    @ConvertedParameter(index = 1, name = "line")
    private Object getSourceLink(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object line = assignParameter(args, 1, false);
        ReferenceContainer options = new BasicReferenceContainer(null);
        Object fmt = null;
        options.setObject(ZVal.add(this.extraDisplayOptions, this.displayOptions));
        if (ZVal.isTrue(fmt = ZVal.assign(options.arrayGet(env, "fileLinkFormat")))) {
            return ZVal.assign(
                    function_is_string.f.env(env).call(fmt).getBool()
                            ? NamespaceGlobal.strtr
                                    .env(env)
                                    .call(
                                            fmt,
                                            ZVal.newArray(
                                                    new ZPair("%f", file), new ZPair("%l", line)))
                                    .value()
                            : env.callMethod(fmt, "format", HtmlDumper.class, file, line));
        }

        return ZVal.assign(false);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Dumper\\HtmlDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends CliDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultOutput = "php://output";
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Dumper\\HtmlDumper")
                    .setLookup(
                            HtmlDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "collapseNextHash",
                            "colors",
                            "colors",
                            "decimalPoint",
                            "displayOptions",
                            "dumpHeader",
                            "dumpId",
                            "dumpPrefix",
                            "dumpSuffix",
                            "expandNextHash",
                            "extraDisplayOptions",
                            "flags",
                            "headerIsDumped",
                            "indentPad",
                            "lastDepth",
                            "line",
                            "lineDumper",
                            "maxStringWidth",
                            "outputStream",
                            "styles",
                            "styles")
                    .setStaticPropertyNames("defaultOutput")
                    .setFilename("vendor/symfony/var-dumper/Dumper/HtmlDumper.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface")
                    .addInterface("Symfony\\Component\\VarDumper\\Cloner\\DumperInterface")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Dumper\\CliDumper")
                    .addExtendsClass("Symfony\\Component\\VarDumper\\Dumper\\AbstractDumper")
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
