package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.classes.CliDumper;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Cloner.classes.Cursor;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/VarDumper/Dumper.php

*/

public class Dumper extends CliDumper {

    public Object formatter = null;

    public Object forceArrayIndexes = null;

    public Dumper(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Dumper.class) {
            this.__construct(env, args);
        }
    }

    public Dumper(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "formatter",
        typeHint = "Symfony\\Component\\Console\\Formatter\\OutputFormatter"
    )
    @ConvertedParameter(
        index = 1,
        name = "forceArrayIndexes",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object formatter = assignParameter(args, 0, false);
        Object forceArrayIndexes = assignParameter(args, 1, true);
        if (null == forceArrayIndexes) {
            forceArrayIndexes = false;
        }
        this.formatter = formatter;
        this.forceArrayIndexes = forceArrayIndexes;
        super.__construct(env);
        env.callMethod(this, "setColors", Dumper.class, false);
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
        if (ZVal.toBool(ZVal.strictEqualityCheck(Cursor.CONST_HASH_INDEXED, "===", type))
                || ZVal.toBool(ZVal.strictEqualityCheck(Cursor.CONST_HASH_ASSOC, "===", type))) {
            _pClass = 0;
        }

        super.enterHash(env, cursor, type, _pClass, hasChild);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "cursor",
        typeHint = "Symfony\\Component\\VarDumper\\Cloner\\Cursor"
    )
    protected Object dumpKey(RuntimeEnv env, Object... args) {
        Object cursor = assignParameter(args, 0, false);
        if (ZVal.toBool(this.forceArrayIndexes)
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                Cursor.CONST_HASH_INDEXED,
                                "!==",
                                toObjectR(cursor)
                                        .accessProp(this, env)
                                        .name("hashType")
                                        .value()))) {
            super.dumpKey(env, cursor);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "style")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "attr", defaultValue = "", defaultValueType = "array")
    protected Object style(RuntimeEnv env, Object... args) {
        Object style = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object attr = assignParameter(args, 2, true);
        if (null == attr) {
            attr = ZVal.newArray();
        }
        Object cchr = null;
        Object chunks = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        ReferenceContainer chunk = new BasicReferenceContainer(null);
        Object styled = null;
        ReferenceContainer map = new BasicReferenceContainer(null);
        Object chars = null;
        if (ZVal.strictEqualityCheck("ref", "===", style)) {
            value = NamespaceGlobal.strtr.env(env).call(value, "@", "#").value();
        }

        styled = "";
        map.setObject(
                ZVal.assign(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Psy
                                                .namespaces
                                                .VarDumper
                                                .classes
                                                .Dumper
                                                .RequestStaticProperties
                                                .class)
                                .controlCharsMap));
        cchr = ZVal.assign(new ReferenceClassProperty(this, "styles", env).arrayGet(env, "cchr"));
        chunks =
                NamespaceGlobal.preg_split
                        .env(env)
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Psy
                                                        .namespaces
                                                        .VarDumper
                                                        .classes
                                                        .Dumper
                                                        .RequestStaticProperties
                                                        .class)
                                        .controlCharsRx,
                                value,
                                ZVal.getNull(),
                                ZVal.toLong(1) | ZVal.toLong(2))
                        .value();
        for (ZPair zpairResult1426 : ZVal.getIterable(chunks, env, true)) {
            chunk.setObject(ZVal.assign(zpairResult1426.getValue()));
            if (function_preg_match
                    .f
                    .env(env)
                    .call(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Psy
                                                    .namespaces
                                                    .VarDumper
                                                    .classes
                                                    .Dumper
                                                    .RequestStaticProperties
                                                    .class)
                                    .onlyControlCharsRx,
                            chunk.getObject())
                    .getBool()) {
                chars = "";
                i.setObject(0);
                do {
                    chars =
                            toStringR(chars, env)
                                    + toStringR(
                                            arrayActionR(
                                                            ArrayAction.ISSET,
                                                            map,
                                                            env,
                                                            chunk.arrayGet(env, i.getObject()))
                                                    ? map.arrayGet(
                                                            env, chunk.arrayGet(env, i.getObject()))
                                                    : function_sprintf
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    "\\x%02X",
                                                                    NamespaceGlobal.ord
                                                                            .env(env)
                                                                            .call(
                                                                                    chunk.arrayGet(
                                                                                            env,
                                                                                            i
                                                                                                    .getObject()))
                                                                            .value())
                                                            .value(),
                                            env);

                } while (arrayActionR(
                        ArrayAction.ISSET, chunk, env, i.setObject(ZVal.increment(i.getObject()))));

                chars = env.callMethod(this.formatter, "escape", Dumper.class, chars);
                styled =
                        toStringR(styled, env)
                                + toStringR(
                                        "<"
                                                + toStringR(cchr, env)
                                                + ">"
                                                + toStringR(chars, env)
                                                + "</"
                                                + toStringR(cchr, env)
                                                + ">",
                                        env);

            } else {
                styled =
                        toStringR(styled, env)
                                + toStringR(
                                        env.callMethod(
                                                this.formatter,
                                                "escape",
                                                Dumper.class,
                                                chunk.getObject()),
                                        env);
            }
        }

        style = ZVal.assign(new ReferenceClassProperty(this, "styles", env).arrayGet(env, style));
        return ZVal.assign(
                "<"
                        + toStringR(style, env)
                        + ">"
                        + toStringR(styled, env)
                        + "</"
                        + toStringR(style, env)
                        + ">");
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
        if (ZVal.toBool(endOfValue) && ZVal.toBool(ZVal.isLessThan(0, '<', depth))) {
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

        toObjectR(this)
                .accessProp(this, env)
                .name("line")
                .set(
                        env.callMethod(
                                this.formatter,
                                "format",
                                Dumper.class,
                                toObjectR(this).accessProp(this, env).name("line").value()));
        super.dumpLine(env, depth, endOfValue);
        return null;
    }

    public static final Object CONST_class = "Psy\\VarDumper\\Dumper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends CliDumper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object onlyControlCharsRx = "/^[\\x00-\\x1F\\x7F]+$/";

        public Object controlCharsRx = "/([\\x00-\\x1F\\x7F]+)/";

        public Object controlCharsMap =
                ZVal.newArray(
                        new ZPair("\u0000", "\\0"),
                        new ZPair("\t", "\\t"),
                        new ZPair("\n", "\\n"),
                        new ZPair("\u000B", "\\v"),
                        new ZPair("\f", "\\f"),
                        new ZPair("\r", "\\r"),
                        new ZPair("\u001B", "\\e"));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\VarDumper\\Dumper")
                    .setLookup(
                            Dumper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "charset",
                            "collapseNextHash",
                            "colors",
                            "decimalPoint",
                            "expandNextHash",
                            "flags",
                            "forceArrayIndexes",
                            "formatter",
                            "indentPad",
                            "line",
                            "lineDumper",
                            "maxStringWidth",
                            "outputStream",
                            "styles")
                    .setStaticPropertyNames(
                            "controlCharsMap", "controlCharsRx", "onlyControlCharsRx")
                    .setFilename("vendor/psy/psysh/src/VarDumper/Dumper.php")
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
