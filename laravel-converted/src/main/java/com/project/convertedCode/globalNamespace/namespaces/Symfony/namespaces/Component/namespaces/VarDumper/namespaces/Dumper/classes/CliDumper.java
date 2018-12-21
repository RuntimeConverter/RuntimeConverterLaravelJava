package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_resource;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Cursor;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fopen;
import com.project.convertedCode.globalNamespace.functions.sapi_windows_vt100_support;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.AbstractDumper;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_parse_str;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/CliDumper.php

*/

public class CliDumper extends AbstractDumper {

    public Object colors = null;

    public Object maxStringWidth = 0;

    public Object styles =
            ZVal.newArray(
                    new ZPair("default", "38;5;208"),
                    new ZPair("num", "1;38;5;38"),
                    new ZPair("const", "1;38;5;208"),
                    new ZPair("str", "1;38;5;113"),
                    new ZPair("note", "38;5;38"),
                    new ZPair("ref", "38;5;247"),
                    new ZPair("public", ""),
                    new ZPair("protected", ""),
                    new ZPair("private", ""),
                    new ZPair("meta", "38;5;170"),
                    new ZPair("key", "38;5;113"),
                    new ZPair("index", "38;5;38"));

    public Object collapseNextHash = false;

    public Object expandNextHash = false;

    public CliDumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CliDumper.class) {
            this.__construct(env, args);
        }
    }

    public CliDumper(NoConstructor n) {
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
        super.__construct(env, output, charset, flags);
        if (ZVal.toBool(ZVal.strictEqualityCheck("\\", "===", "/"))
                && ZVal.toBool(!ZVal.isTrue(this.isWindowsTrueColor(env)))) {
            this.setStyles(
                    env,
                    ZVal.newArray(
                            new ZPair("default", "31"),
                            new ZPair("num", "1;34"),
                            new ZPair("const", "1;31"),
                            new ZPair("str", "1;32"),
                            new ZPair("note", "34"),
                            new ZPair("ref", "1;30"),
                            new ZPair("meta", "35"),
                            new ZPair("key", "32"),
                            new ZPair("index", "34")));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "colors")
    public Object setColors(RuntimeEnv env, Object... args) {
        Object colors = assignParameter(args, 0, false);
        this.colors = ZVal.toBool(colors);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "maxStringWidth")
    public Object setMaxStringWidth(RuntimeEnv env, Object... args) {
        Object maxStringWidth = assignParameter(args, 0, false);
        this.maxStringWidth = ZVal.toLong(maxStringWidth);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "styles", typeHint = "array")
    public Object setStyles(RuntimeEnv env, Object... args) {
        Object styles = assignParameter(args, 0, false);
        this.styles = ZVal.add(styles, this.styles);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "value")
    public Object dumpScalar(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object cursor = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        Object style = null;
        Object attr = null;
        this.dumpKey(env, cursor);
        style = "const";
        attr = ZVal.assign(toObjectR(cursor).accessProp(this, env).name("attr").value());
        SwitchEnumType144 switchVariable144 =
                ZVal.getEnum(
                        type,
                        SwitchEnumType144.DEFAULT_CASE,
                        SwitchEnumType144.STRING_default,
                        "default",
                        SwitchEnumType144.STRING_integer,
                        "integer",
                        SwitchEnumType144.STRING_double,
                        "double",
                        SwitchEnumType144.STRING_NULL,
                        "NULL",
                        SwitchEnumType144.STRING_boolean,
                        "boolean");
        switch (switchVariable144) {
            case STRING_default:
                style = "default";
                break;
            case STRING_integer:
                style = "num";
                break;
            case STRING_double:
                style = "num";
                SwitchEnumType145 switchVariable145 =
                        ZVal.getEnum(
                                true,
                                SwitchEnumType145.DEFAULT_CASE,
                                SwitchEnumType145.DYNAMIC_TYPE_423,
                                ZVal.strictEqualityCheck(
                                        function_constant.get(env, "INF"), "===", value),
                                SwitchEnumType145.MINUS_null,
                                ZVal.strictEqualityCheck(
                                        ZVal.minusSign(function_constant.get(env, "INF")),
                                        "===",
                                        value),
                                SwitchEnumType145.DYNAMIC_TYPE_424,
                                NamespaceGlobal.is_nan.env(env).call(value).value());
                switch (switchVariable145) {
                    case DYNAMIC_TYPE_423:
                        value = "INF";
                        break;
                    case MINUS_null:
                        value = "-INF";
                        break;
                    case DYNAMIC_TYPE_424:
                        value = "NAN";
                        break;
                    case DEFAULT_CASE:
                        value = ZVal.assign(toStringR(value, env));
                        if (ZVal.strictEqualityCheck(
                                false,
                                "===",
                                function_strpos
                                        .f
                                        .env(env)
                                        .call(
                                                value,
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("decimalPoint")
                                                        .value())
                                        .value())) {
                            value =
                                    toStringR(value, env)
                                            + toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("decimalPoint")
                                                            .value(),
                                                    env)
                                            + "0";
                        }

                        break;
                }
                ;
                break;
            case STRING_NULL:
                value = "null";
                break;
            case STRING_boolean:
                value = ZVal.assign(ZVal.isTrue(value) ? "true" : "false");
                break;
            case DEFAULT_CASE:
                attr =
                        ZAssignment.add(
                                "+=",
                                attr,
                                ZVal.newArray(
                                        new ZPair(
                                                "value",
                                                env.callMethod(
                                                        this,
                                                        "utf8Encode",
                                                        CliDumper.class,
                                                        value))));
                value = env.callMethod(this, "utf8Encode", CliDumper.class, type);
                break;
        }
        ;
        toObjectR(this)
                .accessProp(this, env)
                .name("line")
                .set(
                        toStringR(toObjectR(this).accessProp(this, env).name("line").value(), env)
                                + toStringR(this.style(env, style, value, attr), env));
        this.endValue(env, cursor);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "str")
    @ConvertedParameter(index = 2, name = "bin")
    @ConvertedParameter(index = 3, name = "cut")
    public Object dumpString(RuntimeEnv env, Object... args) {
        Object cursor = assignParameter(args, 0, false);
        ReferenceContainer str = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object bin = assignParameter(args, 2, false);
        Object cut = assignParameter(args, 3, false);
        Object lineCut = null;
        Object len = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer attr = new BasicReferenceContainer(null);
        Object m = null;
        this.dumpKey(env, cursor);
        attr.setObject(ZVal.assign(toObjectR(cursor).accessProp(this, env).name("attr").value()));
        if (ZVal.isTrue(bin)) {
            str.setObject(env.callMethod(this, "utf8Encode", CliDumper.class, str.getObject()));
        }

        if (ZVal.strictEqualityCheck("", "===", str.getObject())) {
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
                                    + "\"\"");
            this.endValue(env, cursor);

        } else {
            attr.setObject(
                    ZAssignment.add(
                            "+=",
                            attr.getObject(),
                            ZVal.newArray(
                                    new ZPair(
                                            "length",
                                            ZVal.isLessThanOrEqualTo(0, "<=", cut)
                                                    ? ZVal.add(
                                                            NamespaceGlobal.mb_strlen
                                                                    .env(env)
                                                                    .call(str.getObject(), "UTF-8")
                                                                    .value(),
                                                            cut)
                                                    : 0),
                                    new ZPair("binary", bin))));
            str.setObject(function_explode.f.env(env).call("\n", str.getObject()).value());
            if (ZVal.toBool(
                            ZVal.toBool(arrayActionR(ArrayAction.ISSET, str, env, 1))
                                    && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, str, env, 2)))
                    && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, str, env, 1, 0))) {
                arrayActionR(ArrayAction.UNSET, str, env, 1);
                str.arrayAccess(env, 0).set(toStringR(str.arrayGet(env, 0), env) + "\n");
            }

            m = ZVal.subtract(function_count.f.env(env).call(str.getObject()).value(), 1);
            i.setObject(ZVal.assign(lineCut = 0));
            if (ZVal.isTrue(
                    ZVal.toLong(CONST_DUMP_STRING_LENGTH)
                            & ZVal.toLong(
                                    toObjectR(this).accessProp(this, env).name("flags").value()))) {
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
                                        + "("
                                        + toStringR(attr.arrayGet(env, "length"), env)
                                        + ") ");
            }

            if (ZVal.isTrue(bin)) {
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
                                        + "b");
            }

            if (ZVal.isTrue(m)) {
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
                                        + "\"\"\"");
                this.dumpLine(env, toObjectR(cursor).accessProp(this, env).name("depth").value());

            } else {
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
                                        + "\"");
            }

            for (ZPair zpairResult2226 : ZVal.getIterable(str.getObject(), env, true)) {
                str.setObject(ZVal.assign(zpairResult2226.getValue()));
                if (ZVal.isLessThan(i.getObject(), '<', m)) {
                    str.setObject(toStringR(str.getObject(), env) + "\n");
                }

                if (ZVal.toBool(ZVal.isLessThan(0, '<', this.maxStringWidth))
                        && ZVal.toBool(
                                ZVal.isLessThan(
                                        this.maxStringWidth,
                                        '<',
                                        len =
                                                NamespaceGlobal.mb_strlen
                                                        .env(env)
                                                        .call(str.getObject(), "UTF-8")
                                                        .value()))) {
                    str.setObject(
                            NamespaceGlobal.mb_substr
                                    .env(env)
                                    .call(str.getObject(), 0, this.maxStringWidth, "UTF-8")
                                    .value());
                    lineCut = ZVal.subtract(len, this.maxStringWidth);
                }

                if (ZVal.toBool(m)
                        && ZVal.toBool(
                                ZVal.isLessThan(
                                        0,
                                        '<',
                                        toObjectR(cursor)
                                                .accessProp(this, env)
                                                .name("depth")
                                                .value()))) {
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
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("indentPad")
                                                            .value(),
                                                    env));
                }

                if (ZVal.strictNotEqualityCheck("", "!==", str.getObject())) {
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
                                                    this.style(
                                                            env,
                                                            "str",
                                                            str.getObject(),
                                                            attr.getObject()),
                                                    env));
                }

                if (ZVal.equalityCheck(ZVal.postIncrement(i), m)) {
                    if (ZVal.isTrue(m)) {
                        if (ZVal.strictNotEqualityCheck("", "!==", str.getObject())) {
                            this.dumpLine(
                                    env,
                                    toObjectR(cursor).accessProp(this, env).name("depth").value());
                            if (ZVal.isLessThan(
                                    0,
                                    '<',
                                    toObjectR(cursor)
                                            .accessProp(this, env)
                                            .name("depth")
                                            .value())) {
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
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("indentPad")
                                                                        .value(),
                                                                env));
                            }
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
                                                + "\"\"\"");

                    } else {
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
                                                + "\"");
                    }

                    if (ZVal.isLessThan(cut, '<', 0)) {
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
                                                + "\u2026");
                        lineCut = 0;

                    } else if (ZVal.isTrue(cut)) {
                        lineCut = ZAssignment.add("+=", lineCut, cut);
                    }
                }

                if (ZVal.isTrue(lineCut)) {
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
                                            + "\u2026"
                                            + toStringR(lineCut, env));
                    lineCut = 0;
                }

                if (ZVal.isGreaterThan(i.getObject(), '>', m)) {
                    this.endValue(env, cursor);

                } else {
                    this.dumpLine(
                            env, toObjectR(cursor).accessProp(this, env).name("depth").value());
                }
            }
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
    public Object enterHash(RuntimeEnv env, Object... args) {
        Object cursor = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object _pClass = assignParameter(args, 2, false);
        Object hasChild = assignParameter(args, 3, false);
        Object prefix = null;
        this.dumpKey(env, cursor);
        if (ZVal.isTrue(this.collapseNextHash)) {
            toObjectR(cursor).accessProp(this, env).name("skipChildren").set(true);
            this.collapseNextHash = hasChild = false;
        }

        _pClass = env.callMethod(this, "utf8Encode", CliDumper.class, _pClass);
        if (ZVal.strictEqualityCheck(Cursor.CONST_HASH_OBJECT, "===", type)) {
            prefix =
                    ZVal.assign(
                            ZVal.toBool(_pClass)
                                            && ZVal.toBool(
                                                    ZVal.strictNotEqualityCheck(
                                                            "stdClass", "!==", _pClass))
                                    ? toStringR(this.style(env, "note", _pClass), env) + " {"
                                    : "{");

        } else if (ZVal.strictEqualityCheck(Cursor.CONST_HASH_RESOURCE, "===", type)) {
            prefix =
                    toStringR(this.style(env, "note", toStringR(_pClass, env) + " resource"), env)
                            + toStringR(ZVal.isTrue(hasChild) ? " {" : " ", env);

        } else {
            prefix =
                    ZVal.assign(
                            ZVal.toBool(_pClass)
                                            && ZVal.toBool(
                                                    !ZVal.isTrue(
                                                            ZVal.toLong(CONST_DUMP_LIGHT_ARRAY)
                                                                    & ZVal.toLong(
                                                                            toObjectR(this)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name("flags")
                                                                                    .value())))
                                    ? toStringR(
                                                    this.style(
                                                            env,
                                                            "note",
                                                            "array:" + toStringR(_pClass, env)),
                                                    env)
                                            + " ["
                                    : "[");
        }

        if (ZVal.toBool(toObjectR(cursor).accessProp(this, env).name("softRefCount").value())
                || ZVal.toBool(
                        ZVal.isLessThan(
                                0,
                                '<',
                                toObjectR(cursor)
                                        .accessProp(this, env)
                                        .name("softRefHandle")
                                        .value()))) {
            prefix =
                    toStringR(prefix, env)
                            + toStringR(
                                    this.style(
                                            env,
                                            "ref",
                                            toStringR(
                                                            ZVal.strictEqualityCheck(
                                                                            Cursor
                                                                                    .CONST_HASH_RESOURCE,
                                                                            "===",
                                                                            type)
                                                                    ? "@"
                                                                    : "#",
                                                            env)
                                                    + toStringR(
                                                            ZVal.isLessThan(
                                                                            0,
                                                                            '<',
                                                                            toObjectR(cursor)
                                                                                    .accessProp(
                                                                                            this,
                                                                                            env)
                                                                                    .name(
                                                                                            "softRefHandle")
                                                                                    .value())
                                                                    ? toObjectR(cursor)
                                                                            .accessProp(this, env)
                                                                            .name("softRefHandle")
                                                                            .value()
                                                                    : toObjectR(cursor)
                                                                            .accessProp(this, env)
                                                                            .name("softRefTo")
                                                                            .value(),
                                                            env),
                                            ZVal.newArray(
                                                    new ZPair(
                                                            "count",
                                                            toObjectR(cursor)
                                                                    .accessProp(this, env)
                                                                    .name("softRefCount")
                                                                    .value()))),
                                    env);

        } else if (ZVal.toBool(
                        ZVal.toBool(
                                        toObjectR(cursor)
                                                .accessProp(this, env)
                                                .name("hardRefTo")
                                                .value())
                                && ZVal.toBool(
                                        !toObjectR(cursor)
                                                .accessProp(this, env)
                                                .name("refIndex")
                                                .getBool()))
                && ZVal.toBool(_pClass)) {
            prefix =
                    toStringR(prefix, env)
                            + toStringR(
                                    this.style(
                                            env,
                                            "ref",
                                            "&"
                                                    + toStringR(
                                                            toObjectR(cursor)
                                                                    .accessProp(this, env)
                                                                    .name("hardRefTo")
                                                                    .value(),
                                                            env),
                                            ZVal.newArray(
                                                    new ZPair(
                                                            "count",
                                                            toObjectR(cursor)
                                                                    .accessProp(this, env)
                                                                    .name("hardRefCount")
                                                                    .value()))),
                                    env);

        } else if (ZVal.toBool(!ZVal.isTrue(hasChild))
                && ZVal.toBool(ZVal.strictEqualityCheck(Cursor.CONST_HASH_RESOURCE, "===", type))) {
            prefix = function_substr.f.env(env).call(prefix, 0, -1).value();
        }

        toObjectR(this)
                .accessProp(this, env)
                .name("line")
                .set(
                        toStringR(toObjectR(this).accessProp(this, env).name("line").value(), env)
                                + toStringR(prefix, env));
        if (ZVal.isTrue(hasChild)) {
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
        this.dumpEllipsis(env, cursor, hasChild, cut);
        toObjectR(this)
                .accessProp(this, env)
                .name("line")
                .set(
                        toStringR(toObjectR(this).accessProp(this, env).name("line").value(), env)
                                + toStringR(
                                        ZVal.strictEqualityCheck(
                                                        Cursor.CONST_HASH_OBJECT, "===", type)
                                                ? "}"
                                                : ZVal.strictNotEqualityCheck(
                                                                Cursor.CONST_HASH_RESOURCE,
                                                                "!==",
                                                                type)
                                                        ? "]"
                                                        : ZVal.isTrue(hasChild) ? "}" : "",
                                        env));
        this.endValue(env, cursor);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    @ConvertedParameter(index = 1, name = "hasChild")
    @ConvertedParameter(index = 2, name = "cut")
    protected Object dumpEllipsis(RuntimeEnv env, Object... args) {
        Object cursor = assignParameter(args, 0, false);
        Object hasChild = assignParameter(args, 1, false);
        Object cut = assignParameter(args, 2, false);
        if (ZVal.isTrue(cut)) {
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
                                    + " \u2026");
            if (ZVal.isLessThan(0, '<', cut)) {
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
                                        + toStringR(cut, env));
            }

            if (ZVal.isTrue(hasChild)) {
                this.dumpLine(
                        env,
                        ZVal.add(toObjectR(cursor).accessProp(this, env).name("depth").value(), 1));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    protected Object dumpKey(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object cursor = assignParameter(args, 0, false);
        Object bin = null;
        Object style = null;
        ReferenceContainer attr = new BasicReferenceContainer(null);
        ReferenceContainer key = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                key.setObject(
                        ZVal.assign(
                                toObjectR(cursor)
                                        .accessProp(this, env)
                                        .name("hashKey")
                                        .value())))) {
            if (toObjectR(cursor).accessProp(this, env).name("hashKeyIsBinary").getBool()) {
                key.setObject(env.callMethod(this, "utf8Encode", CliDumper.class, key.getObject()));
            }

            attr.setObject(
                    ZVal.newArray(
                            new ZPair(
                                    "binary",
                                    toObjectR(cursor)
                                            .accessProp(this, env)
                                            .name("hashKeyIsBinary")
                                            .value())));
            bin =
                    ZVal.assign(
                            toObjectR(cursor)
                                            .accessProp(this, env)
                                            .name("hashKeyIsBinary")
                                            .getBool()
                                    ? "b"
                                    : "");
            style = "key";
            SwitchEnumType146 switchVariable146 =
                    ZVal.getEnum(
                            toObjectR(cursor).accessProp(this, env).name("hashType").value(),
                            SwitchEnumType146.DEFAULT_CASE,
                            SwitchEnumType146.DYNAMIC_TYPE_425,
                            Cursor.CONST_HASH_INDEXED,
                            SwitchEnumType146.DYNAMIC_TYPE_426,
                            Cursor.CONST_HASH_ASSOC,
                            SwitchEnumType146.DYNAMIC_TYPE_427,
                            Cursor.CONST_HASH_RESOURCE,
                            SwitchEnumType146.DYNAMIC_TYPE_428,
                            Cursor.CONST_HASH_OBJECT);
            switch (switchVariable146) {
                case DEFAULT_CASE:
                case DYNAMIC_TYPE_425:
                    if (ZVal.isTrue(
                            ZVal.toLong(CONST_DUMP_LIGHT_ARRAY)
                                    & ZVal.toLong(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("flags")
                                                    .value()))) {
                        break;
                    }

                    style = "index";
                case DYNAMIC_TYPE_426:
                    if (function_is_int.f.env(env).call(key.getObject()).getBool()) {
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
                                                        this.style(env, style, key.getObject()),
                                                        env)
                                                + " => ");

                    } else {
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
                                                + toStringR(bin, env)
                                                + "\""
                                                + toStringR(
                                                        this.style(env, style, key.getObject()),
                                                        env)
                                                + "\" => ");
                    }

                    break;
                case DYNAMIC_TYPE_427:
                    key.setObject("\u0000~\u0000" + toStringR(key.getObject(), env));
                case DYNAMIC_TYPE_428:
                    if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, key, env, 0))
                            || ZVal.toBool(
                                    ZVal.strictNotEqualityCheck(
                                            "\u0000", "!==", key.arrayGet(env, 0)))) {
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
                                                + "+"
                                                + toStringR(bin, env)
                                                + toStringR(
                                                        this.style(env, "public", key.getObject()),
                                                        env)
                                                + ": ");

                    } else if (ZVal.isLessThan(
                            0,
                            '<',
                            function_strpos
                                    .f
                                    .env(env)
                                    .call(key.getObject(), "\u0000", 1)
                                    .value())) {
                        key.setObject(
                                function_explode
                                        .f
                                        .env(env)
                                        .call(
                                                "\u0000",
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(key.getObject(), 1)
                                                        .value(),
                                                2)
                                        .value());
                        SwitchEnumType147 switchVariable147 =
                                ZVal.getEnum(
                                        key.arrayGet(env, 0, 0),
                                        SwitchEnumType147.DEFAULT_CASE,
                                        SwitchEnumType147.RESERVED_CHARS_2102430625_STRING__,
                                        "+",
                                        SwitchEnumType147.RESERVED_CHARS_822092813_STRING__,
                                        "~",
                                        SwitchEnumType147.RESERVED_CHARS_147171251_STRING__,
                                        "*");
                        switch (switchVariable147) {
                            case RESERVED_CHARS_2102430625_STRING__:
                                attr.arrayAccess(env, "dynamic").set(true);
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
                                                        + "+"
                                                        + toStringR(bin, env)
                                                        + "\""
                                                        + toStringR(
                                                                this.style(
                                                                        env,
                                                                        "public",
                                                                        key.arrayGet(env, 1),
                                                                        attr.getObject()),
                                                                env)
                                                        + "\": ");
                                runtimeConverterBreakCount = 2;
                                runtimeConverterBreakCount--;
                                break;
                            case RESERVED_CHARS_822092813_STRING__:
                                style = "meta";
                                if (arrayActionR(ArrayAction.ISSET, key, env, 0, 1)) {
                                    function_parse_str
                                            .f
                                            .env(env)
                                            .addReferenceArgs(
                                                    new RuntimeArgsWithReferences().add(1, attr))
                                            .call(
                                                    function_substr
                                                            .f
                                                            .env(env)
                                                            .call(key.arrayGet(env, 0), 1)
                                                            .value(),
                                                    attr.getObject());
                                    attr.setObject(
                                            ZAssignment.add(
                                                    "+=",
                                                    attr.getObject(),
                                                    ZVal.newArray(
                                                            new ZPair(
                                                                    "binary",
                                                                    toObjectR(cursor)
                                                                            .accessProp(this, env)
                                                                            .name("hashKeyIsBinary")
                                                                            .value()))));
                                }

                                break;
                            case RESERVED_CHARS_147171251_STRING__:
                                style = "protected";
                                bin = "#" + toStringR(bin, env);
                                break;
                            case DEFAULT_CASE:
                                attr.arrayAccess(env, "class").set(key.arrayGet(env, 0));
                                style = "private";
                                bin = "-" + toStringR(bin, env);
                                break;
                        }
                        ;
                        if (arrayActionR(ArrayAction.ISSET, attr, env, "collapse")) {
                            if (ZVal.isTrue(attr.arrayGet(env, "collapse"))) {
                                this.collapseNextHash = true;

                            } else {
                                this.expandNextHash = true;
                            }
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
                                                + toStringR(bin, env)
                                                + toStringR(
                                                        this.style(
                                                                env,
                                                                style,
                                                                key.arrayGet(env, 1),
                                                                attr.getObject()),
                                                        env)
                                                + toStringR(
                                                        arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        attr,
                                                                        env,
                                                                        "separator")
                                                                ? attr.arrayGet(env, "separator")
                                                                : ": ",
                                                        env));

                    } else {
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
                                                + "-"
                                                + toStringR(bin, env)
                                                + "\""
                                                + toStringR(
                                                        this.style(
                                                                env,
                                                                "private",
                                                                key.getObject(),
                                                                ZVal.newArray(
                                                                        new ZPair("class", ""))),
                                                        env)
                                                + "\": ");
                    }

                    break;
            }
            ;
            if (toObjectR(cursor).accessProp(this, env).name("hardRefTo").getBool()) {
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
                                                this.style(
                                                        env,
                                                        "ref",
                                                        "&"
                                                                + toStringR(
                                                                        toObjectR(cursor)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "hardRefCount")
                                                                                        .getBool()
                                                                                ? toObjectR(cursor)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "hardRefTo")
                                                                                        .value()
                                                                                : "",
                                                                        env),
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        "count",
                                                                        toObjectR(cursor)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name(
                                                                                        "hardRefCount")
                                                                                .value()))),
                                                env)
                                        + " ");
            }
        }

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
                        .setFile("/vendor/symfony/var-dumper/Dumper/CliDumper.php");
        Object style = assignParameter(args, 0, false);
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer attr = new BasicReferenceContainer(assignParameter(args, 2, true));
        if (null == attr.getObject()) {
            attr.setObject(ZVal.newArray());
        }
        Object startCchr = null;
        ReferenceContainer cchrCount = new BasicReferenceContainer(null);
        Object prefix = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object pwd = null;
        Object map = null;
        Object endCchr = null;
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.colors)) {
            this.colors = this.supportsColors(env);
        }

        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, attr, env, "ellipsis"))
                && ZVal.toBool(arrayActionR(ArrayAction.ISSET, attr, env, "ellipsis-type"))) {
            prefix =
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    value.getObject(),
                                    0,
                                    ZVal.minusSign(attr.arrayGet(env, "ellipsis")))
                            .value();
            if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "cli", "===", "cli"))
                                                    && ZVal.toBool(
                                                            ZVal.strictEqualityCheck(
                                                                    "path",
                                                                    "===",
                                                                    attr.arrayGet(
                                                                            env, "ellipsis-type"))))
                                    && ZVal.toBool(
                                            arrayActionR(
                                                    ArrayAction.ISSET,
                                                    _SERVER,
                                                    env,
                                                    pwd =
                                                            ZVal.assign(
                                                                    ZVal.strictEqualityCheck(
                                                                                    "\\", "===",
                                                                                    "/")
                                                                            ? "CD"
                                                                            : "PWD"))))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    0,
                                    "===",
                                    function_strpos
                                            .f
                                            .env(env)
                                            .call(prefix, _SERVER.arrayGet(env, pwd))
                                            .value()))) {
                prefix =
                        "."
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        prefix,
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(_SERVER.arrayGet(env, pwd))
                                                                .value())
                                                .value(),
                                        env);
            }

            if (!arrayActionR(ArrayAction.EMPTY, attr, env, "ellipsis-tail")) {
                prefix =
                        toStringR(prefix, env)
                                + toStringR(
                                        function_substr
                                                .f
                                                .env(env)
                                                .call(
                                                        value.getObject(),
                                                        ZVal.minusSign(
                                                                attr.arrayGet(env, "ellipsis")),
                                                        attr.arrayGet(env, "ellipsis-tail"))
                                                .value(),
                                        env);
                value.setObject(
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        value.getObject(),
                                        ZVal.add(
                                                ZVal.minusSign(attr.arrayGet(env, "ellipsis")),
                                                attr.arrayGet(env, "ellipsis-tail")))
                                .value());

            } else {
                value.setObject(
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        value.getObject(),
                                        ZVal.minusSign(attr.arrayGet(env, "ellipsis")))
                                .value());
            }

            return ZVal.assign(
                    toStringR(this.style(env, "default", prefix), env)
                            + toStringR(this.style(env, style, value.getObject()), env));
        }

        style = ZVal.assign(new ReferenceClassProperty(this, "styles", env).arrayGet(env, style));
        map =
                ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .VarDumper
                                                .namespaces
                                                .Dumper
                                                .classes
                                                .CliDumper
                                                .RequestStaticProperties
                                                .class)
                                .controlCharsMap);
        startCchr =
                ZVal.assign(
                        ZVal.isTrue(this.colors)
                                ? "\u001B[m\u001B["
                                        + toStringR(
                                                new ReferenceClassProperty(this, "styles", env)
                                                        .arrayGet(env, "default"),
                                                env)
                                        + "m"
                                : "");
        endCchr =
                ZVal.assign(
                        ZVal.isTrue(this.colors)
                                ? "\u001B[m\u001B[" + toStringR(style, env) + "m"
                                : "");
        value.setObject(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(4, cchrCount))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .VarDumper
                                                        .namespaces
                                                        .Dumper
                                                        .classes
                                                        .CliDumper
                                                        .RequestStaticProperties
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
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer c =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        Object startCchr = null;
                                        Object s = null;
                                        ReferenceContainer i = new BasicReferenceContainer(null);
                                        ReferenceContainer map = new BasicReferenceContainer(null);
                                        Object endCchr = null;
                                        startCchr =
                                                this.contextReferences.getCapturedValue(
                                                        "startCchr");
                                        map = this.contextReferences.getReferenceContainer("map");
                                        endCchr =
                                                this.contextReferences.getCapturedValue("endCchr");
                                        s = ZVal.assign(startCchr);
                                        c.setObject(ZVal.assign(c.arrayGet(env, i.setObject(0))));
                                        do {
                                            s =
                                                    toStringR(s, env)
                                                            + toStringR(
                                                                    arrayActionR(
                                                                                    ArrayAction
                                                                                            .ISSET,
                                                                                    map,
                                                                                    env,
                                                                                    c.arrayGet(
                                                                                            env,
                                                                                            i
                                                                                                    .getObject()))
                                                                            ? map.arrayGet(
                                                                                    env,
                                                                                    c.arrayGet(
                                                                                            env,
                                                                                            i
                                                                                                    .getObject()))
                                                                            : function_sprintf
                                                                                    .f
                                                                                    .env(env)
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
                                                i.setObject(ZVal.increment(i.getObject()))));

                                        return ZVal.assign(
                                                toStringR(s, env) + toStringR(endCchr, env));
                                    }
                                }.use("startCchr", startCchr)
                                        .use("map", map)
                                        .use("endCchr", endCchr),
                                value.getObject(),
                                -1,
                                cchrCount.getObject())
                        .value());
        if (ZVal.isTrue(this.colors)) {
            if (ZVal.toBool(cchrCount.getObject())
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck("\u001B", "===", value.arrayGet(env, 0)))) {
                value.setObject(
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        value.getObject(),
                                        function_strlen.f.env(env).call(startCchr).value())
                                .value());

            } else {
                value.setObject(
                        toStringR("\u001B[" + toStringR(style, env) + "m", env)
                                + toStringR(value.getObject(), env));
            }

            if (ZVal.toBool(cchrCount.getObject())
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    endCchr,
                                    "===",
                                    function_substr
                                            .f
                                            .env(env)
                                            .call(
                                                    value.getObject(),
                                                    ZVal.minusSign(
                                                            function_strlen
                                                                    .f
                                                                    .env(env)
                                                                    .call(endCchr)
                                                                    .value()))
                                            .value()))) {
                value.setObject(
                        function_substr
                                .f
                                .env(env)
                                .call(
                                        value.getObject(),
                                        0,
                                        ZVal.minusSign(
                                                function_strlen.f.env(env).call(endCchr).value()))
                                .value());

            } else {
                value.setObject(
                        toStringR(value.getObject(), env)
                                + toStringR(
                                        "\u001B["
                                                + toStringR(
                                                        new ReferenceClassProperty(
                                                                        this, "styles", env)
                                                                .arrayGet(env, "default"),
                                                        env)
                                                + "m",
                                        env));
            }
        }

        return ZVal.assign(value.getObject());
    }

    @ConvertedMethod
    protected Object supportsColors(RuntimeEnv env, Object... args) {
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        ReferenceContainer h = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer colors = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(
                toObjectR(this).accessProp(this, env).name("outputStream").value(),
                "!==",
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .VarDumper
                                        .namespaces
                                        .Dumper
                                        .classes
                                        .CliDumper
                                        .RequestStaticProperties
                                        .class)
                        .defaultOutput)) {
            return ZVal.assign(
                    this.hasColorSupport(
                            env,
                            toObjectR(this).accessProp(this, env).name("outputStream").value()));
        }

        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Symfony
                                        .namespaces
                                        .Component
                                        .namespaces
                                        .VarDumper
                                        .namespaces
                                        .Dumper
                                        .classes
                                        .CliDumper
                                        .RequestStaticProperties
                                        .class)
                        .defaultColors)) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Symfony
                                            .namespaces
                                            .Component
                                            .namespaces
                                            .VarDumper
                                            .namespaces
                                            .Dumper
                                            .classes
                                            .CliDumper
                                            .RequestStaticProperties
                                            .class)
                            .defaultColors);
        }

        if (arrayActionR(ArrayAction.ISSET, _SERVER, env, "argv", 1)) {
            colors.setObject(ZVal.assign(_SERVER.arrayGet(env, "argv")));
            i.setObject(function_count.f.env(env).call(colors.getObject()).value());
            while (ZVal.isGreaterThan(ZVal.preDecrement(i), '>', 0)) {
                if (arrayActionR(ArrayAction.ISSET, colors, env, i.getObject(), 5)) {
                    switch (toStringR(colors.arrayGet(env, i.getObject()))) {
                        case "--ansi":
                        case "--color":
                        case "--color=yes":
                        case "--color=force":
                        case "--color=always":
                            return ZVal.assign(
                                    env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Symfony
                                                                    .namespaces
                                                                    .Component
                                                                    .namespaces
                                                                    .VarDumper
                                                                    .namespaces
                                                                    .Dumper
                                                                    .classes
                                                                    .CliDumper
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .defaultColors =
                                            true);
                        case "--no-ansi":
                        case "--color=no":
                        case "--color=none":
                        case "--color=never":
                            return ZVal.assign(
                                    env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Symfony
                                                                    .namespaces
                                                                    .Component
                                                                    .namespaces
                                                                    .VarDumper
                                                                    .namespaces
                                                                    .Dumper
                                                                    .classes
                                                                    .CliDumper
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .defaultColors =
                                            false);
                    }
                    ;
                }
            }
        }

        h.setObject(
                ZVal.add(
                        NamespaceGlobal.stream_get_meta_data
                                .env(env)
                                .call(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("outputStream")
                                                .value())
                                .value(),
                        ZVal.newArray(new ZPair("wrapper_type", ZVal.getNull()))));
        h.setObject(
                ZVal.assign(
                        ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "Output",
                                                        "===",
                                                        h.arrayGet(env, "stream_type")))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "PHP",
                                                        "===",
                                                        h.arrayGet(env, "wrapper_type")))
                                ? function_fopen.f.env(env).call("php://stdout", "wb").value()
                                : toObjectR(this)
                                        .accessProp(this, env)
                                        .name("outputStream")
                                        .value()));
        return ZVal.assign(
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Symfony
                                                .namespaces
                                                .Component
                                                .namespaces
                                                .VarDumper
                                                .namespaces
                                                .Dumper
                                                .classes
                                                .CliDumper
                                                .RequestStaticProperties
                                                .class)
                                .defaultColors =
                        this.hasColorSupport(env, h.getObject()));
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
        if (ZVal.isTrue(this.colors)) {
            toObjectR(this)
                    .accessProp(this, env)
                    .name("line")
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "\u001B[%sm%s\u001B[m",
                                            new ReferenceClassProperty(this, "styles", env)
                                                    .arrayGet(env, "default"),
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("line")
                                                    .value())
                                    .value());
        }

        super.dumpLine(env, depth);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    protected Object endValue(RuntimeEnv env, Object... args) {
        Object cursor = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                Stub.CONST_ARRAY_INDEXED,
                                "===",
                                toObjectR(cursor).accessProp(this, env).name("hashType").value()))
                || ZVal.toBool(
                        ZVal.strictEqualityCheck(
                                Stub.CONST_ARRAY_ASSOC,
                                "===",
                                toObjectR(cursor)
                                        .accessProp(this, env)
                                        .name("hashType")
                                        .value()))) {
            if (ZVal.toBool(
                            ZVal.toLong(CONST_DUMP_TRAILING_COMMA)
                                    & ZVal.toLong(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("flags")
                                                    .value()))
                    && ZVal.toBool(
                            ZVal.isLessThan(
                                    0,
                                    '<',
                                    toObjectR(cursor)
                                            .accessProp(this, env)
                                            .name("depth")
                                            .value()))) {
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
                                        + ",");

            } else if (ZVal.toBool(
                            ZVal.toLong(CONST_DUMP_COMMA_SEPARATOR)
                                    & ZVal.toLong(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("flags")
                                                    .value()))
                    && ZVal.toBool(
                            ZVal.isLessThan(
                                    1,
                                    '<',
                                    ZVal.subtract(
                                            toObjectR(cursor)
                                                    .accessProp(this, env)
                                                    .name("hashLength")
                                                    .value(),
                                            toObjectR(cursor)
                                                    .accessProp(this, env)
                                                    .name("hashIndex")
                                                    .value())))) {
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
                                        + ",");
            }
        }

        this.dumpLine(env, toObjectR(cursor).accessProp(this, env).name("depth").value(), true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stream")
    private Object hasColorSupport(RuntimeEnv env, Object... args) {
        Object stream = assignParameter(args, 0, false);
        ReferenceContainer stat = new BasicReferenceContainer(null);
        if (ZVal.toBool(!function_is_resource.f.env(env).call(stream).getBool())
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                "stream",
                                "!==",
                                NamespaceGlobal.get_resource_type.env(env).call(stream).value()))) {
            return ZVal.assign(false);
        }

        if (ZVal.strictEqualityCheck("/", "===", "\\")) {
            return ZVal.assign(
                    ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.toBool(
                                                                                    function_function_exists
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    "sapi_windows_vt100_support")
                                                                                            .value())
                                                                            && ZVal.toBool(
                                                                                    sapi_windows_vt100_support
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    stream)
                                                                                            .value()))
                                                            || ZVal.toBool(
                                                                    ZVal.strictNotEqualityCheck(
                                                                            false,
                                                                            "!==",
                                                                            NamespaceGlobal.getenv
                                                                                    .env(env)
                                                                                    .call("ANSICON")
                                                                                    .value())))
                                            || ZVal.toBool(
                                                    ZVal.strictEqualityCheck(
                                                            "ON",
                                                            "===",
                                                            NamespaceGlobal.getenv
                                                                    .env(env)
                                                                    .call("ConEmuANSI")
                                                                    .value())))
                            || ZVal.toBool(
                                    ZVal.strictEqualityCheck(
                                            "xterm",
                                            "===",
                                            NamespaceGlobal.getenv.env(env).call("TERM").value())));
        }

        if (function_function_exists.f.env(env).call("stream_isatty").getBool()) {
            return ZVal.assign(NamespaceGlobal.stream_isatty.env(env).call(stream).value());
        }

        if (function_function_exists.f.env(env).call("posix_isatty").getBool()) {
            return ZVal.assign(NamespaceGlobal.posix_isatty.env(env).call(stream).value());
        }

        stat.setObject(NamespaceGlobal.fstat.env(env).call(stream).value());
        return ZVal.assign(
                ZVal.isTrue(stat.getObject())
                        ? ZVal.strictEqualityCheck(
                                8192,
                                "===",
                                ZVal.toLong(stat.arrayGet(env, "mode")) & ZVal.toLong(61440))
                        : false);
    }

    @ConvertedMethod
    private Object isWindowsTrueColor(RuntimeEnv env, Object... args) {
        Object result = null;
        Object version = null;
        result =
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.isLessThanOrEqualTo(
                                                        183,
                                                        "<=",
                                                        NamespaceGlobal.getenv
                                                                .env(env)
                                                                .call("ANSICON_VER")
                                                                .value()))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "ON",
                                                        "===",
                                                        NamespaceGlobal.getenv
                                                                .env(env)
                                                                .call("ConEmuANSI")
                                                                .value())))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        "xterm",
                                        "===",
                                        NamespaceGlobal.getenv.env(env).call("TERM").value()));
        if (ZVal.toBool(!ZVal.isTrue(result))
                && ZVal.toBool(ZVal.isGreaterThanOrEqualTo(70211, ">=", 70200))) {
            version =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s.%s.%s",
                                    function_constant.get(env, "PHP_WINDOWS_VERSION_MAJOR"),
                                    function_constant.get(env, "PHP_WINDOWS_VERSION_MINOR"),
                                    function_constant.get(env, "PHP_WINDOWS_VERSION_BUILD"))
                            .value();
            result = ZVal.isGreaterThanOrEqualTo(version, ">=", "10.0.15063");
        }

        return ZVal.assign(result);
    }

    public static final Object CONST_class = "Symfony\\Component\\VarDumper\\Dumper\\CliDumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object defaultColors = null;

        public Object defaultOutput = "php://stdout";

        public Object controlCharsRx = "/[\\x00-\\x1F\\x7F]+/";

        public Object controlCharsMap =
                ZVal.newArray(
                        new ZPair("\t", "\\t"),
                        new ZPair("\n", "\\n"),
                        new ZPair("\u000B", "\\v"),
                        new ZPair("\f", "\\f"),
                        new ZPair("\r", "\\r"),
                        new ZPair("\u001B", "\\e"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\VarDumper\\Dumper\\CliDumper")
                    .setLookup(
                            CliDumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "collapseNextHash",
                            "colors",
                            "decimalPoint",
                            "expandNextHash",
                            "flags",
                            "indentPad",
                            "line",
                            "lineDumper",
                            "maxStringWidth",
                            "outputStream",
                            "styles")
                    .setStaticPropertyNames(
                            "controlCharsMap", "controlCharsRx", "defaultColors", "defaultOutput")
                    .setFilename("vendor/symfony/var-dumper/Dumper/CliDumper.php")
                    .addInterface("Symfony\\Component\\VarDumper\\Dumper\\DataDumperInterface")
                    .addInterface("Symfony\\Component\\VarDumper\\Cloner\\DumperInterface")
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

    private enum SwitchEnumType144 {
        STRING_default,
        STRING_integer,
        STRING_double,
        STRING_NULL,
        STRING_boolean,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType145 {
        DYNAMIC_TYPE_423,
        MINUS_null,
        DYNAMIC_TYPE_424,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType146 {
        DYNAMIC_TYPE_425,
        DYNAMIC_TYPE_426,
        DYNAMIC_TYPE_427,
        DYNAMIC_TYPE_428,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }

    private enum SwitchEnumType147 {
        RESERVED_CHARS_2102430625_STRING__,
        RESERVED_CHARS_822092813_STRING__,
        RESERVED_CHARS_147171251_STRING__,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
